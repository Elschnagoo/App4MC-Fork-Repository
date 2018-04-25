/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.specs;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecRunnableInstructions extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecRunnableInstructions build() {
		final ModelSpecRunnableInstructions spec = new ModelSpecRunnableInstructions();
		spec.specType = "Runnables have instructions";
		spec.name = spec.specType;
		return spec;
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
			if (item instanceof ExecutionNeed) {
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

		for (final Runnable run : model.getSwModel().getRunnables()) {
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
	public ModelSpecRunnableInstructions setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
