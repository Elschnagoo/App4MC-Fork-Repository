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
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint
import org.eclipse.app4mc.amalthea.model.DelayConstraint
import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder
import org.eclipse.app4mc.amalthea.model.builder.MappingBuilder
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class TAConstraintsModelValidatorTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension ConstraintsBuilder b2 = new ConstraintsBuilder
	extension SoftwareBuilder b3 = new SoftwareBuilder
	extension OperatingSystemBuilder b4 = new OperatingSystemBuilder
	extension MappingBuilder b5 = new MappingBuilder
	val executor = new ValidationExecutor(TimingArchitectsProfile)
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}
	
	def DataAgeConstraint createDAC(String name, Time lower, Time upper) {
		val dac = AmaltheaFactory.eINSTANCE.createDataAgeConstraint
		dac.name = name
		val dat = AmaltheaFactory.eINSTANCE.createDataAgeTime
		dat.minimumTime = lower
		dat.maximumTime = upper
		dac.dataAge = dat
		dac
	}
	
	def DelayConstraint createDC(String name, Time lower, Time upper) {
		val dc = AmaltheaFactory.eINSTANCE.createDelayConstraint
		dc.name = name
		dc.lower = lower
		dc.upper = upper
		dc
	}
	
	def EventChainLatencyConstraint createECLC(String name, Time lower, Time upper) {
		val eclc = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint
		eclc.name = name
		eclc.minimum = lower
		eclc.maximum = upper
		eclc
	}
	
	def RepetitionConstraint createRC(String name, Time lower, Time upper, Time jitter, Time period) {
		val rc = AmaltheaFactory.eINSTANCE.createRepetitionConstraint
		rc.name = name
		rc.lower = lower
		rc.upper = upper
		rc.jitter = jitter
		rc.period = period
		rc
	}
	
	@Test
	def void test_TAConstraintsDataAgeTime() {
		val model = amalthea [
			constraintsModel [
				dataAgeConstraints += createDAC("dac_ok", createTime(4, "ms"), createTime(10, "ms"))
				dataAgeConstraints += createDAC("dac_min", createTime(-1, "ms"), null)
				dataAgeConstraints += createDAC("dac_max", null, createTime(-1, "ms"))
				dataAgeConstraints += createDAC("dac_maxmin", createTime(-2, "ms"), createTime(-1, "ms"))
				dataAgeConstraints += createDAC("dac_maximin", createTime(0, "ms"), createTime(-1, "ms"))
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The minimum time must not be negative (-1 ms < 0, in Data Age Constraint \"dac_min\")"))
		assertTrue(result.contains("The maximum time must not be negative (-1 ms < 0, in Data Age Constraint \"dac_max\")"))
		assertTrue(result.contains("The minimum time must not be negative (-2 ms < 0, in Data Age Constraint \"dac_maxmin\")"))
		assertTrue(result.contains("The maximum time must not be negative (-1 ms < 0, in Data Age Constraint \"dac_maxmin\")"))
		assertTrue(result.contains("The maximum time must not be negative (-1 ms < 0, in Data Age Constraint \"dac_maximin\")"))
		assertTrue(result.contains("The minimum time is greater than the maximum time (0 ms > -1 ms, in Data Age Constraint \"dac_maximin\")"))
		assertFalse(result.contains("The minimum time must not be negative (4 ms < 0, in Data Age Constraint \"dac_ok\")"))
		assertFalse(result.contains("The maximum time must not be negative (10 ms < 0, in Data Age Constraint \"dac_ok\")"))
		assertFalse(result.contains("The minimum time greater than the maximum time (4 ms > 10 ms, in Data Age Constraint \"dac_ok\")"))
	}
	
	@Test
	def void test_TAConstraintsDelayConstraint() {
		val model = amalthea [
			constraintsModel [
				timingConstraints += createDC("dc_ok", createTime(4, "ms"), createTime(10, "ms"))
				timingConstraints += createDC("dc_lower", createTime(-1, "ms"), null)
				timingConstraints += createDC("dc_upper", null, createTime(-1, "ms"))
				timingConstraints += createDC("dc_upperlower", createTime(-2, "ms"), createTime(-1, "ms"))
				timingConstraints += createDC("dc_upperbelower", createTime(0, "ms"), createTime(-1, "ms"))
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The lower bound must not be negative (-1 ms < 0, in Delay Constraint \"dc_lower\")"))
		assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Delay Constraint \"dc_upper\")"))
		assertTrue(result.contains("The lower bound must not be negative (-2 ms < 0, in Delay Constraint \"dc_upperlower\")"))
		assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Delay Constraint \"dc_upperlower\")"))
		assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Delay Constraint \"dc_upperbelower\")"))
		assertTrue(result.contains("The lower bound is greater than the upper (0 ms > -1 ms, in Delay Constraint \"dc_upperbelower\")"))
		assertFalse(result.contains("The lower bound must not be negative (4 ms < 0, in Delay Constraint \"dc_ok\")"))
		assertFalse(result.contains("The upper bound must not be negative (10 ms < 0, in Delay Constraint \"dc_ok\")"))
		assertFalse(result.contains("The lower bound greater than the upper (4 ms > 10 ms, in Delay Constraint \"dc_ok\")"))
	}
	
	@Test
	def void test_TAConstraintsECLConstraint() {
		val model = amalthea [
			constraintsModel [
				timingConstraints += createECLC("eclc_ok", createTime(4, "ms"), createTime(10, "ms"))
				timingConstraints += createECLC("eclc_lower", createTime(-1, "ms"), null)
				timingConstraints += createECLC("eclc_upper", null, createTime(-1, "ms"))
				timingConstraints += createECLC("eclc_upperlower", createTime(-2, "ms"), createTime(-1, "ms"))
				timingConstraints += createECLC("eclc_upperbelower", createTime(0, "ms"), createTime(-1, "ms"))
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The minimum must not be negative (-1 ms < 0, in Event Chain Latency Constraint \"eclc_lower\")"))
		assertTrue(result.contains("The maximum must not be negative (-1 ms < 0, in Event Chain Latency Constraint \"eclc_upper\")"))
		assertTrue(result.contains("The minimum must not be negative (-2 ms < 0, in Event Chain Latency Constraint \"eclc_upperlower\")"))
		assertTrue(result.contains("The maximum must not be negative (-1 ms < 0, in Event Chain Latency Constraint \"eclc_upperlower\")"))
		assertTrue(result.contains("The maximum must not be negative (-1 ms < 0, in Event Chain Latency Constraint \"eclc_upperbelower\")"))
		assertTrue(result.contains("The minimum is greater than the maximum (0 ms > -1 ms, in Event Chain Latency Constraint \"eclc_upperbelower\")"))
		assertFalse(result.contains("The minimum must not be negative (4 ms < 0, in Event Chain Latency Constraint \"eclc_ok\")"))
		assertFalse(result.contains("The maximum must not be negative (10 ms < 0, in Event Chain Latency Constraint \"eclc_ok\")"))
		assertFalse(result.contains("The minimum greater than the upper (4 ms > 10 ms, in Event Chain Latency Constraint \"eclc_ok\")"))
	}
	
	@Test
	def void test_TAConstraintsEDFTaskMustHaveDeadline() {
		val model = amalthea [
			softwareModel [
				task [
					name = "t_ok"
				]
				task [
					name = "t_noDead"
				]
			]
			osModel [
				operatingSystem[
					name = "os"
					taskScheduler [
						name = "ts"
						schedulingAlgorithm = AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst
					]
				]
			]
			mappingModel [
				taskAllocation [
					scheduler = _find(TaskScheduler, "ts")
					task = _find(Task, "t_ok")
				]
				taskAllocation [
					scheduler = _find(TaskScheduler, "ts")
					task = _find(Task, "t_noDead")
				]
			]
			constraintsModel [
				deadline_Process(_find(Task, "t_ok"), createTime(10, "ms"))
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("There is no deadline ProcessRequirement for Task \"t_noDead\", since it is scheduled by an Earliest Deadline First scheduler a deadline must be specified."))
		assertFalse(result.contains("There is no deadline ProcessRequirement for Task \"t_ok\", since it is scheduled by an Earliest Deadline First scheduler a deadline must be specified."))
	}
	
	@Test
	def void test_TAConstraintsRepetitionConstraint() {
		val model = amalthea [
			constraintsModel [
				timingConstraints += createRC("rc_ok", createTime(4, "ms"), createTime(10, "ms"), createTime(1, "ms"), createTime(50, "ms"))
				timingConstraints += createRC("rc_lower", createTime(-1, "ms"), null, null, null)
				timingConstraints += createRC("rc_upper", null, createTime(-1, "ms"), null, null)
				timingConstraints += createRC("rc_upperlower", createTime(-2, "ms"), createTime(-1, "ms"), null, null)
				timingConstraints += createRC("rc_upperbelower", createTime(0, "ms"), createTime(-1, "ms"), null, null)
				timingConstraints += createRC("rc_jitter", null, null, createTime(-1, "ms"), null)
				timingConstraints += createRC("rc_period", null, null, null, createTime(-1, "ms"))
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The lower bound must not be negative (-1 ms < 0, in Repetition Constraint \"rc_lower\")"))
		assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Repetition Constraint \"rc_upper\")"))
		assertTrue(result.contains("The lower bound must not be negative (-2 ms < 0, in Repetition Constraint \"rc_upperlower\")"))
		assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Repetition Constraint \"rc_upperlower\")"))
		assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Repetition Constraint \"rc_upperbelower\")"))
		assertTrue(result.contains("The lower bound is greater than the upper (0 ms > -1 ms, in Repetition Constraint \"rc_upperbelower\")"))
		assertTrue(result.contains("The jitter must not be negative (-1 ms < 0, in Repetition Constraint \"rc_jitter\")"))
		assertTrue(result.contains("The period must not be negative (-1 ms < 0, in Repetition Constraint \"rc_period\")"))
		assertFalse(result.contains("The lower bound must not be negative (4 ms < 0, in Repetition Constraint \"rc_ok\")"))
		assertFalse(result.contains("The upper bound must not be negative (10 ms < 0, in Repetition Constraint \"rc_ok\")"))
		assertFalse(result.contains("The lower bound greater than the upper (4 ms > 10 ms, in Repetition Constraint \"rc_ok\")"))
		assertFalse(result.contains("The jitter must not be negative (1 ms < 0, in Repetition Constraint \"rc_ok\")"))
		assertFalse(result.contains("The period must not be negative (50 ms < 0, in Repetition Constraint \"rc_ok\")"))
	}
	
	@Test
	def void test_TAConstraintsRTLimitMustBePositive() {
		val model = amalthea [
			softwareModel [
				task [
					name = "t_ok"
				]
				task [
					name = "t_notOk"
				]
			]
			constraintsModel [
				deadline_Process(_find(Task, "t_ok"), createTime(10, "ms"))
				deadline_Process(_find(Task, "t_notOk"), createTime(0, "ms"))
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The response time specified in Process Requirement \"Process deadline - t_notOk\" must be greater than 0."))
		assertFalse(result.contains("The response time specified in Process Requirement \"Process deadline - t_ok\" must be greater than 0."))
	}
	
	@Test
	def void test_TAConstraintsSynchronizationToleranceNotNegative() {
		val model = amalthea [
			constraintsModel [
				val sc_ok = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint
				sc_ok.name = "sc_ok"
				sc_ok.tolerance = createTime(1, "ms")
				timingConstraints += sc_ok
				val sc_notOk = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint
				sc_notOk.name = "sc_notOk"
				sc_notOk.tolerance = createTime(-42, "ms")
				timingConstraints += sc_notOk
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The tolerance time specified in Event Synchronization Constraint \"sc_notOk\" must not be negative."))
		assertFalse(result.contains("The tolerance time specified in Event Synchronization Constraint \"sc_ok\" must not be negative."))
	}
	
}