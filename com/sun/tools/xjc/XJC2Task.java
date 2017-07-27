/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2013 Oracle and/or its affiliates. All rights reserved.
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

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.sun.codemodel.CodeWriter;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.writer.FilterCodeWriter;
import com.sun.istack.tools.DefaultAuthenticator;
import com.sun.tools.xjc.model.Model;
import com.sun.tools.xjc.reader.Util;
import com.sun.tools.xjc.util.ForkEntityResolver;
import com.sun.tools.xjc.api.SpecVersion;
import com.sun.xml.bind.v2.util.EditDistance;

import org.apache.tools.ant.AntClassLoader;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.Commandline;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.apache.tools.ant.types.XMLCatalog;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

/**
 * XJC task for Ant.
 *
 * See the accompanied document for the usage.
 *
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public class XJC2Task extends Task {
    public XJC2Task() {
        super();
        classpath = new Path(null);
        options.setSchemaLanguage(Language.XMLSCHEMA);  // disable auto-guessing
    }

    public final Options options = new Options();

    /** User-specified stack size. */
    private long stackSize = -1;

    /**
     * False to continue the build even if the compilation fails.
     */
    private boolean failonerror = true;


    /**
     * True if we will remove all the old output files before
     * invoking XJC.
     */
    private boolean removeOldOutput = false;

    /**
     * Files used to determine whether XJC should run or not.
     */
    private final ArrayList<File> dependsSet = new ArrayList<File>();
    private final ArrayList<File> producesSet = new ArrayList<File>();

    /**
     * Set to true once the &lt;produces> element is used.
     * This flag is used to issue a suggestion to users.
     */
    private boolean producesSpecified = false;

    /**
     * Used to load additional user-specified classes.
     */
    private final Path classpath;

    /** Additional command line arguments. */
    private final Commandline cmdLine = new Commandline();

    /** for resolving entities such as dtds */
    private XMLCatalog xmlCatalog = null;


    /**
     * Parses the schema attribute. This attribute will be used when
     * there is only one schema.
     *
     * @param schema
     *      A file name (can be relative to base dir),
     *      or an URL (must be absolute).
     */
    public void setSchema( String schema ) {
        try {
            options.addGrammar( getInputSource(new URL(schema)) );
        } catch( MalformedURLException e ) {
            File f = getProject().resolveFile(schema);
            options.addGrammar(f);
            dependsSet.add(f);
        }
    }

    /** Nested &lt;schema> element. */
    public void addConfiguredSchema( FileSet fs ) {
        for (InputSource value : toInputSources(fs))
            options.addGrammar(value);

        addIndividualFilesTo( fs, dependsSet );
    }

    /** Nested &lt;classpath> element. */
    public void setClasspath( Path cp ) {
        classpath.createPath().append(cp);
    }

    /** Nested &lt;classpath> element. */
    public Path createClasspath() {
        return classpath.createPath();
    }

    public void setClasspathRef(Reference r) {
        classpath.createPath().setRefid(r);
    }

    /**
     * Sets the schema language.
     */
    public void setLanguage(String language) {
        Language l = Language.valueOf(language.toUpperCase());
        if(l==null) {
            Language[] languages = Language.values();
            String[] candidates = new String[languages.length];
            for( int i=0; i<candidates.length; i++ )
                candidates[i] = languages[i].name();

            throw new BuildException("Unrecognized language: "+language+". Did you mean "+
            EditDistance.findNearest(language.toUpperCase(),candidates)+" ?");
        }
        options.setSchemaLanguage(l);
    }

    /**
     * External binding file.
     */
    public void setBinding( String binding ) {
        try {
            options.addBindFile( getInputSource(new URL(binding)) );
        } catch( MalformedURLException e ) {
            File f = getProject().resolveFile(binding);
            options.addBindFile(f);
            dependsSet.add(f);
        }
    }

    /** Nested &lt;binding> element. */
    public void addConfiguredBinding( FileSet fs ) {
        for (InputSource is : toInputSources(fs))
            options.addBindFile(is);

        addIndividualFilesTo( fs, dependsSet );
    }


    /**
     * Sets the package name of the generated code.
     */
    public void setPackage( String pkg ) {
        this.options.defaultPackage = pkg;
    }

    /**
     * Adds a new catalog file.
     */
    public void setCatalog( File catalog ) {
        try {
            this.options.addCatalog(catalog);
        } catch (IOException e) {
            throw new BuildException(e);
        }
    }

    /**
     * Mostly for our SQE teams and not to be advertized.
     */
    public void setFailonerror(boolean value) {
        failonerror = value;
    }

    /**
     * Sets the stack size of the XJC invocation.
     *
     * @deprecated
     *      not much need for JAXB2, as we now use much less stack.
     */
    public void setStackSize( String ss ) {
        try {
            stackSize = Long.parseLong(ss);
            return;
        } catch( NumberFormatException e ) {
            // ignore
        }

        if( ss.length()>2 ) {
            String head = ss.substring(0,ss.length()-2);
            String tail = ss.substring(ss.length()-2);

            if( tail.equalsIgnoreCase("kb") ) {
                try {
                    stackSize = Long.parseLong(head)*1024;
                    return;
                } catch( NumberFormatException ee ) {
                    // ignore
                }
            }
            if( tail.equalsIgnoreCase("mb") ) {
                try {
                    stackSize = Long.parseLong(head)*1024*1024;
                    return;
                } catch( NumberFormatException ee ) {
                    // ignore
                }
            }
        }

        throw new BuildException("Unrecognizable stack size: "+ss);
    }

    /**
     * Add the catalog to our internal catalog
     *
     * @param xmlCatalog the XMLCatalog instance to use to look up DTDs
     */
    public void addConfiguredXMLCatalog(XMLCatalog xmlCatalog) {
        if(this.xmlCatalog==null) {
            this.xmlCatalog = new XMLCatalog();
            this.xmlCatalog.setProject(getProject());
        }
        this.xmlCatalog.addConfiguredXMLCatalog(xmlCatalog);
    }

    /**
     * Controls whether files should be generated in read-only mode or not
     */
    public void setReadonly( boolean flg ) {
        this.options.readOnly = flg;
    }

    /**
     * Controls whether the file header comment is generated or not.
     */
    public void setHeader( boolean flg ) {
        this.options.noFileHeader = !flg;
    }

    /**
     * @see Options#runtime14
     */
    public void setXexplicitAnnotation( boolean flg) {
        this.options.runtime14 = flg;
    }

    /**
     * Controls whether the compiler will run in the strict
     * conformance mode (flg=false) or the extension mode (flg=true)
     */
    public void setExtension( boolean flg ) {
        if(flg)
            this.options.compatibilityMode = Options.EXTENSION;
        else
            this.options.compatibilityMode = Options.STRICT;
    }

    /**
     * Sets the target version of the compilation
     */
    public void setTarget( String version ) {
        options.target = SpecVersion.parse(version);
        if(options.target==null)
            throw new BuildException(version+" is not a valid version number. Perhaps you meant @destdir?");
    }

    /**
     * Sets the directory to produce generated source files.
     */
    public void setDestdir( File dir ) {
        this.options.targetDir = dir;
    }

    public void setEncoding( String encoding ) {
        this.options.encoding = encoding;
    }

    /** Nested &lt;depends> element. */
    public void addConfiguredDepends( FileSet fs ) {
        addIndividualFilesTo( fs, dependsSet );
    }

    /** Nested &lt;produces> element. */
    public void addConfiguredProduces( FileSet fs ) {
        producesSpecified = true;
        if( !fs.getDir(getProject()).exists() ) {
            log(
                fs.getDir(getProject()).getAbsolutePath()+" is not found and thus excluded from the dependency check",
                Project.MSG_INFO );
        } else
            addIndividualFilesTo( fs, producesSet );
    }

    /** "removeOldOutput" attribute. */
    public void setRemoveOldOutput( boolean roo ) {
        this.removeOldOutput = roo;
    }

    public Commandline.Argument createArg() {
        return cmdLine.createArgument();
    }




    /** Runs XJC. */
    @Override
    public void execute() throws BuildException {

        log( "build id of XJC is " + Driver.getBuildID(), Project.MSG_VERBOSE );

        classpath.setProject(getProject());

        try {
            if( stackSize==-1 )
                doXJC();   // just invoke XJC
            else {
                try {
                    // launch XJC with a new thread so that we can set the stack size.
                    final Throwable[] e = new Throwable[1];

                    Thread t;
                    Runnable job = new Runnable() {
                        public void run() {
                            try {
                                doXJC();
                            } catch( Throwable be ) {
                                e[0] = be;
                            }
                        }
                    };

                    try {
                        // this method is available only on JDK1.4
                        Constructor c = Thread.class.getConstructor(
                            ThreadGroup.class,
                            Runnable.class,
                            String.class,
                            long.class);
                        t = (Thread)c.newInstance(
                                Thread.currentThread().getThreadGroup(),
                                job,
                                Thread.currentThread().getName()+":XJC",
                                stackSize);
                    } catch( Throwable err ) {
                        // if fail, fall back.
                        log( "Unable to set the stack size. Use JDK1.4 or above", Project.MSG_WARN );
                        doXJC();
                        return;
                    }


                    t.start();
                    t.join();
                    if( e[0] instanceof Error )             throw (Error)e[0];
                    if( e[0] instanceof RuntimeException )  throw (RuntimeException)e[0];
                    if( e[0] instanceof BuildException )    throw (BuildException)e[0];
                    if( e[0]!=null )    throw new BuildException(e[0]);
                } catch( InterruptedException e ) {
                    throw new BuildException(e);
                }
            }
        } catch( BuildException e ) {
            log("failure in the XJC task. Use the Ant -verbose switch for more details");
            if(failonerror)
                throw e;
            else {
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                getProject().log(sw.toString(),Project.MSG_WARN);
                // continue
            }
        }
    }

    private void doXJC() throws BuildException {
        ClassLoader old = SecureLoader.getContextClassLoader();
        AntClassLoader acl = null;
        try {
            if (classpath != null) {
                for (String pathElement : classpath.list()) {
                    try {
                        options.classpaths.add(new File(pathElement).toURI().toURL());
                    } catch (MalformedURLException ex) {
                        log("Classpath for XJC task not setup properly: " + pathElement);
                    }
                }
            }
            // set the user-specified class loader so that XJC will use it.
            // We have to specify parent classLoader because in other case AntClassLoader class classLoader will be set as parent
            // and we will lose current classLoader.
            SecureLoader.setContextClassLoader(acl = new AntClassLoader(this.getClass().getClassLoader(), getProject(), classpath, false));
            _doXJC();
        } finally {
            // restore the context class loader
            SecureLoader.setContextClassLoader(old);
            // close AntClassLoader
            if (acl != null) {
                acl.cleanup();
            }
            if (options.proxyAuth != null) {
                DefaultAuthenticator.reset();
            }
        }
    }

    private void _doXJC() throws BuildException {
        try {
            // parse additional command line params
            options.parseArguments(cmdLine.getArguments());
        } catch( BadCommandLineException e ) {
            throw new BuildException(e.getMessage(),e);
        }

        if(xmlCatalog!=null) {
            if(options.entityResolver==null) {
                options.entityResolver = xmlCatalog;
            } else {
                options.entityResolver = new ForkEntityResolver(options.entityResolver,xmlCatalog);
            }
        }

        if( !producesSpecified ) {
            log("Consider using <depends>/<produces> so that XJC won't do unnecessary compilation",Project.MSG_INFO);
        }

        // up to date check
        long srcTime = computeTimestampFor(dependsSet,true);
        long dstTime = computeTimestampFor(producesSet,false);
        log("the last modified time of the inputs is  "+srcTime, Project.MSG_VERBOSE);
        log("the last modified time of the outputs is "+dstTime, Project.MSG_VERBOSE);

        if( srcTime < dstTime ) {
            log("files are up to date");
            return;
        }

        InputSource[] grammars = options.getGrammars();

        String msg = "Compiling "+grammars[0].getSystemId();
        if( grammars.length>1 )  msg += " and others";
        log( msg, Project.MSG_INFO );

        if( removeOldOutput ) {
            log( "removing old output files", Project.MSG_INFO );
            for( File f : producesSet )
                f.delete();
        }

        // TODO: I don't know if I should send output to stdout
        ErrorReceiver errorReceiver = new ErrorReceiverImpl();

        Model model = ModelLoader.load( options, new JCodeModel(), errorReceiver );

        if(model==null)
            throw new BuildException("unable to parse the schema. Error messages should have been provided");

        try {

            if(model.generateCode(options,errorReceiver)==null)
                throw new BuildException("failed to compile a schema");

            log( "Writing output to "+options.targetDir, Project.MSG_INFO );

            model.codeModel.build( new AntProgressCodeWriter(options.createCodeWriter()));
        } catch( IOException e ) {
            throw new BuildException("unable to write files: "+e.getMessage(),e);
        }
    }

    /**
     * Determines the timestamp of the newest/oldest file in the given set.
     */
    private long computeTimestampFor( List<File> files, boolean findNewest ) {

        long lastModified = findNewest?Long.MIN_VALUE:Long.MAX_VALUE;

        for( File file : files ) {
            log("Checking timestamp of "+file.toString(), Project.MSG_VERBOSE );

            if( findNewest )
                lastModified = Math.max( lastModified, file.lastModified() );
            else
                lastModified = Math.min( lastModified, file.lastModified() );
        }

        if( lastModified == Long.MIN_VALUE ) // no file was found
            return Long.MAX_VALUE;  // force re-run

        if( lastModified == Long.MAX_VALUE ) // no file was found
            return Long.MIN_VALUE;  // force re-run

        return lastModified;
    }

    /**
     * Extracts {@link File} objects that the given {@link FileSet}
     * represents and adds them all to the given {@link List}.
     */
    private void addIndividualFilesTo( FileSet fs, List<File> lst ) {
        DirectoryScanner ds = fs.getDirectoryScanner(getProject());
        String[] includedFiles = ds.getIncludedFiles();
        File baseDir = ds.getBasedir();

        for (String value : includedFiles) {
            lst.add(new File(baseDir, value));
        }
    }

    /**
     * Extracts files in the given {@link FileSet}.
     */
    private InputSource[] toInputSources( FileSet fs ) {
        DirectoryScanner ds = fs.getDirectoryScanner(getProject());
        String[] includedFiles = ds.getIncludedFiles();
        File baseDir = ds.getBasedir();

        ArrayList<InputSource> lst = new ArrayList<InputSource>();

        for (String value : includedFiles) {
            lst.add(getInputSource(new File(baseDir, value)));
        }

        return lst.toArray(new InputSource[lst.size()]);
    }

    /**
     * Converts a File object to an InputSource.
     */
    private InputSource getInputSource( File f ) {
        try {
            return new InputSource(f.toURI().toURL().toExternalForm());
        } catch( MalformedURLException e ) {
            return new InputSource(f.getPath());
        }
    }

    /**
     * Converts an URL to an InputSource.
     */
    private InputSource getInputSource( URL url ) {
        return Util.getInputSource(url.toExternalForm());
    }

    /**
     * {@link CodeWriter} that produces progress messages
     * as Ant verbose messages.
     */
    private class AntProgressCodeWriter extends FilterCodeWriter {
        public AntProgressCodeWriter( CodeWriter output ) {
            super(output);
        }

        @Override
        public OutputStream openBinary(JPackage pkg, String fileName) throws IOException {
            if(pkg.isUnnamed())
                log( "generating " + fileName, Project.MSG_VERBOSE );
            else
                log( "generating " +
                    pkg.name().replace('.',File.separatorChar)+
                    File.separatorChar+fileName, Project.MSG_VERBOSE );

            return super.openBinary(pkg,fileName);
        }
    }

    /**
     * {@link ErrorReceiver} that produces messages
     * as Ant messages.
     */
    private class ErrorReceiverImpl extends ErrorReceiver {

        public void warning(SAXParseException e) {
            print(Project.MSG_WARN,Messages.WARNING_MSG,e);
        }

        public void error(SAXParseException e) {
            print(Project.MSG_ERR,Messages.ERROR_MSG,e);
        }

        public void fatalError(SAXParseException e) {
            print(Project.MSG_ERR,Messages.ERROR_MSG,e);
        }

        public void info(SAXParseException e) {
            print(Project.MSG_VERBOSE,Messages.INFO_MSG,e);
        }

        private void print( int logLevel, String header, SAXParseException e ) {
            log( Messages.format(header,e.getMessage()), logLevel );
            log( getLocationString(e), logLevel );
            log( "", logLevel );
        }
    }
}
