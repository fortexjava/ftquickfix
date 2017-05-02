/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.mina;

import java.util.concurrent.Executors;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.WaitStrategy;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SystemTime;

/**
 * Processes messages for all sessions in a single thread.
 */
public class RingBufferStrategy implements EventHandlingStrategy {
	public static final String MESSAGE_PROCESSOR_THREAD_NAME = "RBF Message Processor";
	private Disruptor<SessionMessageEvent> disruptor;
	private EventHandler<SessionMessageEvent>[] handlers;
	private final SessionConnector sessionConnector;
	private volatile Thread messageProcessingThread;
	private long stopTime = 0L;
    private volatile boolean isStopped;

	
	
	public RingBufferStrategy(SessionConnector sessionConnector, EventHandler<SessionMessageEvent>[] handlers, int bufferSize) {
		this.sessionConnector = sessionConnector;
		this.handlers = handlers;
		disruptor = new Disruptor<SessionMessageEvent>(new SessionMessageEventFactory(), bufferSize,
				Executors.defaultThreadFactory(), ProducerType.SINGLE, new YieldingWaitStrategy());
	}
	
	public RingBufferStrategy(SessionConnector sessionConnector, EventHandler<SessionMessageEvent>[] handlers, int bufferSize, WaitStrategy strategy) {
		this.sessionConnector = sessionConnector;
		this.handlers = handlers;
		disruptor = new Disruptor<SessionMessageEvent>(new SessionMessageEventFactory(), bufferSize,
				Executors.defaultThreadFactory(), ProducerType.SINGLE, strategy);
	}

	@Override
	public void onMessage(Session quickfixSession, Message message) {
		if (message == END_OF_STREAM && isStopped) {
            return;
        }		
		try{
			RingBuffer<SessionMessageEvent> ringBuffer = disruptor.getRingBuffer();
			long sequence = ringBuffer.next();
			SessionMessageEvent event = ringBuffer.get(sequence);
			event.setMessage(message);
			event.setQuickfixSession(quickfixSession);
			ringBuffer.publish(sequence);
        }
		catch(Exception e){
			isStopped = true;
			 throw new RuntimeException(e);
		}
	}

	@Override
	public SessionConnector getSessionConnector() {
		return sessionConnector;
	}

	public void block() {
		startHandlingMessages();
	}

	/**
	 * Start handling of messages by message processor thread. If thread is
	 * still alive, an attempt is made to stop it. An IllegalStateException is
	 * thrown if stopping the old thread was not successful.
	 * 
	 * This method must not be called by several threads concurrently.
	 */
	public void blockInThread() {
		if (messageProcessingThread != null && messageProcessingThread.isAlive()) {
			sessionConnector.log.warn("Trying to stop still running " + MESSAGE_PROCESSOR_THREAD_NAME);
			stopHandlingMessages(true);
			if (messageProcessingThread.isAlive()) {
				throw new IllegalStateException(
						"Still running " + MESSAGE_PROCESSOR_THREAD_NAME + " could not be stopped!");
			}
		}

		messageProcessingThread = new Thread(new Runnable() {
			@Override
			public void run() {
				sessionConnector.log.info("Started " + MESSAGE_PROCESSOR_THREAD_NAME);
				block();
			}
		}, MESSAGE_PROCESSOR_THREAD_NAME);
		messageProcessingThread.setDaemon(true);
		messageProcessingThread.start();
	}

	public static class SessionMessageEvent {
		private Session quickfixSession;
		private Message message;

		public Session getQuickfixSession() {
			return quickfixSession;
		}

		public void setQuickfixSession(Session quickfixSession) {
			this.quickfixSession = quickfixSession;
		}

		public Message getMessage() {
			return message;
		}

		public void setMessage(Message message) {
			this.message = message;
		}
	}

	private synchronized void startHandlingMessages() {
		disruptor.handleEventsWith(handlers);
		disruptor.start();
		isStopped = false;
	}

	public synchronized void stopHandlingMessages() {
		
		for (Session session : sessionConnector.getSessionMap().values()) {
			onMessage(session, END_OF_STREAM);
		}
		isStopped = true;
		disruptor.shutdown();
		
		if (stopTime == 0) {
			stopTime = SystemTime.currentTimeMillis();
		}
		if (!sessionConnector.isLoggedOn() || SystemTime.currentTimeMillis() - stopTime > 5000L) {
			sessionConnector.stopSessionTimer();
			// reset the stoptime
			stopTime = 0;
			return;
		}
		
	}

	public void stopHandlingMessages(boolean join) {
		stopHandlingMessages();
		if (join) {
			try {
				messageProcessingThread.join();
			} catch (InterruptedException e) {
				sessionConnector.log.error(MESSAGE_PROCESSOR_THREAD_NAME + " interrupted.");
			}
		}
	}

	private static class SessionMessageEventFactory implements EventFactory<SessionMessageEvent> {
		@Override
		public SessionMessageEvent newInstance() {
			return new SessionMessageEvent();
		}
	}


	@Override
	public int getQueueSize() {
		return 0;
	}

	@Override
	public int getQueueSize(SessionID sessionID) {
		// we only have one queue for all sessions
		return getQueueSize();
	}

}
