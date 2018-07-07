/**
 ********************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;

public class HWModelValidatorImpl extends AbstractValidatorImpl {

	public HWModelValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public HWModelValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks the parameter frequency of {@link Quartz}. The parameter must not be set to zero or lower.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkQuartzFrequency(final Amalthea amalthea) {

// TODO
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof Quartz) {
//				Quartz quartz = (Quartz) elem;
//				Frequency frequency = quartz.getFrequency(); 
//				if(null == frequency) {
//					this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());
//				} else {
//					if(false == (0 < frequency.getValue())) {
//						this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());	
//					}
//					if(FrequencyUnit._UNDEFINED_ == frequency.getUnit()) {
//						this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());	
//					}
//				}
//			}
//		}
	}
	
	
	/*
	 * Checks the parameter instructionsPerCycle of {@link CoreType}. The parameter must not be set to zero or lower.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkCoreTypeInstructionsPerCycle(final Amalthea amalthea) {

// TODO
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof CoreType) {
//				CoreType coreType = (CoreType) elem;
//				float instructionsPerCycle = coreType.getInstructionsPerCycle(); 
//				if(0 >= instructionsPerCycle) {
//					this.issueCreator.issue(coreType, AmaltheaPackage.eINSTANCE.getCoreType_InstructionsPerCycle(), instructionsPerCycle);
//				}
//			}
//		}
	}	
	
	/*
	 * Checks the reference to a Quartz of {@link Prescaler}. The reference must be set and reference an existing Quartz.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkQuartzReferenceOfPrescaler(final Amalthea amalthea) {

// TODO
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//		final Set<Prescaler> prescalers = new HashSet<>();
//		final Set<Quartz> quartzes = new HashSet<>();
//		
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof Prescaler) {
//				Prescaler prescaler = (Prescaler) elem;
//				prescalers.add(prescaler);
//			} else if (elem instanceof HwSystem) {
//				HwSystem hwSystem = (HwSystem) elem;
//				Collection<Quartz> quartzList = hwSystem.getQuartzes();
//				if(null != quartzList) {
//					for(Quartz quartz : quartzList) {
//						if(null != quartz) {
//							quartzes.add(quartz);
//						}
//					}
//				}
//			}
//		}
//		
//		for(Prescaler prescaler : prescalers) {
//			if(null != prescaler) {
//				Quartz quartz = prescaler.getQuartz();
//				if((null == quartz) || (false == quartzes.contains(quartz))) { 
//					this.issueCreator.issue(prescaler, AmaltheaPackage.eINSTANCE.getPrescaler_Quartz());
//				}
//			}
//		}
	}
}
