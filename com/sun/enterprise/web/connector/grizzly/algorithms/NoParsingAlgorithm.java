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

package com.sun.enterprise.web.connector.grizzly.algorithms;

import java.nio.ByteBuffer;

import com.sun.enterprise.web.connector.grizzly.Handler;


/**
 * This algorithm doesn't parse the bytes, delegating the work to the 
 * InternalInputBuffer.
 *
 * @author Jeanfrancois Arcand
 */
public class NoParsingAlgorithm extends StreamAlgorithmBase {
    public static final String GF_NO_PARSING_HANDLER
        = "com.sun.enterprise.web.connector.grizzly.handlers.GlassFishNoParsingHandler";

    public NoParsingAlgorithm() {
        if (embeddedInGlassFish){
            try {
                handler = (Handler) Thread.currentThread().getContextClassLoader().loadClass(NoParsingAlgorithm.GF_NO_PARSING_HANDLER).newInstance();
            } catch (Exception e) {
                handler = new DummyHandler();
            }
        } else {
            handler = new DummyHandler();
        }            
    }
    
    /**
     * Do nothing, as the ByteBufferInputStream will take care of reading the 
     * missing bytes.
     */
    @Override
    public ByteBuffer preParse(ByteBuffer byteBuffer){ 
        return byteBuffer;
    }
    
    
    /**
     * Do not parse the bytes and automatically flip the <code>ByteBuffer</code>
     */
    public boolean parse(ByteBuffer byteBuffer){
        byteBuffer.flip();
        return true;
    }
    
    
    /**
     * Return the <code>Handler</code> used by this algorithm.
     */
    public Handler getHandler(){
        return handler;
    }
    
    
    /***
     * Recycle this object.
     */
    @Override
    public void recycle(){
        socketChannel = null;
        if ( handler != null){
            handler.attachChannel(null);
        }
    }    
}
