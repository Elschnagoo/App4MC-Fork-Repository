package org.eclipse.app4mc.amalthea.model.builder;

import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AmaltheaBuilder {
  private final HashMap<String, IReferable> objectRegistry = CollectionLiterals.<String, IReferable>newHashMap();
  
  public Amalthea amaltheaRoot(final Procedure1<? super Amalthea> initializer) {
    return this.<Amalthea>init(AmaltheaFactory.eINSTANCE.createAmalthea(), initializer);
  }
  
  public void commonElements(final Amalthea container, final Procedure1<? super CommonElements> initializer) {
    container.setCommonElements(this.<CommonElements>init(AmaltheaFactory.eINSTANCE.createCommonElements(), initializer));
  }
  
  public void eventModel(final Amalthea container, final Procedure1<? super EventModel> initializer) {
    container.setEventModel(this.<EventModel>init(AmaltheaFactory.eINSTANCE.createEventModel(), initializer));
  }
  
  public void stimuliModel(final Amalthea container, final Procedure1<? super StimuliModel> initializer) {
    container.setStimuliModel(this.<StimuliModel>init(AmaltheaFactory.eINSTANCE.createStimuliModel(), initializer));
  }
  
  public void softwareModel(final Amalthea container, final Procedure1<? super SWModel> initializer) {
    container.setSwModel(this.<SWModel>init(AmaltheaFactory.eINSTANCE.createSWModel(), initializer));
  }
  
  public void osModel(final Amalthea container, final Procedure1<? super OSModel> initializer) {
    container.setOsModel(this.<OSModel>init(AmaltheaFactory.eINSTANCE.createOSModel(), initializer));
  }
  
  public void hardwareModel(final Amalthea container, final Procedure1<? super HWModel> initializer) {
    container.setHwModel(this.<HWModel>init(AmaltheaFactory.eINSTANCE.createHWModel(), initializer));
  }
  
  public void constraintsModel(final Amalthea container, final Procedure1<? super ConstraintsModel> initializer) {
    container.setConstraintsModel(this.<ConstraintsModel>init(AmaltheaFactory.eINSTANCE.createConstraintsModel(), initializer));
  }
  
  public void propertyConstraintsModel(final Amalthea container, final Procedure1<? super PropertyConstraintsModel> initializer) {
    container.setPropertyConstraintsModel(this.<PropertyConstraintsModel>init(AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel(), initializer));
  }
  
  public void componentsModel(final Amalthea container, final Procedure1<? super ComponentsModel> initializer) {
    container.setComponentsModel(this.<ComponentsModel>init(AmaltheaFactory.eINSTANCE.createComponentsModel(), initializer));
  }
  
  public void mappingModel(final Amalthea container, final Procedure1<? super MappingModel> initializer) {
    container.setMappingModel(this.<MappingModel>init(AmaltheaFactory.eINSTANCE.createMappingModel(), initializer));
  }
  
  public <T extends IReferable> void register(final T obj, final String name) {
    this.objectRegistry.put(name, obj);
  }
  
  public <T extends IReferable> T ref(final Class<T> cl, final String name) {
    T _xblockexpression = null;
    {
      final IReferable obj = this.objectRegistry.get(name);
      _xblockexpression = cl.cast(obj);
    }
    return _xblockexpression;
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
