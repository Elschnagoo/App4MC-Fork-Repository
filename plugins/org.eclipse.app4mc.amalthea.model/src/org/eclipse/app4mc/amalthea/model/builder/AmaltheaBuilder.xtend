package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.CommonElements
import org.eclipse.app4mc.amalthea.model.ComponentsModel
import org.eclipse.app4mc.amalthea.model.ConstraintsModel
import org.eclipse.app4mc.amalthea.model.EventModel
import org.eclipse.app4mc.amalthea.model.HWModel
import org.eclipse.app4mc.amalthea.model.IReferable
import org.eclipse.app4mc.amalthea.model.MappingModel
import org.eclipse.app4mc.amalthea.model.OSModel
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel
import org.eclipse.app4mc.amalthea.model.SWModel
import org.eclipse.app4mc.amalthea.model.StimuliModel

class AmaltheaBuilder {

	val objectRegistry = <String, IReferable> newHashMap

	def amaltheaRoot((Amalthea)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createAmalthea.init(initializer)
	}

	// ********** Top level elements **********

	def commonElements(Amalthea container, (CommonElements)=>void initializer) {
		container.commonElements = AmaltheaFactory.eINSTANCE.createCommonElements.init(initializer)
	}

	def eventModel(Amalthea container, (EventModel)=>void initializer) {
		container.eventModel = AmaltheaFactory.eINSTANCE.createEventModel.init(initializer)
	}

	def stimuliModel(Amalthea container, (StimuliModel)=>void initializer) {
		container.stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel.init(initializer)
	}

	def softwareModel(Amalthea container, (SWModel)=>void initializer) {
		container.swModel = AmaltheaFactory.eINSTANCE.createSWModel.init(initializer)
	}

	def osModel(Amalthea container, (OSModel)=>void initializer) {
		container.osModel = AmaltheaFactory.eINSTANCE.createOSModel.init(initializer)
	}

	def hardwareModel(Amalthea container, (HWModel)=>void initializer) {
		container.hwModel = AmaltheaFactory.eINSTANCE.createHWModel.init(initializer)
	}

	def constraintsModel(Amalthea container, (ConstraintsModel)=>void initializer) {
		container.constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel.init(initializer)
	}

	def propertyConstraintsModel(Amalthea container, (PropertyConstraintsModel)=>void initializer) {
		container.propertyConstraintsModel = AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel.init(initializer)
	}

	def componentsModel(Amalthea container, (ComponentsModel)=>void initializer) {
		container.componentsModel = AmaltheaFactory.eINSTANCE.createComponentsModel.init(initializer)
	}

	def mappingModel(Amalthea container, (MappingModel)=>void initializer) {
		container.mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel.init(initializer)
	}

	// ********** Cross reference registry **********
	
	def <T extends IReferable> void register(T obj, String name) {
		objectRegistry.put(name, obj)
	}
	
	def <T extends IReferable> T ref(Class<T> cl, String name) {
		val obj = objectRegistry.get(name)	
		cl.cast(obj)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}

}