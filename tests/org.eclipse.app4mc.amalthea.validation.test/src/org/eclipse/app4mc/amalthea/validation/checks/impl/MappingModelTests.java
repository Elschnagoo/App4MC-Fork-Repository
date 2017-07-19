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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.junit.Before;
import org.junit.Test;

public class MappingModelTests {
	private MappingModelCheckValidatorImpl classUnderTest;

	private IssueCreator issueCreator;

	private IEObjectHelper eObjectHelper;


	private Amalthea amaltheaModel = null;

	final List<ISR> allIsrs = new ArrayList<ISR>();
	final List<ISRAllocation> allIsrAllocs = new ArrayList<ISRAllocation>();

	final List<Task> allTasks = new ArrayList<Task>();
	final List<TaskAllocation> allTaskAllocs = new ArrayList<TaskAllocation>();

	final List<Scheduler> allSchedulers = new ArrayList<Scheduler>();
	final List<SchedulerAllocation> allSchedulerAllocs = new ArrayList<SchedulerAllocation>();


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
		this.classUnderTest = new MappingModelCheckValidatorImpl(this.issueCreator, this.eObjectHelper);

		this.amaltheaModel = prepareAmaltheaModel();

		/*
		 * List expected calls on eObjectHelper which are valid for each test case
		 */


