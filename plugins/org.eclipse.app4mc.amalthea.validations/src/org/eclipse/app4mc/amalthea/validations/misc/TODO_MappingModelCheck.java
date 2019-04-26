/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.misc;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Algorithm;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Grouping;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class TODO_MappingModelCheck {

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
		final List<ISR> allIsrs = new ArrayList<ISR>(getAllInstancesOf(mappingModel, ISR.class));
		final List<Task> allTasks = new ArrayList<Task>(getAllInstancesOf(mappingModel, Task.class));

		// ProcessAllocations
		final List<ISRAllocation> allIsrAllocs = new ArrayList<ISRAllocation>(
				getAllInstancesOf(mappingModel, ISRAllocation.class));
		final List<TaskAllocation> allTaskAllocs = new ArrayList<TaskAllocation>(
				getAllInstancesOf(mappingModel, TaskAllocation.class));


		// Schedulers
		final List<Scheduler> allSchedulers = new ArrayList<Scheduler>(
				getAllInstancesAndInheritedOf(mappingModel, Scheduler.class));

		// SchedulerAllocation
		final List<SchedulerAllocation> allCoreAllocs = new ArrayList<SchedulerAllocation>(
				getAllInstancesAndInheritedOf(mappingModel, SchedulerAllocation.class));

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
				issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Task(),
						"Task2Scheduler Mapping-Error: Task Allocation is left blank", taskAlloc);
			}
			else if (task != null && sched == null) {
				issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Task(),
						"Task2Scheduler Mapping-Error: Task \"" + task.getName() + "\" is not mapped to any Scheduler",
						taskAlloc);
			}
			else if (sched != null && task == null) {
				issue(taskAlloc, AmaltheaPackage.eINSTANCE.getTaskAllocation_Scheduler(),
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
			issue(leftTask, AmaltheaPackage.eINSTANCE.getTypeRef_TypeDef(),
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
				issue(isrAlloc, AmaltheaPackage.eINSTANCE.getISRAllocation_Isr(),
						"Isr2Scheduler Mapping-Error: Interrupt Allocation is left blank", isrAlloc);
			}
			else if (isr != null && sched == null) {
				issue(isrAlloc, AmaltheaPackage.eINSTANCE.getISRAllocation_Isr(),
						"Isr2Scheduler Mapping-Error: ISR \"" + isr.getName() + "\" is not mapped to any Scheduler",
						isrAlloc);
			}
			else if (sched != null && isr == null) {
				issue(isrAlloc, AmaltheaPackage.eINSTANCE.getISRAllocation_Controller(),
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
			issue(leftIsr, AmaltheaPackage.eINSTANCE.getTypeRef_TypeDef(),
					"Isr2Scheduler Mapping-Error: Unmapped ISR found: " + leftIsr.getName(), leftIsr);
		}
	}

	private void checkSchedulerToCoreMapping(final List<Scheduler> schedulers, final List<SchedulerAllocation> schedAllocs) {
		// Scheduler --> ProcessingUnit

		// TODO Grouping does not require a core responsibility
		
		for (final SchedulerAllocation alloc : schedAllocs) {
			final Scheduler sched = alloc.getScheduler();
			final EList<ProcessingUnit> cores = alloc.getResponsibility();
			if (cores.isEmpty() && sched == null) {
				issue(alloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility(),
						"Scheduler2Core Mapping-Error: Scheduler and Responsibility are left blank", alloc);
			}
			else if (sched != null && cores.isEmpty()) {
				issue(alloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Scheduler(),
						"Scheduler2Core Mapping-Error: Scheduler \"" + sched.getName() + "\" is not responsible for any Core",
						alloc);
			}
			else if (!cores.isEmpty() && sched == null) {

				final StringBuilder sb = new StringBuilder();
				for (final ProcessingUnit core : cores) {
					sb.append("\"" + core.getName() + "\",");
				}

				issue(alloc, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility(),
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
			
			issue(leftScheduler, AmaltheaPackage.eINSTANCE.getINamed_Name(),
					"Scheduler2Core Mapping-Error: Scheduler not responsible for any core: " + leftScheduler.getName(),
					leftScheduler);
		}
	}

	private <T> List<T> getAllInstancesAndInheritedOf(final EObject contextObject, final Class<T> type) {
		// dummy to mock old API
		return null;
	}

	private <T> List<T> getAllInstancesOf(final EObject contextObject, final Class<T> type) {
		// dummy to mock old API
		return null;
	}

	private void issue(EObject object, EStructuralFeature feature, Object... messageArguments) {
		// dummy to mock old API
	}

}