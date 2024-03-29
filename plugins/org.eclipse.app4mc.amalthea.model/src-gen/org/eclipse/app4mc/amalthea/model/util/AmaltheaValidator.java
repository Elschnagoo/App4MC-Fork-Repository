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

import org.eclipse.app4mc.amalthea.model.ASILType;
import org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint;
import org.eclipse.app4mc.amalthea.model.AbstractEventChain;
import org.eclipse.app4mc.amalthea.model.AbstractMemoryElement;
import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.AccessMultiplicity;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceType;
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
import org.eclipse.app4mc.amalthea.model.BlockingType;
import org.eclipse.app4mc.amalthea.model.BooleanObject;
import org.eclipse.app4mc.amalthea.model.BoundedContinuousValueDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteValueDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution;
import org.eclipse.app4mc.amalthea.model.CPUPercentageMetric;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.CacheDefinition;
import org.eclipse.app4mc.amalthea.model.CacheType;
import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
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
import org.eclipse.app4mc.amalthea.model.ClockFunction;
import org.eclipse.app4mc.amalthea.model.ClockStep;
import org.eclipse.app4mc.amalthea.model.ClockStepList;
import org.eclipse.app4mc.amalthea.model.CoherencyDirection;
import org.eclipse.app4mc.amalthea.model.CommonElements;
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
import org.eclipse.app4mc.amalthea.model.CountMetric;
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.CurveType;
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
import org.eclipse.app4mc.amalthea.model.DirectionType;
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
import org.eclipse.app4mc.amalthea.model.FrequencyMetric;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.GeneralPrecedence;
import org.eclipse.app4mc.amalthea.model.GetResultServerCall;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.Grouping;
import org.eclipse.app4mc.amalthea.model.GroupingType;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwDestination;
import org.eclipse.app4mc.amalthea.model.HwDomain;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwFeatureType;
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
import org.eclipse.app4mc.amalthea.model.ISRCategory;
import org.eclipse.app4mc.amalthea.model.ISystem;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.ITimeDeviation;
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
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint;
import org.eclipse.app4mc.amalthea.model.MemoryType;
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeAssignment;
import org.eclipse.app4mc.amalthea.model.ModeCondition;
import org.eclipse.app4mc.amalthea.model.ModeConditionConjunction;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunctionEntry;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum;
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
import org.eclipse.app4mc.amalthea.model.OrderType;
import org.eclipse.app4mc.amalthea.model.OsAPIOverhead;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsDataConsistencyMode;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.OsISROverhead;
import org.eclipse.app4mc.amalthea.model.OsOverhead;
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
import org.eclipse.app4mc.amalthea.model.Pointer;
import org.eclipse.app4mc.amalthea.model.PollingPeriodicServer;
import org.eclipse.app4mc.amalthea.model.Port;
import org.eclipse.app4mc.amalthea.model.PortInterface;
import org.eclipse.app4mc.amalthea.model.PortType;
import org.eclipse.app4mc.amalthea.model.PowerDomain;
import org.eclipse.app4mc.amalthea.model.Preemption;
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
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.PuType;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.app4mc.amalthea.model.Quantity;
import org.eclipse.app4mc.amalthea.model.RateMonotonic;
import org.eclipse.app4mc.amalthea.model.ReceiveOperation;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;
import org.eclipse.app4mc.amalthea.model.ReferableObject;
import org.eclipse.app4mc.amalthea.model.ReferenceObject;
import org.eclipse.app4mc.amalthea.model.RelationalOperator;
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
import org.eclipse.app4mc.amalthea.model.RunnableMeasurement;
import org.eclipse.app4mc.amalthea.model.RunnableOrderType;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.RunnableRequirement;
import org.eclipse.app4mc.amalthea.model.RunnableScope;
import org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SamplingType;
import org.eclipse.app4mc.amalthea.model.Scenario;
import org.eclipse.app4mc.amalthea.model.SchedPolicy;
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
import org.eclipse.app4mc.amalthea.model.StructureType;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.model.SynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.SynchronizationType;
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
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeStatistics;
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
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
import org.eclipse.app4mc.amalthea.model.VoltageUnit;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.WaitEventType;
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour;
import org.eclipse.app4mc.amalthea.model.WriteStrategy;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'IReferable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IREFERABLE__VALIDATE_INVARIANTS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Min Avg Max Statistic'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIN_AVG_MAX_STATISTIC__VALIDATE_INVARIANTS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Time Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_INTERVAL__VALIDATE_INVARIANTS = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Truncated Time Distribution'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRUNCATED_TIME_DISTRIBUTION__VALIDATE_INVARIANTS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Discrete Value Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCRETE_VALUE_INTERVAL__VALIDATE_INVARIANTS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Truncated Discrete Value Distribution'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRUNCATED_DISCRETE_VALUE_DISTRIBUTION__VALIDATE_INVARIANTS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Continuous Value Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUOUS_VALUE_INTERVAL__VALIDATE_INVARIANTS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Truncated Continuous Value Distribution'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION__VALIDATE_INVARIANTS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Mode Value'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODE_VALUE__VALIDATE_INVARIANTS = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Mode Label'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODE_LABEL__VALIDATE_INVARIANTS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariants' of 'Mode Label Access'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODE_LABEL_ACCESS__VALIDATE_INVARIANTS = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

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
			case AmaltheaPackage.TRANSMISSION_POLICY:
				return validateTransmissionPolicy((TransmissionPolicy)value, diagnostics, context);
			case AmaltheaPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case AmaltheaPackage.TIME_COMPARABLE:
				return validateTimeComparable((Comparable<Time>)value, diagnostics, context);
			case AmaltheaPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case AmaltheaPackage.FREQUENCY:
				return validateFrequency((Frequency)value, diagnostics, context);
			case AmaltheaPackage.VOLTAGE:
				return validateVoltage((Voltage)value, diagnostics, context);
			case AmaltheaPackage.DATA_SIZE:
				return validateDataSize((DataSize)value, diagnostics, context);
			case AmaltheaPackage.DATA_RATE_COMPARABLE:
				return validateDataRateComparable((Comparable<DataRate>)value, diagnostics, context);
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
			case AmaltheaPackage.NUMERIC_STATISTIC:
				return validateNumericStatistic((NumericStatistic)value, diagnostics, context);
			case AmaltheaPackage.MIN_AVG_MAX_STATISTIC:
				return validateMinAvgMaxStatistic((MinAvgMaxStatistic)value, diagnostics, context);
			case AmaltheaPackage.SINGLE_VALUE_STATISTIC:
				return validateSingleValueStatistic((SingleValueStatistic)value, diagnostics, context);
			case AmaltheaPackage.ITIME_DEVIATION:
				return validateITimeDeviation((ITimeDeviation)value, diagnostics, context);
			case AmaltheaPackage.TIME_INTERVAL:
				return validateTimeInterval((TimeInterval)value, diagnostics, context);
			case AmaltheaPackage.TIME_CONSTANT:
				return validateTimeConstant((TimeConstant)value, diagnostics, context);
			case AmaltheaPackage.TIME_HISTOGRAM:
				return validateTimeHistogram((TimeHistogram)value, diagnostics, context);
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY:
				return validateTimeHistogramEntry((TimeHistogramEntry)value, diagnostics, context);
			case AmaltheaPackage.BOUNDED_TIME_DISTRIBUTION:
				return validateBoundedTimeDistribution((BoundedTimeDistribution)value, diagnostics, context);
			case AmaltheaPackage.TRUNCATED_TIME_DISTRIBUTION:
				return validateTruncatedTimeDistribution((TruncatedTimeDistribution)value, diagnostics, context);
			case AmaltheaPackage.TIME_BOUNDARIES:
				return validateTimeBoundaries((TimeBoundaries)value, diagnostics, context);
			case AmaltheaPackage.TIME_STATISTICS:
				return validateTimeStatistics((TimeStatistics)value, diagnostics, context);
			case AmaltheaPackage.TIME_UNIFORM_DISTRIBUTION:
				return validateTimeUniformDistribution((TimeUniformDistribution)value, diagnostics, context);
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION:
				return validateTimeGaussDistribution((TimeGaussDistribution)value, diagnostics, context);
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION:
				return validateTimeWeibullEstimatorsDistribution((TimeWeibullEstimatorsDistribution)value, diagnostics, context);
			case AmaltheaPackage.TIME_BETA_DISTRIBUTION:
				return validateTimeBetaDistribution((TimeBetaDistribution)value, diagnostics, context);
			case AmaltheaPackage.IDISCRETE_VALUE_DEVIATION:
				return validateIDiscreteValueDeviation((IDiscreteValueDeviation)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_INTERVAL:
				return validateDiscreteValueInterval((DiscreteValueInterval)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_CONSTANT:
				return validateDiscreteValueConstant((DiscreteValueConstant)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM:
				return validateDiscreteValueHistogram((DiscreteValueHistogram)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM_ENTRY:
				return validateDiscreteValueHistogramEntry((DiscreteValueHistogramEntry)value, diagnostics, context);
			case AmaltheaPackage.BOUNDED_DISCRETE_VALUE_DISTRIBUTION:
				return validateBoundedDiscreteValueDistribution((BoundedDiscreteValueDistribution)value, diagnostics, context);
			case AmaltheaPackage.TRUNCATED_DISCRETE_VALUE_DISTRIBUTION:
				return validateTruncatedDiscreteValueDistribution((TruncatedDiscreteValueDistribution)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_BOUNDARIES:
				return validateDiscreteValueBoundaries((DiscreteValueBoundaries)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_STATISTICS:
				return validateDiscreteValueStatistics((DiscreteValueStatistics)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_UNIFORM_DISTRIBUTION:
				return validateDiscreteValueUniformDistribution((DiscreteValueUniformDistribution)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION:
				return validateDiscreteValueGaussDistribution((DiscreteValueGaussDistribution)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION:
				return validateDiscreteValueWeibullEstimatorsDistribution((DiscreteValueWeibullEstimatorsDistribution)value, diagnostics, context);
			case AmaltheaPackage.DISCRETE_VALUE_BETA_DISTRIBUTION:
				return validateDiscreteValueBetaDistribution((DiscreteValueBetaDistribution)value, diagnostics, context);
			case AmaltheaPackage.ICONTINUOUS_VALUE_DEVIATION:
				return validateIContinuousValueDeviation((IContinuousValueDeviation)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_INTERVAL:
				return validateContinuousValueInterval((ContinuousValueInterval)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_CONSTANT:
				return validateContinuousValueConstant((ContinuousValueConstant)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM:
				return validateContinuousValueHistogram((ContinuousValueHistogram)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM_ENTRY:
				return validateContinuousValueHistogramEntry((ContinuousValueHistogramEntry)value, diagnostics, context);
			case AmaltheaPackage.BOUNDED_CONTINUOUS_VALUE_DISTRIBUTION:
				return validateBoundedContinuousValueDistribution((BoundedContinuousValueDistribution)value, diagnostics, context);
			case AmaltheaPackage.TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION:
				return validateTruncatedContinuousValueDistribution((TruncatedContinuousValueDistribution)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_BOUNDARIES:
				return validateContinuousValueBoundaries((ContinuousValueBoundaries)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_STATISTICS:
				return validateContinuousValueStatistics((ContinuousValueStatistics)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_UNIFORM_DISTRIBUTION:
				return validateContinuousValueUniformDistribution((ContinuousValueUniformDistribution)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_GAUSS_DISTRIBUTION:
				return validateContinuousValueGaussDistribution((ContinuousValueGaussDistribution)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION:
				return validateContinuousValueWeibullEstimatorsDistribution((ContinuousValueWeibullEstimatorsDistribution)value, diagnostics, context);
			case AmaltheaPackage.CONTINUOUS_VALUE_BETA_DISTRIBUTION:
				return validateContinuousValueBetaDistribution((ContinuousValueBetaDistribution)value, diagnostics, context);
			case AmaltheaPackage.MODE:
				return validateMode((Mode)value, diagnostics, context);
			case AmaltheaPackage.NUMERIC_MODE:
				return validateNumericMode((NumericMode)value, diagnostics, context);
			case AmaltheaPackage.ENUM_MODE:
				return validateEnumMode((EnumMode)value, diagnostics, context);
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
			case AmaltheaPackage.HW_STRUCTURE:
				return validateHwStructure((HwStructure)value, diagnostics, context);
			case AmaltheaPackage.HW_MODULE:
				return validateHwModule((HwModule)value, diagnostics, context);
			case AmaltheaPackage.HW_DOMAIN:
				return validateHwDomain((HwDomain)value, diagnostics, context);
			case AmaltheaPackage.FREQUENCY_DOMAIN:
				return validateFrequencyDomain((FrequencyDomain)value, diagnostics, context);
			case AmaltheaPackage.POWER_DOMAIN:
				return validatePowerDomain((PowerDomain)value, diagnostics, context);
			case AmaltheaPackage.PROCESSING_UNIT:
				return validateProcessingUnit((ProcessingUnit)value, diagnostics, context);
			case AmaltheaPackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case AmaltheaPackage.CACHE:
				return validateCache((Cache)value, diagnostics, context);
			case AmaltheaPackage.HW_FEATURE_CATEGORY:
				return validateHwFeatureCategory((HwFeatureCategory)value, diagnostics, context);
			case AmaltheaPackage.HW_FEATURE:
				return validateHwFeature((HwFeature)value, diagnostics, context);
			case AmaltheaPackage.HW_PORT:
				return validateHwPort((HwPort)value, diagnostics, context);
			case AmaltheaPackage.CONNECTION_HANDLER:
				return validateConnectionHandler((ConnectionHandler)value, diagnostics, context);
			case AmaltheaPackage.HW_CONNECTION:
				return validateHwConnection((HwConnection)value, diagnostics, context);
			case AmaltheaPackage.HW_ACCESS_ELEMENT:
				return validateHwAccessElement((HwAccessElement)value, diagnostics, context);
			case AmaltheaPackage.HW_DEFINITION:
				return validateHwDefinition((HwDefinition)value, diagnostics, context);
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION:
				return validateProcessingUnitDefinition((ProcessingUnitDefinition)value, diagnostics, context);
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION:
				return validateConnectionHandlerDefinition((ConnectionHandlerDefinition)value, diagnostics, context);
			case AmaltheaPackage.MEMORY_DEFINITION:
				return validateMemoryDefinition((MemoryDefinition)value, diagnostics, context);
			case AmaltheaPackage.CACHE_DEFINITION:
				return validateCacheDefinition((CacheDefinition)value, diagnostics, context);
			case AmaltheaPackage.HW_PATH:
				return validateHwPath((HwPath)value, diagnostics, context);
			case AmaltheaPackage.HW_ACCESS_PATH:
				return validateHwAccessPath((HwAccessPath)value, diagnostics, context);
			case AmaltheaPackage.HW_PATH_ELEMENT:
				return validateHwPathElement((HwPathElement)value, diagnostics, context);
			case AmaltheaPackage.HW_DESTINATION:
				return validateHwDestination((HwDestination)value, diagnostics, context);
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
			case AmaltheaPackage.OS_OVERHEAD:
				return validateOsOverhead((OsOverhead)value, diagnostics, context);
			case AmaltheaPackage.OS_API_OVERHEAD:
				return validateOsAPIOverhead((OsAPIOverhead)value, diagnostics, context);
			case AmaltheaPackage.OS_ISR_OVERHEAD:
				return validateOsISROverhead((OsISROverhead)value, diagnostics, context);
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
			case AmaltheaPackage.MODE_VALUE:
				return validateModeValue((ModeValue)value, diagnostics, context);
			case AmaltheaPackage.MODE_ASSIGNMENT:
				return validateModeAssignment((ModeAssignment)value, diagnostics, context);
			case AmaltheaPackage.MODE_CONDITION_DISJUNCTION:
				return validateModeConditionDisjunction((ModeConditionDisjunction)value, diagnostics, context);
			case AmaltheaPackage.MODE_CONDITION_DISJUNCTION_ENTRY:
				return validateModeConditionDisjunctionEntry((ModeConditionDisjunctionEntry)value, diagnostics, context);
			case AmaltheaPackage.MODE_CONDITION:
				return validateModeCondition((ModeCondition)value, diagnostics, context);
			case AmaltheaPackage.MODE_CONDITION_CONJUNCTION:
				return validateModeConditionConjunction((ModeConditionConjunction)value, diagnostics, context);
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
			case AmaltheaPackage.CLOCK_FUNCTION:
				return validateClockFunction((ClockFunction)value, diagnostics, context);
			case AmaltheaPackage.CLOCK_STEP_LIST:
				return validateClockStepList((ClockStepList)value, diagnostics, context);
			case AmaltheaPackage.CLOCK_STEP:
				return validateClockStep((ClockStep)value, diagnostics, context);
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
			case AmaltheaPackage.ICALL_GRAPH_ITEM_CONTAINER:
				return validateICallGraphItemContainer((ICallGraphItemContainer)value, diagnostics, context);
			case AmaltheaPackage.CALL_GRAPH:
				return validateCallGraph((CallGraph)value, diagnostics, context);
			case AmaltheaPackage.CALL_GRAPH_ITEM:
				return validateCallGraphItem((CallGraphItem)value, diagnostics, context);
			case AmaltheaPackage.MODE_SWITCH:
				return validateModeSwitch((ModeSwitch)value, diagnostics, context);
			case AmaltheaPackage.MODE_SWITCH_ENTRY:
				return validateModeSwitchEntry((ModeSwitchEntry)value, diagnostics, context);
			case AmaltheaPackage.MODE_SWITCH_DEFAULT:
				return validateModeSwitchDefault((ModeSwitchDefault)value, diagnostics, context);
			case AmaltheaPackage.PROBABILITY_SWITCH:
				return validateProbabilitySwitch((ProbabilitySwitch)value, diagnostics, context);
			case AmaltheaPackage.PROBABILITY_SWITCH_ENTRY:
				return validateProbabilitySwitchEntry((ProbabilitySwitchEntry)value, diagnostics, context);
			case AmaltheaPackage.COUNTER:
				return validateCounter((Counter)value, diagnostics, context);
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
			case AmaltheaPackage.DATA_DEPENDENCY:
				return validateDataDependency((DataDependency)value, diagnostics, context);
			case AmaltheaPackage.RUNNABLE_PARAMETER:
				return validateRunnableParameter((RunnableParameter)value, diagnostics, context);
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
			case AmaltheaPackage.COMPUTATION_ITEM:
				return validateComputationItem((ComputationItem)value, diagnostics, context);
			case AmaltheaPackage.EXECUTION_NEED:
				return validateExecutionNeed((ExecutionNeed)value, diagnostics, context);
			case AmaltheaPackage.NEED_ENTRY:
				return validateNeedEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case AmaltheaPackage.TICKS:
				return validateTicks((Ticks)value, diagnostics, context);
			case AmaltheaPackage.TICKS_ENTRY:
				return validateTicksEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case AmaltheaPackage.MODE_LABEL_ACCESS:
				return validateModeLabelAccess((ModeLabelAccess)value, diagnostics, context);
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
			case AmaltheaPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case AmaltheaPackage.CALL_ARGUMENT:
				return validateCallArgument((CallArgument)value, diagnostics, context);
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
			case AmaltheaPackage.ALIAS:
				return validateAlias((Alias)value, diagnostics, context);
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
			case AmaltheaPackage.RELATIONAL_OPERATOR:
				return validateRelationalOperator((RelationalOperator)value, diagnostics, context);
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
			case AmaltheaPackage.MEMORY_TYPE:
				return validateMemoryType((MemoryType)value, diagnostics, context);
			case AmaltheaPackage.STRUCTURE_TYPE:
				return validateStructureType((StructureType)value, diagnostics, context);
			case AmaltheaPackage.CACHE_TYPE:
				return validateCacheType((CacheType)value, diagnostics, context);
			case AmaltheaPackage.PORT_TYPE:
				return validatePortType((PortType)value, diagnostics, context);
			case AmaltheaPackage.SCHED_POLICY:
				return validateSchedPolicy((SchedPolicy)value, diagnostics, context);
			case AmaltheaPackage.WRITE_STRATEGY:
				return validateWriteStrategy((WriteStrategy)value, diagnostics, context);
			case AmaltheaPackage.PU_TYPE:
				return validatePuType((PuType)value, diagnostics, context);
			case AmaltheaPackage.PORT_INTERFACE:
				return validatePortInterface((PortInterface)value, diagnostics, context);
			case AmaltheaPackage.HW_FEATURE_TYPE:
				return validateHwFeatureType((HwFeatureType)value, diagnostics, context);
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
			case AmaltheaPackage.CURVE_TYPE:
				return validateCurveType((CurveType)value, diagnostics, context);
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
			case AmaltheaPackage.DIRECTION_TYPE:
				return validateDirectionType((DirectionType)value, diagnostics, context);
			case AmaltheaPackage.LABEL_DATA_STABILITY:
				return validateLabelDataStability((LabelDataStability)value, diagnostics, context);
			case AmaltheaPackage.MODE_LABEL_ACCESS_ENUM:
				return validateModeLabelAccessEnum((ModeLabelAccessEnum)value, diagnostics, context);
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
			case AmaltheaPackage.POSITIVE_INT:
				return validatePositiveInt((Integer)value, diagnostics, context);
			case AmaltheaPackage.POSITIVE_LONG:
				return validatePositiveLong((Long)value, diagnostics, context);
			case AmaltheaPackage.POSITIVE_DOUBLE:
				return validatePositiveDouble((Double)value, diagnostics, context);
			case AmaltheaPackage.NON_NEGATIVE_INT:
				return validateNonNegativeInt((Integer)value, diagnostics, context);
			case AmaltheaPackage.NON_NEGATIVE_LONG:
				return validateNonNegativeLong((Long)value, diagnostics, context);
			case AmaltheaPackage.NON_NEGATIVE_DOUBLE:
				return validateNonNegativeDouble((Double)value, diagnostics, context);
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
		if (!validate_NoCircularContainment(referableObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(referableObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(referableObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(referableObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(referableObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(referableObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(referableObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(referableObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(referableObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(referableObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferableBaseObject(ReferableBaseObject referableBaseObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(referableBaseObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(referableBaseObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(referableBaseObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(referableBaseObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(referableBaseObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(referableBaseObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(referableBaseObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(referableBaseObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(referableBaseObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(referableBaseObject, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(iReferable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(iReferable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iReferable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iReferable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(iReferable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(iReferable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(iReferable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(iReferable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iReferable, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(iReferable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>IReferable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIReferable_validateInvariants(IReferable iReferable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return iReferable.validateInvariants(diagnostics, context);
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
		if (!validate_NoCircularContainment(tag, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(tag, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(classifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoreClassifier(CoreClassifier coreClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coreClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coreClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coreClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coreClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coreClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coreClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coreClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coreClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coreClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(coreClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryClassifier(MemoryClassifier memoryClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memoryClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memoryClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memoryClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memoryClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memoryClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memoryClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memoryClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memoryClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memoryClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(memoryClassifier, diagnostics, context);
		return result;
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
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeComparable(Comparable<Time> timeComparable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)timeComparable, diagnostics, context);
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
	public boolean validateDataRateComparable(Comparable<DataRate> dataRateComparable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)dataRateComparable, diagnostics, context);
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
	public boolean validateNumericStatistic(NumericStatistic numericStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericStatistic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinAvgMaxStatistic(MinAvgMaxStatistic minAvgMaxStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(minAvgMaxStatistic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(minAvgMaxStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(minAvgMaxStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(minAvgMaxStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(minAvgMaxStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(minAvgMaxStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(minAvgMaxStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(minAvgMaxStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(minAvgMaxStatistic, diagnostics, context);
		if (result || diagnostics != null) result &= validateMinAvgMaxStatistic_validateInvariants(minAvgMaxStatistic, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Min Avg Max Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinAvgMaxStatistic_validateInvariants(MinAvgMaxStatistic minAvgMaxStatistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return minAvgMaxStatistic.validateInvariants(diagnostics, context);
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
	public boolean validateITimeDeviation(ITimeDeviation iTimeDeviation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iTimeDeviation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval(TimeInterval timeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeInterval_validateInvariants(timeInterval, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_validateInvariants(TimeInterval timeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeInterval.validateInvariants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeConstant(TimeConstant timeConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeHistogram(TimeHistogram timeHistogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeHistogram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeHistogramEntry(TimeHistogramEntry timeHistogramEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeHistogramEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeInterval_validateInvariants(timeHistogramEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundedTimeDistribution(BoundedTimeDistribution boundedTimeDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boundedTimeDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boundedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boundedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boundedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boundedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boundedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boundedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boundedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boundedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeInterval_validateInvariants(boundedTimeDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTruncatedTimeDistribution(TruncatedTimeDistribution truncatedTimeDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(truncatedTimeDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(truncatedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(truncatedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(truncatedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(truncatedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(truncatedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(truncatedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(truncatedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(truncatedTimeDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTruncatedTimeDistribution_validateInvariants(truncatedTimeDistribution, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Truncated Time Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTruncatedTimeDistribution_validateInvariants(TruncatedTimeDistribution truncatedTimeDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return truncatedTimeDistribution.validateInvariants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeBoundaries(TimeBoundaries timeBoundaries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeBoundaries, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeInterval_validateInvariants(timeBoundaries, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStatistics(TimeStatistics timeStatistics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeStatistics, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeInterval_validateInvariants(timeStatistics, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUniformDistribution(TimeUniformDistribution timeUniformDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeUniformDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeInterval_validateInvariants(timeUniformDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeGaussDistribution(TimeGaussDistribution timeGaussDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeGaussDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTruncatedTimeDistribution_validateInvariants(timeGaussDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeWeibullEstimatorsDistribution(TimeWeibullEstimatorsDistribution timeWeibullEstimatorsDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeWeibullEstimatorsDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeInterval_validateInvariants(timeWeibullEstimatorsDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeBetaDistribution(TimeBetaDistribution timeBetaDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeBetaDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeInterval_validateInvariants(timeBetaDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDiscreteValueDeviation(IDiscreteValueDeviation iDiscreteValueDeviation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iDiscreteValueDeviation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueInterval(DiscreteValueInterval discreteValueInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteValueInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteValueInterval_validateInvariants(discreteValueInterval, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Discrete Value Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueInterval_validateInvariants(DiscreteValueInterval discreteValueInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return discreteValueInterval.validateInvariants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueConstant(DiscreteValueConstant discreteValueConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteValueConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueHistogram(DiscreteValueHistogram discreteValueHistogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteValueHistogram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueHistogramEntry(DiscreteValueHistogramEntry discreteValueHistogramEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteValueHistogramEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteValueInterval_validateInvariants(discreteValueHistogramEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundedDiscreteValueDistribution(BoundedDiscreteValueDistribution boundedDiscreteValueDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boundedDiscreteValueDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boundedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boundedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boundedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boundedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boundedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boundedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boundedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boundedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteValueInterval_validateInvariants(boundedDiscreteValueDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTruncatedDiscreteValueDistribution(TruncatedDiscreteValueDistribution truncatedDiscreteValueDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(truncatedDiscreteValueDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(truncatedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(truncatedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(truncatedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(truncatedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(truncatedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(truncatedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(truncatedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(truncatedDiscreteValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTruncatedDiscreteValueDistribution_validateInvariants(truncatedDiscreteValueDistribution, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Truncated Discrete Value Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTruncatedDiscreteValueDistribution_validateInvariants(TruncatedDiscreteValueDistribution truncatedDiscreteValueDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return truncatedDiscreteValueDistribution.validateInvariants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueBoundaries(DiscreteValueBoundaries discreteValueBoundaries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteValueBoundaries, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteValueInterval_validateInvariants(discreteValueBoundaries, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueStatistics(DiscreteValueStatistics discreteValueStatistics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteValueStatistics, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteValueInterval_validateInvariants(discreteValueStatistics, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueUniformDistribution(DiscreteValueUniformDistribution discreteValueUniformDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteValueUniformDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteValueInterval_validateInvariants(discreteValueUniformDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueGaussDistribution(DiscreteValueGaussDistribution discreteValueGaussDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteValueGaussDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTruncatedDiscreteValueDistribution_validateInvariants(discreteValueGaussDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueWeibullEstimatorsDistribution(DiscreteValueWeibullEstimatorsDistribution discreteValueWeibullEstimatorsDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteValueWeibullEstimatorsDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteValueInterval_validateInvariants(discreteValueWeibullEstimatorsDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteValueBetaDistribution(DiscreteValueBetaDistribution discreteValueBetaDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteValueBetaDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteValueInterval_validateInvariants(discreteValueBetaDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIContinuousValueDeviation(IContinuousValueDeviation iContinuousValueDeviation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iContinuousValueDeviation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueInterval(ContinuousValueInterval continuousValueInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousValueInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousValueInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousValueInterval_validateInvariants(continuousValueInterval, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Continuous Value Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueInterval_validateInvariants(ContinuousValueInterval continuousValueInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuousValueInterval.validateInvariants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueConstant(ContinuousValueConstant continuousValueConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuousValueConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueHistogram(ContinuousValueHistogram continuousValueHistogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuousValueHistogram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueHistogramEntry(ContinuousValueHistogramEntry continuousValueHistogramEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousValueHistogramEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousValueHistogramEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousValueInterval_validateInvariants(continuousValueHistogramEntry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundedContinuousValueDistribution(BoundedContinuousValueDistribution boundedContinuousValueDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boundedContinuousValueDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boundedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boundedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boundedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boundedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boundedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boundedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boundedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boundedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousValueInterval_validateInvariants(boundedContinuousValueDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTruncatedContinuousValueDistribution(TruncatedContinuousValueDistribution truncatedContinuousValueDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(truncatedContinuousValueDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(truncatedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(truncatedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(truncatedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(truncatedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(truncatedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(truncatedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(truncatedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(truncatedContinuousValueDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTruncatedContinuousValueDistribution_validateInvariants(truncatedContinuousValueDistribution, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Truncated Continuous Value Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTruncatedContinuousValueDistribution_validateInvariants(TruncatedContinuousValueDistribution truncatedContinuousValueDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return truncatedContinuousValueDistribution.validateInvariants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueBoundaries(ContinuousValueBoundaries continuousValueBoundaries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousValueBoundaries, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousValueBoundaries, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousValueInterval_validateInvariants(continuousValueBoundaries, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueStatistics(ContinuousValueStatistics continuousValueStatistics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousValueStatistics, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousValueStatistics, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousValueInterval_validateInvariants(continuousValueStatistics, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueUniformDistribution(ContinuousValueUniformDistribution continuousValueUniformDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousValueUniformDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousValueUniformDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousValueInterval_validateInvariants(continuousValueUniformDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueGaussDistribution(ContinuousValueGaussDistribution continuousValueGaussDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousValueGaussDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousValueGaussDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTruncatedContinuousValueDistribution_validateInvariants(continuousValueGaussDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueWeibullEstimatorsDistribution(ContinuousValueWeibullEstimatorsDistribution continuousValueWeibullEstimatorsDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousValueWeibullEstimatorsDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousValueInterval_validateInvariants(continuousValueWeibullEstimatorsDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousValueBetaDistribution(ContinuousValueBetaDistribution continuousValueBetaDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousValueBetaDistribution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousValueBetaDistribution, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousValueInterval_validateInvariants(continuousValueBetaDistribution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mode, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(mode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericMode(NumericMode numericMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numericMode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numericMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numericMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numericMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(numericMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numericMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numericMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numericMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numericMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(numericMode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumMode(EnumMode enumMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumMode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(enumMode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeLiteral(ModeLiteral modeLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modeLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modeLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modeLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modeLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modeLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modeLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modeLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modeLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modeLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(modeLiteral, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(port, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(component, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposite(Composite composite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(composite, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composite, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(composite, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(org.eclipse.app4mc.amalthea.model.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(system, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(componentInstance, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(interfacePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfacePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfacePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfacePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfacePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfacePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfacePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfacePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfacePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(interfacePort, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(runnableSequencingConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runnableSequencingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runnableSequencingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runnableSequencingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runnableSequencingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runnableSequencingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runnableSequencingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runnableSequencingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runnableSequencingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(runnableSequencingConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffinityConstraint(AffinityConstraint affinityConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(affinityConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(affinityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(affinityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(affinityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(affinityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(affinityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(affinityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(affinityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(affinityConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(affinityConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeparationConstraint(SeparationConstraint separationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(separationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(separationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(separationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(separationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(separationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(separationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(separationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(separationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(separationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(separationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePairingConstraint(PairingConstraint pairingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pairingConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(pairingConstraint, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(runnableSeparationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runnableSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runnableSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runnableSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runnableSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runnableSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runnableSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runnableSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runnableSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(runnableSeparationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessSeparationConstraint(ProcessSeparationConstraint processSeparationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processSeparationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(processSeparationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSeparationConstraint(DataSeparationConstraint dataSeparationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataSeparationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataSeparationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(dataSeparationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnablePairingConstraint(RunnablePairingConstraint runnablePairingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runnablePairingConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runnablePairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runnablePairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runnablePairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runnablePairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runnablePairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runnablePairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runnablePairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runnablePairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(runnablePairingConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessPairingConstraint(ProcessPairingConstraint processPairingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processPairingConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(processPairingConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPairingConstraint(DataPairingConstraint dataPairingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataPairingConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataPairingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(dataPairingConstraint, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(eventChain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventChain, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(eventChain, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(timingConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(timingConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalSectionConstraint(PhysicalSectionConstraint physicalSectionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physicalSectionConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(physicalSectionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physicalSectionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physicalSectionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(physicalSectionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physicalSectionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physicalSectionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physicalSectionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physicalSectionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(physicalSectionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronizationConstraint(SynchronizationConstraint synchronizationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(synchronizationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(synchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(synchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(synchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(synchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(synchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(synchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(synchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(synchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(synchronizationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventSynchronizationConstraint(EventSynchronizationConstraint eventSynchronizationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventSynchronizationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(eventSynchronizationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChainSynchronizationConstraint(EventChainSynchronizationConstraint eventChainSynchronizationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventChainSynchronizationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventChainSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventChainSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventChainSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventChainSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventChainSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventChainSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventChainSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventChainSynchronizationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(eventChainSynchronizationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayConstraint(DelayConstraint delayConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delayConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delayConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delayConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delayConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delayConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delayConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delayConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delayConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delayConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(delayConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChainLatencyConstraint(EventChainLatencyConstraint eventChainLatencyConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventChainLatencyConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventChainLatencyConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventChainLatencyConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventChainLatencyConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventChainLatencyConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventChainLatencyConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventChainLatencyConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventChainLatencyConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventChainLatencyConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(eventChainLatencyConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetitionConstraint(RepetitionConstraint repetitionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repetitionConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(repetitionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(repetitionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(repetitionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(repetitionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(repetitionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(repetitionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(repetitionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(repetitionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(repetitionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAgeConstraint(DataAgeConstraint dataAgeConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataAgeConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataAgeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataAgeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataAgeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataAgeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataAgeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataAgeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataAgeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataAgeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(dataAgeConstraint, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(dataCoherencyGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataCoherencyGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataCoherencyGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataCoherencyGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataCoherencyGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataCoherencyGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataCoherencyGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataCoherencyGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataCoherencyGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(dataCoherencyGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStabilityGroup(DataStabilityGroup dataStabilityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataStabilityGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataStabilityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataStabilityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataStabilityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataStabilityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataStabilityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataStabilityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataStabilityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataStabilityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(dataStabilityGroup, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(event, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventSet(EventSet eventSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(eventSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityEvent(EntityEvent entityEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entityEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entityEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entityEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entityEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entityEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entityEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entityEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entityEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entityEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(entityEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEvent(TriggerEvent triggerEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(triggerEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(triggerEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(triggerEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(triggerEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(triggerEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(triggerEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(triggerEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(triggerEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(triggerEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(triggerEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomEvent(CustomEvent customEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(customEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStimulusEvent(StimulusEvent stimulusEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stimulusEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stimulusEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stimulusEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stimulusEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stimulusEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stimulusEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stimulusEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stimulusEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stimulusEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(stimulusEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessEvent(ProcessEvent processEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(processEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessChainEvent(ProcessChainEvent processChainEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processChainEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processChainEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processChainEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processChainEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processChainEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processChainEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processChainEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processChainEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processChainEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(processChainEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableEvent(RunnableEvent runnableEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runnableEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runnableEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runnableEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runnableEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runnableEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runnableEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runnableEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runnableEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runnableEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(runnableEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelEvent(LabelEvent labelEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(labelEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(labelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(labelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(labelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(labelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(labelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(labelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(labelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(labelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(labelEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelEvent(ChannelEvent channelEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channelEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channelEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(channelEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemaphoreEvent(SemaphoreEvent semaphoreEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semaphoreEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semaphoreEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semaphoreEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semaphoreEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semaphoreEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semaphoreEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semaphoreEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semaphoreEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semaphoreEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(semaphoreEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentEvent(ComponentEvent componentEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(componentEvent, diagnostics, context);
		return result;
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
	public boolean validateHwStructure(HwStructure hwStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwStructure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwStructure, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwModule(HwModule hwModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwModule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwModule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwModule, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwModule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwDomain(HwDomain hwDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwDomain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwDomain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyDomain(FrequencyDomain frequencyDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(frequencyDomain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(frequencyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(frequencyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(frequencyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(frequencyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(frequencyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(frequencyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(frequencyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(frequencyDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(frequencyDomain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerDomain(PowerDomain powerDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(powerDomain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(powerDomain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingUnit(ProcessingUnit processingUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processingUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processingUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(processingUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(memory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCache(Cache cache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cache, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cache, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(cache, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwFeatureCategory(HwFeatureCategory hwFeatureCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwFeatureCategory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwFeatureCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwFeatureCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwFeatureCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwFeatureCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwFeatureCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwFeatureCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwFeatureCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwFeatureCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwFeatureCategory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwFeature(HwFeature hwFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwPort(HwPort hwPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionHandler(ConnectionHandler connectionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectionHandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(connectionHandler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwConnection(HwConnection hwConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwAccessElement(HwAccessElement hwAccessElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwAccessElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwDefinition(HwDefinition hwDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingUnitDefinition(ProcessingUnitDefinition processingUnitDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processingUnitDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processingUnitDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processingUnitDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processingUnitDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processingUnitDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processingUnitDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processingUnitDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processingUnitDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processingUnitDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(processingUnitDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionHandlerDefinition(ConnectionHandlerDefinition connectionHandlerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectionHandlerDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectionHandlerDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectionHandlerDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectionHandlerDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectionHandlerDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectionHandlerDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectionHandlerDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectionHandlerDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectionHandlerDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(connectionHandlerDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryDefinition(MemoryDefinition memoryDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memoryDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memoryDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memoryDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memoryDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memoryDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memoryDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memoryDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memoryDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memoryDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(memoryDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheDefinition(CacheDefinition cacheDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cacheDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cacheDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cacheDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cacheDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cacheDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cacheDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cacheDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cacheDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cacheDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(cacheDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwPath(HwPath hwPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hwPath, diagnostics, context);
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
	public boolean validateHwPathElement(HwPathElement hwPathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwPathElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwPathElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwPathElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwPathElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwPathElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwPathElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwPathElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwPathElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwPathElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwPathElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwDestination(HwDestination hwDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hwDestination, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hwDestination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hwDestination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hwDestination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hwDestination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hwDestination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hwDestination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hwDestination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hwDestination, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(hwDestination, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(physicalSectionMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(physicalSectionMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physicalSectionMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physicalSectionMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(physicalSectionMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physicalSectionMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physicalSectionMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physicalSectionMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physicalSectionMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(physicalSectionMapping, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(semaphore, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semaphore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semaphore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semaphore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semaphore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semaphore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semaphore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semaphore, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semaphore, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(semaphore, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduler(Scheduler scheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scheduler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(scheduler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskScheduler(TaskScheduler taskScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(taskScheduler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(taskScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(taskScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(taskScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(taskScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(taskScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(taskScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(taskScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(taskScheduler, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(taskScheduler, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(interruptController, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interruptController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interruptController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interruptController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interruptController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interruptController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interruptController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interruptController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interruptController, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(interruptController, diagnostics, context);
		return result;
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
	public boolean validateOsOverhead(OsOverhead osOverhead, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(osOverhead, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(osOverhead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(osOverhead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(osOverhead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(osOverhead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(osOverhead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(osOverhead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(osOverhead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(osOverhead, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(osOverhead, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsAPIOverhead(OsAPIOverhead osAPIOverhead, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osAPIOverhead, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsISROverhead(OsISROverhead osISROverhead, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osISROverhead, diagnostics, context);
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
		if (!validate_NoCircularContainment(stimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(stimulus, diagnostics, context);
		return result;
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
	public boolean validateModeValue(ModeValue modeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modeValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateModeValue_validateInvariants(modeValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Mode Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeValue_validateInvariants(ModeValue modeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return modeValue.validateInvariants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeAssignment(ModeAssignment modeAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modeAssignment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modeAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modeAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modeAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modeAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modeAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modeAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modeAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modeAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateModeValue_validateInvariants(modeAssignment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeConditionDisjunction(ModeConditionDisjunction modeConditionDisjunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeConditionDisjunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeConditionDisjunctionEntry(ModeConditionDisjunctionEntry modeConditionDisjunctionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeConditionDisjunctionEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeCondition(ModeCondition modeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modeCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modeCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateModeValue_validateInvariants(modeCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeConditionConjunction(ModeConditionConjunction modeConditionConjunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeConditionConjunction, diagnostics, context);
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
		if (!validate_NoCircularContainment(periodicStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(periodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(periodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(periodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(periodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(periodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(periodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(periodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(periodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(periodicStimulus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePeriodicStimulus(RelativePeriodicStimulus relativePeriodicStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relativePeriodicStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relativePeriodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relativePeriodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relativePeriodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relativePeriodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relativePeriodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relativePeriodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relativePeriodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relativePeriodicStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(relativePeriodicStimulus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableRateStimulus(VariableRateStimulus variableRateStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableRateStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableRateStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableRateStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableRateStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableRateStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableRateStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableRateStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableRateStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableRateStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(variableRateStimulus, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(periodicSyntheticStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(periodicSyntheticStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(periodicSyntheticStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(periodicSyntheticStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(periodicSyntheticStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(periodicSyntheticStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(periodicSyntheticStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(periodicSyntheticStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(periodicSyntheticStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(periodicSyntheticStimulus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomStimulus(CustomStimulus customStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(customStimulus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleStimulus(SingleStimulus singleStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(singleStimulus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterProcessStimulus(InterProcessStimulus interProcessStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interProcessStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interProcessStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interProcessStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interProcessStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interProcessStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interProcessStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interProcessStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interProcessStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interProcessStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(interProcessStimulus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicBurstStimulus(PeriodicBurstStimulus periodicBurstStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(periodicBurstStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(periodicBurstStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(periodicBurstStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(periodicBurstStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(periodicBurstStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(periodicBurstStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(periodicBurstStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(periodicBurstStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(periodicBurstStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(periodicBurstStimulus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventStimulus(EventStimulus eventStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(eventStimulus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrivalCurveStimulus(ArrivalCurveStimulus arrivalCurveStimulus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arrivalCurveStimulus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arrivalCurveStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arrivalCurveStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arrivalCurveStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arrivalCurveStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arrivalCurveStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arrivalCurveStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arrivalCurveStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arrivalCurveStimulus, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(arrivalCurveStimulus, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(clock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clock, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(clock, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockFunction(ClockFunction clockFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clockFunction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clockFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clockFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clockFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clockFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clockFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clockFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clockFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clockFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(clockFunction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockStepList(ClockStepList clockStepList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clockStepList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clockStepList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clockStepList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clockStepList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clockStepList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clockStepList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clockStepList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clockStepList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clockStepList, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(clockStepList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockStep(ClockStep clockStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockStep, diagnostics, context);
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
		if (!validate_NoCircularContainment(abstractMemoryElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractMemoryElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractMemoryElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractMemoryElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractMemoryElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractMemoryElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractMemoryElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractMemoryElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractMemoryElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(abstractMemoryElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractProcess(AbstractProcess abstractProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractProcess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(abstractProcess, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomEntity(CustomEntity customEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(customEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessChain(ProcessChain processChain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processChain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processChain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processChain, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(processChain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(org.eclipse.app4mc.amalthea.model.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(process, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateICallGraphItemContainer(ICallGraphItemContainer iCallGraphItemContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iCallGraphItemContainer, diagnostics, context);
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
	public boolean validateCallGraphItem(CallGraphItem callGraphItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callGraphItem, diagnostics, context);
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
	public boolean validateModeSwitchEntry(ModeSwitchEntry modeSwitchEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modeSwitchEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeSwitchDefault(ModeSwitchDefault modeSwitchDefault, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateProbabilitySwitchEntry(ProbabilitySwitchEntry probabilitySwitchEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (!validate_NoCircularContainment(osEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(osEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(osEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(osEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(osEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(osEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(osEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(osEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(osEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(osEvent, diagnostics, context);
		return result;
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
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(task, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISR(ISR isr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(isr, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(isr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(isr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(isr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(isr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(isr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(isr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(isr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(isr, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(isr, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessPrototype(ProcessPrototype processPrototype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processPrototype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processPrototype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processPrototype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processPrototype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processPrototype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processPrototype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processPrototype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processPrototype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processPrototype, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(processPrototype, diagnostics, context);
		return result;
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
	public boolean validateDataDependency(DataDependency dataDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnableParameter(RunnableParameter runnableParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runnableParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runnableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runnableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runnableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runnableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runnableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runnableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runnableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runnableParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(runnableParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnable(org.eclipse.app4mc.amalthea.model.Runnable runnable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(runnable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(runnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(runnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(runnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(runnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(runnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(runnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(runnable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(runnable, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(runnable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(label, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(label, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(label, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(channel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeLabel(ModeLabel modeLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modeLabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modeLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modeLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modeLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modeLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modeLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modeLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modeLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modeLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateModeLabel_validateInvariants(modeLabel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Mode Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeLabel_validateInvariants(ModeLabel modeLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return modeLabel.validateInvariants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(section, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(section, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(section, diagnostics, context);
		return result;
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
	public boolean validateExecutionNeed(ExecutionNeed executionNeed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executionNeed, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeedEntry(Map.Entry<?, ?> needEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)needEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTicks(Ticks ticks, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ticks, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTicksEntry(Map.Entry<?, ?> ticksEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)ticksEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeLabelAccess(ModeLabelAccess modeLabelAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modeLabelAccess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modeLabelAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modeLabelAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modeLabelAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modeLabelAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modeLabelAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modeLabelAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modeLabelAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modeLabelAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateModeLabelAccess_validateInvariants(modeLabelAccess, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariants constraint of '<em>Mode Label Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeLabelAccess_validateInvariants(ModeLabelAccess modeLabelAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return modeLabelAccess.validateInvariants(diagnostics, context);
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
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallArgument(CallArgument callArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callArgument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callArgument, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(callArgument, diagnostics, context);
		return result;
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
	public boolean validateAlias(Alias alias, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alias, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDefinition(TypeDefinition typeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typeDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(typeDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeDefinition(DataTypeDefinition dataTypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataTypeDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(dataTypeDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseTypeDefinition(BaseTypeDefinition baseTypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(baseTypeDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(baseTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(baseTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(baseTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(baseTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(baseTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(baseTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(baseTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(baseTypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(baseTypeDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivation(Activation activation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activation, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(activation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodicActivation(PeriodicActivation periodicActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(periodicActivation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(periodicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(periodicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(periodicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(periodicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(periodicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(periodicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(periodicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(periodicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(periodicActivation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableRateActivation(VariableRateActivation variableRateActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableRateActivation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableRateActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableRateActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableRateActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableRateActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableRateActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableRateActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableRateActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableRateActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(variableRateActivation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSporadicActivation(SporadicActivation sporadicActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sporadicActivation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sporadicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sporadicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sporadicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sporadicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sporadicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sporadicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sporadicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sporadicActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(sporadicActivation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleActivation(SingleActivation singleActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleActivation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(singleActivation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventActivation(EventActivation eventActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventActivation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(eventActivation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomActivation(CustomActivation customActivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customActivation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customActivation, diagnostics, context);
		if (result || diagnostics != null) result &= validateIReferable_validateInvariants(customActivation, diagnostics, context);
		return result;
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
	public boolean validateRelationalOperator(RelationalOperator relationalOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateMemoryType(MemoryType memoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureType(StructureType structureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheType(CacheType cacheType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(PortType portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedPolicy(SchedPolicy schedPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStrategy(WriteStrategy writeStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePuType(PuType puType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInterface(PortInterface portInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHwFeatureType(HwFeatureType hwFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateCurveType(CurveType curveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateDirectionType(DirectionType directionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateModeLabelAccessEnum(ModeLabelAccessEnum modeLabelAccessEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(int positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveInt_Min(positiveInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveInt_Min
	 */
	public static final int POSITIVE_INT__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt_Min(int positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveInt > POSITIVE_INT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AmaltheaPackage.eINSTANCE.getPositiveInt(), positiveInt, POSITIVE_INT__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveLong(long positiveLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveLong_Min(positiveLong, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveLong_Min
	 */
	public static final long POSITIVE_LONG__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Positive Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveLong_Min(long positiveLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveLong > POSITIVE_LONG__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AmaltheaPackage.eINSTANCE.getPositiveLong(), positiveLong, POSITIVE_LONG__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDouble(double positiveDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveDouble_Min(positiveDouble, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveDouble_Min
	 */
	public static final double POSITIVE_DOUBLE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Positive Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDouble_Min(double positiveDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveDouble > POSITIVE_DOUBLE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AmaltheaPackage.eINSTANCE.getPositiveDouble(), positiveDouble, POSITIVE_DOUBLE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeInt(int nonNegativeInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeInt_Min(nonNegativeInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeInt_Min
	 */
	public static final int NON_NEGATIVE_INT__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Non Negative Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeInt_Min(int nonNegativeInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeInt >= NON_NEGATIVE_INT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AmaltheaPackage.eINSTANCE.getNonNegativeInt(), nonNegativeInt, NON_NEGATIVE_INT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeLong(long nonNegativeLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeLong_Min(nonNegativeLong, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeLong_Min
	 */
	public static final long NON_NEGATIVE_LONG__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Non Negative Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeLong_Min(long nonNegativeLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeLong >= NON_NEGATIVE_LONG__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AmaltheaPackage.eINSTANCE.getNonNegativeLong(), nonNegativeLong, NON_NEGATIVE_LONG__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDouble(double nonNegativeDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeDouble_Min(nonNegativeDouble, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeDouble_Min
	 */
	public static final double NON_NEGATIVE_DOUBLE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Non Negative Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDouble_Min(double nonNegativeDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeDouble >= NON_NEGATIVE_DOUBLE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AmaltheaPackage.eINSTANCE.getNonNegativeDouble(), nonNegativeDouble, NON_NEGATIVE_DOUBLE__MIN__VALUE, true, diagnostics, context);
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
