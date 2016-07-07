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
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.ProcessEvent;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEvent;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreEvent;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.StimulusEvent;
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
	 *
	 *
	 *
	 * Label Event
	 */

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkLabelEventConstraint(eventModel)}
	 */
	@Test
	public void testLabelEvent_CompleteMappingInfoWithTask() {

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
	@Test
	public void testLabelEvent_CompleteMappingInfoW() {

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
	@Test
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
	@Test
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
	@Test
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
	@Test
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

	/*
	 *
	 *
	 *
	 * Process Event
	 */

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkProcessEventConstraint(eventModel)}
	 */
	@Test
	public void testProcessEvent_CompleteMappingInfo_WithISR() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final ProcessEvent processEvent = AmaltheaFactory.eINSTANCE.createProcessEvent();
		processEvent.setName("TestProcessEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createISR();
		process.setName("TestProcessAsISR");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		processEvent.setEntity(process);
		processEvent.setCore(core);

		eventModel.getEvents().add(processEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, ProcessEvent.class))
				.andReturn(Arrays.asList(processEvent));

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkProcessEventConstraint(eventModel)}
	 */
	@Test
	public void testProcessEvent_MissingEntity() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final ProcessEvent processEvent = AmaltheaFactory.eINSTANCE.createProcessEvent();
		processEvent.setName("TestProcessEvent");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		processEvent.setCore(core);

		eventModel.getEvents().add(processEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, ProcessEvent.class))
				.andReturn(Arrays.asList(processEvent));

		this.issueCreator.issue(processEvent, AmaltheaPackage.eINSTANCE.getProcessEvent_Entity(),
				processEvent.getName(), "Entity (i.e. Runnable)");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkProcessEventConstraint(eventModel)}
	 */
	@Test
	public void testProcessEvent_MissingCore() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final ProcessEvent processEvent = AmaltheaFactory.eINSTANCE.createProcessEvent();
		processEvent.setName("TestProcessEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createISR();
		process.setName("TestProcessAsISR");

		processEvent.setEntity(process);

		eventModel.getEvents().add(processEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, ProcessEvent.class))
				.andReturn(Arrays.asList(processEvent));

		this.issueCreator.issue(processEvent, AmaltheaPackage.eINSTANCE.getProcessEvent_Core(), processEvent.getName(),
				"Core");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkProcessEventConstraint(eventModel)}
	 */
	@Test
	public void testProcessEvent_MissingAll() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final ProcessEvent processEvent = AmaltheaFactory.eINSTANCE.createProcessEvent();
		processEvent.setName("TestProcessEvent");

		eventModel.getEvents().add(processEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, ProcessEvent.class))
				.andReturn(Arrays.asList(processEvent));

		this.issueCreator.issue(processEvent, AmaltheaPackage.eINSTANCE.getProcessEvent_Entity(),
				processEvent.getName(), "Entity (i.e. Runnable)");

		this.issueCreator.issue(processEvent, AmaltheaPackage.eINSTANCE.getProcessEvent_Core(), processEvent.getName(),
				"Core");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}


	/*
	 *
	 *
	 *
	 * Runnable Event
	 */


	/**
	 * Test for validation method {@link EventModelCheckValidator#checkRunnableEventConstraint(eventModel)}
	 */
	@Test
	public void testRunnableEvent_CompleteMappingInfo() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final RunnableEvent runnableEvent = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		runnableEvent.setName("TestRunnableEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		runnableEvent.setEntity(runnable);
		runnableEvent.setProcess(process);
		runnableEvent.setCore(core);

		eventModel.getEvents().add(runnableEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, RunnableEvent.class))
				.andReturn(Arrays.asList(runnableEvent));

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkRunnableEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkRunnableEventConstraint(eventModel)}
	 */
	@Test
	public void testRunnableEvent_MissingEntity() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final RunnableEvent runnableEvent = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		runnableEvent.setName("TestRunnableEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		runnableEvent.setProcess(process);
		runnableEvent.setCore(core);

		eventModel.getEvents().add(runnableEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, RunnableEvent.class))
				.andReturn(Arrays.asList(runnableEvent));

		this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Entity(),
				runnableEvent.getName(), "Entity (i.e. Runnable)");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkRunnableEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkRunnableEventConstraint(eventModel)}
	 */
	@Test
	public void testRunnableEvent_MissingProcess() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final RunnableEvent runnableEvent = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		runnableEvent.setName("TestRunnableEvent");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		runnableEvent.setEntity(runnable);
		runnableEvent.setCore(core);

		eventModel.getEvents().add(runnableEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, RunnableEvent.class))
				.andReturn(Arrays.asList(runnableEvent));

		this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Process(),
				runnableEvent.getName(), "Process (i.e. Task)");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkRunnableEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkRunnableEventConstraint(eventModel)}
	 */
	@Test
	public void testRunnableEvent_MissingCore() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final RunnableEvent runnableEvent = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		runnableEvent.setName("TestRunnableEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		runnableEvent.setEntity(runnable);
		runnableEvent.setProcess(process);

		eventModel.getEvents().add(runnableEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, RunnableEvent.class))
				.andReturn(Arrays.asList(runnableEvent));

		this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Core(),
				runnableEvent.getName(), "Core");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkRunnableEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkRunnableEventConstraint(eventModel)}
	 */
	@Test
	public void testRunnableEvent_MissingAll() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final RunnableEvent runnableEvent = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		runnableEvent.setName("TestRunnableEvent");

		eventModel.getEvents().add(runnableEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, RunnableEvent.class))
				.andReturn(Arrays.asList(runnableEvent));

		this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Core(),
				runnableEvent.getName(), "Core");

		this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Process(),
				runnableEvent.getName(), "Process (i.e. Task)");

		this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Entity(),
				runnableEvent.getName(), "Entity (i.e. Runnable)");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkRunnableEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/*
	 *
	 *
	 *
	 * Semaphore Event
	 */


	/**
	 * Test for validation method {@link EventModelCheckValidator#checkSemaphoreEventConstraint(eventModel)}
	 */
	@Test
	public void testSemaphoreEvent_CompleteMappingInfo() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		semaphoreEvent.setName("TestSemaphoreEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		semaphore.setName("TestSemaphore");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		semaphoreEvent.setEntity(semaphore);
		semaphoreEvent.setProcess(process);
		semaphoreEvent.setRunnable(runnable);
		semaphoreEvent.setCore(core);

		eventModel.getEvents().add(semaphoreEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, SemaphoreEvent.class))
				.andReturn(Arrays.asList(semaphoreEvent));

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkSemaphoreEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkSemaphoreEventConstraint(eventModel)}
	 */
	@Test
	public void testSemaphoreEvent_MissingEntity() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		semaphoreEvent.setName("TestSemaphoreEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		semaphoreEvent.setProcess(process);
		semaphoreEvent.setRunnable(runnable);
		semaphoreEvent.setCore(core);

		eventModel.getEvents().add(semaphoreEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, SemaphoreEvent.class))
				.andReturn(Arrays.asList(semaphoreEvent));

		this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Entity(),
				semaphoreEvent.getName(), "Entity (i.e. Semaphore)");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkSemaphoreEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkSemaphoreEventConstraint(eventModel)}
	 */
	@Test
	public void testSemaphoreEvent_MissingCore() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		semaphoreEvent.setName("TestSemaphoreEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		semaphore.setName("TestSemaphore");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		semaphoreEvent.setEntity(semaphore);
		semaphoreEvent.setProcess(process);
		semaphoreEvent.setRunnable(runnable);

		eventModel.getEvents().add(semaphoreEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, SemaphoreEvent.class))
				.andReturn(Arrays.asList(semaphoreEvent));

		this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Core(),
				semaphoreEvent.getName(), "Core");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkSemaphoreEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkSemaphoreEventConstraint(eventModel)}
	 */
	@Test
	public void testSemaphoreEvent_MissingProcess() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		semaphoreEvent.setName("TestSemaphoreEvent");

		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		semaphore.setName("TestSemaphore");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable.setName("TestRunnable");

		semaphoreEvent.setEntity(semaphore);
		semaphoreEvent.setRunnable(runnable);
		semaphoreEvent.setCore(core);

		eventModel.getEvents().add(semaphoreEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, SemaphoreEvent.class))
				.andReturn(Arrays.asList(semaphoreEvent));

		this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Process(),
				semaphoreEvent.getName(), "Process (i.e. Task)");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkSemaphoreEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkSemaphoreEventConstraint(eventModel)}
	 */
	@Test
	public void testSemaphoreEvent_MissingRunnable() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		semaphoreEvent.setName("TestSemaphoreEvent");

		final Process process = AmaltheaFactory.eINSTANCE.createTask();
		process.setName("TestProcessAsTask");

		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		semaphore.setName("TestSemaphore");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		semaphoreEvent.setEntity(semaphore);
		semaphoreEvent.setProcess(process);
		semaphoreEvent.setCore(core);

		eventModel.getEvents().add(semaphoreEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, SemaphoreEvent.class))
				.andReturn(Arrays.asList(semaphoreEvent));

		this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Runnable(),
				semaphoreEvent.getName(), "Runnable");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkSemaphoreEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkSemaphoreEventConstraint(eventModel)}
	 */
	@Test
	public void testSemaphoreEvent_MissingAll() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		semaphoreEvent.setName("TestSemaphoreEvent");

		eventModel.getEvents().add(semaphoreEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, SemaphoreEvent.class))
				.andReturn(Arrays.asList(semaphoreEvent));

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkSemaphoreEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}


	/*
	 *
	 *
	 *
	 * Stimulus Event
	 */


	/**
	 * Test for validation method {@link EventModelCheckValidator#checkStimulusEventConstraint(eventModel)}
	 */
	@Test
	public void testStimulusEvent_CompleteMappingInfo() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final StimulusEvent stimulusEvent = AmaltheaFactory.eINSTANCE.createStimulusEvent();
		stimulusEvent.setName("TestStimulusEvent");

		final Stimulus stimulus = AmaltheaFactory.eINSTANCE.createSingle();
		stimulus.setName("TestStimulus");
		stimulusEvent.setEntity(stimulus);

		eventModel.getEvents().add(stimulusEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, StimulusEvent.class))
				.andReturn(Arrays.asList(stimulusEvent));

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkStimulusEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link EventModelCheckValidator#checkStimulusEventConstraint(eventModel)}
	 */
	@Test
	public void testStimulusEvent_MissingEntity() {

		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final StimulusEvent stimulusEvent = AmaltheaFactory.eINSTANCE.createStimulusEvent();
		stimulusEvent.setName("TestStimulusEvent");

		eventModel.getEvents().add(stimulusEvent);

		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(eventModel, StimulusEvent.class))
				.andReturn(Arrays.asList(stimulusEvent));

		this.issueCreator.issue(stimulusEvent, AmaltheaPackage.eINSTANCE.getStimulusEvent_Entity(),
				stimulusEvent.getName(), "Entity (i.e. Periodic, Inter Process, ...)");

		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkStimulusEventConstraint(eventModel);

		EasyMock.verify(this.eObjectHelper);
	}
}
