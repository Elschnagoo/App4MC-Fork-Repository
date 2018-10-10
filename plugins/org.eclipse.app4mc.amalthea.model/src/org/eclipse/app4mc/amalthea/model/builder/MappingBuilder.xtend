/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.ISRAllocation
import org.eclipse.app4mc.amalthea.model.MappingModel
import org.eclipse.app4mc.amalthea.model.MemoryMapping
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping
import org.eclipse.app4mc.amalthea.model.RunnableAllocation
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation
import org.eclipse.app4mc.amalthea.model.TaskAllocation

class MappingBuilder {
	def mappingModelRoot((MappingModel)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createMappingModel.init(initializer)
	}

	// ********** Top level elements **********

	def isrAllocation(MappingModel container, (ISRAllocation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createISRAllocation
		container.isrAllocation += obj
		obj.init(initializer)
	}

	def taskAllocation(MappingModel container, (TaskAllocation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createTaskAllocation
		container.taskAllocation += obj
		obj.init(initializer)
	}

	def runnableAllocation(MappingModel container, (RunnableAllocation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableAllocation
		container.runnableAllocation += obj
		obj.init(initializer)
	}

	def schedulerAllocation(MappingModel container, (SchedulerAllocation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSchedulerAllocation
		container.schedulerAllocation += obj
		obj.init(initializer)
	}

	def memoryMapping(MappingModel container, (MemoryMapping)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createMemoryMapping
		container.memoryMapping += obj
		obj.init(initializer)
	}

	def physicalSectionMapping(MappingModel container, (PhysicalSectionMapping)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPhysicalSectionMapping
		container.physicalSectionMapping += obj
		obj.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}
		
}