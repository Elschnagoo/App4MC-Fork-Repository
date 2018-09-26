package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.CustomActivation;
import org.eclipse.app4mc.amalthea.model.EventActivation;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.VariableRateActivation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SoftwareBuilder {
  public SWModel softwareModelRoot(final Procedure1<? super SWModel> initializer) {
    return this.<SWModel>init(AmaltheaFactory.eINSTANCE.createSWModel(), initializer);
  }
  
  public boolean isr(final SWModel container, final Procedure1<? super ISR> initializer) {
    EList<ISR> _isrs = container.getIsrs();
    ISR _init = this.<ISR>init(AmaltheaFactory.eINSTANCE.createISR(), initializer);
    return _isrs.add(_init);
  }
  
  public boolean task(final SWModel container, final Procedure1<? super Task> initializer) {
    EList<Task> _tasks = container.getTasks();
    Task _init = this.<Task>init(AmaltheaFactory.eINSTANCE.createTask(), initializer);
    return _tasks.add(_init);
  }
  
  public boolean runnable(final SWModel container, final Procedure1<? super org.eclipse.app4mc.amalthea.model.Runnable> initializer) {
    EList<org.eclipse.app4mc.amalthea.model.Runnable> _runnables = container.getRunnables();
    org.eclipse.app4mc.amalthea.model.Runnable _init = this.<org.eclipse.app4mc.amalthea.model.Runnable>init(AmaltheaFactory.eINSTANCE.createRunnable(), initializer);
    return _runnables.add(_init);
  }
  
  public boolean label(final SWModel container, final Procedure1<? super Label> initializer) {
    EList<Label> _labels = container.getLabels();
    Label _init = this.<Label>init(AmaltheaFactory.eINSTANCE.createLabel(), initializer);
    return _labels.add(_init);
  }
  
  public boolean channel(final SWModel container, final Procedure1<? super Channel> initializer) {
    EList<Channel> _channels = container.getChannels();
    Channel _init = this.<Channel>init(AmaltheaFactory.eINSTANCE.createChannel(), initializer);
    return _channels.add(_init);
  }
  
  public boolean processPrototype(final SWModel container, final Procedure1<? super ProcessPrototype> initializer) {
    EList<ProcessPrototype> _processPrototypes = container.getProcessPrototypes();
    ProcessPrototype _init = this.<ProcessPrototype>init(AmaltheaFactory.eINSTANCE.createProcessPrototype(), initializer);
    return _processPrototypes.add(_init);
  }
  
  public boolean section(final SWModel container, final Procedure1<? super Section> initializer) {
    EList<Section> _sections = container.getSections();
    Section _init = this.<Section>init(AmaltheaFactory.eINSTANCE.createSection(), initializer);
    return _sections.add(_init);
  }
  
  public boolean activation_Single(final SWModel container, final Procedure1<? super SingleActivation> initializer) {
    EList<Activation> _activations = container.getActivations();
    SingleActivation _init = this.<SingleActivation>init(AmaltheaFactory.eINSTANCE.createSingleActivation(), initializer);
    return _activations.add(_init);
  }
  
  public boolean activation_Sporadic(final SWModel container, final Procedure1<? super SporadicActivation> initializer) {
    EList<Activation> _activations = container.getActivations();
    SporadicActivation _init = this.<SporadicActivation>init(AmaltheaFactory.eINSTANCE.createSporadicActivation(), initializer);
    return _activations.add(_init);
  }
  
  public boolean activation_Periodic(final SWModel container, final Procedure1<? super PeriodicActivation> initializer) {
    EList<Activation> _activations = container.getActivations();
    PeriodicActivation _init = this.<PeriodicActivation>init(AmaltheaFactory.eINSTANCE.createPeriodicActivation(), initializer);
    return _activations.add(_init);
  }
  
  public boolean activation_Event(final SWModel container, final Procedure1<? super EventActivation> initializer) {
    EList<Activation> _activations = container.getActivations();
    EventActivation _init = this.<EventActivation>init(AmaltheaFactory.eINSTANCE.createEventActivation(), initializer);
    return _activations.add(_init);
  }
  
  public boolean activation_VariableRate(final SWModel container, final Procedure1<? super VariableRateActivation> initializer) {
    EList<Activation> _activations = container.getActivations();
    VariableRateActivation _init = this.<VariableRateActivation>init(AmaltheaFactory.eINSTANCE.createVariableRateActivation(), initializer);
    return _activations.add(_init);
  }
  
  public boolean activation_Custom(final SWModel container, final Procedure1<? super CustomActivation> initializer) {
    EList<Activation> _activations = container.getActivations();
    CustomActivation _init = this.<CustomActivation>init(AmaltheaFactory.eINSTANCE.createCustomActivation(), initializer);
    return _activations.add(_init);
  }
  
  public boolean mode(final SWModel container, final Procedure1<? super Mode> initializer) {
    EList<Mode> _modes = container.getModes();
    Mode _init = this.<Mode>init(AmaltheaFactory.eINSTANCE.createMode(), initializer);
    return _modes.add(_init);
  }
  
  public boolean modeLabel(final SWModel container, final Procedure1<? super ModeLabel> initializer) {
    EList<ModeLabel> _modeLabels = container.getModeLabels();
    ModeLabel _init = this.<ModeLabel>init(AmaltheaFactory.eINSTANCE.createModeLabel(), initializer);
    return _modeLabels.add(_init);
  }
  
  public boolean literal(final Mode container, final Procedure1<? super ModeLiteral> initializer) {
    EList<ModeLiteral> _literals = container.getLiterals();
    ModeLiteral _init = this.<ModeLiteral>init(AmaltheaFactory.eINSTANCE.createModeLiteral(), initializer);
    return _literals.add(_init);
  }
  
  public boolean parameter(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super RunnableParameter> initializer) {
    EList<RunnableParameter> _parameters = container.getParameters();
    RunnableParameter _init = this.<RunnableParameter>init(AmaltheaFactory.eINSTANCE.createRunnableParameter(), initializer);
    return _parameters.add(_init);
  }
  
  public boolean group(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super Group> initializer) {
    EList<RunnableItem> _runnableItems = container.getRunnableItems();
    Group _init = this.<Group>init(AmaltheaFactory.eINSTANCE.createGroup(), initializer);
    return _runnableItems.add(_init);
  }
  
  public boolean group(final Group container, final Procedure1<? super Group> initializer) {
    EList<RunnableItem> _items = container.getItems();
    Group _init = this.<Group>init(AmaltheaFactory.eINSTANCE.createGroup(), initializer);
    return _items.add(_init);
  }
  
  public boolean group(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super Group> initializer) {
    EList<RunnableItem> _items = container.getItems();
    Group _init = this.<Group>init(AmaltheaFactory.eINSTANCE.createGroup(), initializer);
    return _items.add(_init);
  }
  
  public boolean group(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super Group> initializer) {
    EList<RunnableItem> _items = container.getItems();
    Group _init = this.<Group>init(AmaltheaFactory.eINSTANCE.createGroup(), initializer);
    return _items.add(_init);
  }
  
  public boolean group(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super Group> initializer) {
    EList<RunnableItem> _items = container.getItems();
    Group _init = this.<Group>init(AmaltheaFactory.eINSTANCE.createGroup(), initializer);
    return _items.add(_init);
  }
  
  public boolean modeSwitch(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super RunnableModeSwitch> initializer) {
    EList<RunnableItem> _runnableItems = container.getRunnableItems();
    RunnableModeSwitch _init = this.<RunnableModeSwitch>init(AmaltheaFactory.eINSTANCE.createRunnableModeSwitch(), initializer);
    return _runnableItems.add(_init);
  }
  
  public boolean modeSwitch(final Group container, final Procedure1<? super RunnableModeSwitch> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableModeSwitch _init = this.<RunnableModeSwitch>init(AmaltheaFactory.eINSTANCE.createRunnableModeSwitch(), initializer);
    return _items.add(_init);
  }
  
  public boolean modeSwitch(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super RunnableModeSwitch> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableModeSwitch _init = this.<RunnableModeSwitch>init(AmaltheaFactory.eINSTANCE.createRunnableModeSwitch(), initializer);
    return _items.add(_init);
  }
  
  public boolean modeSwitch(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super RunnableModeSwitch> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableModeSwitch _init = this.<RunnableModeSwitch>init(AmaltheaFactory.eINSTANCE.createRunnableModeSwitch(), initializer);
    return _items.add(_init);
  }
  
  public boolean modeSwitch(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super RunnableModeSwitch> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableModeSwitch _init = this.<RunnableModeSwitch>init(AmaltheaFactory.eINSTANCE.createRunnableModeSwitch(), initializer);
    return _items.add(_init);
  }
  
  public boolean entry(final RunnableModeSwitch container, final Procedure1<? super ModeSwitchEntry<RunnableItem>> initializer) {
    EList<ModeSwitchEntry<RunnableItem>> _entries = container.getEntries();
    ModeSwitchEntry<RunnableItem> _init = this.<ModeSwitchEntry<RunnableItem>>init(AmaltheaFactory.eINSTANCE.<RunnableItem>createModeSwitchEntry(), initializer);
    return _entries.add(_init);
  }
  
  public void defaultEntry(final RunnableModeSwitch container, final Procedure1<? super ModeSwitchDefault<RunnableItem>> initializer) {
    container.setDefaultEntry(this.<ModeSwitchDefault<RunnableItem>>init(AmaltheaFactory.eINSTANCE.<RunnableItem>createModeSwitchDefault(), initializer));
  }
  
  public boolean probabilitySwitch(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    EList<RunnableItem> _runnableItems = container.getRunnableItems();
    RunnableProbabilitySwitch _init = this.<RunnableProbabilitySwitch>init(AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch(), initializer);
    return _runnableItems.add(_init);
  }
  
  public boolean probabilitySwitch(final Group container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableProbabilitySwitch _init = this.<RunnableProbabilitySwitch>init(AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch(), initializer);
    return _items.add(_init);
  }
  
  public boolean probabilitySwitch(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableProbabilitySwitch _init = this.<RunnableProbabilitySwitch>init(AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch(), initializer);
    return _items.add(_init);
  }
  
  public boolean probabilitySwitch(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableProbabilitySwitch _init = this.<RunnableProbabilitySwitch>init(AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch(), initializer);
    return _items.add(_init);
  }
  
  public boolean probabilitySwitch(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableProbabilitySwitch _init = this.<RunnableProbabilitySwitch>init(AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch(), initializer);
    return _items.add(_init);
  }
  
  public boolean entry(final RunnableProbabilitySwitch container, final Procedure1<? super ProbabilitySwitchEntry<RunnableItem>> initializer) {
    EList<ProbabilitySwitchEntry<RunnableItem>> _entries = container.getEntries();
    ProbabilitySwitchEntry<RunnableItem> _init = this.<ProbabilitySwitchEntry<RunnableItem>>init(AmaltheaFactory.eINSTANCE.<RunnableItem>createProbabilitySwitchEntry(), initializer);
    return _entries.add(_init);
  }
  
  public boolean labelAccess(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super LabelAccess> initializer) {
    EList<RunnableItem> _runnableItems = container.getRunnableItems();
    LabelAccess _init = this.<LabelAccess>init(AmaltheaFactory.eINSTANCE.createLabelAccess(), initializer);
    return _runnableItems.add(_init);
  }
  
  public boolean labelAccess(final Group container, final Procedure1<? super LabelAccess> initializer) {
    EList<RunnableItem> _items = container.getItems();
    LabelAccess _init = this.<LabelAccess>init(AmaltheaFactory.eINSTANCE.createLabelAccess(), initializer);
    return _items.add(_init);
  }
  
  public boolean labelAccess(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super LabelAccess> initializer) {
    EList<RunnableItem> _items = container.getItems();
    LabelAccess _init = this.<LabelAccess>init(AmaltheaFactory.eINSTANCE.createLabelAccess(), initializer);
    return _items.add(_init);
  }
  
  public boolean labelAccess(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super LabelAccess> initializer) {
    EList<RunnableItem> _items = container.getItems();
    LabelAccess _init = this.<LabelAccess>init(AmaltheaFactory.eINSTANCE.createLabelAccess(), initializer);
    return _items.add(_init);
  }
  
  public boolean labelAccess(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super LabelAccess> initializer) {
    EList<RunnableItem> _items = container.getItems();
    LabelAccess _init = this.<LabelAccess>init(AmaltheaFactory.eINSTANCE.createLabelAccess(), initializer);
    return _items.add(_init);
  }
  
  public boolean runnableCall(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super RunnableCall> initializer) {
    EList<RunnableItem> _runnableItems = container.getRunnableItems();
    RunnableCall _init = this.<RunnableCall>init(AmaltheaFactory.eINSTANCE.createRunnableCall(), initializer);
    return _runnableItems.add(_init);
  }
  
  public boolean runnableCall(final Group container, final Procedure1<? super RunnableCall> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableCall _init = this.<RunnableCall>init(AmaltheaFactory.eINSTANCE.createRunnableCall(), initializer);
    return _items.add(_init);
  }
  
  public boolean runnableCall(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super RunnableCall> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableCall _init = this.<RunnableCall>init(AmaltheaFactory.eINSTANCE.createRunnableCall(), initializer);
    return _items.add(_init);
  }
  
  public boolean runnableCall(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super RunnableCall> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableCall _init = this.<RunnableCall>init(AmaltheaFactory.eINSTANCE.createRunnableCall(), initializer);
    return _items.add(_init);
  }
  
  public boolean runnableCall(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super RunnableCall> initializer) {
    EList<RunnableItem> _items = container.getItems();
    RunnableCall _init = this.<RunnableCall>init(AmaltheaFactory.eINSTANCE.createRunnableCall(), initializer);
    return _items.add(_init);
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
