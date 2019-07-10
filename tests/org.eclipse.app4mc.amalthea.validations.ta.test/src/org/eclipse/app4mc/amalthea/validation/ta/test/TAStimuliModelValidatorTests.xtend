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

import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile
import java.util.List
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.junit.Test
import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue
import org.eclipse.app4mc.validation.core.Severity
import java.util.stream.Collectors
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder
import org.eclipse.app4mc.amalthea.model.Scenario
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction
import org.eclipse.app4mc.amalthea.model.ClockMultiplierList
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus

class TAStimuliModelValidatorTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension StimuliBuilder b2 = new StimuliBuilder
	val executor = new ValidationExecutor(TimingArchitectsProfile)
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}
	
	def Scenario createScenario(Time recurrence) {
		val ret = AmaltheaFactory.eINSTANCE.createScenario
		ret.recurrence = recurrence
		ret
	}
	
	def ClockTriangleFunction createCTF(String name, double min, double max) {
		val ret = AmaltheaFactory.eINSTANCE.createClockTriangleFunction
		ret.name = name
		ret.min = min
		ret.max = max
		ret
	}
	
	def ClockSinusFunction createCSF(String name, double amplitude, double yOffset) {
		val ret = AmaltheaFactory.eINSTANCE.createClockSinusFunction
		ret.name = name
		ret.amplitude = amplitude
		ret.YOffset = yOffset
		ret
	}
	
	def ClockMultiplierList createCML(String name, double...multipliers) {
		val ret = AmaltheaFactory.eINSTANCE.createClockMultiplierList
		ret.name = name
		for(double multiplier:multipliers) {
			val entry = AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry
			entry.multiplier = multiplier
			ret.entries += entry
		}
		ret
	}
	
	def PeriodicSyntheticStimulus createPSS(String name, String unit, long...occurrenceTimes) {
		val ret = AmaltheaFactory.eINSTANCE.createPeriodicSyntheticStimulus
		ret.name = name
		for(long occurrence:occurrenceTimes) {
			val occurrenceTime = createTime(occurrence, unit)
			ret.occurrenceTimes += occurrenceTime
		}
		ret
	}
	
	def ArrivalCurveStimulus createACS(String name, String unit, long...entryPairs) {
		val ret = AmaltheaFactory.eINSTANCE.createArrivalCurveStimulus
		ret.name = name
		for(var i = 0; i < entryPairs.length; i += 2) {
			val entry = AmaltheaFactory.eINSTANCE.createArrivalCurveEntry
			entry.lowerTimeBorder = createTime(entryPairs.get(i), unit)
			if (i + 1 < entryPairs.length) {
				entry.upperTimeBorder = createTime(entryPairs.get(i + 1), unit)
			}
			ret.entries += entry
		}
		ret
	}
	
	@Test
	def void test_TAStimuliArrivalCurveStimulus() {
		val model = amalthea [
			stimuliModel [
				stimuli += createACS("acs_ok", "ms", 0, 1, 2, 5)
				stimuli += createACS("acs_small", "ms", -1, 0, 1, 100)
				stimuli += createACS("acs_big", "ms", 0, -1, 1, -100)
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The lower time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_small\" must not be negative."))
		assertFalse(result.contains("The upper time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_small\" must not be negative."))
		assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_small\" must not be negative."))
		assertFalse(result.contains("The upper time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_small\" must not be negative."))
		assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_big\" must not be negative."))
		assertTrue(result.contains("The upper time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_big\" must not be negative."))
		assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_big\" must not be negative."))
		assertTrue(result.contains("The upper time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_big\" must not be negative."))
		assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_ok\" must not be negative."))
		assertFalse(result.contains("The upper time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_ok\" must not be negative."))
		assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_ok\" must not be negative."))
		assertFalse(result.contains("The upper time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_ok\" must not be negative."))
	}
	
	@Test
	def void test_TAStimuliClockMultiplierList() {
		val model = amalthea [
			stimuliModel [
				clocks += createCML("cml_ok", 0, 1)
				clocks += createCML("cml_small", -1, 0, 1, -100)
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 0 of Clock Multiplier List \"cml_small\" must not be negative."))
		assertFalse(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 1 of Clock Multiplier List \"cml_small\" must not be negative."))
		assertFalse(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 2 of Clock Multiplier List \"cml_small\" must not be negative."))
		assertTrue(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 3 of Clock Multiplier List \"cml_small\" must not be negative."))
		assertFalse(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 0 of Clock Multiplier List \"cml_ok\" must not be negative."))
		assertFalse(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 1 of Clock Multiplier List \"cml_ok\" must not be negative."))
	}
	
	@Test
	def void test_TAStimuliClockSinusFunction() {
		val model = amalthea [
			stimuliModel [
				clocks += createCSF("csf_ok", 4, 10)
				clocks += createCSF("csf_amplitude", -1, 10)
				clocks += createCSF("csf_yOffset", 0, 0)
				clocks += createCSF("csf_yOffsetamplitude", -2, 0)
				clocks += createCSF("csf_yOffsetiamplitude", 1, 0)
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The amplitude must not be negative (-1.0 < 0.0d, in Clock Sinus Function \"csf_amplitude\")"))
		assertTrue(result.contains("The yOffset must be positive (0.0 <= 0.0d, in Clock Sinus Function \"csf_yOffset\")"))
		assertTrue(result.contains("The amplitude must not be negative (-2.0 < 0.0d, in Clock Sinus Function \"csf_yOffsetamplitude\")"))
		assertTrue(result.contains("The yOffset must be positive (0.0 <= 0.0d, in Clock Sinus Function \"csf_yOffsetamplitude\")"))
		assertTrue(result.contains("The yOffset must be positive (0.0 <= 0.0d, in Clock Sinus Function \"csf_yOffsetiamplitude\")"))
		assertTrue(result.contains("The amplitude is greater than the yOffset (1.0 > 0.0, in Clock Sinus Function \"csf_yOffsetiamplitude\")"))
		assertFalse(result.contains("The amplitude must not be negative (4.0 < 0.0d, in Clock Sinus Function \"csf_ok\")"))
		assertFalse(result.contains("The yOffset must be positive (10.0 <= 0.0, in Clock Sinus Function \"csf_ok\")"))
		assertFalse(result.contains("The amplitude is greater than the yOffset (4.0 > 10.0, in Clock Sinus Function \"csf_ok\")"))
	}
	
	@Test
	def void test_TAStimuliClockTriangleFunction() {
		val model = amalthea [
			stimuliModel [
				clocks += createCTF("ctf_ok", 4, 10)
				clocks += createCTF("ctf_min", -1, 10)
				clocks += createCTF("ctf_max", 0, 0)
				clocks += createCTF("ctf_maxmin", -2, 0)
				clocks += createCTF("ctf_maximin", 1, 0)
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The min must not be negative (-1.0 < 0.0d, in Clock Triangle Function \"ctf_min\")"))
		assertTrue(result.contains("The max must be positive (0.0 <= 0.0d, in Clock Triangle Function \"ctf_max\")"))
		assertTrue(result.contains("The min must not be negative (-2.0 < 0.0d, in Clock Triangle Function \"ctf_maxmin\")"))
		assertTrue(result.contains("The max must be positive (0.0 <= 0.0d, in Clock Triangle Function \"ctf_maxmin\")"))
		assertTrue(result.contains("The max must be positive (0.0 <= 0.0d, in Clock Triangle Function \"ctf_maximin\")"))
		assertTrue(result.contains("The min is greater than the max (1.0 > 0.0, in Clock Triangle Function \"ctf_maximin\")"))
		assertFalse(result.contains("The min must not be negative (4.0 < 0.0d, in Clock Triangle Function \"ctf_ok\")"))
		assertFalse(result.contains("The max must be positive (10.0 <= 0.0, in Clock Triangle Function \"ctf_ok\")"))
		assertFalse(result.contains("The min is greater than the max (4.0 > 10.0, in Clock Triangle Function \"ctf_ok\")"))
	}
	
	@Test
	def void test_TAStimuliPeriodicSyntheticStimulus() {
		val model = amalthea [
			stimuliModel [
				stimuli += createPSS("pss_ok", "ms", 0, 1)
				stimuli += createPSS("pss_small", "ms", -1, 0, 1, -100)
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The occurrence time specified at index 0 of Periodic Synthetic Stimulus \"pss_small\" must not be negative."))
		assertFalse(result.contains("The occurrence time specified at index 1 of Periodic Synthetic Stimulus \"pss_small\" must not be negative."))
		assertFalse(result.contains("The occurrence time specified at index 2 of Periodic Synthetic Stimulus \"pss_small\" must not be negative."))
		assertTrue(result.contains("The occurrence time specified at index 3 of Periodic Synthetic Stimulus \"pss_small\" must not be negative."))
		assertFalse(result.contains("The occurrence time specified at index 0 of Periodic Synthetic Stimulus \"pss_ok\" must not be negative."))
		assertFalse(result.contains("The occurrence time specified at index 1 of Periodic Synthetic Stimulus \"pss_ok\" must not be negative."))
	}
	
	@Test
	def void test_TAStimuliVRStimulus() {
		val model = amalthea [
			stimuliModel [
				variableRateStimulus [
					name = "vrs_ok"
					scenario = createScenario(createTime(2, "ms"))
				]
				variableRateStimulus [
					name = "vrs_nos"
				]
				variableRateStimulus [
					name = "vrs_wrongPeriod"
					scenario = createScenario(createTime(0, "ms"))
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Scenario must be set in Variable Rate Stimulus \"vrs_nos\"."))
		assertTrue(result.contains("The recurrence time specified in the scenario of Variable Rate Stimulus \"vrs_wrongPeriod\" must be greater than 0."))
		assertFalse(result.contains("Scenario must be set in Variable Rate Stimulus \"vrs_ok\"."))
		assertFalse(result.contains("The recurrence time specified in the scenario of Variable Rate Stimulus \"vrs_ok\" must be greater than 0."))
	}
	
}