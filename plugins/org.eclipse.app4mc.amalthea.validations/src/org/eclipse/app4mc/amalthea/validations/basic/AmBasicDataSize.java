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
package org.eclipse.app4mc.amalthea.validations.basic;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Checks the correctness of data sizes
 * 
 * <ul>
 * <li>Some data sizes have to fulfill the condition >0 or >=0.</li>
 * </ul>
 */

@Validation(id = "AM-Basic-Data-Size")
public class AmBasicDataSize extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getDataSize();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof DataSize) {
			final DataSize ds = (DataSize) eObject;
			// value is unset or positive data sizes are always correct
			if (ds.getValue() == null || ds.getValue().signum() > 0) {
				return;
			}
			final EStructuralFeature containingFeature = ds.eContainingFeature();
			// data size has no context
			if (containingFeature == null) {
				return;
			}
			
			// check for features where data size has to be positive (>0)
			if (containingFeature == ePackage.getAbstractMemoryElement_Size()) {
				addIssue(results, ds, ePackage.getDataSize_Value(),
						"DataSize: " + containingFeature.getName() + " value must be greater than zero" + namedContainerInfo(ds));
			}
		}
	}

}
