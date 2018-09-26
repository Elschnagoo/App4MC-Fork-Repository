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
		container.operatingSystems += AmaltheaFactory.eINSTANCE.createOperatingSystem.init(initializer)
	}

	def operatingSystem_Vendor(OSModel container, (VendorOperatingSystem)=>void initializer) {
		container.operatingSystems += AmaltheaFactory.eINSTANCE.createVendorOperatingSystem.init(initializer)
	}

	def semaphore(OSModel container, (Semaphore)=>void initializer) {
		container.semaphores += AmaltheaFactory.eINSTANCE.createSemaphore.init(initializer)
	}

	def osOverhead(OSModel container, (OsInstructions)=>void initializer) {
		container.osOverheads += AmaltheaFactory.eINSTANCE.createOsInstructions.init(initializer)
	}

	// ********** Operating system **********

	def taskScheduler(OperatingSystem container, (TaskScheduler)=>void initializer) {
		container.taskSchedulers += AmaltheaFactory.eINSTANCE.createTaskScheduler.init(initializer)
	}

	def interruptController(OperatingSystem container, (InterruptController)=>void initializer) {
		container.interruptControllers += AmaltheaFactory.eINSTANCE.createInterruptController.init(initializer)
	}

	def dataConsistency(OperatingSystem container, (OsDataConsistency)=>void initializer) {
		container.osDataConsistency = AmaltheaFactory.eINSTANCE.createOsDataConsistency.init(initializer)
	}

	def labelAccess(Scheduler container, (LabelAccess)=>void initializer) {
		container.computationItems += AmaltheaFactory.eINSTANCE.createLabelAccess.init(initializer)
	}

	def parentAssociation(TaskScheduler container, (SchedulerAssociation)=>void initializer) {
		container.parentAssociation = AmaltheaFactory.eINSTANCE.createSchedulerAssociation.init(initializer)
	}

	def schedulingParameters(SchedulerAssociation container, (SchedulingParameters)=>void initializer) {
		container.schedulingParameters = AmaltheaFactory.eINSTANCE.createSchedulingParameters.init(initializer)
	}

	def parameter_extension(SchedulerAssociation container, String key, String value) {
		container.parameterExtensions.put(key, value)
	}


	// ********** OS instructions (overhead) **********

	def apiOverhead(OsInstructions container, (OsAPIInstructions)=>void initializer) {
		container.apiOverhead = AmaltheaFactory.eINSTANCE.createOsAPIInstructions.init(initializer)
	}

	def isrOverheadCat1(OsInstructions container, (OsISRInstructions)=>void initializer) {
		container.isrCategory1Overhead = AmaltheaFactory.eINSTANCE.createOsISRInstructions.init(initializer)
	}

	def isrOverheadCat2(OsInstructions container, (OsISRInstructions)=>void initializer) {
		container.isrCategory2Overhead = AmaltheaFactory.eINSTANCE.createOsISRInstructions.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}

}