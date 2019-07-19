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

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.ConstraintsModel
import org.eclipse.app4mc.amalthea.model.Event
import org.eclipse.app4mc.amalthea.model.EventChain
import org.eclipse.app4mc.amalthea.model.EventChainContainer
import org.eclipse.app4mc.amalthea.model.LabelEvent
import org.eclipse.app4mc.amalthea.model.SubEventChain
import org.junit.Before
import org.junit.Test

class ConstraintsModelTests {
	@Before def void setUp() { //
		// /*
		// * Create mock of dependency class
		// */
		// this.issueCreator = EasyMock.createMock(IssueCreator.class);
		// // this.objectHelper = EasyMock.createMock(IObjectHelper.class);
		//
		// /*
		// * Create object from class to be tested
		// */
		// this.classUnderTest = new ConstraintsModelCheckValidatorImpl(this.issueCreator/* , this.objectHelper */);
	}

	/** 
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	def void testEventChainSimpleGood() {
		val ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel()
		val LabelEvent in = createLabelEvent("in")
		val LabelEvent mid = createLabelEvent("mid")
		val LabelEvent out = createLabelEvent("out")
		val EventChain simpleEC = createEventChain("BasicEventChain", in, out)
		val EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid)
		val EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out)
		// Concatenate AMALTHEA elements
		constraintsModel.getEventChains().add(simpleEC)
		simpleEC.getSegments().add(subEC1)
		simpleEC.getSegments().add(subEC2) // EasyMock.replay(this.issueCreator);
		// this.classUnderTest.checkEventChains(constraintsModel);
		// EasyMock.verify(this.issueCreator);
	}

	/** 
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	// @Test
	def void testEventChainSimple_UnmatchingStimulusEventAtChainStart() {
		val ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel()
		val LabelEvent in = createLabelEvent("in")
		val LabelEvent mid = createLabelEvent("mid")
		val LabelEvent in_false = createLabelEvent("in_false")
		val LabelEvent out = createLabelEvent("out")
		val EventChain simpleEC = createEventChain("BasicEventChain", in_false, out)
		val EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid)
		val EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out)
		// Concatenate AMALTHEA elements
		constraintsModel.getEventChains().add(simpleEC)
		simpleEC.getSegments().add(subEC1)
		simpleEC.getSegments().add(subEC2) // this.issueCreator.issue(simpleEC, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
		// "Beginning SubEventChain not found; EventChain's stimulus does not match with SubEventChain's stimulus BasicEventChain");
		//
		// EasyMock.replay(this.issueCreator);
		//
		// // Invoke method to be tested
		// this.classUnderTest.checkEventChains(constraintsModel);
		//
		// EasyMock.verify(this.issueCreator);
	}

	/** 
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	def void testEventChainSimple_UnmatchingResponseEventAtChainEnd() {
		val ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel()
		val LabelEvent in = createLabelEvent("in")
		val LabelEvent mid = createLabelEvent("mid")
		val LabelEvent out_false = createLabelEvent("out_false")
		val LabelEvent out = createLabelEvent("out")
		val EventChain simpleEC = createEventChain("BasicEventChain", in, out_false)
		val EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid)
		val EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out)
		// Concatenate AMALTHEA elements
		constraintsModel.getEventChains().add(simpleEC)
		simpleEC.getSegments().add(subEC1)
		simpleEC.getSegments().add(subEC2) // this.issueCreator.issue(subEC2.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
		// "No successor found for EventChain 'SubEvent2'");
		//
		// EasyMock.replay(this.issueCreator);
		// // Invoke method to be tested
		// this.classUnderTest.checkEventChains(constraintsModel);
		// EasyMock.verify(this.issueCreator);
	}

	/** 
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	def void testEventChainSimpleBadWrongStimulusInSubEvent() {
		val ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel()
		val LabelEvent in = createLabelEvent("in")
		val LabelEvent mid = createLabelEvent("mid")
		val LabelEvent mid_false = createLabelEvent("mid_false")
		val LabelEvent out = createLabelEvent("out")
		val EventChain simpleEC = createEventChain("BasicEventChain", in, out)
		val EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid)
		val EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid_false, out)
		// Concatenate AMALTHEA elements
		constraintsModel.getEventChains().add(simpleEC)
		simpleEC.getSegments().add(subEC1)
		simpleEC.getSegments().add(subEC2) // this.issueCreator.issue(subEC1.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
		// "No successor found for EventChain 'SubEvent1'");
		//
		// EasyMock.replay(this.issueCreator);
		// // Invoke method to be tested
		// this.classUnderTest.checkEventChains(constraintsModel);
		// EasyMock.verify(this.issueCreator);
	}

	/** 
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	def void testEventChainSimpleBadWrongResponseInSubEvent() {
		val ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel()
		val LabelEvent in = createLabelEvent("in")
		val LabelEvent mid = createLabelEvent("mid")
		val LabelEvent mid_false = createLabelEvent("mid_false")
		val LabelEvent out = createLabelEvent("out")
		val EventChain simpleEC = createEventChain("BasicEventChain", in, out)
		val EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid_false)
		val EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out)
		// Concatenate AMALTHEA elements
		constraintsModel.getEventChains().add(simpleEC)
		simpleEC.getSegments().add(subEC1)
		simpleEC.getSegments().add(subEC2) // this.issueCreator.issue(subEC1.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
		// "No successor found for EventChain 'SubEvent1'");
		//
		// EasyMock.replay(this.issueCreator);
		// // Invoke method to be tested
		// this.classUnderTest.checkEventChains(constraintsModel);
		// EasyMock.verify(this.issueCreator);
	}

	/** 
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	def void testEventChainSimpleBadMissingStimulusInSubEvent() {
		val ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel()
		val LabelEvent in = createLabelEvent("in")
		val LabelEvent mid = createLabelEvent("mid")
		val LabelEvent out = createLabelEvent("out")
		val EventChain simpleEC = createEventChain("BasicEventChain", in, out)
		val EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid)
		val EventChainContainer subEC2 = createContainedSubChain("SubEvent2", null, out)
		// Concatenate AMALTHEA elements
		constraintsModel.getEventChains().add(simpleEC)
		simpleEC.getSegments().add(subEC1)
		simpleEC.getSegments().add(subEC2) // this.issueCreator.issue(subEC1.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
		// "No successor found for EventChain 'SubEvent1'");
		//
		// EasyMock.replay(this.issueCreator);
		// // Invoke method to be tested
		// this.classUnderTest.checkEventChains(constraintsModel);
		// EasyMock.verify(this.issueCreator);
	}

	/** 
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	def void testEventChainSimpleBadMissingResponseInSubEvent() {
		val ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel()
		val LabelEvent in = createLabelEvent("in")
		val LabelEvent mid = createLabelEvent("mid")
		val LabelEvent out = createLabelEvent("out")
		val EventChain simpleEC = createEventChain("BasicEventChain", in, out)
		val EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, null)
		val EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out)
		// Concatenate AMALTHEA elements
		constraintsModel.getEventChains().add(simpleEC)
		simpleEC.getSegments().add(subEC1)
		simpleEC.getSegments().add(subEC2) // this.issueCreator.issue(subEC1.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
		// "No successor found for EventChain 'SubEvent1'");
		//
		// EasyMock.replay(this.issueCreator);
		// // Invoke method to be tested
		// this.classUnderTest.checkEventChains(constraintsModel);
		// EasyMock.verify(this.issueCreator);
	}

	def private LabelEvent createLabelEvent(String name) {
		val LabelEvent event = AmaltheaFactory.eINSTANCE.createLabelEvent()
		event.setName(name)
		return event
	}

	def private EventChain createEventChain(String name, Event stimulus, Event response) {
		val EventChain chain = AmaltheaFactory.eINSTANCE.createEventChain()
		chain.setName(name)
		chain.setStimulus(stimulus)
		chain.setResponse(response)
		return chain
	}

	def private EventChainContainer createContainedSubChain(String name, Event stimulus, Event response) {
		val SubEventChain subchain = AmaltheaFactory.eINSTANCE.createSubEventChain()
		subchain.setName(name)
		subchain.setStimulus(stimulus)
		subchain.setResponse(response)
		val EventChainContainer container = AmaltheaFactory.eINSTANCE.createEventChainContainer()
		container.setEventChain(subchain)
		return container
	}
}
