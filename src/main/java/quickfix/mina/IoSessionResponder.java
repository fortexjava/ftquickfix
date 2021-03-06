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

import java.net.SocketAddress;

import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.Responder;

/**
 * The class that partially integrates the QuickFIX/J Session to
 * the MINA networking code.
 */
public class IoSessionResponder implements Responder {
    //private final Logger log = LoggerFactory.getLogger(getClass());
	//Patrick Update log
	private final Logger log = LoggerFactory.getLogger("Event");
	
    private final IoSession ioSession;
    private final boolean synchronousWrites;
    private final long synchronousWriteTimeout;

    public IoSessionResponder(IoSession session, boolean synchronousWrites, long synchronousWriteTimeout) {
        ioSession = session;
        this.synchronousWrites = synchronousWrites;
        this.synchronousWriteTimeout = synchronousWriteTimeout;
    }

    @Override
    public boolean send(String data) {
        // The data is written asynchronously in a MINA thread
        WriteFuture future = ioSession.write(data);
        //AbstractIoSession aioSession = (AbstractIoSession) ioSession;
        //aioSession.getProcessor().flush(ioSession);		Flush By Ivan
        if (synchronousWrites) {
            try {
                if (!future.awaitUninterruptibly(synchronousWriteTimeout)) {
                    log.error("Synchronous write timed out after " + synchronousWriteTimeout + "ms");
                    return false;
                }
            } catch (RuntimeException e) {
                log.error("Synchronous write failed: " + e.getMessage());
                return false;
            }
        }
        return true;
    }

    @Override
    public void disconnect() {
        waitForScheduleMessagesToBeWritten();
        // We cannot call join() on the CloseFuture returned
        // by the following call. We are using a minimal
        // threading model and calling join will prevent the
        // close event from being processed by this thread (if
        // this thread is the MINA IO processor thread.
        ioSession.close(true);
    }

    private void waitForScheduleMessagesToBeWritten() {
        // This is primarily to allow logout messages to be sent before
        // closing the socket. Future versions of MINA may have support
        // in close() to force all pending messages to be written before
        // the socket close is performed.
        //
        // Only wait for a limited time since MINA may deadlock
        // in some rare cases where a socket dies in a strange way.
        for (int i = 0; i < 5 && ioSession.getScheduledWriteMessages() > 0; i++) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public String getRemoteAddress() {
        final SocketAddress remoteAddress = ioSession.getRemoteAddress();
        if (remoteAddress != null) {
            return remoteAddress.toString();
        }
        return null;
    }

	@Override
	public boolean send(String data, IoFutureListener<WriteFuture> listener) {
        // The data is written asynchronously in a MINA thread
        WriteFuture future = ioSession.write(data);
        future.addListener(listener);
        if (synchronousWrites) {
            try {
                if (!future.awaitUninterruptibly(synchronousWriteTimeout)) {
                    log.error("Synchronous write timed out after " + synchronousWriteTimeout + "ms");
                    return false;
                }
            } catch (RuntimeException e) {
                log.error("Synchronous write failed: " + e.getMessage());
                return false;
            }
        }
        return true;
    }

}
