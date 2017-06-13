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
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.DelayConstraint;
import org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst;
import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.ConstraintsModelValidator;
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
		final Time time = AmaltheaFactory.eINSTANCE.createTime();
		final LimitType limitType = LimitType.UPPER_LIMIT;
		final TimeMetric metric = TimeMetric.RESPONSE_TIME;
		final BigInteger value = BigInteger.TEN;
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
		final Time time = AmaltheaFactory.eINSTANCE.createTime();
		final LimitType limitType = LimitType.UPPER_LIMIT;
		final TimeMetric metric = TimeMetric.RESPONSE_TIME;
		final BigInteger value = BigInteger.valueOf(-10);
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
		final Time time = AmaltheaFactory.eINSTANCE.createTime();
		final LimitType limitType = LimitType.UPPER_LIMIT;
		final TimeMetric metric = TimeMetric.RESPONSE_TIME;
		final BigInteger value = BigInteger.ZERO;
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
		final Time time = AmaltheaFactory.eINSTANCE.createTime();
		final LimitType limitType = LimitType.UPPER_LIMIT;
		final TimeMetric metric = TimeMetric.RESPONSE_TIME;
		final BigInteger value = BigInteger.TEN;
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
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkSynchronizationConstraintToleranceUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSynchronizationConstraintToleranceUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final SynchronizationConstraint synchronizationConstraint = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint();
		final Time tolerance = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(synchronizationConstraint);
		synchronizationConstraint.setTolerance(tolerance);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSynchronizationConstraintToleranceUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkSynchronizationConstraintToleranceUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSynchronizationConstraintToleranceUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final SynchronizationConstraint synchronizationConstraint = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint();
		final Time tolerance = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(synchronizationConstraint);
		synchronizationConstraint.setTolerance(tolerance);
		tolerance.setValue(value);
		tolerance.setUnit(unit);
		
		this.issueCreator.issue(tolerance, AmaltheaPackage.eINSTANCE.getSynchronizationConstraint_Tolerance(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSynchronizationConstraintToleranceUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkSynchronizationConstraintToleranceUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSynchronizationConstraintToleranceUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final SynchronizationConstraint synchronizationConstraint = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint();
		final Time tolerance = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(synchronizationConstraint);
		synchronizationConstraint.setTolerance(tolerance);
		tolerance.setValue(value);
		tolerance.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSynchronizationConstraintToleranceUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkSynchronizationConstraintToleranceUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkSynchronizationConstraintToleranceUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final SynchronizationConstraint synchronizationConstraint = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint();
		final Time tolerance = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(synchronizationConstraint);
		synchronizationConstraint.setTolerance(tolerance);
		tolerance.setValue(value);
		tolerance.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSynchronizationConstraintToleranceUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDelayConstraintUpperUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDelayConstraintUpperUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DelayConstraint delayConstraint = AmaltheaFactory.eINSTANCE.createDelayConstraint();
		final Time upper = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(delayConstraint);
		delayConstraint.setUpper(upper);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDelayConstraintUpperUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDelayConstraintUpperUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDelayConstraintUpperUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DelayConstraint delayConstraint = AmaltheaFactory.eINSTANCE.createDelayConstraint();
		final Time upper = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(delayConstraint);
		delayConstraint.setUpper(upper);
		upper.setValue(value);
		upper.setUnit(unit);
		
		this.issueCreator.issue(upper, AmaltheaPackage.eINSTANCE.getDelayConstraint_Upper(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDelayConstraintUpperUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDelayConstraintUpperUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDelayConstraintUpperUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DelayConstraint delayConstraint = AmaltheaFactory.eINSTANCE.createDelayConstraint();
		final Time upper = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(delayConstraint);
		delayConstraint.setUpper(upper);
		upper.setValue(value);
		upper.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDelayConstraintUpperUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDelayConstraintUpperUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDelayConstraintUpperUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DelayConstraint delayConstraint = AmaltheaFactory.eINSTANCE.createDelayConstraint();
		final Time upper = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(delayConstraint);
		delayConstraint.setUpper(upper);
		upper.setValue(value);
		upper.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDelayConstraintUpperUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDelayConstraintLowerUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDelayConstraintLowerUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DelayConstraint delayConstraint = AmaltheaFactory.eINSTANCE.createDelayConstraint();
		final Time lower = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(delayConstraint);
		delayConstraint.setLower(lower);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDelayConstraintLowerUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDelayConstraintLowerUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDelayConstraintLowerUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DelayConstraint delayConstraint = AmaltheaFactory.eINSTANCE.createDelayConstraint();
		final Time lower = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(delayConstraint);
		delayConstraint.setLower(lower);
		lower.setValue(value);
		lower.setUnit(unit);
		
		this.issueCreator.issue(lower, AmaltheaPackage.eINSTANCE.getDelayConstraint_Lower(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDelayConstraintLowerUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDelayConstraintLowerUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDelayConstraintLowerUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DelayConstraint delayConstraint = AmaltheaFactory.eINSTANCE.createDelayConstraint();
		final Time lower = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(delayConstraint);
		delayConstraint.setUpper(lower);
		lower.setValue(value);
		lower.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDelayConstraintLowerUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDelayConstraintLowerUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDelayConstraintLowerUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DelayConstraint delayConstraint = AmaltheaFactory.eINSTANCE.createDelayConstraint();
		final Time lower = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(delayConstraint);
		delayConstraint.setUpper(lower);
		lower.setValue(value);
		lower.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDelayConstraintLowerUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEventChainLatencyConstraintMinimumUnsinged(AMALTHEA)}
	 */
	@Test
	public void test_checkEventChainLatencyConstraintMinimumUnsinged_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final EventChainLatencyConstraint eventChainLatencyConstraint = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
		final Time minimum = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(eventChainLatencyConstraint);
		eventChainLatencyConstraint.setMinimum(minimum);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEventChainLatencyConstraintMinimumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEventChainLatencyConstraintMinimumUnsinged(AMALTHEA)}
	 */
	@Test
	public void test_checkEventChainLatencyConstraintMinimumUnsinged_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final EventChainLatencyConstraint eventChainLatencyConstraint = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
		final Time minimum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(eventChainLatencyConstraint);
		eventChainLatencyConstraint.setMinimum(minimum);
		minimum.setValue(value);
		minimum.setUnit(unit);
		
		this.issueCreator.issue(minimum, AmaltheaPackage.eINSTANCE.getEventChainLatencyConstraint_Minimum(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEventChainLatencyConstraintMinimumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEventChainLatencyConstraintMinimumUnsinged(AMALTHEA)}
	 */
	@Test
	public void test_checkEventChainLatencyConstraintMinimumUnsinged_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final EventChainLatencyConstraint eventChainLatencyConstraint = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
		final Time minimum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(eventChainLatencyConstraint);
		eventChainLatencyConstraint.setMinimum(minimum);
		minimum.setValue(value);
		minimum.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEventChainLatencyConstraintMinimumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEventChainLatencyConstraintMinimumUnsinged(AMALTHEA)}
	 */
	@Test
	public void test_checkEventChainLatencyConstraintMinimumUnsinged_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final EventChainLatencyConstraint eventChainLatencyConstraint = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
		final Time minimum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(eventChainLatencyConstraint);
		eventChainLatencyConstraint.setMinimum(minimum);
		minimum.setValue(value);
		minimum.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEventChainLatencyConstraintMinimumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEventChainLatencyConstraintMaximumUnsinged(AMALTHEA)}
	 */
	@Test
	public void test_checkEventChainLatencyConstraintMaximumUnsinged_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final EventChainLatencyConstraint eventChainLatencyConstraint = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
		final Time maximum = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(eventChainLatencyConstraint);
		eventChainLatencyConstraint.setMaximum(maximum);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEventChainLatencyConstraintMaximumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEventChainLatencyConstraintMaximumUnsinged(AMALTHEA)}
	 */
	@Test
	public void test_checkEventChainLatencyConstraintMaximumUnsinged_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final EventChainLatencyConstraint eventChainLatencyConstraint = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
		final Time maximum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(eventChainLatencyConstraint);
		eventChainLatencyConstraint.setMaximum(maximum);
		maximum.setValue(value);
		maximum.setUnit(unit);
		
		this.issueCreator.issue(maximum, AmaltheaPackage.eINSTANCE.getEventChainLatencyConstraint_Maximum(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEventChainLatencyConstraintMaximumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEventChainLatencyConstraintMaximumUnsinged(AMALTHEA)}
	 */
	@Test
	public void test_checkEventChainLatencyConstraintMaximumUnsinged_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final EventChainLatencyConstraint eventChainLatencyConstraint = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
		final Time maximum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(eventChainLatencyConstraint);
		eventChainLatencyConstraint.setMinimum(maximum);
		maximum.setValue(value);
		maximum.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEventChainLatencyConstraintMaximumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkEventChainLatencyConstraintMaximumUnsinged(AMALTHEA)}
	 */
	@Test
	public void test_checkEventChainLatencyConstraintMaximumUnsinged_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final EventChainLatencyConstraint eventChainLatencyConstraint = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
		final Time maximum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(eventChainLatencyConstraint);
		eventChainLatencyConstraint.setMaximum(maximum);
		maximum.setValue(value);
		maximum.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkEventChainLatencyConstraintMaximumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintLowerUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintLowerUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time lower = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setLower(lower);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintLowerUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintLowerUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintLowerUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time lower = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setLower(lower);
		lower.setValue(value);
		lower.setUnit(unit);
		
		this.issueCreator.issue(lower, AmaltheaPackage.eINSTANCE.getRepetitionConstraint_Lower(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintLowerUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintLowerUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintLowerUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time lower = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setLower(lower);
		lower.setValue(value);
		lower.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintLowerUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintLowerUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintLowerUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time lower = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setLower(lower);
		lower.setValue(value);
		lower.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintLowerUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintUpperUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintUpperUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time upper = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setUpper(upper);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintUpperUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintUpperUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintUpperUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time upper = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setUpper(upper);
		upper.setValue(value);
		upper.setUnit(unit);
		
		this.issueCreator.issue(upper, AmaltheaPackage.eINSTANCE.getRepetitionConstraint_Upper(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintUpperUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintUpperUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintUpperUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time upper = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setUpper(upper);
		upper.setValue(value);
		upper.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintUpperUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintUpperUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintUpperUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time upper = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setUpper(upper);
		upper.setValue(value);
		upper.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintUpperUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintJitterUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintJitterUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time jitter = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setJitter(jitter);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintJitterUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintJitterUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintJitterUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time jitter = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setJitter(jitter);
		jitter.setValue(value);
		jitter.setUnit(unit);
		
		this.issueCreator.issue(jitter, AmaltheaPackage.eINSTANCE.getRepetitionConstraint_Jitter(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintJitterUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintJitterUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintJitterUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time jitter = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setJitter(jitter);
		jitter.setValue(value);
		jitter.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintJitterUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintJitterUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintJitterUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time jitter = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setJitter(jitter);
		jitter.setValue(value);
		jitter.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintJitterUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintPeriodUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintPeriodUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time period = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setPeriod(period);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintPeriodUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintPeriodUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintPeriodUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time period = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setPeriod(period);
		period.setValue(value);
		period.setUnit(unit);
		
		this.issueCreator.issue(period, AmaltheaPackage.eINSTANCE.getRepetitionConstraint_Period(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintPeriodUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintPeriodUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintPeriodUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time period = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setPeriod(period);
		period.setValue(value);
		period.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintPeriodUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkRepetitionConstraintPeriodUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkRepetitionConstraintPeriodUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final RepetitionConstraint repetitionConstraint = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
		final Time period = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getTimingConstraints().add(repetitionConstraint);
		repetitionConstraint.setPeriod(period);
		period.setValue(value);
		period.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkRepetitionConstraintPeriodUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDataAgeTimeMinimumUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDataAgeTimeMinimumUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DataAgeConstraint dataAgeConstraint = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
		final DataAgeTime dataAgeTime = AmaltheaFactory.eINSTANCE.createDataAgeTime();
		final Time minimum = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getDataAgeConstraints().add(dataAgeConstraint);
		dataAgeConstraint.setDataAge(dataAgeTime);
		dataAgeTime.setMinimumTime(minimum);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDataAgeTimeMinimumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDataAgeTimeMinimumUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDataAgeTimeMinimumUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DataAgeConstraint dataAgeConstraint = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
		final DataAgeTime dataAgeTime = AmaltheaFactory.eINSTANCE.createDataAgeTime();
		final Time minimum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getDataAgeConstraints().add(dataAgeConstraint);
		dataAgeConstraint.setDataAge(dataAgeTime);
		dataAgeTime.setMinimumTime(minimum);
		minimum.setValue(value);
		minimum.setUnit(unit);
		
		this.issueCreator.issue(minimum, AmaltheaPackage.eINSTANCE.getDataAgeTime_MinimumTime(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDataAgeTimeMinimumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDataAgeTimeMinimumUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDataAgeTimeMinimumUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DataAgeConstraint dataAgeConstraint = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
		final DataAgeTime dataAgeTime = AmaltheaFactory.eINSTANCE.createDataAgeTime();
		final Time minimum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getDataAgeConstraints().add(dataAgeConstraint);
		dataAgeConstraint.setDataAge(dataAgeTime);
		dataAgeTime.setMinimumTime(minimum);
		minimum.setValue(value);
		minimum.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDataAgeTimeMinimumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDataAgeTimeMinimumUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDataAgeTimeMinimumUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DataAgeConstraint dataAgeConstraint = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
		final DataAgeTime dataAgeTime = AmaltheaFactory.eINSTANCE.createDataAgeTime();
		final Time minimum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getDataAgeConstraints().add(dataAgeConstraint);
		dataAgeConstraint.setDataAge(dataAgeTime);
		dataAgeTime.setMinimumTime(minimum);
		minimum.setValue(value);
		minimum.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDataAgeTimeMinimumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDataAgeTimeMaximumUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDataAgeTimeMaximumUnsigned_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DataAgeConstraint dataAgeConstraint = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
		final DataAgeTime dataAgeTime = AmaltheaFactory.eINSTANCE.createDataAgeTime();
		final Time maximum = null;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getDataAgeConstraints().add(dataAgeConstraint);
		dataAgeConstraint.setDataAge(dataAgeTime);
		dataAgeTime.setMaximumTime(maximum);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDataAgeTimeMaximumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDataAgeTimeMaximumUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDataAgeTimeMaximumUnsigned_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DataAgeConstraint dataAgeConstraint = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
		final DataAgeTime dataAgeTime = AmaltheaFactory.eINSTANCE.createDataAgeTime();
		final Time maximum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.valueOf(-10);
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getDataAgeConstraints().add(dataAgeConstraint);
		dataAgeConstraint.setDataAge(dataAgeTime);
		dataAgeTime.setMaximumTime(maximum);
		maximum.setValue(value);
		maximum.setUnit(unit);
		
		this.issueCreator.issue(maximum, AmaltheaPackage.eINSTANCE.getDataAgeTime_MaximumTime(), value);
		
		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDataAgeTimeMaximumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDataAgeTimeMaximumUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDataAgeTimeMaximumUnsigned_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DataAgeConstraint dataAgeConstraint = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
		final DataAgeTime dataAgeTime = AmaltheaFactory.eINSTANCE.createDataAgeTime();
		final Time maximum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.ZERO;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getDataAgeConstraints().add(dataAgeConstraint);
		dataAgeConstraint.setDataAge(dataAgeTime);
		dataAgeTime.setMaximumTime(maximum);
		maximum.setValue(value);
		maximum.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDataAgeTimeMaximumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link ConstraintsModelValidator#checkDataAgeTimeMaximumUnsigned(AMALTHEA)}
	 */
	@Test
	public void test_checkDataAgeTimeMaximumUnsigned_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		final DataAgeConstraint dataAgeConstraint = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
		final DataAgeTime dataAgeTime = AmaltheaFactory.eINSTANCE.createDataAgeTime();
		final Time maximum = AmaltheaFactory.eINSTANCE.createTime();
		final BigInteger value = BigInteger.TEN;
		final TimeUnit unit = TimeUnit.MS;
		
		amalthea.setConstraintsModel(constraintsModel);
		constraintsModel.getDataAgeConstraints().add(dataAgeConstraint);
		dataAgeConstraint.setDataAge(dataAgeTime);
		dataAgeTime.setMaximumTime(maximum);
		maximum.setValue(value);
		maximum.setUnit(unit);
		
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDataAgeTimeMaximumUnsigned(amalthea);
		
		// evaluate
		EasyMock.verify(this.issueCreator);
	}
}
