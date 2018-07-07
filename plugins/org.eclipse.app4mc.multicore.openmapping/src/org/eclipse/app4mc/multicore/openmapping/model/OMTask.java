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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ReferenceObject;
import org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.runtime.IStatus;

public class OMTask {
	private final String sTokenInclude = "[ConstraintInclude]";
	private final String sTokenExclude = "[ConstraintExclude]";

	private final Task taskRef;
	private OMTask predecessor = null;
	private long iInstructionCount = -1;
	private long iRunnableCount = -1;
	private long iPeriod = -1;
	/**
	 * Max period among all tasks, used for recursion factor calculation
	 */
	private static long iMaxPeriod = -1;

	private ArrayList<OMAnnotationElement> validTags = new ArrayList<OMAnnotationElement>();
	private ArrayList<OMAnnotationElement> invalidTags = new ArrayList<OMAnnotationElement>();

	public OMTask(final Task taskRef) {
		this.taskRef = taskRef;
		addAnnotationElements();
	}

	public OMTask(final Task taskRef, final OMTask predecessor) {
		this(taskRef);
		this.predecessor = predecessor;
	}

	private void addAnnotationElements() {
		final Map<String, Value> itPropertyConstraints;
		// Check custom Properties
		if (this.getTaskRef().getCustomProperties().size() > 0) {
			itPropertyConstraints = this.getTaskRef().getCustomProperties().map();
			itPropertyConstraints.forEach((k, v) -> parsePropertyConstraint(k, v));
		}
	}

	// TODO This should be handled more compact
	private void parsePropertyConstraint(String k, Value v) {
		UniversalHandler.getInstance().logCon("T: " + taskRef.getName() + " - Parsing (K: " + k + " V: " + v + ")");
		// Check if we have a valid Property Constraint
		if (v instanceof ReferenceObject) {
			ReferenceObject ref = (ReferenceObject) v;
			if (ref.getValue() instanceof Tag) {
				OMTag ot = new OMTag((Tag) ref.getValue());
				if (k.contains(sTokenInclude)) {
					this.validTags.add(ot);
				} else if (k.contains(sTokenExclude)) {
					this.invalidTags.add(ot);
				} else {
					// Skipping
				}
			}

			if (ref.getValue() instanceof CoreClassifier) {
				OMCoreClassifier ot = new OMCoreClassifier((CoreClassifier) ref.getValue());
				if (k.contains(sTokenInclude)) {
					this.validTags.add(ot);
				} else if (k.contains(sTokenExclude)) {
					this.invalidTags.add(ot);
				} else {
					// Skipping
				}
			}
		}
	}

	private void fetchRunnableAndInstructionCount() {
		// Check if a call graph is present in the task and if it is valid
		final CallGraph callGraph = this.taskRef.getCallGraph();
		if (callGraph == null) {
			UniversalHandler.getInstance().log("Invalid Software Model, Task '" + this.taskRef.getName()
					+ "' has an invalid or missing containment to its CallGraph.", null);
			return;
		}

		if (callGraph.getGraphEntries().size() <= 0) {
			UniversalHandler.getInstance().log(
					"Invalid Software Model, The CallGraph of Task '" + this.taskRef.getName() + "' is empty", null);
			return;
		}

		// Runnable counter is increased by the child methods. Since we init it
		// with -1, we have to increase it one time
		// manually.
		++this.iRunnableCount;

		this.iInstructionCount = processCallGraph(callGraph);
	}

	/**
	 *
	 * @param callGraph
	 * @return
	 */
	private long processCallGraph(final CallGraph callGraph) {
		// Count the total number of Instructions of the CallGraph
		long tmpInstr = 0;

		// Create iterator with call graph entries (Runnables) and process them
		final Iterator<GraphEntryBase> itGraphEntries = callGraph.getGraphEntries().iterator();
		while (itGraphEntries.hasNext()) {
			// Check GraphEntry Specialization and process it accordingly
			final GraphEntryBase graphEntry = itGraphEntries.next();
			// CallSequence
			if (graphEntry instanceof CallSequence) {
				tmpInstr += processCallSequence((CallSequence) graphEntry);
			}

			// LabelSwitch
			else if (graphEntry instanceof ModeSwitch) {
				UniversalHandler.getInstance().log(
						"GraphEntry specialisation LabelSwitch is not supported. Skipping...", null, IStatus.WARNING);
			}

			// ProbabilitySwitch
			else if (graphEntry instanceof ProbabilitySwitch) {
				UniversalHandler.getInstance().log(
						"GraphEntry specialisation ProbabilitySwitch is not supported. Skipping...", null,
						IStatus.WARNING);
			}

			// Unhandled, default Error
			else {
				UniversalHandler.getInstance().log("Unkown GraphEntry specialisation. Skipping...", null);
			}
		}
		return tmpInstr;
	}

