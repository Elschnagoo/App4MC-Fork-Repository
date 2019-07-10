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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.Runnable;
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
	private Group findGroup(final CallGraph cg) {
		for (final CallGraphItem ge : cg.getItems()) {
			if (ge instanceof Group) {
				return (Group) ge;
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
//		for (final Task task : model.getSwModel().getTasks()) {
//			for (final CallSequenceItem csi : findGroup(task.getCallGraph()).getCalls()) {
//				if (csi instanceof TaskRunnableCall) {
//					list.add(((TaskRunnableCall) csi).getRunnable());
//				}
//			}
//		}

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
//		boolean found = false;
//		for (final RunnableItem item : run.getRunnableItems()) {
//			if (item instanceof ExecutionNeed) {
//				found = true;
//				break;
//			}
//		}
//
//		if (!found) {
//			log("Runnable " + run.getName() + " doesn't have instructions set.");
//			return false;
//		}

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
