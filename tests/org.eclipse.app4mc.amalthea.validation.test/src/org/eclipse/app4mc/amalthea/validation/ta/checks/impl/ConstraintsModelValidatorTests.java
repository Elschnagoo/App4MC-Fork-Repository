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

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SignedTime;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.junit.Before;
import org.junit.Test;

public class ConstraintsModelValidatorTests {

	private ConstraintsModelValidatorImpl classUnderTest;

	private IssueCreator issueCreator;

	@Before
	public void setUp() {
		/*
		 * Create mock of dependency class
		 */
		this.issueCreator = EasyMock.createMock(IssueCreator.class);
		//this.eObjectHelper = EasyMock.createMock(EObjectHelper.class);

		/*
		 * Create object from class to be tested
		 */
		this.classUnderTest = new ConstraintsModelValidatorImpl(this.issueCreator/* , this.objectHelper */);
	}

	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEDFDeadlineAvailability(AMALTHEA)}
	 */
	@Test
	public void test_checkEDFDeadlineAvailability_missing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final OperatingSystem operatingSystem = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		EarliestDeadlineFirst edf = AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst();
		
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		String name = "hello";
		
		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
		final TaskAllocation taskAllocation = AmaltheaFactory.eINSTANCE.createTaskAllocation();

		amalthea.setOsModel(osModel);
		osModel.getOperatingSystems().add(operatingSystem);
		operatingSystem.getTaskSchedulers().add(taskScheduler);
		taskScheduler.setSchedulingAlgorithm(edf);
		
		amalthea.setSwModel(swModel);
		swModel.getTasks().add(task);
		task.setName(name);
		
		amalthea.setMappingModel(mappingModel);
		mappingModel.getTaskAllocation().add(taskAllocation);
		taskAllocation.setScheduler(taskScheduler);
		taskAllocation.setTask(task);

		this.issueCreator.issue(task, null, name);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEDFDeadlineAvailability(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEDFDeadlineAvailability(AMALTHEA)}
	 */
	@Test
	public void test_checkEDFDeadlineAvailability_available() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final OperatingSystem operatingSystem = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		EarliestDeadlineFirst edf = AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst();
		
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		String name = "hello";
		
		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
		final TaskAllocation taskAllocation = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final ProcessRequirement processRequirement = AmaltheaFactory.eINSTANCE.createProcessRequirement();
		final TimeRequirementLimit limit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		final SignedTime time = AmaltheaFactory.eINSTANCE.createSignedTime();
		final LimitType limitType = LimitType.UPPER_LIMIT;
		final TimeMetric metric = TimeMetric.RESPONSE_TIME;
		final int value = 10;
		final TimeUnit unit = TimeUnit.MS;

		amalthea.setOsModel(osModel);
		osModel.getOperatingSystems().add(operatingSystem);
		operatingSystem.getTaskSchedulers().add(taskScheduler);
		taskScheduler.setSchedulingAlgorithm(edf);
		
		amalthea.setSwModel(swModel);
		swModel.getTasks().add(task);
		task.setName(name);
		
		amalthea.setMappingModel(mappingModel);
		mappingModel.getTaskAllocation().add(taskAllocation);
		taskAllocation.setScheduler(taskScheduler);
		taskAllocation.setTask(task);
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getRequirements().add(processRequirement);
		processRequirement.setProcess(task);
		processRequirement.setLimit(limit);
		limit.setLimitType(limitType);
		limit.setMetric(metric);
		limit.setLimitValue(time);
		time.setValue(value);
		time.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEDFDeadlineAvailability(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDeadlineValue(AMALTHEA)}
	 */
	@Test
	public void test_checkDeadlineValue_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final ProcessRequirement processRequirement = AmaltheaFactory.eINSTANCE.createProcessRequirement();
		final TimeRequirementLimit limit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		final SignedTime time = AmaltheaFactory.eINSTANCE.createSignedTime();
		final LimitType limitType = LimitType.UPPER_LIMIT;
		final TimeMetric metric = TimeMetric.RESPONSE_TIME;
		final int value = -10;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getRequirements().add(processRequirement);
		processRequirement.setLimit(limit);
		limit.setLimitType(limitType);
		limit.setMetric(metric);
		limit.setLimitValue(time);
		time.setValue(value);
		time.setUnit(unit);
		
		this.issueCreator.issue(limit, AmaltheaPackage.eINSTANCE.getTimeRequirementLimit_LimitValue(), value, unit);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeadlineValue(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDeadlineValue(AMALTHEA)}
	 */
	@Test
	public void test_checkDeadlineValue_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final ProcessRequirement processRequirement = AmaltheaFactory.eINSTANCE.createProcessRequirement();
		final TimeRequirementLimit limit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		final SignedTime time = AmaltheaFactory.eINSTANCE.createSignedTime();
		final LimitType limitType = LimitType.UPPER_LIMIT;
		final TimeMetric metric = TimeMetric.RESPONSE_TIME;
		final int value = 0;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getRequirements().add(processRequirement);
		processRequirement.setLimit(limit);
		limit.setLimitType(limitType);
		limit.setMetric(metric);
		limit.setLimitValue(time);
		time.setValue(value);
		time.setUnit(unit);
		
		this.issueCreator.issue(limit, AmaltheaPackage.eINSTANCE.getTimeRequirementLimit_LimitValue(), value, unit);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeadlineValue(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDeadlineValue(AMALTHEA)}
	 */
	@Test
	public void test_checkDeadlineValue_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final ProcessRequirement processRequirement = AmaltheaFactory.eINSTANCE.createProcessRequirement();
		final TimeRequirementLimit limit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		final SignedTime time = AmaltheaFactory.eINSTANCE.createSignedTime();
		final LimitType limitType = LimitType.UPPER_LIMIT;
		final TimeMetric metric = TimeMetric.RESPONSE_TIME;
		final int value = 10;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getRequirements().add(processRequirement);
		processRequirement.setLimit(limit);
		limit.setLimitType(limitType);
		limit.setMetric(metric);
		limit.setLimitValue(time);
		time.setValue(value);
		time.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeadlineValue(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
}
