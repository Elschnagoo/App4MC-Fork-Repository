/*******************************************************************************
 * Copyright (c) 2015, 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.execution.logic.openmapping;

import org.eclipse.app4mc.amalthea.model.ProcessingUnit;

public class OMCore {
	private final ProcessingUnit coreRef;
	private long instructionsPerSecond = -1;

	public OMCore(final ProcessingUnit coreRef) {
		this.coreRef = coreRef;
	}

	public ProcessingUnit getCoreRef() {
		return this.coreRef;
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
	 * @throws MalformedModelException 
	 */
	public long getInstructionsPerSecond() throws MalformedModelException {
		// Return the Value, if it has been initialized before
		if (this.instructionsPerSecond >= 0) {
			return this.instructionsPerSecond;
		}
		
		
		// TODO dummy
		return 1;
		
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
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the refered Prescaler of Core '"
//					+ this.coreRef.getName() + "' contains an invalid value in attribute clockRatio.", null);
//			return -1;
//		}
//
//		// Check the Quartz element and its attribute
//		final Quartz quartz = prescaler.getQuartz();
//		if (quartz == null) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the refered Prescaler of Core '"
//					+ this.coreRef.getName() + "' has an invalid or missing reference to Quartz.", null);
//			return -1;
//		}
//
//		final long frequency = getFrequencyHz();
//		if (frequency <= 0) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the refered Quartz of Core '"
//					+ this.coreRef.getName() + "' contains an invalid value in attribute frequency.", null);
//			return -1;
//		}
//
//		// Check ProcessingUnitDefinition and its attribute
//		final ProcessingUnitDefinition type = this.coreRef.getDefinition();
//		if (type == null) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, Core '" + this.coreRef.getName()
//					+ "' has an invalid or missing reference to its CoreType.", null);
//			return -1;
//		}
//
//		final float instructionsPerCycle = type.getInstructionsPerCycle();
//		if (instructionsPerCycle <= 0) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the refered CoreType of Core '"
//					+ this.coreRef.getName() + "' contains an invalid value in attribute instructionsPerCycle.", null);
//			return -1;
//		}
//
//		// Calculate the instructions per second as the product of frequency, clockRatio and instructionsPerCycle
//		return (this.instructionsPerSecond = (long) (frequency * clockRatio * instructionsPerCycle));
	}
	
	public long getFrequencyHz() throws MalformedModelException{
		
		// TODO dummy
		return 1;
		
//		if(coreRef==null){
//			throw new MalformedModelException(
//					"No core available!");
//		}else if(coreRef.getPrescaler()==null){
//			throw new MalformedModelException(
//					"No prescaler at core: "+ coreRef.getName());
//		}else if(coreRef.getPrescaler().getQuartz()==null){
//			throw new MalformedModelException(
//					"No quartz at prescaler: "+ coreRef.getPrescaler().getName() + 
//					" at core: "+coreRef.getName());
//		}else if (coreRef.getPrescaler().getQuartz().getFrequency()==null){
//			throw new MalformedModelException(
//					"No frequency at quartz: " + coreRef.getPrescaler().getQuartz().getName()+
//					" at prescaler: "+ coreRef.getPrescaler().getName() + 
//					" at core: "+coreRef.getName());
//		}
//		
//		BigDecimal frequencyQuartz = AmaltheaServices.convertToHz(coreRef.getPrescaler().getQuartz().getFrequency());
//		if(frequencyQuartz==null){
//			throw new MalformedModelException(
//					"Malformed frequency at quartz: " + coreRef.getPrescaler().getQuartz()+
//					" at prescaler: "+ coreRef.getPrescaler().getName() + 
//					" at core: "+coreRef.getName());
//		}
//		long frequency = frequencyQuartz.longValue();
//		return frequency;
		
//		final Frequency f = coreRef.getPrescaler().getQuartz().getFrequency();
//		double frequency = f.getValue();
//		switch (f.getUnit()) {
//		case HZ:
//			frequency *= 1;
//			break;
//		case KHZ:
//			frequency*=1000;
//			break;
//		case MHZ:
//			frequency*=1000000;
//			break;
//		case GHZ:
//			frequency*=1000000000L;
//			break;
//		default:
//			break;
//		}
//		return (long)frequency;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof OMCore){
			OMCore c = (OMCore)obj;
			return coreRef.equals(c.getCoreRef());
		}
		return false;
	};

	@Override
	public String toString() {
		return this.coreRef.getUniqueName();
	}
}
