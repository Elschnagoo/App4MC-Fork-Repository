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
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus
import org.eclipse.app4mc.amalthea.model.Scenario
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder
import org.eclipse.app4mc.amalthea.validations.BasicProfile
import org.eclipse.app4mc.amalthea.validations.EMFProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class StimuliModelTests {
	
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension StimuliBuilder b2 = new StimuliBuilder
	val executor = new ValidationExecutor(#[EMFProfile, BasicProfile])
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}
	
	def Scenario createScenario(Time recurrence) {
		val ret = AmaltheaFactory.eINSTANCE.createScenario
		ret.recurrence = recurrence
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
	
	def PeriodicSyntheticStimulus createPSS(String name, String unit, long...occurrenceTimes) {
		val ret = AmaltheaFactory.eINSTANCE.createPeriodicSyntheticStimulus
		ret.name = name
		for(long occurrence:occurrenceTimes) {
			val occurrenceTime = createTime(occurrence, unit)
			ret.occurrenceTimes += occurrenceTime
		}
		ret
	}
	
	@Test
	def void testArrivalCurveStimulusTimes() {
		val model = amalthea [
			stimuliModel [
				stimuli += createACS("acs_ok", "ms", 0, 1, 2, 5)
				stimuli += createACS("acs_small", "ms", -1, 0, 1, 100)
				stimuli += createACS("acs_big", "ms", 0, -1, 1, -100)
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: lowerTimeBorder value must be positive or zero (in Arrival Curve Stimulus \"acs_small\")"))
		assertTrue(result.contains("Time: upperTimeBorder value must be positive or zero (in Arrival Curve Stimulus \"acs_big\")"))
		assertFalse(result.contains("Time: lowerTimeBorder value must be positive or zero (in Arrival Curve Stimulus \"acs_ok\")"))
		assertFalse(result.contains("Time: upperTimeBorder value must be positive or zero (in Arrival Curve Stimulus \"acs_ok\")"))
	}
	
	@Test
	def void testPeriodicSyntheticStimulusTimes() {
		val model = amalthea [
			stimuliModel [
				stimuli += createPSS("pss_ok", "ms", 0, 1)
				stimuli += createPSS("pss_small1", "ms", -1, 0)
				stimuli += createPSS("pss_small2", "ms", 0, 0, 1, -100)
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: occurrenceTimes value must be positive or zero (in Periodic Synthetic Stimulus \"pss_small1\")"))
		assertTrue(result.contains("Time: occurrenceTimes value must be positive or zero (in Periodic Synthetic Stimulus \"pss_small2\")"))
		assertFalse(result.contains("Time: occurrenceTimes value must be positive or zero (in Periodic Synthetic Stimulus \"pss_ok\")"))
	}
	
	@Test
	def void testVariableRateStimulusScenarioTimes() {
		val model = amalthea [
			stimuliModel [
				variableRateStimulus [
					name = "vrs_ok"
					scenario = createScenario(createTime(2, "ms"))
				]
				variableRateStimulus [
					name = "vrs_wrongPeriod"
					scenario = createScenario(createTime(0, "ms"))
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: recurrence value must be greater than zero (in Variable Rate Stimulus \"vrs_wrongPeriod\")"))
		assertFalse(result.contains("Time: recurrence value must be greater than zero (in Variable Rate Stimulus \"vrs_ok\")"))
	}
	
	@Test
	def void testClockStepListTimesAndFrequencies() {
		val model = amalthea [
			stimuliModel [
				clockStepList [
					name = "csl_ok"
					period = createTime(10, "ms")
					entries += createClockStep(0, FrequencyUnit.HZ, 0, "ms")
					entries += createClockStep(2, FrequencyUnit.HZ, 3, "ms")
				]
				clockStepList [
					name = "csl_period"
					period = createTime(0, "ms")
				]
				clockStepList [
					name = "csl_frequency"
					entries += createClockStep(-1, FrequencyUnit.HZ, 0, "ms")
				]
				clockStepList [
					name = "csl_time"
					entries += createClockStep(0, FrequencyUnit.HZ, -1, "ms")
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: period value must be greater than zero (in Clock Step List \"csl_period\")"))
		assertTrue(result.contains("The feature 'value' of 'Frequency' contains a bad value ( in Clock Step List \"csl_frequency\" ) => The value '-1.0' must be greater than or equal to '0.0'"))
		assertTrue(result.contains("Time: time value must be positive or zero (in Clock Step List \"csl_time\")"))
		assertFalse(result.contains("Time: period value must be greater than zero (in Clock Step List \"csl_ok\")"))
		assertFalse(result.contains("The feature 'value' of 'Frequency' contains a bad value ( in Clock Step List \"csl_ok\" ) => The value '0.0' must be greater than or equal to '0.0'"))
		assertFalse(result.contains("Time: time value must be positive or zero (in Clock Step List \"csl_ok\")"))
	}

}
