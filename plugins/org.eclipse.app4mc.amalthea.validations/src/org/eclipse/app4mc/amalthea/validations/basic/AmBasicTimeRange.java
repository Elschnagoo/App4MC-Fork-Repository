/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.basic;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * Checks the correctness of Time ranges
 * 
 * <ul>
 * <li>Some time ranges has to fulfill the condition >0 or >=0.</li>
 * </ul>
 */

@Validation(id = "AM-Basic-Time-Range")

public class AmBasicTimeRange extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getTime();
	}

	@Override
	public void validate(final EObject object, final List<ValidationDiagnostic> results) {
		if (object instanceof Time) {
			Time time = (Time) object;

			if (time.getValue().signum() > 0)
				return; // always valid
			
			final EStructuralFeature containingFeature = time.eContainingFeature();
			if (containingFeature == null)
				return; // unknown context
			
			//*** the value of the following elements should be > 0
			
			if (time.getValue().signum() <= 0) {
				if (containingFeature == ePackage.getFixedPeriodic_Recurrence()
						
				|| containingFeature == ePackage.getPeriodicActivation_Recurrence()
				
				|| containingFeature == ePackage.getClockFunction_Period()
				|| containingFeature == ePackage.getClockStepList_Period()
				) {
					addIssue(results, time, ePackage.getTime_Value(),
							"Time: " + containingFeature.getName() + " value must be greater than zero" + namedContainerInfo(time));
				}
			}

			//*** the value of the following elements should be >= 0
			
			if (time.getValue().signum() < 0) {
				if (containingFeature == ePackage.getFixedPeriodic_Offset()
						
				|| containingFeature == ePackage.getSingleStimulus_Occurrence()
				
				|| containingFeature == ePackage.getArrivalCurveEntry_LowerTimeBorder()
				|| containingFeature == ePackage.getArrivalCurveEntry_UpperTimeBorder()
				
				|| containingFeature == ePackage.getPeriodicSyntheticStimulus_OccurrenceTimes()
						
				|| containingFeature == ePackage.getPeriodicActivation_Offset()
				|| containingFeature == ePackage.getPeriodicActivation_Min()
				|| containingFeature == ePackage.getPeriodicActivation_Max()
				
				|| containingFeature == ePackage.getSingleActivation_Min()
				|| containingFeature == ePackage.getSingleActivation_Max()

				|| containingFeature == ePackage.getClockFunction_XOffset()
				|| containingFeature == ePackage.getClockStep_Time()
				
				|| containingFeature == ePackage.getDataAgeTime_MinimumTime()
				|| containingFeature == ePackage.getDataAgeTime_MaximumTime()
				
				|| containingFeature == ePackage.getDelayConstraint_Lower()
				|| containingFeature == ePackage.getDelayConstraint_Upper()
				
				|| containingFeature == ePackage.getEventChainLatencyConstraint_Minimum()
				|| containingFeature == ePackage.getEventChainLatencyConstraint_Maximum()
				
				|| containingFeature == ePackage.getRepetitionConstraint_Lower()
				|| containingFeature == ePackage.getRepetitionConstraint_Upper()
				|| containingFeature == ePackage.getRepetitionConstraint_Jitter()
				|| containingFeature == ePackage.getRepetitionConstraint_Period()
				
				|| containingFeature == ePackage.getSynchronizationConstraint_Tolerance()
				) {
					addIssue(results, time, ePackage.getTime_Value(),
							"Time: " + containingFeature.getName() + " value must be positive or zero" + namedContainerInfo(time));
				}
			}

		}
	}

}
