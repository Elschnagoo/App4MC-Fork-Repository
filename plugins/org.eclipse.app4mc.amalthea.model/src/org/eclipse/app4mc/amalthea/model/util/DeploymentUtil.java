/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.emf.common.util.EList;

public class DeploymentUtil {
	public static Set<Process> getProcessesMappedToCore(ProcessingUnit core, Amalthea model) {
		Set<Process> result = new HashSet<>();
		result.addAll(getTasksMappedToCore(core, model));
		result.addAll(getISRsMappedToCore(core, model));
		return result;
	}

	/**
	 * Returns a set of tasks mapped to a core. Depends on responsibilities of
	 * schedulers and the task allocated to them Assumption: Scheduler
	 * responsibilities are set empty core affinities are ignored otherwise the
	 * intersection of core affinity and scheduler responsibility is returned
	 * 
	 * @return Set of tasks
	 */
	public static Set<Task> getTasksMappedToCore(ProcessingUnit core, Amalthea model) { /// called it mapping
		Set<Task> tasks = new HashSet<>();
		MappingModel mappingModel = model.getMappingModel();
		if (mappingModel == null)
			return tasks;

		// first find all schedulers responsible for the core
		Set<TaskScheduler> schedulers = new HashSet<>();
		for (SchedulerAllocation schedAlloc : mappingModel.getSchedulerAllocation()) {
			if (schedAlloc.getScheduler() instanceof TaskScheduler) {
				if (schedAlloc.getResponsibility().contains(core)) {
					schedulers.add((TaskScheduler) schedAlloc.getScheduler());
				}
			}
		}

		// check for all task allocations if the assigned scheduler is in the list
		for (TaskAllocation taskAlloc : mappingModel.getTaskAllocation()) {
			if (schedulers.contains(taskAlloc.getScheduler())) {
				// check core affinities - if affinities are empty the responsibility counts
				// otherwise the affinity also needs to contain the core
				if (taskAlloc.getAffinity().isEmpty()) {
					tasks.add(taskAlloc.getTask());
				} else {
					if (taskAlloc.getAffinity().contains(core))
						tasks.add(taskAlloc.getTask());
				}
			}
		}
		return tasks;
	}

	/**
	 * Returns a set of all ISR mapped to that core
	 * 
	 * @return Set of interrupt service routines (ISR)
	 */
	public static Set<ISR> getISRsMappedToCore(ProcessingUnit core, Amalthea model) {
		if (core == null || model.getSwModel() == null || model.getSwModel().getIsrs() == null
				|| model.getMappingModel() == null || model.getMappingModel().getIsrAllocation() == null)
			return null;

		Set<ISR> result = new HashSet<>();
		EList<ISRAllocation> isrAlloc = model.getMappingModel().getIsrAllocation();
		EList<SchedulerAllocation> schedulerAllocs = model.getMappingModel().getSchedulerAllocation();
		for (ISR isr : model.getSwModel().getIsrs()) {
			for (ISRAllocation ia : isrAlloc) {
				if (ia.getIsr().equals(isr)) {
					for (SchedulerAllocation coreAlloc : schedulerAllocs) {
						if (coreAlloc.getResponsibility().contains(core)) {
							if (coreAlloc.getScheduler() == ia.getController()) {
								result.add(isr);
							}
						}
					}
				}
			}
		}
		return result;
	}

	/**
	 * Returns a list of all allocations of a task
	 * 
	 * @return List of task allocations
	 */
	public static List<TaskAllocation> getTaskAllocations(Task task, Amalthea model) {
		List<TaskAllocation> allocs = new ArrayList<TaskAllocation>();
		for (TaskAllocation ta : model.getMappingModel().getTaskAllocation()) {
			if (ta.getTask().equals(task)) {
				allocs.add(ta);
			}
		}
		return allocs;
	}

	/**
	 * Returns true if at least a label mapping exists
	 */
	public static boolean isMapped(Label label) {
		return !getLabelMapping(label).isEmpty();
	}

	/**
	 * Set of memories the label is mapped to (should be only one!)
	 * 
	 * @return Set of Memories
	 */
	public static Set<Memory> getLabelMapping(Label label) {
		Set<Memory> locations = new HashSet<>();
		for (MemoryMapping mapping : label.getMappings()) {
			locations.add(mapping.getMemory());
		}
		return locations;
	}

