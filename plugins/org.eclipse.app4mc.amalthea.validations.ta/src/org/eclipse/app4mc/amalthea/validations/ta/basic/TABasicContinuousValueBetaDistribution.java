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

import org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks sanity of alpha and beta of continuous value beta distributions
 * 
 * <ul>
 * <li>alpha must be greater than 0.0d</li>
 * <li>beta must be greater than 0.0d</li>
 * </ul>
 */

@Validation(id = "TA-Basic-ContinuousValueBetaDistribution-alphabeta")
public class TABasicContinuousValueBetaDistribution extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getContinuousValueBetaDistribution();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ContinuousValueBetaDistribution) {
			ContinuousValueBetaDistribution dvbd = (ContinuousValueBetaDistribution) eObject;
			double alpha = dvbd.getAlpha();
			if (Double.isFinite(alpha)) {
				if (Double.compare(0.0d, alpha) >= 0) {
					addIssue(results, dvbd, ePackage.getContinuousValueBetaDistribution_Alpha(),
							getEClassifier().getName() + ": alpha must be greater than 0.0d: (" + alpha + " <= 0.0d, in " + objectInfo(dvbd) + " )");
				}
			}
			double beta = dvbd.getBeta();
			if (Double.isFinite(beta)) {
				if (Double.compare(0.0d, beta) >= 0) {
					addIssue(results, dvbd, ePackage.getContinuousValueBetaDistribution_Beta(),
							getEClassifier().getName() + ": beta must be greater than 0.0d: (" + beta + " <= 0.0d, in " + objectInfo(dvbd) + " )");
				}
			}
		}
	}

}
