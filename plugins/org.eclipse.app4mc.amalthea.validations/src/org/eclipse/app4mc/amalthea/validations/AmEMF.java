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

package org.eclipse.app4mc.amalthea.validations;

import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.util.AmaltheaValidator;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;


/**
 * Checks EMF constraints and generated AMALTHEA invariants
 * 
 * <ul>
 * <li>Unit has to be set (_undefined_ is an error)</li>
 * </ul>
 */

@Validation(id = "AM-EMF")

public class AmEMF extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return EcorePackage.eINSTANCE.getEObject();
	}

	@Override
	public void validate(final EObject eObject, List<Result> results) {
		if (eObject.eClass().eContainer() == ePackage) {
			BasicDiagnostic diagnostics = new BasicDiagnostic();
			Map<Object, Object> context = null;
			boolean valid = AmaltheaValidator.INSTANCE.validate(eObject.eClass(), eObject, diagnostics, context);
			
			if (!valid) {
				for (Diagnostic emfDiagnostic : diagnostics.getChildren()) {
					
					Result result = new Result(emfDiagnostic.getMessage(), eObject);
					
					switch (emfDiagnostic.getSeverity()) {
					case Diagnostic.INFO:
						result.setSeverityLevel(Severity.INFO);
						break;
					case Diagnostic.WARNING:
						result.setSeverityLevel(Severity.WARNING);
						break;
					case Diagnostic.ERROR:
						result.setSeverityLevel(Severity.ERROR);
						break;
					}
					results.add(result);
				}
			}

		}
	}

}
