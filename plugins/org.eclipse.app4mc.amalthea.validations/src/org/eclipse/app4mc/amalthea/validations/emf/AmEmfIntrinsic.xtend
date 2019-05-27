/**
 * *******************************************************************************
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
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.emf

import java.util.List
import java.util.Map
import org.eclipse.app4mc.amalthea.model.util.AmaltheaValidator
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation
import org.eclipse.app4mc.validation.annotation.Validation
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.emf.common.util.BasicDiagnostic
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage

/** 
 * Checks EMF constraints and generated AMALTHEA invariants
 */
 
@Validation(id="AM-EMF-INTRINSIC")

class AmEmfIntrinsic extends AmaltheaValidation {

	override EClassifier getEClassifier() {
		return EcorePackage.eINSTANCE.getEObject()
	}

	override void validate(EObject eObject, List<ValidationDiagnostic> resultList) {
		if (eObject.eClass().eContainer() === ePackage) {

			var BasicDiagnostic diagnostics = new BasicDiagnostic()
			var Map<Object, Object> context = null

			// call standard EMF validator
			var boolean valid = AmaltheaValidator.INSTANCE.validate(eObject.eClass(), eObject, diagnostics, context)
			
			if (!valid) {
				for (Diagnostic emfDiagnostic : diagnostics.getChildren()) {

					val problematicObject = emfDiagnostic.getData().findFirst[e|e instanceof EObject] as EObject
					val problematicFeature = emfDiagnostic.getData().findFirst[e|e instanceof EStructuralFeature] as EStructuralFeature
					
					val ValidationDiagnostic result = new ValidationDiagnostic(
						emfDiagnostic.getMessage(),
						if(problematicObject !== null) problematicObject else eObject,
						problematicFeature
					)

					result.setSeverityLevel(
						switch (emfDiagnostic.getSeverity()) {
							case Diagnostic.INFO :		Severity.INFO
							case Diagnostic.WARNING :	Severity.WARNING
							case Diagnostic.ERROR :		Severity.ERROR
							default :					Severity.UNDEFINED
						}
					)
					
					resultList.add(result)
				}
			}

		}
	}
	
}
