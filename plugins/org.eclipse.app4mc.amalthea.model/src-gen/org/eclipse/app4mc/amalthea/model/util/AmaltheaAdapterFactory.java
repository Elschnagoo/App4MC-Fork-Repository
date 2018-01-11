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
import org.eclipse.app4mc.amalthea.model.ComponentEvent;
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
import org.eclipse.app4mc.amalthea.model.CustomEventTrigger;
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
import org.eclipse.app4mc.amalthea.model.EventChainMeasurement;
import org.eclipse.app4mc.amalthea.model.EventChainReference;
import org.eclipse.app4mc.amalthea.model.EventChainSynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.EventConfig;
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.EventSet;
import org.eclipse.app4mc.amalthea.model.EventStimulus;
import org.eclipse.app4mc.amalthea.model.EventSynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.FixedPriority;
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptive;
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptiveWithBudgetEnforcement;
import org.eclipse.app4mc.amalthea.model.FloatObject;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.GeneralPrecedence;
import org.eclipse.app4mc.amalthea.model.GetResultServerCall;
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
import org.eclipse.app4mc.amalthea.model.INamed;
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
import org.eclipse.app4mc.amalthea.model.InterfacePort;
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
import org.eclipse.app4mc.amalthea.model.Measurement;
import org.eclipse.app4mc.amalthea.model.MeasurementModel;
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
import org.eclipse.app4mc.amalthea.model.ModeValueDisjunctionEntry;
import org.eclipse.app4mc.amalthea.model.ModeValueList;
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
import org.eclipse.app4mc.amalthea.model.Quantity;
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
import org.eclipse.app4mc.amalthea.model.RunnableMeasurement;
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
import org.eclipse.app4mc.amalthea.model.TaskMeasurement;
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
import org.eclipse.app4mc.amalthea.model.VariableRateActivation;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.VendorOperatingSystem;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.WeibullDistribution;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage
 * @generated
 */
