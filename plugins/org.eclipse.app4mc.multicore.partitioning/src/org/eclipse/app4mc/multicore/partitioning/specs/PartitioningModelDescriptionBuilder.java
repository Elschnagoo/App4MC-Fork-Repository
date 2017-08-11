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
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelDescription;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecAmountOperation;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecAmountType;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecModelType;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.ModelSpecLogger;

public class PartitioningModelDescriptionBuilder {
	/**
	 * Input Model description of task creation
	 *
	 * @return input model descrioption of task creation
	 */
	public static ModelDescription ofInput(final ModelSpecLogger logger, final Amalthea model) {

		// Create the input model checker
		return addInputModelSpecs(ModelDescription.builder(logger, "Partitioning Input"));
	}

	/**
	 * Input Model description of task creation
	 *
	 * @return input model descrioption of task creation
	 */
	public static ModelDescription ofInput(final Amalthea model) {

		// Create the input model checker
		return addInputModelSpecs(ModelDescription.builder("Partitioning Input"));
	}

	/**
	 * Add all the model specs for the input model
	 *
	 * @param desc
	 *            model desciptions to which the spec are going to be added
	 * @return model description with all specs added
	 */
	private static ModelDescription addInputModelSpecs(final ModelDescription desc) {

		// Check for SW model
		desc.addSpec(ModelSpec.ofHasModel(ModelSpecModelType.SW_MODEL).setSeverity(EntrySeverityLevel.ERROR))
				// Check for runnables
				.addSpec(ModelSpec.ofAmount(ModelSpecAmountType.RUNNABLE)
						.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0).setSeverity(EntrySeverityLevel.ERROR))
				// Check for activations
				.addSpec(ModelSpec.ofAmount(ModelSpecAmountType.ACTIVATION)
						.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0).setSeverity(EntrySeverityLevel.WARNING))
				// Check for Runnables' instructions
				.addSpec(ModelSpecRunnableInstructions.build().setSeverity(EntrySeverityLevel.ERROR))
				// Check for Runnables' activations
				.addSpec(ModelSpecRunnableActivation.build().setSeverity(EntrySeverityLevel.WARNING))
				// Check for Runnables' periodic activations
				.addSpec(ModelSpecRunnablePeriodicActivation.build().setSeverity(EntrySeverityLevel.WARNING));

		return desc;

	}

}
