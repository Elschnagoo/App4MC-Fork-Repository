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
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;
import org.eclipse.emf.common.util.EList;

public class ModelSpecProcessPrototypeRunnableCall extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecProcessPrototypeRunnableCall build() {
		final ModelSpecProcessPrototypeRunnableCall spec = new ModelSpecProcessPrototypeRunnableCall();
		spec.specType = "Process Prototype has Runnable Calls";
		spec.name = spec.specType;
		return spec;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) {
		boolean cond = true;

		for (final ProcessPrototype procProto : model.getSwModel().getProcessPrototypes()) {
			final EList<RunnableCall> runCall = procProto.getRunnableCalls();


			// Check that it has runnable calls
			if (runCall.size() == 0) {
				log("Process Prototype " + procProto.getName() + " has no runnable calls.");
				cond &= false;
				continue;
			}

			// Verify that the runnable
			for (final RunnableCall call : runCall) {
				if (call.getRunnable() == null) {
					log("Process Prototype " + procProto.getName() + " has a runnable call with pointing to NULL.");
					cond &= false;
					continue;
				}
			}

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
	public ModelSpecProcessPrototypeRunnableCall setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
