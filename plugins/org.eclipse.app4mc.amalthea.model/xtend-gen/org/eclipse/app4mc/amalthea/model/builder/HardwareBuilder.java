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
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.CacheDefinition;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwDomain;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.PowerDomain;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class HardwareBuilder {
  public HWModel hardwareModelRoot(final Procedure1<? super HWModel> initializer) {
    return this.<HWModel>init(AmaltheaFactory.eINSTANCE.createHWModel(), initializer);
  }
  
  public CacheDefinition definition_Cache(final HWModel container, final Procedure1<? super CacheDefinition> initializer) {
    CacheDefinition _xblockexpression = null;
    {
      final CacheDefinition obj = AmaltheaFactory.eINSTANCE.createCacheDefinition();
      EList<HwDefinition> _definitions = container.getDefinitions();
      _definitions.add(obj);
      _xblockexpression = this.<CacheDefinition>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public MemoryDefinition definition_Memory(final HWModel container, final Procedure1<? super MemoryDefinition> initializer) {
    MemoryDefinition _xblockexpression = null;
    {
      final MemoryDefinition obj = AmaltheaFactory.eINSTANCE.createMemoryDefinition();
      EList<HwDefinition> _definitions = container.getDefinitions();
      _definitions.add(obj);
      _xblockexpression = this.<MemoryDefinition>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProcessingUnitDefinition definition_ProcessingUnit(final HWModel container, final Procedure1<? super ProcessingUnitDefinition> initializer) {
    ProcessingUnitDefinition _xblockexpression = null;
    {
      final ProcessingUnitDefinition obj = AmaltheaFactory.eINSTANCE.createProcessingUnitDefinition();
      EList<HwDefinition> _definitions = container.getDefinitions();
      _definitions.add(obj);
      _xblockexpression = this.<ProcessingUnitDefinition>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ConnectionHandlerDefinition definition_ConnectionHandler(final HWModel container, final Procedure1<? super ConnectionHandlerDefinition> initializer) {
    ConnectionHandlerDefinition _xblockexpression = null;
    {
      final ConnectionHandlerDefinition obj = AmaltheaFactory.eINSTANCE.createConnectionHandlerDefinition();
      EList<HwDefinition> _definitions = container.getDefinitions();
      _definitions.add(obj);
      _xblockexpression = this.<ConnectionHandlerDefinition>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public FrequencyDomain domain_Frequency(final HWModel container, final Procedure1<? super FrequencyDomain> initializer) {
    FrequencyDomain _xblockexpression = null;
    {
      final FrequencyDomain obj = AmaltheaFactory.eINSTANCE.createFrequencyDomain();
      EList<HwDomain> _domains = container.getDomains();
      _domains.add(obj);
      _xblockexpression = this.<FrequencyDomain>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public PowerDomain domain_Power(final HWModel container, final Procedure1<? super PowerDomain> initializer) {
    PowerDomain _xblockexpression = null;
    {
      final PowerDomain obj = AmaltheaFactory.eINSTANCE.createPowerDomain();
      EList<HwDomain> _domains = container.getDomains();
      _domains.add(obj);
      _xblockexpression = this.<PowerDomain>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwFeatureCategory featureCategory(final HWModel container, final Procedure1<? super HwFeatureCategory> initializer) {
    HwFeatureCategory _xblockexpression = null;
    {
      final HwFeatureCategory obj = AmaltheaFactory.eINSTANCE.createHwFeatureCategory();
      EList<HwFeatureCategory> _featureCategories = container.getFeatureCategories();
      _featureCategories.add(obj);
      _xblockexpression = this.<HwFeatureCategory>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwStructure structure(final HWModel container, final Procedure1<? super HwStructure> initializer) {
    HwStructure _xblockexpression = null;
    {
      final HwStructure obj = AmaltheaFactory.eINSTANCE.createHwStructure();
      EList<HwStructure> _structures = container.getStructures();
      _structures.add(obj);
      _xblockexpression = this.<HwStructure>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwFeature feature(final HwFeatureCategory container, final Procedure1<? super HwFeature> initializer) {
    HwFeature _xblockexpression = null;
    {
      final HwFeature obj = AmaltheaFactory.eINSTANCE.createHwFeature();
      EList<HwFeature> _features = container.getFeatures();
      _features.add(obj);
      _xblockexpression = this.<HwFeature>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwStructure structure(final HwStructure container, final Procedure1<? super HwStructure> initializer) {
    HwStructure _xblockexpression = null;
    {
      final HwStructure obj = AmaltheaFactory.eINSTANCE.createHwStructure();
      EList<HwStructure> _structures = container.getStructures();
      _structures.add(obj);
      _xblockexpression = this.<HwStructure>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Memory module_Memory(final HwStructure container, final Procedure1<? super Memory> initializer) {
    Memory _xblockexpression = null;
    {
      final Memory obj = AmaltheaFactory.eINSTANCE.createMemory();
      EList<HwModule> _modules = container.getModules();
      _modules.add(obj);
      _xblockexpression = this.<Memory>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProcessingUnit module_ProcessingUnit(final HwStructure container, final Procedure1<? super ProcessingUnit> initializer) {
    ProcessingUnit _xblockexpression = null;
    {
      final ProcessingUnit obj = AmaltheaFactory.eINSTANCE.createProcessingUnit();
      EList<HwModule> _modules = container.getModules();
      _modules.add(obj);
      _xblockexpression = this.<ProcessingUnit>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Cache module_Cache(final HwStructure container, final Procedure1<? super Cache> initializer) {
    Cache _xblockexpression = null;
    {
      final Cache obj = AmaltheaFactory.eINSTANCE.createCache();
      EList<HwModule> _modules = container.getModules();
      _modules.add(obj);
      _xblockexpression = this.<Cache>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ConnectionHandler module_ConnectionHandler(final HwStructure container, final Procedure1<? super ConnectionHandler> initializer) {
    ConnectionHandler _xblockexpression = null;
    {
      final ConnectionHandler obj = AmaltheaFactory.eINSTANCE.createConnectionHandler();
      EList<HwModule> _modules = container.getModules();
      _modules.add(obj);
      _xblockexpression = this.<ConnectionHandler>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwConnection connection(final HwStructure container, final Procedure1<? super HwConnection> initializer) {
    HwConnection _xblockexpression = null;
    {
      final HwConnection obj = AmaltheaFactory.eINSTANCE.createHwConnection();
      EList<HwConnection> _connections = container.getConnections();
      _connections.add(obj);
      _xblockexpression = this.<HwConnection>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwPort port(final HwStructure container, final Procedure1<? super HwPort> initializer) {
    HwPort _xblockexpression = null;
    {
      final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
      EList<HwPort> _ports = container.getPorts();
      _ports.add(obj);
      _xblockexpression = this.<HwPort>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwPort port(final Memory container, final Procedure1<? super HwPort> initializer) {
    HwPort _xblockexpression = null;
    {
      final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
      EList<HwPort> _ports = container.getPorts();
      _ports.add(obj);
      _xblockexpression = this.<HwPort>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwPort port(final ProcessingUnit container, final Procedure1<? super HwPort> initializer) {
    HwPort _xblockexpression = null;
    {
      final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
      EList<HwPort> _ports = container.getPorts();
      _ports.add(obj);
      _xblockexpression = this.<HwPort>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwPort port(final Cache container, final Procedure1<? super HwPort> initializer) {
    HwPort _xblockexpression = null;
    {
      final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
      EList<HwPort> _ports = container.getPorts();
      _ports.add(obj);
      _xblockexpression = this.<HwPort>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwPort port(final ConnectionHandler container, final Procedure1<? super HwPort> initializer) {
    HwPort _xblockexpression = null;
    {
      final HwPort obj = AmaltheaFactory.eINSTANCE.createHwPort();
      EList<HwPort> _ports = container.getPorts();
      _ports.add(obj);
      _xblockexpression = this.<HwPort>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Cache cache(final ProcessingUnit container, final Procedure1<? super Cache> initializer) {
    Cache _xblockexpression = null;
    {
      final Cache obj = AmaltheaFactory.eINSTANCE.createCache();
      EList<Cache> _caches = container.getCaches();
      _caches.add(obj);
      _xblockexpression = this.<Cache>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwAccessElement access(final ProcessingUnit container, final Procedure1<? super HwAccessElement> initializer) {
    HwAccessElement _xblockexpression = null;
    {
      final HwAccessElement obj = AmaltheaFactory.eINSTANCE.createHwAccessElement();
      EList<HwAccessElement> _accessElements = container.getAccessElements();
      _accessElements.add(obj);
      _xblockexpression = this.<HwAccessElement>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public HwAccessPath path(final HwAccessElement container, final Procedure1<? super HwAccessPath> initializer) {
    HwAccessPath _xblockexpression = null;
    {
      final HwAccessPath obj = AmaltheaFactory.eINSTANCE.createHwAccessPath();
      container.setAccessPath(obj);
      _xblockexpression = this.<HwAccessPath>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
