/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.model.specs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableInstructions;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecTaskRunnableInstructions extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecTaskRunnableInstructions build() {
		final ModelSpecTaskRunnableInstructions spec = new ModelSpecTaskRunnableInstructions();
		spec.specType = "Tasks' Runnables have instructions";
		spec.name = spec.specType;
		return spec;
	}

	/**
	 * Find call sequence
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
	 * Get all referenced runnables within the tasks
	 *
	 * @param model
	 *            model
	 * @return list of all referenced runnables
	 */
	private List<Runnable> getRunnables(final Amalthea model) {
		final List<Runnable> list = new ArrayList<Runnable>();
		for (final Task task : model.getSwModel().getTasks()) {
			for (final CallSequenceItem csi : findCallSequence(task.getCallGraph()).getCalls()) {
				if (csi instanceof TaskRunnableCall) {
					list.add(((TaskRunnableCall) csi).getRunnable());
				}
			}
		}

		return list;
	}

	/**
	 * Check if a runnable has a runnable.
	 *
	 * @param run
	 *            runnable
	 * @return true if the runnable has instructions false otherwise
	 */
	private boolean checkInstruction(final Runnable run) {
		boolean found = false;
		for (final RunnableItem item : run.getRunnableItems()) {
			if (item instanceof RunnableInstructions) {
				found = true;
				break;
			}
		}

		if (!found) {
			log("Runnable " + run.getName() + " doesn't have instructions set.");
			return false;
		}

		return true;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) {
		boolean cond = true;

		for (final Runnable run : getRunnables(model)) {
			cond &= checkInstruction(run);
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
	public ModelSpecTaskRunnableInstructions setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
