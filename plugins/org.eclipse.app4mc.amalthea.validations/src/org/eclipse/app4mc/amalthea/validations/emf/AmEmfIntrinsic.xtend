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

import java.util.HashMap
import java.util.List
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
import org.eclipse.app4mc.amalthea.model.INamed
import org.eclipse.app4mc.amalthea.model.util.AmaltheaValidator
import org.eclipse.app4mc.validation.annotation.Validation
import org.eclipse.app4mc.validation.core.IValidation
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.emf.common.util.BasicDiagnostic
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.util.EcoreUtil

/** 
 * Checks EMF constraints and generated AMALTHEA invariants
 */
 
@Validation(id="AM-EMF-INTRINSIC")

class AmEmfIntrinsic implements IValidation {

	val CONTEXT = new HashMap<Object, Object>

	new() {
		CONTEXT.put(SubstitutionLabelProvider, new CustomSubstitutionLabelProvider)
	}

	override getEPackage() {
		AmaltheaPackage.eINSTANCE
	}

	override getEClassifier() {
		EcorePackage.eINSTANCE.EObject
	}

	override validate(EObject eObject, List<ValidationDiagnostic> resultList) {
		if (eObject.eClass().eContainer() === getEPackage()) {

			var BasicDiagnostic diagnostics = new BasicDiagnostic()

			// call standard EMF validator
			var boolean valid = AmaltheaValidator.INSTANCE.validate(eObject.eClass(), eObject, diagnostics, CONTEXT)
			
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


	static class CustomSubstitutionLabelProvider implements SubstitutionLabelProvider {
		
		override getFeatureLabel(EStructuralFeature eStructuralFeature) {
			eStructuralFeature.name
		}
		
		override getObjectLabel(EObject eObject) {
			val s1 = eObject.eClass().getName()
			val s2 = if (eObject instanceof INamed) " " + (eObject as INamed).name else ""
			s1 + s2
		}
		
		override getValueLabel(EDataType eDataType, Object value) {
			EcoreUtil.convertToString(eDataType, value)	// default
		}
	}

}
