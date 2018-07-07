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

package org.eclipse.app4mc.multicore.openmapping.model.specs;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecTaskRunnableCall extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecTaskRunnableCall build() {
		final ModelSpecTaskRunnableCall spec = new ModelSpecTaskRunnableCall();
		spec.specType = "Task has Runnable Calls";
		spec.name = spec.specType;
		return spec;
	}

	/**
	 * Find the call sequence
	 *
	 * @param cg
	 *            call graph
	 * @return call sequence
	 */
	private CallSequence findCallSequence(final CallGraph cg) {
		for (final GraphEntryBase ge : cg.getGraphEntries()) {
			if (ge instanceof CallSequence) {
				return (CallSequence) ge;
			}
		}

		return null;
	}

	/**
	 * Check the CallSequence references to runnables
	 *
	 * @param task
	 *            task
	 * @param cs
	 *            call sequence
	 * @return false if an error was encountered.
	 */
	private boolean checkRunnableCalls(final Task task, final CallSequence cs) {
		boolean cond = true;
		int amountTask = 0;
		for (final CallSequenceItem csi : cs.getCalls()) {
			if (!(csi instanceof TaskRunnableCall)) {
				continue;
			}

			final TaskRunnableCall trc = (TaskRunnableCall) csi;

			if (trc.getRunnable() == null) {
				log("Task " + task.getName() + " has a call without a valid Runnable reference.");
				cond &= false;
				continue;
			}

			amountTask++;

		}

		if (amountTask == 0) {
			log("Task " + task.getName() + " has a Call Sequence without any Calls set.");
			cond &= false;
		}

		return cond;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) {
		boolean cond = true;

		for (final Task task : model.getSwModel().getTasks()) {
			final CallGraph cg = task.getCallGraph();

			// Check that it has a CallGraph
			if (cg == null) {
				log("Task " + task.getName() + " doesn't have a CallGraph set.");
				cond &= false;
				continue;
			}

			final CallSequence cs = findCallSequence(cg);

			// Check that it has runnable calls
			if (cs == null) {
				log("Task " + task.getName() + " doesn't have a Call Sequence set.");
				cond &= false;
				continue;
			}

			if (cs.getCalls().size() == 0) {
				log("Task " + task.getName() + " has a Call Sequence without any Calls set.");
				cond &= false;
				continue;
			}

			// Check the runnable
			cond &= checkRunnableCalls(task, cs);


		}

		return cond;

	}

	/**
	 * Set the logging severity
	 *
	 * @param severity
	 *            logging severity
	 * @return the same spec object
	 */
	public ModelSpecTaskRunnableCall setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
