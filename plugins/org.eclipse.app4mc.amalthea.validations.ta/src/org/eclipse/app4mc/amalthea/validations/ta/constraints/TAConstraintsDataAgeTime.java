/**
 ********************************************************************************
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.amalthea.validations.ta.constraints;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates min and max times of data age time.
 * 
 * <ul>
 * <li>maximum time must not be smaller than minimum time</li>
 * </ul>
 */

@Validation(id = "TA-Constraints-DataAgeTime")
public class TAConstraintsDataAgeTime extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getDataAgeTime();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof DataAgeTime) {
			DataAgeTime dat = (DataAgeTime) eObject;
			INamed namedContainer = AmaltheaServices.getContainerOfType(dat, INamed.class);
			Time minimum = dat.getMinimumTime();
			Time maximum = dat.getMaximumTime();
			if (maximum != null && minimum != null && minimum.compareTo(maximum) > 0) {
				addIssue(results, dat, ePackage.getDataAgeTime_MinimumTime(), "The minimum time is greater than the maximum time (" + minimum + " > " + maximum + ", in "+ objectInfo(namedContainer) + ")");
			}
		}
	}

}
