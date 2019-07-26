/**
 * *******************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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
import java.util.stream.Collectors
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder
import org.eclipse.app4mc.amalthea.validations.BasicProfile
import org.eclipse.app4mc.amalthea.validations.EMFProfile
import org.eclipse.app4mc.amalthea.validations.HardwareProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class HardwareModelTests {
	
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension HardwareBuilder b2 = new HardwareBuilder
	val executor = new ValidationExecutor(#[EMFProfile, BasicProfile, HardwareProfile])
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}

	@Test
	def void testECUType_Attributes_NoDuplicateNameAddAttributeTwice() {

	}
	
	@Test
	def void test_TAHardwareFrequencyDomainPositive() {
		val model = amalthea [
			hardwareModel[
				domain_Frequency[
					name = "fd_ok"
					defaultValue = createFrequency(1, FrequencyUnit.MHZ)
				]
				domain_Frequency[
					name = "fd_small"
					defaultValue = createFrequency(0, FrequencyUnit.MHZ)
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Frequency: defaultValue value must be greater than zero ( in Frequency Domain \"fd_small\" )"))
		assertFalse(result.contains("Frequency: defaultValue value must be greater than zero ( in Frequency Domain \"fd_ok\" )"))
	}

}
