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
package org.eclipse.app4mc.amalthea.validations.ta.basic;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks sanity of average of continuous value Weibull estimators distributions
 * 
 * <ul>
 * <li>average must not be less than the lower bound</li>
 * <li>average must not be greater than the upper bound</li>
 * </ul>
 */

@Validation(id = "TA-Basic-ContinuousValueWeibullEstimatorsDistribution-average")
public class TABasicContinuousValueWeibullEstimatorsDistribution extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getContinuousValueWeibullEstimatorsDistribution();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ContinuousValueWeibullEstimatorsDistribution) {
			ContinuousValueWeibullEstimatorsDistribution cvwed = (ContinuousValueWeibullEstimatorsDistribution) eObject;
			INamed namedContainer = AmaltheaServices.getContainerOfType(cvwed, INamed.class);
			double average = cvwed.getAverage();
			if (Double.isFinite(average)) {
				Double lower = cvwed.getLowerBound();
				if (lower != null && !lower.isNaN() && !lower.isInfinite()) {
					if (lower.compareTo(average) > 0) {
						addIssue(results, cvwed, ePackage.getContinuousValueWeibullEstimatorsDistribution_Average(),
								getEClassifier().getName() + ": average is less than the lower bound: (" + average + " < " + lower + ", in " + objectInfo(namedContainer) + ")");
					}
				}
				Double upper = cvwed.getUpperBound();
				if (upper != null && !upper.isNaN() && !upper.isInfinite()) {
					if (upper.compareTo(average) < 0) {
						addIssue(results, cvwed, ePackage.getContinuousValueWeibullEstimatorsDistribution_Average(),
								getEClassifier().getName() + ": average is greater than the upper bound: (" + average + " > " + upper + ", in " + objectInfo(namedContainer) + ")");
					}
				}
			}
		}
	}

}
