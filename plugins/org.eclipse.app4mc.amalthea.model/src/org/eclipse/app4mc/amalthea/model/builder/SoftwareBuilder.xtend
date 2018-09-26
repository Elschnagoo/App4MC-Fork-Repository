package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.Channel
import org.eclipse.app4mc.amalthea.model.CustomActivation
import org.eclipse.app4mc.amalthea.model.EventActivation
import org.eclipse.app4mc.amalthea.model.Group
import org.eclipse.app4mc.amalthea.model.ISR
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.LabelAccess
import org.eclipse.app4mc.amalthea.model.Mode
import org.eclipse.app4mc.amalthea.model.ModeLabel
import org.eclipse.app4mc.amalthea.model.ModeLiteral
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
import org.eclipse.app4mc.amalthea.model.PeriodicActivation
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry
import org.eclipse.app4mc.amalthea.model.ProcessPrototype
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.RunnableCall
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch
import org.eclipse.app4mc.amalthea.model.RunnableParameter
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch
import org.eclipse.app4mc.amalthea.model.SWModel
import org.eclipse.app4mc.amalthea.model.Section
import org.eclipse.app4mc.amalthea.model.SingleActivation
import org.eclipse.app4mc.amalthea.model.SporadicActivation
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.VariableRateActivation

class SoftwareBuilder {

	def softwareModelRoot( (SWModel)=>void initializer) {
		AmaltheaFactory.eINSTANCE.createSWModel.init(initializer)
	}

	// ********** Top level elements **********

	def isr(SWModel container, (ISR)=>void initializer) {
		container.isrs += AmaltheaFactory.eINSTANCE.createISR.init(initializer)
	}

	def task(SWModel container, (Task)=>void initializer) {
		container.tasks += AmaltheaFactory.eINSTANCE.createTask.init(initializer)
	}

	def runnable(SWModel container, (Runnable)=>void initializer) {
		container.runnables += AmaltheaFactory.eINSTANCE.createRunnable.init(initializer)
	}

	def label(SWModel container, (Label)=>void initializer) {
		container.labels += AmaltheaFactory.eINSTANCE.createLabel.init(initializer)
	}

	def channel(SWModel container, (Channel)=>void initializer) {
		container.channels += AmaltheaFactory.eINSTANCE.createChannel.init(initializer)
	}

	def processPrototype(SWModel container, (ProcessPrototype)=>void initializer) {
		container.processPrototypes += AmaltheaFactory.eINSTANCE.createProcessPrototype.init(initializer)
	}

	def section(SWModel container, (Section)=>void initializer) {
		container.sections += AmaltheaFactory.eINSTANCE.createSection.init(initializer)
	}

	def activation_Single(SWModel container, (SingleActivation)=>void initializer) {
		container.activations += AmaltheaFactory.eINSTANCE.createSingleActivation.init(initializer)
	}

	def activation_Sporadic(SWModel container, (SporadicActivation)=>void initializer) {
		container.activations += AmaltheaFactory.eINSTANCE.createSporadicActivation.init(initializer)
	}

	def activation_Periodic(SWModel container, (PeriodicActivation)=>void initializer) {
		container.activations += AmaltheaFactory.eINSTANCE.createPeriodicActivation.init(initializer)
	}

	def activation_Event(SWModel container, (EventActivation)=>void initializer) {
		container.activations += AmaltheaFactory.eINSTANCE.createEventActivation.init(initializer)
	}

	def activation_VariableRate(SWModel container, (VariableRateActivation)=>void initializer) {
		container.activations += AmaltheaFactory.eINSTANCE.createVariableRateActivation.init(initializer)
	}

	def activation_Custom(SWModel container, (CustomActivation)=>void initializer) {
		container.activations += AmaltheaFactory.eINSTANCE.createCustomActivation.init(initializer)
	}

	def mode(SWModel container, (Mode)=>void initializer) {
		container.modes += AmaltheaFactory.eINSTANCE.createMode.init(initializer)
	}

	def modeLabel(SWModel container, (ModeLabel)=>void initializer) {
		container.modeLabels += AmaltheaFactory.eINSTANCE.createModeLabel.init(initializer)
	}

	// ********** Mode Literals **********

	def literal(Mode container, (ModeLiteral)=>void initializer) {
		container.literals += AmaltheaFactory.eINSTANCE.createModeLiteral.init(initializer)
	}

	// ********** Runnable Parameters **********

	def parameter(Runnable container, (RunnableParameter)=>void initializer) {
		container.parameters += AmaltheaFactory.eINSTANCE.createRunnableParameter.init(initializer)
	}

	// ********** Runnable Items - Container - Group **********