	/**
	 * Processes the <code>CallSequence</code> and fetches the number of
	 * Instructions for each of its <code>TaskRunnableCalls</code>. Further
	 * handled elements may be added in the future.
	 *
	 * @param callSeq
	 *            The CallSequence to process
	 * @return Number of Instructions in the CallSequence
	 */
	private long processCallSequence(final CallSequence callSeq) {
		// Count the total number of Instructions of the CallSequence
		long tmpInstr = 0;

		// Check if CallSequence is empty
		if (callSeq.getCalls().size() <= 0) {
			UniversalHandler.getInstance().log("Invalid Software Model, CallSequence must not be empty. Skipping...",
					null);
			return tmpInstr;
		}

		// Process CallSequence items
		final Iterator<CallSequenceItem> itCallSeqItems = callSeq.getCalls().iterator();
		while (itCallSeqItems.hasNext()) {
			final CallSequenceItem callSeqEntry = itCallSeqItems.next();
			if (callSeqEntry instanceof TaskRunnableCall) {
				tmpInstr += processTaskRunnableCall((TaskRunnableCall) callSeqEntry);
			} else {
				UniversalHandler.getInstance().logWarn("Unkown CallSequenceItem specialisation. Skipping...");
			}
		}
		return tmpInstr;
	}

	/**
	 * Processes the <code>TaskRunnableCall</code> and fetches the number of
	 * Instructions for each of its <code>Runnable</code>s.
	 *
	 * @param taskRunnableCall
	 *            The TaskRunnableCall to process
	 * @return Number of Instructions in the TaskRunnableCall
	 */
	private long processTaskRunnableCall(final TaskRunnableCall taskRunnableCall) {
		final Runnable runnable = taskRunnableCall.getRunnable();
		// Check if reference to runnable is set
		if (runnable == null) {
			UniversalHandler.getInstance()
					.log("Invalid Software Model, reference to Runnable must not be empty. Skipping...", null);
			return 0;
		}

		++this.iRunnableCount;
		final OMRunnable r = new OMRunnable(runnable);
		// TODO The Runnables should be stored in some way, maybe even the Graph
		// might be build at this point
		return r.getInstructionCount();
	}

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
		final List<Stimulus> lSt;
		// Only check for the first stimulus
		if ((lSt = getTaskRef().getStimuli()) == null || lSt.size() <= 0) {
			UniversalHandler.getInstance().log("Stimuli not set.\nSkipping Task " + this.taskRef.getName(), null);
			return iPeriod;
		}
		if (iPeriod < 0) {
			for (Stimulus s : lSt) {
				if (s instanceof PeriodicStimulus) {
					PeriodicStimulus ps = (PeriodicStimulus) s;
					Time x = ps.getRecurrence();
					if (x == null) {
						iPeriod = 0;
						return iPeriod;
					}
					long val = x.getValue().longValue();
					if (val == 0 || x.getUnit() == null) {
						iPeriod = 0;
						return iPeriod;
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
						iPeriod = 0;
						return iPeriod;
					}
					iPeriod = val;
					if (iPeriod > iMaxPeriod) {
						iMaxPeriod = iPeriod;
					}

					return iPeriod;
				}
				// Support fot FMTV
				if (s instanceof RelativePeriodicStimulus) {
					RelativePeriodicStimulus spst = (RelativePeriodicStimulus) s;
					Deviation<Time> dev = spst.getNextOccurrence();
					Time x = dev.getLowerBound();
					if (x == null) {
						iPeriod = 0;
						return iPeriod;
					}
					long val = x.getValue().longValue();
					if (val == 0 || x.getUnit() == null) {
						iPeriod = 0;
						return iPeriod;
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
						iPeriod = 0;
						return iPeriod;
					}
					iPeriod = val;
					if (iPeriod > iMaxPeriod) {
						iMaxPeriod = iPeriod;
					}
					return iPeriod;
				}

			}
			iPeriod = 0;// not periodic
		}
		return iPeriod;
	}

	/**
	 * Returns the recursion factor of a Task
	 * 
	 * The recursion factor is the quotient of the max period among all tasks
	 * and the period of this task, e.g. if the max period is 100ms, and this
	 * tasks period is 50ms, the recursion factor is 0.5.
	 * 
	 * @return Double The recursion factor RF with 0.0 < RF <= 1.0
	 */
	public double getRecursionFactor() {
		if (iPeriod < 0) {
			getPeriod();
		}
		return iMaxPeriod / (double) iPeriod;
	}

	public Task getTaskRef() {
		return this.taskRef;
	}

	public OMTask getPredecessor() {
		return this.predecessor;
	}

	public long getInstructionCount() {
		if (0 > this.iInstructionCount) {
			fetchRunnableAndInstructionCount();
		}
		return this.iInstructionCount;
	}

	public long getRunnableCount() {
		if (0 > this.iRunnableCount) {
			fetchRunnableAndInstructionCount();
		}
		return this.iRunnableCount;
	}

	public ArrayList<OMAnnotationElement> getValidAnnotationElements() {
		return this.validTags;
	}

	public ArrayList<OMAnnotationElement> getInvalidAnnotationElements() {
		return this.invalidTags;
	}

	public static void init() {
		iMaxPeriod = -1;
	}

	public static long getMaxPeriod() {
		return iMaxPeriod;
	}
}
