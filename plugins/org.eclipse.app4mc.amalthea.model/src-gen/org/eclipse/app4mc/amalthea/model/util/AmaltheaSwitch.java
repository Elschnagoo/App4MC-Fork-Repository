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
public class AmaltheaSwitch<T> extends Switch<T> {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AmaltheaPackage.AMALTHEA: {
				Amalthea amalthea = (Amalthea)theEObject;
				T result = caseAmalthea(amalthea);
				if (result == null) result = caseBaseObject(amalthea);
				if (result == null) result = caseIAnnotatable(amalthea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMMON_ELEMENTS: {
				CommonElements commonElements = (CommonElements)theEObject;
				T result = caseCommonElements(commonElements);
				if (result == null) result = caseBaseObject(commonElements);
				if (result == null) result = caseIAnnotatable(commonElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BASE_OBJECT: {
				BaseObject baseObject = (BaseObject)theEObject;
				T result = caseBaseObject(baseObject);
				if (result == null) result = caseIAnnotatable(baseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REFERABLE_OBJECT: {
				ReferableObject referableObject = (ReferableObject)theEObject;
				T result = caseReferableObject(referableObject);
				if (result == null) result = caseIReferable(referableObject);
				if (result == null) result = caseINamed(referableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REFERABLE_BASE_OBJECT: {
				ReferableBaseObject referableBaseObject = (ReferableBaseObject)theEObject;
				T result = caseReferableBaseObject(referableBaseObject);
				if (result == null) result = caseIAnnotatable(referableBaseObject);
				if (result == null) result = caseIReferable(referableBaseObject);
				if (result == null) result = caseINamed(referableBaseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.IANNOTATABLE: {
				IAnnotatable iAnnotatable = (IAnnotatable)theEObject;
				T result = caseIAnnotatable(iAnnotatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ITAGGABLE: {
				ITaggable iTaggable = (ITaggable)theEObject;
				T result = caseITaggable(iTaggable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INAMED: {
				INamed iNamed = (INamed)theEObject;
				T result = caseINamed(iNamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.IREFERABLE: {
				IReferable iReferable = (IReferable)theEObject;
				T result = caseIReferable(iReferable);
				if (result == null) result = caseINamed(iReferable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.IDISPLAY_NAME: {
				IDisplayName iDisplayName = (IDisplayName)theEObject;
				T result = caseIDisplayName(iDisplayName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseReferableBaseObject(tag);
				if (result == null) result = caseIAnnotatable(tag);
				if (result == null) result = caseIReferable(tag);
				if (result == null) result = caseINamed(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseReferableBaseObject(classifier);
				if (result == null) result = caseIAnnotatable(classifier);
				if (result == null) result = caseIReferable(classifier);
				if (result == null) result = caseINamed(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CORE_CLASSIFIER: {
				CoreClassifier coreClassifier = (CoreClassifier)theEObject;
				T result = caseCoreClassifier(coreClassifier);
				if (result == null) result = caseClassifier(coreClassifier);
				if (result == null) result = caseReferableBaseObject(coreClassifier);
				if (result == null) result = caseIAnnotatable(coreClassifier);
				if (result == null) result = caseIReferable(coreClassifier);
				if (result == null) result = caseINamed(coreClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_CLASSIFIER: {
				MemoryClassifier memoryClassifier = (MemoryClassifier)theEObject;
				T result = caseMemoryClassifier(memoryClassifier);
				if (result == null) result = caseClassifier(memoryClassifier);
				if (result == null) result = caseReferableBaseObject(memoryClassifier);
				if (result == null) result = caseIAnnotatable(memoryClassifier);
				if (result == null) result = caseIReferable(memoryClassifier);
				if (result == null) result = caseINamed(memoryClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TRANSMISSION_POLICY: {
				TransmissionPolicy transmissionPolicy = (TransmissionPolicy)theEObject;
				T result = caseTransmissionPolicy(transmissionPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_COMPARABLE: {
				@SuppressWarnings("unchecked") Comparable<Time> timeComparable = (Comparable<Time>)theEObject;
				T result = caseTimeComparable(timeComparable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseQuantity(time);
				if (result == null) result = caseValue(time);
				if (result == null) result = caseTimeComparable(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FREQUENCY: {
				Frequency frequency = (Frequency)theEObject;
				T result = caseFrequency(frequency);
				if (result == null) result = caseQuantity(frequency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.VOLTAGE: {
				Voltage voltage = (Voltage)theEObject;
				T result = caseVoltage(voltage);
				if (result == null) result = caseQuantity(voltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_SIZE: {
				DataSize dataSize = (DataSize)theEObject;
				T result = caseDataSize(dataSize);
				if (result == null) result = caseQuantity(dataSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_RATE_COMPARABLE: {
				@SuppressWarnings("unchecked") Comparable<DataRate> dataRateComparable = (Comparable<DataRate>)theEObject;
				T result = caseDataRateComparable(dataRateComparable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_RATE: {
				DataRate dataRate = (DataRate)theEObject;
				T result = caseDataRate(dataRate);
				if (result == null) result = caseQuantity(dataRate);
				if (result == null) result = caseDataRateComparable(dataRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_PROPERTY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Value> customProperty = (Map.Entry<String, Value>)theEObject;
				T result = caseCustomProperty(customProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LIST_OBJECT: {
				ListObject listObject = (ListObject)theEObject;
				T result = caseListObject(listObject);
				if (result == null) result = caseValue(listObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STRING_OBJECT: {
				StringObject stringObject = (StringObject)theEObject;
				T result = caseStringObject(stringObject);
				if (result == null) result = caseValue(stringObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BIG_INTEGER_OBJECT: {
				BigIntegerObject bigIntegerObject = (BigIntegerObject)theEObject;
				T result = caseBigIntegerObject(bigIntegerObject);
				if (result == null) result = caseValue(bigIntegerObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REFERENCE_OBJECT: {
				ReferenceObject referenceObject = (ReferenceObject)theEObject;
				T result = caseReferenceObject(referenceObject);
				if (result == null) result = caseValue(referenceObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTEGER_OBJECT: {
				IntegerObject integerObject = (IntegerObject)theEObject;
				T result = caseIntegerObject(integerObject);
				if (result == null) result = caseValue(integerObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LONG_OBJECT: {
				LongObject longObject = (LongObject)theEObject;
				T result = caseLongObject(longObject);
				if (result == null) result = caseValue(longObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FLOAT_OBJECT: {
				FloatObject floatObject = (FloatObject)theEObject;
				T result = caseFloatObject(floatObject);
				if (result == null) result = caseValue(floatObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DOUBLE_OBJECT: {
				DoubleObject doubleObject = (DoubleObject)theEObject;
				T result = caseDoubleObject(doubleObject);
				if (result == null) result = caseValue(doubleObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BOOLEAN_OBJECT: {
				BooleanObject booleanObject = (BooleanObject)theEObject;
				T result = caseBooleanObject(booleanObject);
				if (result == null) result = caseValue(booleanObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.NUMERIC_STATISTIC: {
				NumericStatistic numericStatistic = (NumericStatistic)theEObject;
				T result = caseNumericStatistic(numericStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MIN_AVG_MAX_STATISTIC: {
				MinAvgMaxStatistic minAvgMaxStatistic = (MinAvgMaxStatistic)theEObject;
				T result = caseMinAvgMaxStatistic(minAvgMaxStatistic);
				if (result == null) result = caseNumericStatistic(minAvgMaxStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SINGLE_VALUE_STATISTIC: {
				SingleValueStatistic singleValueStatistic = (SingleValueStatistic)theEObject;
				T result = caseSingleValueStatistic(singleValueStatistic);
				if (result == null) result = caseNumericStatistic(singleValueStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ITIME_DEVIATION: {
				ITimeDeviation iTimeDeviation = (ITimeDeviation)theEObject;
				T result = caseITimeDeviation(iTimeDeviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_CONSTANT: {
				TimeConstant timeConstant = (TimeConstant)theEObject;
				T result = caseTimeConstant(timeConstant);
				if (result == null) result = caseITimeDeviation(timeConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_HISTOGRAM: {
				TimeHistogram timeHistogram = (TimeHistogram)theEObject;
				T result = caseTimeHistogram(timeHistogram);
				if (result == null) result = caseITimeDeviation(timeHistogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY: {
				TimeHistogramEntry timeHistogramEntry = (TimeHistogramEntry)theEObject;
				T result = caseTimeHistogramEntry(timeHistogramEntry);
				if (result == null) result = caseTimeInterval(timeHistogramEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BOUNDED_TIME_DISTRIBUTION: {
				BoundedTimeDistribution boundedTimeDistribution = (BoundedTimeDistribution)theEObject;
				T result = caseBoundedTimeDistribution(boundedTimeDistribution);
				if (result == null) result = caseTimeInterval(boundedTimeDistribution);
				if (result == null) result = caseITimeDeviation(boundedTimeDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TRUNCATED_TIME_DISTRIBUTION: {
				TruncatedTimeDistribution truncatedTimeDistribution = (TruncatedTimeDistribution)theEObject;
				T result = caseTruncatedTimeDistribution(truncatedTimeDistribution);
				if (result == null) result = caseITimeDeviation(truncatedTimeDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_BOUNDARIES: {
				TimeBoundaries timeBoundaries = (TimeBoundaries)theEObject;
				T result = caseTimeBoundaries(timeBoundaries);
				if (result == null) result = caseBoundedTimeDistribution(timeBoundaries);
				if (result == null) result = caseTimeInterval(timeBoundaries);
				if (result == null) result = caseITimeDeviation(timeBoundaries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_STATISTICS: {
				TimeStatistics timeStatistics = (TimeStatistics)theEObject;
				T result = caseTimeStatistics(timeStatistics);
				if (result == null) result = caseBoundedTimeDistribution(timeStatistics);
				if (result == null) result = caseTimeInterval(timeStatistics);
				if (result == null) result = caseITimeDeviation(timeStatistics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_UNIFORM_DISTRIBUTION: {
				TimeUniformDistribution timeUniformDistribution = (TimeUniformDistribution)theEObject;
				T result = caseTimeUniformDistribution(timeUniformDistribution);
				if (result == null) result = caseBoundedTimeDistribution(timeUniformDistribution);
				if (result == null) result = caseTimeInterval(timeUniformDistribution);
				if (result == null) result = caseITimeDeviation(timeUniformDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION: {
				TimeGaussDistribution timeGaussDistribution = (TimeGaussDistribution)theEObject;
				T result = caseTimeGaussDistribution(timeGaussDistribution);
				if (result == null) result = caseTruncatedTimeDistribution(timeGaussDistribution);
				if (result == null) result = caseITimeDeviation(timeGaussDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION: {
				TimeWeibullEstimatorsDistribution timeWeibullEstimatorsDistribution = (TimeWeibullEstimatorsDistribution)theEObject;
				T result = caseTimeWeibullEstimatorsDistribution(timeWeibullEstimatorsDistribution);
				if (result == null) result = caseBoundedTimeDistribution(timeWeibullEstimatorsDistribution);
				if (result == null) result = caseTimeInterval(timeWeibullEstimatorsDistribution);
				if (result == null) result = caseITimeDeviation(timeWeibullEstimatorsDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_BETA_DISTRIBUTION: {
				TimeBetaDistribution timeBetaDistribution = (TimeBetaDistribution)theEObject;
				T result = caseTimeBetaDistribution(timeBetaDistribution);
				if (result == null) result = caseBoundedTimeDistribution(timeBetaDistribution);
				if (result == null) result = caseTimeInterval(timeBetaDistribution);
				if (result == null) result = caseITimeDeviation(timeBetaDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.IDISCRETE_VALUE_DEVIATION: {
				IDiscreteValueDeviation iDiscreteValueDeviation = (IDiscreteValueDeviation)theEObject;
				T result = caseIDiscreteValueDeviation(iDiscreteValueDeviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_INTERVAL: {
				DiscreteValueInterval discreteValueInterval = (DiscreteValueInterval)theEObject;
				T result = caseDiscreteValueInterval(discreteValueInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_CONSTANT: {
				DiscreteValueConstant discreteValueConstant = (DiscreteValueConstant)theEObject;
				T result = caseDiscreteValueConstant(discreteValueConstant);
				if (result == null) result = caseIDiscreteValueDeviation(discreteValueConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM: {
				DiscreteValueHistogram discreteValueHistogram = (DiscreteValueHistogram)theEObject;
				T result = caseDiscreteValueHistogram(discreteValueHistogram);
				if (result == null) result = caseIDiscreteValueDeviation(discreteValueHistogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM_ENTRY: {
				DiscreteValueHistogramEntry discreteValueHistogramEntry = (DiscreteValueHistogramEntry)theEObject;
				T result = caseDiscreteValueHistogramEntry(discreteValueHistogramEntry);
				if (result == null) result = caseDiscreteValueInterval(discreteValueHistogramEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BOUNDED_DISCRETE_VALUE_DISTRIBUTION: {
				BoundedDiscreteValueDistribution boundedDiscreteValueDistribution = (BoundedDiscreteValueDistribution)theEObject;
				T result = caseBoundedDiscreteValueDistribution(boundedDiscreteValueDistribution);
				if (result == null) result = caseDiscreteValueInterval(boundedDiscreteValueDistribution);
				if (result == null) result = caseIDiscreteValueDeviation(boundedDiscreteValueDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TRUNCATED_DISCRETE_VALUE_DISTRIBUTION: {
				TruncatedDiscreteValueDistribution truncatedDiscreteValueDistribution = (TruncatedDiscreteValueDistribution)theEObject;
				T result = caseTruncatedDiscreteValueDistribution(truncatedDiscreteValueDistribution);
				if (result == null) result = caseIDiscreteValueDeviation(truncatedDiscreteValueDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_BOUNDARIES: {
				DiscreteValueBoundaries discreteValueBoundaries = (DiscreteValueBoundaries)theEObject;
				T result = caseDiscreteValueBoundaries(discreteValueBoundaries);
				if (result == null) result = caseBoundedDiscreteValueDistribution(discreteValueBoundaries);
				if (result == null) result = caseDiscreteValueInterval(discreteValueBoundaries);
				if (result == null) result = caseIDiscreteValueDeviation(discreteValueBoundaries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_STATISTICS: {
				DiscreteValueStatistics discreteValueStatistics = (DiscreteValueStatistics)theEObject;
				T result = caseDiscreteValueStatistics(discreteValueStatistics);
				if (result == null) result = caseBoundedDiscreteValueDistribution(discreteValueStatistics);
				if (result == null) result = caseDiscreteValueInterval(discreteValueStatistics);
				if (result == null) result = caseIDiscreteValueDeviation(discreteValueStatistics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_UNIFORM_DISTRIBUTION: {
				DiscreteValueUniformDistribution discreteValueUniformDistribution = (DiscreteValueUniformDistribution)theEObject;
				T result = caseDiscreteValueUniformDistribution(discreteValueUniformDistribution);
				if (result == null) result = caseBoundedDiscreteValueDistribution(discreteValueUniformDistribution);
				if (result == null) result = caseDiscreteValueInterval(discreteValueUniformDistribution);
				if (result == null) result = caseIDiscreteValueDeviation(discreteValueUniformDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION: {
				DiscreteValueGaussDistribution discreteValueGaussDistribution = (DiscreteValueGaussDistribution)theEObject;
				T result = caseDiscreteValueGaussDistribution(discreteValueGaussDistribution);
				if (result == null) result = caseTruncatedDiscreteValueDistribution(discreteValueGaussDistribution);
				if (result == null) result = caseIDiscreteValueDeviation(discreteValueGaussDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION: {
				DiscreteValueWeibullEstimatorsDistribution discreteValueWeibullEstimatorsDistribution = (DiscreteValueWeibullEstimatorsDistribution)theEObject;
				T result = caseDiscreteValueWeibullEstimatorsDistribution(discreteValueWeibullEstimatorsDistribution);
				if (result == null) result = caseBoundedDiscreteValueDistribution(discreteValueWeibullEstimatorsDistribution);
				if (result == null) result = caseDiscreteValueInterval(discreteValueWeibullEstimatorsDistribution);
				if (result == null) result = caseIDiscreteValueDeviation(discreteValueWeibullEstimatorsDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DISCRETE_VALUE_BETA_DISTRIBUTION: {
				DiscreteValueBetaDistribution discreteValueBetaDistribution = (DiscreteValueBetaDistribution)theEObject;
				T result = caseDiscreteValueBetaDistribution(discreteValueBetaDistribution);
				if (result == null) result = caseBoundedDiscreteValueDistribution(discreteValueBetaDistribution);
				if (result == null) result = caseDiscreteValueInterval(discreteValueBetaDistribution);
				if (result == null) result = caseIDiscreteValueDeviation(discreteValueBetaDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ICONTINUOUS_VALUE_DEVIATION: {
				IContinuousValueDeviation iContinuousValueDeviation = (IContinuousValueDeviation)theEObject;
				T result = caseIContinuousValueDeviation(iContinuousValueDeviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_INTERVAL: {
				ContinuousValueInterval continuousValueInterval = (ContinuousValueInterval)theEObject;
				T result = caseContinuousValueInterval(continuousValueInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_CONSTANT: {
				ContinuousValueConstant continuousValueConstant = (ContinuousValueConstant)theEObject;
				T result = caseContinuousValueConstant(continuousValueConstant);
				if (result == null) result = caseIContinuousValueDeviation(continuousValueConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM: {
				ContinuousValueHistogram continuousValueHistogram = (ContinuousValueHistogram)theEObject;
				T result = caseContinuousValueHistogram(continuousValueHistogram);
				if (result == null) result = caseIContinuousValueDeviation(continuousValueHistogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM_ENTRY: {
				ContinuousValueHistogramEntry continuousValueHistogramEntry = (ContinuousValueHistogramEntry)theEObject;
				T result = caseContinuousValueHistogramEntry(continuousValueHistogramEntry);
				if (result == null) result = caseContinuousValueInterval(continuousValueHistogramEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BOUNDED_CONTINUOUS_VALUE_DISTRIBUTION: {
				BoundedContinuousValueDistribution boundedContinuousValueDistribution = (BoundedContinuousValueDistribution)theEObject;
				T result = caseBoundedContinuousValueDistribution(boundedContinuousValueDistribution);
				if (result == null) result = caseContinuousValueInterval(boundedContinuousValueDistribution);
				if (result == null) result = caseIContinuousValueDeviation(boundedContinuousValueDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION: {
				TruncatedContinuousValueDistribution truncatedContinuousValueDistribution = (TruncatedContinuousValueDistribution)theEObject;
				T result = caseTruncatedContinuousValueDistribution(truncatedContinuousValueDistribution);
				if (result == null) result = caseIContinuousValueDeviation(truncatedContinuousValueDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_BOUNDARIES: {
				ContinuousValueBoundaries continuousValueBoundaries = (ContinuousValueBoundaries)theEObject;
				T result = caseContinuousValueBoundaries(continuousValueBoundaries);
				if (result == null) result = caseBoundedContinuousValueDistribution(continuousValueBoundaries);
				if (result == null) result = caseContinuousValueInterval(continuousValueBoundaries);
				if (result == null) result = caseIContinuousValueDeviation(continuousValueBoundaries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_STATISTICS: {
				ContinuousValueStatistics continuousValueStatistics = (ContinuousValueStatistics)theEObject;
				T result = caseContinuousValueStatistics(continuousValueStatistics);
				if (result == null) result = caseBoundedContinuousValueDistribution(continuousValueStatistics);
				if (result == null) result = caseContinuousValueInterval(continuousValueStatistics);
				if (result == null) result = caseIContinuousValueDeviation(continuousValueStatistics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_UNIFORM_DISTRIBUTION: {
				ContinuousValueUniformDistribution continuousValueUniformDistribution = (ContinuousValueUniformDistribution)theEObject;
				T result = caseContinuousValueUniformDistribution(continuousValueUniformDistribution);
				if (result == null) result = caseBoundedContinuousValueDistribution(continuousValueUniformDistribution);
				if (result == null) result = caseContinuousValueInterval(continuousValueUniformDistribution);
				if (result == null) result = caseIContinuousValueDeviation(continuousValueUniformDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_GAUSS_DISTRIBUTION: {
				ContinuousValueGaussDistribution continuousValueGaussDistribution = (ContinuousValueGaussDistribution)theEObject;
				T result = caseContinuousValueGaussDistribution(continuousValueGaussDistribution);
				if (result == null) result = caseTruncatedContinuousValueDistribution(continuousValueGaussDistribution);
				if (result == null) result = caseIContinuousValueDeviation(continuousValueGaussDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION: {
				ContinuousValueWeibullEstimatorsDistribution continuousValueWeibullEstimatorsDistribution = (ContinuousValueWeibullEstimatorsDistribution)theEObject;
				T result = caseContinuousValueWeibullEstimatorsDistribution(continuousValueWeibullEstimatorsDistribution);
				if (result == null) result = caseBoundedContinuousValueDistribution(continuousValueWeibullEstimatorsDistribution);
				if (result == null) result = caseContinuousValueInterval(continuousValueWeibullEstimatorsDistribution);
				if (result == null) result = caseIContinuousValueDeviation(continuousValueWeibullEstimatorsDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONTINUOUS_VALUE_BETA_DISTRIBUTION: {
				ContinuousValueBetaDistribution continuousValueBetaDistribution = (ContinuousValueBetaDistribution)theEObject;
				T result = caseContinuousValueBetaDistribution(continuousValueBetaDistribution);
				if (result == null) result = caseBoundedContinuousValueDistribution(continuousValueBetaDistribution);
				if (result == null) result = caseContinuousValueInterval(continuousValueBetaDistribution);
				if (result == null) result = caseIContinuousValueDeviation(continuousValueBetaDistribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE: {
				Mode mode = (Mode)theEObject;
				T result = caseMode(mode);
				if (result == null) result = caseReferableBaseObject(mode);
				if (result == null) result = caseIAnnotatable(mode);
				if (result == null) result = caseIReferable(mode);
				if (result == null) result = caseINamed(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.NUMERIC_MODE: {
				NumericMode numericMode = (NumericMode)theEObject;
				T result = caseNumericMode(numericMode);
				if (result == null) result = caseMode(numericMode);
				if (result == null) result = caseReferableBaseObject(numericMode);
				if (result == null) result = caseIAnnotatable(numericMode);
				if (result == null) result = caseIReferable(numericMode);
				if (result == null) result = caseINamed(numericMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ENUM_MODE: {
				EnumMode enumMode = (EnumMode)theEObject;
				T result = caseEnumMode(enumMode);
				if (result == null) result = caseMode(enumMode);
				if (result == null) result = caseReferableBaseObject(enumMode);
				if (result == null) result = caseIAnnotatable(enumMode);
				if (result == null) result = caseIReferable(enumMode);
				if (result == null) result = caseINamed(enumMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_LITERAL: {
				ModeLiteral modeLiteral = (ModeLiteral)theEObject;
				T result = caseModeLiteral(modeLiteral);
				if (result == null) result = caseReferableBaseObject(modeLiteral);
				if (result == null) result = caseIAnnotatable(modeLiteral);
				if (result == null) result = caseIReferable(modeLiteral);
				if (result == null) result = caseINamed(modeLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENTS_MODEL: {
				ComponentsModel componentsModel = (ComponentsModel)theEObject;
				T result = caseComponentsModel(componentsModel);
				if (result == null) result = caseBaseObject(componentsModel);
				if (result == null) result = caseIAnnotatable(componentsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ISYSTEM: {
				ISystem iSystem = (ISystem)theEObject;
				T result = caseISystem(iSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseReferableBaseObject(port);
				if (result == null) result = caseITaggable(port);
				if (result == null) result = caseIAnnotatable(port);
				if (result == null) result = caseIReferable(port);
				if (result == null) result = caseINamed(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseReferableBaseObject(component);
				if (result == null) result = caseITaggable(component);
				if (result == null) result = caseIAnnotatable(component);
				if (result == null) result = caseIReferable(component);
				if (result == null) result = caseINamed(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseComponent(composite);
				if (result == null) result = caseISystem(composite);
				if (result == null) result = caseReferableBaseObject(composite);
				if (result == null) result = caseITaggable(composite);
				if (result == null) result = caseIAnnotatable(composite);
				if (result == null) result = caseIReferable(composite);
				if (result == null) result = caseINamed(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SYSTEM: {
				org.eclipse.app4mc.amalthea.model.System system = (org.eclipse.app4mc.amalthea.model.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseReferableBaseObject(system);
				if (result == null) result = caseITaggable(system);
				if (result == null) result = caseISystem(system);
				if (result == null) result = caseIAnnotatable(system);
				if (result == null) result = caseIReferable(system);
				if (result == null) result = caseINamed(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = caseReferableBaseObject(componentInstance);
				if (result == null) result = caseITaggable(componentInstance);
				if (result == null) result = caseIAnnotatable(componentInstance);
				if (result == null) result = caseIReferable(componentInstance);
				if (result == null) result = caseINamed(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseBaseObject(connector);
				if (result == null) result = caseINamed(connector);
				if (result == null) result = caseITaggable(connector);
				if (result == null) result = caseIAnnotatable(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.QUALIFIED_PORT: {
				QualifiedPort qualifiedPort = (QualifiedPort)theEObject;
				T result = caseQualifiedPort(qualifiedPort);
				if (result == null) result = caseBaseObject(qualifiedPort);
				if (result == null) result = caseIAnnotatable(qualifiedPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTERFACE_PORT: {
				InterfacePort interfacePort = (InterfacePort)theEObject;
				T result = caseInterfacePort(interfacePort);
				if (result == null) result = casePort(interfacePort);
				if (result == null) result = caseReferableBaseObject(interfacePort);
				if (result == null) result = caseITaggable(interfacePort);
				if (result == null) result = caseIAnnotatable(interfacePort);
				if (result == null) result = caseIReferable(interfacePort);
				if (result == null) result = caseINamed(interfacePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONFIG_MODEL: {
				ConfigModel configModel = (ConfigModel)theEObject;
				T result = caseConfigModel(configModel);
				if (result == null) result = caseBaseObject(configModel);
				if (result == null) result = caseIAnnotatable(configModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CONFIG: {
				EventConfig eventConfig = (EventConfig)theEObject;
				T result = caseEventConfig(eventConfig);
				if (result == null) result = caseBaseObject(eventConfig);
				if (result == null) result = caseINamed(eventConfig);
				if (result == null) result = caseIAnnotatable(eventConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONSTRAINTS_MODEL: {
				ConstraintsModel constraintsModel = (ConstraintsModel)theEObject;
				T result = caseConstraintsModel(constraintsModel);
				if (result == null) result = caseBaseObject(constraintsModel);
				if (result == null) result = caseIAnnotatable(constraintsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT: {
				RunnableSequencingConstraint runnableSequencingConstraint = (RunnableSequencingConstraint)theEObject;
				T result = caseRunnableSequencingConstraint(runnableSequencingConstraint);
				if (result == null) result = caseReferableBaseObject(runnableSequencingConstraint);
				if (result == null) result = caseIAnnotatable(runnableSequencingConstraint);
				if (result == null) result = caseIReferable(runnableSequencingConstraint);
				if (result == null) result = caseINamed(runnableSequencingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.AFFINITY_CONSTRAINT: {
				AffinityConstraint affinityConstraint = (AffinityConstraint)theEObject;
				T result = caseAffinityConstraint(affinityConstraint);
				if (result == null) result = caseReferableBaseObject(affinityConstraint);
				if (result == null) result = caseIAnnotatable(affinityConstraint);
				if (result == null) result = caseIReferable(affinityConstraint);
				if (result == null) result = caseINamed(affinityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SEPARATION_CONSTRAINT: {
				SeparationConstraint separationConstraint = (SeparationConstraint)theEObject;
				T result = caseSeparationConstraint(separationConstraint);
				if (result == null) result = caseAffinityConstraint(separationConstraint);
				if (result == null) result = caseReferableBaseObject(separationConstraint);
				if (result == null) result = caseIAnnotatable(separationConstraint);
				if (result == null) result = caseIReferable(separationConstraint);
				if (result == null) result = caseINamed(separationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PAIRING_CONSTRAINT: {
				PairingConstraint pairingConstraint = (PairingConstraint)theEObject;
				T result = casePairingConstraint(pairingConstraint);
				if (result == null) result = caseAffinityConstraint(pairingConstraint);
				if (result == null) result = caseReferableBaseObject(pairingConstraint);
				if (result == null) result = caseIAnnotatable(pairingConstraint);
				if (result == null) result = caseIReferable(pairingConstraint);
				if (result == null) result = caseINamed(pairingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CONSTRAINT: {
				ProcessConstraint processConstraint = (ProcessConstraint)theEObject;
				T result = caseProcessConstraint(processConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_CONSTRAINT: {
				RunnableConstraint runnableConstraint = (RunnableConstraint)theEObject;
				T result = caseRunnableConstraint(runnableConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_CONSTRAINT: {
				DataConstraint dataConstraint = (DataConstraint)theEObject;
				T result = caseDataConstraint(dataConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_SEPARATION_CONSTRAINT: {
				RunnableSeparationConstraint runnableSeparationConstraint = (RunnableSeparationConstraint)theEObject;
				T result = caseRunnableSeparationConstraint(runnableSeparationConstraint);
				if (result == null) result = caseSeparationConstraint(runnableSeparationConstraint);
				if (result == null) result = caseRunnableConstraint(runnableSeparationConstraint);
				if (result == null) result = caseBaseObject(runnableSeparationConstraint);
				if (result == null) result = caseAffinityConstraint(runnableSeparationConstraint);
				if (result == null) result = caseReferableBaseObject(runnableSeparationConstraint);
				if (result == null) result = caseIAnnotatable(runnableSeparationConstraint);
				if (result == null) result = caseIReferable(runnableSeparationConstraint);
				if (result == null) result = caseINamed(runnableSeparationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_SEPARATION_CONSTRAINT: {
				ProcessSeparationConstraint processSeparationConstraint = (ProcessSeparationConstraint)theEObject;
				T result = caseProcessSeparationConstraint(processSeparationConstraint);
				if (result == null) result = caseSeparationConstraint(processSeparationConstraint);
				if (result == null) result = caseProcessConstraint(processSeparationConstraint);
				if (result == null) result = caseBaseObject(processSeparationConstraint);
				if (result == null) result = caseAffinityConstraint(processSeparationConstraint);
				if (result == null) result = caseReferableBaseObject(processSeparationConstraint);
				if (result == null) result = caseIAnnotatable(processSeparationConstraint);
				if (result == null) result = caseIReferable(processSeparationConstraint);
				if (result == null) result = caseINamed(processSeparationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_SEPARATION_CONSTRAINT: {
				DataSeparationConstraint dataSeparationConstraint = (DataSeparationConstraint)theEObject;
				T result = caseDataSeparationConstraint(dataSeparationConstraint);
				if (result == null) result = caseSeparationConstraint(dataSeparationConstraint);
				if (result == null) result = caseDataConstraint(dataSeparationConstraint);
				if (result == null) result = caseBaseObject(dataSeparationConstraint);
				if (result == null) result = caseAffinityConstraint(dataSeparationConstraint);
				if (result == null) result = caseReferableBaseObject(dataSeparationConstraint);
				if (result == null) result = caseIAnnotatable(dataSeparationConstraint);
				if (result == null) result = caseIReferable(dataSeparationConstraint);
				if (result == null) result = caseINamed(dataSeparationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT: {
				RunnablePairingConstraint runnablePairingConstraint = (RunnablePairingConstraint)theEObject;
				T result = caseRunnablePairingConstraint(runnablePairingConstraint);
				if (result == null) result = casePairingConstraint(runnablePairingConstraint);
				if (result == null) result = caseRunnableConstraint(runnablePairingConstraint);
				if (result == null) result = caseBaseObject(runnablePairingConstraint);
				if (result == null) result = caseAffinityConstraint(runnablePairingConstraint);
				if (result == null) result = caseReferableBaseObject(runnablePairingConstraint);
				if (result == null) result = caseIAnnotatable(runnablePairingConstraint);
				if (result == null) result = caseIReferable(runnablePairingConstraint);
				if (result == null) result = caseINamed(runnablePairingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT: {
				ProcessPairingConstraint processPairingConstraint = (ProcessPairingConstraint)theEObject;
				T result = caseProcessPairingConstraint(processPairingConstraint);
				if (result == null) result = casePairingConstraint(processPairingConstraint);
				if (result == null) result = caseProcessConstraint(processPairingConstraint);
				if (result == null) result = caseBaseObject(processPairingConstraint);
				if (result == null) result = caseAffinityConstraint(processPairingConstraint);
				if (result == null) result = caseReferableBaseObject(processPairingConstraint);
				if (result == null) result = caseIAnnotatable(processPairingConstraint);
				if (result == null) result = caseIReferable(processPairingConstraint);
				if (result == null) result = caseINamed(processPairingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_PAIRING_CONSTRAINT: {
				DataPairingConstraint dataPairingConstraint = (DataPairingConstraint)theEObject;
				T result = caseDataPairingConstraint(dataPairingConstraint);
				if (result == null) result = casePairingConstraint(dataPairingConstraint);
				if (result == null) result = caseDataConstraint(dataPairingConstraint);
				if (result == null) result = caseBaseObject(dataPairingConstraint);
				if (result == null) result = caseAffinityConstraint(dataPairingConstraint);
				if (result == null) result = caseReferableBaseObject(dataPairingConstraint);
				if (result == null) result = caseIAnnotatable(dataPairingConstraint);
				if (result == null) result = caseIReferable(dataPairingConstraint);
				if (result == null) result = caseINamed(dataPairingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_CONSTRAINT_TARGET: {
				RunnableConstraintTarget runnableConstraintTarget = (RunnableConstraintTarget)theEObject;
				T result = caseRunnableConstraintTarget(runnableConstraintTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CONSTRAINT_TARGET: {
				ProcessConstraintTarget processConstraintTarget = (ProcessConstraintTarget)theEObject;
				T result = caseProcessConstraintTarget(processConstraintTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_CONSTRAINT_TARGET: {
				DataConstraintTarget dataConstraintTarget = (DataConstraintTarget)theEObject;
				T result = caseDataConstraintTarget(dataConstraintTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TARGET_MEMORY: {
				TargetMemory targetMemory = (TargetMemory)theEObject;
				T result = caseTargetMemory(targetMemory);
				if (result == null) result = caseDataConstraintTarget(targetMemory);
				if (result == null) result = caseBaseObject(targetMemory);
				if (result == null) result = caseIAnnotatable(targetMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TARGET_CORE: {
				TargetCore targetCore = (TargetCore)theEObject;
				T result = caseTargetCore(targetCore);
				if (result == null) result = caseRunnableConstraintTarget(targetCore);
				if (result == null) result = caseProcessConstraintTarget(targetCore);
				if (result == null) result = caseBaseObject(targetCore);
				if (result == null) result = caseIAnnotatable(targetCore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TARGET_SCHEDULER: {
				TargetScheduler targetScheduler = (TargetScheduler)theEObject;
				T result = caseTargetScheduler(targetScheduler);
				if (result == null) result = caseRunnableConstraintTarget(targetScheduler);
				if (result == null) result = caseProcessConstraintTarget(targetScheduler);
				if (result == null) result = caseBaseObject(targetScheduler);
				if (result == null) result = caseIAnnotatable(targetScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_GROUP: {
				LabelGroup labelGroup = (LabelGroup)theEObject;
				T result = caseLabelGroup(labelGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_GROUP: {
				RunnableGroup runnableGroup = (RunnableGroup)theEObject;
				T result = caseRunnableGroup(runnableGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_GROUP: {
				ProcessGroup processGroup = (ProcessGroup)theEObject;
				T result = caseProcessGroup(processGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_ENTITY_GROUP: {
				LabelEntityGroup labelEntityGroup = (LabelEntityGroup)theEObject;
				T result = caseLabelEntityGroup(labelEntityGroup);
				if (result == null) result = caseLabelGroup(labelEntityGroup);
				if (result == null) result = caseBaseObject(labelEntityGroup);
				if (result == null) result = caseIAnnotatable(labelEntityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_ENTITY_GROUP: {
				RunnableEntityGroup runnableEntityGroup = (RunnableEntityGroup)theEObject;
				T result = caseRunnableEntityGroup(runnableEntityGroup);
				if (result == null) result = caseRunnableGroup(runnableEntityGroup);
				if (result == null) result = caseBaseObject(runnableEntityGroup);
				if (result == null) result = caseIAnnotatable(runnableEntityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_ENTITY_GROUP: {
				ProcessEntityGroup processEntityGroup = (ProcessEntityGroup)theEObject;
				T result = caseProcessEntityGroup(processEntityGroup);
				if (result == null) result = caseProcessGroup(processEntityGroup);
				if (result == null) result = caseBaseObject(processEntityGroup);
				if (result == null) result = caseIAnnotatable(processEntityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TAG_GROUP: {
				TagGroup tagGroup = (TagGroup)theEObject;
				T result = caseTagGroup(tagGroup);
				if (result == null) result = caseRunnableGroup(tagGroup);
				if (result == null) result = caseProcessGroup(tagGroup);
				if (result == null) result = caseBaseObject(tagGroup);
				if (result == null) result = caseIAnnotatable(tagGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_EVENT_CHAIN: {
				AbstractEventChain abstractEventChain = (AbstractEventChain)theEObject;
				T result = caseAbstractEventChain(abstractEventChain);
				if (result == null) result = caseBaseObject(abstractEventChain);
				if (result == null) result = caseINamed(abstractEventChain);
				if (result == null) result = caseIAnnotatable(abstractEventChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN: {
				EventChain eventChain = (EventChain)theEObject;
				T result = caseEventChain(eventChain);
				if (result == null) result = caseAbstractEventChain(eventChain);
				if (result == null) result = caseIReferable(eventChain);
				if (result == null) result = caseBaseObject(eventChain);
				if (result == null) result = caseINamed(eventChain);
				if (result == null) result = caseIAnnotatable(eventChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SUB_EVENT_CHAIN: {
				SubEventChain subEventChain = (SubEventChain)theEObject;
				T result = caseSubEventChain(subEventChain);
				if (result == null) result = caseAbstractEventChain(subEventChain);
				if (result == null) result = caseBaseObject(subEventChain);
				if (result == null) result = caseINamed(subEventChain);
				if (result == null) result = caseIAnnotatable(subEventChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_ITEM: {
				EventChainItem eventChainItem = (EventChainItem)theEObject;
				T result = caseEventChainItem(eventChainItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE: {
				EventChainReference eventChainReference = (EventChainReference)theEObject;
				T result = caseEventChainReference(eventChainReference);
				if (result == null) result = caseBaseObject(eventChainReference);
				if (result == null) result = caseEventChainItem(eventChainReference);
				if (result == null) result = caseIAnnotatable(eventChainReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER: {
				EventChainContainer eventChainContainer = (EventChainContainer)theEObject;
				T result = caseEventChainContainer(eventChainContainer);
				if (result == null) result = caseBaseObject(eventChainContainer);
				if (result == null) result = caseEventChainItem(eventChainContainer);
				if (result == null) result = caseIAnnotatable(eventChainContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIMING_CONSTRAINT: {
				TimingConstraint timingConstraint = (TimingConstraint)theEObject;
				T result = caseTimingConstraint(timingConstraint);
				if (result == null) result = caseReferableBaseObject(timingConstraint);
				if (result == null) result = caseIAnnotatable(timingConstraint);
				if (result == null) result = caseIReferable(timingConstraint);
				if (result == null) result = caseINamed(timingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PHYSICAL_SECTION_CONSTRAINT: {
				PhysicalSectionConstraint physicalSectionConstraint = (PhysicalSectionConstraint)theEObject;
				T result = casePhysicalSectionConstraint(physicalSectionConstraint);
				if (result == null) result = caseReferableBaseObject(physicalSectionConstraint);
				if (result == null) result = caseIAnnotatable(physicalSectionConstraint);
				if (result == null) result = caseIReferable(physicalSectionConstraint);
				if (result == null) result = caseINamed(physicalSectionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SYNCHRONIZATION_CONSTRAINT: {
				SynchronizationConstraint synchronizationConstraint = (SynchronizationConstraint)theEObject;
				T result = caseSynchronizationConstraint(synchronizationConstraint);
				if (result == null) result = caseTimingConstraint(synchronizationConstraint);
				if (result == null) result = caseReferableBaseObject(synchronizationConstraint);
				if (result == null) result = caseIAnnotatable(synchronizationConstraint);
				if (result == null) result = caseIReferable(synchronizationConstraint);
				if (result == null) result = caseINamed(synchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_SYNCHRONIZATION_CONSTRAINT: {
				EventSynchronizationConstraint eventSynchronizationConstraint = (EventSynchronizationConstraint)theEObject;
				T result = caseEventSynchronizationConstraint(eventSynchronizationConstraint);
				if (result == null) result = caseSynchronizationConstraint(eventSynchronizationConstraint);
				if (result == null) result = caseTimingConstraint(eventSynchronizationConstraint);
				if (result == null) result = caseReferableBaseObject(eventSynchronizationConstraint);
				if (result == null) result = caseIAnnotatable(eventSynchronizationConstraint);
				if (result == null) result = caseIReferable(eventSynchronizationConstraint);
				if (result == null) result = caseINamed(eventSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_SYNCHRONIZATION_CONSTRAINT: {
				EventChainSynchronizationConstraint eventChainSynchronizationConstraint = (EventChainSynchronizationConstraint)theEObject;
				T result = caseEventChainSynchronizationConstraint(eventChainSynchronizationConstraint);
				if (result == null) result = caseSynchronizationConstraint(eventChainSynchronizationConstraint);
				if (result == null) result = caseTimingConstraint(eventChainSynchronizationConstraint);
				if (result == null) result = caseReferableBaseObject(eventChainSynchronizationConstraint);
				if (result == null) result = caseIAnnotatable(eventChainSynchronizationConstraint);
				if (result == null) result = caseIReferable(eventChainSynchronizationConstraint);
				if (result == null) result = caseINamed(eventChainSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DELAY_CONSTRAINT: {
				DelayConstraint delayConstraint = (DelayConstraint)theEObject;
				T result = caseDelayConstraint(delayConstraint);
				if (result == null) result = caseTimingConstraint(delayConstraint);
				if (result == null) result = caseReferableBaseObject(delayConstraint);
				if (result == null) result = caseIAnnotatable(delayConstraint);
				if (result == null) result = caseIReferable(delayConstraint);
				if (result == null) result = caseINamed(delayConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_LATENCY_CONSTRAINT: {
				EventChainLatencyConstraint eventChainLatencyConstraint = (EventChainLatencyConstraint)theEObject;
				T result = caseEventChainLatencyConstraint(eventChainLatencyConstraint);
				if (result == null) result = caseTimingConstraint(eventChainLatencyConstraint);
				if (result == null) result = caseReferableBaseObject(eventChainLatencyConstraint);
				if (result == null) result = caseIAnnotatable(eventChainLatencyConstraint);
				if (result == null) result = caseIReferable(eventChainLatencyConstraint);
				if (result == null) result = caseINamed(eventChainLatencyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REPETITION_CONSTRAINT: {
				RepetitionConstraint repetitionConstraint = (RepetitionConstraint)theEObject;
				T result = caseRepetitionConstraint(repetitionConstraint);
				if (result == null) result = caseTimingConstraint(repetitionConstraint);
				if (result == null) result = caseReferableBaseObject(repetitionConstraint);
				if (result == null) result = caseIAnnotatable(repetitionConstraint);
				if (result == null) result = caseIReferable(repetitionConstraint);
				if (result == null) result = caseINamed(repetitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_AGE_CONSTRAINT: {
				DataAgeConstraint dataAgeConstraint = (DataAgeConstraint)theEObject;
				T result = caseDataAgeConstraint(dataAgeConstraint);
				if (result == null) result = caseReferableBaseObject(dataAgeConstraint);
				if (result == null) result = caseIAnnotatable(dataAgeConstraint);
				if (result == null) result = caseIReferable(dataAgeConstraint);
				if (result == null) result = caseINamed(dataAgeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_AGE: {
				DataAge dataAge = (DataAge)theEObject;
				T result = caseDataAge(dataAge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_AGE_CYCLE: {
				DataAgeCycle dataAgeCycle = (DataAgeCycle)theEObject;
				T result = caseDataAgeCycle(dataAgeCycle);
				if (result == null) result = caseDataAge(dataAgeCycle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_AGE_TIME: {
				DataAgeTime dataAgeTime = (DataAgeTime)theEObject;
				T result = caseDataAgeTime(dataAgeTime);
				if (result == null) result = caseDataAge(dataAgeTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseBaseObject(requirement);
				if (result == null) result = caseINamed(requirement);
				if (result == null) result = caseIAnnotatable(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_REQUIREMENT: {
				ProcessRequirement processRequirement = (ProcessRequirement)theEObject;
				T result = caseProcessRequirement(processRequirement);
				if (result == null) result = caseRequirement(processRequirement);
				if (result == null) result = caseBaseObject(processRequirement);
				if (result == null) result = caseINamed(processRequirement);
				if (result == null) result = caseIAnnotatable(processRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_REQUIREMENT: {
				RunnableRequirement runnableRequirement = (RunnableRequirement)theEObject;
				T result = caseRunnableRequirement(runnableRequirement);
				if (result == null) result = caseRequirement(runnableRequirement);
				if (result == null) result = caseBaseObject(runnableRequirement);
				if (result == null) result = caseINamed(runnableRequirement);
				if (result == null) result = caseIAnnotatable(runnableRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ARCHITECTURE_REQUIREMENT: {
				ArchitectureRequirement architectureRequirement = (ArchitectureRequirement)theEObject;
				T result = caseArchitectureRequirement(architectureRequirement);
				if (result == null) result = caseRequirement(architectureRequirement);
				if (result == null) result = caseBaseObject(architectureRequirement);
				if (result == null) result = caseINamed(architectureRequirement);
				if (result == null) result = caseIAnnotatable(architectureRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CHAIN_REQUIREMENT: {
				ProcessChainRequirement processChainRequirement = (ProcessChainRequirement)theEObject;
				T result = caseProcessChainRequirement(processChainRequirement);
				if (result == null) result = caseRequirement(processChainRequirement);
				if (result == null) result = caseBaseObject(processChainRequirement);
				if (result == null) result = caseINamed(processChainRequirement);
				if (result == null) result = caseIAnnotatable(processChainRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.REQUIREMENT_LIMIT: {
				RequirementLimit requirementLimit = (RequirementLimit)theEObject;
				T result = caseRequirementLimit(requirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT: {
				CPUPercentageRequirementLimit cpuPercentageRequirementLimit = (CPUPercentageRequirementLimit)theEObject;
				T result = caseCPUPercentageRequirementLimit(cpuPercentageRequirementLimit);
				if (result == null) result = caseRequirementLimit(cpuPercentageRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT: {
				FrequencyRequirementLimit frequencyRequirementLimit = (FrequencyRequirementLimit)theEObject;
				T result = caseFrequencyRequirementLimit(frequencyRequirementLimit);
				if (result == null) result = caseRequirementLimit(frequencyRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT: {
				PercentageRequirementLimit percentageRequirementLimit = (PercentageRequirementLimit)theEObject;
				T result = casePercentageRequirementLimit(percentageRequirementLimit);
				if (result == null) result = caseRequirementLimit(percentageRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT: {
				CountRequirementLimit countRequirementLimit = (CountRequirementLimit)theEObject;
				T result = caseCountRequirementLimit(countRequirementLimit);
				if (result == null) result = caseRequirementLimit(countRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT: {
				TimeRequirementLimit timeRequirementLimit = (TimeRequirementLimit)theEObject;
				T result = caseTimeRequirementLimit(timeRequirementLimit);
				if (result == null) result = caseRequirementLimit(timeRequirementLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_COHERENCY_GROUP: {
				DataCoherencyGroup dataCoherencyGroup = (DataCoherencyGroup)theEObject;
				T result = caseDataCoherencyGroup(dataCoherencyGroup);
				if (result == null) result = caseReferableBaseObject(dataCoherencyGroup);
				if (result == null) result = caseIAnnotatable(dataCoherencyGroup);
				if (result == null) result = caseIReferable(dataCoherencyGroup);
				if (result == null) result = caseINamed(dataCoherencyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_STABILITY_GROUP: {
				DataStabilityGroup dataStabilityGroup = (DataStabilityGroup)theEObject;
				T result = caseDataStabilityGroup(dataStabilityGroup);
				if (result == null) result = caseReferableBaseObject(dataStabilityGroup);
				if (result == null) result = caseIAnnotatable(dataStabilityGroup);
				if (result == null) result = caseIReferable(dataStabilityGroup);
				if (result == null) result = caseINamed(dataStabilityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_GROUP_SCOPE: {
				DataGroupScope dataGroupScope = (DataGroupScope)theEObject;
				T result = caseDataGroupScope(dataGroupScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_SCOPE: {
				ProcessScope processScope = (ProcessScope)theEObject;
				T result = caseProcessScope(processScope);
				if (result == null) result = caseDataGroupScope(processScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_SCOPE: {
				RunnableScope runnableScope = (RunnableScope)theEObject;
				T result = caseRunnableScope(runnableScope);
				if (result == null) result = caseDataGroupScope(runnableScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENT_SCOPE: {
				ComponentScope componentScope = (ComponentScope)theEObject;
				T result = caseComponentScope(componentScope);
				if (result == null) result = caseDataGroupScope(componentScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_MODEL: {
				EventModel eventModel = (EventModel)theEObject;
				T result = caseEventModel(eventModel);
				if (result == null) result = caseBaseObject(eventModel);
				if (result == null) result = caseIAnnotatable(eventModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseReferableBaseObject(event);
				if (result == null) result = caseITaggable(event);
				if (result == null) result = caseIAnnotatable(event);
				if (result == null) result = caseIReferable(event);
				if (result == null) result = caseINamed(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_SET: {
				EventSet eventSet = (EventSet)theEObject;
				T result = caseEventSet(eventSet);
				if (result == null) result = caseEvent(eventSet);
				if (result == null) result = caseReferableBaseObject(eventSet);
				if (result == null) result = caseITaggable(eventSet);
				if (result == null) result = caseIAnnotatable(eventSet);
				if (result == null) result = caseIReferable(eventSet);
				if (result == null) result = caseINamed(eventSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ENTITY_EVENT: {
				EntityEvent entityEvent = (EntityEvent)theEObject;
				T result = caseEntityEvent(entityEvent);
				if (result == null) result = caseEvent(entityEvent);
				if (result == null) result = caseReferableBaseObject(entityEvent);
				if (result == null) result = caseITaggable(entityEvent);
				if (result == null) result = caseIAnnotatable(entityEvent);
				if (result == null) result = caseIReferable(entityEvent);
				if (result == null) result = caseINamed(entityEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TRIGGER_EVENT: {
				TriggerEvent triggerEvent = (TriggerEvent)theEObject;
				T result = caseTriggerEvent(triggerEvent);
				if (result == null) result = caseEntityEvent(triggerEvent);
				if (result == null) result = caseEvent(triggerEvent);
				if (result == null) result = caseReferableBaseObject(triggerEvent);
				if (result == null) result = caseITaggable(triggerEvent);
				if (result == null) result = caseIAnnotatable(triggerEvent);
				if (result == null) result = caseIReferable(triggerEvent);
				if (result == null) result = caseINamed(triggerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_EVENT: {
				CustomEvent customEvent = (CustomEvent)theEObject;
				T result = caseCustomEvent(customEvent);
				if (result == null) result = caseTriggerEvent(customEvent);
				if (result == null) result = caseEntityEvent(customEvent);
				if (result == null) result = caseEvent(customEvent);
				if (result == null) result = caseReferableBaseObject(customEvent);
				if (result == null) result = caseITaggable(customEvent);
				if (result == null) result = caseIAnnotatable(customEvent);
				if (result == null) result = caseIReferable(customEvent);
				if (result == null) result = caseINamed(customEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STIMULUS_EVENT: {
				StimulusEvent stimulusEvent = (StimulusEvent)theEObject;
				T result = caseStimulusEvent(stimulusEvent);
				if (result == null) result = caseEntityEvent(stimulusEvent);
				if (result == null) result = caseEvent(stimulusEvent);
				if (result == null) result = caseReferableBaseObject(stimulusEvent);
				if (result == null) result = caseITaggable(stimulusEvent);
				if (result == null) result = caseIAnnotatable(stimulusEvent);
				if (result == null) result = caseIReferable(stimulusEvent);
				if (result == null) result = caseINamed(stimulusEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_EVENT: {
				ProcessEvent processEvent = (ProcessEvent)theEObject;
				T result = caseProcessEvent(processEvent);
				if (result == null) result = caseEntityEvent(processEvent);
				if (result == null) result = caseEvent(processEvent);
				if (result == null) result = caseReferableBaseObject(processEvent);
				if (result == null) result = caseITaggable(processEvent);
				if (result == null) result = caseIAnnotatable(processEvent);
				if (result == null) result = caseIReferable(processEvent);
				if (result == null) result = caseINamed(processEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CHAIN_EVENT: {
				ProcessChainEvent processChainEvent = (ProcessChainEvent)theEObject;
				T result = caseProcessChainEvent(processChainEvent);
				if (result == null) result = caseEntityEvent(processChainEvent);
				if (result == null) result = caseEvent(processChainEvent);
				if (result == null) result = caseReferableBaseObject(processChainEvent);
				if (result == null) result = caseITaggable(processChainEvent);
				if (result == null) result = caseIAnnotatable(processChainEvent);
				if (result == null) result = caseIReferable(processChainEvent);
				if (result == null) result = caseINamed(processChainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_EVENT: {
				RunnableEvent runnableEvent = (RunnableEvent)theEObject;
				T result = caseRunnableEvent(runnableEvent);
				if (result == null) result = caseTriggerEvent(runnableEvent);
				if (result == null) result = caseEntityEvent(runnableEvent);
				if (result == null) result = caseEvent(runnableEvent);
				if (result == null) result = caseReferableBaseObject(runnableEvent);
				if (result == null) result = caseITaggable(runnableEvent);
				if (result == null) result = caseIAnnotatable(runnableEvent);
				if (result == null) result = caseIReferable(runnableEvent);
				if (result == null) result = caseINamed(runnableEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_EVENT: {
				LabelEvent labelEvent = (LabelEvent)theEObject;
				T result = caseLabelEvent(labelEvent);
				if (result == null) result = caseTriggerEvent(labelEvent);
				if (result == null) result = caseEntityEvent(labelEvent);
				if (result == null) result = caseEvent(labelEvent);
				if (result == null) result = caseReferableBaseObject(labelEvent);
				if (result == null) result = caseITaggable(labelEvent);
				if (result == null) result = caseIAnnotatable(labelEvent);
				if (result == null) result = caseIReferable(labelEvent);
				if (result == null) result = caseINamed(labelEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL_EVENT: {
				ChannelEvent channelEvent = (ChannelEvent)theEObject;
				T result = caseChannelEvent(channelEvent);
				if (result == null) result = caseTriggerEvent(channelEvent);
				if (result == null) result = caseEntityEvent(channelEvent);
				if (result == null) result = caseEvent(channelEvent);
				if (result == null) result = caseReferableBaseObject(channelEvent);
				if (result == null) result = caseITaggable(channelEvent);
				if (result == null) result = caseIAnnotatable(channelEvent);
				if (result == null) result = caseIReferable(channelEvent);
				if (result == null) result = caseINamed(channelEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SEMAPHORE_EVENT: {
				SemaphoreEvent semaphoreEvent = (SemaphoreEvent)theEObject;
				T result = caseSemaphoreEvent(semaphoreEvent);
				if (result == null) result = caseEntityEvent(semaphoreEvent);
				if (result == null) result = caseEvent(semaphoreEvent);
				if (result == null) result = caseReferableBaseObject(semaphoreEvent);
				if (result == null) result = caseITaggable(semaphoreEvent);
				if (result == null) result = caseIAnnotatable(semaphoreEvent);
				if (result == null) result = caseIReferable(semaphoreEvent);
				if (result == null) result = caseINamed(semaphoreEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPONENT_EVENT: {
				ComponentEvent componentEvent = (ComponentEvent)theEObject;
				T result = caseComponentEvent(componentEvent);
				if (result == null) result = caseEntityEvent(componentEvent);
				if (result == null) result = caseEvent(componentEvent);
				if (result == null) result = caseReferableBaseObject(componentEvent);
				if (result == null) result = caseITaggable(componentEvent);
				if (result == null) result = caseIAnnotatable(componentEvent);
				if (result == null) result = caseIReferable(componentEvent);
				if (result == null) result = caseINamed(componentEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_MODEL: {
				HWModel hwModel = (HWModel)theEObject;
				T result = caseHWModel(hwModel);
				if (result == null) result = caseBaseObject(hwModel);
				if (result == null) result = caseIAnnotatable(hwModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_STRUCTURE: {
				HwStructure hwStructure = (HwStructure)theEObject;
				T result = caseHwStructure(hwStructure);
				if (result == null) result = caseReferableBaseObject(hwStructure);
				if (result == null) result = caseITaggable(hwStructure);
				if (result == null) result = caseIAnnotatable(hwStructure);
				if (result == null) result = caseIReferable(hwStructure);
				if (result == null) result = caseINamed(hwStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_MODULE: {
				HwModule hwModule = (HwModule)theEObject;
				T result = caseHwModule(hwModule);
				if (result == null) result = caseReferableBaseObject(hwModule);
				if (result == null) result = caseITaggable(hwModule);
				if (result == null) result = caseIAnnotatable(hwModule);
				if (result == null) result = caseIReferable(hwModule);
				if (result == null) result = caseINamed(hwModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_DOMAIN: {
				HwDomain hwDomain = (HwDomain)theEObject;
				T result = caseHwDomain(hwDomain);
				if (result == null) result = caseReferableBaseObject(hwDomain);
				if (result == null) result = caseITaggable(hwDomain);
				if (result == null) result = caseIAnnotatable(hwDomain);
				if (result == null) result = caseIReferable(hwDomain);
				if (result == null) result = caseINamed(hwDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FREQUENCY_DOMAIN: {
				FrequencyDomain frequencyDomain = (FrequencyDomain)theEObject;
				T result = caseFrequencyDomain(frequencyDomain);
				if (result == null) result = caseHwDomain(frequencyDomain);
				if (result == null) result = caseReferableBaseObject(frequencyDomain);
				if (result == null) result = caseITaggable(frequencyDomain);
				if (result == null) result = caseIAnnotatable(frequencyDomain);
				if (result == null) result = caseIReferable(frequencyDomain);
				if (result == null) result = caseINamed(frequencyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.POWER_DOMAIN: {
				PowerDomain powerDomain = (PowerDomain)theEObject;
				T result = casePowerDomain(powerDomain);
				if (result == null) result = caseHwDomain(powerDomain);
				if (result == null) result = caseReferableBaseObject(powerDomain);
				if (result == null) result = caseITaggable(powerDomain);
				if (result == null) result = caseIAnnotatable(powerDomain);
				if (result == null) result = caseIReferable(powerDomain);
				if (result == null) result = caseINamed(powerDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESSING_UNIT: {
				ProcessingUnit processingUnit = (ProcessingUnit)theEObject;
				T result = caseProcessingUnit(processingUnit);
				if (result == null) result = caseHwModule(processingUnit);
				if (result == null) result = caseHwDestination(processingUnit);
				if (result == null) result = caseHwPathElement(processingUnit);
				if (result == null) result = caseReferableBaseObject(processingUnit);
				if (result == null) result = caseITaggable(processingUnit);
				if (result == null) result = caseIAnnotatable(processingUnit);
				if (result == null) result = caseIReferable(processingUnit);
				if (result == null) result = caseINamed(processingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T result = caseMemory(memory);
				if (result == null) result = caseHwModule(memory);
				if (result == null) result = caseHwDestination(memory);
				if (result == null) result = caseReferableBaseObject(memory);
				if (result == null) result = caseITaggable(memory);
				if (result == null) result = caseIAnnotatable(memory);
				if (result == null) result = caseIReferable(memory);
				if (result == null) result = caseINamed(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CACHE: {
				Cache cache = (Cache)theEObject;
				T result = caseCache(cache);
				if (result == null) result = caseHwModule(cache);
				if (result == null) result = caseHwPathElement(cache);
				if (result == null) result = caseReferableBaseObject(cache);
				if (result == null) result = caseITaggable(cache);
				if (result == null) result = caseIAnnotatable(cache);
				if (result == null) result = caseIReferable(cache);
				if (result == null) result = caseINamed(cache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_FEATURE_CATEGORY: {
				HwFeatureCategory hwFeatureCategory = (HwFeatureCategory)theEObject;
				T result = caseHwFeatureCategory(hwFeatureCategory);
				if (result == null) result = caseReferableBaseObject(hwFeatureCategory);
				if (result == null) result = caseIAnnotatable(hwFeatureCategory);
				if (result == null) result = caseIReferable(hwFeatureCategory);
				if (result == null) result = caseINamed(hwFeatureCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_FEATURE: {
				HwFeature hwFeature = (HwFeature)theEObject;
				T result = caseHwFeature(hwFeature);
				if (result == null) result = caseReferableBaseObject(hwFeature);
				if (result == null) result = caseIAnnotatable(hwFeature);
				if (result == null) result = caseIReferable(hwFeature);
				if (result == null) result = caseINamed(hwFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_PORT: {
				HwPort hwPort = (HwPort)theEObject;
				T result = caseHwPort(hwPort);
				if (result == null) result = caseReferableBaseObject(hwPort);
				if (result == null) result = caseITaggable(hwPort);
				if (result == null) result = caseIAnnotatable(hwPort);
				if (result == null) result = caseIReferable(hwPort);
				if (result == null) result = caseINamed(hwPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONNECTION_HANDLER: {
				ConnectionHandler connectionHandler = (ConnectionHandler)theEObject;
				T result = caseConnectionHandler(connectionHandler);
				if (result == null) result = caseHwModule(connectionHandler);
				if (result == null) result = caseHwPathElement(connectionHandler);
				if (result == null) result = caseReferableBaseObject(connectionHandler);
				if (result == null) result = caseITaggable(connectionHandler);
				if (result == null) result = caseIAnnotatable(connectionHandler);
				if (result == null) result = caseIReferable(connectionHandler);
				if (result == null) result = caseINamed(connectionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_CONNECTION: {
				HwConnection hwConnection = (HwConnection)theEObject;
				T result = caseHwConnection(hwConnection);
				if (result == null) result = caseReferableBaseObject(hwConnection);
				if (result == null) result = caseHwPathElement(hwConnection);
				if (result == null) result = caseITaggable(hwConnection);
				if (result == null) result = caseIAnnotatable(hwConnection);
				if (result == null) result = caseIReferable(hwConnection);
				if (result == null) result = caseINamed(hwConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_ACCESS_ELEMENT: {
				HwAccessElement hwAccessElement = (HwAccessElement)theEObject;
				T result = caseHwAccessElement(hwAccessElement);
				if (result == null) result = caseITaggable(hwAccessElement);
				if (result == null) result = caseINamed(hwAccessElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_DEFINITION: {
				HwDefinition hwDefinition = (HwDefinition)theEObject;
				T result = caseHwDefinition(hwDefinition);
				if (result == null) result = caseReferableBaseObject(hwDefinition);
				if (result == null) result = caseITaggable(hwDefinition);
				if (result == null) result = caseIAnnotatable(hwDefinition);
				if (result == null) result = caseIReferable(hwDefinition);
				if (result == null) result = caseINamed(hwDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION: {
				ProcessingUnitDefinition processingUnitDefinition = (ProcessingUnitDefinition)theEObject;
				T result = caseProcessingUnitDefinition(processingUnitDefinition);
				if (result == null) result = caseHwDefinition(processingUnitDefinition);
				if (result == null) result = caseReferableBaseObject(processingUnitDefinition);
				if (result == null) result = caseITaggable(processingUnitDefinition);
				if (result == null) result = caseIAnnotatable(processingUnitDefinition);
				if (result == null) result = caseIReferable(processingUnitDefinition);
				if (result == null) result = caseINamed(processingUnitDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION: {
				ConnectionHandlerDefinition connectionHandlerDefinition = (ConnectionHandlerDefinition)theEObject;
				T result = caseConnectionHandlerDefinition(connectionHandlerDefinition);
				if (result == null) result = caseHwDefinition(connectionHandlerDefinition);
				if (result == null) result = caseReferableBaseObject(connectionHandlerDefinition);
				if (result == null) result = caseITaggable(connectionHandlerDefinition);
				if (result == null) result = caseIAnnotatable(connectionHandlerDefinition);
				if (result == null) result = caseIReferable(connectionHandlerDefinition);
				if (result == null) result = caseINamed(connectionHandlerDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_DEFINITION: {
				MemoryDefinition memoryDefinition = (MemoryDefinition)theEObject;
				T result = caseMemoryDefinition(memoryDefinition);
				if (result == null) result = caseHwDefinition(memoryDefinition);
				if (result == null) result = caseReferableBaseObject(memoryDefinition);
				if (result == null) result = caseITaggable(memoryDefinition);
				if (result == null) result = caseIAnnotatable(memoryDefinition);
				if (result == null) result = caseIReferable(memoryDefinition);
				if (result == null) result = caseINamed(memoryDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CACHE_DEFINITION: {
				CacheDefinition cacheDefinition = (CacheDefinition)theEObject;
				T result = caseCacheDefinition(cacheDefinition);
				if (result == null) result = caseHwDefinition(cacheDefinition);
				if (result == null) result = caseReferableBaseObject(cacheDefinition);
				if (result == null) result = caseITaggable(cacheDefinition);
				if (result == null) result = caseIAnnotatable(cacheDefinition);
				if (result == null) result = caseIReferable(cacheDefinition);
				if (result == null) result = caseINamed(cacheDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_PATH: {
				HwPath hwPath = (HwPath)theEObject;
				T result = caseHwPath(hwPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_ACCESS_PATH: {
				HwAccessPath hwAccessPath = (HwAccessPath)theEObject;
				T result = caseHwAccessPath(hwAccessPath);
				if (result == null) result = caseHwPath(hwAccessPath);
				if (result == null) result = caseINamed(hwAccessPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_PATH_ELEMENT: {
				HwPathElement hwPathElement = (HwPathElement)theEObject;
				T result = caseHwPathElement(hwPathElement);
				if (result == null) result = caseIReferable(hwPathElement);
				if (result == null) result = caseINamed(hwPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.HW_DESTINATION: {
				HwDestination hwDestination = (HwDestination)theEObject;
				T result = caseHwDestination(hwDestination);
				if (result == null) result = caseIReferable(hwDestination);
				if (result == null) result = caseINamed(hwDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MAPPING_MODEL: {
				MappingModel mappingModel = (MappingModel)theEObject;
				T result = caseMappingModel(mappingModel);
				if (result == null) result = caseBaseObject(mappingModel);
				if (result == null) result = caseIAnnotatable(mappingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULER_ALLOCATION: {
				SchedulerAllocation schedulerAllocation = (SchedulerAllocation)theEObject;
				T result = caseSchedulerAllocation(schedulerAllocation);
				if (result == null) result = caseBaseObject(schedulerAllocation);
				if (result == null) result = caseIAnnotatable(schedulerAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK_ALLOCATION: {
				TaskAllocation taskAllocation = (TaskAllocation)theEObject;
				T result = caseTaskAllocation(taskAllocation);
				if (result == null) result = caseBaseObject(taskAllocation);
				if (result == null) result = caseIAnnotatable(taskAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ISR_ALLOCATION: {
				ISRAllocation isrAllocation = (ISRAllocation)theEObject;
				T result = caseISRAllocation(isrAllocation);
				if (result == null) result = caseBaseObject(isrAllocation);
				if (result == null) result = caseIAnnotatable(isrAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_ALLOCATION: {
				RunnableAllocation runnableAllocation = (RunnableAllocation)theEObject;
				T result = caseRunnableAllocation(runnableAllocation);
				if (result == null) result = caseBaseObject(runnableAllocation);
				if (result == null) result = caseIAnnotatable(runnableAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_MAPPING: {
				MemoryMapping memoryMapping = (MemoryMapping)theEObject;
				T result = caseMemoryMapping(memoryMapping);
				if (result == null) result = caseBaseObject(memoryMapping);
				if (result == null) result = caseIAnnotatable(memoryMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING: {
				PhysicalSectionMapping physicalSectionMapping = (PhysicalSectionMapping)theEObject;
				T result = casePhysicalSectionMapping(physicalSectionMapping);
				if (result == null) result = caseReferableBaseObject(physicalSectionMapping);
				if (result == null) result = caseIAnnotatable(physicalSectionMapping);
				if (result == null) result = caseIReferable(physicalSectionMapping);
				if (result == null) result = caseINamed(physicalSectionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_MODEL: {
				OSModel osModel = (OSModel)theEObject;
				T result = caseOSModel(osModel);
				if (result == null) result = caseBaseObject(osModel);
				if (result == null) result = caseIAnnotatable(osModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_DATA_CONSISTENCY: {
				OsDataConsistency osDataConsistency = (OsDataConsistency)theEObject;
				T result = caseOsDataConsistency(osDataConsistency);
				if (result == null) result = caseBaseObject(osDataConsistency);
				if (result == null) result = caseIAnnotatable(osDataConsistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_STABILITY: {
				DataStability dataStability = (DataStability)theEObject;
				T result = caseDataStability(dataStability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY: {
				NonAtomicDataCoherency nonAtomicDataCoherency = (NonAtomicDataCoherency)theEObject;
				T result = caseNonAtomicDataCoherency(nonAtomicDataCoherency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SEMAPHORE: {
				Semaphore semaphore = (Semaphore)theEObject;
				T result = caseSemaphore(semaphore);
				if (result == null) result = caseReferableBaseObject(semaphore);
				if (result == null) result = caseIAnnotatable(semaphore);
				if (result == null) result = caseIReferable(semaphore);
				if (result == null) result = caseINamed(semaphore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				T result = caseScheduler(scheduler);
				if (result == null) result = caseReferableBaseObject(scheduler);
				if (result == null) result = caseIAnnotatable(scheduler);
				if (result == null) result = caseIReferable(scheduler);
				if (result == null) result = caseINamed(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK_SCHEDULER: {
				TaskScheduler taskScheduler = (TaskScheduler)theEObject;
				T result = caseTaskScheduler(taskScheduler);
				if (result == null) result = caseScheduler(taskScheduler);
				if (result == null) result = caseReferableBaseObject(taskScheduler);
				if (result == null) result = caseIAnnotatable(taskScheduler);
				if (result == null) result = caseIReferable(taskScheduler);
				if (result == null) result = caseINamed(taskScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULER_ASSOCIATION: {
				SchedulerAssociation schedulerAssociation = (SchedulerAssociation)theEObject;
				T result = caseSchedulerAssociation(schedulerAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTERRUPT_CONTROLLER: {
				InterruptController interruptController = (InterruptController)theEObject;
				T result = caseInterruptController(interruptController);
				if (result == null) result = caseScheduler(interruptController);
				if (result == null) result = caseReferableBaseObject(interruptController);
				if (result == null) result = caseIAnnotatable(interruptController);
				if (result == null) result = caseIReferable(interruptController);
				if (result == null) result = caseINamed(interruptController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULING_PARAMETERS: {
				SchedulingParameters schedulingParameters = (SchedulingParameters)theEObject;
				T result = caseSchedulingParameters(schedulingParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PARAMETER_EXTENSION: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> parameterExtension = (Map.Entry<String, String>)theEObject;
				T result = caseParameterExtension(parameterExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ALGORITHM: {
				Algorithm algorithm = (Algorithm)theEObject;
				T result = caseAlgorithm(algorithm);
				if (result == null) result = caseBaseObject(algorithm);
				if (result == null) result = caseIAnnotatable(algorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTERRUPT_SCHEDULING_ALGORITHM: {
				InterruptSchedulingAlgorithm interruptSchedulingAlgorithm = (InterruptSchedulingAlgorithm)theEObject;
				T result = caseInterruptSchedulingAlgorithm(interruptSchedulingAlgorithm);
				if (result == null) result = caseAlgorithm(interruptSchedulingAlgorithm);
				if (result == null) result = caseBaseObject(interruptSchedulingAlgorithm);
				if (result == null) result = caseIAnnotatable(interruptSchedulingAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK_SCHEDULING_ALGORITHM: {
				TaskSchedulingAlgorithm taskSchedulingAlgorithm = (TaskSchedulingAlgorithm)theEObject;
				T result = caseTaskSchedulingAlgorithm(taskSchedulingAlgorithm);
				if (result == null) result = caseAlgorithm(taskSchedulingAlgorithm);
				if (result == null) result = caseBaseObject(taskSchedulingAlgorithm);
				if (result == null) result = caseIAnnotatable(taskSchedulingAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FIXED_PRIORITY: {
				FixedPriority fixedPriority = (FixedPriority)theEObject;
				T result = caseFixedPriority(fixedPriority);
				if (result == null) result = caseTaskSchedulingAlgorithm(fixedPriority);
				if (result == null) result = caseAlgorithm(fixedPriority);
				if (result == null) result = caseBaseObject(fixedPriority);
				if (result == null) result = caseIAnnotatable(fixedPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FIXED_PRIORITY_PREEMPTIVE: {
				FixedPriorityPreemptive fixedPriorityPreemptive = (FixedPriorityPreemptive)theEObject;
				T result = caseFixedPriorityPreemptive(fixedPriorityPreemptive);
				if (result == null) result = caseFixedPriority(fixedPriorityPreemptive);
				if (result == null) result = caseTaskSchedulingAlgorithm(fixedPriorityPreemptive);
				if (result == null) result = caseAlgorithm(fixedPriorityPreemptive);
				if (result == null) result = caseBaseObject(fixedPriorityPreemptive);
				if (result == null) result = caseIAnnotatable(fixedPriorityPreemptive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FIXED_PRIORITY_PREEMPTIVE_WITH_BUDGET_ENFORCEMENT: {
				FixedPriorityPreemptiveWithBudgetEnforcement fixedPriorityPreemptiveWithBudgetEnforcement = (FixedPriorityPreemptiveWithBudgetEnforcement)theEObject;
				T result = caseFixedPriorityPreemptiveWithBudgetEnforcement(fixedPriorityPreemptiveWithBudgetEnforcement);
				if (result == null) result = caseFixedPriority(fixedPriorityPreemptiveWithBudgetEnforcement);
				if (result == null) result = caseTaskSchedulingAlgorithm(fixedPriorityPreemptiveWithBudgetEnforcement);
				if (result == null) result = caseAlgorithm(fixedPriorityPreemptiveWithBudgetEnforcement);
				if (result == null) result = caseBaseObject(fixedPriorityPreemptiveWithBudgetEnforcement);
				if (result == null) result = caseIAnnotatable(fixedPriorityPreemptiveWithBudgetEnforcement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OSEK: {
				OSEK osek = (OSEK)theEObject;
				T result = caseOSEK(osek);
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
				T result = caseDeadlineMonotonic(deadlineMonotonic);
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
				T result = caseRateMonotonic(rateMonotonic);
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
				T result = casePfair(pfair);
				if (result == null) result = caseTaskSchedulingAlgorithm(pfair);
				if (result == null) result = caseAlgorithm(pfair);
				if (result == null) result = caseBaseObject(pfair);
				if (result == null) result = caseIAnnotatable(pfair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PFAIR_PD2: {
				PfairPD2 pfairPD2 = (PfairPD2)theEObject;
				T result = casePfairPD2(pfairPD2);
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
				T result = casePartlyPFairPD2(partlyPFairPD2);
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
				T result = caseEarlyReleaseFairPD2(earlyReleaseFairPD2);
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
				T result = casePartlyEarlyReleaseFairPD2(partlyEarlyReleaseFairPD2);
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
				T result = caseDynamicPriority(dynamicPriority);
				if (result == null) result = caseTaskSchedulingAlgorithm(dynamicPriority);
				if (result == null) result = caseAlgorithm(dynamicPriority);
				if (result == null) result = caseBaseObject(dynamicPriority);
				if (result == null) result = caseIAnnotatable(dynamicPriority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST: {
				LeastLocalRemainingExecutionTimeFirst leastLocalRemainingExecutionTimeFirst = (LeastLocalRemainingExecutionTimeFirst)theEObject;
				T result = caseLeastLocalRemainingExecutionTimeFirst(leastLocalRemainingExecutionTimeFirst);
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
				T result = caseEarliestDeadlineFirst(earliestDeadlineFirst);
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
				T result = casePriorityBasedRoundRobin(priorityBasedRoundRobin);
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
				T result = caseReservationBasedServer(reservationBasedServer);
				if (result == null) result = caseTaskSchedulingAlgorithm(reservationBasedServer);
				if (result == null) result = caseAlgorithm(reservationBasedServer);
				if (result == null) result = caseBaseObject(reservationBasedServer);
				if (result == null) result = caseIAnnotatable(reservationBasedServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DEFERRABLE_SERVER: {
				DeferrableServer deferrableServer = (DeferrableServer)theEObject;
				T result = caseDeferrableServer(deferrableServer);
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
				T result = casePollingPeriodicServer(pollingPeriodicServer);
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
				T result = caseSporadicServer(sporadicServer);
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
				T result = caseConstantBandwidthServer(constantBandwidthServer);
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
				T result = caseConstantBandwidthServerWithCASH(constantBandwidthServerWithCASH);
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
				T result = caseGrouping(grouping);
				if (result == null) result = caseTaskSchedulingAlgorithm(grouping);
				if (result == null) result = caseAlgorithm(grouping);
				if (result == null) result = caseBaseObject(grouping);
				if (result == null) result = caseIAnnotatable(grouping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM: {
				UserSpecificSchedulingAlgorithm userSpecificSchedulingAlgorithm = (UserSpecificSchedulingAlgorithm)theEObject;
				T result = caseUserSpecificSchedulingAlgorithm(userSpecificSchedulingAlgorithm);
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
				T result = casePriorityBased(priorityBased);
				if (result == null) result = caseInterruptSchedulingAlgorithm(priorityBased);
				if (result == null) result = caseAlgorithm(priorityBased);
				if (result == null) result = caseBaseObject(priorityBased);
				if (result == null) result = caseIAnnotatable(priorityBased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OPERATING_SYSTEM: {
				OperatingSystem operatingSystem = (OperatingSystem)theEObject;
				T result = caseOperatingSystem(operatingSystem);
				if (result == null) result = caseBaseObject(operatingSystem);
				if (result == null) result = caseINamed(operatingSystem);
				if (result == null) result = caseIAnnotatable(operatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.VENDOR_OPERATING_SYSTEM: {
				VendorOperatingSystem vendorOperatingSystem = (VendorOperatingSystem)theEObject;
				T result = caseVendorOperatingSystem(vendorOperatingSystem);
				if (result == null) result = caseOperatingSystem(vendorOperatingSystem);
				if (result == null) result = caseBaseObject(vendorOperatingSystem);
				if (result == null) result = caseINamed(vendorOperatingSystem);
				if (result == null) result = caseIAnnotatable(vendorOperatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_OVERHEAD: {
				OsOverhead osOverhead = (OsOverhead)theEObject;
				T result = caseOsOverhead(osOverhead);
				if (result == null) result = caseReferableBaseObject(osOverhead);
				if (result == null) result = caseIAnnotatable(osOverhead);
				if (result == null) result = caseIReferable(osOverhead);
				if (result == null) result = caseINamed(osOverhead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_API_OVERHEAD: {
				OsAPIOverhead osAPIOverhead = (OsAPIOverhead)theEObject;
				T result = caseOsAPIOverhead(osAPIOverhead);
				if (result == null) result = caseBaseObject(osAPIOverhead);
				if (result == null) result = caseIAnnotatable(osAPIOverhead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_ISR_OVERHEAD: {
				OsISROverhead osISROverhead = (OsISROverhead)theEObject;
				T result = caseOsISROverhead(osISROverhead);
				if (result == null) result = caseBaseObject(osISROverhead);
				if (result == null) result = caseIAnnotatable(osISROverhead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL: {
				PropertyConstraintsModel propertyConstraintsModel = (PropertyConstraintsModel)theEObject;
				T result = casePropertyConstraintsModel(propertyConstraintsModel);
				if (result == null) result = caseBaseObject(propertyConstraintsModel);
				if (result == null) result = caseIAnnotatable(propertyConstraintsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CORE_ALLOCATION_CONSTRAINT: {
				CoreAllocationConstraint coreAllocationConstraint = (CoreAllocationConstraint)theEObject;
				T result = caseCoreAllocationConstraint(coreAllocationConstraint);
				if (result == null) result = caseBaseObject(coreAllocationConstraint);
				if (result == null) result = caseIAnnotatable(coreAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_MAPPING_CONSTRAINT: {
				MemoryMappingConstraint memoryMappingConstraint = (MemoryMappingConstraint)theEObject;
				T result = caseMemoryMappingConstraint(memoryMappingConstraint);
				if (result == null) result = caseBaseObject(memoryMappingConstraint);
				if (result == null) result = caseIAnnotatable(memoryMappingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_ALLOCATION_CONSTRAINT: {
				ProcessAllocationConstraint processAllocationConstraint = (ProcessAllocationConstraint)theEObject;
				T result = caseProcessAllocationConstraint(processAllocationConstraint);
				if (result == null) result = caseCoreAllocationConstraint(processAllocationConstraint);
				if (result == null) result = caseBaseObject(processAllocationConstraint);
				if (result == null) result = caseIAnnotatable(processAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT: {
				ProcessPrototypeAllocationConstraint processPrototypeAllocationConstraint = (ProcessPrototypeAllocationConstraint)theEObject;
				T result = caseProcessPrototypeAllocationConstraint(processPrototypeAllocationConstraint);
				if (result == null) result = caseCoreAllocationConstraint(processPrototypeAllocationConstraint);
				if (result == null) result = caseBaseObject(processPrototypeAllocationConstraint);
				if (result == null) result = caseIAnnotatable(processPrototypeAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_ALLOCATION_CONSTRAINT: {
				RunnableAllocationConstraint runnableAllocationConstraint = (RunnableAllocationConstraint)theEObject;
				T result = caseRunnableAllocationConstraint(runnableAllocationConstraint);
				if (result == null) result = caseCoreAllocationConstraint(runnableAllocationConstraint);
				if (result == null) result = caseBaseObject(runnableAllocationConstraint);
				if (result == null) result = caseIAnnotatable(runnableAllocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT: {
				AbstractElementMappingConstraint abstractElementMappingConstraint = (AbstractElementMappingConstraint)theEObject;
				T result = caseAbstractElementMappingConstraint(abstractElementMappingConstraint);
				if (result == null) result = caseMemoryMappingConstraint(abstractElementMappingConstraint);
				if (result == null) result = caseBaseObject(abstractElementMappingConstraint);
				if (result == null) result = caseIAnnotatable(abstractElementMappingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLASSIFICATION: {
				Classification classification = (Classification)theEObject;
				T result = caseClassification(classification);
				if (result == null) result = caseBaseObject(classification);
				if (result == null) result = caseIAnnotatable(classification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CORE_CLASSIFICATION: {
				CoreClassification coreClassification = (CoreClassification)theEObject;
				T result = caseCoreClassification(coreClassification);
				if (result == null) result = caseClassification(coreClassification);
				if (result == null) result = caseBaseObject(coreClassification);
				if (result == null) result = caseIAnnotatable(coreClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEMORY_CLASSIFICATION: {
				MemoryClassification memoryClassification = (MemoryClassification)theEObject;
				T result = caseMemoryClassification(memoryClassification);
				if (result == null) result = caseClassification(memoryClassification);
				if (result == null) result = caseBaseObject(memoryClassification);
				if (result == null) result = caseIAnnotatable(memoryClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STIMULI_MODEL: {
				StimuliModel stimuliModel = (StimuliModel)theEObject;
				T result = caseStimuliModel(stimuliModel);
				if (result == null) result = caseBaseObject(stimuliModel);
				if (result == null) result = caseIAnnotatable(stimuliModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STIMULUS: {
				Stimulus stimulus = (Stimulus)theEObject;
				T result = caseStimulus(stimulus);
				if (result == null) result = caseReferableBaseObject(stimulus);
				if (result == null) result = caseITaggable(stimulus);
				if (result == null) result = caseIAnnotatable(stimulus);
				if (result == null) result = caseIReferable(stimulus);
				if (result == null) result = caseINamed(stimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_VALUE_LIST: {
				ModeValueList modeValueList = (ModeValueList)theEObject;
				T result = caseModeValueList(modeValueList);
				if (result == null) result = caseBaseObject(modeValueList);
				if (result == null) result = caseIAnnotatable(modeValueList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_VALUE_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<ModeLabel, String> modeValueMapEntry = (Map.Entry<ModeLabel, String>)theEObject;
				T result = caseModeValueMapEntry(modeValueMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_VALUE: {
				ModeValue modeValue = (ModeValue)theEObject;
				T result = caseModeValue(modeValue);
				if (result == null) result = caseBaseObject(modeValue);
				if (result == null) result = caseIAnnotatable(modeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_ASSIGNMENT: {
				ModeAssignment modeAssignment = (ModeAssignment)theEObject;
				T result = caseModeAssignment(modeAssignment);
				if (result == null) result = caseModeValue(modeAssignment);
				if (result == null) result = caseBaseObject(modeAssignment);
				if (result == null) result = caseIAnnotatable(modeAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_CONDITION_DISJUNCTION: {
				ModeConditionDisjunction modeConditionDisjunction = (ModeConditionDisjunction)theEObject;
				T result = caseModeConditionDisjunction(modeConditionDisjunction);
				if (result == null) result = caseBaseObject(modeConditionDisjunction);
				if (result == null) result = caseIAnnotatable(modeConditionDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_CONDITION_DISJUNCTION_ENTRY: {
				ModeConditionDisjunctionEntry modeConditionDisjunctionEntry = (ModeConditionDisjunctionEntry)theEObject;
				T result = caseModeConditionDisjunctionEntry(modeConditionDisjunctionEntry);
				if (result == null) result = caseBaseObject(modeConditionDisjunctionEntry);
				if (result == null) result = caseIAnnotatable(modeConditionDisjunctionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_CONDITION: {
				ModeCondition modeCondition = (ModeCondition)theEObject;
				T result = caseModeCondition(modeCondition);
				if (result == null) result = caseModeValue(modeCondition);
				if (result == null) result = caseModeConditionDisjunctionEntry(modeCondition);
				if (result == null) result = caseBaseObject(modeCondition);
				if (result == null) result = caseIAnnotatable(modeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_CONDITION_CONJUNCTION: {
				ModeConditionConjunction modeConditionConjunction = (ModeConditionConjunction)theEObject;
				T result = caseModeConditionConjunction(modeConditionConjunction);
				if (result == null) result = caseModeConditionDisjunctionEntry(modeConditionConjunction);
				if (result == null) result = caseBaseObject(modeConditionConjunction);
				if (result == null) result = caseIAnnotatable(modeConditionConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.FIXED_PERIODIC: {
				FixedPeriodic fixedPeriodic = (FixedPeriodic)theEObject;
				T result = caseFixedPeriodic(fixedPeriodic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PERIODIC_STIMULUS: {
				PeriodicStimulus periodicStimulus = (PeriodicStimulus)theEObject;
				T result = casePeriodicStimulus(periodicStimulus);
				if (result == null) result = caseStimulus(periodicStimulus);
				if (result == null) result = caseFixedPeriodic(periodicStimulus);
				if (result == null) result = caseReferableBaseObject(periodicStimulus);
				if (result == null) result = caseITaggable(periodicStimulus);
				if (result == null) result = caseIAnnotatable(periodicStimulus);
				if (result == null) result = caseIReferable(periodicStimulus);
				if (result == null) result = caseINamed(periodicStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS: {
				RelativePeriodicStimulus relativePeriodicStimulus = (RelativePeriodicStimulus)theEObject;
				T result = caseRelativePeriodicStimulus(relativePeriodicStimulus);
				if (result == null) result = caseStimulus(relativePeriodicStimulus);
				if (result == null) result = caseReferableBaseObject(relativePeriodicStimulus);
				if (result == null) result = caseITaggable(relativePeriodicStimulus);
				if (result == null) result = caseIAnnotatable(relativePeriodicStimulus);
				if (result == null) result = caseIReferable(relativePeriodicStimulus);
				if (result == null) result = caseINamed(relativePeriodicStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS: {
				VariableRateStimulus variableRateStimulus = (VariableRateStimulus)theEObject;
				T result = caseVariableRateStimulus(variableRateStimulus);
				if (result == null) result = caseStimulus(variableRateStimulus);
				if (result == null) result = caseReferableBaseObject(variableRateStimulus);
				if (result == null) result = caseITaggable(variableRateStimulus);
				if (result == null) result = caseIAnnotatable(variableRateStimulus);
				if (result == null) result = caseIReferable(variableRateStimulus);
				if (result == null) result = caseINamed(variableRateStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = caseBaseObject(scenario);
				if (result == null) result = caseIAnnotatable(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PERIODIC_SYNTHETIC_STIMULUS: {
				PeriodicSyntheticStimulus periodicSyntheticStimulus = (PeriodicSyntheticStimulus)theEObject;
				T result = casePeriodicSyntheticStimulus(periodicSyntheticStimulus);
				if (result == null) result = caseStimulus(periodicSyntheticStimulus);
				if (result == null) result = caseFixedPeriodic(periodicSyntheticStimulus);
				if (result == null) result = caseReferableBaseObject(periodicSyntheticStimulus);
				if (result == null) result = caseITaggable(periodicSyntheticStimulus);
				if (result == null) result = caseIAnnotatable(periodicSyntheticStimulus);
				if (result == null) result = caseIReferable(periodicSyntheticStimulus);
				if (result == null) result = caseINamed(periodicSyntheticStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_STIMULUS: {
				CustomStimulus customStimulus = (CustomStimulus)theEObject;
				T result = caseCustomStimulus(customStimulus);
				if (result == null) result = caseStimulus(customStimulus);
				if (result == null) result = caseReferableBaseObject(customStimulus);
				if (result == null) result = caseITaggable(customStimulus);
				if (result == null) result = caseIAnnotatable(customStimulus);
				if (result == null) result = caseIReferable(customStimulus);
				if (result == null) result = caseINamed(customStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SINGLE_STIMULUS: {
				SingleStimulus singleStimulus = (SingleStimulus)theEObject;
				T result = caseSingleStimulus(singleStimulus);
				if (result == null) result = caseStimulus(singleStimulus);
				if (result == null) result = caseReferableBaseObject(singleStimulus);
				if (result == null) result = caseITaggable(singleStimulus);
				if (result == null) result = caseIAnnotatable(singleStimulus);
				if (result == null) result = caseIReferable(singleStimulus);
				if (result == null) result = caseINamed(singleStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTER_PROCESS_STIMULUS: {
				InterProcessStimulus interProcessStimulus = (InterProcessStimulus)theEObject;
				T result = caseInterProcessStimulus(interProcessStimulus);
				if (result == null) result = caseStimulus(interProcessStimulus);
				if (result == null) result = caseReferableBaseObject(interProcessStimulus);
				if (result == null) result = caseITaggable(interProcessStimulus);
				if (result == null) result = caseIAnnotatable(interProcessStimulus);
				if (result == null) result = caseIReferable(interProcessStimulus);
				if (result == null) result = caseINamed(interProcessStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS: {
				PeriodicBurstStimulus periodicBurstStimulus = (PeriodicBurstStimulus)theEObject;
				T result = casePeriodicBurstStimulus(periodicBurstStimulus);
				if (result == null) result = caseStimulus(periodicBurstStimulus);
				if (result == null) result = caseFixedPeriodic(periodicBurstStimulus);
				if (result == null) result = caseReferableBaseObject(periodicBurstStimulus);
				if (result == null) result = caseITaggable(periodicBurstStimulus);
				if (result == null) result = caseIAnnotatable(periodicBurstStimulus);
				if (result == null) result = caseIReferable(periodicBurstStimulus);
				if (result == null) result = caseINamed(periodicBurstStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_STIMULUS: {
				EventStimulus eventStimulus = (EventStimulus)theEObject;
				T result = caseEventStimulus(eventStimulus);
				if (result == null) result = caseStimulus(eventStimulus);
				if (result == null) result = caseReferableBaseObject(eventStimulus);
				if (result == null) result = caseITaggable(eventStimulus);
				if (result == null) result = caseIAnnotatable(eventStimulus);
				if (result == null) result = caseIReferable(eventStimulus);
				if (result == null) result = caseINamed(eventStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ARRIVAL_CURVE_STIMULUS: {
				ArrivalCurveStimulus arrivalCurveStimulus = (ArrivalCurveStimulus)theEObject;
				T result = caseArrivalCurveStimulus(arrivalCurveStimulus);
				if (result == null) result = caseStimulus(arrivalCurveStimulus);
				if (result == null) result = caseReferableBaseObject(arrivalCurveStimulus);
				if (result == null) result = caseITaggable(arrivalCurveStimulus);
				if (result == null) result = caseIAnnotatable(arrivalCurveStimulus);
				if (result == null) result = caseIReferable(arrivalCurveStimulus);
				if (result == null) result = caseINamed(arrivalCurveStimulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY: {
				ArrivalCurveEntry arrivalCurveEntry = (ArrivalCurveEntry)theEObject;
				T result = caseArrivalCurveEntry(arrivalCurveEntry);
				if (result == null) result = caseBaseObject(arrivalCurveEntry);
				if (result == null) result = caseIAnnotatable(arrivalCurveEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK: {
				Clock clock = (Clock)theEObject;
				T result = caseClock(clock);
				if (result == null) result = caseReferableBaseObject(clock);
				if (result == null) result = caseIAnnotatable(clock);
				if (result == null) result = caseIReferable(clock);
				if (result == null) result = caseINamed(clock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK_FUNCTION: {
				ClockFunction clockFunction = (ClockFunction)theEObject;
				T result = caseClockFunction(clockFunction);
				if (result == null) result = caseClock(clockFunction);
				if (result == null) result = caseReferableBaseObject(clockFunction);
				if (result == null) result = caseIAnnotatable(clockFunction);
				if (result == null) result = caseIReferable(clockFunction);
				if (result == null) result = caseINamed(clockFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK_STEP_LIST: {
				ClockStepList clockStepList = (ClockStepList)theEObject;
				T result = caseClockStepList(clockStepList);
				if (result == null) result = caseClock(clockStepList);
				if (result == null) result = caseReferableBaseObject(clockStepList);
				if (result == null) result = caseIAnnotatable(clockStepList);
				if (result == null) result = caseIReferable(clockStepList);
				if (result == null) result = caseINamed(clockStepList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLOCK_STEP: {
				ClockStep clockStep = (ClockStep)theEObject;
				T result = caseClockStep(clockStep);
				if (result == null) result = caseBaseObject(clockStep);
				if (result == null) result = caseIAnnotatable(clockStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SW_MODEL: {
				SWModel swModel = (SWModel)theEObject;
				T result = caseSWModel(swModel);
				if (result == null) result = caseBaseObject(swModel);
				if (result == null) result = caseIAnnotatable(swModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT: {
				AbstractMemoryElement abstractMemoryElement = (AbstractMemoryElement)theEObject;
				T result = caseAbstractMemoryElement(abstractMemoryElement);
				if (result == null) result = caseReferableBaseObject(abstractMemoryElement);
				if (result == null) result = caseITaggable(abstractMemoryElement);
				if (result == null) result = caseIAnnotatable(abstractMemoryElement);
				if (result == null) result = caseIReferable(abstractMemoryElement);
				if (result == null) result = caseINamed(abstractMemoryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ABSTRACT_PROCESS: {
				AbstractProcess abstractProcess = (AbstractProcess)theEObject;
				T result = caseAbstractProcess(abstractProcess);
				if (result == null) result = caseAbstractMemoryElement(abstractProcess);
				if (result == null) result = caseReferableBaseObject(abstractProcess);
				if (result == null) result = caseITaggable(abstractProcess);
				if (result == null) result = caseIAnnotatable(abstractProcess);
				if (result == null) result = caseIReferable(abstractProcess);
				if (result == null) result = caseINamed(abstractProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_ENTITY: {
				CustomEntity customEntity = (CustomEntity)theEObject;
				T result = caseCustomEntity(customEntity);
				if (result == null) result = caseAbstractMemoryElement(customEntity);
				if (result == null) result = caseReferableBaseObject(customEntity);
				if (result == null) result = caseITaggable(customEntity);
				if (result == null) result = caseIAnnotatable(customEntity);
				if (result == null) result = caseIReferable(customEntity);
				if (result == null) result = caseINamed(customEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_CHAIN: {
				ProcessChain processChain = (ProcessChain)theEObject;
				T result = caseProcessChain(processChain);
				if (result == null) result = caseReferableBaseObject(processChain);
				if (result == null) result = caseIAnnotatable(processChain);
				if (result == null) result = caseIReferable(processChain);
				if (result == null) result = caseINamed(processChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS: {
				org.eclipse.app4mc.amalthea.model.Process process = (org.eclipse.app4mc.amalthea.model.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseAbstractProcess(process);
				if (result == null) result = caseAbstractMemoryElement(process);
				if (result == null) result = caseReferableBaseObject(process);
				if (result == null) result = caseITaggable(process);
				if (result == null) result = caseIAnnotatable(process);
				if (result == null) result = caseIReferable(process);
				if (result == null) result = caseINamed(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ICALL_GRAPH_ITEM_CONTAINER: {
				ICallGraphItemContainer iCallGraphItemContainer = (ICallGraphItemContainer)theEObject;
				T result = caseICallGraphItemContainer(iCallGraphItemContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CALL_GRAPH: {
				CallGraph callGraph = (CallGraph)theEObject;
				T result = caseCallGraph(callGraph);
				if (result == null) result = caseBaseObject(callGraph);
				if (result == null) result = caseICallGraphItemContainer(callGraph);
				if (result == null) result = caseIAnnotatable(callGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CALL_GRAPH_ITEM: {
				CallGraphItem callGraphItem = (CallGraphItem)theEObject;
				T result = caseCallGraphItem(callGraphItem);
				if (result == null) result = caseBaseObject(callGraphItem);
				if (result == null) result = caseIAnnotatable(callGraphItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_SWITCH: {
				ModeSwitch modeSwitch = (ModeSwitch)theEObject;
				T result = caseModeSwitch(modeSwitch);
				if (result == null) result = caseCallGraphItem(modeSwitch);
				if (result == null) result = caseBaseObject(modeSwitch);
				if (result == null) result = caseIAnnotatable(modeSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_SWITCH_ENTRY: {
				ModeSwitchEntry modeSwitchEntry = (ModeSwitchEntry)theEObject;
				T result = caseModeSwitchEntry(modeSwitchEntry);
				if (result == null) result = caseBaseObject(modeSwitchEntry);
				if (result == null) result = caseINamed(modeSwitchEntry);
				if (result == null) result = caseICallGraphItemContainer(modeSwitchEntry);
				if (result == null) result = caseIAnnotatable(modeSwitchEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_SWITCH_DEFAULT: {
				ModeSwitchDefault modeSwitchDefault = (ModeSwitchDefault)theEObject;
				T result = caseModeSwitchDefault(modeSwitchDefault);
				if (result == null) result = caseBaseObject(modeSwitchDefault);
				if (result == null) result = caseICallGraphItemContainer(modeSwitchDefault);
				if (result == null) result = caseIAnnotatable(modeSwitchDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROBABILITY_SWITCH: {
				ProbabilitySwitch probabilitySwitch = (ProbabilitySwitch)theEObject;
				T result = caseProbabilitySwitch(probabilitySwitch);
				if (result == null) result = caseCallGraphItem(probabilitySwitch);
				if (result == null) result = caseBaseObject(probabilitySwitch);
				if (result == null) result = caseIAnnotatable(probabilitySwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROBABILITY_SWITCH_ENTRY: {
				ProbabilitySwitchEntry probabilitySwitchEntry = (ProbabilitySwitchEntry)theEObject;
				T result = caseProbabilitySwitchEntry(probabilitySwitchEntry);
				if (result == null) result = caseBaseObject(probabilitySwitchEntry);
				if (result == null) result = caseICallGraphItemContainer(probabilitySwitchEntry);
				if (result == null) result = caseIAnnotatable(probabilitySwitchEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T result = caseCounter(counter);
				if (result == null) result = caseBaseObject(counter);
				if (result == null) result = caseIAnnotatable(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.WAIT_EVENT: {
				WaitEvent waitEvent = (WaitEvent)theEObject;
				T result = caseWaitEvent(waitEvent);
				if (result == null) result = caseCallGraphItem(waitEvent);
				if (result == null) result = caseBaseObject(waitEvent);
				if (result == null) result = caseIAnnotatable(waitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SET_EVENT: {
				SetEvent setEvent = (SetEvent)theEObject;
				T result = caseSetEvent(setEvent);
				if (result == null) result = caseCallGraphItem(setEvent);
				if (result == null) result = caseBaseObject(setEvent);
				if (result == null) result = caseIAnnotatable(setEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CLEAR_EVENT: {
				ClearEvent clearEvent = (ClearEvent)theEObject;
				T result = caseClearEvent(clearEvent);
				if (result == null) result = caseCallGraphItem(clearEvent);
				if (result == null) result = caseBaseObject(clearEvent);
				if (result == null) result = caseIAnnotatable(clearEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_MASK: {
				EventMask eventMask = (EventMask)theEObject;
				T result = caseEventMask(eventMask);
				if (result == null) result = caseBaseObject(eventMask);
				if (result == null) result = caseIAnnotatable(eventMask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.OS_EVENT: {
				OsEvent osEvent = (OsEvent)theEObject;
				T result = caseOsEvent(osEvent);
				if (result == null) result = caseReferableBaseObject(osEvent);
				if (result == null) result = caseITaggable(osEvent);
				if (result == null) result = caseIAnnotatable(osEvent);
				if (result == null) result = caseIReferable(osEvent);
				if (result == null) result = caseINamed(osEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.INTER_PROCESS_TRIGGER: {
				InterProcessTrigger interProcessTrigger = (InterProcessTrigger)theEObject;
				T result = caseInterProcessTrigger(interProcessTrigger);
				if (result == null) result = caseCallGraphItem(interProcessTrigger);
				if (result == null) result = caseBaseObject(interProcessTrigger);
				if (result == null) result = caseIAnnotatable(interProcessTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ENFORCED_MIGRATION: {
				EnforcedMigration enforcedMigration = (EnforcedMigration)theEObject;
				T result = caseEnforcedMigration(enforcedMigration);
				if (result == null) result = caseCallGraphItem(enforcedMigration);
				if (result == null) result = caseBaseObject(enforcedMigration);
				if (result == null) result = caseIAnnotatable(enforcedMigration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SCHEDULE_POINT: {
				SchedulePoint schedulePoint = (SchedulePoint)theEObject;
				T result = caseSchedulePoint(schedulePoint);
				if (result == null) result = caseCallGraphItem(schedulePoint);
				if (result == null) result = caseBaseObject(schedulePoint);
				if (result == null) result = caseIAnnotatable(schedulePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TERMINATE_PROCESS: {
				TerminateProcess terminateProcess = (TerminateProcess)theEObject;
				T result = caseTerminateProcess(terminateProcess);
				if (result == null) result = caseCallGraphItem(terminateProcess);
				if (result == null) result = caseBaseObject(terminateProcess);
				if (result == null) result = caseIAnnotatable(terminateProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseProcess(task);
				if (result == null) result = caseAbstractProcess(task);
				if (result == null) result = caseAbstractMemoryElement(task);
				if (result == null) result = caseReferableBaseObject(task);
				if (result == null) result = caseITaggable(task);
				if (result == null) result = caseIAnnotatable(task);
				if (result == null) result = caseIReferable(task);
				if (result == null) result = caseINamed(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ISR: {
				ISR isr = (ISR)theEObject;
				T result = caseISR(isr);
				if (result == null) result = caseProcess(isr);
				if (result == null) result = caseAbstractProcess(isr);
				if (result == null) result = caseAbstractMemoryElement(isr);
				if (result == null) result = caseReferableBaseObject(isr);
				if (result == null) result = caseITaggable(isr);
				if (result == null) result = caseIAnnotatable(isr);
				if (result == null) result = caseIReferable(isr);
				if (result == null) result = caseINamed(isr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PROCESS_PROTOTYPE: {
				ProcessPrototype processPrototype = (ProcessPrototype)theEObject;
				T result = caseProcessPrototype(processPrototype);
				if (result == null) result = caseAbstractProcess(processPrototype);
				if (result == null) result = caseAbstractMemoryElement(processPrototype);
				if (result == null) result = caseReferableBaseObject(processPrototype);
				if (result == null) result = caseITaggable(processPrototype);
				if (result == null) result = caseIAnnotatable(processPrototype);
				if (result == null) result = caseIReferable(processPrototype);
				if (result == null) result = caseINamed(processPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE: {
				ChainedProcessPrototype chainedProcessPrototype = (ChainedProcessPrototype)theEObject;
				T result = caseChainedProcessPrototype(chainedProcessPrototype);
				if (result == null) result = caseBaseObject(chainedProcessPrototype);
				if (result == null) result = caseIAnnotatable(chainedProcessPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.GENERAL_PRECEDENCE: {
				GeneralPrecedence generalPrecedence = (GeneralPrecedence)theEObject;
				T result = caseGeneralPrecedence(generalPrecedence);
				if (result == null) result = caseBaseObject(generalPrecedence);
				if (result == null) result = caseIAnnotatable(generalPrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ACCESS_PRECEDENCE_SPEC: {
				AccessPrecedenceSpec accessPrecedenceSpec = (AccessPrecedenceSpec)theEObject;
				T result = caseAccessPrecedenceSpec(accessPrecedenceSpec);
				if (result == null) result = caseGeneralPrecedence(accessPrecedenceSpec);
				if (result == null) result = caseBaseObject(accessPrecedenceSpec);
				if (result == null) result = caseIAnnotatable(accessPrecedenceSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ORDER_PRECEDENCE_SPEC: {
				OrderPrecedenceSpec orderPrecedenceSpec = (OrderPrecedenceSpec)theEObject;
				T result = caseOrderPrecedenceSpec(orderPrecedenceSpec);
				if (result == null) result = caseGeneralPrecedence(orderPrecedenceSpec);
				if (result == null) result = caseBaseObject(orderPrecedenceSpec);
				if (result == null) result = caseIAnnotatable(orderPrecedenceSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_DEPENDENCY: {
				DataDependency dataDependency = (DataDependency)theEObject;
				T result = caseDataDependency(dataDependency);
				if (result == null) result = caseBaseObject(dataDependency);
				if (result == null) result = caseIAnnotatable(dataDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_PARAMETER: {
				RunnableParameter runnableParameter = (RunnableParameter)theEObject;
				T result = caseRunnableParameter(runnableParameter);
				if (result == null) result = caseReferableBaseObject(runnableParameter);
				if (result == null) result = caseIAnnotatable(runnableParameter);
				if (result == null) result = caseIReferable(runnableParameter);
				if (result == null) result = caseINamed(runnableParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE: {
				org.eclipse.app4mc.amalthea.model.Runnable runnable = (org.eclipse.app4mc.amalthea.model.Runnable)theEObject;
				T result = caseRunnable(runnable);
				if (result == null) result = caseAbstractMemoryElement(runnable);
				if (result == null) result = caseReferableBaseObject(runnable);
				if (result == null) result = caseITaggable(runnable);
				if (result == null) result = caseIAnnotatable(runnable);
				if (result == null) result = caseIReferable(runnable);
				if (result == null) result = caseINamed(runnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseAbstractMemoryElement(label);
				if (result == null) result = caseIDisplayName(label);
				if (result == null) result = caseReferableBaseObject(label);
				if (result == null) result = caseITaggable(label);
				if (result == null) result = caseIAnnotatable(label);
				if (result == null) result = caseIReferable(label);
				if (result == null) result = caseINamed(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = caseAbstractMemoryElement(channel);
				if (result == null) result = caseIDisplayName(channel);
				if (result == null) result = caseReferableBaseObject(channel);
				if (result == null) result = caseITaggable(channel);
				if (result == null) result = caseIAnnotatable(channel);
				if (result == null) result = caseIReferable(channel);
				if (result == null) result = caseINamed(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_LABEL: {
				ModeLabel modeLabel = (ModeLabel)theEObject;
				T result = caseModeLabel(modeLabel);
				if (result == null) result = caseAbstractMemoryElement(modeLabel);
				if (result == null) result = caseIDisplayName(modeLabel);
				if (result == null) result = caseReferableBaseObject(modeLabel);
				if (result == null) result = caseITaggable(modeLabel);
				if (result == null) result = caseIAnnotatable(modeLabel);
				if (result == null) result = caseIReferable(modeLabel);
				if (result == null) result = caseINamed(modeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseReferableBaseObject(section);
				if (result == null) result = caseIAnnotatable(section);
				if (result == null) result = caseIReferable(section);
				if (result == null) result = caseINamed(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPUTATION_ITEM: {
				ComputationItem computationItem = (ComputationItem)theEObject;
				T result = caseComputationItem(computationItem);
				if (result == null) result = caseCallGraphItem(computationItem);
				if (result == null) result = caseBaseObject(computationItem);
				if (result == null) result = caseIAnnotatable(computationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EXECUTION_NEED: {
				ExecutionNeed executionNeed = (ExecutionNeed)theEObject;
				T result = caseExecutionNeed(executionNeed);
				if (result == null) result = caseCallGraphItem(executionNeed);
				if (result == null) result = caseBaseObject(executionNeed);
				if (result == null) result = caseIAnnotatable(executionNeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.NEED_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, IDiscreteValueDeviation> needEntry = (Map.Entry<String, IDiscreteValueDeviation>)theEObject;
				T result = caseNeedEntry(needEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TICKS: {
				Ticks ticks = (Ticks)theEObject;
				T result = caseTicks(ticks);
				if (result == null) result = caseComputationItem(ticks);
				if (result == null) result = caseCallGraphItem(ticks);
				if (result == null) result = caseBaseObject(ticks);
				if (result == null) result = caseIAnnotatable(ticks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TICKS_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<ProcessingUnitDefinition, IDiscreteValueDeviation> ticksEntry = (Map.Entry<ProcessingUnitDefinition, IDiscreteValueDeviation>)theEObject;
				T result = caseTicksEntry(ticksEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MODE_LABEL_ACCESS: {
				ModeLabelAccess modeLabelAccess = (ModeLabelAccess)theEObject;
				T result = caseModeLabelAccess(modeLabelAccess);
				if (result == null) result = caseCallGraphItem(modeLabelAccess);
				if (result == null) result = caseBaseObject(modeLabelAccess);
				if (result == null) result = caseIAnnotatable(modeLabelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_ACCESS: {
				LabelAccess labelAccess = (LabelAccess)theEObject;
				T result = caseLabelAccess(labelAccess);
				if (result == null) result = caseComputationItem(labelAccess);
				if (result == null) result = caseITaggable(labelAccess);
				if (result == null) result = caseCallGraphItem(labelAccess);
				if (result == null) result = caseBaseObject(labelAccess);
				if (result == null) result = caseIAnnotatable(labelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL_ACCESS: {
				ChannelAccess channelAccess = (ChannelAccess)theEObject;
				T result = caseChannelAccess(channelAccess);
				if (result == null) result = caseCallGraphItem(channelAccess);
				if (result == null) result = caseBaseObject(channelAccess);
				if (result == null) result = caseIAnnotatable(channelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL_SEND: {
				ChannelSend channelSend = (ChannelSend)theEObject;
				T result = caseChannelSend(channelSend);
				if (result == null) result = caseChannelAccess(channelSend);
				if (result == null) result = caseCallGraphItem(channelSend);
				if (result == null) result = caseBaseObject(channelSend);
				if (result == null) result = caseIAnnotatable(channelSend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CHANNEL_RECEIVE: {
				ChannelReceive channelReceive = (ChannelReceive)theEObject;
				T result = caseChannelReceive(channelReceive);
				if (result == null) result = caseChannelAccess(channelReceive);
				if (result == null) result = caseCallGraphItem(channelReceive);
				if (result == null) result = caseBaseObject(channelReceive);
				if (result == null) result = caseIAnnotatable(channelReceive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SEMAPHORE_ACCESS: {
				SemaphoreAccess semaphoreAccess = (SemaphoreAccess)theEObject;
				T result = caseSemaphoreAccess(semaphoreAccess);
				if (result == null) result = caseCallGraphItem(semaphoreAccess);
				if (result == null) result = caseBaseObject(semaphoreAccess);
				if (result == null) result = caseIAnnotatable(semaphoreAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SENDER_RECEIVER_COMMUNICATION: {
				SenderReceiverCommunication senderReceiverCommunication = (SenderReceiverCommunication)theEObject;
				T result = caseSenderReceiverCommunication(senderReceiverCommunication);
				if (result == null) result = caseCallGraphItem(senderReceiverCommunication);
				if (result == null) result = caseBaseObject(senderReceiverCommunication);
				if (result == null) result = caseIAnnotatable(senderReceiverCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SENDER_RECEIVER_READ: {
				SenderReceiverRead senderReceiverRead = (SenderReceiverRead)theEObject;
				T result = caseSenderReceiverRead(senderReceiverRead);
				if (result == null) result = caseSenderReceiverCommunication(senderReceiverRead);
				if (result == null) result = caseCallGraphItem(senderReceiverRead);
				if (result == null) result = caseBaseObject(senderReceiverRead);
				if (result == null) result = caseIAnnotatable(senderReceiverRead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SENDER_RECEIVER_WRITE: {
				SenderReceiverWrite senderReceiverWrite = (SenderReceiverWrite)theEObject;
				T result = caseSenderReceiverWrite(senderReceiverWrite);
				if (result == null) result = caseSenderReceiverCommunication(senderReceiverWrite);
				if (result == null) result = caseCallGraphItem(senderReceiverWrite);
				if (result == null) result = caseBaseObject(senderReceiverWrite);
				if (result == null) result = caseIAnnotatable(senderReceiverWrite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SERVER_CALL: {
				ServerCall serverCall = (ServerCall)theEObject;
				T result = caseServerCall(serverCall);
				if (result == null) result = caseCallGraphItem(serverCall);
				if (result == null) result = caseBaseObject(serverCall);
				if (result == null) result = caseIAnnotatable(serverCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL: {
				SynchronousServerCall synchronousServerCall = (SynchronousServerCall)theEObject;
				T result = caseSynchronousServerCall(synchronousServerCall);
				if (result == null) result = caseServerCall(synchronousServerCall);
				if (result == null) result = caseCallGraphItem(synchronousServerCall);
				if (result == null) result = caseBaseObject(synchronousServerCall);
				if (result == null) result = caseIAnnotatable(synchronousServerCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL: {
				AsynchronousServerCall asynchronousServerCall = (AsynchronousServerCall)theEObject;
				T result = caseAsynchronousServerCall(asynchronousServerCall);
				if (result == null) result = caseServerCall(asynchronousServerCall);
				if (result == null) result = caseCallGraphItem(asynchronousServerCall);
				if (result == null) result = caseBaseObject(asynchronousServerCall);
				if (result == null) result = caseIAnnotatable(asynchronousServerCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.GET_RESULT_SERVER_CALL: {
				GetResultServerCall getResultServerCall = (GetResultServerCall)theEObject;
				T result = caseGetResultServerCall(getResultServerCall);
				if (result == null) result = caseServerCall(getResultServerCall);
				if (result == null) result = caseCallGraphItem(getResultServerCall);
				if (result == null) result = caseBaseObject(getResultServerCall);
				if (result == null) result = caseIAnnotatable(getResultServerCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseCallGraphItem(group);
				if (result == null) result = caseINamed(group);
				if (result == null) result = caseICallGraphItemContainer(group);
				if (result == null) result = caseBaseObject(group);
				if (result == null) result = caseIAnnotatable(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CALL_ARGUMENT: {
				CallArgument callArgument = (CallArgument)theEObject;
				T result = caseCallArgument(callArgument);
				if (result == null) result = caseReferableObject(callArgument);
				if (result == null) result = caseIReferable(callArgument);
				if (result == null) result = caseINamed(callArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_CALL: {
				RunnableCall runnableCall = (RunnableCall)theEObject;
				T result = caseRunnableCall(runnableCall);
				if (result == null) result = caseCallGraphItem(runnableCall);
				if (result == null) result = caseITaggable(runnableCall);
				if (result == null) result = caseBaseObject(runnableCall);
				if (result == null) result = caseIAnnotatable(runnableCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER: {
				CustomEventTrigger customEventTrigger = (CustomEventTrigger)theEObject;
				T result = caseCustomEventTrigger(customEventTrigger);
				if (result == null) result = caseCallGraphItem(customEventTrigger);
				if (result == null) result = caseBaseObject(customEventTrigger);
				if (result == null) result = caseIAnnotatable(customEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.COMPOUND_TYPE: {
				CompoundType compoundType = (CompoundType)theEObject;
				T result = caseCompoundType(compoundType);
				if (result == null) result = caseBaseObject(compoundType);
				if (result == null) result = caseDataType(compoundType);
				if (result == null) result = caseIAnnotatable(compoundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STRUCT: {
				Struct struct = (Struct)theEObject;
				T result = caseStruct(struct);
				if (result == null) result = caseCompoundType(struct);
				if (result == null) result = caseBaseObject(struct);
				if (result == null) result = caseDataType(struct);
				if (result == null) result = caseIAnnotatable(struct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.STRUCT_ENTRY: {
				StructEntry structEntry = (StructEntry)theEObject;
				T result = caseStructEntry(structEntry);
				if (result == null) result = caseBaseObject(structEntry);
				if (result == null) result = caseINamed(structEntry);
				if (result == null) result = caseIAnnotatable(structEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = caseCompoundType(array);
				if (result == null) result = caseBaseObject(array);
				if (result == null) result = caseDataType(array);
				if (result == null) result = caseIAnnotatable(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.POINTER: {
				Pointer pointer = (Pointer)theEObject;
				T result = casePointer(pointer);
				if (result == null) result = caseCompoundType(pointer);
				if (result == null) result = caseBaseObject(pointer);
				if (result == null) result = caseDataType(pointer);
				if (result == null) result = caseIAnnotatable(pointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TYPE_REF: {
				TypeRef typeRef = (TypeRef)theEObject;
				T result = caseTypeRef(typeRef);
				if (result == null) result = caseBaseObject(typeRef);
				if (result == null) result = caseDataType(typeRef);
				if (result == null) result = caseIAnnotatable(typeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ALIAS: {
				Alias alias = (Alias)theEObject;
				T result = caseAlias(alias);
				if (result == null) result = caseBaseObject(alias);
				if (result == null) result = caseIAnnotatable(alias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseReferableBaseObject(typeDefinition);
				if (result == null) result = caseIAnnotatable(typeDefinition);
				if (result == null) result = caseIReferable(typeDefinition);
				if (result == null) result = caseINamed(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.DATA_TYPE_DEFINITION: {
				DataTypeDefinition dataTypeDefinition = (DataTypeDefinition)theEObject;
				T result = caseDataTypeDefinition(dataTypeDefinition);
				if (result == null) result = caseTypeDefinition(dataTypeDefinition);
				if (result == null) result = caseReferableBaseObject(dataTypeDefinition);
				if (result == null) result = caseIAnnotatable(dataTypeDefinition);
				if (result == null) result = caseIReferable(dataTypeDefinition);
				if (result == null) result = caseINamed(dataTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.BASE_TYPE_DEFINITION: {
				BaseTypeDefinition baseTypeDefinition = (BaseTypeDefinition)theEObject;
				T result = caseBaseTypeDefinition(baseTypeDefinition);
				if (result == null) result = caseTypeDefinition(baseTypeDefinition);
				if (result == null) result = caseReferableBaseObject(baseTypeDefinition);
				if (result == null) result = caseIAnnotatable(baseTypeDefinition);
				if (result == null) result = caseIReferable(baseTypeDefinition);
				if (result == null) result = caseINamed(baseTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.ACTIVATION: {
				Activation activation = (Activation)theEObject;
				T result = caseActivation(activation);
				if (result == null) result = caseReferableBaseObject(activation);
				if (result == null) result = caseITaggable(activation);
				if (result == null) result = caseIAnnotatable(activation);
				if (result == null) result = caseIReferable(activation);
				if (result == null) result = caseINamed(activation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.PERIODIC_ACTIVATION: {
				PeriodicActivation periodicActivation = (PeriodicActivation)theEObject;
				T result = casePeriodicActivation(periodicActivation);
				if (result == null) result = caseActivation(periodicActivation);
				if (result == null) result = caseReferableBaseObject(periodicActivation);
				if (result == null) result = caseITaggable(periodicActivation);
				if (result == null) result = caseIAnnotatable(periodicActivation);
				if (result == null) result = caseIReferable(periodicActivation);
				if (result == null) result = caseINamed(periodicActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION: {
				VariableRateActivation variableRateActivation = (VariableRateActivation)theEObject;
				T result = caseVariableRateActivation(variableRateActivation);
				if (result == null) result = caseActivation(variableRateActivation);
				if (result == null) result = caseReferableBaseObject(variableRateActivation);
				if (result == null) result = caseITaggable(variableRateActivation);
				if (result == null) result = caseIAnnotatable(variableRateActivation);
				if (result == null) result = caseIReferable(variableRateActivation);
				if (result == null) result = caseINamed(variableRateActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SPORADIC_ACTIVATION: {
				SporadicActivation sporadicActivation = (SporadicActivation)theEObject;
				T result = caseSporadicActivation(sporadicActivation);
				if (result == null) result = caseActivation(sporadicActivation);
				if (result == null) result = caseReferableBaseObject(sporadicActivation);
				if (result == null) result = caseITaggable(sporadicActivation);
				if (result == null) result = caseIAnnotatable(sporadicActivation);
				if (result == null) result = caseIReferable(sporadicActivation);
				if (result == null) result = caseINamed(sporadicActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.SINGLE_ACTIVATION: {
				SingleActivation singleActivation = (SingleActivation)theEObject;
				T result = caseSingleActivation(singleActivation);
				if (result == null) result = caseActivation(singleActivation);
				if (result == null) result = caseReferableBaseObject(singleActivation);
				if (result == null) result = caseITaggable(singleActivation);
				if (result == null) result = caseIAnnotatable(singleActivation);
				if (result == null) result = caseIReferable(singleActivation);
				if (result == null) result = caseINamed(singleActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_ACTIVATION: {
				EventActivation eventActivation = (EventActivation)theEObject;
				T result = caseEventActivation(eventActivation);
				if (result == null) result = caseActivation(eventActivation);
				if (result == null) result = caseReferableBaseObject(eventActivation);
				if (result == null) result = caseITaggable(eventActivation);
				if (result == null) result = caseIAnnotatable(eventActivation);
				if (result == null) result = caseIReferable(eventActivation);
				if (result == null) result = caseINamed(eventActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.CUSTOM_ACTIVATION: {
				CustomActivation customActivation = (CustomActivation)theEObject;
				T result = caseCustomActivation(customActivation);
				if (result == null) result = caseActivation(customActivation);
				if (result == null) result = caseReferableBaseObject(customActivation);
				if (result == null) result = caseITaggable(customActivation);
				if (result == null) result = caseIAnnotatable(customActivation);
				if (result == null) result = caseIReferable(customActivation);
				if (result == null) result = caseINamed(customActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC: {
				LabelAccessStatistic labelAccessStatistic = (LabelAccessStatistic)theEObject;
				T result = caseLabelAccessStatistic(labelAccessStatistic);
				if (result == null) result = caseBaseObject(labelAccessStatistic);
				if (result == null) result = caseIAnnotatable(labelAccessStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUN_ENTITY_CALL_STATISTIC: {
				RunEntityCallStatistic runEntityCallStatistic = (RunEntityCallStatistic)theEObject;
				T result = caseRunEntityCallStatistic(runEntityCallStatistic);
				if (result == null) result = caseBaseObject(runEntityCallStatistic);
				if (result == null) result = caseIAnnotatable(runEntityCallStatistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEASUREMENT_MODEL: {
				MeasurementModel measurementModel = (MeasurementModel)theEObject;
				T result = caseMeasurementModel(measurementModel);
				if (result == null) result = caseBaseObject(measurementModel);
				if (result == null) result = caseIAnnotatable(measurementModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.MEASUREMENT: {
				Measurement measurement = (Measurement)theEObject;
				T result = caseMeasurement(measurement);
				if (result == null) result = caseBaseObject(measurement);
				if (result == null) result = caseIAnnotatable(measurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.EVENT_CHAIN_MEASUREMENT: {
				EventChainMeasurement eventChainMeasurement = (EventChainMeasurement)theEObject;
				T result = caseEventChainMeasurement(eventChainMeasurement);
				if (result == null) result = caseMeasurement(eventChainMeasurement);
				if (result == null) result = caseBaseObject(eventChainMeasurement);
				if (result == null) result = caseIAnnotatable(eventChainMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.TASK_MEASUREMENT: {
				TaskMeasurement taskMeasurement = (TaskMeasurement)theEObject;
				T result = caseTaskMeasurement(taskMeasurement);
				if (result == null) result = caseMeasurement(taskMeasurement);
				if (result == null) result = caseBaseObject(taskMeasurement);
				if (result == null) result = caseIAnnotatable(taskMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmaltheaPackage.RUNNABLE_MEASUREMENT: {
				RunnableMeasurement runnableMeasurement = (RunnableMeasurement)theEObject;
				T result = caseRunnableMeasurement(runnableMeasurement);
				if (result == null) result = caseMeasurement(runnableMeasurement);
				if (result == null) result = caseBaseObject(runnableMeasurement);
				if (result == null) result = caseIAnnotatable(runnableMeasurement);
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
	public T caseAmalthea(Amalthea object) {
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
	public T caseCommonElements(CommonElements object) {
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
	public T caseBaseObject(BaseObject object) {
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
	public T caseReferableObject(ReferableObject object) {
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
	public T caseReferableBaseObject(ReferableBaseObject object) {
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
	public T caseIAnnotatable(IAnnotatable object) {
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
	public T caseITaggable(ITaggable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INamed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamed(INamed object) {
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
	public T caseIReferable(IReferable object) {
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
	public T caseIDisplayName(IDisplayName object) {
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
	public T caseTag(Tag object) {
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
	public T caseClassifier(Classifier object) {
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
	public T caseCoreClassifier(CoreClassifier object) {
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
	public T caseMemoryClassifier(MemoryClassifier object) {
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
	public T caseTransmissionPolicy(TransmissionPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
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
	public T caseTimeComparable(Comparable<Time> object) {
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
	public T caseTime(Time object) {
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
	public T caseFrequency(Frequency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltage(Voltage object) {
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
	public T caseDataSize(DataSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Rate Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Rate Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRateComparable(Comparable<DataRate> object) {
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
	public T caseDataRate(DataRate object) {
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
	public T caseCustomProperty(Map.Entry<String, Value> object) {
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
	public T caseValue(Value object) {
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
	public T caseListObject(ListObject object) {
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
	public T caseStringObject(StringObject object) {
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
	public T caseBigIntegerObject(BigIntegerObject object) {
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
	public T caseReferenceObject(ReferenceObject object) {
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
	public T caseIntegerObject(IntegerObject object) {
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
	public T caseLongObject(LongObject object) {
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
	public T caseFloatObject(FloatObject object) {
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
	public T caseDoubleObject(DoubleObject object) {
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
	public T caseBooleanObject(BooleanObject object) {
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
	public T caseNumericStatistic(NumericStatistic object) {
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
	public T caseMinAvgMaxStatistic(MinAvgMaxStatistic object) {
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
	public T caseSingleValueStatistic(SingleValueStatistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITime Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITime Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITimeDeviation(ITimeDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstant(TimeConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Histogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeHistogram(TimeHistogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Histogram Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Histogram Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeHistogramEntry(TimeHistogramEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Time Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Time Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedTimeDistribution(BoundedTimeDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truncated Time Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truncated Time Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruncatedTimeDistribution(TruncatedTimeDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Boundaries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Boundaries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBoundaries(TimeBoundaries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStatistics(TimeStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Uniform Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Uniform Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeUniformDistribution(TimeUniformDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Gauss Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Gauss Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeGaussDistribution(TimeGaussDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Weibull Estimators Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Weibull Estimators Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeWeibullEstimatorsDistribution(TimeWeibullEstimatorsDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Beta Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Beta Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBetaDistribution(TimeBetaDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDiscrete Value Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDiscrete Value Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDiscreteValueDeviation(IDiscreteValueDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueInterval(DiscreteValueInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueConstant(DiscreteValueConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Histogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueHistogram(DiscreteValueHistogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Histogram Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Histogram Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueHistogramEntry(DiscreteValueHistogramEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Discrete Value Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Discrete Value Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedDiscreteValueDistribution(BoundedDiscreteValueDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truncated Discrete Value Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truncated Discrete Value Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruncatedDiscreteValueDistribution(TruncatedDiscreteValueDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Boundaries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Boundaries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueBoundaries(DiscreteValueBoundaries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueStatistics(DiscreteValueStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Uniform Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Uniform Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueUniformDistribution(DiscreteValueUniformDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Gauss Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Gauss Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueGaussDistribution(DiscreteValueGaussDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Weibull Estimators Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Weibull Estimators Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueWeibullEstimatorsDistribution(DiscreteValueWeibullEstimatorsDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value Beta Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value Beta Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValueBetaDistribution(DiscreteValueBetaDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IContinuous Value Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IContinuous Value Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIContinuousValueDeviation(IContinuousValueDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueInterval(ContinuousValueInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueConstant(ContinuousValueConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Histogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueHistogram(ContinuousValueHistogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Histogram Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Histogram Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueHistogramEntry(ContinuousValueHistogramEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Continuous Value Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Continuous Value Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedContinuousValueDistribution(BoundedContinuousValueDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truncated Continuous Value Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truncated Continuous Value Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruncatedContinuousValueDistribution(TruncatedContinuousValueDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Boundaries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Boundaries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueBoundaries(ContinuousValueBoundaries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueStatistics(ContinuousValueStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Uniform Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Uniform Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueUniformDistribution(ContinuousValueUniformDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Gauss Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Gauss Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueGaussDistribution(ContinuousValueGaussDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Weibull Estimators Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Weibull Estimators Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueWeibullEstimatorsDistribution(ContinuousValueWeibullEstimatorsDistribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Value Beta Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Value Beta Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousValueBetaDistribution(ContinuousValueBetaDistribution object) {
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
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericMode(NumericMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumMode(EnumMode object) {
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
	public T caseModeLiteral(ModeLiteral object) {
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
	public T caseComponentsModel(ComponentsModel object) {
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
	public T caseISystem(ISystem object) {
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
	public T casePort(Port object) {
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
	public T caseComponent(Component object) {
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
	public T caseComposite(Composite object) {
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
	public T caseSystem(org.eclipse.app4mc.amalthea.model.System object) {
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
	public T caseComponentInstance(ComponentInstance object) {
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
	public T caseConnector(Connector object) {
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
	public T caseQualifiedPort(QualifiedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacePort(InterfacePort object) {
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
	public T caseConfigModel(ConfigModel object) {
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
	public T caseEventConfig(EventConfig object) {
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
	public T caseConstraintsModel(ConstraintsModel object) {
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
	public T caseRunnableSequencingConstraint(RunnableSequencingConstraint object) {
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
	public T caseAffinityConstraint(AffinityConstraint object) {
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
	public T caseSeparationConstraint(SeparationConstraint object) {
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
	public T casePairingConstraint(PairingConstraint object) {
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
	public T caseProcessConstraint(ProcessConstraint object) {
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
	public T caseRunnableConstraint(RunnableConstraint object) {
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
	public T caseDataConstraint(DataConstraint object) {
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
	public T caseRunnableSeparationConstraint(RunnableSeparationConstraint object) {
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
	public T caseProcessSeparationConstraint(ProcessSeparationConstraint object) {
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
	public T caseDataSeparationConstraint(DataSeparationConstraint object) {
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
	public T caseRunnablePairingConstraint(RunnablePairingConstraint object) {
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
	public T caseProcessPairingConstraint(ProcessPairingConstraint object) {
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
	public T caseDataPairingConstraint(DataPairingConstraint object) {
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
	public T caseRunnableConstraintTarget(RunnableConstraintTarget object) {
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
	public T caseProcessConstraintTarget(ProcessConstraintTarget object) {
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
	public T caseDataConstraintTarget(DataConstraintTarget object) {
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
	public T caseTargetMemory(TargetMemory object) {
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
	public T caseTargetCore(TargetCore object) {
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
	public T caseTargetScheduler(TargetScheduler object) {
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
	public T caseLabelGroup(LabelGroup object) {
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
	public T caseRunnableGroup(RunnableGroup object) {
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
	public T caseProcessGroup(ProcessGroup object) {
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
	public T caseLabelEntityGroup(LabelEntityGroup object) {
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
	public T caseRunnableEntityGroup(RunnableEntityGroup object) {
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
	public T caseProcessEntityGroup(ProcessEntityGroup object) {
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
	public T caseTagGroup(TagGroup object) {
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
	public T caseAbstractEventChain(AbstractEventChain object) {
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
	public T caseEventChain(EventChain object) {
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
	public T caseSubEventChain(SubEventChain object) {
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
	public T caseEventChainItem(EventChainItem object) {
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
	public T caseEventChainReference(EventChainReference object) {
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
	public T caseEventChainContainer(EventChainContainer object) {
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
	public T caseTimingConstraint(TimingConstraint object) {
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
	public T casePhysicalSectionConstraint(PhysicalSectionConstraint object) {
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
	public T caseSynchronizationConstraint(SynchronizationConstraint object) {
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
	public T caseEventSynchronizationConstraint(EventSynchronizationConstraint object) {
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
	public T caseEventChainSynchronizationConstraint(EventChainSynchronizationConstraint object) {
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
	public T caseDelayConstraint(DelayConstraint object) {
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
	public T caseEventChainLatencyConstraint(EventChainLatencyConstraint object) {
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
	public T caseRepetitionConstraint(RepetitionConstraint object) {
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
	public T caseDataAgeConstraint(DataAgeConstraint object) {
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
	public T caseDataAge(DataAge object) {
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
	public T caseDataAgeCycle(DataAgeCycle object) {
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
	public T caseDataAgeTime(DataAgeTime object) {
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
	public T caseRequirement(Requirement object) {
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
	public T caseProcessRequirement(ProcessRequirement object) {
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
	public T caseRunnableRequirement(RunnableRequirement object) {
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
	public T caseArchitectureRequirement(ArchitectureRequirement object) {
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
	public T caseProcessChainRequirement(ProcessChainRequirement object) {
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
	public T caseRequirementLimit(RequirementLimit object) {
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
	public T caseCPUPercentageRequirementLimit(CPUPercentageRequirementLimit object) {
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
	public T caseFrequencyRequirementLimit(FrequencyRequirementLimit object) {
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
	public T casePercentageRequirementLimit(PercentageRequirementLimit object) {
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
	public T caseCountRequirementLimit(CountRequirementLimit object) {
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
	public T caseTimeRequirementLimit(TimeRequirementLimit object) {
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
	public T caseDataCoherencyGroup(DataCoherencyGroup object) {
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
	public T caseDataStabilityGroup(DataStabilityGroup object) {
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
	public T caseDataGroupScope(DataGroupScope object) {
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
	public T caseProcessScope(ProcessScope object) {
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
	public T caseRunnableScope(RunnableScope object) {
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
	public T caseComponentScope(ComponentScope object) {
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
	public T caseEventModel(EventModel object) {
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
	public T caseEvent(Event object) {
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
	public T caseEventSet(EventSet object) {
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
	public T caseEntityEvent(EntityEvent object) {
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
	public T caseTriggerEvent(TriggerEvent object) {
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
	public T caseCustomEvent(CustomEvent object) {
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
	public T caseStimulusEvent(StimulusEvent object) {
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
	public T caseProcessEvent(ProcessEvent object) {
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
	public T caseProcessChainEvent(ProcessChainEvent object) {
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
	public T caseRunnableEvent(RunnableEvent object) {
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
	public T caseLabelEvent(LabelEvent object) {
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
	public T caseChannelEvent(ChannelEvent object) {
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
	public T caseSemaphoreEvent(SemaphoreEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentEvent(ComponentEvent object) {
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
	public T caseHWModel(HWModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwStructure(HwStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwModule(HwModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwDomain(HwDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyDomain(FrequencyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerDomain(PowerDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingUnit(ProcessingUnit object) {
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
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCache(Cache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Feature Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Feature Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwFeatureCategory(HwFeatureCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwFeature(HwFeature object) {
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
	public T caseHwPort(HwPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionHandler(ConnectionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwConnection(HwConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Access Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Access Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwAccessElement(HwAccessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwDefinition(HwDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Unit Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Unit Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingUnitDefinition(ProcessingUnitDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Handler Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Handler Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionHandlerDefinition(ConnectionHandlerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryDefinition(MemoryDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCacheDefinition(CacheDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwPath(HwPath object) {
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
	public T caseHwAccessPath(HwAccessPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwPathElement(HwPathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwDestination(HwDestination object) {
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
	public T caseMappingModel(MappingModel object) {
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
	public T caseSchedulerAllocation(SchedulerAllocation object) {
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
	public T caseTaskAllocation(TaskAllocation object) {
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
	public T caseISRAllocation(ISRAllocation object) {
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
	public T caseRunnableAllocation(RunnableAllocation object) {
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
	public T caseMemoryMapping(MemoryMapping object) {
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
	public T casePhysicalSectionMapping(PhysicalSectionMapping object) {
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
	public T caseOSModel(OSModel object) {
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
	public T caseOsDataConsistency(OsDataConsistency object) {
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
	public T caseDataStability(DataStability object) {
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
	public T caseNonAtomicDataCoherency(NonAtomicDataCoherency object) {
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
	public T caseSemaphore(Semaphore object) {
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
	public T caseScheduler(Scheduler object) {
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
	public T caseTaskScheduler(TaskScheduler object) {
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
	public T caseSchedulerAssociation(SchedulerAssociation object) {
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
	public T caseInterruptController(InterruptController object) {
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
	public T caseSchedulingParameters(SchedulingParameters object) {
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
	public T caseParameterExtension(Map.Entry<String, String> object) {
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
	public T caseAlgorithm(Algorithm object) {
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
	public T caseInterruptSchedulingAlgorithm(InterruptSchedulingAlgorithm object) {
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
	public T caseTaskSchedulingAlgorithm(TaskSchedulingAlgorithm object) {
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
	public T caseFixedPriority(FixedPriority object) {
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
	public T caseFixedPriorityPreemptive(FixedPriorityPreemptive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Priority Preemptive With Budget Enforcement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Priority Preemptive With Budget Enforcement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPriorityPreemptiveWithBudgetEnforcement(FixedPriorityPreemptiveWithBudgetEnforcement object) {
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
	public T caseOSEK(OSEK object) {
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
	public T caseDeadlineMonotonic(DeadlineMonotonic object) {
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
	public T caseRateMonotonic(RateMonotonic object) {
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
	public T casePfair(Pfair object) {
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
	public T casePfairPD2(PfairPD2 object) {
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
	public T casePartlyPFairPD2(PartlyPFairPD2 object) {
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
	public T caseEarlyReleaseFairPD2(EarlyReleaseFairPD2 object) {
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
	public T casePartlyEarlyReleaseFairPD2(PartlyEarlyReleaseFairPD2 object) {
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
	public T caseDynamicPriority(DynamicPriority object) {
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
	public T caseLeastLocalRemainingExecutionTimeFirst(LeastLocalRemainingExecutionTimeFirst object) {
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
	public T caseEarliestDeadlineFirst(EarliestDeadlineFirst object) {
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
	public T casePriorityBasedRoundRobin(PriorityBasedRoundRobin object) {
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
	public T caseReservationBasedServer(ReservationBasedServer object) {
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
	public T caseDeferrableServer(DeferrableServer object) {
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
	public T casePollingPeriodicServer(PollingPeriodicServer object) {
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
	public T caseSporadicServer(SporadicServer object) {
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
	public T caseConstantBandwidthServer(ConstantBandwidthServer object) {
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
	public T caseConstantBandwidthServerWithCASH(ConstantBandwidthServerWithCASH object) {
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
	public T caseGrouping(Grouping object) {
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
	public T caseUserSpecificSchedulingAlgorithm(UserSpecificSchedulingAlgorithm object) {
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
	public T casePriorityBased(PriorityBased object) {
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
	public T caseOperatingSystem(OperatingSystem object) {
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
	public T caseVendorOperatingSystem(VendorOperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Overhead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Overhead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsOverhead(OsOverhead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os API Overhead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os API Overhead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsAPIOverhead(OsAPIOverhead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os ISR Overhead</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os ISR Overhead</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsISROverhead(OsISROverhead object) {
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
	public T casePropertyConstraintsModel(PropertyConstraintsModel object) {
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
	public T caseCoreAllocationConstraint(CoreAllocationConstraint object) {
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
	public T caseMemoryMappingConstraint(MemoryMappingConstraint object) {
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
	public T caseProcessAllocationConstraint(ProcessAllocationConstraint object) {
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
	public T caseProcessPrototypeAllocationConstraint(ProcessPrototypeAllocationConstraint object) {
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
	public T caseRunnableAllocationConstraint(RunnableAllocationConstraint object) {
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
	public T caseAbstractElementMappingConstraint(AbstractElementMappingConstraint object) {
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
	public T caseClassification(Classification object) {
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
	public T caseCoreClassification(CoreClassification object) {
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
	public T caseMemoryClassification(MemoryClassification object) {
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
	public T caseStimuliModel(StimuliModel object) {
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
	public T caseStimulus(Stimulus object) {
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
	public T caseModeValueList(ModeValueList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Value Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Value Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeValueMapEntry(Map.Entry<ModeLabel, String> object) {
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
	public T caseModeValue(ModeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeAssignment(ModeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Condition Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Condition Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeConditionDisjunction(ModeConditionDisjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Condition Disjunction Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Condition Disjunction Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeConditionDisjunctionEntry(ModeConditionDisjunctionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeCondition(ModeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Condition Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Condition Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeConditionConjunction(ModeConditionConjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Periodic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Periodic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPeriodic(FixedPeriodic object) {
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
	public T casePeriodicStimulus(PeriodicStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Periodic Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Periodic Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativePeriodicStimulus(RelativePeriodicStimulus object) {
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
	public T caseVariableRateStimulus(VariableRateStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Synthetic Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Synthetic Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicSyntheticStimulus(PeriodicSyntheticStimulus object) {
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
	public T caseCustomStimulus(CustomStimulus object) {
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
	public T caseSingleStimulus(SingleStimulus object) {
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
	public T caseInterProcessStimulus(InterProcessStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Burst Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Burst Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicBurstStimulus(PeriodicBurstStimulus object) {
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
	public T caseEventStimulus(EventStimulus object) {
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
	public T caseArrivalCurveStimulus(ArrivalCurveStimulus object) {
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
	public T caseArrivalCurveEntry(ArrivalCurveEntry object) {
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
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockFunction(ClockFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Step List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Step List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockStepList(ClockStepList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockStep(ClockStep object) {
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
	public T caseSWModel(SWModel object) {
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
	public T caseAbstractMemoryElement(AbstractMemoryElement object) {
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
	public T caseAbstractProcess(AbstractProcess object) {
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
	public T caseCustomEntity(CustomEntity object) {
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
	public T caseProcessChain(ProcessChain object) {
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
	public T caseProcess(org.eclipse.app4mc.amalthea.model.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICall Graph Item Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICall Graph Item Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICallGraphItemContainer(ICallGraphItemContainer object) {
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
	public T caseCallGraph(CallGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Graph Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Graph Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallGraphItem(CallGraphItem object) {
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
	public T caseModeSwitch(ModeSwitch object) {
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
	public T caseModeSwitchEntry(ModeSwitchEntry object) {
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
	public T caseModeSwitchDefault(ModeSwitchDefault object) {
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
	public T caseProbabilitySwitch(ProbabilitySwitch object) {
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
	public T caseProbabilitySwitchEntry(ProbabilitySwitchEntry object) {
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
	public T caseCounter(Counter object) {
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
	public T caseWaitEvent(WaitEvent object) {
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
	public T caseSetEvent(SetEvent object) {
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
	public T caseClearEvent(ClearEvent object) {
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
	public T caseEventMask(EventMask object) {
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
	public T caseOsEvent(OsEvent object) {
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
	public T caseInterProcessTrigger(InterProcessTrigger object) {
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
	public T caseEnforcedMigration(EnforcedMigration object) {
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
	public T caseSchedulePoint(SchedulePoint object) {
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
	public T caseTerminateProcess(TerminateProcess object) {
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
	public T caseTask(Task object) {
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
	public T caseISR(ISR object) {
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
	public T caseProcessPrototype(ProcessPrototype object) {
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
	public T caseChainedProcessPrototype(ChainedProcessPrototype object) {
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
	public T caseGeneralPrecedence(GeneralPrecedence object) {
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
	public T caseAccessPrecedenceSpec(AccessPrecedenceSpec object) {
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
	public T caseOrderPrecedenceSpec(OrderPrecedenceSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDependency(DataDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableParameter(RunnableParameter object) {
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
	public T caseRunnable(org.eclipse.app4mc.amalthea.model.Runnable object) {
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
	public T caseLabel(Label object) {
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
	public T caseChannel(Channel object) {
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
	public T caseModeLabel(ModeLabel object) {
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
	public T caseSection(Section object) {
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
	public T caseComputationItem(ComputationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Need</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Need</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionNeed(ExecutionNeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Need Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Need Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeedEntry(Map.Entry<String, IDiscreteValueDeviation> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicks(Ticks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticks Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticks Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicksEntry(Map.Entry<ProcessingUnitDefinition, IDiscreteValueDeviation> object) {
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
	public T caseModeLabelAccess(ModeLabelAccess object) {
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
	public T caseLabelAccess(LabelAccess object) {
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
	public T caseChannelAccess(ChannelAccess object) {
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
	public T caseChannelSend(ChannelSend object) {
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
	public T caseChannelReceive(ChannelReceive object) {
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
	public T caseSemaphoreAccess(SemaphoreAccess object) {
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
	public T caseSenderReceiverCommunication(SenderReceiverCommunication object) {
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
	public T caseSenderReceiverRead(SenderReceiverRead object) {
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
	public T caseSenderReceiverWrite(SenderReceiverWrite object) {
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
	public T caseServerCall(ServerCall object) {
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
	public T caseSynchronousServerCall(SynchronousServerCall object) {
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
	public T caseAsynchronousServerCall(AsynchronousServerCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Result Server Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Result Server Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetResultServerCall(GetResultServerCall object) {
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
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallArgument(CallArgument object) {
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
	public T caseRunnableCall(RunnableCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomEventTrigger(CustomEventTrigger object) {
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
	public T caseDataType(DataType object) {
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
	public T caseCompoundType(CompoundType object) {
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
	public T caseStruct(Struct object) {
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
	public T caseStructEntry(StructEntry object) {
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
	public T caseArray(Array object) {
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
	public T casePointer(Pointer object) {
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
	public T caseTypeRef(TypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlias(Alias object) {
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
	public T caseTypeDefinition(TypeDefinition object) {
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
	public T caseDataTypeDefinition(DataTypeDefinition object) {
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
	public T caseBaseTypeDefinition(BaseTypeDefinition object) {
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
	public T caseActivation(Activation object) {
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
	public T casePeriodicActivation(PeriodicActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Rate Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Rate Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRateActivation(VariableRateActivation object) {
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
	public T caseSporadicActivation(SporadicActivation object) {
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
	public T caseSingleActivation(SingleActivation object) {
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
	public T caseEventActivation(EventActivation object) {
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
	public T caseCustomActivation(CustomActivation object) {
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
	public T caseLabelAccessStatistic(LabelAccessStatistic object) {
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
	public T caseRunEntityCallStatistic(RunEntityCallStatistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementModel(MeasurementModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChainMeasurement(EventChainMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskMeasurement(TaskMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableMeasurement(RunnableMeasurement object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //AmaltheaSwitch
