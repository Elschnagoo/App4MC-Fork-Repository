/**
 ********************************************************************************
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class MappingBuilder {

	public MappingModel mappingModelRoot(final Procedure1<MappingModel> initializer) {
		final MappingModel obj = AmaltheaFactory.eINSTANCE.createMappingModel();
		initializer.apply(obj);
		return obj;
	}

	// ********** Top level elements **********

	public void isrAllocation(final MappingModel container, final Procedure1<ISRAllocation> initializer) {
		final ISRAllocation obj = AmaltheaFactory.eINSTANCE.createISRAllocation();
		container.getIsrAllocation().add(obj);
		initializer.apply(obj);
	}

	public void taskAllocation(final MappingModel container, final Procedure1<TaskAllocation> initializer) {
		final TaskAllocation obj = AmaltheaFactory.eINSTANCE.createTaskAllocation();
		container.getTaskAllocation().add(obj);
		initializer.apply(obj);
	}

	public void runnableAllocation(final MappingModel container, final Procedure1<RunnableAllocation> initializer) {
		final RunnableAllocation obj = AmaltheaFactory.eINSTANCE.createRunnableAllocation();
		container.getRunnableAllocation().add(obj);
		initializer.apply(obj);
	}

	public void schedulerAllocation(final MappingModel container, final Procedure1<SchedulerAllocation> initializer) {
		final SchedulerAllocation obj = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
		container.getSchedulerAllocation().add(obj);
		initializer.apply(obj);
	}

	public void memoryMapping(final MappingModel container, final Procedure1<MemoryMapping> initializer) {
		final MemoryMapping obj = AmaltheaFactory.eINSTANCE.createMemoryMapping();
		container.getMemoryMapping().add(obj);
		initializer.apply(obj);
	}

	public void physicalSectionMapping(final MappingModel container, final Procedure1<PhysicalSectionMapping> initializer) {
		final PhysicalSectionMapping obj = AmaltheaFactory.eINSTANCE.createPhysicalSectionMapping();
		container.getPhysicalSectionMapping().add(obj);
		initializer.apply(obj);
	}

}