	def group(Runnable container, (Group)=>void initializer) {
		container.runnableItems += AmaltheaFactory.eINSTANCE.createGroup.init(initializer)
	}

	def group(Group container, (Group)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createGroup.init(initializer)
	}

	def group(ModeSwitchDefault<RunnableItem> container, (Group)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createGroup.init(initializer)
	}

	def group(ModeSwitchEntry<RunnableItem> container, (Group)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createGroup.init(initializer)
	}

	def group(ProbabilitySwitchEntry<RunnableItem> container, (Group)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createGroup.init(initializer)
	}

	// ********** Runnable Items - Container - RunnableModeSwitch **********

	def modeSwitch(Runnable container, (RunnableModeSwitch)=>void initializer) {
		container.runnableItems += AmaltheaFactory.eINSTANCE.createRunnableModeSwitch.init(initializer)
	}

	def modeSwitch(Group container, (RunnableModeSwitch)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableModeSwitch.init(initializer)
	}

	def modeSwitch(ModeSwitchDefault<RunnableItem> container, (RunnableModeSwitch)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableModeSwitch.init(initializer)
	}

	def modeSwitch(ModeSwitchEntry<RunnableItem> container, (RunnableModeSwitch)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableModeSwitch.init(initializer)
	}

	def modeSwitch(ProbabilitySwitchEntry<RunnableItem> container, (RunnableModeSwitch)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableModeSwitch.init(initializer)
	}

	def entry(RunnableModeSwitch container, (ModeSwitchEntry<RunnableItem>)=>void initializer) {
		container.entries += AmaltheaFactory.eINSTANCE.createModeSwitchEntry.init(initializer)
	}

	def defaultEntry(RunnableModeSwitch container, (ModeSwitchDefault<RunnableItem>)=>void initializer) {
		container.defaultEntry = AmaltheaFactory.eINSTANCE.createModeSwitchDefault.init(initializer)
	}

	// ********** Runnable Items - Container - RunnableProbabilitySwitch **********

	def probabilitySwitch(Runnable container, (RunnableProbabilitySwitch)=>void initializer) {
		container.runnableItems += AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch.init(initializer)
	}

	def probabilitySwitch(Group container, (RunnableProbabilitySwitch)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch.init(initializer)
	}

	def probabilitySwitch(ModeSwitchDefault<RunnableItem> container, (RunnableProbabilitySwitch)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch.init(initializer)
	}

	def probabilitySwitch(ModeSwitchEntry<RunnableItem> container, (RunnableProbabilitySwitch)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch.init(initializer)
	}

	def probabilitySwitch(ProbabilitySwitchEntry<RunnableItem> container, (RunnableProbabilitySwitch)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch.init(initializer)
	}

	def entry(RunnableProbabilitySwitch container, (ProbabilitySwitchEntry<RunnableItem>)=>void initializer) {
		container.entries += AmaltheaFactory.eINSTANCE.createProbabilitySwitchEntry.init(initializer)
	}

	// ********** Runnable Items - Label access **********

	def labelAccess(Runnable container, (LabelAccess)=>void initializer) {
		container.runnableItems += AmaltheaFactory.eINSTANCE.createLabelAccess.init(initializer)
	}

	def labelAccess(Group container, (LabelAccess)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createLabelAccess.init(initializer)
	}

	def labelAccess(ModeSwitchDefault<RunnableItem> container, (LabelAccess)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createLabelAccess.init(initializer)
	}

	def labelAccess(ModeSwitchEntry<RunnableItem> container, (LabelAccess)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createLabelAccess.init(initializer)
	}

	def labelAccess(ProbabilitySwitchEntry<RunnableItem> container, (LabelAccess)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createLabelAccess.init(initializer)
	}

	// ********** Runnable Items - Runnable call **********

	def runnableCall(Runnable container, (RunnableCall)=>void initializer) {
		container.runnableItems += AmaltheaFactory.eINSTANCE.createRunnableCall.init(initializer)
	}

	def runnableCall(Group container, (RunnableCall)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableCall.init(initializer)
	}

	def runnableCall(ModeSwitchDefault<RunnableItem> container, (RunnableCall)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableCall.init(initializer)
	}

	def runnableCall(ModeSwitchEntry<RunnableItem> container, (RunnableCall)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableCall.init(initializer)
	}

	def runnableCall(ProbabilitySwitchEntry<RunnableItem> container, (RunnableCall)=>void initializer) {
		container.items += AmaltheaFactory.eINSTANCE.createRunnableCall.init(initializer)
	}

	// ********** Runnable Items - TODO **********



	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}
	
}