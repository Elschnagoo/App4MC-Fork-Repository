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
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Algorithm;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.Grouping;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.EList;

public class MappingModelCheckValidatorImpl extends AbstractValidatorImpl {

	public MappingModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public MappingModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks for the entire AMALTHEA model instance if the mapping information are complete and correct between
	 * Software(SW) <-> Operating System(OS) <-> Software(SW) model. I.e. mapping relationship {Process(SW) to
	 * Scheduler(OS) to Core(HW)}. A missing mapping information (i.e. no Entity) will be handled as an error.
	 */
	public void checkProcessToSchedulerToCoreMapping(final MappingModel mappingModel) {

		/**
		 * Grab all the necessary data first
		 */

		// Processes
		final List<ISR> allIsrs = new ArrayList<ISR>(getObjectHelper().getAllInstancesOf(mappingModel, ISR.class));
		final List<Task> allTasks = new ArrayList<Task>(getObjectHelper().getAllInstancesOf(mappingModel, Task.class));

		// ProcessAllocations
		final List<ISRAllocation> allIsrAllocs = new ArrayList<ISRAllocation>(
				getObjectHelper().getAllInstancesOf(mappingModel, ISRAllocation.class));
		final List<TaskAllocation> allTaskAllocs = new ArrayList<TaskAllocation>(
				getObjectHelper().getAllInstancesOf(mappingModel, TaskAllocation.class));


		// Schedulers
		final List<Scheduler> allSchedulers = new ArrayList<Scheduler>(
				getObjectHelper().getAllInstancesAndInheritedOf(mappingModel, Scheduler.class));

		// SchedulerAllocation
		final List<SchedulerAllocation> allCoreAllocs = new ArrayList<SchedulerAllocation>(
				getObjectHelper().getAllInstancesAndInheritedOf(mappingModel, SchedulerAllocation.class));

		// Process --> Scheduler
		checkTaskToSchedulerMappings(allTaskAllocs, allTasks);
		checkIsrToSchedulerMappings(allIsrAllocs, allIsrs);

		// Scheduler --> Core
		checkSchedulerToCoreMapping(allSchedulers, allCoreAllocs);
	}


