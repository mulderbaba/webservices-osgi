/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.enterprise.web.connector.grizzly;

import java.io.InputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class implement IO stream operations on top of a <code>ByteBuffer</code>.
 * Under the hood, this class use a temporary Selector pool to for reading
 * bytes when the client ask for more and the current Selector is not yet ready.
 *
 * @author Jeanfrancois Arcand
 */
public class ByteBufferInputStream extends InputStream {
    private static final Logger logger = Logger.getLogger(ByteBufferInputStream.class.getName());
    
    private static int defaultReadTimeout = 15000;
    
    /**
     * The wrapped <code>ByteBuffer</code<
     */
    protected ByteBuffer byteBuffer;
    
    
    /**
     * The <code>SelectionKey</code> used by this stream.
     */
    protected SelectionKey key = null;
    
    
    /**
     * The time to wait before timing out when reading bytes
     */
    protected int readTimeout = defaultReadTimeout;
    
    
    /**
     * Number of times to retry before return EOF
     */
    protected int readTry = 2;
    
    // ------------------------------------------------- Constructor -------//
    
    
    public ByteBufferInputStream() {
    }
    
    
    public ByteBufferInputStream(final ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }
    
    // ---------------------------------------------------------------------//
    
    
    /**
     * Set the wrapped <code>ByteBuffer</code>
     * @param byteBuffer The wrapped byteBuffer
     */
    public void setByteBuffer(final ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }
    
    
    /**
     * Get the wrapped <code>ByteBuffer</code>
     */
    public ByteBuffer getByteBuffer() {
        return  byteBuffer;
    }
    
    
    /**
     * Return the available bytes
     * @return the wrapped byteBuffer.remaining()
     */
    public int available() {
        return (byteBuffer.remaining());
    }
    
    
    /**
     * Close this stream.
     */
    public void close() {
    }
    
    
    /**
     * Return true if mark is supported.
     */
    public boolean markSupported() {
        return false;
    }
    
    
    /**
     * Read the first byte from the wrapped <code>ByteBuffer</code>.
     */
    public int read() throws IOException {
        if (!byteBuffer.hasRemaining()){
            int eof = 0;
            for (int i=0; i < readTry; i++) {
                eof = doRead();
                if ( eof != 0 ){
                    break;
                }
            }
        }
        return (byteBuffer.hasRemaining() ? (byteBuffer.get() & 0xff): -1);
    }
    
    
    /**
     * Read the bytes from the wrapped <code>ByteBuffer</code>.
     */
    public int read(byte[] b) throws IOException {
        return (read(b, 0, b.length));
    }
    
    
    /**
     * Read the first byte of the wrapped <code>ByteBuffer</code>.
     */
    public int read(byte[] b, int offset, int length) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            int eof = 0;
            for (int i=0; i < readTry; i++) {
                eof = doRead();
                
                if ( eof != 0 ){
                    break;
                }
            }
            
            if (eof <= 0){
                return -1;
            }
        }
        
        if (length > byteBuffer.remaining()) {
            length = byteBuffer.remaining();
        }
        byteBuffer.get(b, offset, length);
        
        return (length);
    }
    
    
    /**
     * Read the first byte of the wrapped <code>ByteBuffer</code>.
     */
    public int read(ByteBuffer bb) throws IOException {
        byteBuffer = bb;
        int eof = 0;
        for (int i=0; i < readTry; i++) {
            eof = doRead();

            if ( eof != 0 ){
                break;
            } 
        }

        if (eof <= 0){
            return -1;
        }
        return byteBuffer.limit();
    }
    
    
    /**
     * Recycle this object.
     */
    public void recycle(){
        byteBuffer = null;
        key = null;
        readTimeout = defaultReadTimeout;
    }
    
    
    /**
     * Set the <code>SelectionKey</code> used to reads bytes.
     */
    public void setSelectionKey(SelectionKey key){
        this.key = key;
    }

    
    /**
     * Read bytes using the read <code>ReadSelector</code>
     */
    protected int doRead() throws IOException{
        if ( key == null ) return -1;
        
        byteBuffer.clear();

        try {
            return readBlocking((SocketChannel) key.channel(), byteBuffer, readTimeout);
        } finally {
            byteBuffer.flip();
        }
    }
    
    
    /**
     * Return the timeout between two consecutives Selector.select() when a
     * temporary Selector is used.
     */
    public int getReadTimeout() {
        return readTimeout;
    }
    
    
    /**
     * Set the timeout between two consecutives Selector.select() when a
     * temporary Selector is used.
     */
    public void setReadTimeout(int rt) {
        readTimeout = rt;
    }
    
    public static int getDefaultReadTimeout() {
        return defaultReadTimeout;
    }
    
    public static void setDefaultReadTimeout(int aDefaultReadTimeout) {
        defaultReadTimeout = aDefaultReadTimeout;
    }

    public static int readBlocking(SocketChannel socketChannel,
            ByteBuffer byteBuffer, int readTimeout) throws IOException {
        int count = 1;
        int byteRead = 0;
        Selector readSelector = null;
        SelectionKey tmpKey = null;

        Exception exception = null;
        
        try{
            while (count > 0){
                count = socketChannel.read(byteBuffer);
                if (count > -1) {
                    byteRead += count;
                } else if (count == -1 && byteRead == 0) {
                    byteRead = -1;
                }
            }

            if ( byteRead == 0 ){
                readSelector = SelectorFactory.getSelector();

                if ( readSelector == null ){
                    return 0;
                }
                count = 1;
                tmpKey = socketChannel
                        .register(readSelector,SelectionKey.OP_READ);
                tmpKey.interestOps(tmpKey.interestOps() | SelectionKey.OP_READ);
                int code = readSelector.select(readTimeout);
                tmpKey.interestOps(
                        tmpKey.interestOps() & (~SelectionKey.OP_READ));

                if ( code == 0 ){
                    return 0; // Return on the main Selector and try again.
                }

                while (count > 0){
                    count = socketChannel.read(byteBuffer);
                    if (count > -1) {
                        byteRead += count;
                    } else if (count == -1 && byteRead == 0) {
                        byteRead = -1;
                    }
                }
            }
        } catch (Exception e) {
            exception = e;
            
            if (e instanceof IOException) {
                throw (IOException) e;
            } else {
                throw new IOException(e.getClass().getName() + ": " + e.getMessage());
            }
        } finally {
            if (tmpKey != null)
                tmpKey.cancel();

            if ( readSelector != null){
                // Bug 6403933
                SelectorFactory.selectNowAndReturnSelector(readSelector);
            }

            if (logger.isLoggable(Level.FINE)) {
                logger.log(Level.FINE, "InputStream.read [channel=" + socketChannel + ", bytesRead=" + byteRead + ", timeout=" + readTimeout + ", exception=" + exception + "]");

                if (byteRead > 0) {
                    if (logger.isLoggable(Level.FINEST)) {
                        logger.log(Level.FINEST, "InputStream.read-content [channel=" + socketChannel +
                                " content=" + new String(byteBuffer.array(), byteBuffer.arrayOffset() +
                                byteBuffer.position() - byteRead, byteRead) + "]");
                    }
                }
            }
        }
        return byteRead;
    }
}

