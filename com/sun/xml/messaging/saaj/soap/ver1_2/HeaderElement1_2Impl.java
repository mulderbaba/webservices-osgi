/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
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

/**
*
* @author SAAJ RI Development Team
*/
package com.sun.xml.messaging.saaj.soap.ver1_2;

import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import com.sun.xml.messaging.saaj.soap.SOAPDocumentImpl;
import com.sun.xml.messaging.saaj.soap.impl.HeaderElementImpl;
import com.sun.xml.messaging.saaj.soap.name.NameImpl;

public class HeaderElement1_2Impl extends HeaderElementImpl {

    private static final Logger log =
        Logger.getLogger(HeaderElement1_2Impl.class.getName(),
                         "com.sun.xml.messaging.saaj.soap.ver1_2.LocalStrings");
       
    public HeaderElement1_2Impl(SOAPDocumentImpl ownerDoc, Name qname) {
        super(ownerDoc, qname);
    }
    public HeaderElement1_2Impl(SOAPDocumentImpl ownerDoc, QName qname) {
        super(ownerDoc, qname);
    }

    public SOAPElement setElementQName(QName newName) throws SOAPException {
        HeaderElementImpl copy =
            new HeaderElement1_2Impl((SOAPDocumentImpl)getOwnerDocument(), newName);
        return replaceElementWithSOAPElement(this,copy);
    }

    protected NameImpl getRoleAttributeName() {
        return NameImpl.create("role", null, NameImpl.SOAP12_NAMESPACE);
    }

    // Actor equivalent to Role in SOAP 1.2
    protected NameImpl getActorAttributeName() {              
        return getRoleAttributeName();
    }

    protected NameImpl getMustunderstandAttributeName() {
        return NameImpl.create("mustUnderstand", null, NameImpl.SOAP12_NAMESPACE);
    }

    // mustUnderstand attribute has literal value "true" or "false" 
    protected String getMustunderstandLiteralValue(boolean mustUnderstand) {
        return (mustUnderstand == true ? "true" : "false");
    }

    protected boolean getMustunderstandAttributeValue(String mu) {
        if (mu.equals("true") || mu.equals("1"))
            return true;
        return false;
    }

   protected NameImpl getRelayAttributeName() {
        return NameImpl.create("relay", null, NameImpl.SOAP12_NAMESPACE);
    }

    //relay attribute has literal value "true" or "false"
    protected String getRelayLiteralValue(boolean relay) {
        return (relay == true ? "true" : "false");
    }

    protected boolean getRelayAttributeValue(String relay) {
        if (relay.equals("true") || relay.equals("1"))
            return true;
        return false;
    }

    protected String getActorOrRole() {
        return getRole();
    }
}
