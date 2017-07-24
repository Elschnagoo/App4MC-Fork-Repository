/*******************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import java.math.BigInteger;

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.ServerCall;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.SWModelValidator;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

public class SWModelValidatorTests {

	private SWModelValidatorImpl classUnderTest;

	private IssueCreator issueCreator;

	@Before
	public void setUp() {
		/*
		 * Create mock of dependency class
		 */
		this.issueCreator = EasyMock.createMock(IssueCreator.class);
		// this.eObjectHelper = EasyMock.createMock(EObjectHelper.class);

		/*
		 * Create object from class to be tested
		 */
		this.classUnderTest = new SWModelValidatorImpl(this.issueCreator/*, this.eObjectHelper*/);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkLabelSize(AMALTHEA)}
	 */
	@Test
	public void test_checkLabelSize_unset() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Label label = AmaltheaFactory.eINSTANCE.createLabel();

		swModel.getLabels().add(label);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkLabelSize(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkLabelSize(AMALTHEA)}
	 */
	@Test
	public void test_checkLabelSize_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		final DataSize size = null;

		label.setSize(size);
		swModel.getLabels().add(label);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkLabelSize(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkLabelSize(AMALTHEA)}
	 */
	@Test
	public void test_checkLabelSize_negativeValue() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		final DataSize size = AmaltheaFactory.eINSTANCE.createDataSize();
		final BigInteger value = new BigInteger("-10");

		size.setUnit(DataSizeUnit.BIT);
		size.setValue(value);
		label.setSize(size);
		swModel.getLabels().add(label);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Size());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkLabelSize(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkLabelSize(AMALTHEA)}
	 */
	@Test
	public void test_checkLabelSize_zeroValue() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		final DataSize size = AmaltheaFactory.eINSTANCE.createDataSize();
		final BigInteger value = new BigInteger("0");

		size.setUnit(DataSizeUnit.BIT);
		size.setValue(value);
		label.setSize(size);
		swModel.getLabels().add(label);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Size());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkLabelSize(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkLabelSize(AMALTHEA)}
	 */
	@Test
	public void test_checkLabelSize_positiveValue() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		final DataSize size = AmaltheaFactory.eINSTANCE.createDataSize();
		final BigInteger value = new BigInteger("10");

		size.setUnit(DataSizeUnit.BIT);
		size.setValue(value);
		label.setSize(size);
		swModel.getLabels().add(label);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkLabelSize(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkLabelSize(AMALTHEA)}
	 */
	@Test
	public void test_checkLabelSize_unsetValue() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		final DataSize size = AmaltheaFactory.eINSTANCE.createDataSize();
		
		size.setUnit(DataSizeUnit.BIT);
		label.setSize(size);
		swModel.getLabels().add(label);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Size());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);
		
		// test
		this.classUnderTest.checkLabelSize(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkLabelSize(AMALTHEA)}
	 */
	@Test
	public void test_checkLabelSize_undefinedUnit() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Label label = AmaltheaFactory.eINSTANCE.createLabel();
		final DataSize size = AmaltheaFactory.eINSTANCE.createDataSize();
		final BigInteger value = new BigInteger("10");

		size.setUnit(DataSizeUnit._UNDEFINED_);
		size.setValue(value);
		label.setSize(size);
		swModel.getLabels().add(label);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Size());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkLabelSize(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableReferenceOfTaskRunnableCall(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableReferenceOfTaskRunnableCall_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final TaskRunnableCall runnableCall = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();

		callSequence.getCalls().add(runnableCall);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(runnableCall, AmaltheaPackage.eINSTANCE.getTaskRunnableCall_Runnable());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableReferenceOfTaskRunnableCall(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableReferenceOfTaskRunnableCall(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableReferenceOfTaskRunnableCall_notExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final TaskRunnableCall runnableCall = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();

		runnableCall.setRunnable(runnable);
		callSequence.getCalls().add(runnableCall);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(runnableCall, AmaltheaPackage.eINSTANCE.getTaskRunnableCall_Runnable());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableReferenceOfTaskRunnableCall(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableReferenceOfTaskRunnableCall(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableReferenceOfTaskRunnableCall_existing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final TaskRunnableCall runnableCall = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();

		runnableCall.setRunnable(runnable);
		callSequence.getCalls().add(runnableCall);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getRunnables().add(runnable);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableReferenceOfTaskRunnableCall(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableReferenceOfRunnableCall(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableReferenceOfRunnableCall_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final RunnableCall runnableCall = AmaltheaFactory.eINSTANCE.createRunnableCall();

		runnable.getRunnableCalls().add(runnableCall);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(runnableCall, AmaltheaPackage.eINSTANCE.getRunnableCall_Runnable());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableReferenceOfRunnableCall(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableReferenceOfRunnableCall(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableReferenceOfRunnableCall_notExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Runnable runnable2 = AmaltheaFactory.eINSTANCE.createRunnable();
		final RunnableCall runnableCall = AmaltheaFactory.eINSTANCE.createRunnableCall();

		runnableCall.setRunnable(runnable2);
		runnable.getRunnableCalls().add(runnableCall);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(runnableCall, AmaltheaPackage.eINSTANCE.getRunnableCall_Runnable());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableReferenceOfRunnableCall(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableReferenceOfRunnableCall(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableReferenceOfRunnableCall_existing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Runnable runnable2 = AmaltheaFactory.eINSTANCE.createRunnable();
		final RunnableCall runnableCall = AmaltheaFactory.eINSTANCE.createRunnableCall();

		runnableCall.setRunnable(runnable2);
		runnable.getRunnableCalls().add(runnableCall);
		swModel.getRunnables().add(runnable);
		swModel.getRunnables().add(runnable2);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableReferenceOfRunnableCall(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableReferenceOfRunnableCall(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableReferenceOfRunnableCall_selfReference() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final RunnableCall runnableCall = AmaltheaFactory.eINSTANCE.createRunnableCall();

		runnableCall.setRunnable(runnable);
		runnable.getRunnableCalls().add(runnableCall);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(runnableCall, AmaltheaPackage.eINSTANCE.getRunnableCall_Runnable());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableReferenceOfRunnableCall(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkOsEventReferenceOfEventMask(AMALTHEA)}
	 */
	@Test
	public void test_checkOsEventReferenceOfEventMask_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final SetEvent setEvent = AmaltheaFactory.eINSTANCE.createSetEvent();
		final EventMask eventMask = AmaltheaFactory.eINSTANCE.createEventMask();

		setEvent.setEventMask(eventMask);
		callSequence.getCalls().add(setEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(eventMask, AmaltheaPackage.eINSTANCE.getEventMask_Events());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkOsEventReferenceOfEventMask(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkOsEventReferenceOfEventMask(AMALTHEA)}
	 */
	@Test
	public void test_checkOsEventReferenceOfEventMask_notExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final SetEvent setEvent = AmaltheaFactory.eINSTANCE.createSetEvent();
		final OsEvent event = AmaltheaFactory.eINSTANCE.createOsEvent();
		final EventMask eventMask = AmaltheaFactory.eINSTANCE.createEventMask();

		eventMask.getEvents().add(event);
		setEvent.setEventMask(eventMask);
		callSequence.getCalls().add(setEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(eventMask, AmaltheaPackage.eINSTANCE.getEventMask_Events());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkOsEventReferenceOfEventMask(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkOsEventReferenceOfEventMask(AMALTHEA)}
	 */
	@Test
	public void test_checkOsEventReferenceOfEventMask_existing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final SetEvent setEvent = AmaltheaFactory.eINSTANCE.createSetEvent();
		final OsEvent event = AmaltheaFactory.eINSTANCE.createOsEvent();
		final EventMask eventMask = AmaltheaFactory.eINSTANCE.createEventMask();

		eventMask.getEvents().add(event);
		setEvent.setEventMask(eventMask);
		callSequence.getCalls().add(setEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getEvents().add(event);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkOsEventReferenceOfEventMask(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkEventMaskEvents(AMALTHEA)}
	 */
	@Test
	public void test_checkEventMaskEvents_invalid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final WaitEvent waitEvent = AmaltheaFactory.eINSTANCE.createWaitEvent();
		final OsEvent event = AmaltheaFactory.eINSTANCE.createOsEvent();
		final EventMask eventMask = AmaltheaFactory.eINSTANCE.createEventMask();

		eventMask.getEvents().add(event);
		waitEvent.setEventMask(eventMask);
		callSequence.getCalls().add(waitEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getEvents().add(event);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkOsEventReferenceOfEventMask(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkEventMaskEvents(AMALTHEA)}
	 */
	@Test
	public void test_checkEventMaskEvents_valid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final WaitEvent waitEvent = AmaltheaFactory.eINSTANCE.createWaitEvent();
		final SetEvent setEvent = AmaltheaFactory.eINSTANCE.createSetEvent();
		final OsEvent event = AmaltheaFactory.eINSTANCE.createOsEvent();
		final EventMask eventMask = AmaltheaFactory.eINSTANCE.createEventMask();

		eventMask.getEvents().add(event);
		waitEvent.setEventMask(eventMask);
		setEvent.setEventMask(eventMask);
		callSequence.getCalls().add(waitEvent);
		callSequence.getCalls().add(setEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getEvents().add(event);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkOsEventReferenceOfEventMask(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeSwitchValueProvider(AMALTHEA)}
	 */
	@Test
	public void test_checkModeSwitchValueProvider_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();

		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(modeSwitch, AmaltheaPackage.eINSTANCE.getModeSwitch_ValueProvider());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeSwitchValueProvider(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeSwitchValueProvider(AMALTHEA)}
	 */
	@Test
	public void test_checkModeSwitchValueProvider_notExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();

		modeSwitch.setValueProvider(modeLabel);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(modeSwitch, AmaltheaPackage.eINSTANCE.getModeSwitch_ValueProvider());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeSwitchValueProvider(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeSwitchValueProvider(AMALTHEA)}
	 */
	@Test
	public void test_checkModeSwitchValueProvider_existing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();

		modeSwitch.setValueProvider(modeLabel);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getModeLabels().add(modeLabel);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeSwitchValueProvider(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeSwitchEntryValue1(AMALTHEA)}
	 */
	@Test
	public void test_checkModeSwitchEntryValue_once() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeSwitchEntry<GraphEntryBase> modeSwitchEntry = AmaltheaFactory.eINSTANCE.createModeSwitchEntry();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();

		mode.getLiterals().add(modeLiteral);
		swModel.getModes().add(mode);
		EList<ModeLiteral> valueList = modeSwitchEntry.getValues();
		valueList.add(modeLiteral);
		modeSwitch.getEntries().add(modeSwitchEntry);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeSwitchEntryValue1(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeSwitchEntryValue1(AMALTHEA)}
	 */
	@Test
	public void test_checkModeSwitchEntryValue_twice() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeSwitchEntry<GraphEntryBase> modeSwitchEntry1 = AmaltheaFactory.eINSTANCE.createModeSwitchEntry();
		final ModeSwitchEntry<GraphEntryBase> modeSwitchEntry2 = AmaltheaFactory.eINSTANCE.createModeSwitchEntry();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();

		mode.getLiterals().add(modeLiteral);
		swModel.getModes().add(mode);
		EList<ModeLiteral> valueList1 = modeSwitchEntry1.getValues();
		valueList1.add(modeLiteral);
		modeSwitch.getEntries().add(modeSwitchEntry1);
		EList<ModeLiteral> valueList2 = modeSwitchEntry2.getValues();
		valueList2.add(modeLiteral);
		modeSwitch.getEntries().add(modeSwitchEntry2);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(modeSwitchEntry1, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());
		this.issueCreator.issue(modeSwitchEntry2, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeSwitchEntryValue1(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeSwitchEntryValue2(AMALTHEA)}
	 */
	@Test
	public void test_checkModeValueProviderValue_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeSwitchEntry<GraphEntryBase> modeSwitchEntry = AmaltheaFactory.eINSTANCE.createModeSwitchEntry();

		modeSwitch.getEntries().add(modeSwitchEntry);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(modeSwitchEntry, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeSwitchEntryValue2(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeSwitchEntryValue2(AMALTHEA)}
	 */
	// @Test is no longer necessary: mode is always correct if initial value is set
	public void test_checkModeValueProviderValue_notExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeSwitchEntry<GraphEntryBase> modeSwitchEntry = AmaltheaFactory.eINSTANCE.createModeSwitchEntry();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		//final Mode mode = AmaltheaFactory.eINSTANCE.createMode();

		//modeLabel.setMode(mode);
		EList<ModeLiteral> valueList = modeSwitchEntry.getValues(); 
		valueList.add(modeLiteral);
		modeSwitch.setValueProvider(modeLabel);
		modeSwitch.getEntries().add(modeSwitchEntry);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(modeSwitchEntry, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeSwitchEntryValue2(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelMode(AMALTHEA)}
	 */
	@Test
	public void test_checkModeValueProviderMode_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();

		modeSwitch.setValueProvider(modeLabel);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(modeLabel, AmaltheaPackage.eINSTANCE.getModeLabel_Mode());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelMode(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelMode(AMALTHEA)}
	 */
	@Test
	public void test_checkModeValueProviderMode_notExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		//final Mode mode = AmaltheaFactory.eINSTANCE.createMode();

		//modeLabel.setMode(mode);
		modeSwitch.setValueProvider(modeLabel);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(modeLabel, AmaltheaPackage.eINSTANCE.getModeLabel_Mode());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelMode(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelMode(AMALTHEA)}
	 */
	// @Test is no longer necessary: mode is always correct if initial value is set
	public void test_checkModeLabelMode_existing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();

		//modeLabel.setMode(mode);
		modeSwitch.setValueProvider(modeLabel);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		swModel.getModes().add(mode);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelMode(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelInitialValue(AMALTHEA)}
	 */
	// @Test is no longer necessary: mode is always correct if initial value is set
	public void test_checkModeLabelInitialValue_invalid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();

		modeLabel.setInitialValue(modeLiteral);
		//modeLabel.setMode(mode);
		modeSwitch.setValueProvider(modeLabel);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		swModel.getModes().add(mode);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(modeLabel, AmaltheaPackage.eINSTANCE.getModeLabel_InitialValue());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelInitialValue(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelInitialValue(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLabelInitialValue_valid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final ModeSwitch modeSwitch = AmaltheaFactory.eINSTANCE.createModeSwitch();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();

		modeLabel.setInitialValue(modeLiteral);
		mode.getLiterals().add(modeLiteral);
		// modeLabel.setMode(mode);
		modeSwitch.setValueProvider(modeLabel);
		callGraph.getGraphEntries().add(modeSwitch);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		swModel.getModes().add(mode);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelInitialValue(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkCounterOffset(AMALTHEA)}
	 */
	@Test
	public void test_checkCounterOffset_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final ClearEvent clearEvent = AmaltheaFactory.eINSTANCE.createClearEvent();
		final Counter counter = AmaltheaFactory.eINSTANCE.createCounter();

		clearEvent.setCounter(counter);
		callSequence.getCalls().add(clearEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(counter, AmaltheaPackage.eINSTANCE.getCounter_Offset());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkCounterOffset(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkCounterOffset(AMALTHEA)}
	 */
	@Test
	public void test_checkCounterOffset_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final ClearEvent clearEvent = AmaltheaFactory.eINSTANCE.createClearEvent();
		final Counter counter = AmaltheaFactory.eINSTANCE.createCounter();
		final long offset = -1;

		counter.setOffset(offset);
		clearEvent.setCounter(counter);
		callSequence.getCalls().add(clearEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(counter, AmaltheaPackage.eINSTANCE.getCounter_Offset());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkCounterOffset(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkCounterOffset(AMALTHEA)}
	 */
	@Test
	public void test_checkCounterOffset_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final ClearEvent clearEvent = AmaltheaFactory.eINSTANCE.createClearEvent();
		final Counter counter = AmaltheaFactory.eINSTANCE.createCounter();
		final long offset = 0;

		counter.setOffset(offset);
		clearEvent.setCounter(counter);
		callSequence.getCalls().add(clearEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(counter, AmaltheaPackage.eINSTANCE.getCounter_Offset());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkCounterOffset(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkCounterOffset(AMALTHEA)}
	 */
	@Test
	public void test_checkCounterOffset_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final ClearEvent clearEvent = AmaltheaFactory.eINSTANCE.createClearEvent();
		final Counter counter = AmaltheaFactory.eINSTANCE.createCounter();
		final long offset = 1;

		counter.setOffset(offset);
		clearEvent.setCounter(counter);
		callSequence.getCalls().add(clearEvent);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkCounterOffset(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkServerRunnableServerCall(AMALTHEA)}
	 */
	@Test
	public void test_checkCounterOffset_Null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ServerCall serverCall = AmaltheaFactory.eINSTANCE.createSynchronousServerCall();

		runnable.getRunnableItems().add(serverCall);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkServerCallServerRunnable(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkServerRunnableServerCall(AMALTHEA)}
	 */
	@Test
	public void test_checkCounterOffset_NotExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ServerCall serverCall = AmaltheaFactory.eINSTANCE.createSynchronousServerCall();
		final Runnable serverRunnable = AmaltheaFactory.eINSTANCE.createRunnable();

		serverCall.setServerRunnable(serverRunnable);
		runnable.getRunnableItems().add(serverCall);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkServerCallServerRunnable(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkServerRunnableServerCall(AMALTHEA)}
	 */
	@Test
	public void test_checkCounterOffset_SelfReference() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ServerCall serverCall = AmaltheaFactory.eINSTANCE.createSynchronousServerCall();

		serverCall.setServerRunnable(runnable);
		runnable.getRunnableItems().add(serverCall);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkServerCallServerRunnable(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link SWModelValidator#checkServerRunnableServerCall(AMALTHEA)}
	 */
	@Test
	public void test_checkCounterOffset_Existing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ServerCall serverCall = AmaltheaFactory.eINSTANCE.createSynchronousServerCall();
		final Runnable serverRunnable = AmaltheaFactory.eINSTANCE.createRunnable();

		serverCall.setServerRunnable(serverRunnable);
		runnable.getRunnableItems().add(serverCall);
		swModel.getRunnables().add(runnable);
		swModel.getRunnables().add(serverRunnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkServerCallServerRunnable(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkEnforcedMigrationResourceOwner(AMALTHEA)}
	 */
	@Test
	public void test_checkEnforcedMigrationResourceOwner_Null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final EnforcedMigration enforcedMigration = AmaltheaFactory.eINSTANCE.createEnforcedMigration();

		enforcedMigration.setResourceOwner(null);
		callSequence.getCalls().add(enforcedMigration);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(enforcedMigration, AmaltheaPackage.eINSTANCE.getEnforcedMigration_ResourceOwner());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEnforcedMigrationResourceOwner(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkEnforcedMigrationResourceOwner(AMALTHEA)}
	 */
	@Test
	public void test_checkEnforcedMigrationResourceOwner_Unset() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final EnforcedMigration enforcedMigration = AmaltheaFactory.eINSTANCE.createEnforcedMigration();

		callSequence.getCalls().add(enforcedMigration);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(enforcedMigration, AmaltheaPackage.eINSTANCE.getEnforcedMigration_ResourceOwner());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEnforcedMigrationResourceOwner(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkEnforcedMigrationResourceOwner(AMALTHEA)}
	 */
	@Test
	public void test_checkEnforcedMigrationResourceOwner_Invalid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final EnforcedMigration enforcedMigration = AmaltheaFactory.eINSTANCE.createEnforcedMigration();
		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();

		enforcedMigration.setResourceOwner(taskScheduler);
		callSequence.getCalls().add(enforcedMigration);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(enforcedMigration, AmaltheaPackage.eINSTANCE.getEnforcedMigration_ResourceOwner());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEnforcedMigrationResourceOwner(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkEnforcedMigrationResourceOwner(AMALTHEA)}
	 */
	@Test
	public void test_checkEnforcedMigrationResourceOwner_Valid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final CallGraph callGraph = AmaltheaFactory.eINSTANCE.createCallGraph();
		final CallSequence callSequence = AmaltheaFactory.eINSTANCE.createCallSequence();
		final EnforcedMigration enforcedMigration = AmaltheaFactory.eINSTANCE.createEnforcedMigration();
		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();

		os.getTaskSchedulers().add(taskScheduler);
		osModel.getOperatingSystems().add(os);
		amalthea.setOsModel(osModel);
		
		enforcedMigration.setResourceOwner(taskScheduler);
		callSequence.getCalls().add(enforcedMigration);
		callGraph.getGraphEntries().add(callSequence);
		task.setCallGraph(callGraph);
		swModel.getTasks().add(task);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEnforcedMigrationResourceOwner(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableDeadlineUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableDeadlineUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Time deadline = null;
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.setDeadline(deadline);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableDeadlineUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableDeadlineUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableDeadlineUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Time deadline = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.setDeadline(deadline);
		deadline.setValue(value);
		deadline.setUnit(unit);
		
		this.issueCreator.issue(deadline, AmaltheaPackage.eINSTANCE.getRunnable_Deadline(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableDeadlineUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableDeadlineUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableDeadlineUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Time deadline = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.setDeadline(deadline);
		deadline.setValue(value);
		deadline.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableDeadlineUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkRunnableDeadlineUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRunnableDeadlineUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Time deadline = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.setDeadline(deadline);
		deadline.setValue(value);
		deadline.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableDeadlineUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationMinUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationMinUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time min = null;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setMin(min);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationMinUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationMinUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationMinUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time min = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setMin(min);
		min.setValue(value);
		min.setUnit(unit);
		
		this.issueCreator.issue(min, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Min(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationMinUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationMinUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationMinUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time min = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setMin(min);
		min.setValue(value);
		min.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRunnableDeadlineUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationMinUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationMinUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time min = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setMin(min);
		min.setValue(value);
		min.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationMinUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationMaxUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationMaxUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time max = null;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setMax(max);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationMaxUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationMaxUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationMaxUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time max = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setMax(max);
		max.setValue(value);
		max.setUnit(unit);
		
		this.issueCreator.issue(max, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Max(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationMaxUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationMaxUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationMaxUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time max = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setMax(max);
		max.setValue(value);
		max.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationMaxUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationMaxUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationMaxUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time max = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setMax(max);
		max.setValue(value);
		max.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationMaxUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationOffsetUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationOffsetUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time offset = null;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setOffset(offset);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationOffsetUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationOffsetUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationOffsetUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time offset = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setOffset(offset);
		offset.setValue(value);
		offset.setUnit(unit);
		
		this.issueCreator.issue(offset, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Offset(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationOffsetUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationOffsetUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationOffsetUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time offset = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setOffset(offset);
		offset.setValue(value);
		offset.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationOffsetUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkPeriodicActivationOffsetUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicActivationOffsetUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final PeriodicActivation periodicActivation = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		final Time offset = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(periodicActivation);
		periodicActivation.setOffset(offset);
		offset.setValue(value);
		offset.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicActivationOffsetUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkSingleActivationMinUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSingleActivationMinUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final SingleActivation singleActivation = AmaltheaFactory.eINSTANCE.createSingleActivation();
		final Time min = null;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(singleActivation);
		singleActivation.setMin(min);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSingleActivationMinUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkSingleActivationMinUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSingleActivationMinUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final SingleActivation singleActivation = AmaltheaFactory.eINSTANCE.createSingleActivation();
		final Time min = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(singleActivation);
		singleActivation.setMin(min);
		min.setValue(value);
		min.setUnit(unit);
		
		this.issueCreator.issue(min, AmaltheaPackage.eINSTANCE.getSingleActivation_Min(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSingleActivationMinUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkSingleActivationMinUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSingleActivationMinUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final SingleActivation singleActivation = AmaltheaFactory.eINSTANCE.createSingleActivation();
		final Time min = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(singleActivation);
		singleActivation.setMin(min);
		min.setValue(value);
		min.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSingleActivationMinUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkSingleActivationMinUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSingleActivationMinUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final SingleActivation singleActivation = AmaltheaFactory.eINSTANCE.createSingleActivation();
		final Time min = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(singleActivation);
		singleActivation.setMin(min);
		min.setValue(value);
		min.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSingleActivationMinUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkSingleActivationMaxUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSingleActivationMaxUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final SingleActivation singleActivation = AmaltheaFactory.eINSTANCE.createSingleActivation();
		final Time max = null;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(singleActivation);
		singleActivation.setMax(max);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSingleActivationMaxUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkSingleActivationMaxUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSingleActivationMaxUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final SingleActivation singleActivation = AmaltheaFactory.eINSTANCE.createSingleActivation();
		final Time max = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(singleActivation);
		singleActivation.setMax(max);
		max.setValue(value);
		max.setUnit(unit);
		
		this.issueCreator.issue(max, AmaltheaPackage.eINSTANCE.getSingleActivation_Max(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSingleActivationMaxUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkSingleActivationMaxUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSingleActivationMaxUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final SingleActivation singleActivation = AmaltheaFactory.eINSTANCE.createSingleActivation();
		final Time max = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(singleActivation);
		singleActivation.setMax(max);
		max.setValue(value);
		max.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSingleActivationMaxUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkSingleActivationMaxUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSingleActivationMaxUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final SingleActivation singleActivation = AmaltheaFactory.eINSTANCE.createSingleActivation();
		final Time max = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setSwModel(swModel);
		swModel.getActivations().add(singleActivation);
		singleActivation.setMax(max);
		max.setValue(value);
		max.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSingleActivationMaxUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelAccessModeEqual(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLabelAccessModeEqual_ValueNull() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ModeLabelAccess modeLabelAccess = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(modeLabelAccess);
		modeLabelAccess.setData(modeLabel);
		modeLabelAccess.setModeValue(null);
		modeLabel.setInitialValue(modeLiteral);
		mode.getLiterals().add(modeLiteral);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelAccessModeEqual(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelAccessModeEqual(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLabelAccessModeEqual_DataNull() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ModeLabelAccess modeLabelAccess = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(modeLabelAccess);
		modeLabelAccess.setData(null);
		mode.getLiterals().add(modeLiteral);
		modeLabelAccess.setModeValue(modeLiteral);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelAccessModeEqual(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelAccessModeEqual(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLabelAccessModeEqual_DataModeNull() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ModeLabelAccess modeLabelAccess = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(modeLabelAccess);
		modeLabelAccess.setAccess(LabelAccessEnum.READ);
		modeLabelAccess.setData(modeLabel);
		mode.getLiterals().add(modeLiteral);
		modeLabelAccess.setModeValue(modeLiteral);
		
		this.issueCreator.issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_Data(), null, mode);
		this.issueCreator.issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_ModeValue(), null, mode);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelAccessModeEqual(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelAccessModeEqual(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLabelAccessModeEqual_ValueModeNull() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ModeLabelAccess modeLabelAccess = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral1 = AmaltheaFactory.eINSTANCE.createModeLiteral();
		final ModeLiteral modeLiteral2 = AmaltheaFactory.eINSTANCE.createModeLiteral();
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(modeLabelAccess);
		modeLabelAccess.setAccess(LabelAccessEnum.READ);
		modeLabelAccess.setData(modeLabel);
		modeLabel.setInitialValue(modeLiteral1);
		mode.getLiterals().add(modeLiteral1);
		modeLabelAccess.setModeValue(modeLiteral2);
		
		this.issueCreator.issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_Data(), mode, null);
		this.issueCreator.issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_ModeValue(), mode, null);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelAccessModeEqual(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelAccessModeEqual(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLabelAccessModeEqual_ModeUnequal() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ModeLabelAccess modeLabelAccess = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		final Mode mode1 = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral1 = AmaltheaFactory.eINSTANCE.createModeLiteral();
		final Mode mode2 = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral2 = AmaltheaFactory.eINSTANCE.createModeLiteral();
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(modeLabelAccess);
		modeLabelAccess.setAccess(LabelAccessEnum.READ);
		modeLabelAccess.setData(modeLabel);
		mode1.getLiterals().add(modeLiteral1);
		modeLabel.setInitialValue(modeLiteral1);
		mode2.getLiterals().add(modeLiteral2);
		modeLabelAccess.setModeValue(modeLiteral2);
		
		this.issueCreator.issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_Data(), mode1, mode2);
		this.issueCreator.issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_ModeValue(), mode1, mode2);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelAccessModeEqual(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkModeLabelAccessModeEqual(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLabelAccessModeEqual_ModeEqual() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ModeLabelAccess modeLabelAccess = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		final ModeLabel modeLabel = AmaltheaFactory.eINSTANCE.createModeLabel();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral1 = AmaltheaFactory.eINSTANCE.createModeLiteral();
		final ModeLiteral modeLiteral2 = AmaltheaFactory.eINSTANCE.createModeLiteral();
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(modeLabelAccess);
		modeLabelAccess.setAccess(LabelAccessEnum.READ);
		modeLabelAccess.setData(modeLabel);
		mode.getLiterals().add(modeLiteral1);
		modeLabel.setInitialValue(modeLiteral1);
		mode.getLiterals().add(modeLiteral2);
		modeLabelAccess.setModeValue(modeLiteral2);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLabelAccessModeEqual(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkModeLiteralMode(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLiteralMode_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ModeLabelAccess modeLabelAccess = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(modeLabelAccess);
		modeLabelAccess.setModeValue(modeLiteral);
		
		this.issueCreator.issue(modeLiteral, AmaltheaPackage.eINSTANCE.getMode_Literals());
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLiteralMode(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link SWModelValidator#checkModeLiteralMode(AMALTHEA)}
	 */
	@Test
	public void test_checkModeLiteralMode_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final ModeLabelAccess modeLabelAccess = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		final Mode mode = AmaltheaFactory.eINSTANCE.createMode();
		final ModeLiteral modeLiteral = AmaltheaFactory.eINSTANCE.createModeLiteral();
		
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(modeLabelAccess);
		modeLabelAccess.setAccess(LabelAccessEnum.READ);
		modeLabelAccess.setModeValue(modeLiteral);
		mode.getLiterals().add(modeLiteral);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkModeLiteralMode(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
}
