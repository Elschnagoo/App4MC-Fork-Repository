package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CacheDefinition;
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwDomain;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.PowerDomain;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class HardwareBuilder {
  public HWModel hardwareModelRoot(final Procedure1<? super HWModel> initializer) {
    return this.<HWModel>init(AmaltheaFactory.eINSTANCE.createHWModel(), initializer);
  }
  
  public boolean definition_Cache(final HWModel container, final Procedure1<? super CacheDefinition> initializer) {
    EList<HwDefinition> _definitions = container.getDefinitions();
    CacheDefinition _init = this.<CacheDefinition>init(AmaltheaFactory.eINSTANCE.createCacheDefinition(), initializer);
    return _definitions.add(_init);
  }
  
  public boolean definition_Memory(final HWModel container, final Procedure1<? super MemoryDefinition> initializer) {
    EList<HwDefinition> _definitions = container.getDefinitions();
    MemoryDefinition _init = this.<MemoryDefinition>init(AmaltheaFactory.eINSTANCE.createMemoryDefinition(), initializer);
    return _definitions.add(_init);
  }
  
  public boolean definition_ProcessingUnit(final HWModel container, final Procedure1<? super ProcessingUnitDefinition> initializer) {
    EList<HwDefinition> _definitions = container.getDefinitions();
    ProcessingUnitDefinition _init = this.<ProcessingUnitDefinition>init(AmaltheaFactory.eINSTANCE.createProcessingUnitDefinition(), initializer);
    return _definitions.add(_init);
  }
  
  public boolean definition_ConnectionHandler(final HWModel container, final Procedure1<? super ConnectionHandlerDefinition> initializer) {
    EList<HwDefinition> _definitions = container.getDefinitions();
    ConnectionHandlerDefinition _init = this.<ConnectionHandlerDefinition>init(AmaltheaFactory.eINSTANCE.createConnectionHandlerDefinition(), initializer);
    return _definitions.add(_init);
  }
  
  public boolean domain_Frequency(final HWModel container, final Procedure1<? super FrequencyDomain> initializer) {
    EList<HwDomain> _domains = container.getDomains();
    FrequencyDomain _init = this.<FrequencyDomain>init(AmaltheaFactory.eINSTANCE.createFrequencyDomain(), initializer);
    return _domains.add(_init);
  }
  
  public boolean domain_Power(final HWModel container, final Procedure1<? super PowerDomain> initializer) {
    EList<HwDomain> _domains = container.getDomains();
    PowerDomain _init = this.<PowerDomain>init(AmaltheaFactory.eINSTANCE.createPowerDomain(), initializer);
    return _domains.add(_init);
  }
  
  public boolean featureCategory(final HWModel container, final Procedure1<? super HwFeatureCategory> initializer) {
    EList<HwFeatureCategory> _featureCategories = container.getFeatureCategories();
    HwFeatureCategory _init = this.<HwFeatureCategory>init(AmaltheaFactory.eINSTANCE.createHwFeatureCategory(), initializer);
    return _featureCategories.add(_init);
  }
  
  public boolean structure(final HWModel container, final Procedure1<? super HwStructure> initializer) {
    EList<HwStructure> _structures = container.getStructures();
    HwStructure _init = this.<HwStructure>init(AmaltheaFactory.eINSTANCE.createHwStructure(), initializer);
    return _structures.add(_init);
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
