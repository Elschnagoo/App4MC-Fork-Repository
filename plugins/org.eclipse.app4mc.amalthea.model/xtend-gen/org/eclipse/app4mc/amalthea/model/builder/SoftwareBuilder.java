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

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.CustomActivation;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EventActivation;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.IDiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SchedulePoint;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.TerminateProcess;
import org.eclipse.app4mc.amalthea.model.VariableRateActivation;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SoftwareBuilder {
  public SWModel softwareModelRoot(final Procedure1<? super SWModel> initializer) {
    return this.<SWModel>init(AmaltheaFactory.eINSTANCE.createSWModel(), initializer);
  }
  
  public ISR isr(final SWModel container, final Procedure1<? super ISR> initializer) {
    ISR _xblockexpression = null;
    {
      final ISR obj = AmaltheaFactory.eINSTANCE.createISR();
      EList<ISR> _isrs = container.getIsrs();
      _isrs.add(obj);
      _xblockexpression = this.<ISR>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Task task(final SWModel container, final Procedure1<? super Task> initializer) {
    Task _xblockexpression = null;
    {
      final Task obj = AmaltheaFactory.eINSTANCE.createTask();
      EList<Task> _tasks = container.getTasks();
      _tasks.add(obj);
      _xblockexpression = this.<Task>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public org.eclipse.app4mc.amalthea.model.Runnable runnable(final SWModel container, final Procedure1<? super org.eclipse.app4mc.amalthea.model.Runnable> initializer) {
    org.eclipse.app4mc.amalthea.model.Runnable _xblockexpression = null;
    {
      final org.eclipse.app4mc.amalthea.model.Runnable obj = AmaltheaFactory.eINSTANCE.createRunnable();
      EList<org.eclipse.app4mc.amalthea.model.Runnable> _runnables = container.getRunnables();
      _runnables.add(obj);
      _xblockexpression = this.<org.eclipse.app4mc.amalthea.model.Runnable>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Label label(final SWModel container, final Procedure1<? super Label> initializer) {
    Label _xblockexpression = null;
    {
      final Label obj = AmaltheaFactory.eINSTANCE.createLabel();
      EList<Label> _labels = container.getLabels();
      _labels.add(obj);
      _xblockexpression = this.<Label>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Channel channel(final SWModel container, final Procedure1<? super Channel> initializer) {
    Channel _xblockexpression = null;
    {
      final Channel obj = AmaltheaFactory.eINSTANCE.createChannel();
      EList<Channel> _channels = container.getChannels();
      _channels.add(obj);
      _xblockexpression = this.<Channel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProcessPrototype processPrototype(final SWModel container, final Procedure1<? super ProcessPrototype> initializer) {
    ProcessPrototype _xblockexpression = null;
    {
      final ProcessPrototype obj = AmaltheaFactory.eINSTANCE.createProcessPrototype();
      EList<ProcessPrototype> _processPrototypes = container.getProcessPrototypes();
      _processPrototypes.add(obj);
      _xblockexpression = this.<ProcessPrototype>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Section section(final SWModel container, final Procedure1<? super Section> initializer) {
    Section _xblockexpression = null;
    {
      final Section obj = AmaltheaFactory.eINSTANCE.createSection();
      EList<Section> _sections = container.getSections();
      _sections.add(obj);
      _xblockexpression = this.<Section>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public SingleActivation activation_Single(final SWModel container, final Procedure1<? super SingleActivation> initializer) {
    SingleActivation _xblockexpression = null;
    {
      final SingleActivation obj = AmaltheaFactory.eINSTANCE.createSingleActivation();
      EList<Activation> _activations = container.getActivations();
      _activations.add(obj);
      _xblockexpression = this.<SingleActivation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public SporadicActivation activation_Sporadic(final SWModel container, final Procedure1<? super SporadicActivation> initializer) {
    SporadicActivation _xblockexpression = null;
    {
      final SporadicActivation obj = AmaltheaFactory.eINSTANCE.createSporadicActivation();
      EList<Activation> _activations = container.getActivations();
      _activations.add(obj);
      _xblockexpression = this.<SporadicActivation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public PeriodicActivation activation_Periodic(final SWModel container, final Procedure1<? super PeriodicActivation> initializer) {
    PeriodicActivation _xblockexpression = null;
    {
      final PeriodicActivation obj = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
      EList<Activation> _activations = container.getActivations();
      _activations.add(obj);
      _xblockexpression = this.<PeriodicActivation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public EventActivation activation_Event(final SWModel container, final Procedure1<? super EventActivation> initializer) {
    EventActivation _xblockexpression = null;
    {
      final EventActivation obj = AmaltheaFactory.eINSTANCE.createEventActivation();
      EList<Activation> _activations = container.getActivations();
      _activations.add(obj);
      _xblockexpression = this.<EventActivation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public VariableRateActivation activation_VariableRate(final SWModel container, final Procedure1<? super VariableRateActivation> initializer) {
    VariableRateActivation _xblockexpression = null;
    {
      final VariableRateActivation obj = AmaltheaFactory.eINSTANCE.createVariableRateActivation();
      EList<Activation> _activations = container.getActivations();
      _activations.add(obj);
      _xblockexpression = this.<VariableRateActivation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public CustomActivation activation_Custom(final SWModel container, final Procedure1<? super CustomActivation> initializer) {
    CustomActivation _xblockexpression = null;
    {
      final CustomActivation obj = AmaltheaFactory.eINSTANCE.createCustomActivation();
      EList<Activation> _activations = container.getActivations();
      _activations.add(obj);
      _xblockexpression = this.<CustomActivation>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Mode mode(final SWModel container, final Procedure1<? super Mode> initializer) {
    Mode _xblockexpression = null;
    {
      final Mode obj = AmaltheaFactory.eINSTANCE.createMode();
      EList<Mode> _modes = container.getModes();
      _modes.add(obj);
      _xblockexpression = this.<Mode>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeLabel modeLabel(final SWModel container, final Procedure1<? super ModeLabel> initializer) {
    ModeLabel _xblockexpression = null;
    {
      final ModeLabel obj = AmaltheaFactory.eINSTANCE.createModeLabel();
      EList<ModeLabel> _modeLabels = container.getModeLabels();
      _modeLabels.add(obj);
      _xblockexpression = this.<ModeLabel>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeLiteral literal(final Mode container, final Procedure1<? super ModeLiteral> initializer) {
    ModeLiteral _xblockexpression = null;
    {
      final ModeLiteral obj = AmaltheaFactory.eINSTANCE.createModeLiteral();
      EList<ModeLiteral> _literals = container.getLiterals();
      _literals.add(obj);
      _xblockexpression = this.<ModeLiteral>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public CallSequence callSequence(final Task container, final Procedure1<? super CallSequence> initializer) {
    CallSequence _xblockexpression = null;
    {
      final CallSequence obj = AmaltheaFactory.eINSTANCE.createCallSequence();
      CallGraph _callGraph = container.getCallGraph();
      boolean _tripleEquals = (_callGraph == null);
      if (_tripleEquals) {
        container.setCallGraph(AmaltheaFactory.eINSTANCE.createCallGraph());
      }
      EList<GraphEntryBase> _graphEntries = container.getCallGraph().getGraphEntries();
      _graphEntries.add(obj);
      _xblockexpression = this.<CallSequence>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public CallSequence callSequence(final ModeSwitchDefault<GraphEntryBase> container, final Procedure1<? super CallSequence> initializer) {
    CallSequence _xblockexpression = null;
    {
      final CallSequence obj = AmaltheaFactory.eINSTANCE.createCallSequence();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<CallSequence>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public CallSequence callSequence(final ModeSwitchEntry<GraphEntryBase> container, final Procedure1<? super CallSequence> initializer) {
    CallSequence _xblockexpression = null;
    {
      final CallSequence obj = AmaltheaFactory.eINSTANCE.createCallSequence();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<CallSequence>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public CallSequence callSequence(final ProbabilitySwitchEntry<GraphEntryBase> container, final Procedure1<? super CallSequence> initializer) {
    CallSequence _xblockexpression = null;
    {
      final CallSequence obj = AmaltheaFactory.eINSTANCE.createCallSequence();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<CallSequence>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeSwitch modeSwitch(final Task container, final Procedure1<? super ModeSwitch> initializer) {
    ModeSwitch _xblockexpression = null;
    {
      final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
      CallGraph _callGraph = container.getCallGraph();
      boolean _tripleEquals = (_callGraph == null);
      if (_tripleEquals) {
        container.setCallGraph(AmaltheaFactory.eINSTANCE.createCallGraph());
      }
      EList<GraphEntryBase> _graphEntries = container.getCallGraph().getGraphEntries();
      _graphEntries.add(obj);
      _xblockexpression = this.<ModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeSwitch modeSwitch(final ModeSwitchDefault<GraphEntryBase> container, final Procedure1<? super ModeSwitch> initializer) {
    ModeSwitch _xblockexpression = null;
    {
      final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeSwitch modeSwitch(final ModeSwitchEntry<GraphEntryBase> container, final Procedure1<? super ModeSwitch> initializer) {
    ModeSwitch _xblockexpression = null;
    {
      final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeSwitch modeSwitch(final ProbabilitySwitchEntry<GraphEntryBase> container, final Procedure1<? super ModeSwitch> initializer) {
    ModeSwitch _xblockexpression = null;
    {
      final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeSwitchEntry<GraphEntryBase> entry(final ModeSwitch container, final Procedure1<? super ModeSwitchEntry<GraphEntryBase>> initializer) {
    ModeSwitchEntry<GraphEntryBase> _xblockexpression = null;
    {
      final ModeSwitchEntry<GraphEntryBase> obj = AmaltheaFactory.eINSTANCE.<GraphEntryBase>createModeSwitchEntry();
      EList<ModeSwitchEntry<GraphEntryBase>> _entries = container.getEntries();
      _entries.add(obj);
      _xblockexpression = this.<ModeSwitchEntry<GraphEntryBase>>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeSwitchDefault<GraphEntryBase> defaultEntry(final ModeSwitch container, final Procedure1<? super ModeSwitchDefault<GraphEntryBase>> initializer) {
    ModeSwitchDefault<GraphEntryBase> _xblockexpression = null;
    {
      final ModeSwitchDefault<GraphEntryBase> obj = AmaltheaFactory.eINSTANCE.<GraphEntryBase>createModeSwitchDefault();
      container.setDefaultEntry(obj);
      _xblockexpression = this.<ModeSwitchDefault<GraphEntryBase>>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProbabilitySwitch probabilitySwitch(final Task container, final Procedure1<? super ProbabilitySwitch> initializer) {
    ProbabilitySwitch _xblockexpression = null;
    {
      final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
      CallGraph _callGraph = container.getCallGraph();
      boolean _tripleEquals = (_callGraph == null);
      if (_tripleEquals) {
        container.setCallGraph(AmaltheaFactory.eINSTANCE.createCallGraph());
      }
      EList<GraphEntryBase> _graphEntries = container.getCallGraph().getGraphEntries();
      _graphEntries.add(obj);
      _xblockexpression = this.<ProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProbabilitySwitch probabilitySwitch(final ModeSwitchDefault<GraphEntryBase> container, final Procedure1<? super ProbabilitySwitch> initializer) {
    ProbabilitySwitch _xblockexpression = null;
    {
      final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProbabilitySwitch probabilitySwitch(final ModeSwitchEntry<GraphEntryBase> container, final Procedure1<? super ProbabilitySwitch> initializer) {
    ProbabilitySwitch _xblockexpression = null;
    {
      final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProbabilitySwitch probabilitySwitch(final ProbabilitySwitchEntry<GraphEntryBase> container, final Procedure1<? super ProbabilitySwitch> initializer) {
    ProbabilitySwitch _xblockexpression = null;
    {
      final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
      EList<GraphEntryBase> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProbabilitySwitchEntry<GraphEntryBase> entry(final ProbabilitySwitch container, final Procedure1<? super ProbabilitySwitchEntry<GraphEntryBase>> initializer) {
    ProbabilitySwitchEntry<GraphEntryBase> _xblockexpression = null;
    {
      final ProbabilitySwitchEntry<GraphEntryBase> obj = AmaltheaFactory.eINSTANCE.<GraphEntryBase>createProbabilitySwitchEntry();
      EList<ProbabilitySwitchEntry<GraphEntryBase>> _entries = container.getEntries();
      _entries.add(obj);
      _xblockexpression = this.<ProbabilitySwitchEntry<GraphEntryBase>>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public TaskRunnableCall runnableCall(final CallSequence container, final Procedure1<? super TaskRunnableCall> initializer) {
    TaskRunnableCall _xblockexpression = null;
    {
      final TaskRunnableCall obj = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
      EList<CallSequenceItem> _calls = container.getCalls();
      _calls.add(obj);
      _xblockexpression = this.<TaskRunnableCall>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public SchedulePoint schedulePoint(final CallSequence container, final Procedure1<? super SchedulePoint> initializer) {
    SchedulePoint _xblockexpression = null;
    {
      final SchedulePoint obj = AmaltheaFactory.eINSTANCE.createSchedulePoint();
      EList<CallSequenceItem> _calls = container.getCalls();
      _calls.add(obj);
      _xblockexpression = this.<SchedulePoint>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public InterProcessTrigger interProcessTrigger(final CallSequence container, final Procedure1<? super InterProcessTrigger> initializer) {
    InterProcessTrigger _xblockexpression = null;
    {
      final InterProcessTrigger obj = AmaltheaFactory.eINSTANCE.createInterProcessTrigger();
      EList<CallSequenceItem> _calls = container.getCalls();
      _calls.add(obj);
      _xblockexpression = this.<InterProcessTrigger>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public EnforcedMigration enforcedMigration(final CallSequence container, final Procedure1<? super EnforcedMigration> initializer) {
    EnforcedMigration _xblockexpression = null;
    {
      final EnforcedMigration obj = AmaltheaFactory.eINSTANCE.createEnforcedMigration();
      EList<CallSequenceItem> _calls = container.getCalls();
      _calls.add(obj);
      _xblockexpression = this.<EnforcedMigration>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public TerminateProcess terminateProcess(final CallSequence container, final Procedure1<? super TerminateProcess> initializer) {
    TerminateProcess _xblockexpression = null;
    {
      final TerminateProcess obj = AmaltheaFactory.eINSTANCE.createTerminateProcess();
      EList<CallSequenceItem> _calls = container.getCalls();
      _calls.add(obj);
      _xblockexpression = this.<TerminateProcess>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ClearEvent clearEvent(final CallSequence container, final Procedure1<? super ClearEvent> initializer) {
    ClearEvent _xblockexpression = null;
    {
      final ClearEvent obj = AmaltheaFactory.eINSTANCE.createClearEvent();
      EList<CallSequenceItem> _calls = container.getCalls();
      _calls.add(obj);
      _xblockexpression = this.<ClearEvent>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public WaitEvent waitEvent(final CallSequence container, final Procedure1<? super WaitEvent> initializer) {
    WaitEvent _xblockexpression = null;
    {
      final WaitEvent obj = AmaltheaFactory.eINSTANCE.createWaitEvent();
      EList<CallSequenceItem> _calls = container.getCalls();
      _calls.add(obj);
      _xblockexpression = this.<WaitEvent>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public SetEvent setEvent(final CallSequence container, final Procedure1<? super SetEvent> initializer) {
    SetEvent _xblockexpression = null;
    {
      final SetEvent obj = AmaltheaFactory.eINSTANCE.createSetEvent();
      EList<CallSequenceItem> _calls = container.getCalls();
      _calls.add(obj);
      _xblockexpression = this.<SetEvent>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableParameter parameter(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super RunnableParameter> initializer) {
    RunnableParameter _xblockexpression = null;
    {
      final RunnableParameter obj = AmaltheaFactory.eINSTANCE.createRunnableParameter();
      EList<RunnableParameter> _parameters = container.getParameters();
      _parameters.add(obj);
      _xblockexpression = this.<RunnableParameter>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Group group(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super Group> initializer) {
    Group _xblockexpression = null;
    {
      final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
      EList<RunnableItem> _runnableItems = container.getRunnableItems();
      _runnableItems.add(obj);
      _xblockexpression = this.<Group>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Group group(final Group container, final Procedure1<? super Group> initializer) {
    Group _xblockexpression = null;
    {
      final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<Group>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Group group(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super Group> initializer) {
    Group _xblockexpression = null;
    {
      final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<Group>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Group group(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super Group> initializer) {
    Group _xblockexpression = null;
    {
      final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<Group>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public Group group(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super Group> initializer) {
    Group _xblockexpression = null;
    {
      final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<Group>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableModeSwitch runModeSwitch(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super RunnableModeSwitch> initializer) {
    RunnableModeSwitch _xblockexpression = null;
    {
      final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
      EList<RunnableItem> _runnableItems = container.getRunnableItems();
      _runnableItems.add(obj);
      _xblockexpression = this.<RunnableModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableModeSwitch runModeSwitch(final Group container, final Procedure1<? super RunnableModeSwitch> initializer) {
    RunnableModeSwitch _xblockexpression = null;
    {
      final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableModeSwitch runModeSwitch(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super RunnableModeSwitch> initializer) {
    RunnableModeSwitch _xblockexpression = null;
    {
      final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableModeSwitch runModeSwitch(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super RunnableModeSwitch> initializer) {
    RunnableModeSwitch _xblockexpression = null;
    {
      final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableModeSwitch runModeSwitch(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super RunnableModeSwitch> initializer) {
    RunnableModeSwitch _xblockexpression = null;
    {
      final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableModeSwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeSwitchEntry<RunnableItem> entry(final RunnableModeSwitch container, final Procedure1<? super ModeSwitchEntry<RunnableItem>> initializer) {
    ModeSwitchEntry<RunnableItem> _xblockexpression = null;
    {
      final ModeSwitchEntry<RunnableItem> obj = AmaltheaFactory.eINSTANCE.<RunnableItem>createModeSwitchEntry();
      EList<ModeSwitchEntry<RunnableItem>> _entries = container.getEntries();
      _entries.add(obj);
      _xblockexpression = this.<ModeSwitchEntry<RunnableItem>>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ModeSwitchDefault<RunnableItem> defaultEntry(final RunnableModeSwitch container, final Procedure1<? super ModeSwitchDefault<RunnableItem>> initializer) {
    ModeSwitchDefault<RunnableItem> _xblockexpression = null;
    {
      final ModeSwitchDefault<RunnableItem> obj = AmaltheaFactory.eINSTANCE.<RunnableItem>createModeSwitchDefault();
      container.setDefaultEntry(obj);
      _xblockexpression = this.<ModeSwitchDefault<RunnableItem>>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableProbabilitySwitch runProbabilitySwitch(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    RunnableProbabilitySwitch _xblockexpression = null;
    {
      final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
      EList<RunnableItem> _runnableItems = container.getRunnableItems();
      _runnableItems.add(obj);
      _xblockexpression = this.<RunnableProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableProbabilitySwitch runProbabilitySwitch(final Group container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    RunnableProbabilitySwitch _xblockexpression = null;
    {
      final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableProbabilitySwitch runProbabilitySwitch(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    RunnableProbabilitySwitch _xblockexpression = null;
    {
      final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableProbabilitySwitch runProbabilitySwitch(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    RunnableProbabilitySwitch _xblockexpression = null;
    {
      final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableProbabilitySwitch runProbabilitySwitch(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super RunnableProbabilitySwitch> initializer) {
    RunnableProbabilitySwitch _xblockexpression = null;
    {
      final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableProbabilitySwitch>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ProbabilitySwitchEntry<RunnableItem> entry(final RunnableProbabilitySwitch container, final Procedure1<? super ProbabilitySwitchEntry<RunnableItem>> initializer) {
    ProbabilitySwitchEntry<RunnableItem> _xblockexpression = null;
    {
      final ProbabilitySwitchEntry<RunnableItem> obj = AmaltheaFactory.eINSTANCE.<RunnableItem>createProbabilitySwitchEntry();
      EList<ProbabilitySwitchEntry<RunnableItem>> _entries = container.getEntries();
      _entries.add(obj);
      _xblockexpression = this.<ProbabilitySwitchEntry<RunnableItem>>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public LabelAccess labelAccess(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super LabelAccess> initializer) {
    LabelAccess _xblockexpression = null;
    {
      final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
      EList<RunnableItem> _runnableItems = container.getRunnableItems();
      _runnableItems.add(obj);
      _xblockexpression = this.<LabelAccess>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public LabelAccess labelAccess(final Group container, final Procedure1<? super LabelAccess> initializer) {
    LabelAccess _xblockexpression = null;
    {
      final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<LabelAccess>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public LabelAccess labelAccess(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super LabelAccess> initializer) {
    LabelAccess _xblockexpression = null;
    {
      final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<LabelAccess>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public LabelAccess labelAccess(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super LabelAccess> initializer) {
    LabelAccess _xblockexpression = null;
    {
      final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<LabelAccess>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public LabelAccess labelAccess(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super LabelAccess> initializer) {
    LabelAccess _xblockexpression = null;
    {
      final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<LabelAccess>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableCall runnableCall(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super RunnableCall> initializer) {
    RunnableCall _xblockexpression = null;
    {
      final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
      EList<RunnableItem> _runnableItems = container.getRunnableItems();
      _runnableItems.add(obj);
      _xblockexpression = this.<RunnableCall>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableCall runnableCall(final Group container, final Procedure1<? super RunnableCall> initializer) {
    RunnableCall _xblockexpression = null;
    {
      final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableCall>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableCall runnableCall(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super RunnableCall> initializer) {
    RunnableCall _xblockexpression = null;
    {
      final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableCall>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableCall runnableCall(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super RunnableCall> initializer) {
    RunnableCall _xblockexpression = null;
    {
      final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableCall>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public RunnableCall runnableCall(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super RunnableCall> initializer) {
    RunnableCall _xblockexpression = null;
    {
      final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<RunnableCall>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ExecutionNeed execNeed(final org.eclipse.app4mc.amalthea.model.Runnable container, final Procedure1<? super ExecutionNeed> initializer) {
    ExecutionNeed _xblockexpression = null;
    {
      final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
      EList<RunnableItem> _runnableItems = container.getRunnableItems();
      _runnableItems.add(obj);
      _xblockexpression = this.<ExecutionNeed>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ExecutionNeed execNeed(final Group container, final Procedure1<? super ExecutionNeed> initializer) {
    ExecutionNeed _xblockexpression = null;
    {
      final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ExecutionNeed>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ExecutionNeed execNeed(final ModeSwitchDefault<RunnableItem> container, final Procedure1<? super ExecutionNeed> initializer) {
    ExecutionNeed _xblockexpression = null;
    {
      final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ExecutionNeed>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ExecutionNeed execNeed(final ModeSwitchEntry<RunnableItem> container, final Procedure1<? super ExecutionNeed> initializer) {
    ExecutionNeed _xblockexpression = null;
    {
      final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ExecutionNeed>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public ExecutionNeed execNeed(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<? super ExecutionNeed> initializer) {
    ExecutionNeed _xblockexpression = null;
    {
      final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
      EList<RunnableItem> _items = container.getItems();
      _items.add(obj);
      _xblockexpression = this.<ExecutionNeed>init(obj, initializer);
    }
    return _xblockexpression;
  }
  
  public IDiscreteDeviation need(final ExecutionNeed container, final String key, final IDiscreteDeviation need) {
    return container.getNeeds().put(key, need);
  }
  
  private <T extends Object> T init(final T obj, final Procedure1<? super T> init) {
    init.apply(obj);
    return obj;
  }
}
