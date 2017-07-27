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

package com.sun.xml.bind.unmarshaller;

import java.util.Enumeration;

import javax.xml.bind.ValidationEventLocator;
import javax.xml.bind.helpers.AbstractUnmarshallerImpl;
import javax.xml.bind.helpers.ValidationEventLocatorImpl;

import com.sun.xml.bind.v2.runtime.unmarshaller.LocatorEx;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.NamespaceSupport;

/**
 * Visits a W3C DOM tree and generates SAX2 events from it.
 * 
 * <p>
 * This class is just intended to be used by {@link AbstractUnmarshallerImpl}.
 * The javax.xml.bind.helpers package is generally a wrong place to put
 * classes like this.
 *
 * @author <ul><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li></ul>
 * @since JAXB 1.0
 */
public class DOMScanner implements LocatorEx,InfosetScanner/*<Node> --- but can't do this to protect 1.0 clients, or can I? */
{
    
    /** reference to the current node being scanned - used for determining
     *  location info for validation events */
    private Node currentNode = null;
    
    /** To save memory, only one instance of AttributesImpl will be used. */
    private final AttributesImpl atts = new AttributesImpl();
    
    /** This handler will receive SAX2 events. */
    private ContentHandler receiver=null;

    private Locator locator=this;

    public DOMScanner() {
    }
    

    /**
     * Configures the locator object that the SAX {@link ContentHandler} will see.
     */
    public void setLocator( Locator loc ) {
        this.locator = loc;
    }

    public void scan(Object node) throws SAXException {
        if( node instanceof Document ) {
            scan( (Document)node );
        } else {
            scan( (Element)node );
        }
    }
    
    public void scan( Document doc ) throws SAXException {
        scan( doc.getDocumentElement() );
    }
    
    public void scan( Element e) throws SAXException {
        setCurrentLocation( e );

        receiver.setDocumentLocator(locator);
        receiver.startDocument();

        NamespaceSupport nss = new NamespaceSupport();
        buildNamespaceSupport( nss, e.getParentNode() );
        
        for( Enumeration en = nss.getPrefixes(); en.hasMoreElements(); ) {
            String prefix = (String)en.nextElement();
            receiver.startPrefixMapping( prefix, nss.getURI(prefix) );
        }
        
        visit(e);
        
        for( Enumeration en = nss.getPrefixes(); en.hasMoreElements(); ) {
            String prefix = (String)en.nextElement();
            receiver.endPrefixMapping( prefix );
        }
        
        
        setCurrentLocation( e );
        receiver.endDocument();
    }
        
    /**
     * Parses a subtree starting from the element e and
     * reports SAX2 events to the specified handler.
     * 
     * @deprecated in JAXB 2.0
     *      Use {@link #scan(Element)}
     */
    public void parse( Element e, ContentHandler handler ) throws SAXException {
        // it might be better to set receiver at the constructor.
        receiver = handler;
        
        setCurrentLocation( e );
        receiver.startDocument();
        
        receiver.setDocumentLocator(locator);
        visit(e);
        
        setCurrentLocation( e );
        receiver.endDocument();
    }
    
    /**
     * Similar to the parse method but it visits the ancestor nodes
     * and properly emulate the all in-scope namespace declarations.
     * 
     * @deprecated in JAXB 2.0
     *      Use {@link #scan(Element)}
     */
    public void parseWithContext( Element e, ContentHandler handler ) throws SAXException {
        setContentHandler(handler);
        scan(e);
    }
    
    /**
     * Recursively visit ancestors and build up {@link NamespaceSupport} oject.
     */
    private void buildNamespaceSupport(NamespaceSupport nss, Node node) {
        if(node==null || node.getNodeType()!=Node.ELEMENT_NODE)
            return;
            
        buildNamespaceSupport( nss, node.getParentNode() );
        
        nss.pushContext();
        NamedNodeMap atts = node.getAttributes();
        for( int i=0; i<atts.getLength(); i++ ) {
            Attr a = (Attr)atts.item(i);
            if( "xmlns".equals(a.getPrefix()) ) {
                nss.declarePrefix( a.getLocalName(), a.getValue() );
                continue;
            }
            if( "xmlns".equals(a.getName()) ) {
                nss.declarePrefix( "", a.getValue() );
                continue;
            }
        }
    }