	/**
	 * Returns a created LabelMapping element which was already added to the model
	 * 
	 * @return MemoryMapping
	 */
	public static MemoryMapping setLabelMapping(Label label, Memory mem, Amalthea model) {
		if (mem == null || label == null)
			return null;

		MemoryMapping mapping = AmaltheaFactory.eINSTANCE.createMemoryMapping();
		mapping.setAbstractElement(label);
		mapping.setMemory(mem);
		ModelUtil.getOrCreateMappingModel(model).getMemoryMapping().add(mapping);
		return mapping;
	}

	/**
	 * Returns the cores the process is assigned to. Empty core affinities are
	 * ignored, otherwise the intersection of core affinity and scheduler
	 * responsibility is returned.
	 * 
	 * @param process Task or ISR
	 * @param model the containing model
	 * @return Set of cores
	 */
	public static Set<ProcessingUnit> getAssignedCoreForProcess(Process process, Amalthea model) {
		final MappingModel mappingModel = model.getMappingModel();
		if (process == null || mappingModel == null)
			return null;

		Set<TaskAllocation> taskAllocations = new HashSet<>();
		Set<ProcessingUnit> processingUnits = new HashSet<>();
		if (process instanceof Task) {
			for (TaskAllocation taskAlloc : mappingModel.getTaskAllocation()) {
				if (taskAlloc.getTask().equals(process))
					taskAllocations.add(taskAlloc);
			}

			for (SchedulerAllocation schedAlloc : mappingModel.getSchedulerAllocation()) {
				for (TaskAllocation taskAlloc : taskAllocations) {
					if (schedAlloc.getScheduler().equals(taskAlloc.getScheduler()))
						// check core affinity -- retain the core affinity with the scheduler
						// responsibility
						if (!taskAlloc.getAffinity().isEmpty()) {
							for (ProcessingUnit core : taskAlloc.getAffinity()) {
								if (schedAlloc.getResponsibility().contains(core))
									processingUnits.add(core);
							}
						}
						// responsibility defines core mapping
						else
							processingUnits.addAll(schedAlloc.getResponsibility());
				}
			}
		}

		if (process instanceof ISR) {
			for (ISRAllocation isrAlloc : mappingModel.getIsrAllocation()) {
				if (isrAlloc.getIsr().equals(process)) {
					for (SchedulerAllocation coreAlloc : mappingModel.getSchedulerAllocation()) {
						if (coreAlloc.getScheduler().equals(isrAlloc.getController())) {
							processingUnits.addAll(coreAlloc.getResponsibility());
						}
					}
				}
			}
		}

		return processingUnits;
	}

	/**
	 * @param procUnitDef	 processing unit definition
	 */
	public List<HwFeatureCategory> getFeatureCategories(ProcessingUnitDefinition procUnitDef) {
		List<HwFeatureCategory> result = new ArrayList<>();
		for (HwFeature feature : procUnitDef.getFeatures()) {
			if (!result.contains(feature.getContainingCategory())) {
				result.add(feature.getContainingCategory());
			}
		}
		return result;
	}

	/**
	 * @param hwFeatureCat			selection criteria
	 * @param procUnitDefinitons	list of potential definitions
	 */
	public List<ProcessingUnitDefinition> getProcessingUnitDefinitionsForHwCategories(HwFeatureCategory hwFeatureCat,
			List<ProcessingUnitDefinition> procUnitDefinitons) {
		List<ProcessingUnitDefinition> result = new ArrayList<>();
		for (ProcessingUnitDefinition procUnitDef : procUnitDefinitons) {
			for (HwFeature feature : hwFeatureCat.getFeatures()) {
				if (procUnitDef.getFeatures().contains(feature))
					result.add(procUnitDef);
			}
		}
		return result;
	}

	/**
	 * @param feature				selection criteria
	 * @param procUnitDefinitons	list of potential definitions
	 */
	public List<ProcessingUnitDefinition> getProcessingUnitDefinitionsForHwFeature(HwFeature feature,
			List<ProcessingUnitDefinition> procUnitDefinitons) {
		List<ProcessingUnitDefinition> result = new ArrayList<>();
		for (ProcessingUnitDefinition procUnitDef : procUnitDefinitons) {
			if (procUnitDef.getFeatures().contains(feature))
				result.add(procUnitDef);
		}
		return result;
	}

}
