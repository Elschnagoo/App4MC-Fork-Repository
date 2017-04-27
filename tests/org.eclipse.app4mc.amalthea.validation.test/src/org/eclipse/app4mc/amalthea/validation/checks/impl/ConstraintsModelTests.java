/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
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

import java.util.Arrays;

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventChain;
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

		final LabelEvent in = AmaltheaFactory.eINSTANCE.createLabelEvent();
		in.setName("in");
		final LabelEvent mid = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid.setName("mid");
		final LabelEvent out = AmaltheaFactory.eINSTANCE.createLabelEvent();
		out.setName("out");

		final EventChain simpleEC = AmaltheaFactory.eINSTANCE.createEventChain();
		simpleEC.setName("BasicEventChain");
		simpleEC.setStimulus(in);
		simpleEC.setResponse(out);

		final SubEventChain subEC1 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec1 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec1.setName("SubEvent1");
		ec1.setStimulus(in);
		ec1.setResponse(mid);

		final SubEventChain subEC2 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec2 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec2.setName("SubEvent2");
		ec2.setStimulus(mid);
		ec2.setResponse(out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().add(subEC1);
		simpleEC.getSegments().add(subEC2);
		subEC1.setEventChain(ec1);
		subEC2.setEventChain(ec2);

		EasyMock.replay(this.issueCreator);
		this.classUnderTest.checkEventChains(constraintsModel);
		EasyMock.verify(this.issueCreator);
	}


	/**
	 * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
	 */
	@Test
	public void testEventChainSimple_UnmatchingStimulusEventAtChainStart() {
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();

		final LabelEvent in = AmaltheaFactory.eINSTANCE.createLabelEvent();
		in.setName("in");
		final LabelEvent mid = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid.setName("mid");
		final LabelEvent in_false = AmaltheaFactory.eINSTANCE.createLabelEvent();
		in_false.setName("in_false");
		final LabelEvent out = AmaltheaFactory.eINSTANCE.createLabelEvent();
		out.setName("out");

		final EventChain simpleEC = AmaltheaFactory.eINSTANCE.createEventChain();
		simpleEC.setName("BasicEventChain");
		simpleEC.setStimulus(in_false);
		simpleEC.setResponse(out);

		final SubEventChain subEC1 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec1 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec1.setName("SubEvent1");
		ec1.setStimulus(in);
		ec1.setResponse(mid);

		final SubEventChain subEC2 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec2 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec2.setName("SubEvent2");
		ec2.setStimulus(mid);
		ec2.setResponse(out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().addAll(Arrays.asList(subEC1, subEC2));
		subEC1.setEventChain(ec1);
		subEC2.setEventChain(ec2);

		this.issueCreator.issue(simpleEC, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
				"Beginning SubEventChain not found; EventChain's stimulus does not match with any SubEventChain's stimulus BasicEventChain");

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

		final LabelEvent in = AmaltheaFactory.eINSTANCE.createLabelEvent();
		in.setName("in");
		final LabelEvent mid = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid.setName("mid");
		final LabelEvent out_false = AmaltheaFactory.eINSTANCE.createLabelEvent();
		out_false.setName("out_false");
		final LabelEvent out = AmaltheaFactory.eINSTANCE.createLabelEvent();
		out.setName("out");

		final EventChain simpleEC = AmaltheaFactory.eINSTANCE.createEventChain();
		simpleEC.setName("BasicEventChain");
		simpleEC.setStimulus(in);
		simpleEC.setResponse(out_false);

		final SubEventChain subEC1 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec1 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec1.setName("SubEvent1");
		ec1.setStimulus(in);
		ec1.setResponse(mid);
		subEC1.setEventChain(ec1);

		final SubEventChain subEC2 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec2 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec2.setName("SubEvent2");
		ec2.setStimulus(mid);
		ec2.setResponse(out);
		subEC2.setEventChain(ec2);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().addAll(Arrays.asList(subEC1, subEC2));

		this.issueCreator.issue(ec2, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
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

		final LabelEvent in = AmaltheaFactory.eINSTANCE.createLabelEvent();
		in.setName("in");
		final LabelEvent mid = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid.setName("mid");
		final LabelEvent mid_false = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid_false.setName("mid_false");
		final LabelEvent out = AmaltheaFactory.eINSTANCE.createLabelEvent();
		out.setName("out");

		final EventChain simpleEC = AmaltheaFactory.eINSTANCE.createEventChain();
		simpleEC.setName("BasicEventChain");
		simpleEC.setStimulus(in);
		simpleEC.setResponse(out);

		final SubEventChain subEC1 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec1 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec1.setName("SubEvent1");
		ec1.setStimulus(in);
		ec1.setResponse(mid);

		final SubEventChain subEC2 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec2 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec2.setName("SubEvent2");
		ec2.setStimulus(mid_false);
		ec2.setResponse(out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().addAll(Arrays.asList(subEC1, subEC2));
		subEC1.setEventChain(ec1);
		subEC2.setEventChain(ec2);

		this.issueCreator.issue(ec1, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
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

		final LabelEvent in = AmaltheaFactory.eINSTANCE.createLabelEvent();
		in.setName("in");
		final LabelEvent mid = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid.setName("mid");
		final LabelEvent mid_false = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid_false.setName("mid_false");
		final LabelEvent out = AmaltheaFactory.eINSTANCE.createLabelEvent();
		out.setName("out");

		final EventChain simpleEC = AmaltheaFactory.eINSTANCE.createEventChain();
		simpleEC.setName("BasicEventChain");
		simpleEC.setStimulus(in);
		simpleEC.setResponse(out);

		final SubEventChain subEC1 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec1 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec1.setName("SubEvent1");
		ec1.setStimulus(in);
		ec1.setResponse(mid_false);

		final SubEventChain subEC2 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec2 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec2.setName("SubEvent2");
		ec2.setStimulus(mid);
		ec2.setResponse(out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().addAll(Arrays.asList(subEC1, subEC2));
		subEC1.setEventChain(ec1);
		subEC2.setEventChain(ec2);

		this.issueCreator.issue(ec1, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
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

		final LabelEvent in = AmaltheaFactory.eINSTANCE.createLabelEvent();
		in.setName("in");
		final LabelEvent mid = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid.setName("mid");
		final LabelEvent out = AmaltheaFactory.eINSTANCE.createLabelEvent();
		out.setName("out");

		final EventChain simpleEC = AmaltheaFactory.eINSTANCE.createEventChain();
		simpleEC.setName("BasicEventChain");
		simpleEC.setStimulus(in);
		simpleEC.setResponse(out);

		final SubEventChain subEC1 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec1 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec1.setName("SubEvent1");
		ec1.setStimulus(in);
		ec1.setResponse(mid);

		final SubEventChain subEC2 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec2 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec2.setName("SubEvent2");
		// ec2.setStimulus(mid);
		ec2.setResponse(out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().addAll(Arrays.asList(subEC1, subEC2));
		subEC1.setEventChain(ec1);
		subEC2.setEventChain(ec2);

		this.issueCreator.issue(ec1, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
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

		final LabelEvent in = AmaltheaFactory.eINSTANCE.createLabelEvent();
		in.setName("in");
		final LabelEvent mid = AmaltheaFactory.eINSTANCE.createLabelEvent();
		mid.setName("mid");
		// final LabelEvent mid_false = AmaltheaFactory.eINSTANCE.createLabelEvent();
		// mid_false.setName("mid_false");
		final LabelEvent out = AmaltheaFactory.eINSTANCE.createLabelEvent();
		out.setName("out");

		final EventChain simpleEC = AmaltheaFactory.eINSTANCE.createEventChain();
		simpleEC.setName("BasicEventChain");
		simpleEC.setStimulus(in);
		simpleEC.setResponse(out);

		final SubEventChain subEC1 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec1 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec1.setName("SubEvent1");
		ec1.setStimulus(in);
		// ec1.setResponse(mid);

		final SubEventChain subEC2 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		final EventChain ec2 = AmaltheaFactory.eINSTANCE.createEventChain();
		ec2.setName("SubEvent2");
		ec2.setStimulus(mid);
		ec2.setResponse(out);

		// Concatenate AMALTHEA elements

		constraintsModel.getEventChains().add(simpleEC);
		simpleEC.getSegments().addAll(Arrays.asList(subEC1, subEC2));
		subEC1.setEventChain(ec1);
		subEC2.setEventChain(ec2);

		this.issueCreator.issue(ec1, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
				"No successor found for EventChain 'SubEvent1'");

		EasyMock.replay(this.issueCreator);
		// Invoke method to be tested
		this.classUnderTest.checkEventChains(constraintsModel);
		EasyMock.verify(this.issueCreator);
	}
}
