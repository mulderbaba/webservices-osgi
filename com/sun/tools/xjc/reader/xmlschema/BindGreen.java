/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2011 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.tools.xjc.reader.xmlschema;

import java.util.Iterator;

import com.sun.tools.xjc.reader.Ring;
import com.sun.tools.xjc.reader.xmlschema.ct.ComplexTypeFieldBuilder;
import com.sun.xml.xsom.XSAttContainer;
import com.sun.xml.xsom.XSAttGroupDecl;
import com.sun.xml.xsom.XSAttributeDecl;
import com.sun.xml.xsom.XSAttributeUse;
import com.sun.xml.xsom.XSComplexType;
import com.sun.xml.xsom.XSContentType;
import com.sun.xml.xsom.XSElementDecl;
import com.sun.xml.xsom.XSModelGroup;
import com.sun.xml.xsom.XSModelGroupDecl;
import com.sun.xml.xsom.XSParticle;
import com.sun.xml.xsom.XSSimpleType;
import com.sun.xml.xsom.XSWildcard;

/**
 * @author Kohsuke Kawaguchi
 */
public final class BindGreen extends ColorBinder {

    private final ComplexTypeFieldBuilder ctBuilder = Ring.get(ComplexTypeFieldBuilder.class);

    public void attGroupDecl(XSAttGroupDecl ag) {
        attContainer(ag);
    }

    public void attContainer(XSAttContainer cont) {
        // inline
        Iterator itr = cont.iterateDeclaredAttributeUses();
        while(itr.hasNext())
            builder.ying((XSAttributeUse)itr.next(),cont);
        itr = cont.iterateAttGroups();
        while(itr.hasNext())
            builder.ying((XSAttGroupDecl)itr.next(),cont);

        XSWildcard w = cont.getAttributeWildcard();
        if(w!=null)
            builder.ying(w,cont);
    }

    public void complexType(XSComplexType ct) {
        ctBuilder.build(ct);
    }








    public void attributeDecl(XSAttributeDecl xsAttributeDecl) {
        // TODO: implement this method later
        throw new UnsupportedOperationException();
    }

    public void wildcard(XSWildcard xsWildcard) {
        // TODO: implement this method later
        throw new UnsupportedOperationException();
    }

    public void modelGroupDecl(XSModelGroupDecl xsModelGroupDecl) {
        // TODO: implement this method later
        throw new UnsupportedOperationException();
    }

    public void modelGroup(XSModelGroup xsModelGroup) {
        // TODO: implement this method later
        throw new UnsupportedOperationException();
    }

    public void elementDecl(XSElementDecl xsElementDecl) {
        // TODO: implement this method later
        throw new UnsupportedOperationException();
    }

    public void particle(XSParticle xsParticle) {
        // TODO: implement this method later
        throw new UnsupportedOperationException();
    }

    public void empty(XSContentType xsContentType) {
        // TODO: implement this method later
        throw new UnsupportedOperationException();
    }


/*

    Components for which ying should yield to purple.

*/
    public void simpleType(XSSimpleType xsSimpleType) {
        // simple type always maps to a type, so this is never possible
        throw new IllegalStateException();
    }

    public void attributeUse(XSAttributeUse use) {
        // attribute use always maps to a property
        throw new IllegalStateException();
    }
}
