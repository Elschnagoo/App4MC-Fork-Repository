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
import org.eclipse.app4mc.amalthea.model.Cache
import org.eclipse.app4mc.amalthea.model.CacheDefinition
import org.eclipse.app4mc.amalthea.model.ConnectionHandler
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition
import org.eclipse.app4mc.amalthea.model.FrequencyDomain
import org.eclipse.app4mc.amalthea.model.HWModel
import org.eclipse.app4mc.amalthea.model.HwAccessElement
import org.eclipse.app4mc.amalthea.model.HwAccessPath
import org.eclipse.app4mc.amalthea.model.HwConnection
import org.eclipse.app4mc.amalthea.model.HwFeature
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory
import org.eclipse.app4mc.amalthea.model.HwPort
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.app4mc.amalthea.model.Memory
import org.eclipse.app4mc.amalthea.model.MemoryDefinition
import org.eclipse.app4mc.amalthea.model.PowerDomain
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition

class HardwareBuilder {

	def hardwareModelRoot((HWModel)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createHWModel.init(initializer)
	}

	// ********** Top level elements **********

	def definition_Cache(HWModel container, (CacheDefinition)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCacheDefinition
		container.definitions += obj
		obj.init(initializer)
	}

	def definition_Memory(HWModel container, (MemoryDefinition)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createMemoryDefinition
		container.definitions += obj
		obj.init(initializer)
	}

	def definition_ProcessingUnit(HWModel container, (ProcessingUnitDefinition)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProcessingUnitDefinition
		container.definitions += obj
		obj.init(initializer)
	}

	def definition_ConnectionHandler(HWModel container, (ConnectionHandlerDefinition)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createConnectionHandlerDefinition
		container.definitions += obj
		obj.init(initializer)
	}

	def domain_Frequency(HWModel container, (FrequencyDomain)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createFrequencyDomain
		container.domains += obj
		obj.init(initializer)
	}

	def domain_Power(HWModel container, (PowerDomain)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPowerDomain
		container.domains += obj
		obj.init(initializer)
	}

	def featureCategory(HWModel container, (HwFeatureCategory)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwFeatureCategory
		container.featureCategories += obj
		obj.init(initializer)
	}

	def structure(HWModel container, (HwStructure)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwStructure
		container.structures += obj
		obj.init(initializer)
	}

	// ********** Features **********

	def feature(HwFeatureCategory container, (HwFeature)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwFeature
		container.features += obj
		obj.init(initializer)
	}

	// ********** Structures **********

	def structure(HwStructure container, (HwStructure)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwStructure
		container.structures += obj
		obj.init(initializer)
	}

	def module_Memory(HwStructure container, (Memory)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createMemory
		container.modules += obj
		obj.init(initializer)
	}

	def module_ProcessingUnit(HwStructure container, (ProcessingUnit)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProcessingUnit
		container.modules += obj
		obj.init(initializer)
	}

	def module_Cache(HwStructure container, (Cache)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCache
		container.modules += obj
		obj.init(initializer)
	}

	def module_ConnectionHandler(HwStructure container, (ConnectionHandler)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createConnectionHandler
		container.modules += obj
		obj.init(initializer)
	}

	def connection(HwStructure container, (HwConnection)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwConnection
		container.connections += obj
		obj.init(initializer)
	}

	def port(HwStructure container, (HwPort)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwPort
		container.ports += obj
		obj.init(initializer)
	}

	def port(Memory container, (HwPort)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwPort
		container.ports += obj
		obj.init(initializer)
	}

	def port(ProcessingUnit container, (HwPort)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwPort
		container.ports += obj
		obj.init(initializer)
	}

	def port(Cache container, (HwPort)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwPort
		container.ports += obj
		obj.init(initializer)
	}

	def port(ConnectionHandler container, (HwPort)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwPort
		container.ports += obj
		obj.init(initializer)
	}

	def cache(ProcessingUnit container, (Cache)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCache
		container.caches += obj
		obj.init(initializer)
	}

	def access(ProcessingUnit container, (HwAccessElement)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwAccessElement
		container.accessElements += obj
		obj.init(initializer)
	}

	def path(HwAccessElement container, (HwAccessPath)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwAccessPath
		container.accessPath = obj
		obj.init(initializer)
	}



	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}

}