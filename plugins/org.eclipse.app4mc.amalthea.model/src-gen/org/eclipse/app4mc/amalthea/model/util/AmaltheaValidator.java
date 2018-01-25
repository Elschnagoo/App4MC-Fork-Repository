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

import org.eclipse.app4mc.amalthea.model.ASILType;
import org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint;
import org.eclipse.app4mc.amalthea.model.AbstractEventChain;
import org.eclipse.app4mc.amalthea.model.AbstractMemoryElement;
import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.AbstractionType;
import org.eclipse.app4mc.amalthea.model.AccessMultiplicity;
import org.eclipse.app4mc.amalthea.model.AccessPath;
import org.eclipse.app4mc.amalthea.model.AccessPathRef;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceType;
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
import org.eclipse.app4mc.amalthea.model.BlockingType;
import org.eclipse.app4mc.amalthea.model.BooleanObject;
import org.eclipse.app4mc.amalthea.model.Boundaries;
import org.eclipse.app4mc.amalthea.model.Bridge;
import org.eclipse.app4mc.amalthea.model.Bus;
import org.eclipse.app4mc.amalthea.model.BusType;
import org.eclipse.app4mc.amalthea.model.CPUPercentageMetric;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.ChannelAccess;
import org.eclipse.app4mc.amalthea.model.ChannelEvent;
import org.eclipse.app4mc.amalthea.model.ChannelEventType;
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
import org.eclipse.app4mc.amalthea.model.CoherencyDirection;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.ComplexPin;
import org.eclipse.app4mc.amalthea.model.ComplexPort;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentEvent;
import org.eclipse.app4mc.amalthea.model.ComponentEventType;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.ComponentScope;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.Composite;
import org.eclipse.app4mc.amalthea.model.CompoundType;
import org.eclipse.app4mc.amalthea.model.ComputationItem;
import org.eclipse.app4mc.amalthea.model.ConcurrencyType;
import org.eclipse.app4mc.amalthea.model.Condition;
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
import org.eclipse.app4mc.amalthea.model.CountMetric;
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
import org.eclipse.app4mc.amalthea.model.DataRateUnit;
import org.eclipse.app4mc.amalthea.model.DataSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.DataStability;
import org.eclipse.app4mc.amalthea.model.DataStabilityGroup;
import org.eclipse.app4mc.amalthea.model.DataStabilityLevel;
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
import org.eclipse.app4mc.amalthea.model.FixedPeriodic;
import org.eclipse.app4mc.amalthea.model.FixedPriority;
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptive;
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptiveWithBudgetEnforcement;
import org.eclipse.app4mc.amalthea.model.FloatObject;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyMetric;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.GeneralPrecedence;
import org.eclipse.app4mc.amalthea.model.GetResultServerCall;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.Grouping;
import org.eclipse.app4mc.amalthea.model.GroupingType;
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
import org.eclipse.app4mc.amalthea.model.ISRCategory;
import org.eclipse.app4mc.amalthea.model.ISystem;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.InstructionFetch;
import org.eclipse.app4mc.amalthea.model.Instructions;
import org.eclipse.app4mc.amalthea.model.InstructionsConstant;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.IntegerObject;
import org.eclipse.app4mc.amalthea.model.InterProcessStimulus;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.InterfaceKind;
import org.eclipse.app4mc.amalthea.model.InterfacePort;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessDataStability;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessImplementation;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.LabelDataStability;
import org.eclipse.app4mc.amalthea.model.LabelEntityGroup;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.LabelEventType;
import org.eclipse.app4mc.amalthea.model.LabelGroup;
import org.eclipse.app4mc.amalthea.model.Latency;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPath;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement;
import org.eclipse.app4mc.amalthea.model.LatencyConstant;
import org.eclipse.app4mc.amalthea.model.LatencyDeviation;
import org.eclipse.app4mc.amalthea.model.LatencyType;
import org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.ListObject;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MappingType;
import org.eclipse.app4mc.amalthea.model.Measurement;
import org.eclipse.app4mc.amalthea.model.MeasurementModel;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType;
import org.eclipse.app4mc.amalthea.model.MemoryClassification;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint;
import org.eclipse.app4mc.amalthea.model.MemoryType;
import org.eclipse.app4mc.amalthea.model.MemoryTypeEnum;
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
import org.eclipse.app4mc.amalthea.model.OrderType;
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsDataConsistencyMode;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.OsISRInstructions;
import org.eclipse.app4mc.amalthea.model.OsInstructions;
import org.eclipse.app4mc.amalthea.model.PairingConstraint;
import org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.PartlyPFairPD2;
import org.eclipse.app4mc.amalthea.model.PercentageMetric;
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.Pfair;
import org.eclipse.app4mc.amalthea.model.PfairPD2;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.Pin;
import org.eclipse.app4mc.amalthea.model.PinType;
import org.eclipse.app4mc.amalthea.model.Pointer;
import org.eclipse.app4mc.amalthea.model.PollingPeriodicServer;
import org.eclipse.app4mc.amalthea.model.Port;
import org.eclipse.app4mc.amalthea.model.Preemption;
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
import org.eclipse.app4mc.amalthea.model.ProcessEventType;
import org.eclipse.app4mc.amalthea.model.ProcessGroup;
import org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.ProcessScope;
import org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.QType;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.app4mc.amalthea.model.Quantity;
import org.eclipse.app4mc.amalthea.model.Quartz;
import org.eclipse.app4mc.amalthea.model.RWType;
import org.eclipse.app4mc.amalthea.model.RateMonotonic;
import org.eclipse.app4mc.amalthea.model.ReceiveOperation;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;
import org.eclipse.app4mc.amalthea.model.ReferableObject;
import org.eclipse.app4mc.amalthea.model.ReferenceObject;
import org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus;
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
import org.eclipse.app4mc.amalthea.model.RunnableEventType;
import org.eclipse.app4mc.amalthea.model.RunnableGroup;
import org.eclipse.app4mc.amalthea.model.RunnableInstructions;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableMeasurement;
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch;
import org.eclipse.app4mc.amalthea.model.RunnableOrderType;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.RunnableRequirement;
import org.eclipse.app4mc.amalthea.model.RunnableScope;
import org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SamplingType;
import org.eclipse.app4mc.amalthea.model.Scenario;
import org.eclipse.app4mc.amalthea.model.SchedType;
import org.eclipse.app4mc.amalthea.model.SchedulePoint;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.SchedulerAssociation;
import org.eclipse.app4mc.amalthea.model.SchedulingParameters;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum;
import org.eclipse.app4mc.amalthea.model.SemaphoreEvent;
import org.eclipse.app4mc.amalthea.model.SemaphoreEventType;
import org.eclipse.app4mc.amalthea.model.SemaphoreType;
import org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication;
import org.eclipse.app4mc.amalthea.model.SenderReceiverRead;
import org.eclipse.app4mc.amalthea.model.SenderReceiverWrite;
import org.eclipse.app4mc.amalthea.model.SeparationConstraint;
import org.eclipse.app4mc.amalthea.model.ServerCall;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.Severity;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.SingleStimulus;
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.SporadicServer;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.StimulusEvent;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.Struct;
import org.eclipse.app4mc.amalthea.model.StructEntry;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.model.SynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.SynchronizationType;
import org.eclipse.app4mc.amalthea.model.SynchronousServerCall;
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
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeObject;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
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
import org.eclipse.app4mc.amalthea.model.Voltage;
import org.eclipse.app4mc.amalthea.model.VoltageUnit;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.WaitEventType;
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour;
import org.eclipse.app4mc.amalthea.model.WeibullDistribution;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage
 * @generated
 */
