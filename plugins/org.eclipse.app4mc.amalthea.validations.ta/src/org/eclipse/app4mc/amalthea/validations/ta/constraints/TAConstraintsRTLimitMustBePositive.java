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

import java.math.BigInteger;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates whether a timing requirement limit for time metric RESPONSE_TIME is positive.
 * 
 * <ul>
 * <li>response time must be positive</li>
 * </ul>
 */

@Validation(id = "TA-Constraints-RTLimitMustBePositive")
public class TAConstraintsRTLimitMustBePositive extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getTimeRequirementLimit();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof TimeRequirementLimit) {
			TimeRequirementLimit trl = (TimeRequirementLimit) eObject;
			if (TimeMetric.RESPONSE_TIME == trl.getMetric()) {
				Time rt = trl.getLimitValue();
				if(null != rt) {
					BigInteger value = rt.getValue();
					TimeUnit unit = rt.getUnit();
					if((0 >= value.signum()) || (TimeUnit._UNDEFINED_ == unit)) {
						INamed namedContainer = AmaltheaServices.getContainerOfType(trl, INamed.class);
						addIssue(results, trl, ePackage.getTimeRequirementLimit_LimitValue(), "The response time specified in " + objectInfo(namedContainer) +
								" must be greater than 0.");
					}
				}
			}
		}
	}

}
