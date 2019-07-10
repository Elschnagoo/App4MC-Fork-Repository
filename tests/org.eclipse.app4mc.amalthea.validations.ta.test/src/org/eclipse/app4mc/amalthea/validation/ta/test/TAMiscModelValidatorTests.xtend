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
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class TAMiscModelValidatorTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension OperatingSystemBuilder b2 = new OperatingSystemBuilder
	val executor = new ValidationExecutor(TimingArchitectsProfile)
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}
	
	@Test
	def void test_TAMMiscSemaphore() {
		val model = amalthea [
			osModel [
				semaphore [
					name = "s_ok"
					initialValue = 0
					maxValue = 1
				]
				semaphore [
					name = "s_initial"
					initialValue = -1
					maxValue = 1
				]
				semaphore [
					name = "s_max"
					initialValue = 0
					maxValue = 0
				]
				semaphore [
					name = "s_initialmax"
					initialValue = 2
					maxValue = 1
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The initial value must not be negative (-1 < 0, in Semaphore \"s_initial\")"))
		assertTrue(result.contains("The maximum value must be positive (0 <= 0, in Semaphore \"s_max\")"))
		assertTrue(result.contains("The initial value is greater than the maximum value (2 > 1, in Semaphore \"s_initialmax\")"))
		assertFalse(result.contains("The initial value must not be negative (0 < 0, in Semaphore \"s_ok\")"))
		assertFalse(result.contains("The maximum value must be positive (1 <= 0, in Semaphore \"s_ok\")"))
		assertFalse(result.contains("The initial value is greater than the maximum value (0 > 1, in Semaphore \"s_ok\")"))
	}
	
}