public class AmaltheaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AmaltheaValidator INSTANCE = new AmaltheaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.app4mc.amalthea.model";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmaltheaValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AmaltheaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AmaltheaPackage.AMALTHEA:
				return validateAmalthea((Amalthea)value, diagnostics, context);
			case AmaltheaPackage.COMMON_ELEMENTS:
				return validateCommonElements((CommonElements)value, diagnostics, context);
			case AmaltheaPackage.BASE_OBJECT:
				return validateBaseObject((BaseObject)value, diagnostics, context);
			case AmaltheaPackage.REFERABLE_OBJECT:
				return validateReferableObject((ReferableObject)value, diagnostics, context);
			case AmaltheaPackage.REFERABLE_BASE_OBJECT:
				return validateReferableBaseObject((ReferableBaseObject)value, diagnostics, context);
			case AmaltheaPackage.IANNOTATABLE:
				return validateIAnnotatable((IAnnotatable)value, diagnostics, context);
			case AmaltheaPackage.ITAGGABLE:
				return validateITaggable((ITaggable)value, diagnostics, context);
			case AmaltheaPackage.INAMED:
				return validateINamed((INamed)value, diagnostics, context);
			case AmaltheaPackage.IREFERABLE:
				return validateIReferable((IReferable)value, diagnostics, context);
			case AmaltheaPackage.IDISPLAY_NAME:
				return validateIDisplayName((IDisplayName)value, diagnostics, context);
			case AmaltheaPackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case AmaltheaPackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case AmaltheaPackage.CORE_CLASSIFIER:
				return validateCoreClassifier((CoreClassifier)value, diagnostics, context);
			case AmaltheaPackage.MEMORY_CLASSIFIER:
				return validateMemoryClassifier((MemoryClassifier)value, diagnostics, context);
			case AmaltheaPackage.INSTRUCTIONS:
				return validateInstructions((Instructions)value, diagnostics, context);
			case AmaltheaPackage.TRANSMISSION_POLICY:
				return validateTransmissionPolicy((TransmissionPolicy)value, diagnostics, context);
			case AmaltheaPackage.INSTRUCTIONS_DEVIATION:
				return validateInstructionsDeviation((InstructionsDeviation)value, diagnostics, context);
			case AmaltheaPackage.INSTRUCTIONS_CONSTANT:
				return validateInstructionsConstant((InstructionsConstant)value, diagnostics, context);
			case AmaltheaPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case AmaltheaPackage.TIME_COMPARABLE:
				return validateTimeComparable((Comparable<AbstractTime>)value, diagnostics, context);
			case AmaltheaPackage.ABSTRACT_TIME:
				return validateAbstractTime((AbstractTime)value, diagnostics, context);
			case AmaltheaPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case AmaltheaPackage.FREQUENCY:
				return validateFrequency((Frequency)value, diagnostics, context);
			case AmaltheaPackage.VOLTAGE:
				return validateVoltage((Voltage)value, diagnostics, context);
			case AmaltheaPackage.DATA_SIZE:
				return validateDataSize((DataSize)value, diagnostics, context);
			case AmaltheaPackage.DATA_RATE:
				return validateDataRate((DataRate)value, diagnostics, context);
			case AmaltheaPackage.CUSTOM_PROPERTY:
				return validateCustomProperty((Map.Entry<?, ?>)value, diagnostics, context);
			case AmaltheaPackage.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case AmaltheaPackage.LIST_OBJECT:
				return validateListObject((ListObject)value, diagnostics, context);
			case AmaltheaPackage.STRING_OBJECT:
				return validateStringObject((StringObject)value, diagnostics, context);
			case AmaltheaPackage.BIG_INTEGER_OBJECT:
				return validateBigIntegerObject((BigIntegerObject)value, diagnostics, context);
			case AmaltheaPackage.REFERENCE_OBJECT:
				return validateReferenceObject((ReferenceObject)value, diagnostics, context);
			case AmaltheaPackage.INTEGER_OBJECT:
				return validateIntegerObject((IntegerObject)value, diagnostics, context);
			case AmaltheaPackage.LONG_OBJECT:
				return validateLongObject((LongObject)value, diagnostics, context);
			case AmaltheaPackage.FLOAT_OBJECT:
				return validateFloatObject((FloatObject)value, diagnostics, context);
			case AmaltheaPackage.DOUBLE_OBJECT:
				return validateDoubleObject((DoubleObject)value, diagnostics, context);
			case AmaltheaPackage.BOOLEAN_OBJECT:
				return validateBooleanObject((BooleanObject)value, diagnostics, context);
			case AmaltheaPackage.TIME_OBJECT:
				return validateTimeObject((TimeObject)value, diagnostics, context);
			case AmaltheaPackage.DEVIATION:
				return validateDeviation((Deviation<?>)value, diagnostics, context);
			case AmaltheaPackage.DISTRIBUTION:
				return validateDistribution((Distribution<?>)value, diagnostics, context);
			case AmaltheaPackage.WEIBULL_DISTRIBUTION:
				return validateWeibullDistribution((WeibullDistribution<?>)value, diagnostics, context);
			case AmaltheaPackage.WEIBULL_PARAMETERS:
				return validateWeibullParameters((WeibullParameters<?>)value, diagnostics, context);
			case AmaltheaPackage.WEIBULL_ESTIMATORS:
				return validateWeibullEstimators((WeibullEstimators<?>)value, diagnostics, context);
			case AmaltheaPackage.UNIFORM_DISTRIBUTION:
				return validateUniformDistribution((UniformDistribution<?>)value, diagnostics, context);
			case AmaltheaPackage.BOUNDARIES:
				return validateBoundaries((Boundaries<?>)value, diagnostics, context);
			case AmaltheaPackage.GAUSS_DISTRIBUTION:
				return validateGaussDistribution((GaussDistribution<?>)value, diagnostics, context);
			case AmaltheaPackage.BETA_DISTRIBUTION:
				return validateBetaDistribution((BetaDistribution<?>)value, diagnostics, context);
			case AmaltheaPackage.NUMERIC_STATISTIC:
				return validateNumericStatistic((NumericStatistic)value, diagnostics, context);
			case AmaltheaPackage.MIN_AVG_MAX_STATISTIC:
				return validateMinAvgMaxStatistic((MinAvgMaxStatistic)value, diagnostics, context);
			case AmaltheaPackage.SINGLE_VALUE_STATISTIC:
				return validateSingleValueStatistic((SingleValueStatistic)value, diagnostics, context);
			case AmaltheaPackage.MODE:
				return validateMode((Mode)value, diagnostics, context);
			case AmaltheaPackage.MODE_LITERAL:
				return validateModeLiteral((ModeLiteral)value, diagnostics, context);
			case AmaltheaPackage.COMPONENTS_MODEL:
				return validateComponentsModel((ComponentsModel)value, diagnostics, context);
			case AmaltheaPackage.ISYSTEM:
				return validateISystem((ISystem)value, diagnostics, context);
			case AmaltheaPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case AmaltheaPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case AmaltheaPackage.COMPOSITE:
				return validateComposite((Composite)value, diagnostics, context);
			case AmaltheaPackage.SYSTEM:
				return validateSystem((org.eclipse.app4mc.amalthea.model.System)value, diagnostics, context);
			case AmaltheaPackage.COMPONENT_INSTANCE:
				return validateComponentInstance((ComponentInstance)value, diagnostics, context);
			case AmaltheaPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case AmaltheaPackage.QUALIFIED_PORT:
				return validateQualifiedPort((QualifiedPort)value, diagnostics, context);
			case AmaltheaPackage.INTERFACE_PORT:
				return validateInterfacePort((InterfacePort)value, diagnostics, context);
			case AmaltheaPackage.CONFIG_MODEL:
				return validateConfigModel((ConfigModel)value, diagnostics, context);
			case AmaltheaPackage.EVENT_CONFIG:
				return validateEventConfig((EventConfig)value, diagnostics, context);
			case AmaltheaPackage.CONSTRAINTS_MODEL:
				return validateConstraintsModel((ConstraintsModel)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT:
				return validateRunnableSequencingConstraint((RunnableSequencingConstraint)value, diagnostics, context);
			case AmaltheaPackage.AFFINITY_CONSTRAINT:
				return validateAffinityConstraint((AffinityConstraint)value, diagnostics, context);
			case AmaltheaPackage.SEPARATION_CONSTRAINT:
				return validateSeparationConstraint((SeparationConstraint)value, diagnostics, context);
			case AmaltheaPackage.PAIRING_CONSTRAINT:
				return validatePairingConstraint((PairingConstraint)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_CONSTRAINT:
				return validateProcessConstraint((ProcessConstraint)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_CONSTRAINT:
				return validateRunnableConstraint((RunnableConstraint)value, diagnostics, context);
			case AmaltheaPackage.DATA_CONSTRAINT:
				return validateDataConstraint((DataConstraint)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_SEPARATION_CONSTRAINT:
				return validateRunnableSeparationConstraint((RunnableSeparationConstraint)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_SEPARATION_CONSTRAINT:
				return validateProcessSeparationConstraint((ProcessSeparationConstraint)value, diagnostics, context);
			case AmaltheaPackage.DATA_SEPARATION_CONSTRAINT:
				return validateDataSeparationConstraint((DataSeparationConstraint)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT:
				return validateRunnablePairingConstraint((RunnablePairingConstraint)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT:
				return validateProcessPairingConstraint((ProcessPairingConstraint)value, diagnostics, context);
			case AmaltheaPackage.DATA_PAIRING_CONSTRAINT:
				return validateDataPairingConstraint((DataPairingConstraint)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_CONSTRAINT_TARGET:
				return validateRunnableConstraintTarget((RunnableConstraintTarget)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_CONSTRAINT_TARGET:
				return validateProcessConstraintTarget((ProcessConstraintTarget)value, diagnostics, context);
			case AmaltheaPackage.DATA_CONSTRAINT_TARGET:
				return validateDataConstraintTarget((DataConstraintTarget)value, diagnostics, context);
			case AmaltheaPackage.TARGET_MEMORY:
				return validateTargetMemory((TargetMemory)value, diagnostics, context);
			case AmaltheaPackage.TARGET_CORE:
				return validateTargetCore((TargetCore)value, diagnostics, context);
			case AmaltheaPackage.TARGET_SCHEDULER:
				return validateTargetScheduler((TargetScheduler)value, diagnostics, context);
			case AmaltheaPackage.LABEL_GROUP:
				return validateLabelGroup((LabelGroup)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_GROUP:
				return validateRunnableGroup((RunnableGroup)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_GROUP:
				return validateProcessGroup((ProcessGroup)value, diagnostics, context);
			case AmaltheaPackage.LABEL_ENTITY_GROUP:
				return validateLabelEntityGroup((LabelEntityGroup)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_ENTITY_GROUP:
				return validateRunnableEntityGroup((RunnableEntityGroup)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_ENTITY_GROUP:
				return validateProcessEntityGroup((ProcessEntityGroup)value, diagnostics, context);
			case AmaltheaPackage.TAG_GROUP:
				return validateTagGroup((TagGroup)value, diagnostics, context);
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN:
				return validateAbstractEventChain((AbstractEventChain)value, diagnostics, context);
			case AmaltheaPackage.EVENT_CHAIN:
				return validateEventChain((EventChain)value, diagnostics, context);
			case AmaltheaPackage.SUB_EVENT_CHAIN:
				return validateSubEventChain((SubEventChain)value, diagnostics, context);
			case AmaltheaPackage.EVENT_CHAIN_ITEM:
				return validateEventChainItem((EventChainItem)value, diagnostics, context);
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE:
				return validateEventChainReference((EventChainReference)value, diagnostics, context);
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER:
				return validateEventChainContainer((EventChainContainer)value, diagnostics, context);
			case AmaltheaPackage.TIMING_CONSTRAINT:
				return validateTimingConstraint((TimingConstraint)value, diagnostics, context);
			case AmaltheaPackage.PHYSICAL_SECTION_CONSTRAINT:
				return validatePhysicalSectionConstraint((PhysicalSectionConstraint)value, diagnostics, context);
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT:
				return validateSynchronizationConstraint((SynchronizationConstraint)value, diagnostics, context);
			case AmaltheaPackage.EVENT_SYNCHRONIZATION_CONSTRAINT:
				return validateEventSynchronizationConstraint((EventSynchronizationConstraint)value, diagnostics, context);
			case AmaltheaPackage.EVENT_CHAIN_SYNCHRONIZATION_CONSTRAINT:
				return validateEventChainSynchronizationConstraint((EventChainSynchronizationConstraint)value, diagnostics, context);
			case AmaltheaPackage.DELAY_CONSTRAINT:
				return validateDelayConstraint((DelayConstraint)value, diagnostics, context);
			case AmaltheaPackage.EVENT_CHAIN_LATENCY_CONSTRAINT:
				return validateEventChainLatencyConstraint((EventChainLatencyConstraint)value, diagnostics, context);
			case AmaltheaPackage.REPETITION_CONSTRAINT:
				return validateRepetitionConstraint((RepetitionConstraint)value, diagnostics, context);
			case AmaltheaPackage.DATA_AGE_CONSTRAINT:
				return validateDataAgeConstraint((DataAgeConstraint)value, diagnostics, context);
			case AmaltheaPackage.DATA_AGE:
				return validateDataAge((DataAge)value, diagnostics, context);
			case AmaltheaPackage.DATA_AGE_CYCLE:
				return validateDataAgeCycle((DataAgeCycle)value, diagnostics, context);
			case AmaltheaPackage.DATA_AGE_TIME:
				return validateDataAgeTime((DataAgeTime)value, diagnostics, context);
			case AmaltheaPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_REQUIREMENT:
				return validateProcessRequirement((ProcessRequirement)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_REQUIREMENT:
				return validateRunnableRequirement((RunnableRequirement)value, diagnostics, context);
			case AmaltheaPackage.ARCHITECTURE_REQUIREMENT:
				return validateArchitectureRequirement((ArchitectureRequirement)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_CHAIN_REQUIREMENT:
				return validateProcessChainRequirement((ProcessChainRequirement)value, diagnostics, context);
			case AmaltheaPackage.REQUIREMENT_LIMIT:
				return validateRequirementLimit((RequirementLimit)value, diagnostics, context);
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT:
				return validateCPUPercentageRequirementLimit((CPUPercentageRequirementLimit)value, diagnostics, context);
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT:
				return validateFrequencyRequirementLimit((FrequencyRequirementLimit)value, diagnostics, context);
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT:
				return validatePercentageRequirementLimit((PercentageRequirementLimit)value, diagnostics, context);
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT:
				return validateCountRequirementLimit((CountRequirementLimit)value, diagnostics, context);
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT:
				return validateTimeRequirementLimit((TimeRequirementLimit)value, diagnostics, context);
			case AmaltheaPackage.DATA_COHERENCY_GROUP:
				return validateDataCoherencyGroup((DataCoherencyGroup)value, diagnostics, context);
			case AmaltheaPackage.DATA_STABILITY_GROUP:
				return validateDataStabilityGroup((DataStabilityGroup)value, diagnostics, context);
			case AmaltheaPackage.DATA_GROUP_SCOPE:
				return validateDataGroupScope((DataGroupScope)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_SCOPE:
				return validateProcessScope((ProcessScope)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_SCOPE:
				return validateRunnableScope((RunnableScope)value, diagnostics, context);
			case AmaltheaPackage.COMPONENT_SCOPE:
				return validateComponentScope((ComponentScope)value, diagnostics, context);
			case AmaltheaPackage.EVENT_MODEL:
				return validateEventModel((EventModel)value, diagnostics, context);
			case AmaltheaPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case AmaltheaPackage.EVENT_SET:
				return validateEventSet((EventSet)value, diagnostics, context);
			case AmaltheaPackage.ENTITY_EVENT:
				return validateEntityEvent((EntityEvent)value, diagnostics, context);
			case AmaltheaPackage.TRIGGER_EVENT:
				return validateTriggerEvent((TriggerEvent)value, diagnostics, context);
			case AmaltheaPackage.CUSTOM_EVENT:
				return validateCustomEvent((CustomEvent)value, diagnostics, context);
			case AmaltheaPackage.STIMULUS_EVENT:
				return validateStimulusEvent((StimulusEvent)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_EVENT:
				return validateProcessEvent((ProcessEvent)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_CHAIN_EVENT:
				return validateProcessChainEvent((ProcessChainEvent)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_EVENT:
				return validateRunnableEvent((RunnableEvent)value, diagnostics, context);
			case AmaltheaPackage.LABEL_EVENT:
				return validateLabelEvent((LabelEvent)value, diagnostics, context);
			case AmaltheaPackage.CHANNEL_EVENT:
				return validateChannelEvent((ChannelEvent)value, diagnostics, context);
			case AmaltheaPackage.SEMAPHORE_EVENT:
				return validateSemaphoreEvent((SemaphoreEvent)value, diagnostics, context);
			case AmaltheaPackage.COMPONENT_EVENT:
				return validateComponentEvent((ComponentEvent)value, diagnostics, context);
			case AmaltheaPackage.HW_MODEL:
				return validateHWModel((HWModel)value, diagnostics, context);
			case AmaltheaPackage.COMPLEX_NODE:
				return validateComplexNode((ComplexNode)value, diagnostics, context);
			case AmaltheaPackage.HW_SYSTEM:
				return validateHwSystem((HwSystem)value, diagnostics, context);
			case AmaltheaPackage.ECU:
				return validateECU((ECU)value, diagnostics, context);
			case AmaltheaPackage.MICROCONTROLLER:
				return validateMicrocontroller((Microcontroller)value, diagnostics, context);
			case AmaltheaPackage.CORE:
				return validateCore((Core)value, diagnostics, context);
			case AmaltheaPackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case AmaltheaPackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case AmaltheaPackage.QUARTZ:
				return validateQuartz((Quartz)value, diagnostics, context);
			case AmaltheaPackage.HW_COMPONENT:
				return validateHwComponent((HwComponent)value, diagnostics, context);
			case AmaltheaPackage.HARDWARE_TYPE_DESCRIPTION:
				return validateHardwareTypeDescription((HardwareTypeDescription)value, diagnostics, context);
			case AmaltheaPackage.ABSTRACTION_TYPE:
				return validateAbstractionType((AbstractionType)value, diagnostics, context);
			case AmaltheaPackage.SYSTEM_TYPE:
				return validateSystemType((SystemType)value, diagnostics, context);
			case AmaltheaPackage.ECU_TYPE:
				return validateECUType((ECUType)value, diagnostics, context);
			case AmaltheaPackage.MICROCONTROLLER_TYPE:
				return validateMicrocontrollerType((MicrocontrollerType)value, diagnostics, context);
			case AmaltheaPackage.CORE_TYPE:
				return validateCoreType((CoreType)value, diagnostics, context);
			case AmaltheaPackage.MEMORY_TYPE:
				return validateMemoryType((MemoryType)value, diagnostics, context);
			case AmaltheaPackage.NETWORK_TYPE:
				return validateNetworkType((NetworkType)value, diagnostics, context);
			case AmaltheaPackage.HW_PORT:
				return validateHwPort((HwPort)value, diagnostics, context);
			case AmaltheaPackage.PIN:
				return validatePin((Pin)value, diagnostics, context);
			case AmaltheaPackage.COMPLEX_PORT:
				return validateComplexPort((ComplexPort)value, diagnostics, context);
			case AmaltheaPackage.COMPLEX_PIN:
				return validateComplexPin((ComplexPin)value, diagnostics, context);
			case AmaltheaPackage.PRESCALER:
				return validatePrescaler((Prescaler)value, diagnostics, context);
			case AmaltheaPackage.CROSSBAR_SWITCH:
				return validateCrossbarSwitch((CrossbarSwitch)value, diagnostics, context);
			case AmaltheaPackage.BUS:
				return validateBus((Bus)value, diagnostics, context);
			case AmaltheaPackage.BRIDGE:
				return validateBridge((Bridge)value, diagnostics, context);
			case AmaltheaPackage.ACCESS_PATH:
				return validateAccessPath((AccessPath)value, diagnostics, context);
			case AmaltheaPackage.LATENCY_ACCESS_PATH:
				return validateLatencyAccessPath((LatencyAccessPath)value, diagnostics, context);
			case AmaltheaPackage.HW_ACCESS_PATH:
				return validateHwAccessPath((HwAccessPath)value, diagnostics, context);
			case AmaltheaPackage.LATENCY_ACCESS_PATH_ELEMENT:
				return validateLatencyAccessPathElement((LatencyAccessPathElement)value, diagnostics, context);
			case AmaltheaPackage.ACCESS_PATH_REF:
				return validateAccessPathRef((AccessPathRef)value, diagnostics, context);
			case AmaltheaPackage.LATENCY:
				return validateLatency((Latency)value, diagnostics, context);
			case AmaltheaPackage.LATENCY_CONSTANT:
				return validateLatencyConstant((LatencyConstant)value, diagnostics, context);
			case AmaltheaPackage.LATENCY_DEVIATION:
				return validateLatencyDeviation((LatencyDeviation)value, diagnostics, context);
			case AmaltheaPackage.HW_ACCESS_PATH_ELEMENT:
				return validateHwAccessPathElement((HwAccessPathElement)value, diagnostics, context);
			case AmaltheaPackage.HW_ACCESS_PATH_REF:
				return validateHwAccessPathRef((HwAccessPathRef)value, diagnostics, context);
			case AmaltheaPackage.HW_ELEMENT_REF:
				return validateHwElementRef((HwElementRef)value, diagnostics, context);
			case AmaltheaPackage.MAPPING_MODEL:
				return validateMappingModel((MappingModel)value, diagnostics, context);
			case AmaltheaPackage.SCHEDULER_ALLOCATION:
				return validateSchedulerAllocation((SchedulerAllocation)value, diagnostics, context);
			case AmaltheaPackage.TASK_ALLOCATION:
				return validateTaskAllocation((TaskAllocation)value, diagnostics, context);
			case AmaltheaPackage.ISR_ALLOCATION:
				return validateISRAllocation((ISRAllocation)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_ALLOCATION:
				return validateRunnableAllocation((RunnableAllocation)value, diagnostics, context);
			case AmaltheaPackage.MEMORY_MAPPING:
				return validateMemoryMapping((MemoryMapping)value, diagnostics, context);
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING:
				return validatePhysicalSectionMapping((PhysicalSectionMapping)value, diagnostics, context);
			case AmaltheaPackage.OS_MODEL:
				return validateOSModel((OSModel)value, diagnostics, context);
			case AmaltheaPackage.OS_DATA_CONSISTENCY:
				return validateOsDataConsistency((OsDataConsistency)value, diagnostics, context);
			case AmaltheaPackage.DATA_STABILITY:
				return validateDataStability((DataStability)value, diagnostics, context);
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY:
				return validateNonAtomicDataCoherency((NonAtomicDataCoherency)value, diagnostics, context);
			case AmaltheaPackage.SEMAPHORE:
				return validateSemaphore((Semaphore)value, diagnostics, context);
			case AmaltheaPackage.SCHEDULER:
				return validateScheduler((Scheduler)value, diagnostics, context);
			case AmaltheaPackage.TASK_SCHEDULER:
				return validateTaskScheduler((TaskScheduler)value, diagnostics, context);
			case AmaltheaPackage.SCHEDULER_ASSOCIATION:
				return validateSchedulerAssociation((SchedulerAssociation)value, diagnostics, context);
			case AmaltheaPackage.INTERRUPT_CONTROLLER:
				return validateInterruptController((InterruptController)value, diagnostics, context);
			case AmaltheaPackage.SCHEDULING_PARAMETERS:
				return validateSchedulingParameters((SchedulingParameters)value, diagnostics, context);
			case AmaltheaPackage.PARAMETER_EXTENSION:
				return validateParameterExtension((Map.Entry<?, ?>)value, diagnostics, context);
			case AmaltheaPackage.ALGORITHM:
				return validateAlgorithm((Algorithm)value, diagnostics, context);
			case AmaltheaPackage.INTERRUPT_SCHEDULING_ALGORITHM:
				return validateInterruptSchedulingAlgorithm((InterruptSchedulingAlgorithm)value, diagnostics, context);
			case AmaltheaPackage.TASK_SCHEDULING_ALGORITHM:
				return validateTaskSchedulingAlgorithm((TaskSchedulingAlgorithm)value, diagnostics, context);
			case AmaltheaPackage.FIXED_PRIORITY:
				return validateFixedPriority((FixedPriority)value, diagnostics, context);
			case AmaltheaPackage.FIXED_PRIORITY_PREEMPTIVE:
				return validateFixedPriorityPreemptive((FixedPriorityPreemptive)value, diagnostics, context);
			case AmaltheaPackage.FIXED_PRIORITY_PREEMPTIVE_WITH_BUDGET_ENFORCEMENT:
				return validateFixedPriorityPreemptiveWithBudgetEnforcement((FixedPriorityPreemptiveWithBudgetEnforcement)value, diagnostics, context);
			case AmaltheaPackage.OSEK:
				return validateOSEK((OSEK)value, diagnostics, context);
			case AmaltheaPackage.DEADLINE_MONOTONIC:
				return validateDeadlineMonotonic((DeadlineMonotonic)value, diagnostics, context);
			case AmaltheaPackage.RATE_MONOTONIC:
				return validateRateMonotonic((RateMonotonic)value, diagnostics, context);
			case AmaltheaPackage.PFAIR:
				return validatePfair((Pfair)value, diagnostics, context);
			case AmaltheaPackage.PFAIR_PD2:
				return validatePfairPD2((PfairPD2)value, diagnostics, context);
			case AmaltheaPackage.PARTLY_PFAIR_PD2:
				return validatePartlyPFairPD2((PartlyPFairPD2)value, diagnostics, context);
			case AmaltheaPackage.EARLY_RELEASE_FAIR_PD2:
				return validateEarlyReleaseFairPD2((EarlyReleaseFairPD2)value, diagnostics, context);
			case AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2:
				return validatePartlyEarlyReleaseFairPD2((PartlyEarlyReleaseFairPD2)value, diagnostics, context);
			case AmaltheaPackage.DYNAMIC_PRIORITY:
				return validateDynamicPriority((DynamicPriority)value, diagnostics, context);
			case AmaltheaPackage.LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST:
				return validateLeastLocalRemainingExecutionTimeFirst((LeastLocalRemainingExecutionTimeFirst)value, diagnostics, context);
			case AmaltheaPackage.EARLIEST_DEADLINE_FIRST:
				return validateEarliestDeadlineFirst((EarliestDeadlineFirst)value, diagnostics, context);
			case AmaltheaPackage.PRIORITY_BASED_ROUND_ROBIN:
				return validatePriorityBasedRoundRobin((PriorityBasedRoundRobin)value, diagnostics, context);
			case AmaltheaPackage.RESERVATION_BASED_SERVER:
				return validateReservationBasedServer((ReservationBasedServer)value, diagnostics, context);
			case AmaltheaPackage.DEFERRABLE_SERVER:
				return validateDeferrableServer((DeferrableServer)value, diagnostics, context);
			case AmaltheaPackage.POLLING_PERIODIC_SERVER:
				return validatePollingPeriodicServer((PollingPeriodicServer)value, diagnostics, context);
			case AmaltheaPackage.SPORADIC_SERVER:
				return validateSporadicServer((SporadicServer)value, diagnostics, context);
			case AmaltheaPackage.CONSTANT_BANDWIDTH_SERVER:
				return validateConstantBandwidthServer((ConstantBandwidthServer)value, diagnostics, context);
			case AmaltheaPackage.CONSTANT_BANDWIDTH_SERVER_WITH_CASH:
				return validateConstantBandwidthServerWithCASH((ConstantBandwidthServerWithCASH)value, diagnostics, context);
			case AmaltheaPackage.GROUPING:
				return validateGrouping((Grouping)value, diagnostics, context);
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM:
				return validateUserSpecificSchedulingAlgorithm((UserSpecificSchedulingAlgorithm)value, diagnostics, context);
			case AmaltheaPackage.PRIORITY_BASED:
				return validatePriorityBased((PriorityBased)value, diagnostics, context);
			case AmaltheaPackage.OPERATING_SYSTEM:
				return validateOperatingSystem((OperatingSystem)value, diagnostics, context);
			case AmaltheaPackage.VENDOR_OPERATING_SYSTEM:
				return validateVendorOperatingSystem((VendorOperatingSystem)value, diagnostics, context);
			case AmaltheaPackage.OS_INSTRUCTIONS:
				return validateOsInstructions((OsInstructions)value, diagnostics, context);
			case AmaltheaPackage.OS_API_INSTRUCTIONS:
				return validateOsAPIInstructions((OsAPIInstructions)value, diagnostics, context);
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS:
				return validateOsISRInstructions((OsISRInstructions)value, diagnostics, context);
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL:
				return validatePropertyConstraintsModel((PropertyConstraintsModel)value, diagnostics, context);
			case AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT:
				return validateCoreAllocationConstraint((CoreAllocationConstraint)value, diagnostics, context);
			case AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT:
				return validateMemoryMappingConstraint((MemoryMappingConstraint)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_ALLOCATION_CONSTRAINT:
				return validateProcessAllocationConstraint((ProcessAllocationConstraint)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT:
				return validateProcessPrototypeAllocationConstraint((ProcessPrototypeAllocationConstraint)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_ALLOCATION_CONSTRAINT:
				return validateRunnableAllocationConstraint((RunnableAllocationConstraint)value, diagnostics, context);
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT:
				return validateAbstractElementMappingConstraint((AbstractElementMappingConstraint)value, diagnostics, context);
			case AmaltheaPackage.CLASSIFICATION:
				return validateClassification((Classification)value, diagnostics, context);
			case AmaltheaPackage.CORE_CLASSIFICATION:
				return validateCoreClassification((CoreClassification)value, diagnostics, context);
			case AmaltheaPackage.MEMORY_CLASSIFICATION:
				return validateMemoryClassification((MemoryClassification)value, diagnostics, context);
			case AmaltheaPackage.STIMULI_MODEL:
				return validateStimuliModel((StimuliModel)value, diagnostics, context);
			case AmaltheaPackage.STIMULUS:
				return validateStimulus((Stimulus)value, diagnostics, context);
			case AmaltheaPackage.MODE_VALUE_LIST:
				return validateModeValueList((ModeValueList)value, diagnostics, context);
			case AmaltheaPackage.MODE_VALUE_MAP_ENTRY:
				return validateModeValueMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case AmaltheaPackage.MODE_VALUE_DISJUNCTION:
				return validateModeValueDisjunction((ModeValueDisjunction)value, diagnostics, context);
			case AmaltheaPackage.MODE_VALUE_DISJUNCTION_ENTRY:
				return validateModeValueDisjunctionEntry((ModeValueDisjunctionEntry)value, diagnostics, context);
			case AmaltheaPackage.MODE_VALUE:
				return validateModeValue((ModeValue)value, diagnostics, context);
			case AmaltheaPackage.MODE_VALUE_CONJUNCTION:
				return validateModeValueConjunction((ModeValueConjunction)value, diagnostics, context);
			case AmaltheaPackage.FIXED_PERIODIC:
				return validateFixedPeriodic((FixedPeriodic)value, diagnostics, context);
			case AmaltheaPackage.PERIODIC_STIMULUS:
				return validatePeriodicStimulus((PeriodicStimulus)value, diagnostics, context);
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS:
				return validateRelativePeriodicStimulus((RelativePeriodicStimulus)value, diagnostics, context);
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS:
				return validateVariableRateStimulus((VariableRateStimulus)value, diagnostics, context);
			case AmaltheaPackage.SCENARIO:
				return validateScenario((Scenario)value, diagnostics, context);
			case AmaltheaPackage.PERIODIC_SYNTHETIC_STIMULUS:
				return validatePeriodicSyntheticStimulus((PeriodicSyntheticStimulus)value, diagnostics, context);
			case AmaltheaPackage.CUSTOM_STIMULUS:
				return validateCustomStimulus((CustomStimulus)value, diagnostics, context);
			case AmaltheaPackage.SINGLE_STIMULUS:
				return validateSingleStimulus((SingleStimulus)value, diagnostics, context);
			case AmaltheaPackage.INTER_PROCESS_STIMULUS:
				return validateInterProcessStimulus((InterProcessStimulus)value, diagnostics, context);
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS:
				return validatePeriodicBurstStimulus((PeriodicBurstStimulus)value, diagnostics, context);
			case AmaltheaPackage.EVENT_STIMULUS:
				return validateEventStimulus((EventStimulus)value, diagnostics, context);
			case AmaltheaPackage.ARRIVAL_CURVE_STIMULUS:
				return validateArrivalCurveStimulus((ArrivalCurveStimulus)value, diagnostics, context);
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY:
				return validateArrivalCurveEntry((ArrivalCurveEntry)value, diagnostics, context);
			case AmaltheaPackage.CLOCK:
				return validateClock((Clock)value, diagnostics, context);
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION:
				return validateClockTriangleFunction((ClockTriangleFunction)value, diagnostics, context);
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION:
				return validateClockSinusFunction((ClockSinusFunction)value, diagnostics, context);
			case AmaltheaPackage.CLOCK_MULTIPLIER_LIST:
				return validateClockMultiplierList((ClockMultiplierList)value, diagnostics, context);
			case AmaltheaPackage.CLOCK_MULTIPLIER_LIST_ENTRY:
				return validateClockMultiplierListEntry((ClockMultiplierListEntry)value, diagnostics, context);
			case AmaltheaPackage.SW_MODEL:
				return validateSWModel((SWModel)value, diagnostics, context);
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT:
				return validateAbstractMemoryElement((AbstractMemoryElement)value, diagnostics, context);
			case AmaltheaPackage.ABSTRACT_PROCESS:
				return validateAbstractProcess((AbstractProcess)value, diagnostics, context);
			case AmaltheaPackage.CUSTOM_ENTITY:
				return validateCustomEntity((CustomEntity)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_CHAIN:
				return validateProcessChain((ProcessChain)value, diagnostics, context);
			case AmaltheaPackage.PROCESS:
				return validateProcess((org.eclipse.app4mc.amalthea.model.Process)value, diagnostics, context);
			case AmaltheaPackage.CALL_GRAPH:
				return validateCallGraph((CallGraph)value, diagnostics, context);
			case AmaltheaPackage.GRAPH_ENTRY_BASE:
				return validateGraphEntryBase((GraphEntryBase)value, diagnostics, context);
			case AmaltheaPackage.CALL_SEQUENCE:
				return validateCallSequence((CallSequence)value, diagnostics, context);
			case AmaltheaPackage.MODE_SWITCH:
				return validateModeSwitch((ModeSwitch)value, diagnostics, context);
			case AmaltheaPackage.MODE_SWITCH_ENTRY:
				return validateModeSwitchEntry((ModeSwitchEntry<?>)value, diagnostics, context);
			case AmaltheaPackage.MODE_SWITCH_DEFAULT:
				return validateModeSwitchDefault((ModeSwitchDefault<?>)value, diagnostics, context);
			case AmaltheaPackage.PROBABILITY_SWITCH:
				return validateProbabilitySwitch((ProbabilitySwitch)value, diagnostics, context);
			case AmaltheaPackage.PROBABILITY_SWITCH_ENTRY:
				return validateProbabilitySwitchEntry((ProbabilitySwitchEntry<?>)value, diagnostics, context);
			case AmaltheaPackage.COUNTER:
				return validateCounter((Counter)value, diagnostics, context);
			case AmaltheaPackage.CALL_SEQUENCE_ITEM:
				return validateCallSequenceItem((CallSequenceItem)value, diagnostics, context);
			case AmaltheaPackage.WAIT_EVENT:
				return validateWaitEvent((WaitEvent)value, diagnostics, context);
			case AmaltheaPackage.SET_EVENT:
				return validateSetEvent((SetEvent)value, diagnostics, context);
			case AmaltheaPackage.CLEAR_EVENT:
				return validateClearEvent((ClearEvent)value, diagnostics, context);
			case AmaltheaPackage.EVENT_MASK:
				return validateEventMask((EventMask)value, diagnostics, context);
			case AmaltheaPackage.OS_EVENT:
				return validateOsEvent((OsEvent)value, diagnostics, context);
			case AmaltheaPackage.INTER_PROCESS_TRIGGER:
				return validateInterProcessTrigger((InterProcessTrigger)value, diagnostics, context);
			case AmaltheaPackage.ENFORCED_MIGRATION:
				return validateEnforcedMigration((EnforcedMigration)value, diagnostics, context);
			case AmaltheaPackage.TASK_RUNNABLE_CALL:
				return validateTaskRunnableCall((TaskRunnableCall)value, diagnostics, context);
			case AmaltheaPackage.SCHEDULE_POINT:
				return validateSchedulePoint((SchedulePoint)value, diagnostics, context);
			case AmaltheaPackage.TERMINATE_PROCESS:
				return validateTerminateProcess((TerminateProcess)value, diagnostics, context);
			case AmaltheaPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case AmaltheaPackage.ISR:
				return validateISR((ISR)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_PROTOTYPE:
				return validateProcessPrototype((ProcessPrototype)value, diagnostics, context);
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE:
				return validateChainedProcessPrototype((ChainedProcessPrototype)value, diagnostics, context);
			case AmaltheaPackage.GENERAL_PRECEDENCE:
				return validateGeneralPrecedence((GeneralPrecedence)value, diagnostics, context);
			case AmaltheaPackage.ACCESS_PRECEDENCE_SPEC:
				return validateAccessPrecedenceSpec((AccessPrecedenceSpec)value, diagnostics, context);
			case AmaltheaPackage.ORDER_PRECEDENCE_SPEC:
				return validateOrderPrecedenceSpec((OrderPrecedenceSpec)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE:
				return validateRunnable((org.eclipse.app4mc.amalthea.model.Runnable)value, diagnostics, context);
			case AmaltheaPackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case AmaltheaPackage.CHANNEL:
				return validateChannel((Channel)value, diagnostics, context);
			case AmaltheaPackage.MODE_LABEL:
				return validateModeLabel((ModeLabel)value, diagnostics, context);
			case AmaltheaPackage.SECTION:
				return validateSection((Section)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_ITEM:
				return validateRunnableItem((RunnableItem)value, diagnostics, context);
			case AmaltheaPackage.COMPUTATION_ITEM:
				return validateComputationItem((ComputationItem)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_INSTRUCTIONS:
				return validateRunnableInstructions((RunnableInstructions)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_INSTRUCTIONS_ENTRY:
				return validateRunnableInstructionsEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case AmaltheaPackage.MODE_LABEL_ACCESS:
				return validateModeLabelAccess((ModeLabelAccess)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH:
				return validateRunnableModeSwitch((RunnableModeSwitch)value, diagnostics, context);
			case AmaltheaPackage.LABEL_ACCESS:
				return validateLabelAccess((LabelAccess)value, diagnostics, context);
			case AmaltheaPackage.CHANNEL_ACCESS:
				return validateChannelAccess((ChannelAccess)value, diagnostics, context);
			case AmaltheaPackage.CHANNEL_SEND:
				return validateChannelSend((ChannelSend)value, diagnostics, context);
			case AmaltheaPackage.CHANNEL_RECEIVE:
				return validateChannelReceive((ChannelReceive)value, diagnostics, context);
			case AmaltheaPackage.SEMAPHORE_ACCESS:
				return validateSemaphoreAccess((SemaphoreAccess)value, diagnostics, context);
			case AmaltheaPackage.SENDER_RECEIVER_COMMUNICATION:
				return validateSenderReceiverCommunication((SenderReceiverCommunication)value, diagnostics, context);
			case AmaltheaPackage.SENDER_RECEIVER_READ:
				return validateSenderReceiverRead((SenderReceiverRead)value, diagnostics, context);
			case AmaltheaPackage.SENDER_RECEIVER_WRITE:
				return validateSenderReceiverWrite((SenderReceiverWrite)value, diagnostics, context);
			case AmaltheaPackage.SERVER_CALL:
				return validateServerCall((ServerCall)value, diagnostics, context);
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL:
				return validateSynchronousServerCall((SynchronousServerCall)value, diagnostics, context);
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL:
				return validateAsynchronousServerCall((AsynchronousServerCall)value, diagnostics, context);
			case AmaltheaPackage.GET_RESULT_SERVER_CALL:
				return validateGetResultServerCall((GetResultServerCall)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_PROBABILITY_SWITCH:
				return validateRunnableProbabilitySwitch((RunnableProbabilitySwitch)value, diagnostics, context);
			case AmaltheaPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_CALL:
				return validateRunnableCall((RunnableCall)value, diagnostics, context);
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER:
				return validateCustomEventTrigger((CustomEventTrigger)value, diagnostics, context);
			case AmaltheaPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case AmaltheaPackage.COMPOUND_TYPE:
				return validateCompoundType((CompoundType)value, diagnostics, context);
			case AmaltheaPackage.STRUCT:
				return validateStruct((Struct)value, diagnostics, context);
			case AmaltheaPackage.STRUCT_ENTRY:
				return validateStructEntry((StructEntry)value, diagnostics, context);
			case AmaltheaPackage.ARRAY:
				return validateArray((Array)value, diagnostics, context);
			case AmaltheaPackage.POINTER:
				return validatePointer((Pointer)value, diagnostics, context);
			case AmaltheaPackage.TYPE_REF:
				return validateTypeRef((TypeRef)value, diagnostics, context);
			case AmaltheaPackage.DATA_PLATFORM_MAPPING:
				return validateDataPlatformMapping((DataPlatformMapping)value, diagnostics, context);
			case AmaltheaPackage.TYPE_DEFINITION:
				return validateTypeDefinition((TypeDefinition)value, diagnostics, context);
			case AmaltheaPackage.DATA_TYPE_DEFINITION:
				return validateDataTypeDefinition((DataTypeDefinition)value, diagnostics, context);
			case AmaltheaPackage.BASE_TYPE_DEFINITION:
				return validateBaseTypeDefinition((BaseTypeDefinition)value, diagnostics, context);
			case AmaltheaPackage.ACTIVATION:
				return validateActivation((Activation)value, diagnostics, context);
			case AmaltheaPackage.PERIODIC_ACTIVATION:
				return validatePeriodicActivation((PeriodicActivation)value, diagnostics, context);
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION:
				return validateVariableRateActivation((VariableRateActivation)value, diagnostics, context);
			case AmaltheaPackage.SPORADIC_ACTIVATION:
				return validateSporadicActivation((SporadicActivation)value, diagnostics, context);
			case AmaltheaPackage.SINGLE_ACTIVATION:
				return validateSingleActivation((SingleActivation)value, diagnostics, context);
			case AmaltheaPackage.EVENT_ACTIVATION:
				return validateEventActivation((EventActivation)value, diagnostics, context);
			case AmaltheaPackage.CUSTOM_ACTIVATION:
				return validateCustomActivation((CustomActivation)value, diagnostics, context);
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC:
				return validateLabelAccessStatistic((LabelAccessStatistic)value, diagnostics, context);
			case AmaltheaPackage.INSTRUCTION_FETCH:
				return validateInstructionFetch((InstructionFetch)value, diagnostics, context);
			case AmaltheaPackage.RUN_ENTITY_CALL_STATISTIC:
				return validateRunEntityCallStatistic((RunEntityCallStatistic)value, diagnostics, context);
			case AmaltheaPackage.MEASUREMENT_MODEL:
				return validateMeasurementModel((MeasurementModel)value, diagnostics, context);
			case AmaltheaPackage.MEASUREMENT:
				return validateMeasurement((Measurement)value, diagnostics, context);
			case AmaltheaPackage.EVENT_CHAIN_MEASUREMENT:
				return validateEventChainMeasurement((EventChainMeasurement)value, diagnostics, context);
			case AmaltheaPackage.TASK_MEASUREMENT:
				return validateTaskMeasurement((TaskMeasurement)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_MEASUREMENT:
				return validateRunnableMeasurement((RunnableMeasurement)value, diagnostics, context);
			case AmaltheaPackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case AmaltheaPackage.FREQUENCY_UNIT:
				return validateFrequencyUnit((FrequencyUnit)value, diagnostics, context);
			case AmaltheaPackage.VOLTAGE_UNIT:
				return validateVoltageUnit((VoltageUnit)value, diagnostics, context);
			case AmaltheaPackage.DATA_SIZE_UNIT:
				return validateDataSizeUnit((DataSizeUnit)value, diagnostics, context);
			case AmaltheaPackage.DATA_RATE_UNIT:
				return validateDataRateUnit((DataRateUnit)value, diagnostics, context);
			case AmaltheaPackage.SAMPLING_TYPE:
				return validateSamplingType((SamplingType)value, diagnostics, context);
			case AmaltheaPackage.INTERFACE_KIND:
				return validateInterfaceKind((InterfaceKind)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_ORDER_TYPE:
				return validateRunnableOrderType((RunnableOrderType)value, diagnostics, context);
			case AmaltheaPackage.SYNCHRONIZATION_TYPE:
				return validateSynchronizationType((SynchronizationType)value, diagnostics, context);
			case AmaltheaPackage.MAPPING_TYPE:
				return validateMappingType((MappingType)value, diagnostics, context);
			case AmaltheaPackage.LATENCY_TYPE:
				return validateLatencyType((LatencyType)value, diagnostics, context);
			case AmaltheaPackage.SEVERITY:
				return validateSeverity((Severity)value, diagnostics, context);
			case AmaltheaPackage.LIMIT_TYPE:
				return validateLimitType((LimitType)value, diagnostics, context);
			case AmaltheaPackage.TIME_METRIC:
				return validateTimeMetric((TimeMetric)value, diagnostics, context);
			case AmaltheaPackage.COUNT_METRIC:
				return validateCountMetric((CountMetric)value, diagnostics, context);
			case AmaltheaPackage.PERCENTAGE_METRIC:
				return validatePercentageMetric((PercentageMetric)value, diagnostics, context);
			case AmaltheaPackage.CPU_PERCENTAGE_METRIC:
				return validateCPUPercentageMetric((CPUPercentageMetric)value, diagnostics, context);
			case AmaltheaPackage.FREQUENCY_METRIC:
				return validateFrequencyMetric((FrequencyMetric)value, diagnostics, context);
			case AmaltheaPackage.COHERENCY_DIRECTION:
				return validateCoherencyDirection((CoherencyDirection)value, diagnostics, context);
			case AmaltheaPackage.PROCESS_EVENT_TYPE:
				return validateProcessEventType((ProcessEventType)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_EVENT_TYPE:
				return validateRunnableEventType((RunnableEventType)value, diagnostics, context);
			case AmaltheaPackage.LABEL_EVENT_TYPE:
				return validateLabelEventType((LabelEventType)value, diagnostics, context);
			case AmaltheaPackage.CHANNEL_EVENT_TYPE:
				return validateChannelEventType((ChannelEventType)value, diagnostics, context);
			case AmaltheaPackage.SEMAPHORE_EVENT_TYPE:
				return validateSemaphoreEventType((SemaphoreEventType)value, diagnostics, context);
			case AmaltheaPackage.COMPONENT_EVENT_TYPE:
				return validateComponentEventType((ComponentEventType)value, diagnostics, context);
			case AmaltheaPackage.QTYPE:
				return validateQType((QType)value, diagnostics, context);
			case AmaltheaPackage.MEMORY_TYPE_ENUM:
				return validateMemoryTypeEnum((MemoryTypeEnum)value, diagnostics, context);
			case AmaltheaPackage.BUS_TYPE:
				return validateBusType((BusType)value, diagnostics, context);
			case AmaltheaPackage.RW_TYPE:
				return validateRWType((RWType)value, diagnostics, context);
			case AmaltheaPackage.SCHED_TYPE:
				return validateSchedType((SchedType)value, diagnostics, context);
			case AmaltheaPackage.PIN_TYPE:
				return validatePinType((PinType)value, diagnostics, context);
			case AmaltheaPackage.MEMORY_ADDRESS_MAPPING_TYPE:
				return validateMemoryAddressMappingType((MemoryAddressMappingType)value, diagnostics, context);
			case AmaltheaPackage.OS_DATA_CONSISTENCY_MODE:
				return validateOsDataConsistencyMode((OsDataConsistencyMode)value, diagnostics, context);
			case AmaltheaPackage.ACCESS_MULTIPLICITY:
				return validateAccessMultiplicity((AccessMultiplicity)value, diagnostics, context);
			case AmaltheaPackage.DATA_STABILITY_LEVEL:
				return validateDataStabilityLevel((DataStabilityLevel)value, diagnostics, context);
			case AmaltheaPackage.SEMAPHORE_TYPE:
				return validateSemaphoreType((SemaphoreType)value, diagnostics, context);
			case AmaltheaPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case AmaltheaPackage.GROUPING_TYPE:
				return validateGroupingType((GroupingType)value, diagnostics, context);
			case AmaltheaPackage.WAIT_EVENT_TYPE:
				return validateWaitEventType((WaitEventType)value, diagnostics, context);
			case AmaltheaPackage.WAITING_BEHAVIOUR:
				return validateWaitingBehaviour((WaitingBehaviour)value, diagnostics, context);
			case AmaltheaPackage.ISR_CATEGORY:
				return validateISRCategory((ISRCategory)value, diagnostics, context);
			case AmaltheaPackage.ACCESS_PRECEDENCE_TYPE:
				return validateAccessPrecedenceType((AccessPrecedenceType)value, diagnostics, context);
			case AmaltheaPackage.ORDER_TYPE:
				return validateOrderType((OrderType)value, diagnostics, context);
			case AmaltheaPackage.LABEL_DATA_STABILITY:
				return validateLabelDataStability((LabelDataStability)value, diagnostics, context);
			case AmaltheaPackage.RECEIVE_OPERATION:
				return validateReceiveOperation((ReceiveOperation)value, diagnostics, context);
			case AmaltheaPackage.LABEL_ACCESS_DATA_STABILITY:
				return validateLabelAccessDataStability((LabelAccessDataStability)value, diagnostics, context);
			case AmaltheaPackage.LABEL_ACCESS_ENUM:
				return validateLabelAccessEnum((LabelAccessEnum)value, diagnostics, context);
			case AmaltheaPackage.LABEL_ACCESS_IMPLEMENTATION:
				return validateLabelAccessImplementation((LabelAccessImplementation)value, diagnostics, context);
			case AmaltheaPackage.SEMAPHORE_ACCESS_ENUM:
				return validateSemaphoreAccessEnum((SemaphoreAccessEnum)value, diagnostics, context);
			case AmaltheaPackage.BLOCKING_TYPE:
				return validateBlockingType((BlockingType)value, diagnostics, context);
			case AmaltheaPackage.PREEMPTION:
				return validatePreemption((Preemption)value, diagnostics, context);
			case AmaltheaPackage.CONCURRENCY_TYPE:
				return validateConcurrencyType((ConcurrencyType)value, diagnostics, context);
			case AmaltheaPackage.ASIL_TYPE:
				return validateASILType((ASILType)value, diagnostics, context);
			case AmaltheaPackage.ADDRESS:
				return validateAddress((Long)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAmalthea(Amalthea amalthea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(amalthea, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonElements(CommonElements commonElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseObject(BaseObject baseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferableObject(ReferableObject referableObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referableObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferableBaseObject(ReferableBaseObject referableBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referableBaseObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIAnnotatable(IAnnotatable iAnnotatable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iAnnotatable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITaggable(ITaggable iTaggable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iTaggable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINamed(INamed iNamed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iNamed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIReferable(IReferable iReferable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iReferable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDisplayName(IDisplayName iDisplayName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iDisplayName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoreClassifier(CoreClassifier coreClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coreClassifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryClassifier(MemoryClassifier memoryClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryClassifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructions(Instructions instructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionPolicy(TransmissionPolicy transmissionPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsDeviation(InstructionsDeviation instructionsDeviation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructionsDeviation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionsConstant(InstructionsConstant instructionsConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructionsConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeComparable(Comparable<AbstractTime> timeComparable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)timeComparable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTime(AbstractTime abstractTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequency(Frequency frequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frequency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltage(Voltage voltage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(voltage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSize(DataSize dataSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRate(DataRate dataRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomProperty(Map.Entry<?, ?> customProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)customProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListObject(ListObject listObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringObject(StringObject stringObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBigIntegerObject(BigIntegerObject bigIntegerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bigIntegerObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceObject(ReferenceObject referenceObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerObject(IntegerObject integerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongObject(LongObject longObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatObject(FloatObject floatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleObject(DoubleObject doubleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanObject(BooleanObject booleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeObject(TimeObject timeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviation(Deviation<?> deviation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistribution(Distribution<?> distribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeibullDistribution(WeibullDistribution<?> weibullDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weibullDistribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeibullParameters(WeibullParameters<?> weibullParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weibullParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeibullEstimators(WeibullEstimators<?> weibullEstimators, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weibullEstimators, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniformDistribution(UniformDistribution<?> uniformDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uniformDistribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaries(Boundaries<?> boundaries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundaries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGaussDistribution(GaussDistribution<?> gaussDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gaussDistribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetaDistribution(BetaDistribution<?> betaDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(betaDistribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericStatistic(NumericStatistic numericStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericStatistic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinAvgMaxStatistic(MinAvgMaxStatistic minAvgMaxStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minAvgMaxStatistic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleValueStatistic(SingleValueStatistic singleValueStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleValueStatistic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeLiteral(ModeLiteral modeLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentsModel(ComponentsModel componentsModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentsModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISystem(ISystem iSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposite(Composite composite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(org.eclipse.app4mc.amalthea.model.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedPort(QualifiedPort qualifiedPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualifiedPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfacePort(InterfacePort interfacePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfacePort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigModel(ConfigModel configModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventConfig(EventConfig eventConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventConfig, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintsModel(ConstraintsModel constraintsModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintsModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableSequencingConstraint(RunnableSequencingConstraint runnableSequencingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableSequencingConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffinityConstraint(AffinityConstraint affinityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affinityConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparationConstraint(SeparationConstraint separationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(separationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePairingConstraint(PairingConstraint pairingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pairingConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessConstraint(ProcessConstraint processConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableConstraint(RunnableConstraint runnableConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataConstraint(DataConstraint dataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableSeparationConstraint(RunnableSeparationConstraint runnableSeparationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableSeparationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessSeparationConstraint(ProcessSeparationConstraint processSeparationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processSeparationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSeparationConstraint(DataSeparationConstraint dataSeparationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSeparationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnablePairingConstraint(RunnablePairingConstraint runnablePairingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnablePairingConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessPairingConstraint(ProcessPairingConstraint processPairingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processPairingConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPairingConstraint(DataPairingConstraint dataPairingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPairingConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableConstraintTarget(RunnableConstraintTarget runnableConstraintTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableConstraintTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessConstraintTarget(ProcessConstraintTarget processConstraintTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processConstraintTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataConstraintTarget(DataConstraintTarget dataConstraintTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataConstraintTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetMemory(TargetMemory targetMemory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetMemory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetCore(TargetCore targetCore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetCore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetScheduler(TargetScheduler targetScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetScheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelGroup(LabelGroup labelGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableGroup(RunnableGroup runnableGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessGroup(ProcessGroup processGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelEntityGroup(LabelEntityGroup labelEntityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelEntityGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableEntityGroup(RunnableEntityGroup runnableEntityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableEntityGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessEntityGroup(ProcessEntityGroup processEntityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processEntityGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagGroup(TagGroup tagGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractEventChain(AbstractEventChain abstractEventChain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractEventChain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChain(EventChain eventChain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventChain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubEventChain(SubEventChain subEventChain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subEventChain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChainItem(EventChainItem eventChainItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventChainItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChainReference(EventChainReference eventChainReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventChainReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChainContainer(EventChainContainer eventChainContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventChainContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingConstraint(TimingConstraint timingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalSectionConstraint(PhysicalSectionConstraint physicalSectionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalSectionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationConstraint(SynchronizationConstraint synchronizationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronizationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventSynchronizationConstraint(EventSynchronizationConstraint eventSynchronizationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventSynchronizationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChainSynchronizationConstraint(EventChainSynchronizationConstraint eventChainSynchronizationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventChainSynchronizationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayConstraint(DelayConstraint delayConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delayConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChainLatencyConstraint(EventChainLatencyConstraint eventChainLatencyConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventChainLatencyConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetitionConstraint(RepetitionConstraint repetitionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repetitionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAgeConstraint(DataAgeConstraint dataAgeConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataAgeConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAge(DataAge dataAge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataAge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAgeCycle(DataAgeCycle dataAgeCycle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataAgeCycle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAgeTime(DataAgeTime dataAgeTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataAgeTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessRequirement(ProcessRequirement processRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableRequirement(RunnableRequirement runnableRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchitectureRequirement(ArchitectureRequirement architectureRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(architectureRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessChainRequirement(ProcessChainRequirement processChainRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processChainRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementLimit(RequirementLimit requirementLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPUPercentageRequirementLimit(CPUPercentageRequirementLimit cpuPercentageRequirementLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cpuPercentageRequirementLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyRequirementLimit(FrequencyRequirementLimit frequencyRequirementLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frequencyRequirementLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageRequirementLimit(PercentageRequirementLimit percentageRequirementLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(percentageRequirementLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountRequirementLimit(CountRequirementLimit countRequirementLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countRequirementLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeRequirementLimit(TimeRequirementLimit timeRequirementLimit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeRequirementLimit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCoherencyGroup(DataCoherencyGroup dataCoherencyGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataCoherencyGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStabilityGroup(DataStabilityGroup dataStabilityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataStabilityGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataGroupScope(DataGroupScope dataGroupScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataGroupScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessScope(ProcessScope processScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableScope(RunnableScope runnableScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentScope(ComponentScope componentScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventModel(EventModel eventModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventSet(EventSet eventSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityEvent(EntityEvent entityEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEvent(TriggerEvent triggerEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomEvent(CustomEvent customEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusEvent(StimulusEvent stimulusEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stimulusEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessEvent(ProcessEvent processEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessChainEvent(ProcessChainEvent processChainEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processChainEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableEvent(RunnableEvent runnableEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelEvent(LabelEvent labelEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelEvent(ChannelEvent channelEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphoreEvent(SemaphoreEvent semaphoreEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semaphoreEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentEvent(ComponentEvent componentEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHWModel(HWModel hwModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexNode(ComplexNode complexNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwSystem(HwSystem hwSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateECU(ECU ecu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ecu, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrocontroller(Microcontroller microcontroller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microcontroller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCore(Core core, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(core, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(network, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuartz(Quartz quartz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quartz, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwComponent(HwComponent hwComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareTypeDescription(HardwareTypeDescription hardwareTypeDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareTypeDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractionType(AbstractionType abstractionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemType(SystemType systemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateECUType(ECUType ecuType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ecuType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrocontrollerType(MicrocontrollerType microcontrollerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microcontrollerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoreType(CoreType coreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryType(MemoryType memoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkType(NetworkType networkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwPort(HwPort hwPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexPort(ComplexPort complexPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexPin(ComplexPin complexPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexPin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrescaler(Prescaler prescaler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prescaler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossbarSwitch(CrossbarSwitch crossbarSwitch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossbarSwitch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBridge(Bridge bridge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bridge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPath(AccessPath accessPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatencyAccessPath(LatencyAccessPath latencyAccessPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latencyAccessPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwAccessPath(HwAccessPath hwAccessPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwAccessPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatencyAccessPathElement(LatencyAccessPathElement latencyAccessPathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latencyAccessPathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPathRef(AccessPathRef accessPathRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessPathRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatency(Latency latency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatencyConstant(LatencyConstant latencyConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latencyConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatencyDeviation(LatencyDeviation latencyDeviation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latencyDeviation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwAccessPathElement(HwAccessPathElement hwAccessPathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwAccessPathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwAccessPathRef(HwAccessPathRef hwAccessPathRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwAccessPathRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwElementRef(HwElementRef hwElementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwElementRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingModel(MappingModel mappingModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulerAllocation(SchedulerAllocation schedulerAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulerAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskAllocation(TaskAllocation taskAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISRAllocation(ISRAllocation isrAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isrAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableAllocation(RunnableAllocation runnableAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryMapping(MemoryMapping memoryMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalSectionMapping(PhysicalSectionMapping physicalSectionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalSectionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSModel(OSModel osModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsDataConsistency(OsDataConsistency osDataConsistency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osDataConsistency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStability(DataStability dataStability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataStability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonAtomicDataCoherency(NonAtomicDataCoherency nonAtomicDataCoherency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonAtomicDataCoherency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphore(Semaphore semaphore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semaphore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduler(Scheduler scheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskScheduler(TaskScheduler taskScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskScheduler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulerAssociation(SchedulerAssociation schedulerAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulerAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptController(InterruptController interruptController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interruptController, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingParameters(SchedulingParameters schedulingParameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulingParameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterExtension(Map.Entry<?, ?> parameterExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)parameterExtension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithm(Algorithm algorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(algorithm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptSchedulingAlgorithm(InterruptSchedulingAlgorithm interruptSchedulingAlgorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interruptSchedulingAlgorithm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskSchedulingAlgorithm(TaskSchedulingAlgorithm taskSchedulingAlgorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskSchedulingAlgorithm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedPriority(FixedPriority fixedPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedPriorityPreemptive(FixedPriorityPreemptive fixedPriorityPreemptive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedPriorityPreemptive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedPriorityPreemptiveWithBudgetEnforcement(FixedPriorityPreemptiveWithBudgetEnforcement fixedPriorityPreemptiveWithBudgetEnforcement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedPriorityPreemptiveWithBudgetEnforcement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSEK(OSEK osek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osek, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeadlineMonotonic(DeadlineMonotonic deadlineMonotonic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deadlineMonotonic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateMonotonic(RateMonotonic rateMonotonic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateMonotonic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePfair(Pfair pfair, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pfair, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePfairPD2(PfairPD2 pfairPD2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pfairPD2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartlyPFairPD2(PartlyPFairPD2 partlyPFairPD2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partlyPFairPD2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarlyReleaseFairPD2(EarlyReleaseFairPD2 earlyReleaseFairPD2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(earlyReleaseFairPD2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartlyEarlyReleaseFairPD2(PartlyEarlyReleaseFairPD2 partlyEarlyReleaseFairPD2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partlyEarlyReleaseFairPD2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicPriority(DynamicPriority dynamicPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeastLocalRemainingExecutionTimeFirst(LeastLocalRemainingExecutionTimeFirst leastLocalRemainingExecutionTimeFirst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leastLocalRemainingExecutionTimeFirst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarliestDeadlineFirst(EarliestDeadlineFirst earliestDeadlineFirst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(earliestDeadlineFirst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityBasedRoundRobin(PriorityBasedRoundRobin priorityBasedRoundRobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(priorityBasedRoundRobin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservationBasedServer(ReservationBasedServer reservationBasedServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reservationBasedServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeferrableServer(DeferrableServer deferrableServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deferrableServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePollingPeriodicServer(PollingPeriodicServer pollingPeriodicServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pollingPeriodicServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSporadicServer(SporadicServer sporadicServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sporadicServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantBandwidthServer(ConstantBandwidthServer constantBandwidthServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constantBandwidthServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantBandwidthServerWithCASH(ConstantBandwidthServerWithCASH constantBandwidthServerWithCASH, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constantBandwidthServerWithCASH, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrouping(Grouping grouping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(grouping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserSpecificSchedulingAlgorithm(UserSpecificSchedulingAlgorithm userSpecificSchedulingAlgorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userSpecificSchedulingAlgorithm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityBased(PriorityBased priorityBased, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(priorityBased, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatingSystem(OperatingSystem operatingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operatingSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVendorOperatingSystem(VendorOperatingSystem vendorOperatingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vendorOperatingSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsInstructions(OsInstructions osInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osInstructions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsAPIInstructions(OsAPIInstructions osAPIInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osAPIInstructions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsISRInstructions(OsISRInstructions osISRInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osISRInstructions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyConstraintsModel(PropertyConstraintsModel propertyConstraintsModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyConstraintsModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoreAllocationConstraint(CoreAllocationConstraint coreAllocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coreAllocationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryMappingConstraint(MemoryMappingConstraint memoryMappingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryMappingConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessAllocationConstraint(ProcessAllocationConstraint processAllocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processAllocationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessPrototypeAllocationConstraint(ProcessPrototypeAllocationConstraint processPrototypeAllocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processPrototypeAllocationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableAllocationConstraint(RunnableAllocationConstraint runnableAllocationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableAllocationConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractElementMappingConstraint(AbstractElementMappingConstraint abstractElementMappingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractElementMappingConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassification(Classification classification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoreClassification(CoreClassification coreClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coreClassification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryClassification(MemoryClassification memoryClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryClassification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimuliModel(StimuliModel stimuliModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stimuliModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulus(Stimulus stimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeValueList(ModeValueList modeValueList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeValueList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeValueMapEntry(Map.Entry<?, ?> modeValueMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)modeValueMapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeValueDisjunction(ModeValueDisjunction modeValueDisjunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeValueDisjunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeValueDisjunctionEntry(ModeValueDisjunctionEntry modeValueDisjunctionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeValueDisjunctionEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeValue(ModeValue modeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeValueConjunction(ModeValueConjunction modeValueConjunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeValueConjunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedPeriodic(FixedPeriodic fixedPeriodic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedPeriodic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicStimulus(PeriodicStimulus periodicStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(periodicStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePeriodicStimulus(RelativePeriodicStimulus relativePeriodicStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativePeriodicStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableRateStimulus(VariableRateStimulus variableRateStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableRateStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenario(Scenario scenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scenario, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicSyntheticStimulus(PeriodicSyntheticStimulus periodicSyntheticStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(periodicSyntheticStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomStimulus(CustomStimulus customStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleStimulus(SingleStimulus singleStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterProcessStimulus(InterProcessStimulus interProcessStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interProcessStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicBurstStimulus(PeriodicBurstStimulus periodicBurstStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(periodicBurstStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventStimulus(EventStimulus eventStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrivalCurveStimulus(ArrivalCurveStimulus arrivalCurveStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrivalCurveStimulus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrivalCurveEntry(ArrivalCurveEntry arrivalCurveEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrivalCurveEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClock(Clock clock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockTriangleFunction(ClockTriangleFunction clockTriangleFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockTriangleFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockSinusFunction(ClockSinusFunction clockSinusFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockSinusFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockMultiplierList(ClockMultiplierList clockMultiplierList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockMultiplierList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockMultiplierListEntry(ClockMultiplierListEntry clockMultiplierListEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockMultiplierListEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSWModel(SWModel swModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(swModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractMemoryElement(AbstractMemoryElement abstractMemoryElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractMemoryElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractProcess(AbstractProcess abstractProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomEntity(CustomEntity customEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessChain(ProcessChain processChain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processChain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(org.eclipse.app4mc.amalthea.model.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(process, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallGraph(CallGraph callGraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callGraph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEntryBase(GraphEntryBase graphEntryBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphEntryBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallSequence(CallSequence callSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeSwitch(ModeSwitch modeSwitch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeSwitch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeSwitchEntry(ModeSwitchEntry<?> modeSwitchEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeSwitchEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeSwitchDefault(ModeSwitchDefault<?> modeSwitchDefault, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeSwitchDefault, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilitySwitch(ProbabilitySwitch probabilitySwitch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(probabilitySwitch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilitySwitchEntry(ProbabilitySwitchEntry<?> probabilitySwitchEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(probabilitySwitchEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCounter(Counter counter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(counter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallSequenceItem(CallSequenceItem callSequenceItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callSequenceItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaitEvent(WaitEvent waitEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(waitEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetEvent(SetEvent setEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearEvent(ClearEvent clearEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clearEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventMask(EventMask eventMask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventMask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsEvent(OsEvent osEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterProcessTrigger(InterProcessTrigger interProcessTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interProcessTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnforcedMigration(EnforcedMigration enforcedMigration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enforcedMigration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskRunnableCall(TaskRunnableCall taskRunnableCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskRunnableCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulePoint(SchedulePoint schedulePoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedulePoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminateProcess(TerminateProcess terminateProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminateProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISR(ISR isr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessPrototype(ProcessPrototype processPrototype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processPrototype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChainedProcessPrototype(ChainedProcessPrototype chainedProcessPrototype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chainedProcessPrototype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralPrecedence(GeneralPrecedence generalPrecedence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalPrecedence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPrecedenceSpec(AccessPrecedenceSpec accessPrecedenceSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessPrecedenceSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderPrecedenceSpec(OrderPrecedenceSpec orderPrecedenceSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderPrecedenceSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnable(org.eclipse.app4mc.amalthea.model.Runnable runnable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeLabel(ModeLabel modeLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(section, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableItem(RunnableItem runnableItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputationItem(ComputationItem computationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(computationItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableInstructions(RunnableInstructions runnableInstructions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableInstructions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableInstructionsEntry(Map.Entry<?, ?> runnableInstructionsEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)runnableInstructionsEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeLabelAccess(ModeLabelAccess modeLabelAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeLabelAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableModeSwitch(RunnableModeSwitch runnableModeSwitch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableModeSwitch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelAccess(LabelAccess labelAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelAccess(ChannelAccess channelAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelSend(ChannelSend channelSend, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelSend, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelReceive(ChannelReceive channelReceive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelReceive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphoreAccess(SemaphoreAccess semaphoreAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semaphoreAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderReceiverCommunication(SenderReceiverCommunication senderReceiverCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderReceiverCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderReceiverRead(SenderReceiverRead senderReceiverRead, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderReceiverRead, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderReceiverWrite(SenderReceiverWrite senderReceiverWrite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderReceiverWrite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerCall(ServerCall serverCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serverCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronousServerCall(SynchronousServerCall synchronousServerCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronousServerCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsynchronousServerCall(AsynchronousServerCall asynchronousServerCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asynchronousServerCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetResultServerCall(GetResultServerCall getResultServerCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(getResultServerCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableProbabilitySwitch(RunnableProbabilitySwitch runnableProbabilitySwitch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableProbabilitySwitch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableCall(RunnableCall runnableCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomEventTrigger(CustomEventTrigger customEventTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customEventTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundType(CompoundType compoundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStruct(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(struct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructEntry(StructEntry structEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArray(Array array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(array, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointer(Pointer pointer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRef(TypeRef typeRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPlatformMapping(DataPlatformMapping dataPlatformMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataPlatformMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDefinition(TypeDefinition typeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeDefinition(DataTypeDefinition dataTypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseTypeDefinition(BaseTypeDefinition baseTypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseTypeDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivation(Activation activation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicActivation(PeriodicActivation periodicActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(periodicActivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableRateActivation(VariableRateActivation variableRateActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableRateActivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSporadicActivation(SporadicActivation sporadicActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sporadicActivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleActivation(SingleActivation singleActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleActivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventActivation(EventActivation eventActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventActivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomActivation(CustomActivation customActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customActivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelAccessStatistic(LabelAccessStatistic labelAccessStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelAccessStatistic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionFetch(InstructionFetch instructionFetch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructionFetch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunEntityCallStatistic(RunEntityCallStatistic runEntityCallStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runEntityCallStatistic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementModel(MeasurementModel measurementModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurement(Measurement measurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChainMeasurement(EventChainMeasurement eventChainMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventChainMeasurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskMeasurement(TaskMeasurement taskMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskMeasurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableMeasurement(RunnableMeasurement runnableMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnableMeasurement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyUnit(FrequencyUnit frequencyUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageUnit(VoltageUnit voltageUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSizeUnit(DataSizeUnit dataSizeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRateUnit(DataRateUnit dataRateUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSamplingType(SamplingType samplingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceKind(InterfaceKind interfaceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableOrderType(RunnableOrderType runnableOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationType(SynchronizationType synchronizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingType(MappingType mappingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatencyType(LatencyType latencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverity(Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimitType(LimitType limitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeMetric(TimeMetric timeMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountMetric(CountMetric countMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageMetric(PercentageMetric percentageMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPUPercentageMetric(CPUPercentageMetric cpuPercentageMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyMetric(FrequencyMetric frequencyMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoherencyDirection(CoherencyDirection coherencyDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessEventType(ProcessEventType processEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableEventType(RunnableEventType runnableEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelEventType(LabelEventType labelEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelEventType(ChannelEventType channelEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphoreEventType(SemaphoreEventType semaphoreEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentEventType(ComponentEventType componentEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQType(QType qType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryTypeEnum(MemoryTypeEnum memoryTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusType(BusType busType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRWType(RWType rwType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedType(SchedType schedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinType(PinType pinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryAddressMappingType(MemoryAddressMappingType memoryAddressMappingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsDataConsistencyMode(OsDataConsistencyMode osDataConsistencyMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessMultiplicity(AccessMultiplicity accessMultiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStabilityLevel(DataStabilityLevel dataStabilityLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphoreType(SemaphoreType semaphoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupingType(GroupingType groupingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaitEventType(WaitEventType waitEventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaitingBehaviour(WaitingBehaviour waitingBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISRCategory(ISRCategory isrCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPrecedenceType(AccessPrecedenceType accessPrecedenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderType(OrderType orderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelDataStability(LabelDataStability labelDataStability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveOperation(ReceiveOperation receiveOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelAccessDataStability(LabelAccessDataStability labelAccessDataStability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelAccessEnum(LabelAccessEnum labelAccessEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelAccessImplementation(LabelAccessImplementation labelAccessImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphoreAccessEnum(SemaphoreAccessEnum semaphoreAccessEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlockingType(BlockingType blockingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreemption(Preemption preemption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcurrencyType(ConcurrencyType concurrencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateASILType(ASILType asilType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(long address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAddress_Min(address, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAddress_Min
	 */
	public static final long ADDRESS__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress_Min(long address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = address >= ADDRESS__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AmaltheaPackage.eINSTANCE.getAddress(), address, ADDRESS__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AmaltheaValidator
