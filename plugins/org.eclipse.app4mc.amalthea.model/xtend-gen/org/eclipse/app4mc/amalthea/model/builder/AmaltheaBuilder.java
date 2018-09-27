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

import java.util.HashMap;
import java.util.Set;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AmaltheaBuilder {
  private final HashMap<String, IReferable> objectRegistry = CollectionLiterals.<String, IReferable>newHashMap();
  
  public Amalthea amalthea(final Procedure1<? super Amalthea> initializer) {
    return this.<Amalthea>init(AmaltheaFactory.eINSTANCE.createAmalthea(), initializer);
  }
  
  public CommonElements commonElements(final Amalthea container, final Procedure1<? super CommonElements> initializer) {
    CommonElements _xblockexpression = null;
    {
      final CommonElements obj = AmaltheaFactory.eINSTANCE.createCommonElements();
      container.setCommonElements(obj);
      _xblockexpression = this.<CommonElements>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public EventModel eventModel(final Amalthea container, final Procedure1<? super EventModel> initializer) {
    EventModel _xblockexpression = null;
    {
      final EventModel obj = AmaltheaFactory.eINSTANCE.createEventModel();
      container.setEventModel(obj);
      _xblockexpression = this.<EventModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public StimuliModel stimuliModel(final Amalthea container, final Procedure1<? super StimuliModel> initializer) {
    StimuliModel _xblockexpression = null;
    {
      final StimuliModel obj = AmaltheaFactory.eINSTANCE.createStimuliModel();
      container.setStimuliModel(obj);
      _xblockexpression = this.<StimuliModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public SWModel softwareModel(final Amalthea container, final Procedure1<? super SWModel> initializer) {
    SWModel _xblockexpression = null;
    {
      final SWModel obj = AmaltheaFactory.eINSTANCE.createSWModel();
      container.setSwModel(obj);
      _xblockexpression = this.<SWModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public OSModel osModel(final Amalthea container, final Procedure1<? super OSModel> initializer) {
    OSModel _xblockexpression = null;
    {
      final OSModel obj = AmaltheaFactory.eINSTANCE.createOSModel();
      container.setOsModel(obj);
      _xblockexpression = this.<OSModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HWModel hardwareModel(final Amalthea container, final Procedure1<? super HWModel> initializer) {
    HWModel _xblockexpression = null;
    {
      final HWModel obj = AmaltheaFactory.eINSTANCE.createHWModel();
      container.setHwModel(obj);
      _xblockexpression = this.<HWModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ConstraintsModel constraintsModel(final Amalthea container, final Procedure1<? super ConstraintsModel> initializer) {
    ConstraintsModel _xblockexpression = null;
    {
      final ConstraintsModel obj = AmaltheaFactory.eINSTANCE.createConstraintsModel();
      container.setConstraintsModel(obj);
      _xblockexpression = this.<ConstraintsModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public PropertyConstraintsModel propertyConstraintsModel(final Amalthea container, final Procedure1<? super PropertyConstraintsModel> initializer) {
    PropertyConstraintsModel _xblockexpression = null;
    {
      final PropertyConstraintsModel obj = AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel();
      container.setPropertyConstraintsModel(obj);
      _xblockexpression = this.<PropertyConstraintsModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ComponentsModel componentsModel(final Amalthea container, final Procedure1<? super ComponentsModel> initializer) {
    ComponentsModel _xblockexpression = null;
    {
      final ComponentsModel obj = AmaltheaFactory.eINSTANCE.createComponentsModel();
      container.setComponentsModel(obj);
      _xblockexpression = this.<ComponentsModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public MappingModel mappingModel(final Amalthea container, final Procedure1<? super MappingModel> initializer) {
    MappingModel _xblockexpression = null;
    {
      final MappingModel obj = AmaltheaFactory.eINSTANCE.createMappingModel();
      container.setMappingModel(obj);
      _xblockexpression = this.<MappingModel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public <T extends IReferable> void _reg(final T obj, final String name) {
    this.objectRegistry.put(name, obj);
  }
  
  public <T extends IReferable> T _ref(final Class<T> cl, final String name) {
    T _xblockexpression = null;
    {
      final IReferable obj = this.objectRegistry.get(name);
      _xblockexpression = cl.cast(obj);
    }
    return _xblockexpression;
  }
  
  public <T extends IReferable> T _find(final EObject context, final Class<T> cl, final String name) {
    T _xblockexpression = null;
    {
      final Set<? extends T> resultSet = AmaltheaIndex.<T>getElements(context, name, cl);
      _xblockexpression = IterableExtensions.head(resultSet);
    }
    return _xblockexpression;
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
