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
import org.eclipse.app4mc.amalthea.model.Array
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition
import org.eclipse.app4mc.amalthea.model.Channel
import org.eclipse.app4mc.amalthea.model.DataTypeDefinition
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.Pointer
import org.eclipse.app4mc.amalthea.model.SWModel
import org.eclipse.app4mc.amalthea.model.Struct
import org.eclipse.app4mc.amalthea.model.StructEntry

class DatatypeBuilder {

	def typeDefinition_BaseType(SWModel container, (BaseTypeDefinition)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createBaseTypeDefinition
		container.typeDefinitions += (obj)
		obj.init(initializer)
	}

	def typeDefinition_DataType(SWModel container, (DataTypeDefinition)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createDataTypeDefinition
		container.typeDefinitions += obj
		obj.init(initializer)
	}

	// ********** Data Types - Struct **********

	def struct(Channel container, (Struct)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createStruct
		container.elementType = obj
		obj.init(initializer)
	}

	def struct(Label container, (Struct)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createStruct
		container.dataType = obj
		obj.init(initializer)
	}

	def struct(DataTypeDefinition container, (Struct)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createStruct
		container.dataType = obj
		obj.init(initializer)
	}

	def struct(Array container, (Struct)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createStruct
		container.dataType = obj
		obj.init(initializer)
	}

	def struct(StructEntry container, (Struct)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createStruct
		container.dataType = obj
		obj.init(initializer)
	}

	def struct(Pointer container, (Struct)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createStruct
		container.dataType = obj
		obj.init(initializer)
	}

	def entry(Struct container, (StructEntry)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createStructEntry
		container.entries += obj
		obj.init(initializer)
	}

	// ********** Data Types - Array **********

	def array(Channel container, (Array)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createArray
		container.elementType = obj
		obj.init(initializer)
	}

	def array(Label container, (Array)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createArray
		container.dataType = obj
		obj.init(initializer)
	}

	def array(DataTypeDefinition container, (Array)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createArray
		container.dataType = obj
		obj.init(initializer)
	}

	def array(Array container, (Array)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createArray
		container.dataType = obj
		obj.init(initializer)
	}

	def array(StructEntry container, (Array)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createArray
		container.dataType = obj
		obj.init(initializer)
	}

	def array(Pointer container, (Array)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createArray
		container.dataType = obj
		obj.init(initializer)
	}

	// ********** Data Types - Pointer **********

	def pointer(Channel container, (Pointer)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPointer
		container.elementType = obj
		obj.init(initializer)
	}

	def pointer(Label container, (Pointer)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPointer
		container.dataType = obj
		obj.init(initializer)
	}

	def pointer(DataTypeDefinition container, (Pointer)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPointer
		container.dataType = obj
		obj.init(initializer)
	}

	def pointer(Array container, (Pointer)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPointer
		container.dataType = obj
		obj.init(initializer)
	}

	def pointer(StructEntry container, (Pointer)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPointer
		container.dataType = obj
		obj.init(initializer)
	}

	def pointer(Pointer container, (Pointer)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPointer
		container.dataType = obj
		obj.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}

}