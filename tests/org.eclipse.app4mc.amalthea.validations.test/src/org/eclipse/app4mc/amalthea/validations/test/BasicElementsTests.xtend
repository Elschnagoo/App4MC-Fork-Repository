/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others..
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

package org.eclipse.app4mc.amalthea.validations.test

import java.util.List
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.validations.EMFProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.junit.Test

import static org.junit.Assert.assertTrue

class BasicElementsTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension SoftwareBuilder b2 = new SoftwareBuilder

	val executor = new ValidationExecutor(EMFProfile)

	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}

	@Test
	def void testCustomPropertyNoDuplicateKey() {
		val model = amalthea [
			customProperties.put("SW", null)
			softwareModel [
				customProperties.put("SW", null)
				label [
					name = "TestLabel"
					customProperties.put("custom1", null)
					customProperties.put("custom2", null)
				]
			]
		]

		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.isEmpty)
	}

	@SuppressWarnings("unchecked")
	@Test
	def void testCustomPropertyDuplicateKey() {
		val model = amalthea [
			customProperties.put("SW", null)
			softwareModel [
				customProperties.put("SW", null)
				label [
					name = "TestLabel"
					customProperties.put("different", null)
					customProperties.put("custom", null)
				]
			]
		]

		val AmaltheaFactory factory = AmaltheaFactory.eINSTANCE
		val label = model.swModel.labels.head

		// use EMF reflection to create a CustomProperty
		val EObject prop = factory.create(AmaltheaPackage.eINSTANCE.getCustomProperty())
		prop.eSet(prop.eClass().getEStructuralFeature("key"), "custom")
		// use EMF reflection to add property with same name
		val EStructuralFeature propFeature = label.eClass().getEStructuralFeature(AmaltheaPackage.LABEL__CUSTOM_PROPERTIES)
		((label.eGet(propFeature) as EList<EObject>)).add(prop)
		
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("The feature 'customProperties' has a map entry at index 2 with a key that collides with that of the map entry at index 1 ( in Label \"TestLabel\" )"))
	}

}
