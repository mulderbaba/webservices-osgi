/*
* The contents of this file are subject to the terms 
* of the Common Development and Distribution License 
* (the License).  You may not use this file except in
* compliance with the License.
* 
* You can obtain a copy of the license at 
* https://glassfish.dev.java.net/public/CDDLv1.0.html or
* glassfish/bootstrap/legal/CDDLv1.0.txt.
* See the License for the specific language governing 
* permissions and limitations under the License.
* 
* When distributing Covered Code, include this CDDL 
* Header Notice in each file and include the License file 
* at glassfish/bootstrap/legal/CDDLv1.0.txt.  
* If applicable, add the following below the CDDL Header, 
* with the fields enclosed by brackets [] replaced by
* you own identifying information: 
* "Portions Copyrighted [year] [name of copyright owner]"
* 
* Copyright 2007 Sun Microsystems, Inc. All rights reserved.
*/ 


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-3010 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.11.29 at 04:18:06 PM IST 
//


package com.sun.xml.registry.uddi.bindings_v2_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.registry.uddi.bindings_v2_2.ErrInfo;
import com.sun.xml.registry.uddi.bindings_v2_2.KeyType;
import com.sun.xml.registry.uddi.bindings_v2_2.Result;


/**
 * <p>Java class for result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:uddi-org:api_v2}errInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="errno" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="keyType" type="{urn:uddi-org:api_v2}keyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "result", propOrder = {
    "errInfo"
})
public class Result {

    @XmlElement(namespace = "urn:uddi-org:api_v2")
    protected ErrInfo errInfo;
    @XmlAttribute(required = true)
    protected int errno;
    @XmlAttribute
    protected KeyType keyType;

    /**
     * Gets the value of the errInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ErrInfo }
     *     
     */
    public ErrInfo getErrInfo() {
        return errInfo;
    }

    /**
     * Sets the value of the errInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrInfo }
     *     
     */
    public void setErrInfo(ErrInfo value) {
        this.errInfo = value;
    }

    /**
     * Gets the value of the errno property.
     * 
     */
    public int getErrno() {
        return errno;
    }

    /**
     * Sets the value of the errno property.
     * 
     */
    public void setErrno(int value) {
        this.errno = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setKeyType(KeyType value) {
        this.keyType = value;
    }

}
