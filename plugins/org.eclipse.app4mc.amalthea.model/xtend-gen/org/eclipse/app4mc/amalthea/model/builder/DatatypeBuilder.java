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
  public boolean typeDefinition_BaseType(final SWModel container, final Procedure1<? super BaseTypeDefinition> initializer) {
    EList<TypeDefinition> _typeDefinitions = container.getTypeDefinitions();
    BaseTypeDefinition _init = this.<BaseTypeDefinition>init(AmaltheaFactory.eINSTANCE.createBaseTypeDefinition(), initializer);
    return _typeDefinitions.add(_init);
  }
  
  public boolean typeDefinition_DataType(final SWModel container, final Procedure1<? super DataTypeDefinition> initializer) {
    EList<TypeDefinition> _typeDefinitions = container.getTypeDefinitions();
    DataTypeDefinition _init = this.<DataTypeDefinition>init(AmaltheaFactory.eINSTANCE.createDataTypeDefinition(), initializer);
    return _typeDefinitions.add(_init);
  }
  
  public void struct(final Channel container, final Procedure1<? super Struct> initializer) {
    container.setElementType(this.<Struct>init(AmaltheaFactory.eINSTANCE.createStruct(), initializer));
  }
  
  public void struct(final Label container, final Procedure1<? super Struct> initializer) {
    container.setDataType(this.<Struct>init(AmaltheaFactory.eINSTANCE.createStruct(), initializer));
  }
  
  public void struct(final DataTypeDefinition container, final Procedure1<? super Struct> initializer) {
    container.setDataType(this.<Struct>init(AmaltheaFactory.eINSTANCE.createStruct(), initializer));
  }
  
  public void struct(final Array container, final Procedure1<? super Struct> initializer) {
    container.setDataType(this.<Struct>init(AmaltheaFactory.eINSTANCE.createStruct(), initializer));
  }
  
  public void struct(final StructEntry container, final Procedure1<? super Struct> initializer) {
    container.setDataType(this.<Struct>init(AmaltheaFactory.eINSTANCE.createStruct(), initializer));
  }
  
  public void struct(final Pointer container, final Procedure1<? super Struct> initializer) {
    container.setDataType(this.<Struct>init(AmaltheaFactory.eINSTANCE.createStruct(), initializer));
  }
  
  public boolean entry(final Struct container, final Procedure1<? super StructEntry> initializer) {
    EList<StructEntry> _entries = container.getEntries();
    StructEntry _init = this.<StructEntry>init(AmaltheaFactory.eINSTANCE.createStructEntry(), initializer);
    return _entries.add(_init);
  }
  
  public void array(final Channel container, final Procedure1<? super Array> initializer) {
    container.setElementType(this.<Array>init(AmaltheaFactory.eINSTANCE.createArray(), initializer));
  }
  
  public void array(final Label container, final Procedure1<? super Array> initializer) {
    container.setDataType(this.<Array>init(AmaltheaFactory.eINSTANCE.createArray(), initializer));
  }
  
  public void array(final DataTypeDefinition container, final Procedure1<? super Array> initializer) {
    container.setDataType(this.<Array>init(AmaltheaFactory.eINSTANCE.createArray(), initializer));
  }
  
  public void array(final Array container, final Procedure1<? super Array> initializer) {
    container.setDataType(this.<Array>init(AmaltheaFactory.eINSTANCE.createArray(), initializer));
  }
  
  public void array(final StructEntry container, final Procedure1<? super Array> initializer) {
    container.setDataType(this.<Array>init(AmaltheaFactory.eINSTANCE.createArray(), initializer));
  }
  
  public void array(final Pointer container, final Procedure1<? super Array> initializer) {
    container.setDataType(this.<Array>init(AmaltheaFactory.eINSTANCE.createArray(), initializer));
  }
  
  public void pointer(final Channel container, final Procedure1<? super Pointer> initializer) {
    container.setElementType(this.<Pointer>init(AmaltheaFactory.eINSTANCE.createPointer(), initializer));
  }
  
  public void pointer(final Label container, final Procedure1<? super Pointer> initializer) {
    container.setDataType(this.<Pointer>init(AmaltheaFactory.eINSTANCE.createPointer(), initializer));
  }
  
  public void pointer(final DataTypeDefinition container, final Procedure1<? super Pointer> initializer) {
    container.setDataType(this.<Pointer>init(AmaltheaFactory.eINSTANCE.createPointer(), initializer));
  }
  
  public void pointer(final Array container, final Procedure1<? super Pointer> initializer) {
    container.setDataType(this.<Pointer>init(AmaltheaFactory.eINSTANCE.createPointer(), initializer));
  }
  
  public void pointer(final StructEntry container, final Procedure1<? super Pointer> initializer) {
    container.setDataType(this.<Pointer>init(AmaltheaFactory.eINSTANCE.createPointer(), initializer));
  }
  
  public void pointer(final Pointer container, final Procedure1<? super Pointer> initializer) {
    container.setDataType(this.<Pointer>init(AmaltheaFactory.eINSTANCE.createPointer(), initializer));
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
