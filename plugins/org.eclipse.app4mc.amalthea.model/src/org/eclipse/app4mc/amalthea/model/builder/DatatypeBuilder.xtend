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
		container.typeDefinitions += AmaltheaFactory.eINSTANCE.createBaseTypeDefinition.init(initializer)
	}

	def typeDefinition_DataType(SWModel container, (DataTypeDefinition)=>void initializer) {
		container.typeDefinitions += AmaltheaFactory.eINSTANCE.createDataTypeDefinition.init(initializer)
	}

	// ********** Data Types - Struct **********

	def struct(Channel container, (Struct)=>void initializer) {
		container.elementType = AmaltheaFactory.eINSTANCE.createStruct.init(initializer)
	}

	def struct(Label container, (Struct)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createStruct.init(initializer)
	}

	def struct(DataTypeDefinition container, (Struct)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createStruct.init(initializer)
	}

	def struct(Array container, (Struct)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createStruct.init(initializer)
	}

	def struct(StructEntry container, (Struct)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createStruct.init(initializer)
	}

	def struct(Pointer container, (Struct)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createStruct.init(initializer)
	}

	def entry(Struct container, (StructEntry)=>void initializer) {
		container.entries += AmaltheaFactory.eINSTANCE.createStructEntry.init(initializer)
	}

	// ********** Data Types - Array **********

	def array(Channel container, (Array)=>void initializer) {
		container.elementType = AmaltheaFactory.eINSTANCE.createArray.init(initializer)
	}

	def array(Label container, (Array)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createArray.init(initializer)
	}

	def array(DataTypeDefinition container, (Array)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createArray.init(initializer)
	}

	def array(Array container, (Array)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createArray.init(initializer)
	}

	def array(StructEntry container, (Array)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createArray.init(initializer)
	}

	def array(Pointer container, (Array)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createArray.init(initializer)
	}

	// ********** Data Types - Pointer **********

	def pointer(Channel container, (Pointer)=>void initializer) {
		container.elementType = AmaltheaFactory.eINSTANCE.createPointer.init(initializer)
	}

	def pointer(Label container, (Pointer)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createPointer.init(initializer)
	}

	def pointer(DataTypeDefinition container, (Pointer)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createPointer.init(initializer)
	}

	def pointer(Array container, (Pointer)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createPointer.init(initializer)
	}

	def pointer(StructEntry container, (Pointer)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createPointer.init(initializer)
	}

	def pointer(Pointer container, (Pointer)=>void initializer) {
		container.dataType = AmaltheaFactory.eINSTANCE.createPointer.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}
	
}