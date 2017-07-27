/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2010 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id: OnBehalfOfImpl.java,v 1.2 2010-10-21 15:36:54 snajper Exp $
 */

package com.sun.xml.ws.security.trust.impl.elements;

import javax.xml.ws.EndpointReference;
import com.sun.xml.ws.security.Token;
import com.sun.xml.ws.security.trust.elements.str.SecurityTokenReference;
import com.sun.xml.ws.security.secext10.SecurityTokenReferenceType;
import com.sun.xml.ws.security.trust.elements.OnBehalfOf;
import com.sun.xml.ws.security.trust.impl.bindings.OnBehalfOfType;
import javax.xml.bind.JAXBElement;

import org.w3c.dom.Element;

/**
 *
 * @author Manveen Kaur
 */
public class OnBehalfOfImpl extends OnBehalfOfType implements OnBehalfOf {
    
    private EndpointReference epr = null;
    private SecurityTokenReference str = null;
    
    public OnBehalfOfImpl(Token oboToken){
        oboToken.getTokenValue();
        setAny(oboToken.getTokenValue());
    }
    
    public OnBehalfOfImpl(OnBehalfOfType oboType){
        Object ob = oboType.getAny();
        if (ob != null){
            this.setAny(ob);
        }
    }
    public EndpointReference getEndpointReference() {
        return epr;
    }
    
    public void setEndpointReference(final EndpointReference endpointReference) {
        epr = endpointReference;
       /* if (endpointReference != null) {
            JAXBElement<EndpointReferenceImpl> eprElement=
                    (new com.sun.xml.ws.security.trust.impl.bindings.ObjectFactory()).
                    createEndpointReference((EndpointReferenceImpl)endpointReference);
            setAny(eprElement);
        }*/
        str = null;
    }
    
    public void setSecurityTokenReference(final SecurityTokenReference ref) {
        str = ref;
        if (ref != null) {
            final JAXBElement<SecurityTokenReferenceType> strElement=
                    (new com.sun.xml.ws.security.secext10.ObjectFactory()).createSecurityTokenReference((SecurityTokenReferenceType)ref);
            setAny(strElement);
        }
        epr = null;
    }
    
    public SecurityTokenReference getSecurityTokenReference() {
        return str;
    }
    
}
