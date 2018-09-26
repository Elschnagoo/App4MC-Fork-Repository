package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.HWModel
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.CacheDefinition
import org.eclipse.app4mc.amalthea.model.MemoryDefinition
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition
import org.eclipse.app4mc.amalthea.model.FrequencyDomain
import org.eclipse.app4mc.amalthea.model.PowerDomain
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory
import org.eclipse.app4mc.amalthea.model.HwStructure

class HardwareBuilder {

	def hardwareModelRoot((HWModel)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createHWModel.init(initializer)
	}

	// ********** Top level elements **********

	def definition_Cache(HWModel container, (CacheDefinition)=>void initializer) {
		container.definitions += AmaltheaFactory.eINSTANCE.createCacheDefinition.init(initializer)
	}

	def definition_Memory(HWModel container, (MemoryDefinition)=>void initializer) {
		container.definitions += AmaltheaFactory.eINSTANCE.createMemoryDefinition.init(initializer)
	}

	def definition_ProcessingUnit(HWModel container, (ProcessingUnitDefinition)=>void initializer) {
		container.definitions += AmaltheaFactory.eINSTANCE.createProcessingUnitDefinition.init(initializer)
	}

	def definition_ConnectionHandler(HWModel container, (ConnectionHandlerDefinition)=>void initializer) {
		container.definitions += AmaltheaFactory.eINSTANCE.createConnectionHandlerDefinition.init(initializer)
	}

	def domain_Frequency(HWModel container, (FrequencyDomain)=>void initializer) {
		container.domains += AmaltheaFactory.eINSTANCE.createFrequencyDomain.init(initializer)
	}

	def domain_Power(HWModel container, (PowerDomain)=>void initializer) {
		container.domains += AmaltheaFactory.eINSTANCE.createPowerDomain.init(initializer)
	}

	def featureCategory(HWModel container, (HwFeatureCategory)=>void initializer) {
		container.featureCategories += AmaltheaFactory.eINSTANCE.createHwFeatureCategory.init(initializer)
	}

	def structure(HWModel container, (HwStructure)=>void initializer) {
		container.structures += AmaltheaFactory.eINSTANCE.createHwStructure.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}

}