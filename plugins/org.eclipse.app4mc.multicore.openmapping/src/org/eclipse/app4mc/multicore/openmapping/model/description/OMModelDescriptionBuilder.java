/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.model.description;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecCorePrescaler;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecProcessPrototypeFirstLastRunnable;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecProcessPrototypeRunnableActivations;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecProcessPrototypeRunnableCall;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecProcessPrototypeRunnableInstructions;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecTaskPeriodicStimuli;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecTaskRunnableCall;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecTaskRunnableInstructions;
import org.eclipse.app4mc.multicore.openmapping.model.specs.ModelSpecTaskStimuli;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelDescription;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecAmountOperation;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecAmountType;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecModelType;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class OMModelDescriptionBuilder {
	/**
	 * Input Model description of task creation
	 *
	 * @return input model description of task creation
	 */
	public static ModelDescription ofTaskCreationInput(final Amalthea model) {

		// Create the input model checker
		return ModelDescription.builder("Create Task Input")
				// Check for SW model
				.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.SW_MODEL).setSeverity(EntrySeverityLevel.ERROR))
				// Check for Constraints model
				.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.CONSTRAINTS_MODEL)
						.setSeverity(EntrySeverityLevel.ERROR))
				// Check for process prototypes
				.addSpec(ModelSpec.ofAmount(ModelSpecAmountType.PROCESS_PROTOTYPE)
						.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0).setSeverity(EntrySeverityLevel.ERROR))
				// Check for activations
				.addSpec(ModelSpec.ofAmount(ModelSpecAmountType.ACTIVATION)
						.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0).setSeverity(EntrySeverityLevel.ERROR))
				// Check process prototype has at least one runnable
				// calls/runnable
				.addSpec(ModelSpecProcessPrototypeRunnableCall.build().setSeverity(EntrySeverityLevel.ERROR))
				// Check that every process prototype has first/last runnable
				.addSpec(ModelSpecProcessPrototypeFirstLastRunnable.build().setSeverity(EntrySeverityLevel.ERROR))
				// Check that all runnables have instructions
				.addSpec(ModelSpecProcessPrototypeRunnableInstructions.build().setSeverity(EntrySeverityLevel.WARNING))
				// Check that the activations are set and if is periodic should
				// have max or min
				.addSpec(ModelSpecProcessPrototypeRunnableActivations.build().setSeverity(EntrySeverityLevel.WARNING));

	}

	/**
	 * Output Model description of task creation
	 *
	 * @return output model description of task creation
	 */
	public static ModelDescription ofTaskCreationOutput(final Amalthea model) {

		return ModelDescription.builder("Create Task Output")
				// Check for SW model
				.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.SW_MODEL).setSeverity(EntrySeverityLevel.ERROR))
				// Check for Constraints model
				.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.STIMULI_MODEL).setSeverity(EntrySeverityLevel.ERROR))
				// Check for tasks
				.addSpec(ModelSpec.ofAmount(ModelSpecAmountType.TASK)
						.compareWith(ModelSpecAmountOperation.EQUAL, model.getSwModel().getProcessPrototypes().size())
						.setSeverity(EntrySeverityLevel.ERROR));

	}


	/**
	 * Input SW Model description of Mapping
	 *
	 * @return input sw model descrioption of mapping
	 */
	public static ModelDescription ofMappingSWInput(final Amalthea model) {

		return ModelDescription.builder("Mapping SW Input")
				// Check for SW model
				.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.SW_MODEL).setSeverity(EntrySeverityLevel.ERROR))
				// Check for Stimul model
				.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.STIMULI_MODEL).setSeverity(EntrySeverityLevel.ERROR))
				// Check for HW model
				.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.CONSTRAINTS_MODEL)
						.setSeverity(EntrySeverityLevel.ERROR))
				// Check the task
				.addSpec(ModelSpec.ofAmount(ModelSpecAmountType.TASK).compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0)
						.setSeverity(EntrySeverityLevel.ERROR))
				// Check for runnable calls
				.addSpec(ModelSpecTaskRunnableCall.build().setSeverity(EntrySeverityLevel.ERROR))
				// Check that the runnable have instructions
				.addSpec(ModelSpecTaskRunnableInstructions.build().setSeverity(EntrySeverityLevel.WARNING))
				// Check the stimuli
				.addSpec(ModelSpecTaskStimuli.build().setSeverity(EntrySeverityLevel.WARNING))
				// Check the periodic stimuli
				.addSpec(ModelSpecTaskPeriodicStimuli.build().setSeverity(EntrySeverityLevel.ERROR));

	}

	/**
	 * Input HW Model description of Mapping
	 *
	 * @return input hw model descrioption of mapping
	 */
	public static ModelDescription ofMappingHWInput(final Amalthea model) {

		return ModelDescription.builder("Mapping HW Input")
				// Check for HW model
				.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.HW_MODEL).setSeverity(EntrySeverityLevel.ERROR))
				// Check for ECUs
				.addSpec(ModelSpec.ofAmount(ModelSpecAmountType.CORE)
						.compareWith(ModelSpecAmountOperation.GREATER_EQUAL, 1).setSeverity(EntrySeverityLevel.ERROR))
				// Check for ECUs
				.addSpec(ModelSpec.ofAmount(ModelSpecAmountType.CORE)
						.compareWith(ModelSpecAmountOperation.GREATER_EQUAL, 2).setSeverity(EntrySeverityLevel.WARNING))
				// Check for the core's prescaler properties
				.addSpec(ModelSpecCorePrescaler.build().setSeverity(EntrySeverityLevel.ERROR));

	}

}
