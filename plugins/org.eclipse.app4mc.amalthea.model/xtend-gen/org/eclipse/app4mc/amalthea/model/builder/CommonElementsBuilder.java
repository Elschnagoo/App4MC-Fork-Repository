package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class CommonElementsBuilder {
  public CommonElements commonElementsRoot(final Procedure1<? super CommonElements> initializer) {
    return this.<CommonElements>init(AmaltheaFactory.eINSTANCE.createCommonElements(), initializer);
  }
  
  public boolean memoryClassifier(final CommonElements container, final Procedure1<? super MemoryClassifier> initializer) {
    EList<MemoryClassifier> _memoryClassifiers = container.getMemoryClassifiers();
    MemoryClassifier _init = this.<MemoryClassifier>init(AmaltheaFactory.eINSTANCE.createMemoryClassifier(), initializer);
    return _memoryClassifiers.add(_init);
  }
  
  public boolean coreClassifier(final CommonElements container, final Procedure1<? super CoreClassifier> initializer) {
    EList<CoreClassifier> _coreClassifiers = container.getCoreClassifiers();
    CoreClassifier _init = this.<CoreClassifier>init(AmaltheaFactory.eINSTANCE.createCoreClassifier(), initializer);
    return _coreClassifiers.add(_init);
  }
  
  public boolean tag(final CommonElements container, final Procedure1<? super Tag> initializer) {
    EList<Tag> _tags = container.getTags();
    Tag _init = this.<Tag>init(AmaltheaFactory.eINSTANCE.createTag(), initializer);
    return _tags.add(_init);
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
