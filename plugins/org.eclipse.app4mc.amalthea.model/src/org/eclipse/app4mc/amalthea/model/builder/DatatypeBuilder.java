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

package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Array;
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.DataTypeDefinition;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.Pointer;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Struct;
import org.eclipse.app4mc.amalthea.model.StructEntry;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class DatatypeBuilder {

	public void typeDefinition_BaseType(final SWModel container, final Procedure1<BaseTypeDefinition> initializer) {
		final BaseTypeDefinition obj = AmaltheaFactory.eINSTANCE.createBaseTypeDefinition();
		container.getTypeDefinitions().add(obj);
		initializer.apply(obj);
	}

	public void typeDefinition_DataType(final SWModel container, final Procedure1<DataTypeDefinition> initializer) {
		final DataTypeDefinition obj = AmaltheaFactory.eINSTANCE.createDataTypeDefinition();
		container.getTypeDefinitions().add(obj);
		initializer.apply(obj);
	}

	// ********** Data Types - Struct **********

	public void struct(final Channel container, final Procedure1<Struct> initializer) {
		final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
		container.setElementType(obj);
		initializer.apply(obj);
	}

	public void struct(final Label container, final Procedure1<Struct> initializer) {
		final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void struct(final DataTypeDefinition container, final Procedure1<Struct> initializer) {
		final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void struct(final Array container, final Procedure1<Struct> initializer) {
		final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void struct(final StructEntry container, final Procedure1<Struct> initializer) {
		final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void struct(final Pointer container, final Procedure1<Struct> initializer) {
		final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void entry(final Struct container, final Procedure1<StructEntry> initializer) {
		final StructEntry obj = AmaltheaFactory.eINSTANCE.createStructEntry();
		container.getEntries().add(obj);
		initializer.apply(obj);
	}

	// ********** Data Types - Array **********

	public void array(final Channel container, final Procedure1<Array> initializer) {
		final Array obj = AmaltheaFactory.eINSTANCE.createArray();
		container.setElementType(obj);
		initializer.apply(obj);
	}

	public void array(final Label container, final Procedure1<Array> initializer) {
		final Array obj = AmaltheaFactory.eINSTANCE.createArray();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void array(final DataTypeDefinition container, final Procedure1<Array> initializer) {
		final Array obj = AmaltheaFactory.eINSTANCE.createArray();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void array(final Array container, final Procedure1<Array> initializer) {
		final Array obj = AmaltheaFactory.eINSTANCE.createArray();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void array(final StructEntry container, final Procedure1<Array> initializer) {
		final Array obj = AmaltheaFactory.eINSTANCE.createArray();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void array(final Pointer container, final Procedure1<Array> initializer) {
		final Array obj = AmaltheaFactory.eINSTANCE.createArray();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	// ********** Data Types - Pointer **********

	public void pointer(final Channel container, final Procedure1<Pointer> initializer) {
		final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
		container.setElementType(obj);
		initializer.apply(obj);
	}

	public void pointer(final Label container, final Procedure1<Pointer> initializer) {
		final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void pointer(final DataTypeDefinition container, final Procedure1<Pointer> initializer) {
		final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void pointer(final Array container, final Procedure1<Pointer> initializer) {
		final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void pointer(final StructEntry container, final Procedure1<Pointer> initializer) {
		final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
		container.setDataType(obj);
		initializer.apply(obj);
	}

	public void pointer(final Pointer container, final Procedure1<Pointer> initializer) {
		final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
		container.setDataType(obj);
		initializer.apply(obj);
	}

}
