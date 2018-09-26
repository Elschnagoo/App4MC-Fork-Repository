package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.CommonElements
import org.eclipse.app4mc.amalthea.model.CoreClassifier
import org.eclipse.app4mc.amalthea.model.MemoryClassifier
import org.eclipse.app4mc.amalthea.model.Tag

class CommonElementsBuilder {

	def commonElementsRoot((CommonElements)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createCommonElements.init(initializer)
	}

	// ********** Top level elements **********

	def memoryClassifier(CommonElements container, (MemoryClassifier)=>void initializer) {
		container.memoryClassifiers += AmaltheaFactory.eINSTANCE.createMemoryClassifier.init(initializer)
	}
	def coreClassifier(CommonElements container, (CoreClassifier)=>void initializer) {
		container.coreClassifiers += AmaltheaFactory.eINSTANCE.createCoreClassifier.init(initializer)
	}
	def tag(CommonElements container, (Tag)=>void initializer) {
		container.tags += AmaltheaFactory.eINSTANCE.createTag.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}
		
}