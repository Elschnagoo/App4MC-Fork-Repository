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
	public void validate(final EObject object, List<ValidationDiagnostic> results) {
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
				
				|| containingFeature == ePackage.getClockSinusFunction_Period()
				|| containingFeature == ePackage.getClockTriangleFunction_Period()
				
				|| containingFeature == ePackage.getClockMultiplierListEntry_Time()
				) {
					addIssue(results, time, ePackage.getTime_Value(),
							"Time: " + containingFeature.getName() + " value must be greater than zero" + containerInfo(time));
				}
			}

			//*** the value of the following elements should be >= 0
			
			if (time.getValue().signum() < 0) {
				if (containingFeature == ePackage.getFixedPeriodic_Offset()
						
				|| containingFeature == ePackage.getPeriodicActivation_Offset()
				|| containingFeature == ePackage.getPeriodicActivation_Min()
				|| containingFeature == ePackage.getPeriodicActivation_Max()
				
				|| containingFeature == ePackage.getSingleActivation_Min()
				|| containingFeature == ePackage.getSingleActivation_Max()
				) {
					addIssue(results, time, ePackage.getTime_Value(),
							"Time: " + containingFeature.getName() + " value must be positive or zero" + containerInfo(time));
				}
			}

		}
	}

}
