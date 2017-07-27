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

package com.sun.tools.xjc.reader.gbind;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Graph of {@link Element}s.
 *
 * @author Kohsuke Kawaguchi
 */
public final class Graph implements Iterable<ConnectedComponent> {
    private final Element source = new SourceNode();
    private final Element sink = new SinkNode();

    /**
     * Strongly connected components of this graph.
     */
    private final List<ConnectedComponent> ccs = new ArrayList<ConnectedComponent>();

    /**
     * Builds a {@link Graph} from an {@link Expression} tree.
     *
     * {@link Expression} given to the graph will be modified forever,
     * and it will not be able to create another {@link Graph}.
     */
    public Graph(Expression body) {
        // attach source and sink
        Expression whole = new Sequence(new Sequence(source,body),sink);

        // build up a graph
        whole.buildDAG(ElementSet.EMPTY_SET);

        // decompose into strongly connected components.
        // the algorithm is standard DFS-based algorithm,
        // one illustration of this algorithm is available at
        // http://www.personal.kent.edu/~rmuhamma/Algorithms/MyAlgorithms/GraphAlgor/strongComponent.htm
        source.assignDfsPostOrder(sink);
        source.buildStronglyConnectedComponents(ccs);

        // cut-set check
        Set<Element> visited = new HashSet<Element>();
        for (ConnectedComponent cc : ccs) {
            visited.clear();
            if(source.checkCutSet(cc,visited)) {
                cc.isRequired = true;
            }
        }
    }

    /**
     * List up {@link ConnectedComponent}s of this graph in an order.
     */
    public Iterator<ConnectedComponent> iterator() {
        return ccs.iterator();
    }

    public String toString() {
        return ccs.toString();
    }
}
