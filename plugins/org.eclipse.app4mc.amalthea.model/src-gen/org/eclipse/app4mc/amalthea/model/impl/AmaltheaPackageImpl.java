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
package org.eclipse.app4mc.amalthea.model.impl;

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
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
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
import org.eclipse.app4mc.amalthea.model.FInterfacePort;
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
import org.eclipse.app4mc.amalthea.model.INamedElement;
import org.eclipse.app4mc.amalthea.model.IReferable;
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
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessDataStability;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
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
import org.eclipse.app4mc.amalthea.model.ModeValueList;
import org.eclipse.app4mc.amalthea.model.ModeValueListEntry;
import org.eclipse.app4mc.amalthea.model.Network;
import org.eclipse.app4mc.amalthea.model.NetworkType;
import org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency;
import org.eclipse.app4mc.amalthea.model.NumericStatistic;
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
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
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
import org.eclipse.app4mc.amalthea.model.Quartz;
import org.eclipse.app4mc.amalthea.model.RWType;
import org.eclipse.app4mc.amalthea.model.RateMonotonic;
import org.eclipse.app4mc.amalthea.model.ReceiveOperation;
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
import org.eclipse.app4mc.amalthea.model.SporadicStimulus;
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
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeObject;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
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
import org.eclipse.app4mc.amalthea.model.WaitEventType;
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour;
import org.eclipse.app4mc.amalthea.model.WeibullDistribution;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmaltheaPackageImpl extends EPackageImpl implements AmaltheaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amaltheaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referableBaseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAnnotatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTaggableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iReferableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDisplayNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeComparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigIntegerObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weibullDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weibullParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weibullEstimatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundariesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaussDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betaDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericStatisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minAvgMaxStatisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueStatisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fInterfacePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableSequencingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affinityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pairingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableSeparationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processSeparationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSeparationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnablePairingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPairingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPairingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableConstraintTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processConstraintTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConstraintTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetCoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEntityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEntityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEntityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEventChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subEventChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalSectionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventSynchronizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainSynchronizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainLatencyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repetitionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAgeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAgeCycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAgeTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processChainRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuPercentageRequirementLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyRequirementLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageRequirementLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countRequirementLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRequirementLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCoherencyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStabilityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataGroupScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimulusEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processChainEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semaphoreEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microcontrollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quartzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareTypeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecuTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microcontrollerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescalerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossbarSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyAccessPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwAccessPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyAccessPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessPathRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwAccessPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwAccessPathRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwElementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isrAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalSectionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osDataConsistencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonAtomicDataCoherencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semaphoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptSchedulingAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskSchedulingAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPriorityPreemptiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPriorityPreemptiveWithBudgetEnforcementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlineMonotonicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateMonotonicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pfairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pfairPD2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partlyPFairPD2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earlyReleaseFairPD2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partlyEarlyReleaseFairPD2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leastLocalRemainingExecutionTimeFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earliestDeadlineFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityBasedRoundRobinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationBasedServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deferrableServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollingPeriodicServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantBandwidthServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantBandwidthServerWithCASHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSpecificSchedulingAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityBasedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorOperatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osAPIInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osISRInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyConstraintsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreAllocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryMappingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processAllocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPrototypeAllocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableAllocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractElementMappingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreClassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryClassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimuliModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeValueListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeValueListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeValueConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeValueDisjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRateStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntheticStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interProcessStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrivalCurveStimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrivalCurveEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockTriangleFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockSinusFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockMultiplierListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockMultiplierListEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMemoryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEntryBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeSwitchEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeSwitchDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilitySwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilitySwitchEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callSequenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventMaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interProcessTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enforcedMigrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRunnableCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminateProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainedProcessPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalPrecedenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessPrecedenceSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderPrecedenceSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableInstructionsEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeLabelAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableModeSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelSendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelReceiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semaphoreAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderReceiverCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderReceiverReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderReceiverWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousServerCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchronousServerCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getResultServerCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableProbabilitySwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPlatformMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRateActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelAccessStatisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionFetchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runEntityCallStatisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frequencyUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSizeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataRateUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum samplingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum runnableOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronizationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mappingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum latencyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum limitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum countMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum percentageMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cpuPercentageMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frequencyMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coherencyDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum runnableEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semaphoreEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum busTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rwTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryAddressMappingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osDataConsistencyModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessMultiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataStabilityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semaphoreTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum waitEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum waitingBehaviourEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isrCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessPrecedenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelDataStabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum receiveOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelAccessDataStabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelAccessEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semaphoreAccessEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preemptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum concurrencyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum asilTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AmaltheaPackageImpl() {
		super(eNS_URI, AmaltheaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AmaltheaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AmaltheaPackage init() {
		if (isInited) return (AmaltheaPackage)EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI);

		// Obtain or create and register package
		AmaltheaPackageImpl theAmaltheaPackage = (AmaltheaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AmaltheaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AmaltheaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAmaltheaPackage.createPackageContents();

		// Initialize created meta-data
		theAmaltheaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAmaltheaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AmaltheaPackage.eNS_URI, theAmaltheaPackage);
		return theAmaltheaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmalthea() {
		return amaltheaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmalthea_Version() {
		return (EAttribute)amaltheaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_CommonElements() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_SwModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_HwModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_OsModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_StimuliModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_EventModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_ConstraintsModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_PropertyConstraintsModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_MappingModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_ComponentsModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_ConfigModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmalthea_MeasurementModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonElements() {
		return commonElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonElements_Tags() {
		return (EReference)commonElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonElements_CoreClassifiers() {
		return (EReference)commonElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonElements_MemoryClassifiers() {
		return (EReference)commonElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseObject() {
		return baseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferableObject() {
		return referableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferableBaseObject() {
		return referableBaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAnnotatable() {
		return iAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIAnnotatable_CustomProperties() {
		return (EReference)iAnnotatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITaggable() {
		return iTaggableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getITaggable_Tags() {
		return (EReference)iTaggableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIReferable() {
		return iReferableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIReferable_Name() {
		return (EAttribute)iReferableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIReferable_UniqueName() {
		return (EAttribute)iReferableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReferable__ComputeUniqueName() {
		return iReferableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReferable__Encode__String() {
		return iReferableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDisplayName() {
		return iDisplayNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDisplayName_DisplayName() {
		return (EAttribute)iDisplayNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_TagType() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Description() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreClassifier() {
		return coreClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryClassifier() {
		return memoryClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructions() {
		return instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructions_FetchStatistic() {
		return (EReference)instructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstructions__ContainerNotificationRequired() {
		return instructionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmissionPolicy() {
		return transmissionPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionPolicy_ChunkSize() {
		return (EReference)transmissionPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionPolicy_ChunkProcessingInstructions() {
		return (EAttribute)transmissionPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmissionPolicy_TransmitRatio() {
		return (EAttribute)transmissionPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionsDeviation() {
		return instructionsDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionsDeviation_Deviation() {
		return (EReference)instructionsDeviationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionsConstant() {
		return instructionsConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionsConstant_Value() {
		return (EAttribute)instructionsConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeComparable() {
		return timeComparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTime() {
		return abstractTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTime_Value() {
		return (EAttribute)abstractTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTime_Unit() {
		return (EAttribute)abstractTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTime__ToString() {
		return abstractTimeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTime__CompareTo__AbstractTime() {
		return abstractTimeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTime__ContainerNotificationRequired() {
		return timeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequency() {
		return frequencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequency_Unit() {
		return (EAttribute)frequencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequency_Value() {
		return (EAttribute)frequencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFrequency__ContainerNotificationRequired() {
		return frequencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFrequency__ToString() {
		return frequencyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSize() {
		return dataSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSize_Value() {
		return (EAttribute)dataSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSize_Unit() {
		return (EAttribute)dataSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__ToString() {
		return dataSizeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__ContainerNotificationRequired() {
		return dataSizeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__GetNumberBits() {
		return dataSizeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSize__GetNumberBytes() {
		return dataSizeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRate() {
		return dataRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRate_Value() {
		return (EAttribute)dataRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRate_Unit() {
		return (EAttribute)dataRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataRate__ToString() {
		return dataRateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomProperty() {
		return customPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomProperty_Key() {
		return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomProperty_Value() {
		return (EReference)customPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__ContainerNotificationRequired() {
		return valueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListObject() {
		return listObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListObject_Values() {
		return (EReference)listObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getListObject__ToString() {
		return listObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringObject() {
		return stringObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringObject_Value() {
		return (EAttribute)stringObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringObject__ToString() {
		return stringObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigIntegerObject() {
		return bigIntegerObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigIntegerObject_Value() {
		return (EAttribute)bigIntegerObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBigIntegerObject__ToString() {
		return bigIntegerObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceObject() {
		return referenceObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceObject_Value() {
		return (EReference)referenceObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReferenceObject__ToString() {
		return referenceObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerObject() {
		return integerObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerObject_Value() {
		return (EAttribute)integerObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerObject__ToString() {
		return integerObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongObject() {
		return longObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongObject_Value() {
		return (EAttribute)longObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLongObject__ToString() {
		return longObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatObject() {
		return floatObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatObject_Value() {
		return (EAttribute)floatObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFloatObject__ToString() {
		return floatObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleObject() {
		return doubleObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleObject_Value() {
		return (EAttribute)doubleObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoubleObject__ToString() {
		return doubleObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanObject() {
		return booleanObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanObject_Value() {
		return (EAttribute)booleanObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooleanObject__ToString() {
		return booleanObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeObject() {
		return timeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeObject__ToString() {
		return timeObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviation() {
		return deviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviation_LowerBound() {
		return (EReference)deviationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviation_UpperBound() {
		return (EReference)deviationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviation_Distribution() {
		return (EReference)deviationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeviation__ContainerNotificationRequired() {
		return deviationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeibullDistribution() {
		return weibullDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeibullParameters() {
		return weibullParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeibullParameters_Kappa() {
		return (EAttribute)weibullParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeibullParameters_Lambda() {
		return (EAttribute)weibullParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeibullEstimators() {
		return weibullEstimatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeibullEstimators_Mean() {
		return (EReference)weibullEstimatorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeibullEstimators_PRemainPromille() {
		return (EAttribute)weibullEstimatorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniformDistribution() {
		return uniformDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundaries() {
		return boundariesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundaries_SamplingType() {
		return (EAttribute)boundariesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaussDistribution() {
		return gaussDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaussDistribution_Sd() {
		return (EReference)gaussDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaussDistribution_Mean() {
		return (EReference)gaussDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBetaDistribution() {
		return betaDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBetaDistribution_Alpha() {
		return (EAttribute)betaDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBetaDistribution_Beta() {
		return (EAttribute)betaDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericStatistic() {
		return numericStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinAvgMaxStatistic() {
		return minAvgMaxStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinAvgMaxStatistic_Min() {
		return (EAttribute)minAvgMaxStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinAvgMaxStatistic_Avg() {
		return (EAttribute)minAvgMaxStatisticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinAvgMaxStatistic_Max() {
		return (EAttribute)minAvgMaxStatisticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleValueStatistic() {
		return singleValueStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleValueStatistic_Value() {
		return (EAttribute)singleValueStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_Literals() {
		return (EReference)modeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeLiteral() {
		return modeLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeLiteral__ComputeUniqueName() {
		return modeLiteralEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModeLiteral__ToString() {
		return modeLiteralEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentsModel() {
		return componentsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentsModel_Components() {
		return (EReference)componentsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentsModel_Systems() {
		return (EReference)componentsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINamedElement() {
		return iNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINamedElement_Name() {
		return (EAttribute)iNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISystem() {
		return iSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISystem_ComponentInstances() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISystem_Connectors() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISystem_GroundedPorts() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISystem_InnerPorts() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__ComputeUniqueName() {
		return portEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Ports() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Tasks() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Runnables() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Labels() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Semaphores() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OsEvents() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Type() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_SourcePort() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_TargetPort() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedPort() {
		return qualifiedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedPort_Instance() {
		return (EReference)qualifiedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedPort_Port() {
		return (EReference)qualifiedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFInterfacePort() {
		return fInterfacePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFInterfacePort_Kind() {
		return (EAttribute)fInterfacePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFInterfacePort_InterfaceName() {
		return (EAttribute)fInterfacePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigModel() {
		return configModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigModel_EventsToTrace() {
		return (EReference)configModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventConfig() {
		return eventConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventConfig_Name() {
		return (EAttribute)eventConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventConfig_Event() {
		return (EReference)eventConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsModel() {
		return constraintsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_EventChains() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_TimingConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_AffinityConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_RunnableSequencingConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_DataAgeConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_Requirements() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_DataCoherencyGroups() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_DataStabilityGroups() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_PhysicalSectionConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableSequencingConstraint() {
		return runnableSequencingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnableSequencingConstraint_OrderType() {
		return (EAttribute)runnableSequencingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableSequencingConstraint_RunnableGroups() {
		return (EReference)runnableSequencingConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableSequencingConstraint_ProcessScope() {
		return (EReference)runnableSequencingConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffinityConstraint() {
		return affinityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparationConstraint() {
		return separationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPairingConstraint() {
		return pairingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessConstraint() {
		return processConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessConstraint_Target() {
		return (EReference)processConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableConstraint() {
		return runnableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableConstraint_Target() {
		return (EReference)runnableConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConstraint() {
		return dataConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConstraint_Target() {
		return (EReference)dataConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableSeparationConstraint() {
		return runnableSeparationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableSeparationConstraint_Groups() {
		return (EReference)runnableSeparationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessSeparationConstraint() {
		return processSeparationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSeparationConstraint_Groups() {
		return (EReference)processSeparationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSeparationConstraint() {
		return dataSeparationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSeparationConstraint_Groups() {
		return (EReference)dataSeparationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnablePairingConstraint() {
		return runnablePairingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnablePairingConstraint_Group() {
		return (EReference)runnablePairingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPairingConstraint() {
		return processPairingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPairingConstraint_Group() {
		return (EReference)processPairingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPairingConstraint() {
		return dataPairingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPairingConstraint_Group() {
		return (EReference)dataPairingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableConstraintTarget() {
		return runnableConstraintTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessConstraintTarget() {
		return processConstraintTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConstraintTarget() {
		return dataConstraintTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetMemory() {
		return targetMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetMemory_Memories() {
		return (EReference)targetMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetCore() {
		return targetCoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetCore_Cores() {
		return (EReference)targetCoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetScheduler() {
		return targetSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetScheduler_Schedulers() {
		return (EReference)targetSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelGroup() {
		return labelGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableGroup() {
		return runnableGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessGroup() {
		return processGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelEntityGroup() {
		return labelEntityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelEntityGroup_Labels() {
		return (EReference)labelEntityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableEntityGroup() {
		return runnableEntityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEntityGroup_Runnables() {
		return (EReference)runnableEntityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessEntityGroup() {
		return processEntityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessEntityGroup_Processes() {
		return (EReference)processEntityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagGroup() {
		return tagGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagGroup_Tag() {
		return (EReference)tagGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEventChain() {
		return abstractEventChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventChain_Stimulus() {
		return (EReference)abstractEventChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventChain_Response() {
		return (EReference)abstractEventChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventChain_Segments() {
		return (EReference)abstractEventChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventChain_Strands() {
		return (EReference)abstractEventChainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEventChain__GetName() {
		return abstractEventChainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEventChain__ContainerNotificationRequired() {
		return abstractEventChainEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChain() {
		return eventChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubEventChain() {
		return subEventChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainItem() {
		return eventChainItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEventChainItem__GetEventChain() {
		return eventChainItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainReference() {
		return eventChainReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainReference_EventChain() {
		return (EReference)eventChainReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainContainer() {
		return eventChainContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainContainer_EventChain() {
		return (EReference)eventChainContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingConstraint() {
		return timingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalSectionConstraint() {
		return physicalSectionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSectionConstraint_Section() {
		return (EReference)physicalSectionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSectionConstraint_Memories() {
		return (EReference)physicalSectionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationConstraint() {
		return synchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationConstraint_MultipleOccurrencesAllowed() {
		return (EAttribute)synchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationConstraint_Tolerance() {
		return (EReference)synchronizationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventSynchronizationConstraint() {
		return eventSynchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSynchronizationConstraint_Events() {
		return (EReference)eventSynchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainSynchronizationConstraint() {
		return eventChainSynchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainSynchronizationConstraint_Scope() {
		return (EReference)eventChainSynchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventChainSynchronizationConstraint_Type() {
		return (EAttribute)eventChainSynchronizationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayConstraint() {
		return delayConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayConstraint_MappingType() {
		return (EAttribute)delayConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Source() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Target() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Upper() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Lower() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainLatencyConstraint() {
		return eventChainLatencyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainLatencyConstraint_Scope() {
		return (EReference)eventChainLatencyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventChainLatencyConstraint_Type() {
		return (EAttribute)eventChainLatencyConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainLatencyConstraint_Minimum() {
		return (EReference)eventChainLatencyConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainLatencyConstraint_Maximum() {
		return (EReference)eventChainLatencyConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepetitionConstraint() {
		return repetitionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Event() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepetitionConstraint_Span() {
		return (EAttribute)repetitionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Lower() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Upper() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Jitter() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepetitionConstraint_Period() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAgeConstraint() {
		return dataAgeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAgeConstraint_Runnable() {
		return (EReference)dataAgeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAgeConstraint_Label() {
		return (EReference)dataAgeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAgeConstraint_DataAge() {
		return (EReference)dataAgeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAge() {
		return dataAgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAgeCycle() {
		return dataAgeCycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAgeCycle_MinimumCycle() {
		return (EAttribute)dataAgeCycleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAgeCycle_MaximumCycle() {
		return (EAttribute)dataAgeCycleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAgeTime() {
		return dataAgeTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAgeTime_MinimumTime() {
		return (EReference)dataAgeTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAgeTime_MaximumTime() {
		return (EReference)dataAgeTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Name() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Severity() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Limit() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequirement() {
		return processRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequirement_Process() {
		return (EReference)processRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableRequirement() {
		return runnableRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableRequirement_Runnable() {
		return (EReference)runnableRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureRequirement() {
		return architectureRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureRequirement_Component() {
		return (EReference)architectureRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessChainRequirement() {
		return processChainRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessChainRequirement_ProcessChain() {
		return (EReference)processChainRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementLimit() {
		return requirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementLimit_LimitType() {
		return (EAttribute)requirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequirementLimit__ContainerNotificationRequired() {
		return requirementLimitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPUPercentageRequirementLimit() {
		return cpuPercentageRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPUPercentageRequirementLimit_Metric() {
		return (EAttribute)cpuPercentageRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPUPercentageRequirementLimit_LimitValue() {
		return (EAttribute)cpuPercentageRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCPUPercentageRequirementLimit_HardwareContext() {
		return (EReference)cpuPercentageRequirementLimitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyRequirementLimit() {
		return frequencyRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyRequirementLimit_Metric() {
		return (EAttribute)frequencyRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyRequirementLimit_LimitValue() {
		return (EReference)frequencyRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercentageRequirementLimit() {
		return percentageRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageRequirementLimit_Metric() {
		return (EAttribute)percentageRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageRequirementLimit_LimitValue() {
		return (EAttribute)percentageRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountRequirementLimit() {
		return countRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountRequirementLimit_Metric() {
		return (EAttribute)countRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountRequirementLimit_LimitValue() {
		return (EAttribute)countRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRequirementLimit() {
		return timeRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRequirementLimit_Metric() {
		return (EAttribute)timeRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeRequirementLimit_LimitValue() {
		return (EReference)timeRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCoherencyGroup() {
		return dataCoherencyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCoherencyGroup_Labels() {
		return (EReference)dataCoherencyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCoherencyGroup_Scope() {
		return (EReference)dataCoherencyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCoherencyGroup_Direction() {
		return (EAttribute)dataCoherencyGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStabilityGroup() {
		return dataStabilityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStabilityGroup_Labels() {
		return (EReference)dataStabilityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStabilityGroup_Scope() {
		return (EReference)dataStabilityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataGroupScope() {
		return dataGroupScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataGroupScope__ContainerNotificationRequired() {
		return dataGroupScopeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessScope() {
		return processScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessScope_Process() {
		return (EReference)processScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableScope() {
		return runnableScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableScope_Runnable() {
		return (EReference)runnableScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentScope() {
		return componentScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentScope_Component() {
		return (EReference)componentScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventModel() {
		return eventModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventModel_Events() {
		return (EReference)eventModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Description() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventSet() {
		return eventSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSet_Events() {
		return (EReference)eventSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityEvent() {
		return entityEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerEvent() {
		return triggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomEvent() {
		return customEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomEvent_EventType() {
		return (EAttribute)customEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomEvent_ExplicitTriggers() {
		return (EReference)customEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimulusEvent() {
		return stimulusEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulusEvent_Entity() {
		return (EReference)stimulusEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessEvent() {
		return processEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessEvent_EventType() {
		return (EAttribute)processEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessEvent_Entity() {
		return (EReference)processEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessEvent_Core() {
		return (EReference)processEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessChainEvent() {
		return processChainEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessChainEvent_EventType() {
		return (EAttribute)processChainEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessChainEvent_Entity() {
		return (EReference)processChainEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessChainEvent_Core() {
		return (EReference)processChainEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableEvent() {
		return runnableEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnableEvent_EventType() {
		return (EAttribute)runnableEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEvent_Entity() {
		return (EReference)runnableEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEvent_Process() {
		return (EReference)runnableEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableEvent_Core() {
		return (EReference)runnableEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelEvent() {
		return labelEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelEvent_EventType() {
		return (EAttribute)labelEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelEvent_Entity() {
		return (EReference)labelEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelEvent_Runnable() {
		return (EReference)labelEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelEvent_Process() {
		return (EReference)labelEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelEvent() {
		return channelEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelEvent_EventType() {
		return (EAttribute)channelEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelEvent_Entity() {
		return (EReference)channelEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelEvent_Runnable() {
		return (EReference)channelEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelEvent_Process() {
		return (EReference)channelEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemaphoreEvent() {
		return semaphoreEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaphoreEvent_EventType() {
		return (EAttribute)semaphoreEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreEvent_Entity() {
		return (EReference)semaphoreEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreEvent_Runnable() {
		return (EReference)semaphoreEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreEvent_Process() {
		return (EReference)semaphoreEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreEvent_Core() {
		return (EReference)semaphoreEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWModel() {
		return hwModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_SystemTypes() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_EcuTypes() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_McTypes() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_CoreTypes() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_MemoryTypes() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_NetworkTypes() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_AccessPaths() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_System() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexNode() {
		return complexNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexNode_Prescaler() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexNode_Memories() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexNode_Networks() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexNode_Components() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexNode_Ports() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwSystem() {
		return hwSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwSystem_SystemType() {
		return (EReference)hwSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwSystem_Ecus() {
		return (EReference)hwSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwSystem_Quartzes() {
		return (EReference)hwSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECU() {
		return ecuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_EcuType() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_Microcontrollers() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrocontroller() {
		return microcontrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_MicrocontrollerType() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Cores() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCore() {
		return coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCore_CoreType() {
		return (EReference)coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCore_LockstepGroup() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Type() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Mappings() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_Type() {
		return (EReference)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuartz() {
		return quartzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuartz_Frequency() {
		return (EReference)quartzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuartz_Type() {
		return (EAttribute)quartzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwComponent() {
		return hwComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwComponent_NestedComponents() {
		return (EReference)hwComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareTypeDescription() {
		return hardwareTypeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractionType() {
		return abstractionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemType() {
		return systemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECUType() {
		return ecuTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrocontrollerType() {
		return microcontrollerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreType() {
		return coreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreType_BitWidth() {
		return (EAttribute)coreTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreType_InstructionsPerCycle() {
		return (EAttribute)coreTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoreType_Classifiers() {
		return (EReference)coreTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryType() {
		return memoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryType_Type() {
		return (EAttribute)memoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryType_Size() {
		return (EReference)memoryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryType_Classifiers() {
		return (EReference)memoryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkType() {
		return networkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkType_SchedPolicy() {
		return (EAttribute)networkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkType_BitWidth() {
		return (EAttribute)networkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwPort() {
		return hwPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwPort_Pins() {
		return (EReference)hwPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHwPort__ComputeUniqueName() {
		return hwPortEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexPort() {
		return complexPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexPort_Network() {
		return (EReference)complexPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPort_Master() {
		return (EAttribute)complexPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPort_BitWidth() {
		return (EAttribute)complexPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPort_BaseAddress() {
		return (EAttribute)complexPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPort_AddressRange() {
		return (EAttribute)complexPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPort_Direction() {
		return (EAttribute)complexPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPort_WriteCycles() {
		return (EAttribute)complexPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPort_ReadCycles() {
		return (EAttribute)complexPortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPort_SchedValue() {
		return (EAttribute)complexPortEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexPin() {
		return complexPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPin_Type() {
		return (EAttribute)complexPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPin_BaseAddress() {
		return (EAttribute)complexPinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexPin_Direction() {
		return (EAttribute)complexPinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescaler() {
		return prescalerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescaler_Name() {
		return (EAttribute)prescalerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescaler_ClockRatio() {
		return (EAttribute)prescalerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescaler_Quartz() {
		return (EReference)prescalerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossbarSwitch() {
		return crossbarSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrossbarSwitch_ConConnections() {
		return (EAttribute)crossbarSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_BusType() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridge() {
		return bridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessPath() {
		return accessPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPath_Source() {
		return (EReference)accessPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPath_Target() {
		return (EReference)accessPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyAccessPath() {
		return latencyAccessPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatencyAccessPath_Latencies() {
		return (EReference)latencyAccessPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwAccessPath() {
		return hwAccessPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwAccessPath_HwElements() {
		return (EReference)hwAccessPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyAccessPathElement() {
		return latencyAccessPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessPathRef() {
		return accessPathRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPathRef_Ref() {
		return (EReference)accessPathRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatency() {
		return latencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatency_AccessType() {
		return (EAttribute)latencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatency_TransferSize() {
		return (EAttribute)latencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatency_Quartz() {
		return (EReference)latencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyConstant() {
		return latencyConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatencyConstant_Value() {
		return (EAttribute)latencyConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyDeviation() {
		return latencyDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatencyDeviation_Deviation() {
		return (EReference)latencyDeviationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwAccessPathElement() {
		return hwAccessPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwAccessPathRef() {
		return hwAccessPathRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwAccessPathRef_Ref() {
		return (EReference)hwAccessPathRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwElementRef() {
		return hwElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwElementRef_Port() {
		return (EReference)hwElementRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingModel() {
		return mappingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_SchedulerAllocation() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_RunnableAllocation() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_TaskAllocation() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_IsrAllocation() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_MemoryMapping() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_PhysicalSectionMapping() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingModel_AddressMappingType() {
		return (EAttribute)mappingModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulerAllocation() {
		return schedulerAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerAllocation_Scheduler() {
		return (EReference)schedulerAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerAllocation_Responsibility() {
		return (EReference)schedulerAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerAllocation_ExecutingCore() {
		return (EReference)schedulerAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskAllocation() {
		return taskAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAllocation_Task() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAllocation_Scheduler() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAllocation_CoreAffinity() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAllocation_SchedulingParameters() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAllocation_ParameterExtensions() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISRAllocation() {
		return isrAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRAllocation_Isr() {
		return (EReference)isrAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISRAllocation_Controller() {
		return (EReference)isrAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISRAllocation_Priority() {
		return (EAttribute)isrAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableAllocation() {
		return runnableAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableAllocation_Scheduler() {
		return (EReference)runnableAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableAllocation_Entity() {
		return (EReference)runnableAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryMapping() {
		return memoryMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryMapping_AbstractElement() {
		return (EReference)memoryMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryMapping_Memory() {
		return (EReference)memoryMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryMapping_MemoryPositionAddress() {
		return (EAttribute)memoryMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryMapping_AbstractElementLinkInt() {
		return (EReference)memoryMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryMapping_MemoryLinkInt() {
		return (EReference)memoryMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalSectionMapping() {
		return physicalSectionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSectionMapping_Origin() {
		return (EReference)physicalSectionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSectionMapping_Memory() {
		return (EReference)physicalSectionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalSectionMapping_StartAddress() {
		return (EAttribute)physicalSectionMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalSectionMapping_EndAddress() {
		return (EAttribute)physicalSectionMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSectionMapping_Labels() {
		return (EReference)physicalSectionMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalSectionMapping_RunEntities() {
		return (EReference)physicalSectionMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSModel() {
		return osModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSModel_Semaphores() {
		return (EReference)osModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSModel_OperatingSystems() {
		return (EReference)osModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSModel_OsOverheads() {
		return (EReference)osModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsDataConsistency() {
		return osDataConsistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsDataConsistency_Mode() {
		return (EAttribute)osDataConsistencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsDataConsistency_DataStability() {
		return (EReference)osDataConsistencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsDataConsistency_NonAtomicDataCoherency() {
		return (EReference)osDataConsistencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStability() {
		return dataStabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStability_Enabled() {
		return (EAttribute)dataStabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStability_Algorithm() {
		return (EAttribute)dataStabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStability_AccessMultiplicity() {
		return (EAttribute)dataStabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStability_Level() {
		return (EAttribute)dataStabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonAtomicDataCoherency() {
		return nonAtomicDataCoherencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonAtomicDataCoherency_Enabled() {
		return (EAttribute)nonAtomicDataCoherencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonAtomicDataCoherency_Algorithm() {
		return (EAttribute)nonAtomicDataCoherencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonAtomicDataCoherency_AccessMultiplicity() {
		return (EAttribute)nonAtomicDataCoherencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemaphore() {
		return semaphoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaphore_SemaphoreType() {
		return (EAttribute)semaphoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaphore_InitialValue() {
		return (EAttribute)semaphoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaphore_MaxValue() {
		return (EAttribute)semaphoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaphore_PriorityCeilingProtocol() {
		return (EAttribute)semaphoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphore_SemaphoreAccesses() {
		return (EReference)semaphoreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduler() {
		return schedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_ComputationItems() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScheduler__GetSchedulingAlgorithm() {
		return schedulerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskScheduler() {
		return taskSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskScheduler_SchedulingAlgorithm() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskScheduler_ParentAssociation() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskScheduler_ChildAssociations() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskScheduler_ParentScheduler() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskScheduler_ChildSchedulers() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulerAssociation() {
		return schedulerAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerAssociation_Parent() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerAssociation_ParentLinkInt() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerAssociation_Child() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerAssociation_SchedulingParameters() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulerAssociation_ParameterExtensions() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptController() {
		return interruptControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptController_SchedulingAlgorithm() {
		return (EReference)interruptControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingParameters() {
		return schedulingParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingParameters_Priority() {
		return (EAttribute)schedulingParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingParameters_MinBudget() {
		return (EReference)schedulingParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingParameters_MaxBudget() {
		return (EReference)schedulingParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingParameters_Replenishment() {
		return (EReference)schedulingParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterExtension() {
		return parameterExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterExtension_Key() {
		return (EAttribute)parameterExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterExtension_Value() {
		return (EAttribute)parameterExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptSchedulingAlgorithm() {
		return interruptSchedulingAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskSchedulingAlgorithm() {
		return taskSchedulingAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPriority() {
		return fixedPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPriorityPreemptive() {
		return fixedPriorityPreemptiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPriorityPreemptiveWithBudgetEnforcement() {
		return fixedPriorityPreemptiveWithBudgetEnforcementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSEK() {
		return osekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadlineMonotonic() {
		return deadlineMonotonicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateMonotonic() {
		return rateMonotonicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPfair() {
		return pfairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfair_QuantSizeNs() {
		return (EAttribute)pfairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPfairPD2() {
		return pfairPD2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartlyPFairPD2() {
		return partlyPFairPD2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarlyReleaseFairPD2() {
		return earlyReleaseFairPD2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartlyEarlyReleaseFairPD2() {
		return partlyEarlyReleaseFairPD2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicPriority() {
		return dynamicPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeastLocalRemainingExecutionTimeFirst() {
		return leastLocalRemainingExecutionTimeFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarliestDeadlineFirst() {
		return earliestDeadlineFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityBasedRoundRobin() {
		return priorityBasedRoundRobinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationBasedServer() {
		return reservationBasedServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeferrableServer() {
		return deferrableServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollingPeriodicServer() {
		return pollingPeriodicServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicServer() {
		return sporadicServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantBandwidthServer() {
		return constantBandwidthServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantBandwidthServerWithCASH() {
		return constantBandwidthServerWithCASHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrouping() {
		return groupingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserSpecificSchedulingAlgorithm() {
		return userSpecificSchedulingAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSpecificSchedulingAlgorithm_ParameterExtensions() {
		return (EReference)userSpecificSchedulingAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityBased() {
		return priorityBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Name() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_Overhead() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_TaskSchedulers() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_InterruptControllers() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_OsDataConsistency() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVendorOperatingSystem() {
		return vendorOperatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorOperatingSystem_OsName() {
		return (EAttribute)vendorOperatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorOperatingSystem_Vendor() {
		return (EAttribute)vendorOperatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVendorOperatingSystem_Version() {
		return (EAttribute)vendorOperatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsInstructions() {
		return osInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsInstructions_ApiOverhead() {
		return (EReference)osInstructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsInstructions_IsrCategory1Overhead() {
		return (EReference)osInstructionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsInstructions_IsrCategory2Overhead() {
		return (EReference)osInstructionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsAPIInstructions() {
		return osAPIInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiSendMessage() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiTerminateTask() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiSchedule() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiRequestResource() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiReleaseResource() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiSetEvent() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiWaitEvent() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiClearEvent() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiActivateTask() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiEnforcedMigration() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiSuspendOsInterrupts() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiResumeOsInterrupts() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiRequestSpinlock() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiReleaseSpinlock() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiSenderReceiverRead() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiSenderReceiverWrite() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiSynchronousServerCallPoint() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiIocRead() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsAPIInstructions_ApiIocWrite() {
		return (EReference)osAPIInstructionsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsISRInstructions() {
		return osISRInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsISRInstructions_PreExecutionOverhead() {
		return (EReference)osISRInstructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsISRInstructions_PostExecutionOverhead() {
		return (EReference)osISRInstructionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyConstraintsModel() {
		return propertyConstraintsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyConstraintsModel_AllocationConstraints() {
		return (EReference)propertyConstraintsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyConstraintsModel_MappingConstraints() {
		return (EReference)propertyConstraintsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreAllocationConstraint() {
		return coreAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoreAllocationConstraint_CoreClassification() {
		return (EReference)coreAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryMappingConstraint() {
		return memoryMappingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryMappingConstraint_MemoryClassification() {
		return (EReference)memoryMappingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessAllocationConstraint() {
		return processAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessAllocationConstraint_Process() {
		return (EReference)processAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPrototypeAllocationConstraint() {
		return processPrototypeAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPrototypeAllocationConstraint_ProcessPrototype() {
		return (EReference)processPrototypeAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableAllocationConstraint() {
		return runnableAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableAllocationConstraint_Runnable() {
		return (EReference)runnableAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractElementMappingConstraint() {
		return abstractElementMappingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractElementMappingConstraint_AbstractElement() {
		return (EReference)abstractElementMappingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassification_Condition() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassification_Grouping() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreClassification() {
		return coreClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoreClassification_Classifiers() {
		return (EReference)coreClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryClassification() {
		return memoryClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryClassification_Classifiers() {
		return (EReference)memoryClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimuliModel() {
		return stimuliModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimuliModel_Stimuli() {
		return (EReference)stimuliModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimuliModel_Clocks() {
		return (EReference)stimuliModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimulus() {
		return stimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulus_StimulusDeviation() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulus_SetModeValueList() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulus_EnablingModeValueList() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimulus_DisablingModeValueList() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeValueList() {
		return modeValueListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeValueList_Entries() {
		return (EReference)modeValueListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeValueListEntry() {
		return modeValueListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeValue() {
		return modeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeValue_ValueProvider() {
		return (EReference)modeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeValue_Value() {
		return (EReference)modeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeValueConjunction() {
		return modeValueConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeValueConjunction_Entries() {
		return (EReference)modeValueConjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeValueDisjunction() {
		return modeValueDisjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeValueDisjunction_Entries() {
		return (EReference)modeValueDisjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicStimulus() {
		return periodicStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicStimulus_Offset() {
		return (EReference)periodicStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicStimulus_Recurrence() {
		return (EReference)periodicStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicStimulus_Clock() {
		return (EReference)periodicStimulusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRateStimulus() {
		return variableRateStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntheticStimulus() {
		return syntheticStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntheticStimulus_Offset() {
		return (EReference)syntheticStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntheticStimulus_Period() {
		return (EReference)syntheticStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntheticStimulus_TriggerTimes() {
		return (EReference)syntheticStimulusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimestampList() {
		return timestampListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimestampList_Timestamps() {
		return (EReference)timestampListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomStimulus() {
		return customStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomStimulus_Description() {
		return (EAttribute)customStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleStimulus() {
		return singleStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleStimulus_Activation() {
		return (EReference)singleStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterProcessStimulus() {
		return interProcessStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterProcessStimulus_Counter() {
		return (EReference)interProcessStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterProcessStimulus_ExplicitTriggers() {
		return (EReference)interProcessStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicStimulus() {
		return sporadicStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicStimulus_Description() {
		return (EAttribute)sporadicStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventStimulus() {
		return eventStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventStimulus_TriggeringEvents() {
		return (EReference)eventStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventStimulus_Counter() {
		return (EReference)eventStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrivalCurveStimulus() {
		return arrivalCurveStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalCurveStimulus_Entries() {
		return (EReference)arrivalCurveStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrivalCurveEntry() {
		return arrivalCurveEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrivalCurveEntry_NumberOfEvents() {
		return (EAttribute)arrivalCurveEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalCurveEntry_LowerTimeBorder() {
		return (EReference)arrivalCurveEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalCurveEntry_UpperTimeBorder() {
		return (EReference)arrivalCurveEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClock() {
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockTriangleFunction() {
		return clockTriangleFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockTriangleFunction_Shift() {
		return (EReference)clockTriangleFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockTriangleFunction_Period() {
		return (EReference)clockTriangleFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockTriangleFunction_Max() {
		return (EAttribute)clockTriangleFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockTriangleFunction_Min() {
		return (EAttribute)clockTriangleFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockSinusFunction() {
		return clockSinusFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockSinusFunction_Shift() {
		return (EReference)clockSinusFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockSinusFunction_Period() {
		return (EReference)clockSinusFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockSinusFunction_Amplitude() {
		return (EAttribute)clockSinusFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockSinusFunction_YOffset() {
		return (EAttribute)clockSinusFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockMultiplierList() {
		return clockMultiplierListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockMultiplierList_Entries() {
		return (EReference)clockMultiplierListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockMultiplierListEntry() {
		return clockMultiplierListEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockMultiplierListEntry_Multiplier() {
		return (EAttribute)clockMultiplierListEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockMultiplierListEntry_Time() {
		return (EReference)clockMultiplierListEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSWModel() {
		return swModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Isrs() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Tasks() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Runnables() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Labels() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Channels() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_ProcessPrototypes() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Sections() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Activations() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Events() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_TypeDefinitions() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_CustomEntities() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_ProcessChains() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_Modes() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWModel_ModeLabels() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMemoryElement() {
		return abstractMemoryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMemoryElement_Size() {
		return (EReference)abstractMemoryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMemoryElement_Mappings() {
		return (EReference)abstractMemoryElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProcess() {
		return abstractProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomEntity() {
		return customEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomEntity_TypeName() {
		return (EAttribute)customEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessChain() {
		return processChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessChain_Processes() {
		return (EReference)processChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_CallGraph() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Stimuli() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallGraph() {
		return callGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallGraph_GraphEntries() {
		return (EReference)callGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphEntryBase() {
		return graphEntryBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallSequence() {
		return callSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallSequence_Name() {
		return (EAttribute)callSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSequence_Calls() {
		return (EReference)callSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeSwitch() {
		return modeSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeSwitch_ValueProvider() {
		return (EReference)modeSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeSwitch_Entries() {
		return (EReference)modeSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeSwitch_DefaultEntry() {
		return (EReference)modeSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeSwitchEntry() {
		return modeSwitchEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeSwitchEntry_Values() {
		return (EReference)modeSwitchEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeSwitchEntry_Items() {
		return (EReference)modeSwitchEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeSwitchDefault() {
		return modeSwitchDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeSwitchDefault_Items() {
		return (EReference)modeSwitchDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilitySwitch() {
		return probabilitySwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbabilitySwitch_Entries() {
		return (EReference)probabilitySwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilitySwitchEntry() {
		return probabilitySwitchEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbabilitySwitchEntry_Probability() {
		return (EAttribute)probabilitySwitchEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbabilitySwitchEntry_Items() {
		return (EReference)probabilitySwitchEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_Prescaler() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_Offset() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallSequenceItem() {
		return callSequenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSequenceItem_Counter() {
		return (EReference)callSequenceItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitEvent() {
		return waitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaitEvent_EventMask() {
		return (EReference)waitEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitEvent_MaskType() {
		return (EAttribute)waitEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaitEvent_WaitingBehaviour() {
		return (EAttribute)waitEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetEvent() {
		return setEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetEvent_EventMask() {
		return (EReference)setEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetEvent_Process() {
		return (EReference)setEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearEvent() {
		return clearEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearEvent_EventMask() {
		return (EReference)clearEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventMask() {
		return eventMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventMask_Events() {
		return (EReference)eventMaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsEvent() {
		return osEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsEvent_CommunicationOverheadInBit() {
		return (EAttribute)osEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterProcessTrigger() {
		return interProcessTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterProcessTrigger_Stimulus() {
		return (EReference)interProcessTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterProcessTrigger_StimulusLinkInt() {
		return (EReference)interProcessTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnforcedMigration() {
		return enforcedMigrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnforcedMigration_ResourceOwner() {
		return (EReference)enforcedMigrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRunnableCall() {
		return taskRunnableCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRunnableCall_Runnable() {
		return (EReference)taskRunnableCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRunnableCall_Statistic() {
		return (EReference)taskRunnableCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRunnableCall_RunnableLinkInt() {
		return (EReference)taskRunnableCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulePoint() {
		return schedulePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminateProcess() {
		return terminateProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Preemption() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_MultipleTaskActivationLimit() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISR() {
		return isrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISR_Category() {
		return (EAttribute)isrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPrototype() {
		return processPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessPrototype_Preemption() {
		return (EAttribute)processPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPrototype_FirstRunnable() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPrototype_LastRunnable() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPrototype_AccessPrecedenceSpec() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPrototype_OrderPrecedenceSpec() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPrototype_ChainedPrototypes() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPrototype_Activation() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPrototype_RunnableCalls() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainedProcessPrototype() {
		return chainedProcessPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainedProcessPrototype_Prototype() {
		return (EReference)chainedProcessPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChainedProcessPrototype_Apply() {
		return (EAttribute)chainedProcessPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChainedProcessPrototype_Offset() {
		return (EAttribute)chainedProcessPrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralPrecedence() {
		return generalPrecedenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralPrecedence_Origin() {
		return (EReference)generalPrecedenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralPrecedence_Target() {
		return (EReference)generalPrecedenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessPrecedenceSpec() {
		return accessPrecedenceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPrecedenceSpec_Label() {
		return (EReference)accessPrecedenceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessPrecedenceSpec_OrderType() {
		return (EAttribute)accessPrecedenceSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderPrecedenceSpec() {
		return orderPrecedenceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderPrecedenceSpec_OrderType() {
		return (EAttribute)orderPrecedenceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnable() {
		return runnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_RunnableItems() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_Activations() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_Deadline() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnable_Callback() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnable_Service() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnable_AsilLevel() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_RunnableCalls() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_TaskRunnableCalls() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_Section() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnable_SectionLinkInt() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRunnable__GetFirstActivation() {
		return runnableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_DataType() {
		return (EReference)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Constant() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_BVolatile() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_DataStability() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_LabelAccesses() {
		return (EReference)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Section() {
		return (EReference)labelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_SectionLinkInt() {
		return (EReference)labelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_ElementType() {
		return (EReference)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_DefaultElements() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_MaxElements() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_ChannelAccesses() {
		return (EReference)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeLabel() {
		return modeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeLabel_Mode() {
		return (EReference)modeLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeLabel_InitialValue() {
		return (EReference)modeLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Labels() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Runnables() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_AsilLevel() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableItem() {
		return runnableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRunnableItem__ContainerNotificationRequired() {
		return runnableItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputationItem() {
		return computationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableInstructions() {
		return runnableInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableInstructions_Default() {
		return (EReference)runnableInstructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableInstructions_Extended() {
		return (EReference)runnableInstructionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableInstructionsEntry() {
		return runnableInstructionsEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableInstructionsEntry_Key() {
		return (EReference)runnableInstructionsEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableInstructionsEntry_Value() {
		return (EReference)runnableInstructionsEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeLabelAccess() {
		return modeLabelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeLabelAccess_Data() {
		return (EReference)modeLabelAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeLabelAccess_Access() {
		return (EAttribute)modeLabelAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeLabelAccess_ModeValue() {
		return (EReference)modeLabelAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableModeSwitch() {
		return runnableModeSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableModeSwitch_ValueProvider() {
		return (EReference)runnableModeSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableModeSwitch_Entries() {
		return (EReference)runnableModeSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableModeSwitch_DefaultEntry() {
		return (EReference)runnableModeSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelAccess() {
		return labelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_Data() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelAccess_Access() {
		return (EAttribute)labelAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_Statistic() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_TransmissionPolicy() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelAccess_DataStability() {
		return (EAttribute)labelAccessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_DataLinkInt() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelAccess() {
		return channelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelAccess_Data() {
		return (EReference)channelAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelAccess_Elements() {
		return (EAttribute)channelAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelAccess_TransmissionPolicy() {
		return (EReference)channelAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelAccess_DataLinkInt() {
		return (EReference)channelAccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelSend() {
		return channelSendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelReceive() {
		return channelReceiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelReceive_ReceiveOperation() {
		return (EAttribute)channelReceiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelReceive_DataMustBeNew() {
		return (EAttribute)channelReceiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelReceive_ElementIndex() {
		return (EAttribute)channelReceiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelReceive_LowerBound() {
		return (EAttribute)channelReceiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemaphoreAccess() {
		return semaphoreAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreAccess_Semaphore() {
		return (EReference)semaphoreAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaphoreAccess_Access() {
		return (EAttribute)semaphoreAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemaphoreAccess_WaitingBehaviour() {
		return (EAttribute)semaphoreAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreAccess_SemaphoreLinkInt() {
		return (EReference)semaphoreAccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderReceiverCommunication() {
		return senderReceiverCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderReceiverCommunication_Buffered() {
		return (EAttribute)senderReceiverCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverCommunication_Label() {
		return (EReference)senderReceiverCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderReceiverRead() {
		return senderReceiverReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderReceiverWrite() {
		return senderReceiverWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSenderReceiverWrite_NotifiedRunnables() {
		return (EReference)senderReceiverWriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerCall() {
		return serverCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerCall_ServerRunnable() {
		return (EReference)serverCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronousServerCall() {
		return synchronousServerCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronousServerCall_WaitingBehaviour() {
		return (EAttribute)synchronousServerCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynchronousServerCall() {
		return asynchronousServerCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsynchronousServerCall_ResultRunnable() {
		return (EReference)asynchronousServerCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetResultServerCall() {
		return getResultServerCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetResultServerCall_BlockingType() {
		return (EAttribute)getResultServerCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableProbabilitySwitch() {
		return runnableProbabilitySwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableProbabilitySwitch_Entries() {
		return (EReference)runnableProbabilitySwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Ordered() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Items() {
		return (EReference)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableCall() {
		return runnableCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableCall_Runnable() {
		return (EReference)runnableCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableCall_Statistic() {
		return (EReference)runnableCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableCall_RunnableLinkInt() {
		return (EReference)runnableCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomEventTrigger() {
		return customEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomEventTrigger_Event() {
		return (EReference)customEventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomEventTrigger_EventLinkInt() {
		return (EReference)customEventTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundType() {
		return compoundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStruct_Entries() {
		return (EReference)structEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructEntry() {
		return structEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructEntry_Name() {
		return (EAttribute)structEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructEntry_DataType() {
		return (EReference)structEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArray_NumberElements() {
		return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_DataType() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointer() {
		return pointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointer_DataType() {
		return (EReference)pointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeRef() {
		return typeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeRef_TypeDef() {
		return (EReference)typeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPlatformMapping() {
		return dataPlatformMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPlatformMapping_PlatformName() {
		return (EAttribute)dataPlatformMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPlatformMapping_PlatformType() {
		return (EAttribute)dataPlatformMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeDefinition() {
		return dataTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDefinition_DataType() {
		return (EReference)dataTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseTypeDefinition() {
		return baseTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseTypeDefinition_Size() {
		return (EReference)baseTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseTypeDefinition_DataMapping() {
		return (EReference)baseTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivation() {
		return activationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicActivation() {
		return periodicActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivation_Min() {
		return (EReference)periodicActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivation_Max() {
		return (EReference)periodicActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivation_Recurrence() {
		return (EReference)periodicActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicActivation_Offset() {
		return (EReference)periodicActivationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRateActivation() {
		return variableRateActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRateActivation_Description() {
		return (EAttribute)variableRateActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableRateActivation_ActivationDeviation() {
		return (EReference)variableRateActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicActivation() {
		return sporadicActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicActivation_Description() {
		return (EAttribute)sporadicActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicActivation_ActivationDeviation() {
		return (EReference)sporadicActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleActivation() {
		return singleActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActivation_Min() {
		return (EReference)singleActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActivation_Max() {
		return (EReference)singleActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventActivation() {
		return eventActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventActivation_TriggeringEvents() {
		return (EReference)eventActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventActivation_Counter() {
		return (EReference)eventActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomActivation() {
		return customActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomActivation_Description() {
		return (EAttribute)customActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelAccessStatistic() {
		return labelAccessStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccessStatistic_Value() {
		return (EReference)labelAccessStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccessStatistic_CacheMisses() {
		return (EReference)labelAccessStatisticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionFetch() {
		return instructionFetchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionFetch_Count() {
		return (EReference)instructionFetchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionFetch_Misses() {
		return (EReference)instructionFetchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionFetch_CyclesPerFetch() {
		return (EReference)instructionFetchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunEntityCallStatistic() {
		return runEntityCallStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunEntityCallStatistic_Statistic() {
		return (EReference)runEntityCallStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementModel() {
		return measurementModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementModel_Measurements() {
		return (EReference)measurementModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Runtimes() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RuntimeDeviation() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainMeasurement() {
		return eventChainMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainMeasurement_EventChain() {
		return (EReference)eventChainMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskMeasurement() {
		return taskMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskMeasurement_Task() {
		return (EReference)taskMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableMeasurement() {
		return runnableMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableMeasurement_Runnable() {
		return (EReference)runnableMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrequencyUnit() {
		return frequencyUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSizeUnit() {
		return dataSizeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataRateUnit() {
		return dataRateUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSamplingType() {
		return samplingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceKind() {
		return interfaceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRunnableOrderType() {
		return runnableOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSynchronizationType() {
		return synchronizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMappingType() {
		return mappingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLatencyType() {
		return latencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLimitType() {
		return limitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeMetric() {
		return timeMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCountMetric() {
		return countMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPercentageMetric() {
		return percentageMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCPUPercentageMetric() {
		return cpuPercentageMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrequencyMetric() {
		return frequencyMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoherencyDirection() {
		return coherencyDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessEventType() {
		return processEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRunnableEventType() {
		return runnableEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelEventType() {
		return labelEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannelEventType() {
		return channelEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemaphoreEventType() {
		return semaphoreEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQType() {
		return qTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryTypeEnum() {
		return memoryTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBusType() {
		return busTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRWType() {
		return rwTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedType() {
		return schedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPinType() {
		return pinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryAddressMappingType() {
		return memoryAddressMappingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOsDataConsistencyMode() {
		return osDataConsistencyModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessMultiplicity() {
		return accessMultiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataStabilityLevel() {
		return dataStabilityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemaphoreType() {
		return semaphoreTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCondition() {
		return conditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupingType() {
		return groupingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWaitEventType() {
		return waitEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWaitingBehaviour() {
		return waitingBehaviourEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getISRCategory() {
		return isrCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessPrecedenceType() {
		return accessPrecedenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderType() {
		return orderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelDataStability() {
		return labelDataStabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReceiveOperation() {
		return receiveOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelAccessDataStability() {
		return labelAccessDataStabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelAccessEnum() {
		return labelAccessEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemaphoreAccessEnum() {
		return semaphoreAccessEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockingType() {
		return blockingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreemption() {
		return preemptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConcurrencyType() {
		return concurrencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getASILType() {
		return asilTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmaltheaFactory getAmaltheaFactory() {
		return (AmaltheaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		amaltheaEClass = createEClass(AMALTHEA);
		createEAttribute(amaltheaEClass, AMALTHEA__VERSION);
		createEReference(amaltheaEClass, AMALTHEA__COMMON_ELEMENTS);
		createEReference(amaltheaEClass, AMALTHEA__SW_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__HW_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__OS_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__STIMULI_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__EVENT_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__CONSTRAINTS_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__PROPERTY_CONSTRAINTS_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__MAPPING_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__COMPONENTS_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__CONFIG_MODEL);
		createEReference(amaltheaEClass, AMALTHEA__MEASUREMENT_MODEL);

		commonElementsEClass = createEClass(COMMON_ELEMENTS);
		createEReference(commonElementsEClass, COMMON_ELEMENTS__TAGS);
		createEReference(commonElementsEClass, COMMON_ELEMENTS__CORE_CLASSIFIERS);
		createEReference(commonElementsEClass, COMMON_ELEMENTS__MEMORY_CLASSIFIERS);

		baseObjectEClass = createEClass(BASE_OBJECT);

		referableObjectEClass = createEClass(REFERABLE_OBJECT);

		referableBaseObjectEClass = createEClass(REFERABLE_BASE_OBJECT);

		iAnnotatableEClass = createEClass(IANNOTATABLE);
		createEReference(iAnnotatableEClass, IANNOTATABLE__CUSTOM_PROPERTIES);

		iTaggableEClass = createEClass(ITAGGABLE);
		createEReference(iTaggableEClass, ITAGGABLE__TAGS);

		iReferableEClass = createEClass(IREFERABLE);
		createEAttribute(iReferableEClass, IREFERABLE__NAME);
		createEAttribute(iReferableEClass, IREFERABLE__UNIQUE_NAME);
		createEOperation(iReferableEClass, IREFERABLE___COMPUTE_UNIQUE_NAME);
		createEOperation(iReferableEClass, IREFERABLE___ENCODE__STRING);

		iDisplayNameEClass = createEClass(IDISPLAY_NAME);
		createEAttribute(iDisplayNameEClass, IDISPLAY_NAME__DISPLAY_NAME);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__TAG_TYPE);

		classifierEClass = createEClass(CLASSIFIER);
		createEAttribute(classifierEClass, CLASSIFIER__DESCRIPTION);

		coreClassifierEClass = createEClass(CORE_CLASSIFIER);

		memoryClassifierEClass = createEClass(MEMORY_CLASSIFIER);

		instructionsEClass = createEClass(INSTRUCTIONS);
		createEReference(instructionsEClass, INSTRUCTIONS__FETCH_STATISTIC);
		createEOperation(instructionsEClass, INSTRUCTIONS___CONTAINER_NOTIFICATION_REQUIRED);

		transmissionPolicyEClass = createEClass(TRANSMISSION_POLICY);
		createEReference(transmissionPolicyEClass, TRANSMISSION_POLICY__CHUNK_SIZE);
		createEAttribute(transmissionPolicyEClass, TRANSMISSION_POLICY__CHUNK_PROCESSING_INSTRUCTIONS);
		createEAttribute(transmissionPolicyEClass, TRANSMISSION_POLICY__TRANSMIT_RATIO);

		instructionsDeviationEClass = createEClass(INSTRUCTIONS_DEVIATION);
		createEReference(instructionsDeviationEClass, INSTRUCTIONS_DEVIATION__DEVIATION);

		instructionsConstantEClass = createEClass(INSTRUCTIONS_CONSTANT);
		createEAttribute(instructionsConstantEClass, INSTRUCTIONS_CONSTANT__VALUE);

		timeComparableEClass = createEClass(TIME_COMPARABLE);

		abstractTimeEClass = createEClass(ABSTRACT_TIME);
		createEAttribute(abstractTimeEClass, ABSTRACT_TIME__VALUE);
		createEAttribute(abstractTimeEClass, ABSTRACT_TIME__UNIT);
		createEOperation(abstractTimeEClass, ABSTRACT_TIME___TO_STRING);
		createEOperation(abstractTimeEClass, ABSTRACT_TIME___COMPARE_TO__ABSTRACTTIME);

		timeEClass = createEClass(TIME);
		createEOperation(timeEClass, TIME___CONTAINER_NOTIFICATION_REQUIRED);

		frequencyEClass = createEClass(FREQUENCY);
		createEAttribute(frequencyEClass, FREQUENCY__UNIT);
		createEAttribute(frequencyEClass, FREQUENCY__VALUE);
		createEOperation(frequencyEClass, FREQUENCY___CONTAINER_NOTIFICATION_REQUIRED);
		createEOperation(frequencyEClass, FREQUENCY___TO_STRING);

		dataSizeEClass = createEClass(DATA_SIZE);
		createEAttribute(dataSizeEClass, DATA_SIZE__VALUE);
		createEAttribute(dataSizeEClass, DATA_SIZE__UNIT);
		createEOperation(dataSizeEClass, DATA_SIZE___TO_STRING);
		createEOperation(dataSizeEClass, DATA_SIZE___CONTAINER_NOTIFICATION_REQUIRED);
		createEOperation(dataSizeEClass, DATA_SIZE___GET_NUMBER_BITS);
		createEOperation(dataSizeEClass, DATA_SIZE___GET_NUMBER_BYTES);

		dataRateEClass = createEClass(DATA_RATE);
		createEAttribute(dataRateEClass, DATA_RATE__VALUE);
		createEAttribute(dataRateEClass, DATA_RATE__UNIT);
		createEOperation(dataRateEClass, DATA_RATE___TO_STRING);

		customPropertyEClass = createEClass(CUSTOM_PROPERTY);
		createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__KEY);
		createEReference(customPropertyEClass, CUSTOM_PROPERTY__VALUE);

		valueEClass = createEClass(VALUE);
		createEOperation(valueEClass, VALUE___CONTAINER_NOTIFICATION_REQUIRED);

		listObjectEClass = createEClass(LIST_OBJECT);
		createEReference(listObjectEClass, LIST_OBJECT__VALUES);
		createEOperation(listObjectEClass, LIST_OBJECT___TO_STRING);

		stringObjectEClass = createEClass(STRING_OBJECT);
		createEAttribute(stringObjectEClass, STRING_OBJECT__VALUE);
		createEOperation(stringObjectEClass, STRING_OBJECT___TO_STRING);

		bigIntegerObjectEClass = createEClass(BIG_INTEGER_OBJECT);
		createEAttribute(bigIntegerObjectEClass, BIG_INTEGER_OBJECT__VALUE);
		createEOperation(bigIntegerObjectEClass, BIG_INTEGER_OBJECT___TO_STRING);

		referenceObjectEClass = createEClass(REFERENCE_OBJECT);
		createEReference(referenceObjectEClass, REFERENCE_OBJECT__VALUE);
		createEOperation(referenceObjectEClass, REFERENCE_OBJECT___TO_STRING);

		integerObjectEClass = createEClass(INTEGER_OBJECT);
		createEAttribute(integerObjectEClass, INTEGER_OBJECT__VALUE);
		createEOperation(integerObjectEClass, INTEGER_OBJECT___TO_STRING);

		longObjectEClass = createEClass(LONG_OBJECT);
		createEAttribute(longObjectEClass, LONG_OBJECT__VALUE);
		createEOperation(longObjectEClass, LONG_OBJECT___TO_STRING);

		floatObjectEClass = createEClass(FLOAT_OBJECT);
		createEAttribute(floatObjectEClass, FLOAT_OBJECT__VALUE);
		createEOperation(floatObjectEClass, FLOAT_OBJECT___TO_STRING);

		doubleObjectEClass = createEClass(DOUBLE_OBJECT);
		createEAttribute(doubleObjectEClass, DOUBLE_OBJECT__VALUE);
		createEOperation(doubleObjectEClass, DOUBLE_OBJECT___TO_STRING);

		booleanObjectEClass = createEClass(BOOLEAN_OBJECT);
		createEAttribute(booleanObjectEClass, BOOLEAN_OBJECT__VALUE);
		createEOperation(booleanObjectEClass, BOOLEAN_OBJECT___TO_STRING);

		timeObjectEClass = createEClass(TIME_OBJECT);
		createEOperation(timeObjectEClass, TIME_OBJECT___TO_STRING);

		deviationEClass = createEClass(DEVIATION);
		createEReference(deviationEClass, DEVIATION__LOWER_BOUND);
		createEReference(deviationEClass, DEVIATION__UPPER_BOUND);
		createEReference(deviationEClass, DEVIATION__DISTRIBUTION);
		createEOperation(deviationEClass, DEVIATION___CONTAINER_NOTIFICATION_REQUIRED);

		distributionEClass = createEClass(DISTRIBUTION);

		weibullDistributionEClass = createEClass(WEIBULL_DISTRIBUTION);

		weibullParametersEClass = createEClass(WEIBULL_PARAMETERS);
		createEAttribute(weibullParametersEClass, WEIBULL_PARAMETERS__KAPPA);
		createEAttribute(weibullParametersEClass, WEIBULL_PARAMETERS__LAMBDA);

		weibullEstimatorsEClass = createEClass(WEIBULL_ESTIMATORS);
		createEReference(weibullEstimatorsEClass, WEIBULL_ESTIMATORS__MEAN);
		createEAttribute(weibullEstimatorsEClass, WEIBULL_ESTIMATORS__PREMAIN_PROMILLE);

		uniformDistributionEClass = createEClass(UNIFORM_DISTRIBUTION);

		boundariesEClass = createEClass(BOUNDARIES);
		createEAttribute(boundariesEClass, BOUNDARIES__SAMPLING_TYPE);

		gaussDistributionEClass = createEClass(GAUSS_DISTRIBUTION);
		createEReference(gaussDistributionEClass, GAUSS_DISTRIBUTION__SD);
		createEReference(gaussDistributionEClass, GAUSS_DISTRIBUTION__MEAN);

		betaDistributionEClass = createEClass(BETA_DISTRIBUTION);
		createEAttribute(betaDistributionEClass, BETA_DISTRIBUTION__ALPHA);
		createEAttribute(betaDistributionEClass, BETA_DISTRIBUTION__BETA);

		numericStatisticEClass = createEClass(NUMERIC_STATISTIC);

		minAvgMaxStatisticEClass = createEClass(MIN_AVG_MAX_STATISTIC);
		createEAttribute(minAvgMaxStatisticEClass, MIN_AVG_MAX_STATISTIC__MIN);
		createEAttribute(minAvgMaxStatisticEClass, MIN_AVG_MAX_STATISTIC__AVG);
		createEAttribute(minAvgMaxStatisticEClass, MIN_AVG_MAX_STATISTIC__MAX);

		singleValueStatisticEClass = createEClass(SINGLE_VALUE_STATISTIC);
		createEAttribute(singleValueStatisticEClass, SINGLE_VALUE_STATISTIC__VALUE);

		modeEClass = createEClass(MODE);
		createEReference(modeEClass, MODE__LITERALS);

		modeLiteralEClass = createEClass(MODE_LITERAL);
		createEOperation(modeLiteralEClass, MODE_LITERAL___COMPUTE_UNIQUE_NAME);
		createEOperation(modeLiteralEClass, MODE_LITERAL___TO_STRING);

		componentsModelEClass = createEClass(COMPONENTS_MODEL);
		createEReference(componentsModelEClass, COMPONENTS_MODEL__COMPONENTS);
		createEReference(componentsModelEClass, COMPONENTS_MODEL__SYSTEMS);

		iNamedElementEClass = createEClass(INAMED_ELEMENT);
		createEAttribute(iNamedElementEClass, INAMED_ELEMENT__NAME);

		iSystemEClass = createEClass(ISYSTEM);
		createEReference(iSystemEClass, ISYSTEM__COMPONENT_INSTANCES);
		createEReference(iSystemEClass, ISYSTEM__CONNECTORS);
		createEReference(iSystemEClass, ISYSTEM__GROUNDED_PORTS);
		createEReference(iSystemEClass, ISYSTEM__INNER_PORTS);

		portEClass = createEClass(PORT);
		createEOperation(portEClass, PORT___COMPUTE_UNIQUE_NAME);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PORTS);
		createEReference(componentEClass, COMPONENT__TASKS);
		createEReference(componentEClass, COMPONENT__RUNNABLES);
		createEReference(componentEClass, COMPONENT__LABELS);
		createEReference(componentEClass, COMPONENT__SEMAPHORES);
		createEReference(componentEClass, COMPONENT__OS_EVENTS);

		compositeEClass = createEClass(COMPOSITE);

		systemEClass = createEClass(SYSTEM);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__TYPE);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__SOURCE_PORT);
		createEReference(connectorEClass, CONNECTOR__TARGET_PORT);

		qualifiedPortEClass = createEClass(QUALIFIED_PORT);
		createEReference(qualifiedPortEClass, QUALIFIED_PORT__INSTANCE);
		createEReference(qualifiedPortEClass, QUALIFIED_PORT__PORT);

		fInterfacePortEClass = createEClass(FINTERFACE_PORT);
		createEAttribute(fInterfacePortEClass, FINTERFACE_PORT__KIND);
		createEAttribute(fInterfacePortEClass, FINTERFACE_PORT__INTERFACE_NAME);

		configModelEClass = createEClass(CONFIG_MODEL);
		createEReference(configModelEClass, CONFIG_MODEL__EVENTS_TO_TRACE);

		eventConfigEClass = createEClass(EVENT_CONFIG);
		createEAttribute(eventConfigEClass, EVENT_CONFIG__NAME);
		createEReference(eventConfigEClass, EVENT_CONFIG__EVENT);

		constraintsModelEClass = createEClass(CONSTRAINTS_MODEL);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__EVENT_CHAINS);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__TIMING_CONSTRAINTS);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__REQUIREMENTS);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__DATA_STABILITY_GROUPS);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__PHYSICAL_SECTION_CONSTRAINTS);

		runnableSequencingConstraintEClass = createEClass(RUNNABLE_SEQUENCING_CONSTRAINT);
		createEAttribute(runnableSequencingConstraintEClass, RUNNABLE_SEQUENCING_CONSTRAINT__ORDER_TYPE);
		createEReference(runnableSequencingConstraintEClass, RUNNABLE_SEQUENCING_CONSTRAINT__RUNNABLE_GROUPS);
		createEReference(runnableSequencingConstraintEClass, RUNNABLE_SEQUENCING_CONSTRAINT__PROCESS_SCOPE);

		affinityConstraintEClass = createEClass(AFFINITY_CONSTRAINT);

		separationConstraintEClass = createEClass(SEPARATION_CONSTRAINT);

		pairingConstraintEClass = createEClass(PAIRING_CONSTRAINT);

		processConstraintEClass = createEClass(PROCESS_CONSTRAINT);
		createEReference(processConstraintEClass, PROCESS_CONSTRAINT__TARGET);

		runnableConstraintEClass = createEClass(RUNNABLE_CONSTRAINT);
		createEReference(runnableConstraintEClass, RUNNABLE_CONSTRAINT__TARGET);

		dataConstraintEClass = createEClass(DATA_CONSTRAINT);
		createEReference(dataConstraintEClass, DATA_CONSTRAINT__TARGET);

		runnableSeparationConstraintEClass = createEClass(RUNNABLE_SEPARATION_CONSTRAINT);
		createEReference(runnableSeparationConstraintEClass, RUNNABLE_SEPARATION_CONSTRAINT__GROUPS);

		processSeparationConstraintEClass = createEClass(PROCESS_SEPARATION_CONSTRAINT);
		createEReference(processSeparationConstraintEClass, PROCESS_SEPARATION_CONSTRAINT__GROUPS);

		dataSeparationConstraintEClass = createEClass(DATA_SEPARATION_CONSTRAINT);
		createEReference(dataSeparationConstraintEClass, DATA_SEPARATION_CONSTRAINT__GROUPS);

		runnablePairingConstraintEClass = createEClass(RUNNABLE_PAIRING_CONSTRAINT);
		createEReference(runnablePairingConstraintEClass, RUNNABLE_PAIRING_CONSTRAINT__GROUP);

		processPairingConstraintEClass = createEClass(PROCESS_PAIRING_CONSTRAINT);
		createEReference(processPairingConstraintEClass, PROCESS_PAIRING_CONSTRAINT__GROUP);

		dataPairingConstraintEClass = createEClass(DATA_PAIRING_CONSTRAINT);
		createEReference(dataPairingConstraintEClass, DATA_PAIRING_CONSTRAINT__GROUP);

		runnableConstraintTargetEClass = createEClass(RUNNABLE_CONSTRAINT_TARGET);

		processConstraintTargetEClass = createEClass(PROCESS_CONSTRAINT_TARGET);

		dataConstraintTargetEClass = createEClass(DATA_CONSTRAINT_TARGET);

		targetMemoryEClass = createEClass(TARGET_MEMORY);
		createEReference(targetMemoryEClass, TARGET_MEMORY__MEMORIES);

		targetCoreEClass = createEClass(TARGET_CORE);
		createEReference(targetCoreEClass, TARGET_CORE__CORES);

		targetSchedulerEClass = createEClass(TARGET_SCHEDULER);
		createEReference(targetSchedulerEClass, TARGET_SCHEDULER__SCHEDULERS);

		labelGroupEClass = createEClass(LABEL_GROUP);

		runnableGroupEClass = createEClass(RUNNABLE_GROUP);

		processGroupEClass = createEClass(PROCESS_GROUP);

		labelEntityGroupEClass = createEClass(LABEL_ENTITY_GROUP);
		createEReference(labelEntityGroupEClass, LABEL_ENTITY_GROUP__LABELS);

		runnableEntityGroupEClass = createEClass(RUNNABLE_ENTITY_GROUP);
		createEReference(runnableEntityGroupEClass, RUNNABLE_ENTITY_GROUP__RUNNABLES);

		processEntityGroupEClass = createEClass(PROCESS_ENTITY_GROUP);
		createEReference(processEntityGroupEClass, PROCESS_ENTITY_GROUP__PROCESSES);

		tagGroupEClass = createEClass(TAG_GROUP);
		createEReference(tagGroupEClass, TAG_GROUP__TAG);

		abstractEventChainEClass = createEClass(ABSTRACT_EVENT_CHAIN);
		createEReference(abstractEventChainEClass, ABSTRACT_EVENT_CHAIN__STIMULUS);
		createEReference(abstractEventChainEClass, ABSTRACT_EVENT_CHAIN__RESPONSE);
		createEReference(abstractEventChainEClass, ABSTRACT_EVENT_CHAIN__SEGMENTS);
		createEReference(abstractEventChainEClass, ABSTRACT_EVENT_CHAIN__STRANDS);
		createEOperation(abstractEventChainEClass, ABSTRACT_EVENT_CHAIN___GET_NAME);
		createEOperation(abstractEventChainEClass, ABSTRACT_EVENT_CHAIN___CONTAINER_NOTIFICATION_REQUIRED);

		eventChainEClass = createEClass(EVENT_CHAIN);

		subEventChainEClass = createEClass(SUB_EVENT_CHAIN);

		eventChainItemEClass = createEClass(EVENT_CHAIN_ITEM);
		createEOperation(eventChainItemEClass, EVENT_CHAIN_ITEM___GET_EVENT_CHAIN);

		eventChainReferenceEClass = createEClass(EVENT_CHAIN_REFERENCE);
		createEReference(eventChainReferenceEClass, EVENT_CHAIN_REFERENCE__EVENT_CHAIN);

		eventChainContainerEClass = createEClass(EVENT_CHAIN_CONTAINER);
		createEReference(eventChainContainerEClass, EVENT_CHAIN_CONTAINER__EVENT_CHAIN);

		timingConstraintEClass = createEClass(TIMING_CONSTRAINT);

		physicalSectionConstraintEClass = createEClass(PHYSICAL_SECTION_CONSTRAINT);
		createEReference(physicalSectionConstraintEClass, PHYSICAL_SECTION_CONSTRAINT__SECTION);
		createEReference(physicalSectionConstraintEClass, PHYSICAL_SECTION_CONSTRAINT__MEMORIES);

		synchronizationConstraintEClass = createEClass(SYNCHRONIZATION_CONSTRAINT);
		createEAttribute(synchronizationConstraintEClass, SYNCHRONIZATION_CONSTRAINT__MULTIPLE_OCCURRENCES_ALLOWED);
		createEReference(synchronizationConstraintEClass, SYNCHRONIZATION_CONSTRAINT__TOLERANCE);

		eventSynchronizationConstraintEClass = createEClass(EVENT_SYNCHRONIZATION_CONSTRAINT);
		createEReference(eventSynchronizationConstraintEClass, EVENT_SYNCHRONIZATION_CONSTRAINT__EVENTS);

		eventChainSynchronizationConstraintEClass = createEClass(EVENT_CHAIN_SYNCHRONIZATION_CONSTRAINT);
		createEReference(eventChainSynchronizationConstraintEClass, EVENT_CHAIN_SYNCHRONIZATION_CONSTRAINT__SCOPE);
		createEAttribute(eventChainSynchronizationConstraintEClass, EVENT_CHAIN_SYNCHRONIZATION_CONSTRAINT__TYPE);

		delayConstraintEClass = createEClass(DELAY_CONSTRAINT);
		createEAttribute(delayConstraintEClass, DELAY_CONSTRAINT__MAPPING_TYPE);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__SOURCE);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__TARGET);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__UPPER);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__LOWER);

		eventChainLatencyConstraintEClass = createEClass(EVENT_CHAIN_LATENCY_CONSTRAINT);
		createEReference(eventChainLatencyConstraintEClass, EVENT_CHAIN_LATENCY_CONSTRAINT__SCOPE);
		createEAttribute(eventChainLatencyConstraintEClass, EVENT_CHAIN_LATENCY_CONSTRAINT__TYPE);
		createEReference(eventChainLatencyConstraintEClass, EVENT_CHAIN_LATENCY_CONSTRAINT__MINIMUM);
		createEReference(eventChainLatencyConstraintEClass, EVENT_CHAIN_LATENCY_CONSTRAINT__MAXIMUM);

		repetitionConstraintEClass = createEClass(REPETITION_CONSTRAINT);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__EVENT);
		createEAttribute(repetitionConstraintEClass, REPETITION_CONSTRAINT__SPAN);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__LOWER);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__UPPER);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__JITTER);
		createEReference(repetitionConstraintEClass, REPETITION_CONSTRAINT__PERIOD);

		dataAgeConstraintEClass = createEClass(DATA_AGE_CONSTRAINT);
		createEReference(dataAgeConstraintEClass, DATA_AGE_CONSTRAINT__RUNNABLE);
		createEReference(dataAgeConstraintEClass, DATA_AGE_CONSTRAINT__LABEL);
		createEReference(dataAgeConstraintEClass, DATA_AGE_CONSTRAINT__DATA_AGE);

		dataAgeEClass = createEClass(DATA_AGE);

		dataAgeCycleEClass = createEClass(DATA_AGE_CYCLE);
		createEAttribute(dataAgeCycleEClass, DATA_AGE_CYCLE__MINIMUM_CYCLE);
		createEAttribute(dataAgeCycleEClass, DATA_AGE_CYCLE__MAXIMUM_CYCLE);

		dataAgeTimeEClass = createEClass(DATA_AGE_TIME);
		createEReference(dataAgeTimeEClass, DATA_AGE_TIME__MINIMUM_TIME);
		createEReference(dataAgeTimeEClass, DATA_AGE_TIME__MAXIMUM_TIME);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEAttribute(requirementEClass, REQUIREMENT__SEVERITY);
		createEReference(requirementEClass, REQUIREMENT__LIMIT);

		processRequirementEClass = createEClass(PROCESS_REQUIREMENT);
		createEReference(processRequirementEClass, PROCESS_REQUIREMENT__PROCESS);

		runnableRequirementEClass = createEClass(RUNNABLE_REQUIREMENT);
		createEReference(runnableRequirementEClass, RUNNABLE_REQUIREMENT__RUNNABLE);

		architectureRequirementEClass = createEClass(ARCHITECTURE_REQUIREMENT);
		createEReference(architectureRequirementEClass, ARCHITECTURE_REQUIREMENT__COMPONENT);

		processChainRequirementEClass = createEClass(PROCESS_CHAIN_REQUIREMENT);
		createEReference(processChainRequirementEClass, PROCESS_CHAIN_REQUIREMENT__PROCESS_CHAIN);

		requirementLimitEClass = createEClass(REQUIREMENT_LIMIT);
		createEAttribute(requirementLimitEClass, REQUIREMENT_LIMIT__LIMIT_TYPE);
		createEOperation(requirementLimitEClass, REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED);

		cpuPercentageRequirementLimitEClass = createEClass(CPU_PERCENTAGE_REQUIREMENT_LIMIT);
		createEAttribute(cpuPercentageRequirementLimitEClass, CPU_PERCENTAGE_REQUIREMENT_LIMIT__METRIC);
		createEAttribute(cpuPercentageRequirementLimitEClass, CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE);
		createEReference(cpuPercentageRequirementLimitEClass, CPU_PERCENTAGE_REQUIREMENT_LIMIT__HARDWARE_CONTEXT);

		frequencyRequirementLimitEClass = createEClass(FREQUENCY_REQUIREMENT_LIMIT);
		createEAttribute(frequencyRequirementLimitEClass, FREQUENCY_REQUIREMENT_LIMIT__METRIC);
		createEReference(frequencyRequirementLimitEClass, FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE);

		percentageRequirementLimitEClass = createEClass(PERCENTAGE_REQUIREMENT_LIMIT);
		createEAttribute(percentageRequirementLimitEClass, PERCENTAGE_REQUIREMENT_LIMIT__METRIC);
		createEAttribute(percentageRequirementLimitEClass, PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE);

		countRequirementLimitEClass = createEClass(COUNT_REQUIREMENT_LIMIT);
		createEAttribute(countRequirementLimitEClass, COUNT_REQUIREMENT_LIMIT__METRIC);
		createEAttribute(countRequirementLimitEClass, COUNT_REQUIREMENT_LIMIT__LIMIT_VALUE);

		timeRequirementLimitEClass = createEClass(TIME_REQUIREMENT_LIMIT);
		createEAttribute(timeRequirementLimitEClass, TIME_REQUIREMENT_LIMIT__METRIC);
		createEReference(timeRequirementLimitEClass, TIME_REQUIREMENT_LIMIT__LIMIT_VALUE);

		dataCoherencyGroupEClass = createEClass(DATA_COHERENCY_GROUP);
		createEReference(dataCoherencyGroupEClass, DATA_COHERENCY_GROUP__LABELS);
		createEReference(dataCoherencyGroupEClass, DATA_COHERENCY_GROUP__SCOPE);
		createEAttribute(dataCoherencyGroupEClass, DATA_COHERENCY_GROUP__DIRECTION);

		dataStabilityGroupEClass = createEClass(DATA_STABILITY_GROUP);
		createEReference(dataStabilityGroupEClass, DATA_STABILITY_GROUP__LABELS);
		createEReference(dataStabilityGroupEClass, DATA_STABILITY_GROUP__SCOPE);

		dataGroupScopeEClass = createEClass(DATA_GROUP_SCOPE);
		createEOperation(dataGroupScopeEClass, DATA_GROUP_SCOPE___CONTAINER_NOTIFICATION_REQUIRED);

		processScopeEClass = createEClass(PROCESS_SCOPE);
		createEReference(processScopeEClass, PROCESS_SCOPE__PROCESS);

		runnableScopeEClass = createEClass(RUNNABLE_SCOPE);
		createEReference(runnableScopeEClass, RUNNABLE_SCOPE__RUNNABLE);

		componentScopeEClass = createEClass(COMPONENT_SCOPE);
		createEReference(componentScopeEClass, COMPONENT_SCOPE__COMPONENT);

		eventModelEClass = createEClass(EVENT_MODEL);
		createEReference(eventModelEClass, EVENT_MODEL__EVENTS);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__DESCRIPTION);

		eventSetEClass = createEClass(EVENT_SET);
		createEReference(eventSetEClass, EVENT_SET__EVENTS);

		entityEventEClass = createEClass(ENTITY_EVENT);

		triggerEventEClass = createEClass(TRIGGER_EVENT);

		customEventEClass = createEClass(CUSTOM_EVENT);
		createEAttribute(customEventEClass, CUSTOM_EVENT__EVENT_TYPE);
		createEReference(customEventEClass, CUSTOM_EVENT__EXPLICIT_TRIGGERS);

		stimulusEventEClass = createEClass(STIMULUS_EVENT);
		createEReference(stimulusEventEClass, STIMULUS_EVENT__ENTITY);

		processEventEClass = createEClass(PROCESS_EVENT);
		createEAttribute(processEventEClass, PROCESS_EVENT__EVENT_TYPE);
		createEReference(processEventEClass, PROCESS_EVENT__ENTITY);
		createEReference(processEventEClass, PROCESS_EVENT__CORE);

		processChainEventEClass = createEClass(PROCESS_CHAIN_EVENT);
		createEAttribute(processChainEventEClass, PROCESS_CHAIN_EVENT__EVENT_TYPE);
		createEReference(processChainEventEClass, PROCESS_CHAIN_EVENT__ENTITY);
		createEReference(processChainEventEClass, PROCESS_CHAIN_EVENT__CORE);

		runnableEventEClass = createEClass(RUNNABLE_EVENT);
		createEAttribute(runnableEventEClass, RUNNABLE_EVENT__EVENT_TYPE);
		createEReference(runnableEventEClass, RUNNABLE_EVENT__ENTITY);
		createEReference(runnableEventEClass, RUNNABLE_EVENT__PROCESS);
		createEReference(runnableEventEClass, RUNNABLE_EVENT__CORE);

		labelEventEClass = createEClass(LABEL_EVENT);
		createEAttribute(labelEventEClass, LABEL_EVENT__EVENT_TYPE);
		createEReference(labelEventEClass, LABEL_EVENT__ENTITY);
		createEReference(labelEventEClass, LABEL_EVENT__RUNNABLE);
		createEReference(labelEventEClass, LABEL_EVENT__PROCESS);

		channelEventEClass = createEClass(CHANNEL_EVENT);
		createEAttribute(channelEventEClass, CHANNEL_EVENT__EVENT_TYPE);
		createEReference(channelEventEClass, CHANNEL_EVENT__ENTITY);
		createEReference(channelEventEClass, CHANNEL_EVENT__RUNNABLE);
		createEReference(channelEventEClass, CHANNEL_EVENT__PROCESS);

		semaphoreEventEClass = createEClass(SEMAPHORE_EVENT);
		createEAttribute(semaphoreEventEClass, SEMAPHORE_EVENT__EVENT_TYPE);
		createEReference(semaphoreEventEClass, SEMAPHORE_EVENT__ENTITY);
		createEReference(semaphoreEventEClass, SEMAPHORE_EVENT__RUNNABLE);
		createEReference(semaphoreEventEClass, SEMAPHORE_EVENT__PROCESS);
		createEReference(semaphoreEventEClass, SEMAPHORE_EVENT__CORE);

		hwModelEClass = createEClass(HW_MODEL);
		createEReference(hwModelEClass, HW_MODEL__SYSTEM_TYPES);
		createEReference(hwModelEClass, HW_MODEL__ECU_TYPES);
		createEReference(hwModelEClass, HW_MODEL__MC_TYPES);
		createEReference(hwModelEClass, HW_MODEL__CORE_TYPES);
		createEReference(hwModelEClass, HW_MODEL__MEMORY_TYPES);
		createEReference(hwModelEClass, HW_MODEL__NETWORK_TYPES);
		createEReference(hwModelEClass, HW_MODEL__ACCESS_PATHS);
		createEReference(hwModelEClass, HW_MODEL__SYSTEM);

		complexNodeEClass = createEClass(COMPLEX_NODE);
		createEReference(complexNodeEClass, COMPLEX_NODE__PRESCALER);
		createEReference(complexNodeEClass, COMPLEX_NODE__MEMORIES);
		createEReference(complexNodeEClass, COMPLEX_NODE__NETWORKS);
		createEReference(complexNodeEClass, COMPLEX_NODE__COMPONENTS);
		createEReference(complexNodeEClass, COMPLEX_NODE__PORTS);

		hwSystemEClass = createEClass(HW_SYSTEM);
		createEReference(hwSystemEClass, HW_SYSTEM__SYSTEM_TYPE);
		createEReference(hwSystemEClass, HW_SYSTEM__ECUS);
		createEReference(hwSystemEClass, HW_SYSTEM__QUARTZES);

		ecuEClass = createEClass(ECU);
		createEReference(ecuEClass, ECU__ECU_TYPE);
		createEReference(ecuEClass, ECU__MICROCONTROLLERS);

		microcontrollerEClass = createEClass(MICROCONTROLLER);
		createEReference(microcontrollerEClass, MICROCONTROLLER__MICROCONTROLLER_TYPE);
		createEReference(microcontrollerEClass, MICROCONTROLLER__CORES);

		coreEClass = createEClass(CORE);
		createEReference(coreEClass, CORE__CORE_TYPE);
		createEAttribute(coreEClass, CORE__LOCKSTEP_GROUP);

		memoryEClass = createEClass(MEMORY);
		createEReference(memoryEClass, MEMORY__TYPE);
		createEReference(memoryEClass, MEMORY__MAPPINGS);

		networkEClass = createEClass(NETWORK);
		createEReference(networkEClass, NETWORK__TYPE);

		quartzEClass = createEClass(QUARTZ);
		createEReference(quartzEClass, QUARTZ__FREQUENCY);
		createEAttribute(quartzEClass, QUARTZ__TYPE);

		hwComponentEClass = createEClass(HW_COMPONENT);
		createEReference(hwComponentEClass, HW_COMPONENT__NESTED_COMPONENTS);

		hardwareTypeDescriptionEClass = createEClass(HARDWARE_TYPE_DESCRIPTION);

		abstractionTypeEClass = createEClass(ABSTRACTION_TYPE);

		systemTypeEClass = createEClass(SYSTEM_TYPE);

		ecuTypeEClass = createEClass(ECU_TYPE);

		microcontrollerTypeEClass = createEClass(MICROCONTROLLER_TYPE);

		coreTypeEClass = createEClass(CORE_TYPE);
		createEAttribute(coreTypeEClass, CORE_TYPE__BIT_WIDTH);
		createEAttribute(coreTypeEClass, CORE_TYPE__INSTRUCTIONS_PER_CYCLE);
		createEReference(coreTypeEClass, CORE_TYPE__CLASSIFIERS);

		memoryTypeEClass = createEClass(MEMORY_TYPE);
		createEAttribute(memoryTypeEClass, MEMORY_TYPE__TYPE);
		createEReference(memoryTypeEClass, MEMORY_TYPE__SIZE);
		createEReference(memoryTypeEClass, MEMORY_TYPE__CLASSIFIERS);

		networkTypeEClass = createEClass(NETWORK_TYPE);
		createEAttribute(networkTypeEClass, NETWORK_TYPE__SCHED_POLICY);
		createEAttribute(networkTypeEClass, NETWORK_TYPE__BIT_WIDTH);

		hwPortEClass = createEClass(HW_PORT);
		createEReference(hwPortEClass, HW_PORT__PINS);
		createEOperation(hwPortEClass, HW_PORT___COMPUTE_UNIQUE_NAME);

		pinEClass = createEClass(PIN);

		complexPortEClass = createEClass(COMPLEX_PORT);
		createEReference(complexPortEClass, COMPLEX_PORT__NETWORK);
		createEAttribute(complexPortEClass, COMPLEX_PORT__MASTER);
		createEAttribute(complexPortEClass, COMPLEX_PORT__BIT_WIDTH);
		createEAttribute(complexPortEClass, COMPLEX_PORT__BASE_ADDRESS);
		createEAttribute(complexPortEClass, COMPLEX_PORT__ADDRESS_RANGE);
		createEAttribute(complexPortEClass, COMPLEX_PORT__DIRECTION);
		createEAttribute(complexPortEClass, COMPLEX_PORT__WRITE_CYCLES);
		createEAttribute(complexPortEClass, COMPLEX_PORT__READ_CYCLES);
		createEAttribute(complexPortEClass, COMPLEX_PORT__SCHED_VALUE);

		complexPinEClass = createEClass(COMPLEX_PIN);
		createEAttribute(complexPinEClass, COMPLEX_PIN__TYPE);
		createEAttribute(complexPinEClass, COMPLEX_PIN__BASE_ADDRESS);
		createEAttribute(complexPinEClass, COMPLEX_PIN__DIRECTION);

		prescalerEClass = createEClass(PRESCALER);
		createEAttribute(prescalerEClass, PRESCALER__NAME);
		createEAttribute(prescalerEClass, PRESCALER__CLOCK_RATIO);
		createEReference(prescalerEClass, PRESCALER__QUARTZ);

		crossbarSwitchEClass = createEClass(CROSSBAR_SWITCH);
		createEAttribute(crossbarSwitchEClass, CROSSBAR_SWITCH__CON_CONNECTIONS);

		busEClass = createEClass(BUS);
		createEAttribute(busEClass, BUS__BUS_TYPE);

		bridgeEClass = createEClass(BRIDGE);

		accessPathEClass = createEClass(ACCESS_PATH);
		createEReference(accessPathEClass, ACCESS_PATH__SOURCE);
		createEReference(accessPathEClass, ACCESS_PATH__TARGET);

		latencyAccessPathEClass = createEClass(LATENCY_ACCESS_PATH);
		createEReference(latencyAccessPathEClass, LATENCY_ACCESS_PATH__LATENCIES);

		hwAccessPathEClass = createEClass(HW_ACCESS_PATH);
		createEReference(hwAccessPathEClass, HW_ACCESS_PATH__HW_ELEMENTS);

		latencyAccessPathElementEClass = createEClass(LATENCY_ACCESS_PATH_ELEMENT);

		accessPathRefEClass = createEClass(ACCESS_PATH_REF);
		createEReference(accessPathRefEClass, ACCESS_PATH_REF__REF);

		latencyEClass = createEClass(LATENCY);
		createEAttribute(latencyEClass, LATENCY__ACCESS_TYPE);
		createEAttribute(latencyEClass, LATENCY__TRANSFER_SIZE);
		createEReference(latencyEClass, LATENCY__QUARTZ);

		latencyConstantEClass = createEClass(LATENCY_CONSTANT);
		createEAttribute(latencyConstantEClass, LATENCY_CONSTANT__VALUE);

		latencyDeviationEClass = createEClass(LATENCY_DEVIATION);
		createEReference(latencyDeviationEClass, LATENCY_DEVIATION__DEVIATION);

		hwAccessPathElementEClass = createEClass(HW_ACCESS_PATH_ELEMENT);

		hwAccessPathRefEClass = createEClass(HW_ACCESS_PATH_REF);
		createEReference(hwAccessPathRefEClass, HW_ACCESS_PATH_REF__REF);

		hwElementRefEClass = createEClass(HW_ELEMENT_REF);
		createEReference(hwElementRefEClass, HW_ELEMENT_REF__PORT);

		mappingModelEClass = createEClass(MAPPING_MODEL);
		createEReference(mappingModelEClass, MAPPING_MODEL__SCHEDULER_ALLOCATION);
		createEReference(mappingModelEClass, MAPPING_MODEL__RUNNABLE_ALLOCATION);
		createEReference(mappingModelEClass, MAPPING_MODEL__TASK_ALLOCATION);
		createEReference(mappingModelEClass, MAPPING_MODEL__ISR_ALLOCATION);
		createEReference(mappingModelEClass, MAPPING_MODEL__MEMORY_MAPPING);
		createEReference(mappingModelEClass, MAPPING_MODEL__PHYSICAL_SECTION_MAPPING);
		createEAttribute(mappingModelEClass, MAPPING_MODEL__ADDRESS_MAPPING_TYPE);

		schedulerAllocationEClass = createEClass(SCHEDULER_ALLOCATION);
		createEReference(schedulerAllocationEClass, SCHEDULER_ALLOCATION__SCHEDULER);
		createEReference(schedulerAllocationEClass, SCHEDULER_ALLOCATION__RESPONSIBILITY);
		createEReference(schedulerAllocationEClass, SCHEDULER_ALLOCATION__EXECUTING_CORE);

		taskAllocationEClass = createEClass(TASK_ALLOCATION);
		createEReference(taskAllocationEClass, TASK_ALLOCATION__TASK);
		createEReference(taskAllocationEClass, TASK_ALLOCATION__SCHEDULER);
		createEReference(taskAllocationEClass, TASK_ALLOCATION__CORE_AFFINITY);
		createEReference(taskAllocationEClass, TASK_ALLOCATION__SCHEDULING_PARAMETERS);
		createEReference(taskAllocationEClass, TASK_ALLOCATION__PARAMETER_EXTENSIONS);

		isrAllocationEClass = createEClass(ISR_ALLOCATION);
		createEReference(isrAllocationEClass, ISR_ALLOCATION__ISR);
		createEReference(isrAllocationEClass, ISR_ALLOCATION__CONTROLLER);
		createEAttribute(isrAllocationEClass, ISR_ALLOCATION__PRIORITY);

		runnableAllocationEClass = createEClass(RUNNABLE_ALLOCATION);
		createEReference(runnableAllocationEClass, RUNNABLE_ALLOCATION__SCHEDULER);
		createEReference(runnableAllocationEClass, RUNNABLE_ALLOCATION__ENTITY);

		memoryMappingEClass = createEClass(MEMORY_MAPPING);
		createEReference(memoryMappingEClass, MEMORY_MAPPING__ABSTRACT_ELEMENT);
		createEReference(memoryMappingEClass, MEMORY_MAPPING__MEMORY);
		createEAttribute(memoryMappingEClass, MEMORY_MAPPING__MEMORY_POSITION_ADDRESS);
		createEReference(memoryMappingEClass, MEMORY_MAPPING__ABSTRACT_ELEMENT_LINK_INT);
		createEReference(memoryMappingEClass, MEMORY_MAPPING__MEMORY_LINK_INT);

		physicalSectionMappingEClass = createEClass(PHYSICAL_SECTION_MAPPING);
		createEReference(physicalSectionMappingEClass, PHYSICAL_SECTION_MAPPING__ORIGIN);
		createEReference(physicalSectionMappingEClass, PHYSICAL_SECTION_MAPPING__MEMORY);
		createEAttribute(physicalSectionMappingEClass, PHYSICAL_SECTION_MAPPING__START_ADDRESS);
		createEAttribute(physicalSectionMappingEClass, PHYSICAL_SECTION_MAPPING__END_ADDRESS);
		createEReference(physicalSectionMappingEClass, PHYSICAL_SECTION_MAPPING__LABELS);
		createEReference(physicalSectionMappingEClass, PHYSICAL_SECTION_MAPPING__RUN_ENTITIES);

		osModelEClass = createEClass(OS_MODEL);
		createEReference(osModelEClass, OS_MODEL__SEMAPHORES);
		createEReference(osModelEClass, OS_MODEL__OPERATING_SYSTEMS);
		createEReference(osModelEClass, OS_MODEL__OS_OVERHEADS);

		osDataConsistencyEClass = createEClass(OS_DATA_CONSISTENCY);
		createEAttribute(osDataConsistencyEClass, OS_DATA_CONSISTENCY__MODE);
		createEReference(osDataConsistencyEClass, OS_DATA_CONSISTENCY__DATA_STABILITY);
		createEReference(osDataConsistencyEClass, OS_DATA_CONSISTENCY__NON_ATOMIC_DATA_COHERENCY);

		dataStabilityEClass = createEClass(DATA_STABILITY);
		createEAttribute(dataStabilityEClass, DATA_STABILITY__ENABLED);
		createEAttribute(dataStabilityEClass, DATA_STABILITY__ALGORITHM);
		createEAttribute(dataStabilityEClass, DATA_STABILITY__ACCESS_MULTIPLICITY);
		createEAttribute(dataStabilityEClass, DATA_STABILITY__LEVEL);

		nonAtomicDataCoherencyEClass = createEClass(NON_ATOMIC_DATA_COHERENCY);
		createEAttribute(nonAtomicDataCoherencyEClass, NON_ATOMIC_DATA_COHERENCY__ENABLED);
		createEAttribute(nonAtomicDataCoherencyEClass, NON_ATOMIC_DATA_COHERENCY__ALGORITHM);
		createEAttribute(nonAtomicDataCoherencyEClass, NON_ATOMIC_DATA_COHERENCY__ACCESS_MULTIPLICITY);

		semaphoreEClass = createEClass(SEMAPHORE);
		createEAttribute(semaphoreEClass, SEMAPHORE__SEMAPHORE_TYPE);
		createEAttribute(semaphoreEClass, SEMAPHORE__INITIAL_VALUE);
		createEAttribute(semaphoreEClass, SEMAPHORE__MAX_VALUE);
		createEAttribute(semaphoreEClass, SEMAPHORE__PRIORITY_CEILING_PROTOCOL);
		createEReference(semaphoreEClass, SEMAPHORE__SEMAPHORE_ACCESSES);

		schedulerEClass = createEClass(SCHEDULER);
		createEReference(schedulerEClass, SCHEDULER__COMPUTATION_ITEMS);
		createEOperation(schedulerEClass, SCHEDULER___GET_SCHEDULING_ALGORITHM);

		taskSchedulerEClass = createEClass(TASK_SCHEDULER);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__SCHEDULING_ALGORITHM);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__PARENT_ASSOCIATION);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__CHILD_ASSOCIATIONS);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__PARENT_SCHEDULER);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__CHILD_SCHEDULERS);

		schedulerAssociationEClass = createEClass(SCHEDULER_ASSOCIATION);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__PARENT);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__PARENT_LINK_INT);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__CHILD);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__PARAMETER_EXTENSIONS);

		interruptControllerEClass = createEClass(INTERRUPT_CONTROLLER);
		createEReference(interruptControllerEClass, INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM);

		schedulingParametersEClass = createEClass(SCHEDULING_PARAMETERS);
		createEAttribute(schedulingParametersEClass, SCHEDULING_PARAMETERS__PRIORITY);
		createEReference(schedulingParametersEClass, SCHEDULING_PARAMETERS__MIN_BUDGET);
		createEReference(schedulingParametersEClass, SCHEDULING_PARAMETERS__MAX_BUDGET);
		createEReference(schedulingParametersEClass, SCHEDULING_PARAMETERS__REPLENISHMENT);

		parameterExtensionEClass = createEClass(PARAMETER_EXTENSION);
		createEAttribute(parameterExtensionEClass, PARAMETER_EXTENSION__KEY);
		createEAttribute(parameterExtensionEClass, PARAMETER_EXTENSION__VALUE);

		algorithmEClass = createEClass(ALGORITHM);

		interruptSchedulingAlgorithmEClass = createEClass(INTERRUPT_SCHEDULING_ALGORITHM);

		taskSchedulingAlgorithmEClass = createEClass(TASK_SCHEDULING_ALGORITHM);

		fixedPriorityEClass = createEClass(FIXED_PRIORITY);

		fixedPriorityPreemptiveEClass = createEClass(FIXED_PRIORITY_PREEMPTIVE);

		fixedPriorityPreemptiveWithBudgetEnforcementEClass = createEClass(FIXED_PRIORITY_PREEMPTIVE_WITH_BUDGET_ENFORCEMENT);

		osekEClass = createEClass(OSEK);

		deadlineMonotonicEClass = createEClass(DEADLINE_MONOTONIC);

		rateMonotonicEClass = createEClass(RATE_MONOTONIC);

		pfairEClass = createEClass(PFAIR);
		createEAttribute(pfairEClass, PFAIR__QUANT_SIZE_NS);

		pfairPD2EClass = createEClass(PFAIR_PD2);

		partlyPFairPD2EClass = createEClass(PARTLY_PFAIR_PD2);

		earlyReleaseFairPD2EClass = createEClass(EARLY_RELEASE_FAIR_PD2);

		partlyEarlyReleaseFairPD2EClass = createEClass(PARTLY_EARLY_RELEASE_FAIR_PD2);

		dynamicPriorityEClass = createEClass(DYNAMIC_PRIORITY);

		leastLocalRemainingExecutionTimeFirstEClass = createEClass(LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST);

		earliestDeadlineFirstEClass = createEClass(EARLIEST_DEADLINE_FIRST);

		priorityBasedRoundRobinEClass = createEClass(PRIORITY_BASED_ROUND_ROBIN);

		reservationBasedServerEClass = createEClass(RESERVATION_BASED_SERVER);

		deferrableServerEClass = createEClass(DEFERRABLE_SERVER);

		pollingPeriodicServerEClass = createEClass(POLLING_PERIODIC_SERVER);

		sporadicServerEClass = createEClass(SPORADIC_SERVER);

		constantBandwidthServerEClass = createEClass(CONSTANT_BANDWIDTH_SERVER);

		constantBandwidthServerWithCASHEClass = createEClass(CONSTANT_BANDWIDTH_SERVER_WITH_CASH);

		groupingEClass = createEClass(GROUPING);

		userSpecificSchedulingAlgorithmEClass = createEClass(USER_SPECIFIC_SCHEDULING_ALGORITHM);
		createEReference(userSpecificSchedulingAlgorithmEClass, USER_SPECIFIC_SCHEDULING_ALGORITHM__PARAMETER_EXTENSIONS);

		priorityBasedEClass = createEClass(PRIORITY_BASED);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__NAME);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__OVERHEAD);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__TASK_SCHEDULERS);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__INTERRUPT_CONTROLLERS);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__OS_DATA_CONSISTENCY);

		vendorOperatingSystemEClass = createEClass(VENDOR_OPERATING_SYSTEM);
		createEAttribute(vendorOperatingSystemEClass, VENDOR_OPERATING_SYSTEM__OS_NAME);
		createEAttribute(vendorOperatingSystemEClass, VENDOR_OPERATING_SYSTEM__VENDOR);
		createEAttribute(vendorOperatingSystemEClass, VENDOR_OPERATING_SYSTEM__VERSION);

		osInstructionsEClass = createEClass(OS_INSTRUCTIONS);
		createEReference(osInstructionsEClass, OS_INSTRUCTIONS__API_OVERHEAD);
		createEReference(osInstructionsEClass, OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD);
		createEReference(osInstructionsEClass, OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD);

		osAPIInstructionsEClass = createEClass(OS_API_INSTRUCTIONS);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_SEND_MESSAGE);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_TERMINATE_TASK);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_SCHEDULE);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_SET_EVENT);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_WAIT_EVENT);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_CLEAR_EVENT);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_ACTIVATE_TASK);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_SUSPEND_OS_INTERRUPTS);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_RESUME_OS_INTERRUPTS);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_REQUEST_SPINLOCK);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_RELEASE_SPINLOCK);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_SENDER_RECEIVER_READ);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_SENDER_RECEIVER_WRITE);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_SYNCHRONOUS_SERVER_CALL_POINT);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_IOC_READ);
		createEReference(osAPIInstructionsEClass, OS_API_INSTRUCTIONS__API_IOC_WRITE);

		osISRInstructionsEClass = createEClass(OS_ISR_INSTRUCTIONS);
		createEReference(osISRInstructionsEClass, OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD);
		createEReference(osISRInstructionsEClass, OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD);

		propertyConstraintsModelEClass = createEClass(PROPERTY_CONSTRAINTS_MODEL);
		createEReference(propertyConstraintsModelEClass, PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS);
		createEReference(propertyConstraintsModelEClass, PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS);

		coreAllocationConstraintEClass = createEClass(CORE_ALLOCATION_CONSTRAINT);
		createEReference(coreAllocationConstraintEClass, CORE_ALLOCATION_CONSTRAINT__CORE_CLASSIFICATION);

		memoryMappingConstraintEClass = createEClass(MEMORY_MAPPING_CONSTRAINT);
		createEReference(memoryMappingConstraintEClass, MEMORY_MAPPING_CONSTRAINT__MEMORY_CLASSIFICATION);

		processAllocationConstraintEClass = createEClass(PROCESS_ALLOCATION_CONSTRAINT);
		createEReference(processAllocationConstraintEClass, PROCESS_ALLOCATION_CONSTRAINT__PROCESS);

		processPrototypeAllocationConstraintEClass = createEClass(PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT);
		createEReference(processPrototypeAllocationConstraintEClass, PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT__PROCESS_PROTOTYPE);

		runnableAllocationConstraintEClass = createEClass(RUNNABLE_ALLOCATION_CONSTRAINT);
		createEReference(runnableAllocationConstraintEClass, RUNNABLE_ALLOCATION_CONSTRAINT__RUNNABLE);

		abstractElementMappingConstraintEClass = createEClass(ABSTRACT_ELEMENT_MAPPING_CONSTRAINT);
		createEReference(abstractElementMappingConstraintEClass, ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT);

		classificationEClass = createEClass(CLASSIFICATION);
		createEAttribute(classificationEClass, CLASSIFICATION__CONDITION);
		createEAttribute(classificationEClass, CLASSIFICATION__GROUPING);

		coreClassificationEClass = createEClass(CORE_CLASSIFICATION);
		createEReference(coreClassificationEClass, CORE_CLASSIFICATION__CLASSIFIERS);

		memoryClassificationEClass = createEClass(MEMORY_CLASSIFICATION);
		createEReference(memoryClassificationEClass, MEMORY_CLASSIFICATION__CLASSIFIERS);

		stimuliModelEClass = createEClass(STIMULI_MODEL);
		createEReference(stimuliModelEClass, STIMULI_MODEL__STIMULI);
		createEReference(stimuliModelEClass, STIMULI_MODEL__CLOCKS);

		stimulusEClass = createEClass(STIMULUS);
		createEReference(stimulusEClass, STIMULUS__STIMULUS_DEVIATION);
		createEReference(stimulusEClass, STIMULUS__SET_MODE_VALUE_LIST);
		createEReference(stimulusEClass, STIMULUS__ENABLING_MODE_VALUE_LIST);
		createEReference(stimulusEClass, STIMULUS__DISABLING_MODE_VALUE_LIST);

		modeValueListEClass = createEClass(MODE_VALUE_LIST);
		createEReference(modeValueListEClass, MODE_VALUE_LIST__ENTRIES);

		modeValueListEntryEClass = createEClass(MODE_VALUE_LIST_ENTRY);

		modeValueEClass = createEClass(MODE_VALUE);
		createEReference(modeValueEClass, MODE_VALUE__VALUE_PROVIDER);
		createEReference(modeValueEClass, MODE_VALUE__VALUE);

		modeValueConjunctionEClass = createEClass(MODE_VALUE_CONJUNCTION);
		createEReference(modeValueConjunctionEClass, MODE_VALUE_CONJUNCTION__ENTRIES);

		modeValueDisjunctionEClass = createEClass(MODE_VALUE_DISJUNCTION);
		createEReference(modeValueDisjunctionEClass, MODE_VALUE_DISJUNCTION__ENTRIES);

		periodicStimulusEClass = createEClass(PERIODIC_STIMULUS);
		createEReference(periodicStimulusEClass, PERIODIC_STIMULUS__OFFSET);
		createEReference(periodicStimulusEClass, PERIODIC_STIMULUS__RECURRENCE);
		createEReference(periodicStimulusEClass, PERIODIC_STIMULUS__CLOCK);

		variableRateStimulusEClass = createEClass(VARIABLE_RATE_STIMULUS);

		syntheticStimulusEClass = createEClass(SYNTHETIC_STIMULUS);
		createEReference(syntheticStimulusEClass, SYNTHETIC_STIMULUS__OFFSET);
		createEReference(syntheticStimulusEClass, SYNTHETIC_STIMULUS__PERIOD);
		createEReference(syntheticStimulusEClass, SYNTHETIC_STIMULUS__TRIGGER_TIMES);

		timestampListEClass = createEClass(TIMESTAMP_LIST);
		createEReference(timestampListEClass, TIMESTAMP_LIST__TIMESTAMPS);

		customStimulusEClass = createEClass(CUSTOM_STIMULUS);
		createEAttribute(customStimulusEClass, CUSTOM_STIMULUS__DESCRIPTION);

		singleStimulusEClass = createEClass(SINGLE_STIMULUS);
		createEReference(singleStimulusEClass, SINGLE_STIMULUS__ACTIVATION);

		interProcessStimulusEClass = createEClass(INTER_PROCESS_STIMULUS);
		createEReference(interProcessStimulusEClass, INTER_PROCESS_STIMULUS__COUNTER);
		createEReference(interProcessStimulusEClass, INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS);

		sporadicStimulusEClass = createEClass(SPORADIC_STIMULUS);
		createEAttribute(sporadicStimulusEClass, SPORADIC_STIMULUS__DESCRIPTION);

		eventStimulusEClass = createEClass(EVENT_STIMULUS);
		createEReference(eventStimulusEClass, EVENT_STIMULUS__TRIGGERING_EVENTS);
		createEReference(eventStimulusEClass, EVENT_STIMULUS__COUNTER);

		arrivalCurveStimulusEClass = createEClass(ARRIVAL_CURVE_STIMULUS);
		createEReference(arrivalCurveStimulusEClass, ARRIVAL_CURVE_STIMULUS__ENTRIES);

		arrivalCurveEntryEClass = createEClass(ARRIVAL_CURVE_ENTRY);
		createEAttribute(arrivalCurveEntryEClass, ARRIVAL_CURVE_ENTRY__NUMBER_OF_EVENTS);
		createEReference(arrivalCurveEntryEClass, ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER);
		createEReference(arrivalCurveEntryEClass, ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER);

		clockEClass = createEClass(CLOCK);

		clockTriangleFunctionEClass = createEClass(CLOCK_TRIANGLE_FUNCTION);
		createEReference(clockTriangleFunctionEClass, CLOCK_TRIANGLE_FUNCTION__SHIFT);
		createEReference(clockTriangleFunctionEClass, CLOCK_TRIANGLE_FUNCTION__PERIOD);
		createEAttribute(clockTriangleFunctionEClass, CLOCK_TRIANGLE_FUNCTION__MAX);
		createEAttribute(clockTriangleFunctionEClass, CLOCK_TRIANGLE_FUNCTION__MIN);

		clockSinusFunctionEClass = createEClass(CLOCK_SINUS_FUNCTION);
		createEReference(clockSinusFunctionEClass, CLOCK_SINUS_FUNCTION__SHIFT);
		createEReference(clockSinusFunctionEClass, CLOCK_SINUS_FUNCTION__PERIOD);
		createEAttribute(clockSinusFunctionEClass, CLOCK_SINUS_FUNCTION__AMPLITUDE);
		createEAttribute(clockSinusFunctionEClass, CLOCK_SINUS_FUNCTION__YOFFSET);

		clockMultiplierListEClass = createEClass(CLOCK_MULTIPLIER_LIST);
		createEReference(clockMultiplierListEClass, CLOCK_MULTIPLIER_LIST__ENTRIES);

		clockMultiplierListEntryEClass = createEClass(CLOCK_MULTIPLIER_LIST_ENTRY);
		createEAttribute(clockMultiplierListEntryEClass, CLOCK_MULTIPLIER_LIST_ENTRY__MULTIPLIER);
		createEReference(clockMultiplierListEntryEClass, CLOCK_MULTIPLIER_LIST_ENTRY__TIME);

		swModelEClass = createEClass(SW_MODEL);
		createEReference(swModelEClass, SW_MODEL__ISRS);
		createEReference(swModelEClass, SW_MODEL__TASKS);
		createEReference(swModelEClass, SW_MODEL__RUNNABLES);
		createEReference(swModelEClass, SW_MODEL__LABELS);
		createEReference(swModelEClass, SW_MODEL__CHANNELS);
		createEReference(swModelEClass, SW_MODEL__PROCESS_PROTOTYPES);
		createEReference(swModelEClass, SW_MODEL__SECTIONS);
		createEReference(swModelEClass, SW_MODEL__ACTIVATIONS);
		createEReference(swModelEClass, SW_MODEL__EVENTS);
		createEReference(swModelEClass, SW_MODEL__TYPE_DEFINITIONS);
		createEReference(swModelEClass, SW_MODEL__CUSTOM_ENTITIES);
		createEReference(swModelEClass, SW_MODEL__PROCESS_CHAINS);
		createEReference(swModelEClass, SW_MODEL__MODES);
		createEReference(swModelEClass, SW_MODEL__MODE_LABELS);

		abstractMemoryElementEClass = createEClass(ABSTRACT_MEMORY_ELEMENT);
		createEReference(abstractMemoryElementEClass, ABSTRACT_MEMORY_ELEMENT__SIZE);
		createEReference(abstractMemoryElementEClass, ABSTRACT_MEMORY_ELEMENT__MAPPINGS);

		abstractProcessEClass = createEClass(ABSTRACT_PROCESS);

		customEntityEClass = createEClass(CUSTOM_ENTITY);
		createEAttribute(customEntityEClass, CUSTOM_ENTITY__TYPE_NAME);

		processChainEClass = createEClass(PROCESS_CHAIN);
		createEReference(processChainEClass, PROCESS_CHAIN__PROCESSES);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__CALL_GRAPH);
		createEReference(processEClass, PROCESS__STIMULI);

		callGraphEClass = createEClass(CALL_GRAPH);
		createEReference(callGraphEClass, CALL_GRAPH__GRAPH_ENTRIES);

		graphEntryBaseEClass = createEClass(GRAPH_ENTRY_BASE);

		callSequenceEClass = createEClass(CALL_SEQUENCE);
		createEAttribute(callSequenceEClass, CALL_SEQUENCE__NAME);
		createEReference(callSequenceEClass, CALL_SEQUENCE__CALLS);

		modeSwitchEClass = createEClass(MODE_SWITCH);
		createEReference(modeSwitchEClass, MODE_SWITCH__VALUE_PROVIDER);
		createEReference(modeSwitchEClass, MODE_SWITCH__ENTRIES);
		createEReference(modeSwitchEClass, MODE_SWITCH__DEFAULT_ENTRY);

		modeSwitchEntryEClass = createEClass(MODE_SWITCH_ENTRY);
		createEReference(modeSwitchEntryEClass, MODE_SWITCH_ENTRY__VALUES);
		createEReference(modeSwitchEntryEClass, MODE_SWITCH_ENTRY__ITEMS);

		modeSwitchDefaultEClass = createEClass(MODE_SWITCH_DEFAULT);
		createEReference(modeSwitchDefaultEClass, MODE_SWITCH_DEFAULT__ITEMS);

		probabilitySwitchEClass = createEClass(PROBABILITY_SWITCH);
		createEReference(probabilitySwitchEClass, PROBABILITY_SWITCH__ENTRIES);

		probabilitySwitchEntryEClass = createEClass(PROBABILITY_SWITCH_ENTRY);
		createEAttribute(probabilitySwitchEntryEClass, PROBABILITY_SWITCH_ENTRY__PROBABILITY);
		createEReference(probabilitySwitchEntryEClass, PROBABILITY_SWITCH_ENTRY__ITEMS);

		counterEClass = createEClass(COUNTER);
		createEAttribute(counterEClass, COUNTER__PRESCALER);
		createEAttribute(counterEClass, COUNTER__OFFSET);

		callSequenceItemEClass = createEClass(CALL_SEQUENCE_ITEM);
		createEReference(callSequenceItemEClass, CALL_SEQUENCE_ITEM__COUNTER);

		waitEventEClass = createEClass(WAIT_EVENT);
		createEReference(waitEventEClass, WAIT_EVENT__EVENT_MASK);
		createEAttribute(waitEventEClass, WAIT_EVENT__MASK_TYPE);
		createEAttribute(waitEventEClass, WAIT_EVENT__WAITING_BEHAVIOUR);

		setEventEClass = createEClass(SET_EVENT);
		createEReference(setEventEClass, SET_EVENT__EVENT_MASK);
		createEReference(setEventEClass, SET_EVENT__PROCESS);

		clearEventEClass = createEClass(CLEAR_EVENT);
		createEReference(clearEventEClass, CLEAR_EVENT__EVENT_MASK);

		eventMaskEClass = createEClass(EVENT_MASK);
		createEReference(eventMaskEClass, EVENT_MASK__EVENTS);

		osEventEClass = createEClass(OS_EVENT);
		createEAttribute(osEventEClass, OS_EVENT__COMMUNICATION_OVERHEAD_IN_BIT);

		interProcessTriggerEClass = createEClass(INTER_PROCESS_TRIGGER);
		createEReference(interProcessTriggerEClass, INTER_PROCESS_TRIGGER__STIMULUS);
		createEReference(interProcessTriggerEClass, INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT);

		enforcedMigrationEClass = createEClass(ENFORCED_MIGRATION);
		createEReference(enforcedMigrationEClass, ENFORCED_MIGRATION__RESOURCE_OWNER);

		taskRunnableCallEClass = createEClass(TASK_RUNNABLE_CALL);
		createEReference(taskRunnableCallEClass, TASK_RUNNABLE_CALL__RUNNABLE);
		createEReference(taskRunnableCallEClass, TASK_RUNNABLE_CALL__STATISTIC);
		createEReference(taskRunnableCallEClass, TASK_RUNNABLE_CALL__RUNNABLE_LINK_INT);

		schedulePointEClass = createEClass(SCHEDULE_POINT);

		terminateProcessEClass = createEClass(TERMINATE_PROCESS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__PREEMPTION);
		createEAttribute(taskEClass, TASK__MULTIPLE_TASK_ACTIVATION_LIMIT);

		isrEClass = createEClass(ISR);
		createEAttribute(isrEClass, ISR__CATEGORY);

		processPrototypeEClass = createEClass(PROCESS_PROTOTYPE);
		createEAttribute(processPrototypeEClass, PROCESS_PROTOTYPE__PREEMPTION);
		createEReference(processPrototypeEClass, PROCESS_PROTOTYPE__FIRST_RUNNABLE);
		createEReference(processPrototypeEClass, PROCESS_PROTOTYPE__LAST_RUNNABLE);
		createEReference(processPrototypeEClass, PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC);
		createEReference(processPrototypeEClass, PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC);
		createEReference(processPrototypeEClass, PROCESS_PROTOTYPE__CHAINED_PROTOTYPES);
		createEReference(processPrototypeEClass, PROCESS_PROTOTYPE__ACTIVATION);
		createEReference(processPrototypeEClass, PROCESS_PROTOTYPE__RUNNABLE_CALLS);

		chainedProcessPrototypeEClass = createEClass(CHAINED_PROCESS_PROTOTYPE);
		createEReference(chainedProcessPrototypeEClass, CHAINED_PROCESS_PROTOTYPE__PROTOTYPE);
		createEAttribute(chainedProcessPrototypeEClass, CHAINED_PROCESS_PROTOTYPE__APPLY);
		createEAttribute(chainedProcessPrototypeEClass, CHAINED_PROCESS_PROTOTYPE__OFFSET);

		generalPrecedenceEClass = createEClass(GENERAL_PRECEDENCE);
		createEReference(generalPrecedenceEClass, GENERAL_PRECEDENCE__ORIGIN);
		createEReference(generalPrecedenceEClass, GENERAL_PRECEDENCE__TARGET);

		accessPrecedenceSpecEClass = createEClass(ACCESS_PRECEDENCE_SPEC);
		createEReference(accessPrecedenceSpecEClass, ACCESS_PRECEDENCE_SPEC__LABEL);
		createEAttribute(accessPrecedenceSpecEClass, ACCESS_PRECEDENCE_SPEC__ORDER_TYPE);

		orderPrecedenceSpecEClass = createEClass(ORDER_PRECEDENCE_SPEC);
		createEAttribute(orderPrecedenceSpecEClass, ORDER_PRECEDENCE_SPEC__ORDER_TYPE);

		runnableEClass = createEClass(RUNNABLE);
		createEReference(runnableEClass, RUNNABLE__RUNNABLE_ITEMS);
		createEReference(runnableEClass, RUNNABLE__ACTIVATIONS);
		createEReference(runnableEClass, RUNNABLE__DEADLINE);
		createEAttribute(runnableEClass, RUNNABLE__CALLBACK);
		createEAttribute(runnableEClass, RUNNABLE__SERVICE);
		createEAttribute(runnableEClass, RUNNABLE__ASIL_LEVEL);
		createEReference(runnableEClass, RUNNABLE__RUNNABLE_CALLS);
		createEReference(runnableEClass, RUNNABLE__TASK_RUNNABLE_CALLS);
		createEReference(runnableEClass, RUNNABLE__SECTION);
		createEReference(runnableEClass, RUNNABLE__SECTION_LINK_INT);
		createEOperation(runnableEClass, RUNNABLE___GET_FIRST_ACTIVATION);

		labelEClass = createEClass(LABEL);
		createEReference(labelEClass, LABEL__DATA_TYPE);
		createEAttribute(labelEClass, LABEL__CONSTANT);
		createEAttribute(labelEClass, LABEL__BVOLATILE);
		createEAttribute(labelEClass, LABEL__DATA_STABILITY);
		createEReference(labelEClass, LABEL__LABEL_ACCESSES);
		createEReference(labelEClass, LABEL__SECTION);
		createEReference(labelEClass, LABEL__SECTION_LINK_INT);

		channelEClass = createEClass(CHANNEL);
		createEReference(channelEClass, CHANNEL__ELEMENT_TYPE);
		createEAttribute(channelEClass, CHANNEL__DEFAULT_ELEMENTS);
		createEAttribute(channelEClass, CHANNEL__MAX_ELEMENTS);
		createEReference(channelEClass, CHANNEL__CHANNEL_ACCESSES);

		modeLabelEClass = createEClass(MODE_LABEL);
		createEReference(modeLabelEClass, MODE_LABEL__MODE);
		createEReference(modeLabelEClass, MODE_LABEL__INITIAL_VALUE);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__LABELS);
		createEReference(sectionEClass, SECTION__RUNNABLES);
		createEAttribute(sectionEClass, SECTION__ASIL_LEVEL);

		runnableItemEClass = createEClass(RUNNABLE_ITEM);
		createEOperation(runnableItemEClass, RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED);

		computationItemEClass = createEClass(COMPUTATION_ITEM);

		runnableInstructionsEClass = createEClass(RUNNABLE_INSTRUCTIONS);
		createEReference(runnableInstructionsEClass, RUNNABLE_INSTRUCTIONS__DEFAULT);
		createEReference(runnableInstructionsEClass, RUNNABLE_INSTRUCTIONS__EXTENDED);

		runnableInstructionsEntryEClass = createEClass(RUNNABLE_INSTRUCTIONS_ENTRY);
		createEReference(runnableInstructionsEntryEClass, RUNNABLE_INSTRUCTIONS_ENTRY__KEY);
		createEReference(runnableInstructionsEntryEClass, RUNNABLE_INSTRUCTIONS_ENTRY__VALUE);

		modeLabelAccessEClass = createEClass(MODE_LABEL_ACCESS);
		createEReference(modeLabelAccessEClass, MODE_LABEL_ACCESS__DATA);
		createEAttribute(modeLabelAccessEClass, MODE_LABEL_ACCESS__ACCESS);
		createEReference(modeLabelAccessEClass, MODE_LABEL_ACCESS__MODE_VALUE);

		runnableModeSwitchEClass = createEClass(RUNNABLE_MODE_SWITCH);
		createEReference(runnableModeSwitchEClass, RUNNABLE_MODE_SWITCH__VALUE_PROVIDER);
		createEReference(runnableModeSwitchEClass, RUNNABLE_MODE_SWITCH__ENTRIES);
		createEReference(runnableModeSwitchEClass, RUNNABLE_MODE_SWITCH__DEFAULT_ENTRY);

		labelAccessEClass = createEClass(LABEL_ACCESS);
		createEReference(labelAccessEClass, LABEL_ACCESS__DATA);
		createEAttribute(labelAccessEClass, LABEL_ACCESS__ACCESS);
		createEReference(labelAccessEClass, LABEL_ACCESS__STATISTIC);
		createEReference(labelAccessEClass, LABEL_ACCESS__TRANSMISSION_POLICY);
		createEAttribute(labelAccessEClass, LABEL_ACCESS__DATA_STABILITY);
		createEReference(labelAccessEClass, LABEL_ACCESS__DATA_LINK_INT);

		channelAccessEClass = createEClass(CHANNEL_ACCESS);
		createEReference(channelAccessEClass, CHANNEL_ACCESS__DATA);
		createEAttribute(channelAccessEClass, CHANNEL_ACCESS__ELEMENTS);
		createEReference(channelAccessEClass, CHANNEL_ACCESS__TRANSMISSION_POLICY);
		createEReference(channelAccessEClass, CHANNEL_ACCESS__DATA_LINK_INT);

		channelSendEClass = createEClass(CHANNEL_SEND);

		channelReceiveEClass = createEClass(CHANNEL_RECEIVE);
		createEAttribute(channelReceiveEClass, CHANNEL_RECEIVE__RECEIVE_OPERATION);
		createEAttribute(channelReceiveEClass, CHANNEL_RECEIVE__DATA_MUST_BE_NEW);
		createEAttribute(channelReceiveEClass, CHANNEL_RECEIVE__ELEMENT_INDEX);
		createEAttribute(channelReceiveEClass, CHANNEL_RECEIVE__LOWER_BOUND);

		semaphoreAccessEClass = createEClass(SEMAPHORE_ACCESS);
		createEReference(semaphoreAccessEClass, SEMAPHORE_ACCESS__SEMAPHORE);
		createEAttribute(semaphoreAccessEClass, SEMAPHORE_ACCESS__ACCESS);
		createEAttribute(semaphoreAccessEClass, SEMAPHORE_ACCESS__WAITING_BEHAVIOUR);
		createEReference(semaphoreAccessEClass, SEMAPHORE_ACCESS__SEMAPHORE_LINK_INT);

		senderReceiverCommunicationEClass = createEClass(SENDER_RECEIVER_COMMUNICATION);
		createEAttribute(senderReceiverCommunicationEClass, SENDER_RECEIVER_COMMUNICATION__BUFFERED);
		createEReference(senderReceiverCommunicationEClass, SENDER_RECEIVER_COMMUNICATION__LABEL);

		senderReceiverReadEClass = createEClass(SENDER_RECEIVER_READ);

		senderReceiverWriteEClass = createEClass(SENDER_RECEIVER_WRITE);
		createEReference(senderReceiverWriteEClass, SENDER_RECEIVER_WRITE__NOTIFIED_RUNNABLES);

		serverCallEClass = createEClass(SERVER_CALL);
		createEReference(serverCallEClass, SERVER_CALL__SERVER_RUNNABLE);

		synchronousServerCallEClass = createEClass(SYNCHRONOUS_SERVER_CALL);
		createEAttribute(synchronousServerCallEClass, SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR);

		asynchronousServerCallEClass = createEClass(ASYNCHRONOUS_SERVER_CALL);
		createEReference(asynchronousServerCallEClass, ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE);

		getResultServerCallEClass = createEClass(GET_RESULT_SERVER_CALL);
		createEAttribute(getResultServerCallEClass, GET_RESULT_SERVER_CALL__BLOCKING_TYPE);

		runnableProbabilitySwitchEClass = createEClass(RUNNABLE_PROBABILITY_SWITCH);
		createEReference(runnableProbabilitySwitchEClass, RUNNABLE_PROBABILITY_SWITCH__ENTRIES);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__NAME);
		createEAttribute(groupEClass, GROUP__ORDERED);
		createEReference(groupEClass, GROUP__ITEMS);

		runnableCallEClass = createEClass(RUNNABLE_CALL);
		createEReference(runnableCallEClass, RUNNABLE_CALL__RUNNABLE);
		createEReference(runnableCallEClass, RUNNABLE_CALL__STATISTIC);
		createEReference(runnableCallEClass, RUNNABLE_CALL__RUNNABLE_LINK_INT);

		customEventTriggerEClass = createEClass(CUSTOM_EVENT_TRIGGER);
		createEReference(customEventTriggerEClass, CUSTOM_EVENT_TRIGGER__EVENT);
		createEReference(customEventTriggerEClass, CUSTOM_EVENT_TRIGGER__EVENT_LINK_INT);

		dataTypeEClass = createEClass(DATA_TYPE);

		compoundTypeEClass = createEClass(COMPOUND_TYPE);

		structEClass = createEClass(STRUCT);
		createEReference(structEClass, STRUCT__ENTRIES);

		structEntryEClass = createEClass(STRUCT_ENTRY);
		createEAttribute(structEntryEClass, STRUCT_ENTRY__NAME);
		createEReference(structEntryEClass, STRUCT_ENTRY__DATA_TYPE);

		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__NUMBER_ELEMENTS);
		createEReference(arrayEClass, ARRAY__DATA_TYPE);

		pointerEClass = createEClass(POINTER);
		createEReference(pointerEClass, POINTER__DATA_TYPE);

		typeRefEClass = createEClass(TYPE_REF);
		createEReference(typeRefEClass, TYPE_REF__TYPE_DEF);

		dataPlatformMappingEClass = createEClass(DATA_PLATFORM_MAPPING);
		createEAttribute(dataPlatformMappingEClass, DATA_PLATFORM_MAPPING__PLATFORM_NAME);
		createEAttribute(dataPlatformMappingEClass, DATA_PLATFORM_MAPPING__PLATFORM_TYPE);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);

		dataTypeDefinitionEClass = createEClass(DATA_TYPE_DEFINITION);
		createEReference(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__DATA_TYPE);

		baseTypeDefinitionEClass = createEClass(BASE_TYPE_DEFINITION);
		createEReference(baseTypeDefinitionEClass, BASE_TYPE_DEFINITION__SIZE);
		createEReference(baseTypeDefinitionEClass, BASE_TYPE_DEFINITION__DATA_MAPPING);

		activationEClass = createEClass(ACTIVATION);

		periodicActivationEClass = createEClass(PERIODIC_ACTIVATION);
		createEReference(periodicActivationEClass, PERIODIC_ACTIVATION__MIN);
		createEReference(periodicActivationEClass, PERIODIC_ACTIVATION__MAX);
		createEReference(periodicActivationEClass, PERIODIC_ACTIVATION__RECURRENCE);
		createEReference(periodicActivationEClass, PERIODIC_ACTIVATION__OFFSET);

		variableRateActivationEClass = createEClass(VARIABLE_RATE_ACTIVATION);
		createEAttribute(variableRateActivationEClass, VARIABLE_RATE_ACTIVATION__DESCRIPTION);
		createEReference(variableRateActivationEClass, VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION);

		sporadicActivationEClass = createEClass(SPORADIC_ACTIVATION);
		createEAttribute(sporadicActivationEClass, SPORADIC_ACTIVATION__DESCRIPTION);
		createEReference(sporadicActivationEClass, SPORADIC_ACTIVATION__ACTIVATION_DEVIATION);

		singleActivationEClass = createEClass(SINGLE_ACTIVATION);
		createEReference(singleActivationEClass, SINGLE_ACTIVATION__MIN);
		createEReference(singleActivationEClass, SINGLE_ACTIVATION__MAX);

		eventActivationEClass = createEClass(EVENT_ACTIVATION);
		createEReference(eventActivationEClass, EVENT_ACTIVATION__TRIGGERING_EVENTS);
		createEReference(eventActivationEClass, EVENT_ACTIVATION__COUNTER);

		customActivationEClass = createEClass(CUSTOM_ACTIVATION);
		createEAttribute(customActivationEClass, CUSTOM_ACTIVATION__DESCRIPTION);

		labelAccessStatisticEClass = createEClass(LABEL_ACCESS_STATISTIC);
		createEReference(labelAccessStatisticEClass, LABEL_ACCESS_STATISTIC__VALUE);
		createEReference(labelAccessStatisticEClass, LABEL_ACCESS_STATISTIC__CACHE_MISSES);

		instructionFetchEClass = createEClass(INSTRUCTION_FETCH);
		createEReference(instructionFetchEClass, INSTRUCTION_FETCH__COUNT);
		createEReference(instructionFetchEClass, INSTRUCTION_FETCH__MISSES);
		createEReference(instructionFetchEClass, INSTRUCTION_FETCH__CYCLES_PER_FETCH);

		runEntityCallStatisticEClass = createEClass(RUN_ENTITY_CALL_STATISTIC);
		createEReference(runEntityCallStatisticEClass, RUN_ENTITY_CALL_STATISTIC__STATISTIC);

		measurementModelEClass = createEClass(MEASUREMENT_MODEL);
		createEReference(measurementModelEClass, MEASUREMENT_MODEL__MEASUREMENTS);

		measurementEClass = createEClass(MEASUREMENT);
		createEReference(measurementEClass, MEASUREMENT__RUNTIMES);
		createEReference(measurementEClass, MEASUREMENT__RUNTIME_DEVIATION);

		eventChainMeasurementEClass = createEClass(EVENT_CHAIN_MEASUREMENT);
		createEReference(eventChainMeasurementEClass, EVENT_CHAIN_MEASUREMENT__EVENT_CHAIN);

		taskMeasurementEClass = createEClass(TASK_MEASUREMENT);
		createEReference(taskMeasurementEClass, TASK_MEASUREMENT__TASK);

		runnableMeasurementEClass = createEClass(RUNNABLE_MEASUREMENT);
		createEReference(runnableMeasurementEClass, RUNNABLE_MEASUREMENT__RUNNABLE);

		// Create enums
		timeUnitEEnum = createEEnum(TIME_UNIT);
		frequencyUnitEEnum = createEEnum(FREQUENCY_UNIT);
		dataSizeUnitEEnum = createEEnum(DATA_SIZE_UNIT);
		dataRateUnitEEnum = createEEnum(DATA_RATE_UNIT);
		samplingTypeEEnum = createEEnum(SAMPLING_TYPE);
		interfaceKindEEnum = createEEnum(INTERFACE_KIND);
		runnableOrderTypeEEnum = createEEnum(RUNNABLE_ORDER_TYPE);
		synchronizationTypeEEnum = createEEnum(SYNCHRONIZATION_TYPE);
		mappingTypeEEnum = createEEnum(MAPPING_TYPE);
		latencyTypeEEnum = createEEnum(LATENCY_TYPE);
		severityEEnum = createEEnum(SEVERITY);
		limitTypeEEnum = createEEnum(LIMIT_TYPE);
		timeMetricEEnum = createEEnum(TIME_METRIC);
		countMetricEEnum = createEEnum(COUNT_METRIC);
		percentageMetricEEnum = createEEnum(PERCENTAGE_METRIC);
		cpuPercentageMetricEEnum = createEEnum(CPU_PERCENTAGE_METRIC);
		frequencyMetricEEnum = createEEnum(FREQUENCY_METRIC);
		coherencyDirectionEEnum = createEEnum(COHERENCY_DIRECTION);
		processEventTypeEEnum = createEEnum(PROCESS_EVENT_TYPE);
		runnableEventTypeEEnum = createEEnum(RUNNABLE_EVENT_TYPE);
		labelEventTypeEEnum = createEEnum(LABEL_EVENT_TYPE);
		channelEventTypeEEnum = createEEnum(CHANNEL_EVENT_TYPE);
		semaphoreEventTypeEEnum = createEEnum(SEMAPHORE_EVENT_TYPE);
		qTypeEEnum = createEEnum(QTYPE);
		memoryTypeEnumEEnum = createEEnum(MEMORY_TYPE_ENUM);
		busTypeEEnum = createEEnum(BUS_TYPE);
		rwTypeEEnum = createEEnum(RW_TYPE);
		schedTypeEEnum = createEEnum(SCHED_TYPE);
		pinTypeEEnum = createEEnum(PIN_TYPE);
		memoryAddressMappingTypeEEnum = createEEnum(MEMORY_ADDRESS_MAPPING_TYPE);
		osDataConsistencyModeEEnum = createEEnum(OS_DATA_CONSISTENCY_MODE);
		accessMultiplicityEEnum = createEEnum(ACCESS_MULTIPLICITY);
		dataStabilityLevelEEnum = createEEnum(DATA_STABILITY_LEVEL);
		semaphoreTypeEEnum = createEEnum(SEMAPHORE_TYPE);
		conditionEEnum = createEEnum(CONDITION);
		groupingTypeEEnum = createEEnum(GROUPING_TYPE);
		waitEventTypeEEnum = createEEnum(WAIT_EVENT_TYPE);
		waitingBehaviourEEnum = createEEnum(WAITING_BEHAVIOUR);
		isrCategoryEEnum = createEEnum(ISR_CATEGORY);
		accessPrecedenceTypeEEnum = createEEnum(ACCESS_PRECEDENCE_TYPE);
		orderTypeEEnum = createEEnum(ORDER_TYPE);
		labelDataStabilityEEnum = createEEnum(LABEL_DATA_STABILITY);
		receiveOperationEEnum = createEEnum(RECEIVE_OPERATION);
		labelAccessDataStabilityEEnum = createEEnum(LABEL_ACCESS_DATA_STABILITY);
		labelAccessEnumEEnum = createEEnum(LABEL_ACCESS_ENUM);
		semaphoreAccessEnumEEnum = createEEnum(SEMAPHORE_ACCESS_ENUM);
		blockingTypeEEnum = createEEnum(BLOCKING_TYPE);
		preemptionEEnum = createEEnum(PREEMPTION);
		concurrencyTypeEEnum = createEEnum(CONCURRENCY_TYPE);
		asilTypeEEnum = createEEnum(ASIL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter deviationEClass_T = addETypeParameter(deviationEClass, "T");
		addETypeParameter(distributionEClass, "T");
		ETypeParameter weibullDistributionEClass_T = addETypeParameter(weibullDistributionEClass, "T");
		ETypeParameter weibullParametersEClass_T = addETypeParameter(weibullParametersEClass, "T");
		ETypeParameter weibullEstimatorsEClass_T = addETypeParameter(weibullEstimatorsEClass, "T");
		ETypeParameter uniformDistributionEClass_T = addETypeParameter(uniformDistributionEClass, "T");
		ETypeParameter boundariesEClass_T = addETypeParameter(boundariesEClass, "T");
		ETypeParameter gaussDistributionEClass_T = addETypeParameter(gaussDistributionEClass, "T");
		ETypeParameter betaDistributionEClass_T = addETypeParameter(betaDistributionEClass, "T");
		ETypeParameter modeSwitchEntryEClass_T = addETypeParameter(modeSwitchEntryEClass, "T");
		ETypeParameter modeSwitchDefaultEClass_T = addETypeParameter(modeSwitchDefaultEClass, "T");
		ETypeParameter probabilitySwitchEntryEClass_T = addETypeParameter(probabilitySwitchEntryEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		amaltheaEClass.getESuperTypes().add(this.getBaseObject());
		commonElementsEClass.getESuperTypes().add(this.getBaseObject());
		baseObjectEClass.getESuperTypes().add(this.getIAnnotatable());
		referableObjectEClass.getESuperTypes().add(this.getIReferable());
		referableBaseObjectEClass.getESuperTypes().add(this.getIAnnotatable());
		referableBaseObjectEClass.getESuperTypes().add(this.getIReferable());
		tagEClass.getESuperTypes().add(this.getReferableBaseObject());
		classifierEClass.getESuperTypes().add(this.getReferableBaseObject());
		coreClassifierEClass.getESuperTypes().add(this.getClassifier());
		memoryClassifierEClass.getESuperTypes().add(this.getClassifier());
		instructionsDeviationEClass.getESuperTypes().add(this.getInstructions());
		instructionsConstantEClass.getESuperTypes().add(this.getInstructions());
		abstractTimeEClass.getESuperTypes().add(this.getTimeComparable());
		timeEClass.getESuperTypes().add(this.getAbstractTime());
		listObjectEClass.getESuperTypes().add(this.getValue());
		stringObjectEClass.getESuperTypes().add(this.getValue());
		bigIntegerObjectEClass.getESuperTypes().add(this.getValue());
		referenceObjectEClass.getESuperTypes().add(this.getValue());
		integerObjectEClass.getESuperTypes().add(this.getValue());
		longObjectEClass.getESuperTypes().add(this.getValue());
		floatObjectEClass.getESuperTypes().add(this.getValue());
		doubleObjectEClass.getESuperTypes().add(this.getValue());
		booleanObjectEClass.getESuperTypes().add(this.getValue());
		timeObjectEClass.getESuperTypes().add(this.getAbstractTime());
		timeObjectEClass.getESuperTypes().add(this.getValue());
		EGenericType g1 = createEGenericType(this.getDistribution());
		EGenericType g2 = createEGenericType(weibullDistributionEClass_T);
		g1.getETypeArguments().add(g2);
		weibullDistributionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getWeibullDistribution());
		g2 = createEGenericType(weibullParametersEClass_T);
		g1.getETypeArguments().add(g2);
		weibullParametersEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getWeibullDistribution());
		g2 = createEGenericType(weibullEstimatorsEClass_T);
		g1.getETypeArguments().add(g2);
		weibullEstimatorsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDistribution());
		g2 = createEGenericType(uniformDistributionEClass_T);
		g1.getETypeArguments().add(g2);
		uniformDistributionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDistribution());
		g2 = createEGenericType(boundariesEClass_T);
		g1.getETypeArguments().add(g2);
		boundariesEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDistribution());
		g2 = createEGenericType(gaussDistributionEClass_T);
		g1.getETypeArguments().add(g2);
		gaussDistributionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDistribution());
		g2 = createEGenericType(betaDistributionEClass_T);
		g1.getETypeArguments().add(g2);
		betaDistributionEClass.getEGenericSuperTypes().add(g1);
		minAvgMaxStatisticEClass.getESuperTypes().add(this.getNumericStatistic());
		singleValueStatisticEClass.getESuperTypes().add(this.getNumericStatistic());
		modeEClass.getESuperTypes().add(this.getReferableBaseObject());
		modeLiteralEClass.getESuperTypes().add(this.getReferableBaseObject());
		componentsModelEClass.getESuperTypes().add(this.getBaseObject());
		portEClass.getESuperTypes().add(this.getReferableBaseObject());
		portEClass.getESuperTypes().add(this.getITaggable());
		componentEClass.getESuperTypes().add(this.getReferableBaseObject());
		componentEClass.getESuperTypes().add(this.getITaggable());
		compositeEClass.getESuperTypes().add(this.getComponent());
		compositeEClass.getESuperTypes().add(this.getISystem());
		systemEClass.getESuperTypes().add(this.getReferableBaseObject());
		systemEClass.getESuperTypes().add(this.getITaggable());
		systemEClass.getESuperTypes().add(this.getISystem());
		componentInstanceEClass.getESuperTypes().add(this.getReferableBaseObject());
		componentInstanceEClass.getESuperTypes().add(this.getITaggable());
		connectorEClass.getESuperTypes().add(this.getBaseObject());
		connectorEClass.getESuperTypes().add(this.getINamedElement());
		connectorEClass.getESuperTypes().add(this.getITaggable());
		qualifiedPortEClass.getESuperTypes().add(this.getBaseObject());
		fInterfacePortEClass.getESuperTypes().add(this.getPort());
		configModelEClass.getESuperTypes().add(this.getBaseObject());
		eventConfigEClass.getESuperTypes().add(this.getBaseObject());
		constraintsModelEClass.getESuperTypes().add(this.getBaseObject());
		runnableSequencingConstraintEClass.getESuperTypes().add(this.getReferableBaseObject());
		affinityConstraintEClass.getESuperTypes().add(this.getReferableBaseObject());
		separationConstraintEClass.getESuperTypes().add(this.getAffinityConstraint());
		pairingConstraintEClass.getESuperTypes().add(this.getAffinityConstraint());
		runnableSeparationConstraintEClass.getESuperTypes().add(this.getSeparationConstraint());
		runnableSeparationConstraintEClass.getESuperTypes().add(this.getRunnableConstraint());
		runnableSeparationConstraintEClass.getESuperTypes().add(this.getBaseObject());
		processSeparationConstraintEClass.getESuperTypes().add(this.getSeparationConstraint());
		processSeparationConstraintEClass.getESuperTypes().add(this.getProcessConstraint());
		processSeparationConstraintEClass.getESuperTypes().add(this.getBaseObject());
		dataSeparationConstraintEClass.getESuperTypes().add(this.getSeparationConstraint());
		dataSeparationConstraintEClass.getESuperTypes().add(this.getDataConstraint());
		dataSeparationConstraintEClass.getESuperTypes().add(this.getBaseObject());
		runnablePairingConstraintEClass.getESuperTypes().add(this.getPairingConstraint());
		runnablePairingConstraintEClass.getESuperTypes().add(this.getRunnableConstraint());
		runnablePairingConstraintEClass.getESuperTypes().add(this.getBaseObject());
		processPairingConstraintEClass.getESuperTypes().add(this.getPairingConstraint());
		processPairingConstraintEClass.getESuperTypes().add(this.getProcessConstraint());
		processPairingConstraintEClass.getESuperTypes().add(this.getBaseObject());
		dataPairingConstraintEClass.getESuperTypes().add(this.getPairingConstraint());
		dataPairingConstraintEClass.getESuperTypes().add(this.getDataConstraint());
		dataPairingConstraintEClass.getESuperTypes().add(this.getBaseObject());
		targetMemoryEClass.getESuperTypes().add(this.getDataConstraintTarget());
		targetMemoryEClass.getESuperTypes().add(this.getBaseObject());
		targetCoreEClass.getESuperTypes().add(this.getRunnableConstraintTarget());
		targetCoreEClass.getESuperTypes().add(this.getProcessConstraintTarget());
		targetCoreEClass.getESuperTypes().add(this.getBaseObject());
		targetSchedulerEClass.getESuperTypes().add(this.getRunnableConstraintTarget());
		targetSchedulerEClass.getESuperTypes().add(this.getProcessConstraintTarget());
		targetSchedulerEClass.getESuperTypes().add(this.getBaseObject());
		labelEntityGroupEClass.getESuperTypes().add(this.getLabelGroup());
		labelEntityGroupEClass.getESuperTypes().add(this.getBaseObject());
		runnableEntityGroupEClass.getESuperTypes().add(this.getRunnableGroup());
		runnableEntityGroupEClass.getESuperTypes().add(this.getBaseObject());
		processEntityGroupEClass.getESuperTypes().add(this.getProcessGroup());
		processEntityGroupEClass.getESuperTypes().add(this.getBaseObject());
		tagGroupEClass.getESuperTypes().add(this.getRunnableGroup());
		tagGroupEClass.getESuperTypes().add(this.getProcessGroup());
		tagGroupEClass.getESuperTypes().add(this.getBaseObject());
		abstractEventChainEClass.getESuperTypes().add(this.getBaseObject());
		eventChainEClass.getESuperTypes().add(this.getAbstractEventChain());
		eventChainEClass.getESuperTypes().add(this.getIReferable());
		subEventChainEClass.getESuperTypes().add(this.getAbstractEventChain());
		subEventChainEClass.getESuperTypes().add(this.getINamedElement());
		eventChainItemEClass.getESuperTypes().add(this.getBaseObject());
		eventChainReferenceEClass.getESuperTypes().add(this.getEventChainItem());
		eventChainContainerEClass.getESuperTypes().add(this.getEventChainItem());
		timingConstraintEClass.getESuperTypes().add(this.getReferableBaseObject());
		physicalSectionConstraintEClass.getESuperTypes().add(this.getReferableBaseObject());
		synchronizationConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		eventSynchronizationConstraintEClass.getESuperTypes().add(this.getSynchronizationConstraint());
		eventChainSynchronizationConstraintEClass.getESuperTypes().add(this.getSynchronizationConstraint());
		delayConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		eventChainLatencyConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		repetitionConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		dataAgeConstraintEClass.getESuperTypes().add(this.getReferableBaseObject());
		dataAgeCycleEClass.getESuperTypes().add(this.getDataAge());
		dataAgeTimeEClass.getESuperTypes().add(this.getDataAge());
		requirementEClass.getESuperTypes().add(this.getBaseObject());
		processRequirementEClass.getESuperTypes().add(this.getRequirement());
		runnableRequirementEClass.getESuperTypes().add(this.getRequirement());
		architectureRequirementEClass.getESuperTypes().add(this.getRequirement());
		processChainRequirementEClass.getESuperTypes().add(this.getRequirement());
		cpuPercentageRequirementLimitEClass.getESuperTypes().add(this.getRequirementLimit());
		frequencyRequirementLimitEClass.getESuperTypes().add(this.getRequirementLimit());
		percentageRequirementLimitEClass.getESuperTypes().add(this.getRequirementLimit());
		countRequirementLimitEClass.getESuperTypes().add(this.getRequirementLimit());
		timeRequirementLimitEClass.getESuperTypes().add(this.getRequirementLimit());
		dataCoherencyGroupEClass.getESuperTypes().add(this.getReferableBaseObject());
		dataStabilityGroupEClass.getESuperTypes().add(this.getReferableBaseObject());
		processScopeEClass.getESuperTypes().add(this.getDataGroupScope());
		runnableScopeEClass.getESuperTypes().add(this.getDataGroupScope());
		componentScopeEClass.getESuperTypes().add(this.getDataGroupScope());
		eventModelEClass.getESuperTypes().add(this.getBaseObject());
		eventEClass.getESuperTypes().add(this.getReferableBaseObject());
		eventEClass.getESuperTypes().add(this.getITaggable());
		eventSetEClass.getESuperTypes().add(this.getEvent());
		entityEventEClass.getESuperTypes().add(this.getEvent());
		triggerEventEClass.getESuperTypes().add(this.getEntityEvent());
		customEventEClass.getESuperTypes().add(this.getTriggerEvent());
		stimulusEventEClass.getESuperTypes().add(this.getEntityEvent());
		processEventEClass.getESuperTypes().add(this.getEntityEvent());
		processChainEventEClass.getESuperTypes().add(this.getEntityEvent());
		runnableEventEClass.getESuperTypes().add(this.getTriggerEvent());
		labelEventEClass.getESuperTypes().add(this.getTriggerEvent());
		channelEventEClass.getESuperTypes().add(this.getTriggerEvent());
		semaphoreEventEClass.getESuperTypes().add(this.getEntityEvent());
		hwModelEClass.getESuperTypes().add(this.getBaseObject());
		complexNodeEClass.getESuperTypes().add(this.getReferableBaseObject());
		complexNodeEClass.getESuperTypes().add(this.getITaggable());
		hwSystemEClass.getESuperTypes().add(this.getComplexNode());
		ecuEClass.getESuperTypes().add(this.getComplexNode());
		microcontrollerEClass.getESuperTypes().add(this.getComplexNode());
		coreEClass.getESuperTypes().add(this.getComplexNode());
		memoryEClass.getESuperTypes().add(this.getComplexNode());
		networkEClass.getESuperTypes().add(this.getComplexNode());
		quartzEClass.getESuperTypes().add(this.getReferableBaseObject());
		quartzEClass.getESuperTypes().add(this.getITaggable());
		hwComponentEClass.getESuperTypes().add(this.getComplexNode());
		hardwareTypeDescriptionEClass.getESuperTypes().add(this.getReferableBaseObject());
		hardwareTypeDescriptionEClass.getESuperTypes().add(this.getITaggable());
		abstractionTypeEClass.getESuperTypes().add(this.getHardwareTypeDescription());
		systemTypeEClass.getESuperTypes().add(this.getAbstractionType());
		ecuTypeEClass.getESuperTypes().add(this.getAbstractionType());
		microcontrollerTypeEClass.getESuperTypes().add(this.getAbstractionType());
		coreTypeEClass.getESuperTypes().add(this.getAbstractionType());
		memoryTypeEClass.getESuperTypes().add(this.getHardwareTypeDescription());
		networkTypeEClass.getESuperTypes().add(this.getHardwareTypeDescription());
		hwPortEClass.getESuperTypes().add(this.getReferableBaseObject());
		pinEClass.getESuperTypes().add(this.getReferableBaseObject());
		complexPortEClass.getESuperTypes().add(this.getHwPort());
		complexPinEClass.getESuperTypes().add(this.getPin());
		crossbarSwitchEClass.getESuperTypes().add(this.getNetworkType());
		busEClass.getESuperTypes().add(this.getNetworkType());
		bridgeEClass.getESuperTypes().add(this.getNetworkType());
		accessPathEClass.getESuperTypes().add(this.getIReferable());
		latencyAccessPathEClass.getESuperTypes().add(this.getAccessPath());
		hwAccessPathEClass.getESuperTypes().add(this.getAccessPath());
		accessPathRefEClass.getESuperTypes().add(this.getLatencyAccessPathElement());
		latencyEClass.getESuperTypes().add(this.getLatencyAccessPathElement());
		latencyConstantEClass.getESuperTypes().add(this.getLatency());
		latencyDeviationEClass.getESuperTypes().add(this.getLatency());
		hwAccessPathRefEClass.getESuperTypes().add(this.getHwAccessPathElement());
		hwElementRefEClass.getESuperTypes().add(this.getHwAccessPathElement());
		mappingModelEClass.getESuperTypes().add(this.getBaseObject());
		schedulerAllocationEClass.getESuperTypes().add(this.getBaseObject());
		taskAllocationEClass.getESuperTypes().add(this.getBaseObject());
		isrAllocationEClass.getESuperTypes().add(this.getBaseObject());
		runnableAllocationEClass.getESuperTypes().add(this.getBaseObject());
		memoryMappingEClass.getESuperTypes().add(this.getBaseObject());
		physicalSectionMappingEClass.getESuperTypes().add(this.getReferableBaseObject());
		osModelEClass.getESuperTypes().add(this.getBaseObject());
		osDataConsistencyEClass.getESuperTypes().add(this.getBaseObject());
		semaphoreEClass.getESuperTypes().add(this.getReferableBaseObject());
		schedulerEClass.getESuperTypes().add(this.getReferableBaseObject());
		taskSchedulerEClass.getESuperTypes().add(this.getScheduler());
		interruptControllerEClass.getESuperTypes().add(this.getScheduler());
		algorithmEClass.getESuperTypes().add(this.getBaseObject());
		interruptSchedulingAlgorithmEClass.getESuperTypes().add(this.getAlgorithm());
		taskSchedulingAlgorithmEClass.getESuperTypes().add(this.getAlgorithm());
		fixedPriorityEClass.getESuperTypes().add(this.getTaskSchedulingAlgorithm());
		fixedPriorityPreemptiveEClass.getESuperTypes().add(this.getFixedPriority());
		fixedPriorityPreemptiveWithBudgetEnforcementEClass.getESuperTypes().add(this.getFixedPriority());
		osekEClass.getESuperTypes().add(this.getFixedPriority());
		deadlineMonotonicEClass.getESuperTypes().add(this.getFixedPriority());
		rateMonotonicEClass.getESuperTypes().add(this.getFixedPriority());
		pfairEClass.getESuperTypes().add(this.getTaskSchedulingAlgorithm());
		pfairPD2EClass.getESuperTypes().add(this.getPfair());
		partlyPFairPD2EClass.getESuperTypes().add(this.getPfair());
		earlyReleaseFairPD2EClass.getESuperTypes().add(this.getPfair());
		partlyEarlyReleaseFairPD2EClass.getESuperTypes().add(this.getPfair());
		dynamicPriorityEClass.getESuperTypes().add(this.getTaskSchedulingAlgorithm());
		leastLocalRemainingExecutionTimeFirstEClass.getESuperTypes().add(this.getDynamicPriority());
		earliestDeadlineFirstEClass.getESuperTypes().add(this.getDynamicPriority());
		priorityBasedRoundRobinEClass.getESuperTypes().add(this.getDynamicPriority());
		reservationBasedServerEClass.getESuperTypes().add(this.getTaskSchedulingAlgorithm());
		deferrableServerEClass.getESuperTypes().add(this.getReservationBasedServer());
		pollingPeriodicServerEClass.getESuperTypes().add(this.getReservationBasedServer());
		sporadicServerEClass.getESuperTypes().add(this.getReservationBasedServer());
		constantBandwidthServerEClass.getESuperTypes().add(this.getReservationBasedServer());
		constantBandwidthServerWithCASHEClass.getESuperTypes().add(this.getReservationBasedServer());
		groupingEClass.getESuperTypes().add(this.getTaskSchedulingAlgorithm());
		userSpecificSchedulingAlgorithmEClass.getESuperTypes().add(this.getTaskSchedulingAlgorithm());
		userSpecificSchedulingAlgorithmEClass.getESuperTypes().add(this.getInterruptSchedulingAlgorithm());
		priorityBasedEClass.getESuperTypes().add(this.getInterruptSchedulingAlgorithm());
		operatingSystemEClass.getESuperTypes().add(this.getBaseObject());
		vendorOperatingSystemEClass.getESuperTypes().add(this.getOperatingSystem());
		osInstructionsEClass.getESuperTypes().add(this.getReferableBaseObject());
		osAPIInstructionsEClass.getESuperTypes().add(this.getBaseObject());
		osISRInstructionsEClass.getESuperTypes().add(this.getBaseObject());
		propertyConstraintsModelEClass.getESuperTypes().add(this.getBaseObject());
		coreAllocationConstraintEClass.getESuperTypes().add(this.getBaseObject());
		memoryMappingConstraintEClass.getESuperTypes().add(this.getBaseObject());
		processAllocationConstraintEClass.getESuperTypes().add(this.getCoreAllocationConstraint());
		processPrototypeAllocationConstraintEClass.getESuperTypes().add(this.getCoreAllocationConstraint());
		runnableAllocationConstraintEClass.getESuperTypes().add(this.getCoreAllocationConstraint());
		abstractElementMappingConstraintEClass.getESuperTypes().add(this.getMemoryMappingConstraint());
		classificationEClass.getESuperTypes().add(this.getBaseObject());
		coreClassificationEClass.getESuperTypes().add(this.getClassification());
		memoryClassificationEClass.getESuperTypes().add(this.getClassification());
		stimuliModelEClass.getESuperTypes().add(this.getBaseObject());
		stimulusEClass.getESuperTypes().add(this.getReferableBaseObject());
		stimulusEClass.getESuperTypes().add(this.getITaggable());
		modeValueListEClass.getESuperTypes().add(this.getBaseObject());
		modeValueListEntryEClass.getESuperTypes().add(this.getBaseObject());
		modeValueEClass.getESuperTypes().add(this.getModeValueListEntry());
		modeValueConjunctionEClass.getESuperTypes().add(this.getModeValueListEntry());
		modeValueDisjunctionEClass.getESuperTypes().add(this.getBaseObject());
		periodicStimulusEClass.getESuperTypes().add(this.getStimulus());
		variableRateStimulusEClass.getESuperTypes().add(this.getStimulus());
		syntheticStimulusEClass.getESuperTypes().add(this.getStimulus());
		timestampListEClass.getESuperTypes().add(this.getBaseObject());
		customStimulusEClass.getESuperTypes().add(this.getStimulus());
		singleStimulusEClass.getESuperTypes().add(this.getStimulus());
		interProcessStimulusEClass.getESuperTypes().add(this.getStimulus());
		sporadicStimulusEClass.getESuperTypes().add(this.getStimulus());
		eventStimulusEClass.getESuperTypes().add(this.getStimulus());
		arrivalCurveStimulusEClass.getESuperTypes().add(this.getStimulus());
		arrivalCurveEntryEClass.getESuperTypes().add(this.getBaseObject());
		clockEClass.getESuperTypes().add(this.getReferableBaseObject());
		clockTriangleFunctionEClass.getESuperTypes().add(this.getClock());
		clockSinusFunctionEClass.getESuperTypes().add(this.getClock());
		clockMultiplierListEClass.getESuperTypes().add(this.getClock());
		clockMultiplierListEntryEClass.getESuperTypes().add(this.getBaseObject());
		swModelEClass.getESuperTypes().add(this.getBaseObject());
		abstractMemoryElementEClass.getESuperTypes().add(this.getReferableBaseObject());
		abstractMemoryElementEClass.getESuperTypes().add(this.getITaggable());
		abstractProcessEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		customEntityEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		processChainEClass.getESuperTypes().add(this.getReferableBaseObject());
		processEClass.getESuperTypes().add(this.getAbstractProcess());
		callGraphEClass.getESuperTypes().add(this.getBaseObject());
		graphEntryBaseEClass.getESuperTypes().add(this.getBaseObject());
		callSequenceEClass.getESuperTypes().add(this.getGraphEntryBase());
		modeSwitchEClass.getESuperTypes().add(this.getGraphEntryBase());
		modeSwitchEntryEClass.getESuperTypes().add(this.getBaseObject());
		modeSwitchDefaultEClass.getESuperTypes().add(this.getBaseObject());
		probabilitySwitchEClass.getESuperTypes().add(this.getGraphEntryBase());
		probabilitySwitchEntryEClass.getESuperTypes().add(this.getBaseObject());
		counterEClass.getESuperTypes().add(this.getBaseObject());
		callSequenceItemEClass.getESuperTypes().add(this.getBaseObject());
		waitEventEClass.getESuperTypes().add(this.getCallSequenceItem());
		setEventEClass.getESuperTypes().add(this.getCallSequenceItem());
		clearEventEClass.getESuperTypes().add(this.getCallSequenceItem());
		eventMaskEClass.getESuperTypes().add(this.getBaseObject());
		osEventEClass.getESuperTypes().add(this.getReferableBaseObject());
		osEventEClass.getESuperTypes().add(this.getITaggable());
		interProcessTriggerEClass.getESuperTypes().add(this.getCallSequenceItem());
		enforcedMigrationEClass.getESuperTypes().add(this.getCallSequenceItem());
		taskRunnableCallEClass.getESuperTypes().add(this.getCallSequenceItem());
		schedulePointEClass.getESuperTypes().add(this.getCallSequenceItem());
		terminateProcessEClass.getESuperTypes().add(this.getCallSequenceItem());
		taskEClass.getESuperTypes().add(this.getProcess());
		isrEClass.getESuperTypes().add(this.getProcess());
		processPrototypeEClass.getESuperTypes().add(this.getAbstractProcess());
		chainedProcessPrototypeEClass.getESuperTypes().add(this.getBaseObject());
		generalPrecedenceEClass.getESuperTypes().add(this.getBaseObject());
		accessPrecedenceSpecEClass.getESuperTypes().add(this.getGeneralPrecedence());
		orderPrecedenceSpecEClass.getESuperTypes().add(this.getGeneralPrecedence());
		runnableEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		labelEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		labelEClass.getESuperTypes().add(this.getIDisplayName());
		channelEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		channelEClass.getESuperTypes().add(this.getIDisplayName());
		modeLabelEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		modeLabelEClass.getESuperTypes().add(this.getIDisplayName());
		sectionEClass.getESuperTypes().add(this.getReferableBaseObject());
		runnableItemEClass.getESuperTypes().add(this.getBaseObject());
		computationItemEClass.getESuperTypes().add(this.getRunnableItem());
		runnableInstructionsEClass.getESuperTypes().add(this.getComputationItem());
		modeLabelAccessEClass.getESuperTypes().add(this.getRunnableItem());
		runnableModeSwitchEClass.getESuperTypes().add(this.getRunnableItem());
		labelAccessEClass.getESuperTypes().add(this.getComputationItem());
		channelAccessEClass.getESuperTypes().add(this.getRunnableItem());
		channelSendEClass.getESuperTypes().add(this.getChannelAccess());
		channelReceiveEClass.getESuperTypes().add(this.getChannelAccess());
		semaphoreAccessEClass.getESuperTypes().add(this.getRunnableItem());
		senderReceiverCommunicationEClass.getESuperTypes().add(this.getRunnableItem());
		senderReceiverReadEClass.getESuperTypes().add(this.getSenderReceiverCommunication());
		senderReceiverWriteEClass.getESuperTypes().add(this.getSenderReceiverCommunication());
		serverCallEClass.getESuperTypes().add(this.getRunnableItem());
		synchronousServerCallEClass.getESuperTypes().add(this.getServerCall());
		asynchronousServerCallEClass.getESuperTypes().add(this.getServerCall());
		getResultServerCallEClass.getESuperTypes().add(this.getServerCall());
		runnableProbabilitySwitchEClass.getESuperTypes().add(this.getRunnableItem());
		groupEClass.getESuperTypes().add(this.getRunnableItem());
		runnableCallEClass.getESuperTypes().add(this.getRunnableItem());
		customEventTriggerEClass.getESuperTypes().add(this.getRunnableItem());
		compoundTypeEClass.getESuperTypes().add(this.getDataType());
		structEClass.getESuperTypes().add(this.getCompoundType());
		structEClass.getESuperTypes().add(this.getBaseObject());
		structEntryEClass.getESuperTypes().add(this.getBaseObject());
		arrayEClass.getESuperTypes().add(this.getCompoundType());
		arrayEClass.getESuperTypes().add(this.getBaseObject());
		pointerEClass.getESuperTypes().add(this.getCompoundType());
		pointerEClass.getESuperTypes().add(this.getBaseObject());
		typeRefEClass.getESuperTypes().add(this.getDataType());
		typeRefEClass.getESuperTypes().add(this.getBaseObject());
		dataPlatformMappingEClass.getESuperTypes().add(this.getBaseObject());
		typeDefinitionEClass.getESuperTypes().add(this.getReferableBaseObject());
		dataTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		baseTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		activationEClass.getESuperTypes().add(this.getReferableBaseObject());
		activationEClass.getESuperTypes().add(this.getITaggable());
		periodicActivationEClass.getESuperTypes().add(this.getActivation());
		variableRateActivationEClass.getESuperTypes().add(this.getActivation());
		sporadicActivationEClass.getESuperTypes().add(this.getActivation());
		singleActivationEClass.getESuperTypes().add(this.getActivation());
		eventActivationEClass.getESuperTypes().add(this.getActivation());
		customActivationEClass.getESuperTypes().add(this.getActivation());
		labelAccessStatisticEClass.getESuperTypes().add(this.getBaseObject());
		instructionFetchEClass.getESuperTypes().add(this.getBaseObject());
		runEntityCallStatisticEClass.getESuperTypes().add(this.getBaseObject());
		measurementModelEClass.getESuperTypes().add(this.getBaseObject());
		measurementEClass.getESuperTypes().add(this.getBaseObject());
		eventChainMeasurementEClass.getESuperTypes().add(this.getMeasurement());
		taskMeasurementEClass.getESuperTypes().add(this.getMeasurement());
		runnableMeasurementEClass.getESuperTypes().add(this.getMeasurement());

		// Initialize classes, features, and operations; add parameters
		initEClass(amaltheaEClass, Amalthea.class, "Amalthea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmalthea_Version(), theEcorePackage.getEString(), "version", null, 0, 1, Amalthea.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_CommonElements(), this.getCommonElements(), null, "commonElements", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_SwModel(), this.getSWModel(), null, "swModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_HwModel(), this.getHWModel(), null, "hwModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_OsModel(), this.getOSModel(), null, "osModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_StimuliModel(), this.getStimuliModel(), null, "stimuliModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_EventModel(), this.getEventModel(), null, "eventModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_ConstraintsModel(), this.getConstraintsModel(), null, "constraintsModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_PropertyConstraintsModel(), this.getPropertyConstraintsModel(), null, "propertyConstraintsModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_MappingModel(), this.getMappingModel(), null, "mappingModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_ComponentsModel(), this.getComponentsModel(), null, "componentsModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_ConfigModel(), this.getConfigModel(), null, "configModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmalthea_MeasurementModel(), this.getMeasurementModel(), null, "measurementModel", null, 0, 1, Amalthea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonElementsEClass, CommonElements.class, "CommonElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonElements_Tags(), this.getTag(), null, "tags", null, 0, -1, CommonElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonElements_CoreClassifiers(), this.getCoreClassifier(), null, "coreClassifiers", null, 0, -1, CommonElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonElements_MemoryClassifiers(), this.getMemoryClassifier(), null, "memoryClassifiers", null, 0, -1, CommonElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseObjectEClass, BaseObject.class, "BaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referableObjectEClass, ReferableObject.class, "ReferableObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referableBaseObjectEClass, ReferableBaseObject.class, "ReferableBaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iAnnotatableEClass, IAnnotatable.class, "IAnnotatable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIAnnotatable_CustomProperties(), this.getCustomProperty(), null, "customProperties", null, 0, -1, IAnnotatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTaggableEClass, ITaggable.class, "ITaggable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getITaggable_Tags(), this.getTag(), null, "tags", null, 0, -1, ITaggable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iReferableEClass, IReferable.class, "IReferable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIReferable_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IReferable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIReferable_UniqueName(), theEcorePackage.getEString(), "uniqueName", null, 0, 1, IReferable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getIReferable__ComputeUniqueName(), theEcorePackage.getEString(), "computeUniqueName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getIReferable__Encode__String(), theEcorePackage.getEString(), "encode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "str", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(iDisplayNameEClass, IDisplayName.class, "IDisplayName", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDisplayName_DisplayName(), theEcorePackage.getEString(), "displayName", null, 0, 1, IDisplayName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_TagType(), theEcorePackage.getEString(), "tagType", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifier_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreClassifierEClass, CoreClassifier.class, "CoreClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryClassifierEClass, MemoryClassifier.class, "MemoryClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instructionsEClass, Instructions.class, "Instructions", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructions_FetchStatistic(), this.getInstructionFetch(), null, "fetchStatistic", null, 0, 1, Instructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInstructions__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(transmissionPolicyEClass, TransmissionPolicy.class, "TransmissionPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransmissionPolicy_ChunkSize(), this.getDataSize(), null, "chunkSize", null, 0, 1, TransmissionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionPolicy_ChunkProcessingInstructions(), theEcorePackage.getEInt(), "chunkProcessingInstructions", "0", 0, 1, TransmissionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionPolicy_TransmitRatio(), theEcorePackage.getEDouble(), "transmitRatio", "1.0", 0, 1, TransmissionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionsDeviationEClass, InstructionsDeviation.class, "InstructionsDeviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getDeviation());
		g2 = createEGenericType(this.getLongObject());
		g1.getETypeArguments().add(g2);
		initEReference(getInstructionsDeviation_Deviation(), g1, null, "deviation", null, 0, 1, InstructionsDeviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionsConstantEClass, InstructionsConstant.class, "InstructionsConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionsConstant_Value(), theEcorePackage.getELong(), "value", "0", 0, 1, InstructionsConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeComparableEClass, Comparable.class, "TimeComparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Comparable<org.eclipse.app4mc.amalthea.model.AbstractTime>");

		initEClass(abstractTimeEClass, AbstractTime.class, "AbstractTime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTime_Value(), theEcorePackage.getEBigInteger(), "value", "0", 0, 1, AbstractTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTime_Unit(), this.getTimeUnit(), "unit", null, 0, 1, AbstractTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractTime__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractTime__CompareTo__AbstractTime(), theEcorePackage.getEInt(), "compareTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "time", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTime__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(frequencyEClass, Frequency.class, "Frequency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequency_Unit(), this.getFrequencyUnit(), "unit", null, 0, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequency_Value(), theEcorePackage.getEDouble(), "value", "0.0", 0, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFrequency__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getFrequency__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dataSizeEClass, DataSize.class, "DataSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSize_Value(), theEcorePackage.getEBigInteger(), "value", "0", 0, 1, DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSize_Unit(), this.getDataSizeUnit(), "unit", null, 0, 1, DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataSize__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSize__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSize__GetNumberBits(), theEcorePackage.getELong(), "getNumberBits", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSize__GetNumberBytes(), theEcorePackage.getELong(), "getNumberBytes", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dataRateEClass, DataRate.class, "DataRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataRate_Value(), theEcorePackage.getEBigInteger(), "value", "0", 0, 1, DataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataRate_Unit(), this.getDataRateUnit(), "unit", null, 0, 1, DataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataRate__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(customPropertyEClass, Map.Entry.class, "CustomProperty", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomProperty_Key(), theEcorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomProperty_Value(), this.getValue(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValue__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(listObjectEClass, ListObject.class, "ListObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListObject_Values(), this.getValue(), null, "values", null, 0, -1, ListObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getListObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(stringObjectEClass, StringObject.class, "StringObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringObject_Value(), theEcorePackage.getEString(), "value", null, 1, 1, StringObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStringObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(bigIntegerObjectEClass, BigIntegerObject.class, "BigIntegerObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBigIntegerObject_Value(), theEcorePackage.getEBigInteger(), "value", "0", 1, 1, BigIntegerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBigIntegerObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(referenceObjectEClass, ReferenceObject.class, "ReferenceObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceObject_Value(), this.getIReferable(), null, "value", null, 0, 1, ReferenceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReferenceObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(integerObjectEClass, IntegerObject.class, "IntegerObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerObject_Value(), theEcorePackage.getEInt(), "value", "0", 1, 1, IntegerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIntegerObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(longObjectEClass, LongObject.class, "LongObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongObject_Value(), theEcorePackage.getELong(), "value", "0", 1, 1, LongObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLongObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(floatObjectEClass, FloatObject.class, "FloatObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatObject_Value(), theEcorePackage.getEFloat(), "value", "0f", 1, 1, FloatObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFloatObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(doubleObjectEClass, DoubleObject.class, "DoubleObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleObject_Value(), theEcorePackage.getEDouble(), "value", "0.0", 1, 1, DoubleObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDoubleObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(booleanObjectEClass, BooleanObject.class, "BooleanObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanObject_Value(), theEcorePackage.getEBoolean(), "value", "false", 1, 1, BooleanObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBooleanObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(timeObjectEClass, TimeObject.class, "TimeObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTimeObject__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(deviationEClass, Deviation.class, "Deviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(deviationEClass_T);
		initEReference(getDeviation_LowerBound(), g1, null, "lowerBound", null, 0, 1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(deviationEClass_T);
		initEReference(getDeviation_UpperBound(), g1, null, "upperBound", null, 0, 1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getDistribution());
		g2 = createEGenericType(deviationEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getDeviation_Distribution(), g1, null, "distribution", null, 0, 1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeviation__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(distributionEClass, Distribution.class, "Distribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weibullDistributionEClass, WeibullDistribution.class, "WeibullDistribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weibullParametersEClass, WeibullParameters.class, "WeibullParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeibullParameters_Kappa(), theEcorePackage.getEDouble(), "kappa", "0.0", 0, 1, WeibullParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeibullParameters_Lambda(), theEcorePackage.getEDouble(), "lambda", "0.0", 0, 1, WeibullParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weibullEstimatorsEClass, WeibullEstimators.class, "WeibullEstimators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(weibullEstimatorsEClass_T);
		initEReference(getWeibullEstimators_Mean(), g1, null, "mean", null, 0, 1, WeibullEstimators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeibullEstimators_PRemainPromille(), theEcorePackage.getEDouble(), "pRemainPromille", "0.0", 0, 1, WeibullEstimators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniformDistributionEClass, UniformDistribution.class, "UniformDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundariesEClass, Boundaries.class, "Boundaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundaries_SamplingType(), this.getSamplingType(), "samplingType", null, 0, 1, Boundaries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gaussDistributionEClass, GaussDistribution.class, "GaussDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(gaussDistributionEClass_T);
		initEReference(getGaussDistribution_Sd(), g1, null, "sd", null, 0, 1, GaussDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(gaussDistributionEClass_T);
		initEReference(getGaussDistribution_Mean(), g1, null, "mean", null, 0, 1, GaussDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betaDistributionEClass, BetaDistribution.class, "BetaDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBetaDistribution_Alpha(), theEcorePackage.getEDouble(), "alpha", "0.0", 0, 1, BetaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBetaDistribution_Beta(), theEcorePackage.getEDouble(), "beta", "0.0", 0, 1, BetaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericStatisticEClass, NumericStatistic.class, "NumericStatistic", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minAvgMaxStatisticEClass, MinAvgMaxStatistic.class, "MinAvgMaxStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinAvgMaxStatistic_Min(), theEcorePackage.getEInt(), "min", "0", 0, 1, MinAvgMaxStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinAvgMaxStatistic_Avg(), theEcorePackage.getEFloat(), "avg", "0f", 0, 1, MinAvgMaxStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinAvgMaxStatistic_Max(), theEcorePackage.getEInt(), "max", "0", 0, 1, MinAvgMaxStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleValueStatisticEClass, SingleValueStatistic.class, "SingleValueStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleValueStatistic_Value(), theEcorePackage.getEFloat(), "value", "0f", 0, 1, SingleValueStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMode_Literals(), this.getModeLiteral(), null, "literals", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeLiteralEClass, ModeLiteral.class, "ModeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getModeLiteral__ComputeUniqueName(), theEcorePackage.getEString(), "computeUniqueName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModeLiteral__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(componentsModelEClass, ComponentsModel.class, "ComponentsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentsModel_Components(), this.getComponent(), null, "components", null, 0, -1, ComponentsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentsModel_Systems(), this.getSystem(), null, "systems", null, 0, -1, ComponentsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iNamedElementEClass, INamedElement.class, "INamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, INamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iSystemEClass, ISystem.class, "ISystem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISystem_ComponentInstances(), this.getComponentInstance(), null, "componentInstances", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISystem_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISystem_GroundedPorts(), this.getQualifiedPort(), null, "groundedPorts", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISystem_InnerPorts(), this.getQualifiedPort(), null, "innerPorts", null, 0, -1, ISystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPort__ComputeUniqueName(), theEcorePackage.getEString(), "computeUniqueName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Ports(), this.getPort(), null, "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Tasks(), this.getAbstractProcess(), null, "tasks", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Runnables(), this.getRunnable(), null, "runnables", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Labels(), this.getLabel(), null, "labels", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Semaphores(), this.getSemaphore(), null, "semaphores", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OsEvents(), this.getOsEvent(), null, "osEvents", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, org.eclipse.app4mc.amalthea.model.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_Type(), this.getComponent(), null, "type", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_SourcePort(), this.getQualifiedPort(), null, "sourcePort", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_TargetPort(), this.getQualifiedPort(), null, "targetPort", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifiedPortEClass, QualifiedPort.class, "QualifiedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifiedPort_Instance(), this.getComponentInstance(), null, "instance", null, 0, 1, QualifiedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedPort_Port(), this.getPort(), null, "port", null, 0, 1, QualifiedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fInterfacePortEClass, FInterfacePort.class, "FInterfacePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFInterfacePort_Kind(), this.getInterfaceKind(), "kind", null, 0, 1, FInterfacePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFInterfacePort_InterfaceName(), theEcorePackage.getEString(), "interfaceName", null, 0, 1, FInterfacePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configModelEClass, ConfigModel.class, "ConfigModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigModel_EventsToTrace(), this.getEventConfig(), null, "eventsToTrace", null, 0, -1, ConfigModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventConfigEClass, EventConfig.class, "EventConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventConfig_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EventConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventConfig_Event(), this.getEntityEvent(), null, "event", null, 1, 1, EventConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintsModelEClass, ConstraintsModel.class, "ConstraintsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintsModel_EventChains(), this.getEventChain(), null, "eventChains", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsModel_TimingConstraints(), this.getTimingConstraint(), null, "timingConstraints", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsModel_AffinityConstraints(), this.getAffinityConstraint(), null, "affinityConstraints", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsModel_RunnableSequencingConstraints(), this.getRunnableSequencingConstraint(), null, "runnableSequencingConstraints", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsModel_DataAgeConstraints(), this.getDataAgeConstraint(), null, "dataAgeConstraints", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsModel_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsModel_DataCoherencyGroups(), this.getDataCoherencyGroup(), null, "dataCoherencyGroups", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsModel_DataStabilityGroups(), this.getDataStabilityGroup(), null, "dataStabilityGroups", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintsModel_PhysicalSectionConstraints(), this.getPhysicalSectionConstraint(), null, "physicalSectionConstraints", null, 0, -1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableSequencingConstraintEClass, RunnableSequencingConstraint.class, "RunnableSequencingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunnableSequencingConstraint_OrderType(), this.getRunnableOrderType(), "orderType", null, 0, 1, RunnableSequencingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableSequencingConstraint_RunnableGroups(), this.getRunnableEntityGroup(), null, "runnableGroups", null, 2, -1, RunnableSequencingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableSequencingConstraint_ProcessScope(), this.getAbstractProcess(), null, "processScope", null, 0, -1, RunnableSequencingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affinityConstraintEClass, AffinityConstraint.class, "AffinityConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(separationConstraintEClass, SeparationConstraint.class, "SeparationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pairingConstraintEClass, PairingConstraint.class, "PairingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processConstraintEClass, ProcessConstraint.class, "ProcessConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessConstraint_Target(), this.getProcessConstraintTarget(), null, "target", null, 0, 1, ProcessConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableConstraintEClass, RunnableConstraint.class, "RunnableConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableConstraint_Target(), this.getRunnableConstraintTarget(), null, "target", null, 0, 1, RunnableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataConstraintEClass, DataConstraint.class, "DataConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataConstraint_Target(), this.getDataConstraintTarget(), null, "target", null, 0, 1, DataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableSeparationConstraintEClass, RunnableSeparationConstraint.class, "RunnableSeparationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableSeparationConstraint_Groups(), this.getRunnableGroup(), null, "groups", null, 1, 2, RunnableSeparationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processSeparationConstraintEClass, ProcessSeparationConstraint.class, "ProcessSeparationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessSeparationConstraint_Groups(), this.getProcessGroup(), null, "groups", null, 1, 2, ProcessSeparationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSeparationConstraintEClass, DataSeparationConstraint.class, "DataSeparationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSeparationConstraint_Groups(), this.getLabelEntityGroup(), null, "groups", null, 1, 2, DataSeparationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnablePairingConstraintEClass, RunnablePairingConstraint.class, "RunnablePairingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnablePairingConstraint_Group(), this.getRunnableGroup(), null, "group", null, 0, 1, RunnablePairingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPairingConstraintEClass, ProcessPairingConstraint.class, "ProcessPairingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessPairingConstraint_Group(), this.getProcessGroup(), null, "group", null, 0, 1, ProcessPairingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPairingConstraintEClass, DataPairingConstraint.class, "DataPairingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPairingConstraint_Group(), this.getLabelGroup(), null, "group", null, 0, 1, DataPairingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableConstraintTargetEClass, RunnableConstraintTarget.class, "RunnableConstraintTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processConstraintTargetEClass, ProcessConstraintTarget.class, "ProcessConstraintTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataConstraintTargetEClass, DataConstraintTarget.class, "DataConstraintTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetMemoryEClass, TargetMemory.class, "TargetMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetMemory_Memories(), this.getMemory(), null, "memories", null, 0, -1, TargetMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetCoreEClass, TargetCore.class, "TargetCore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetCore_Cores(), this.getCore(), null, "cores", null, 0, -1, TargetCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetSchedulerEClass, TargetScheduler.class, "TargetScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetScheduler_Schedulers(), this.getScheduler(), null, "schedulers", null, 0, -1, TargetScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelGroupEClass, LabelGroup.class, "LabelGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runnableGroupEClass, RunnableGroup.class, "RunnableGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processGroupEClass, ProcessGroup.class, "ProcessGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEntityGroupEClass, LabelEntityGroup.class, "LabelEntityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelEntityGroup_Labels(), this.getLabel(), null, "labels", null, 1, -1, LabelEntityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableEntityGroupEClass, RunnableEntityGroup.class, "RunnableEntityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableEntityGroup_Runnables(), this.getRunnable(), null, "runnables", null, 1, -1, RunnableEntityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEntityGroupEClass, ProcessEntityGroup.class, "ProcessEntityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessEntityGroup_Processes(), this.getProcess(), null, "processes", null, 1, -1, ProcessEntityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagGroupEClass, TagGroup.class, "TagGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagGroup_Tag(), this.getTag(), null, "tag", null, 1, 1, TagGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEventChainEClass, AbstractEventChain.class, "AbstractEventChain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEventChain_Stimulus(), this.getEvent(), null, "stimulus", null, 0, 1, AbstractEventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEventChain_Response(), this.getEvent(), null, "response", null, 0, 1, AbstractEventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEventChain_Segments(), this.getEventChainItem(), null, "segments", null, 0, -1, AbstractEventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEventChain_Strands(), this.getEventChainItem(), null, "strands", null, 0, -1, AbstractEventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractEventChain__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractEventChain__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eventChainEClass, EventChain.class, "EventChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subEventChainEClass, SubEventChain.class, "SubEventChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventChainItemEClass, EventChainItem.class, "EventChainItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEventChainItem__GetEventChain(), this.getAbstractEventChain(), "getEventChain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eventChainReferenceEClass, EventChainReference.class, "EventChainReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainReference_EventChain(), this.getEventChain(), null, "eventChain", null, 1, 1, EventChainReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainContainerEClass, EventChainContainer.class, "EventChainContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainContainer_EventChain(), this.getSubEventChain(), null, "eventChain", null, 1, 1, EventChainContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingConstraintEClass, TimingConstraint.class, "TimingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalSectionConstraintEClass, PhysicalSectionConstraint.class, "PhysicalSectionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalSectionConstraint_Section(), this.getSection(), null, "section", null, 0, 1, PhysicalSectionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSectionConstraint_Memories(), this.getMemory(), null, "memories", null, 1, -1, PhysicalSectionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationConstraintEClass, SynchronizationConstraint.class, "SynchronizationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchronizationConstraint_MultipleOccurrencesAllowed(), theEcorePackage.getEBoolean(), "multipleOccurrencesAllowed", "false", 0, 1, SynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronizationConstraint_Tolerance(), this.getTime(), null, "tolerance", null, 0, 1, SynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSynchronizationConstraintEClass, EventSynchronizationConstraint.class, "EventSynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventSynchronizationConstraint_Events(), this.getEntityEvent(), null, "events", null, 0, -1, EventSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainSynchronizationConstraintEClass, EventChainSynchronizationConstraint.class, "EventChainSynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainSynchronizationConstraint_Scope(), this.getEventChain(), null, "scope", null, 2, 2, EventChainSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventChainSynchronizationConstraint_Type(), this.getSynchronizationType(), "type", null, 0, 1, EventChainSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayConstraintEClass, DelayConstraint.class, "DelayConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayConstraint_MappingType(), this.getMappingType(), "mappingType", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Source(), this.getEntityEvent(), null, "source", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Target(), this.getEntityEvent(), null, "target", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Upper(), this.getTime(), null, "upper", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Lower(), this.getTime(), null, "lower", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainLatencyConstraintEClass, EventChainLatencyConstraint.class, "EventChainLatencyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainLatencyConstraint_Scope(), this.getEventChain(), null, "scope", null, 0, 1, EventChainLatencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventChainLatencyConstraint_Type(), this.getLatencyType(), "type", null, 0, 1, EventChainLatencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChainLatencyConstraint_Minimum(), this.getTime(), null, "minimum", null, 0, 1, EventChainLatencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChainLatencyConstraint_Maximum(), this.getTime(), null, "maximum", null, 0, 1, EventChainLatencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repetitionConstraintEClass, RepetitionConstraint.class, "RepetitionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepetitionConstraint_Event(), this.getEntityEvent(), null, "event", null, 0, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepetitionConstraint_Span(), theEcorePackage.getEInt(), "span", "0", 0, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepetitionConstraint_Lower(), this.getTime(), null, "lower", null, 0, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepetitionConstraint_Upper(), this.getTime(), null, "upper", null, 0, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepetitionConstraint_Jitter(), this.getTime(), null, "jitter", null, 0, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepetitionConstraint_Period(), this.getTime(), null, "period", null, 0, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAgeConstraintEClass, DataAgeConstraint.class, "DataAgeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAgeConstraint_Runnable(), this.getRunnable(), null, "runnable", null, 1, 1, DataAgeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAgeConstraint_Label(), this.getLabel(), null, "label", null, 1, 1, DataAgeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAgeConstraint_DataAge(), this.getDataAge(), null, "dataAge", null, 1, 1, DataAgeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAgeEClass, DataAge.class, "DataAge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAgeCycleEClass, DataAgeCycle.class, "DataAgeCycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAgeCycle_MinimumCycle(), theEcorePackage.getEInt(), "minimumCycle", "0", 0, 1, DataAgeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAgeCycle_MaximumCycle(), theEcorePackage.getEInt(), "maximumCycle", "0", 0, 1, DataAgeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAgeTimeEClass, DataAgeTime.class, "DataAgeTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAgeTime_MinimumTime(), this.getTime(), null, "minimumTime", null, 0, 1, DataAgeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAgeTime_MaximumTime(), this.getTime(), null, "maximumTime", null, 0, 1, DataAgeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Severity(), this.getSeverity(), "severity", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Limit(), this.getRequirementLimit(), null, "limit", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processRequirementEClass, ProcessRequirement.class, "ProcessRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessRequirement_Process(), this.getAbstractProcess(), null, "process", null, 0, 1, ProcessRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableRequirementEClass, RunnableRequirement.class, "RunnableRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableRequirement_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, RunnableRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureRequirementEClass, ArchitectureRequirement.class, "ArchitectureRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureRequirement_Component(), this.getComponent(), null, "component", null, 0, 1, ArchitectureRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processChainRequirementEClass, ProcessChainRequirement.class, "ProcessChainRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessChainRequirement_ProcessChain(), this.getProcessChain(), null, "processChain", null, 0, 1, ProcessChainRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementLimitEClass, RequirementLimit.class, "RequirementLimit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementLimit_LimitType(), this.getLimitType(), "limitType", null, 0, 1, RequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRequirementLimit__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cpuPercentageRequirementLimitEClass, CPUPercentageRequirementLimit.class, "CPUPercentageRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPUPercentageRequirementLimit_Metric(), this.getCPUPercentageMetric(), "metric", null, 0, 1, CPUPercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCPUPercentageRequirementLimit_LimitValue(), theEcorePackage.getEDouble(), "limitValue", "0.0", 0, 1, CPUPercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPUPercentageRequirementLimit_HardwareContext(), this.getComplexNode(), null, "hardwareContext", null, 0, 1, CPUPercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyRequirementLimitEClass, FrequencyRequirementLimit.class, "FrequencyRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequencyRequirementLimit_Metric(), this.getFrequencyMetric(), "metric", null, 0, 1, FrequencyRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyRequirementLimit_LimitValue(), this.getFrequency(), null, "limitValue", null, 0, 1, FrequencyRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(percentageRequirementLimitEClass, PercentageRequirementLimit.class, "PercentageRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageRequirementLimit_Metric(), this.getPercentageMetric(), "metric", null, 0, 1, PercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageRequirementLimit_LimitValue(), theEcorePackage.getEDouble(), "limitValue", "0.0", 0, 1, PercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countRequirementLimitEClass, CountRequirementLimit.class, "CountRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountRequirementLimit_Metric(), this.getCountMetric(), "metric", null, 0, 1, CountRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountRequirementLimit_LimitValue(), theEcorePackage.getEInt(), "limitValue", "0", 0, 1, CountRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRequirementLimitEClass, TimeRequirementLimit.class, "TimeRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRequirementLimit_Metric(), this.getTimeMetric(), "metric", null, 0, 1, TimeRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeRequirementLimit_LimitValue(), this.getTime(), null, "limitValue", null, 0, 1, TimeRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCoherencyGroupEClass, DataCoherencyGroup.class, "DataCoherencyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCoherencyGroup_Labels(), this.getLabel(), null, "labels", null, 0, -1, DataCoherencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCoherencyGroup_Scope(), this.getDataGroupScope(), null, "scope", null, 0, 1, DataCoherencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCoherencyGroup_Direction(), this.getCoherencyDirection(), "direction", null, 0, 1, DataCoherencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStabilityGroupEClass, DataStabilityGroup.class, "DataStabilityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataStabilityGroup_Labels(), this.getLabel(), null, "labels", null, 0, -1, DataStabilityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataStabilityGroup_Scope(), this.getDataGroupScope(), null, "scope", null, 0, 1, DataStabilityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataGroupScopeEClass, DataGroupScope.class, "DataGroupScope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDataGroupScope__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(processScopeEClass, ProcessScope.class, "ProcessScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessScope_Process(), this.getAbstractProcess(), null, "process", null, 0, 1, ProcessScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableScopeEClass, RunnableScope.class, "RunnableScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableScope_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, RunnableScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentScopeEClass, ComponentScope.class, "ComponentScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentScope_Component(), this.getComponent(), null, "component", null, 0, 1, ComponentScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventModelEClass, EventModel.class, "EventModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventModel_Events(), this.getEvent(), null, "events", null, 0, -1, EventModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSetEClass, EventSet.class, "EventSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventSet_Events(), this.getEntityEvent(), null, "events", null, 0, -1, EventSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEventEClass, EntityEvent.class, "EntityEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerEventEClass, TriggerEvent.class, "TriggerEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customEventEClass, CustomEvent.class, "CustomEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomEvent_EventType(), theEcorePackage.getEString(), "eventType", null, 0, 1, CustomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomEvent_ExplicitTriggers(), this.getCustomEventTrigger(), this.getCustomEventTrigger_EventLinkInt(), "explicitTriggers", null, 0, -1, CustomEvent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimulusEventEClass, StimulusEvent.class, "StimulusEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStimulusEvent_Entity(), this.getStimulus(), null, "entity", null, 0, 1, StimulusEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEventEClass, ProcessEvent.class, "ProcessEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessEvent_EventType(), this.getProcessEventType(), "eventType", null, 1, 1, ProcessEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessEvent_Entity(), this.getProcess(), null, "entity", null, 0, 1, ProcessEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessEvent_Core(), this.getCore(), null, "core", null, 0, 1, ProcessEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processChainEventEClass, ProcessChainEvent.class, "ProcessChainEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessChainEvent_EventType(), this.getProcessEventType(), "eventType", null, 1, 1, ProcessChainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessChainEvent_Entity(), this.getProcessChain(), null, "entity", null, 0, 1, ProcessChainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessChainEvent_Core(), this.getCore(), null, "core", null, 0, 1, ProcessChainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableEventEClass, RunnableEvent.class, "RunnableEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunnableEvent_EventType(), this.getRunnableEventType(), "eventType", null, 1, 1, RunnableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEvent_Entity(), this.getRunnable(), null, "entity", null, 0, 1, RunnableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEvent_Process(), this.getProcess(), null, "process", null, 0, 1, RunnableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEvent_Core(), this.getCore(), null, "core", null, 0, 1, RunnableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEventEClass, LabelEvent.class, "LabelEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelEvent_EventType(), this.getLabelEventType(), "eventType", null, 1, 1, LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelEvent_Entity(), this.getLabel(), null, "entity", null, 0, 1, LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelEvent_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelEvent_Process(), this.getProcess(), null, "process", null, 0, 1, LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEventEClass, ChannelEvent.class, "ChannelEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelEvent_EventType(), this.getChannelEventType(), "eventType", null, 1, 1, ChannelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelEvent_Entity(), this.getChannel(), null, "entity", null, 0, 1, ChannelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelEvent_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, ChannelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelEvent_Process(), this.getProcess(), null, "process", null, 0, 1, ChannelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semaphoreEventEClass, SemaphoreEvent.class, "SemaphoreEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemaphoreEvent_EventType(), this.getSemaphoreEventType(), "eventType", null, 1, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreEvent_Entity(), this.getSemaphore(), null, "entity", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreEvent_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreEvent_Process(), this.getProcess(), null, "process", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreEvent_Core(), this.getCore(), null, "core", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwModelEClass, HWModel.class, "HWModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWModel_SystemTypes(), this.getSystemType(), null, "systemTypes", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_EcuTypes(), this.getECUType(), null, "ecuTypes", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_McTypes(), this.getMicrocontrollerType(), null, "mcTypes", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_CoreTypes(), this.getCoreType(), null, "coreTypes", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_MemoryTypes(), this.getMemoryType(), null, "memoryTypes", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_NetworkTypes(), this.getNetworkType(), null, "networkTypes", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_AccessPaths(), this.getAccessPath(), null, "accessPaths", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_System(), this.getHwSystem(), null, "system", null, 0, 1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexNodeEClass, ComplexNode.class, "ComplexNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexNode_Prescaler(), this.getPrescaler(), null, "prescaler", null, 0, 1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexNode_Memories(), this.getMemory(), null, "memories", null, 0, -1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexNode_Networks(), this.getNetwork(), null, "networks", null, 0, -1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexNode_Components(), this.getHwComponent(), null, "components", null, 0, -1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexNode_Ports(), this.getHwPort(), null, "ports", null, 0, -1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwSystemEClass, HwSystem.class, "HwSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwSystem_SystemType(), this.getSystemType(), null, "systemType", null, 0, 1, HwSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwSystem_Ecus(), this.getECU(), null, "ecus", null, 1, -1, HwSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwSystem_Quartzes(), this.getQuartz(), null, "quartzes", null, 0, -1, HwSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecuEClass, org.eclipse.app4mc.amalthea.model.ECU.class, "ECU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECU_EcuType(), this.getECUType(), null, "ecuType", null, 0, 1, org.eclipse.app4mc.amalthea.model.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECU_Microcontrollers(), this.getMicrocontroller(), null, "microcontrollers", null, 1, -1, org.eclipse.app4mc.amalthea.model.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microcontrollerEClass, Microcontroller.class, "Microcontroller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicrocontroller_MicrocontrollerType(), this.getMicrocontrollerType(), null, "microcontrollerType", null, 0, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontroller_Cores(), this.getCore(), null, "cores", null, 1, -1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCore_CoreType(), this.getCoreType(), null, "coreType", null, 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCore_LockstepGroup(), theEcorePackage.getEInt(), "lockstepGroup", "0", 0, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemory_Type(), this.getMemoryType(), null, "type", null, 0, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_Mappings(), this.getMemoryMapping(), this.getMemoryMapping_MemoryLinkInt(), "mappings", null, 0, -1, Memory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetwork_Type(), this.getNetworkType(), null, "type", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quartzEClass, Quartz.class, "Quartz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuartz_Frequency(), this.getFrequency(), null, "frequency", null, 0, 1, Quartz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuartz_Type(), this.getQType(), "type", null, 0, 1, Quartz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwComponentEClass, HwComponent.class, "HwComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwComponent_NestedComponents(), this.getHwComponent(), null, "nestedComponents", null, 0, -1, HwComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareTypeDescriptionEClass, HardwareTypeDescription.class, "HardwareTypeDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractionTypeEClass, AbstractionType.class, "AbstractionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemTypeEClass, SystemType.class, "SystemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ecuTypeEClass, ECUType.class, "ECUType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microcontrollerTypeEClass, MicrocontrollerType.class, "MicrocontrollerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coreTypeEClass, CoreType.class, "CoreType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoreType_BitWidth(), theEcorePackage.getEInt(), "bitWidth", "0", 0, 1, CoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoreType_InstructionsPerCycle(), theEcorePackage.getEFloat(), "instructionsPerCycle", "0.0", 0, 1, CoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoreType_Classifiers(), this.getCoreClassifier(), null, "classifiers", null, 0, -1, CoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryTypeEClass, MemoryType.class, "MemoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryType_Type(), this.getMemoryTypeEnum(), "type", null, 0, 1, MemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryType_Size(), this.getDataSize(), null, "size", null, 0, 1, MemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryType_Classifiers(), this.getMemoryClassifier(), null, "classifiers", null, 0, -1, MemoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkTypeEClass, NetworkType.class, "NetworkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkType_SchedPolicy(), this.getSchedType(), "schedPolicy", null, 0, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkType_BitWidth(), theEcorePackage.getEInt(), "bitWidth", "0", 0, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPortEClass, HwPort.class, "HwPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwPort_Pins(), this.getPin(), null, "pins", null, 0, 1, HwPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHwPort__ComputeUniqueName(), theEcorePackage.getEString(), "computeUniqueName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexPortEClass, ComplexPort.class, "ComplexPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexPort_Network(), this.getNetwork(), null, "network", null, 1, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPort_Master(), theEcorePackage.getEBoolean(), "master", "false", 0, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPort_BitWidth(), theEcorePackage.getEInt(), "bitWidth", "0", 0, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPort_BaseAddress(), theEcorePackage.getELong(), "baseAddress", "0", 0, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPort_AddressRange(), theEcorePackage.getELong(), "addressRange", "0", 0, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPort_Direction(), this.getRWType(), "direction", null, 0, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPort_WriteCycles(), theEcorePackage.getEInt(), "writeCycles", "0", 0, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPort_ReadCycles(), theEcorePackage.getEInt(), "readCycles", "0", 0, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPort_SchedValue(), theEcorePackage.getEInt(), "schedValue", "0", 0, 1, ComplexPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexPinEClass, ComplexPin.class, "ComplexPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexPin_Type(), this.getPinType(), "type", null, 0, 1, ComplexPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPin_BaseAddress(), theEcorePackage.getELong(), "baseAddress", "0", 0, 1, ComplexPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexPin_Direction(), this.getRWType(), "direction", null, 0, 1, ComplexPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescalerEClass, Prescaler.class, "Prescaler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescaler_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Prescaler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescaler_ClockRatio(), theEcorePackage.getEDouble(), "clockRatio", "0.0", 0, 1, Prescaler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescaler_Quartz(), this.getQuartz(), null, "quartz", null, 1, 1, Prescaler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossbarSwitchEClass, CrossbarSwitch.class, "CrossbarSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrossbarSwitch_ConConnections(), theEcorePackage.getEInt(), "conConnections", "0", 0, 1, CrossbarSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBus_BusType(), this.getBusType(), "busType", null, 0, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bridgeEClass, Bridge.class, "Bridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessPathEClass, AccessPath.class, "AccessPath", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessPath_Source(), this.getComplexNode(), null, "source", null, 0, 1, AccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessPath_Target(), this.getComplexNode(), null, "target", null, 0, 1, AccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyAccessPathEClass, LatencyAccessPath.class, "LatencyAccessPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLatencyAccessPath_Latencies(), this.getLatencyAccessPathElement(), null, "latencies", null, 0, -1, LatencyAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwAccessPathEClass, HwAccessPath.class, "HwAccessPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwAccessPath_HwElements(), this.getHwAccessPathElement(), null, "hwElements", null, 0, -1, HwAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyAccessPathElementEClass, LatencyAccessPathElement.class, "LatencyAccessPathElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessPathRefEClass, AccessPathRef.class, "AccessPathRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessPathRef_Ref(), this.getLatencyAccessPath(), null, "ref", null, 0, 1, AccessPathRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyEClass, Latency.class, "Latency", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatency_AccessType(), this.getRWType(), "accessType", null, 0, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatency_TransferSize(), theEcorePackage.getELong(), "transferSize", "0", 0, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLatency_Quartz(), this.getQuartz(), null, "quartz", null, 1, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyConstantEClass, LatencyConstant.class, "LatencyConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatencyConstant_Value(), theEcorePackage.getELong(), "value", "0", 0, 1, LatencyConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyDeviationEClass, LatencyDeviation.class, "LatencyDeviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getDeviation());
		g2 = createEGenericType(this.getLongObject());
		g1.getETypeArguments().add(g2);
		initEReference(getLatencyDeviation_Deviation(), g1, null, "deviation", null, 0, 1, LatencyDeviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwAccessPathElementEClass, HwAccessPathElement.class, "HwAccessPathElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwAccessPathRefEClass, HwAccessPathRef.class, "HwAccessPathRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwAccessPathRef_Ref(), this.getHwAccessPath(), null, "ref", null, 0, 1, HwAccessPathRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwElementRefEClass, HwElementRef.class, "HwElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwElementRef_Port(), this.getComplexPort(), null, "port", null, 0, 1, HwElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingModelEClass, MappingModel.class, "MappingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingModel_SchedulerAllocation(), this.getSchedulerAllocation(), null, "schedulerAllocation", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingModel_RunnableAllocation(), this.getRunnableAllocation(), null, "runnableAllocation", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingModel_TaskAllocation(), this.getTaskAllocation(), null, "taskAllocation", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingModel_IsrAllocation(), this.getISRAllocation(), null, "isrAllocation", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingModel_MemoryMapping(), this.getMemoryMapping(), null, "memoryMapping", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingModel_PhysicalSectionMapping(), this.getPhysicalSectionMapping(), null, "physicalSectionMapping", null, 0, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingModel_AddressMappingType(), this.getMemoryAddressMappingType(), "addressMappingType", null, 0, 1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulerAllocationEClass, SchedulerAllocation.class, "SchedulerAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulerAllocation_Scheduler(), this.getScheduler(), null, "scheduler", null, 1, 1, SchedulerAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAllocation_Responsibility(), this.getCore(), null, "responsibility", null, 1, -1, SchedulerAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAllocation_ExecutingCore(), this.getCore(), null, "executingCore", null, 0, 1, SchedulerAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskAllocationEClass, TaskAllocation.class, "TaskAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskAllocation_Task(), this.getTask(), null, "task", null, 1, 1, TaskAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAllocation_Scheduler(), this.getTaskScheduler(), null, "scheduler", null, 1, 1, TaskAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAllocation_CoreAffinity(), this.getCore(), null, "coreAffinity", null, 0, -1, TaskAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAllocation_SchedulingParameters(), this.getSchedulingParameters(), null, "schedulingParameters", null, 0, 1, TaskAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAllocation_ParameterExtensions(), this.getParameterExtension(), null, "parameterExtensions", null, 0, -1, TaskAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isrAllocationEClass, ISRAllocation.class, "ISRAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISRAllocation_Isr(), this.getISR(), null, "isr", null, 1, 1, ISRAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISRAllocation_Controller(), this.getInterruptController(), null, "controller", null, 1, 1, ISRAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISRAllocation_Priority(), theEcorePackage.getEIntegerObject(), "priority", null, 0, 1, ISRAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableAllocationEClass, RunnableAllocation.class, "RunnableAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableAllocation_Scheduler(), this.getScheduler(), null, "scheduler", null, 1, 1, RunnableAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableAllocation_Entity(), this.getRunnable(), null, "entity", null, 1, 1, RunnableAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryMappingEClass, MemoryMapping.class, "MemoryMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryMapping_AbstractElement(), this.getAbstractMemoryElement(), null, "abstractElement", null, 1, 1, MemoryMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryMapping_Memory(), this.getMemory(), null, "memory", null, 0, 1, MemoryMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryMapping_MemoryPositionAddress(), theEcorePackage.getELong(), "memoryPositionAddress", "0", 0, 1, MemoryMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryMapping_AbstractElementLinkInt(), this.getAbstractMemoryElement(), this.getAbstractMemoryElement_Mappings(), "abstractElementLinkInt", null, 0, 1, MemoryMapping.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryMapping_MemoryLinkInt(), this.getMemory(), this.getMemory_Mappings(), "memoryLinkInt", null, 0, 1, MemoryMapping.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalSectionMappingEClass, PhysicalSectionMapping.class, "PhysicalSectionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalSectionMapping_Origin(), this.getSection(), null, "origin", null, 1, -1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSectionMapping_Memory(), this.getMemory(), null, "memory", null, 1, 1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalSectionMapping_StartAddress(), theEcorePackage.getELong(), "startAddress", "0", 0, 1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalSectionMapping_EndAddress(), theEcorePackage.getELong(), "endAddress", "0", 0, 1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSectionMapping_Labels(), this.getLabel(), null, "labels", null, 0, -1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSectionMapping_RunEntities(), this.getRunnable(), null, "runEntities", null, 0, -1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osModelEClass, OSModel.class, "OSModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSModel_Semaphores(), this.getSemaphore(), null, "semaphores", null, 0, -1, OSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSModel_OperatingSystems(), this.getOperatingSystem(), null, "operatingSystems", null, 0, -1, OSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSModel_OsOverheads(), this.getOsInstructions(), null, "osOverheads", null, 0, -1, OSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osDataConsistencyEClass, OsDataConsistency.class, "OsDataConsistency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsDataConsistency_Mode(), this.getOsDataConsistencyMode(), "mode", null, 0, 1, OsDataConsistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsDataConsistency_DataStability(), this.getDataStability(), null, "dataStability", null, 0, 1, OsDataConsistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsDataConsistency_NonAtomicDataCoherency(), this.getNonAtomicDataCoherency(), null, "nonAtomicDataCoherency", null, 0, 1, OsDataConsistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStabilityEClass, DataStability.class, "DataStability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataStability_Enabled(), theEcorePackage.getEBoolean(), "enabled", "false", 0, 1, DataStability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataStability_Algorithm(), theEcorePackage.getEString(), "algorithm", null, 0, 1, DataStability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataStability_AccessMultiplicity(), this.getAccessMultiplicity(), "accessMultiplicity", null, 0, 1, DataStability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataStability_Level(), this.getDataStabilityLevel(), "level", null, 0, 1, DataStability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonAtomicDataCoherencyEClass, NonAtomicDataCoherency.class, "NonAtomicDataCoherency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonAtomicDataCoherency_Enabled(), theEcorePackage.getEBoolean(), "enabled", "false", 0, 1, NonAtomicDataCoherency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonAtomicDataCoherency_Algorithm(), theEcorePackage.getEString(), "algorithm", null, 0, 1, NonAtomicDataCoherency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonAtomicDataCoherency_AccessMultiplicity(), this.getAccessMultiplicity(), "accessMultiplicity", null, 0, 1, NonAtomicDataCoherency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semaphoreEClass, Semaphore.class, "Semaphore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemaphore_SemaphoreType(), this.getSemaphoreType(), "semaphoreType", null, 0, 1, Semaphore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemaphore_InitialValue(), theEcorePackage.getEInt(), "initialValue", "0", 0, 1, Semaphore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemaphore_MaxValue(), theEcorePackage.getEInt(), "maxValue", "0", 0, 1, Semaphore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemaphore_PriorityCeilingProtocol(), theEcorePackage.getEBoolean(), "priorityCeilingProtocol", "false", 0, 1, Semaphore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphore_SemaphoreAccesses(), this.getSemaphoreAccess(), this.getSemaphoreAccess_SemaphoreLinkInt(), "semaphoreAccesses", null, 0, -1, Semaphore.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulerEClass, Scheduler.class, "Scheduler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduler_ComputationItems(), this.getComputationItem(), null, "computationItems", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getScheduler__GetSchedulingAlgorithm(), this.getAlgorithm(), "getSchedulingAlgorithm", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(taskSchedulerEClass, TaskScheduler.class, "TaskScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskScheduler_SchedulingAlgorithm(), this.getTaskSchedulingAlgorithm(), null, "schedulingAlgorithm", null, 0, 1, TaskScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_ParentAssociation(), this.getSchedulerAssociation(), null, "parentAssociation", null, 0, 1, TaskScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_ChildAssociations(), this.getSchedulerAssociation(), this.getSchedulerAssociation_ParentLinkInt(), "childAssociations", null, 0, -1, TaskScheduler.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_ParentScheduler(), this.getTaskScheduler(), null, "parentScheduler", null, 0, 1, TaskScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_ChildSchedulers(), this.getTaskScheduler(), null, "childSchedulers", null, 0, -1, TaskScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(schedulerAssociationEClass, SchedulerAssociation.class, "SchedulerAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulerAssociation_Parent(), this.getTaskScheduler(), null, "parent", null, 0, 1, SchedulerAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAssociation_ParentLinkInt(), this.getTaskScheduler(), this.getTaskScheduler_ChildAssociations(), "parentLinkInt", null, 0, 1, SchedulerAssociation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAssociation_Child(), this.getTaskScheduler(), null, "child", null, 0, 1, SchedulerAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAssociation_SchedulingParameters(), this.getSchedulingParameters(), null, "schedulingParameters", null, 0, 1, SchedulerAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAssociation_ParameterExtensions(), this.getParameterExtension(), null, "parameterExtensions", null, 0, -1, SchedulerAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptControllerEClass, InterruptController.class, "InterruptController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterruptController_SchedulingAlgorithm(), this.getInterruptSchedulingAlgorithm(), null, "schedulingAlgorithm", null, 0, 1, InterruptController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingParametersEClass, SchedulingParameters.class, "SchedulingParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedulingParameters_Priority(), theEcorePackage.getEIntegerObject(), "priority", null, 0, 1, SchedulingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingParameters_MinBudget(), this.getTime(), null, "minBudget", null, 0, 1, SchedulingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingParameters_MaxBudget(), this.getTime(), null, "maxBudget", null, 0, 1, SchedulingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingParameters_Replenishment(), this.getTime(), null, "replenishment", null, 0, 1, SchedulingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterExtensionEClass, Map.Entry.class, "ParameterExtension", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterExtension_Key(), theEcorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterExtension_Value(), theEcorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algorithmEClass, Algorithm.class, "Algorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interruptSchedulingAlgorithmEClass, InterruptSchedulingAlgorithm.class, "InterruptSchedulingAlgorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskSchedulingAlgorithmEClass, TaskSchedulingAlgorithm.class, "TaskSchedulingAlgorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedPriorityEClass, FixedPriority.class, "FixedPriority", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedPriorityPreemptiveEClass, FixedPriorityPreemptive.class, "FixedPriorityPreemptive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedPriorityPreemptiveWithBudgetEnforcementEClass, FixedPriorityPreemptiveWithBudgetEnforcement.class, "FixedPriorityPreemptiveWithBudgetEnforcement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(osekEClass, org.eclipse.app4mc.amalthea.model.OSEK.class, "OSEK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deadlineMonotonicEClass, DeadlineMonotonic.class, "DeadlineMonotonic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rateMonotonicEClass, RateMonotonic.class, "RateMonotonic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pfairEClass, Pfair.class, "Pfair", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPfair_QuantSizeNs(), theEcorePackage.getEInt(), "quantSizeNs", "0", 0, 1, Pfair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pfairPD2EClass, PfairPD2.class, "PfairPD2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partlyPFairPD2EClass, PartlyPFairPD2.class, "PartlyPFairPD2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earlyReleaseFairPD2EClass, EarlyReleaseFairPD2.class, "EarlyReleaseFairPD2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partlyEarlyReleaseFairPD2EClass, PartlyEarlyReleaseFairPD2.class, "PartlyEarlyReleaseFairPD2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicPriorityEClass, DynamicPriority.class, "DynamicPriority", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leastLocalRemainingExecutionTimeFirstEClass, LeastLocalRemainingExecutionTimeFirst.class, "LeastLocalRemainingExecutionTimeFirst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earliestDeadlineFirstEClass, EarliestDeadlineFirst.class, "EarliestDeadlineFirst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(priorityBasedRoundRobinEClass, PriorityBasedRoundRobin.class, "PriorityBasedRoundRobin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reservationBasedServerEClass, ReservationBasedServer.class, "ReservationBasedServer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deferrableServerEClass, DeferrableServer.class, "DeferrableServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pollingPeriodicServerEClass, PollingPeriodicServer.class, "PollingPeriodicServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sporadicServerEClass, SporadicServer.class, "SporadicServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantBandwidthServerEClass, ConstantBandwidthServer.class, "ConstantBandwidthServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantBandwidthServerWithCASHEClass, ConstantBandwidthServerWithCASH.class, "ConstantBandwidthServerWithCASH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupingEClass, Grouping.class, "Grouping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userSpecificSchedulingAlgorithmEClass, UserSpecificSchedulingAlgorithm.class, "UserSpecificSchedulingAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserSpecificSchedulingAlgorithm_ParameterExtensions(), this.getParameterExtension(), null, "parameterExtensions", null, 0, -1, UserSpecificSchedulingAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priorityBasedEClass, PriorityBased.class, "PriorityBased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatingSystem_Name(), theEcorePackage.getEString(), "name", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_Overhead(), this.getOsInstructions(), null, "overhead", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_TaskSchedulers(), this.getTaskScheduler(), null, "taskSchedulers", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_InterruptControllers(), this.getInterruptController(), null, "interruptControllers", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_OsDataConsistency(), this.getOsDataConsistency(), null, "osDataConsistency", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorOperatingSystemEClass, VendorOperatingSystem.class, "VendorOperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendorOperatingSystem_OsName(), theEcorePackage.getEString(), "osName", null, 0, 1, VendorOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorOperatingSystem_Vendor(), theEcorePackage.getEString(), "vendor", null, 0, 1, VendorOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorOperatingSystem_Version(), theEcorePackage.getEString(), "version", null, 0, 1, VendorOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osInstructionsEClass, OsInstructions.class, "OsInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsInstructions_ApiOverhead(), this.getOsAPIInstructions(), null, "apiOverhead", null, 0, 1, OsInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsInstructions_IsrCategory1Overhead(), this.getOsISRInstructions(), null, "isrCategory1Overhead", null, 0, 1, OsInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsInstructions_IsrCategory2Overhead(), this.getOsISRInstructions(), null, "isrCategory2Overhead", null, 0, 1, OsInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osAPIInstructionsEClass, OsAPIInstructions.class, "OsAPIInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsAPIInstructions_ApiSendMessage(), this.getInstructions(), null, "apiSendMessage", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiTerminateTask(), this.getInstructions(), null, "apiTerminateTask", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiSchedule(), this.getInstructions(), null, "apiSchedule", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiRequestResource(), this.getInstructions(), null, "apiRequestResource", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiReleaseResource(), this.getInstructions(), null, "apiReleaseResource", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiSetEvent(), this.getInstructions(), null, "apiSetEvent", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiWaitEvent(), this.getInstructions(), null, "apiWaitEvent", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiClearEvent(), this.getInstructions(), null, "apiClearEvent", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiActivateTask(), this.getInstructions(), null, "apiActivateTask", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiEnforcedMigration(), this.getInstructions(), null, "apiEnforcedMigration", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiSuspendOsInterrupts(), this.getInstructions(), null, "apiSuspendOsInterrupts", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiResumeOsInterrupts(), this.getInstructions(), null, "apiResumeOsInterrupts", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiRequestSpinlock(), this.getInstructions(), null, "apiRequestSpinlock", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiReleaseSpinlock(), this.getInstructions(), null, "apiReleaseSpinlock", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiSenderReceiverRead(), this.getInstructions(), null, "apiSenderReceiverRead", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiSenderReceiverWrite(), this.getInstructions(), null, "apiSenderReceiverWrite", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiSynchronousServerCallPoint(), this.getInstructions(), null, "apiSynchronousServerCallPoint", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiIocRead(), this.getInstructions(), null, "apiIocRead", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIInstructions_ApiIocWrite(), this.getInstructions(), null, "apiIocWrite", null, 0, 1, OsAPIInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osISRInstructionsEClass, OsISRInstructions.class, "OsISRInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsISRInstructions_PreExecutionOverhead(), this.getInstructions(), null, "preExecutionOverhead", null, 0, 1, OsISRInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsISRInstructions_PostExecutionOverhead(), this.getInstructions(), null, "postExecutionOverhead", null, 0, 1, OsISRInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyConstraintsModelEClass, PropertyConstraintsModel.class, "PropertyConstraintsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyConstraintsModel_AllocationConstraints(), this.getCoreAllocationConstraint(), null, "allocationConstraints", null, 0, -1, PropertyConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyConstraintsModel_MappingConstraints(), this.getMemoryMappingConstraint(), null, "mappingConstraints", null, 0, -1, PropertyConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreAllocationConstraintEClass, CoreAllocationConstraint.class, "CoreAllocationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoreAllocationConstraint_CoreClassification(), this.getCoreClassification(), null, "coreClassification", null, 0, 1, CoreAllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryMappingConstraintEClass, MemoryMappingConstraint.class, "MemoryMappingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryMappingConstraint_MemoryClassification(), this.getMemoryClassification(), null, "memoryClassification", null, 0, 1, MemoryMappingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processAllocationConstraintEClass, ProcessAllocationConstraint.class, "ProcessAllocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessAllocationConstraint_Process(), this.getProcess(), null, "process", null, 0, 1, ProcessAllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPrototypeAllocationConstraintEClass, ProcessPrototypeAllocationConstraint.class, "ProcessPrototypeAllocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessPrototypeAllocationConstraint_ProcessPrototype(), this.getProcessPrototype(), null, "processPrototype", null, 0, 1, ProcessPrototypeAllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableAllocationConstraintEClass, RunnableAllocationConstraint.class, "RunnableAllocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableAllocationConstraint_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, RunnableAllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractElementMappingConstraintEClass, AbstractElementMappingConstraint.class, "AbstractElementMappingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractElementMappingConstraint_AbstractElement(), this.getAbstractMemoryElement(), null, "abstractElement", null, 0, 1, AbstractElementMappingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationEClass, Classification.class, "Classification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassification_Condition(), this.getCondition(), "condition", null, 0, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassification_Grouping(), this.getGroupingType(), "grouping", null, 0, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreClassificationEClass, CoreClassification.class, "CoreClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoreClassification_Classifiers(), this.getCoreClassifier(), null, "classifiers", null, 0, -1, CoreClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryClassificationEClass, MemoryClassification.class, "MemoryClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryClassification_Classifiers(), this.getMemoryClassifier(), null, "classifiers", null, 0, -1, MemoryClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimuliModelEClass, StimuliModel.class, "StimuliModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStimuliModel_Stimuli(), this.getStimulus(), null, "stimuli", null, 0, -1, StimuliModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimuliModel_Clocks(), this.getClock(), null, "clocks", null, 0, -1, StimuliModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimulusEClass, Stimulus.class, "Stimulus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getDeviation());
		g2 = createEGenericType(this.getTime());
		g1.getETypeArguments().add(g2);
		initEReference(getStimulus_StimulusDeviation(), g1, null, "stimulusDeviation", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimulus_SetModeValueList(), this.getModeValueList(), null, "setModeValueList", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimulus_EnablingModeValueList(), this.getModeValueDisjunction(), null, "enablingModeValueList", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimulus_DisablingModeValueList(), this.getModeValueDisjunction(), null, "disablingModeValueList", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeValueListEClass, ModeValueList.class, "ModeValueList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeValueList_Entries(), this.getModeValue(), null, "entries", null, 0, -1, ModeValueList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeValueListEntryEClass, ModeValueListEntry.class, "ModeValueListEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeValueEClass, ModeValue.class, "ModeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeValue_ValueProvider(), this.getModeLabel(), null, "valueProvider", null, 1, 1, ModeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeValue_Value(), this.getModeLiteral(), null, "value", null, 1, 1, ModeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeValueConjunctionEClass, ModeValueConjunction.class, "ModeValueConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeValueConjunction_Entries(), this.getModeValue(), null, "entries", null, 1, -1, ModeValueConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeValueDisjunctionEClass, ModeValueDisjunction.class, "ModeValueDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeValueDisjunction_Entries(), this.getModeValueListEntry(), null, "entries", null, 0, -1, ModeValueDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicStimulusEClass, PeriodicStimulus.class, "PeriodicStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicStimulus_Offset(), this.getTime(), null, "offset", null, 0, 1, PeriodicStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicStimulus_Recurrence(), this.getTime(), null, "recurrence", null, 0, 1, PeriodicStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicStimulus_Clock(), this.getClock(), null, "clock", null, 0, 1, PeriodicStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRateStimulusEClass, VariableRateStimulus.class, "VariableRateStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(syntheticStimulusEClass, SyntheticStimulus.class, "SyntheticStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSyntheticStimulus_Offset(), this.getTime(), null, "offset", null, 0, 1, SyntheticStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSyntheticStimulus_Period(), this.getTime(), null, "period", null, 0, 1, SyntheticStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSyntheticStimulus_TriggerTimes(), this.getTimestampList(), null, "triggerTimes", null, 0, 1, SyntheticStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timestampListEClass, TimestampList.class, "TimestampList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimestampList_Timestamps(), this.getTime(), null, "timestamps", null, 0, -1, TimestampList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customStimulusEClass, CustomStimulus.class, "CustomStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomStimulus_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CustomStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleStimulusEClass, SingleStimulus.class, "SingleStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleStimulus_Activation(), this.getTime(), null, "activation", null, 0, 1, SingleStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interProcessStimulusEClass, InterProcessStimulus.class, "InterProcessStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterProcessStimulus_Counter(), this.getCounter(), null, "counter", null, 0, 1, InterProcessStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterProcessStimulus_ExplicitTriggers(), this.getInterProcessTrigger(), this.getInterProcessTrigger_StimulusLinkInt(), "explicitTriggers", null, 0, -1, InterProcessStimulus.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicStimulusEClass, SporadicStimulus.class, "SporadicStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicStimulus_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SporadicStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventStimulusEClass, EventStimulus.class, "EventStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventStimulus_TriggeringEvents(), this.getTriggerEvent(), null, "triggeringEvents", null, 1, -1, EventStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventStimulus_Counter(), this.getCounter(), null, "counter", null, 0, 1, EventStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalCurveStimulusEClass, ArrivalCurveStimulus.class, "ArrivalCurveStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrivalCurveStimulus_Entries(), this.getArrivalCurveEntry(), null, "entries", null, 0, -1, ArrivalCurveStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalCurveEntryEClass, ArrivalCurveEntry.class, "ArrivalCurveEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrivalCurveEntry_NumberOfEvents(), theEcorePackage.getEInt(), "numberOfEvents", "0", 0, 1, ArrivalCurveEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrivalCurveEntry_LowerTimeBorder(), this.getTime(), null, "lowerTimeBorder", null, 0, 1, ArrivalCurveEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrivalCurveEntry_UpperTimeBorder(), this.getTime(), null, "upperTimeBorder", null, 0, 1, ArrivalCurveEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockEClass, Clock.class, "Clock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockTriangleFunctionEClass, ClockTriangleFunction.class, "ClockTriangleFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockTriangleFunction_Shift(), this.getTime(), null, "shift", null, 0, 1, ClockTriangleFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockTriangleFunction_Period(), this.getTime(), null, "period", null, 0, 1, ClockTriangleFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockTriangleFunction_Max(), theEcorePackage.getEDouble(), "max", "0.0", 0, 1, ClockTriangleFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockTriangleFunction_Min(), theEcorePackage.getEDouble(), "min", "0.0", 0, 1, ClockTriangleFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockSinusFunctionEClass, ClockSinusFunction.class, "ClockSinusFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockSinusFunction_Shift(), this.getTime(), null, "shift", null, 0, 1, ClockSinusFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockSinusFunction_Period(), this.getTime(), null, "period", null, 0, 1, ClockSinusFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockSinusFunction_Amplitude(), theEcorePackage.getEDouble(), "amplitude", "0.0", 0, 1, ClockSinusFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockSinusFunction_YOffset(), theEcorePackage.getEDouble(), "yOffset", "0.0", 0, 1, ClockSinusFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockMultiplierListEClass, ClockMultiplierList.class, "ClockMultiplierList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockMultiplierList_Entries(), this.getClockMultiplierListEntry(), null, "entries", null, 0, -1, ClockMultiplierList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockMultiplierListEntryEClass, ClockMultiplierListEntry.class, "ClockMultiplierListEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClockMultiplierListEntry_Multiplier(), theEcorePackage.getEDouble(), "multiplier", "0.0", 0, 1, ClockMultiplierListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockMultiplierListEntry_Time(), this.getTime(), null, "time", null, 0, 1, ClockMultiplierListEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swModelEClass, SWModel.class, "SWModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSWModel_Isrs(), this.getISR(), null, "isrs", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_Tasks(), this.getTask(), null, "tasks", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_Runnables(), this.getRunnable(), null, "runnables", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_Labels(), this.getLabel(), null, "labels", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_Channels(), this.getChannel(), null, "channels", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_ProcessPrototypes(), this.getProcessPrototype(), null, "processPrototypes", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_Sections(), this.getSection(), null, "sections", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_Activations(), this.getActivation(), null, "activations", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_Events(), this.getOsEvent(), null, "events", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_TypeDefinitions(), this.getTypeDefinition(), null, "typeDefinitions", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_CustomEntities(), this.getCustomEntity(), null, "customEntities", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_ProcessChains(), this.getProcessChain(), null, "processChains", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_Modes(), this.getMode(), null, "modes", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSWModel_ModeLabels(), this.getModeLabel(), null, "modeLabels", null, 0, -1, SWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMemoryElementEClass, AbstractMemoryElement.class, "AbstractMemoryElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMemoryElement_Size(), this.getDataSize(), null, "size", null, 0, 1, AbstractMemoryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMemoryElement_Mappings(), this.getMemoryMapping(), this.getMemoryMapping_AbstractElementLinkInt(), "mappings", null, 0, -1, AbstractMemoryElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractProcessEClass, AbstractProcess.class, "AbstractProcess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customEntityEClass, CustomEntity.class, "CustomEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomEntity_TypeName(), theEcorePackage.getEString(), "typeName", null, 0, 1, CustomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processChainEClass, ProcessChain.class, "ProcessChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessChain_Processes(), this.getProcess(), null, "processes", null, 0, -1, ProcessChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, org.eclipse.app4mc.amalthea.model.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_CallGraph(), this.getCallGraph(), null, "callGraph", null, 0, 1, org.eclipse.app4mc.amalthea.model.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Stimuli(), this.getStimulus(), null, "stimuli", null, 0, -1, org.eclipse.app4mc.amalthea.model.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callGraphEClass, CallGraph.class, "CallGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallGraph_GraphEntries(), this.getGraphEntryBase(), null, "graphEntries", null, 0, -1, CallGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEntryBaseEClass, GraphEntryBase.class, "GraphEntryBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callSequenceEClass, CallSequence.class, "CallSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallSequence_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CallSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallSequence_Calls(), this.getCallSequenceItem(), null, "calls", null, 0, -1, CallSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeSwitchEClass, ModeSwitch.class, "ModeSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeSwitch_ValueProvider(), this.getModeLabel(), null, "valueProvider", null, 0, 1, ModeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModeSwitchEntry());
		g2 = createEGenericType(this.getGraphEntryBase());
		g1.getETypeArguments().add(g2);
		initEReference(getModeSwitch_Entries(), g1, null, "entries", null, 0, -1, ModeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModeSwitchDefault());
		g2 = createEGenericType(this.getGraphEntryBase());
		g1.getETypeArguments().add(g2);
		initEReference(getModeSwitch_DefaultEntry(), g1, null, "defaultEntry", null, 0, 1, ModeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeSwitchEntryEClass, ModeSwitchEntry.class, "ModeSwitchEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeSwitchEntry_Values(), this.getModeLiteral(), null, "values", null, 1, -1, ModeSwitchEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(modeSwitchEntryEClass_T);
		initEReference(getModeSwitchEntry_Items(), g1, null, "items", null, 0, -1, ModeSwitchEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeSwitchDefaultEClass, ModeSwitchDefault.class, "ModeSwitchDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(modeSwitchDefaultEClass_T);
		initEReference(getModeSwitchDefault_Items(), g1, null, "items", null, 0, -1, ModeSwitchDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilitySwitchEClass, ProbabilitySwitch.class, "ProbabilitySwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getProbabilitySwitchEntry());
		g2 = createEGenericType(this.getGraphEntryBase());
		g1.getETypeArguments().add(g2);
		initEReference(getProbabilitySwitch_Entries(), g1, null, "entries", null, 0, -1, ProbabilitySwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilitySwitchEntryEClass, ProbabilitySwitchEntry.class, "ProbabilitySwitchEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilitySwitchEntry_Probability(), theEcorePackage.getEDouble(), "probability", "0.0", 0, 1, ProbabilitySwitchEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(probabilitySwitchEntryEClass_T);
		initEReference(getProbabilitySwitchEntry_Items(), g1, null, "items", null, 0, -1, ProbabilitySwitchEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCounter_Prescaler(), theEcorePackage.getELong(), "prescaler", "1", 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_Offset(), theEcorePackage.getELong(), "offset", "0", 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callSequenceItemEClass, CallSequenceItem.class, "CallSequenceItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallSequenceItem_Counter(), this.getCounter(), null, "counter", null, 0, 1, CallSequenceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEventEClass, WaitEvent.class, "WaitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaitEvent_EventMask(), this.getEventMask(), null, "eventMask", null, 0, 1, WaitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitEvent_MaskType(), this.getWaitEventType(), "maskType", null, 0, 1, WaitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitEvent_WaitingBehaviour(), this.getWaitingBehaviour(), "waitingBehaviour", null, 0, 1, WaitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setEventEClass, SetEvent.class, "SetEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetEvent_EventMask(), this.getEventMask(), null, "eventMask", null, 0, 1, SetEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetEvent_Process(), this.getProcess(), null, "process", null, 0, 1, SetEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearEventEClass, ClearEvent.class, "ClearEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearEvent_EventMask(), this.getEventMask(), null, "eventMask", null, 0, 1, ClearEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventMaskEClass, EventMask.class, "EventMask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventMask_Events(), this.getOsEvent(), null, "events", null, 0, -1, EventMask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osEventEClass, OsEvent.class, "OsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsEvent_CommunicationOverheadInBit(), theEcorePackage.getEInt(), "communicationOverheadInBit", "0", 0, 1, OsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interProcessTriggerEClass, InterProcessTrigger.class, "InterProcessTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterProcessTrigger_Stimulus(), this.getInterProcessStimulus(), null, "stimulus", null, 1, 1, InterProcessTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterProcessTrigger_StimulusLinkInt(), this.getInterProcessStimulus(), this.getInterProcessStimulus_ExplicitTriggers(), "stimulusLinkInt", null, 1, 1, InterProcessTrigger.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enforcedMigrationEClass, EnforcedMigration.class, "EnforcedMigration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnforcedMigration_ResourceOwner(), this.getScheduler(), null, "resourceOwner", null, 0, 1, EnforcedMigration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRunnableCallEClass, TaskRunnableCall.class, "TaskRunnableCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRunnableCall_Runnable(), this.getRunnable(), null, "runnable", null, 1, 1, TaskRunnableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRunnableCall_Statistic(), this.getRunEntityCallStatistic(), null, "statistic", null, 0, 1, TaskRunnableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRunnableCall_RunnableLinkInt(), this.getRunnable(), this.getRunnable_TaskRunnableCalls(), "runnableLinkInt", null, 1, 1, TaskRunnableCall.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulePointEClass, SchedulePoint.class, "SchedulePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminateProcessEClass, TerminateProcess.class, "TerminateProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Preemption(), this.getPreemption(), "preemption", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_MultipleTaskActivationLimit(), theEcorePackage.getEInt(), "multipleTaskActivationLimit", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isrEClass, org.eclipse.app4mc.amalthea.model.ISR.class, "ISR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISR_Category(), this.getISRCategory(), "category", null, 0, 1, org.eclipse.app4mc.amalthea.model.ISR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPrototypeEClass, ProcessPrototype.class, "ProcessPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessPrototype_Preemption(), this.getPreemption(), "preemption", null, 0, 1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPrototype_FirstRunnable(), this.getRunnable(), null, "firstRunnable", null, 0, 1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPrototype_LastRunnable(), this.getRunnable(), null, "lastRunnable", null, 0, 1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPrototype_AccessPrecedenceSpec(), this.getAccessPrecedenceSpec(), null, "accessPrecedenceSpec", null, 0, -1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPrototype_OrderPrecedenceSpec(), this.getOrderPrecedenceSpec(), null, "orderPrecedenceSpec", null, 0, -1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPrototype_ChainedPrototypes(), this.getChainedProcessPrototype(), null, "chainedPrototypes", null, 0, -1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPrototype_Activation(), this.getActivation(), null, "activation", null, 0, 1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessPrototype_RunnableCalls(), this.getTaskRunnableCall(), null, "runnableCalls", null, 0, -1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainedProcessPrototypeEClass, ChainedProcessPrototype.class, "ChainedProcessPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainedProcessPrototype_Prototype(), this.getProcessPrototype(), null, "prototype", null, 1, 1, ChainedProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChainedProcessPrototype_Apply(), theEcorePackage.getEInt(), "apply", "0", 0, 1, ChainedProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChainedProcessPrototype_Offset(), theEcorePackage.getEInt(), "offset", "0", 0, 1, ChainedProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalPrecedenceEClass, GeneralPrecedence.class, "GeneralPrecedence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralPrecedence_Origin(), this.getRunnable(), null, "origin", null, 0, 1, GeneralPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralPrecedence_Target(), this.getRunnable(), null, "target", null, 0, 1, GeneralPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessPrecedenceSpecEClass, AccessPrecedenceSpec.class, "AccessPrecedenceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessPrecedenceSpec_Label(), this.getLabel(), null, "label", null, 0, 1, AccessPrecedenceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessPrecedenceSpec_OrderType(), this.getAccessPrecedenceType(), "orderType", null, 0, 1, AccessPrecedenceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderPrecedenceSpecEClass, OrderPrecedenceSpec.class, "OrderPrecedenceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderPrecedenceSpec_OrderType(), this.getOrderType(), "orderType", null, 0, 1, OrderPrecedenceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableEClass, org.eclipse.app4mc.amalthea.model.Runnable.class, "Runnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnable_RunnableItems(), this.getRunnableItem(), null, "runnableItems", null, 0, -1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_Activations(), this.getActivation(), null, "activations", null, 0, -1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_Deadline(), this.getTime(), null, "deadline", null, 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnable_Callback(), theEcorePackage.getEBoolean(), "callback", "false", 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnable_Service(), theEcorePackage.getEBoolean(), "service", "false", 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnable_AsilLevel(), this.getASILType(), "asilLevel", null, 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_RunnableCalls(), this.getRunnableCall(), this.getRunnableCall_RunnableLinkInt(), "runnableCalls", null, 0, -1, org.eclipse.app4mc.amalthea.model.Runnable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_TaskRunnableCalls(), this.getTaskRunnableCall(), this.getTaskRunnableCall_RunnableLinkInt(), "taskRunnableCalls", null, 0, -1, org.eclipse.app4mc.amalthea.model.Runnable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_Section(), this.getSection(), null, "section", null, 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_SectionLinkInt(), this.getSection(), this.getSection_Runnables(), "sectionLinkInt", null, 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRunnable__GetFirstActivation(), this.getActivation(), "getFirstActivation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabel_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Constant(), theEcorePackage.getEBoolean(), "constant", "false", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_BVolatile(), theEcorePackage.getEBoolean(), "bVolatile", "false", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_DataStability(), this.getLabelDataStability(), "dataStability", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_LabelAccesses(), this.getLabelAccess(), this.getLabelAccess_DataLinkInt(), "labelAccesses", null, 0, -1, Label.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_Section(), this.getSection(), null, "section", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_SectionLinkInt(), this.getSection(), this.getSection_Labels(), "sectionLinkInt", null, 0, 1, Label.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_ElementType(), this.getDataType(), null, "elementType", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_DefaultElements(), theEcorePackage.getEInt(), "defaultElements", "0", 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_MaxElements(), theEcorePackage.getEInt(), "maxElements", "0", 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_ChannelAccesses(), this.getChannelAccess(), this.getChannelAccess_DataLinkInt(), "channelAccesses", null, 0, -1, Channel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeLabelEClass, ModeLabel.class, "ModeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeLabel_Mode(), this.getMode(), null, "mode", null, 0, 1, ModeLabel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModeLabel_InitialValue(), this.getModeLiteral(), null, "initialValue", null, 1, 1, ModeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Labels(), this.getLabel(), this.getLabel_SectionLinkInt(), "labels", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Runnables(), this.getRunnable(), this.getRunnable_SectionLinkInt(), "runnables", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_AsilLevel(), this.getASILType(), "asilLevel", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableItemEClass, RunnableItem.class, "RunnableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRunnableItem__ContainerNotificationRequired(), theEcorePackage.getEBoolean(), "containerNotificationRequired", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(computationItemEClass, ComputationItem.class, "ComputationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runnableInstructionsEClass, RunnableInstructions.class, "RunnableInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableInstructions_Default(), this.getInstructions(), null, "default", null, 1, 1, RunnableInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableInstructions_Extended(), this.getRunnableInstructionsEntry(), null, "extended", null, 0, -1, RunnableInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableInstructionsEntryEClass, Map.Entry.class, "RunnableInstructionsEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableInstructionsEntry_Key(), this.getCoreType(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableInstructionsEntry_Value(), this.getInstructions(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeLabelAccessEClass, ModeLabelAccess.class, "ModeLabelAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeLabelAccess_Data(), this.getModeLabel(), null, "data", null, 1, 1, ModeLabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeLabelAccess_Access(), this.getLabelAccessEnum(), "access", null, 0, 1, ModeLabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeLabelAccess_ModeValue(), this.getModeLiteral(), null, "modeValue", null, 0, 1, ModeLabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableModeSwitchEClass, RunnableModeSwitch.class, "RunnableModeSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableModeSwitch_ValueProvider(), this.getModeLabel(), null, "valueProvider", null, 0, 1, RunnableModeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModeSwitchEntry());
		g2 = createEGenericType(this.getRunnableItem());
		g1.getETypeArguments().add(g2);
		initEReference(getRunnableModeSwitch_Entries(), g1, null, "entries", null, 0, -1, RunnableModeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModeSwitchDefault());
		g2 = createEGenericType(this.getRunnableItem());
		g1.getETypeArguments().add(g2);
		initEReference(getRunnableModeSwitch_DefaultEntry(), g1, null, "defaultEntry", null, 0, 1, RunnableModeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelAccessEClass, LabelAccess.class, "LabelAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelAccess_Data(), this.getLabel(), null, "data", null, 1, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelAccess_Access(), this.getLabelAccessEnum(), "access", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccess_Statistic(), this.getLabelAccessStatistic(), null, "statistic", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccess_TransmissionPolicy(), this.getTransmissionPolicy(), null, "transmissionPolicy", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelAccess_DataStability(), this.getLabelAccessDataStability(), "dataStability", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccess_DataLinkInt(), this.getLabel(), this.getLabel_LabelAccesses(), "dataLinkInt", null, 1, 1, LabelAccess.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelAccessEClass, ChannelAccess.class, "ChannelAccess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelAccess_Data(), this.getChannel(), null, "data", null, 1, 1, ChannelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelAccess_Elements(), theEcorePackage.getEInt(), "elements", "0", 0, 1, ChannelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelAccess_TransmissionPolicy(), this.getTransmissionPolicy(), null, "transmissionPolicy", null, 0, 1, ChannelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelAccess_DataLinkInt(), this.getChannel(), this.getChannel_ChannelAccesses(), "dataLinkInt", null, 1, 1, ChannelAccess.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelSendEClass, ChannelSend.class, "ChannelSend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelReceiveEClass, ChannelReceive.class, "ChannelReceive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelReceive_ReceiveOperation(), this.getReceiveOperation(), "receiveOperation", null, 0, 1, ChannelReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelReceive_DataMustBeNew(), theEcorePackage.getEBoolean(), "dataMustBeNew", "false", 0, 1, ChannelReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelReceive_ElementIndex(), theEcorePackage.getEInt(), "elementIndex", "0", 0, 1, ChannelReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelReceive_LowerBound(), theEcorePackage.getEInt(), "lowerBound", "0", 0, 1, ChannelReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semaphoreAccessEClass, SemaphoreAccess.class, "SemaphoreAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemaphoreAccess_Semaphore(), this.getSemaphore(), null, "semaphore", null, 1, 1, SemaphoreAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemaphoreAccess_Access(), this.getSemaphoreAccessEnum(), "access", null, 0, 1, SemaphoreAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemaphoreAccess_WaitingBehaviour(), this.getWaitingBehaviour(), "waitingBehaviour", null, 0, 1, SemaphoreAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreAccess_SemaphoreLinkInt(), this.getSemaphore(), this.getSemaphore_SemaphoreAccesses(), "semaphoreLinkInt", null, 1, 1, SemaphoreAccess.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderReceiverCommunicationEClass, SenderReceiverCommunication.class, "SenderReceiverCommunication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSenderReceiverCommunication_Buffered(), theEcorePackage.getEBoolean(), "buffered", "false", 0, 1, SenderReceiverCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverCommunication_Label(), this.getLabel(), null, "label", null, 1, 1, SenderReceiverCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderReceiverReadEClass, SenderReceiverRead.class, "SenderReceiverRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(senderReceiverWriteEClass, SenderReceiverWrite.class, "SenderReceiverWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderReceiverWrite_NotifiedRunnables(), this.getRunnable(), null, "notifiedRunnables", null, 0, -1, SenderReceiverWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverCallEClass, ServerCall.class, "ServerCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerCall_ServerRunnable(), this.getRunnable(), null, "serverRunnable", null, 1, 1, ServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronousServerCallEClass, SynchronousServerCall.class, "SynchronousServerCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchronousServerCall_WaitingBehaviour(), this.getWaitingBehaviour(), "waitingBehaviour", null, 0, 1, SynchronousServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchronousServerCallEClass, AsynchronousServerCall.class, "AsynchronousServerCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsynchronousServerCall_ResultRunnable(), this.getRunnable(), null, "resultRunnable", null, 0, 1, AsynchronousServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getResultServerCallEClass, GetResultServerCall.class, "GetResultServerCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetResultServerCall_BlockingType(), this.getBlockingType(), "blockingType", null, 0, 1, GetResultServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableProbabilitySwitchEClass, RunnableProbabilitySwitch.class, "RunnableProbabilitySwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getProbabilitySwitchEntry());
		g2 = createEGenericType(this.getRunnableItem());
		g1.getETypeArguments().add(g2);
		initEReference(getRunnableProbabilitySwitch_Entries(), g1, null, "entries", null, 0, -1, RunnableProbabilitySwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Ordered(), theEcorePackage.getEBoolean(), "ordered", "true", 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Items(), this.getRunnableItem(), null, "items", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableCallEClass, RunnableCall.class, "RunnableCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableCall_Runnable(), this.getRunnable(), null, "runnable", null, 1, 1, RunnableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableCall_Statistic(), this.getRunEntityCallStatistic(), null, "statistic", null, 0, 1, RunnableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableCall_RunnableLinkInt(), this.getRunnable(), this.getRunnable_RunnableCalls(), "runnableLinkInt", null, 1, 1, RunnableCall.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customEventTriggerEClass, CustomEventTrigger.class, "CustomEventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomEventTrigger_Event(), this.getCustomEvent(), null, "event", null, 1, 1, CustomEventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomEventTrigger_EventLinkInt(), this.getCustomEvent(), this.getCustomEvent_ExplicitTriggers(), "eventLinkInt", null, 1, 1, CustomEventTrigger.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compoundTypeEClass, CompoundType.class, "CompoundType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStruct_Entries(), this.getStructEntry(), null, "entries", null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structEntryEClass, StructEntry.class, "StructEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructEntry_Name(), theEcorePackage.getEString(), "name", null, 0, 1, StructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructEntry_DataType(), this.getDataType(), null, "dataType", null, 0, 1, StructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_NumberElements(), theEcorePackage.getEInt(), "numberElements", "0", 0, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArray_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointerEClass, Pointer.class, "Pointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointer_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Pointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeRef_TypeDef(), this.getTypeDefinition(), null, "typeDef", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPlatformMappingEClass, DataPlatformMapping.class, "DataPlatformMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPlatformMapping_PlatformName(), theEcorePackage.getEString(), "platformName", null, 0, 1, DataPlatformMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPlatformMapping_PlatformType(), theEcorePackage.getEString(), "platformType", null, 0, 1, DataPlatformMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeDefinitionEClass, DataTypeDefinition.class, "DataTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeDefinition_DataType(), this.getDataType(), null, "dataType", null, 0, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseTypeDefinitionEClass, BaseTypeDefinition.class, "BaseTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseTypeDefinition_Size(), this.getDataSize(), null, "size", null, 0, 1, BaseTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseTypeDefinition_DataMapping(), this.getDataPlatformMapping(), null, "dataMapping", null, 0, -1, BaseTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationEClass, Activation.class, "Activation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(periodicActivationEClass, PeriodicActivation.class, "PeriodicActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicActivation_Min(), this.getTime(), null, "min", null, 0, 1, PeriodicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivation_Max(), this.getTime(), null, "max", null, 0, 1, PeriodicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivation_Recurrence(), this.getTime(), null, "recurrence", null, 0, 1, PeriodicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivation_Offset(), this.getTime(), null, "offset", null, 0, 1, PeriodicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRateActivationEClass, VariableRateActivation.class, "VariableRateActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableRateActivation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, VariableRateActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getDeviation());
		g2 = createEGenericType(this.getTime());
		g1.getETypeArguments().add(g2);
		initEReference(getVariableRateActivation_ActivationDeviation(), g1, null, "activationDeviation", null, 0, 1, VariableRateActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicActivationEClass, SporadicActivation.class, "SporadicActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicActivation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SporadicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getDeviation());
		g2 = createEGenericType(this.getTime());
		g1.getETypeArguments().add(g2);
		initEReference(getSporadicActivation_ActivationDeviation(), g1, null, "activationDeviation", null, 0, 1, SporadicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleActivationEClass, SingleActivation.class, "SingleActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleActivation_Min(), this.getTime(), null, "min", null, 0, 1, SingleActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleActivation_Max(), this.getTime(), null, "max", null, 0, 1, SingleActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventActivationEClass, EventActivation.class, "EventActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventActivation_TriggeringEvents(), this.getTriggerEvent(), null, "triggeringEvents", null, 1, -1, EventActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventActivation_Counter(), this.getCounter(), null, "counter", null, 0, 1, EventActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customActivationEClass, CustomActivation.class, "CustomActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomActivation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CustomActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelAccessStatisticEClass, LabelAccessStatistic.class, "LabelAccessStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelAccessStatistic_Value(), this.getNumericStatistic(), null, "value", null, 0, 1, LabelAccessStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccessStatistic_CacheMisses(), this.getNumericStatistic(), null, "cacheMisses", null, 0, 1, LabelAccessStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionFetchEClass, InstructionFetch.class, "InstructionFetch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionFetch_Count(), this.getNumericStatistic(), null, "count", null, 0, 1, InstructionFetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionFetch_Misses(), this.getNumericStatistic(), null, "misses", null, 0, 1, InstructionFetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionFetch_CyclesPerFetch(), this.getNumericStatistic(), null, "cyclesPerFetch", null, 0, 1, InstructionFetch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runEntityCallStatisticEClass, RunEntityCallStatistic.class, "RunEntityCallStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunEntityCallStatistic_Statistic(), this.getNumericStatistic(), null, "statistic", null, 0, 1, RunEntityCallStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementModelEClass, MeasurementModel.class, "MeasurementModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementModel_Measurements(), this.getMeasurement(), null, "measurements", null, 0, -1, MeasurementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_Runtimes(), this.getTime(), null, "runtimes", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getDeviation());
		g2 = createEGenericType(this.getTime());
		g1.getETypeArguments().add(g2);
		initEReference(getMeasurement_RuntimeDeviation(), g1, null, "runtimeDeviation", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainMeasurementEClass, EventChainMeasurement.class, "EventChainMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainMeasurement_EventChain(), this.getEventChain(), null, "eventChain", null, 1, 1, EventChainMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskMeasurementEClass, TaskMeasurement.class, "TaskMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskMeasurement_Task(), this.getTask(), null, "task", null, 1, 1, TaskMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableMeasurementEClass, RunnableMeasurement.class, "RunnableMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableMeasurement_Runnable(), this.getRunnable(), null, "runnable", null, 1, 1, RunnableMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit._UNDEFINED_);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.S);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.US);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.NS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.PS);

		initEEnum(frequencyUnitEEnum, FrequencyUnit.class, "FrequencyUnit");
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit._UNDEFINED_);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.HZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.KHZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.MHZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.GHZ);

		initEEnum(dataSizeUnitEEnum, DataSizeUnit.class, "DataSizeUnit");
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit._UNDEFINED_);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.BIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.KBIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.MBIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.GBIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.TBIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.KIBIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.MIBIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.GIBIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.TIBIT);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.B);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.KB);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.MB);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.GB);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.TB);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.KI_B);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.MI_B);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.GI_B);
		addEEnumLiteral(dataSizeUnitEEnum, DataSizeUnit.TI_B);

		initEEnum(dataRateUnitEEnum, DataRateUnit.class, "DataRateUnit");
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit._UNDEFINED_);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.BIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.KBIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.MBIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.GBIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.TBIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.KIBIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.MIBIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.GIBIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.TIBIT_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.BPER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.KB_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.MB_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.GB_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.TB_PER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.KI_BPER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.MI_BPER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.GI_BPER_SECOND);
		addEEnumLiteral(dataRateUnitEEnum, DataRateUnit.TI_BPER_SECOND);

		initEEnum(samplingTypeEEnum, SamplingType.class, "SamplingType");
		addEEnumLiteral(samplingTypeEEnum, SamplingType.DEFAULT);
		addEEnumLiteral(samplingTypeEEnum, SamplingType.BEST_CASE);
		addEEnumLiteral(samplingTypeEEnum, SamplingType.WORST_CASE);
		addEEnumLiteral(samplingTypeEEnum, SamplingType.AVERAGE_CASE);
		addEEnumLiteral(samplingTypeEEnum, SamplingType.CORNER_CASE);
		addEEnumLiteral(samplingTypeEEnum, SamplingType.UNIFORM);

		initEEnum(interfaceKindEEnum, InterfaceKind.class, "InterfaceKind");
		addEEnumLiteral(interfaceKindEEnum, InterfaceKind._UNDEFINED_);
		addEEnumLiteral(interfaceKindEEnum, InterfaceKind.PROVIDES);
		addEEnumLiteral(interfaceKindEEnum, InterfaceKind.REQUIRES);

		initEEnum(runnableOrderTypeEEnum, RunnableOrderType.class, "RunnableOrderType");
		addEEnumLiteral(runnableOrderTypeEEnum, RunnableOrderType._UNDEFINED_);
		addEEnumLiteral(runnableOrderTypeEEnum, RunnableOrderType.SUCCESSOR);
		addEEnumLiteral(runnableOrderTypeEEnum, RunnableOrderType.IMMEDIATE_SUCCESSOR_START_SEQUENCE);
		addEEnumLiteral(runnableOrderTypeEEnum, RunnableOrderType.IMMEDIATE_SUCCESSOR_ANY_SEQUENCE);
		addEEnumLiteral(runnableOrderTypeEEnum, RunnableOrderType.IMMEDIATE_SUCCESSOR_END_SEQUENCE);

		initEEnum(synchronizationTypeEEnum, SynchronizationType.class, "SynchronizationType");
		addEEnumLiteral(synchronizationTypeEEnum, SynchronizationType._UNDEFINED_);
		addEEnumLiteral(synchronizationTypeEEnum, SynchronizationType.STIMULUS);
		addEEnumLiteral(synchronizationTypeEEnum, SynchronizationType.RESPONSE);

		initEEnum(mappingTypeEEnum, MappingType.class, "MappingType");
		addEEnumLiteral(mappingTypeEEnum, MappingType._UNDEFINED_);
		addEEnumLiteral(mappingTypeEEnum, MappingType.ONE_TO_ONE);
		addEEnumLiteral(mappingTypeEEnum, MappingType.REACTION);
		addEEnumLiteral(mappingTypeEEnum, MappingType.UNIQUE_REACTION);

		initEEnum(latencyTypeEEnum, LatencyType.class, "LatencyType");
		addEEnumLiteral(latencyTypeEEnum, LatencyType._UNDEFINED_);
		addEEnumLiteral(latencyTypeEEnum, LatencyType.AGE);
		addEEnumLiteral(latencyTypeEEnum, LatencyType.REACTION);

		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity._UNDEFINED_);
		addEEnumLiteral(severityEEnum, Severity.COSMETIC);
		addEEnumLiteral(severityEEnum, Severity.MINOR);
		addEEnumLiteral(severityEEnum, Severity.MAJOR);
		addEEnumLiteral(severityEEnum, Severity.CRITICAL);

		initEEnum(limitTypeEEnum, LimitType.class, "LimitType");
		addEEnumLiteral(limitTypeEEnum, LimitType._UNDEFINED_);
		addEEnumLiteral(limitTypeEEnum, LimitType.UPPER_LIMIT);
		addEEnumLiteral(limitTypeEEnum, LimitType.LOWER_LIMIT);

		initEEnum(timeMetricEEnum, TimeMetric.class, "TimeMetric");
		addEEnumLiteral(timeMetricEEnum, TimeMetric._UNDEFINED_);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.ACTIVATE_TO_ACTIVATE);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.CORE_EXECUTION_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.END_TO_END);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.GROSS_EXECUTION_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.LATENESS);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.MEMORY_ACCESS_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.NET_EXECUTION_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.OS_OVERHEAD);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.PARKING_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.POLLING_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.READY_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.RESPONSE_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.RUNNING_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.START_DELAY);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.START_TO_START);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.WAITING_TIME);

		initEEnum(countMetricEEnum, CountMetric.class, "CountMetric");
		addEEnumLiteral(countMetricEEnum, CountMetric._UNDEFINED_);
		addEEnumLiteral(countMetricEEnum, CountMetric.ACTIVATIONS);
		addEEnumLiteral(countMetricEEnum, CountMetric.BOUNDED_MIGRATIONS);
		addEEnumLiteral(countMetricEEnum, CountMetric.CACHE_HIT);
		addEEnumLiteral(countMetricEEnum, CountMetric.CACHE_MISS);
		addEEnumLiteral(countMetricEEnum, CountMetric.FULL_MIGRATIONS);
		addEEnumLiteral(countMetricEEnum, CountMetric.MTA_LIMIT_EXCEEDING);
		addEEnumLiteral(countMetricEEnum, CountMetric.PREEMPTIONS);

		initEEnum(percentageMetricEEnum, PercentageMetric.class, "PercentageMetric");
		addEEnumLiteral(percentageMetricEEnum, PercentageMetric._UNDEFINED_);
		addEEnumLiteral(percentageMetricEEnum, PercentageMetric.CACHE_HIT_RATIO);
		addEEnumLiteral(percentageMetricEEnum, PercentageMetric.CACHE_MISS_RATIO);
		addEEnumLiteral(percentageMetricEEnum, PercentageMetric.CORE_EXECUTION_TIME_RELATIVE);
		addEEnumLiteral(percentageMetricEEnum, PercentageMetric.MEMORY_ACCESS_TIME_RELATIVE);
		addEEnumLiteral(percentageMetricEEnum, PercentageMetric.NORMALIZED_LATENESS);
		addEEnumLiteral(percentageMetricEEnum, PercentageMetric.NORMALIZED_RESPONSE_TIME);
		addEEnumLiteral(percentageMetricEEnum, PercentageMetric.OS_OVERHEAD_RELATIVE);

		initEEnum(cpuPercentageMetricEEnum, CPUPercentageMetric.class, "CPUPercentageMetric");
		addEEnumLiteral(cpuPercentageMetricEEnum, CPUPercentageMetric._UNDEFINED_);
		addEEnumLiteral(cpuPercentageMetricEEnum, CPUPercentageMetric.CPU_BUFFERING);
		addEEnumLiteral(cpuPercentageMetricEEnum, CPUPercentageMetric.CPU_LOAD);
		addEEnumLiteral(cpuPercentageMetricEEnum, CPUPercentageMetric.CPU_PARKING);
		addEEnumLiteral(cpuPercentageMetricEEnum, CPUPercentageMetric.CPU_POLLING);
		addEEnumLiteral(cpuPercentageMetricEEnum, CPUPercentageMetric.CPU_READY);
		addEEnumLiteral(cpuPercentageMetricEEnum, CPUPercentageMetric.CPU_RUNNING);
		addEEnumLiteral(cpuPercentageMetricEEnum, CPUPercentageMetric.CPU_WAITING);

		initEEnum(frequencyMetricEEnum, FrequencyMetric.class, "FrequencyMetric");
		addEEnumLiteral(frequencyMetricEEnum, FrequencyMetric._UNDEFINED_);
		addEEnumLiteral(frequencyMetricEEnum, FrequencyMetric.CACHE_HIT_FREQUENCY);
		addEEnumLiteral(frequencyMetricEEnum, FrequencyMetric.CACHE_MISS_FREQUENCY);

		initEEnum(coherencyDirectionEEnum, CoherencyDirection.class, "CoherencyDirection");
		addEEnumLiteral(coherencyDirectionEEnum, CoherencyDirection._UNDEFINED_);
		addEEnumLiteral(coherencyDirectionEEnum, CoherencyDirection.INPUT);
		addEEnumLiteral(coherencyDirectionEEnum, CoherencyDirection.OUTPUT);

		initEEnum(processEventTypeEEnum, ProcessEventType.class, "ProcessEventType");
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType._ALL_);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.ACTIVATE);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.DEADLINE);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.START);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.RESUME);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.PREEMPT);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.POLL);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.RUN);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.WAIT);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.POLL_PARKING);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.PARK);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.RELEASE_PARKING);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.RELEASE);
		addEEnumLiteral(processEventTypeEEnum, ProcessEventType.TERMINATE);

		initEEnum(runnableEventTypeEEnum, RunnableEventType.class, "RunnableEventType");
		addEEnumLiteral(runnableEventTypeEEnum, RunnableEventType._ALL_);
		addEEnumLiteral(runnableEventTypeEEnum, RunnableEventType.START);
		addEEnumLiteral(runnableEventTypeEEnum, RunnableEventType.SUSPEND);
		addEEnumLiteral(runnableEventTypeEEnum, RunnableEventType.RESUME);
		addEEnumLiteral(runnableEventTypeEEnum, RunnableEventType.TERMINATE);

		initEEnum(labelEventTypeEEnum, LabelEventType.class, "LabelEventType");
		addEEnumLiteral(labelEventTypeEEnum, LabelEventType._ALL_);
		addEEnumLiteral(labelEventTypeEEnum, LabelEventType.READ);
		addEEnumLiteral(labelEventTypeEEnum, LabelEventType.WRITE);

		initEEnum(channelEventTypeEEnum, ChannelEventType.class, "ChannelEventType");
		addEEnumLiteral(channelEventTypeEEnum, ChannelEventType._ALL_);
		addEEnumLiteral(channelEventTypeEEnum, ChannelEventType.SEND);
		addEEnumLiteral(channelEventTypeEEnum, ChannelEventType.RECEIVE);

		initEEnum(semaphoreEventTypeEEnum, SemaphoreEventType.class, "SemaphoreEventType");
		addEEnumLiteral(semaphoreEventTypeEEnum, SemaphoreEventType._ALL_);
		addEEnumLiteral(semaphoreEventTypeEEnum, SemaphoreEventType.LOCK);
		addEEnumLiteral(semaphoreEventTypeEEnum, SemaphoreEventType.UNLOCK);

		initEEnum(qTypeEEnum, QType.class, "QType");
		addEEnumLiteral(qTypeEEnum, QType._UNDEFINED_);
		addEEnumLiteral(qTypeEEnum, QType.DYNAMIC);
		addEEnumLiteral(qTypeEEnum, QType.STATIC);

		initEEnum(memoryTypeEnumEEnum, MemoryTypeEnum.class, "MemoryTypeEnum");
		addEEnumLiteral(memoryTypeEnumEEnum, MemoryTypeEnum._UNDEFINED_);
		addEEnumLiteral(memoryTypeEnumEEnum, MemoryTypeEnum.RAM);
		addEEnumLiteral(memoryTypeEnumEEnum, MemoryTypeEnum.CACHE);
		addEEnumLiteral(memoryTypeEnumEEnum, MemoryTypeEnum.FLASH_INT);
		addEEnumLiteral(memoryTypeEnumEEnum, MemoryTypeEnum.FLASH_EXT);

		initEEnum(busTypeEEnum, BusType.class, "BusType");
		addEEnumLiteral(busTypeEEnum, BusType._UNDEFINED_);
		addEEnumLiteral(busTypeEEnum, BusType.CAN);
		addEEnumLiteral(busTypeEEnum, BusType.TTCAN);
		addEEnumLiteral(busTypeEEnum, BusType.LIN);
		addEEnumLiteral(busTypeEEnum, BusType.FLEXRAY);
		addEEnumLiteral(busTypeEEnum, BusType.ETHERNET);
		addEEnumLiteral(busTypeEEnum, BusType.SPI);
		addEEnumLiteral(busTypeEEnum, BusType.NA);

		initEEnum(rwTypeEEnum, RWType.class, "RWType");
		addEEnumLiteral(rwTypeEEnum, RWType._UNDEFINED_);
		addEEnumLiteral(rwTypeEEnum, RWType.R);
		addEEnumLiteral(rwTypeEEnum, RWType.W);
		addEEnumLiteral(rwTypeEEnum, RWType.RW);

		initEEnum(schedTypeEEnum, SchedType.class, "SchedType");
		addEEnumLiteral(schedTypeEEnum, SchedType._UNDEFINED_);
		addEEnumLiteral(schedTypeEEnum, SchedType.RROBIN);
		addEEnumLiteral(schedTypeEEnum, SchedType.PRIORITY);

		initEEnum(pinTypeEEnum, PinType.class, "PinType");
		addEEnumLiteral(pinTypeEEnum, PinType._UNDEFINED_);
		addEEnumLiteral(pinTypeEEnum, PinType.ANALOG);
		addEEnumLiteral(pinTypeEEnum, PinType.DIGITAL);

		initEEnum(memoryAddressMappingTypeEEnum, MemoryAddressMappingType.class, "MemoryAddressMappingType");
		addEEnumLiteral(memoryAddressMappingTypeEEnum, MemoryAddressMappingType._UNDEFINED_);
		addEEnumLiteral(memoryAddressMappingTypeEEnum, MemoryAddressMappingType.NONE);
		addEEnumLiteral(memoryAddressMappingTypeEEnum, MemoryAddressMappingType.ADDRESS);
		addEEnumLiteral(memoryAddressMappingTypeEEnum, MemoryAddressMappingType.OFFSET);

		initEEnum(osDataConsistencyModeEEnum, OsDataConsistencyMode.class, "OsDataConsistencyMode");
		addEEnumLiteral(osDataConsistencyModeEEnum, OsDataConsistencyMode._UNDEFINED_);
		addEEnumLiteral(osDataConsistencyModeEEnum, OsDataConsistencyMode.NO_PROTECTION);
		addEEnumLiteral(osDataConsistencyModeEEnum, OsDataConsistencyMode.AUTOMATIC_PROTECTION);
		addEEnumLiteral(osDataConsistencyModeEEnum, OsDataConsistencyMode.CUSTOM_PROTECTION);
		addEEnumLiteral(osDataConsistencyModeEEnum, OsDataConsistencyMode.HANDLED_BY_MODEL_ELEMENTS);

		initEEnum(accessMultiplicityEEnum, AccessMultiplicity.class, "AccessMultiplicity");
		addEEnumLiteral(accessMultiplicityEEnum, AccessMultiplicity._UNDEFINED_);
		addEEnumLiteral(accessMultiplicityEEnum, AccessMultiplicity.SINGLE_ACCESS);
		addEEnumLiteral(accessMultiplicityEEnum, AccessMultiplicity.MULTIPLE_ACCESSES);

		initEEnum(dataStabilityLevelEEnum, DataStabilityLevel.class, "DataStabilityLevel");
		addEEnumLiteral(dataStabilityLevelEEnum, DataStabilityLevel._UNDEFINED_);
		addEEnumLiteral(dataStabilityLevelEEnum, DataStabilityLevel.PROCESS);
		addEEnumLiteral(dataStabilityLevelEEnum, DataStabilityLevel.RUNNABLE);
		addEEnumLiteral(dataStabilityLevelEEnum, DataStabilityLevel.SCHEDULE_SECTION);

		initEEnum(semaphoreTypeEEnum, SemaphoreType.class, "SemaphoreType");
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType._UNDEFINED_);
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType.COUNTING_SEMAPHORE);
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType.RESOURCE);
		addEEnumLiteral(semaphoreTypeEEnum, SemaphoreType.SPINLOCK);

		initEEnum(conditionEEnum, Condition.class, "Condition");
		addEEnumLiteral(conditionEEnum, Condition._UNDEFINED_);
		addEEnumLiteral(conditionEEnum, Condition.REQUIRES);
		addEEnumLiteral(conditionEEnum, Condition.EXCLUDES);

		initEEnum(groupingTypeEEnum, GroupingType.class, "GroupingType");
		addEEnumLiteral(groupingTypeEEnum, GroupingType._UNDEFINED_);
		addEEnumLiteral(groupingTypeEEnum, GroupingType.ALL_OF_THEM);
		addEEnumLiteral(groupingTypeEEnum, GroupingType.AT_LEAST_ONE_OF_THEM);

		initEEnum(waitEventTypeEEnum, WaitEventType.class, "WaitEventType");
		addEEnumLiteral(waitEventTypeEEnum, WaitEventType._UNDEFINED_);
		addEEnumLiteral(waitEventTypeEEnum, WaitEventType.AND);
		addEEnumLiteral(waitEventTypeEEnum, WaitEventType.OR);

		initEEnum(waitingBehaviourEEnum, WaitingBehaviour.class, "WaitingBehaviour");
		addEEnumLiteral(waitingBehaviourEEnum, WaitingBehaviour._UNDEFINED_);
		addEEnumLiteral(waitingBehaviourEEnum, WaitingBehaviour.ACTIVE);
		addEEnumLiteral(waitingBehaviourEEnum, WaitingBehaviour.PASSIVE);

		initEEnum(isrCategoryEEnum, ISRCategory.class, "ISRCategory");
		addEEnumLiteral(isrCategoryEEnum, ISRCategory._UNDEFINED_);
		addEEnumLiteral(isrCategoryEEnum, ISRCategory.CATEGORY_1);
		addEEnumLiteral(isrCategoryEEnum, ISRCategory.CATEGORY_2);

		initEEnum(accessPrecedenceTypeEEnum, AccessPrecedenceType.class, "AccessPrecedenceType");
		addEEnumLiteral(accessPrecedenceTypeEEnum, AccessPrecedenceType._UNDEFINED_);
		addEEnumLiteral(accessPrecedenceTypeEEnum, AccessPrecedenceType.DEFAULT_WR);
		addEEnumLiteral(accessPrecedenceTypeEEnum, AccessPrecedenceType.IGNORE_WR);
		addEEnumLiteral(accessPrecedenceTypeEEnum, AccessPrecedenceType.ENFORCE_RW);

		initEEnum(orderTypeEEnum, OrderType.class, "OrderType");
		addEEnumLiteral(orderTypeEEnum, OrderType._UNDEFINED_);
		addEEnumLiteral(orderTypeEEnum, OrderType.ORDER);
		addEEnumLiteral(orderTypeEEnum, OrderType.DIRECT_ORDER);
		addEEnumLiteral(orderTypeEEnum, OrderType.START_SEQUENCE);
		addEEnumLiteral(orderTypeEEnum, OrderType.END_SEQUENCE);

		initEEnum(labelDataStabilityEEnum, LabelDataStability.class, "LabelDataStability");
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability._UNDEFINED_);
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability.NO_PROTECTION);
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability.AUTOMATIC_PROTECTION);
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability.CUSTOM_PROTECTION);
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability.HANDLED_BY_MODEL_ELEMENTS);

		initEEnum(receiveOperationEEnum, ReceiveOperation.class, "ReceiveOperation");
		addEEnumLiteral(receiveOperationEEnum, ReceiveOperation._UNDEFINED_);
		addEEnumLiteral(receiveOperationEEnum, ReceiveOperation.FIFO_READ);
		addEEnumLiteral(receiveOperationEEnum, ReceiveOperation.FIFO_TAKE);
		addEEnumLiteral(receiveOperationEEnum, ReceiveOperation.LIFO_READ);
		addEEnumLiteral(receiveOperationEEnum, ReceiveOperation.LIFO_TAKE);

		initEEnum(labelAccessDataStabilityEEnum, LabelAccessDataStability.class, "LabelAccessDataStability");
		addEEnumLiteral(labelAccessDataStabilityEEnum, LabelAccessDataStability._UNDEFINED_);
		addEEnumLiteral(labelAccessDataStabilityEEnum, LabelAccessDataStability.INHERITED);
		addEEnumLiteral(labelAccessDataStabilityEEnum, LabelAccessDataStability.NO_PROTECTION);
		addEEnumLiteral(labelAccessDataStabilityEEnum, LabelAccessDataStability.AUTOMATIC_PROTECTION);
		addEEnumLiteral(labelAccessDataStabilityEEnum, LabelAccessDataStability.CUSTOM_PROTECTION);
		addEEnumLiteral(labelAccessDataStabilityEEnum, LabelAccessDataStability.HANDLED_BY_MODEL_ELEMENTS);

		initEEnum(labelAccessEnumEEnum, LabelAccessEnum.class, "LabelAccessEnum");
		addEEnumLiteral(labelAccessEnumEEnum, LabelAccessEnum._UNDEFINED_);
		addEEnumLiteral(labelAccessEnumEEnum, LabelAccessEnum.READ);
		addEEnumLiteral(labelAccessEnumEEnum, LabelAccessEnum.WRITE);

		initEEnum(semaphoreAccessEnumEEnum, SemaphoreAccessEnum.class, "SemaphoreAccessEnum");
		addEEnumLiteral(semaphoreAccessEnumEEnum, SemaphoreAccessEnum._UNDEFINED_);
		addEEnumLiteral(semaphoreAccessEnumEEnum, SemaphoreAccessEnum.REQUEST);
		addEEnumLiteral(semaphoreAccessEnumEEnum, SemaphoreAccessEnum.EXCLUSIVE);
		addEEnumLiteral(semaphoreAccessEnumEEnum, SemaphoreAccessEnum.RELEASE);

		initEEnum(blockingTypeEEnum, BlockingType.class, "BlockingType");
		addEEnumLiteral(blockingTypeEEnum, BlockingType._UNDEFINED_);
		addEEnumLiteral(blockingTypeEEnum, BlockingType.ACTIVE_WAIT);
		addEEnumLiteral(blockingTypeEEnum, BlockingType.PASSIVE_WAIT);
		addEEnumLiteral(blockingTypeEEnum, BlockingType.NON_BLOCKING);

		initEEnum(preemptionEEnum, Preemption.class, "Preemption");
		addEEnumLiteral(preemptionEEnum, Preemption._UNDEFINED_);
		addEEnumLiteral(preemptionEEnum, Preemption.PREEMPTIVE);
		addEEnumLiteral(preemptionEEnum, Preemption.COOPERATIVE);
		addEEnumLiteral(preemptionEEnum, Preemption.NON_PREEMPTIVE);

		initEEnum(concurrencyTypeEEnum, ConcurrencyType.class, "ConcurrencyType");
		addEEnumLiteral(concurrencyTypeEEnum, ConcurrencyType._UNDEFINED_);
		addEEnumLiteral(concurrencyTypeEEnum, ConcurrencyType.SINGLE_CORE_SAFE);
		addEEnumLiteral(concurrencyTypeEEnum, ConcurrencyType.MULTI_CORE_SAFE);
		addEEnumLiteral(concurrencyTypeEEnum, ConcurrencyType.SINGLE_CORE_PRIO_SAFE);

		initEEnum(asilTypeEEnum, ASILType.class, "ASILType");
		addEEnumLiteral(asilTypeEEnum, ASILType._UNDEFINED_);
		addEEnumLiteral(asilTypeEEnum, ASILType.D);
		addEEnumLiteral(asilTypeEEnum, ASILType.C);
		addEEnumLiteral(asilTypeEEnum, ASILType.B);
		addEEnumLiteral(asilTypeEEnum, ASILType.A);
		addEEnumLiteral(asilTypeEEnum, ASILType.QM);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

} //AmaltheaPackageImpl
