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

@SuppressWarnings("all")
public class InstructionsBuilder {
  public boolean execNeed_default_Instructions(final org.eclipse.app4mc.amalthea.model.Runnable container, final long instructions) {
    EList<RunnableItem> _runnableItems = container.getRunnableItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _runnableItems.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final org.eclipse.app4mc.amalthea.model.Runnable container, final Deviation<LongObject> instructions) {
    EList<RunnableItem> _runnableItems = container.getRunnableItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _runnableItems.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final Group container, final long instructions) {
    EList<RunnableItem> _items = container.getItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _items.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final Group container, final Deviation<LongObject> instructions) {
    EList<RunnableItem> _items = container.getItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _items.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final ModeSwitchDefault<RunnableItem> container, final long instructions) {
    EList<RunnableItem> _items = container.getItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _items.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final ModeSwitchDefault<RunnableItem> container, final Deviation<LongObject> instructions) {
    EList<RunnableItem> _items = container.getItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _items.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final ModeSwitchEntry<RunnableItem> container, final long instructions) {
    EList<RunnableItem> _items = container.getItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _items.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final ModeSwitchEntry<RunnableItem> container, final Deviation<LongObject> instructions) {
    EList<RunnableItem> _items = container.getItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _items.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final ProbabilitySwitchEntry<RunnableItem> container, final long instructions) {
    EList<RunnableItem> _items = container.getItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _items.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final ProbabilitySwitchEntry<RunnableItem> container, final Deviation<LongObject> instructions) {
    EList<RunnableItem> _items = container.getItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _items.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final Scheduler container, final long instructions) {
    EList<ComputationItem> _computationItems = container.getComputationItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _computationItems.add(_createDefaultExecutionNeed);
  }
  
  public boolean execNeed_default_Instructions(final Scheduler container, final Deviation<LongObject> instructions) {
    EList<ComputationItem> _computationItems = container.getComputationItems();
    ExecutionNeed _createDefaultExecutionNeed = InstructionsUtil.createDefaultExecutionNeed(instructions);
    return _computationItems.add(_createDefaultExecutionNeed);
  }
  
  public boolean featureCategory_Instructions(final HWModel container) {
    boolean _xblockexpression = false;
    {
      final HwFeatureCategory category = AmaltheaFactory.eINSTANCE.createHwFeatureCategory();
      category.setName(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME);
      EList<HwFeatureCategory> _featureCategories = container.getFeatureCategories();
      _xblockexpression = _featureCategories.add(category);
    }
    return _xblockexpression;
  }
}