    /**
     * Visits an element and its subtree.
     */
    public void visit( Element e ) throws SAXException {
        setCurrentLocation( e );
        final NamedNodeMap attributes = e.getAttributes();
        
        atts.clear();
        int len = attributes==null ? 0: attributes.getLength();
        
        for( int i=len-1; i>=0; i-- ) {
            Attr a = (Attr)attributes.item(i);
            String name = a.getName();
            // start namespace binding
           if(name.startsWith("xmlns")) {
                if(name.length()==5) {
                    receiver.startPrefixMapping( "", a.getValue() );
                } else {
                    String localName = a.getLocalName();
                    if(localName==null) {
                        // DOM built without namespace support has this problem
                        localName = name.substring(6);
                    }
                    receiver.startPrefixMapping( localName, a.getValue() );
                }
                continue;
            }
            
            String uri = a.getNamespaceURI();
            if(uri==null)   uri="";
            
            String local = a.getLocalName();
            if(local==null) local = a.getName();
            // add other attributes to the attribute list
            // that we will pass to the ContentHandler
            atts.addAttribute(
                uri,
                local,
                a.getName(),
                "CDATA",
                a.getValue());
        }
        
        String uri = e.getNamespaceURI();
        if(uri==null)   uri="";
        String local = e.getLocalName();
        String qname = e.getTagName();
        if(local==null) local = qname;
        receiver.startElement( uri, local, qname, atts );
        
        // visit its children
        NodeList children = e.getChildNodes();
        int clen = children.getLength();
        for( int i=0; i<clen; i++ )
            visit(children.item(i));
        
        
        
        setCurrentLocation( e );
        receiver.endElement( uri, local, qname );
        
        // call the endPrefixMapping method
        for( int i=len-1; i>=0; i-- ) {
            Attr a = (Attr)attributes.item(i);
            String name = a.getName();
            if(name.startsWith("xmlns")) {
                if(name.length()==5)
                    receiver.endPrefixMapping("");
                else
                    receiver.endPrefixMapping(a.getLocalName());
            }
        }
    }
    
    private void visit( Node n ) throws SAXException {
        setCurrentLocation( n );
        
        // if a case statement gets too big, it should be made into a separate method.
        switch(n.getNodeType()) {
        case Node.CDATA_SECTION_NODE:
        case Node.TEXT_NODE:
            String value = n.getNodeValue();
            receiver.characters( value.toCharArray(), 0, value.length() );
            break;
        case Node.ELEMENT_NODE:
            visit( (Element)n );
            break;
        case Node.ENTITY_REFERENCE_NODE:
            receiver.skippedEntity(n.getNodeName());
            break;
        case Node.PROCESSING_INSTRUCTION_NODE:
            ProcessingInstruction pi = (ProcessingInstruction)n;
            receiver.processingInstruction(pi.getTarget(),pi.getData());
            break;
        }
    }
    
    private void setCurrentLocation( Node currNode ) {
        currentNode = currNode;
    }
    
    /**
     * The same as {@link #getCurrentElement()} but
     * better typed.
     */
    public Node getCurrentLocation() {
        return currentNode;
    }

    public Object getCurrentElement() {
        return currentNode;
    }

    public LocatorEx getLocator() {
        return this;
    }

    public void setContentHandler(ContentHandler handler) {
        this.receiver = handler;
    }

    public ContentHandler getContentHandler() {
        return this.receiver;
    }


    // LocatorEx implementation
    public String getPublicId() { return null; }
    public String getSystemId() { return null; }
    public int getLineNumber() { return -1; }
    public int getColumnNumber() { return -1; }

    public ValidationEventLocator getLocation() {
        return new ValidationEventLocatorImpl(getCurrentLocation());
    }
}
