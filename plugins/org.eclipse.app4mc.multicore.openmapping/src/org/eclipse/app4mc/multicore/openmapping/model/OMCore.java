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
package org.eclipse.app4mc.multicore.openmapping.model;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.Prescaler;
import org.eclipse.app4mc.amalthea.model.Quartz;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;

public class OMCore {
	private final Core coreRef;
	private long instructionsPerSecond = -1;
	private ArrayList<OMAnnotationElement> referrableAnnotationElements = new ArrayList<OMAnnotationElement>();

	public OMCore(final Core coreRef) {
		this.coreRef = coreRef;
		// Prepare element, copy attributes from CoreType
		this.referrableAnnotationElements = addAnnotatableElements();
	}
	
	private ArrayList<OMAnnotationElement> addAnnotatableElements() {
		ArrayList<OMAnnotationElement> out = new ArrayList<OMAnnotationElement>();
		// Add all Tags from the coreRef, which we assume is set
		if(this.coreRef.getTags().size() > 0) {
			this.coreRef.getTags().stream().forEach(tag -> out.add(new OMTag(tag)));
		}
		
		if(null != coreRef.getCoreType()) {
			// Add all Tags from the CoreType
			if(this.coreRef.getCoreType().getTags().size() > 0) {
				this.coreRef.getCoreType().getTags().stream().forEach(tag -> out.add(new OMTag(tag)));
			}
			// Add all Core Classifiers from the CoreType
			if(this.coreRef.getCoreType().getClassifiers().size() > 0) {
				this.coreRef.getCoreType().getClassifiers().stream().forEach(coreClassifier -> out.add(new OMCoreClassifier(coreClassifier)));
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
		// Calculate the Value otherwise
		// Check the core's Prescaler element and its attribute
		final Prescaler prescaler = this.coreRef.getPrescaler();
		if (prescaler == null) {
			UniversalHandler.getInstance().log("Invalid Hardware Model, Core '" + this.coreRef.getName()
					+ "' has an invalid or missing reference to its Prescaler.", null);
			return -1;
		}

		final double clockRatio = prescaler.getClockRatio();
		if (clockRatio <= 0) {
			UniversalHandler.getInstance().log("Invalid Hardware Model, the referred Prescaler of Core '"
					+ this.coreRef.getName() + "' contains an invalid value in attribute clockRatio.", null);
			return -1;
		}

		// Check the Quartz element and its attribute
		final Quartz quartz = prescaler.getQuartz();
		if (quartz == null) {
			UniversalHandler.getInstance().log("Invalid Hardware Model, the referred Prescaler of Core '"
					+ this.coreRef.getName() + "' has an invalid or missing reference to Quartz.", null);
			return -1;
		}
		BigDecimal frequencyQuartz = AmaltheaServices.convertToHz(quartz.getFrequency());
		long frequency = frequencyQuartz.longValue();
		
		if (frequency <= 0) {
			UniversalHandler.getInstance().log("Invalid Hardware Model, the referred Quartz of Core '"
					+ this.coreRef.getName() + "' contains an invalid value in attribute frequency.", null);
			return -1;
		}

		// Check CoreType and its attribute
		final CoreType type = this.coreRef.getCoreType();
		if (type == null) {
			UniversalHandler.getInstance().log("Invalid Hardware Model, Core '" + this.coreRef.getName()
					+ "' has an invalid or missing reference to its CoreType.", null);
			return -1;
		}

		final float instructionsPerCycle = type.getInstructionsPerCycle();
		if (instructionsPerCycle <= 0) {
			UniversalHandler.getInstance().log("Invalid Hardware Model, the referred CoreType of Core '"
					+ this.coreRef.getName() + "' contains an invalid value in attribute instructionsPerCycle.", null);
			return -1;
		}

		// Calculate the instructions per second as the product of frequency, clockRatio and instructionsPerCycle
		return (this.instructionsPerSecond = (long) (frequency * clockRatio * instructionsPerCycle));
	}
	
	public Core getCoreRef() {
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
