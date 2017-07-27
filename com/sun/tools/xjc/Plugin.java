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

package com.sun.tools.xjc;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.sun.tools.xjc.generator.bean.field.FieldRendererFactory;
import com.sun.tools.xjc.model.CPluginCustomization;
import com.sun.tools.xjc.model.Model;
import com.sun.tools.xjc.outline.Outline;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

/**
 * Add-on that works on the generated source code.
 * 
 * <p>
 * This add-on will be called after the default bean generation
 * has finished.
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 *
 * @since
 *      JAXB RI 2.0 EA
 */
public abstract class Plugin {

    /**
     * Gets the option name to turn on this add-on.
     *
     * <p>
     * For example, if "abc" is returned, "-abc" will
     * turn on this plugin. A plugin needs to be turned
     * on explicitly, or else no other methods of {@link Plugin}
     * will be invoked.
     *
     * <p>
     * Starting 2.1, when an option matches the name returned
     * from this method, XJC will then invoke {@link #parseArgument(Options, String[], int)},
     * allowing plugins to handle arguments to this option.
     */
    public abstract String getOptionName();

    /**
     * Gets the description of this add-on. Used to generate
     * a usage screen.
     *
     * @return
     *      localized description message. should be terminated by \n.
     */
    public abstract String getUsage();

    /**
     * Parses an option <code>args[i]</code> and augment
     * the <code>opt</code> object appropriately, then return
     * the number of tokens consumed.
     *
     * <p>
     * The callee doesn't need to recognize the option that the
     * getOptionName method returns.
     *
     * <p>
     * Once a plugin is activated, this method is called
     * for options that XJC didn't recognize. This allows
     * a plugin to define additional options to customize
     * its behavior.
     *
     * <p>
     * Since options can appear in no particular order,
     * XJC allows sub-options of a plugin to show up before
     * the option that activates a plugin (one that's returned
     * by {@link #getOptionName().)
     *
     * But nevertheless a {@link Plugin} needs to be activated
     * to participate in further processing.
     *
     * @return
     *      0 if the argument is not understood.
     *      Otherwise return the number of tokens that are
     *      consumed, including the option itself.
     *      (so if you have an option like "-foo 3", return 2.)
     * @exception BadCommandLineException
     *      If the option was recognized but there's an error.
     *      This halts the argument parsing process and causes
     *      XJC to abort, reporting an error.
     */
    public int parseArgument( Options opt, String[] args, int i ) throws BadCommandLineException, IOException {
        return 0;
    }

    /**
     * Returns the list of namespace URIs that are supported by this plug-in
     * as schema annotations.
     *
     * <p>
     * If a plug-in returns a non-empty list, the JAXB RI will recognize
     * these namespace URIs as vendor extensions
     * (much like "http://java.sun.com/xml/ns/jaxb/xjc"). This allows users
     * to write those annotations inside a schema, or in external binding files,
     * and later plug-ins can access those annotations as DOM nodes.
     *
     * <p>
     * See <a href="http://java.sun.com/webservices/docs/1.5/jaxb/vendorCustomizations.html">
     * http://java.sun.com/webservices/docs/1.5/jaxb/vendorCustomizations.html</a>
     * for the syntax that users need to use to enable extension URIs.
     *
     * @return
     *      can be empty, be never be null.
     */
    public List<String> getCustomizationURIs() {
        return Collections.emptyList();
    }

    /**
     * Checks if the given tag name is a valid tag name for the customization element in this plug-in.
     *
     * <p>
     * This method is invoked by XJC to determine if the user-specified customization element
     * is really a customization or not. This information is used to pick the proper error message.
     *
     * <p>
     * A plug-in is still encouraged to do the validation of the customization element in the
     * {@link #run} method before using any {@link CPluginCustomization}, to make sure that it
     * has proper child elements and attributes.
     *
     * @param nsUri
     *      the namespace URI of the element. Never null.
     * @param localName
     *      the local name of the element. Never null.
     */
    public boolean isCustomizationTagName(String nsUri,String localName) {
        return false;
    }

    /**
     * Notifies a plugin that it's activated.
     *
     * <p>
     * This method is called when a plugin is activated
     * through the command line option (as specified by {@link #getOptionName()}.
     *
     * <p>
     * This is a good opportunity to use
     * {@link Options#setFieldRendererFactory(FieldRendererFactory, Plugin)}
     * if a plugin so desires.
     *
     * <p>
     * Noop by default.
     *
     * @since JAXB 2.0 EA4
     */
    public void onActivated(Options opts) throws BadCommandLineException {
        // noop
    }

    /**
     * Performs the post-processing of the {@link Model}.
     *
     * <p>
     * This method is invoked after XJC has internally finished
     * the model construction. This is a chance for a plugin to
     * affect the way code generation is performed.
     *
     * <p>
     * Compared to the {@link #run(Outline, Options, ErrorHandler)}
     * method, this method allows a plugin to work at the higher level
     * conceptually closer to the abstract JAXB model, as opposed to
     * Java syntax level.
     *
     * <p>
     * Note that this method is invoked only when a {@link Plugin}
     * is activated.
     *
     * @param model
     *      The object that represents the classes/properties to
     *      be generated.
     *
     * @param errorHandler
     *      Errors should be reported to this handler.
     *
     * @since JAXB 2.0.2
     */
    public void postProcessModel(Model model, ErrorHandler errorHandler) {
        // noop
    }

    /**
     * Run the add-on.
     *
     * <p>
     * This method is invoked after XJC has internally finished
     * the code generation. Plugins can tweak some of the generated
     * code (or add more code) by using {@link Outline} and {@link Options}.
     *
     * <p>
     * Note that this method is invoked only when a {@link Plugin}
     * is activated.
     * 
     * @param outline
     *      This object allows access to various generated code.
     * 
     * @param errorHandler
     *      Errors should be reported to this handler.
     * 
     * @return
     *      If the add-on executes successfully, return true.
     *      If it detects some errors but those are reported and
     *      recovered gracefully, return false.
     *
     * @throws SAXException
     *      After an error is reported to {@link ErrorHandler}, the
     *      same exception can be thrown to indicate a fatal irrecoverable
     *      error. {@link ErrorHandler} itself may throw it, if it chooses
     *      not to recover from the error.
     */
    public abstract boolean run(
        Outline outline, Options opt, ErrorHandler errorHandler ) throws SAXException ;
}
