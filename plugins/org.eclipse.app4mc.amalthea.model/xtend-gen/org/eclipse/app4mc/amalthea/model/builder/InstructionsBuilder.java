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
import org.eclipse.app4mc.amalthea.model.ComputationItem;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class InstructionsBuilder {
  public boolean execNeed_default_Instructions(final org.eclipse.app4mc.amalthea.model.Runnable container, final long instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _runnableItems = container.getRunnableItems();
      _xblockexpression = _runnableItems.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final org.eclipse.app4mc.amalthea.model.Runnable container, final Deviation<LongObject> instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _runnableItems = container.getRunnableItems();
      _xblockexpression = _runnableItems.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final Group container, final long instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _items = container.getItems();
      _xblockexpression = _items.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final Group container, final Deviation<LongObject> instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _items = container.getItems();
      _xblockexpression = _items.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final ModeSwitchDefault<RunnableItem> container, final long instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _items = container.getItems();
      _xblockexpression = _items.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final ModeSwitchDefault<RunnableItem> container, final Deviation<LongObject> instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _items = container.getItems();
      _xblockexpression = _items.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final ModeSwitchEntry<RunnableItem> container, final long instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _items = container.getItems();
      _xblockexpression = _items.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final ModeSwitchEntry<RunnableItem> container, final Deviation<LongObject> instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _items = container.getItems();
      _xblockexpression = _items.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final ProbabilitySwitchEntry<RunnableItem> container, final long instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _items = container.getItems();
      _xblockexpression = _items.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final ProbabilitySwitchEntry<RunnableItem> container, final Deviation<LongObject> instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<RunnableItem> _items = container.getItems();
      _xblockexpression = _items.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final Scheduler container, final long instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<ComputationItem> _computationItems = container.getComputationItems();
      _xblockexpression = _computationItems.add(obj);
    }
    return _xblockexpression;
  }
  
  public boolean execNeed_default_Instructions(final Scheduler container, final Deviation<LongObject> instructions) {
    boolean _xblockexpression = false;
    {
      final ExecutionNeed obj = InstructionsUtil.createDefaultExecutionNeed(instructions);
      EList<ComputationItem> _computationItems = container.getComputationItems();
      _xblockexpression = _computationItems.add(obj);
    }
    return _xblockexpression;
  }
  
  public HwFeatureCategory featureCategory_Instructions(final HWModel container, final Procedure1<? super HwFeatureCategory> initializer) {
    HwFeatureCategory _xblockexpression = null;
    {
      final HwFeatureCategory obj = AmaltheaFactory.eINSTANCE.createHwFeatureCategory();
      EList<HwFeatureCategory> _featureCategories = container.getFeatureCategories();
      _featureCategories.add(obj);
      obj.setName(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME);
      _xblockexpression = this.<HwFeatureCategory>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
