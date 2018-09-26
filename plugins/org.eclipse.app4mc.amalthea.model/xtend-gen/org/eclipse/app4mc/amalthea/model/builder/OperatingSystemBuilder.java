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
  
  public boolean operatingSystem(final OSModel container, final Procedure1<? super OperatingSystem> initializer) {
    EList<OperatingSystem> _operatingSystems = container.getOperatingSystems();
    OperatingSystem _init = this.<OperatingSystem>init(AmaltheaFactory.eINSTANCE.createOperatingSystem(), initializer);
    return _operatingSystems.add(_init);
  }
  
  public boolean operatingSystem_Vendor(final OSModel container, final Procedure1<? super VendorOperatingSystem> initializer) {
    EList<OperatingSystem> _operatingSystems = container.getOperatingSystems();
    VendorOperatingSystem _init = this.<VendorOperatingSystem>init(AmaltheaFactory.eINSTANCE.createVendorOperatingSystem(), initializer);
    return _operatingSystems.add(_init);
  }
  
  public boolean semaphore(final OSModel container, final Procedure1<? super Semaphore> initializer) {
    EList<Semaphore> _semaphores = container.getSemaphores();
    Semaphore _init = this.<Semaphore>init(AmaltheaFactory.eINSTANCE.createSemaphore(), initializer);
    return _semaphores.add(_init);
  }
  
  public boolean osOverhead(final OSModel container, final Procedure1<? super OsInstructions> initializer) {
    EList<OsInstructions> _osOverheads = container.getOsOverheads();
    OsInstructions _init = this.<OsInstructions>init(AmaltheaFactory.eINSTANCE.createOsInstructions(), initializer);
    return _osOverheads.add(_init);
  }
  
  public boolean taskScheduler(final OperatingSystem container, final Procedure1<? super TaskScheduler> initializer) {
    EList<TaskScheduler> _taskSchedulers = container.getTaskSchedulers();
    TaskScheduler _init = this.<TaskScheduler>init(AmaltheaFactory.eINSTANCE.createTaskScheduler(), initializer);
    return _taskSchedulers.add(_init);
  }
  
  public boolean interruptController(final OperatingSystem container, final Procedure1<? super InterruptController> initializer) {
    EList<InterruptController> _interruptControllers = container.getInterruptControllers();
    InterruptController _init = this.<InterruptController>init(AmaltheaFactory.eINSTANCE.createInterruptController(), initializer);
    return _interruptControllers.add(_init);
  }
  
  public void dataConsistency(final OperatingSystem container, final Procedure1<? super OsDataConsistency> initializer) {
    container.setOsDataConsistency(this.<OsDataConsistency>init(AmaltheaFactory.eINSTANCE.createOsDataConsistency(), initializer));
  }
  
  public boolean labelAccess(final Scheduler container, final Procedure1<? super LabelAccess> initializer) {
    EList<ComputationItem> _computationItems = container.getComputationItems();
    LabelAccess _init = this.<LabelAccess>init(AmaltheaFactory.eINSTANCE.createLabelAccess(), initializer);
    return _computationItems.add(_init);
  }
  
  public void parentAssociation(final TaskScheduler container, final Procedure1<? super SchedulerAssociation> initializer) {
    container.setParentAssociation(this.<SchedulerAssociation>init(AmaltheaFactory.eINSTANCE.createSchedulerAssociation(), initializer));
  }
  
  public void schedulingParameters(final SchedulerAssociation container, final Procedure1<? super SchedulingParameters> initializer) {
    container.setSchedulingParameters(this.<SchedulingParameters>init(AmaltheaFactory.eINSTANCE.createSchedulingParameters(), initializer));
  }
  
  public String parameter_extension(final SchedulerAssociation container, final String key, final String value) {
    return container.getParameterExtensions().put(key, value);
  }
  
  public void apiOverhead(final OsInstructions container, final Procedure1<? super OsAPIInstructions> initializer) {
    container.setApiOverhead(this.<OsAPIInstructions>init(AmaltheaFactory.eINSTANCE.createOsAPIInstructions(), initializer));
  }
  
  public void isrOverheadCat1(final OsInstructions container, final Procedure1<? super OsISRInstructions> initializer) {
    container.setIsrCategory1Overhead(this.<OsISRInstructions>init(AmaltheaFactory.eINSTANCE.createOsISRInstructions(), initializer));
  }
  
  public void isrOverheadCat2(final OsInstructions container, final Procedure1<? super OsISRInstructions> initializer) {
    container.setIsrCategory2Overhead(this.<OsISRInstructions>init(AmaltheaFactory.eINSTANCE.createOsISRInstructions(), initializer));
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
