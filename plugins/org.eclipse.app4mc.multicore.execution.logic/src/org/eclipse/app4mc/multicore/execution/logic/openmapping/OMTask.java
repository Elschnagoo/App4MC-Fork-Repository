/**
 ********************************************************************************
 * Copyright (c) 2015, 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.execution.logic.openmapping;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeDeviation;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.emf.ecore.EAttribute;

/**
 * 
 */
public class OMTask {

	private final Task taskRef;

	private OMTask predecessor = null;

	private long iInstructionCount = -1;

	private final List<OMEdge> post = new LinkedList<>();

	private List<OMRunnable> runnableSequence;

	private long period = -1;

	public OMTask(final Task taskRef) {
		this.taskRef = taskRef;
	}

	public OMTask(final Task taskRef, final OMTask predecessor) {
		this.taskRef = taskRef;
		this.predecessor = predecessor;
	}

	public Task getTaskRef() {
		return this.taskRef;
	}

	public OMTask getPredecessor() {
		return this.predecessor;
	}

	/**
	 *
	 * @return
	 */
	public long getInstructionCount() {
		if (0 > this.iInstructionCount) {
			// try to get instructioncount from property
			// first
			getPropertyInstructionCount();
		}

		if (0 > this.iInstructionCount) {
			iInstructionCount = 0;
			for (OMRunnable r : getRunnableCallSequence()) {
				iInstructionCount += r.getInstructionCount();
			}
		}
		return this.iInstructionCount;
	}

	private boolean getPropertyInstructionCount() {
		Value x = getTaskRef().getCustomProperties().get("instructionCount");
		if (x != null) {
			List<EAttribute> a = x.eClass().getEAttributes();
			if (a.size() > 0) {
				Object o = x.eGet(a.get(0));
				long val = Long.parseLong(o.toString());
				if (val > 0) {
					iInstructionCount = val;
					return true;
				}
			}

		}
		return false;
	}

	public long getRunnableCount() {
		return getRunnableCallSequence().size();
	}

	// public long getRunnableCount() {
	// if (0 > this.iRunnableCount) {
	// fetchRunnableAndInstructionCount();
	// }
	// return this.iRunnableCount;
	// }
	//
	// private void fetchRunnableAndInstructionCount() {
	// // Check if a call graph is present in the task and if it is valid
	// final CallGraph callGraph = this.taskRef.getCallGraph();
	// if (callGraph == null) {
	// UniversalHandler.getInstance().log("Invalid Software Model, Task '" +
	// this.taskRef.getName()
	// + "' has an invalid or missing containment to its CallGraph.", null);
	// return;
	// }
	//
	// if (callGraph.getGraphEntries().size() <= 0) {
	// UniversalHandler.getInstance().log(
	// "Invalid Software Model, The CallGraph of Task '" +
	// this.taskRef.getName() + "' is empty", null);
	// return;
	// }
	//
	// // Runnable counter is increased by the child methods. Since we init it
	// with -1, we have to increase it one time
	// // manually.
	// ++this.iRunnableCount;
	//
	// this.iInstructionCount = processCallGraph(callGraph);
	// }
	//
	// /**
	// *
	// * @param callGraph
	// * @return
	// */
	// private long processCallGraph(final CallGraph callGraph) {
	// // Count the total number of Instructions of the CallGraph
	// long tmpInstr = 0;
	//
	// // Create iterator with call graph entries (Runnables) and process them
	// final Iterator<GraphEntryBase> itGraphEntries =
	// callGraph.getGraphEntries().iterator();
	// while (itGraphEntries.hasNext()) {
	// // Check GraphEntry Specialization and process it accordingly
	// final GraphEntryBase graphEntry = itGraphEntries.next();
	// // CallSequence
	// if (graphEntry instanceof CallSequence) {
	// tmpInstr += processCallSequence((CallSequence) graphEntry);
	// }
	//
	// // LabelSwitch
	// else if (graphEntry instanceof ModeSwitch) {
	// UniversalHandler.getInstance().log(
	// "GraphEntry specialisation LabelSwitch is not supported. Skipping...",
	// null, IStatus.WARNING);
	// }
	//
	// // ProbabilitySwitch
	// else if (graphEntry instanceof ProbabiltitySwitch) {
	// UniversalHandler.getInstance().log(
	// "GraphEntry specialisation ProbabiltitySwitch is not supported.
	// Skipping...", null,
	// IStatus.WARNING);
	// }
	//
	// // Unhandled, default Error
	// else {
	// UniversalHandler.getInstance().log("Unkown GraphEntry specialisation.
	// Skipping...", null);
	// }
	// }
	// return tmpInstr;
	// }
	//
	// /**
	// * Processes the <code>CallSequence</code> and fetches the number of
	// Instructions for each of its
	// * <code>TaskRunnableCalls</code>. Further handled elements may be added
	// in the future.
	// *
	// * @param callSeq
	// * The CallSequence to process
	// * @return Number of Instructions in the CallSequence
	// */
	// private long processCallSequence(final CallSequence callSeq) {
	// // Count the total number of Instructions of the CallSequence
	// long tmpInstr = 0;
	//
	// // Check if CallSequence is empty
	// if (callSeq.getCalls().size() <= 0) {
	// UniversalHandler.getInstance().log("Invalid Software Model, CallSequence
	// must not be empty. Skipping...",
	// null);
	// return tmpInstr;
	// }
	//
	// // Process CallSequence items
	// final Iterator<CallSequenceItem> itCallSeqItems =
	// callSeq.getCalls().iterator();
	// while (itCallSeqItems.hasNext()) {
	// final CallSequenceItem callSeqEntry = itCallSeqItems.next();
	// if (callSeqEntry instanceof TaskRunnableCall) {
	// tmpInstr += processTaskRunnableCall((TaskRunnableCall) callSeqEntry);
	// }
	// else {
	// UniversalHandler.getInstance().logWarn("Unkown CallSequenceItem
	// specialisation. Skipping...");
	// }
	// }
	// return tmpInstr;
	// }
	//
	// /**
	// * Processes the <code>TaskRunnableCall</code> and fetches the number of
	// Instructions for each of its
	// * <code>Runnable</code>s.
	// *
	// * @param taskRunnableCall
	// * The TaskRunnableCall to process
	// * @return Number of Instructions in the TaskRunnableCall
	// */
	// private long processTaskRunnableCall(final TaskRunnableCall
	// taskRunnableCall) {
	// final Runnable runnable = taskRunnableCall.getRunnable();
	// // Check if reference to runnable is set
	// if (runnable == null) {
	// UniversalHandler.getInstance()
	// .log("Invalid Software Model, reference to Runnable must not be empty.
	// Skipping...", null);
	// return 0;
	// }
	//
	// ++this.iRunnableCount;
	// final OMRunnable r = new OMRunnable(runnable);
	// // TODO The Runnables should be stored in some way, maybe even the Graph
	// might be build at this point
	// return r.getInstructionCount();
	// }

