/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.algorithms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.StrongConnectivityInspector;
import org.jgrapht.alg.cycle.SzwarcfiterLauerSimpleCycles;

public class Cycle<V, E> extends SzwarcfiterLauerSimpleCycles<V, E> {
	private final DirectedGraph<V, E> graph;
	private final Set<E> removedEdges = new HashSet<E>();

	public Set<E> getRemovedEdges() {
		return this.removedEdges;
	}

	@Override
	public DirectedGraph<V, E> getGraph() {
		return this.graph;
	}

	public Cycle(final DirectedGraph<V, E> graph) {
		if (graph == null) {
			throw new IllegalArgumentException("Null graph argument.");
		}
		this.graph = graph;
	}


	@Override
	public List<List<V>> findSimpleCycles() {
		if (this.graph == null) {
			throw new IllegalArgumentException("Null graph.");
		}
		List<Set<V>> sccs = null;
		do {
			sccs = getSCC();
			for (final Set<V> scc : sccs) {
				deleteRSC(scc);
			}
		} while (sccs.size() > 0);
		return null;
	}


	@SuppressWarnings("unchecked")
	private void deleteRSC(final Set<V> scc) {
		final Set<E> edgeSet = this.graph.outgoingEdgesOf((V) scc.toArray()[0]);
		final Iterator<E> it = edgeSet.iterator();
		while (it.hasNext()) {
			final E e = it.next();
			if (scc.contains(
					((RunnableSequencingConstraint) e).getRunnableGroups().get(1).getEntries().get(0).getRunnable())) {
				this.removedEdges.add(e);
				this.graph.removeEdge(e);
				break;
			}
		}
	}


	private List<Set<V>> getSCC() {
		final StrongConnectivityInspector<V, E> inspector = new StrongConnectivityInspector<V, E>(this.graph);
		final List<Set<V>> sccs = inspector.stronglyConnectedSets();
		final Iterator<Set<V>> i = sccs.iterator();
		while (i.hasNext()) {
			if (i.next().size() == 1) {
				i.remove();
			}
		}
		return sccs;
	}
}
