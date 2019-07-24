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

import static org.junit.Assert.assertTrue

class ConstraintsModelTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension ConstraintsBuilder b2 = new ConstraintsBuilder

	val executor = new ValidationExecutor( #[EMFProfile, ConstraintsProfile] )

	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
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

	def private LabelEvent createLabelEvent(String name) {
		val LabelEvent event = AmaltheaFactory.eINSTANCE.createLabelEvent()
		event.setName(name)
		return event
	}

}
