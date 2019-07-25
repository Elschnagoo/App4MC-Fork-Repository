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
import org.eclipse.app4mc.amalthea.model.LabelEvent
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder
import org.eclipse.app4mc.amalthea.validations.ConstraintsProfile
import org.eclipse.app4mc.amalthea.validations.EMFProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.validations.BasicProfile
import org.eclipse.app4mc.amalthea.model.DelayConstraint
import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint

class ConstraintsModelTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension ConstraintsBuilder b2 = new ConstraintsBuilder

	val executor = new ValidationExecutor( #[EMFProfile, BasicProfile, ConstraintsProfile] )

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
	def void testEventChainSimpleGood() {
		val in = createLabelEvent("in")
		val mid = createLabelEvent("mid")
		val out = createLabelEvent("out")

		val model = amalthea [
			eventModel [
				events.addAll( #[in, mid, out] ) 
			]
			constraintsModel [
				eventChain [ name = "BasicEventChain"; stimulus = in; response = out
					segment_subchain[ name = "SubEvent1"; stimulus = in; response = mid ]
					segment_subchain[ name = "SubEvent2"; stimulus = mid; response = out ]
				]
			]
		]

		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.isEmpty)
	}

	@Test
	def void testEventChainSimple_UnmatchingStimulusEventAtChainStart() {
		val in = createLabelEvent("in")
		val in_false = createLabelEvent("in_false")
		val mid = createLabelEvent("mid")
		val out = createLabelEvent("out")


		val model = amalthea [
			eventModel [
				events.addAll( #[in, in_false, mid, out] ) 
			]
			constraintsModel [
				eventChain [ name = "BasicEventChain"; stimulus = in_false; response = out
					segment_subchain[ name = "SubEvent1"; stimulus = in; response = mid ]
					segment_subchain[ name = "SubEvent2"; stimulus = mid; response = out ]
				]
			]
		]

		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("Event Chain \"BasicEventChain\": stimulus of first segment <> stimulus of event chain"))
	}

	@Test
	def void testEventChainSimple_UnmatchingResponseEventAtChainEnd() {
		val in = createLabelEvent("in")
		val mid = createLabelEvent("mid")
		val out = createLabelEvent("out")
		val out_false = createLabelEvent("out_false")


		val model = amalthea [
			eventModel [
				events.addAll( #[in, mid, out, out_false] ) 
			]
			constraintsModel [
				eventChain [ name = "BasicEventChain"; stimulus = in; response = out_false
					segment_subchain[ name = "SubEvent1"; stimulus = in; response = mid ]
					segment_subchain[ name = "SubEvent2"; stimulus = mid; response = out ]
				]
			]
		]

		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("Event Chain \"BasicEventChain\": response of last segment <> response of event chain"))
	}

	@Test
	def void testEventChainSimpleBadWrongStimulusInSubEvent() {
		val in = createLabelEvent("in")
		val mid = createLabelEvent("mid")
		val mid_false = createLabelEvent("mid_false")
		val out = createLabelEvent("out")


		val model = amalthea [
			eventModel [
				events.addAll( #[in, mid, mid_false, out] ) 
			]
			constraintsModel [
				eventChain [ name = "BasicEventChain"; stimulus = in; response = out
					segment_subchain[ name = "SubEvent1"; stimulus = in; response = mid ]
					segment_subchain[ name = "SubEvent2"; stimulus = mid_false; response = out ]
				]
			]
		]

		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("Event Chain \"BasicEventChain\": response of segment 0 <> stimulus of segment 1"))
	}

	@Test
	def void testEventChainSimpleBadWrongResponseInSubEvent() {
		val in = createLabelEvent("in")
		val mid = createLabelEvent("mid")
		val mid_false = createLabelEvent("mid_false")
		val out = createLabelEvent("out")


		val model = amalthea [
			eventModel [
				events.addAll( #[in, mid, mid_false, out] ) 
			]
			constraintsModel [
				eventChain [ name = "BasicEventChain"; stimulus = in; response = out
					segment_subchain[ name = "SubEvent1"; stimulus = in; response = mid_false ]
					segment_subchain[ name = "SubEvent2"; stimulus = mid; response = out ]
				]
			]
		]

		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("Event Chain \"BasicEventChain\": response of segment 0 <> stimulus of segment 1"))
	}

	@Test
	def void testEventChainSimpleBadMissingStimulusInSubEvent() {
		val in = createLabelEvent("in")
		val mid = createLabelEvent("mid")
		val out = createLabelEvent("out")


		val model = amalthea [
			eventModel [
				events.addAll( #[in, mid, out] ) 
			]
			constraintsModel [
				eventChain [ name = "BasicEventChain"; stimulus = in; response = out
					segment_subchain[ name = "SubEvent1"; stimulus = in; response = mid ]
					segment_subchain[ name = "SubEvent2"; stimulus = null; response = out ]
				]
			]
		]

		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("Event Chain \"BasicEventChain\": response of segment 0 <> stimulus of segment 1"))
		assertTrue(result.contains("The required feature 'stimulus' of 'SubEventChain SubEvent2' must be set ( in Event Chain \"BasicEventChain\" )"))
	}

	@Test
	def void testEventChainSimpleBadMissingResponseInSubEvent() {
		val in = createLabelEvent("in")
		val mid = createLabelEvent("mid")
		val out = createLabelEvent("out")


		val model = amalthea [
			eventModel [
				events.addAll( #[in, mid, out] ) 
			]
			constraintsModel [
				eventChain [ name = "BasicEventChain"; stimulus = in; response = out
					segment_subchain[ name = "SubEvent1"; stimulus = in; response = null ]
					segment_subchain[ name = "SubEvent2"; stimulus = mid; response = out ]
				]
			]
		]

		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("Event Chain \"BasicEventChain\": response of segment 0 <> stimulus of segment 1"))
		assertTrue(result.contains("The required feature 'response' of 'SubEventChain SubEvent1' must be set ( in Event Chain \"BasicEventChain\" )"))
	}
	
	@Test
	def void testDataAgeTime() {
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
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: minimumTime value must be positive or zero (in Data Age Constraint \"dac_min\")"))
		assertTrue(result.contains("Time: maximumTime value must be positive or zero (in Data Age Constraint \"dac_max\")"))
		assertTrue(result.contains("Time: minimumTime value must be positive or zero (in Data Age Constraint \"dac_maxmin\")"))
		assertTrue(result.contains("Time: maximumTime value must be positive or zero (in Data Age Constraint \"dac_maxmin\")"))
		assertTrue(result.contains("Time: maximumTime value must be positive or zero (in Data Age Constraint \"dac_maximin\")"))
		assertFalse(result.contains("Time: minimumTime value must be positive or zero (in Data Age Constraint \"dac_ok\")"))
		assertFalse(result.contains("Time: maximumTime value must be positive or zero (in Data Age Constraint \"dac_ok\")"))
	}
	
	@Test
	def void testDelayConstraintTime() {
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
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: lower value must be positive or zero (in Delay Constraint \"dc_lower\")"))
		assertTrue(result.contains("Time: upper value must be positive or zero (in Delay Constraint \"dc_upper\")"))
		assertTrue(result.contains("Time: lower value must be positive or zero (in Delay Constraint \"dc_upperlower\")"))
		assertTrue(result.contains("Time: upper value must be positive or zero (in Delay Constraint \"dc_upperlower\")"))
		assertTrue(result.contains("Time: upper value must be positive or zero (in Delay Constraint \"dc_upperbelower\")"))
		assertFalse(result.contains("Time: lower value must be positive or zero (in Delay Constraint \"dc_ok\")"))
		assertFalse(result.contains("Time: upper value must be positive or zero (in Delay Constraint \"dc_ok\")"))
	}
	
	@Test
	def void testECLConstraintTime() {
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
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: minimum value must be positive or zero (in Event Chain Latency Constraint \"eclc_lower\")"))
		assertTrue(result.contains("Time: maximum value must be positive or zero (in Event Chain Latency Constraint \"eclc_upper\")"))
		assertTrue(result.contains("Time: minimum value must be positive or zero (in Event Chain Latency Constraint \"eclc_upperlower\")"))
		assertTrue(result.contains("Time: maximum value must be positive or zero (in Event Chain Latency Constraint \"eclc_upperlower\")"))
		assertTrue(result.contains("Time: maximum value must be positive or zero (in Event Chain Latency Constraint \"eclc_upperbelower\")"))
		assertFalse(result.contains("Time: minimum value must be positive or zero (in Event Chain Latency Constraint \"eclc_ok\")"))
		assertFalse(result.contains("Time: maximum value must be positive or zero (in Event Chain Latency Constraint \"eclc_ok\")"))
	}
	
	@Test
	def void testRepetitionConstraintTime() {
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
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: lower value must be positive or zero (in Repetition Constraint \"rc_lower\")"))
		assertTrue(result.contains("Time: upper value must be positive or zero (in Repetition Constraint \"rc_upper\")"))
		assertTrue(result.contains("Time: lower value must be positive or zero (in Repetition Constraint \"rc_upperlower\")"))
		assertTrue(result.contains("Time: upper value must be positive or zero (in Repetition Constraint \"rc_upperlower\")"))
		assertTrue(result.contains("Time: upper value must be positive or zero (in Repetition Constraint \"rc_upperbelower\")"))
		assertTrue(result.contains("Time: jitter value must be positive or zero (in Repetition Constraint \"rc_jitter\")"))
		assertTrue(result.contains("Time: period value must be positive or zero (in Repetition Constraint \"rc_period\")"))
		assertFalse(result.contains("Time: lower value must be positive or zero (in Repetition Constraint \"rc_ok\")"))
		assertFalse(result.contains("Time: upper value must be positive or zero (in Repetition Constraint \"rc_ok\")"))
		assertFalse(result.contains("Time: jitter value must be positive or zero (in Repetition Constraint \"rc_ok\")"))
		assertFalse(result.contains("Time: period value must be positive or zero (in Repetition Constraint \"rc_ok\")"))
	}
	
	@Test
	def void testSynchronizationConstraintTolerance() {
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
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Time: tolerance value must be positive or zero (in Event Synchronization Constraint \"sc_notOk\")"))
		assertFalse(result.contains("Time: tolerance value must be positive or zero (in Event Synchronization Constraint \"sc_ok\")"))
	}

	def private static LabelEvent createLabelEvent(String name) {
		val LabelEvent event = AmaltheaFactory.eINSTANCE.createLabelEvent()
		event.setName(name)
		return event
	}

}
