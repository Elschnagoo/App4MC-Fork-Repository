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
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Need;
import org.eclipse.app4mc.amalthea.model.NeedConstant;
import org.eclipse.app4mc.amalthea.model.NeedDeviation;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class InstructionsBuilder {
  public NeedConstant default_InstructionsConstant(final ExecutionNeed container, final long instructions) {
    final NeedConstant need = FactoryUtil.createNeedConstant(instructions);
    container.getDefault().put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need);
    return need;
  }
  
  public NeedDeviation default_InstructionsDeviation(final ExecutionNeed container, final Deviation<LongObject> instructions) {
    final NeedDeviation need = FactoryUtil.createNeedDeviation(instructions);
    container.getDefault().put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need);
    return need;
  }
  
  public NeedConstant extended_InstructionsConstant(final ExecutionNeed container, final ProcessingUnitDefinition puDef, final long instructions) {
    final NeedConstant need = FactoryUtil.createNeedConstant(instructions);
    boolean _containsKey = container.getExtended().containsKey(puDef);
    boolean _equals = (_containsKey == false);
    if (_equals) {
      EMap<ProcessingUnitDefinition, EMap<String, Need>> _extended = container.getExtended();
      BasicEMap<String, Need> _basicEMap = new BasicEMap<String, Need>();
      _extended.put(puDef, _basicEMap);
    }
    container.getExtended().get(puDef).put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need);
    return need;
  }
  
  public NeedDeviation extended_InstructionsDeviation(final ExecutionNeed container, final ProcessingUnitDefinition puDef, final Deviation<LongObject> instructions) {
    final NeedDeviation need = FactoryUtil.createNeedDeviation(instructions);
    boolean _containsKey = container.getExtended().containsKey(puDef);
    boolean _equals = (_containsKey == false);
    if (_equals) {
      EMap<ProcessingUnitDefinition, EMap<String, Need>> _extended = container.getExtended();
      BasicEMap<String, Need> _basicEMap = new BasicEMap<String, Need>();
      _extended.put(puDef, _basicEMap);
    }
    container.getExtended().get(puDef).put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need);
    return need;
  }
  
  public ExecutionNeed execNeed_default_InstructionsConstant(final Scheduler container, final long instructions) {
    final ExecutionNeed execNeed = InstructionsUtil.createDefaultExecutionNeedConstant(instructions);
    EList<ComputationItem> _computationItems = container.getComputationItems();
    _computationItems.add(execNeed);
    return execNeed;
  }
  
  public ExecutionNeed execNeed_default_InstructionsDeviation(final Scheduler container, final Deviation<LongObject> instructions) {
    final ExecutionNeed execNeed = InstructionsUtil.createDefaultExecutionNeedDeviation(instructions);
    EList<ComputationItem> _computationItems = container.getComputationItems();
    _computationItems.add(execNeed);
    return execNeed;
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
