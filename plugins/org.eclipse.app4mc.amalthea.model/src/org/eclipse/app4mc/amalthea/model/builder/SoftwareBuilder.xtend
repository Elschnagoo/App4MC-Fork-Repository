/**
 ********************************************************************************
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
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.CallSequence
import org.eclipse.app4mc.amalthea.model.Channel
import org.eclipse.app4mc.amalthea.model.ClearEvent
import org.eclipse.app4mc.amalthea.model.CustomActivation
import org.eclipse.app4mc.amalthea.model.EnforcedMigration
import org.eclipse.app4mc.amalthea.model.EventActivation
import org.eclipse.app4mc.amalthea.model.ExecutionNeed
import org.eclipse.app4mc.amalthea.model.GraphEntryBase
import org.eclipse.app4mc.amalthea.model.Group
import org.eclipse.app4mc.amalthea.model.ISR
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.LabelAccess
import org.eclipse.app4mc.amalthea.model.Mode
import org.eclipse.app4mc.amalthea.model.ModeLabel
import org.eclipse.app4mc.amalthea.model.ModeLiteral
import org.eclipse.app4mc.amalthea.model.ModeSwitch
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
import org.eclipse.app4mc.amalthea.model.Need
import org.eclipse.app4mc.amalthea.model.PeriodicActivation
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry
import org.eclipse.app4mc.amalthea.model.ProcessPrototype
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.RunnableCall
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch
import org.eclipse.app4mc.amalthea.model.RunnableParameter
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch
import org.eclipse.app4mc.amalthea.model.SWModel
import org.eclipse.app4mc.amalthea.model.SchedulePoint
import org.eclipse.app4mc.amalthea.model.Section
import org.eclipse.app4mc.amalthea.model.SetEvent
import org.eclipse.app4mc.amalthea.model.SingleActivation
import org.eclipse.app4mc.amalthea.model.SporadicActivation
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall
import org.eclipse.app4mc.amalthea.model.TerminateProcess
import org.eclipse.app4mc.amalthea.model.VariableRateActivation
import org.eclipse.app4mc.amalthea.model.WaitEvent
import org.eclipse.emf.common.util.BasicEMap

class SoftwareBuilder {

	def softwareModelRoot( (SWModel)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createSWModel.init(initializer)
	}

	// ********** Top level elements **********

	def isr(SWModel container, (ISR)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createISR
		container.isrs += obj
		obj.init(initializer)
	}

	def task(SWModel container, (Task)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createTask
		container.tasks += obj
		obj.init(initializer)
	}

	def runnable(SWModel container, (Runnable)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnable
		container.runnables += obj
		obj.init(initializer)
	}

	def label(SWModel container, (Label)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createLabel
		container.labels += obj
		obj.init(initializer)
	}

	def channel(SWModel container, (Channel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createChannel
		container.channels += obj
		obj.init(initializer)
	}

	def processPrototype(SWModel container, (ProcessPrototype)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProcessPrototype
		container.processPrototypes += obj
		obj.init(initializer)
	}

	def section(SWModel container, (Section)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSection
		container.sections += obj
		obj.init(initializer)
	}

	def activation_Single(SWModel container, (SingleActivation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSingleActivation
		container.activations += obj
		obj.init(initializer)
	}

	def activation_Sporadic(SWModel container, (SporadicActivation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSporadicActivation
		container.activations += obj
		obj.init(initializer)
	}

	def activation_Periodic(SWModel container, (PeriodicActivation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createPeriodicActivation
		container.activations += obj
		obj.init(initializer)
	}

	def activation_Event(SWModel container, (EventActivation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createEventActivation
		container.activations += obj
		obj.init(initializer)
	}

	def activation_VariableRate(SWModel container, (VariableRateActivation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createVariableRateActivation
		container.activations += obj
		obj.init(initializer)
	}

	def activation_Custom(SWModel container, (CustomActivation)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCustomActivation
		container.activations += obj
		obj.init(initializer)
	}

	def mode(SWModel container, (Mode)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createMode
		container.modes += obj
		obj.init(initializer)
	}

	def modeLabel(SWModel container, (ModeLabel)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeLabel
		container.modeLabels += obj
		obj.init(initializer)
	}

	// ********** Mode Literals **********

	def literal(Mode container, (ModeLiteral)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeLiteral
		container.literals += obj
		obj.init(initializer)
	}

	// ********** Task - Container - Call Sequence **********

	def callSequence(Task container, (CallSequence)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCallSequence
		if (container.callGraph === null) container.callGraph = AmaltheaFactory.eINSTANCE.createCallGraph
		container.callGraph.graphEntries += obj
		obj.init(initializer)
	}

	def callSequence(ModeSwitchDefault<GraphEntryBase> container, (CallSequence)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCallSequence
		container.items += obj
		obj.init(initializer)
	}

	def callSequence(ModeSwitchEntry<GraphEntryBase> container, (CallSequence)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCallSequence
		container.items += obj
		obj.init(initializer)
	}

	def callSequence(ProbabilitySwitchEntry<GraphEntryBase> container, (CallSequence)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createCallSequence
		container.items += obj
		obj.init(initializer)
	}

	// ********** Task - Container - ModeSwitch **********

	def modeSwitch(Task container, (ModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeSwitch
		if (container.callGraph === null) container.callGraph = AmaltheaFactory.eINSTANCE.createCallGraph
		container.callGraph.graphEntries += obj
		obj.init(initializer)
	}

	def modeSwitch(ModeSwitchDefault<GraphEntryBase> container, (ModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeSwitch
		container.items += obj
		obj.init(initializer)
	}

	def modeSwitch(ModeSwitchEntry<GraphEntryBase> container, (ModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeSwitch
		container.items += obj
		obj.init(initializer)
	}

	def modeSwitch(ProbabilitySwitchEntry<GraphEntryBase> container, (ModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeSwitch
		container.items += obj
		obj.init(initializer)
	}

	def entry(ModeSwitch container, (ModeSwitchEntry<GraphEntryBase>)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeSwitchEntry
		container.entries += obj
		obj.init(initializer)
	}

	def defaultEntry(ModeSwitch container, (ModeSwitchDefault<GraphEntryBase>)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeSwitchDefault
		container.defaultEntry = obj
		obj.init(initializer)
	}

	// ********** Task - Container - ProbabilitySwitch **********

	def probabilitySwitch(Task container, (ProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch
		if (container.callGraph === null) container.callGraph = AmaltheaFactory.eINSTANCE.createCallGraph
		container.callGraph.graphEntries += obj
		obj.init(initializer)
	}

	def probabilitySwitch(ModeSwitchDefault<GraphEntryBase> container, (ProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch
		container.items += obj
		obj.init(initializer)
	}

	def probabilitySwitch(ModeSwitchEntry<GraphEntryBase> container, (ProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch
		container.items += obj
		obj.init(initializer)
	}

	def probabilitySwitch(ProbabilitySwitchEntry<GraphEntryBase> container, (ProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitch
		container.items += obj
		obj.init(initializer)
	}

	def entry(ProbabilitySwitch container, (ProbabilitySwitchEntry<GraphEntryBase>)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry
		container.entries += obj
		obj.init(initializer)
	}

	// ********** Call Sequence Items **********

	def runnableCall(CallSequence container, (TaskRunnableCall)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createTaskRunnableCall
		container.calls += obj
		obj.init(initializer)
	}

	def schedulePoint(CallSequence container, (SchedulePoint)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSchedulePoint
		container.calls += obj
		obj.init(initializer)
	}

	def interProcessTrigger(CallSequence container, (InterProcessTrigger)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createInterProcessTrigger
		container.calls += obj
		obj.init(initializer)
	}

	def enforcedMigration(CallSequence container, (EnforcedMigration)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createEnforcedMigration
		container.calls += obj
		obj.init(initializer)
	}

	def terminateProcess(CallSequence container, (TerminateProcess)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createTerminateProcess
		container.calls += obj
		obj.init(initializer)
	}
	def clearEvent(CallSequence container, (ClearEvent)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createClearEvent
		container.calls += obj
		obj.init(initializer)
	}

	def waitEvent(CallSequence container, (WaitEvent)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createWaitEvent
		container.calls += obj
		obj.init(initializer)
	}

	def setEvent(CallSequence container, (SetEvent)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createSetEvent
		container.calls += obj
		obj.init(initializer)
	}

	// ********** Runnable Parameters **********

	def parameter(Runnable container, (RunnableParameter)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableParameter
		container.parameters += obj
		obj.init(initializer)
	}

	// ********** Runnable Items - Container - Group **********

	def group(Runnable container, (Group)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createGroup
		container.runnableItems += obj
		obj.init(initializer)
	}

	def group(Group container, (Group)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createGroup
		container.items += obj
		obj.init(initializer)
	}

	def group(ModeSwitchDefault<RunnableItem> container, (Group)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createGroup
		container.items += obj
		obj.init(initializer)
	}

	def group(ModeSwitchEntry<RunnableItem> container, (Group)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createGroup
		container.items += obj
		obj.init(initializer)
	}

	def group(ProbabilitySwitchEntry<RunnableItem> container, (Group)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createGroup
		container.items += obj
		obj.init(initializer)
	}

	// ********** Runnable Items - Container - RunnableModeSwitch **********

	def runModeSwitch(Runnable container, (RunnableModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch
		container.runnableItems += obj
		obj.init(initializer)
	}

	def runModeSwitch(Group container, (RunnableModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch
		container.items += obj
		obj.init(initializer)
	}

	def runModeSwitch(ModeSwitchDefault<RunnableItem> container, (RunnableModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch
		container.items += obj
		obj.init(initializer)
	}

	def runModeSwitch(ModeSwitchEntry<RunnableItem> container, (RunnableModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch
		container.items += obj
		obj.init(initializer)
	}

	def runModeSwitch(ProbabilitySwitchEntry<RunnableItem> container, (RunnableModeSwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableModeSwitch
		container.items += obj
		obj.init(initializer)
	}

	def entry(RunnableModeSwitch container, (ModeSwitchEntry<RunnableItem>)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeSwitchEntry
		container.entries += obj
		obj.init(initializer)
	}

	def defaultEntry(RunnableModeSwitch container, (ModeSwitchDefault<RunnableItem>)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createModeSwitchDefault
		container.defaultEntry = obj
		obj.init(initializer)
	}

	// ********** Runnable Items - Container - RunnableProbabilitySwitch **********

	def runProbabilitySwitch(Runnable container, (RunnableProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch
		container.runnableItems += obj
		obj.init(initializer)
	}

	def runProbabilitySwitch(Group container, (RunnableProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch
		container.items += obj
		obj.init(initializer)
	}

	def runProbabilitySwitch(ModeSwitchDefault<RunnableItem> container, (RunnableProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch
		container.items += obj
		obj.init(initializer)
	}

	def runProbabilitySwitch(ModeSwitchEntry<RunnableItem> container, (RunnableProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch
		container.items += obj
		obj.init(initializer)
	}

	def runProbabilitySwitch(ProbabilitySwitchEntry<RunnableItem> container, (RunnableProbabilitySwitch)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch
		container.items += obj
		obj.init(initializer)
	}

	def entry(RunnableProbabilitySwitch container, (ProbabilitySwitchEntry<RunnableItem>)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry
		container.entries += obj
		obj.init(initializer)
	}

	// ********** Runnable Items - Label access **********

	def labelAccess(Runnable container, (LabelAccess)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createLabelAccess
		container.runnableItems += obj
		obj.init(initializer)
	}

	def labelAccess(Group container, (LabelAccess)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createLabelAccess
		container.items += obj
		obj.init(initializer)
	}

	def labelAccess(ModeSwitchDefault<RunnableItem> container, (LabelAccess)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createLabelAccess
		container.items += obj
		obj.init(initializer)
	}

	def labelAccess(ModeSwitchEntry<RunnableItem> container, (LabelAccess)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createLabelAccess
		container.items += obj
		obj.init(initializer)
	}

	def labelAccess(ProbabilitySwitchEntry<RunnableItem> container, (LabelAccess)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createLabelAccess
		container.items += obj
		obj.init(initializer)
	}

	// ********** Runnable Items - Runnable call **********

	def runnableCall(Runnable container, (RunnableCall)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableCall
		container.runnableItems += obj
		obj.init(initializer)
	}

	def runnableCall(Group container, (RunnableCall)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableCall
		container.items += obj
		obj.init(initializer)
	}

	def runnableCall(ModeSwitchDefault<RunnableItem> container, (RunnableCall)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableCall
		container.items += obj
		obj.init(initializer)
	}

	def runnableCall(ModeSwitchEntry<RunnableItem> container, (RunnableCall)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableCall
		container.items += obj
		obj.init(initializer)
	}

	def runnableCall(ProbabilitySwitchEntry<RunnableItem> container, (RunnableCall)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createRunnableCall
		container.items += obj
		obj.init(initializer)
	}

	// ********** Runnable Items - Execution need **********

	def execNeed(Runnable container, (ExecutionNeed)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createExecutionNeed
		container.runnableItems += obj
		obj.init(initializer)
	}

	def execNeed(Group container, (ExecutionNeed)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createExecutionNeed
		container.items += obj
		obj.init(initializer)
	}

	def execNeed(ModeSwitchDefault<RunnableItem> container, (ExecutionNeed)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createExecutionNeed
		container.items += obj
		obj.init(initializer)
	}

	def execNeed(ModeSwitchEntry<RunnableItem> container, (ExecutionNeed)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createExecutionNeed
		container.items += obj
		obj.init(initializer)
	}

	def execNeed(ProbabilitySwitchEntry<RunnableItem> container, (ExecutionNeed)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createExecutionNeed
		container.items += obj
		obj.init(initializer)
	}
	
	def default_Need(ExecutionNeed container, String key, Need need) {
		container.^default.put(key, need)
	}

	def extended_Need(ExecutionNeed container, ProcessingUnitDefinition puDef, String key, Need need) {
		if (container.extended.containsKey(puDef) == false) {
			container.extended.put(puDef, new BasicEMap<String, Need>());
		}
		container.extended.get(puDef).put(key, need)
	}

	// ********** Runnable Items - to be extended **********



	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}
	
}