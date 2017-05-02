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

package quickfix;

import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WaitStrategy;

import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.RingBufferStrategy;
import quickfix.mina.RingBufferStrategy.SessionMessageEvent;
import quickfix.mina.initiator.AbstractSocketInitiator;

/**
 * Initiates connections and uses a single thread to process messages for all
 * sessions.
 */
public class RingBufferSocketInitiator extends AbstractSocketInitiator {
    private Boolean isStarted = Boolean.FALSE;
    private final Object lock = new Object();
    private final RingBufferStrategy eventHandlingStrategy;

    public RingBufferSocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory, EventHandler<SessionMessageEvent>[] handlers,int bufferSize) throws ConfigError {
        super(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new RingBufferStrategy(this, handlers,bufferSize);
    }

    public RingBufferSocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, MessageFactory messageFactory,EventHandler<SessionMessageEvent>[] handlers) throws ConfigError {
        super(application, messageStoreFactory, settings, new ScreenLogFactory(settings),
                messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new RingBufferStrategy(this, handlers,DEFAULT_QUEUE_CAPACITY);
    }

    public RingBufferSocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory,EventHandler<SessionMessageEvent>[] handlers)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new RingBufferStrategy(this, handlers,DEFAULT_QUEUE_CAPACITY);
    }

    public RingBufferSocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory,EventHandler<SessionMessageEvent>[] handlers,
            int bufferSize)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new RingBufferStrategy(this, handlers,bufferSize);
    }
    
    
    public RingBufferSocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory,EventHandler<SessionMessageEvent>[] handlers,
            int bufferSize, WaitStrategy strategy, String ip, String userName, String key, String fileName)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory, ip, userName, key, fileName);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new RingBufferStrategy(this, handlers,bufferSize,strategy);
    }
    
    public RingBufferSocketInitiator(Application application, MessageStoreFactory messageStoreFactory,
            SessionSettings settings, LogFactory logFactory, MessageFactory messageFactory,EventHandler<SessionMessageEvent>[] handlers,
            int bufferSize, WaitStrategy strategy)
            throws ConfigError {
        super(application, messageStoreFactory, settings, logFactory, messageFactory);
        if (settings == null) {
            throw new ConfigError("no settings");
        }
        eventHandlingStrategy = new RingBufferStrategy(this, handlers,bufferSize,strategy);
    }
    

    public RingBufferSocketInitiator(SessionFactory sessionFactory, SessionSettings settings,EventHandler<SessionMessageEvent>[] handlers,
           int bufferSize) throws ConfigError {
        super(settings, sessionFactory);
        eventHandlingStrategy = new RingBufferStrategy(this, handlers,bufferSize);
    }

    @Override
    public void block() throws ConfigError, RuntimeError {
        initialize(false);
    }

    @Override
    public void start() throws ConfigError, RuntimeError {
        initialize(false);
    }

    @Override
    public void stop() {
        stop(false);
    }

    @Override
    public void stop(boolean forceDisconnect) {
        eventHandlingStrategy.stopHandlingMessages();
        synchronized (lock) {
            try {
                logoutAllSessions(forceDisconnect);
                stopInitiators();
            } finally {
                Session.unregisterSessions(getSessions());
                isStarted = Boolean.FALSE;
            }
        }
    }

    private void initialize(boolean blockInThread) throws ConfigError {
        synchronized (lock) {
            if (isStarted.equals(Boolean.FALSE)) {
                createSessionInitiators();
                for (Session session : getSessionMap().values()) {
                    Session.registerSession(session);
                }
                startInitiators();
                if (blockInThread) {
                    eventHandlingStrategy.blockInThread();
                    isStarted = Boolean.TRUE;
                } else {
                    isStarted = Boolean.TRUE;
                    eventHandlingStrategy.block();
                }
            } else {
                log.warn("Ignored attempt to start already running SocketInitiator.");
            }
        }
    }

    @Override
    protected EventHandlingStrategy getEventHandlingStrategy() {
        return eventHandlingStrategy;
    }

}

