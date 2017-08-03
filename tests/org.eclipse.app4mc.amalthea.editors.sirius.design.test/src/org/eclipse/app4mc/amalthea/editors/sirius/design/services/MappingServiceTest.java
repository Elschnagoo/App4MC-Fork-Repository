/*********************************************************************************
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
package org.eclipse.app4mc.amalthea.editors.sirius.design.services;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author daniel.kunz@de.bosch.com
 *
 */
public class MappingServiceTest {

	private MappingService mappingS = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.mappingS = new MappingService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.mappingS = null;
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresOfMappingModel(org.eclipse.app4mc.amalthea.model.MappingModel)}
	 * .
	 */
	@Test
	public void testGetCoresOfMappingModelNull() {
		List<Core> result = this.mappingS.getCoresOfMappingModel(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresOfMappingModel(org.eclipse.app4mc.amalthea.model.MappingModel)}
	 * .
	 */
	@Test
	public void testGetCoresOfMappingModelEmptyModel() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		List<Core> result = this.mappingS.getCoresOfMappingModel(mappingM);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresOfMappingModel(org.eclipse.app4mc.amalthea.model.MappingModel)}
	 * .
	 */
	@Test
	public void testGetCoresOfMappingModelEmptySchedAlloc() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		mappingM.getSchedulerAllocation().add(AmaltheaFactory.eINSTANCE.createSchedulerAllocation());
		List<Core> result = this.mappingS.getCoresOfMappingModel(mappingM);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresOfMappingModel(org.eclipse.app4mc.amalthea.model.MappingModel)}
	 * .
	 */
	@Test
	public void testGetCoresOfMappingModelOneSchedAlloc() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		SchedulerAllocation schedA = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		Core core = AmaltheaFactory.eINSTANCE.createCore();
		schedA.getResponsibility().add(core);
		mappingM.getSchedulerAllocation().add(schedA);
		List<Core> result = this.mappingS.getCoresOfMappingModel(mappingM);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(core));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getSchedulersOfMappingModel(org.eclipse.app4mc.amalthea.model.MappingModel)}
	 * .
	 */
	@Test
	public void testGetSchedulersOfMappingModelNull() {
		List<Scheduler> result = this.mappingS.getSchedulersOfMappingModel(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getSchedulersOfMappingModel(org.eclipse.app4mc.amalthea.model.MappingModel)}
	 * .
	 */
	@Test
	public void testGetSchedulersOfMappingModelEmptyMapping() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		List<Scheduler> result = this.mappingS.getSchedulersOfMappingModel(mappingM);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getSchedulersOfMappingModel(org.eclipse.app4mc.amalthea.model.MappingModel)}
	 * .
	 */
	@Test
	public void testGetSchedulersOfMappingModelOneEmptyMapping() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		SchedulerAllocation schedA = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		mappingM.getSchedulerAllocation().add(schedA);
		List<Scheduler> result = this.mappingS.getSchedulersOfMappingModel(mappingM);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getSchedulersOfMappingModel(org.eclipse.app4mc.amalthea.model.MappingModel)}
	 * .
	 */
	@Test
	public void testGetSchedulersOfMappingModelOneMapping() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		SchedulerAllocation schedA = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		Scheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		schedA.setScheduler(sched);
		mappingM.getSchedulerAllocation().add(schedA);
		List<Scheduler> result = this.mappingS.getSchedulersOfMappingModel(mappingM);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(sched));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetCoresForSchedulerNull() {
		List<Core> result = this.mappingS.getCoresForScheduler(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetCoresForSchedulerOnlyScheduler() {
		Scheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		List<Core> result = this.mappingS.getCoresForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetCoresForSchedulerSchedulerWithAmaltheaNullMapping() {
		Amalthea amlt = AmaltheaFactory.eINSTANCE.createAmalthea();
		OSModel osM = AmaltheaFactory.eINSTANCE.createOSModel();
		amlt.setOsModel(osM);
		OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		osM.getOperatingSystems().add(os);
		TaskScheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		os.getTaskSchedulers().add(sched);
		List<Core> result = this.mappingS.getCoresForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetCoresForSchedulerSchedulerWithAmaltheaEmptyMapping() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		Amalthea amlt = AmaltheaFactory.eINSTANCE.createAmalthea();
		amlt.setMappingModel(mappingM);
		OSModel osM = AmaltheaFactory.eINSTANCE.createOSModel();
		amlt.setOsModel(osM);
		OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		osM.getOperatingSystems().add(os);
		TaskScheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		os.getTaskSchedulers().add(sched);
		List<Core> result = this.mappingS.getCoresForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetCoresForSchedulerSchedulerWithAmaltheaOneMapping() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		Amalthea amlt = AmaltheaFactory.eINSTANCE.createAmalthea();
		amlt.setMappingModel(mappingM);
		OSModel osM = AmaltheaFactory.eINSTANCE.createOSModel();
		amlt.setOsModel(osM);
		OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		osM.getOperatingSystems().add(os);
		TaskScheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		os.getTaskSchedulers().add(sched);
		SchedulerAllocation schedA = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		schedA.setScheduler(sched);
		mappingM.getSchedulerAllocation().add(schedA);
		Core core = AmaltheaFactory.eINSTANCE.createCore();
		schedA.getResponsibility().add(core);
		List<Core> result = this.mappingS.getCoresForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(core));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getCoresForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetCoresForSchedulerSchedulerWithAmaltheaOneMappingOtherScheduler() {
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		Amalthea amlt = AmaltheaFactory.eINSTANCE.createAmalthea();
		amlt.setMappingModel(mappingM);
		OSModel osM = AmaltheaFactory.eINSTANCE.createOSModel();
		amlt.setOsModel(osM);
		OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		osM.getOperatingSystems().add(os);
		TaskScheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		os.getTaskSchedulers().add(sched);
		SchedulerAllocation schedA = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		Scheduler sched2 = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		schedA.setScheduler(sched2);
		mappingM.getSchedulerAllocation().add(schedA);
		Core core = AmaltheaFactory.eINSTANCE.createCore();
		schedA.getResponsibility().add(core);
		List<Core> result = this.mappingS.getCoresForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getTasksForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetTasksForSchedulerNull() {
		List<Task> result = this.mappingS.getTasksForScheduler(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getTasksForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetTasksForSchedulerOnlyScheduler() {
		Scheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		List<Task> result = this.mappingS.getTasksForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getTasksForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetTasksForSchedulerEmptyMappingOneScheduler() {
		Amalthea amlt = AmaltheaFactory.eINSTANCE.createAmalthea();
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		amlt.setMappingModel(mappingM);
		TaskScheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		OSModel osM = AmaltheaFactory.eINSTANCE.createOSModel();
		amlt.setOsModel(osM);
		OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		osM.getOperatingSystems().add(os);
		os.getTaskSchedulers().add(sched);
		List<Task> result = this.mappingS.getTasksForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getTasksForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetTasksForSchedulerNullMappingOneScheduler() {
		Amalthea amlt = AmaltheaFactory.eINSTANCE.createAmalthea();
		TaskScheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		OSModel osM = AmaltheaFactory.eINSTANCE.createOSModel();
		amlt.setOsModel(osM);
		OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		osM.getOperatingSystems().add(os);
		os.getTaskSchedulers().add(sched);
		List<Task> result = this.mappingS.getTasksForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getTasksForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetTasksForSchedulerOneMappingOneScheduler() {
		Amalthea amlt = AmaltheaFactory.eINSTANCE.createAmalthea();
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		amlt.setMappingModel(mappingM);
		TaskScheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		OSModel osM = AmaltheaFactory.eINSTANCE.createOSModel();
		amlt.setOsModel(osM);
		OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		osM.getOperatingSystems().add(os);
		os.getTaskSchedulers().add(sched);
		TaskAllocation taskA = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		taskA.setTask(task);
		taskA.setScheduler(sched);
		mappingM.getTaskAllocation().add(taskA);
		List<Task> result = this.mappingS.getTasksForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(task));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.MappingService#getTasksForScheduler(org.eclipse.app4mc.amalthea.model.Scheduler)}
	 * .
	 */
	@Test
	public void testGetTasksForSchedulerOneMappingOtherScheduler() {
		Amalthea amlt = AmaltheaFactory.eINSTANCE.createAmalthea();
		MappingModel mappingM = AmaltheaFactory.eINSTANCE.createMappingModel();
		amlt.setMappingModel(mappingM);
		TaskScheduler sched = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		OSModel osM = AmaltheaFactory.eINSTANCE.createOSModel();
		amlt.setOsModel(osM);
		OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		osM.getOperatingSystems().add(os);
		os.getTaskSchedulers().add(sched);
		TaskAllocation taskA = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		taskA.setTask(task);
		TaskScheduler sched1 = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		taskA.setScheduler(sched1);
		mappingM.getTaskAllocation().add(taskA);
		List<Task> result = this.mappingS.getTasksForScheduler(sched);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}
}
