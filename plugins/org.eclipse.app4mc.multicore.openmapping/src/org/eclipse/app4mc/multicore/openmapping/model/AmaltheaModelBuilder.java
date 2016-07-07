/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.model;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;

public class AmaltheaModelBuilder {
	private final OMMapping mapping;
	private Amalthea centralModel;

	public AmaltheaModelBuilder(final OMMapping mapping) {
		this.mapping = mapping;
	}

	public Amalthea getAmaltheaModel() {
		assert null != this.mapping;
		// Build the model if it is not present or has been updated
		if (null == this.centralModel) {
			buildAmaltheaModel();
		}

		return this.centralModel;
	}

	private void buildAmaltheaModel() {
		// Create an empty MappingModel
		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
		// TODO Ideally, this should be handled by an OSModel Builder
		// Create an OSModel with a parent element "OS"
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final OperatingSystem os = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		os.setName("OS");
		osModel.getOperatingSystems().add(os);

		// Create the schedulers and the allocations (core<->scheduler && task<->scheduler)
		final HashMap<OMCore, OMScheduler> coreSchedulerMap = new HashMap<OMCore, OMScheduler>();
		final Iterator<OMAllocation> itAllocations = this.mapping.getAllocationList().iterator();
		while (itAllocations.hasNext()) {
			final OMAllocation allocation = itAllocations.next();
			// TODO Allocation Attributes are still missing!
			final OMCore core = allocation.getCore();
			final OMTask task = allocation.getTask();
			OMScheduler scheduler;

			// Check if scheduler has been created and store / create and store it
			if (coreSchedulerMap.containsKey(core)) {
				scheduler = coreSchedulerMap.get(core);
			}
			else {
				// Create scheduler
				scheduler = new OMScheduler(core);
				// Add scheduler to os model
				os.getTaskSchedulers().add(scheduler.getSchedulerRef());
				// Create entries in mapping model
				final CoreAllocation coreAlloc = AmaltheaFactory.eINSTANCE.createCoreAllocation();
				coreAlloc.getCore().add(core.getCoreRef());
				coreAlloc.setScheduler(scheduler.getSchedulerRef());
				mappingModel.getCoreAllocation().add(coreAlloc);
				// Remember Scheduler in map
				coreSchedulerMap.put(core, scheduler);
			}
			// Create Task<->Scheduler allocation entries in mapping model
			final TaskAllocation taskAlloc = AmaltheaFactory.eINSTANCE.createTaskAllocation();
			taskAlloc.setTask(task.getTaskRef());
			taskAlloc.setScheduler(scheduler.getSchedulerRef());
			mappingModel.getTaskAllocation().add(taskAlloc);
		}
		// Create AMALTHEA (Central) model and store results
		this.centralModel = AmaltheaFactory.eINSTANCE.createAmalthea();
		this.centralModel.setOsModel(osModel);
		this.centralModel.setMappingModel(mappingModel);
	}
}
