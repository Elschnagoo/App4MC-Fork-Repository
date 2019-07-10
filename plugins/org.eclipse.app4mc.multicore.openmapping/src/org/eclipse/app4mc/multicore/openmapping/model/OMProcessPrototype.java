/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.openmapping.model;

import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.jgrapht.DirectedGraph;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.graph.DefaultEdge;

public class OMProcessPrototype {
	private final ProcessPrototype refProcessPrototype;
	private final String name;
	private final DirectedGraph<OMRunnable, DefaultEdge> runnableGraph = new DirectedAcyclicGraph<OMRunnable, DefaultEdge>(
			DefaultEdge.class);

	public OMProcessPrototype(final ProcessPrototype refProcessPrototype) {
		this.refProcessPrototype = refProcessPrototype;
		this.name = refProcessPrototype.getName();
	}

	public boolean createRunnableGraph() {
		// Check if we have any runnableCalls
		if (this.refProcessPrototype.getRunnableCalls().size() <= 0) {
			UniversalHandler.getInstance()
					.logWarn("Invalid SWModel. There are no TaskRunnableCalls in ProcessPrototype '" + this.name
							+ "'. No RunnableGraph created.");
			return false;
		}
		// Check if (optional) First/Last Runnable calls are set
		if (null == this.refProcessPrototype.getFirstRunnable() || null == this.refProcessPrototype.getLastRunnable()) {
			UniversalHandler.getInstance().logWarn("Unexpected SWModel. First- or LastRunnable in ProcessPrototype '"
					+ this.name + "' unset. Ignoring.");
			return false;
		}

		// Foreach runnable call we check if the Runnable is set (not null) and
		// add a vertex to the graph.
		final Stream<RunnableCall> stRunnableCalls = this.refProcessPrototype.getRunnableCalls().stream();
		stRunnableCalls.forEach(r -> processRunnableCall(r));

		return (this.runnableGraph.vertexSet().size() > 0);
	}

	private void processRunnableCall(final RunnableCall r) {
		if (null == r.getRunnable()) {
			return;
		}
		final OMRunnable or = new OMRunnable(r.getRunnable());
		this.runnableGraph.addVertex(or);
	}

	public ProcessPrototype getProcessPrototype() {
		return this.refProcessPrototype;
	}

	public Set<OMRunnable> getRunnableList() {
		return this.runnableGraph.vertexSet();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final String out = "ProcessPrototype: " + this.name;
		return out;

	}

}