	@Override
	public String toString() {
		return this.taskRef.getUniqueName();
	}

	/**
	 * Get the period period of the task activation.
	 * 
	 * @param t
	 * @return Period of the task in pico seconds or 0 if the task has no period
	 */
	public long getPeriod() {
		if (period < 0) {
			for (Stimulus s : getTaskRef().getStimuli()) {
				if (s instanceof PeriodicStimulus) {
					PeriodicStimulus ps = (PeriodicStimulus) s;
					Time x = ps.getRecurrence();
					if (x == null) {
						period = 0;
						return period;
					}
					long val = x.getValue().longValue();
					if (val == 0 || x.getUnit() == null) {
						period = 0;
						return period;
					}
					switch (x.getUnit()) {
					case PS:
						val *= 1; //
						break;
					case NS:
						val *= 1000; //
						break;
					case US:
						val *= 1000000L; //
						break;
					case MS:
						val *= 1000000000L; //
						break;
					case S:
						val *= 1000000000000L; //
						break;
					default:
						period = 0;
						return period;
					}
					period = val;
					return period;
				}
				// Support fot FMTV
				if(s instanceof RelativePeriodicStimulus) {
					RelativePeriodicStimulus spst = (RelativePeriodicStimulus) s;
					TimeDeviation dev = spst.getNextOccurrence();
					Time x = dev.getLowerBound();
					if (x == null) {
						period = 0;
						return period;
					}
					long val = x.getValue().longValue();
					if (val == 0 || x.getUnit() == null) {
						period = 0;
						return period;
					}
					switch (x.getUnit()) {
					case PS:
						val *= 1; //
						break;
					case NS:
						val *= 1000; //
						break;
					case US:
						val *= 1000000L; //
						break;
					case MS:
						val *= 1000000000L; //
						break;
					case S:
						val *= 1000000000000L; //
						break;
					default:
						period = 0;
						return period;
					}
					period = val;
					return period;
				}
				
			}
			period = 0;// not periodic
		}
		return period;
	}

	public List<OMRunnable> getRunnableCallSequence() {
		if (runnableSequence == null) {
			try {
				runnableSequence = createCallSequenceList().stream().map(OMRunnable::new).collect(Collectors.toList());
			} catch (MalformedModelException e) {
				e.printStackTrace();
				runnableSequence = new LinkedList<>();

			}
		}
		return runnableSequence;
	}

	private List<Runnable> createCallSequenceList() throws MalformedModelException {
		List<Runnable> list = new LinkedList<>();

		Task t = getTaskRef();
		if (t == null) {
			throw new MalformedModelException("No Task defined!");
		}
		CallGraph graph = t.getCallGraph();
		if (graph == null) {
			throw new MalformedModelException("No callgraph at task " + t.getName());
		}

		for (GraphEntryBase entry : graph.getGraphEntries()) {
			if (entry instanceof CallSequence) {
				CallSequence seq = (CallSequence) entry;
				for (CallSequenceItem item : seq.getCalls()) {
					if (item instanceof TaskRunnableCall) {
						TaskRunnableCall call = (TaskRunnableCall) item;
						Runnable r = call.getRunnable();
						if (r == null) {
							throw new MalformedModelException("Empty Runnable call at task " + t.getName());
						}
						list.add(r);
					}
				}
				if (list.size() == 0) {
					throw new MalformedModelException("Empty CallSequence at task " + t.getName());
				}
				return list;
			}
		}
		throw new MalformedModelException("No CallSequence defined!");
	}

	public List<OMEdge> getPosts() {
		return post;
	}

}