		// Processes
		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(this.amaltheaModel.getMappingModel(), ISR.class))
				.andReturn(this.allIsrs);
		// ProcessAllocations
		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(this.amaltheaModel.getMappingModel(), ISRAllocation.class))
				.andReturn(this.allIsrAllocs);


		// Processes
		EasyMock.expect(this.eObjectHelper.getAllInstancesOf(this.amaltheaModel.getMappingModel(), Task.class))
				.andReturn(this.allTasks);
		// ProcessAllocations
		EasyMock.expect(
				this.eObjectHelper.getAllInstancesOf(this.amaltheaModel.getMappingModel(), TaskAllocation.class))
				.andReturn(this.allTaskAllocs);

		// Schedulers
		EasyMock.expect(
				this.eObjectHelper.getAllInstancesAndInheritedOf(this.amaltheaModel.getMappingModel(), Scheduler.class))
				.andReturn(this.allSchedulers);
		// CoreAllocations
		EasyMock.expect(this.eObjectHelper.getAllInstancesAndInheritedOf(this.amaltheaModel.getMappingModel(),
				SchedulerAllocation.class)).andReturn(this.allSchedulerAllocs);
	}

	private Amalthea prepareAmaltheaModel() {
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();

		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		amalthea.setSwModel(swModel);

		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		amalthea.setOsModel(osModel);

		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
		amalthea.setMappingModel(mappingModel);

		return amalthea;
	}


	/**
	 * Test for validation method {@link MappingModelCheckValidatorImpl#checkProcessToSchedulerToCoreMapping(AMALTHEA)}
	 */
	@Test
	public void testTaskToSchedulerToCoreMapping() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		taskAlloc.setTask(task);
		taskAlloc.setScheduler(taskScheduler);

		final SchedulerAllocation schedAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		schedAlloc.getResponsibility().add(core);
		schedAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(schedAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);

		// EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		// EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link MappingModelCheckValidatorImpl#checkProcessToSchedulerToCoreMapping(AMALTHEA)}
	 */
	@Test
	public void testTaskToSchedulerToCoreMapping_UnmappedTasks() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final Task task_left = AmaltheaFactory.eINSTANCE.createTask();
		task_left.setName("TestTask_left");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		taskAlloc.setTask(task);
		taskAlloc.setScheduler(taskScheduler);


		final SchedulerAllocation coreAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		coreAlloc.getResponsibility().add(core);
		coreAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getSwModel().getTasks().add(task_left);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(coreAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);

		/*
		 * Add newly created elements to members serving as return object for expected method calls like
		 * getAllInstances()
		 */
		this.allTaskAllocs.add(taskAlloc);
		this.allSchedulerAllocs.add(coreAlloc);
		this.allSchedulers.add(taskScheduler);
		this.allTasks.addAll(Arrays.asList(task, task_left));

		this.issueCreator.issue(task_left, AmaltheaPackage.eINSTANCE.getTypeRef_TypeDef(),
				"Task2Scheduler Mapping-Error: Unmapped Task found: " + task_left.getName(), task_left);

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link MappingModelCheckValidatorImpl#checkProcessToSchedulerToCoreMapping(AMALTHEA)}
	 */
	@Test
	public void testTaskToSchedulerToCoreMapping_UnmappedScheduler() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		final TaskScheduler taskScheduler_left = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler_left.setName("TestScheduler_left");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		taskAlloc.setTask(task);
		taskAlloc.setScheduler(taskScheduler);

		final SchedulerAllocation schedAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		schedAlloc.getResponsibility().add(core);
		schedAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(schedAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);
		os.getTaskSchedulers().add(taskScheduler_left);

		/*
		 * Add newly created elements to members serving as return object for expected method calls like
		 * getAllInstances()
		 */
		this.allTaskAllocs.add(taskAlloc);
		this.allSchedulerAllocs.add(schedAlloc);
		this.allSchedulers.addAll(Arrays.asList(taskScheduler, taskScheduler_left));
		this.allTasks.add(task);

		this.issueCreator.issue(taskScheduler_left, AmaltheaPackage.eINSTANCE.getIReferable_Name(),
				"Scheduler2Core Mapping-Error: Scheduler not responsible for any core: " + taskScheduler_left.getName(),
				taskScheduler_left);

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	@Test
	public void testTaskToSchedulerToCoreMapping_MissingSchedulerInTaskAlloc() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		taskAlloc.setTask(task);
		/*
		 * TaskScheduler is missing
		 */
		// taskAlloc.setScheduler(taskScheduler);

		final SchedulerAllocation coreAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		coreAlloc.getResponsibility().add(core);
		coreAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(coreAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);

		/*
		 * Add newly created elements to members serving as return object for expected method calls like
		 * getAllInstances()
		 */
		this.allTaskAllocs.add(taskAlloc);
		this.allSchedulerAllocs.add(coreAlloc);
		this.allSchedulers.add(taskScheduler);
		this.allTasks.add(task);

		// Due to missing info in TaskAlloc (Task -> (missing)Scheduler)
		this.issueCreator.issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Task(),
				"Task2Scheduler Mapping-Error: Task \"" + task.getName() + "\" is not mapped to any Scheduler",
				taskAlloc);

		// Unmapped task detected
		this.issueCreator.issue(task, AmaltheaPackage.eINSTANCE.getTypeRef_TypeDef(),
				"Task2Scheduler Mapping-Error: Unmapped Task found: " + task.getName(), task);
		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	@Test
	public void testTaskToSchedulerToCoreMapping_MissingProcessInTaskAlloc() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		// taskAlloc.setProcess(task);
		taskAlloc.setScheduler(taskScheduler);

		final SchedulerAllocation schedAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		schedAlloc.getResponsibility().add(core);
		schedAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(schedAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);

		/*
		 * Add newly created elements to members serving as return object for expected method calls like
		 * getAllInstances()
		 */
		this.allTaskAllocs.add(taskAlloc);
		this.allSchedulerAllocs.add(schedAlloc);
		this.allSchedulers.add(taskScheduler);
		this.allTasks.add(task);

		// Due to missing info in TaskAlloc ({missing}Task -> Scheduler)
		this.issueCreator.issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Scheduler(),
				"Task2Scheduler Mapping-Error: Scheduler \"" + taskScheduler.getName() + "\" is not mapped to any Task",
				taskAlloc);

		// Unmapped task detected
		this.issueCreator.issue(task, AmaltheaPackage.eINSTANCE.getTypeRef_TypeDef(),
				"Task2Scheduler Mapping-Error: Unmapped Task found: " + task.getName(), task);
		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	@Test
	public void testTaskToSchedulerToCoreMapping_MissingProcessAndSchedulerInTaskAlloc() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		// taskAlloc.setProcess(task);
		// taskAlloc.setScheduler(taskScheduler);

		final SchedulerAllocation schedAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		schedAlloc.getResponsibility().add(core);
		schedAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(schedAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);

		/*
		 * Add newly created elements to members serving as return object for expected method calls like
		 * getAllInstances()
		 */
		this.allTaskAllocs.add(taskAlloc);
		this.allSchedulerAllocs.add(schedAlloc);
		this.allSchedulers.add(taskScheduler);
		this.allTasks.add(task);

		// Due to missing info in TaskAlloc ({missing}Task -> {missing}Scheduler)
		this.issueCreator.issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Task(),
				"Task2Scheduler Mapping-Error: Task Allocation is left blank", taskAlloc);

		// Unmapped task detected
		this.issueCreator.issue(task, AmaltheaPackage.eINSTANCE.getTypeRef_TypeDef(),
				"Task2Scheduler Mapping-Error: Unmapped Task found: " + task.getName(), task);
		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	@Test
	public void testTaskToSchedulerToCoreMapping_MissingSchedulerInCoreAlloc() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		taskAlloc.setTask(task);
		taskAlloc.setScheduler(taskScheduler);

		final SchedulerAllocation schedAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		schedAlloc.getResponsibility().add(core);
		// coreAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(schedAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);

		/*
		 * Add newly created elements to members serving as return object for expected method calls like
		 * getAllInstances()
		 */
		this.allTaskAllocs.add(taskAlloc);
		this.allSchedulerAllocs.add(schedAlloc);
		this.allSchedulers.add(taskScheduler);
		this.allTasks.add(task);

		// Due to missing info in CoreAlloc ({missing}Scheduler -> Core)

		this.issueCreator.issue(schedAlloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility(),
				"Scheduler2Core Mapping-Error: Core(s) \"" + core.getName() + "\", is/are not mapped to any Scheduler",
				schedAlloc);

		// Unmapped core detected
		this.issueCreator.issue(taskScheduler, AmaltheaPackage.eINSTANCE.getIReferable_Name(),
				"Scheduler2Core Mapping-Error: Scheduler not responsible for any core: " + taskScheduler.getName(),
				taskScheduler);
		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}


	@Test
	public void testTaskToSchedulerToCoreMapping_MissingCoreInCoreAlloc() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		// final Core core = AmaltheaFactory.eINSTANCE.createCore();
		// core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		taskAlloc.setTask(task);
		taskAlloc.setScheduler(taskScheduler);

		final SchedulerAllocation schedAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		// coreAlloc.getCore().add(core);
		schedAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(schedAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);

		/*
		 * Add newly created elements to members serving as return object for expected method calls like
		 * getAllInstances()
		 */
		this.allTaskAllocs.add(taskAlloc);
		this.allSchedulerAllocs.add(schedAlloc);
		this.allSchedulers.add(taskScheduler);
		this.allTasks.add(task);

		// Due to missing info in CoreAlloc (Scheduler -> {missing}Core)
		this.issueCreator.issue(schedAlloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Scheduler(),
				"Scheduler2Core Mapping-Error: Scheduler \"" + taskScheduler.getName() + "\" is not responsible for any Core",
				schedAlloc);

		// Unmapped core detected
		this.issueCreator.issue(taskScheduler, AmaltheaPackage.eINSTANCE.getIReferable_Name(),
				"Scheduler2Core Mapping-Error: Scheduler not responsible for any core: " + taskScheduler.getName(),
				taskScheduler);
		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	@Test
	public void testTaskToSchedulerToCoreMapping_MissingSchedulerAndCoreInCoreAlloc() {

		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("TestTask");

		final TaskScheduler taskScheduler = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskScheduler.setName("TestScheduler");

		// final Core core = AmaltheaFactory.eINSTANCE.createCore();
		// core.setName("TestCore");

		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("TestOS");

		final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		taskAlloc.setTask(task);
		taskAlloc.setScheduler(taskScheduler);

		final SchedulerAllocation schedAlloc = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		// coreAlloc.getCore().add(core);
		// coreAlloc.setScheduler(taskScheduler);

		this.amaltheaModel.getSwModel().getTasks().add(task);
		this.amaltheaModel.getMappingModel().getTaskAllocation().add(taskAlloc);
		this.amaltheaModel.getMappingModel().getSchedulerAllocation().add(schedAlloc);

		this.amaltheaModel.getOsModel().getOperatingSystems().add(os);
		os.getTaskSchedulers().add(taskScheduler);

		/*
		 * Add newly created elements to members serving as return object for expected method calls like
		 * getAllInstances()
		 */
		this.allTaskAllocs.add(taskAlloc);
		this.allSchedulerAllocs.add(schedAlloc);
		this.allSchedulers.add(taskScheduler);
		this.allTasks.add(task);

		// Due to missing info in CoreAlloc ({missing}Scheduler -> {missing}Core)
		this.issueCreator.issue(schedAlloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility(),
				"Scheduler2Core Mapping-Error: Scheduler and Responsibility are left blank", schedAlloc);
		// Unmapped core detected
		this.issueCreator.issue(taskScheduler, AmaltheaPackage.eINSTANCE.getIReferable_Name(),
				"Scheduler2Core Mapping-Error: Scheduler not responsible for any core: " + taskScheduler.getName(),
				taskScheduler);
		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkProcessToSchedulerToCoreMapping(this.amaltheaModel.getMappingModel());

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}
}
