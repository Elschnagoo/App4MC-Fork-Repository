/*******************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.ECU;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.HwSystem;
import org.eclipse.app4mc.amalthea.model.Microcontroller;
import org.eclipse.app4mc.amalthea.model.Prescaler;
import org.eclipse.app4mc.amalthea.model.Quartz;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

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

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Quartz) {
				Quartz quartz = (Quartz) elem;
				Frequency frequency = quartz.getFrequency(); 
				if(null == frequency) {
					this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());
				} else {
					if(false == (0 < frequency.getValue())) {
						this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());	
					}
					if(FrequencyUnit._UNDEFINED_ == frequency.getUnit()) {
						this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());	
					}
				}
			}
		}
	}
	
	
	/*
	 * Checks the parameter instructionsPerCycle of {@link CoreType}. The parameter must not be set to zero or lower.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkCoreTypeInstructionsPerCycle(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof CoreType) {
				CoreType coreType = (CoreType) elem;
				int instructionsPerCycle = coreType.getInstructionsPerCycle(); 
				if(0 >= instructionsPerCycle) {
					this.issueCreator.issue(coreType, AmaltheaPackage.eINSTANCE.getCoreType_InstructionsPerCycle(), instructionsPerCycle);
				}
			}
		}
	}	
	
	/*
	 * Checks the reference to a Quartz of {@link Prescaler}. The reference must be set and reference an existing Quartz.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkQuartzReferenceOfPrescaler(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<Prescaler> prescalers = new HashSet<>();
		final Set<Quartz> quartzes = new HashSet<>();
		
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Prescaler) {
				Prescaler prescaler = (Prescaler) elem;
				prescalers.add(prescaler);
			} else if (elem instanceof HwSystem) {
				HwSystem hwSystem = (HwSystem) elem;
				Collection<Quartz> quartzList = hwSystem.getQuartzes();
				if(null != quartzList) {
					for(Quartz quartz : quartzList) {
						if(null != quartz) {
							quartzes.add(quartz);
						}
					}
				}
			} else if(elem instanceof ECU) {
				ECU ecu = (ECU) elem;
				Collection<Quartz> quartzList = ecu.getQuartzes();
				if(null != quartzList) {
					for(Quartz quartz : quartzList) {
						if(null != quartz) {
							quartzes.add(quartz);
						}
					}
				}
			} else if (elem instanceof Microcontroller) {
				Microcontroller microcontroller = (Microcontroller) elem;
				Collection<Quartz> quartzList = microcontroller.getQuartzes();
				if(null != quartzList) {
					for(Quartz quartz : quartzList) {
						if(null != quartz) {
							quartzes.add(quartz);
						}
					}
				}
			} else if (elem instanceof Core) {
				Core core = (Core) elem;
				Collection<Quartz> quartzList = core.getQuartzes();
				if(null != quartzList) {
					for(Quartz quartz : quartzList) {
						if(null != quartz) {
							quartzes.add(quartz);
						}
					}
				}
			}
		}
		
		for(Prescaler prescaler : prescalers) {
			if(null != prescaler) {
				Quartz quartz = prescaler.getQuartz();
				if((null == quartz) || (false == quartzes.contains(quartz))) { 
					this.issueCreator.issue(prescaler, AmaltheaPackage.eINSTANCE.getPrescaler_Quartz());
				}
			}
		}
	}
}