public class AmaltheaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmaltheaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmaltheaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AmaltheaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmaltheaSwitch<Adapter> modelSwitch =
		new AmaltheaSwitch<Adapter>() {
			@Override
			public Adapter caseAmalthea(Amalthea object) {
				return createAmaltheaAdapter();
			}
			@Override
			public Adapter caseCommonElements(CommonElements object) {
				return createCommonElementsAdapter();
			}
			@Override
			public Adapter caseBaseObject(BaseObject object) {
				return createBaseObjectAdapter();
			}
			@Override
			public Adapter caseReferableObject(ReferableObject object) {
				return createReferableObjectAdapter();
			}
			@Override
			public Adapter caseReferableBaseObject(ReferableBaseObject object) {
				return createReferableBaseObjectAdapter();
			}
			@Override
			public Adapter caseIAnnotatable(IAnnotatable object) {
				return createIAnnotatableAdapter();
			}
			@Override
			public Adapter caseITaggable(ITaggable object) {
				return createITaggableAdapter();
			}
			@Override
			public Adapter caseINamed(INamed object) {
				return createINamedAdapter();
			}
			@Override
			public Adapter caseIReferable(IReferable object) {
				return createIReferableAdapter();
			}
			@Override
			public Adapter caseIDisplayName(IDisplayName object) {
				return createIDisplayNameAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseCoreClassifier(CoreClassifier object) {
				return createCoreClassifierAdapter();
			}
			@Override
			public Adapter caseMemoryClassifier(MemoryClassifier object) {
				return createMemoryClassifierAdapter();
			}
			@Override
			public Adapter caseInstructions(Instructions object) {
				return createInstructionsAdapter();
			}
			@Override
			public Adapter caseTransmissionPolicy(TransmissionPolicy object) {
				return createTransmissionPolicyAdapter();
			}
			@Override
			public Adapter caseInstructionsDeviation(InstructionsDeviation object) {
				return createInstructionsDeviationAdapter();
			}
			@Override
			public Adapter caseInstructionsConstant(InstructionsConstant object) {
				return createInstructionsConstantAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseTimeComparable(Comparable<AbstractTime> object) {
				return createTimeComparableAdapter();
			}
			@Override
			public Adapter caseAbstractTime(AbstractTime object) {
				return createAbstractTimeAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseFrequency(Frequency object) {
				return createFrequencyAdapter();
			}
			@Override
			public Adapter caseDataSize(DataSize object) {
				return createDataSizeAdapter();
			}
			@Override
			public Adapter caseDataRate(DataRate object) {
				return createDataRateAdapter();
			}
			@Override
			public Adapter caseCustomProperty(Map.Entry<String, Value> object) {
				return createCustomPropertyAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseListObject(ListObject object) {
				return createListObjectAdapter();
			}
			@Override
			public Adapter caseStringObject(StringObject object) {
				return createStringObjectAdapter();
			}
			@Override
			public Adapter caseBigIntegerObject(BigIntegerObject object) {
				return createBigIntegerObjectAdapter();
			}
			@Override
			public Adapter caseReferenceObject(ReferenceObject object) {
				return createReferenceObjectAdapter();
			}
			@Override
			public Adapter caseIntegerObject(IntegerObject object) {
				return createIntegerObjectAdapter();
			}
			@Override
			public Adapter caseLongObject(LongObject object) {
				return createLongObjectAdapter();
			}
			@Override
			public Adapter caseFloatObject(FloatObject object) {
				return createFloatObjectAdapter();
			}
			@Override
			public Adapter caseDoubleObject(DoubleObject object) {
				return createDoubleObjectAdapter();
			}
			@Override
			public Adapter caseBooleanObject(BooleanObject object) {
				return createBooleanObjectAdapter();
			}
			@Override
			public Adapter caseTimeObject(TimeObject object) {
				return createTimeObjectAdapter();
			}
			@Override
			public <T> Adapter caseDeviation(Deviation<T> object) {
				return createDeviationAdapter();
			}
			@Override
			public <T> Adapter caseDistribution(Distribution<T> object) {
				return createDistributionAdapter();
			}
			@Override
			public <T> Adapter caseWeibullDistribution(WeibullDistribution<T> object) {
				return createWeibullDistributionAdapter();
			}
			@Override
			public <T> Adapter caseWeibullParameters(WeibullParameters<T> object) {
				return createWeibullParametersAdapter();
			}
			@Override
			public <T> Adapter caseWeibullEstimators(WeibullEstimators<T> object) {
				return createWeibullEstimatorsAdapter();
			}
			@Override
			public <T> Adapter caseUniformDistribution(UniformDistribution<T> object) {
				return createUniformDistributionAdapter();
			}
			@Override
			public <T> Adapter caseBoundaries(Boundaries<T> object) {
				return createBoundariesAdapter();
			}
			@Override
			public <T> Adapter caseGaussDistribution(GaussDistribution<T> object) {
				return createGaussDistributionAdapter();
			}
			@Override
			public <T> Adapter caseBetaDistribution(BetaDistribution<T> object) {
				return createBetaDistributionAdapter();
			}
			@Override
			public Adapter caseNumericStatistic(NumericStatistic object) {
				return createNumericStatisticAdapter();
			}
			@Override
			public Adapter caseMinAvgMaxStatistic(MinAvgMaxStatistic object) {
				return createMinAvgMaxStatisticAdapter();
			}
			@Override
			public Adapter caseSingleValueStatistic(SingleValueStatistic object) {
				return createSingleValueStatisticAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseModeLiteral(ModeLiteral object) {
				return createModeLiteralAdapter();
			}
			@Override
			public Adapter caseComponentsModel(ComponentsModel object) {
				return createComponentsModelAdapter();
			}
			@Override
			public Adapter caseISystem(ISystem object) {
				return createISystemAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseSystem(org.eclipse.app4mc.amalthea.model.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseQualifiedPort(QualifiedPort object) {
				return createQualifiedPortAdapter();
			}
			@Override
			public Adapter caseInterfacePort(InterfacePort object) {
				return createInterfacePortAdapter();
			}
			@Override
			public Adapter caseConfigModel(ConfigModel object) {
				return createConfigModelAdapter();
			}
			@Override
			public Adapter caseEventConfig(EventConfig object) {
				return createEventConfigAdapter();
			}
			@Override
			public Adapter caseConstraintsModel(ConstraintsModel object) {
				return createConstraintsModelAdapter();
			}
			@Override
			public Adapter caseRunnableSequencingConstraint(RunnableSequencingConstraint object) {
				return createRunnableSequencingConstraintAdapter();
			}
			@Override
			public Adapter caseAffinityConstraint(AffinityConstraint object) {
				return createAffinityConstraintAdapter();
			}
			@Override
			public Adapter caseSeparationConstraint(SeparationConstraint object) {
				return createSeparationConstraintAdapter();
			}
			@Override
			public Adapter casePairingConstraint(PairingConstraint object) {
				return createPairingConstraintAdapter();
			}
			@Override
			public Adapter caseProcessConstraint(ProcessConstraint object) {
				return createProcessConstraintAdapter();
			}
			@Override
			public Adapter caseRunnableConstraint(RunnableConstraint object) {
				return createRunnableConstraintAdapter();
			}
			@Override
			public Adapter caseDataConstraint(DataConstraint object) {
				return createDataConstraintAdapter();
			}
			@Override
			public Adapter caseRunnableSeparationConstraint(RunnableSeparationConstraint object) {
				return createRunnableSeparationConstraintAdapter();
			}
			@Override
			public Adapter caseProcessSeparationConstraint(ProcessSeparationConstraint object) {
				return createProcessSeparationConstraintAdapter();
			}
			@Override
			public Adapter caseDataSeparationConstraint(DataSeparationConstraint object) {
				return createDataSeparationConstraintAdapter();
			}
			@Override
			public Adapter caseRunnablePairingConstraint(RunnablePairingConstraint object) {
				return createRunnablePairingConstraintAdapter();
			}
			@Override
			public Adapter caseProcessPairingConstraint(ProcessPairingConstraint object) {
				return createProcessPairingConstraintAdapter();
			}
			@Override
			public Adapter caseDataPairingConstraint(DataPairingConstraint object) {
				return createDataPairingConstraintAdapter();
			}
			@Override
			public Adapter caseRunnableConstraintTarget(RunnableConstraintTarget object) {
				return createRunnableConstraintTargetAdapter();
			}
			@Override
			public Adapter caseProcessConstraintTarget(ProcessConstraintTarget object) {
				return createProcessConstraintTargetAdapter();
			}
			@Override
			public Adapter caseDataConstraintTarget(DataConstraintTarget object) {
				return createDataConstraintTargetAdapter();
			}
			@Override
			public Adapter caseTargetMemory(TargetMemory object) {
				return createTargetMemoryAdapter();
			}
			@Override
			public Adapter caseTargetCore(TargetCore object) {
				return createTargetCoreAdapter();
			}
			@Override
			public Adapter caseTargetScheduler(TargetScheduler object) {
				return createTargetSchedulerAdapter();
			}
			@Override
			public Adapter caseLabelGroup(LabelGroup object) {
				return createLabelGroupAdapter();
			}
			@Override
			public Adapter caseRunnableGroup(RunnableGroup object) {
				return createRunnableGroupAdapter();
			}
			@Override
			public Adapter caseProcessGroup(ProcessGroup object) {
				return createProcessGroupAdapter();
			}
			@Override
			public Adapter caseLabelEntityGroup(LabelEntityGroup object) {
				return createLabelEntityGroupAdapter();
			}
			@Override
			public Adapter caseRunnableEntityGroup(RunnableEntityGroup object) {
				return createRunnableEntityGroupAdapter();
			}
			@Override
			public Adapter caseProcessEntityGroup(ProcessEntityGroup object) {
				return createProcessEntityGroupAdapter();
			}
			@Override
			public Adapter caseTagGroup(TagGroup object) {
				return createTagGroupAdapter();
			}
			@Override
			public Adapter caseAbstractEventChain(AbstractEventChain object) {
				return createAbstractEventChainAdapter();
			}
			@Override
			public Adapter caseEventChain(EventChain object) {
				return createEventChainAdapter();
			}
			@Override
			public Adapter caseSubEventChain(SubEventChain object) {
				return createSubEventChainAdapter();
			}
			@Override
			public Adapter caseEventChainItem(EventChainItem object) {
				return createEventChainItemAdapter();
			}
			@Override
			public Adapter caseEventChainReference(EventChainReference object) {
				return createEventChainReferenceAdapter();
			}
			@Override
			public Adapter caseEventChainContainer(EventChainContainer object) {
				return createEventChainContainerAdapter();
			}
			@Override
			public Adapter caseTimingConstraint(TimingConstraint object) {
				return createTimingConstraintAdapter();
			}
			@Override
			public Adapter casePhysicalSectionConstraint(PhysicalSectionConstraint object) {
				return createPhysicalSectionConstraintAdapter();
			}
			@Override
			public Adapter caseSynchronizationConstraint(SynchronizationConstraint object) {
				return createSynchronizationConstraintAdapter();
			}
			@Override
			public Adapter caseEventSynchronizationConstraint(EventSynchronizationConstraint object) {
				return createEventSynchronizationConstraintAdapter();
			}
			@Override
			public Adapter caseEventChainSynchronizationConstraint(EventChainSynchronizationConstraint object) {
				return createEventChainSynchronizationConstraintAdapter();
			}
			@Override
			public Adapter caseDelayConstraint(DelayConstraint object) {
				return createDelayConstraintAdapter();
			}
			@Override
			public Adapter caseEventChainLatencyConstraint(EventChainLatencyConstraint object) {
				return createEventChainLatencyConstraintAdapter();
			}
			@Override
			public Adapter caseRepetitionConstraint(RepetitionConstraint object) {
				return createRepetitionConstraintAdapter();
			}
			@Override
			public Adapter caseDataAgeConstraint(DataAgeConstraint object) {
				return createDataAgeConstraintAdapter();
			}
			@Override
			public Adapter caseDataAge(DataAge object) {
				return createDataAgeAdapter();
			}
			@Override
			public Adapter caseDataAgeCycle(DataAgeCycle object) {
				return createDataAgeCycleAdapter();
			}
			@Override
			public Adapter caseDataAgeTime(DataAgeTime object) {
				return createDataAgeTimeAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseProcessRequirement(ProcessRequirement object) {
				return createProcessRequirementAdapter();
			}
			@Override
			public Adapter caseRunnableRequirement(RunnableRequirement object) {
				return createRunnableRequirementAdapter();
			}
			@Override
			public Adapter caseArchitectureRequirement(ArchitectureRequirement object) {
				return createArchitectureRequirementAdapter();
			}
			@Override
			public Adapter caseProcessChainRequirement(ProcessChainRequirement object) {
				return createProcessChainRequirementAdapter();
			}
			@Override
			public Adapter caseRequirementLimit(RequirementLimit object) {
				return createRequirementLimitAdapter();
			}
			@Override
			public Adapter caseCPUPercentageRequirementLimit(CPUPercentageRequirementLimit object) {
				return createCPUPercentageRequirementLimitAdapter();
			}
			@Override
			public Adapter caseFrequencyRequirementLimit(FrequencyRequirementLimit object) {
				return createFrequencyRequirementLimitAdapter();
			}
			@Override
			public Adapter casePercentageRequirementLimit(PercentageRequirementLimit object) {
				return createPercentageRequirementLimitAdapter();
			}
			@Override
			public Adapter caseCountRequirementLimit(CountRequirementLimit object) {
				return createCountRequirementLimitAdapter();
			}
			@Override
			public Adapter caseTimeRequirementLimit(TimeRequirementLimit object) {
				return createTimeRequirementLimitAdapter();
			}
			@Override
			public Adapter caseDataCoherencyGroup(DataCoherencyGroup object) {
				return createDataCoherencyGroupAdapter();
			}
			@Override
			public Adapter caseDataStabilityGroup(DataStabilityGroup object) {
				return createDataStabilityGroupAdapter();
			}
			@Override
			public Adapter caseDataGroupScope(DataGroupScope object) {
				return createDataGroupScopeAdapter();
			}
			@Override
			public Adapter caseProcessScope(ProcessScope object) {
				return createProcessScopeAdapter();
			}
			@Override
			public Adapter caseRunnableScope(RunnableScope object) {
				return createRunnableScopeAdapter();
			}
			@Override
			public Adapter caseComponentScope(ComponentScope object) {
				return createComponentScopeAdapter();
			}
			@Override
			public Adapter caseEventModel(EventModel object) {
				return createEventModelAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventSet(EventSet object) {
				return createEventSetAdapter();
			}
			@Override
			public Adapter caseEntityEvent(EntityEvent object) {
				return createEntityEventAdapter();
			}
			@Override
			public Adapter caseTriggerEvent(TriggerEvent object) {
				return createTriggerEventAdapter();
			}
			@Override
			public Adapter caseCustomEvent(CustomEvent object) {
				return createCustomEventAdapter();
			}
			@Override
			public Adapter caseStimulusEvent(StimulusEvent object) {
				return createStimulusEventAdapter();
			}
			@Override
			public Adapter caseProcessEvent(ProcessEvent object) {
				return createProcessEventAdapter();
			}
			@Override
			public Adapter caseProcessChainEvent(ProcessChainEvent object) {
				return createProcessChainEventAdapter();
			}
			@Override
			public Adapter caseRunnableEvent(RunnableEvent object) {
				return createRunnableEventAdapter();
			}
			@Override
			public Adapter caseLabelEvent(LabelEvent object) {
				return createLabelEventAdapter();
			}
			@Override
			public Adapter caseChannelEvent(ChannelEvent object) {
				return createChannelEventAdapter();
			}
			@Override
			public Adapter caseSemaphoreEvent(SemaphoreEvent object) {
				return createSemaphoreEventAdapter();
			}
			@Override
			public Adapter caseComponentEvent(ComponentEvent object) {
				return createComponentEventAdapter();
			}
			@Override
			public Adapter caseHWModel(HWModel object) {
				return createHWModelAdapter();
			}
			@Override
			public Adapter caseComplexNode(ComplexNode object) {
				return createComplexNodeAdapter();
			}
			@Override
			public Adapter caseHwSystem(HwSystem object) {
				return createHwSystemAdapter();
			}
			@Override
			public Adapter caseECU(ECU object) {
				return createECUAdapter();
			}
			@Override
			public Adapter caseMicrocontroller(Microcontroller object) {
				return createMicrocontrollerAdapter();
			}
			@Override
			public Adapter caseCore(Core object) {
				return createCoreAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseQuartz(Quartz object) {
				return createQuartzAdapter();
			}
			@Override
			public Adapter caseHwComponent(HwComponent object) {
				return createHwComponentAdapter();
			}
			@Override
			public Adapter caseHardwareTypeDescription(HardwareTypeDescription object) {
				return createHardwareTypeDescriptionAdapter();
			}
			@Override
			public Adapter caseAbstractionType(AbstractionType object) {
				return createAbstractionTypeAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseECUType(ECUType object) {
				return createECUTypeAdapter();
			}
			@Override
			public Adapter caseMicrocontrollerType(MicrocontrollerType object) {
				return createMicrocontrollerTypeAdapter();
			}
			@Override
			public Adapter caseCoreType(CoreType object) {
				return createCoreTypeAdapter();
			}
			@Override
			public Adapter caseMemoryType(MemoryType object) {
				return createMemoryTypeAdapter();
			}
			@Override
			public Adapter caseNetworkType(NetworkType object) {
				return createNetworkTypeAdapter();
			}
			@Override
			public Adapter caseHwPort(HwPort object) {
				return createHwPortAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter caseComplexPort(ComplexPort object) {
				return createComplexPortAdapter();
			}
			@Override
			public Adapter caseComplexPin(ComplexPin object) {
				return createComplexPinAdapter();
			}
			@Override
			public Adapter casePrescaler(Prescaler object) {
				return createPrescalerAdapter();
			}
			@Override
			public Adapter caseCrossbarSwitch(CrossbarSwitch object) {
				return createCrossbarSwitchAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseBridge(Bridge object) {
				return createBridgeAdapter();
			}
			@Override
			public Adapter caseAccessPath(AccessPath object) {
				return createAccessPathAdapter();
			}
			@Override
			public Adapter caseLatencyAccessPath(LatencyAccessPath object) {
				return createLatencyAccessPathAdapter();
			}
			@Override
			public Adapter caseHwAccessPath(HwAccessPath object) {
				return createHwAccessPathAdapter();
			}
			@Override
			public Adapter caseLatencyAccessPathElement(LatencyAccessPathElement object) {
				return createLatencyAccessPathElementAdapter();
			}
			@Override
			public Adapter caseAccessPathRef(AccessPathRef object) {
				return createAccessPathRefAdapter();
			}
			@Override
			public Adapter caseLatency(Latency object) {
				return createLatencyAdapter();
			}
			@Override
			public Adapter caseLatencyConstant(LatencyConstant object) {
				return createLatencyConstantAdapter();
			}
			@Override
			public Adapter caseLatencyDeviation(LatencyDeviation object) {
				return createLatencyDeviationAdapter();
			}
			@Override
			public Adapter caseHwAccessPathElement(HwAccessPathElement object) {
				return createHwAccessPathElementAdapter();
			}
			@Override
			public Adapter caseHwAccessPathRef(HwAccessPathRef object) {
				return createHwAccessPathRefAdapter();
			}
			@Override
			public Adapter caseHwElementRef(HwElementRef object) {
				return createHwElementRefAdapter();
			}
			@Override
			public Adapter caseMappingModel(MappingModel object) {
				return createMappingModelAdapter();
			}
			@Override
			public Adapter caseSchedulerAllocation(SchedulerAllocation object) {
				return createSchedulerAllocationAdapter();
			}
			@Override
			public Adapter caseTaskAllocation(TaskAllocation object) {
				return createTaskAllocationAdapter();
			}
			@Override
			public Adapter caseISRAllocation(ISRAllocation object) {
				return createISRAllocationAdapter();
			}
			@Override
			public Adapter caseRunnableAllocation(RunnableAllocation object) {
				return createRunnableAllocationAdapter();
			}
			@Override
			public Adapter caseMemoryMapping(MemoryMapping object) {
				return createMemoryMappingAdapter();
			}
			@Override
			public Adapter casePhysicalSectionMapping(PhysicalSectionMapping object) {
				return createPhysicalSectionMappingAdapter();
			}
			@Override
			public Adapter caseOSModel(OSModel object) {
				return createOSModelAdapter();
			}
			@Override
			public Adapter caseOsDataConsistency(OsDataConsistency object) {
				return createOsDataConsistencyAdapter();
			}
			@Override
			public Adapter caseDataStability(DataStability object) {
				return createDataStabilityAdapter();
			}
			@Override
			public Adapter caseNonAtomicDataCoherency(NonAtomicDataCoherency object) {
				return createNonAtomicDataCoherencyAdapter();
			}
			@Override
			public Adapter caseSemaphore(Semaphore object) {
				return createSemaphoreAdapter();
			}
			@Override
			public Adapter caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			@Override
			public Adapter caseTaskScheduler(TaskScheduler object) {
				return createTaskSchedulerAdapter();
			}
			@Override
			public Adapter caseSchedulerAssociation(SchedulerAssociation object) {
				return createSchedulerAssociationAdapter();
			}
			@Override
			public Adapter caseInterruptController(InterruptController object) {
				return createInterruptControllerAdapter();
			}
			@Override
			public Adapter caseSchedulingParameters(SchedulingParameters object) {
				return createSchedulingParametersAdapter();
			}
			@Override
			public Adapter caseParameterExtension(Map.Entry<String, String> object) {
				return createParameterExtensionAdapter();
			}
			@Override
			public Adapter caseAlgorithm(Algorithm object) {
				return createAlgorithmAdapter();
			}
			@Override
			public Adapter caseInterruptSchedulingAlgorithm(InterruptSchedulingAlgorithm object) {
				return createInterruptSchedulingAlgorithmAdapter();
			}
			@Override
			public Adapter caseTaskSchedulingAlgorithm(TaskSchedulingAlgorithm object) {
				return createTaskSchedulingAlgorithmAdapter();
			}
			@Override
			public Adapter caseFixedPriority(FixedPriority object) {
				return createFixedPriorityAdapter();
			}
			@Override
			public Adapter caseFixedPriorityPreemptive(FixedPriorityPreemptive object) {
				return createFixedPriorityPreemptiveAdapter();
			}
			@Override
			public Adapter caseFixedPriorityPreemptiveWithBudgetEnforcement(FixedPriorityPreemptiveWithBudgetEnforcement object) {
				return createFixedPriorityPreemptiveWithBudgetEnforcementAdapter();
			}
			@Override
			public Adapter caseOSEK(OSEK object) {
				return createOSEKAdapter();
			}
			@Override
			public Adapter caseDeadlineMonotonic(DeadlineMonotonic object) {
				return createDeadlineMonotonicAdapter();
			}
			@Override
			public Adapter caseRateMonotonic(RateMonotonic object) {
				return createRateMonotonicAdapter();
			}
			@Override
			public Adapter casePfair(Pfair object) {
				return createPfairAdapter();
			}
			@Override
			public Adapter casePfairPD2(PfairPD2 object) {
				return createPfairPD2Adapter();
			}
			@Override
			public Adapter casePartlyPFairPD2(PartlyPFairPD2 object) {
				return createPartlyPFairPD2Adapter();
			}
			@Override
			public Adapter caseEarlyReleaseFairPD2(EarlyReleaseFairPD2 object) {
				return createEarlyReleaseFairPD2Adapter();
			}
			@Override
			public Adapter casePartlyEarlyReleaseFairPD2(PartlyEarlyReleaseFairPD2 object) {
				return createPartlyEarlyReleaseFairPD2Adapter();
			}
			@Override
			public Adapter caseDynamicPriority(DynamicPriority object) {
				return createDynamicPriorityAdapter();
			}
			@Override
			public Adapter caseLeastLocalRemainingExecutionTimeFirst(LeastLocalRemainingExecutionTimeFirst object) {
				return createLeastLocalRemainingExecutionTimeFirstAdapter();
			}
			@Override
			public Adapter caseEarliestDeadlineFirst(EarliestDeadlineFirst object) {
				return createEarliestDeadlineFirstAdapter();
			}
			@Override
			public Adapter casePriorityBasedRoundRobin(PriorityBasedRoundRobin object) {
				return createPriorityBasedRoundRobinAdapter();
			}
			@Override
			public Adapter caseReservationBasedServer(ReservationBasedServer object) {
				return createReservationBasedServerAdapter();
			}
			@Override
			public Adapter caseDeferrableServer(DeferrableServer object) {
				return createDeferrableServerAdapter();
			}
			@Override
			public Adapter casePollingPeriodicServer(PollingPeriodicServer object) {
				return createPollingPeriodicServerAdapter();
			}
			@Override
			public Adapter caseSporadicServer(SporadicServer object) {
				return createSporadicServerAdapter();
			}
			@Override
			public Adapter caseConstantBandwidthServer(ConstantBandwidthServer object) {
				return createConstantBandwidthServerAdapter();
			}
			@Override
			public Adapter caseConstantBandwidthServerWithCASH(ConstantBandwidthServerWithCASH object) {
				return createConstantBandwidthServerWithCASHAdapter();
			}
			@Override
			public Adapter caseGrouping(Grouping object) {
				return createGroupingAdapter();
			}
			@Override
			public Adapter caseUserSpecificSchedulingAlgorithm(UserSpecificSchedulingAlgorithm object) {
				return createUserSpecificSchedulingAlgorithmAdapter();
			}
			@Override
			public Adapter casePriorityBased(PriorityBased object) {
				return createPriorityBasedAdapter();
			}
			@Override
			public Adapter caseOperatingSystem(OperatingSystem object) {
				return createOperatingSystemAdapter();
			}
			@Override
			public Adapter caseVendorOperatingSystem(VendorOperatingSystem object) {
				return createVendorOperatingSystemAdapter();
			}
			@Override
			public Adapter caseOsInstructions(OsInstructions object) {
				return createOsInstructionsAdapter();
			}
			@Override
			public Adapter caseOsAPIInstructions(OsAPIInstructions object) {
				return createOsAPIInstructionsAdapter();
			}
			@Override
			public Adapter caseOsISRInstructions(OsISRInstructions object) {
				return createOsISRInstructionsAdapter();
			}
			@Override
			public Adapter casePropertyConstraintsModel(PropertyConstraintsModel object) {
				return createPropertyConstraintsModelAdapter();
			}
			@Override
			public Adapter caseCoreAllocationConstraint(CoreAllocationConstraint object) {
				return createCoreAllocationConstraintAdapter();
			}
			@Override
			public Adapter caseMemoryMappingConstraint(MemoryMappingConstraint object) {
				return createMemoryMappingConstraintAdapter();
			}
			@Override
			public Adapter caseProcessAllocationConstraint(ProcessAllocationConstraint object) {
				return createProcessAllocationConstraintAdapter();
			}
			@Override
			public Adapter caseProcessPrototypeAllocationConstraint(ProcessPrototypeAllocationConstraint object) {
				return createProcessPrototypeAllocationConstraintAdapter();
			}
			@Override
			public Adapter caseRunnableAllocationConstraint(RunnableAllocationConstraint object) {
				return createRunnableAllocationConstraintAdapter();
			}
			@Override
			public Adapter caseAbstractElementMappingConstraint(AbstractElementMappingConstraint object) {
				return createAbstractElementMappingConstraintAdapter();
			}
			@Override
			public Adapter caseClassification(Classification object) {
				return createClassificationAdapter();
			}
			@Override
			public Adapter caseCoreClassification(CoreClassification object) {
				return createCoreClassificationAdapter();
			}
			@Override
			public Adapter caseMemoryClassification(MemoryClassification object) {
				return createMemoryClassificationAdapter();
			}
			@Override
			public Adapter caseStimuliModel(StimuliModel object) {
				return createStimuliModelAdapter();
			}
			@Override
			public Adapter caseStimulus(Stimulus object) {
				return createStimulusAdapter();
			}
			@Override
			public Adapter caseModeValueList(ModeValueList object) {
				return createModeValueListAdapter();
			}
			@Override
			public Adapter caseModeValueMapEntry(Map.Entry<ModeLabel, ModeLiteral> object) {
				return createModeValueMapEntryAdapter();
			}
			@Override
			public Adapter caseModeValueDisjunction(ModeValueDisjunction object) {
				return createModeValueDisjunctionAdapter();
			}
			@Override
			public Adapter caseModeValueDisjunctionEntry(ModeValueDisjunctionEntry object) {
				return createModeValueDisjunctionEntryAdapter();
			}
			@Override
			public Adapter caseModeValue(ModeValue object) {
				return createModeValueAdapter();
			}
			@Override
			public Adapter caseModeValueConjunction(ModeValueConjunction object) {
				return createModeValueConjunctionAdapter();
			}
			@Override
			public Adapter casePeriodicStimulus(PeriodicStimulus object) {
				return createPeriodicStimulusAdapter();
			}
			@Override
			public Adapter caseVariableRateStimulus(VariableRateStimulus object) {
				return createVariableRateStimulusAdapter();
			}
			@Override
			public Adapter caseSyntheticStimulus(SyntheticStimulus object) {
				return createSyntheticStimulusAdapter();
			}
			@Override
			public Adapter caseTimestampList(TimestampList object) {
				return createTimestampListAdapter();
			}
			@Override
			public Adapter caseCustomStimulus(CustomStimulus object) {
				return createCustomStimulusAdapter();
			}
			@Override
			public Adapter caseSingleStimulus(SingleStimulus object) {
				return createSingleStimulusAdapter();
			}
			@Override
			public Adapter caseInterProcessStimulus(InterProcessStimulus object) {
				return createInterProcessStimulusAdapter();
			}
			@Override
			public Adapter caseSporadicStimulus(SporadicStimulus object) {
				return createSporadicStimulusAdapter();
			}
			@Override
			public Adapter caseEventStimulus(EventStimulus object) {
				return createEventStimulusAdapter();
			}
			@Override
			public Adapter caseArrivalCurveStimulus(ArrivalCurveStimulus object) {
				return createArrivalCurveStimulusAdapter();
			}
			@Override
			public Adapter caseArrivalCurveEntry(ArrivalCurveEntry object) {
				return createArrivalCurveEntryAdapter();
			}
			@Override
			public Adapter caseClock(Clock object) {
				return createClockAdapter();
			}
			@Override
			public Adapter caseClockTriangleFunction(ClockTriangleFunction object) {
				return createClockTriangleFunctionAdapter();
			}
			@Override
			public Adapter caseClockSinusFunction(ClockSinusFunction object) {
				return createClockSinusFunctionAdapter();
			}
			@Override
			public Adapter caseClockMultiplierList(ClockMultiplierList object) {
				return createClockMultiplierListAdapter();
			}
			@Override
			public Adapter caseClockMultiplierListEntry(ClockMultiplierListEntry object) {
				return createClockMultiplierListEntryAdapter();
			}
			@Override
			public Adapter caseSWModel(SWModel object) {
				return createSWModelAdapter();
			}
			@Override
			public Adapter caseAbstractMemoryElement(AbstractMemoryElement object) {
				return createAbstractMemoryElementAdapter();
			}
			@Override
			public Adapter caseAbstractProcess(AbstractProcess object) {
				return createAbstractProcessAdapter();
			}
			@Override
			public Adapter caseCustomEntity(CustomEntity object) {
				return createCustomEntityAdapter();
			}
			@Override
			public Adapter caseProcessChain(ProcessChain object) {
				return createProcessChainAdapter();
			}
			@Override
			public Adapter caseProcess(org.eclipse.app4mc.amalthea.model.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseCallGraph(CallGraph object) {
				return createCallGraphAdapter();
			}
			@Override
			public Adapter caseGraphEntryBase(GraphEntryBase object) {
				return createGraphEntryBaseAdapter();
			}
			@Override
			public Adapter caseCallSequence(CallSequence object) {
				return createCallSequenceAdapter();
			}
			@Override
			public Adapter caseModeSwitch(ModeSwitch object) {
				return createModeSwitchAdapter();
			}
			@Override
			public <T> Adapter caseModeSwitchEntry(ModeSwitchEntry<T> object) {
				return createModeSwitchEntryAdapter();
			}
			@Override
			public <T> Adapter caseModeSwitchDefault(ModeSwitchDefault<T> object) {
				return createModeSwitchDefaultAdapter();
			}
			@Override
			public Adapter caseProbabilitySwitch(ProbabilitySwitch object) {
				return createProbabilitySwitchAdapter();
			}
			@Override
			public <T> Adapter caseProbabilitySwitchEntry(ProbabilitySwitchEntry<T> object) {
				return createProbabilitySwitchEntryAdapter();
			}
			@Override
			public Adapter caseCounter(Counter object) {
				return createCounterAdapter();
			}
			@Override
			public Adapter caseCallSequenceItem(CallSequenceItem object) {
				return createCallSequenceItemAdapter();
			}
			@Override
			public Adapter caseWaitEvent(WaitEvent object) {
				return createWaitEventAdapter();
			}
			@Override
			public Adapter caseSetEvent(SetEvent object) {
				return createSetEventAdapter();
			}
			@Override
			public Adapter caseClearEvent(ClearEvent object) {
				return createClearEventAdapter();
			}
			@Override
			public Adapter caseEventMask(EventMask object) {
				return createEventMaskAdapter();
			}
			@Override
			public Adapter caseOsEvent(OsEvent object) {
				return createOsEventAdapter();
			}
			@Override
			public Adapter caseInterProcessTrigger(InterProcessTrigger object) {
				return createInterProcessTriggerAdapter();
			}
			@Override
			public Adapter caseEnforcedMigration(EnforcedMigration object) {
				return createEnforcedMigrationAdapter();
			}
			@Override
			public Adapter caseTaskRunnableCall(TaskRunnableCall object) {
				return createTaskRunnableCallAdapter();
			}
			@Override
			public Adapter caseSchedulePoint(SchedulePoint object) {
				return createSchedulePointAdapter();
			}
			@Override
			public Adapter caseTerminateProcess(TerminateProcess object) {
				return createTerminateProcessAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseISR(ISR object) {
				return createISRAdapter();
			}
			@Override
			public Adapter caseProcessPrototype(ProcessPrototype object) {
				return createProcessPrototypeAdapter();
			}
			@Override
			public Adapter caseChainedProcessPrototype(ChainedProcessPrototype object) {
				return createChainedProcessPrototypeAdapter();
			}
			@Override
			public Adapter caseGeneralPrecedence(GeneralPrecedence object) {
				return createGeneralPrecedenceAdapter();
			}
			@Override
			public Adapter caseAccessPrecedenceSpec(AccessPrecedenceSpec object) {
				return createAccessPrecedenceSpecAdapter();
			}
			@Override
			public Adapter caseOrderPrecedenceSpec(OrderPrecedenceSpec object) {
				return createOrderPrecedenceSpecAdapter();
			}
			@Override
			public Adapter caseRunnable(org.eclipse.app4mc.amalthea.model.Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter caseModeLabel(ModeLabel object) {
				return createModeLabelAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseRunnableItem(RunnableItem object) {
				return createRunnableItemAdapter();
			}
			@Override
			public Adapter caseComputationItem(ComputationItem object) {
				return createComputationItemAdapter();
			}
			@Override
			public Adapter caseRunnableInstructions(RunnableInstructions object) {
				return createRunnableInstructionsAdapter();
			}
			@Override
			public Adapter caseRunnableInstructionsEntry(Map.Entry<CoreType, Instructions> object) {
				return createRunnableInstructionsEntryAdapter();
			}
			@Override
			public Adapter caseModeLabelAccess(ModeLabelAccess object) {
				return createModeLabelAccessAdapter();
			}
			@Override
			public Adapter caseRunnableModeSwitch(RunnableModeSwitch object) {
				return createRunnableModeSwitchAdapter();
			}
			@Override
			public Adapter caseLabelAccess(LabelAccess object) {
				return createLabelAccessAdapter();
			}
			@Override
			public Adapter caseChannelAccess(ChannelAccess object) {
				return createChannelAccessAdapter();
			}
			@Override
			public Adapter caseChannelSend(ChannelSend object) {
				return createChannelSendAdapter();
			}
			@Override
			public Adapter caseChannelReceive(ChannelReceive object) {
				return createChannelReceiveAdapter();
			}
			@Override
			public Adapter caseSemaphoreAccess(SemaphoreAccess object) {
				return createSemaphoreAccessAdapter();
			}
			@Override
			public Adapter caseSenderReceiverCommunication(SenderReceiverCommunication object) {
				return createSenderReceiverCommunicationAdapter();
			}
			@Override
			public Adapter caseSenderReceiverRead(SenderReceiverRead object) {
				return createSenderReceiverReadAdapter();
			}
			@Override
			public Adapter caseSenderReceiverWrite(SenderReceiverWrite object) {
				return createSenderReceiverWriteAdapter();
			}
			@Override
			public Adapter caseServerCall(ServerCall object) {
				return createServerCallAdapter();
			}
			@Override
			public Adapter caseSynchronousServerCall(SynchronousServerCall object) {
				return createSynchronousServerCallAdapter();
			}
			@Override
			public Adapter caseAsynchronousServerCall(AsynchronousServerCall object) {
				return createAsynchronousServerCallAdapter();
			}
			@Override
			public Adapter caseGetResultServerCall(GetResultServerCall object) {
				return createGetResultServerCallAdapter();
			}
			@Override
			public Adapter caseRunnableProbabilitySwitch(RunnableProbabilitySwitch object) {
				return createRunnableProbabilitySwitchAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseRunnableCall(RunnableCall object) {
				return createRunnableCallAdapter();
			}
			@Override
			public Adapter caseCustomEventTrigger(CustomEventTrigger object) {
				return createCustomEventTriggerAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseCompoundType(CompoundType object) {
				return createCompoundTypeAdapter();
			}
			@Override
			public Adapter caseStruct(Struct object) {
				return createStructAdapter();
			}
			@Override
			public Adapter caseStructEntry(StructEntry object) {
				return createStructEntryAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter casePointer(Pointer object) {
				return createPointerAdapter();
			}
			@Override
			public Adapter caseTypeRef(TypeRef object) {
				return createTypeRefAdapter();
			}
			@Override
			public Adapter caseDataPlatformMapping(DataPlatformMapping object) {
				return createDataPlatformMappingAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseDataTypeDefinition(DataTypeDefinition object) {
				return createDataTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseBaseTypeDefinition(BaseTypeDefinition object) {
				return createBaseTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseActivation(Activation object) {
				return createActivationAdapter();
			}
			@Override
			public Adapter casePeriodicActivation(PeriodicActivation object) {
				return createPeriodicActivationAdapter();
			}
			@Override
			public Adapter caseVariableRateActivation(VariableRateActivation object) {
				return createVariableRateActivationAdapter();
			}
			@Override
			public Adapter caseSporadicActivation(SporadicActivation object) {
				return createSporadicActivationAdapter();
			}
			@Override
			public Adapter caseSingleActivation(SingleActivation object) {
				return createSingleActivationAdapter();
			}
			@Override
			public Adapter caseEventActivation(EventActivation object) {
				return createEventActivationAdapter();
			}
			@Override
			public Adapter caseCustomActivation(CustomActivation object) {
				return createCustomActivationAdapter();
			}
			@Override
			public Adapter caseLabelAccessStatistic(LabelAccessStatistic object) {
				return createLabelAccessStatisticAdapter();
			}
			@Override
			public Adapter caseInstructionFetch(InstructionFetch object) {
				return createInstructionFetchAdapter();
			}
			@Override
			public Adapter caseRunEntityCallStatistic(RunEntityCallStatistic object) {
				return createRunEntityCallStatisticAdapter();
			}
			@Override
			public Adapter caseMeasurementModel(MeasurementModel object) {
				return createMeasurementModelAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
			}
			@Override
			public Adapter caseEventChainMeasurement(EventChainMeasurement object) {
				return createEventChainMeasurementAdapter();
			}
			@Override
			public Adapter caseTaskMeasurement(TaskMeasurement object) {
				return createTaskMeasurementAdapter();
			}
			@Override
			public Adapter caseRunnableMeasurement(RunnableMeasurement object) {
				return createRunnableMeasurementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Amalthea <em>Amalthea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea
	 * @generated
	 */
	public Adapter createAmaltheaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CommonElements <em>Common Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CommonElements
	 * @generated
	 */
	public Adapter createCommonElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.BaseObject <em>Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.BaseObject
	 * @generated
	 */
	public Adapter createBaseObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ReferableObject <em>Referable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ReferableObject
	 * @generated
	 */
	public Adapter createReferableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ReferableBaseObject <em>Referable Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ReferableBaseObject
	 * @generated
	 */
	public Adapter createReferableBaseObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.IAnnotatable <em>IAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.IAnnotatable
	 * @generated
	 */
	public Adapter createIAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ITaggable <em>ITaggable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ITaggable
	 * @generated
	 */
	public Adapter createITaggableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.INamed <em>INamed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.INamed
	 * @generated
	 */
	public Adapter createINamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.IReferable <em>IReferable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.IReferable
	 * @generated
	 */
	public Adapter createIReferableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.IDisplayName <em>IDisplay Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.IDisplayName
	 * @generated
	 */
	public Adapter createIDisplayNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CoreClassifier <em>Core Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CoreClassifier
	 * @generated
	 */
	public Adapter createCoreClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MemoryClassifier <em>Memory Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryClassifier
	 * @generated
	 */
	public Adapter createMemoryClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Instructions
	 * @generated
	 */
	public Adapter createInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TransmissionPolicy <em>Transmission Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TransmissionPolicy
	 * @generated
	 */
	public Adapter createTransmissionPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.InstructionsDeviation <em>Instructions Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionsDeviation
	 * @generated
	 */
	public Adapter createInstructionsDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.InstructionsConstant <em>Instructions Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionsConstant
	 * @generated
	 */
	public Adapter createInstructionsConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable<org.eclipse.app4mc.amalthea.model.AbstractTime> <em>Time Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Comparable<org.eclipse.app4mc.amalthea.model.AbstractTime>
	 * @generated
	 */
	public Adapter createTimeComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AbstractTime <em>Abstract Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractTime
	 * @generated
	 */
	public Adapter createAbstractTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Frequency
	 * @generated
	 */
	public Adapter createFrequencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataSize
	 * @generated
	 */
	public Adapter createDataSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataRate
	 * @generated
	 */
	public Adapter createDataRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createCustomPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ListObject <em>List Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ListObject
	 * @generated
	 */
	public Adapter createListObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.StringObject <em>String Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.StringObject
	 * @generated
	 */
	public Adapter createStringObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.BigIntegerObject <em>Big Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.BigIntegerObject
	 * @generated
	 */
	public Adapter createBigIntegerObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ReferenceObject <em>Reference Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ReferenceObject
	 * @generated
	 */
	public Adapter createReferenceObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.IntegerObject <em>Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.IntegerObject
	 * @generated
	 */
	public Adapter createIntegerObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LongObject <em>Long Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LongObject
	 * @generated
	 */
	public Adapter createLongObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.FloatObject <em>Float Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.FloatObject
	 * @generated
	 */
	public Adapter createFloatObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DoubleObject <em>Double Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DoubleObject
	 * @generated
	 */
	public Adapter createDoubleObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.BooleanObject <em>Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.BooleanObject
	 * @generated
	 */
	public Adapter createBooleanObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeObject <em>Time Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeObject
	 * @generated
	 */
	public Adapter createTimeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Deviation
	 * @generated
	 */
	public Adapter createDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Distribution
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.WeibullDistribution <em>Weibull Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullDistribution
	 * @generated
	 */
	public Adapter createWeibullDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.WeibullParameters <em>Weibull Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullParameters
	 * @generated
	 */
	public Adapter createWeibullParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.WeibullEstimators <em>Weibull Estimators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullEstimators
	 * @generated
	 */
	public Adapter createWeibullEstimatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.UniformDistribution <em>Uniform Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.UniformDistribution
	 * @generated
	 */
	public Adapter createUniformDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Boundaries <em>Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Boundaries
	 * @generated
	 */
	public Adapter createBoundariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.GaussDistribution <em>Gauss Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.GaussDistribution
	 * @generated
	 */
	public Adapter createGaussDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.BetaDistribution <em>Beta Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.BetaDistribution
	 * @generated
	 */
	public Adapter createBetaDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.NumericStatistic <em>Numeric Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.NumericStatistic
	 * @generated
	 */
	public Adapter createNumericStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic <em>Min Avg Max Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic
	 * @generated
	 */
	public Adapter createMinAvgMaxStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SingleValueStatistic <em>Single Value Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SingleValueStatistic
	 * @generated
	 */
	public Adapter createSingleValueStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeLiteral <em>Mode Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLiteral
	 * @generated
	 */
	public Adapter createModeLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ComponentsModel <em>Components Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentsModel
	 * @generated
	 */
	public Adapter createComponentsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ISystem <em>ISystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ISystem
	 * @generated
	 */
	public Adapter createISystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.QualifiedPort <em>Qualified Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.QualifiedPort
	 * @generated
	 */
	public Adapter createQualifiedPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.InterfacePort <em>Interface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.InterfacePort
	 * @generated
	 */
	public Adapter createInterfacePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ConfigModel <em>Config Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ConfigModel
	 * @generated
	 */
	public Adapter createConfigModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventConfig <em>Event Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventConfig
	 * @generated
	 */
	public Adapter createEventConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel <em>Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel
	 * @generated
	 */
	public Adapter createConstraintsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint <em>Runnable Sequencing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint
	 * @generated
	 */
	public Adapter createRunnableSequencingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AffinityConstraint <em>Affinity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AffinityConstraint
	 * @generated
	 */
	public Adapter createAffinityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SeparationConstraint <em>Separation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SeparationConstraint
	 * @generated
	 */
	public Adapter createSeparationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PairingConstraint <em>Pairing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PairingConstraint
	 * @generated
	 */
	public Adapter createPairingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessConstraint <em>Process Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessConstraint
	 * @generated
	 */
	public Adapter createProcessConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableConstraint <em>Runnable Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableConstraint
	 * @generated
	 */
	public Adapter createRunnableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataConstraint <em>Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataConstraint
	 * @generated
	 */
	public Adapter createDataConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint <em>Runnable Separation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint
	 * @generated
	 */
	public Adapter createRunnableSeparationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint <em>Process Separation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint
	 * @generated
	 */
	public Adapter createProcessSeparationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataSeparationConstraint <em>Data Separation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataSeparationConstraint
	 * @generated
	 */
	public Adapter createDataSeparationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint <em>Runnable Pairing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint
	 * @generated
	 */
	public Adapter createRunnablePairingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint <em>Process Pairing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint
	 * @generated
	 */
	public Adapter createProcessPairingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataPairingConstraint <em>Data Pairing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataPairingConstraint
	 * @generated
	 */
	public Adapter createDataPairingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableConstraintTarget <em>Runnable Constraint Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableConstraintTarget
	 * @generated
	 */
	public Adapter createRunnableConstraintTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessConstraintTarget <em>Process Constraint Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessConstraintTarget
	 * @generated
	 */
	public Adapter createProcessConstraintTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataConstraintTarget <em>Data Constraint Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataConstraintTarget
	 * @generated
	 */
	public Adapter createDataConstraintTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TargetMemory <em>Target Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TargetMemory
	 * @generated
	 */
	public Adapter createTargetMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TargetCore <em>Target Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TargetCore
	 * @generated
	 */
	public Adapter createTargetCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TargetScheduler <em>Target Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TargetScheduler
	 * @generated
	 */
	public Adapter createTargetSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LabelGroup <em>Label Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LabelGroup
	 * @generated
	 */
	public Adapter createLabelGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableGroup <em>Runnable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableGroup
	 * @generated
	 */
	public Adapter createRunnableGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessGroup <em>Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessGroup
	 * @generated
	 */
	public Adapter createProcessGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LabelEntityGroup <em>Label Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LabelEntityGroup
	 * @generated
	 */
	public Adapter createLabelEntityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableEntityGroup <em>Runnable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEntityGroup
	 * @generated
	 */
	public Adapter createRunnableEntityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessEntityGroup <em>Process Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEntityGroup
	 * @generated
	 */
	public Adapter createProcessEntityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TagGroup <em>Tag Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TagGroup
	 * @generated
	 */
	public Adapter createTagGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AbstractEventChain <em>Abstract Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractEventChain
	 * @generated
	 */
	public Adapter createAbstractEventChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventChain <em>Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventChain
	 * @generated
	 */
	public Adapter createEventChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SubEventChain <em>Sub Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SubEventChain
	 * @generated
	 */
	public Adapter createSubEventChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventChainItem <em>Event Chain Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainItem
	 * @generated
	 */
	public Adapter createEventChainItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventChainReference <em>Event Chain Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainReference
	 * @generated
	 */
	public Adapter createEventChainReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventChainContainer <em>Event Chain Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainContainer
	 * @generated
	 */
	public Adapter createEventChainContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimingConstraint
	 * @generated
	 */
	public Adapter createTimingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint <em>Physical Section Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint
	 * @generated
	 */
	public Adapter createPhysicalSectionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SynchronizationConstraint <em>Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronizationConstraint
	 * @generated
	 */
	public Adapter createSynchronizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventSynchronizationConstraint <em>Event Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventSynchronizationConstraint
	 * @generated
	 */
	public Adapter createEventSynchronizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventChainSynchronizationConstraint <em>Event Chain Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainSynchronizationConstraint
	 * @generated
	 */
	public Adapter createEventChainSynchronizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint <em>Delay Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DelayConstraint
	 * @generated
	 */
	public Adapter createDelayConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint <em>Event Chain Latency Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint
	 * @generated
	 */
	public Adapter createEventChainLatencyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint <em>Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RepetitionConstraint
	 * @generated
	 */
	public Adapter createRepetitionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint <em>Data Age Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeConstraint
	 * @generated
	 */
	public Adapter createDataAgeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataAge <em>Data Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataAge
	 * @generated
	 */
	public Adapter createDataAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataAgeCycle <em>Data Age Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeCycle
	 * @generated
	 */
	public Adapter createDataAgeCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataAgeTime <em>Data Age Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeTime
	 * @generated
	 */
	public Adapter createDataAgeTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessRequirement <em>Process Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRequirement
	 * @generated
	 */
	public Adapter createProcessRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableRequirement <em>Runnable Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableRequirement
	 * @generated
	 */
	public Adapter createRunnableRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ArchitectureRequirement <em>Architecture Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ArchitectureRequirement
	 * @generated
	 */
	public Adapter createArchitectureRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessChainRequirement <em>Process Chain Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChainRequirement
	 * @generated
	 */
	public Adapter createProcessChainRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RequirementLimit <em>Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RequirementLimit
	 * @generated
	 */
	public Adapter createRequirementLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit <em>CPU Percentage Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit
	 * @generated
	 */
	public Adapter createCPUPercentageRequirementLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit <em>Frequency Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit
	 * @generated
	 */
	public Adapter createFrequencyRequirementLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit <em>Percentage Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit
	 * @generated
	 */
	public Adapter createPercentageRequirementLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CountRequirementLimit <em>Count Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CountRequirementLimit
	 * @generated
	 */
	public Adapter createCountRequirementLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeRequirementLimit <em>Time Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeRequirementLimit
	 * @generated
	 */
	public Adapter createTimeRequirementLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup <em>Data Coherency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataCoherencyGroup
	 * @generated
	 */
	public Adapter createDataCoherencyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataStabilityGroup <em>Data Stability Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataStabilityGroup
	 * @generated
	 */
	public Adapter createDataStabilityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataGroupScope <em>Data Group Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataGroupScope
	 * @generated
	 */
	public Adapter createDataGroupScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessScope <em>Process Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessScope
	 * @generated
	 */
	public Adapter createProcessScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableScope <em>Runnable Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableScope
	 * @generated
	 */
	public Adapter createRunnableScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ComponentScope <em>Component Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentScope
	 * @generated
	 */
	public Adapter createComponentScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventModel
	 * @generated
	 */
	public Adapter createEventModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventSet <em>Event Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventSet
	 * @generated
	 */
	public Adapter createEventSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EntityEvent <em>Entity Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EntityEvent
	 * @generated
	 */
	public Adapter createEntityEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TriggerEvent
	 * @generated
	 */
	public Adapter createTriggerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CustomEvent <em>Custom Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CustomEvent
	 * @generated
	 */
	public Adapter createCustomEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.StimulusEvent <em>Stimulus Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.StimulusEvent
	 * @generated
	 */
	public Adapter createStimulusEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessEvent <em>Process Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEvent
	 * @generated
	 */
	public Adapter createProcessEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent <em>Process Chain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChainEvent
	 * @generated
	 */
	public Adapter createProcessChainEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent <em>Runnable Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEvent
	 * @generated
	 */
	public Adapter createRunnableEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LabelEvent <em>Label Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LabelEvent
	 * @generated
	 */
	public Adapter createLabelEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ChannelEvent <em>Channel Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ChannelEvent
	 * @generated
	 */
	public Adapter createChannelEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent <em>Semaphore Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEvent
	 * @generated
	 */
	public Adapter createSemaphoreEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ComponentEvent <em>Component Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentEvent
	 * @generated
	 */
	public Adapter createComponentEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HWModel <em>HW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel
	 * @generated
	 */
	public Adapter createHWModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode
	 * @generated
	 */
	public Adapter createComplexNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwSystem <em>Hw System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwSystem
	 * @generated
	 */
	public Adapter createHwSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ECU
	 * @generated
	 */
	public Adapter createECUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Microcontroller
	 * @generated
	 */
	public Adapter createMicrocontrollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Quartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Quartz
	 * @generated
	 */
	public Adapter createQuartzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwComponent <em>Hw Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwComponent
	 * @generated
	 */
	public Adapter createHwComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HardwareTypeDescription <em>Hardware Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HardwareTypeDescription
	 * @generated
	 */
	public Adapter createHardwareTypeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AbstractionType <em>Abstraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractionType
	 * @generated
	 */
	public Adapter createAbstractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ECUType <em>ECU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ECUType
	 * @generated
	 */
	public Adapter createECUTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MicrocontrollerType
	 * @generated
	 */
	public Adapter createMicrocontrollerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CoreType
	 * @generated
	 */
	public Adapter createCoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryType
	 * @generated
	 */
	public Adapter createMemoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.NetworkType
	 * @generated
	 */
	public Adapter createNetworkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwPort <em>Hw Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwPort
	 * @generated
	 */
	public Adapter createHwPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ComplexPort <em>Complex Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort
	 * @generated
	 */
	public Adapter createComplexPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ComplexPin <em>Complex Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPin
	 * @generated
	 */
	public Adapter createComplexPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Prescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Prescaler
	 * @generated
	 */
	public Adapter createPrescalerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CrossbarSwitch <em>Crossbar Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CrossbarSwitch
	 * @generated
	 */
	public Adapter createCrossbarSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Bridge
	 * @generated
	 */
	public Adapter createBridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AccessPath <em>Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPath
	 * @generated
	 */
	public Adapter createAccessPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LatencyAccessPath <em>Latency Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyAccessPath
	 * @generated
	 */
	public Adapter createLatencyAccessPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwAccessPath <em>Hw Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPath
	 * @generated
	 */
	public Adapter createHwAccessPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement <em>Latency Access Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement
	 * @generated
	 */
	public Adapter createLatencyAccessPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AccessPathRef <em>Access Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPathRef
	 * @generated
	 */
	public Adapter createAccessPathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Latency
	 * @generated
	 */
	public Adapter createLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LatencyConstant <em>Latency Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyConstant
	 * @generated
	 */
	public Adapter createLatencyConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LatencyDeviation <em>Latency Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyDeviation
	 * @generated
	 */
	public Adapter createLatencyDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwAccessPathElement <em>Hw Access Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPathElement
	 * @generated
	 */
	public Adapter createHwAccessPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwAccessPathRef <em>Hw Access Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPathRef
	 * @generated
	 */
	public Adapter createHwAccessPathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwElementRef <em>Hw Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwElementRef
	 * @generated
	 */
	public Adapter createHwElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MappingModel
	 * @generated
	 */
	public Adapter createMappingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SchedulerAllocation <em>Scheduler Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerAllocation
	 * @generated
	 */
	public Adapter createSchedulerAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TaskAllocation <em>Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TaskAllocation
	 * @generated
	 */
	public Adapter createTaskAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ISRAllocation <em>ISR Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ISRAllocation
	 * @generated
	 */
	public Adapter createISRAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableAllocation <em>Runnable Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableAllocation
	 * @generated
	 */
	public Adapter createRunnableAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MemoryMapping <em>Memory Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryMapping
	 * @generated
	 */
	public Adapter createMemoryMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping <em>Physical Section Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping
	 * @generated
	 */
	public Adapter createPhysicalSectionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OSModel <em>OS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OSModel
	 * @generated
	 */
	public Adapter createOSModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OsDataConsistency <em>Os Data Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OsDataConsistency
	 * @generated
	 */
	public Adapter createOsDataConsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataStability <em>Data Stability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataStability
	 * @generated
	 */
	public Adapter createDataStabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency <em>Non Atomic Data Coherency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency
	 * @generated
	 */
	public Adapter createNonAtomicDataCoherencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Semaphore
	 * @generated
	 */
	public Adapter createSemaphoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TaskScheduler <em>Task Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TaskScheduler
	 * @generated
	 */
	public Adapter createTaskSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation <em>Scheduler Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerAssociation
	 * @generated
	 */
	public Adapter createSchedulerAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.InterruptController <em>Interrupt Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.InterruptController
	 * @generated
	 */
	public Adapter createInterruptControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters <em>Scheduling Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulingParameters
	 * @generated
	 */
	public Adapter createSchedulingParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Parameter Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createParameterExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Algorithm
	 * @generated
	 */
	public Adapter createAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm <em>Interrupt Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm
	 * @generated
	 */
	public Adapter createInterruptSchedulingAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm <em>Task Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm
	 * @generated
	 */
	public Adapter createTaskSchedulingAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.FixedPriority <em>Fixed Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.FixedPriority
	 * @generated
	 */
	public Adapter createFixedPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptive <em>Fixed Priority Preemptive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptive
	 * @generated
	 */
	public Adapter createFixedPriorityPreemptiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptiveWithBudgetEnforcement <em>Fixed Priority Preemptive With Budget Enforcement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptiveWithBudgetEnforcement
	 * @generated
	 */
	public Adapter createFixedPriorityPreemptiveWithBudgetEnforcementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OSEK <em>OSEK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OSEK
	 * @generated
	 */
	public Adapter createOSEKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DeadlineMonotonic <em>Deadline Monotonic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DeadlineMonotonic
	 * @generated
	 */
	public Adapter createDeadlineMonotonicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RateMonotonic <em>Rate Monotonic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RateMonotonic
	 * @generated
	 */
	public Adapter createRateMonotonicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Pfair <em>Pfair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Pfair
	 * @generated
	 */
	public Adapter createPfairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PfairPD2 <em>Pfair PD2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PfairPD2
	 * @generated
	 */
	public Adapter createPfairPD2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PartlyPFairPD2 <em>Partly PFair PD2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PartlyPFairPD2
	 * @generated
	 */
	public Adapter createPartlyPFairPD2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2 <em>Early Release Fair PD2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2
	 * @generated
	 */
	public Adapter createEarlyReleaseFairPD2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2 <em>Partly Early Release Fair PD2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2
	 * @generated
	 */
	public Adapter createPartlyEarlyReleaseFairPD2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DynamicPriority <em>Dynamic Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DynamicPriority
	 * @generated
	 */
	public Adapter createDynamicPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst <em>Least Local Remaining Execution Time First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst
	 * @generated
	 */
	public Adapter createLeastLocalRemainingExecutionTimeFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst <em>Earliest Deadline First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst
	 * @generated
	 */
	public Adapter createEarliestDeadlineFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PriorityBasedRoundRobin <em>Priority Based Round Robin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PriorityBasedRoundRobin
	 * @generated
	 */
	public Adapter createPriorityBasedRoundRobinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ReservationBasedServer <em>Reservation Based Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ReservationBasedServer
	 * @generated
	 */
	public Adapter createReservationBasedServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DeferrableServer <em>Deferrable Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DeferrableServer
	 * @generated
	 */
	public Adapter createDeferrableServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PollingPeriodicServer <em>Polling Periodic Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PollingPeriodicServer
	 * @generated
	 */
	public Adapter createPollingPeriodicServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SporadicServer <em>Sporadic Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SporadicServer
	 * @generated
	 */
	public Adapter createSporadicServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ConstantBandwidthServer <em>Constant Bandwidth Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ConstantBandwidthServer
	 * @generated
	 */
	public Adapter createConstantBandwidthServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ConstantBandwidthServerWithCASH <em>Constant Bandwidth Server With CASH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ConstantBandwidthServerWithCASH
	 * @generated
	 */
	public Adapter createConstantBandwidthServerWithCASHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Grouping
	 * @generated
	 */
	public Adapter createGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm <em>User Specific Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm
	 * @generated
	 */
	public Adapter createUserSpecificSchedulingAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PriorityBased <em>Priority Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PriorityBased
	 * @generated
	 */
	public Adapter createPriorityBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem <em>Vendor Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.VendorOperatingSystem
	 * @generated
	 */
	public Adapter createVendorOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OsInstructions <em>Os Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OsInstructions
	 * @generated
	 */
	public Adapter createOsInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions <em>Os API Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions
	 * @generated
	 */
	public Adapter createOsAPIInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OsISRInstructions <em>Os ISR Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OsISRInstructions
	 * @generated
	 */
	public Adapter createOsISRInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel <em>Property Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel
	 * @generated
	 */
	public Adapter createPropertyConstraintsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CoreAllocationConstraint <em>Core Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CoreAllocationConstraint
	 * @generated
	 */
	public Adapter createCoreAllocationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint <em>Memory Mapping Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint
	 * @generated
	 */
	public Adapter createMemoryMappingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint <em>Process Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint
	 * @generated
	 */
	public Adapter createProcessAllocationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint <em>Process Prototype Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint
	 * @generated
	 */
	public Adapter createProcessPrototypeAllocationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint <em>Runnable Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint
	 * @generated
	 */
	public Adapter createRunnableAllocationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint <em>Abstract Element Mapping Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint
	 * @generated
	 */
	public Adapter createAbstractElementMappingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Classification
	 * @generated
	 */
	public Adapter createClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CoreClassification <em>Core Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CoreClassification
	 * @generated
	 */
	public Adapter createCoreClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MemoryClassification <em>Memory Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryClassification
	 * @generated
	 */
	public Adapter createMemoryClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.StimuliModel <em>Stimuli Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.StimuliModel
	 * @generated
	 */
	public Adapter createStimuliModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Stimulus
	 * @generated
	 */
	public Adapter createStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeValueList <em>Mode Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueList
	 * @generated
	 */
	public Adapter createModeValueListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Mode Value Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createModeValueMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeValueDisjunction <em>Mode Value Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueDisjunction
	 * @generated
	 */
	public Adapter createModeValueDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeValueDisjunctionEntry <em>Mode Value Disjunction Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueDisjunctionEntry
	 * @generated
	 */
	public Adapter createModeValueDisjunctionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeValue <em>Mode Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValue
	 * @generated
	 */
	public Adapter createModeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeValueConjunction <em>Mode Value Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueConjunction
	 * @generated
	 */
	public Adapter createModeValueConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PeriodicStimulus <em>Periodic Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicStimulus
	 * @generated
	 */
	public Adapter createPeriodicStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus <em>Variable Rate Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.VariableRateStimulus
	 * @generated
	 */
	public Adapter createVariableRateStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SyntheticStimulus <em>Synthetic Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SyntheticStimulus
	 * @generated
	 */
	public Adapter createSyntheticStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimestampList <em>Timestamp List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimestampList
	 * @generated
	 */
	public Adapter createTimestampListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CustomStimulus <em>Custom Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CustomStimulus
	 * @generated
	 */
	public Adapter createCustomStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SingleStimulus <em>Single Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SingleStimulus
	 * @generated
	 */
	public Adapter createSingleStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.InterProcessStimulus <em>Inter Process Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.InterProcessStimulus
	 * @generated
	 */
	public Adapter createInterProcessStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SporadicStimulus <em>Sporadic Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SporadicStimulus
	 * @generated
	 */
	public Adapter createSporadicStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventStimulus <em>Event Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventStimulus
	 * @generated
	 */
	public Adapter createEventStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus <em>Arrival Curve Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus
	 * @generated
	 */
	public Adapter createArrivalCurveStimulusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry <em>Arrival Curve Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry
	 * @generated
	 */
	public Adapter createArrivalCurveEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction <em>Clock Triangle Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ClockTriangleFunction
	 * @generated
	 */
	public Adapter createClockTriangleFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction <em>Clock Sinus Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ClockSinusFunction
	 * @generated
	 */
	public Adapter createClockSinusFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierList <em>Clock Multiplier List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ClockMultiplierList
	 * @generated
	 */
	public Adapter createClockMultiplierListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry <em>Clock Multiplier List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry
	 * @generated
	 */
	public Adapter createClockMultiplierListEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SWModel <em>SW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel
	 * @generated
	 */
	public Adapter createSWModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AbstractMemoryElement <em>Abstract Memory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractMemoryElement
	 * @generated
	 */
	public Adapter createAbstractMemoryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AbstractProcess <em>Abstract Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractProcess
	 * @generated
	 */
	public Adapter createAbstractProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CustomEntity <em>Custom Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CustomEntity
	 * @generated
	 */
	public Adapter createCustomEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessChain <em>Process Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChain
	 * @generated
	 */
	public Adapter createProcessChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CallGraph <em>Call Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CallGraph
	 * @generated
	 */
	public Adapter createCallGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.GraphEntryBase <em>Graph Entry Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.GraphEntryBase
	 * @generated
	 */
	public Adapter createGraphEntryBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CallSequence <em>Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CallSequence
	 * @generated
	 */
	public Adapter createCallSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeSwitch <em>Mode Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitch
	 * @generated
	 */
	public Adapter createModeSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry <em>Mode Switch Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
	 * @generated
	 */
	public Adapter createModeSwitchEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeSwitchDefault <em>Mode Switch Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitchDefault
	 * @generated
	 */
	public Adapter createModeSwitchDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProbabilitySwitch <em>Probability Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilitySwitch
	 * @generated
	 */
	public Adapter createProbabilitySwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry <em>Probability Switch Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry
	 * @generated
	 */
	public Adapter createProbabilitySwitchEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Counter
	 * @generated
	 */
	public Adapter createCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CallSequenceItem <em>Call Sequence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CallSequenceItem
	 * @generated
	 */
	public Adapter createCallSequenceItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.WaitEvent <em>Wait Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.WaitEvent
	 * @generated
	 */
	public Adapter createWaitEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SetEvent <em>Set Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SetEvent
	 * @generated
	 */
	public Adapter createSetEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ClearEvent <em>Clear Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ClearEvent
	 * @generated
	 */
	public Adapter createClearEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventMask <em>Event Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventMask
	 * @generated
	 */
	public Adapter createEventMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OsEvent <em>Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OsEvent
	 * @generated
	 */
	public Adapter createOsEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.InterProcessTrigger <em>Inter Process Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.InterProcessTrigger
	 * @generated
	 */
	public Adapter createInterProcessTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EnforcedMigration <em>Enforced Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EnforcedMigration
	 * @generated
	 */
	public Adapter createEnforcedMigrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall <em>Task Runnable Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TaskRunnableCall
	 * @generated
	 */
	public Adapter createTaskRunnableCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SchedulePoint <em>Schedule Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulePoint
	 * @generated
	 */
	public Adapter createSchedulePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TerminateProcess <em>Terminate Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TerminateProcess
	 * @generated
	 */
	public Adapter createTerminateProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ISR <em>ISR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ISR
	 * @generated
	 */
	public Adapter createISRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype <em>Process Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype
	 * @generated
	 */
	public Adapter createProcessPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype <em>Chained Process Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype
	 * @generated
	 */
	public Adapter createChainedProcessPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.GeneralPrecedence <em>General Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.GeneralPrecedence
	 * @generated
	 */
	public Adapter createGeneralPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec <em>Access Precedence Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec
	 * @generated
	 */
	public Adapter createAccessPrecedenceSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec <em>Order Precedence Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec
	 * @generated
	 */
	public Adapter createOrderPrecedenceSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable
	 * @generated
	 */
	public Adapter createRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeLabel <em>Mode Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabel
	 * @generated
	 */
	public Adapter createModeLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableItem <em>Runnable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableItem
	 * @generated
	 */
	public Adapter createRunnableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ComputationItem <em>Computation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ComputationItem
	 * @generated
	 */
	public Adapter createComputationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableInstructions <em>Runnable Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableInstructions
	 * @generated
	 */
	public Adapter createRunnableInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Runnable Instructions Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createRunnableInstructionsEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess <em>Mode Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabelAccess
	 * @generated
	 */
	public Adapter createModeLabelAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableModeSwitch <em>Runnable Mode Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableModeSwitch
	 * @generated
	 */
	public Adapter createRunnableModeSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LabelAccess <em>Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccess
	 * @generated
	 */
	public Adapter createLabelAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ChannelAccess <em>Channel Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ChannelAccess
	 * @generated
	 */
	public Adapter createChannelAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ChannelSend <em>Channel Send</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ChannelSend
	 * @generated
	 */
	public Adapter createChannelSendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ChannelReceive <em>Channel Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ChannelReceive
	 * @generated
	 */
	public Adapter createChannelReceiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess <em>Semaphore Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreAccess
	 * @generated
	 */
	public Adapter createSemaphoreAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication <em>Sender Receiver Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication
	 * @generated
	 */
	public Adapter createSenderReceiverCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverRead <em>Sender Receiver Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverRead
	 * @generated
	 */
	public Adapter createSenderReceiverReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverWrite <em>Sender Receiver Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverWrite
	 * @generated
	 */
	public Adapter createSenderReceiverWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ServerCall <em>Server Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ServerCall
	 * @generated
	 */
	public Adapter createServerCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SynchronousServerCall <em>Synchronous Server Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronousServerCall
	 * @generated
	 */
	public Adapter createSynchronousServerCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.AsynchronousServerCall <em>Asynchronous Server Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.AsynchronousServerCall
	 * @generated
	 */
	public Adapter createAsynchronousServerCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.GetResultServerCall <em>Get Result Server Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.GetResultServerCall
	 * @generated
	 */
	public Adapter createGetResultServerCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch <em>Runnable Probability Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch
	 * @generated
	 */
	public Adapter createRunnableProbabilitySwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableCall <em>Runnable Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableCall
	 * @generated
	 */
	public Adapter createRunnableCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CustomEventTrigger <em>Custom Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CustomEventTrigger
	 * @generated
	 */
	public Adapter createCustomEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CompoundType <em>Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CompoundType
	 * @generated
	 */
	public Adapter createCompoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Struct
	 * @generated
	 */
	public Adapter createStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.StructEntry <em>Struct Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.StructEntry
	 * @generated
	 */
	public Adapter createStructEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Pointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Pointer
	 * @generated
	 */
	public Adapter createPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TypeRef
	 * @generated
	 */
	public Adapter createTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataPlatformMapping <em>Data Platform Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataPlatformMapping
	 * @generated
	 */
	public Adapter createDataPlatformMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataTypeDefinition <em>Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataTypeDefinition
	 * @generated
	 */
	public Adapter createDataTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.BaseTypeDefinition <em>Base Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.BaseTypeDefinition
	 * @generated
	 */
	public Adapter createBaseTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Activation
	 * @generated
	 */
	public Adapter createActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PeriodicActivation <em>Periodic Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicActivation
	 * @generated
	 */
	public Adapter createPeriodicActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.VariableRateActivation <em>Variable Rate Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.VariableRateActivation
	 * @generated
	 */
	public Adapter createVariableRateActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SporadicActivation <em>Sporadic Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SporadicActivation
	 * @generated
	 */
	public Adapter createSporadicActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.SingleActivation <em>Single Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.SingleActivation
	 * @generated
	 */
	public Adapter createSingleActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventActivation <em>Event Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventActivation
	 * @generated
	 */
	public Adapter createEventActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CustomActivation <em>Custom Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CustomActivation
	 * @generated
	 */
	public Adapter createCustomActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.LabelAccessStatistic <em>Label Access Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessStatistic
	 * @generated
	 */
	public Adapter createLabelAccessStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.InstructionFetch <em>Instruction Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionFetch
	 * @generated
	 */
	public Adapter createInstructionFetchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic <em>Run Entity Call Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic
	 * @generated
	 */
	public Adapter createRunEntityCallStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MeasurementModel <em>Measurement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MeasurementModel
	 * @generated
	 */
	public Adapter createMeasurementModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EventChainMeasurement <em>Event Chain Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainMeasurement
	 * @generated
	 */
	public Adapter createEventChainMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TaskMeasurement <em>Task Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TaskMeasurement
	 * @generated
	 */
	public Adapter createTaskMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableMeasurement <em>Runnable Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableMeasurement
	 * @generated
	 */
	public Adapter createRunnableMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AmaltheaAdapterFactory
