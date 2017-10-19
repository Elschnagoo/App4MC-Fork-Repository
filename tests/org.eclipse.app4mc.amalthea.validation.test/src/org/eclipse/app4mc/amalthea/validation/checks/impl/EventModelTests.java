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
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.EventModelCheckValidator;
import org.junit.Before;
import org.junit.Test;

public class EventModelTests {

	private EventModelCheckValidatorImpl classUnderTest;

	private IssueCreator issueCreator;

	private IEObjectHelper eObjectHelper;

	@Before
	public void setUp() {
		/*
		 * Create mock of dependency class
		 */
		this.issueCreator = EasyMock.createMock(IssueCreator.class);
		this.eObjectHelper = EasyMock.createMock(IEObjectHelper.class);
		/*
		 * Create object from class to be tested
		 */
		this.classUnderTest = new EventModelCheckValidatorImpl(this.issueCreator, this.eObjectHelper);
	}

	/*
	 * Label Event
	 */

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkLabelEventConstraint(eventModel)}
	 */
	@Test //(perhaps can be reused for something useful)
	public void testLabelEvent_CompleteMappingInfoWithTask() {

//		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
//		final LabelEvent labelEvent = AmaltheaFactory.eINSTANCE.createLabelEvent();
//		labelEvent.setName("TestLabelEvent");
//
//		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
//		label.setName("TestLabel");
//
//		final Process process = AmaltheaFactory.eINSTANCE.createTask();
//		process.setName("TestProcessAsTask");
//
//		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
//		runnable.setName("TestRunnable");
//
//		labelEvent.setEntity(label);
//		labelEvent.setProcess(process);
//		labelEvent.setRunnable(runnable);
//
//		eventModel.getEvents().add(labelEvent);
//
//
//		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, LabelEvent.class))
//				.andReturn(Arrays.asList(labelEvent));
//
//		EasyMock.replay(this.issueCreator);
//		EasyMock.replay(this.eObjectHelper);
//		this.classUnderTest.checkLabelEventConstraint(eventModel);
//		EasyMock.verify(this.issueCreator);
//		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkLabelEventConstraint(eventModel)}
	 */
	//Test
	public void testLabelEvent_CompleteMappingInfo() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final LabelEvent labelEvent = AmaltheaFactory.eINSTANCE.createLabelEvent();
		labelEvent.setName("TestLabelEvent");

		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		label.setName("TestLabel");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		labelEvent.setEntity(label);
		labelEvent.setProcess(process);
		labelEvent.setRunnable(runnable);

		eventModel.getEvents().add(labelEvent);


		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, LabelEvent.class))
				.andReturn(Arrays.asList(labelEvent));

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);
		this.classUnderTest.checkLabelEventConstraint(eventModel);
		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkLabelEventConstraint(eventModel)}
	 */
	//Test
	public void testLabelEvent_MissingEntity() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final LabelEvent labelEvent = AmaltheaFactory.eINSTANCE.createLabelEvent();
		labelEvent.setName("TestLabelEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		labelEvent.setProcess(process);
		labelEvent.setRunnable(runnable);

		eventModel.getEvents().add(labelEvent);


		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, LabelEvent.class))
				.andReturn(Arrays.asList(labelEvent));

		this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Entity(), labelEvent.getName(),
				"Entity");

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);
		this.classUnderTest.checkLabelEventConstraint(eventModel);
		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkLabelEventConstraint(eventModel)}
	 */
	//Test
	public void testLabelEvent_MissingProcess() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final LabelEvent labelEvent = AmaltheaFactory.eINSTANCE.createLabelEvent();
		labelEvent.setName("TestLabelEvent");

		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		label.setName("TestLabel");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		labelEvent.setEntity(label);
		labelEvent.setRunnable(runnable);

		eventModel.getEvents().add(labelEvent);


		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, LabelEvent.class))
				.andReturn(Arrays.asList(labelEvent));

		this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Process(), labelEvent.getName(),
				"Process (i.e. Task)");

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);
		this.classUnderTest.checkLabelEventConstraint(eventModel);
		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkLabelEventConstraint(eventModel)}
	 */
	//Test
	public void testLabelEvent_MissingRunnable() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final LabelEvent labelEvent = AmaltheaFactory.eINSTANCE.createLabelEvent();
		labelEvent.setName("TestLabelEvent");

		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		label.setName("TestLabel");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		labelEvent.setEntity(label);
		labelEvent.setProcess(process);

		eventModel.getEvents().add(labelEvent);


		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, LabelEvent.class))
				.andReturn(Arrays.asList(labelEvent));

		this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Runnable(), labelEvent.getName(),
				"Runnable");

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);
		this.classUnderTest.checkLabelEventConstraint(eventModel);
		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkLabelEventConstraint(eventModel)}
	 */
	//Test
	public void testLabelEvent_MissingAll() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final LabelEvent labelEvent = AmaltheaFactory.eINSTANCE.createLabelEvent();
		labelEvent.setName("TestLabelEvent");

		eventModel.getEvents().add(labelEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, LabelEvent.class))
				.andReturn(Arrays.asList(labelEvent));


		this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Entity(), labelEvent.getName(),
				"Entity");

		this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Process(), labelEvent.getName(),
				"Process (i.e. Task)");

		this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Runnable(), labelEvent.getName(),
				"Runnable");

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);
		this.classUnderTest.checkLabelEventConstraint(eventModel);
		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}
}
