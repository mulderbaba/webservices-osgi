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

package com.sun.xml.wss.provider.wsit;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;

import java.security.PrivilegedExceptionAction;
import java.security.PrivilegedActionException;
import javax.security.auth.Subject;
import javax.security.auth.message.config.*;
import javax.security.auth.message.AuthException;
import javax.security.auth.message.AuthStatus;

import javax.xml.ws.WebServiceException;


import com.sun.xml.ws.api.pipe.Pipe;
import com.sun.xml.ws.api.pipe.PipeCloner;
import com.sun.xml.ws.api.pipe.helper.AbstractFilterPipeImpl;
import com.sun.xml.ws.api.message.Packet;
import com.sun.xml.wss.provider.wsit.logging.LogDomainConstants;
import com.sun.xml.wss.provider.wsit.logging.LogStringsMessages;

/**
 * This pipe is used to do 196 security
 */
public class ServerSecurityPipe extends AbstractFilterPipeImpl {

  protected static final Logger logger =
            Logger.getLogger(
            LogDomainConstants.WSIT_PVD_DOMAIN,
            LogDomainConstants.WSIT_PVD_DOMAIN_BUNDLE);

    private final boolean isHttpBinding;

    private PipeHelper helper;

    public ServerSecurityPipe(Map<Object, Object> props, final Pipe next, 
			     boolean isHttpBinding) {
        super(next);

	props.put(PipeConstants.SECURITY_PIPE,this);
	this.helper = new PipeHelper(PipeConstants.SOAP_LAYER,props,null);
        this.isHttpBinding = isHttpBinding;
    }    
    
    protected ServerSecurityPipe(ServerSecurityPipe that,
            PipeCloner cloner) {

        super(that, cloner);
        // we can share the helper for all pipes so that the remove 
        // registration (in server side) can be done properly
        this.helper = that.helper;

        this.isHttpBinding = that.isHttpBinding;

    }

    /**
     * This method is called once in server side and at most one in client side.
     */
    public void preDestroy() {
	helper.disable();
        /**
         Fix for bug 3932/4052
         */
        next.preDestroy(); 
    }    
    
    /**
     * This is used in creating subsequent pipes.
     */
    public Pipe copy(PipeCloner cloner) {
        return new ServerSecurityPipe(this, cloner);
    }
    
    public Packet process(Packet request) {

        if (isHttpBinding) {
            return next.process(request);
        }
        
        Packet response = null;

        try {

            response = processRequest(request);

        } catch(Exception e) {
            if (logger.isLoggable(Level.FINE)) {
                logger.log(Level.FINE, "Failure in security pipe process", e);
            }
            response = helper.makeFaultResponse(response,e);
        }

        return response;
    }    
    @SuppressWarnings("unchecked")
    private Packet processRequest(Packet request) throws Exception {

        AuthStatus status = AuthStatus.SUCCESS;
	
	PacketMessageInfo info= new PacketMapMessageInfo(request,new Packet());

	// XXX at this time, we expect the server subject to be null

	Subject serverSubject = (Subject) 
	    request.invocationProperties.get(PipeConstants.SERVER_SUBJECT);

	//could change the request packet
        ServerAuthContext sAC = 
	    helper.getServerAuthContext(info,serverSubject);

	Subject clientSubject = getClientSubject(request);

	final Packet validatedRequest;
	
	try {

	    if (sAC != null) {
		
		// client subject must not be null
		// and when return status is SUCCESS, module
		// must have called handler.handle(CallerPrincipalCallback)

		status = sAC.validateRequest(info,clientSubject,serverSubject);

	    }
	} catch(Exception e) {

	    logger.log(Level.SEVERE,LogStringsMessages.WSITPVD_0053_ERROR_VALIDATE_REQUEST(), e);

	    WebServiceException wse = new WebServiceException
		("Cannot validate request for", e);

	    //set status for audit
	    status = AuthStatus.SEND_FAILURE;

	    // if unable to determine if two-way will return empty response
	    return helper.getFaultResponse
		(info.getRequestPacket(),info.getResponsePacket(),wse);

	} finally {
	    validatedRequest = info.getRequestPacket();
	}

	Packet response = null;

	if (status == AuthStatus.SUCCESS) {

	    boolean authorized = true;
            helper.authorize(validatedRequest);
	    if (authorized) {

		// only do doAdPriv if SecurityManager is in effect
		if (System.getSecurityManager() == null) {
		    try {
			// proceed to invoke the endpoint
			response = next.process(validatedRequest);
		    } catch (Exception e) {			
			logger.log(Level.SEVERE,LogStringsMessages.WSITPVD_0055_WS_ERROR_NEXT_PIPE(), e);			
			response = helper.getFaultResponse
			    (validatedRequest,info.getResponsePacket(),e);
		    }
		} else {
		    try {
			response = (Packet)Subject.doAsPrivileged
			    (clientSubject,new PrivilegedExceptionAction() {
				public Object run() throws Exception {
				    // proceed to invoke the endpoint
				    return next.process(validatedRequest);
				}
			    }, null);
		    } catch (PrivilegedActionException pae) {
		        Throwable cause = pae.getCause();
			if (cause instanceof AuthException){
			    logger.log(Level.SEVERE,LogStringsMessages.WSITPVD_0055_WS_ERROR_NEXT_PIPE(), cause);
			}
			response = helper.getFaultResponse
			    (validatedRequest,info.getResponsePacket(),cause);
		    }
		}
	    }
	    
	    //pipes are not supposed to return a null response packet
	    if (response == null) {

		WebServiceException wse = new WebServiceException
		    ("Invocation of Service {0} returned null response packet");
                
		response = helper.getFaultResponse
		    (validatedRequest,info.getResponsePacket(),wse);

		logger.log(Level.SEVERE,LogStringsMessages.WSITPVD_0056_NULL_RESPONSE(),wse);

	    }

	    // secure response, including if it is a fault
	    if (sAC != null && response.getMessage() != null) {
		info.setResponsePacket(response);
		response = processResponse(info, sAC, serverSubject);
	    }

	} else {
	    // validateRequest did not return success
	    if (logger.isLoggable(Level.FINE)) {
		logger.log(Level.FINE,"ws.status_validate_request", status);
	    }
	    // even for one-way mep, may return response with non-empty message
	    response = info.getResponsePacket();
	}

        return response;
    }

    // called when secureResponse is to be called 
    private Packet processResponse(PacketMessageInfo info,
				   ServerAuthContext sAC,
				   Subject serverSubject) throws Exception {
        
        AuthStatus status;

	try {

	    status = sAC.secureResponse(info, serverSubject);

	} catch (Exception e) {
	    if (e instanceof AuthException) {
		if (logger.isLoggable(Level.INFO)) {
		    logger.log(Level.INFO, "ws.error_secure_response", e);
		}
	    } else {
		    logger.log(Level.SEVERE, LogStringsMessages.WSITPVD_0054_ERROR_SECURE_RESPONSE(), e);
	    }
    
	    return helper.makeFaultResponse(info.getResponsePacket(),e);
	}

	if (logger.isLoggable(Level.FINE)) {
	    logger.log(Level.FINE,"ws.status_secure_response", status);
	}

	return info.getResponsePacket();

    }

    private  Subject getClientSubject(Packet p) {
	Subject s = null;
	if (p != null) {
	    s =(Subject) 
		p.invocationProperties.get(PipeConstants.CLIENT_SUBJECT);
	}
	if (s == null) {
	    s = helper.getClientSubject();
	    if (p != null) {
		p.invocationProperties.put(PipeConstants.CLIENT_SUBJECT,s);
	    }
	}
	return s;
    }

}







