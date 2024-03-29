/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AffinityConstraint;
import org.eclipse.app4mc.amalthea.model.Algorithm;
import org.eclipse.app4mc.amalthea.model.Alias;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ArchitectureRequirement;
import org.eclipse.app4mc.amalthea.model.Array;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition;
import org.eclipse.app4mc.amalthea.model.BigIntegerObject;
import org.eclipse.app4mc.amalthea.model.BooleanObject;
import org.eclipse.app4mc.amalthea.model.BoundedContinuousValueDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteValueDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.CacheDefinition;
import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
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
import org.eclipse.app4mc.amalthea.model.ClockFunction;
import org.eclipse.app4mc.amalthea.model.ClockStep;
import org.eclipse.app4mc.amalthea.model.ClockStepList;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentEvent;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.ComponentScope;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.Composite;
import org.eclipse.app4mc.amalthea.model.CompoundType;
import org.eclipse.app4mc.amalthea.model.ComputationItem;
import org.eclipse.app4mc.amalthea.model.ConfigModel;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition;
import org.eclipse.app4mc.amalthea.model.Connector;
import org.eclipse.app4mc.amalthea.model.ConstantBandwidthServer;
import org.eclipse.app4mc.amalthea.model.ConstantBandwidthServerWithCASH;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueBoundaries;
import org.eclipse.app4mc.amalthea.model.ContinuousValueConstant;
import org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueHistogram;
import org.eclipse.app4mc.amalthea.model.ContinuousValueHistogramEntry;
import org.eclipse.app4mc.amalthea.model.ContinuousValueInterval;
import org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics;
import org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.CoreAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.CoreClassification;
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Counter;
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
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.DataGroupScope;
import org.eclipse.app4mc.amalthea.model.DataPairingConstraint;
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
import org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueBoundaries;
import org.eclipse.app4mc.amalthea.model.DiscreteValueConstant;
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueHistogram;
import org.eclipse.app4mc.amalthea.model.DiscreteValueHistogramEntry;
import org.eclipse.app4mc.amalthea.model.DiscreteValueInterval;
import org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics;
import org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.DoubleObject;
import org.eclipse.app4mc.amalthea.model.DynamicPriority;
import org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst;
import org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EntityEvent;
import org.eclipse.app4mc.amalthea.model.EnumMode;
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
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.FixedPeriodic;
import org.eclipse.app4mc.amalthea.model.FixedPriority;
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptive;
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptiveWithBudgetEnforcement;
import org.eclipse.app4mc.amalthea.model.FloatObject;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.GeneralPrecedence;
import org.eclipse.app4mc.amalthea.model.GetResultServerCall;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.Grouping;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwDestination;
import org.eclipse.app4mc.amalthea.model.HwDomain;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwPath;
import org.eclipse.app4mc.amalthea.model.HwPathElement;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.ICallGraphItemContainer;
import org.eclipse.app4mc.amalthea.model.IContinuousValueDeviation;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
import org.eclipse.app4mc.amalthea.model.IDisplayName;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.ISystem;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.ITimeDeviation;
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
import org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst;
import org.eclipse.app4mc.amalthea.model.ListObject;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.Measurement;
import org.eclipse.app4mc.amalthea.model.MeasurementModel;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryClassification;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint;
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeAssignment;
import org.eclipse.app4mc.amalthea.model.ModeCondition;
import org.eclipse.app4mc.amalthea.model.ModeConditionConjunction;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunctionEntry;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.ModeValue;
import org.eclipse.app4mc.amalthea.model.ModeValueList;
import org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency;
import org.eclipse.app4mc.amalthea.model.NumericMode;
import org.eclipse.app4mc.amalthea.model.NumericStatistic;
import org.eclipse.app4mc.amalthea.model.OSEK;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.OsAPIOverhead;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.OsISROverhead;
import org.eclipse.app4mc.amalthea.model.OsOverhead;
import org.eclipse.app4mc.amalthea.model.PairingConstraint;
import org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.PartlyPFairPD2;
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.Pfair;
import org.eclipse.app4mc.amalthea.model.PfairPD2;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.Pointer;
import org.eclipse.app4mc.amalthea.model.PollingPeriodicServer;
import org.eclipse.app4mc.amalthea.model.Port;
import org.eclipse.app4mc.amalthea.model.PowerDomain;
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
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.app4mc.amalthea.model.Quantity;
import org.eclipse.app4mc.amalthea.model.RateMonotonic;
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
import org.eclipse.app4mc.amalthea.model.RunnableGroup;
import org.eclipse.app4mc.amalthea.model.RunnableMeasurement;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.RunnableRequirement;
import org.eclipse.app4mc.amalthea.model.RunnableScope;
import org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Scenario;
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
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.StimulusEvent;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.Struct;
import org.eclipse.app4mc.amalthea.model.StructEntry;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.model.SynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.SynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.TagGroup;
import org.eclipse.app4mc.amalthea.model.TargetCore;
import org.eclipse.app4mc.amalthea.model.TargetMemory;
import org.eclipse.app4mc.amalthea.model.TargetScheduler;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskMeasurement;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.TerminateProcess;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution;
import org.eclipse.app4mc.amalthea.model.TimeBoundaries;
import org.eclipse.app4mc.amalthea.model.TimeConstant;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.model.TimeHistogram;
import org.eclipse.app4mc.amalthea.model.TimeHistogramEntry;
import org.eclipse.app4mc.amalthea.model.TimeInterval;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeStatistics;
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution;
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.TimingConstraint;
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy;
import org.eclipse.app4mc.amalthea.model.TriggerEvent;
import org.eclipse.app4mc.amalthea.model.TruncatedContinuousValueDistribution;
import org.eclipse.app4mc.amalthea.model.TruncatedDiscreteValueDistribution;
import org.eclipse.app4mc.amalthea.model.TruncatedTimeDistribution;
import org.eclipse.app4mc.amalthea.model.TypeDefinition;
import org.eclipse.app4mc.amalthea.model.TypeRef;
import org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.amalthea.model.VariableRateActivation;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.VendorOperatingSystem;
import org.eclipse.app4mc.amalthea.model.Voltage;
import org.eclipse.app4mc.amalthea.model.WaitEvent;

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
			public Adapter caseTransmissionPolicy(TransmissionPolicy object) {
				return createTransmissionPolicyAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseTimeComparable(Comparable<Time> object) {
				return createTimeComparableAdapter();
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
			public Adapter caseVoltage(Voltage object) {
				return createVoltageAdapter();
			}
			@Override
			public Adapter caseDataSize(DataSize object) {
				return createDataSizeAdapter();
			}
			@Override
			public Adapter caseDataRateComparable(Comparable<DataRate> object) {
				return createDataRateComparableAdapter();
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
			public Adapter caseITimeDeviation(ITimeDeviation object) {
				return createITimeDeviationAdapter();
			}
			@Override
			public Adapter caseTimeInterval(TimeInterval object) {
				return createTimeIntervalAdapter();
			}
			@Override
			public Adapter caseTimeConstant(TimeConstant object) {
				return createTimeConstantAdapter();
			}
			@Override
			public Adapter caseTimeHistogram(TimeHistogram object) {
				return createTimeHistogramAdapter();
			}
			@Override
			public Adapter caseTimeHistogramEntry(TimeHistogramEntry object) {
				return createTimeHistogramEntryAdapter();
			}
			@Override
			public Adapter caseBoundedTimeDistribution(BoundedTimeDistribution object) {
				return createBoundedTimeDistributionAdapter();
			}
			@Override
			public Adapter caseTruncatedTimeDistribution(TruncatedTimeDistribution object) {
				return createTruncatedTimeDistributionAdapter();
			}
			@Override
			public Adapter caseTimeBoundaries(TimeBoundaries object) {
				return createTimeBoundariesAdapter();
			}
			@Override
			public Adapter caseTimeStatistics(TimeStatistics object) {
				return createTimeStatisticsAdapter();
			}
			@Override
			public Adapter caseTimeUniformDistribution(TimeUniformDistribution object) {
				return createTimeUniformDistributionAdapter();
			}
			@Override
			public Adapter caseTimeGaussDistribution(TimeGaussDistribution object) {
				return createTimeGaussDistributionAdapter();
			}
			@Override
			public Adapter caseTimeWeibullEstimatorsDistribution(TimeWeibullEstimatorsDistribution object) {
				return createTimeWeibullEstimatorsDistributionAdapter();
			}
			@Override
			public Adapter caseTimeBetaDistribution(TimeBetaDistribution object) {
				return createTimeBetaDistributionAdapter();
			}
			@Override
			public Adapter caseIDiscreteValueDeviation(IDiscreteValueDeviation object) {
				return createIDiscreteValueDeviationAdapter();
			}
			@Override
			public Adapter caseDiscreteValueInterval(DiscreteValueInterval object) {
				return createDiscreteValueIntervalAdapter();
			}
			@Override
			public Adapter caseDiscreteValueConstant(DiscreteValueConstant object) {
				return createDiscreteValueConstantAdapter();
			}
			@Override
			public Adapter caseDiscreteValueHistogram(DiscreteValueHistogram object) {
				return createDiscreteValueHistogramAdapter();
			}
			@Override
			public Adapter caseDiscreteValueHistogramEntry(DiscreteValueHistogramEntry object) {
				return createDiscreteValueHistogramEntryAdapter();
			}
			@Override
			public Adapter caseBoundedDiscreteValueDistribution(BoundedDiscreteValueDistribution object) {
				return createBoundedDiscreteValueDistributionAdapter();
			}
			@Override
			public Adapter caseTruncatedDiscreteValueDistribution(TruncatedDiscreteValueDistribution object) {
				return createTruncatedDiscreteValueDistributionAdapter();
			}
			@Override
			public Adapter caseDiscreteValueBoundaries(DiscreteValueBoundaries object) {
				return createDiscreteValueBoundariesAdapter();
			}
			@Override
			public Adapter caseDiscreteValueStatistics(DiscreteValueStatistics object) {
				return createDiscreteValueStatisticsAdapter();
			}
			@Override
			public Adapter caseDiscreteValueUniformDistribution(DiscreteValueUniformDistribution object) {
				return createDiscreteValueUniformDistributionAdapter();
			}
			@Override
			public Adapter caseDiscreteValueGaussDistribution(DiscreteValueGaussDistribution object) {
				return createDiscreteValueGaussDistributionAdapter();
			}
			@Override
			public Adapter caseDiscreteValueWeibullEstimatorsDistribution(DiscreteValueWeibullEstimatorsDistribution object) {
				return createDiscreteValueWeibullEstimatorsDistributionAdapter();
			}
			@Override
			public Adapter caseDiscreteValueBetaDistribution(DiscreteValueBetaDistribution object) {
				return createDiscreteValueBetaDistributionAdapter();
			}
			@Override
			public Adapter caseIContinuousValueDeviation(IContinuousValueDeviation object) {
				return createIContinuousValueDeviationAdapter();
			}
			@Override
			public Adapter caseContinuousValueInterval(ContinuousValueInterval object) {
				return createContinuousValueIntervalAdapter();
			}
			@Override
			public Adapter caseContinuousValueConstant(ContinuousValueConstant object) {
				return createContinuousValueConstantAdapter();
			}
			@Override
			public Adapter caseContinuousValueHistogram(ContinuousValueHistogram object) {
				return createContinuousValueHistogramAdapter();
			}
			@Override
			public Adapter caseContinuousValueHistogramEntry(ContinuousValueHistogramEntry object) {
				return createContinuousValueHistogramEntryAdapter();
			}
			@Override
			public Adapter caseBoundedContinuousValueDistribution(BoundedContinuousValueDistribution object) {
				return createBoundedContinuousValueDistributionAdapter();
			}
			@Override
			public Adapter caseTruncatedContinuousValueDistribution(TruncatedContinuousValueDistribution object) {
				return createTruncatedContinuousValueDistributionAdapter();
			}
			@Override
			public Adapter caseContinuousValueBoundaries(ContinuousValueBoundaries object) {
				return createContinuousValueBoundariesAdapter();
			}
			@Override
			public Adapter caseContinuousValueStatistics(ContinuousValueStatistics object) {
				return createContinuousValueStatisticsAdapter();
			}
			@Override
			public Adapter caseContinuousValueUniformDistribution(ContinuousValueUniformDistribution object) {
				return createContinuousValueUniformDistributionAdapter();
			}
			@Override
			public Adapter caseContinuousValueGaussDistribution(ContinuousValueGaussDistribution object) {
				return createContinuousValueGaussDistributionAdapter();
			}
			@Override
			public Adapter caseContinuousValueWeibullEstimatorsDistribution(ContinuousValueWeibullEstimatorsDistribution object) {
				return createContinuousValueWeibullEstimatorsDistributionAdapter();
			}
			@Override
			public Adapter caseContinuousValueBetaDistribution(ContinuousValueBetaDistribution object) {
				return createContinuousValueBetaDistributionAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseNumericMode(NumericMode object) {
				return createNumericModeAdapter();
			}
			@Override
			public Adapter caseEnumMode(EnumMode object) {
				return createEnumModeAdapter();
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
			public Adapter caseHwStructure(HwStructure object) {
				return createHwStructureAdapter();
			}
			@Override
			public Adapter caseHwModule(HwModule object) {
				return createHwModuleAdapter();
			}
			@Override
			public Adapter caseHwDomain(HwDomain object) {
				return createHwDomainAdapter();
			}
			@Override
			public Adapter caseFrequencyDomain(FrequencyDomain object) {
				return createFrequencyDomainAdapter();
			}
			@Override
			public Adapter casePowerDomain(PowerDomain object) {
				return createPowerDomainAdapter();
			}
			@Override
			public Adapter caseProcessingUnit(ProcessingUnit object) {
				return createProcessingUnitAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseCache(Cache object) {
				return createCacheAdapter();
			}
			@Override
			public Adapter caseHwFeatureCategory(HwFeatureCategory object) {
				return createHwFeatureCategoryAdapter();
			}
			@Override
			public Adapter caseHwFeature(HwFeature object) {
				return createHwFeatureAdapter();
			}
			@Override
			public Adapter caseHwPort(HwPort object) {
				return createHwPortAdapter();
			}
			@Override
			public Adapter caseConnectionHandler(ConnectionHandler object) {
				return createConnectionHandlerAdapter();
			}
			@Override
			public Adapter caseHwConnection(HwConnection object) {
				return createHwConnectionAdapter();
			}
			@Override
			public Adapter caseHwAccessElement(HwAccessElement object) {
				return createHwAccessElementAdapter();
			}
			@Override
			public Adapter caseHwDefinition(HwDefinition object) {
				return createHwDefinitionAdapter();
			}
			@Override
			public Adapter caseProcessingUnitDefinition(ProcessingUnitDefinition object) {
				return createProcessingUnitDefinitionAdapter();
			}
			@Override
			public Adapter caseConnectionHandlerDefinition(ConnectionHandlerDefinition object) {
				return createConnectionHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseMemoryDefinition(MemoryDefinition object) {
				return createMemoryDefinitionAdapter();
			}
			@Override
			public Adapter caseCacheDefinition(CacheDefinition object) {
				return createCacheDefinitionAdapter();
			}
			@Override
			public Adapter caseHwPath(HwPath object) {
				return createHwPathAdapter();
			}
			@Override
			public Adapter caseHwAccessPath(HwAccessPath object) {
				return createHwAccessPathAdapter();
			}
			@Override
			public Adapter caseHwPathElement(HwPathElement object) {
				return createHwPathElementAdapter();
			}
			@Override
			public Adapter caseHwDestination(HwDestination object) {
				return createHwDestinationAdapter();
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
			public Adapter caseOsOverhead(OsOverhead object) {
				return createOsOverheadAdapter();
			}
			@Override
			public Adapter caseOsAPIOverhead(OsAPIOverhead object) {
				return createOsAPIOverheadAdapter();
			}
			@Override
			public Adapter caseOsISROverhead(OsISROverhead object) {
				return createOsISROverheadAdapter();
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
			public Adapter caseModeValueMapEntry(Map.Entry<ModeLabel, String> object) {
				return createModeValueMapEntryAdapter();
			}
			@Override
			public Adapter caseModeValue(ModeValue object) {
				return createModeValueAdapter();
			}
			@Override
			public Adapter caseModeAssignment(ModeAssignment object) {
				return createModeAssignmentAdapter();
			}
			@Override
			public Adapter caseModeConditionDisjunction(ModeConditionDisjunction object) {
				return createModeConditionDisjunctionAdapter();
			}
			@Override
			public Adapter caseModeConditionDisjunctionEntry(ModeConditionDisjunctionEntry object) {
				return createModeConditionDisjunctionEntryAdapter();
			}
			@Override
			public Adapter caseModeCondition(ModeCondition object) {
				return createModeConditionAdapter();
			}
			@Override
			public Adapter caseModeConditionConjunction(ModeConditionConjunction object) {
				return createModeConditionConjunctionAdapter();
			}
			@Override
			public Adapter caseFixedPeriodic(FixedPeriodic object) {
				return createFixedPeriodicAdapter();
			}
			@Override
			public Adapter casePeriodicStimulus(PeriodicStimulus object) {
				return createPeriodicStimulusAdapter();
			}
			@Override
			public Adapter caseRelativePeriodicStimulus(RelativePeriodicStimulus object) {
				return createRelativePeriodicStimulusAdapter();
			}
			@Override
			public Adapter caseVariableRateStimulus(VariableRateStimulus object) {
				return createVariableRateStimulusAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter casePeriodicSyntheticStimulus(PeriodicSyntheticStimulus object) {
				return createPeriodicSyntheticStimulusAdapter();
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
			public Adapter casePeriodicBurstStimulus(PeriodicBurstStimulus object) {
				return createPeriodicBurstStimulusAdapter();
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
			public Adapter caseClockFunction(ClockFunction object) {
				return createClockFunctionAdapter();
			}
			@Override
			public Adapter caseClockStepList(ClockStepList object) {
				return createClockStepListAdapter();
			}
			@Override
			public Adapter caseClockStep(ClockStep object) {
				return createClockStepAdapter();
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
			public Adapter caseICallGraphItemContainer(ICallGraphItemContainer object) {
				return createICallGraphItemContainerAdapter();
			}
			@Override
			public Adapter caseCallGraph(CallGraph object) {
				return createCallGraphAdapter();
			}
			@Override
			public Adapter caseCallGraphItem(CallGraphItem object) {
				return createCallGraphItemAdapter();
			}
			@Override
			public Adapter caseModeSwitch(ModeSwitch object) {
				return createModeSwitchAdapter();
			}
			@Override
			public Adapter caseModeSwitchEntry(ModeSwitchEntry object) {
				return createModeSwitchEntryAdapter();
			}
			@Override
			public Adapter caseModeSwitchDefault(ModeSwitchDefault object) {
				return createModeSwitchDefaultAdapter();
			}
			@Override
			public Adapter caseProbabilitySwitch(ProbabilitySwitch object) {
				return createProbabilitySwitchAdapter();
			}
			@Override
			public Adapter caseProbabilitySwitchEntry(ProbabilitySwitchEntry object) {
				return createProbabilitySwitchEntryAdapter();
			}
			@Override
			public Adapter caseCounter(Counter object) {
				return createCounterAdapter();
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
			public Adapter caseDataDependency(DataDependency object) {
				return createDataDependencyAdapter();
			}
			@Override
			public Adapter caseRunnableParameter(RunnableParameter object) {
				return createRunnableParameterAdapter();
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
			public Adapter caseComputationItem(ComputationItem object) {
				return createComputationItemAdapter();
			}
			@Override
			public Adapter caseExecutionNeed(ExecutionNeed object) {
				return createExecutionNeedAdapter();
			}
			@Override
			public Adapter caseNeedEntry(Map.Entry<String, IDiscreteValueDeviation> object) {
				return createNeedEntryAdapter();
			}
			@Override
			public Adapter caseTicks(Ticks object) {
				return createTicksAdapter();
			}
			@Override
			public Adapter caseTicksEntry(Map.Entry<ProcessingUnitDefinition, IDiscreteValueDeviation> object) {
				return createTicksEntryAdapter();
			}
			@Override
			public Adapter caseModeLabelAccess(ModeLabelAccess object) {
				return createModeLabelAccessAdapter();
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
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseCallArgument(CallArgument object) {
				return createCallArgumentAdapter();
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
			public Adapter caseAlias(Alias object) {
				return createAliasAdapter();
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
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable <em>Time Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Comparable
	 * @generated
	 */
	public Adapter createTimeComparableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Voltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Voltage
	 * @generated
	 */
	public Adapter createVoltageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable <em>Data Rate Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Comparable
	 * @generated
	 */
	public Adapter createDataRateComparableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ITimeDeviation <em>ITime Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ITimeDeviation
	 * @generated
	 */
	public Adapter createITimeDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeConstant <em>Time Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeConstant
	 * @generated
	 */
	public Adapter createTimeConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeHistogram <em>Time Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeHistogram
	 * @generated
	 */
	public Adapter createTimeHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeHistogramEntry <em>Time Histogram Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeHistogramEntry
	 * @generated
	 */
	public Adapter createTimeHistogramEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution <em>Bounded Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution
	 * @generated
	 */
	public Adapter createBoundedTimeDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TruncatedTimeDistribution <em>Truncated Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TruncatedTimeDistribution
	 * @generated
	 */
	public Adapter createTruncatedTimeDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeBoundaries <em>Time Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeBoundaries
	 * @generated
	 */
	public Adapter createTimeBoundariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeStatistics <em>Time Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeStatistics
	 * @generated
	 */
	public Adapter createTimeStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeUniformDistribution <em>Time Uniform Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeUniformDistribution
	 * @generated
	 */
	public Adapter createTimeUniformDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeGaussDistribution <em>Time Gauss Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeGaussDistribution
	 * @generated
	 */
	public Adapter createTimeGaussDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution <em>Time Weibull Estimators Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution
	 * @generated
	 */
	public Adapter createTimeWeibullEstimatorsDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TimeBetaDistribution <em>Time Beta Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TimeBetaDistribution
	 * @generated
	 */
	public Adapter createTimeBetaDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation <em>IDiscrete Value Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation
	 * @generated
	 */
	public Adapter createIDiscreteValueDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueInterval <em>Discrete Value Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueInterval
	 * @generated
	 */
	public Adapter createDiscreteValueIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueConstant <em>Discrete Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueConstant
	 * @generated
	 */
	public Adapter createDiscreteValueConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueHistogram <em>Discrete Value Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueHistogram
	 * @generated
	 */
	public Adapter createDiscreteValueHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueHistogramEntry <em>Discrete Value Histogram Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueHistogramEntry
	 * @generated
	 */
	public Adapter createDiscreteValueHistogramEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.BoundedDiscreteValueDistribution <em>Bounded Discrete Value Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.BoundedDiscreteValueDistribution
	 * @generated
	 */
	public Adapter createBoundedDiscreteValueDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TruncatedDiscreteValueDistribution <em>Truncated Discrete Value Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TruncatedDiscreteValueDistribution
	 * @generated
	 */
	public Adapter createTruncatedDiscreteValueDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueBoundaries <em>Discrete Value Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueBoundaries
	 * @generated
	 */
	public Adapter createDiscreteValueBoundariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics <em>Discrete Value Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics
	 * @generated
	 */
	public Adapter createDiscreteValueStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution <em>Discrete Value Uniform Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution
	 * @generated
	 */
	public Adapter createDiscreteValueUniformDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution <em>Discrete Value Gauss Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution
	 * @generated
	 */
	public Adapter createDiscreteValueGaussDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution <em>Discrete Value Weibull Estimators Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution
	 * @generated
	 */
	public Adapter createDiscreteValueWeibullEstimatorsDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution <em>Discrete Value Beta Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution
	 * @generated
	 */
	public Adapter createDiscreteValueBetaDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.IContinuousValueDeviation <em>IContinuous Value Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.IContinuousValueDeviation
	 * @generated
	 */
	public Adapter createIContinuousValueDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueInterval <em>Continuous Value Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueInterval
	 * @generated
	 */
	public Adapter createContinuousValueIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueConstant <em>Continuous Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueConstant
	 * @generated
	 */
	public Adapter createContinuousValueConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueHistogram <em>Continuous Value Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueHistogram
	 * @generated
	 */
	public Adapter createContinuousValueHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueHistogramEntry <em>Continuous Value Histogram Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueHistogramEntry
	 * @generated
	 */
	public Adapter createContinuousValueHistogramEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.BoundedContinuousValueDistribution <em>Bounded Continuous Value Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.BoundedContinuousValueDistribution
	 * @generated
	 */
	public Adapter createBoundedContinuousValueDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.TruncatedContinuousValueDistribution <em>Truncated Continuous Value Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.TruncatedContinuousValueDistribution
	 * @generated
	 */
	public Adapter createTruncatedContinuousValueDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueBoundaries <em>Continuous Value Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueBoundaries
	 * @generated
	 */
	public Adapter createContinuousValueBoundariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics <em>Continuous Value Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics
	 * @generated
	 */
	public Adapter createContinuousValueStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution <em>Continuous Value Uniform Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution
	 * @generated
	 */
	public Adapter createContinuousValueUniformDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution <em>Continuous Value Gauss Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution
	 * @generated
	 */
	public Adapter createContinuousValueGaussDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution <em>Continuous Value Weibull Estimators Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution
	 * @generated
	 */
	public Adapter createContinuousValueWeibullEstimatorsDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution <em>Continuous Value Beta Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution
	 * @generated
	 */
	public Adapter createContinuousValueBetaDistributionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.NumericMode <em>Numeric Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.NumericMode
	 * @generated
	 */
	public Adapter createNumericModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.EnumMode <em>Enum Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.EnumMode
	 * @generated
	 */
	public Adapter createEnumModeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwStructure <em>Hw Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwStructure
	 * @generated
	 */
	public Adapter createHwStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwModule <em>Hw Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwModule
	 * @generated
	 */
	public Adapter createHwModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwDomain <em>Hw Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwDomain
	 * @generated
	 */
	public Adapter createHwDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.FrequencyDomain <em>Frequency Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyDomain
	 * @generated
	 */
	public Adapter createFrequencyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PowerDomain <em>Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PowerDomain
	 * @generated
	 */
	public Adapter createPowerDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessingUnit <em>Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessingUnit
	 * @generated
	 */
	public Adapter createProcessingUnitAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Cache
	 * @generated
	 */
	public Adapter createCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwFeatureCategory <em>Hw Feature Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwFeatureCategory
	 * @generated
	 */
	public Adapter createHwFeatureCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwFeature <em>Hw Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwFeature
	 * @generated
	 */
	public Adapter createHwFeatureAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ConnectionHandler <em>Connection Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ConnectionHandler
	 * @generated
	 */
	public Adapter createConnectionHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwConnection <em>Hw Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwConnection
	 * @generated
	 */
	public Adapter createHwConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwAccessElement <em>Hw Access Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessElement
	 * @generated
	 */
	public Adapter createHwAccessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwDefinition <em>Hw Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwDefinition
	 * @generated
	 */
	public Adapter createHwDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition <em>Processing Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition
	 * @generated
	 */
	public Adapter createProcessingUnitDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition <em>Connection Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition
	 * @generated
	 */
	public Adapter createConnectionHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.MemoryDefinition <em>Memory Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryDefinition
	 * @generated
	 */
	public Adapter createMemoryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition <em>Cache Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CacheDefinition
	 * @generated
	 */
	public Adapter createCacheDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwPath <em>Hw Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwPath
	 * @generated
	 */
	public Adapter createHwPathAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwPathElement <em>Hw Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwPathElement
	 * @generated
	 */
	public Adapter createHwPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.HwDestination <em>Hw Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.HwDestination
	 * @generated
	 */
	public Adapter createHwDestinationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OsOverhead <em>Os Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OsOverhead
	 * @generated
	 */
	public Adapter createOsOverheadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead <em>Os API Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIOverhead
	 * @generated
	 */
	public Adapter createOsAPIOverheadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.OsISROverhead <em>Os ISR Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.OsISROverhead
	 * @generated
	 */
	public Adapter createOsISROverheadAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeAssignment <em>Mode Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeAssignment
	 * @generated
	 */
	public Adapter createModeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction <em>Mode Condition Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction
	 * @generated
	 */
	public Adapter createModeConditionDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeConditionDisjunctionEntry <em>Mode Condition Disjunction Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeConditionDisjunctionEntry
	 * @generated
	 */
	public Adapter createModeConditionDisjunctionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeCondition <em>Mode Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeCondition
	 * @generated
	 */
	public Adapter createModeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ModeConditionConjunction <em>Mode Condition Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ModeConditionConjunction
	 * @generated
	 */
	public Adapter createModeConditionConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.FixedPeriodic <em>Fixed Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.FixedPeriodic
	 * @generated
	 */
	public Adapter createFixedPeriodicAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus <em>Relative Periodic Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus
	 * @generated
	 */
	public Adapter createRelativePeriodicStimulusAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus <em>Periodic Synthetic Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus
	 * @generated
	 */
	public Adapter createPeriodicSyntheticStimulusAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus <em>Periodic Burst Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus
	 * @generated
	 */
	public Adapter createPeriodicBurstStimulusAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ClockFunction <em>Clock Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ClockFunction
	 * @generated
	 */
	public Adapter createClockFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ClockStepList <em>Clock Step List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ClockStepList
	 * @generated
	 */
	public Adapter createClockStepListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ClockStep <em>Clock Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ClockStep
	 * @generated
	 */
	public Adapter createClockStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ICallGraphItemContainer <em>ICall Graph Item Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ICallGraphItemContainer
	 * @generated
	 */
	public Adapter createICallGraphItemContainerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CallGraphItem <em>Call Graph Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CallGraphItem
	 * @generated
	 */
	public Adapter createCallGraphItemAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.DataDependency <em>Data Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.DataDependency
	 * @generated
	 */
	public Adapter createDataDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.RunnableParameter <em>Runnable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableParameter
	 * @generated
	 */
	public Adapter createRunnableParameterAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.ExecutionNeed <em>Execution Need</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.ExecutionNeed
	 * @generated
	 */
	public Adapter createExecutionNeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Need Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createNeedEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Ticks <em>Ticks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Ticks
	 * @generated
	 */
	public Adapter createTicksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Ticks Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createTicksEntryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.CallArgument <em>Call Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.CallArgument
	 * @generated
	 */
	public Adapter createCallArgumentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.amalthea.model.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.amalthea.model.Alias
	 * @generated
	 */
	public Adapter createAliasAdapter() {
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
