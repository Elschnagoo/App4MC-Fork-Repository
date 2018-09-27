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
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsISRInstructions;
import org.eclipse.app4mc.amalthea.model.OsInstructions;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAssociation;
import org.eclipse.app4mc.amalthea.model.SchedulingParameters;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.VendorOperatingSystem;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OperatingSystemBuilder {
  public OSModel osModelRoot(final Procedure1<? super OSModel> initializer) {
    return this.<OSModel>init(AmaltheaFactory.eINSTANCE.createOSModel(), initializer);
  }
  
  public OperatingSystem operatingSystem(final OSModel container, final Procedure1<? super OperatingSystem> initializer) {
    OperatingSystem _xblockexpression = null;
    {
      final OperatingSystem obj = AmaltheaFactory.eINSTANCE.createOperatingSystem();
      EList<OperatingSystem> _operatingSystems = container.getOperatingSystems();
      _operatingSystems.add(obj);
      _xblockexpression = this.<OperatingSystem>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public VendorOperatingSystem operatingSystem_Vendor(final OSModel container, final Procedure1<? super VendorOperatingSystem> initializer) {
    VendorOperatingSystem _xblockexpression = null;
    {
      final VendorOperatingSystem obj = AmaltheaFactory.eINSTANCE.createVendorOperatingSystem();
      EList<OperatingSystem> _operatingSystems = container.getOperatingSystems();
      _operatingSystems.add(obj);
      _xblockexpression = this.<VendorOperatingSystem>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Semaphore semaphore(final OSModel container, final Procedure1<? super Semaphore> initializer) {
    Semaphore _xblockexpression = null;
    {
      final Semaphore obj = AmaltheaFactory.eINSTANCE.createSemaphore();
      EList<Semaphore> _semaphores = container.getSemaphores();
      _semaphores.add(obj);
      _xblockexpression = this.<Semaphore>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public OsInstructions osOverhead(final OSModel container, final Procedure1<? super OsInstructions> initializer) {
    OsInstructions _xblockexpression = null;
    {
      final OsInstructions obj = AmaltheaFactory.eINSTANCE.createOsInstructions();
      EList<OsInstructions> _osOverheads = container.getOsOverheads();
      _osOverheads.add(obj);
      _xblockexpression = this.<OsInstructions>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public TaskScheduler taskScheduler(final OperatingSystem container, final Procedure1<? super TaskScheduler> initializer) {
    TaskScheduler _xblockexpression = null;
    {
      final TaskScheduler obj = AmaltheaFactory.eINSTANCE.createTaskScheduler();
      EList<TaskScheduler> _taskSchedulers = container.getTaskSchedulers();
      _taskSchedulers.add(obj);
      _xblockexpression = this.<TaskScheduler>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public InterruptController interruptController(final OperatingSystem container, final Procedure1<? super InterruptController> initializer) {
    InterruptController _xblockexpression = null;
    {
      final InterruptController obj = AmaltheaFactory.eINSTANCE.createInterruptController();
      EList<InterruptController> _interruptControllers = container.getInterruptControllers();
      _interruptControllers.add(obj);
      _xblockexpression = this.<InterruptController>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public OsDataConsistency dataConsistency(final OperatingSystem container, final Procedure1<? super OsDataConsistency> initializer) {
    OsDataConsistency _xblockexpression = null;
    {
      final OsDataConsistency obj = AmaltheaFactory.eINSTANCE.createOsDataConsistency();
      container.setOsDataConsistency(obj);
      _xblockexpression = this.<OsDataConsistency>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public LabelAccess labelAccess(final Scheduler container, final Procedure1<? super LabelAccess> initializer) {
    LabelAccess _xblockexpression = null;
    {
      final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
      EList<ComputationItem> _computationItems = container.getComputationItems();
      _computationItems.add(obj);
      _xblockexpression = this.<LabelAccess>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public SchedulerAssociation parentAssociation(final TaskScheduler container, final Procedure1<? super SchedulerAssociation> initializer) {
    SchedulerAssociation _xblockexpression = null;
    {
      final SchedulerAssociation obj = AmaltheaFactory.eINSTANCE.createSchedulerAssociation();
      container.setParentAssociation(obj);
      _xblockexpression = this.<SchedulerAssociation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public SchedulingParameters schedulingParameters(final SchedulerAssociation container, final Procedure1<? super SchedulingParameters> initializer) {
    SchedulingParameters _xblockexpression = null;
    {
      final SchedulingParameters obj = AmaltheaFactory.eINSTANCE.createSchedulingParameters();
      container.setSchedulingParameters(obj);
      _xblockexpression = this.<SchedulingParameters>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public String parameter_extension(final SchedulerAssociation container, final String key, final String value) {
    return container.getParameterExtensions().put(key, value);
  }
  
  public OsAPIInstructions apiOverhead(final OsInstructions container, final Procedure1<? super OsAPIInstructions> initializer) {
    OsAPIInstructions _xblockexpression = null;
    {
      final OsAPIInstructions obj = AmaltheaFactory.eINSTANCE.createOsAPIInstructions();
      container.setApiOverhead(obj);
      _xblockexpression = this.<OsAPIInstructions>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public OsISRInstructions isrOverheadCat1(final OsInstructions container, final Procedure1<? super OsISRInstructions> initializer) {
    OsISRInstructions _xblockexpression = null;
    {
      final OsISRInstructions obj = AmaltheaFactory.eINSTANCE.createOsISRInstructions();
      container.setIsrCategory1Overhead(obj);
      _xblockexpression = this.<OsISRInstructions>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public OsISRInstructions isrOverheadCat2(final OsInstructions container, final Procedure1<? super OsISRInstructions> initializer) {
    OsISRInstructions _xblockexpression = null;
    {
      final OsISRInstructions obj = AmaltheaFactory.eINSTANCE.createOsISRInstructions();
      container.setIsrCategory2Overhead(obj);
      _xblockexpression = this.<OsISRInstructions>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
