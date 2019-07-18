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

package org.eclipse.app4mc.amalthea.validation.ta.test

import java.util.List
import java.util.stream.Collectors
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.HwFeature
import org.eclipse.app4mc.amalthea.model.PuType
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class TAHardwareModelValidatorTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension HardwareBuilder b2 = new HardwareBuilder
	val executor = new ValidationExecutor(TimingArchitectsProfile)
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
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
		assertTrue(result.contains("The frequency must be positive (0.0 MHz <= 0.0d, in Frequency Domain \"fd_small\")"))
		assertFalse(result.contains("The frequency must be positive (1.0 MHz <= 0.0d, in Frequency Domain \"fd_ok\")"))
	}
	
	@Test
	def void test_TAHardwarePUDIPCMissing() {
		val model = amalthea [
			hardwareModel[
				featureCategory [
					name = "Instructions"
					feature [
						name = "IPC_core1"
					]
					feature [
						name = "IPC_core2"
					]
				]
				definition_ProcessingUnit [
					name = "pud_ok"
					puType = PuType.CPU
					features += _find(HwFeature, "IPC_core1")
				]
				definition_ProcessingUnit [
					name = "pud_noIPC"
					puType = PuType.CPU
				]
				definition_ProcessingUnit [
					name = "pud_manyIPC"
					puType = PuType.CPU
					features += _find(HwFeature, "IPC_core1")
					features += _find(HwFeature, "IPC_core2")
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.INFO].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Processing Unit Definition \"pud_manyIPC\" has multiple IPC HwFeatures (only the first will be considered)"))
		assertTrue(result.contains("Processing Unit Definition \"pud_noIPC\" does not have an IPC specified (default value of 1.0 will be assumed). "
				+ "To specify an IPC value: add a HwFeature in the category named \"Instructions\", set a name that starts with \"IPC_\", set a positive "
				+ "value, and add it to the feature list of Processing Unit Definition \"pud_noIPC\"."))
		assertFalse(result.contains("Processing Unit Definition \"pud_ok\" has multiple IPC HwFeatures (only the first will be considered)"))
		assertFalse(result.contains("Processing Unit Definition \"pud_ok\" does not have an IPC specified (default value of 1.0 will be assumed). "
				+ "To specify an IPC value: add a HwFeature in the category named \"Instructions\", set a name that starts with \"IPC_\", set a positive "
				+ "value, and add it to the feature list of Processing Unit Definition \"pud_ok\"."))
	}
	
	@Test
	def void test_TAHardwareHWFIPCPositive() {
		val model = amalthea [
			hardwareModel[
				featureCategory [
					name = "Instructions"
					feature [
						name = "IPC_ok"
						value = 1
					]
					feature [
						name = "IPC_small"
						value = 0
					]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The IPC value must be positive (0.0 <= 0.0d, in Hw Feature \"IPC_small\")"))
		assertFalse(result.contains("The IPC value must be positive (0.0 <= 0.0d, in Hw Feature \"IPC_ok\")"))
	}
	
}