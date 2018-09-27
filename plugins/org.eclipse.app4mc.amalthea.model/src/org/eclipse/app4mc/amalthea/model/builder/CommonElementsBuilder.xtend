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
		val obj = AmaltheaFactory.eINSTANCE.createMemoryClassifier
		container.memoryClassifiers += obj
		obj.init(initializer)
	}
	def coreClassifier(CommonElements container, (CoreClassifier)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCoreClassifier
		container.coreClassifiers += obj
		obj.init(initializer)
	}
	def tag(CommonElements container, (Tag)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createTag
		container.tags += obj
		obj.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}
		
}