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
  
  public MemoryClassifier memoryClassifier(final CommonElements container, final Procedure1<? super MemoryClassifier> initializer) {
    MemoryClassifier _xblockexpression = null;
    {
      final MemoryClassifier obj = AmaltheaFactory.eINSTANCE.createMemoryClassifier();
      EList<MemoryClassifier> _memoryClassifiers = container.getMemoryClassifiers();
      _memoryClassifiers.add(obj);
      _xblockexpression = this.<MemoryClassifier>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public CoreClassifier coreClassifier(final CommonElements container, final Procedure1<? super CoreClassifier> initializer) {
    CoreClassifier _xblockexpression = null;
    {
      final CoreClassifier obj = AmaltheaFactory.eINSTANCE.createCoreClassifier();
      EList<CoreClassifier> _coreClassifiers = container.getCoreClassifiers();
      _coreClassifiers.add(obj);
      _xblockexpression = this.<CoreClassifier>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Tag tag(final CommonElements container, final Procedure1<? super Tag> initializer) {
    Tag _xblockexpression = null;
    {
      final Tag obj = AmaltheaFactory.eINSTANCE.createTag();
      EList<Tag> _tags = container.getTags();
      _tags.add(obj);
      _xblockexpression = this.<Tag>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
