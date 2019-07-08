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

import org.eclipse.app4mc.amalthea.model.SynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates whether the tolerance of a synchronization constraint is sane.
 * 
 * <ul>
 * <li>tolerance must be non negative time</li>
 * </ul>
 */

@Validation(id = "TA-Constraints-SynchronizationToleranceNotNegative")
public class TAConstraintsSynchronizationToleranceNotNegative extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getSynchronizationConstraint();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof SynchronizationConstraint) {
			SynchronizationConstraint sc = (SynchronizationConstraint) eObject;
			Time tolerance = sc.getTolerance();
			if(null != tolerance) {
				BigInteger value = tolerance.getValue();
				TimeUnit unit = tolerance.getUnit();
				if((0 >= value.signum()) || (TimeUnit._UNDEFINED_ == unit)) {
					addIssue(results, sc, ePackage.getSynchronizationConstraint_Tolerance(), "The tolerance time specified in " + objectInfo(sc) +
							" must not be negative.");
				}
			}
		}
	}

}
