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

import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_MULTIPLIER_LIST_ENTRY;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_MULTIPLIER_LIST_ENTRY__TIME;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_SINUS_FUNCTION;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION__MAX;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION__MIN;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_STIMULUS;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_STIMULUS__OFFSET;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.SINGLE_ACTIVATION;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.SINGLE_ACTIVATION__MAX;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.SINGLE_ACTIVATION__MIN;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.emf.ecore.EClass;
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
	public void validate(final EObject object, List<Result> results) {
		if (object instanceof Time) {
			Time time = (Time) object;

			if (time.getValue().signum() > 0)
				return; // always valid

			final EStructuralFeature eFeature = time.eContainingFeature();
			if (eFeature == null)
				return;

			final EClass eClass = eFeature.getEContainingClass();
			if (eClass == null)
				return;
			
			final int classID = eClass.getClassifierID();
			final int featureID = eFeature.getFeatureID();
			
			//*** the value of the following elements should be > 0
			
			if (time.getValue().signum() <= 0) {
				if ((classID == PERIODIC_STIMULUS && featureID == PERIODIC_STIMULUS__RECURRENCE)
				||	(classID == PERIODIC_ACTIVATION && featureID == PERIODIC_ACTIVATION__RECURRENCE)
				||	(classID == CLOCK_SINUS_FUNCTION && featureID == CLOCK_SINUS_FUNCTION__PERIOD)
				||	(classID == CLOCK_TRIANGLE_FUNCTION && featureID == CLOCK_TRIANGLE_FUNCTION__PERIOD)
				||	(classID == CLOCK_MULTIPLIER_LIST_ENTRY && featureID == CLOCK_MULTIPLIER_LIST_ENTRY__TIME)
				) {
					// AmaltheaPackage.eINSTANCE.getTime_Value()
					addIssue(results, time,
							"Time: " + eFeature.getName() + " value must be greater than zero" + containerInfo(time));
				}
			} 

			//*** the value of the following elements should be >= 0
			
			if (time.getValue().signum() < 0) {
				if ((classID == PERIODIC_ACTIVATION && featureID == PERIODIC_ACTIVATION__OFFSET)
				||	(classID == PERIODIC_ACTIVATION && featureID == PERIODIC_ACTIVATION__MIN)
				||	(classID == PERIODIC_ACTIVATION && featureID == PERIODIC_ACTIVATION__MAX)
				||	(classID == SINGLE_ACTIVATION && featureID == SINGLE_ACTIVATION__MIN)
				||	(classID == SINGLE_ACTIVATION && featureID == SINGLE_ACTIVATION__MAX)
				||	(classID == PERIODIC_STIMULUS && featureID == PERIODIC_STIMULUS__OFFSET)
				) {

					// AmaltheaPackage.eINSTANCE.getTime_Value()
					addIssue(results, time,
							"Time: " + eFeature.getName() + " value must be positive or zero" + containerInfo(time));
				}
			}

		}
	}

}
