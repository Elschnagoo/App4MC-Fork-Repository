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

import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex
import org.eclipse.app4mc.amalthea.model.CommonElements
import org.eclipse.app4mc.amalthea.model.ComponentsModel
import org.eclipse.app4mc.amalthea.model.ConstraintsModel
import org.eclipse.app4mc.amalthea.model.EventModel
import org.eclipse.app4mc.amalthea.model.HWModel
import org.eclipse.app4mc.amalthea.model.INamed
import org.eclipse.app4mc.amalthea.model.MappingModel
import org.eclipse.app4mc.amalthea.model.OSModel
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel
import org.eclipse.app4mc.amalthea.model.SWModel
import org.eclipse.app4mc.amalthea.model.StimuliModel
import org.eclipse.emf.ecore.EObject

class AmaltheaBuilder {

	val objectRegistry = <String, EObject> newHashMap

	def amalthea((Amalthea)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createAmalthea.init(initializer)
	}

	// ********** Top level elements **********

	def commonElements(Amalthea container, (CommonElements)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCommonElements
		container.commonElements = obj
		obj.init(initializer)
	}

	def eventModel(Amalthea container, (EventModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createEventModel
		container.eventModel = obj
		obj.init(initializer)
	}

	def stimuliModel(Amalthea container, (StimuliModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createStimuliModel
		container.stimuliModel = obj
		obj.init(initializer)
	}

	def softwareModel(Amalthea container, (SWModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSWModel
		container.swModel = obj
		obj.init(initializer)
	}

	def osModel(Amalthea container, (OSModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createOSModel
		container.osModel = obj
		obj.init(initializer)
	}

	def hardwareModel(Amalthea container, (HWModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHWModel
		container.hwModel = obj
		obj.init(initializer)
	}

	def constraintsModel(Amalthea container, (ConstraintsModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createConstraintsModel
		container.constraintsModel = obj
		obj.init(initializer)
	}

	def propertyConstraintsModel(Amalthea container, (PropertyConstraintsModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel
		container.propertyConstraintsModel = obj
		obj.init(initializer)
	}

	def componentsModel(Amalthea container, (ComponentsModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createComponentsModel
		container.componentsModel = obj
		obj.init(initializer)
	}

	def mappingModel(Amalthea container, (MappingModel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createMappingModel
		container.mappingModel = obj
		obj.init(initializer)
	}

	// ********** Cross reference registry **********
	
	def <T extends EObject> void _reg(T obj, String name) {
		objectRegistry.put(name, obj)
	}
	
	def <T extends EObject> T _ref(Class<T> cl, String name) {
		val obj = objectRegistry.get(name)
		// TODO handle NULL
		cl.cast(obj)
	}

	// ********** Cross reference finder (via name based index search) **********
	
		def <T extends INamed> T _find(EObject context, Class<T> cl, String name) {
		val resultSet = AmaltheaIndex.getElements(context, name, cl)
		// TODO handle NULL
		resultSet.head
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}

}