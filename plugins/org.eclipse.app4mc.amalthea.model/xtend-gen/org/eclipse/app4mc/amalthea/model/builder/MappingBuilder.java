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
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MappingBuilder {
  public MappingModel mappingModelRoot(final Procedure1<? super MappingModel> initializer) {
    return this.<MappingModel>init(AmaltheaFactory.eINSTANCE.createMappingModel(), initializer);
  }
  
  public ISRAllocation isrAllocation(final MappingModel container, final Procedure1<? super ISRAllocation> initializer) {
    ISRAllocation _xblockexpression = null;
    {
      final ISRAllocation obj = AmaltheaFactory.eINSTANCE.createISRAllocation();
      EList<ISRAllocation> _isrAllocation = container.getIsrAllocation();
      _isrAllocation.add(obj);
      _xblockexpression = this.<ISRAllocation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public TaskAllocation taskAllocation(final MappingModel container, final Procedure1<? super TaskAllocation> initializer) {
    TaskAllocation _xblockexpression = null;
    {
      final TaskAllocation obj = AmaltheaFactory.eINSTANCE.createTaskAllocation();
      EList<TaskAllocation> _taskAllocation = container.getTaskAllocation();
      _taskAllocation.add(obj);
      _xblockexpression = this.<TaskAllocation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableAllocation runnableAllocation(final MappingModel container, final Procedure1<? super RunnableAllocation> initializer) {
    RunnableAllocation _xblockexpression = null;
    {
      final RunnableAllocation obj = AmaltheaFactory.eINSTANCE.createRunnableAllocation();
      EList<RunnableAllocation> _runnableAllocation = container.getRunnableAllocation();
      _runnableAllocation.add(obj);
      _xblockexpression = this.<RunnableAllocation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public SchedulerAllocation schedulerAllocation(final MappingModel container, final Procedure1<? super SchedulerAllocation> initializer) {
    SchedulerAllocation _xblockexpression = null;
    {
      final SchedulerAllocation obj = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
      EList<SchedulerAllocation> _schedulerAllocation = container.getSchedulerAllocation();
      _schedulerAllocation.add(obj);
      _xblockexpression = this.<SchedulerAllocation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public MemoryMapping memoryMapping(final MappingModel container, final Procedure1<? super MemoryMapping> initializer) {
    MemoryMapping _xblockexpression = null;
    {
      final MemoryMapping obj = AmaltheaFactory.eINSTANCE.createMemoryMapping();
      EList<MemoryMapping> _memoryMapping = container.getMemoryMapping();
      _memoryMapping.add(obj);
      _xblockexpression = this.<MemoryMapping>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public PhysicalSectionMapping physicalSectionMapping(final MappingModel container, final Procedure1<? super PhysicalSectionMapping> initializer) {
    PhysicalSectionMapping _xblockexpression = null;
    {
      final PhysicalSectionMapping obj = AmaltheaFactory.eINSTANCE.createPhysicalSectionMapping();
      EList<PhysicalSectionMapping> _physicalSectionMapping = container.getPhysicalSectionMapping();
      _physicalSectionMapping.add(obj);
      _xblockexpression = this.<PhysicalSectionMapping>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
