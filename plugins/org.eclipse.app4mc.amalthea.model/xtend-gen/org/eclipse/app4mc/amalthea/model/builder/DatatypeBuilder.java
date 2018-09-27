/**
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
import org.eclipse.app4mc.amalthea.model.TypeDefinition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DatatypeBuilder {
  public BaseTypeDefinition typeDefinition_BaseType(final SWModel container, final Procedure1<? super BaseTypeDefinition> initializer) {
    BaseTypeDefinition _xblockexpression = null;
    {
      final BaseTypeDefinition obj = AmaltheaFactory.eINSTANCE.createBaseTypeDefinition();
      EList<TypeDefinition> _typeDefinitions = container.getTypeDefinitions();
      _typeDefinitions.add(obj);
      _xblockexpression = this.<BaseTypeDefinition>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public DataTypeDefinition typeDefinition_DataType(final SWModel container, final Procedure1<? super DataTypeDefinition> initializer) {
    DataTypeDefinition _xblockexpression = null;
    {
      final DataTypeDefinition obj = AmaltheaFactory.eINSTANCE.createDataTypeDefinition();
      EList<TypeDefinition> _typeDefinitions = container.getTypeDefinitions();
      _typeDefinitions.add(obj);
      _xblockexpression = this.<DataTypeDefinition>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Struct struct(final Channel container, final Procedure1<? super Struct> initializer) {
    Struct _xblockexpression = null;
    {
      final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
      container.setElementType(obj);
      _xblockexpression = this.<Struct>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Struct struct(final Label container, final Procedure1<? super Struct> initializer) {
    Struct _xblockexpression = null;
    {
      final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
      container.setDataType(obj);
      _xblockexpression = this.<Struct>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Struct struct(final DataTypeDefinition container, final Procedure1<? super Struct> initializer) {
    Struct _xblockexpression = null;
    {
      final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
      container.setDataType(obj);
      _xblockexpression = this.<Struct>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Struct struct(final Array container, final Procedure1<? super Struct> initializer) {
    Struct _xblockexpression = null;
    {
      final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
      container.setDataType(obj);
      _xblockexpression = this.<Struct>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Struct struct(final StructEntry container, final Procedure1<? super Struct> initializer) {
    Struct _xblockexpression = null;
    {
      final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
      container.setDataType(obj);
      _xblockexpression = this.<Struct>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Struct struct(final Pointer container, final Procedure1<? super Struct> initializer) {
    Struct _xblockexpression = null;
    {
      final Struct obj = AmaltheaFactory.eINSTANCE.createStruct();
      container.setDataType(obj);
      _xblockexpression = this.<Struct>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public StructEntry entry(final Struct container, final Procedure1<? super StructEntry> initializer) {
    StructEntry _xblockexpression = null;
    {
      final StructEntry obj = AmaltheaFactory.eINSTANCE.createStructEntry();
      EList<StructEntry> _entries = container.getEntries();
      _entries.add(obj);
      _xblockexpression = this.<StructEntry>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Array array(final Channel container, final Procedure1<? super Array> initializer) {
    Array _xblockexpression = null;
    {
      final Array obj = AmaltheaFactory.eINSTANCE.createArray();
      container.setElementType(obj);
      _xblockexpression = this.<Array>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Array array(final Label container, final Procedure1<? super Array> initializer) {
    Array _xblockexpression = null;
    {
      final Array obj = AmaltheaFactory.eINSTANCE.createArray();
      container.setDataType(obj);
      _xblockexpression = this.<Array>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Array array(final DataTypeDefinition container, final Procedure1<? super Array> initializer) {
    Array _xblockexpression = null;
    {
      final Array obj = AmaltheaFactory.eINSTANCE.createArray();
      container.setDataType(obj);
      _xblockexpression = this.<Array>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Array array(final Array container, final Procedure1<? super Array> initializer) {
    Array _xblockexpression = null;
    {
      final Array obj = AmaltheaFactory.eINSTANCE.createArray();
      container.setDataType(obj);
      _xblockexpression = this.<Array>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Array array(final StructEntry container, final Procedure1<? super Array> initializer) {
    Array _xblockexpression = null;
    {
      final Array obj = AmaltheaFactory.eINSTANCE.createArray();
      container.setDataType(obj);
      _xblockexpression = this.<Array>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Array array(final Pointer container, final Procedure1<? super Array> initializer) {
    Array _xblockexpression = null;
    {
      final Array obj = AmaltheaFactory.eINSTANCE.createArray();
      container.setDataType(obj);
      _xblockexpression = this.<Array>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Pointer pointer(final Channel container, final Procedure1<? super Pointer> initializer) {
    Pointer _xblockexpression = null;
    {
      final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
      container.setElementType(obj);
      _xblockexpression = this.<Pointer>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Pointer pointer(final Label container, final Procedure1<? super Pointer> initializer) {
    Pointer _xblockexpression = null;
    {
      final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
      container.setDataType(obj);
      _xblockexpression = this.<Pointer>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Pointer pointer(final DataTypeDefinition container, final Procedure1<? super Pointer> initializer) {
    Pointer _xblockexpression = null;
    {
      final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
      container.setDataType(obj);
      _xblockexpression = this.<Pointer>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Pointer pointer(final Array container, final Procedure1<? super Pointer> initializer) {
    Pointer _xblockexpression = null;
    {
      final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
      container.setDataType(obj);
      _xblockexpression = this.<Pointer>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Pointer pointer(final StructEntry container, final Procedure1<? super Pointer> initializer) {
    Pointer _xblockexpression = null;
    {
      final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
      container.setDataType(obj);
      _xblockexpression = this.<Pointer>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Pointer pointer(final Pointer container, final Procedure1<? super Pointer> initializer) {
    Pointer _xblockexpression = null;
    {
      final Pointer obj = AmaltheaFactory.eINSTANCE.createPointer();
      container.setDataType(obj);
      _xblockexpression = this.<Pointer>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
