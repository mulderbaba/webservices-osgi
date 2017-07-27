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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-28 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.18 at 11:59:48 AM EEST 
//


package com.sun.xml.ws.config.metro.parser.jsr109;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.xml.sax.Locator;


/**
 * 
 * 
 *         This specifies the WS-Addressing requirements for a JAX-WS web service.
 *         It corresponds to javax.xml.ws.soap.Addressing annotation or its
 *         feature javax.xml.ws.soap.AddressingFeature.
 *         
 *         If the "enabled" element is "true", WS-Addressing is enabled.
 *         It means that the endpoint supports WS-Addressing but does not require
 *         its use. The default value for "enabled" is "true".
 *         
 *         If the WS-Addressing is enabled and the "required" element is "true",
 *         it means that the endpoint requires WS-Addressing. The default value
 *         for "required" is "false".
 *         
 *         If WS-Addressing is enabled, the "responses" element determines
 *         if an endpoint requires the use of only anonymous responses,
 *         or only non-anonymous responses, or all. The value of the "responses"
 *         element must be one of the following:
 *         
 *         ANONYMOUS
 *         NON_ANONYMOUS
 *         ALL
 *         
 *         The default value for the "responses" is ALL.
 *         
 *       
 * 
 * <p>Java class for addressingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enabled" type="{http://java.sun.com/xml/ns/javaee}true-falseType" minOccurs="0"/>
 *         &lt;element name="required" type="{http://java.sun.com/xml/ns/javaee}true-falseType" minOccurs="0"/>
 *         &lt;element name="responses" type="{http://java.sun.com/xml/ns/javaee}addressing-responsesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressingType", propOrder = {
    "enabled",
    "required",
    "responses"
})
public class AddressingType
    implements Locatable
{

    protected TrueFalseType enabled;
    protected TrueFalseType required;
    protected AddressingResponsesType responses;
    @XmlLocation
    @XmlTransient
    protected Locator locator;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setEnabled(TrueFalseType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setRequired(TrueFalseType value) {
        this.required = value;
    }

    /**
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link AddressingResponsesType }
     *     
     */
    public AddressingResponsesType getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressingResponsesType }
     *     
     */
    public void setResponses(AddressingResponsesType value) {
        this.responses = value;
    }

    public Locator sourceLocation() {
        return locator;
    }

    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
