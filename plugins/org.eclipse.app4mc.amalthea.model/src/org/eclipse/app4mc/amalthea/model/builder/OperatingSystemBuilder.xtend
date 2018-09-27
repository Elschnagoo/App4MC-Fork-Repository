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
import org.eclipse.app4mc.amalthea.model.InterruptController
import org.eclipse.app4mc.amalthea.model.LabelAccess
import org.eclipse.app4mc.amalthea.model.OSModel
import org.eclipse.app4mc.amalthea.model.OperatingSystem
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions
import org.eclipse.app4mc.amalthea.model.OsDataConsistency
import org.eclipse.app4mc.amalthea.model.OsISRInstructions
import org.eclipse.app4mc.amalthea.model.OsInstructions
import org.eclipse.app4mc.amalthea.model.Scheduler
import org.eclipse.app4mc.amalthea.model.SchedulerAssociation
import org.eclipse.app4mc.amalthea.model.SchedulingParameters
import org.eclipse.app4mc.amalthea.model.Semaphore
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.VendorOperatingSystem

class OperatingSystemBuilder {

	def osModelRoot((OSModel)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createOSModel.init(initializer)
	}

	// ********** Top level elements **********

	def operatingSystem(OSModel container, (OperatingSystem)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createOperatingSystem
		container.operatingSystems += obj
		obj.init(initializer)
	}

	def operatingSystem_Vendor(OSModel container, (VendorOperatingSystem)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createVendorOperatingSystem
		container.operatingSystems += obj
		obj.init(initializer)
	}

	def semaphore(OSModel container, (Semaphore)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSemaphore
		container.semaphores += obj
		obj.init(initializer)
	}

	def osOverhead(OSModel container, (OsInstructions)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createOsInstructions
		container.osOverheads += obj
		obj.init(initializer)
	}

	// ********** Operating system **********

	def taskScheduler(OperatingSystem container, (TaskScheduler)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createTaskScheduler
		container.taskSchedulers += obj
		obj.init(initializer)
	}

	def interruptController(OperatingSystem container, (InterruptController)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createInterruptController
		container.interruptControllers += obj
		obj.init(initializer)
	}

	def dataConsistency(OperatingSystem container, (OsDataConsistency)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createOsDataConsistency
		container.osDataConsistency = obj
		obj.init(initializer)
	}

	def labelAccess(Scheduler container, (LabelAccess)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createLabelAccess
		container.computationItems += obj
		obj.init(initializer)
	}

	def parentAssociation(TaskScheduler container, (SchedulerAssociation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSchedulerAssociation
		container.parentAssociation = obj
		obj.init(initializer)
	}

	def schedulingParameters(SchedulerAssociation container, (SchedulingParameters)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSchedulingParameters
		container.schedulingParameters = obj
		obj.init(initializer)
	}

	def parameter_extension(SchedulerAssociation container, String key, String value) {
		container.parameterExtensions.put(key, value)
	}


	// ********** OS instructions (overhead) **********

	def apiOverhead(OsInstructions container, (OsAPIInstructions)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createOsAPIInstructions
		container.apiOverhead = obj
		obj.init(initializer)
	}

	def isrOverheadCat1(OsInstructions container, (OsISRInstructions)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createOsISRInstructions
		container.isrCategory1Overhead = obj
		obj.init(initializer)
	}

	def isrOverheadCat2(OsInstructions container, (OsISRInstructions)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createOsISRInstructions
		container.isrCategory2Overhead = obj
		obj.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}

}