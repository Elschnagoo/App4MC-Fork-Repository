/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.model;

import java.util.Iterator;

import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.InstructionsConstant;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.emf.common.util.EList;

public class OMRunnable {
	private final Runnable runnableRef;
	private long instructions = -1;

	public OMRunnable(final Runnable ref) {
		this.runnableRef = ref;
	}

	public Runnable getRunnableRef() {
		return this.runnableRef;
	}

	public long getInstructionCount() {
		// Is the reference set, or do we have a dummy runnable (runtime 0)?
		if (this.runnableRef == null) {
			return 0;
		}

		// Has the number of instructions already been calculated?
		if (this.instructions >= 0) {
			return this.instructions;
		}

		// Check if list of RunnableItems is empty
		if (this.runnableRef.getRunnableItems().size() <= 0) {
			UniversalHandler.getInstance().log(
					"Invalid Software Model, Runnable '" + this.runnableRef.getName() + "' contains no RunnableItems.",
					null);
			return 0;
		}

		return (this.instructions = parseRunnableItems(this.runnableRef.getRunnableItems()));
	}

	private long parseRunnableItems(final EList<RunnableItem> runnableItemsList) {
		// Process all RunnableItems and search for instructions
		final Iterator<RunnableItem> itRunnableItems = runnableItemsList.iterator();
		while (itRunnableItems.hasNext()) {
			final RunnableItem runnableItem = itRunnableItems.next();

			// Constant number of Instructions
			if (runnableItem instanceof InstructionsConstant) {
				return processInstructionsConstant((InstructionsConstant) runnableItem);
			}
			else if (runnableItem instanceof InstructionsDeviation) {
				return processInstructionsDeviation((InstructionsDeviation) runnableItem);
			}
			else {
				// Report the other/unsupported elements (Debug info)
				UniversalHandler.getInstance().logCon("Debug Info: Skipping " + runnableItem.getClass().toString());
			}
		}

		UniversalHandler.getInstance()
				.log("Invalid Software Model, there has been no number of Instructions specified.", null);
		return 0;
	}

	private long processInstructionsConstant(final InstructionsConstant instructionsConstant) {
		if (instructionsConstant.getValue() <= 0) {
			UniversalHandler.getInstance()
					.log("Invalid Software Model, InstructionsConstant contains an invalid value (<= 0).", null);
			return 0;
		}

		return instructionsConstant.getValue();
	}

	private long processInstructionsDeviation(final InstructionsDeviation instructionsDeviation) {
		final Deviation<LongObject> deviation;
		if ((deviation = instructionsDeviation.getDeviation()) == null) {
			UniversalHandler.getInstance().log(
					"Invalid Software Model, InstructionsDeviation has an invalid or missing containment to its Deviation.",
					null);
			return 0;
		}

		final Long lowerBound = deviation.getLowerBound().getValue();
		final Long upperBound = deviation.getUpperBound().getValue();

		// Check if lower and upper bound are set correct
		// Quick solution, might need to be rewritten in the future
		if (lowerBound <= 0 || upperBound <= 0) {
			UniversalHandler.getInstance().log("Unexpected SWModel.\nDeviation not set properly.\nSkipping...", null);
			return 0;
		}
		return ((lowerBound + upperBound) / 2);
	}
}
