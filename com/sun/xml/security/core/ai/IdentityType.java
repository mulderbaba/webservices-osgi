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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.10 at 04:15:53 PM IST 
//


package com.sun.xml.security.core.ai;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.security.core.dsig.KeyInfoType;
import com.sun.xml.ws.security.secext10.BinarySecurityTokenType;
import com.sun.xml.ws.security.secext10.SecurityTokenReferenceType;


/**
 * <p>Java class for IdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://schemas.xmlsoap.org/ws/2006/02/addressingidentity}Dns" minOccurs="0"/>
 *           &lt;element ref="{http://schemas.xmlsoap.org/ws/2006/02/addressingidentity}Spn" minOccurs="0"/>
 *           &lt;element ref="{http://schemas.xmlsoap.org/ws/2006/02/addressingidentity}Upn" minOccurs="0"/>
 *           &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo" minOccurs="0"/>
 *           &lt;element ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}BinarySecurityToken" minOccurs="0"/>
 *           &lt;element ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}SecurityTokenReference" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityType", propOrder = {
    "dnsOrSpnOrUpn"
})
public class IdentityType {

    @XmlElementRefs({
        @XmlElementRef(name = "Spn", namespace = "http://schemas.xmlsoap.org/ws/2006/02/addressingidentity", type = JAXBElement.class),
        @XmlElementRef(name = "Dns", namespace = "http://schemas.xmlsoap.org/ws/2006/02/addressingidentity", type = JAXBElement.class),
        @XmlElementRef(name = "KeyInfo", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class),
        @XmlElementRef(name = "Upn", namespace = "http://schemas.xmlsoap.org/ws/2006/02/addressingidentity", type = JAXBElement.class),
        @XmlElementRef(name = "BinarySecurityToken", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "SecurityTokenReference", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> dnsOrSpnOrUpn;

    /**
     * Gets the value of the dnsOrSpnOrUpn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnsOrSpnOrUpn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDnsOrSpnOrUpn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BinarySecurityTokenType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityTokenReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDnsOrSpnOrUpn() {
        if (dnsOrSpnOrUpn == null) {
            dnsOrSpnOrUpn = new ArrayList<JAXBElement<?>>();
        }
        return this.dnsOrSpnOrUpn;
    }

}
