/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.Scheduler;
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
	 * Returns a set of tasks mapped to a core. Depends on responsibilities of schedulers and the task allocated to them
	 * Assumption: Scheduler responsibilities are set
	 * empty core affinities are ignored otherwise the intersection of core affinity and scheduler responsibility is returned  
	 * @param core
	 * @param model
	 * @return Set of tasks
	 */
	public static Set<Task> getTasksMappedToCore(ProcessingUnit core, Amalthea model) {	/// called it mapping
		Set<Task> tasks = new HashSet<>();
		Set<TaskScheduler> schedulers = new HashSet<>();
		if (model.getMappingModel()!= null) {
			if (model.getMappingModel().getSchedulerAllocation() != null && !model.getMappingModel().getSchedulerAllocation().isEmpty()) {
				//first find all schedulers responsible for the core 
				for (SchedulerAllocation schedAllocRun: model.getMappingModel().getSchedulerAllocation()) {
					if (schedAllocRun.getScheduler() instanceof TaskScheduler) {
						if (schedAllocRun.getResponsibility().contains(core)) {
							schedulers.add((TaskScheduler) schedAllocRun.getScheduler());
						}
					}	
				}
			}
		}
		//check for all task allocations if the assigned scheduler is in the list
		if (model.getMappingModel().getTaskAllocation() != null && !model.getMappingModel().getTaskAllocation().isEmpty()) {
			for (TaskAllocation taskAllocation : model.getMappingModel().getTaskAllocation()) {
				if (schedulers.contains(taskAllocation.getScheduler())) {
					//check core affinities - if affinities are empty the responsibility counts
					//otherwise the affinity also needs to contain the core
					if (taskAllocation.getAffinity().isEmpty()) {
						tasks.add(taskAllocation.getTask());
					}
					else {
						if (taskAllocation.getAffinity().contains(core))
							tasks.add(taskAllocation.getTask());
					}
				}
			}
		}
		return tasks;
	}
	
	/**
	 * Returns a set of all ISR mapped to that core
	 * @param core
	 * @param model
	 * @return Set of interrupt service routines (ISR)
	 */
	public static Set<ISR> getISRsMappedToCore(ProcessingUnit core, Amalthea model) {
		Set<ISR> result = new HashSet<>();
		if (core == null || model.getSwModel() == null || model.getSwModel().getIsrs() == null || 
				model.getMappingModel() ==null || model.getMappingModel().getIsrAllocation() == null)
			return result;
		EList<ISRAllocation> isrAlloc = model.getMappingModel().getIsrAllocation();
		EList<SchedulerAllocation> schedulerAllocs = model.getMappingModel().getSchedulerAllocation();
		for (ISR isr : model.getSwModel().getIsrs()) {
			for (ISRAllocation ia : isrAlloc) {
				if (ia.getIsr().equals(isr)){
					for(SchedulerAllocation coreAlloc : schedulerAllocs) {
						if(coreAlloc.getResponsibility().contains(core)) {
							if(coreAlloc.getScheduler() == ia.getController()) {
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
	 * @param task
	 * @param model
	 * @return List of task allocations
	 */
	public static List<TaskAllocation> getTaskAllocations(Task task, Amalthea model) {
		List<TaskAllocation> allocs = new ArrayList<TaskAllocation>();
		
		if (model.getMappingModel().getTaskAllocation() != null && !model.getMappingModel().getTaskAllocation().isEmpty()) {
			for (TaskAllocation ta : model.getMappingModel().getTaskAllocation()) {
				if (ta.getTask().equals(task)) {
					allocs.add(ta);
				}
			}
		}
		
		return allocs;
	}
	
	/**
	 * Returns boolean if at least a label mapping exists
	 * @param label
	 * @return boolean
	 */
	public static boolean isMapped(Label label) {
		return !getLabelMapping(label).isEmpty();
	}
	
	/**
	 * Set of memories the label is mapped to (should be only one!)
	 * @param label
	 * @return Set of Memories
	 */
	public static Set<Memory> getLabelMapping(Label label) {
		Set<Memory> locations = new HashSet<>();
		if (label.getMappings()!= null) {
			for (MemoryMapping map :label.getMappings()) {
				locations.add(map.getMemory());
			}
		}
		return locations;
	}
	
	/**
	 * Returns a created LabelMapping element which was already added to the model 
	 * @param label
	 * @param mem
	 * @return MemoryMapping
	 */
	public static MemoryMapping setLabelMapping(Label label, Memory mem, Amalthea model) {
		MemoryMapping result = AmaltheaFactory.eINSTANCE.createMemoryMapping();
		if (mem == null || label == null)
			return result;
		result.setAbstractElement(label);
		result.setMemory(mem);
		ModelUtil.getOrCreateMappingModel(model).getMemoryMapping().add(result);
		return result;
	}
	
	
	
	/**
	 * 
	 * @param scheduler
	 * @param mappingModel
	 * @return All scheduler allocations referencing this scheduler 
	 */
	public static SchedulerAllocation getSchedulerAllocations(Scheduler scheduler, MappingModel mappingModel) {
		if (mappingModel.getSchedulerAllocation() != null) {
			for (SchedulerAllocation sa : mappingModel.getSchedulerAllocation()) {
				if (sa.getScheduler().equals(scheduler)) {
					return sa;
				}
			}
		}		
		return null;	
	}
	
	/**
	 * Returns a set of all task allocations of a specific scheduler
	 * @param taskScheduler  
	 * @param mappingmodel
	 * @return  Set of TaskAllocations
	 */
	public static Set<TaskAllocation> getTaskAllocationsForScheduler(TaskScheduler taskScheduler, MappingModel mappingmodel) {
		HashSet<TaskAllocation> taskAllocations = new HashSet<>();
		if (mappingmodel.getTaskAllocation() != null && !mappingmodel.getTaskAllocation().isEmpty()) {
			for (TaskAllocation taRun : mappingmodel.getTaskAllocation()) {
				if (taRun.getScheduler()!= null && taRun.getScheduler().equals(taskScheduler)) {
					taskAllocations.add(taRun);
				}
			}
		}		
		return taskAllocations;	
	}
	
	
	/**
	 * Returns the cores the process is assigned to.
	 * Empty core affinities are ignored, otherwise the intersection of core affinity and scheduler responsibility is returned
	 * @param process
	 * @param model
	 * @return Set of cores
	 */
	public static Set<ProcessingUnit> getAssignedCoreForProcess(Process process, Amalthea model) {
		Set<ProcessingUnit> result = new HashSet<>();
		if(process == null && model.getMappingModel() == null) 
			return result;
		Set<TaskAllocation> taskAllocations = new HashSet<>();
		if (model.getMappingModel().getTaskAllocation() != null && process instanceof Task && !model.getMappingModel().getTaskAllocation().isEmpty()) {
			for (TaskAllocation taskAlloc : model.getMappingModel().getTaskAllocation()) {
				if (taskAlloc.getTask().equals(process))
					taskAllocations.add(taskAlloc);
			}
			if (model.getMappingModel().getSchedulerAllocation() != null && !model.getMappingModel().getSchedulerAllocation().isEmpty() ) {
				for (SchedulerAllocation schedAlloc: model.getMappingModel().getSchedulerAllocation()) {
					for (TaskAllocation taskAlloc : taskAllocations) {
						if (schedAlloc.getScheduler().equals(taskAlloc.getScheduler()))
							//check core affinity -- retain the core affinity with the scheduler responsibility 
							if (taskAlloc.getAffinity()!= null && !taskAlloc.getAffinity().isEmpty()) {
								for (ProcessingUnit core : taskAlloc.getAffinity()) {
									if (schedAlloc.getResponsibility().contains(core))
										result.add(core);
								}
							}
							//responsibility defines core mapping
							else 
								result.addAll(schedAlloc.getResponsibility());
					}
				}					
			}
			return result;
		}
		if (model.getMappingModel().getIsrAllocation() != null && process instanceof ISR && !model.getMappingModel().getIsrAllocation().isEmpty()) {
			for (ISRAllocation isrAlloc : model.getMappingModel().getIsrAllocation()) {
				if (isrAlloc.getIsr().equals(process) && model.getMappingModel().getSchedulerAllocation() != null && !model.getMappingModel().getSchedulerAllocation().isEmpty()) {
					for (SchedulerAllocation coreAlloc : model.getMappingModel().getSchedulerAllocation()) {
						if (coreAlloc.getScheduler().equals(isrAlloc.getController())) {
							result.addAll(coreAlloc.getResponsibility());
						}
					}
				}
			}			
		}
		return result;
	}
	
	

	
	/**
	 * @param procUnitDef
	 * @return
	 */
	public List<HwFeatureCategory> getFeatureCategories (ProcessingUnitDefinition procUnitDef) {
		List<HwFeatureCategory> result = new ArrayList<>();
		for (HwFeature feature : procUnitDef.getFeatures()) {
			if (!result.contains(feature.getContainingCategory())) {
				result.add(feature.getContainingCategory());
				}
		}
		return result;
	}
	
	/**
	 * @param hwFeatureCat
	 * @param procUnitDefinitons
	 * @return
	 */
	public List<ProcessingUnitDefinition> getProcessingUnitDefinitionsForHwCategories(HwFeatureCategory hwFeatureCat, List<ProcessingUnitDefinition> procUnitDefinitons) {
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
	 * @param feature
	 * @param procUnitDefinitons
	 * @return
	 */
	public List<ProcessingUnitDefinition> getProcessingUnitDefinitionsForHwFeature(HwFeature feature, List<ProcessingUnitDefinition> procUnitDefinitons) {
		List<ProcessingUnitDefinition> result = new ArrayList<>();
		for (ProcessingUnitDefinition procUnitDef : procUnitDefinitons) {
			if (procUnitDef.getFeatures().contains(feature))
				result.add(procUnitDef);
		}
		return result;
	}
	
}
