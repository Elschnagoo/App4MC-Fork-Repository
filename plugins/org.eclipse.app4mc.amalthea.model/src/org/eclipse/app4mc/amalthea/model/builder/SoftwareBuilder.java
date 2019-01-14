/**
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.CustomActivation;
import org.eclipse.app4mc.amalthea.model.DiscreteValueConstant;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EventActivation;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
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
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Runnable;
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
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.VariableRateActivation;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class SoftwareBuilder {
	public SWModel softwareModelRoot(final Procedure1<SWModel> initializer) {
		final SWModel obj = AmaltheaFactory.eINSTANCE.createSWModel();
		initializer.apply(obj);
		return obj;
	}

	// ********** Top level elements **********

	public void isr(final SWModel container, final Procedure1<ISR> initializer) {
		final ISR obj = AmaltheaFactory.eINSTANCE.createISR();
		container.getIsrs().add(obj);
		initializer.apply(obj);
	}

	public void task(final SWModel container, final Procedure1<Task> initializer) {
		final Task obj = AmaltheaFactory.eINSTANCE.createTask();
		container.getTasks().add(obj);
		initializer.apply(obj);
	}

	public void runnable(final SWModel container, final Procedure1<Runnable> initializer) {
		final Runnable obj = AmaltheaFactory.eINSTANCE.createRunnable();
		container.getRunnables().add(obj);
		initializer.apply(obj);
	}

	public void label(final SWModel container, final Procedure1<Label> initializer) {
		final Label obj = AmaltheaFactory.eINSTANCE.createLabel();
		container.getLabels().add(obj);
		initializer.apply(obj);
	}

	public void channel(final SWModel container, final Procedure1<Channel> initializer) {
		final Channel obj = AmaltheaFactory.eINSTANCE.createChannel();
		container.getChannels().add(obj);
		initializer.apply(obj);
	}

	public void processPrototype(final SWModel container, final Procedure1<ProcessPrototype> initializer) {
		final ProcessPrototype obj = AmaltheaFactory.eINSTANCE.createProcessPrototype();
		container.getProcessPrototypes().add(obj);
		initializer.apply(obj);
	}

	public void section(final SWModel container, final Procedure1<Section> initializer) {
		final Section obj = AmaltheaFactory.eINSTANCE.createSection();
		container.getSections().add(obj);
		initializer.apply(obj);
	}

	public void activation_Single(final SWModel container, final Procedure1<SingleActivation> initializer) {
		final SingleActivation obj = AmaltheaFactory.eINSTANCE.createSingleActivation();
		container.getActivations().add(obj);
		initializer.apply(obj);
	}

	public void activation_Sporadic(final SWModel container, final Procedure1<SporadicActivation> initializer) {
		final SporadicActivation obj = AmaltheaFactory.eINSTANCE.createSporadicActivation();
		container.getActivations().add(obj);
		initializer.apply(obj);
	}

	public void activation_Periodic(final SWModel container, final Procedure1<PeriodicActivation> initializer) {
		final PeriodicActivation obj = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
		container.getActivations().add(obj);
		initializer.apply(obj);
	}

	public void activation_Event(final SWModel container, final Procedure1<EventActivation> initializer) {
		final EventActivation obj = AmaltheaFactory.eINSTANCE.createEventActivation();
		container.getActivations().add(obj);
		initializer.apply(obj);
	}

	public void activation_VariableRate(final SWModel container, final Procedure1<VariableRateActivation> initializer) {
		final VariableRateActivation obj = AmaltheaFactory.eINSTANCE.createVariableRateActivation();
		container.getActivations().add(obj);
		initializer.apply(obj);
	}

	public void activation_Custom(final SWModel container, final Procedure1<CustomActivation> initializer) {
		final CustomActivation obj = AmaltheaFactory.eINSTANCE.createCustomActivation();
		container.getActivations().add(obj);
		initializer.apply(obj);
	}

	public void mode(final SWModel container, final Procedure1<Mode> initializer) {
		final Mode obj = AmaltheaFactory.eINSTANCE.createMode();
		container.getModes().add(obj);
		initializer.apply(obj);
	}

	public void modeLabel(final SWModel container, final Procedure1<ModeLabel> initializer) {
		final ModeLabel obj = AmaltheaFactory.eINSTANCE.createModeLabel();
		container.getModeLabels().add(obj);
		initializer.apply(obj);
	}

	// ********** Mode Literals **********

	public void literal(final Mode container, final Procedure1<ModeLiteral> initializer) {
		final ModeLiteral obj = AmaltheaFactory.eINSTANCE.createModeLiteral();
		container.getLiterals().add(obj);
		initializer.apply(obj);
	}

	// ********** Task - Container - Call Sequence **********

	public void callSequence(final Task container, final Procedure1<CallSequence> initializer) {
		final CallSequence obj = AmaltheaFactory.eINSTANCE.createCallSequence();
		if (container.getCallGraph() == null) {
			container.setCallGraph(AmaltheaFactory.eINSTANCE.createCallGraph());
		}
		container.getCallGraph().getGraphEntries().add(obj);
		initializer.apply(obj);
	}

	public void callSequence(final ModeSwitchDefault<GraphEntryBase> container, final Procedure1<CallSequence> initializer) {
		final CallSequence obj = AmaltheaFactory.eINSTANCE.createCallSequence();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void callSequence(final ModeSwitchEntry<GraphEntryBase> container, final Procedure1<CallSequence> initializer) {
		final CallSequence obj = AmaltheaFactory.eINSTANCE.createCallSequence();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void callSequence(final ProbabilitySwitchEntry<GraphEntryBase> container, final Procedure1<CallSequence> initializer) {
		final CallSequence obj = AmaltheaFactory.eINSTANCE.createCallSequence();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** Task - Container - ModeSwitch **********

	public void modeSwitch(final Task container, final Procedure1<ModeSwitch> initializer) {
		final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
		if (container.getCallGraph() == null) {
			container.setCallGraph(AmaltheaFactory.eINSTANCE.createCallGraph());
		}
		container.getCallGraph().getGraphEntries().add(obj);
		initializer.apply(obj);
	}

	public void modeSwitch(final ModeSwitchDefault<GraphEntryBase> container, final Procedure1<ModeSwitch> initializer) {
		final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void modeSwitch(final ModeSwitchEntry<GraphEntryBase> container, final Procedure1<ModeSwitch> initializer) {
		final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void modeSwitch(final ProbabilitySwitchEntry<GraphEntryBase> container, final Procedure1<ModeSwitch> initializer) {
		final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void entry(final ModeSwitch container, final Procedure1<ModeSwitchEntry<GraphEntryBase>> initializer) {
		final ModeSwitchEntry<GraphEntryBase> obj = AmaltheaFactory.eINSTANCE.<GraphEntryBase>createModeSwitchEntry();
		container.getEntries().add(obj);
		initializer.apply(obj);
	}

	public void defaultEntry(final ModeSwitch container, final Procedure1<ModeSwitchDefault<GraphEntryBase>> initializer) {
		final ModeSwitchDefault<GraphEntryBase> obj = AmaltheaFactory.eINSTANCE.<GraphEntryBase>createModeSwitchDefault();
		container.setDefaultEntry(obj);
		initializer.apply(obj);
	}

	// ********** Task - Container - ProbabilitySwitch **********

	public void probabilitySwitch(final Task container, final Procedure1<ProbabilitySwitch> initializer) {
		final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
		if (container.getCallGraph() == null) {
			container.setCallGraph(AmaltheaFactory.eINSTANCE.createCallGraph());
		}
		container.getCallGraph().getGraphEntries().add(obj);
		initializer.apply(obj);
	}

	public void probabilitySwitch(final ModeSwitchDefault<GraphEntryBase> container, final Procedure1<ProbabilitySwitch> initializer) {
		final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void probabilitySwitch(final ModeSwitchEntry<GraphEntryBase> container, final Procedure1<ProbabilitySwitch> initializer) {
		final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void probabilitySwitch(final ProbabilitySwitchEntry<GraphEntryBase> container, final Procedure1<ProbabilitySwitch> initializer) {
		final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
		container.getItems().add(obj);
		initializer.apply(obj);

	}

	public void entry(final ProbabilitySwitch container, final Procedure1<ProbabilitySwitchEntry<GraphEntryBase>> initializer) {
		final ProbabilitySwitchEntry<GraphEntryBase> obj = AmaltheaFactory.eINSTANCE.<GraphEntryBase>createProbabilitySwitchEntry();
		container.getEntries().add(obj);
		initializer.apply(obj);
	}

	// ********** Call Sequence Items **********

	public void runnableCall(final CallSequence container, final Procedure1<TaskRunnableCall> initializer) {
		final TaskRunnableCall obj = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		container.getCalls().add(obj);
		initializer.apply(obj);
	}

	public void schedulePoint(final CallSequence container, final Procedure1<SchedulePoint> initializer) {
		final SchedulePoint obj = AmaltheaFactory.eINSTANCE.createSchedulePoint();
		container.getCalls().add(obj);
		initializer.apply(obj);
	}

	public void interProcessTrigger(final CallSequence container, final Procedure1<InterProcessTrigger> initializer) {
		final InterProcessTrigger obj = AmaltheaFactory.eINSTANCE.createInterProcessTrigger();
		container.getCalls().add(obj);
		initializer.apply(obj);
	}

	public void enforcedMigration(final CallSequence container, final Procedure1<EnforcedMigration> initializer) {
		final EnforcedMigration obj = AmaltheaFactory.eINSTANCE.createEnforcedMigration();
		container.getCalls().add(obj);
		initializer.apply(obj);
	}

	public void terminateProcess(final CallSequence container, final Procedure1<TerminateProcess> initializer) {
		final TerminateProcess obj = AmaltheaFactory.eINSTANCE.createTerminateProcess();
		container.getCalls().add(obj);
		initializer.apply(obj);
	}

	public void clearEvent(final CallSequence container, final Procedure1<ClearEvent> initializer) {
		final ClearEvent obj = AmaltheaFactory.eINSTANCE.createClearEvent();
		container.getCalls().add(obj);
		initializer.apply(obj);
	}

	public void waitEvent(final CallSequence container, final Procedure1<WaitEvent> initializer) {
		final WaitEvent obj = AmaltheaFactory.eINSTANCE.createWaitEvent();
		container.getCalls().add(obj);
		initializer.apply(obj);
	}

	public void setEvent(final CallSequence container, final Procedure1<SetEvent> initializer) {
		final SetEvent obj = AmaltheaFactory.eINSTANCE.createSetEvent();
		container.getCalls().add(obj);
		initializer.apply(obj);
	}

	// ********** Runnable Parameters **********

	public void parameter(final Runnable container, final Procedure1<RunnableParameter> initializer) {
		final RunnableParameter obj = AmaltheaFactory.eINSTANCE.createRunnableParameter();
		container.getParameters().add(obj);
		initializer.apply(obj);
	}

	// ********** Runnable Items - Container - Group **********

	public void group(final Runnable container, final Procedure1<Group> initializer) {
		final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
		container.getRunnableItems().add(obj);
		initializer.apply(obj);
	}

	public void group(final Group container, final Procedure1<Group> initializer) {
		final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void group(final ModeSwitchDefault<RunnableItem> container, final Procedure1<Group> initializer) {
		final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void group(final ModeSwitchEntry<RunnableItem> container, final Procedure1<Group> initializer) {
		final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void group(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<Group> initializer) {
		final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** Runnable Items - Container - RunnableModeSwitch **********

	public void runModeSwitch(final Runnable container, final Procedure1<RunnableModeSwitch> initializer) {
		final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
		container.getRunnableItems().add(obj);
		initializer.apply(obj);
	}

	public void runModeSwitch(final Group container, final Procedure1<RunnableModeSwitch> initializer) {
		final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void runModeSwitch(final ModeSwitchDefault<RunnableItem> container, final Procedure1<RunnableModeSwitch> initializer) {
		final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
		container.getItems().add(obj);
		initializer.apply(obj);

	}

	public void runModeSwitch(final ModeSwitchEntry<RunnableItem> container, final Procedure1<RunnableModeSwitch> initializer) {
		final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
		container.getItems().add(obj);
		initializer.apply(obj);

	}

	public void runModeSwitch(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<RunnableModeSwitch> initializer) {
		final RunnableModeSwitch obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void entry(final RunnableModeSwitch container, final Procedure1<ModeSwitchEntry<RunnableItem>> initializer) {
		final ModeSwitchEntry<RunnableItem> obj = AmaltheaFactory.eINSTANCE.<RunnableItem>createModeSwitchEntry();
		container.getEntries().add(obj);
		initializer.apply(obj);
	}

	public void defaultEntry(final RunnableModeSwitch container, final Procedure1<ModeSwitchDefault<RunnableItem>> initializer) {
		final ModeSwitchDefault<RunnableItem> obj = AmaltheaFactory.eINSTANCE.<RunnableItem>createModeSwitchDefault();
		container.setDefaultEntry(obj);
		initializer.apply(obj);
	}

	// ********** Runnable Items - Container - RunnableProbabilitySwitch **********
	
	public void runProbabilitySwitch(final Runnable container, final Procedure1<RunnableProbabilitySwitch> initializer) {
		final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
		container.getRunnableItems().add(obj);
		initializer.apply(obj);
	}

	public void runProbabilitySwitch(final Group container, final Procedure1<RunnableProbabilitySwitch> initializer) {
		final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void runProbabilitySwitch(final ModeSwitchDefault<RunnableItem> container, final Procedure1<RunnableProbabilitySwitch> initializer) {
		final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void runProbabilitySwitch(final ModeSwitchEntry<RunnableItem> container, final Procedure1<RunnableProbabilitySwitch> initializer) {
		final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void runProbabilitySwitch(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<RunnableProbabilitySwitch> initializer) {
		final RunnableProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void entry(final RunnableProbabilitySwitch container, final Procedure1<ProbabilitySwitchEntry<RunnableItem>> initializer) {
		final ProbabilitySwitchEntry<RunnableItem> obj = AmaltheaFactory.eINSTANCE.<RunnableItem>createProbabilitySwitchEntry();
		container.getEntries().add(obj);
		initializer.apply(obj);
	}

	// ********** Runnable Items - Label access **********

	public void labelAccess(final Runnable container, final Procedure1<LabelAccess> initializer) {
		final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
		container.getRunnableItems().add(obj);
		initializer.apply(obj);
	}

	public void labelAccess(final Group container, final Procedure1<LabelAccess> initializer) {
		final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void labelAccess(final ModeSwitchDefault<RunnableItem> container, final Procedure1<LabelAccess> initializer) {
		final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void labelAccess(final ModeSwitchEntry<RunnableItem> container, final Procedure1<LabelAccess> initializer) {
		final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void labelAccess(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<LabelAccess> initializer) {
		final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** Runnable Items - Runnable call **********

	public void runnableCall(final Runnable container, final Procedure1<RunnableCall> initializer) {
		final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
		container.getRunnableItems().add(obj);
		initializer.apply(obj);
	}

	public void runnableCall(final Group container, final Procedure1<RunnableCall> initializer) {
		final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void runnableCall(final ModeSwitchDefault<RunnableItem> container, final Procedure1<RunnableCall> initializer) {
		final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void runnableCall(final ModeSwitchEntry<RunnableItem> container, final Procedure1<RunnableCall> initializer) {
		final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void runnableCall(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<RunnableCall> initializer) {
		final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** Runnable Items - Execution need **********

	public void execNeed(final Runnable container, final Procedure1<ExecutionNeed> initializer) {
		final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		container.getRunnableItems().add(obj);
		initializer.apply(obj);
	}

	public void execNeed(final Group container, final Procedure1<ExecutionNeed> initializer) {
		final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void execNeed(final ModeSwitchDefault<RunnableItem> container, final Procedure1<ExecutionNeed> initializer) {
		final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void execNeed(final ModeSwitchEntry<RunnableItem> container, final Procedure1<ExecutionNeed> initializer) {
		final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void execNeed(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<ExecutionNeed> initializer) {
		final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void need(final ExecutionNeed container, final String key, final IDiscreteValueDeviation need) {
		container.getNeeds().put(key, need);
	}

	// ********** Runnable Items - Ticks **********

	public void ticks(final Runnable container, final Procedure1<Ticks> initializer) {
		final Ticks obj = AmaltheaFactory.eINSTANCE.createTicks();
		container.getRunnableItems().add(obj);
		initializer.apply(obj);
	}

	public void ticks(final Group container, final Procedure1<Ticks> initializer) {
		final Ticks obj = AmaltheaFactory.eINSTANCE.createTicks();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void ticks(final ModeSwitchDefault<RunnableItem> container, final Procedure1<Ticks> initializer) {
		final Ticks obj = AmaltheaFactory.eINSTANCE.createTicks();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void ticks(final ModeSwitchEntry<RunnableItem> container, final Procedure1<Ticks> initializer) {
		final Ticks obj = AmaltheaFactory.eINSTANCE.createTicks();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void ticks(final ProbabilitySwitchEntry<RunnableItem> container, final Procedure1<Ticks> initializer) {
		final Ticks obj = AmaltheaFactory.eINSTANCE.createTicks();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void defaultDeviation(final Ticks container, final IDiscreteValueDeviation ticks) {
		container.setDefault(ticks);
	}

	public void defaultConstant(final Ticks container, final long ticks) {
		final DiscreteValueConstant obj = AmaltheaFactory.eINSTANCE.createDiscreteValueConstant();
		obj.setValue(ticks);
		container.setDefault(obj);
	}

	public void extended(final Ticks container, final ProcessingUnitDefinition puDef, final IDiscreteValueDeviation ticks) {
		container.getExtended().put(puDef, ticks);
	}
	
	// ********** Runnable Items - to be extended **********

}
