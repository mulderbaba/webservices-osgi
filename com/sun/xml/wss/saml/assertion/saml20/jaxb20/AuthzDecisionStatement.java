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

package com.sun.xml.wss.saml.assertion.saml20.jaxb20;

import com.sun.xml.wss.saml.Action;
import com.sun.xml.wss.saml.SAMLException;
import com.sun.xml.wss.logging.LogDomainConstants;
import com.sun.xml.wss.saml.internal.saml20.jaxb20.ActionType;
import com.sun.xml.wss.saml.internal.saml20.jaxb20.AuthzDecisionStatementType;
import com.sun.xml.wss.saml.internal.saml20.jaxb20.DecisionType;
import com.sun.xml.wss.saml.util.SAML20JAXBUtil;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Element;

import java.util.List;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;

/**
 *The <code>AuthzDecisionStatement</code> element supplies a statement
 *by the issuer that the request for access by the specified subject to the
 *specified resource has resulted in the specified decision on the basis of
 * some optionally specified evidence.
 */
public class AuthzDecisionStatement extends AuthzDecisionStatementType
    implements com.sun.xml.wss.saml.AuthnDecisionStatement {
    
    protected static final Logger log = Logger.getLogger(
            LogDomainConstants.WSS_API_DOMAIN,
            LogDomainConstants.WSS_API_DOMAIN_BUNDLE);
    private List<Action> actionList = null;
    /**
     *Default constructor
     */
    protected AuthzDecisionStatement() {
        super();
    }

    /**
     * Constructs an <code>AuthorizationStatement</code> element from an
     * existing XML block.
     *
     * @param element representing a DOM tree element
     * @exception SAMLException if there is an error in the sender or in
     *            the element definition.
     */
    public static AuthzDecisionStatementType fromElement(Element element)
        throws SAMLException {
        try {
            JAXBContext jc = SAML20JAXBUtil.getJAXBContext();
                    
            javax.xml.bind.Unmarshaller u = jc.createUnmarshaller();
            return (AuthzDecisionStatementType)u.unmarshal(element);
        } catch ( Exception ex) {
            throw new SAMLException(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void setAction(List action) {
        this.action = action;
    }
    
    /**
     * Constructs an instance of <code>AuthzDecisionStatement</code>.
     *
     * @param subject (required) A Subject object
     * @param resource (required) A String identifying the resource to which
     *        access authorization is sought.
     * @param decision (required) The decision rendered by the issuer with
     *        respect to the specified resource. The value is of the
     *        <code>DecisionType</code> simple type.
     * @param action (required) A List of Action objects specifying the set of
     *        actions authorized to be performed on the specified resource.
     * @param evidence (optional) An Evidence object representing a set of
     *        assertions that the issuer replied on in making decisions.
     * @exception SAMLException if there is an error in the sender.
     */
    public AuthzDecisionStatement(
        String resource, String decision, List action,
        Evidence evidence) {
                
        setResource(resource);
        setDecision(DecisionType.fromValue(decision));
        setAction(action);
        setEvidence(evidence);
    }
    
    public AuthzDecisionStatement(AuthzDecisionStatementType authDesStmt) {       
        setResource(authDesStmt.getResource());
        setDecision(authDesStmt.getDecision());
        setAction(authDesStmt.getAction());
        setEvidence(authDesStmt.getEvidence());
    }

    public List<Action> getActionList() {
        if(actionList == null){
            actionList = new ArrayList<Action>();
         }else{
             return actionList;
         }
         Iterator it = super.getAction().iterator();
         while(it.hasNext()){
             com.sun.xml.wss.saml.assertion.saml20.jaxb20.Action obj = 
                     new com.sun.xml.wss.saml.assertion.saml20.jaxb20.Action((ActionType)it.next());
             actionList.add(obj);
         }
         return actionList;
    }

    @Override
    public Evidence getEvidence(){
        Evidence eve = new Evidence(super.getEvidence());
        return eve;
    }

    public String getDecisionValue() {
        return super.getDecision().value();
    }
    
    @Override
    public String getResource(){
        return super.getResource();
    }
}
