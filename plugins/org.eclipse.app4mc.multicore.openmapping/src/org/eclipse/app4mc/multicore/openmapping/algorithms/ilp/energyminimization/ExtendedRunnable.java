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
package org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization;

import java.util.Iterator;

import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;

public class ExtendedRunnable {
	private final Runnable ref;
	private final long numberOfInstructions;

	public ExtendedRunnable(final Runnable ref) {
		this.ref = ref;
		this.numberOfInstructions = calcInstructions();
	}

	private long calcInstructions() {
		// Is the reference set, or do we have a dummy runnable (runtime 0)?
		if (this.ref == null) {
			return 0;
		}

		// Check if runnable contains runnableItems elements
		if (this.ref.getRunnableItems().size() <= 0) {
			UniversalHandler.getInstance()
					.log(" Unexpected SWModel.\nRunnable has an empty RunnableItems list.\nSkipping...", null);
			return 0;
		}

		// Create iterator for RunnableItems and process them until an
		// Instructions element is encountered
		final Iterator<RunnableItem> itRunnableItems = this.ref.getRunnableItems().iterator();
		while (itRunnableItems.hasNext()) {
			final RunnableItem runnableItem = itRunnableItems.next();
// TODO
//			if (runnableItem instanceof RunnableInstructions) {
//				final RunnableInstructions runnableInstructions = (RunnableInstructions) runnableItem;
//				final Instructions abstractInstructions = runnableInstructions.getDefault();
//				if (abstractInstructions == null) {
//					UniversalHandler.getInstance().log(" Unexpected SWModel.\nInstructions are not set!\nSkipping...",
//							null);
//					return 0;
//				} else if (abstractInstructions instanceof InstructionsConstant) {
//					// Constant execution cycles value
//					final InstructionsConstant execCycles = (InstructionsConstant) abstractInstructions;
//					if (execCycles.getValue() <= 0) {
//						UniversalHandler.getInstance()
//								.log(" Unexpected SWModel.\nExecution cycles not set or negative.\nSkipping...", null);
//						return 0;
//					}
//					return execCycles.getValue();
//				} else if (abstractInstructions instanceof InstructionsDeviation) {
//					// Not constant execution cycles value
//					final InstructionsDeviation instructions = (InstructionsDeviation) abstractInstructions;
//					final Deviation<LongObject> deviation;
//					if ((deviation = instructions.getDeviation()) == null) {
//						UniversalHandler.getInstance().log(
//								" Unexpected SWModel.\nDeviation in InstructionsDeviation unset.\nSkipping...", null);
//						return 0;
//					}
//
//					final Long lowerBound = deviation.getLowerBound().getValue();
//					final Long upperBound = deviation.getUpperBound().getValue();
//
//					// Check if lower and upper bound are set correct
//					// Quick solution, might need to be rewritten in the future
//					if (lowerBound <= 0 || upperBound <= 0) {
//						UniversalHandler.getInstance()
//								.log("Unexpected SWModel.\nDeviation not set properly.\nSkipping...", null);
//						return 0;
//					}
//					return ((lowerBound + upperBound) / 2);
//				}
//			} else {
//				// Report the others (Debug info), as we do not handle them
//				UniversalHandler.getInstance().logCon("Debug Info: Skipping " + runnableItem.getClass().toString());
//			}
		}

		UniversalHandler.getInstance().log(" Unexpected SWModel.\nRunnable has no Instructions specified.\nSkipping...",
				null);
		return 0;
	}

	public long getNumberOfInstructions() {
		return this.numberOfInstructions;
	}

	public Runnable getRunnableRef() {
		return this.ref;
	}
}
