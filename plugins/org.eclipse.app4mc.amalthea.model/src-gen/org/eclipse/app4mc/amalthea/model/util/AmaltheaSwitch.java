/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.util;

import java.util.Map;

import org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint;
import org.eclipse.app4mc.amalthea.model.AbstractEventChain;
import org.eclipse.app4mc.amalthea.model.AbstractMemoryElement;
import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.AbstractionType;
import org.eclipse.app4mc.amalthea.model.AccessPath;
import org.eclipse.app4mc.amalthea.model.AccessPathRef;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AffinityConstraint;
import org.eclipse.app4mc.amalthea.model.Algorithm;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ArchitectureRequirement;
import org.eclipse.app4mc.amalthea.model.Array;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition;
import org.eclipse.app4mc.amalthea.model.BetaDistribution;
import org.eclipse.app4mc.amalthea.model.BigIntegerObject;
import org.eclipse.app4mc.amalthea.model.BooleanObject;
import org.eclipse.app4mc.amalthea.model.Boundaries;
import org.eclipse.app4mc.amalthea.model.Bridge;
import org.eclipse.app4mc.amalthea.model.Bus;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.ChannelAccess;
import org.eclipse.app4mc.amalthea.model.ChannelEvent;
import org.eclipse.app4mc.amalthea.model.ChannelReceive;
import org.eclipse.app4mc.amalthea.model.ChannelSend;
import org.eclipse.app4mc.amalthea.model.Classification;
import org.eclipse.app4mc.amalthea.model.Classifier;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.Clock;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierList;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry;
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.ComplexPin;
import org.eclipse.app4mc.amalthea.model.ComplexPort;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.ComponentScope;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.Composite;
import org.eclipse.app4mc.amalthea.model.CompoundType;
import org.eclipse.app4mc.amalthea.model.ComputationItem;
import org.eclipse.app4mc.amalthea.model.ConfigModel;
import org.eclipse.app4mc.amalthea.model.Connector;
import org.eclipse.app4mc.amalthea.model.ConstantBandwidthServer;
import org.eclipse.app4mc.amalthea.model.ConstantBandwidthServerWithCASH;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.CoreClassification;
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.CrossbarSwitch;
import org.eclipse.app4mc.amalthea.model.CustomActivation;
import org.eclipse.app4mc.amalthea.model.CustomEntity;
import org.eclipse.app4mc.amalthea.model.CustomEvent;
import org.eclipse.app4mc.amalthea.model.CustomStimulus;
import org.eclipse.app4mc.amalthea.model.DataAge;
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint;
import org.eclipse.app4mc.amalthea.model.DataAgeCycle;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.DataCoherencyGroup;
import org.eclipse.app4mc.amalthea.model.DataConstraint;
import org.eclipse.app4mc.amalthea.model.DataConstraintTarget;
import org.eclipse.app4mc.amalthea.model.DataGroupScope;
import org.eclipse.app4mc.amalthea.model.DataPairingConstraint;
import org.eclipse.app4mc.amalthea.model.DataPlatformMapping;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataStability;
import org.eclipse.app4mc.amalthea.model.DataStabilityGroup;
import org.eclipse.app4mc.amalthea.model.DataType;
import org.eclipse.app4mc.amalthea.model.DataTypeDefinition;
import org.eclipse.app4mc.amalthea.model.DeadlineMonotonic;
import org.eclipse.app4mc.amalthea.model.DeferrableServer;
import org.eclipse.app4mc.amalthea.model.DelayConstraint;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Distribution;
import org.eclipse.app4mc.amalthea.model.DoubleObject;
import org.eclipse.app4mc.amalthea.model.DynamicPriority;
import org.eclipse.app4mc.amalthea.model.ECU;
import org.eclipse.app4mc.amalthea.model.ECUType;
import org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst;
import org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EntityEvent;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventActivation;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainContainer;
import org.eclipse.app4mc.amalthea.model.EventChainItem;
import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint;
import org.eclipse.app4mc.amalthea.model.EventChainReference;
import org.eclipse.app4mc.amalthea.model.EventChainSynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.EventConfig;
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.EventSet;
import org.eclipse.app4mc.amalthea.model.EventStimulus;
import org.eclipse.app4mc.amalthea.model.EventSynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.FInterfacePort;
import org.eclipse.app4mc.amalthea.model.FixedPriority;
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptive;
import org.eclipse.app4mc.amalthea.model.FloatObject;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.GeneralPrecedence;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.Grouping;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HardwareTypeDescription;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwAccessPathElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPathRef;
import org.eclipse.app4mc.amalthea.model.HwComponent;
import org.eclipse.app4mc.amalthea.model.HwElementRef;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwSystem;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.IDisplayName;
import org.eclipse.app4mc.amalthea.model.INamedElement;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.ISystem;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.InstructionFetch;
import org.eclipse.app4mc.amalthea.model.Instructions;
import org.eclipse.app4mc.amalthea.model.InstructionsConstant;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.IntegerObject;
import org.eclipse.app4mc.amalthea.model.InterProcessStimulus;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.LabelEntityGroup;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.LabelGroup;
import org.eclipse.app4mc.amalthea.model.Latency;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPath;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement;
import org.eclipse.app4mc.amalthea.model.LatencyConstant;
import org.eclipse.app4mc.amalthea.model.LatencyDeviation;
import org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst;
import org.eclipse.app4mc.amalthea.model.ListObject;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryClassification;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint;
import org.eclipse.app4mc.amalthea.model.MemoryType;
import org.eclipse.app4mc.amalthea.model.Microcontroller;
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType;
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.ModeValue;
import org.eclipse.app4mc.amalthea.model.ModeValueConjunction;
import org.eclipse.app4mc.amalthea.model.ModeValueDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeValueList;
import org.eclipse.app4mc.amalthea.model.ModeValueListEntry;
import org.eclipse.app4mc.amalthea.model.Network;
import org.eclipse.app4mc.amalthea.model.NetworkType;
import org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency;
import org.eclipse.app4mc.amalthea.model.NumericStatistic;
import org.eclipse.app4mc.amalthea.model.OSEK;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.OsISRInstructions;
import org.eclipse.app4mc.amalthea.model.OsInstructions;
import org.eclipse.app4mc.amalthea.model.PairingConstraint;
import org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.PartlyPFairPD2;
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.Pfair;
import org.eclipse.app4mc.amalthea.model.PfairPD2;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.Pin;
import org.eclipse.app4mc.amalthea.model.Pointer;
import org.eclipse.app4mc.amalthea.model.PollingPeriodicServer;
import org.eclipse.app4mc.amalthea.model.Port;
import org.eclipse.app4mc.amalthea.model.Prescaler;
import org.eclipse.app4mc.amalthea.model.PriorityBased;
import org.eclipse.app4mc.amalthea.model.PriorityBasedRoundRobin;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessChain;
import org.eclipse.app4mc.amalthea.model.ProcessChainEvent;
import org.eclipse.app4mc.amalthea.model.ProcessChainRequirement;
import org.eclipse.app4mc.amalthea.model.ProcessConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessConstraintTarget;
import org.eclipse.app4mc.amalthea.model.ProcessEntityGroup;
import org.eclipse.app4mc.amalthea.model.ProcessEvent;
import org.eclipse.app4mc.amalthea.model.ProcessGroup;
import org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.ProcessScope;
import org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.app4mc.amalthea.model.Quartz;
import org.eclipse.app4mc.amalthea.model.RateMonotonic;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;
import org.eclipse.app4mc.amalthea.model.ReferableObject;
import org.eclipse.app4mc.amalthea.model.ReferenceObject;
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.Requirement;
import org.eclipse.app4mc.amalthea.model.RequirementLimit;
import org.eclipse.app4mc.amalthea.model.ReservationBasedServer;
import org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableConstraintTarget;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableEvent;
import org.eclipse.app4mc.amalthea.model.RunnableGroup;
import org.eclipse.app4mc.amalthea.model.RunnableInstructions;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.RunnableRequirement;
import org.eclipse.app4mc.amalthea.model.RunnableScope;
import org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SchedulePoint;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.SchedulerAssociation;
import org.eclipse.app4mc.amalthea.model.SchedulingParameters;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess;
import org.eclipse.app4mc.amalthea.model.SemaphoreEvent;
import org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication;
import org.eclipse.app4mc.amalthea.model.SenderReceiverRead;
import org.eclipse.app4mc.amalthea.model.SenderReceiverWrite;
import org.eclipse.app4mc.amalthea.model.SeparationConstraint;
import org.eclipse.app4mc.amalthea.model.ServerCall;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.SingleStimulus;
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.SporadicServer;
import org.eclipse.app4mc.amalthea.model.SporadicStimulus;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.StimulusEvent;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.Struct;
import org.eclipse.app4mc.amalthea.model.StructEntry;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.model.SynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.SynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.SyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.SystemType;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.TagGroup;
import org.eclipse.app4mc.amalthea.model.TargetCore;
import org.eclipse.app4mc.amalthea.model.TargetMemory;
import org.eclipse.app4mc.amalthea.model.TargetScheduler;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.TerminateProcess;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeObject;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimestampList;
import org.eclipse.app4mc.amalthea.model.TimingConstraint;
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy;
import org.eclipse.app4mc.amalthea.model.TriggerEvent;
import org.eclipse.app4mc.amalthea.model.TypeDefinition;
import org.eclipse.app4mc.amalthea.model.TypeRef;
import org.eclipse.app4mc.amalthea.model.UniformDistribution;
import org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.VendorOperatingSystem;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.WeibullDistribution;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage
 * @generated
 */
