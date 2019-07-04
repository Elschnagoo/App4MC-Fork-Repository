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

import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks sanity of average of discrete value Weibull estimators distributions
 * 
 * <ul>
 * <li>average must not be less than the lower bound</li>
 * <li>average must not be greater than the upper bound</li>
 * </ul>
 */

@Validation(id = "TA-Basic-DiscreteValueWeibullEstimatorsDistribution-average")
public class TABasicDiscreteValueWeibullEstimatorsDistribution extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getDiscreteValueWeibullEstimatorsDistribution();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof DiscreteValueWeibullEstimatorsDistribution) {
			DiscreteValueWeibullEstimatorsDistribution dvwed = (DiscreteValueWeibullEstimatorsDistribution) eObject;
			double average = dvwed.getAverage();
			if (Double.isFinite(average)) {
				Long lower = dvwed.getLowerBound();
				if (lower != null) {
					if (Double.compare(lower, average) > 0) {
						addIssue(results, dvwed, ePackage.getDiscreteValueWeibullEstimatorsDistribution_Average(),
								getEClassifier().getName() + ": average is less than the lower bound: (" + average + " < " + lower + ", in " + objectInfo(dvwed) + " )");
					}
				}
				Long upper = dvwed.getUpperBound();
				if (upper != null) {
					if (Double.compare(upper, average) < 0) {
						addIssue(results, dvwed, ePackage.getDiscreteValueWeibullEstimatorsDistribution_Average(),
								getEClassifier().getName() + ": average is greater than the upper bound: (" + average + " > " + upper + ", in " + objectInfo(dvwed) + " )");
					}
				}
			}
		}
	}

}
