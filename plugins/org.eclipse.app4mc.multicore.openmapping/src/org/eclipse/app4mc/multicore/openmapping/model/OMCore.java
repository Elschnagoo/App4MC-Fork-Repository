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

import org.eclipse.app4mc.amalthea.model.ProcessingUnit;

public class OMCore {
	private final ProcessingUnit coreRef;
	private long instructionsPerSecond = -1;
	private ArrayList<OMAnnotationElement> referrableAnnotationElements = new ArrayList<OMAnnotationElement>();

	public OMCore(final ProcessingUnit coreRef) {
		this.coreRef = coreRef;
		// Prepare element, copy attributes from ProcessingUnitDefinition
		this.referrableAnnotationElements = addAnnotatableElements();
	}
	
	private ArrayList<OMAnnotationElement> addAnnotatableElements() {
		ArrayList<OMAnnotationElement> out = new ArrayList<OMAnnotationElement>();
		// Add all Tags from the coreRef, which we assume is set
		if(this.coreRef.getTags().size() > 0) {
			this.coreRef.getTags().stream().forEach(tag -> out.add(new OMTag(tag)));
		}
		
		if(null != coreRef.getDefinition()) {
			// Add all Tags from the ProcessingUnitDefinition
			if(this.coreRef.getDefinition().getTags().size() > 0) {
				this.coreRef.getDefinition().getTags().stream().forEach(tag -> out.add(new OMTag(tag)));
			}
			// Add all Core Classifiers from the ProcessingUnitDefinition
			if(this.coreRef.getDefinition().getClassifiers().size() > 0) {
				this.coreRef.getDefinition().getClassifiers().stream().forEach(coreClassifier -> out.add(new OMCoreClassifier(coreClassifier)));
			}
		}	
		
		return out;
	}

	/**
	 * Calculates and/or returns the number of Instructions Per Second (IPS) the core is capable of precessing. * The
	 * number of executed IPS depends on the following attributes:
	 *
	 * instructionsPerCycle (CoreType), clockRatio (Prescaler), and frequency (Quartz)
	 *
	 * The formula used for calculating this attribute is: frequency * clockRatio * instructionsPerCycle
	 *
	 * @return The number of Instructions executed per Second.
	 */
	public long getInstructionsPerSecond() {
		// Return the Value, if it has been initialized before
		if (this.instructionsPerSecond >= 0) {
			return this.instructionsPerSecond;
		}
		
// TODO implement
		
//		// Calculate the Value otherwise
//		// Check the core's Prescaler element and its attribute
//		final Prescaler prescaler = this.coreRef.getPrescaler();
//		if (prescaler == null) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, Core '" + this.coreRef.getName()
//					+ "' has an invalid or missing reference to its Prescaler.", null);
//			return -1;
//		}
//
//		final double clockRatio = prescaler.getClockRatio();
//		if (clockRatio <= 0) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the referred Prescaler of Core '"
//					+ this.coreRef.getName() + "' contains an invalid value in attribute clockRatio.", null);
//			return -1;
//		}
//
//		// Check the Quartz element and its attribute
//		final Quartz quartz = prescaler.getQuartz();
//		if (quartz == null) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the referred Prescaler of Core '"
//					+ this.coreRef.getName() + "' has an invalid or missing reference to Quartz.", null);
//			return -1;
//		}
//		BigDecimal frequencyQuartz = AmaltheaServices.convertToHz(quartz.getFrequency());
//		long frequency = frequencyQuartz.longValue();
//		
//		if (frequency <= 0) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the referred Quartz of Core '"
//					+ this.coreRef.getName() + "' contains an invalid value in attribute frequency.", null);
//			return -1;
//		}
//
//		// Check ProcessingUnitDefinition and its attribute
//		final ProcessingUnitDefinition type = this.coreRef.getDefinition();
//		if (type == null) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, Core '" + this.coreRef.getName()
//					+ "' has an invalid or missing reference to its ProcessingUnitDefinition.", null);
//			return -1;
//		}
//
//		final float instructionsPerCycle = 1; // TODO dummy for: type.getInstructionsPerCycle();
//		if (instructionsPerCycle <= 0) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the referred ProcessingUnitDefinition of Core '"
//					+ this.coreRef.getName() + "' contains an invalid value in attribute instructionsPerCycle.", null);
//			return -1;
//		}
//
//		// Calculate the instructions per second as the product of frequency, clockRatio and instructionsPerCycle
//		return (this.instructionsPerSecond = (long) (frequency * clockRatio * instructionsPerCycle));
		
		return 1; // TODO dummy	
	}
	
	public ProcessingUnit getCoreRef() {
		return this.coreRef;
	}
	
	public ArrayList<OMAnnotationElement> getAnnotationElement() {
		return this.referrableAnnotationElements;
	}

	@Override
	public String toString() {
		return this.coreRef.getUniqueName();
	}
}