public class AmaltheaSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmaltheaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmaltheaSwitch() {
		if (modelPackage == null) {
			modelPackage = AmaltheaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AmaltheaPackage.AMALTHEA: {
				Amalthea amalthea = (Amalthea)theEObject;
				T1 result = caseAmalthea(amalthea);
				if (result == null) result = caseBaseObject(amalthea);
				if (result == null) result = caseIAnnotatable(amalthea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMMON_ELEMENTS: {
				CommonElements commonElements = (CommonElements)theEObject;
				T1 result = caseCommonElements(commonElements);
				if (result == null) result = caseBaseObject(commonElements);
				if (result == null) result = caseIAnnotatable(commonElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BASE_OBJECT: {
				BaseObject baseObject = (BaseObject)theEObject;
				T1 result = caseBaseObject(baseObject);
				if (result == null) result = caseIAnnotatable(baseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REFERABLE_OBJECT: {
				ReferableObject referableObject = (ReferableObject)theEObject;
				T1 result = caseReferableObject(referableObject);
				if (result == null) result = caseIReferable(referableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REFERABLE_BASE_OBJECT: {
				ReferableBaseObject referableBaseObject = (ReferableBaseObject)theEObject;
				T1 result = caseReferableBaseObject(referableBaseObject);
				if (result == null) result = caseIAnnotatable(referableBaseObject);
				if (result == null) result = caseIReferable(referableBaseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.IANNOTATABLE: {
				IAnnotatable iAnnotatable = (IAnnotatable)theEObject;
				T1 result = caseIAnnotatable(iAnnotatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ITAGGABLE: {
				ITaggable iTaggable = (ITaggable)theEObject;
				T1 result = caseITaggable(iTaggable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.IREFERABLE: {
				IReferable iReferable = (IReferable)theEObject;
				T1 result = caseIReferable(iReferable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.IDISPLAY_NAME: {
				IDisplayName iDisplayName = (IDisplayName)theEObject;
				T1 result = caseIDisplayName(iDisplayName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T1 result = caseTag(tag);
				if (result == null) result = caseReferableBaseObject(tag);
				if (result == null) result = caseIAnnotatable(tag);
				if (result == null) result = caseIReferable(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T1 result = caseClassifier(classifier);
				if (result == null) result = caseReferableBaseObject(classifier);
				if (result == null) result = caseIAnnotatable(classifier);
				if (result == null) result = caseIReferable(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CORE_CLASSIFIER: {
				CoreClassifier coreClassifier = (CoreClassifier)theEObject;
				T1 result = caseCoreClassifier(coreClassifier);
				if (result == null) result = caseClassifier(coreClassifier);
				if (result == null) result = caseReferableBaseObject(coreClassifier);
				if (result == null) result = caseIAnnotatable(coreClassifier);
				if (result == null) result = caseIReferable(coreClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_CLASSIFIER: {
				MemoryClassifier memoryClassifier = (MemoryClassifier)theEObject;
				T1 result = caseMemoryClassifier(memoryClassifier);
				if (result == null) result = caseClassifier(memoryClassifier);
				if (result == null) result = caseReferableBaseObject(memoryClassifier);
				if (result == null) result = caseIAnnotatable(memoryClassifier);
				if (result == null) result = caseIReferable(memoryClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INSTRUCTIONS: {
				Instructions instructions = (Instructions)theEObject;
				T1 result = caseInstructions(instructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TRANSMISSION_POLICY: {
				TransmissionPolicy transmissionPolicy = (TransmissionPolicy)theEObject;
				T1 result = caseTransmissionPolicy(transmissionPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INSTRUCTIONS_DEVIATION: {
				InstructionsDeviation instructionsDeviation = (InstructionsDeviation)theEObject;
				T1 result = caseInstructionsDeviation(instructionsDeviation);
				if (result == null) result = caseInstructions(instructionsDeviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INSTRUCTIONS_CONSTANT: {
				InstructionsConstant instructionsConstant = (InstructionsConstant)theEObject;
				T1 result = caseInstructionsConstant(instructionsConstant);
				if (result == null) result = caseInstructions(instructionsConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_COMPARABLE: {
				@SuppressWarnings("unchecked") Comparable<AbstractTime> timeComparable = (Comparable<AbstractTime>)theEObject;
				T1 result = caseTimeComparable(timeComparable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_TIME: {
				AbstractTime abstractTime = (AbstractTime)theEObject;
				T1 result = caseAbstractTime(abstractTime);
				if (result == null) result = caseTimeComparable(abstractTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME: {
				Time time = (Time)theEObject;
				T1 result = caseTime(time);
				if (result == null) result = caseAbstractTime(time);
				if (result == null) result = caseTimeComparable(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FREQUENCY: {
				Frequency frequency = (Frequency)theEObject;
				T1 result = caseFrequency(frequency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_SIZE: {
				DataSize dataSize = (DataSize)theEObject;
				T1 result = caseDataSize(dataSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_RATE: {
				DataRate dataRate = (DataRate)theEObject;
				T1 result = caseDataRate(dataRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_PROPERTY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Value> customProperty = (Map.Entry<String, Value>)theEObject;
				T1 result = caseCustomProperty(customProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.VALUE: {
				Value value = (Value)theEObject;
				T1 result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LIST_OBJECT: {
				ListObject listObject = (ListObject)theEObject;
				T1 result = caseListObject(listObject);
				if (result == null) result = caseValue(listObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STRING_OBJECT: {
				StringObject stringObject = (StringObject)theEObject;
				T1 result = caseStringObject(stringObject);
				if (result == null) result = caseValue(stringObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BIG_INTEGER_OBJECT: {
				BigIntegerObject bigIntegerObject = (BigIntegerObject)theEObject;
				T1 result = caseBigIntegerObject(bigIntegerObject);
				if (result == null) result = caseValue(bigIntegerObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REFERENCE_OBJECT: {
				ReferenceObject referenceObject = (ReferenceObject)theEObject;
				T1 result = caseReferenceObject(referenceObject);
				if (result == null) result = caseValue(referenceObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTEGER_OBJECT: {
				IntegerObject integerObject = (IntegerObject)theEObject;
				T1 result = caseIntegerObject(integerObject);
				if (result == null) result = caseValue(integerObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LONG_OBJECT: {
				LongObject longObject = (LongObject)theEObject;
				T1 result = caseLongObject(longObject);
				if (result == null) result = caseValue(longObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FLOAT_OBJECT: {
				FloatObject floatObject = (FloatObject)theEObject;
				T1 result = caseFloatObject(floatObject);
				if (result == null) result = caseValue(floatObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DOUBLE_OBJECT: {
				DoubleObject doubleObject = (DoubleObject)theEObject;
				T1 result = caseDoubleObject(doubleObject);
				if (result == null) result = caseValue(doubleObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BOOLEAN_OBJECT: {
				BooleanObject booleanObject = (BooleanObject)theEObject;
				T1 result = caseBooleanObject(booleanObject);
				if (result == null) result = caseValue(booleanObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_OBJECT: {
				TimeObject timeObject = (TimeObject)theEObject;
				T1 result = caseTimeObject(timeObject);
				if (result == null) result = caseAbstractTime(timeObject);
				if (result == null) result = caseValue(timeObject);
				if (result == null) result = caseTimeComparable(timeObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DEVIATION: {
				Deviation<?> deviation = (Deviation<?>)theEObject;
				T1 result = caseDeviation(deviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISTRIBUTION: {
				Distribution<?> distribution = (Distribution<?>)theEObject;
				T1 result = caseDistribution(distribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.WEIBULL_DISTRIBUTION: {
				WeibullDistribution<?> weibullDistribution = (WeibullDistribution<?>)theEObject;
				T1 result = caseWeibullDistribution(weibullDistribution);
				if (result == null) result = caseDistribution(weibullDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.WEIBULL_PARAMETERS: {
				WeibullParameters<?> weibullParameters = (WeibullParameters<?>)theEObject;
				T1 result = caseWeibullParameters(weibullParameters);
				if (result == null) result = caseWeibullDistribution(weibullParameters);
				if (result == null) result = caseDistribution(weibullParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.WEIBULL_ESTIMATORS: {
				WeibullEstimators<?> weibullEstimators = (WeibullEstimators<?>)theEObject;
				T1 result = caseWeibullEstimators(weibullEstimators);
				if (result == null) result = caseWeibullDistribution(weibullEstimators);
				if (result == null) result = caseDistribution(weibullEstimators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.UNIFORM_DISTRIBUTION: {
				UniformDistribution<?> uniformDistribution = (UniformDistribution<?>)theEObject;
				T1 result = caseUniformDistribution(uniformDistribution);
				if (result == null) result = caseDistribution(uniformDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BOUNDARIES: {
				Boundaries<?> boundaries = (Boundaries<?>)theEObject;
				T1 result = caseBoundaries(boundaries);
				if (result == null) result = caseDistribution(boundaries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.GAUSS_DISTRIBUTION: {
				GaussDistribution<?> gaussDistribution = (GaussDistribution<?>)theEObject;
				T1 result = caseGaussDistribution(gaussDistribution);
				if (result == null) result = caseDistribution(gaussDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BETA_DISTRIBUTION: {
				BetaDistribution<?> betaDistribution = (BetaDistribution<?>)theEObject;
				T1 result = caseBetaDistribution(betaDistribution);
				if (result == null) result = caseDistribution(betaDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.NUMERIC_STATISTIC: {
				NumericStatistic numericStatistic = (NumericStatistic)theEObject;
				T1 result = caseNumericStatistic(numericStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MIN_AVG_MAX_STATISTIC: {
				MinAvgMaxStatistic minAvgMaxStatistic = (MinAvgMaxStatistic)theEObject;
				T1 result = caseMinAvgMaxStatistic(minAvgMaxStatistic);
				if (result == null) result = caseNumericStatistic(minAvgMaxStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SINGLE_VALUE_STATISTIC: {
				SingleValueStatistic singleValueStatistic = (SingleValueStatistic)theEObject;
				T1 result = caseSingleValueStatistic(singleValueStatistic);
				if (result == null) result = caseNumericStatistic(singleValueStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE: {
				Mode mode = (Mode)theEObject;
				T1 result = caseMode(mode);
				if (result == null) result = caseReferableBaseObject(mode);
				if (result == null) result = caseIAnnotatable(mode);
				if (result == null) result = caseIReferable(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_LITERAL: {
				ModeLiteral modeLiteral = (ModeLiteral)theEObject;
				T1 result = caseModeLiteral(modeLiteral);
				if (result == null) result = caseReferableBaseObject(modeLiteral);
				if (result == null) result = caseIAnnotatable(modeLiteral);
				if (result == null) result = caseIReferable(modeLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENTS_MODEL: {
				ComponentsModel componentsModel = (ComponentsModel)theEObject;
				T1 result = caseComponentsModel(componentsModel);
				if (result == null) result = caseBaseObject(componentsModel);
				if (result == null) result = caseIAnnotatable(componentsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INAMED_ELEMENT: {
				INamedElement iNamedElement = (INamedElement)theEObject;
				T1 result = caseINamedElement(iNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ISYSTEM: {
				ISystem iSystem = (ISystem)theEObject;
				T1 result = caseISystem(iSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PORT: {
				Port port = (Port)theEObject;
				T1 result = casePort(port);
				if (result == null) result = caseReferableBaseObject(port);
				if (result == null) result = caseITaggable(port);
				if (result == null) result = caseIAnnotatable(port);
				if (result == null) result = caseIReferable(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T1 result = caseComponent(component);
				if (result == null) result = caseReferableBaseObject(component);
				if (result == null) result = caseITaggable(component);
				if (result == null) result = caseIAnnotatable(component);
				if (result == null) result = caseIReferable(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T1 result = caseComposite(composite);
				if (result == null) result = caseComponent(composite);
				if (result == null) result = caseISystem(composite);
				if (result == null) result = caseReferableBaseObject(composite);
				if (result == null) result = caseITaggable(composite);
				if (result == null) result = caseIAnnotatable(composite);
				if (result == null) result = caseIReferable(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SYSTEM: {
				org.eclipse.app4mc.amalthea.model.System system = (org.eclipse.app4mc.amalthea.model.System)theEObject;
				T1 result = caseSystem(system);
				if (result == null) result = caseReferableBaseObject(system);
				if (result == null) result = caseITaggable(system);
				if (result == null) result = caseISystem(system);
				if (result == null) result = caseIAnnotatable(system);
				if (result == null) result = caseIReferable(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T1 result = caseComponentInstance(componentInstance);
				if (result == null) result = caseReferableBaseObject(componentInstance);
				if (result == null) result = caseITaggable(componentInstance);
				if (result == null) result = caseIAnnotatable(componentInstance);
				if (result == null) result = caseIReferable(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T1 result = caseConnector(connector);
				if (result == null) result = caseBaseObject(connector);
				if (result == null) result = caseINamedElement(connector);
				if (result == null) result = caseITaggable(connector);
				if (result == null) result = caseIAnnotatable(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.QUALIFIED_PORT: {
				QualifiedPort qualifiedPort = (QualifiedPort)theEObject;
				T1 result = caseQualifiedPort(qualifiedPort);
				if (result == null) result = caseBaseObject(qualifiedPort);
				if (result == null) result = caseIAnnotatable(qualifiedPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FINTERFACE_PORT: {
				FInterfacePort fInterfacePort = (FInterfacePort)theEObject;
				T1 result = caseFInterfacePort(fInterfacePort);
				if (result == null) result = casePort(fInterfacePort);
				if (result == null) result = caseReferableBaseObject(fInterfacePort);
				if (result == null) result = caseITaggable(fInterfacePort);
				if (result == null) result = caseIAnnotatable(fInterfacePort);
				if (result == null) result = caseIReferable(fInterfacePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONFIG_MODEL: {
				ConfigModel configModel = (ConfigModel)theEObject;
				T1 result = caseConfigModel(configModel);
				if (result == null) result = caseBaseObject(configModel);
				if (result == null) result = caseIAnnotatable(configModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CONFIG: {
				EventConfig eventConfig = (EventConfig)theEObject;
				T1 result = caseEventConfig(eventConfig);
				if (result == null) result = caseBaseObject(eventConfig);
				if (result == null) result = caseIAnnotatable(eventConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONSTRAINTS_MODEL: {
				ConstraintsModel constraintsModel = (ConstraintsModel)theEObject;
				T1 result = caseConstraintsModel(constraintsModel);
				if (result == null) result = caseBaseObject(constraintsModel);
				if (result == null) result = caseIAnnotatable(constraintsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT: {
				RunnableSequencingConstraint runnableSequencingConstraint = (RunnableSequencingConstraint)theEObject;
				T1 result = caseRunnableSequencingConstraint(runnableSequencingConstraint);
				if (result == null) result = caseReferableBaseObject(runnableSequencingConstraint);
				if (result == null) result = caseIAnnotatable(runnableSequencingConstraint);
				if (result == null) result = caseIReferable(runnableSequencingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.AFFINITY_CONSTRAINT: {
				AffinityConstraint affinityConstraint = (AffinityConstraint)theEObject;
				T1 result = caseAffinityConstraint(affinityConstraint);
				if (result == null) result = caseReferableBaseObject(affinityConstraint);
				if (result == null) result = caseIAnnotatable(affinityConstraint);
				if (result == null) result = caseIReferable(affinityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SEPARATION_CONSTRAINT: {
				SeparationConstraint separationConstraint = (SeparationConstraint)theEObject;
				T1 result = caseSeparationConstraint(separationConstraint);
				if (result == null) result = caseAffinityConstraint(separationConstraint);
				if (result == null) result = caseReferableBaseObject(separationConstraint);
				if (result == null) result = caseIAnnotatable(separationConstraint);
				if (result == null) result = caseIReferable(separationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PAIRING_CONSTRAINT: {
				PairingConstraint pairingConstraint = (PairingConstraint)theEObject;
				T1 result = casePairingConstraint(pairingConstraint);
				if (result == null) result = caseAffinityConstraint(pairingConstraint);
				if (result == null) result = caseReferableBaseObject(pairingConstraint);
				if (result == null) result = caseIAnnotatable(pairingConstraint);
				if (result == null) result = caseIReferable(pairingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CONSTRAINT: {
				ProcessConstraint processConstraint = (ProcessConstraint)theEObject;
				T1 result = caseProcessConstraint(processConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_CONSTRAINT: {
				RunnableConstraint runnableConstraint = (RunnableConstraint)theEObject;
				T1 result = caseRunnableConstraint(runnableConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_CONSTRAINT: {
				DataConstraint dataConstraint = (DataConstraint)theEObject;
				T1 result = caseDataConstraint(dataConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_SEPARATION_CONSTRAINT: {
				RunnableSeparationConstraint runnableSeparationConstraint = (RunnableSeparationConstraint)theEObject;
				T1 result = caseRunnableSeparationConstraint(runnableSeparationConstraint);
				if (result == null) result = caseSeparationConstraint(runnableSeparationConstraint);
				if (result == null) result = caseRunnableConstraint(runnableSeparationConstraint);
				if (result == null) result = caseBaseObject(runnableSeparationConstraint);
				if (result == null) result = caseAffinityConstraint(runnableSeparationConstraint);
				if (result == null) result = caseReferableBaseObject(runnableSeparationConstraint);
				if (result == null) result = caseIAnnotatable(runnableSeparationConstraint);
				if (result == null) result = caseIReferable(runnableSeparationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_SEPARATION_CONSTRAINT: {
				ProcessSeparationConstraint processSeparationConstraint = (ProcessSeparationConstraint)theEObject;
				T1 result = caseProcessSeparationConstraint(processSeparationConstraint);
				if (result == null) result = caseSeparationConstraint(processSeparationConstraint);
				if (result == null) result = caseProcessConstraint(processSeparationConstraint);
				if (result == null) result = caseBaseObject(processSeparationConstraint);
				if (result == null) result = caseAffinityConstraint(processSeparationConstraint);
				if (result == null) result = caseReferableBaseObject(processSeparationConstraint);
				if (result == null) result = caseIAnnotatable(processSeparationConstraint);
				if (result == null) result = caseIReferable(processSeparationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_SEPARATION_CONSTRAINT: {
				DataSeparationConstraint dataSeparationConstraint = (DataSeparationConstraint)theEObject;
				T1 result = caseDataSeparationConstraint(dataSeparationConstraint);
				if (result == null) result = caseSeparationConstraint(dataSeparationConstraint);
				if (result == null) result = caseDataConstraint(dataSeparationConstraint);
				if (result == null) result = caseBaseObject(dataSeparationConstraint);
				if (result == null) result = caseAffinityConstraint(dataSeparationConstraint);
				if (result == null) result = caseReferableBaseObject(dataSeparationConstraint);
				if (result == null) result = caseIAnnotatable(dataSeparationConstraint);
				if (result == null) result = caseIReferable(dataSeparationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT: {
				RunnablePairingConstraint runnablePairingConstraint = (RunnablePairingConstraint)theEObject;
				T1 result = caseRunnablePairingConstraint(runnablePairingConstraint);
				if (result == null) result = casePairingConstraint(runnablePairingConstraint);
				if (result == null) result = caseRunnableConstraint(runnablePairingConstraint);
				if (result == null) result = caseBaseObject(runnablePairingConstraint);
				if (result == null) result = caseAffinityConstraint(runnablePairingConstraint);
				if (result == null) result = caseReferableBaseObject(runnablePairingConstraint);
				if (result == null) result = caseIAnnotatable(runnablePairingConstraint);
				if (result == null) result = caseIReferable(runnablePairingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT: {
				ProcessPairingConstraint processPairingConstraint = (ProcessPairingConstraint)theEObject;
				T1 result = caseProcessPairingConstraint(processPairingConstraint);
				if (result == null) result = casePairingConstraint(processPairingConstraint);
				if (result == null) result = caseProcessConstraint(processPairingConstraint);
				if (result == null) result = caseBaseObject(processPairingConstraint);
				if (result == null) result = caseAffinityConstraint(processPairingConstraint);
				if (result == null) result = caseReferableBaseObject(processPairingConstraint);
				if (result == null) result = caseIAnnotatable(processPairingConstraint);
				if (result == null) result = caseIReferable(processPairingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_PAIRING_CONSTRAINT: {
				DataPairingConstraint dataPairingConstraint = (DataPairingConstraint)theEObject;
				T1 result = caseDataPairingConstraint(dataPairingConstraint);
				if (result == null) result = casePairingConstraint(dataPairingConstraint);
				if (result == null) result = caseDataConstraint(dataPairingConstraint);
				if (result == null) result = caseBaseObject(dataPairingConstraint);
				if (result == null) result = caseAffinityConstraint(dataPairingConstraint);
				if (result == null) result = caseReferableBaseObject(dataPairingConstraint);
				if (result == null) result = caseIAnnotatable(dataPairingConstraint);
				if (result == null) result = caseIReferable(dataPairingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_CONSTRAINT_TARGET: {
				RunnableConstraintTarget runnableConstraintTarget = (RunnableConstraintTarget)theEObject;
				T1 result = caseRunnableConstraintTarget(runnableConstraintTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CONSTRAINT_TARGET: {
				ProcessConstraintTarget processConstraintTarget = (ProcessConstraintTarget)theEObject;
				T1 result = caseProcessConstraintTarget(processConstraintTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_CONSTRAINT_TARGET: {
				DataConstraintTarget dataConstraintTarget = (DataConstraintTarget)theEObject;
				T1 result = caseDataConstraintTarget(dataConstraintTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TARGET_MEMORY: {
				TargetMemory targetMemory = (TargetMemory)theEObject;
				T1 result = caseTargetMemory(targetMemory);
				if (result == null) result = caseDataConstraintTarget(targetMemory);
				if (result == null) result = caseBaseObject(targetMemory);
				if (result == null) result = caseIAnnotatable(targetMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TARGET_CORE: {
				TargetCore targetCore = (TargetCore)theEObject;
				T1 result = caseTargetCore(targetCore);
				if (result == null) result = caseRunnableConstraintTarget(targetCore);
				if (result == null) result = caseProcessConstraintTarget(targetCore);
				if (result == null) result = caseBaseObject(targetCore);
				if (result == null) result = caseIAnnotatable(targetCore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TARGET_SCHEDULER: {
				TargetScheduler targetScheduler = (TargetScheduler)theEObject;
				T1 result = caseTargetScheduler(targetScheduler);
				if (result == null) result = caseRunnableConstraintTarget(targetScheduler);
				if (result == null) result = caseProcessConstraintTarget(targetScheduler);
				if (result == null) result = caseBaseObject(targetScheduler);
				if (result == null) result = caseIAnnotatable(targetScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_GROUP: {
				LabelGroup labelGroup = (LabelGroup)theEObject;
				T1 result = caseLabelGroup(labelGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_GROUP: {
				RunnableGroup runnableGroup = (RunnableGroup)theEObject;
				T1 result = caseRunnableGroup(runnableGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_GROUP: {
				ProcessGroup processGroup = (ProcessGroup)theEObject;
				T1 result = caseProcessGroup(processGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_ENTITY_GROUP: {
				LabelEntityGroup labelEntityGroup = (LabelEntityGroup)theEObject;
				T1 result = caseLabelEntityGroup(labelEntityGroup);
				if (result == null) result = caseLabelGroup(labelEntityGroup);
				if (result == null) result = caseBaseObject(labelEntityGroup);
				if (result == null) result = caseIAnnotatable(labelEntityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_ENTITY_GROUP: {
				RunnableEntityGroup runnableEntityGroup = (RunnableEntityGroup)theEObject;
				T1 result = caseRunnableEntityGroup(runnableEntityGroup);
				if (result == null) result = caseRunnableGroup(runnableEntityGroup);
				if (result == null) result = caseBaseObject(runnableEntityGroup);
				if (result == null) result = caseIAnnotatable(runnableEntityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_ENTITY_GROUP: {
				ProcessEntityGroup processEntityGroup = (ProcessEntityGroup)theEObject;
				T1 result = caseProcessEntityGroup(processEntityGroup);
				if (result == null) result = caseProcessGroup(processEntityGroup);
				if (result == null) result = caseBaseObject(processEntityGroup);
				if (result == null) result = caseIAnnotatable(processEntityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TAG_GROUP: {
				TagGroup tagGroup = (TagGroup)theEObject;
				T1 result = caseTagGroup(tagGroup);
				if (result == null) result = caseRunnableGroup(tagGroup);
				if (result == null) result = caseProcessGroup(tagGroup);
				if (result == null) result = caseBaseObject(tagGroup);
				if (result == null) result = caseIAnnotatable(tagGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN: {
				AbstractEventChain abstractEventChain = (AbstractEventChain)theEObject;
				T1 result = caseAbstractEventChain(abstractEventChain);
				if (result == null) result = caseBaseObject(abstractEventChain);
				if (result == null) result = caseIAnnotatable(abstractEventChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN: {
				EventChain eventChain = (EventChain)theEObject;
				T1 result = caseEventChain(eventChain);
				if (result == null) result = caseAbstractEventChain(eventChain);
				if (result == null) result = caseIReferable(eventChain);
				if (result == null) result = caseBaseObject(eventChain);
				if (result == null) result = caseIAnnotatable(eventChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SUB_EVENT_CHAIN: {
				SubEventChain subEventChain = (SubEventChain)theEObject;
				T1 result = caseSubEventChain(subEventChain);
				if (result == null) result = caseAbstractEventChain(subEventChain);
				if (result == null) result = caseINamedElement(subEventChain);
				if (result == null) result = caseBaseObject(subEventChain);
				if (result == null) result = caseIAnnotatable(subEventChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_ITEM: {
				EventChainItem eventChainItem = (EventChainItem)theEObject;
				T1 result = caseEventChainItem(eventChainItem);
				if (result == null) result = caseBaseObject(eventChainItem);
				if (result == null) result = caseIAnnotatable(eventChainItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE: {
				EventChainReference eventChainReference = (EventChainReference)theEObject;
				T1 result = caseEventChainReference(eventChainReference);
				if (result == null) result = caseEventChainItem(eventChainReference);
				if (result == null) result = caseBaseObject(eventChainReference);
				if (result == null) result = caseIAnnotatable(eventChainReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER: {
				EventChainContainer eventChainContainer = (EventChainContainer)theEObject;
				T1 result = caseEventChainContainer(eventChainContainer);
				if (result == null) result = caseEventChainItem(eventChainContainer);
				if (result == null) result = caseBaseObject(eventChainContainer);
				if (result == null) result = caseIAnnotatable(eventChainContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIMING_CONSTRAINT: {
				TimingConstraint timingConstraint = (TimingConstraint)theEObject;
				T1 result = caseTimingConstraint(timingConstraint);
				if (result == null) result = caseReferableBaseObject(timingConstraint);
				if (result == null) result = caseIAnnotatable(timingConstraint);
				if (result == null) result = caseIReferable(timingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PHYSICAL_SECTION_CONSTRAINT: {
				PhysicalSectionConstraint physicalSectionConstraint = (PhysicalSectionConstraint)theEObject;
				T1 result = casePhysicalSectionConstraint(physicalSectionConstraint);
				if (result == null) result = caseReferableBaseObject(physicalSectionConstraint);
				if (result == null) result = caseIAnnotatable(physicalSectionConstraint);
				if (result == null) result = caseIReferable(physicalSectionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT: {
				SynchronizationConstraint synchronizationConstraint = (SynchronizationConstraint)theEObject;
				T1 result = caseSynchronizationConstraint(synchronizationConstraint);
				if (result == null) result = caseTimingConstraint(synchronizationConstraint);
				if (result == null) result = caseReferableBaseObject(synchronizationConstraint);
				if (result == null) result = caseIAnnotatable(synchronizationConstraint);
				if (result == null) result = caseIReferable(synchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_SYNCHRONIZATION_CONSTRAINT: {
				EventSynchronizationConstraint eventSynchronizationConstraint = (EventSynchronizationConstraint)theEObject;
				T1 result = caseEventSynchronizationConstraint(eventSynchronizationConstraint);
				if (result == null) result = caseSynchronizationConstraint(eventSynchronizationConstraint);
				if (result == null) result = caseTimingConstraint(eventSynchronizationConstraint);
				if (result == null) result = caseReferableBaseObject(eventSynchronizationConstraint);
				if (result == null) result = caseIAnnotatable(eventSynchronizationConstraint);
				if (result == null) result = caseIReferable(eventSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_SYNCHRONIZATION_CONSTRAINT: {
				EventChainSynchronizationConstraint eventChainSynchronizationConstraint = (EventChainSynchronizationConstraint)theEObject;
				T1 result = caseEventChainSynchronizationConstraint(eventChainSynchronizationConstraint);
				if (result == null) result = caseSynchronizationConstraint(eventChainSynchronizationConstraint);
				if (result == null) result = caseTimingConstraint(eventChainSynchronizationConstraint);
				if (result == null) result = caseReferableBaseObject(eventChainSynchronizationConstraint);
				if (result == null) result = caseIAnnotatable(eventChainSynchronizationConstraint);
				if (result == null) result = caseIReferable(eventChainSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DELAY_CONSTRAINT: {
				DelayConstraint delayConstraint = (DelayConstraint)theEObject;
				T1 result = caseDelayConstraint(delayConstraint);
				if (result == null) result = caseTimingConstraint(delayConstraint);
				if (result == null) result = caseReferableBaseObject(delayConstraint);
				if (result == null) result = caseIAnnotatable(delayConstraint);
				if (result == null) result = caseIReferable(delayConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_LATENCY_CONSTRAINT: {
				EventChainLatencyConstraint eventChainLatencyConstraint = (EventChainLatencyConstraint)theEObject;
				T1 result = caseEventChainLatencyConstraint(eventChainLatencyConstraint);
				if (result == null) result = caseTimingConstraint(eventChainLatencyConstraint);
				if (result == null) result = caseReferableBaseObject(eventChainLatencyConstraint);
				if (result == null) result = caseIAnnotatable(eventChainLatencyConstraint);
				if (result == null) result = caseIReferable(eventChainLatencyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REPETITION_CONSTRAINT: {
				RepetitionConstraint repetitionConstraint = (RepetitionConstraint)theEObject;
				T1 result = caseRepetitionConstraint(repetitionConstraint);
				if (result == null) result = caseTimingConstraint(repetitionConstraint);
				if (result == null) result = caseReferableBaseObject(repetitionConstraint);
				if (result == null) result = caseIAnnotatable(repetitionConstraint);
				if (result == null) result = caseIReferable(repetitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_AGE_CONSTRAINT: {
				DataAgeConstraint dataAgeConstraint = (DataAgeConstraint)theEObject;
				T1 result = caseDataAgeConstraint(dataAgeConstraint);
				if (result == null) result = caseReferableBaseObject(dataAgeConstraint);
				if (result == null) result = caseIAnnotatable(dataAgeConstraint);
				if (result == null) result = caseIReferable(dataAgeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_AGE: {
				DataAge dataAge = (DataAge)theEObject;
				T1 result = caseDataAge(dataAge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_AGE_CYCLE: {
				DataAgeCycle dataAgeCycle = (DataAgeCycle)theEObject;
				T1 result = caseDataAgeCycle(dataAgeCycle);
				if (result == null) result = caseDataAge(dataAgeCycle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_AGE_TIME: {
				DataAgeTime dataAgeTime = (DataAgeTime)theEObject;
				T1 result = caseDataAgeTime(dataAgeTime);
				if (result == null) result = caseDataAge(dataAgeTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T1 result = caseRequirement(requirement);
				if (result == null) result = caseBaseObject(requirement);
				if (result == null) result = caseIAnnotatable(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_REQUIREMENT: {
				ProcessRequirement processRequirement = (ProcessRequirement)theEObject;
				T1 result = caseProcessRequirement(processRequirement);
				if (result == null) result = caseRequirement(processRequirement);
				if (result == null) result = caseBaseObject(processRequirement);
				if (result == null) result = caseIAnnotatable(processRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_REQUIREMENT: {
				RunnableRequirement runnableRequirement = (RunnableRequirement)theEObject;
				T1 result = caseRunnableRequirement(runnableRequirement);
				if (result == null) result = caseRequirement(runnableRequirement);
				if (result == null) result = caseBaseObject(runnableRequirement);
				if (result == null) result = caseIAnnotatable(runnableRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ARCHITECTURE_REQUIREMENT: {
				ArchitectureRequirement architectureRequirement = (ArchitectureRequirement)theEObject;
				T1 result = caseArchitectureRequirement(architectureRequirement);
				if (result == null) result = caseRequirement(architectureRequirement);
				if (result == null) result = caseBaseObject(architectureRequirement);
				if (result == null) result = caseIAnnotatable(architectureRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CHAIN_REQUIREMENT: {
				ProcessChainRequirement processChainRequirement = (ProcessChainRequirement)theEObject;
				T1 result = caseProcessChainRequirement(processChainRequirement);
				if (result == null) result = caseRequirement(processChainRequirement);
				if (result == null) result = caseBaseObject(processChainRequirement);
				if (result == null) result = caseIAnnotatable(processChainRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REQUIREMENT_LIMIT: {
				RequirementLimit requirementLimit = (RequirementLimit)theEObject;
				T1 result = caseRequirementLimit(requirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT: {
				CPUPercentageRequirementLimit cpuPercentageRequirementLimit = (CPUPercentageRequirementLimit)theEObject;
				T1 result = caseCPUPercentageRequirementLimit(cpuPercentageRequirementLimit);
				if (result == null) result = caseRequirementLimit(cpuPercentageRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT: {
				FrequencyRequirementLimit frequencyRequirementLimit = (FrequencyRequirementLimit)theEObject;
				T1 result = caseFrequencyRequirementLimit(frequencyRequirementLimit);
				if (result == null) result = caseRequirementLimit(frequencyRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT: {
				PercentageRequirementLimit percentageRequirementLimit = (PercentageRequirementLimit)theEObject;
				T1 result = casePercentageRequirementLimit(percentageRequirementLimit);
				if (result == null) result = caseRequirementLimit(percentageRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT: {
				CountRequirementLimit countRequirementLimit = (CountRequirementLimit)theEObject;
				T1 result = caseCountRequirementLimit(countRequirementLimit);
				if (result == null) result = caseRequirementLimit(countRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT: {
				TimeRequirementLimit timeRequirementLimit = (TimeRequirementLimit)theEObject;
				T1 result = caseTimeRequirementLimit(timeRequirementLimit);
				if (result == null) result = caseRequirementLimit(timeRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_COHERENCY_GROUP: {
				DataCoherencyGroup dataCoherencyGroup = (DataCoherencyGroup)theEObject;
				T1 result = caseDataCoherencyGroup(dataCoherencyGroup);
				if (result == null) result = caseReferableBaseObject(dataCoherencyGroup);
				if (result == null) result = caseIAnnotatable(dataCoherencyGroup);
				if (result == null) result = caseIReferable(dataCoherencyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_STABILITY_GROUP: {
				DataStabilityGroup dataStabilityGroup = (DataStabilityGroup)theEObject;
				T1 result = caseDataStabilityGroup(dataStabilityGroup);
				if (result == null) result = caseReferableBaseObject(dataStabilityGroup);
				if (result == null) result = caseIAnnotatable(dataStabilityGroup);
				if (result == null) result = caseIReferable(dataStabilityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_GROUP_SCOPE: {
				DataGroupScope dataGroupScope = (DataGroupScope)theEObject;
				T1 result = caseDataGroupScope(dataGroupScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_SCOPE: {
				ProcessScope processScope = (ProcessScope)theEObject;
				T1 result = caseProcessScope(processScope);
				if (result == null) result = caseDataGroupScope(processScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_SCOPE: {
				RunnableScope runnableScope = (RunnableScope)theEObject;
				T1 result = caseRunnableScope(runnableScope);
				if (result == null) result = caseDataGroupScope(runnableScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENT_SCOPE: {
				ComponentScope componentScope = (ComponentScope)theEObject;
				T1 result = caseComponentScope(componentScope);
				if (result == null) result = caseDataGroupScope(componentScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_MODEL: {
				EventModel eventModel = (EventModel)theEObject;
				T1 result = caseEventModel(eventModel);
				if (result == null) result = caseBaseObject(eventModel);
				if (result == null) result = caseIAnnotatable(eventModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT: {
				Event event = (Event)theEObject;
				T1 result = caseEvent(event);
				if (result == null) result = caseReferableBaseObject(event);
				if (result == null) result = caseITaggable(event);
				if (result == null) result = caseIAnnotatable(event);
				if (result == null) result = caseIReferable(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_SET: {
				EventSet eventSet = (EventSet)theEObject;
				T1 result = caseEventSet(eventSet);
				if (result == null) result = caseEvent(eventSet);
				if (result == null) result = caseReferableBaseObject(eventSet);
				if (result == null) result = caseITaggable(eventSet);
				if (result == null) result = caseIAnnotatable(eventSet);
				if (result == null) result = caseIReferable(eventSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ENTITY_EVENT: {
				EntityEvent entityEvent = (EntityEvent)theEObject;
				T1 result = caseEntityEvent(entityEvent);
				if (result == null) result = caseEvent(entityEvent);
				if (result == null) result = caseReferableBaseObject(entityEvent);
				if (result == null) result = caseITaggable(entityEvent);
				if (result == null) result = caseIAnnotatable(entityEvent);
				if (result == null) result = caseIReferable(entityEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TRIGGER_EVENT: {
				TriggerEvent triggerEvent = (TriggerEvent)theEObject;
				T1 result = caseTriggerEvent(triggerEvent);
				if (result == null) result = caseEntityEvent(triggerEvent);
				if (result == null) result = caseEvent(triggerEvent);
				if (result == null) result = caseReferableBaseObject(triggerEvent);
				if (result == null) result = caseITaggable(triggerEvent);
				if (result == null) result = caseIAnnotatable(triggerEvent);
				if (result == null) result = caseIReferable(triggerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_EVENT: {
				CustomEvent customEvent = (CustomEvent)theEObject;
				T1 result = caseCustomEvent(customEvent);
				if (result == null) result = caseEntityEvent(customEvent);
				if (result == null) result = caseEvent(customEvent);
				if (result == null) result = caseReferableBaseObject(customEvent);
				if (result == null) result = caseITaggable(customEvent);
				if (result == null) result = caseIAnnotatable(customEvent);
				if (result == null) result = caseIReferable(customEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STIMULUS_EVENT: {
				StimulusEvent stimulusEvent = (StimulusEvent)theEObject;
				T1 result = caseStimulusEvent(stimulusEvent);
				if (result == null) result = caseEntityEvent(stimulusEvent);
				if (result == null) result = caseEvent(stimulusEvent);
				if (result == null) result = caseReferableBaseObject(stimulusEvent);
				if (result == null) result = caseITaggable(stimulusEvent);
				if (result == null) result = caseIAnnotatable(stimulusEvent);
				if (result == null) result = caseIReferable(stimulusEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_EVENT: {
				ProcessEvent processEvent = (ProcessEvent)theEObject;
				T1 result = caseProcessEvent(processEvent);
				if (result == null) result = caseEntityEvent(processEvent);
				if (result == null) result = caseEvent(processEvent);
				if (result == null) result = caseReferableBaseObject(processEvent);
				if (result == null) result = caseITaggable(processEvent);
				if (result == null) result = caseIAnnotatable(processEvent);
				if (result == null) result = caseIReferable(processEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CHAIN_EVENT: {
				ProcessChainEvent processChainEvent = (ProcessChainEvent)theEObject;
				T1 result = caseProcessChainEvent(processChainEvent);
				if (result == null) result = caseEntityEvent(processChainEvent);
				if (result == null) result = caseEvent(processChainEvent);
				if (result == null) result = caseReferableBaseObject(processChainEvent);
				if (result == null) result = caseITaggable(processChainEvent);
				if (result == null) result = caseIAnnotatable(processChainEvent);
				if (result == null) result = caseIReferable(processChainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_EVENT: {
				RunnableEvent runnableEvent = (RunnableEvent)theEObject;
				T1 result = caseRunnableEvent(runnableEvent);
				if (result == null) result = caseTriggerEvent(runnableEvent);
				if (result == null) result = caseEntityEvent(runnableEvent);
				if (result == null) result = caseEvent(runnableEvent);
				if (result == null) result = caseReferableBaseObject(runnableEvent);
				if (result == null) result = caseITaggable(runnableEvent);
				if (result == null) result = caseIAnnotatable(runnableEvent);
				if (result == null) result = caseIReferable(runnableEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_EVENT: {
				LabelEvent labelEvent = (LabelEvent)theEObject;
				T1 result = caseLabelEvent(labelEvent);
				if (result == null) result = caseTriggerEvent(labelEvent);
				if (result == null) result = caseEntityEvent(labelEvent);
				if (result == null) result = caseEvent(labelEvent);
				if (result == null) result = caseReferableBaseObject(labelEvent);
				if (result == null) result = caseITaggable(labelEvent);
				if (result == null) result = caseIAnnotatable(labelEvent);
				if (result == null) result = caseIReferable(labelEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL_EVENT: {
				ChannelEvent channelEvent = (ChannelEvent)theEObject;
				T1 result = caseChannelEvent(channelEvent);
				if (result == null) result = caseTriggerEvent(channelEvent);
				if (result == null) result = caseEntityEvent(channelEvent);
				if (result == null) result = caseEvent(channelEvent);
				if (result == null) result = caseReferableBaseObject(channelEvent);
				if (result == null) result = caseITaggable(channelEvent);
				if (result == null) result = caseIAnnotatable(channelEvent);
				if (result == null) result = caseIReferable(channelEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SEMAPHORE_EVENT: {
				SemaphoreEvent semaphoreEvent = (SemaphoreEvent)theEObject;
				T1 result = caseSemaphoreEvent(semaphoreEvent);
				if (result == null) result = caseEntityEvent(semaphoreEvent);
				if (result == null) result = caseEvent(semaphoreEvent);
				if (result == null) result = caseReferableBaseObject(semaphoreEvent);
				if (result == null) result = caseITaggable(semaphoreEvent);
				if (result == null) result = caseIAnnotatable(semaphoreEvent);
				if (result == null) result = caseIReferable(semaphoreEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_MODEL: {
				HWModel hwModel = (HWModel)theEObject;
				T1 result = caseHWModel(hwModel);
				if (result == null) result = caseBaseObject(hwModel);
				if (result == null) result = caseIAnnotatable(hwModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPLEX_NODE: {
				ComplexNode complexNode = (ComplexNode)theEObject;
				T1 result = caseComplexNode(complexNode);
				if (result == null) result = caseReferableBaseObject(complexNode);
				if (result == null) result = caseITaggable(complexNode);
				if (result == null) result = caseIAnnotatable(complexNode);
				if (result == null) result = caseIReferable(complexNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_SYSTEM: {
				HwSystem hwSystem = (HwSystem)theEObject;
				T1 result = caseHwSystem(hwSystem);
				if (result == null) result = caseComplexNode(hwSystem);
				if (result == null) result = caseReferableBaseObject(hwSystem);
				if (result == null) result = caseITaggable(hwSystem);
				if (result == null) result = caseIAnnotatable(hwSystem);
				if (result == null) result = caseIReferable(hwSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ECU: {
				ECU ecu = (ECU)theEObject;
				T1 result = caseECU(ecu);
				if (result == null) result = caseComplexNode(ecu);
				if (result == null) result = caseReferableBaseObject(ecu);
				if (result == null) result = caseITaggable(ecu);
				if (result == null) result = caseIAnnotatable(ecu);
				if (result == null) result = caseIReferable(ecu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MICROCONTROLLER: {
				Microcontroller microcontroller = (Microcontroller)theEObject;
				T1 result = caseMicrocontroller(microcontroller);
				if (result == null) result = caseComplexNode(microcontroller);
				if (result == null) result = caseReferableBaseObject(microcontroller);
				if (result == null) result = caseITaggable(microcontroller);
				if (result == null) result = caseIAnnotatable(microcontroller);
				if (result == null) result = caseIReferable(microcontroller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CORE: {
				Core core = (Core)theEObject;
				T1 result = caseCore(core);
				if (result == null) result = caseComplexNode(core);
				if (result == null) result = caseReferableBaseObject(core);
				if (result == null) result = caseITaggable(core);
				if (result == null) result = caseIAnnotatable(core);
				if (result == null) result = caseIReferable(core);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T1 result = caseMemory(memory);
				if (result == null) result = caseComplexNode(memory);
				if (result == null) result = caseReferableBaseObject(memory);
				if (result == null) result = caseITaggable(memory);
				if (result == null) result = caseIAnnotatable(memory);
				if (result == null) result = caseIReferable(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.NETWORK: {
				Network network = (Network)theEObject;
				T1 result = caseNetwork(network);
				if (result == null) result = caseComplexNode(network);
				if (result == null) result = caseReferableBaseObject(network);
				if (result == null) result = caseITaggable(network);
				if (result == null) result = caseIAnnotatable(network);
				if (result == null) result = caseIReferable(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.QUARTZ: {
				Quartz quartz = (Quartz)theEObject;
				T1 result = caseQuartz(quartz);
				if (result == null) result = caseReferableBaseObject(quartz);
				if (result == null) result = caseITaggable(quartz);
				if (result == null) result = caseIAnnotatable(quartz);
				if (result == null) result = caseIReferable(quartz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_COMPONENT: {
				HwComponent hwComponent = (HwComponent)theEObject;
				T1 result = caseHwComponent(hwComponent);
				if (result == null) result = caseComplexNode(hwComponent);
				if (result == null) result = caseReferableBaseObject(hwComponent);
				if (result == null) result = caseITaggable(hwComponent);
				if (result == null) result = caseIAnnotatable(hwComponent);
				if (result == null) result = caseIReferable(hwComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HARDWARE_TYPE_DESCRIPTION: {
				HardwareTypeDescription hardwareTypeDescription = (HardwareTypeDescription)theEObject;
				T1 result = caseHardwareTypeDescription(hardwareTypeDescription);
				if (result == null) result = caseReferableBaseObject(hardwareTypeDescription);
				if (result == null) result = caseITaggable(hardwareTypeDescription);
				if (result == null) result = caseIAnnotatable(hardwareTypeDescription);
				if (result == null) result = caseIReferable(hardwareTypeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACTION_TYPE: {
				AbstractionType abstractionType = (AbstractionType)theEObject;
				T1 result = caseAbstractionType(abstractionType);
				if (result == null) result = caseHardwareTypeDescription(abstractionType);
				if (result == null) result = caseReferableBaseObject(abstractionType);
				if (result == null) result = caseITaggable(abstractionType);
				if (result == null) result = caseIAnnotatable(abstractionType);
				if (result == null) result = caseIReferable(abstractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				T1 result = caseSystemType(systemType);
				if (result == null) result = caseAbstractionType(systemType);
				if (result == null) result = caseHardwareTypeDescription(systemType);
				if (result == null) result = caseReferableBaseObject(systemType);
				if (result == null) result = caseITaggable(systemType);
				if (result == null) result = caseIAnnotatable(systemType);
				if (result == null) result = caseIReferable(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ECU_TYPE: {
				ECUType ecuType = (ECUType)theEObject;
				T1 result = caseECUType(ecuType);
				if (result == null) result = caseAbstractionType(ecuType);
				if (result == null) result = caseHardwareTypeDescription(ecuType);
				if (result == null) result = caseReferableBaseObject(ecuType);
				if (result == null) result = caseITaggable(ecuType);
				if (result == null) result = caseIAnnotatable(ecuType);
				if (result == null) result = caseIReferable(ecuType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MICROCONTROLLER_TYPE: {
				MicrocontrollerType microcontrollerType = (MicrocontrollerType)theEObject;
				T1 result = caseMicrocontrollerType(microcontrollerType);
				if (result == null) result = caseAbstractionType(microcontrollerType);
				if (result == null) result = caseHardwareTypeDescription(microcontrollerType);
				if (result == null) result = caseReferableBaseObject(microcontrollerType);
				if (result == null) result = caseITaggable(microcontrollerType);
				if (result == null) result = caseIAnnotatable(microcontrollerType);
				if (result == null) result = caseIReferable(microcontrollerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CORE_TYPE: {
				CoreType coreType = (CoreType)theEObject;
				T1 result = caseCoreType(coreType);
				if (result == null) result = caseAbstractionType(coreType);
				if (result == null) result = caseHardwareTypeDescription(coreType);
				if (result == null) result = caseReferableBaseObject(coreType);
				if (result == null) result = caseITaggable(coreType);
				if (result == null) result = caseIAnnotatable(coreType);
				if (result == null) result = caseIReferable(coreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_TYPE: {
				MemoryType memoryType = (MemoryType)theEObject;
				T1 result = caseMemoryType(memoryType);
				if (result == null) result = caseHardwareTypeDescription(memoryType);
				if (result == null) result = caseReferableBaseObject(memoryType);
				if (result == null) result = caseITaggable(memoryType);
				if (result == null) result = caseIAnnotatable(memoryType);
				if (result == null) result = caseIReferable(memoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.NETWORK_TYPE: {
				NetworkType networkType = (NetworkType)theEObject;
				T1 result = caseNetworkType(networkType);
				if (result == null) result = caseHardwareTypeDescription(networkType);
				if (result == null) result = caseReferableBaseObject(networkType);
				if (result == null) result = caseITaggable(networkType);
				if (result == null) result = caseIAnnotatable(networkType);
				if (result == null) result = caseIReferable(networkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_PORT: {
				HwPort hwPort = (HwPort)theEObject;
				T1 result = caseHwPort(hwPort);
				if (result == null) result = caseReferableBaseObject(hwPort);
				if (result == null) result = caseIAnnotatable(hwPort);
				if (result == null) result = caseIReferable(hwPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PIN: {
				Pin pin = (Pin)theEObject;
				T1 result = casePin(pin);
				if (result == null) result = caseReferableBaseObject(pin);
				if (result == null) result = caseIAnnotatable(pin);
				if (result == null) result = caseIReferable(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPLEX_PORT: {
				ComplexPort complexPort = (ComplexPort)theEObject;
				T1 result = caseComplexPort(complexPort);
				if (result == null) result = caseHwPort(complexPort);
				if (result == null) result = caseReferableBaseObject(complexPort);
				if (result == null) result = caseIAnnotatable(complexPort);
				if (result == null) result = caseIReferable(complexPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPLEX_PIN: {
				ComplexPin complexPin = (ComplexPin)theEObject;
				T1 result = caseComplexPin(complexPin);
				if (result == null) result = casePin(complexPin);
				if (result == null) result = caseReferableBaseObject(complexPin);
				if (result == null) result = caseIAnnotatable(complexPin);
				if (result == null) result = caseIReferable(complexPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PRESCALER: {
				Prescaler prescaler = (Prescaler)theEObject;
				T1 result = casePrescaler(prescaler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CROSSBAR_SWITCH: {
				CrossbarSwitch crossbarSwitch = (CrossbarSwitch)theEObject;
				T1 result = caseCrossbarSwitch(crossbarSwitch);
				if (result == null) result = caseNetworkType(crossbarSwitch);
				if (result == null) result = caseHardwareTypeDescription(crossbarSwitch);
				if (result == null) result = caseReferableBaseObject(crossbarSwitch);
				if (result == null) result = caseITaggable(crossbarSwitch);
				if (result == null) result = caseIAnnotatable(crossbarSwitch);
				if (result == null) result = caseIReferable(crossbarSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BUS: {
				Bus bus = (Bus)theEObject;
				T1 result = caseBus(bus);
				if (result == null) result = caseNetworkType(bus);
				if (result == null) result = caseHardwareTypeDescription(bus);
				if (result == null) result = caseReferableBaseObject(bus);
				if (result == null) result = caseITaggable(bus);
				if (result == null) result = caseIAnnotatable(bus);
				if (result == null) result = caseIReferable(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BRIDGE: {
				Bridge bridge = (Bridge)theEObject;
				T1 result = caseBridge(bridge);
				if (result == null) result = caseNetworkType(bridge);
				if (result == null) result = caseHardwareTypeDescription(bridge);
				if (result == null) result = caseReferableBaseObject(bridge);
				if (result == null) result = caseITaggable(bridge);
				if (result == null) result = caseIAnnotatable(bridge);
				if (result == null) result = caseIReferable(bridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ACCESS_PATH: {
				AccessPath accessPath = (AccessPath)theEObject;
				T1 result = caseAccessPath(accessPath);
				if (result == null) result = caseIReferable(accessPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LATENCY_ACCESS_PATH: {
				LatencyAccessPath latencyAccessPath = (LatencyAccessPath)theEObject;
				T1 result = caseLatencyAccessPath(latencyAccessPath);
				if (result == null) result = caseAccessPath(latencyAccessPath);
				if (result == null) result = caseIReferable(latencyAccessPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_ACCESS_PATH: {
				HwAccessPath hwAccessPath = (HwAccessPath)theEObject;
				T1 result = caseHwAccessPath(hwAccessPath);
				if (result == null) result = caseAccessPath(hwAccessPath);
				if (result == null) result = caseIReferable(hwAccessPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LATENCY_ACCESS_PATH_ELEMENT: {
				LatencyAccessPathElement latencyAccessPathElement = (LatencyAccessPathElement)theEObject;
				T1 result = caseLatencyAccessPathElement(latencyAccessPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ACCESS_PATH_REF: {
				AccessPathRef accessPathRef = (AccessPathRef)theEObject;
				T1 result = caseAccessPathRef(accessPathRef);
				if (result == null) result = caseLatencyAccessPathElement(accessPathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LATENCY: {
				Latency latency = (Latency)theEObject;
				T1 result = caseLatency(latency);
				if (result == null) result = caseLatencyAccessPathElement(latency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LATENCY_CONSTANT: {
				LatencyConstant latencyConstant = (LatencyConstant)theEObject;
				T1 result = caseLatencyConstant(latencyConstant);
				if (result == null) result = caseLatency(latencyConstant);
				if (result == null) result = caseLatencyAccessPathElement(latencyConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LATENCY_DEVIATION: {
				LatencyDeviation latencyDeviation = (LatencyDeviation)theEObject;
				T1 result = caseLatencyDeviation(latencyDeviation);
				if (result == null) result = caseLatency(latencyDeviation);
				if (result == null) result = caseLatencyAccessPathElement(latencyDeviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_ACCESS_PATH_ELEMENT: {
				HwAccessPathElement hwAccessPathElement = (HwAccessPathElement)theEObject;
				T1 result = caseHwAccessPathElement(hwAccessPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_ACCESS_PATH_REF: {
				HwAccessPathRef hwAccessPathRef = (HwAccessPathRef)theEObject;
				T1 result = caseHwAccessPathRef(hwAccessPathRef);
				if (result == null) result = caseHwAccessPathElement(hwAccessPathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_ELEMENT_REF: {
				HwElementRef hwElementRef = (HwElementRef)theEObject;
				T1 result = caseHwElementRef(hwElementRef);
				if (result == null) result = caseHwAccessPathElement(hwElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MAPPING_MODEL: {
				MappingModel mappingModel = (MappingModel)theEObject;
				T1 result = caseMappingModel(mappingModel);
				if (result == null) result = caseBaseObject(mappingModel);
				if (result == null) result = caseIAnnotatable(mappingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULER_ALLOCATION: {
				SchedulerAllocation schedulerAllocation = (SchedulerAllocation)theEObject;
				T1 result = caseSchedulerAllocation(schedulerAllocation);
				if (result == null) result = caseBaseObject(schedulerAllocation);
				if (result == null) result = caseIAnnotatable(schedulerAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK_ALLOCATION: {
				TaskAllocation taskAllocation = (TaskAllocation)theEObject;
				T1 result = caseTaskAllocation(taskAllocation);
				if (result == null) result = caseBaseObject(taskAllocation);
				if (result == null) result = caseIAnnotatable(taskAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ISR_ALLOCATION: {
				ISRAllocation isrAllocation = (ISRAllocation)theEObject;
				T1 result = caseISRAllocation(isrAllocation);
				if (result == null) result = caseBaseObject(isrAllocation);
				if (result == null) result = caseIAnnotatable(isrAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_ALLOCATION: {
				RunnableAllocation runnableAllocation = (RunnableAllocation)theEObject;
				T1 result = caseRunnableAllocation(runnableAllocation);
				if (result == null) result = caseBaseObject(runnableAllocation);
				if (result == null) result = caseIAnnotatable(runnableAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_MAPPING: {
				MemoryMapping memoryMapping = (MemoryMapping)theEObject;
				T1 result = caseMemoryMapping(memoryMapping);
				if (result == null) result = caseBaseObject(memoryMapping);
				if (result == null) result = caseIAnnotatable(memoryMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING: {
				PhysicalSectionMapping physicalSectionMapping = (PhysicalSectionMapping)theEObject;
				T1 result = casePhysicalSectionMapping(physicalSectionMapping);
				if (result == null) result = caseReferableBaseObject(physicalSectionMapping);
				if (result == null) result = caseIAnnotatable(physicalSectionMapping);
				if (result == null) result = caseIReferable(physicalSectionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_MODEL: {
				OSModel osModel = (OSModel)theEObject;
				T1 result = caseOSModel(osModel);
				if (result == null) result = caseBaseObject(osModel);
				if (result == null) result = caseIAnnotatable(osModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_DATA_CONSISTENCY: {
				OsDataConsistency osDataConsistency = (OsDataConsistency)theEObject;
				T1 result = caseOsDataConsistency(osDataConsistency);
				if (result == null) result = caseBaseObject(osDataConsistency);
				if (result == null) result = caseIAnnotatable(osDataConsistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_STABILITY: {
				DataStability dataStability = (DataStability)theEObject;
				T1 result = caseDataStability(dataStability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY: {
				NonAtomicDataCoherency nonAtomicDataCoherency = (NonAtomicDataCoherency)theEObject;
				T1 result = caseNonAtomicDataCoherency(nonAtomicDataCoherency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SEMAPHORE: {
				Semaphore semaphore = (Semaphore)theEObject;
				T1 result = caseSemaphore(semaphore);
				if (result == null) result = caseReferableBaseObject(semaphore);
				if (result == null) result = caseIAnnotatable(semaphore);
				if (result == null) result = caseIReferable(semaphore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				T1 result = caseScheduler(scheduler);
				if (result == null) result = caseReferableBaseObject(scheduler);
				if (result == null) result = caseIAnnotatable(scheduler);
				if (result == null) result = caseIReferable(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPUTATION_ITEM: {
				ComputationItem computationItem = (ComputationItem)theEObject;
				T1 result = caseComputationItem(computationItem);
				if (result == null) result = caseBaseObject(computationItem);
				if (result == null) result = caseIAnnotatable(computationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK_SCHEDULER: {
				TaskScheduler taskScheduler = (TaskScheduler)theEObject;
				T1 result = caseTaskScheduler(taskScheduler);
				if (result == null) result = caseScheduler(taskScheduler);
				if (result == null) result = caseReferableBaseObject(taskScheduler);
				if (result == null) result = caseIAnnotatable(taskScheduler);
				if (result == null) result = caseIReferable(taskScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULER_ASSOCIATION: {
				SchedulerAssociation schedulerAssociation = (SchedulerAssociation)theEObject;
				T1 result = caseSchedulerAssociation(schedulerAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTERRUPT_CONTROLLER: {
				InterruptController interruptController = (InterruptController)theEObject;
				T1 result = caseInterruptController(interruptController);
				if (result == null) result = caseScheduler(interruptController);
				if (result == null) result = caseReferableBaseObject(interruptController);
				if (result == null) result = caseIAnnotatable(interruptController);
				if (result == null) result = caseIReferable(interruptController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULING_PARAMETERS: {
				SchedulingParameters schedulingParameters = (SchedulingParameters)theEObject;
				T1 result = caseSchedulingParameters(schedulingParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PARAMETER_EXTENSION: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> parameterExtension = (Map.Entry<String, String>)theEObject;
				T1 result = caseParameterExtension(parameterExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ALGORITHM: {
				Algorithm algorithm = (Algorithm)theEObject;
				T1 result = caseAlgorithm(algorithm);
				if (result == null) result = caseBaseObject(algorithm);
				if (result == null) result = caseIAnnotatable(algorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTERRUPT_SCHEDULING_ALGORITHM: {
				InterruptSchedulingAlgorithm interruptSchedulingAlgorithm = (InterruptSchedulingAlgorithm)theEObject;
				T1 result = caseInterruptSchedulingAlgorithm(interruptSchedulingAlgorithm);
				if (result == null) result = caseAlgorithm(interruptSchedulingAlgorithm);
				if (result == null) result = caseBaseObject(interruptSchedulingAlgorithm);
				if (result == null) result = caseIAnnotatable(interruptSchedulingAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK_SCHEDULING_ALGORITHM: {
				TaskSchedulingAlgorithm taskSchedulingAlgorithm = (TaskSchedulingAlgorithm)theEObject;
				T1 result = caseTaskSchedulingAlgorithm(taskSchedulingAlgorithm);
				if (result == null) result = caseAlgorithm(taskSchedulingAlgorithm);
				if (result == null) result = caseBaseObject(taskSchedulingAlgorithm);
				if (result == null) result = caseIAnnotatable(taskSchedulingAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FIXED_PRIORITY: {
				FixedPriority fixedPriority = (FixedPriority)theEObject;
				T1 result = caseFixedPriority(fixedPriority);
				if (result == null) result = caseTaskSchedulingAlgorithm(fixedPriority);
				if (result == null) result = caseAlgorithm(fixedPriority);
				if (result == null) result = caseBaseObject(fixedPriority);
				if (result == null) result = caseIAnnotatable(fixedPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FIXED_PRIORITY_PREEMPTIVE: {
				FixedPriorityPreemptive fixedPriorityPreemptive = (FixedPriorityPreemptive)theEObject;
				T1 result = caseFixedPriorityPreemptive(fixedPriorityPreemptive);
				if (result == null) result = caseFixedPriority(fixedPriorityPreemptive);
				if (result == null) result = caseTaskSchedulingAlgorithm(fixedPriorityPreemptive);
				if (result == null) result = caseAlgorithm(fixedPriorityPreemptive);
				if (result == null) result = caseBaseObject(fixedPriorityPreemptive);
				if (result == null) result = caseIAnnotatable(fixedPriorityPreemptive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OSEK: {
				OSEK osek = (OSEK)theEObject;
				T1 result = caseOSEK(osek);
				if (result == null) result = caseFixedPriority(osek);
				if (result == null) result = caseTaskSchedulingAlgorithm(osek);
				if (result == null) result = caseAlgorithm(osek);
				if (result == null) result = caseBaseObject(osek);
				if (result == null) result = caseIAnnotatable(osek);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DEADLINE_MONOTONIC: {
				DeadlineMonotonic deadlineMonotonic = (DeadlineMonotonic)theEObject;
				T1 result = caseDeadlineMonotonic(deadlineMonotonic);
				if (result == null) result = caseFixedPriority(deadlineMonotonic);
				if (result == null) result = caseTaskSchedulingAlgorithm(deadlineMonotonic);
				if (result == null) result = caseAlgorithm(deadlineMonotonic);
				if (result == null) result = caseBaseObject(deadlineMonotonic);
				if (result == null) result = caseIAnnotatable(deadlineMonotonic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RATE_MONOTONIC: {
				RateMonotonic rateMonotonic = (RateMonotonic)theEObject;
				T1 result = caseRateMonotonic(rateMonotonic);
				if (result == null) result = caseFixedPriority(rateMonotonic);
				if (result == null) result = caseTaskSchedulingAlgorithm(rateMonotonic);
				if (result == null) result = caseAlgorithm(rateMonotonic);
				if (result == null) result = caseBaseObject(rateMonotonic);
				if (result == null) result = caseIAnnotatable(rateMonotonic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PFAIR: {
				Pfair pfair = (Pfair)theEObject;
				T1 result = casePfair(pfair);
				if (result == null) result = caseTaskSchedulingAlgorithm(pfair);
				if (result == null) result = caseAlgorithm(pfair);
				if (result == null) result = caseBaseObject(pfair);
				if (result == null) result = caseIAnnotatable(pfair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PFAIR_PD2: {
				PfairPD2 pfairPD2 = (PfairPD2)theEObject;
				T1 result = casePfairPD2(pfairPD2);
				if (result == null) result = casePfair(pfairPD2);
				if (result == null) result = caseTaskSchedulingAlgorithm(pfairPD2);
				if (result == null) result = caseAlgorithm(pfairPD2);
				if (result == null) result = caseBaseObject(pfairPD2);
				if (result == null) result = caseIAnnotatable(pfairPD2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PARTLY_PFAIR_PD2: {
				PartlyPFairPD2 partlyPFairPD2 = (PartlyPFairPD2)theEObject;
				T1 result = casePartlyPFairPD2(partlyPFairPD2);
				if (result == null) result = casePfair(partlyPFairPD2);
				if (result == null) result = caseTaskSchedulingAlgorithm(partlyPFairPD2);
				if (result == null) result = caseAlgorithm(partlyPFairPD2);
				if (result == null) result = caseBaseObject(partlyPFairPD2);
				if (result == null) result = caseIAnnotatable(partlyPFairPD2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EARLY_RELEASE_FAIR_PD2: {
				EarlyReleaseFairPD2 earlyReleaseFairPD2 = (EarlyReleaseFairPD2)theEObject;
				T1 result = caseEarlyReleaseFairPD2(earlyReleaseFairPD2);
				if (result == null) result = casePfair(earlyReleaseFairPD2);
				if (result == null) result = caseTaskSchedulingAlgorithm(earlyReleaseFairPD2);
				if (result == null) result = caseAlgorithm(earlyReleaseFairPD2);
				if (result == null) result = caseBaseObject(earlyReleaseFairPD2);
				if (result == null) result = caseIAnnotatable(earlyReleaseFairPD2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2: {
				PartlyEarlyReleaseFairPD2 partlyEarlyReleaseFairPD2 = (PartlyEarlyReleaseFairPD2)theEObject;
				T1 result = casePartlyEarlyReleaseFairPD2(partlyEarlyReleaseFairPD2);
				if (result == null) result = casePfair(partlyEarlyReleaseFairPD2);
				if (result == null) result = caseTaskSchedulingAlgorithm(partlyEarlyReleaseFairPD2);
				if (result == null) result = caseAlgorithm(partlyEarlyReleaseFairPD2);
				if (result == null) result = caseBaseObject(partlyEarlyReleaseFairPD2);
				if (result == null) result = caseIAnnotatable(partlyEarlyReleaseFairPD2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DYNAMIC_PRIORITY: {
				DynamicPriority dynamicPriority = (DynamicPriority)theEObject;
				T1 result = caseDynamicPriority(dynamicPriority);
				if (result == null) result = caseTaskSchedulingAlgorithm(dynamicPriority);
				if (result == null) result = caseAlgorithm(dynamicPriority);
				if (result == null) result = caseBaseObject(dynamicPriority);
				if (result == null) result = caseIAnnotatable(dynamicPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST: {
				LeastLocalRemainingExecutionTimeFirst leastLocalRemainingExecutionTimeFirst = (LeastLocalRemainingExecutionTimeFirst)theEObject;
				T1 result = caseLeastLocalRemainingExecutionTimeFirst(leastLocalRemainingExecutionTimeFirst);
				if (result == null) result = caseDynamicPriority(leastLocalRemainingExecutionTimeFirst);
				if (result == null) result = caseTaskSchedulingAlgorithm(leastLocalRemainingExecutionTimeFirst);
				if (result == null) result = caseAlgorithm(leastLocalRemainingExecutionTimeFirst);
				if (result == null) result = caseBaseObject(leastLocalRemainingExecutionTimeFirst);
				if (result == null) result = caseIAnnotatable(leastLocalRemainingExecutionTimeFirst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EARLIEST_DEADLINE_FIRST: {
				EarliestDeadlineFirst earliestDeadlineFirst = (EarliestDeadlineFirst)theEObject;
				T1 result = caseEarliestDeadlineFirst(earliestDeadlineFirst);
				if (result == null) result = caseDynamicPriority(earliestDeadlineFirst);
				if (result == null) result = caseTaskSchedulingAlgorithm(earliestDeadlineFirst);
				if (result == null) result = caseAlgorithm(earliestDeadlineFirst);
				if (result == null) result = caseBaseObject(earliestDeadlineFirst);
				if (result == null) result = caseIAnnotatable(earliestDeadlineFirst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PRIORITY_BASED_ROUND_ROBIN: {
				PriorityBasedRoundRobin priorityBasedRoundRobin = (PriorityBasedRoundRobin)theEObject;
				T1 result = casePriorityBasedRoundRobin(priorityBasedRoundRobin);
				if (result == null) result = caseDynamicPriority(priorityBasedRoundRobin);
				if (result == null) result = caseTaskSchedulingAlgorithm(priorityBasedRoundRobin);
				if (result == null) result = caseAlgorithm(priorityBasedRoundRobin);
				if (result == null) result = caseBaseObject(priorityBasedRoundRobin);
				if (result == null) result = caseIAnnotatable(priorityBasedRoundRobin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RESERVATION_BASED_SERVER: {
				ReservationBasedServer reservationBasedServer = (ReservationBasedServer)theEObject;
				T1 result = caseReservationBasedServer(reservationBasedServer);
				if (result == null) result = caseTaskSchedulingAlgorithm(reservationBasedServer);
				if (result == null) result = caseAlgorithm(reservationBasedServer);
				if (result == null) result = caseBaseObject(reservationBasedServer);
				if (result == null) result = caseIAnnotatable(reservationBasedServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DEFERRABLE_SERVER: {
				DeferrableServer deferrableServer = (DeferrableServer)theEObject;
				T1 result = caseDeferrableServer(deferrableServer);
				if (result == null) result = caseReservationBasedServer(deferrableServer);
				if (result == null) result = caseTaskSchedulingAlgorithm(deferrableServer);
				if (result == null) result = caseAlgorithm(deferrableServer);
				if (result == null) result = caseBaseObject(deferrableServer);
				if (result == null) result = caseIAnnotatable(deferrableServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.POLLING_PERIODIC_SERVER: {
				PollingPeriodicServer pollingPeriodicServer = (PollingPeriodicServer)theEObject;
				T1 result = casePollingPeriodicServer(pollingPeriodicServer);
				if (result == null) result = caseReservationBasedServer(pollingPeriodicServer);
				if (result == null) result = caseTaskSchedulingAlgorithm(pollingPeriodicServer);
				if (result == null) result = caseAlgorithm(pollingPeriodicServer);
				if (result == null) result = caseBaseObject(pollingPeriodicServer);
				if (result == null) result = caseIAnnotatable(pollingPeriodicServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SPORADIC_SERVER: {
				SporadicServer sporadicServer = (SporadicServer)theEObject;
				T1 result = caseSporadicServer(sporadicServer);
				if (result == null) result = caseReservationBasedServer(sporadicServer);
				if (result == null) result = caseTaskSchedulingAlgorithm(sporadicServer);
				if (result == null) result = caseAlgorithm(sporadicServer);
				if (result == null) result = caseBaseObject(sporadicServer);
				if (result == null) result = caseIAnnotatable(sporadicServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONSTANT_BANDWIDTH_SERVER: {
				ConstantBandwidthServer constantBandwidthServer = (ConstantBandwidthServer)theEObject;
				T1 result = caseConstantBandwidthServer(constantBandwidthServer);
				if (result == null) result = caseReservationBasedServer(constantBandwidthServer);
				if (result == null) result = caseTaskSchedulingAlgorithm(constantBandwidthServer);
				if (result == null) result = caseAlgorithm(constantBandwidthServer);
				if (result == null) result = caseBaseObject(constantBandwidthServer);
				if (result == null) result = caseIAnnotatable(constantBandwidthServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONSTANT_BANDWIDTH_SERVER_WITH_CASH: {
				ConstantBandwidthServerWithCASH constantBandwidthServerWithCASH = (ConstantBandwidthServerWithCASH)theEObject;
				T1 result = caseConstantBandwidthServerWithCASH(constantBandwidthServerWithCASH);
				if (result == null) result = caseReservationBasedServer(constantBandwidthServerWithCASH);
				if (result == null) result = caseTaskSchedulingAlgorithm(constantBandwidthServerWithCASH);
				if (result == null) result = caseAlgorithm(constantBandwidthServerWithCASH);
				if (result == null) result = caseBaseObject(constantBandwidthServerWithCASH);
				if (result == null) result = caseIAnnotatable(constantBandwidthServerWithCASH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.GROUPING: {
				Grouping grouping = (Grouping)theEObject;
				T1 result = caseGrouping(grouping);
				if (result == null) result = caseTaskSchedulingAlgorithm(grouping);
				if (result == null) result = caseAlgorithm(grouping);
				if (result == null) result = caseBaseObject(grouping);
				if (result == null) result = caseIAnnotatable(grouping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM: {
				UserSpecificSchedulingAlgorithm userSpecificSchedulingAlgorithm = (UserSpecificSchedulingAlgorithm)theEObject;
				T1 result = caseUserSpecificSchedulingAlgorithm(userSpecificSchedulingAlgorithm);
				if (result == null) result = caseTaskSchedulingAlgorithm(userSpecificSchedulingAlgorithm);
				if (result == null) result = caseInterruptSchedulingAlgorithm(userSpecificSchedulingAlgorithm);
				if (result == null) result = caseAlgorithm(userSpecificSchedulingAlgorithm);
				if (result == null) result = caseBaseObject(userSpecificSchedulingAlgorithm);
				if (result == null) result = caseIAnnotatable(userSpecificSchedulingAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PRIORITY_BASED: {
				PriorityBased priorityBased = (PriorityBased)theEObject;
				T1 result = casePriorityBased(priorityBased);
				if (result == null) result = caseInterruptSchedulingAlgorithm(priorityBased);
				if (result == null) result = caseAlgorithm(priorityBased);
				if (result == null) result = caseBaseObject(priorityBased);
				if (result == null) result = caseIAnnotatable(priorityBased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OPERATING_SYSTEM: {
				OperatingSystem operatingSystem = (OperatingSystem)theEObject;
				T1 result = caseOperatingSystem(operatingSystem);
				if (result == null) result = caseBaseObject(operatingSystem);
				if (result == null) result = caseIAnnotatable(operatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.VENDOR_OPERATING_SYSTEM: {
				VendorOperatingSystem vendorOperatingSystem = (VendorOperatingSystem)theEObject;
				T1 result = caseVendorOperatingSystem(vendorOperatingSystem);
				if (result == null) result = caseOperatingSystem(vendorOperatingSystem);
				if (result == null) result = caseBaseObject(vendorOperatingSystem);
				if (result == null) result = caseIAnnotatable(vendorOperatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_INSTRUCTIONS: {
				OsInstructions osInstructions = (OsInstructions)theEObject;
				T1 result = caseOsInstructions(osInstructions);
				if (result == null) result = caseReferableBaseObject(osInstructions);
				if (result == null) result = caseIAnnotatable(osInstructions);
				if (result == null) result = caseIReferable(osInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_API_INSTRUCTIONS: {
				OsAPIInstructions osAPIInstructions = (OsAPIInstructions)theEObject;
				T1 result = caseOsAPIInstructions(osAPIInstructions);
				if (result == null) result = caseBaseObject(osAPIInstructions);
				if (result == null) result = caseIAnnotatable(osAPIInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS: {
				OsISRInstructions osISRInstructions = (OsISRInstructions)theEObject;
				T1 result = caseOsISRInstructions(osISRInstructions);
				if (result == null) result = caseBaseObject(osISRInstructions);
				if (result == null) result = caseIAnnotatable(osISRInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL: {
				PropertyConstraintsModel propertyConstraintsModel = (PropertyConstraintsModel)theEObject;
				T1 result = casePropertyConstraintsModel(propertyConstraintsModel);
				if (result == null) result = caseBaseObject(propertyConstraintsModel);
				if (result == null) result = caseIAnnotatable(propertyConstraintsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT: {
				CoreAllocationConstraint coreAllocationConstraint = (CoreAllocationConstraint)theEObject;
				T1 result = caseCoreAllocationConstraint(coreAllocationConstraint);
				if (result == null) result = caseBaseObject(coreAllocationConstraint);
				if (result == null) result = caseIAnnotatable(coreAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT: {
				MemoryMappingConstraint memoryMappingConstraint = (MemoryMappingConstraint)theEObject;
				T1 result = caseMemoryMappingConstraint(memoryMappingConstraint);
				if (result == null) result = caseBaseObject(memoryMappingConstraint);
				if (result == null) result = caseIAnnotatable(memoryMappingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_ALLOCATION_CONSTRAINT: {
				ProcessAllocationConstraint processAllocationConstraint = (ProcessAllocationConstraint)theEObject;
				T1 result = caseProcessAllocationConstraint(processAllocationConstraint);
				if (result == null) result = caseCoreAllocationConstraint(processAllocationConstraint);
				if (result == null) result = caseBaseObject(processAllocationConstraint);
				if (result == null) result = caseIAnnotatable(processAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT: {
				ProcessPrototypeAllocationConstraint processPrototypeAllocationConstraint = (ProcessPrototypeAllocationConstraint)theEObject;
				T1 result = caseProcessPrototypeAllocationConstraint(processPrototypeAllocationConstraint);
				if (result == null) result = caseCoreAllocationConstraint(processPrototypeAllocationConstraint);
				if (result == null) result = caseBaseObject(processPrototypeAllocationConstraint);
				if (result == null) result = caseIAnnotatable(processPrototypeAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_ALLOCATION_CONSTRAINT: {
				RunnableAllocationConstraint runnableAllocationConstraint = (RunnableAllocationConstraint)theEObject;
				T1 result = caseRunnableAllocationConstraint(runnableAllocationConstraint);
				if (result == null) result = caseCoreAllocationConstraint(runnableAllocationConstraint);
				if (result == null) result = caseBaseObject(runnableAllocationConstraint);
				if (result == null) result = caseIAnnotatable(runnableAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT: {
				AbstractElementMappingConstraint abstractElementMappingConstraint = (AbstractElementMappingConstraint)theEObject;
				T1 result = caseAbstractElementMappingConstraint(abstractElementMappingConstraint);
				if (result == null) result = caseMemoryMappingConstraint(abstractElementMappingConstraint);
				if (result == null) result = caseBaseObject(abstractElementMappingConstraint);
				if (result == null) result = caseIAnnotatable(abstractElementMappingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLASSIFICATION: {
				Classification classification = (Classification)theEObject;
				T1 result = caseClassification(classification);
				if (result == null) result = caseBaseObject(classification);
				if (result == null) result = caseIAnnotatable(classification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CORE_CLASSIFICATION: {
				CoreClassification coreClassification = (CoreClassification)theEObject;
				T1 result = caseCoreClassification(coreClassification);
				if (result == null) result = caseClassification(coreClassification);
				if (result == null) result = caseBaseObject(coreClassification);
				if (result == null) result = caseIAnnotatable(coreClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_CLASSIFICATION: {
				MemoryClassification memoryClassification = (MemoryClassification)theEObject;
				T1 result = caseMemoryClassification(memoryClassification);
				if (result == null) result = caseClassification(memoryClassification);
				if (result == null) result = caseBaseObject(memoryClassification);
				if (result == null) result = caseIAnnotatable(memoryClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STIMULI_MODEL: {
				StimuliModel stimuliModel = (StimuliModel)theEObject;
				T1 result = caseStimuliModel(stimuliModel);
				if (result == null) result = caseBaseObject(stimuliModel);
				if (result == null) result = caseIAnnotatable(stimuliModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STIMULUS: {
				Stimulus stimulus = (Stimulus)theEObject;
				T1 result = caseStimulus(stimulus);
				if (result == null) result = caseReferableBaseObject(stimulus);
				if (result == null) result = caseITaggable(stimulus);
				if (result == null) result = caseIAnnotatable(stimulus);
				if (result == null) result = caseIReferable(stimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_VALUE_LIST: {
				ModeValueList modeValueList = (ModeValueList)theEObject;
				T1 result = caseModeValueList(modeValueList);
				if (result == null) result = caseBaseObject(modeValueList);
				if (result == null) result = caseIAnnotatable(modeValueList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY: {
				ModeValueListEntry modeValueListEntry = (ModeValueListEntry)theEObject;
				T1 result = caseModeValueListEntry(modeValueListEntry);
				if (result == null) result = caseBaseObject(modeValueListEntry);
				if (result == null) result = caseIAnnotatable(modeValueListEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_VALUE: {
				ModeValue modeValue = (ModeValue)theEObject;
				T1 result = caseModeValue(modeValue);
				if (result == null) result = caseModeValueListEntry(modeValue);
				if (result == null) result = caseBaseObject(modeValue);
				if (result == null) result = caseIAnnotatable(modeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_VALUE_CONJUNCTION: {
				ModeValueConjunction modeValueConjunction = (ModeValueConjunction)theEObject;
				T1 result = caseModeValueConjunction(modeValueConjunction);
				if (result == null) result = caseModeValueListEntry(modeValueConjunction);
				if (result == null) result = caseBaseObject(modeValueConjunction);
				if (result == null) result = caseIAnnotatable(modeValueConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_VALUE_DISJUNCTION: {
				ModeValueDisjunction modeValueDisjunction = (ModeValueDisjunction)theEObject;
				T1 result = caseModeValueDisjunction(modeValueDisjunction);
				if (result == null) result = caseBaseObject(modeValueDisjunction);
				if (result == null) result = caseIAnnotatable(modeValueDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PERIODIC_STIMULUS: {
				PeriodicStimulus periodicStimulus = (PeriodicStimulus)theEObject;
				T1 result = casePeriodicStimulus(periodicStimulus);
				if (result == null) result = caseStimulus(periodicStimulus);
				if (result == null) result = caseReferableBaseObject(periodicStimulus);
				if (result == null) result = caseITaggable(periodicStimulus);
				if (result == null) result = caseIAnnotatable(periodicStimulus);
				if (result == null) result = caseIReferable(periodicStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS: {
				VariableRateStimulus variableRateStimulus = (VariableRateStimulus)theEObject;
				T1 result = caseVariableRateStimulus(variableRateStimulus);
				if (result == null) result = caseStimulus(variableRateStimulus);
				if (result == null) result = caseReferableBaseObject(variableRateStimulus);
				if (result == null) result = caseITaggable(variableRateStimulus);
				if (result == null) result = caseIAnnotatable(variableRateStimulus);
				if (result == null) result = caseIReferable(variableRateStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SYNTHETIC_STIMULUS: {
				SyntheticStimulus syntheticStimulus = (SyntheticStimulus)theEObject;
				T1 result = caseSyntheticStimulus(syntheticStimulus);
				if (result == null) result = caseStimulus(syntheticStimulus);
				if (result == null) result = caseReferableBaseObject(syntheticStimulus);
				if (result == null) result = caseITaggable(syntheticStimulus);
				if (result == null) result = caseIAnnotatable(syntheticStimulus);
				if (result == null) result = caseIReferable(syntheticStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIMESTAMP_LIST: {
				TimestampList timestampList = (TimestampList)theEObject;
				T1 result = caseTimestampList(timestampList);
				if (result == null) result = caseBaseObject(timestampList);
				if (result == null) result = caseIAnnotatable(timestampList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_STIMULUS: {
				CustomStimulus customStimulus = (CustomStimulus)theEObject;
				T1 result = caseCustomStimulus(customStimulus);
				if (result == null) result = caseStimulus(customStimulus);
				if (result == null) result = caseReferableBaseObject(customStimulus);
				if (result == null) result = caseITaggable(customStimulus);
				if (result == null) result = caseIAnnotatable(customStimulus);
				if (result == null) result = caseIReferable(customStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SINGLE_STIMULUS: {
				SingleStimulus singleStimulus = (SingleStimulus)theEObject;
				T1 result = caseSingleStimulus(singleStimulus);
				if (result == null) result = caseStimulus(singleStimulus);
				if (result == null) result = caseReferableBaseObject(singleStimulus);
				if (result == null) result = caseITaggable(singleStimulus);
				if (result == null) result = caseIAnnotatable(singleStimulus);
				if (result == null) result = caseIReferable(singleStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTER_PROCESS_STIMULUS: {
				InterProcessStimulus interProcessStimulus = (InterProcessStimulus)theEObject;
				T1 result = caseInterProcessStimulus(interProcessStimulus);
				if (result == null) result = caseStimulus(interProcessStimulus);
				if (result == null) result = caseReferableBaseObject(interProcessStimulus);
				if (result == null) result = caseITaggable(interProcessStimulus);
				if (result == null) result = caseIAnnotatable(interProcessStimulus);
				if (result == null) result = caseIReferable(interProcessStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SPORADIC_STIMULUS: {
				SporadicStimulus sporadicStimulus = (SporadicStimulus)theEObject;
				T1 result = caseSporadicStimulus(sporadicStimulus);
				if (result == null) result = caseStimulus(sporadicStimulus);
				if (result == null) result = caseReferableBaseObject(sporadicStimulus);
				if (result == null) result = caseITaggable(sporadicStimulus);
				if (result == null) result = caseIAnnotatable(sporadicStimulus);
				if (result == null) result = caseIReferable(sporadicStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_STIMULUS: {
				EventStimulus eventStimulus = (EventStimulus)theEObject;
				T1 result = caseEventStimulus(eventStimulus);
				if (result == null) result = caseStimulus(eventStimulus);
				if (result == null) result = caseReferableBaseObject(eventStimulus);
				if (result == null) result = caseITaggable(eventStimulus);
				if (result == null) result = caseIAnnotatable(eventStimulus);
				if (result == null) result = caseIReferable(eventStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ARRIVAL_CURVE_STIMULUS: {
				ArrivalCurveStimulus arrivalCurveStimulus = (ArrivalCurveStimulus)theEObject;
				T1 result = caseArrivalCurveStimulus(arrivalCurveStimulus);
				if (result == null) result = caseStimulus(arrivalCurveStimulus);
				if (result == null) result = caseReferableBaseObject(arrivalCurveStimulus);
				if (result == null) result = caseITaggable(arrivalCurveStimulus);
				if (result == null) result = caseIAnnotatable(arrivalCurveStimulus);
				if (result == null) result = caseIReferable(arrivalCurveStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY: {
				ArrivalCurveEntry arrivalCurveEntry = (ArrivalCurveEntry)theEObject;
				T1 result = caseArrivalCurveEntry(arrivalCurveEntry);
				if (result == null) result = caseBaseObject(arrivalCurveEntry);
				if (result == null) result = caseIAnnotatable(arrivalCurveEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK: {
				Clock clock = (Clock)theEObject;
				T1 result = caseClock(clock);
				if (result == null) result = caseReferableBaseObject(clock);
				if (result == null) result = caseIAnnotatable(clock);
				if (result == null) result = caseIReferable(clock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION: {
				ClockTriangleFunction clockTriangleFunction = (ClockTriangleFunction)theEObject;
				T1 result = caseClockTriangleFunction(clockTriangleFunction);
				if (result == null) result = caseClock(clockTriangleFunction);
				if (result == null) result = caseReferableBaseObject(clockTriangleFunction);
				if (result == null) result = caseIAnnotatable(clockTriangleFunction);
				if (result == null) result = caseIReferable(clockTriangleFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION: {
				ClockSinusFunction clockSinusFunction = (ClockSinusFunction)theEObject;
				T1 result = caseClockSinusFunction(clockSinusFunction);
				if (result == null) result = caseClock(clockSinusFunction);
				if (result == null) result = caseReferableBaseObject(clockSinusFunction);
				if (result == null) result = caseIAnnotatable(clockSinusFunction);
				if (result == null) result = caseIReferable(clockSinusFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK_MULTIPLIER_LIST: {
				ClockMultiplierList clockMultiplierList = (ClockMultiplierList)theEObject;
				T1 result = caseClockMultiplierList(clockMultiplierList);
				if (result == null) result = caseClock(clockMultiplierList);
				if (result == null) result = caseReferableBaseObject(clockMultiplierList);
				if (result == null) result = caseIAnnotatable(clockMultiplierList);
				if (result == null) result = caseIReferable(clockMultiplierList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK_MULTIPLIER_LIST_ENTRY: {
				ClockMultiplierListEntry clockMultiplierListEntry = (ClockMultiplierListEntry)theEObject;
				T1 result = caseClockMultiplierListEntry(clockMultiplierListEntry);
				if (result == null) result = caseBaseObject(clockMultiplierListEntry);
				if (result == null) result = caseIAnnotatable(clockMultiplierListEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SW_MODEL: {
				SWModel swModel = (SWModel)theEObject;
				T1 result = caseSWModel(swModel);
				if (result == null) result = caseBaseObject(swModel);
				if (result == null) result = caseIAnnotatable(swModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT: {
				AbstractMemoryElement abstractMemoryElement = (AbstractMemoryElement)theEObject;
				T1 result = caseAbstractMemoryElement(abstractMemoryElement);
				if (result == null) result = caseReferableBaseObject(abstractMemoryElement);
				if (result == null) result = caseITaggable(abstractMemoryElement);
				if (result == null) result = caseIAnnotatable(abstractMemoryElement);
				if (result == null) result = caseIReferable(abstractMemoryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_PROCESS: {
				AbstractProcess abstractProcess = (AbstractProcess)theEObject;
				T1 result = caseAbstractProcess(abstractProcess);
				if (result == null) result = caseAbstractMemoryElement(abstractProcess);
				if (result == null) result = caseReferableBaseObject(abstractProcess);
				if (result == null) result = caseITaggable(abstractProcess);
				if (result == null) result = caseIAnnotatable(abstractProcess);
				if (result == null) result = caseIReferable(abstractProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_ENTITY: {
				CustomEntity customEntity = (CustomEntity)theEObject;
				T1 result = caseCustomEntity(customEntity);
				if (result == null) result = caseAbstractMemoryElement(customEntity);
				if (result == null) result = caseReferableBaseObject(customEntity);
				if (result == null) result = caseITaggable(customEntity);
				if (result == null) result = caseIAnnotatable(customEntity);
				if (result == null) result = caseIReferable(customEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CHAIN: {
				ProcessChain processChain = (ProcessChain)theEObject;
				T1 result = caseProcessChain(processChain);
				if (result == null) result = caseReferableBaseObject(processChain);
				if (result == null) result = caseIAnnotatable(processChain);
				if (result == null) result = caseIReferable(processChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS: {
				org.eclipse.app4mc.amalthea.model.Process process = (org.eclipse.app4mc.amalthea.model.Process)theEObject;
				T1 result = caseProcess(process);
				if (result == null) result = caseAbstractProcess(process);
				if (result == null) result = caseAbstractMemoryElement(process);
				if (result == null) result = caseReferableBaseObject(process);
				if (result == null) result = caseITaggable(process);
				if (result == null) result = caseIAnnotatable(process);
				if (result == null) result = caseIReferable(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CALL_GRAPH: {
				CallGraph callGraph = (CallGraph)theEObject;
				T1 result = caseCallGraph(callGraph);
				if (result == null) result = caseBaseObject(callGraph);
				if (result == null) result = caseIAnnotatable(callGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.GRAPH_ENTRY_BASE: {
				GraphEntryBase graphEntryBase = (GraphEntryBase)theEObject;
				T1 result = caseGraphEntryBase(graphEntryBase);
				if (result == null) result = caseBaseObject(graphEntryBase);
				if (result == null) result = caseIAnnotatable(graphEntryBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CALL_SEQUENCE: {
				CallSequence callSequence = (CallSequence)theEObject;
				T1 result = caseCallSequence(callSequence);
				if (result == null) result = caseGraphEntryBase(callSequence);
				if (result == null) result = caseBaseObject(callSequence);
				if (result == null) result = caseIAnnotatable(callSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_SWITCH: {
				ModeSwitch modeSwitch = (ModeSwitch)theEObject;
				T1 result = caseModeSwitch(modeSwitch);
				if (result == null) result = caseGraphEntryBase(modeSwitch);
				if (result == null) result = caseBaseObject(modeSwitch);
				if (result == null) result = caseIAnnotatable(modeSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_SWITCH_ENTRY: {
				ModeSwitchEntry<?> modeSwitchEntry = (ModeSwitchEntry<?>)theEObject;
				T1 result = caseModeSwitchEntry(modeSwitchEntry);
				if (result == null) result = caseBaseObject(modeSwitchEntry);
				if (result == null) result = caseIAnnotatable(modeSwitchEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_SWITCH_DEFAULT: {
				ModeSwitchDefault<?> modeSwitchDefault = (ModeSwitchDefault<?>)theEObject;
				T1 result = caseModeSwitchDefault(modeSwitchDefault);
				if (result == null) result = caseBaseObject(modeSwitchDefault);
				if (result == null) result = caseIAnnotatable(modeSwitchDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROBABILITY_SWITCH: {
				ProbabilitySwitch probabilitySwitch = (ProbabilitySwitch)theEObject;
				T1 result = caseProbabilitySwitch(probabilitySwitch);
				if (result == null) result = caseGraphEntryBase(probabilitySwitch);
				if (result == null) result = caseBaseObject(probabilitySwitch);
				if (result == null) result = caseIAnnotatable(probabilitySwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROBABILITY_SWITCH_ENTRY: {
				ProbabilitySwitchEntry<?> probabilitySwitchEntry = (ProbabilitySwitchEntry<?>)theEObject;
				T1 result = caseProbabilitySwitchEntry(probabilitySwitchEntry);
				if (result == null) result = caseBaseObject(probabilitySwitchEntry);
				if (result == null) result = caseIAnnotatable(probabilitySwitchEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T1 result = caseCounter(counter);
				if (result == null) result = caseBaseObject(counter);
				if (result == null) result = caseIAnnotatable(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CALL_SEQUENCE_ITEM: {
				CallSequenceItem callSequenceItem = (CallSequenceItem)theEObject;
				T1 result = caseCallSequenceItem(callSequenceItem);
				if (result == null) result = caseBaseObject(callSequenceItem);
				if (result == null) result = caseIAnnotatable(callSequenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.WAIT_EVENT: {
				WaitEvent waitEvent = (WaitEvent)theEObject;
				T1 result = caseWaitEvent(waitEvent);
				if (result == null) result = caseCallSequenceItem(waitEvent);
				if (result == null) result = caseBaseObject(waitEvent);
				if (result == null) result = caseIAnnotatable(waitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SET_EVENT: {
				SetEvent setEvent = (SetEvent)theEObject;
				T1 result = caseSetEvent(setEvent);
				if (result == null) result = caseCallSequenceItem(setEvent);
				if (result == null) result = caseBaseObject(setEvent);
				if (result == null) result = caseIAnnotatable(setEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLEAR_EVENT: {
				ClearEvent clearEvent = (ClearEvent)theEObject;
				T1 result = caseClearEvent(clearEvent);
				if (result == null) result = caseCallSequenceItem(clearEvent);
				if (result == null) result = caseBaseObject(clearEvent);
				if (result == null) result = caseIAnnotatable(clearEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_MASK: {
				EventMask eventMask = (EventMask)theEObject;
				T1 result = caseEventMask(eventMask);
				if (result == null) result = caseBaseObject(eventMask);
				if (result == null) result = caseIAnnotatable(eventMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_EVENT: {
				OsEvent osEvent = (OsEvent)theEObject;
				T1 result = caseOsEvent(osEvent);
				if (result == null) result = caseReferableBaseObject(osEvent);
				if (result == null) result = caseITaggable(osEvent);
				if (result == null) result = caseIAnnotatable(osEvent);
				if (result == null) result = caseIReferable(osEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTER_PROCESS_TRIGGER: {
				InterProcessTrigger interProcessTrigger = (InterProcessTrigger)theEObject;
				T1 result = caseInterProcessTrigger(interProcessTrigger);
				if (result == null) result = caseCallSequenceItem(interProcessTrigger);
				if (result == null) result = caseBaseObject(interProcessTrigger);
				if (result == null) result = caseIAnnotatable(interProcessTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ENFORCED_MIGRATION: {
				EnforcedMigration enforcedMigration = (EnforcedMigration)theEObject;
				T1 result = caseEnforcedMigration(enforcedMigration);
				if (result == null) result = caseCallSequenceItem(enforcedMigration);
				if (result == null) result = caseBaseObject(enforcedMigration);
				if (result == null) result = caseIAnnotatable(enforcedMigration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK_RUNNABLE_CALL: {
				TaskRunnableCall taskRunnableCall = (TaskRunnableCall)theEObject;
				T1 result = caseTaskRunnableCall(taskRunnableCall);
				if (result == null) result = caseCallSequenceItem(taskRunnableCall);
				if (result == null) result = caseBaseObject(taskRunnableCall);
				if (result == null) result = caseIAnnotatable(taskRunnableCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULE_POINT: {
				SchedulePoint schedulePoint = (SchedulePoint)theEObject;
				T1 result = caseSchedulePoint(schedulePoint);
				if (result == null) result = caseCallSequenceItem(schedulePoint);
				if (result == null) result = caseBaseObject(schedulePoint);
				if (result == null) result = caseIAnnotatable(schedulePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TERMINATE_PROCESS: {
				TerminateProcess terminateProcess = (TerminateProcess)theEObject;
				T1 result = caseTerminateProcess(terminateProcess);
				if (result == null) result = caseCallSequenceItem(terminateProcess);
				if (result == null) result = caseBaseObject(terminateProcess);
				if (result == null) result = caseIAnnotatable(terminateProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK: {
				Task task = (Task)theEObject;
				T1 result = caseTask(task);
				if (result == null) result = caseProcess(task);
				if (result == null) result = caseAbstractProcess(task);
				if (result == null) result = caseAbstractMemoryElement(task);
				if (result == null) result = caseReferableBaseObject(task);
				if (result == null) result = caseITaggable(task);
				if (result == null) result = caseIAnnotatable(task);
				if (result == null) result = caseIReferable(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ISR: {
				ISR isr = (ISR)theEObject;
				T1 result = caseISR(isr);
				if (result == null) result = caseProcess(isr);
				if (result == null) result = caseAbstractProcess(isr);
				if (result == null) result = caseAbstractMemoryElement(isr);
				if (result == null) result = caseReferableBaseObject(isr);
				if (result == null) result = caseITaggable(isr);
				if (result == null) result = caseIAnnotatable(isr);
				if (result == null) result = caseIReferable(isr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_PROTOTYPE: {
				ProcessPrototype processPrototype = (ProcessPrototype)theEObject;
				T1 result = caseProcessPrototype(processPrototype);
				if (result == null) result = caseAbstractProcess(processPrototype);
				if (result == null) result = caseAbstractMemoryElement(processPrototype);
				if (result == null) result = caseReferableBaseObject(processPrototype);
				if (result == null) result = caseITaggable(processPrototype);
				if (result == null) result = caseIAnnotatable(processPrototype);
				if (result == null) result = caseIReferable(processPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE: {
				ChainedProcessPrototype chainedProcessPrototype = (ChainedProcessPrototype)theEObject;
				T1 result = caseChainedProcessPrototype(chainedProcessPrototype);
				if (result == null) result = caseBaseObject(chainedProcessPrototype);
				if (result == null) result = caseIAnnotatable(chainedProcessPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.GENERAL_PRECEDENCE: {
				GeneralPrecedence generalPrecedence = (GeneralPrecedence)theEObject;
				T1 result = caseGeneralPrecedence(generalPrecedence);
				if (result == null) result = caseBaseObject(generalPrecedence);
				if (result == null) result = caseIAnnotatable(generalPrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ACCESS_PRECEDENCE_SPEC: {
				AccessPrecedenceSpec accessPrecedenceSpec = (AccessPrecedenceSpec)theEObject;
				T1 result = caseAccessPrecedenceSpec(accessPrecedenceSpec);
				if (result == null) result = caseGeneralPrecedence(accessPrecedenceSpec);
				if (result == null) result = caseBaseObject(accessPrecedenceSpec);
				if (result == null) result = caseIAnnotatable(accessPrecedenceSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ORDER_PRECEDENCE_SPEC: {
				OrderPrecedenceSpec orderPrecedenceSpec = (OrderPrecedenceSpec)theEObject;
				T1 result = caseOrderPrecedenceSpec(orderPrecedenceSpec);
				if (result == null) result = caseGeneralPrecedence(orderPrecedenceSpec);
				if (result == null) result = caseBaseObject(orderPrecedenceSpec);
				if (result == null) result = caseIAnnotatable(orderPrecedenceSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE: {
				org.eclipse.app4mc.amalthea.model.Runnable runnable = (org.eclipse.app4mc.amalthea.model.Runnable)theEObject;
				T1 result = caseRunnable(runnable);
				if (result == null) result = caseAbstractMemoryElement(runnable);
				if (result == null) result = caseReferableBaseObject(runnable);
				if (result == null) result = caseITaggable(runnable);
				if (result == null) result = caseIAnnotatable(runnable);
				if (result == null) result = caseIReferable(runnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL: {
				Label label = (Label)theEObject;
				T1 result = caseLabel(label);
				if (result == null) result = caseAbstractMemoryElement(label);
				if (result == null) result = caseIDisplayName(label);
				if (result == null) result = caseReferableBaseObject(label);
				if (result == null) result = caseITaggable(label);
				if (result == null) result = caseIAnnotatable(label);
				if (result == null) result = caseIReferable(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T1 result = caseChannel(channel);
				if (result == null) result = caseAbstractMemoryElement(channel);
				if (result == null) result = caseIDisplayName(channel);
				if (result == null) result = caseReferableBaseObject(channel);
				if (result == null) result = caseITaggable(channel);
				if (result == null) result = caseIAnnotatable(channel);
				if (result == null) result = caseIReferable(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_LABEL: {
				ModeLabel modeLabel = (ModeLabel)theEObject;
				T1 result = caseModeLabel(modeLabel);
				if (result == null) result = caseAbstractMemoryElement(modeLabel);
				if (result == null) result = caseIDisplayName(modeLabel);
				if (result == null) result = caseReferableBaseObject(modeLabel);
				if (result == null) result = caseITaggable(modeLabel);
				if (result == null) result = caseIAnnotatable(modeLabel);
				if (result == null) result = caseIReferable(modeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SECTION: {
				Section section = (Section)theEObject;
				T1 result = caseSection(section);
				if (result == null) result = caseReferableBaseObject(section);
				if (result == null) result = caseIAnnotatable(section);
				if (result == null) result = caseIReferable(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_ITEM: {
				RunnableItem runnableItem = (RunnableItem)theEObject;
				T1 result = caseRunnableItem(runnableItem);
				if (result == null) result = caseBaseObject(runnableItem);
				if (result == null) result = caseIAnnotatable(runnableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_INSTRUCTIONS: {
				RunnableInstructions runnableInstructions = (RunnableInstructions)theEObject;
				T1 result = caseRunnableInstructions(runnableInstructions);
				if (result == null) result = caseRunnableItem(runnableInstructions);
				if (result == null) result = caseComputationItem(runnableInstructions);
				if (result == null) result = caseBaseObject(runnableInstructions);
				if (result == null) result = caseIAnnotatable(runnableInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_INSTRUCTIONS_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<CoreType, Instructions> runnableInstructionsEntry = (Map.Entry<CoreType, Instructions>)theEObject;
				T1 result = caseRunnableInstructionsEntry(runnableInstructionsEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_LABEL_ACCESS: {
				ModeLabelAccess modeLabelAccess = (ModeLabelAccess)theEObject;
				T1 result = caseModeLabelAccess(modeLabelAccess);
				if (result == null) result = caseRunnableItem(modeLabelAccess);
				if (result == null) result = caseBaseObject(modeLabelAccess);
				if (result == null) result = caseIAnnotatable(modeLabelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH: {
				RunnableModeSwitch runnableModeSwitch = (RunnableModeSwitch)theEObject;
				T1 result = caseRunnableModeSwitch(runnableModeSwitch);
				if (result == null) result = caseRunnableItem(runnableModeSwitch);
				if (result == null) result = caseBaseObject(runnableModeSwitch);
				if (result == null) result = caseIAnnotatable(runnableModeSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_ACCESS: {
				LabelAccess labelAccess = (LabelAccess)theEObject;
				T1 result = caseLabelAccess(labelAccess);
				if (result == null) result = caseRunnableItem(labelAccess);
				if (result == null) result = caseComputationItem(labelAccess);
				if (result == null) result = caseBaseObject(labelAccess);
				if (result == null) result = caseIAnnotatable(labelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL_ACCESS: {
				ChannelAccess channelAccess = (ChannelAccess)theEObject;
				T1 result = caseChannelAccess(channelAccess);
				if (result == null) result = caseRunnableItem(channelAccess);
				if (result == null) result = caseBaseObject(channelAccess);
				if (result == null) result = caseIAnnotatable(channelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL_SEND: {
				ChannelSend channelSend = (ChannelSend)theEObject;
				T1 result = caseChannelSend(channelSend);
				if (result == null) result = caseChannelAccess(channelSend);
				if (result == null) result = caseRunnableItem(channelSend);
				if (result == null) result = caseBaseObject(channelSend);
				if (result == null) result = caseIAnnotatable(channelSend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL_RECEIVE: {
				ChannelReceive channelReceive = (ChannelReceive)theEObject;
				T1 result = caseChannelReceive(channelReceive);
				if (result == null) result = caseChannelAccess(channelReceive);
				if (result == null) result = caseRunnableItem(channelReceive);
				if (result == null) result = caseBaseObject(channelReceive);
				if (result == null) result = caseIAnnotatable(channelReceive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SEMAPHORE_ACCESS: {
				SemaphoreAccess semaphoreAccess = (SemaphoreAccess)theEObject;
				T1 result = caseSemaphoreAccess(semaphoreAccess);
				if (result == null) result = caseRunnableItem(semaphoreAccess);
				if (result == null) result = caseBaseObject(semaphoreAccess);
				if (result == null) result = caseIAnnotatable(semaphoreAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SENDER_RECEIVER_COMMUNICATION: {
				SenderReceiverCommunication senderReceiverCommunication = (SenderReceiverCommunication)theEObject;
				T1 result = caseSenderReceiverCommunication(senderReceiverCommunication);
				if (result == null) result = caseRunnableItem(senderReceiverCommunication);
				if (result == null) result = caseBaseObject(senderReceiverCommunication);
				if (result == null) result = caseIAnnotatable(senderReceiverCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SENDER_RECEIVER_READ: {
				SenderReceiverRead senderReceiverRead = (SenderReceiverRead)theEObject;
				T1 result = caseSenderReceiverRead(senderReceiverRead);
				if (result == null) result = caseSenderReceiverCommunication(senderReceiverRead);
				if (result == null) result = caseRunnableItem(senderReceiverRead);
				if (result == null) result = caseBaseObject(senderReceiverRead);
				if (result == null) result = caseIAnnotatable(senderReceiverRead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SENDER_RECEIVER_WRITE: {
				SenderReceiverWrite senderReceiverWrite = (SenderReceiverWrite)theEObject;
				T1 result = caseSenderReceiverWrite(senderReceiverWrite);
				if (result == null) result = caseSenderReceiverCommunication(senderReceiverWrite);
				if (result == null) result = caseRunnableItem(senderReceiverWrite);
				if (result == null) result = caseBaseObject(senderReceiverWrite);
				if (result == null) result = caseIAnnotatable(senderReceiverWrite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SERVER_CALL: {
				ServerCall serverCall = (ServerCall)theEObject;
				T1 result = caseServerCall(serverCall);
				if (result == null) result = caseRunnableItem(serverCall);
				if (result == null) result = caseBaseObject(serverCall);
				if (result == null) result = caseIAnnotatable(serverCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL: {
				SynchronousServerCall synchronousServerCall = (SynchronousServerCall)theEObject;
				T1 result = caseSynchronousServerCall(synchronousServerCall);
				if (result == null) result = caseServerCall(synchronousServerCall);
				if (result == null) result = caseRunnableItem(synchronousServerCall);
				if (result == null) result = caseBaseObject(synchronousServerCall);
				if (result == null) result = caseIAnnotatable(synchronousServerCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL: {
				AsynchronousServerCall asynchronousServerCall = (AsynchronousServerCall)theEObject;
				T1 result = caseAsynchronousServerCall(asynchronousServerCall);
				if (result == null) result = caseServerCall(asynchronousServerCall);
				if (result == null) result = caseRunnableItem(asynchronousServerCall);
				if (result == null) result = caseBaseObject(asynchronousServerCall);
				if (result == null) result = caseIAnnotatable(asynchronousServerCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_PROBABILITY_SWITCH: {
				RunnableProbabilitySwitch runnableProbabilitySwitch = (RunnableProbabilitySwitch)theEObject;
				T1 result = caseRunnableProbabilitySwitch(runnableProbabilitySwitch);
				if (result == null) result = caseRunnableItem(runnableProbabilitySwitch);
				if (result == null) result = caseBaseObject(runnableProbabilitySwitch);
				if (result == null) result = caseIAnnotatable(runnableProbabilitySwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.GROUP: {
				Group group = (Group)theEObject;
				T1 result = caseGroup(group);
				if (result == null) result = caseRunnableItem(group);
				if (result == null) result = caseBaseObject(group);
				if (result == null) result = caseIAnnotatable(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_CALL: {
				RunnableCall runnableCall = (RunnableCall)theEObject;
				T1 result = caseRunnableCall(runnableCall);
				if (result == null) result = caseRunnableItem(runnableCall);
				if (result == null) result = caseBaseObject(runnableCall);
				if (result == null) result = caseIAnnotatable(runnableCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T1 result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPOUND_TYPE: {
				CompoundType compoundType = (CompoundType)theEObject;
				T1 result = caseCompoundType(compoundType);
				if (result == null) result = caseDataType(compoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STRUCT: {
				Struct struct = (Struct)theEObject;
				T1 result = caseStruct(struct);
				if (result == null) result = caseCompoundType(struct);
				if (result == null) result = caseBaseObject(struct);
				if (result == null) result = caseDataType(struct);
				if (result == null) result = caseIAnnotatable(struct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STRUCT_ENTRY: {
				StructEntry structEntry = (StructEntry)theEObject;
				T1 result = caseStructEntry(structEntry);
				if (result == null) result = caseBaseObject(structEntry);
				if (result == null) result = caseIAnnotatable(structEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ARRAY: {
				Array array = (Array)theEObject;
				T1 result = caseArray(array);
				if (result == null) result = caseCompoundType(array);
				if (result == null) result = caseBaseObject(array);
				if (result == null) result = caseDataType(array);
				if (result == null) result = caseIAnnotatable(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.POINTER: {
				Pointer pointer = (Pointer)theEObject;
				T1 result = casePointer(pointer);
				if (result == null) result = caseCompoundType(pointer);
				if (result == null) result = caseBaseObject(pointer);
				if (result == null) result = caseDataType(pointer);
				if (result == null) result = caseIAnnotatable(pointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TYPE_REF: {
				TypeRef typeRef = (TypeRef)theEObject;
				T1 result = caseTypeRef(typeRef);
				if (result == null) result = caseDataType(typeRef);
				if (result == null) result = caseBaseObject(typeRef);
				if (result == null) result = caseIAnnotatable(typeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_PLATFORM_MAPPING: {
				DataPlatformMapping dataPlatformMapping = (DataPlatformMapping)theEObject;
				T1 result = caseDataPlatformMapping(dataPlatformMapping);
				if (result == null) result = caseBaseObject(dataPlatformMapping);
				if (result == null) result = caseIAnnotatable(dataPlatformMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T1 result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseReferableBaseObject(typeDefinition);
				if (result == null) result = caseIAnnotatable(typeDefinition);
				if (result == null) result = caseIReferable(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_TYPE_DEFINITION: {
				DataTypeDefinition dataTypeDefinition = (DataTypeDefinition)theEObject;
				T1 result = caseDataTypeDefinition(dataTypeDefinition);
				if (result == null) result = caseTypeDefinition(dataTypeDefinition);
				if (result == null) result = caseReferableBaseObject(dataTypeDefinition);
				if (result == null) result = caseIAnnotatable(dataTypeDefinition);
				if (result == null) result = caseIReferable(dataTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BASE_TYPE_DEFINITION: {
				BaseTypeDefinition baseTypeDefinition = (BaseTypeDefinition)theEObject;
				T1 result = caseBaseTypeDefinition(baseTypeDefinition);
				if (result == null) result = caseTypeDefinition(baseTypeDefinition);
				if (result == null) result = caseReferableBaseObject(baseTypeDefinition);
				if (result == null) result = caseIAnnotatable(baseTypeDefinition);
				if (result == null) result = caseIReferable(baseTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ACTIVATION: {
				Activation activation = (Activation)theEObject;
				T1 result = caseActivation(activation);
				if (result == null) result = caseReferableBaseObject(activation);
				if (result == null) result = caseITaggable(activation);
				if (result == null) result = caseIAnnotatable(activation);
				if (result == null) result = caseIReferable(activation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PERIODIC_ACTIVATION: {
				PeriodicActivation periodicActivation = (PeriodicActivation)theEObject;
				T1 result = casePeriodicActivation(periodicActivation);
				if (result == null) result = caseActivation(periodicActivation);
				if (result == null) result = caseReferableBaseObject(periodicActivation);
				if (result == null) result = caseITaggable(periodicActivation);
				if (result == null) result = caseIAnnotatable(periodicActivation);
				if (result == null) result = caseIReferable(periodicActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SPORADIC_ACTIVATION: {
				SporadicActivation sporadicActivation = (SporadicActivation)theEObject;
				T1 result = caseSporadicActivation(sporadicActivation);
				if (result == null) result = caseActivation(sporadicActivation);
				if (result == null) result = caseReferableBaseObject(sporadicActivation);
				if (result == null) result = caseITaggable(sporadicActivation);
				if (result == null) result = caseIAnnotatable(sporadicActivation);
				if (result == null) result = caseIReferable(sporadicActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SINGLE_ACTIVATION: {
				SingleActivation singleActivation = (SingleActivation)theEObject;
				T1 result = caseSingleActivation(singleActivation);
				if (result == null) result = caseActivation(singleActivation);
				if (result == null) result = caseReferableBaseObject(singleActivation);
				if (result == null) result = caseITaggable(singleActivation);
				if (result == null) result = caseIAnnotatable(singleActivation);
				if (result == null) result = caseIReferable(singleActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_ACTIVATION: {
				EventActivation eventActivation = (EventActivation)theEObject;
				T1 result = caseEventActivation(eventActivation);
				if (result == null) result = caseActivation(eventActivation);
				if (result == null) result = caseReferableBaseObject(eventActivation);
				if (result == null) result = caseITaggable(eventActivation);
				if (result == null) result = caseIAnnotatable(eventActivation);
				if (result == null) result = caseIReferable(eventActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_ACTIVATION: {
				CustomActivation customActivation = (CustomActivation)theEObject;
				T1 result = caseCustomActivation(customActivation);
				if (result == null) result = caseActivation(customActivation);
				if (result == null) result = caseReferableBaseObject(customActivation);
				if (result == null) result = caseITaggable(customActivation);
				if (result == null) result = caseIAnnotatable(customActivation);
				if (result == null) result = caseIReferable(customActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC: {
				LabelAccessStatistic labelAccessStatistic = (LabelAccessStatistic)theEObject;
				T1 result = caseLabelAccessStatistic(labelAccessStatistic);
				if (result == null) result = caseBaseObject(labelAccessStatistic);
				if (result == null) result = caseIAnnotatable(labelAccessStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INSTRUCTION_FETCH: {
				InstructionFetch instructionFetch = (InstructionFetch)theEObject;
				T1 result = caseInstructionFetch(instructionFetch);
				if (result == null) result = caseBaseObject(instructionFetch);
				if (result == null) result = caseIAnnotatable(instructionFetch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUN_ENTITY_CALL_STATISTIC: {
				RunEntityCallStatistic runEntityCallStatistic = (RunEntityCallStatistic)theEObject;
				T1 result = caseRunEntityCallStatistic(runEntityCallStatistic);
				if (result == null) result = caseBaseObject(runEntityCallStatistic);
				if (result == null) result = caseIAnnotatable(runEntityCallStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amalthea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amalthea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAmalthea(Amalthea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommonElements(CommonElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBaseObject(BaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReferableObject(ReferableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referable Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referable Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReferableBaseObject(ReferableBaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAnnotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIAnnotatable(IAnnotatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITaggable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITaggable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseITaggable(ITaggable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IReferable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IReferable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIReferable(IReferable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDisplay Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDisplay Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIDisplayName(IDisplayName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoreClassifier(CoreClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMemoryClassifier(MemoryClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInstructions(Instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransmissionPolicy(TransmissionPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInstructionsDeviation(InstructionsDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInstructionsConstant(InstructionsConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimeComparable(Comparable<AbstractTime> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractTime(AbstractTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFrequency(Frequency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataSize(DataSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataRate(DataRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCustomProperty(Map.Entry<String, Value> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseListObject(ListObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringObject(StringObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Integer Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Integer Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBigIntegerObject(BigIntegerObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReferenceObject(ReferenceObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerObject(IntegerObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLongObject(LongObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloatObject(FloatObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDoubleObject(DoubleObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanObject(BooleanObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimeObject(TimeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseDeviation(Deviation<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseDistribution(Distribution<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weibull Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weibull Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseWeibullDistribution(WeibullDistribution<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weibull Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weibull Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseWeibullParameters(WeibullParameters<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weibull Estimators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weibull Estimators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseWeibullEstimators(WeibullEstimators<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniform Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniform Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseUniformDistribution(UniformDistribution<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundaries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundaries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseBoundaries(Boundaries<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gauss Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gauss Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseGaussDistribution(GaussDistribution<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beta Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beta Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseBetaDistribution(BetaDistribution<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Statistic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumericStatistic(NumericStatistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Avg Max Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Avg Max Statistic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMinAvgMaxStatistic(MinAvgMaxStatistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value Statistic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleValueStatistic(SingleValueStatistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeLiteral(ModeLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComponentsModel(ComponentsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseINamedElement(INamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISystem(ISystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystem(org.eclipse.app4mc.amalthea.model.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQualifiedPort(QualifiedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FInterface Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FInterface Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFInterfacePort(FInterfacePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConfigModel(ConfigModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventConfig(EventConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConstraintsModel(ConstraintsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Sequencing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Sequencing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableSequencingConstraint(RunnableSequencingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affinity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affinity Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAffinityConstraint(AffinityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Separation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Separation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSeparationConstraint(SeparationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pairing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pairing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePairingConstraint(PairingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessConstraint(ProcessConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableConstraint(RunnableConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataConstraint(DataConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Separation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Separation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableSeparationConstraint(RunnableSeparationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Separation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Separation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessSeparationConstraint(ProcessSeparationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Separation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Separation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataSeparationConstraint(DataSeparationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Pairing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Pairing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnablePairingConstraint(RunnablePairingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Pairing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Pairing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessPairingConstraint(ProcessPairingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pairing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pairing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataPairingConstraint(DataPairingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Constraint Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Constraint Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableConstraintTarget(RunnableConstraintTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Constraint Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Constraint Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessConstraintTarget(ProcessConstraintTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Constraint Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Constraint Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataConstraintTarget(DataConstraintTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTargetMemory(TargetMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTargetCore(TargetCore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTargetScheduler(TargetScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelGroup(LabelGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableGroup(RunnableGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessGroup(ProcessGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Entity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Entity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelEntityGroup(LabelEntityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Entity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Entity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableEntityGroup(RunnableEntityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Entity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Entity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessEntityGroup(ProcessEntityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTagGroup(TagGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractEventChain(AbstractEventChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventChain(EventChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Event Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Event Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSubEventChain(SubEventChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventChainItem(EventChainItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventChainReference(EventChainReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventChainContainer(EventChainContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimingConstraint(TimingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Section Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Section Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePhysicalSectionConstraint(PhysicalSectionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSynchronizationConstraint(SynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventSynchronizationConstraint(EventSynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventChainSynchronizationConstraint(EventChainSynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDelayConstraint(DelayConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Latency Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Latency Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventChainLatencyConstraint(EventChainLatencyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repetition Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRepetitionConstraint(RepetitionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Age Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Age Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataAgeConstraint(DataAgeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Age</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Age</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataAge(DataAge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Age Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Age Cycle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataAgeCycle(DataAgeCycle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Age Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Age Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataAgeTime(DataAgeTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessRequirement(ProcessRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableRequirement(RunnableRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchitectureRequirement(ArchitectureRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Chain Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Chain Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessChainRequirement(ProcessChainRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRequirementLimit(RequirementLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU Percentage Requirement Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU Percentage Requirement Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCPUPercentageRequirementLimit(CPUPercentageRequirementLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Requirement Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Requirement Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFrequencyRequirementLimit(FrequencyRequirementLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Percentage Requirement Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Percentage Requirement Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePercentageRequirementLimit(PercentageRequirementLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Requirement Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Requirement Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCountRequirementLimit(CountRequirementLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Requirement Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Requirement Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimeRequirementLimit(TimeRequirementLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Coherency Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Coherency Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataCoherencyGroup(DataCoherencyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Stability Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Stability Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataStabilityGroup(DataStabilityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Group Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Group Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataGroupScope(DataGroupScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessScope(ProcessScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableScope(RunnableScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComponentScope(ComponentScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventModel(EventModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventSet(EventSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEntityEvent(EntityEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTriggerEvent(TriggerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCustomEvent(CustomEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStimulusEvent(StimulusEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessEvent(ProcessEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Chain Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Chain Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessChainEvent(ProcessChainEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableEvent(RunnableEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelEvent(LabelEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChannelEvent(ChannelEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semaphore Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semaphore Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSemaphoreEvent(SemaphoreEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHWModel(HWModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComplexNode(ComplexNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHwSystem(HwSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseECU(ECU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microcontroller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMicrocontroller(Microcontroller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCore(Core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quartz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quartz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQuartz(Quartz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHwComponent(HwComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Type Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Type Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHardwareTypeDescription(HardwareTypeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractionType(AbstractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSystemType(SystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECU Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECU Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseECUType(ECUType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microcontroller Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microcontroller Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMicrocontrollerType(MicrocontrollerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoreType(CoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMemoryType(MemoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNetworkType(NetworkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHwPort(HwPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComplexPort(ComplexPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComplexPin(ComplexPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescaler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescaler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePrescaler(Prescaler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crossbar Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crossbar Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCrossbarSwitch(CrossbarSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBridge(Bridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAccessPath(AccessPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency Access Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency Access Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLatencyAccessPath(LatencyAccessPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Access Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Access Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHwAccessPath(HwAccessPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency Access Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency Access Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLatencyAccessPathElement(LatencyAccessPathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Path Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAccessPathRef(AccessPathRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLatency(Latency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLatencyConstant(LatencyConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLatencyDeviation(LatencyDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Access Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Access Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHwAccessPathElement(HwAccessPathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Access Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Access Path Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHwAccessPathRef(HwAccessPathRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHwElementRef(HwElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMappingModel(MappingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSchedulerAllocation(SchedulerAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskAllocation(TaskAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISR Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISR Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISRAllocation(ISRAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableAllocation(RunnableAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMemoryMapping(MemoryMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Section Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Section Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePhysicalSectionMapping(PhysicalSectionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOSModel(OSModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Data Consistency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Data Consistency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOsDataConsistency(OsDataConsistency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Stability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Stability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataStability(DataStability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Atomic Data Coherency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Atomic Data Coherency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNonAtomicDataCoherency(NonAtomicDataCoherency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semaphore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semaphore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSemaphore(Semaphore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseScheduler(Scheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computation Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computation Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComputationItem(ComputationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskScheduler(TaskScheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSchedulerAssociation(SchedulerAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterruptController(InterruptController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSchedulingParameters(SchedulingParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameterExtension(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAlgorithm(Algorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt Scheduling Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt Scheduling Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterruptSchedulingAlgorithm(InterruptSchedulingAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Scheduling Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Scheduling Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskSchedulingAlgorithm(TaskSchedulingAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFixedPriority(FixedPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Priority Preemptive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Priority Preemptive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFixedPriorityPreemptive(FixedPriorityPreemptive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSEK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSEK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOSEK(OSEK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline Monotonic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline Monotonic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDeadlineMonotonic(DeadlineMonotonic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Monotonic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Monotonic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRateMonotonic(RateMonotonic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pfair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pfair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePfair(Pfair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pfair PD2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pfair PD2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePfairPD2(PfairPD2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partly PFair PD2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partly PFair PD2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePartlyPFairPD2(PartlyPFairPD2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Early Release Fair PD2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Early Release Fair PD2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEarlyReleaseFairPD2(EarlyReleaseFairPD2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partly Early Release Fair PD2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partly Early Release Fair PD2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePartlyEarlyReleaseFairPD2(PartlyEarlyReleaseFairPD2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDynamicPriority(DynamicPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Least Local Remaining Execution Time First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Least Local Remaining Execution Time First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLeastLocalRemainingExecutionTimeFirst(LeastLocalRemainingExecutionTimeFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earliest Deadline First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earliest Deadline First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEarliestDeadlineFirst(EarliestDeadlineFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Based Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Based Round Robin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePriorityBasedRoundRobin(PriorityBasedRoundRobin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Based Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Based Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReservationBasedServer(ReservationBasedServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deferrable Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deferrable Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDeferrableServer(DeferrableServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polling Periodic Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polling Periodic Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePollingPeriodicServer(PollingPeriodicServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSporadicServer(SporadicServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Bandwidth Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Bandwidth Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConstantBandwidthServer(ConstantBandwidthServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Bandwidth Server With CASH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Bandwidth Server With CASH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConstantBandwidthServerWithCASH(ConstantBandwidthServerWithCASH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGrouping(Grouping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Specific Scheduling Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Specific Scheduling Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUserSpecificSchedulingAlgorithm(UserSpecificSchedulingAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Based</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Based</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePriorityBased(PriorityBased object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOperatingSystem(OperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Operating System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVendorOperatingSystem(VendorOperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOsInstructions(OsInstructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os API Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os API Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOsAPIInstructions(OsAPIInstructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os ISR Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os ISR Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOsISRInstructions(OsISRInstructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Constraints Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Constraints Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyConstraintsModel(PropertyConstraintsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Allocation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoreAllocationConstraint(CoreAllocationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Mapping Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Mapping Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMemoryMappingConstraint(MemoryMappingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Allocation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessAllocationConstraint(ProcessAllocationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Prototype Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Prototype Allocation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessPrototypeAllocationConstraint(ProcessPrototypeAllocationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Allocation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableAllocationConstraint(RunnableAllocationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Element Mapping Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Element Mapping Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractElementMappingConstraint(AbstractElementMappingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassification(Classification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoreClassification(CoreClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMemoryClassification(MemoryClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimuli Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimuli Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStimuliModel(StimuliModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStimulus(Stimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Value List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Value List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeValueList(ModeValueList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Value List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Value List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeValueListEntry(ModeValueListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeValue(ModeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Value Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Value Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeValueConjunction(ModeValueConjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Value Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Value Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeValueDisjunction(ModeValueDisjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePeriodicStimulus(PeriodicStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Rate Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Rate Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableRateStimulus(VariableRateStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synthetic Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synthetic Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSyntheticStimulus(SyntheticStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimestampList(TimestampList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCustomStimulus(CustomStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleStimulus(SingleStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Process Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Process Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterProcessStimulus(InterProcessStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSporadicStimulus(SporadicStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventStimulus(EventStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrival Curve Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrival Curve Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArrivalCurveStimulus(ArrivalCurveStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrival Curve Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrival Curve Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArrivalCurveEntry(ArrivalCurveEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Triangle Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Triangle Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClockTriangleFunction(ClockTriangleFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Sinus Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Sinus Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClockSinusFunction(ClockSinusFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Multiplier List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Multiplier List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClockMultiplierList(ClockMultiplierList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Multiplier List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Multiplier List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClockMultiplierListEntry(ClockMultiplierListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SW Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SW Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSWModel(SWModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Memory Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Memory Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractMemoryElement(AbstractMemoryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractProcess(AbstractProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCustomEntity(CustomEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessChain(ProcessChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcess(org.eclipse.app4mc.amalthea.model.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCallGraph(CallGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Entry Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Entry Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphEntryBase(GraphEntryBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCallSequence(CallSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeSwitch(ModeSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Switch Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Switch Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseModeSwitchEntry(ModeSwitchEntry<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Switch Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Switch Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseModeSwitchDefault(ModeSwitchDefault<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probability Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probability Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProbabilitySwitch(ProbabilitySwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probability Switch Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probability Switch Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseProbabilitySwitchEntry(ProbabilitySwitchEntry<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Sequence Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Sequence Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCallSequenceItem(CallSequenceItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWaitEvent(WaitEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSetEvent(SetEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClearEvent(ClearEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventMask(EventMask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOsEvent(OsEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Process Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Process Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterProcessTrigger(InterProcessTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enforced Migration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enforced Migration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnforcedMigration(EnforcedMigration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Runnable Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Runnable Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskRunnableCall(TaskRunnableCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSchedulePoint(SchedulePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminate Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminate Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTerminateProcess(TerminateProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISR(ISR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessPrototype(ProcessPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chained Process Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chained Process Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChainedProcessPrototype(ChainedProcessPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeneralPrecedence(GeneralPrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Precedence Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Precedence Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAccessPrecedenceSpec(AccessPrecedenceSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Precedence Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Precedence Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOrderPrecedenceSpec(OrderPrecedenceSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnable(org.eclipse.app4mc.amalthea.model.Runnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeLabel(ModeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableItem(RunnableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableInstructions(RunnableInstructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Instructions Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Instructions Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableInstructionsEntry(Map.Entry<CoreType, Instructions> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Label Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Label Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModeLabelAccess(ModeLabelAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Mode Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Mode Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableModeSwitch(RunnableModeSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelAccess(LabelAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChannelAccess(ChannelAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChannelSend(ChannelSend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Receive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Receive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChannelReceive(ChannelReceive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semaphore Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semaphore Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSemaphoreAccess(SemaphoreAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSenderReceiverCommunication(SenderReceiverCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSenderReceiverRead(SenderReceiverRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Receiver Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Receiver Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSenderReceiverWrite(SenderReceiverWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseServerCall(ServerCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Server Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Server Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSynchronousServerCall(SynchronousServerCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynchronous Server Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynchronous Server Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAsynchronousServerCall(AsynchronousServerCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Probability Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Probability Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableProbabilitySwitch(RunnableProbabilitySwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunnableCall(RunnableCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompoundType(CompoundType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStruct(Struct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStructEntry(StructEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePointer(Pointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypeRef(TypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Platform Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Platform Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataPlatformMapping(DataPlatformMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataTypeDefinition(DataTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBaseTypeDefinition(BaseTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActivation(Activation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePeriodicActivation(PeriodicActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSporadicActivation(SporadicActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleActivation(SingleActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventActivation(EventActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCustomActivation(CustomActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Access Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Access Statistic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelAccessStatistic(LabelAccessStatistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Fetch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Fetch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInstructionFetch(InstructionFetch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Entity Call Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Entity Call Statistic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRunEntityCallStatistic(RunEntityCallStatistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //AmaltheaSwitch
