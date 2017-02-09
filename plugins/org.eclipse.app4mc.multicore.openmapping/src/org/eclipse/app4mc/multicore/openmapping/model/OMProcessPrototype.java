package org.eclipse.app4mc.multicore.openmapping.model;

import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.jgrapht.DirectedGraph;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.graph.DefaultEdge;

public class OMProcessPrototype {
	private final ProcessPrototype refProcessPrototype;
	private String name;
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
					.logWarn("Invalid SWModel. There are no TaskRunnableCalls in ProcessPrototype '" + name
							+ "'. No RunnableGraph created.");
			return false;
		}
		// Check if (optional) First/Last Runnable calls are set
		if (null == this.refProcessPrototype.getFirstRunnable() || null == this.refProcessPrototype.getLastRunnable()) {
			UniversalHandler.getInstance().logWarn(
					"Unexpected SWModel. First- or LastRunnable in ProcessPrototype '" + name + "' unset. Ignoring.");
			return false;
		}

		// Foreach runnable call we check if the Runnable is set (not null) and add a vertex to the graph.
		Stream<TaskRunnableCall> stRunnableCalls = this.refProcessPrototype.getRunnableCalls().stream();
		stRunnableCalls.forEach(r -> processRunnableCall(r));

		return (runnableGraph.vertexSet().size() > 0);
	}

	private void processRunnableCall(TaskRunnableCall r) {
		if(null == r.getRunnable()) {
			return;
		}
		OMRunnable or = new OMRunnable(r.getRunnable());
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

	public String toString() {
		String out = "ProcessPrototype: " + name;
		return out;

	}

}
