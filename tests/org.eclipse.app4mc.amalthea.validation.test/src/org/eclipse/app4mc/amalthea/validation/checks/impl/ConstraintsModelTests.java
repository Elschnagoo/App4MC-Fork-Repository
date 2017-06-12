/**
 * *******************************************************************************
 *  Copyright (c) 2015, 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainContainer;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.ConstraintsModelCheckValidator;
import org.junit.Before;
import org.junit.Test;

public class ConstraintsModelTests {

	private ConstraintsModelCheckValidatorImpl classUnderTest;

	private IssueCreator issueCreator;

	@Before
	public void setUp() {

		/*
		 * Create mock of dependency class
		 */
		this.issueCreator = EasyMock.createMock(IssueCreator.class);
		// this.objectHelper = EasyMock.createMock(IObjectHelper.class);

		/*
		 * Create object from class to be tested
		 */
		this.classUnderTest = new ConstraintsModelCheckValidatorImpl(this.issueCreator/* , this.objectHelper */);
	}

	/**
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	public void testEventChainSimpleGood() {
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();

		final LabelEvent in = createLabelEvent("in");
		final LabelEvent mid = createLabelEvent("mid");
		final LabelEvent out = createLabelEvent("out");

		final EventChain simpleEC = createEventChain("BasicEventChain", in, out);
		final EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid);
		final EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out);

		// Concatenate AMALTHEA elements
		
		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().add(subEC1);
		simpleEC.getSegments().add(subEC2);
		
		
		EasyMock.replay(this.issueCreator);
		this.classUnderTest.checkEventChains(constraintsModel);
		EasyMock.verify(this.issueCreator);
	}


	/**
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
//	@Test
	public void testEventChainSimple_UnmatchingStimulusEventAtChainStart() {
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();

		final LabelEvent in = createLabelEvent("in");
		final LabelEvent mid = createLabelEvent("mid");
		final LabelEvent in_false = createLabelEvent("in_false");
		final LabelEvent out = createLabelEvent("out");

		final EventChain simpleEC = createEventChain("BasicEventChain", in_false, out);
		final EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid);
		final EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().add(subEC1);
		simpleEC.getSegments().add(subEC2);
		
		
		this.issueCreator.issue(simpleEC, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
				"Beginning SubEventChain not found; EventChain's stimulus does not match with SubEventChain's stimulus BasicEventChain");

		EasyMock.replay(this.issueCreator);

		// Invoke method to be tested
		this.classUnderTest.checkEventChains(constraintsModel);

		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	public void testEventChainSimple_UnmatchingResponseEventAtChainEnd() {
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();

		final LabelEvent in = createLabelEvent("in");
		final LabelEvent mid = createLabelEvent("mid");
		final LabelEvent out_false = createLabelEvent("out_false");
		final LabelEvent out = createLabelEvent("out");

		final EventChain simpleEC = createEventChain("BasicEventChain", in, out_false);
		final EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid);
		final EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().add(subEC1);
		simpleEC.getSegments().add(subEC2);

		
		this.issueCreator.issue(subEC2.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
				"No successor found for EventChain 'SubEvent2'");

		EasyMock.replay(this.issueCreator);
		// Invoke method to be tested
		this.classUnderTest.checkEventChains(constraintsModel);
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	public void testEventChainSimpleBadWrongStimulusInSubEvent() {
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();

		final LabelEvent in = createLabelEvent("in");
		final LabelEvent mid = createLabelEvent("mid");
		final LabelEvent mid_false = createLabelEvent("mid_false");
		final LabelEvent out = createLabelEvent("out");

		final EventChain simpleEC = createEventChain("BasicEventChain", in, out);
		final EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid);
		final EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid_false, out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().add(subEC1);
		simpleEC.getSegments().add(subEC2);


		this.issueCreator.issue(subEC1.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
				"No successor found for EventChain 'SubEvent1'");

		EasyMock.replay(this.issueCreator);
		// Invoke method to be tested
		this.classUnderTest.checkEventChains(constraintsModel);
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	public void testEventChainSimpleBadWrongResponseInSubEvent() {
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();

		final LabelEvent in = createLabelEvent("in");
		final LabelEvent mid = createLabelEvent("mid");
		final LabelEvent mid_false = createLabelEvent("mid_false");
		final LabelEvent out = createLabelEvent("out");

		final EventChain simpleEC = createEventChain("BasicEventChain", in, out);
		final EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid_false);
		final EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().add(subEC1);
		simpleEC.getSegments().add(subEC2);

		
		this.issueCreator.issue(subEC1.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
				"No successor found for EventChain 'SubEvent1'");

		EasyMock.replay(this.issueCreator);
		// Invoke method to be tested
		this.classUnderTest.checkEventChains(constraintsModel);
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	public void testEventChainSimpleBadMissingStimulusInSubEvent() {
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();

		final LabelEvent in = createLabelEvent("in");
		final LabelEvent mid = createLabelEvent("mid");
		final LabelEvent out = createLabelEvent("out");

		final EventChain simpleEC = createEventChain("BasicEventChain", in, out);
		final EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, mid);
		final EventChainContainer subEC2 = createContainedSubChain("SubEvent2", null, out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().add(subEC1);
		simpleEC.getSegments().add(subEC2);


		this.issueCreator.issue(subEC1.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
				"No successor found for EventChain 'SubEvent1'");

		EasyMock.replay(this.issueCreator);
		// Invoke method to be tested
		this.classUnderTest.checkEventChains(constraintsModel);
		EasyMock.verify(this.issueCreator);
	}


	/**
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	public void testEventChainSimpleBadMissingResponseInSubEvent() {
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();

		final LabelEvent in = createLabelEvent("in");
		final LabelEvent mid = createLabelEvent("mid");
		final LabelEvent out = createLabelEvent("out");

		final EventChain simpleEC = createEventChain("BasicEventChain", in, out);
		final EventChainContainer subEC1 = createContainedSubChain("SubEvent1", in, null);
		final EventChainContainer subEC2 = createContainedSubChain("SubEvent2", mid, out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().add(subEC1);
		simpleEC.getSegments().add(subEC2);

		
		this.issueCreator.issue(subEC1.getEventChain(), AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
				"No successor found for EventChain 'SubEvent1'");

		EasyMock.replay(this.issueCreator);
		// Invoke method to be tested
		this.classUnderTest.checkEventChains(constraintsModel);
		EasyMock.verify(this.issueCreator);
	}
	
	private LabelEvent createLabelEvent(String name) {
		final LabelEvent event = AmaltheaFactory.eINSTANCE.createLabelEvent();
		event.setName(name);
		
		return event;
	}
	
	private EventChain createEventChain(String name, Event stimulus, Event response) {
		final EventChain chain = AmaltheaFactory.eINSTANCE.createEventChain();
		chain.setName(name);
		chain.setStimulus(stimulus);
		chain.setResponse(response);
		
		return chain;
	}
	
	private EventChainContainer createContainedSubChain(String name, Event stimulus, Event response) {
		final SubEventChain subchain = AmaltheaFactory.eINSTANCE.createSubEventChain();
		subchain.setName(name);
		subchain.setStimulus(stimulus);
		subchain.setResponse(response);
		
		final EventChainContainer container = AmaltheaFactory.eINSTANCE.createEventChainContainer();
		container.setEventChain(subchain);
		
		return container;
	}
}
