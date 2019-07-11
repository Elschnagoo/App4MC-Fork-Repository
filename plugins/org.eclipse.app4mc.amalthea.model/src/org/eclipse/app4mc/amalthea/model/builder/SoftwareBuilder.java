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
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.CustomActivation;
import org.eclipse.app4mc.amalthea.model.DiscreteValueConstant;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.EventActivation;
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.ICallGraphItemContainer;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.NumericMode;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SchedulePoint;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.Task;
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

	public void mode_Enum(final SWModel container, final Procedure1<EnumMode> initializer) {
		final EnumMode obj = AmaltheaFactory.eINSTANCE.createEnumMode();
		container.getModes().add(obj);
		initializer.apply(obj);
	}

	public void mode_Numeric(final SWModel container, final Procedure1<NumericMode> initializer) {
		final NumericMode obj = AmaltheaFactory.eINSTANCE.createNumericMode();
		container.getModes().add(obj);
		initializer.apply(obj);
	}

	public void modeLabel(final SWModel container, final Procedure1<ModeLabel> initializer) {
		final ModeLabel obj = AmaltheaFactory.eINSTANCE.createModeLabel();
		container.getModeLabels().add(obj);
		initializer.apply(obj);
	}
	
	public void osEvent(final SWModel container, final Procedure1<OsEvent> initializer) {
		final OsEvent obj = AmaltheaFactory.eINSTANCE.createOsEvent();
		container.getEvents().add(obj);
		initializer.apply(obj);
	}

	// ********** Mode Literals **********

	public void literal(final EnumMode container, final Procedure1<ModeLiteral> initializer) {
		final ModeLiteral obj = AmaltheaFactory.eINSTANCE.createModeLiteral();
		container.getLiterals().add(obj);
		initializer.apply(obj);
	}

	// ********** Call Graph **********
	
	public void callGraph(final Task container, final Procedure1<CallGraph> initializer) {
		final CallGraph obj = AmaltheaFactory.eINSTANCE.createCallGraph();
		container.setCallGraph(obj);
		initializer.apply(obj);
	}
	
	public void callGraph(final Runnable container, final Procedure1<CallGraph> initializer) {
		final CallGraph obj = AmaltheaFactory.eINSTANCE.createCallGraph();
		container.setCallGraph(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - ModeSwitch **********

	public void modeSwitch(final ICallGraphItemContainer container, final Procedure1<ModeSwitch> initializer) {
		final ModeSwitch obj = AmaltheaFactory.eINSTANCE.createModeSwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void entry(final ModeSwitch container, final Procedure1<ModeSwitchEntry> initializer) {
		final ModeSwitchEntry obj = AmaltheaFactory.eINSTANCE.createModeSwitchEntry();
		container.getEntries().add(obj);
		initializer.apply(obj);
	}

	public void defaultEntry(final ModeSwitch container, final Procedure1<ModeSwitchDefault> initializer) {
		final ModeSwitchDefault obj = AmaltheaFactory.eINSTANCE.createModeSwitchDefault();
		container.setDefaultEntry(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - ProbabilitySwitch **********

	public void probabilitySwitch(final ICallGraphItemContainer container, final Procedure1<ProbabilitySwitch> initializer) {
		final ProbabilitySwitch obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void entry(final ProbabilitySwitch container, final Procedure1<ProbabilitySwitchEntry> initializer) {
		final ProbabilitySwitchEntry obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry();
		container.getEntries().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - SchedulePoint **********

	public void schedulePoint(final ICallGraphItemContainer container, final Procedure1<SchedulePoint> initializer) {
		final SchedulePoint obj = AmaltheaFactory.eINSTANCE.createSchedulePoint();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - InterProcessTrigger **********

	public void interProcessTrigger(final ICallGraphItemContainer container, final Procedure1<InterProcessTrigger> initializer) {
		final InterProcessTrigger obj = AmaltheaFactory.eINSTANCE.createInterProcessTrigger();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - EnforcedMigration **********

	public void enforcedMigration(final ICallGraphItemContainer container, final Procedure1<EnforcedMigration> initializer) {
		final EnforcedMigration obj = AmaltheaFactory.eINSTANCE.createEnforcedMigration();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - TerminateProcess **********

	public void terminateProcess(final ICallGraphItemContainer container, final Procedure1<TerminateProcess> initializer) {
		final TerminateProcess obj = AmaltheaFactory.eINSTANCE.createTerminateProcess();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - OS events **********

	public void clearEvent(final ICallGraphItemContainer container, final Procedure1<ClearEvent> initializer) {
		final ClearEvent obj = AmaltheaFactory.eINSTANCE.createClearEvent();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void waitEvent(final ICallGraphItemContainer container, final Procedure1<WaitEvent> initializer) {
		final WaitEvent obj = AmaltheaFactory.eINSTANCE.createWaitEvent();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void setEvent(final ICallGraphItemContainer container, final Procedure1<SetEvent> initializer) {
		final SetEvent obj = AmaltheaFactory.eINSTANCE.createSetEvent();
		container.getItems().add(obj);
		initializer.apply(obj);
	}
	
	public void eventMask(final ClearEvent clearEvent, final OsEvent...osEvents) {
		final EventMask eventMask = AmaltheaFactory.eINSTANCE.createEventMask();
		for(OsEvent osEvent:osEvents) {
			if (osEvent != null) {
				eventMask.getEvents().add(osEvent);
			}
		}
		clearEvent.setEventMask(eventMask);
	}
	
	public void eventMask(final WaitEvent waitEvent, final OsEvent...osEvents) {
		final EventMask eventMask = AmaltheaFactory.eINSTANCE.createEventMask();
		for(OsEvent osEvent:osEvents) {
			if (osEvent != null) {
				eventMask.getEvents().add(osEvent);
			}
		}
		waitEvent.setEventMask(eventMask);
	}
	
	public void eventMask(final SetEvent setEvent, final OsEvent...osEvents) {
		final EventMask eventMask = AmaltheaFactory.eINSTANCE.createEventMask();
		for(OsEvent osEvent:osEvents) {
			if (osEvent != null) {
				eventMask.getEvents().add(osEvent);
			}
		}
		setEvent.setEventMask(eventMask);
	}

	// ********** Runnable Parameters **********

	public void parameter(final Runnable container, final Procedure1<RunnableParameter> initializer) {
		final RunnableParameter obj = AmaltheaFactory.eINSTANCE.createRunnableParameter();
		container.getParameters().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - Group **********

	public void group(final ICallGraphItemContainer container, final Procedure1<Group> initializer) {
		final Group obj = AmaltheaFactory.eINSTANCE.createGroup();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - LabelAccess **********

	public void labelAccess(final ICallGraphItemContainer container, final Procedure1<LabelAccess> initializer) {
		final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
		container.getItems().add(obj);
		initializer.apply(obj);
	}
	
	public void modeLabelAccess(final ICallGraphItemContainer container, final Procedure1<ModeLabelAccess> initializer) {
		final ModeLabelAccess obj = AmaltheaFactory.eINSTANCE.createModeLabelAccess();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - RunnableCall **********

	public void runnableCall(final ICallGraphItemContainer container, final Procedure1<RunnableCall> initializer) {
		final RunnableCall obj = AmaltheaFactory.eINSTANCE.createRunnableCall();
		container.getItems().add(obj);
		initializer.apply(obj);
	}
	
	// ********** ICallGraphItemContainer - Items - ServerCall **********
	
	public void asynchronousServerCall(final ICallGraphItemContainer container, final Procedure1<AsynchronousServerCall> initializer) {
		final AsynchronousServerCall obj = AmaltheaFactory.eINSTANCE.createAsynchronousServerCall();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	// ********** ICallGraphItemContainer - Items - ExecutionNeed **********

	public void execNeed(final ICallGraphItemContainer container, final Procedure1<ExecutionNeed> initializer) {
		final ExecutionNeed obj = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		container.getItems().add(obj);
		initializer.apply(obj);
	}

	public void need(final ExecutionNeed container, final String key, final IDiscreteValueDeviation need) {
		container.getNeeds().put(key, need);
	}
	
	// ********** ICallGraphItemContainer - Items - Ticks **********

	public void ticks(final ICallGraphItemContainer container, final Procedure1<Ticks> initializer) {
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
	
	// ********** ICallGraphItemContainer - Items - to be extended **********

}
