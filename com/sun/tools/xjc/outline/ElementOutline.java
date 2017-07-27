/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2015 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.tools.xjc.outline;

import com.sun.codemodel.JDefinedClass;
import com.sun.tools.xjc.model.CCustomizable;
import com.sun.tools.xjc.model.CElementInfo;

/**
 * Outline object that provides per-{@link CElementInfo} information
 * for filling in methods/fields for a bean.
 *
 * This interface is accessible from {@link Outline}. This object is
 * not created for all {@link CElementInfo}s.
 * It is only for those {@link CElementInfo} that has a class.
 * (IOW, {@link CElementInfo#hasClass()}
 * 
 * @author Kohsuke Kawaguchi
 */
public abstract class ElementOutline implements CustomizableOutline {

    /**
     * A {@link Outline} that encloses all the class outlines.
     */
    public abstract Outline parent();

    /**
     * {@link PackageOutline} that contains this class.
     */
    public PackageOutline _package() {
        return parent().getPackageContext(implClass._package());
    }

    /**
     * This {@link ElementOutline} holds information about this {@link CElementInfo}.
     */
    public final CElementInfo target;

    /**
     * The implementation aspect of a bean.
     * The actual place where fields/methods should be generated into.
     */
    public final JDefinedClass implClass;


    protected ElementOutline(CElementInfo target, JDefinedClass implClass) {
        this.target = target;
        this.implClass = implClass;
    }

    @Override
    public CCustomizable getTarget() {
        return target;
    }

    @Override
    public JDefinedClass getImplClass() {
        return implClass;
    }
}