	private void checkTaskToSchedulerMappings(final List<TaskAllocation> taskAllocs, final List<Task> tasks) {
		/**
		 * Checks if AMALTHEA "TaskAllocation" Items have all required entries, i.e. Task to Scheduler mapping
		 */
		for (final TaskAllocation taskAlloc : taskAllocs) {
			final Task task = taskAlloc.getTask();
			final TaskScheduler sched = taskAlloc.getScheduler();


			if (task == null && sched == null) {
				this.issueCreator.issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Task(),
						"Task2Scheduler Mapping-Error: Task Allocation is left blank", taskAlloc);
			}
			else if (task != null && sched == null) {
				this.issueCreator.issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Task(),
						"Task2Scheduler Mapping-Error: Task \"" + task.getName() + "\" is not mapped to any Scheduler",
						taskAlloc);
			}
			else if (sched != null && task == null) {
				this.issueCreator.issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Scheduler(),
						"Task2Scheduler Mapping-Error: Scheduler \"" + sched.getName() + "\" is not mapped to any Task",
						taskAlloc);
			}
			else {
				// Process and Scheduler are both not 'null'
				// Process (i.e Task) can be removed from remaining ProcessCollection
				tasks.remove(task);
			}
		}

		/**
		 * Checks if there are unmapped Processes left, i.e. missing Process -> Scheduler mappings
		 */
		for (final Task leftTask : tasks) {
			this.issueCreator.issue(leftTask, AmaltheaPackage.eINSTANCE.getTypeRef_TypeDef(),
					"Task2Scheduler Mapping-Error: Unmapped Task found: " + leftTask.getName(), leftTask);
		}
	}

	private void checkIsrToSchedulerMappings(final List<ISRAllocation> isrAllocs, final List<ISR> isrs) {
		/**
		 * Checks if AMALTHEA "IsrAllocation" Items have all required entries, i.e. Task to Scheduler mapping
		 */
		for (final ISRAllocation isrAlloc : isrAllocs) {
			final ISR isr = isrAlloc.getIsr();
			final InterruptController sched = isrAlloc.getController();


			if (isr == null && sched == null) {
				this.issueCreator.issue(isrAlloc, AmaltheaPackage.eINSTANCE.getISRAllocation_Isr(),
						"Isr2Scheduler Mapping-Error: Interrupt Allocation is left blank", isrAlloc);
			}
			else if (isr != null && sched == null) {
				this.issueCreator.issue(isrAlloc, AmaltheaPackage.eINSTANCE.getISRAllocation_Isr(),
						"Isr2Scheduler Mapping-Error: ISR \"" + isr.getName() + "\" is not mapped to any Scheduler",
						isrAlloc);
			}
			else if (sched != null && isr == null) {
				this.issueCreator.issue(isrAlloc, AmaltheaPackage.eINSTANCE.getISRAllocation_Controller(),
						"Isr2Scheduler Mapping-Error: Scheduler \"" + sched.getName() + "\" is not mapped to any ISR",
						isrAlloc);
			}
			else {
				// Process and Scheduler are both not 'null'
				// Process (i.e Task) can be removed from remaining ProcessCollection
				isrs.remove(isr);
			}
		}

		/**
		 * Checks if there are unmapped Processes left, i.e. missing Process -> Scheduler mappings
		 */
		for (final ISR leftIsr : isrs) {
			this.issueCreator.issue(leftIsr, AmaltheaPackage.eINSTANCE.getTypeRef_TypeDef(),
					"Isr2Scheduler Mapping-Error: Unmapped ISR found: " + leftIsr.getName(), leftIsr);
		}
	}

	private void checkSchedulerToCoreMapping(final List<Scheduler> schedulers, final List<SchedulerAllocation> schedAllocs) {
		// Scheduler --> Core

		// TODO Grouping does not require a core responsibility
		
		for (final SchedulerAllocation alloc : schedAllocs) {
			final Scheduler sched = alloc.getScheduler();
			final EList<Core> cores = alloc.getResponsibility();
			if (cores.isEmpty() && sched == null) {
				this.issueCreator.issue(alloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility(),
						"Scheduler2Core Mapping-Error: Scheduler and Responsibility are left blank", alloc);
			}
			else if (sched != null && cores.isEmpty()) {
				this.issueCreator.issue(alloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Scheduler(),
						"Scheduler2Core Mapping-Error: Scheduler \"" + sched.getName() + "\" is not responsible for any Core",
						alloc);
			}
			else if (!cores.isEmpty() && sched == null) {

				final StringBuilder sb = new StringBuilder();
				for (final Core core : cores) {
					sb.append("\"" + core.getName() + "\",");
				}

				this.issueCreator.issue(alloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility(),
						"Scheduler2Core Mapping-Error: Core(s) " + sb.toString()
								+ " is/are not mapped to any Scheduler",
						alloc);
			}
			else {
				// Scheduler and Core information are available (not 'null')
				// Scheduler (e.g. TaskScheduler) can be removed from remaining SchedulerCollection
				schedulers.remove(sched);
			}
		}

		/**
		 * Checks if there are unmapped Schedulers left, i.e. missing Scheduler -> Core(s) mapping
		 */
		for (final Scheduler leftScheduler : schedulers) {
			
			Algorithm algo = leftScheduler.getSchedulingAlgorithm();
			if (algo != null && algo instanceof Grouping ) continue;	// no core responsibility required
			
			this.issueCreator.issue(leftScheduler, AmaltheaPackage.eINSTANCE.getIReferable_Name(),
					"Scheduler2Core Mapping-Error: Scheduler not responsible for any core: " + leftScheduler.getName(),
					leftScheduler);
		}
	}
}
