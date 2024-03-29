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
package org.eclipse.app4mc.amalthea.model.impl;

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
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
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

import org.eclipse.app4mc.amalthea.model.util.AmaltheaValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
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
	private EClass iNamedEClass = null;

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
	private EClass transmissionPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

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
	private EClass voltageEClass = null;

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
	private EClass dataRateComparableEClass = null;

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
	private EClass iTimeDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeHistogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeHistogramEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedTimeDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass truncatedTimeDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBoundariesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStatisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeUniformDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeGaussDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeWeibullEstimatorsDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBetaDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDiscreteValueDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueHistogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueHistogramEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedDiscreteValueDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass truncatedDiscreteValueDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueBoundariesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueStatisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueUniformDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueGaussDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueWeibullEstimatorsDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueBetaDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iContinuousValueDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueHistogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueHistogramEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedContinuousValueDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass truncatedContinuousValueDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueBoundariesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueStatisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueUniformDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueGaussDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueWeibullEstimatorsDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousValueBetaDistributionEClass = null;

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
	private EClass numericModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumModeEClass = null;

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
	private EClass interfacePortEClass = null;

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
	private EClass componentEventEClass = null;

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
	private EClass hwStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingUnitEClass = null;

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
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwFeatureCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwFeatureEClass = null;

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
	private EClass connectionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwAccessElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingUnitDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionHandlerDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPathEClass = null;

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
	private EClass hwPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwDestinationEClass = null;

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
	private EClass osOverheadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osAPIOverheadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osISROverheadEClass = null;

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
	private EClass modeValueMapEntryEClass = null;

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
	private EClass modeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeConditionDisjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeConditionDisjunctionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeConditionConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPeriodicEClass = null;

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
	private EClass relativePeriodicStimulusEClass = null;

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
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicSyntheticStimulusEClass = null;

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
	private EClass periodicBurstStimulusEClass = null;

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
	private EClass clockFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockStepListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockStepEClass = null;

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
	private EClass iCallGraphItemContainerEClass = null;

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
	private EClass callGraphItemEClass = null;

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
	private EClass dataDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableParameterEClass = null;

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
	private EClass computationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionNeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass needEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ticksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ticksEntryEClass = null;

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
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callArgumentEClass = null;

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
	private EClass aliasEClass = null;

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
	private EEnum relationalOperatorEEnum = null;

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
	private EEnum voltageUnitEEnum = null;

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
	private EEnum componentEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum writeStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum puTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portInterfaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hwFeatureTypeEEnum = null;

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
	private EEnum curveTypeEEnum = null;

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
	private EEnum directionTypeEEnum = null;

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
	private EEnum modeLabelAccessEnumEEnum = null;

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
	private EEnum labelAccessImplementationEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeDoubleEDataType = null;

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
		Object registeredAmaltheaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AmaltheaPackageImpl theAmaltheaPackage = registeredAmaltheaPackage instanceof AmaltheaPackageImpl ? (AmaltheaPackageImpl)registeredAmaltheaPackage : new AmaltheaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAmaltheaPackage.createPackageContents();

		// Initialize created meta-data
		theAmaltheaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAmaltheaPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return AmaltheaValidator.INSTANCE;
				 }
			 });

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
	@Override
	public EClass getAmalthea() {
		return amaltheaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmalthea_Version() {
		return (EAttribute)amaltheaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_CommonElements() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_SwModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_HwModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_OsModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_StimuliModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_EventModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_ConstraintsModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_PropertyConstraintsModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_MappingModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_ComponentsModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_ConfigModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmalthea_MeasurementModel() {
		return (EReference)amaltheaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonElements() {
		return commonElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonElements_Tags() {
		return (EReference)commonElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonElements_CoreClassifiers() {
		return (EReference)commonElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonElements_MemoryClassifiers() {
		return (EReference)commonElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseObject() {
		return baseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferableObject() {
		return referableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferableBaseObject() {
		return referableBaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIAnnotatable() {
		return iAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIAnnotatable_CustomProperties() {
		return (EReference)iAnnotatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getITaggable() {
		return iTaggableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getITaggable_Tags() {
		return (EReference)iTaggableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getINamed() {
		return iNamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getINamed_Name() {
		return (EAttribute)iNamedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIReferable() {
		return iReferableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIReferable_UniqueName() {
		return (EAttribute)iReferableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIReferable__GetNamePrefix() {
		return iReferableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIReferable__Encode__String() {
		return iReferableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIReferable__ValidateInvariants__DiagnosticChain_Map() {
		return iReferableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDisplayName() {
		return iDisplayNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDisplayName_DisplayName() {
		return (EAttribute)iDisplayNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_TagType() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_TaggedObjects() {
		return (EReference)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassifier_Description() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoreClassifier() {
		return coreClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryClassifier() {
		return memoryClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransmissionPolicy() {
		return transmissionPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransmissionPolicy_ChunkSize() {
		return (EReference)transmissionPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmissionPolicy_ChunkProcessingTicks() {
		return (EAttribute)transmissionPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmissionPolicy_TransmitRatio() {
		return (EAttribute)transmissionPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeComparable() {
		return timeComparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Value() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Unit() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTime__ToString() {
		return timeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTime__CompareTo__Time() {
		return timeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTime__AdjustUnit() {
		return timeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTime__Add__Time() {
		return timeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTime__Subtract__Time() {
		return timeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTime__Multiply__long() {
		return timeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTime__Multiply__double() {
		return timeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTime__Divide__Time() {
		return timeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrequency() {
		return frequencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequency_Value() {
		return (EAttribute)frequencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequency_Unit() {
		return (EAttribute)frequencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFrequency__ToString() {
		return frequencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVoltage() {
		return voltageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVoltage_Value() {
		return (EAttribute)voltageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVoltage_Unit() {
		return (EAttribute)voltageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVoltage__ToString() {
		return voltageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSize() {
		return dataSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSize_Value() {
		return (EAttribute)dataSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSize_Unit() {
		return (EAttribute)dataSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSize__ToString() {
		return dataSizeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSize__GetNumberBits() {
		return dataSizeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataSize__GetNumberBytes() {
		return dataSizeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRateComparable() {
		return dataRateComparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRate() {
		return dataRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataRate_Value() {
		return (EAttribute)dataRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataRate_Unit() {
		return (EAttribute)dataRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataRate__ToString() {
		return dataRateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataRate__CompareTo__DataRate() {
		return dataRateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomProperty() {
		return customPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomProperty_Key() {
		return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomProperty_Value() {
		return (EReference)customPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListObject() {
		return listObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListObject_Values() {
		return (EReference)listObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringObject() {
		return stringObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringObject_Value() {
		return (EAttribute)stringObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBigIntegerObject() {
		return bigIntegerObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBigIntegerObject_Value() {
		return (EAttribute)bigIntegerObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceObject() {
		return referenceObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceObject_Value() {
		return (EReference)referenceObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerObject() {
		return integerObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerObject_Value() {
		return (EAttribute)integerObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLongObject() {
		return longObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongObject_Value() {
		return (EAttribute)longObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloatObject() {
		return floatObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloatObject_Value() {
		return (EAttribute)floatObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleObject() {
		return doubleObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoubleObject_Value() {
		return (EAttribute)doubleObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanObject() {
		return booleanObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanObject_Value() {
		return (EAttribute)booleanObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericStatistic() {
		return numericStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinAvgMaxStatistic() {
		return minAvgMaxStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinAvgMaxStatistic_Min() {
		return (EAttribute)minAvgMaxStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinAvgMaxStatistic_Avg() {
		return (EAttribute)minAvgMaxStatisticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinAvgMaxStatistic_Max() {
		return (EAttribute)minAvgMaxStatisticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMinAvgMaxStatistic__ValidateInvariants__DiagnosticChain_Map() {
		return minAvgMaxStatisticEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleValueStatistic() {
		return singleValueStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleValueStatistic_Value() {
		return (EAttribute)singleValueStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getITimeDeviation() {
		return iTimeDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getITimeDeviation__GetLowerBound() {
		return iTimeDeviationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getITimeDeviation__GetUpperBound() {
		return iTimeDeviationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getITimeDeviation__GetAverage() {
		return iTimeDeviationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeInterval_LowerBound() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeInterval_UpperBound() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeInterval__GetAverage() {
		return timeIntervalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeInterval__ValidateInvariants__DiagnosticChain_Map() {
		return timeIntervalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeConstant() {
		return timeConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeConstant_Value() {
		return (EReference)timeConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeConstant__GetLowerBound() {
		return timeConstantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeConstant__GetUpperBound() {
		return timeConstantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeConstant__GetAverage() {
		return timeConstantEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeHistogram() {
		return timeHistogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeHistogram_Entries() {
		return (EReference)timeHistogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeHistogram__GetLowerBound() {
		return timeHistogramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeHistogram__GetUpperBound() {
		return timeHistogramEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeHistogram__GetAverage() {
		return timeHistogramEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeHistogramEntry() {
		return timeHistogramEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeHistogramEntry_Occurrences() {
		return (EAttribute)timeHistogramEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedTimeDistribution() {
		return boundedTimeDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTruncatedTimeDistribution() {
		return truncatedTimeDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTruncatedTimeDistribution_LowerBound() {
		return (EReference)truncatedTimeDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTruncatedTimeDistribution_UpperBound() {
		return (EReference)truncatedTimeDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTruncatedTimeDistribution__ValidateInvariants__DiagnosticChain_Map() {
		return truncatedTimeDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeBoundaries() {
		return timeBoundariesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeBoundaries_SamplingType() {
		return (EAttribute)timeBoundariesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeStatistics() {
		return timeStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeStatistics_Average() {
		return (EReference)timeStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeUniformDistribution() {
		return timeUniformDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeGaussDistribution() {
		return timeGaussDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeGaussDistribution_Mean() {
		return (EReference)timeGaussDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeGaussDistribution_Sd() {
		return (EReference)timeGaussDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeGaussDistribution__GetAverage() {
		return timeGaussDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeWeibullEstimatorsDistribution() {
		return timeWeibullEstimatorsDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeWeibullEstimatorsDistribution_Average() {
		return (EReference)timeWeibullEstimatorsDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeWeibullEstimatorsDistribution_PRemainPromille() {
		return (EAttribute)timeWeibullEstimatorsDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeBetaDistribution() {
		return timeBetaDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeBetaDistribution_Alpha() {
		return (EAttribute)timeBetaDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeBetaDistribution_Beta() {
		return (EAttribute)timeBetaDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeBetaDistribution__GetAverage() {
		return timeBetaDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDiscreteValueDeviation() {
		return iDiscreteValueDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIDiscreteValueDeviation__GetLowerBound() {
		return iDiscreteValueDeviationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIDiscreteValueDeviation__GetUpperBound() {
		return iDiscreteValueDeviationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIDiscreteValueDeviation__GetAverage() {
		return iDiscreteValueDeviationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueInterval() {
		return discreteValueIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueInterval_LowerBound() {
		return (EAttribute)discreteValueIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueInterval_UpperBound() {
		return (EAttribute)discreteValueIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueInterval__GetAverage() {
		return discreteValueIntervalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueInterval__ValidateInvariants__DiagnosticChain_Map() {
		return discreteValueIntervalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueConstant() {
		return discreteValueConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueConstant_Value() {
		return (EAttribute)discreteValueConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueConstant__GetLowerBound() {
		return discreteValueConstantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueConstant__GetUpperBound() {
		return discreteValueConstantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueConstant__GetAverage() {
		return discreteValueConstantEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueHistogram() {
		return discreteValueHistogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiscreteValueHistogram_Entries() {
		return (EReference)discreteValueHistogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueHistogram__GetLowerBound() {
		return discreteValueHistogramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueHistogram__GetUpperBound() {
		return discreteValueHistogramEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueHistogram__GetAverage() {
		return discreteValueHistogramEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueHistogramEntry() {
		return discreteValueHistogramEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueHistogramEntry_Occurrences() {
		return (EAttribute)discreteValueHistogramEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedDiscreteValueDistribution() {
		return boundedDiscreteValueDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTruncatedDiscreteValueDistribution() {
		return truncatedDiscreteValueDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTruncatedDiscreteValueDistribution_LowerBound() {
		return (EAttribute)truncatedDiscreteValueDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTruncatedDiscreteValueDistribution_UpperBound() {
		return (EAttribute)truncatedDiscreteValueDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTruncatedDiscreteValueDistribution__ValidateInvariants__DiagnosticChain_Map() {
		return truncatedDiscreteValueDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueBoundaries() {
		return discreteValueBoundariesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueBoundaries_SamplingType() {
		return (EAttribute)discreteValueBoundariesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueStatistics() {
		return discreteValueStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueStatistics_Average() {
		return (EAttribute)discreteValueStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueUniformDistribution() {
		return discreteValueUniformDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueGaussDistribution() {
		return discreteValueGaussDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueGaussDistribution_Mean() {
		return (EAttribute)discreteValueGaussDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueGaussDistribution_Sd() {
		return (EAttribute)discreteValueGaussDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueGaussDistribution__GetAverage() {
		return discreteValueGaussDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueWeibullEstimatorsDistribution() {
		return discreteValueWeibullEstimatorsDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueWeibullEstimatorsDistribution_Average() {
		return (EAttribute)discreteValueWeibullEstimatorsDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueWeibullEstimatorsDistribution_PRemainPromille() {
		return (EAttribute)discreteValueWeibullEstimatorsDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteValueBetaDistribution() {
		return discreteValueBetaDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueBetaDistribution_Alpha() {
		return (EAttribute)discreteValueBetaDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteValueBetaDistribution_Beta() {
		return (EAttribute)discreteValueBetaDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscreteValueBetaDistribution__GetAverage() {
		return discreteValueBetaDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIContinuousValueDeviation() {
		return iContinuousValueDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIContinuousValueDeviation__GetLowerBound() {
		return iContinuousValueDeviationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIContinuousValueDeviation__GetUpperBound() {
		return iContinuousValueDeviationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIContinuousValueDeviation__GetAverage() {
		return iContinuousValueDeviationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueInterval() {
		return continuousValueIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueInterval_LowerBound() {
		return (EAttribute)continuousValueIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueInterval_UpperBound() {
		return (EAttribute)continuousValueIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueInterval__GetAverage() {
		return continuousValueIntervalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueInterval__ValidateInvariants__DiagnosticChain_Map() {
		return continuousValueIntervalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueConstant() {
		return continuousValueConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueConstant_Value() {
		return (EAttribute)continuousValueConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueConstant__GetLowerBound() {
		return continuousValueConstantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueConstant__GetUpperBound() {
		return continuousValueConstantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueConstant__GetAverage() {
		return continuousValueConstantEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueHistogram() {
		return continuousValueHistogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContinuousValueHistogram_Entries() {
		return (EReference)continuousValueHistogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueHistogram__GetLowerBound() {
		return continuousValueHistogramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueHistogram__GetUpperBound() {
		return continuousValueHistogramEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueHistogram__GetAverage() {
		return continuousValueHistogramEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueHistogramEntry() {
		return continuousValueHistogramEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueHistogramEntry_Occurrences() {
		return (EAttribute)continuousValueHistogramEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedContinuousValueDistribution() {
		return boundedContinuousValueDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTruncatedContinuousValueDistribution() {
		return truncatedContinuousValueDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTruncatedContinuousValueDistribution_LowerBound() {
		return (EAttribute)truncatedContinuousValueDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTruncatedContinuousValueDistribution_UpperBound() {
		return (EAttribute)truncatedContinuousValueDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTruncatedContinuousValueDistribution__ValidateInvariants__DiagnosticChain_Map() {
		return truncatedContinuousValueDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueBoundaries() {
		return continuousValueBoundariesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueBoundaries_SamplingType() {
		return (EAttribute)continuousValueBoundariesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueStatistics() {
		return continuousValueStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueStatistics_Average() {
		return (EAttribute)continuousValueStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueUniformDistribution() {
		return continuousValueUniformDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueGaussDistribution() {
		return continuousValueGaussDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueGaussDistribution_Mean() {
		return (EAttribute)continuousValueGaussDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueGaussDistribution_Sd() {
		return (EAttribute)continuousValueGaussDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueGaussDistribution__GetAverage() {
		return continuousValueGaussDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueWeibullEstimatorsDistribution() {
		return continuousValueWeibullEstimatorsDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueWeibullEstimatorsDistribution_Average() {
		return (EAttribute)continuousValueWeibullEstimatorsDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueWeibullEstimatorsDistribution_PRemainPromille() {
		return (EAttribute)continuousValueWeibullEstimatorsDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousValueBetaDistribution() {
		return continuousValueBetaDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueBetaDistribution_Alpha() {
		return (EAttribute)continuousValueBetaDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousValueBetaDistribution_Beta() {
		return (EAttribute)continuousValueBetaDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContinuousValueBetaDistribution__GetAverage() {
		return continuousValueBetaDistributionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericMode() {
		return numericModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumMode() {
		return enumModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumMode_Literals() {
		return (EReference)enumModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumMode__GetLiteral__String() {
		return enumModeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeLiteral() {
		return modeLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeLiteral_ContainingMode() {
		return (EReference)modeLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeLiteral__GetNamePrefix() {
		return modeLiteralEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeLiteral__ToString() {
		return modeLiteralEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentsModel() {
		return componentsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentsModel_Components() {
		return (EReference)componentsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentsModel_Systems() {
		return (EReference)componentsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISystem() {
		return iSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISystem_ComponentInstances() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISystem_Connectors() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISystem_GroundedPorts() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISystem_InnerPorts() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPort_ContainingComponent() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPort__GetNamePrefix() {
		return portEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Ports() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Tasks() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Runnables() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Labels() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Semaphores() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_OsEvents() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Type() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_SourcePort() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_TargetPort() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualifiedPort() {
		return qualifiedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualifiedPort_Instance() {
		return (EReference)qualifiedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualifiedPort_Port() {
		return (EReference)qualifiedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfacePort() {
		return interfacePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfacePort_InterfaceName() {
		return (EAttribute)interfacePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfacePort_Kind() {
		return (EAttribute)interfacePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigModel() {
		return configModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigModel_EventsToTrace() {
		return (EReference)configModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventConfig() {
		return eventConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventConfig_Event() {
		return (EReference)eventConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraintsModel() {
		return constraintsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_EventChains() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_TimingConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_AffinityConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_RunnableSequencingConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_DataAgeConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_Requirements() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_DataCoherencyGroups() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_DataStabilityGroups() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintsModel_PhysicalSectionConstraints() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableSequencingConstraint() {
		return runnableSequencingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunnableSequencingConstraint_OrderType() {
		return (EAttribute)runnableSequencingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableSequencingConstraint_RunnableGroups() {
		return (EReference)runnableSequencingConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableSequencingConstraint_ProcessScope() {
		return (EReference)runnableSequencingConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAffinityConstraint() {
		return affinityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeparationConstraint() {
		return separationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPairingConstraint() {
		return pairingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessConstraint() {
		return processConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessConstraint_Target() {
		return (EReference)processConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableConstraint() {
		return runnableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableConstraint_Target() {
		return (EReference)runnableConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataConstraint() {
		return dataConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataConstraint_Target() {
		return (EReference)dataConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableSeparationConstraint() {
		return runnableSeparationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableSeparationConstraint_Groups() {
		return (EReference)runnableSeparationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessSeparationConstraint() {
		return processSeparationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessSeparationConstraint_Groups() {
		return (EReference)processSeparationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSeparationConstraint() {
		return dataSeparationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSeparationConstraint_Groups() {
		return (EReference)dataSeparationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnablePairingConstraint() {
		return runnablePairingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnablePairingConstraint_Group() {
		return (EReference)runnablePairingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessPairingConstraint() {
		return processPairingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPairingConstraint_Group() {
		return (EReference)processPairingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataPairingConstraint() {
		return dataPairingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataPairingConstraint_Group() {
		return (EReference)dataPairingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableConstraintTarget() {
		return runnableConstraintTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessConstraintTarget() {
		return processConstraintTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataConstraintTarget() {
		return dataConstraintTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetMemory() {
		return targetMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetMemory_Memories() {
		return (EReference)targetMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetCore() {
		return targetCoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetCore_Cores() {
		return (EReference)targetCoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetScheduler() {
		return targetSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetScheduler_Schedulers() {
		return (EReference)targetSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelGroup() {
		return labelGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableGroup() {
		return runnableGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessGroup() {
		return processGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelEntityGroup() {
		return labelEntityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelEntityGroup_Labels() {
		return (EReference)labelEntityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableEntityGroup() {
		return runnableEntityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableEntityGroup_Runnables() {
		return (EReference)runnableEntityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessEntityGroup() {
		return processEntityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessEntityGroup_Processes() {
		return (EReference)processEntityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagGroup() {
		return tagGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagGroup_Tag() {
		return (EReference)tagGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractEventChain() {
		return abstractEventChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractEventChain_Stimulus() {
		return (EReference)abstractEventChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractEventChain_Response() {
		return (EReference)abstractEventChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractEventChain_Segments() {
		return (EReference)abstractEventChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractEventChain_Strands() {
		return (EReference)abstractEventChainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChain() {
		return eventChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubEventChain() {
		return subEventChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChainItem() {
		return eventChainItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEventChainItem__GetEventChain() {
		return eventChainItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChainReference() {
		return eventChainReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChainReference_EventChain() {
		return (EReference)eventChainReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChainContainer() {
		return eventChainContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChainContainer_EventChain() {
		return (EReference)eventChainContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingConstraint() {
		return timingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalSectionConstraint() {
		return physicalSectionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysicalSectionConstraint_Section() {
		return (EReference)physicalSectionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysicalSectionConstraint_Memories() {
		return (EReference)physicalSectionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynchronizationConstraint() {
		return synchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynchronizationConstraint_MultipleOccurrencesAllowed() {
		return (EAttribute)synchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSynchronizationConstraint_Tolerance() {
		return (EReference)synchronizationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventSynchronizationConstraint() {
		return eventSynchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventSynchronizationConstraint_Events() {
		return (EReference)eventSynchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChainSynchronizationConstraint() {
		return eventChainSynchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChainSynchronizationConstraint_Scope() {
		return (EReference)eventChainSynchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventChainSynchronizationConstraint_Type() {
		return (EAttribute)eventChainSynchronizationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelayConstraint() {
		return delayConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelayConstraint_MappingType() {
		return (EAttribute)delayConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelayConstraint_Source() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelayConstraint_Target() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelayConstraint_Upper() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelayConstraint_Lower() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChainLatencyConstraint() {
		return eventChainLatencyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChainLatencyConstraint_Scope() {
		return (EReference)eventChainLatencyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventChainLatencyConstraint_Type() {
		return (EAttribute)eventChainLatencyConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChainLatencyConstraint_Minimum() {
		return (EReference)eventChainLatencyConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChainLatencyConstraint_Maximum() {
		return (EReference)eventChainLatencyConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepetitionConstraint() {
		return repetitionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepetitionConstraint_Event() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepetitionConstraint_Span() {
		return (EAttribute)repetitionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepetitionConstraint_Lower() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepetitionConstraint_Upper() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepetitionConstraint_Jitter() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepetitionConstraint_Period() {
		return (EReference)repetitionConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAgeConstraint() {
		return dataAgeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAgeConstraint_Runnable() {
		return (EReference)dataAgeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAgeConstraint_Label() {
		return (EReference)dataAgeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAgeConstraint_DataAge() {
		return (EReference)dataAgeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAge() {
		return dataAgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAgeCycle() {
		return dataAgeCycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAgeCycle_MinimumCycle() {
		return (EAttribute)dataAgeCycleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataAgeCycle_MaximumCycle() {
		return (EAttribute)dataAgeCycleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataAgeTime() {
		return dataAgeTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAgeTime_MinimumTime() {
		return (EReference)dataAgeTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataAgeTime_MaximumTime() {
		return (EReference)dataAgeTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Severity() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Limit() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessRequirement() {
		return processRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessRequirement_Process() {
		return (EReference)processRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableRequirement() {
		return runnableRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableRequirement_Runnable() {
		return (EReference)runnableRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitectureRequirement() {
		return architectureRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitectureRequirement_Component() {
		return (EReference)architectureRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessChainRequirement() {
		return processChainRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessChainRequirement_ProcessChain() {
		return (EReference)processChainRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementLimit() {
		return requirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementLimit_LimitType() {
		return (EAttribute)requirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCPUPercentageRequirementLimit() {
		return cpuPercentageRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPUPercentageRequirementLimit_Metric() {
		return (EAttribute)cpuPercentageRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPUPercentageRequirementLimit_LimitValue() {
		return (EAttribute)cpuPercentageRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCPUPercentageRequirementLimit_HardwareContext() {
		return (EReference)cpuPercentageRequirementLimitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrequencyRequirementLimit() {
		return frequencyRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequencyRequirementLimit_Metric() {
		return (EAttribute)frequencyRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyRequirementLimit_LimitValue() {
		return (EReference)frequencyRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPercentageRequirementLimit() {
		return percentageRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPercentageRequirementLimit_Metric() {
		return (EAttribute)percentageRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPercentageRequirementLimit_LimitValue() {
		return (EAttribute)percentageRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountRequirementLimit() {
		return countRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountRequirementLimit_Metric() {
		return (EAttribute)countRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountRequirementLimit_LimitValue() {
		return (EAttribute)countRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeRequirementLimit() {
		return timeRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeRequirementLimit_Metric() {
		return (EAttribute)timeRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeRequirementLimit_LimitValue() {
		return (EReference)timeRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataCoherencyGroup() {
		return dataCoherencyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCoherencyGroup_Labels() {
		return (EReference)dataCoherencyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCoherencyGroup_Scope() {
		return (EReference)dataCoherencyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataCoherencyGroup_Direction() {
		return (EAttribute)dataCoherencyGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStabilityGroup() {
		return dataStabilityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataStabilityGroup_Labels() {
		return (EReference)dataStabilityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataStabilityGroup_Scope() {
		return (EReference)dataStabilityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataGroupScope() {
		return dataGroupScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessScope() {
		return processScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessScope_Process() {
		return (EReference)processScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableScope() {
		return runnableScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableScope_Runnable() {
		return (EReference)runnableScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentScope() {
		return componentScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentScope_Component() {
		return (EReference)componentScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventModel() {
		return eventModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventModel_Events() {
		return (EReference)eventModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Description() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventSet() {
		return eventSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventSet_Events() {
		return (EReference)eventSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityEvent() {
		return entityEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerEvent() {
		return triggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomEvent() {
		return customEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomEvent_EventType() {
		return (EAttribute)customEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomEvent_ExplicitTriggers() {
		return (EReference)customEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStimulusEvent() {
		return stimulusEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStimulusEvent_Entity() {
		return (EReference)stimulusEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessEvent() {
		return processEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessEvent_EventType() {
		return (EAttribute)processEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessEvent_Entity() {
		return (EReference)processEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessEvent_ProcessingUnit() {
		return (EReference)processEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessChainEvent() {
		return processChainEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessChainEvent_EventType() {
		return (EAttribute)processChainEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessChainEvent_Entity() {
		return (EReference)processChainEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessChainEvent_ProcessingUnit() {
		return (EReference)processChainEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableEvent() {
		return runnableEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunnableEvent_EventType() {
		return (EAttribute)runnableEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableEvent_Entity() {
		return (EReference)runnableEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableEvent_Process() {
		return (EReference)runnableEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableEvent_ProcessingUnit() {
		return (EReference)runnableEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelEvent() {
		return labelEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelEvent_EventType() {
		return (EAttribute)labelEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelEvent_Entity() {
		return (EReference)labelEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelEvent_Runnable() {
		return (EReference)labelEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelEvent_Process() {
		return (EReference)labelEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannelEvent() {
		return channelEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelEvent_EventType() {
		return (EAttribute)channelEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelEvent_Entity() {
		return (EReference)channelEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelEvent_Runnable() {
		return (EReference)channelEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelEvent_Process() {
		return (EReference)channelEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemaphoreEvent() {
		return semaphoreEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemaphoreEvent_EventType() {
		return (EAttribute)semaphoreEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemaphoreEvent_Entity() {
		return (EReference)semaphoreEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemaphoreEvent_Runnable() {
		return (EReference)semaphoreEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemaphoreEvent_Process() {
		return (EReference)semaphoreEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemaphoreEvent_ProcessingUnit() {
		return (EReference)semaphoreEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentEvent() {
		return componentEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentEvent_EventType() {
		return (EAttribute)componentEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentEvent_Entity() {
		return (EReference)componentEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHWModel() {
		return hwModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHWModel_Definitions() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHWModel_FeatureCategories() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHWModel_Structures() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHWModel_Domains() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwStructure() {
		return hwStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwStructure_StructureType() {
		return (EAttribute)hwStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwStructure_Ports() {
		return (EReference)hwStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwStructure_Structures() {
		return (EReference)hwStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwStructure_Modules() {
		return (EReference)hwStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwStructure_Connections() {
		return (EReference)hwStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwStructure_InnerPorts() {
		return (EReference)hwStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwModule() {
		return hwModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwModule_Ports() {
		return (EReference)hwModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwModule_PowerDomain() {
		return (EReference)hwModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwModule_FrequencyDomain() {
		return (EReference)hwModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwDomain() {
		return hwDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrequencyDomain() {
		return frequencyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrequencyDomain_DefaultValue() {
		return (EReference)frequencyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequencyDomain_ClockGating() {
		return (EAttribute)frequencyDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPowerDomain() {
		return powerDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPowerDomain_DefaultValue() {
		return (EReference)powerDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPowerDomain_PowerGating() {
		return (EAttribute)powerDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingUnit() {
		return processingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingUnit_Definition() {
		return (EReference)processingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingUnit_AccessElements() {
		return (EReference)processingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingUnit_Caches() {
		return (EReference)processingUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemory_Definition() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemory_Mappings() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCache_Definition() {
		return (EReference)cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwFeatureCategory() {
		return hwFeatureCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwFeatureCategory_FeatureType() {
		return (EAttribute)hwFeatureCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwFeatureCategory_Description() {
		return (EAttribute)hwFeatureCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwFeatureCategory_Features() {
		return (EReference)hwFeatureCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwFeature() {
		return hwFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwFeature_ContainingCategory() {
		return (EReference)hwFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwFeature_Value() {
		return (EAttribute)hwFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHwFeature__GetNamePrefix() {
		return hwFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHwFeature__ToString() {
		return hwFeatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwPort() {
		return hwPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwPort_BitWidth() {
		return (EAttribute)hwPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwPort_Priority() {
		return (EAttribute)hwPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwPort_PortType() {
		return (EAttribute)hwPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwPort_PortInterface() {
		return (EAttribute)hwPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwPort_Delegated() {
		return (EAttribute)hwPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwPort_Connections() {
		return (EReference)hwPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHwPort__GetNamePrefix() {
		return hwPortEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionHandler() {
		return connectionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionHandler_Definition() {
		return (EReference)connectionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionHandler_InternalConnections() {
		return (EReference)connectionHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwConnection() {
		return hwConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwConnection_ReadLatency() {
		return (EReference)hwConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwConnection_WriteLatency() {
		return (EReference)hwConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwConnection_DataRate() {
		return (EReference)hwConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwConnection_Port1() {
		return (EReference)hwConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwConnection_Port2() {
		return (EReference)hwConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwConnection_Internal() {
		return (EAttribute)hwConnectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHwConnection__GetNamePrefix() {
		return hwConnectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHwConnection__GetPorts() {
		return hwConnectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwAccessElement() {
		return hwAccessElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwAccessElement_Source() {
		return (EReference)hwAccessElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwAccessElement_Destination() {
		return (EReference)hwAccessElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwAccessElement_AccessPath() {
		return (EReference)hwAccessElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwAccessElement_ReadLatency() {
		return (EReference)hwAccessElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwAccessElement_WriteLatency() {
		return (EReference)hwAccessElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwAccessElement_DataRate() {
		return (EReference)hwAccessElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwDefinition() {
		return hwDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingUnitDefinition() {
		return processingUnitDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingUnitDefinition_PuType() {
		return (EAttribute)processingUnitDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingUnitDefinition_Features() {
		return (EReference)processingUnitDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingUnitDefinition_Classifiers() {
		return (EReference)processingUnitDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionHandlerDefinition() {
		return connectionHandlerDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionHandlerDefinition_Policy() {
		return (EAttribute)connectionHandlerDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionHandlerDefinition_ReadLatency() {
		return (EReference)connectionHandlerDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionHandlerDefinition_WriteLatency() {
		return (EReference)connectionHandlerDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionHandlerDefinition_DataRate() {
		return (EReference)connectionHandlerDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionHandlerDefinition_MaxBurstSize() {
		return (EAttribute)connectionHandlerDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionHandlerDefinition_MaxConcurrentTransfers() {
		return (EAttribute)connectionHandlerDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryDefinition() {
		return memoryDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryDefinition_Size() {
		return (EReference)memoryDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryDefinition_AccessLatency() {
		return (EReference)memoryDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryDefinition_DataRate() {
		return (EReference)memoryDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemoryDefinition_MemoryType() {
		return (EAttribute)memoryDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryDefinition_Classifiers() {
		return (EReference)memoryDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCacheDefinition() {
		return cacheDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCacheDefinition_Size() {
		return (EReference)cacheDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCacheDefinition_LineSize() {
		return (EReference)cacheDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCacheDefinition_AccessLatency() {
		return (EReference)cacheDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDefinition_CacheType() {
		return (EAttribute)cacheDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDefinition_WriteStrategy() {
		return (EAttribute)cacheDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDefinition_NWays() {
		return (EAttribute)cacheDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDefinition_Coherency() {
		return (EAttribute)cacheDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDefinition_Exclusive() {
		return (EAttribute)cacheDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDefinition_HitRate() {
		return (EAttribute)cacheDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwPath() {
		return hwPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwPath_Source() {
		return (EReference)hwPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwPath_Destination() {
		return (EReference)hwPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHwPath__GetContainingAccessElement() {
		return hwPathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwAccessPath() {
		return hwAccessPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwAccessPath_ContainingAccessElement() {
		return (EReference)hwAccessPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHwAccessPath_PathElements() {
		return (EReference)hwAccessPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwAccessPath_StartAddress() {
		return (EAttribute)hwAccessPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwAccessPath_EndAddress() {
		return (EAttribute)hwAccessPathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHwAccessPath_MemOffset() {
		return (EAttribute)hwAccessPathEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwPathElement() {
		return hwPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHwPathElement__GetPorts() {
		return hwPathElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHwDestination() {
		return hwDestinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHwDestination__GetPorts() {
		return hwDestinationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingModel() {
		return mappingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingModel_SchedulerAllocation() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingModel_RunnableAllocation() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingModel_TaskAllocation() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingModel_IsrAllocation() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingModel_MemoryMapping() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingModel_PhysicalSectionMapping() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingModel_AddressMappingType() {
		return (EAttribute)mappingModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulerAllocation() {
		return schedulerAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulerAllocation_Scheduler() {
		return (EReference)schedulerAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulerAllocation_Responsibility() {
		return (EReference)schedulerAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulerAllocation_ExecutingPU() {
		return (EReference)schedulerAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskAllocation() {
		return taskAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskAllocation_Task() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskAllocation_Scheduler() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskAllocation_Affinity() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskAllocation_SchedulingParameters() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskAllocation_ParameterExtensions() {
		return (EReference)taskAllocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISRAllocation() {
		return isrAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISRAllocation_Isr() {
		return (EReference)isrAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISRAllocation_Controller() {
		return (EReference)isrAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getISRAllocation_Priority() {
		return (EAttribute)isrAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableAllocation() {
		return runnableAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableAllocation_Scheduler() {
		return (EReference)runnableAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableAllocation_Entity() {
		return (EReference)runnableAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryMapping() {
		return memoryMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryMapping_AbstractElement() {
		return (EReference)memoryMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryMapping_Memory() {
		return (EReference)memoryMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemoryMapping_MemoryPositionAddress() {
		return (EAttribute)memoryMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalSectionMapping() {
		return physicalSectionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysicalSectionMapping_Origin() {
		return (EReference)physicalSectionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysicalSectionMapping_Memory() {
		return (EReference)physicalSectionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalSectionMapping_StartAddress() {
		return (EAttribute)physicalSectionMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalSectionMapping_EndAddress() {
		return (EAttribute)physicalSectionMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysicalSectionMapping_Labels() {
		return (EReference)physicalSectionMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysicalSectionMapping_RunEntities() {
		return (EReference)physicalSectionMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOSModel() {
		return osModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOSModel_Semaphores() {
		return (EReference)osModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOSModel_OperatingSystems() {
		return (EReference)osModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOSModel_OsOverheads() {
		return (EReference)osModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsDataConsistency() {
		return osDataConsistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsDataConsistency_Mode() {
		return (EAttribute)osDataConsistencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsDataConsistency_DataStability() {
		return (EReference)osDataConsistencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsDataConsistency_NonAtomicDataCoherency() {
		return (EReference)osDataConsistencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStability() {
		return dataStabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataStability_Enabled() {
		return (EAttribute)dataStabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataStability_Algorithm() {
		return (EAttribute)dataStabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataStability_AccessMultiplicity() {
		return (EAttribute)dataStabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataStability_Level() {
		return (EAttribute)dataStabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonAtomicDataCoherency() {
		return nonAtomicDataCoherencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonAtomicDataCoherency_Enabled() {
		return (EAttribute)nonAtomicDataCoherencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonAtomicDataCoherency_Algorithm() {
		return (EAttribute)nonAtomicDataCoherencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonAtomicDataCoherency_AccessMultiplicity() {
		return (EAttribute)nonAtomicDataCoherencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemaphore() {
		return semaphoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemaphore_SemaphoreType() {
		return (EAttribute)semaphoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemaphore_InitialValue() {
		return (EAttribute)semaphoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemaphore_MaxValue() {
		return (EAttribute)semaphoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemaphore_PriorityCeilingProtocol() {
		return (EAttribute)semaphoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemaphore_SemaphoreAccesses() {
		return (EReference)semaphoreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemaphore_ReferringComponents() {
		return (EReference)semaphoreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheduler() {
		return schedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheduler_ComputationItems() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheduler_SchedulerAllocations() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheduler_RunnableAllocations() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScheduler__GetSchedulingAlgorithm() {
		return schedulerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskScheduler() {
		return taskSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskScheduler_SchedulingAlgorithm() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskScheduler_ParentAssociation() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskScheduler_ChildAssociations() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskScheduler_TaskAllocations() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskScheduler_ParentScheduler() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskScheduler_ChildSchedulers() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulerAssociation() {
		return schedulerAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulerAssociation_Child() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulerAssociation_Parent() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulerAssociation_SchedulingParameters() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulerAssociation_ParameterExtensions() {
		return (EReference)schedulerAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterruptController() {
		return interruptControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterruptController_SchedulingAlgorithm() {
		return (EReference)interruptControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterruptController_IsrAllocations() {
		return (EReference)interruptControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulingParameters() {
		return schedulingParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchedulingParameters_Priority() {
		return (EAttribute)schedulingParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulingParameters_MinBudget() {
		return (EReference)schedulingParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulingParameters_MaxBudget() {
		return (EReference)schedulingParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulingParameters_Replenishment() {
		return (EReference)schedulingParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterExtension() {
		return parameterExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterExtension_Key() {
		return (EAttribute)parameterExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterExtension_Value() {
		return (EAttribute)parameterExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterruptSchedulingAlgorithm() {
		return interruptSchedulingAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskSchedulingAlgorithm() {
		return taskSchedulingAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedPriority() {
		return fixedPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedPriorityPreemptive() {
		return fixedPriorityPreemptiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedPriorityPreemptiveWithBudgetEnforcement() {
		return fixedPriorityPreemptiveWithBudgetEnforcementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOSEK() {
		return osekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeadlineMonotonic() {
		return deadlineMonotonicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRateMonotonic() {
		return rateMonotonicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPfair() {
		return pfairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPfair_QuantSizeNs() {
		return (EAttribute)pfairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPfairPD2() {
		return pfairPD2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartlyPFairPD2() {
		return partlyPFairPD2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEarlyReleaseFairPD2() {
		return earlyReleaseFairPD2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartlyEarlyReleaseFairPD2() {
		return partlyEarlyReleaseFairPD2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicPriority() {
		return dynamicPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeastLocalRemainingExecutionTimeFirst() {
		return leastLocalRemainingExecutionTimeFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEarliestDeadlineFirst() {
		return earliestDeadlineFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPriorityBasedRoundRobin() {
		return priorityBasedRoundRobinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReservationBasedServer() {
		return reservationBasedServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeferrableServer() {
		return deferrableServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPollingPeriodicServer() {
		return pollingPeriodicServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSporadicServer() {
		return sporadicServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstantBandwidthServer() {
		return constantBandwidthServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstantBandwidthServerWithCASH() {
		return constantBandwidthServerWithCASHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrouping() {
		return groupingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserSpecificSchedulingAlgorithm() {
		return userSpecificSchedulingAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSpecificSchedulingAlgorithm_ParameterExtensions() {
		return (EReference)userSpecificSchedulingAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPriorityBased() {
		return priorityBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatingSystem_Overhead() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatingSystem_TaskSchedulers() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatingSystem_InterruptControllers() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatingSystem_OsDataConsistency() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVendorOperatingSystem() {
		return vendorOperatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorOperatingSystem_OsName() {
		return (EAttribute)vendorOperatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorOperatingSystem_Vendor() {
		return (EAttribute)vendorOperatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorOperatingSystem_Version() {
		return (EAttribute)vendorOperatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsOverhead() {
		return osOverheadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsOverhead_ApiOverhead() {
		return (EReference)osOverheadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsOverhead_IsrCategory1Overhead() {
		return (EReference)osOverheadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsOverhead_IsrCategory2Overhead() {
		return (EReference)osOverheadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsAPIOverhead() {
		return osAPIOverheadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiSendMessage() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiTerminateTask() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiSchedule() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiRequestResource() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiReleaseResource() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiSetEvent() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiWaitEvent() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiClearEvent() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiActivateTask() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiEnforcedMigration() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiSuspendOsInterrupts() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiResumeOsInterrupts() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiRequestSpinlock() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiReleaseSpinlock() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiSenderReceiverRead() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiSenderReceiverWrite() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiSynchronousServerCallPoint() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiIocRead() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsAPIOverhead_ApiIocWrite() {
		return (EReference)osAPIOverheadEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsISROverhead() {
		return osISROverheadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsISROverhead_PreExecutionOverhead() {
		return (EReference)osISROverheadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsISROverhead_PostExecutionOverhead() {
		return (EReference)osISROverheadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyConstraintsModel() {
		return propertyConstraintsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyConstraintsModel_AllocationConstraints() {
		return (EReference)propertyConstraintsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyConstraintsModel_MappingConstraints() {
		return (EReference)propertyConstraintsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoreAllocationConstraint() {
		return coreAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoreAllocationConstraint_CoreClassification() {
		return (EReference)coreAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryMappingConstraint() {
		return memoryMappingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryMappingConstraint_MemoryClassification() {
		return (EReference)memoryMappingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessAllocationConstraint() {
		return processAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessAllocationConstraint_Process() {
		return (EReference)processAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessPrototypeAllocationConstraint() {
		return processPrototypeAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPrototypeAllocationConstraint_ProcessPrototype() {
		return (EReference)processPrototypeAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableAllocationConstraint() {
		return runnableAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableAllocationConstraint_Runnable() {
		return (EReference)runnableAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractElementMappingConstraint() {
		return abstractElementMappingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractElementMappingConstraint_AbstractElement() {
		return (EReference)abstractElementMappingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassification_Condition() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassification_Grouping() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoreClassification() {
		return coreClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoreClassification_Classifiers() {
		return (EReference)coreClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemoryClassification() {
		return memoryClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemoryClassification_Classifiers() {
		return (EReference)memoryClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStimuliModel() {
		return stimuliModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStimuliModel_Stimuli() {
		return (EReference)stimuliModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStimuliModel_Clocks() {
		return (EReference)stimuliModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStimulus() {
		return stimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStimulus_SetModeValueList() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStimulus_ExecutionCondition() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStimulus_AffectedProcesses() {
		return (EReference)stimulusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeValueList() {
		return modeValueListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeValueList_Entries() {
		return (EReference)modeValueListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeValueMapEntry() {
		return modeValueMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeValueMapEntry_Key() {
		return (EReference)modeValueMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModeValueMapEntry_Value() {
		return (EAttribute)modeValueMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeValue() {
		return modeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeValue_Label() {
		return (EReference)modeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModeValue_Value() {
		return (EAttribute)modeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeValue__ValidateInvariants__DiagnosticChain_Map() {
		return modeValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeValue__GetLiteral() {
		return modeValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeValue__GetInteger() {
		return modeValueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeAssignment() {
		return modeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeConditionDisjunction() {
		return modeConditionDisjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeConditionDisjunction_Entries() {
		return (EReference)modeConditionDisjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeConditionDisjunction__IsSatisfiedBy__EMap() {
		return modeConditionDisjunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeConditionDisjunctionEntry() {
		return modeConditionDisjunctionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeConditionDisjunctionEntry__IsSatisfiedBy__EMap() {
		return modeConditionDisjunctionEntryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeCondition() {
		return modeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModeCondition_Relation() {
		return (EAttribute)modeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeCondition__IsSatisfiedBy__EMap() {
		return modeConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeConditionConjunction() {
		return modeConditionConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeConditionConjunction_Entries() {
		return (EReference)modeConditionConjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeConditionConjunction__IsSatisfiedBy__EMap() {
		return modeConditionConjunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedPeriodic() {
		return fixedPeriodicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedPeriodic_Offset() {
		return (EReference)fixedPeriodicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedPeriodic_Recurrence() {
		return (EReference)fixedPeriodicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriodicStimulus() {
		return periodicStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicStimulus_Jitter() {
		return (EReference)periodicStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicStimulus_MinDistance() {
		return (EReference)periodicStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelativePeriodicStimulus() {
		return relativePeriodicStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelativePeriodicStimulus_Offset() {
		return (EReference)relativePeriodicStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelativePeriodicStimulus_NextOccurrence() {
		return (EReference)relativePeriodicStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableRateStimulus() {
		return variableRateStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableRateStimulus_Step() {
		return (EReference)variableRateStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableRateStimulus_OccurrencesPerStep() {
		return (EReference)variableRateStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableRateStimulus_MaxIncreasePerStep() {
		return (EAttribute)variableRateStimulusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableRateStimulus_MaxDecreasePerStep() {
		return (EAttribute)variableRateStimulusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableRateStimulus_Scenario() {
		return (EReference)variableRateStimulusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Clock() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_SamplingOffset() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_SamplingRecurrence() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriodicSyntheticStimulus() {
		return periodicSyntheticStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicSyntheticStimulus_OccurrenceTimes() {
		return (EReference)periodicSyntheticStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomStimulus() {
		return customStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomStimulus_Description() {
		return (EAttribute)customStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleStimulus() {
		return singleStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleStimulus_Occurrence() {
		return (EReference)singleStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterProcessStimulus() {
		return interProcessStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterProcessStimulus_Counter() {
		return (EReference)interProcessStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterProcessStimulus_ExplicitTriggers() {
		return (EReference)interProcessStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriodicBurstStimulus() {
		return periodicBurstStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicBurstStimulus_BurstLength() {
		return (EReference)periodicBurstStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicBurstStimulus_OccurrenceMinDistance() {
		return (EReference)periodicBurstStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeriodicBurstStimulus_OccurrenceCount() {
		return (EAttribute)periodicBurstStimulusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventStimulus() {
		return eventStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventStimulus_TriggeringEvents() {
		return (EReference)eventStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventStimulus_Counter() {
		return (EReference)eventStimulusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrivalCurveStimulus() {
		return arrivalCurveStimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrivalCurveStimulus_Entries() {
		return (EReference)arrivalCurveStimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrivalCurveEntry() {
		return arrivalCurveEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalCurveEntry_NumberOfOccurrences() {
		return (EAttribute)arrivalCurveEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrivalCurveEntry_LowerTimeBorder() {
		return (EReference)arrivalCurveEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrivalCurveEntry_UpperTimeBorder() {
		return (EReference)arrivalCurveEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClock() {
		return clockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClockFunction() {
		return clockFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClockFunction_CurveType() {
		return (EAttribute)clockFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClockFunction_Period() {
		return (EReference)clockFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClockFunction_PeakToPeak() {
		return (EReference)clockFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClockFunction_XOffset() {
		return (EReference)clockFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClockFunction_YOffset() {
		return (EReference)clockFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClockStepList() {
		return clockStepListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClockStepList_Entries() {
		return (EReference)clockStepListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClockStepList_Period() {
		return (EReference)clockStepListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClockStep() {
		return clockStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClockStep_Frequency() {
		return (EReference)clockStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClockStep_Time() {
		return (EReference)clockStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSWModel() {
		return swModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Isrs() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Tasks() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Runnables() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Labels() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Channels() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_ProcessPrototypes() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Sections() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Activations() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Events() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_TypeDefinitions() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_CustomEntities() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_ProcessChains() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_Modes() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSWModel_ModeLabels() {
		return (EReference)swModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSWModel__ModeLiteral__String_String() {
		return swModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMemoryElement() {
		return abstractMemoryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMemoryElement_Size() {
		return (EReference)abstractMemoryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMemoryElement_Mappings() {
		return (EReference)abstractMemoryElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractProcess() {
		return abstractProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractProcess_ReferringComponents() {
		return (EReference)abstractProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomEntity() {
		return customEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomEntity_TypeName() {
		return (EAttribute)customEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessChain() {
		return processChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessChain_Processes() {
		return (EReference)processChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_CallGraph() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Stimuli() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getICallGraphItemContainer() {
		return iCallGraphItemContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getICallGraphItemContainer_Items() {
		return (EReference)iCallGraphItemContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallGraph() {
		return callGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallGraphItem() {
		return callGraphItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallGraphItem_ContainingProcess() {
		return (EReference)callGraphItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallGraphItem_ContainingRunnable() {
		return (EReference)callGraphItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeSwitch() {
		return modeSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeSwitch_Entries() {
		return (EReference)modeSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeSwitch_DefaultEntry() {
		return (EReference)modeSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeSwitchEntry() {
		return modeSwitchEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeSwitchEntry_Condition() {
		return (EReference)modeSwitchEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeSwitchDefault() {
		return modeSwitchDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbabilitySwitch() {
		return probabilitySwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProbabilitySwitch_Entries() {
		return (EReference)probabilitySwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbabilitySwitchEntry() {
		return probabilitySwitchEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProbabilitySwitchEntry_Probability() {
		return (EAttribute)probabilitySwitchEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCounter_Prescaler() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCounter_Offset() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWaitEvent() {
		return waitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWaitEvent_EventMask() {
		return (EReference)waitEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWaitEvent_MaskType() {
		return (EAttribute)waitEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWaitEvent_WaitingBehaviour() {
		return (EAttribute)waitEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWaitEvent_Counter() {
		return (EReference)waitEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetEvent() {
		return setEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetEvent_EventMask() {
		return (EReference)setEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetEvent_Process() {
		return (EReference)setEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetEvent_Counter() {
		return (EReference)setEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClearEvent() {
		return clearEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClearEvent_EventMask() {
		return (EReference)clearEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClearEvent_Counter() {
		return (EReference)clearEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventMask() {
		return eventMaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventMask_Events() {
		return (EReference)eventMaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsEvent() {
		return osEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsEvent_CommunicationOverheadInBit() {
		return (EAttribute)osEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsEvent_ReferringComponents() {
		return (EReference)osEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterProcessTrigger() {
		return interProcessTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterProcessTrigger_Stimulus() {
		return (EReference)interProcessTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterProcessTrigger_Counter() {
		return (EReference)interProcessTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnforcedMigration() {
		return enforcedMigrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnforcedMigration_ResourceOwner() {
		return (EReference)enforcedMigrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulePoint() {
		return schedulePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerminateProcess() {
		return terminateProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerminateProcess_Counter() {
		return (EReference)terminateProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Preemption() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_MultipleTaskActivationLimit() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISR() {
		return isrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getISR_Category() {
		return (EAttribute)isrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessPrototype() {
		return processPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessPrototype_Preemption() {
		return (EAttribute)processPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPrototype_FirstRunnable() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPrototype_LastRunnable() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPrototype_AccessPrecedenceSpec() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPrototype_OrderPrecedenceSpec() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPrototype_ChainedPrototypes() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPrototype_Activation() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessPrototype_RunnableCalls() {
		return (EReference)processPrototypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChainedProcessPrototype() {
		return chainedProcessPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChainedProcessPrototype_Prototype() {
		return (EReference)chainedProcessPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChainedProcessPrototype_Apply() {
		return (EAttribute)chainedProcessPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChainedProcessPrototype_Offset() {
		return (EAttribute)chainedProcessPrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralPrecedence() {
		return generalPrecedenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralPrecedence_Origin() {
		return (EReference)generalPrecedenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralPrecedence_Target() {
		return (EReference)generalPrecedenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessPrecedenceSpec() {
		return accessPrecedenceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessPrecedenceSpec_Label() {
		return (EReference)accessPrecedenceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessPrecedenceSpec_OrderType() {
		return (EAttribute)accessPrecedenceSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderPrecedenceSpec() {
		return orderPrecedenceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPrecedenceSpec_OrderType() {
		return (EAttribute)orderPrecedenceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataDependency() {
		return dataDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataDependency_Labels() {
		return (EReference)dataDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataDependency_Parameters() {
		return (EReference)dataDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataDependency_CallArguments() {
		return (EReference)dataDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataDependency_ContainingRunnable() {
		return (EReference)dataDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableParameter() {
		return runnableParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableParameter_ContainingRunnable() {
		return (EReference)runnableParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunnableParameter_Direction() {
		return (EAttribute)runnableParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableParameter_DataType() {
		return (EReference)runnableParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableParameter_DependsOn() {
		return (EReference)runnableParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRunnableParameter__GetNamePrefix() {
		return runnableParameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRunnableParameter__ToString() {
		return runnableParameterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnable() {
		return runnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnable_ExecutionCondition() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnable_Parameters() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnable_CallGraph() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnable_Activations() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunnable_Callback() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunnable_Service() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunnable_AsilLevel() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnable_Section() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnable_RunnableCalls() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnable_ReferringComponents() {
		return (EReference)runnableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRunnable__GetRunnableItems() {
		return runnableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRunnable__GetFirstActivation() {
		return runnableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_DataType() {
		return (EReference)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Constant() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_BVolatile() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_DataStability() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_StabilityLevel() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_Section() {
		return (EReference)labelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_LabelAccesses() {
		return (EReference)labelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_ReferringComponents() {
		return (EReference)labelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_ElementType() {
		return (EReference)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannel_DefaultElements() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannel_MaxElements() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_ChannelAccesses() {
		return (EReference)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeLabel() {
		return modeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeLabel_Mode() {
		return (EReference)modeLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModeLabel_InitialValue() {
		return (EAttribute)modeLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeLabel__ValidateInvariants__DiagnosticChain_Map() {
		return modeLabelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeLabel__IsEnum() {
		return modeLabelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeLabel__IsNumeric() {
		return modeLabelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_AsilLevel() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Labels() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Runnables() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputationItem() {
		return computationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionNeed() {
		return executionNeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionNeed_Needs() {
		return (EReference)executionNeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeedEntry() {
		return needEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeedEntry_Key() {
		return (EAttribute)needEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeedEntry_Value() {
		return (EReference)needEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTicks() {
		return ticksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTicks_Default() {
		return (EReference)ticksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTicks_Extended() {
		return (EReference)ticksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTicksEntry() {
		return ticksEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTicksEntry_Key() {
		return (EReference)ticksEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTicksEntry_Value() {
		return (EReference)ticksEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModeLabelAccess() {
		return modeLabelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModeLabelAccess_Data() {
		return (EReference)modeLabelAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModeLabelAccess_Access() {
		return (EAttribute)modeLabelAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModeLabelAccess_Value() {
		return (EAttribute)modeLabelAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModeLabelAccess_Step() {
		return (EAttribute)modeLabelAccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModeLabelAccess__ValidateInvariants__DiagnosticChain_Map() {
		return modeLabelAccessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelAccess() {
		return labelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelAccess_Data() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelAccess_Access() {
		return (EAttribute)labelAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelAccess_Statistic() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelAccess_TransmissionPolicy() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelAccess_DataStability() {
		return (EAttribute)labelAccessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelAccess_Implementation() {
		return (EAttribute)labelAccessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelAccess_DependsOn() {
		return (EReference)labelAccessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannelAccess() {
		return channelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelAccess_Data() {
		return (EReference)channelAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelAccess_Elements() {
		return (EAttribute)channelAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelAccess_TransmissionPolicy() {
		return (EReference)channelAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannelSend() {
		return channelSendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannelReceive() {
		return channelReceiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelReceive_ReceiveOperation() {
		return (EAttribute)channelReceiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelReceive_DataMustBeNew() {
		return (EAttribute)channelReceiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelReceive_ElementIndex() {
		return (EAttribute)channelReceiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelReceive_LowerBound() {
		return (EAttribute)channelReceiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemaphoreAccess() {
		return semaphoreAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemaphoreAccess_Semaphore() {
		return (EReference)semaphoreAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemaphoreAccess_Access() {
		return (EAttribute)semaphoreAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemaphoreAccess_WaitingBehaviour() {
		return (EAttribute)semaphoreAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSenderReceiverCommunication() {
		return senderReceiverCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSenderReceiverCommunication_Buffered() {
		return (EAttribute)senderReceiverCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenderReceiverCommunication_Label() {
		return (EReference)senderReceiverCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenderReceiverCommunication_Port() {
		return (EReference)senderReceiverCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSenderReceiverRead() {
		return senderReceiverReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSenderReceiverWrite() {
		return senderReceiverWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSenderReceiverWrite_NotifiedRunnables() {
		return (EReference)senderReceiverWriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerCall() {
		return serverCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerCall_ServerRunnable() {
		return (EReference)serverCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerCall_Port() {
		return (EReference)serverCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynchronousServerCall() {
		return synchronousServerCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSynchronousServerCall_WaitingBehaviour() {
		return (EAttribute)synchronousServerCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsynchronousServerCall() {
		return asynchronousServerCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsynchronousServerCall_ResultRunnable() {
		return (EReference)asynchronousServerCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGetResultServerCall() {
		return getResultServerCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGetResultServerCall_BlockingType() {
		return (EAttribute)getResultServerCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Ordered() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallArgument() {
		return callArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallArgument_ContainingCall() {
		return (EReference)callArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallArgument_Parameter() {
		return (EReference)callArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallArgument_DependsOn() {
		return (EReference)callArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCallArgument__GetName() {
		return callArgumentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCallArgument__ComputeUniqueName() {
		return callArgumentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableCall() {
		return runnableCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableCall_Runnable() {
		return (EReference)runnableCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableCall_Arguments() {
		return (EReference)runnableCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableCall_Statistic() {
		return (EReference)runnableCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomEventTrigger() {
		return customEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomEventTrigger_Event() {
		return (EReference)customEventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundType() {
		return compoundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStruct_Entries() {
		return (EReference)structEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructEntry() {
		return structEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructEntry_DataType() {
		return (EReference)structEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArray_NumberElements() {
		return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArray_DataType() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointer() {
		return pointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointer_DataType() {
		return (EReference)pointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeRef() {
		return typeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeRef_TypeDef() {
		return (EReference)typeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlias() {
		return aliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlias_Target() {
		return (EAttribute)aliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlias_Alias() {
		return (EAttribute)aliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeDefinition_Size() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTypeDefinition() {
		return dataTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataTypeDefinition_DataType() {
		return (EReference)dataTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseTypeDefinition() {
		return baseTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseTypeDefinition_Aliases() {
		return (EReference)baseTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivation() {
		return activationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriodicActivation() {
		return periodicActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicActivation_Min() {
		return (EReference)periodicActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicActivation_Max() {
		return (EReference)periodicActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicActivation_Recurrence() {
		return (EReference)periodicActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriodicActivation_Offset() {
		return (EReference)periodicActivationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableRateActivation() {
		return variableRateActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableRateActivation_Description() {
		return (EAttribute)variableRateActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableRateActivation_Step() {
		return (EReference)variableRateActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableRateActivation_OccurrencesPerStep() {
		return (EReference)variableRateActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSporadicActivation() {
		return sporadicActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSporadicActivation_Description() {
		return (EAttribute)sporadicActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSporadicActivation_Occurrence() {
		return (EReference)sporadicActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleActivation() {
		return singleActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleActivation_Min() {
		return (EReference)singleActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleActivation_Max() {
		return (EReference)singleActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventActivation() {
		return eventActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventActivation_TriggeringEvents() {
		return (EReference)eventActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventActivation_Counter() {
		return (EReference)eventActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomActivation() {
		return customActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomActivation_Description() {
		return (EAttribute)customActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelAccessStatistic() {
		return labelAccessStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelAccessStatistic_Value() {
		return (EReference)labelAccessStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelAccessStatistic_CacheMisses() {
		return (EReference)labelAccessStatisticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunEntityCallStatistic() {
		return runEntityCallStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunEntityCallStatistic_Statistic() {
		return (EReference)runEntityCallStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementModel() {
		return measurementModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementModel_Measurements() {
		return (EReference)measurementModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurement_Runtimes() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurement_RuntimeDeviation() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChainMeasurement() {
		return eventChainMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChainMeasurement_EventChain() {
		return (EReference)eventChainMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskMeasurement() {
		return taskMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskMeasurement_Task() {
		return (EReference)taskMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunnableMeasurement() {
		return runnableMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunnableMeasurement_Runnable() {
		return (EReference)runnableMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationalOperator() {
		return relationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFrequencyUnit() {
		return frequencyUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVoltageUnit() {
		return voltageUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataSizeUnit() {
		return dataSizeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataRateUnit() {
		return dataRateUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSamplingType() {
		return samplingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInterfaceKind() {
		return interfaceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRunnableOrderType() {
		return runnableOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSynchronizationType() {
		return synchronizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMappingType() {
		return mappingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLatencyType() {
		return latencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLimitType() {
		return limitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeMetric() {
		return timeMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCountMetric() {
		return countMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPercentageMetric() {
		return percentageMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCPUPercentageMetric() {
		return cpuPercentageMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFrequencyMetric() {
		return frequencyMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoherencyDirection() {
		return coherencyDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessEventType() {
		return processEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRunnableEventType() {
		return runnableEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLabelEventType() {
		return labelEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChannelEventType() {
		return channelEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSemaphoreEventType() {
		return semaphoreEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentEventType() {
		return componentEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMemoryType() {
		return memoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStructureType() {
		return structureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCacheType() {
		return cacheTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSchedPolicy() {
		return schedPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWriteStrategy() {
		return writeStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPuType() {
		return puTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortInterface() {
		return portInterfaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHwFeatureType() {
		return hwFeatureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMemoryAddressMappingType() {
		return memoryAddressMappingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOsDataConsistencyMode() {
		return osDataConsistencyModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessMultiplicity() {
		return accessMultiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataStabilityLevel() {
		return dataStabilityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSemaphoreType() {
		return semaphoreTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCondition() {
		return conditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGroupingType() {
		return groupingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCurveType() {
		return curveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWaitEventType() {
		return waitEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWaitingBehaviour() {
		return waitingBehaviourEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getISRCategory() {
		return isrCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessPrecedenceType() {
		return accessPrecedenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrderType() {
		return orderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLabelDataStability() {
		return labelDataStabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModeLabelAccessEnum() {
		return modeLabelAccessEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReceiveOperation() {
		return receiveOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLabelAccessDataStability() {
		return labelAccessDataStabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLabelAccessEnum() {
		return labelAccessEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLabelAccessImplementation() {
		return labelAccessImplementationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSemaphoreAccessEnum() {
		return semaphoreAccessEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBlockingType() {
		return blockingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPreemption() {
		return preemptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConcurrencyType() {
		return concurrencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getASILType() {
		return asilTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAddress() {
		return addressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveInt() {
		return positiveIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveLong() {
		return positiveLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveDouble() {
		return positiveDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeInt() {
		return nonNegativeIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeLong() {
		return nonNegativeLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeDouble() {
		return nonNegativeDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

		iNamedEClass = createEClass(INAMED);
		createEAttribute(iNamedEClass, INAMED__NAME);

		iReferableEClass = createEClass(IREFERABLE);
		createEAttribute(iReferableEClass, IREFERABLE__UNIQUE_NAME);
		createEOperation(iReferableEClass, IREFERABLE___GET_NAME_PREFIX);
		createEOperation(iReferableEClass, IREFERABLE___ENCODE__STRING);
		createEOperation(iReferableEClass, IREFERABLE___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		iDisplayNameEClass = createEClass(IDISPLAY_NAME);
		createEAttribute(iDisplayNameEClass, IDISPLAY_NAME__DISPLAY_NAME);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__TAG_TYPE);
		createEReference(tagEClass, TAG__TAGGED_OBJECTS);

		classifierEClass = createEClass(CLASSIFIER);
		createEAttribute(classifierEClass, CLASSIFIER__DESCRIPTION);

		coreClassifierEClass = createEClass(CORE_CLASSIFIER);

		memoryClassifierEClass = createEClass(MEMORY_CLASSIFIER);

		transmissionPolicyEClass = createEClass(TRANSMISSION_POLICY);
		createEReference(transmissionPolicyEClass, TRANSMISSION_POLICY__CHUNK_SIZE);
		createEAttribute(transmissionPolicyEClass, TRANSMISSION_POLICY__CHUNK_PROCESSING_TICKS);
		createEAttribute(transmissionPolicyEClass, TRANSMISSION_POLICY__TRANSMIT_RATIO);

		quantityEClass = createEClass(QUANTITY);

		timeComparableEClass = createEClass(TIME_COMPARABLE);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__VALUE);
		createEAttribute(timeEClass, TIME__UNIT);
		createEOperation(timeEClass, TIME___TO_STRING);
		createEOperation(timeEClass, TIME___COMPARE_TO__TIME);
		createEOperation(timeEClass, TIME___ADJUST_UNIT);
		createEOperation(timeEClass, TIME___ADD__TIME);
		createEOperation(timeEClass, TIME___SUBTRACT__TIME);
		createEOperation(timeEClass, TIME___MULTIPLY__LONG);
		createEOperation(timeEClass, TIME___MULTIPLY__DOUBLE);
		createEOperation(timeEClass, TIME___DIVIDE__TIME);

		frequencyEClass = createEClass(FREQUENCY);
		createEAttribute(frequencyEClass, FREQUENCY__VALUE);
		createEAttribute(frequencyEClass, FREQUENCY__UNIT);
		createEOperation(frequencyEClass, FREQUENCY___TO_STRING);

		voltageEClass = createEClass(VOLTAGE);
		createEAttribute(voltageEClass, VOLTAGE__VALUE);
		createEAttribute(voltageEClass, VOLTAGE__UNIT);
		createEOperation(voltageEClass, VOLTAGE___TO_STRING);

		dataSizeEClass = createEClass(DATA_SIZE);
		createEAttribute(dataSizeEClass, DATA_SIZE__VALUE);
		createEAttribute(dataSizeEClass, DATA_SIZE__UNIT);
		createEOperation(dataSizeEClass, DATA_SIZE___TO_STRING);
		createEOperation(dataSizeEClass, DATA_SIZE___GET_NUMBER_BITS);
		createEOperation(dataSizeEClass, DATA_SIZE___GET_NUMBER_BYTES);

		dataRateComparableEClass = createEClass(DATA_RATE_COMPARABLE);

		dataRateEClass = createEClass(DATA_RATE);
		createEAttribute(dataRateEClass, DATA_RATE__VALUE);
		createEAttribute(dataRateEClass, DATA_RATE__UNIT);
		createEOperation(dataRateEClass, DATA_RATE___TO_STRING);
		createEOperation(dataRateEClass, DATA_RATE___COMPARE_TO__DATARATE);

		customPropertyEClass = createEClass(CUSTOM_PROPERTY);
		createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__KEY);
		createEReference(customPropertyEClass, CUSTOM_PROPERTY__VALUE);

		valueEClass = createEClass(VALUE);

		listObjectEClass = createEClass(LIST_OBJECT);
		createEReference(listObjectEClass, LIST_OBJECT__VALUES);

		stringObjectEClass = createEClass(STRING_OBJECT);
		createEAttribute(stringObjectEClass, STRING_OBJECT__VALUE);

		bigIntegerObjectEClass = createEClass(BIG_INTEGER_OBJECT);
		createEAttribute(bigIntegerObjectEClass, BIG_INTEGER_OBJECT__VALUE);

		referenceObjectEClass = createEClass(REFERENCE_OBJECT);
		createEReference(referenceObjectEClass, REFERENCE_OBJECT__VALUE);

		integerObjectEClass = createEClass(INTEGER_OBJECT);
		createEAttribute(integerObjectEClass, INTEGER_OBJECT__VALUE);

		longObjectEClass = createEClass(LONG_OBJECT);
		createEAttribute(longObjectEClass, LONG_OBJECT__VALUE);

		floatObjectEClass = createEClass(FLOAT_OBJECT);
		createEAttribute(floatObjectEClass, FLOAT_OBJECT__VALUE);

		doubleObjectEClass = createEClass(DOUBLE_OBJECT);
		createEAttribute(doubleObjectEClass, DOUBLE_OBJECT__VALUE);

		booleanObjectEClass = createEClass(BOOLEAN_OBJECT);
		createEAttribute(booleanObjectEClass, BOOLEAN_OBJECT__VALUE);

		numericStatisticEClass = createEClass(NUMERIC_STATISTIC);

		minAvgMaxStatisticEClass = createEClass(MIN_AVG_MAX_STATISTIC);
		createEAttribute(minAvgMaxStatisticEClass, MIN_AVG_MAX_STATISTIC__MIN);
		createEAttribute(minAvgMaxStatisticEClass, MIN_AVG_MAX_STATISTIC__AVG);
		createEAttribute(minAvgMaxStatisticEClass, MIN_AVG_MAX_STATISTIC__MAX);
		createEOperation(minAvgMaxStatisticEClass, MIN_AVG_MAX_STATISTIC___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		singleValueStatisticEClass = createEClass(SINGLE_VALUE_STATISTIC);
		createEAttribute(singleValueStatisticEClass, SINGLE_VALUE_STATISTIC__VALUE);

		iTimeDeviationEClass = createEClass(ITIME_DEVIATION);
		createEOperation(iTimeDeviationEClass, ITIME_DEVIATION___GET_LOWER_BOUND);
		createEOperation(iTimeDeviationEClass, ITIME_DEVIATION___GET_UPPER_BOUND);
		createEOperation(iTimeDeviationEClass, ITIME_DEVIATION___GET_AVERAGE);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEReference(timeIntervalEClass, TIME_INTERVAL__LOWER_BOUND);
		createEReference(timeIntervalEClass, TIME_INTERVAL__UPPER_BOUND);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___GET_AVERAGE);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		timeConstantEClass = createEClass(TIME_CONSTANT);
		createEReference(timeConstantEClass, TIME_CONSTANT__VALUE);
		createEOperation(timeConstantEClass, TIME_CONSTANT___GET_LOWER_BOUND);
		createEOperation(timeConstantEClass, TIME_CONSTANT___GET_UPPER_BOUND);
		createEOperation(timeConstantEClass, TIME_CONSTANT___GET_AVERAGE);

		timeHistogramEClass = createEClass(TIME_HISTOGRAM);
		createEReference(timeHistogramEClass, TIME_HISTOGRAM__ENTRIES);
		createEOperation(timeHistogramEClass, TIME_HISTOGRAM___GET_LOWER_BOUND);
		createEOperation(timeHistogramEClass, TIME_HISTOGRAM___GET_UPPER_BOUND);
		createEOperation(timeHistogramEClass, TIME_HISTOGRAM___GET_AVERAGE);

		timeHistogramEntryEClass = createEClass(TIME_HISTOGRAM_ENTRY);
		createEAttribute(timeHistogramEntryEClass, TIME_HISTOGRAM_ENTRY__OCCURRENCES);

		boundedTimeDistributionEClass = createEClass(BOUNDED_TIME_DISTRIBUTION);

		truncatedTimeDistributionEClass = createEClass(TRUNCATED_TIME_DISTRIBUTION);
		createEReference(truncatedTimeDistributionEClass, TRUNCATED_TIME_DISTRIBUTION__LOWER_BOUND);
		createEReference(truncatedTimeDistributionEClass, TRUNCATED_TIME_DISTRIBUTION__UPPER_BOUND);
		createEOperation(truncatedTimeDistributionEClass, TRUNCATED_TIME_DISTRIBUTION___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		timeBoundariesEClass = createEClass(TIME_BOUNDARIES);
		createEAttribute(timeBoundariesEClass, TIME_BOUNDARIES__SAMPLING_TYPE);

		timeStatisticsEClass = createEClass(TIME_STATISTICS);
		createEReference(timeStatisticsEClass, TIME_STATISTICS__AVERAGE);

		timeUniformDistributionEClass = createEClass(TIME_UNIFORM_DISTRIBUTION);

		timeGaussDistributionEClass = createEClass(TIME_GAUSS_DISTRIBUTION);
		createEReference(timeGaussDistributionEClass, TIME_GAUSS_DISTRIBUTION__MEAN);
		createEReference(timeGaussDistributionEClass, TIME_GAUSS_DISTRIBUTION__SD);
		createEOperation(timeGaussDistributionEClass, TIME_GAUSS_DISTRIBUTION___GET_AVERAGE);

		timeWeibullEstimatorsDistributionEClass = createEClass(TIME_WEIBULL_ESTIMATORS_DISTRIBUTION);
		createEReference(timeWeibullEstimatorsDistributionEClass, TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE);
		createEAttribute(timeWeibullEstimatorsDistributionEClass, TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE);

		timeBetaDistributionEClass = createEClass(TIME_BETA_DISTRIBUTION);
		createEAttribute(timeBetaDistributionEClass, TIME_BETA_DISTRIBUTION__ALPHA);
		createEAttribute(timeBetaDistributionEClass, TIME_BETA_DISTRIBUTION__BETA);
		createEOperation(timeBetaDistributionEClass, TIME_BETA_DISTRIBUTION___GET_AVERAGE);

		iDiscreteValueDeviationEClass = createEClass(IDISCRETE_VALUE_DEVIATION);
		createEOperation(iDiscreteValueDeviationEClass, IDISCRETE_VALUE_DEVIATION___GET_LOWER_BOUND);
		createEOperation(iDiscreteValueDeviationEClass, IDISCRETE_VALUE_DEVIATION___GET_UPPER_BOUND);
		createEOperation(iDiscreteValueDeviationEClass, IDISCRETE_VALUE_DEVIATION___GET_AVERAGE);

		discreteValueIntervalEClass = createEClass(DISCRETE_VALUE_INTERVAL);
		createEAttribute(discreteValueIntervalEClass, DISCRETE_VALUE_INTERVAL__LOWER_BOUND);
		createEAttribute(discreteValueIntervalEClass, DISCRETE_VALUE_INTERVAL__UPPER_BOUND);
		createEOperation(discreteValueIntervalEClass, DISCRETE_VALUE_INTERVAL___GET_AVERAGE);
		createEOperation(discreteValueIntervalEClass, DISCRETE_VALUE_INTERVAL___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		discreteValueConstantEClass = createEClass(DISCRETE_VALUE_CONSTANT);
		createEAttribute(discreteValueConstantEClass, DISCRETE_VALUE_CONSTANT__VALUE);
		createEOperation(discreteValueConstantEClass, DISCRETE_VALUE_CONSTANT___GET_LOWER_BOUND);
		createEOperation(discreteValueConstantEClass, DISCRETE_VALUE_CONSTANT___GET_UPPER_BOUND);
		createEOperation(discreteValueConstantEClass, DISCRETE_VALUE_CONSTANT___GET_AVERAGE);

		discreteValueHistogramEClass = createEClass(DISCRETE_VALUE_HISTOGRAM);
		createEReference(discreteValueHistogramEClass, DISCRETE_VALUE_HISTOGRAM__ENTRIES);
		createEOperation(discreteValueHistogramEClass, DISCRETE_VALUE_HISTOGRAM___GET_LOWER_BOUND);
		createEOperation(discreteValueHistogramEClass, DISCRETE_VALUE_HISTOGRAM___GET_UPPER_BOUND);
		createEOperation(discreteValueHistogramEClass, DISCRETE_VALUE_HISTOGRAM___GET_AVERAGE);

		discreteValueHistogramEntryEClass = createEClass(DISCRETE_VALUE_HISTOGRAM_ENTRY);
		createEAttribute(discreteValueHistogramEntryEClass, DISCRETE_VALUE_HISTOGRAM_ENTRY__OCCURRENCES);

		boundedDiscreteValueDistributionEClass = createEClass(BOUNDED_DISCRETE_VALUE_DISTRIBUTION);

		truncatedDiscreteValueDistributionEClass = createEClass(TRUNCATED_DISCRETE_VALUE_DISTRIBUTION);
		createEAttribute(truncatedDiscreteValueDistributionEClass, TRUNCATED_DISCRETE_VALUE_DISTRIBUTION__LOWER_BOUND);
		createEAttribute(truncatedDiscreteValueDistributionEClass, TRUNCATED_DISCRETE_VALUE_DISTRIBUTION__UPPER_BOUND);
		createEOperation(truncatedDiscreteValueDistributionEClass, TRUNCATED_DISCRETE_VALUE_DISTRIBUTION___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		discreteValueBoundariesEClass = createEClass(DISCRETE_VALUE_BOUNDARIES);
		createEAttribute(discreteValueBoundariesEClass, DISCRETE_VALUE_BOUNDARIES__SAMPLING_TYPE);

		discreteValueStatisticsEClass = createEClass(DISCRETE_VALUE_STATISTICS);
		createEAttribute(discreteValueStatisticsEClass, DISCRETE_VALUE_STATISTICS__AVERAGE);

		discreteValueUniformDistributionEClass = createEClass(DISCRETE_VALUE_UNIFORM_DISTRIBUTION);

		discreteValueGaussDistributionEClass = createEClass(DISCRETE_VALUE_GAUSS_DISTRIBUTION);
		createEAttribute(discreteValueGaussDistributionEClass, DISCRETE_VALUE_GAUSS_DISTRIBUTION__MEAN);
		createEAttribute(discreteValueGaussDistributionEClass, DISCRETE_VALUE_GAUSS_DISTRIBUTION__SD);
		createEOperation(discreteValueGaussDistributionEClass, DISCRETE_VALUE_GAUSS_DISTRIBUTION___GET_AVERAGE);

		discreteValueWeibullEstimatorsDistributionEClass = createEClass(DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION);
		createEAttribute(discreteValueWeibullEstimatorsDistributionEClass, DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE);
		createEAttribute(discreteValueWeibullEstimatorsDistributionEClass, DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE);

		discreteValueBetaDistributionEClass = createEClass(DISCRETE_VALUE_BETA_DISTRIBUTION);
		createEAttribute(discreteValueBetaDistributionEClass, DISCRETE_VALUE_BETA_DISTRIBUTION__ALPHA);
		createEAttribute(discreteValueBetaDistributionEClass, DISCRETE_VALUE_BETA_DISTRIBUTION__BETA);
		createEOperation(discreteValueBetaDistributionEClass, DISCRETE_VALUE_BETA_DISTRIBUTION___GET_AVERAGE);

		iContinuousValueDeviationEClass = createEClass(ICONTINUOUS_VALUE_DEVIATION);
		createEOperation(iContinuousValueDeviationEClass, ICONTINUOUS_VALUE_DEVIATION___GET_LOWER_BOUND);
		createEOperation(iContinuousValueDeviationEClass, ICONTINUOUS_VALUE_DEVIATION___GET_UPPER_BOUND);
		createEOperation(iContinuousValueDeviationEClass, ICONTINUOUS_VALUE_DEVIATION___GET_AVERAGE);

		continuousValueIntervalEClass = createEClass(CONTINUOUS_VALUE_INTERVAL);
		createEAttribute(continuousValueIntervalEClass, CONTINUOUS_VALUE_INTERVAL__LOWER_BOUND);
		createEAttribute(continuousValueIntervalEClass, CONTINUOUS_VALUE_INTERVAL__UPPER_BOUND);
		createEOperation(continuousValueIntervalEClass, CONTINUOUS_VALUE_INTERVAL___GET_AVERAGE);
		createEOperation(continuousValueIntervalEClass, CONTINUOUS_VALUE_INTERVAL___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		continuousValueConstantEClass = createEClass(CONTINUOUS_VALUE_CONSTANT);
		createEAttribute(continuousValueConstantEClass, CONTINUOUS_VALUE_CONSTANT__VALUE);
		createEOperation(continuousValueConstantEClass, CONTINUOUS_VALUE_CONSTANT___GET_LOWER_BOUND);
		createEOperation(continuousValueConstantEClass, CONTINUOUS_VALUE_CONSTANT___GET_UPPER_BOUND);
		createEOperation(continuousValueConstantEClass, CONTINUOUS_VALUE_CONSTANT___GET_AVERAGE);

		continuousValueHistogramEClass = createEClass(CONTINUOUS_VALUE_HISTOGRAM);
		createEReference(continuousValueHistogramEClass, CONTINUOUS_VALUE_HISTOGRAM__ENTRIES);
		createEOperation(continuousValueHistogramEClass, CONTINUOUS_VALUE_HISTOGRAM___GET_LOWER_BOUND);
		createEOperation(continuousValueHistogramEClass, CONTINUOUS_VALUE_HISTOGRAM___GET_UPPER_BOUND);
		createEOperation(continuousValueHistogramEClass, CONTINUOUS_VALUE_HISTOGRAM___GET_AVERAGE);

		continuousValueHistogramEntryEClass = createEClass(CONTINUOUS_VALUE_HISTOGRAM_ENTRY);
		createEAttribute(continuousValueHistogramEntryEClass, CONTINUOUS_VALUE_HISTOGRAM_ENTRY__OCCURRENCES);

		boundedContinuousValueDistributionEClass = createEClass(BOUNDED_CONTINUOUS_VALUE_DISTRIBUTION);

		truncatedContinuousValueDistributionEClass = createEClass(TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION);
		createEAttribute(truncatedContinuousValueDistributionEClass, TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION__LOWER_BOUND);
		createEAttribute(truncatedContinuousValueDistributionEClass, TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION__UPPER_BOUND);
		createEOperation(truncatedContinuousValueDistributionEClass, TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		continuousValueBoundariesEClass = createEClass(CONTINUOUS_VALUE_BOUNDARIES);
		createEAttribute(continuousValueBoundariesEClass, CONTINUOUS_VALUE_BOUNDARIES__SAMPLING_TYPE);

		continuousValueStatisticsEClass = createEClass(CONTINUOUS_VALUE_STATISTICS);
		createEAttribute(continuousValueStatisticsEClass, CONTINUOUS_VALUE_STATISTICS__AVERAGE);

		continuousValueUniformDistributionEClass = createEClass(CONTINUOUS_VALUE_UNIFORM_DISTRIBUTION);

		continuousValueGaussDistributionEClass = createEClass(CONTINUOUS_VALUE_GAUSS_DISTRIBUTION);
		createEAttribute(continuousValueGaussDistributionEClass, CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__MEAN);
		createEAttribute(continuousValueGaussDistributionEClass, CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__SD);
		createEOperation(continuousValueGaussDistributionEClass, CONTINUOUS_VALUE_GAUSS_DISTRIBUTION___GET_AVERAGE);

		continuousValueWeibullEstimatorsDistributionEClass = createEClass(CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION);
		createEAttribute(continuousValueWeibullEstimatorsDistributionEClass, CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE);
		createEAttribute(continuousValueWeibullEstimatorsDistributionEClass, CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE);

		continuousValueBetaDistributionEClass = createEClass(CONTINUOUS_VALUE_BETA_DISTRIBUTION);
		createEAttribute(continuousValueBetaDistributionEClass, CONTINUOUS_VALUE_BETA_DISTRIBUTION__ALPHA);
		createEAttribute(continuousValueBetaDistributionEClass, CONTINUOUS_VALUE_BETA_DISTRIBUTION__BETA);
		createEOperation(continuousValueBetaDistributionEClass, CONTINUOUS_VALUE_BETA_DISTRIBUTION___GET_AVERAGE);

		modeEClass = createEClass(MODE);

		numericModeEClass = createEClass(NUMERIC_MODE);

		enumModeEClass = createEClass(ENUM_MODE);
		createEReference(enumModeEClass, ENUM_MODE__LITERALS);
		createEOperation(enumModeEClass, ENUM_MODE___GET_LITERAL__STRING);

		modeLiteralEClass = createEClass(MODE_LITERAL);
		createEReference(modeLiteralEClass, MODE_LITERAL__CONTAINING_MODE);
		createEOperation(modeLiteralEClass, MODE_LITERAL___GET_NAME_PREFIX);
		createEOperation(modeLiteralEClass, MODE_LITERAL___TO_STRING);

		componentsModelEClass = createEClass(COMPONENTS_MODEL);
		createEReference(componentsModelEClass, COMPONENTS_MODEL__COMPONENTS);
		createEReference(componentsModelEClass, COMPONENTS_MODEL__SYSTEMS);

		iSystemEClass = createEClass(ISYSTEM);
		createEReference(iSystemEClass, ISYSTEM__COMPONENT_INSTANCES);
		createEReference(iSystemEClass, ISYSTEM__CONNECTORS);
		createEReference(iSystemEClass, ISYSTEM__GROUNDED_PORTS);
		createEReference(iSystemEClass, ISYSTEM__INNER_PORTS);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__CONTAINING_COMPONENT);
		createEOperation(portEClass, PORT___GET_NAME_PREFIX);

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

		interfacePortEClass = createEClass(INTERFACE_PORT);
		createEAttribute(interfacePortEClass, INTERFACE_PORT__INTERFACE_NAME);
		createEAttribute(interfacePortEClass, INTERFACE_PORT__KIND);

		configModelEClass = createEClass(CONFIG_MODEL);
		createEReference(configModelEClass, CONFIG_MODEL__EVENTS_TO_TRACE);

		eventConfigEClass = createEClass(EVENT_CONFIG);
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
		createEReference(processEventEClass, PROCESS_EVENT__PROCESSING_UNIT);

		processChainEventEClass = createEClass(PROCESS_CHAIN_EVENT);
		createEAttribute(processChainEventEClass, PROCESS_CHAIN_EVENT__EVENT_TYPE);
		createEReference(processChainEventEClass, PROCESS_CHAIN_EVENT__ENTITY);
		createEReference(processChainEventEClass, PROCESS_CHAIN_EVENT__PROCESSING_UNIT);

		runnableEventEClass = createEClass(RUNNABLE_EVENT);
		createEAttribute(runnableEventEClass, RUNNABLE_EVENT__EVENT_TYPE);
		createEReference(runnableEventEClass, RUNNABLE_EVENT__ENTITY);
		createEReference(runnableEventEClass, RUNNABLE_EVENT__PROCESS);
		createEReference(runnableEventEClass, RUNNABLE_EVENT__PROCESSING_UNIT);

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
		createEReference(semaphoreEventEClass, SEMAPHORE_EVENT__PROCESSING_UNIT);

		componentEventEClass = createEClass(COMPONENT_EVENT);
		createEAttribute(componentEventEClass, COMPONENT_EVENT__EVENT_TYPE);
		createEReference(componentEventEClass, COMPONENT_EVENT__ENTITY);

		hwModelEClass = createEClass(HW_MODEL);
		createEReference(hwModelEClass, HW_MODEL__DEFINITIONS);
		createEReference(hwModelEClass, HW_MODEL__FEATURE_CATEGORIES);
		createEReference(hwModelEClass, HW_MODEL__STRUCTURES);
		createEReference(hwModelEClass, HW_MODEL__DOMAINS);

		hwStructureEClass = createEClass(HW_STRUCTURE);
		createEAttribute(hwStructureEClass, HW_STRUCTURE__STRUCTURE_TYPE);
		createEReference(hwStructureEClass, HW_STRUCTURE__PORTS);
		createEReference(hwStructureEClass, HW_STRUCTURE__STRUCTURES);
		createEReference(hwStructureEClass, HW_STRUCTURE__MODULES);
		createEReference(hwStructureEClass, HW_STRUCTURE__CONNECTIONS);
		createEReference(hwStructureEClass, HW_STRUCTURE__INNER_PORTS);

		hwModuleEClass = createEClass(HW_MODULE);
		createEReference(hwModuleEClass, HW_MODULE__PORTS);
		createEReference(hwModuleEClass, HW_MODULE__POWER_DOMAIN);
		createEReference(hwModuleEClass, HW_MODULE__FREQUENCY_DOMAIN);

		hwDomainEClass = createEClass(HW_DOMAIN);

		frequencyDomainEClass = createEClass(FREQUENCY_DOMAIN);
		createEReference(frequencyDomainEClass, FREQUENCY_DOMAIN__DEFAULT_VALUE);
		createEAttribute(frequencyDomainEClass, FREQUENCY_DOMAIN__CLOCK_GATING);

		powerDomainEClass = createEClass(POWER_DOMAIN);
		createEReference(powerDomainEClass, POWER_DOMAIN__DEFAULT_VALUE);
		createEAttribute(powerDomainEClass, POWER_DOMAIN__POWER_GATING);

		processingUnitEClass = createEClass(PROCESSING_UNIT);
		createEReference(processingUnitEClass, PROCESSING_UNIT__DEFINITION);
		createEReference(processingUnitEClass, PROCESSING_UNIT__ACCESS_ELEMENTS);
		createEReference(processingUnitEClass, PROCESSING_UNIT__CACHES);

		memoryEClass = createEClass(MEMORY);
		createEReference(memoryEClass, MEMORY__DEFINITION);
		createEReference(memoryEClass, MEMORY__MAPPINGS);

		cacheEClass = createEClass(CACHE);
		createEReference(cacheEClass, CACHE__DEFINITION);

		hwFeatureCategoryEClass = createEClass(HW_FEATURE_CATEGORY);
		createEAttribute(hwFeatureCategoryEClass, HW_FEATURE_CATEGORY__FEATURE_TYPE);
		createEAttribute(hwFeatureCategoryEClass, HW_FEATURE_CATEGORY__DESCRIPTION);
		createEReference(hwFeatureCategoryEClass, HW_FEATURE_CATEGORY__FEATURES);

		hwFeatureEClass = createEClass(HW_FEATURE);
		createEReference(hwFeatureEClass, HW_FEATURE__CONTAINING_CATEGORY);
		createEAttribute(hwFeatureEClass, HW_FEATURE__VALUE);
		createEOperation(hwFeatureEClass, HW_FEATURE___GET_NAME_PREFIX);
		createEOperation(hwFeatureEClass, HW_FEATURE___TO_STRING);

		hwPortEClass = createEClass(HW_PORT);
		createEAttribute(hwPortEClass, HW_PORT__BIT_WIDTH);
		createEAttribute(hwPortEClass, HW_PORT__PRIORITY);
		createEAttribute(hwPortEClass, HW_PORT__PORT_TYPE);
		createEAttribute(hwPortEClass, HW_PORT__PORT_INTERFACE);
		createEAttribute(hwPortEClass, HW_PORT__DELEGATED);
		createEReference(hwPortEClass, HW_PORT__CONNECTIONS);
		createEOperation(hwPortEClass, HW_PORT___GET_NAME_PREFIX);

		connectionHandlerEClass = createEClass(CONNECTION_HANDLER);
		createEReference(connectionHandlerEClass, CONNECTION_HANDLER__DEFINITION);
		createEReference(connectionHandlerEClass, CONNECTION_HANDLER__INTERNAL_CONNECTIONS);

		hwConnectionEClass = createEClass(HW_CONNECTION);
		createEReference(hwConnectionEClass, HW_CONNECTION__READ_LATENCY);
		createEReference(hwConnectionEClass, HW_CONNECTION__WRITE_LATENCY);
		createEReference(hwConnectionEClass, HW_CONNECTION__DATA_RATE);
		createEReference(hwConnectionEClass, HW_CONNECTION__PORT1);
		createEReference(hwConnectionEClass, HW_CONNECTION__PORT2);
		createEAttribute(hwConnectionEClass, HW_CONNECTION__INTERNAL);
		createEOperation(hwConnectionEClass, HW_CONNECTION___GET_NAME_PREFIX);
		createEOperation(hwConnectionEClass, HW_CONNECTION___GET_PORTS);

		hwAccessElementEClass = createEClass(HW_ACCESS_ELEMENT);
		createEReference(hwAccessElementEClass, HW_ACCESS_ELEMENT__SOURCE);
		createEReference(hwAccessElementEClass, HW_ACCESS_ELEMENT__DESTINATION);
		createEReference(hwAccessElementEClass, HW_ACCESS_ELEMENT__ACCESS_PATH);
		createEReference(hwAccessElementEClass, HW_ACCESS_ELEMENT__READ_LATENCY);
		createEReference(hwAccessElementEClass, HW_ACCESS_ELEMENT__WRITE_LATENCY);
		createEReference(hwAccessElementEClass, HW_ACCESS_ELEMENT__DATA_RATE);

		hwDefinitionEClass = createEClass(HW_DEFINITION);

		processingUnitDefinitionEClass = createEClass(PROCESSING_UNIT_DEFINITION);
		createEAttribute(processingUnitDefinitionEClass, PROCESSING_UNIT_DEFINITION__PU_TYPE);
		createEReference(processingUnitDefinitionEClass, PROCESSING_UNIT_DEFINITION__FEATURES);
		createEReference(processingUnitDefinitionEClass, PROCESSING_UNIT_DEFINITION__CLASSIFIERS);

		connectionHandlerDefinitionEClass = createEClass(CONNECTION_HANDLER_DEFINITION);
		createEAttribute(connectionHandlerDefinitionEClass, CONNECTION_HANDLER_DEFINITION__POLICY);
		createEReference(connectionHandlerDefinitionEClass, CONNECTION_HANDLER_DEFINITION__READ_LATENCY);
		createEReference(connectionHandlerDefinitionEClass, CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY);
		createEReference(connectionHandlerDefinitionEClass, CONNECTION_HANDLER_DEFINITION__DATA_RATE);
		createEAttribute(connectionHandlerDefinitionEClass, CONNECTION_HANDLER_DEFINITION__MAX_BURST_SIZE);
		createEAttribute(connectionHandlerDefinitionEClass, CONNECTION_HANDLER_DEFINITION__MAX_CONCURRENT_TRANSFERS);

		memoryDefinitionEClass = createEClass(MEMORY_DEFINITION);
		createEReference(memoryDefinitionEClass, MEMORY_DEFINITION__SIZE);
		createEReference(memoryDefinitionEClass, MEMORY_DEFINITION__ACCESS_LATENCY);
		createEReference(memoryDefinitionEClass, MEMORY_DEFINITION__DATA_RATE);
		createEAttribute(memoryDefinitionEClass, MEMORY_DEFINITION__MEMORY_TYPE);
		createEReference(memoryDefinitionEClass, MEMORY_DEFINITION__CLASSIFIERS);

		cacheDefinitionEClass = createEClass(CACHE_DEFINITION);
		createEReference(cacheDefinitionEClass, CACHE_DEFINITION__SIZE);
		createEReference(cacheDefinitionEClass, CACHE_DEFINITION__LINE_SIZE);
		createEReference(cacheDefinitionEClass, CACHE_DEFINITION__ACCESS_LATENCY);
		createEAttribute(cacheDefinitionEClass, CACHE_DEFINITION__CACHE_TYPE);
		createEAttribute(cacheDefinitionEClass, CACHE_DEFINITION__WRITE_STRATEGY);
		createEAttribute(cacheDefinitionEClass, CACHE_DEFINITION__NWAYS);
		createEAttribute(cacheDefinitionEClass, CACHE_DEFINITION__COHERENCY);
		createEAttribute(cacheDefinitionEClass, CACHE_DEFINITION__EXCLUSIVE);
		createEAttribute(cacheDefinitionEClass, CACHE_DEFINITION__HIT_RATE);

		hwPathEClass = createEClass(HW_PATH);
		createEReference(hwPathEClass, HW_PATH__SOURCE);
		createEReference(hwPathEClass, HW_PATH__DESTINATION);
		createEOperation(hwPathEClass, HW_PATH___GET_CONTAINING_ACCESS_ELEMENT);

		hwAccessPathEClass = createEClass(HW_ACCESS_PATH);
		createEReference(hwAccessPathEClass, HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT);
		createEReference(hwAccessPathEClass, HW_ACCESS_PATH__PATH_ELEMENTS);
		createEAttribute(hwAccessPathEClass, HW_ACCESS_PATH__START_ADDRESS);
		createEAttribute(hwAccessPathEClass, HW_ACCESS_PATH__END_ADDRESS);
		createEAttribute(hwAccessPathEClass, HW_ACCESS_PATH__MEM_OFFSET);

		hwPathElementEClass = createEClass(HW_PATH_ELEMENT);
		createEOperation(hwPathElementEClass, HW_PATH_ELEMENT___GET_PORTS);

		hwDestinationEClass = createEClass(HW_DESTINATION);
		createEOperation(hwDestinationEClass, HW_DESTINATION___GET_PORTS);

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
		createEReference(schedulerAllocationEClass, SCHEDULER_ALLOCATION__EXECUTING_PU);

		taskAllocationEClass = createEClass(TASK_ALLOCATION);
		createEReference(taskAllocationEClass, TASK_ALLOCATION__TASK);
		createEReference(taskAllocationEClass, TASK_ALLOCATION__SCHEDULER);
		createEReference(taskAllocationEClass, TASK_ALLOCATION__AFFINITY);
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
		createEReference(semaphoreEClass, SEMAPHORE__REFERRING_COMPONENTS);

		schedulerEClass = createEClass(SCHEDULER);
		createEReference(schedulerEClass, SCHEDULER__COMPUTATION_ITEMS);
		createEReference(schedulerEClass, SCHEDULER__SCHEDULER_ALLOCATIONS);
		createEReference(schedulerEClass, SCHEDULER__RUNNABLE_ALLOCATIONS);
		createEOperation(schedulerEClass, SCHEDULER___GET_SCHEDULING_ALGORITHM);

		taskSchedulerEClass = createEClass(TASK_SCHEDULER);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__SCHEDULING_ALGORITHM);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__PARENT_ASSOCIATION);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__CHILD_ASSOCIATIONS);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__TASK_ALLOCATIONS);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__PARENT_SCHEDULER);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__CHILD_SCHEDULERS);

		schedulerAssociationEClass = createEClass(SCHEDULER_ASSOCIATION);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__CHILD);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__PARENT);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS);
		createEReference(schedulerAssociationEClass, SCHEDULER_ASSOCIATION__PARAMETER_EXTENSIONS);

		interruptControllerEClass = createEClass(INTERRUPT_CONTROLLER);
		createEReference(interruptControllerEClass, INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM);
		createEReference(interruptControllerEClass, INTERRUPT_CONTROLLER__ISR_ALLOCATIONS);

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
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__OVERHEAD);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__TASK_SCHEDULERS);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__INTERRUPT_CONTROLLERS);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__OS_DATA_CONSISTENCY);

		vendorOperatingSystemEClass = createEClass(VENDOR_OPERATING_SYSTEM);
		createEAttribute(vendorOperatingSystemEClass, VENDOR_OPERATING_SYSTEM__OS_NAME);
		createEAttribute(vendorOperatingSystemEClass, VENDOR_OPERATING_SYSTEM__VENDOR);
		createEAttribute(vendorOperatingSystemEClass, VENDOR_OPERATING_SYSTEM__VERSION);

		osOverheadEClass = createEClass(OS_OVERHEAD);
		createEReference(osOverheadEClass, OS_OVERHEAD__API_OVERHEAD);
		createEReference(osOverheadEClass, OS_OVERHEAD__ISR_CATEGORY1_OVERHEAD);
		createEReference(osOverheadEClass, OS_OVERHEAD__ISR_CATEGORY2_OVERHEAD);

		osAPIOverheadEClass = createEClass(OS_API_OVERHEAD);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_SEND_MESSAGE);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_TERMINATE_TASK);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_SCHEDULE);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_REQUEST_RESOURCE);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_RELEASE_RESOURCE);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_SET_EVENT);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_WAIT_EVENT);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_CLEAR_EVENT);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_ACTIVATE_TASK);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_ENFORCED_MIGRATION);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_REQUEST_SPINLOCK);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_RELEASE_SPINLOCK);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_SENDER_RECEIVER_READ);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_IOC_READ);
		createEReference(osAPIOverheadEClass, OS_API_OVERHEAD__API_IOC_WRITE);

		osISROverheadEClass = createEClass(OS_ISR_OVERHEAD);
		createEReference(osISROverheadEClass, OS_ISR_OVERHEAD__PRE_EXECUTION_OVERHEAD);
		createEReference(osISROverheadEClass, OS_ISR_OVERHEAD__POST_EXECUTION_OVERHEAD);

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
		createEReference(stimulusEClass, STIMULUS__SET_MODE_VALUE_LIST);
		createEReference(stimulusEClass, STIMULUS__EXECUTION_CONDITION);
		createEReference(stimulusEClass, STIMULUS__AFFECTED_PROCESSES);

		modeValueListEClass = createEClass(MODE_VALUE_LIST);
		createEReference(modeValueListEClass, MODE_VALUE_LIST__ENTRIES);

		modeValueMapEntryEClass = createEClass(MODE_VALUE_MAP_ENTRY);
		createEReference(modeValueMapEntryEClass, MODE_VALUE_MAP_ENTRY__KEY);
		createEAttribute(modeValueMapEntryEClass, MODE_VALUE_MAP_ENTRY__VALUE);

		modeValueEClass = createEClass(MODE_VALUE);
		createEReference(modeValueEClass, MODE_VALUE__LABEL);
		createEAttribute(modeValueEClass, MODE_VALUE__VALUE);
		createEOperation(modeValueEClass, MODE_VALUE___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(modeValueEClass, MODE_VALUE___GET_LITERAL);
		createEOperation(modeValueEClass, MODE_VALUE___GET_INTEGER);

		modeAssignmentEClass = createEClass(MODE_ASSIGNMENT);

		modeConditionDisjunctionEClass = createEClass(MODE_CONDITION_DISJUNCTION);
		createEReference(modeConditionDisjunctionEClass, MODE_CONDITION_DISJUNCTION__ENTRIES);
		createEOperation(modeConditionDisjunctionEClass, MODE_CONDITION_DISJUNCTION___IS_SATISFIED_BY__EMAP);

		modeConditionDisjunctionEntryEClass = createEClass(MODE_CONDITION_DISJUNCTION_ENTRY);
		createEOperation(modeConditionDisjunctionEntryEClass, MODE_CONDITION_DISJUNCTION_ENTRY___IS_SATISFIED_BY__EMAP);

		modeConditionEClass = createEClass(MODE_CONDITION);
		createEAttribute(modeConditionEClass, MODE_CONDITION__RELATION);
		createEOperation(modeConditionEClass, MODE_CONDITION___IS_SATISFIED_BY__EMAP);

		modeConditionConjunctionEClass = createEClass(MODE_CONDITION_CONJUNCTION);
		createEReference(modeConditionConjunctionEClass, MODE_CONDITION_CONJUNCTION__ENTRIES);
		createEOperation(modeConditionConjunctionEClass, MODE_CONDITION_CONJUNCTION___IS_SATISFIED_BY__EMAP);

		fixedPeriodicEClass = createEClass(FIXED_PERIODIC);
		createEReference(fixedPeriodicEClass, FIXED_PERIODIC__OFFSET);
		createEReference(fixedPeriodicEClass, FIXED_PERIODIC__RECURRENCE);

		periodicStimulusEClass = createEClass(PERIODIC_STIMULUS);
		createEReference(periodicStimulusEClass, PERIODIC_STIMULUS__JITTER);
		createEReference(periodicStimulusEClass, PERIODIC_STIMULUS__MIN_DISTANCE);

		relativePeriodicStimulusEClass = createEClass(RELATIVE_PERIODIC_STIMULUS);
		createEReference(relativePeriodicStimulusEClass, RELATIVE_PERIODIC_STIMULUS__OFFSET);
		createEReference(relativePeriodicStimulusEClass, RELATIVE_PERIODIC_STIMULUS__NEXT_OCCURRENCE);

		variableRateStimulusEClass = createEClass(VARIABLE_RATE_STIMULUS);
		createEReference(variableRateStimulusEClass, VARIABLE_RATE_STIMULUS__STEP);
		createEReference(variableRateStimulusEClass, VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP);
		createEAttribute(variableRateStimulusEClass, VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP);
		createEAttribute(variableRateStimulusEClass, VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP);
		createEReference(variableRateStimulusEClass, VARIABLE_RATE_STIMULUS__SCENARIO);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__CLOCK);
		createEAttribute(scenarioEClass, SCENARIO__SAMPLING_OFFSET);
		createEAttribute(scenarioEClass, SCENARIO__SAMPLING_RECURRENCE);

		periodicSyntheticStimulusEClass = createEClass(PERIODIC_SYNTHETIC_STIMULUS);
		createEReference(periodicSyntheticStimulusEClass, PERIODIC_SYNTHETIC_STIMULUS__OCCURRENCE_TIMES);

		customStimulusEClass = createEClass(CUSTOM_STIMULUS);
		createEAttribute(customStimulusEClass, CUSTOM_STIMULUS__DESCRIPTION);

		singleStimulusEClass = createEClass(SINGLE_STIMULUS);
		createEReference(singleStimulusEClass, SINGLE_STIMULUS__OCCURRENCE);

		interProcessStimulusEClass = createEClass(INTER_PROCESS_STIMULUS);
		createEReference(interProcessStimulusEClass, INTER_PROCESS_STIMULUS__COUNTER);
		createEReference(interProcessStimulusEClass, INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS);

		periodicBurstStimulusEClass = createEClass(PERIODIC_BURST_STIMULUS);
		createEReference(periodicBurstStimulusEClass, PERIODIC_BURST_STIMULUS__BURST_LENGTH);
		createEReference(periodicBurstStimulusEClass, PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE);
		createEAttribute(periodicBurstStimulusEClass, PERIODIC_BURST_STIMULUS__OCCURRENCE_COUNT);

		eventStimulusEClass = createEClass(EVENT_STIMULUS);
		createEReference(eventStimulusEClass, EVENT_STIMULUS__TRIGGERING_EVENTS);
		createEReference(eventStimulusEClass, EVENT_STIMULUS__COUNTER);

		arrivalCurveStimulusEClass = createEClass(ARRIVAL_CURVE_STIMULUS);
		createEReference(arrivalCurveStimulusEClass, ARRIVAL_CURVE_STIMULUS__ENTRIES);

		arrivalCurveEntryEClass = createEClass(ARRIVAL_CURVE_ENTRY);
		createEAttribute(arrivalCurveEntryEClass, ARRIVAL_CURVE_ENTRY__NUMBER_OF_OCCURRENCES);
		createEReference(arrivalCurveEntryEClass, ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER);
		createEReference(arrivalCurveEntryEClass, ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER);

		clockEClass = createEClass(CLOCK);

		clockFunctionEClass = createEClass(CLOCK_FUNCTION);
		createEAttribute(clockFunctionEClass, CLOCK_FUNCTION__CURVE_TYPE);
		createEReference(clockFunctionEClass, CLOCK_FUNCTION__PERIOD);
		createEReference(clockFunctionEClass, CLOCK_FUNCTION__PEAK_TO_PEAK);
		createEReference(clockFunctionEClass, CLOCK_FUNCTION__XOFFSET);
		createEReference(clockFunctionEClass, CLOCK_FUNCTION__YOFFSET);

		clockStepListEClass = createEClass(CLOCK_STEP_LIST);
		createEReference(clockStepListEClass, CLOCK_STEP_LIST__ENTRIES);
		createEReference(clockStepListEClass, CLOCK_STEP_LIST__PERIOD);

		clockStepEClass = createEClass(CLOCK_STEP);
		createEReference(clockStepEClass, CLOCK_STEP__FREQUENCY);
		createEReference(clockStepEClass, CLOCK_STEP__TIME);

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
		createEOperation(swModelEClass, SW_MODEL___MODE_LITERAL__STRING_STRING);

		abstractMemoryElementEClass = createEClass(ABSTRACT_MEMORY_ELEMENT);
		createEReference(abstractMemoryElementEClass, ABSTRACT_MEMORY_ELEMENT__SIZE);
		createEReference(abstractMemoryElementEClass, ABSTRACT_MEMORY_ELEMENT__MAPPINGS);

		abstractProcessEClass = createEClass(ABSTRACT_PROCESS);
		createEReference(abstractProcessEClass, ABSTRACT_PROCESS__REFERRING_COMPONENTS);

		customEntityEClass = createEClass(CUSTOM_ENTITY);
		createEAttribute(customEntityEClass, CUSTOM_ENTITY__TYPE_NAME);

		processChainEClass = createEClass(PROCESS_CHAIN);
		createEReference(processChainEClass, PROCESS_CHAIN__PROCESSES);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__CALL_GRAPH);
		createEReference(processEClass, PROCESS__STIMULI);

		iCallGraphItemContainerEClass = createEClass(ICALL_GRAPH_ITEM_CONTAINER);
		createEReference(iCallGraphItemContainerEClass, ICALL_GRAPH_ITEM_CONTAINER__ITEMS);

		callGraphEClass = createEClass(CALL_GRAPH);

		callGraphItemEClass = createEClass(CALL_GRAPH_ITEM);
		createEReference(callGraphItemEClass, CALL_GRAPH_ITEM__CONTAINING_PROCESS);
		createEReference(callGraphItemEClass, CALL_GRAPH_ITEM__CONTAINING_RUNNABLE);

		modeSwitchEClass = createEClass(MODE_SWITCH);
		createEReference(modeSwitchEClass, MODE_SWITCH__ENTRIES);
		createEReference(modeSwitchEClass, MODE_SWITCH__DEFAULT_ENTRY);

		modeSwitchEntryEClass = createEClass(MODE_SWITCH_ENTRY);
		createEReference(modeSwitchEntryEClass, MODE_SWITCH_ENTRY__CONDITION);

		modeSwitchDefaultEClass = createEClass(MODE_SWITCH_DEFAULT);

		probabilitySwitchEClass = createEClass(PROBABILITY_SWITCH);
		createEReference(probabilitySwitchEClass, PROBABILITY_SWITCH__ENTRIES);

		probabilitySwitchEntryEClass = createEClass(PROBABILITY_SWITCH_ENTRY);
		createEAttribute(probabilitySwitchEntryEClass, PROBABILITY_SWITCH_ENTRY__PROBABILITY);

		counterEClass = createEClass(COUNTER);
		createEAttribute(counterEClass, COUNTER__PRESCALER);
		createEAttribute(counterEClass, COUNTER__OFFSET);

		waitEventEClass = createEClass(WAIT_EVENT);
		createEReference(waitEventEClass, WAIT_EVENT__EVENT_MASK);
		createEAttribute(waitEventEClass, WAIT_EVENT__MASK_TYPE);
		createEAttribute(waitEventEClass, WAIT_EVENT__WAITING_BEHAVIOUR);
		createEReference(waitEventEClass, WAIT_EVENT__COUNTER);

		setEventEClass = createEClass(SET_EVENT);
		createEReference(setEventEClass, SET_EVENT__EVENT_MASK);
		createEReference(setEventEClass, SET_EVENT__PROCESS);
		createEReference(setEventEClass, SET_EVENT__COUNTER);

		clearEventEClass = createEClass(CLEAR_EVENT);
		createEReference(clearEventEClass, CLEAR_EVENT__EVENT_MASK);
		createEReference(clearEventEClass, CLEAR_EVENT__COUNTER);

		eventMaskEClass = createEClass(EVENT_MASK);
		createEReference(eventMaskEClass, EVENT_MASK__EVENTS);

		osEventEClass = createEClass(OS_EVENT);
		createEAttribute(osEventEClass, OS_EVENT__COMMUNICATION_OVERHEAD_IN_BIT);
		createEReference(osEventEClass, OS_EVENT__REFERRING_COMPONENTS);

		interProcessTriggerEClass = createEClass(INTER_PROCESS_TRIGGER);
		createEReference(interProcessTriggerEClass, INTER_PROCESS_TRIGGER__STIMULUS);
		createEReference(interProcessTriggerEClass, INTER_PROCESS_TRIGGER__COUNTER);

		enforcedMigrationEClass = createEClass(ENFORCED_MIGRATION);
		createEReference(enforcedMigrationEClass, ENFORCED_MIGRATION__RESOURCE_OWNER);

		schedulePointEClass = createEClass(SCHEDULE_POINT);

		terminateProcessEClass = createEClass(TERMINATE_PROCESS);
		createEReference(terminateProcessEClass, TERMINATE_PROCESS__COUNTER);

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

		dataDependencyEClass = createEClass(DATA_DEPENDENCY);
		createEReference(dataDependencyEClass, DATA_DEPENDENCY__LABELS);
		createEReference(dataDependencyEClass, DATA_DEPENDENCY__PARAMETERS);
		createEReference(dataDependencyEClass, DATA_DEPENDENCY__CALL_ARGUMENTS);
		createEReference(dataDependencyEClass, DATA_DEPENDENCY__CONTAINING_RUNNABLE);

		runnableParameterEClass = createEClass(RUNNABLE_PARAMETER);
		createEReference(runnableParameterEClass, RUNNABLE_PARAMETER__CONTAINING_RUNNABLE);
		createEAttribute(runnableParameterEClass, RUNNABLE_PARAMETER__DIRECTION);
		createEReference(runnableParameterEClass, RUNNABLE_PARAMETER__DATA_TYPE);
		createEReference(runnableParameterEClass, RUNNABLE_PARAMETER__DEPENDS_ON);
		createEOperation(runnableParameterEClass, RUNNABLE_PARAMETER___GET_NAME_PREFIX);
		createEOperation(runnableParameterEClass, RUNNABLE_PARAMETER___TO_STRING);

		runnableEClass = createEClass(RUNNABLE);
		createEReference(runnableEClass, RUNNABLE__EXECUTION_CONDITION);
		createEReference(runnableEClass, RUNNABLE__PARAMETERS);
		createEReference(runnableEClass, RUNNABLE__CALL_GRAPH);
		createEReference(runnableEClass, RUNNABLE__ACTIVATIONS);
		createEAttribute(runnableEClass, RUNNABLE__CALLBACK);
		createEAttribute(runnableEClass, RUNNABLE__SERVICE);
		createEAttribute(runnableEClass, RUNNABLE__ASIL_LEVEL);
		createEReference(runnableEClass, RUNNABLE__SECTION);
		createEReference(runnableEClass, RUNNABLE__RUNNABLE_CALLS);
		createEReference(runnableEClass, RUNNABLE__REFERRING_COMPONENTS);
		createEOperation(runnableEClass, RUNNABLE___GET_RUNNABLE_ITEMS);
		createEOperation(runnableEClass, RUNNABLE___GET_FIRST_ACTIVATION);

		labelEClass = createEClass(LABEL);
		createEReference(labelEClass, LABEL__DATA_TYPE);
		createEAttribute(labelEClass, LABEL__CONSTANT);
		createEAttribute(labelEClass, LABEL__BVOLATILE);
		createEAttribute(labelEClass, LABEL__DATA_STABILITY);
		createEAttribute(labelEClass, LABEL__STABILITY_LEVEL);
		createEReference(labelEClass, LABEL__SECTION);
		createEReference(labelEClass, LABEL__LABEL_ACCESSES);
		createEReference(labelEClass, LABEL__REFERRING_COMPONENTS);

		channelEClass = createEClass(CHANNEL);
		createEReference(channelEClass, CHANNEL__ELEMENT_TYPE);
		createEAttribute(channelEClass, CHANNEL__DEFAULT_ELEMENTS);
		createEAttribute(channelEClass, CHANNEL__MAX_ELEMENTS);
		createEReference(channelEClass, CHANNEL__CHANNEL_ACCESSES);

		modeLabelEClass = createEClass(MODE_LABEL);
		createEReference(modeLabelEClass, MODE_LABEL__MODE);
		createEAttribute(modeLabelEClass, MODE_LABEL__INITIAL_VALUE);
		createEOperation(modeLabelEClass, MODE_LABEL___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(modeLabelEClass, MODE_LABEL___IS_ENUM);
		createEOperation(modeLabelEClass, MODE_LABEL___IS_NUMERIC);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__ASIL_LEVEL);
		createEReference(sectionEClass, SECTION__LABELS);
		createEReference(sectionEClass, SECTION__RUNNABLES);

		computationItemEClass = createEClass(COMPUTATION_ITEM);

		executionNeedEClass = createEClass(EXECUTION_NEED);
		createEReference(executionNeedEClass, EXECUTION_NEED__NEEDS);

		needEntryEClass = createEClass(NEED_ENTRY);
		createEAttribute(needEntryEClass, NEED_ENTRY__KEY);
		createEReference(needEntryEClass, NEED_ENTRY__VALUE);

		ticksEClass = createEClass(TICKS);
		createEReference(ticksEClass, TICKS__DEFAULT);
		createEReference(ticksEClass, TICKS__EXTENDED);

		ticksEntryEClass = createEClass(TICKS_ENTRY);
		createEReference(ticksEntryEClass, TICKS_ENTRY__KEY);
		createEReference(ticksEntryEClass, TICKS_ENTRY__VALUE);

		modeLabelAccessEClass = createEClass(MODE_LABEL_ACCESS);
		createEReference(modeLabelAccessEClass, MODE_LABEL_ACCESS__DATA);
		createEAttribute(modeLabelAccessEClass, MODE_LABEL_ACCESS__ACCESS);
		createEAttribute(modeLabelAccessEClass, MODE_LABEL_ACCESS__VALUE);
		createEAttribute(modeLabelAccessEClass, MODE_LABEL_ACCESS__STEP);
		createEOperation(modeLabelAccessEClass, MODE_LABEL_ACCESS___VALIDATE_INVARIANTS__DIAGNOSTICCHAIN_MAP);

		labelAccessEClass = createEClass(LABEL_ACCESS);
		createEReference(labelAccessEClass, LABEL_ACCESS__DATA);
		createEAttribute(labelAccessEClass, LABEL_ACCESS__ACCESS);
		createEReference(labelAccessEClass, LABEL_ACCESS__STATISTIC);
		createEReference(labelAccessEClass, LABEL_ACCESS__TRANSMISSION_POLICY);
		createEAttribute(labelAccessEClass, LABEL_ACCESS__DATA_STABILITY);
		createEAttribute(labelAccessEClass, LABEL_ACCESS__IMPLEMENTATION);
		createEReference(labelAccessEClass, LABEL_ACCESS__DEPENDS_ON);

		channelAccessEClass = createEClass(CHANNEL_ACCESS);
		createEReference(channelAccessEClass, CHANNEL_ACCESS__DATA);
		createEAttribute(channelAccessEClass, CHANNEL_ACCESS__ELEMENTS);
		createEReference(channelAccessEClass, CHANNEL_ACCESS__TRANSMISSION_POLICY);

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

		senderReceiverCommunicationEClass = createEClass(SENDER_RECEIVER_COMMUNICATION);
		createEAttribute(senderReceiverCommunicationEClass, SENDER_RECEIVER_COMMUNICATION__BUFFERED);
		createEReference(senderReceiverCommunicationEClass, SENDER_RECEIVER_COMMUNICATION__LABEL);
		createEReference(senderReceiverCommunicationEClass, SENDER_RECEIVER_COMMUNICATION__PORT);

		senderReceiverReadEClass = createEClass(SENDER_RECEIVER_READ);

		senderReceiverWriteEClass = createEClass(SENDER_RECEIVER_WRITE);
		createEReference(senderReceiverWriteEClass, SENDER_RECEIVER_WRITE__NOTIFIED_RUNNABLES);

		serverCallEClass = createEClass(SERVER_CALL);
		createEReference(serverCallEClass, SERVER_CALL__SERVER_RUNNABLE);
		createEReference(serverCallEClass, SERVER_CALL__PORT);

		synchronousServerCallEClass = createEClass(SYNCHRONOUS_SERVER_CALL);
		createEAttribute(synchronousServerCallEClass, SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR);

		asynchronousServerCallEClass = createEClass(ASYNCHRONOUS_SERVER_CALL);
		createEReference(asynchronousServerCallEClass, ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE);

		getResultServerCallEClass = createEClass(GET_RESULT_SERVER_CALL);
		createEAttribute(getResultServerCallEClass, GET_RESULT_SERVER_CALL__BLOCKING_TYPE);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__ORDERED);

		callArgumentEClass = createEClass(CALL_ARGUMENT);
		createEReference(callArgumentEClass, CALL_ARGUMENT__CONTAINING_CALL);
		createEReference(callArgumentEClass, CALL_ARGUMENT__PARAMETER);
		createEReference(callArgumentEClass, CALL_ARGUMENT__DEPENDS_ON);
		createEOperation(callArgumentEClass, CALL_ARGUMENT___GET_NAME);
		createEOperation(callArgumentEClass, CALL_ARGUMENT___COMPUTE_UNIQUE_NAME);

		runnableCallEClass = createEClass(RUNNABLE_CALL);
		createEReference(runnableCallEClass, RUNNABLE_CALL__RUNNABLE);
		createEReference(runnableCallEClass, RUNNABLE_CALL__ARGUMENTS);
		createEReference(runnableCallEClass, RUNNABLE_CALL__STATISTIC);

		customEventTriggerEClass = createEClass(CUSTOM_EVENT_TRIGGER);
		createEReference(customEventTriggerEClass, CUSTOM_EVENT_TRIGGER__EVENT);

		dataTypeEClass = createEClass(DATA_TYPE);

		compoundTypeEClass = createEClass(COMPOUND_TYPE);

		structEClass = createEClass(STRUCT);
		createEReference(structEClass, STRUCT__ENTRIES);

		structEntryEClass = createEClass(STRUCT_ENTRY);
		createEReference(structEntryEClass, STRUCT_ENTRY__DATA_TYPE);

		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__NUMBER_ELEMENTS);
		createEReference(arrayEClass, ARRAY__DATA_TYPE);

		pointerEClass = createEClass(POINTER);
		createEReference(pointerEClass, POINTER__DATA_TYPE);

		typeRefEClass = createEClass(TYPE_REF);
		createEReference(typeRefEClass, TYPE_REF__TYPE_DEF);

		aliasEClass = createEClass(ALIAS);
		createEAttribute(aliasEClass, ALIAS__TARGET);
		createEAttribute(aliasEClass, ALIAS__ALIAS);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__SIZE);

		dataTypeDefinitionEClass = createEClass(DATA_TYPE_DEFINITION);
		createEReference(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__DATA_TYPE);

		baseTypeDefinitionEClass = createEClass(BASE_TYPE_DEFINITION);
		createEReference(baseTypeDefinitionEClass, BASE_TYPE_DEFINITION__ALIASES);

		activationEClass = createEClass(ACTIVATION);

		periodicActivationEClass = createEClass(PERIODIC_ACTIVATION);
		createEReference(periodicActivationEClass, PERIODIC_ACTIVATION__MIN);
		createEReference(periodicActivationEClass, PERIODIC_ACTIVATION__MAX);
		createEReference(periodicActivationEClass, PERIODIC_ACTIVATION__RECURRENCE);
		createEReference(periodicActivationEClass, PERIODIC_ACTIVATION__OFFSET);

		variableRateActivationEClass = createEClass(VARIABLE_RATE_ACTIVATION);
		createEAttribute(variableRateActivationEClass, VARIABLE_RATE_ACTIVATION__DESCRIPTION);
		createEReference(variableRateActivationEClass, VARIABLE_RATE_ACTIVATION__STEP);
		createEReference(variableRateActivationEClass, VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP);

		sporadicActivationEClass = createEClass(SPORADIC_ACTIVATION);
		createEAttribute(sporadicActivationEClass, SPORADIC_ACTIVATION__DESCRIPTION);
		createEReference(sporadicActivationEClass, SPORADIC_ACTIVATION__OCCURRENCE);

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
		relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		frequencyUnitEEnum = createEEnum(FREQUENCY_UNIT);
		voltageUnitEEnum = createEEnum(VOLTAGE_UNIT);
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
		componentEventTypeEEnum = createEEnum(COMPONENT_EVENT_TYPE);
		memoryTypeEEnum = createEEnum(MEMORY_TYPE);
		structureTypeEEnum = createEEnum(STRUCTURE_TYPE);
		cacheTypeEEnum = createEEnum(CACHE_TYPE);
		portTypeEEnum = createEEnum(PORT_TYPE);
		schedPolicyEEnum = createEEnum(SCHED_POLICY);
		writeStrategyEEnum = createEEnum(WRITE_STRATEGY);
		puTypeEEnum = createEEnum(PU_TYPE);
		portInterfaceEEnum = createEEnum(PORT_INTERFACE);
		hwFeatureTypeEEnum = createEEnum(HW_FEATURE_TYPE);
		memoryAddressMappingTypeEEnum = createEEnum(MEMORY_ADDRESS_MAPPING_TYPE);
		osDataConsistencyModeEEnum = createEEnum(OS_DATA_CONSISTENCY_MODE);
		accessMultiplicityEEnum = createEEnum(ACCESS_MULTIPLICITY);
		dataStabilityLevelEEnum = createEEnum(DATA_STABILITY_LEVEL);
		semaphoreTypeEEnum = createEEnum(SEMAPHORE_TYPE);
		conditionEEnum = createEEnum(CONDITION);
		groupingTypeEEnum = createEEnum(GROUPING_TYPE);
		curveTypeEEnum = createEEnum(CURVE_TYPE);
		waitEventTypeEEnum = createEEnum(WAIT_EVENT_TYPE);
		waitingBehaviourEEnum = createEEnum(WAITING_BEHAVIOUR);
		isrCategoryEEnum = createEEnum(ISR_CATEGORY);
		accessPrecedenceTypeEEnum = createEEnum(ACCESS_PRECEDENCE_TYPE);
		orderTypeEEnum = createEEnum(ORDER_TYPE);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
		labelDataStabilityEEnum = createEEnum(LABEL_DATA_STABILITY);
		modeLabelAccessEnumEEnum = createEEnum(MODE_LABEL_ACCESS_ENUM);
		receiveOperationEEnum = createEEnum(RECEIVE_OPERATION);
		labelAccessDataStabilityEEnum = createEEnum(LABEL_ACCESS_DATA_STABILITY);
		labelAccessEnumEEnum = createEEnum(LABEL_ACCESS_ENUM);
		labelAccessImplementationEEnum = createEEnum(LABEL_ACCESS_IMPLEMENTATION);
		semaphoreAccessEnumEEnum = createEEnum(SEMAPHORE_ACCESS_ENUM);
		blockingTypeEEnum = createEEnum(BLOCKING_TYPE);
		preemptionEEnum = createEEnum(PREEMPTION);
		concurrencyTypeEEnum = createEEnum(CONCURRENCY_TYPE);
		asilTypeEEnum = createEEnum(ASIL_TYPE);

		// Create data types
		addressEDataType = createEDataType(ADDRESS);
		positiveIntEDataType = createEDataType(POSITIVE_INT);
		positiveLongEDataType = createEDataType(POSITIVE_LONG);
		positiveDoubleEDataType = createEDataType(POSITIVE_DOUBLE);
		nonNegativeIntEDataType = createEDataType(NON_NEGATIVE_INT);
		nonNegativeLongEDataType = createEDataType(NON_NEGATIVE_LONG);
		nonNegativeDoubleEDataType = createEDataType(NON_NEGATIVE_DOUBLE);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		amaltheaEClass.getESuperTypes().add(this.getBaseObject());
		commonElementsEClass.getESuperTypes().add(this.getBaseObject());
		baseObjectEClass.getESuperTypes().add(this.getIAnnotatable());
		referableObjectEClass.getESuperTypes().add(this.getIReferable());
		referableBaseObjectEClass.getESuperTypes().add(this.getIAnnotatable());
		referableBaseObjectEClass.getESuperTypes().add(this.getIReferable());
		iReferableEClass.getESuperTypes().add(this.getINamed());
		tagEClass.getESuperTypes().add(this.getReferableBaseObject());
		classifierEClass.getESuperTypes().add(this.getReferableBaseObject());
		coreClassifierEClass.getESuperTypes().add(this.getClassifier());
		memoryClassifierEClass.getESuperTypes().add(this.getClassifier());
		timeEClass.getESuperTypes().add(this.getQuantity());
		timeEClass.getESuperTypes().add(this.getValue());
		timeEClass.getESuperTypes().add(this.getTimeComparable());
		frequencyEClass.getESuperTypes().add(this.getQuantity());
		voltageEClass.getESuperTypes().add(this.getQuantity());
		dataSizeEClass.getESuperTypes().add(this.getQuantity());
		dataRateEClass.getESuperTypes().add(this.getQuantity());
		dataRateEClass.getESuperTypes().add(this.getDataRateComparable());
		listObjectEClass.getESuperTypes().add(this.getValue());
		stringObjectEClass.getESuperTypes().add(this.getValue());
		bigIntegerObjectEClass.getESuperTypes().add(this.getValue());
		referenceObjectEClass.getESuperTypes().add(this.getValue());
		integerObjectEClass.getESuperTypes().add(this.getValue());
		longObjectEClass.getESuperTypes().add(this.getValue());
		floatObjectEClass.getESuperTypes().add(this.getValue());
		doubleObjectEClass.getESuperTypes().add(this.getValue());
		booleanObjectEClass.getESuperTypes().add(this.getValue());
		minAvgMaxStatisticEClass.getESuperTypes().add(this.getNumericStatistic());
		singleValueStatisticEClass.getESuperTypes().add(this.getNumericStatistic());
		timeConstantEClass.getESuperTypes().add(this.getITimeDeviation());
		timeHistogramEClass.getESuperTypes().add(this.getITimeDeviation());
		timeHistogramEntryEClass.getESuperTypes().add(this.getTimeInterval());
		boundedTimeDistributionEClass.getESuperTypes().add(this.getTimeInterval());
		boundedTimeDistributionEClass.getESuperTypes().add(this.getITimeDeviation());
		truncatedTimeDistributionEClass.getESuperTypes().add(this.getITimeDeviation());
		timeBoundariesEClass.getESuperTypes().add(this.getBoundedTimeDistribution());
		timeStatisticsEClass.getESuperTypes().add(this.getBoundedTimeDistribution());
		timeUniformDistributionEClass.getESuperTypes().add(this.getBoundedTimeDistribution());
		timeGaussDistributionEClass.getESuperTypes().add(this.getTruncatedTimeDistribution());
		timeWeibullEstimatorsDistributionEClass.getESuperTypes().add(this.getBoundedTimeDistribution());
		timeBetaDistributionEClass.getESuperTypes().add(this.getBoundedTimeDistribution());
		discreteValueConstantEClass.getESuperTypes().add(this.getIDiscreteValueDeviation());
		discreteValueHistogramEClass.getESuperTypes().add(this.getIDiscreteValueDeviation());
		discreteValueHistogramEntryEClass.getESuperTypes().add(this.getDiscreteValueInterval());
		boundedDiscreteValueDistributionEClass.getESuperTypes().add(this.getDiscreteValueInterval());
		boundedDiscreteValueDistributionEClass.getESuperTypes().add(this.getIDiscreteValueDeviation());
		truncatedDiscreteValueDistributionEClass.getESuperTypes().add(this.getIDiscreteValueDeviation());
		discreteValueBoundariesEClass.getESuperTypes().add(this.getBoundedDiscreteValueDistribution());
		discreteValueStatisticsEClass.getESuperTypes().add(this.getBoundedDiscreteValueDistribution());
		discreteValueUniformDistributionEClass.getESuperTypes().add(this.getBoundedDiscreteValueDistribution());
		discreteValueGaussDistributionEClass.getESuperTypes().add(this.getTruncatedDiscreteValueDistribution());
		discreteValueWeibullEstimatorsDistributionEClass.getESuperTypes().add(this.getBoundedDiscreteValueDistribution());
		discreteValueBetaDistributionEClass.getESuperTypes().add(this.getBoundedDiscreteValueDistribution());
		continuousValueConstantEClass.getESuperTypes().add(this.getIContinuousValueDeviation());
		continuousValueHistogramEClass.getESuperTypes().add(this.getIContinuousValueDeviation());
		continuousValueHistogramEntryEClass.getESuperTypes().add(this.getContinuousValueInterval());
		boundedContinuousValueDistributionEClass.getESuperTypes().add(this.getContinuousValueInterval());
		boundedContinuousValueDistributionEClass.getESuperTypes().add(this.getIContinuousValueDeviation());
		truncatedContinuousValueDistributionEClass.getESuperTypes().add(this.getIContinuousValueDeviation());
		continuousValueBoundariesEClass.getESuperTypes().add(this.getBoundedContinuousValueDistribution());
		continuousValueStatisticsEClass.getESuperTypes().add(this.getBoundedContinuousValueDistribution());
		continuousValueUniformDistributionEClass.getESuperTypes().add(this.getBoundedContinuousValueDistribution());
		continuousValueGaussDistributionEClass.getESuperTypes().add(this.getTruncatedContinuousValueDistribution());
		continuousValueWeibullEstimatorsDistributionEClass.getESuperTypes().add(this.getBoundedContinuousValueDistribution());
		continuousValueBetaDistributionEClass.getESuperTypes().add(this.getBoundedContinuousValueDistribution());
		modeEClass.getESuperTypes().add(this.getReferableBaseObject());
		numericModeEClass.getESuperTypes().add(this.getMode());
		enumModeEClass.getESuperTypes().add(this.getMode());
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
		connectorEClass.getESuperTypes().add(this.getINamed());
		connectorEClass.getESuperTypes().add(this.getITaggable());
		qualifiedPortEClass.getESuperTypes().add(this.getBaseObject());
		interfacePortEClass.getESuperTypes().add(this.getPort());
		configModelEClass.getESuperTypes().add(this.getBaseObject());
		eventConfigEClass.getESuperTypes().add(this.getBaseObject());
		eventConfigEClass.getESuperTypes().add(this.getINamed());
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
		abstractEventChainEClass.getESuperTypes().add(this.getINamed());
		eventChainEClass.getESuperTypes().add(this.getAbstractEventChain());
		eventChainEClass.getESuperTypes().add(this.getIReferable());
		subEventChainEClass.getESuperTypes().add(this.getAbstractEventChain());
		eventChainReferenceEClass.getESuperTypes().add(this.getBaseObject());
		eventChainReferenceEClass.getESuperTypes().add(this.getEventChainItem());
		eventChainContainerEClass.getESuperTypes().add(this.getBaseObject());
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
		requirementEClass.getESuperTypes().add(this.getINamed());
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
		componentEventEClass.getESuperTypes().add(this.getEntityEvent());
		hwModelEClass.getESuperTypes().add(this.getBaseObject());
		hwStructureEClass.getESuperTypes().add(this.getReferableBaseObject());
		hwStructureEClass.getESuperTypes().add(this.getITaggable());
		hwModuleEClass.getESuperTypes().add(this.getReferableBaseObject());
		hwModuleEClass.getESuperTypes().add(this.getITaggable());
		hwDomainEClass.getESuperTypes().add(this.getReferableBaseObject());
		hwDomainEClass.getESuperTypes().add(this.getITaggable());
		frequencyDomainEClass.getESuperTypes().add(this.getHwDomain());
		powerDomainEClass.getESuperTypes().add(this.getHwDomain());
		processingUnitEClass.getESuperTypes().add(this.getHwModule());
		processingUnitEClass.getESuperTypes().add(this.getHwDestination());
		processingUnitEClass.getESuperTypes().add(this.getHwPathElement());
		memoryEClass.getESuperTypes().add(this.getHwModule());
		memoryEClass.getESuperTypes().add(this.getHwDestination());
		cacheEClass.getESuperTypes().add(this.getHwModule());
		cacheEClass.getESuperTypes().add(this.getHwPathElement());
		hwFeatureCategoryEClass.getESuperTypes().add(this.getReferableBaseObject());
		hwFeatureEClass.getESuperTypes().add(this.getReferableBaseObject());
		hwPortEClass.getESuperTypes().add(this.getReferableBaseObject());
		hwPortEClass.getESuperTypes().add(this.getITaggable());
		connectionHandlerEClass.getESuperTypes().add(this.getHwModule());
		connectionHandlerEClass.getESuperTypes().add(this.getHwPathElement());
		hwConnectionEClass.getESuperTypes().add(this.getReferableBaseObject());
		hwConnectionEClass.getESuperTypes().add(this.getHwPathElement());
		hwConnectionEClass.getESuperTypes().add(this.getITaggable());
		hwAccessElementEClass.getESuperTypes().add(this.getITaggable());
		hwAccessElementEClass.getESuperTypes().add(this.getINamed());
		hwDefinitionEClass.getESuperTypes().add(this.getReferableBaseObject());
		hwDefinitionEClass.getESuperTypes().add(this.getITaggable());
		processingUnitDefinitionEClass.getESuperTypes().add(this.getHwDefinition());
		connectionHandlerDefinitionEClass.getESuperTypes().add(this.getHwDefinition());
		memoryDefinitionEClass.getESuperTypes().add(this.getHwDefinition());
		cacheDefinitionEClass.getESuperTypes().add(this.getHwDefinition());
		hwAccessPathEClass.getESuperTypes().add(this.getHwPath());
		hwAccessPathEClass.getESuperTypes().add(this.getINamed());
		hwPathElementEClass.getESuperTypes().add(this.getIReferable());
		hwDestinationEClass.getESuperTypes().add(this.getIReferable());
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
		operatingSystemEClass.getESuperTypes().add(this.getINamed());
		vendorOperatingSystemEClass.getESuperTypes().add(this.getOperatingSystem());
		osOverheadEClass.getESuperTypes().add(this.getReferableBaseObject());
		osAPIOverheadEClass.getESuperTypes().add(this.getBaseObject());
		osISROverheadEClass.getESuperTypes().add(this.getBaseObject());
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
		modeValueEClass.getESuperTypes().add(this.getBaseObject());
		modeAssignmentEClass.getESuperTypes().add(this.getModeValue());
		modeConditionDisjunctionEClass.getESuperTypes().add(this.getBaseObject());
		modeConditionDisjunctionEntryEClass.getESuperTypes().add(this.getBaseObject());
		modeConditionEClass.getESuperTypes().add(this.getModeValue());
		modeConditionEClass.getESuperTypes().add(this.getModeConditionDisjunctionEntry());
		modeConditionConjunctionEClass.getESuperTypes().add(this.getModeConditionDisjunctionEntry());
		periodicStimulusEClass.getESuperTypes().add(this.getStimulus());
		periodicStimulusEClass.getESuperTypes().add(this.getFixedPeriodic());
		relativePeriodicStimulusEClass.getESuperTypes().add(this.getStimulus());
		variableRateStimulusEClass.getESuperTypes().add(this.getStimulus());
		scenarioEClass.getESuperTypes().add(this.getBaseObject());
		periodicSyntheticStimulusEClass.getESuperTypes().add(this.getStimulus());
		periodicSyntheticStimulusEClass.getESuperTypes().add(this.getFixedPeriodic());
		customStimulusEClass.getESuperTypes().add(this.getStimulus());
		singleStimulusEClass.getESuperTypes().add(this.getStimulus());
		interProcessStimulusEClass.getESuperTypes().add(this.getStimulus());
		periodicBurstStimulusEClass.getESuperTypes().add(this.getStimulus());
		periodicBurstStimulusEClass.getESuperTypes().add(this.getFixedPeriodic());
		eventStimulusEClass.getESuperTypes().add(this.getStimulus());
		arrivalCurveStimulusEClass.getESuperTypes().add(this.getStimulus());
		arrivalCurveEntryEClass.getESuperTypes().add(this.getBaseObject());
		clockEClass.getESuperTypes().add(this.getReferableBaseObject());
		clockFunctionEClass.getESuperTypes().add(this.getClock());
		clockStepListEClass.getESuperTypes().add(this.getClock());
		clockStepEClass.getESuperTypes().add(this.getBaseObject());
		swModelEClass.getESuperTypes().add(this.getBaseObject());
		abstractMemoryElementEClass.getESuperTypes().add(this.getReferableBaseObject());
		abstractMemoryElementEClass.getESuperTypes().add(this.getITaggable());
		abstractProcessEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		customEntityEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		processChainEClass.getESuperTypes().add(this.getReferableBaseObject());
		processEClass.getESuperTypes().add(this.getAbstractProcess());
		callGraphEClass.getESuperTypes().add(this.getBaseObject());
		callGraphEClass.getESuperTypes().add(this.getICallGraphItemContainer());
		callGraphItemEClass.getESuperTypes().add(this.getBaseObject());
		modeSwitchEClass.getESuperTypes().add(this.getCallGraphItem());
		modeSwitchEntryEClass.getESuperTypes().add(this.getBaseObject());
		modeSwitchEntryEClass.getESuperTypes().add(this.getINamed());
		modeSwitchEntryEClass.getESuperTypes().add(this.getICallGraphItemContainer());
		modeSwitchDefaultEClass.getESuperTypes().add(this.getBaseObject());
		modeSwitchDefaultEClass.getESuperTypes().add(this.getICallGraphItemContainer());
		probabilitySwitchEClass.getESuperTypes().add(this.getCallGraphItem());
		probabilitySwitchEntryEClass.getESuperTypes().add(this.getBaseObject());
		probabilitySwitchEntryEClass.getESuperTypes().add(this.getICallGraphItemContainer());
		counterEClass.getESuperTypes().add(this.getBaseObject());
		waitEventEClass.getESuperTypes().add(this.getCallGraphItem());
		setEventEClass.getESuperTypes().add(this.getCallGraphItem());
		clearEventEClass.getESuperTypes().add(this.getCallGraphItem());
		eventMaskEClass.getESuperTypes().add(this.getBaseObject());
		osEventEClass.getESuperTypes().add(this.getReferableBaseObject());
		osEventEClass.getESuperTypes().add(this.getITaggable());
		interProcessTriggerEClass.getESuperTypes().add(this.getCallGraphItem());
		enforcedMigrationEClass.getESuperTypes().add(this.getCallGraphItem());
		schedulePointEClass.getESuperTypes().add(this.getCallGraphItem());
		terminateProcessEClass.getESuperTypes().add(this.getCallGraphItem());
		taskEClass.getESuperTypes().add(this.getProcess());
		isrEClass.getESuperTypes().add(this.getProcess());
		processPrototypeEClass.getESuperTypes().add(this.getAbstractProcess());
		chainedProcessPrototypeEClass.getESuperTypes().add(this.getBaseObject());
		generalPrecedenceEClass.getESuperTypes().add(this.getBaseObject());
		accessPrecedenceSpecEClass.getESuperTypes().add(this.getGeneralPrecedence());
		orderPrecedenceSpecEClass.getESuperTypes().add(this.getGeneralPrecedence());
		dataDependencyEClass.getESuperTypes().add(this.getBaseObject());
		runnableParameterEClass.getESuperTypes().add(this.getReferableBaseObject());
		runnableEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		labelEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		labelEClass.getESuperTypes().add(this.getIDisplayName());
		channelEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		channelEClass.getESuperTypes().add(this.getIDisplayName());
		modeLabelEClass.getESuperTypes().add(this.getAbstractMemoryElement());
		modeLabelEClass.getESuperTypes().add(this.getIDisplayName());
		sectionEClass.getESuperTypes().add(this.getReferableBaseObject());
		computationItemEClass.getESuperTypes().add(this.getCallGraphItem());
		executionNeedEClass.getESuperTypes().add(this.getCallGraphItem());
		ticksEClass.getESuperTypes().add(this.getComputationItem());
		modeLabelAccessEClass.getESuperTypes().add(this.getCallGraphItem());
		labelAccessEClass.getESuperTypes().add(this.getComputationItem());
		labelAccessEClass.getESuperTypes().add(this.getITaggable());
		channelAccessEClass.getESuperTypes().add(this.getCallGraphItem());
		channelSendEClass.getESuperTypes().add(this.getChannelAccess());
		channelReceiveEClass.getESuperTypes().add(this.getChannelAccess());
		semaphoreAccessEClass.getESuperTypes().add(this.getCallGraphItem());
		senderReceiverCommunicationEClass.getESuperTypes().add(this.getCallGraphItem());
		senderReceiverReadEClass.getESuperTypes().add(this.getSenderReceiverCommunication());
		senderReceiverWriteEClass.getESuperTypes().add(this.getSenderReceiverCommunication());
		serverCallEClass.getESuperTypes().add(this.getCallGraphItem());
		synchronousServerCallEClass.getESuperTypes().add(this.getServerCall());
		asynchronousServerCallEClass.getESuperTypes().add(this.getServerCall());
		getResultServerCallEClass.getESuperTypes().add(this.getServerCall());
		groupEClass.getESuperTypes().add(this.getCallGraphItem());
		groupEClass.getESuperTypes().add(this.getINamed());
		groupEClass.getESuperTypes().add(this.getICallGraphItemContainer());
		callArgumentEClass.getESuperTypes().add(this.getReferableObject());
		runnableCallEClass.getESuperTypes().add(this.getCallGraphItem());
		runnableCallEClass.getESuperTypes().add(this.getITaggable());
		customEventTriggerEClass.getESuperTypes().add(this.getCallGraphItem());
		compoundTypeEClass.getESuperTypes().add(this.getBaseObject());
		compoundTypeEClass.getESuperTypes().add(this.getDataType());
		structEClass.getESuperTypes().add(this.getCompoundType());
		structEntryEClass.getESuperTypes().add(this.getBaseObject());
		structEntryEClass.getESuperTypes().add(this.getINamed());
		arrayEClass.getESuperTypes().add(this.getCompoundType());
		pointerEClass.getESuperTypes().add(this.getCompoundType());
		typeRefEClass.getESuperTypes().add(this.getBaseObject());
		typeRefEClass.getESuperTypes().add(this.getDataType());
		aliasEClass.getESuperTypes().add(this.getBaseObject());
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

		initEClass(iNamedEClass, INamed.class, "INamed", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINamed_Name(), theEcorePackage.getEString(), "name", "", 0, 1, INamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iReferableEClass, IReferable.class, "IReferable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIReferable_UniqueName(), theEcorePackage.getEString(), "uniqueName", null, 0, 1, IReferable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getIReferable__GetNamePrefix(), theEcorePackage.getEString(), "getNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getIReferable__Encode__String(), theEcorePackage.getEString(), "encode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "str", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIReferable__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEMap());
		EGenericType g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(iDisplayNameEClass, IDisplayName.class, "IDisplayName", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDisplayName_DisplayName(), theEcorePackage.getEString(), "displayName", null, 0, 1, IDisplayName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_TagType(), theEcorePackage.getEString(), "tagType", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_TaggedObjects(), this.getITaggable(), null, "taggedObjects", null, 0, -1, Tag.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifier_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreClassifierEClass, CoreClassifier.class, "CoreClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryClassifierEClass, MemoryClassifier.class, "MemoryClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transmissionPolicyEClass, TransmissionPolicy.class, "TransmissionPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransmissionPolicy_ChunkSize(), this.getDataSize(), null, "chunkSize", null, 0, 1, TransmissionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionPolicy_ChunkProcessingTicks(), theEcorePackage.getEInt(), "chunkProcessingTicks", "0", 0, 1, TransmissionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmissionPolicy_TransmitRatio(), theEcorePackage.getEDouble(), "transmitRatio", "1.0", 0, 1, TransmissionPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeComparableEClass, Comparable.class, "TimeComparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Comparable<org.eclipse.app4mc.amalthea.model.Time>");

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Value(), theEcorePackage.getEBigInteger(), "value", "0", 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Unit(), this.getTimeUnit(), "unit", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTime__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTime__CompareTo__Time(), theEcorePackage.getEInt(), "compareTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTime(), "t", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTime__AdjustUnit(), this.getTime(), "adjustUnit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTime__Add__Time(), this.getTime(), "add", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTime(), "t", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTime__Subtract__Time(), this.getTime(), "subtract", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTime(), "t", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTime__Multiply__long(), this.getTime(), "multiply", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELong(), "v", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTime__Multiply__double(), this.getTime(), "multiply", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "v", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTime__Divide__Time(), theEcorePackage.getEDouble(), "divide", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTime(), "t", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(frequencyEClass, Frequency.class, "Frequency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequency_Value(), this.getNonNegativeDouble(), "value", "0.0", 0, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequency_Unit(), this.getFrequencyUnit(), "unit", null, 0, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFrequency__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(voltageEClass, Voltage.class, "Voltage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoltage_Value(), theEcorePackage.getEDouble(), "value", "0.0", 0, 1, Voltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoltage_Unit(), this.getVoltageUnit(), "unit", null, 0, 1, Voltage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVoltage__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dataSizeEClass, DataSize.class, "DataSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSize_Value(), theEcorePackage.getEBigInteger(), "value", "0", 0, 1, DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSize_Unit(), this.getDataSizeUnit(), "unit", null, 0, 1, DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataSize__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSize__GetNumberBits(), theEcorePackage.getELong(), "getNumberBits", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSize__GetNumberBytes(), theEcorePackage.getELong(), "getNumberBytes", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dataRateComparableEClass, Comparable.class, "DataRateComparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Comparable<org.eclipse.app4mc.amalthea.model.DataRate>");

		initEClass(dataRateEClass, DataRate.class, "DataRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataRate_Value(), theEcorePackage.getEBigInteger(), "value", "0", 0, 1, DataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataRate_Unit(), this.getDataRateUnit(), "unit", null, 0, 1, DataRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataRate__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataRate__CompareTo__DataRate(), theEcorePackage.getEInt(), "compareTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataRate(), "rate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(customPropertyEClass, Map.Entry.class, "CustomProperty", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomProperty_Key(), theEcorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomProperty_Value(), this.getValue(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listObjectEClass, ListObject.class, "ListObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListObject_Values(), this.getValue(), null, "values", null, 0, -1, ListObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringObjectEClass, StringObject.class, "StringObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringObject_Value(), theEcorePackage.getEString(), "value", null, 1, 1, StringObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigIntegerObjectEClass, BigIntegerObject.class, "BigIntegerObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBigIntegerObject_Value(), theEcorePackage.getEBigInteger(), "value", "0", 1, 1, BigIntegerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceObjectEClass, ReferenceObject.class, "ReferenceObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceObject_Value(), this.getIReferable(), null, "value", null, 0, 1, ReferenceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerObjectEClass, IntegerObject.class, "IntegerObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerObject_Value(), theEcorePackage.getEInt(), "value", "0", 1, 1, IntegerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longObjectEClass, LongObject.class, "LongObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongObject_Value(), theEcorePackage.getELong(), "value", "0", 1, 1, LongObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatObjectEClass, FloatObject.class, "FloatObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatObject_Value(), theEcorePackage.getEFloat(), "value", "0.0", 1, 1, FloatObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleObjectEClass, DoubleObject.class, "DoubleObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleObject_Value(), theEcorePackage.getEDouble(), "value", "0.0", 1, 1, DoubleObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanObjectEClass, BooleanObject.class, "BooleanObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanObject_Value(), theEcorePackage.getEBoolean(), "value", "false", 1, 1, BooleanObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericStatisticEClass, NumericStatistic.class, "NumericStatistic", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minAvgMaxStatisticEClass, MinAvgMaxStatistic.class, "MinAvgMaxStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinAvgMaxStatistic_Min(), theEcorePackage.getEInt(), "min", "0", 0, 1, MinAvgMaxStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinAvgMaxStatistic_Avg(), theEcorePackage.getEFloat(), "avg", "0f", 0, 1, MinAvgMaxStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinAvgMaxStatistic_Max(), theEcorePackage.getEInt(), "max", "0", 0, 1, MinAvgMaxStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMinAvgMaxStatistic__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(singleValueStatisticEClass, SingleValueStatistic.class, "SingleValueStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleValueStatistic_Value(), theEcorePackage.getEFloat(), "value", "0f", 0, 1, SingleValueStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTimeDeviationEClass, ITimeDeviation.class, "ITimeDeviation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getITimeDeviation__GetLowerBound(), this.getTime(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getITimeDeviation__GetUpperBound(), this.getTime(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getITimeDeviation__GetAverage(), this.getTime(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeInterval_LowerBound(), this.getTime(), null, "lowerBound", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeInterval_UpperBound(), this.getTime(), null, "upperBound", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeInterval__GetAverage(), this.getTime(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(timeConstantEClass, TimeConstant.class, "TimeConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeConstant_Value(), this.getTime(), null, "value", null, 1, 1, TimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeConstant__GetLowerBound(), this.getTime(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTimeConstant__GetUpperBound(), this.getTime(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTimeConstant__GetAverage(), this.getTime(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(timeHistogramEClass, TimeHistogram.class, "TimeHistogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeHistogram_Entries(), this.getTimeHistogramEntry(), null, "entries", null, 1, -1, TimeHistogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeHistogram__GetLowerBound(), this.getTime(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTimeHistogram__GetUpperBound(), this.getTime(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTimeHistogram__GetAverage(), this.getTime(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(timeHistogramEntryEClass, TimeHistogramEntry.class, "TimeHistogramEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeHistogramEntry_Occurrences(), this.getPositiveLong(), "occurrences", "1", 1, 1, TimeHistogramEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedTimeDistributionEClass, BoundedTimeDistribution.class, "BoundedTimeDistribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(truncatedTimeDistributionEClass, TruncatedTimeDistribution.class, "TruncatedTimeDistribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTruncatedTimeDistribution_LowerBound(), this.getTime(), null, "lowerBound", null, 0, 1, TruncatedTimeDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTruncatedTimeDistribution_UpperBound(), this.getTime(), null, "upperBound", null, 0, 1, TruncatedTimeDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTruncatedTimeDistribution__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(timeBoundariesEClass, TimeBoundaries.class, "TimeBoundaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeBoundaries_SamplingType(), this.getSamplingType(), "samplingType", null, 0, 1, TimeBoundaries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeStatisticsEClass, TimeStatistics.class, "TimeStatistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeStatistics_Average(), this.getTime(), null, "average", null, 1, 1, TimeStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeUniformDistributionEClass, TimeUniformDistribution.class, "TimeUniformDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeGaussDistributionEClass, TimeGaussDistribution.class, "TimeGaussDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeGaussDistribution_Mean(), this.getTime(), null, "mean", null, 1, 1, TimeGaussDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeGaussDistribution_Sd(), this.getTime(), null, "sd", null, 1, 1, TimeGaussDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeGaussDistribution__GetAverage(), this.getTime(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(timeWeibullEstimatorsDistributionEClass, TimeWeibullEstimatorsDistribution.class, "TimeWeibullEstimatorsDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeWeibullEstimatorsDistribution_Average(), this.getTime(), null, "average", null, 1, 1, TimeWeibullEstimatorsDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeWeibullEstimatorsDistribution_PRemainPromille(), this.getPositiveDouble(), "pRemainPromille", "1.0", 1, 1, TimeWeibullEstimatorsDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeBetaDistributionEClass, TimeBetaDistribution.class, "TimeBetaDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeBetaDistribution_Alpha(), this.getPositiveDouble(), "alpha", "1.0", 1, 1, TimeBetaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBetaDistribution_Beta(), this.getPositiveDouble(), "beta", "1.0", 1, 1, TimeBetaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeBetaDistribution__GetAverage(), this.getTime(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(iDiscreteValueDeviationEClass, IDiscreteValueDeviation.class, "IDiscreteValueDeviation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIDiscreteValueDeviation__GetLowerBound(), theEcorePackage.getELongObject(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDiscreteValueDeviation__GetUpperBound(), theEcorePackage.getELongObject(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDiscreteValueDeviation__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(discreteValueIntervalEClass, DiscreteValueInterval.class, "DiscreteValueInterval", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteValueInterval_LowerBound(), theEcorePackage.getELongObject(), "lowerBound", "0", 1, 1, DiscreteValueInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteValueInterval_UpperBound(), theEcorePackage.getELongObject(), "upperBound", "0", 1, 1, DiscreteValueInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDiscreteValueInterval__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDiscreteValueInterval__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(discreteValueConstantEClass, DiscreteValueConstant.class, "DiscreteValueConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteValueConstant_Value(), theEcorePackage.getELong(), "value", "0", 1, 1, DiscreteValueConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDiscreteValueConstant__GetLowerBound(), theEcorePackage.getELongObject(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscreteValueConstant__GetUpperBound(), theEcorePackage.getELongObject(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscreteValueConstant__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(discreteValueHistogramEClass, DiscreteValueHistogram.class, "DiscreteValueHistogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscreteValueHistogram_Entries(), this.getDiscreteValueHistogramEntry(), null, "entries", null, 1, -1, DiscreteValueHistogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDiscreteValueHistogram__GetLowerBound(), theEcorePackage.getELongObject(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscreteValueHistogram__GetUpperBound(), theEcorePackage.getELongObject(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDiscreteValueHistogram__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(discreteValueHistogramEntryEClass, DiscreteValueHistogramEntry.class, "DiscreteValueHistogramEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteValueHistogramEntry_Occurrences(), this.getPositiveLong(), "occurrences", "1", 1, 1, DiscreteValueHistogramEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedDiscreteValueDistributionEClass, BoundedDiscreteValueDistribution.class, "BoundedDiscreteValueDistribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(truncatedDiscreteValueDistributionEClass, TruncatedDiscreteValueDistribution.class, "TruncatedDiscreteValueDistribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTruncatedDiscreteValueDistribution_LowerBound(), theEcorePackage.getELongObject(), "lowerBound", null, 0, 1, TruncatedDiscreteValueDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTruncatedDiscreteValueDistribution_UpperBound(), theEcorePackage.getELongObject(), "upperBound", null, 0, 1, TruncatedDiscreteValueDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTruncatedDiscreteValueDistribution__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(discreteValueBoundariesEClass, DiscreteValueBoundaries.class, "DiscreteValueBoundaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteValueBoundaries_SamplingType(), this.getSamplingType(), "samplingType", null, 0, 1, DiscreteValueBoundaries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteValueStatisticsEClass, DiscreteValueStatistics.class, "DiscreteValueStatistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteValueStatistics_Average(), theEcorePackage.getEDoubleObject(), "average", "0.0", 1, 1, DiscreteValueStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteValueUniformDistributionEClass, DiscreteValueUniformDistribution.class, "DiscreteValueUniformDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discreteValueGaussDistributionEClass, DiscreteValueGaussDistribution.class, "DiscreteValueGaussDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteValueGaussDistribution_Mean(), theEcorePackage.getEDouble(), "mean", "0.0", 1, 1, DiscreteValueGaussDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteValueGaussDistribution_Sd(), this.getPositiveDouble(), "sd", "1.0", 1, 1, DiscreteValueGaussDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDiscreteValueGaussDistribution__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(discreteValueWeibullEstimatorsDistributionEClass, DiscreteValueWeibullEstimatorsDistribution.class, "DiscreteValueWeibullEstimatorsDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteValueWeibullEstimatorsDistribution_Average(), theEcorePackage.getEDoubleObject(), "average", "0.0", 1, 1, DiscreteValueWeibullEstimatorsDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteValueWeibullEstimatorsDistribution_PRemainPromille(), this.getPositiveDouble(), "pRemainPromille", "1.0", 1, 1, DiscreteValueWeibullEstimatorsDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteValueBetaDistributionEClass, DiscreteValueBetaDistribution.class, "DiscreteValueBetaDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteValueBetaDistribution_Alpha(), this.getPositiveDouble(), "alpha", "1.0", 1, 1, DiscreteValueBetaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteValueBetaDistribution_Beta(), this.getPositiveDouble(), "beta", "1.0", 1, 1, DiscreteValueBetaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDiscreteValueBetaDistribution__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(iContinuousValueDeviationEClass, IContinuousValueDeviation.class, "IContinuousValueDeviation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIContinuousValueDeviation__GetLowerBound(), theEcorePackage.getEDoubleObject(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getIContinuousValueDeviation__GetUpperBound(), theEcorePackage.getEDoubleObject(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getIContinuousValueDeviation__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(continuousValueIntervalEClass, ContinuousValueInterval.class, "ContinuousValueInterval", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousValueInterval_LowerBound(), theEcorePackage.getEDoubleObject(), "lowerBound", "0.0", 1, 1, ContinuousValueInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousValueInterval_UpperBound(), theEcorePackage.getEDoubleObject(), "upperBound", "0.0", 1, 1, ContinuousValueInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContinuousValueInterval__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContinuousValueInterval__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(continuousValueConstantEClass, ContinuousValueConstant.class, "ContinuousValueConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousValueConstant_Value(), theEcorePackage.getEDouble(), "value", "0.0", 1, 1, ContinuousValueConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContinuousValueConstant__GetLowerBound(), theEcorePackage.getEDoubleObject(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getContinuousValueConstant__GetUpperBound(), theEcorePackage.getEDoubleObject(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getContinuousValueConstant__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(continuousValueHistogramEClass, ContinuousValueHistogram.class, "ContinuousValueHistogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContinuousValueHistogram_Entries(), this.getContinuousValueHistogramEntry(), null, "entries", null, 1, -1, ContinuousValueHistogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContinuousValueHistogram__GetLowerBound(), theEcorePackage.getEDoubleObject(), "getLowerBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getContinuousValueHistogram__GetUpperBound(), theEcorePackage.getEDoubleObject(), "getUpperBound", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getContinuousValueHistogram__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(continuousValueHistogramEntryEClass, ContinuousValueHistogramEntry.class, "ContinuousValueHistogramEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousValueHistogramEntry_Occurrences(), this.getPositiveLong(), "occurrences", "1", 1, 1, ContinuousValueHistogramEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedContinuousValueDistributionEClass, BoundedContinuousValueDistribution.class, "BoundedContinuousValueDistribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(truncatedContinuousValueDistributionEClass, TruncatedContinuousValueDistribution.class, "TruncatedContinuousValueDistribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTruncatedContinuousValueDistribution_LowerBound(), theEcorePackage.getEDoubleObject(), "lowerBound", null, 0, 1, TruncatedContinuousValueDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTruncatedContinuousValueDistribution_UpperBound(), theEcorePackage.getEDoubleObject(), "upperBound", null, 0, 1, TruncatedContinuousValueDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTruncatedContinuousValueDistribution__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(continuousValueBoundariesEClass, ContinuousValueBoundaries.class, "ContinuousValueBoundaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousValueBoundaries_SamplingType(), this.getSamplingType(), "samplingType", null, 0, 1, ContinuousValueBoundaries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuousValueStatisticsEClass, ContinuousValueStatistics.class, "ContinuousValueStatistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousValueStatistics_Average(), theEcorePackage.getEDoubleObject(), "average", "0.0", 1, 1, ContinuousValueStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuousValueUniformDistributionEClass, ContinuousValueUniformDistribution.class, "ContinuousValueUniformDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousValueGaussDistributionEClass, ContinuousValueGaussDistribution.class, "ContinuousValueGaussDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousValueGaussDistribution_Mean(), theEcorePackage.getEDouble(), "mean", "0.0", 1, 1, ContinuousValueGaussDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousValueGaussDistribution_Sd(), this.getPositiveDouble(), "sd", "1.0", 1, 1, ContinuousValueGaussDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContinuousValueGaussDistribution__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(continuousValueWeibullEstimatorsDistributionEClass, ContinuousValueWeibullEstimatorsDistribution.class, "ContinuousValueWeibullEstimatorsDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousValueWeibullEstimatorsDistribution_Average(), theEcorePackage.getEDoubleObject(), "average", "0.0", 1, 1, ContinuousValueWeibullEstimatorsDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousValueWeibullEstimatorsDistribution_PRemainPromille(), this.getPositiveDouble(), "pRemainPromille", "1.0", 1, 1, ContinuousValueWeibullEstimatorsDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuousValueBetaDistributionEClass, ContinuousValueBetaDistribution.class, "ContinuousValueBetaDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousValueBetaDistribution_Alpha(), this.getPositiveDouble(), "alpha", "1.0", 1, 1, ContinuousValueBetaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousValueBetaDistribution_Beta(), this.getPositiveDouble(), "beta", "1.0", 1, 1, ContinuousValueBetaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContinuousValueBetaDistribution__GetAverage(), theEcorePackage.getEDoubleObject(), "getAverage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericModeEClass, NumericMode.class, "NumericMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumModeEClass, EnumMode.class, "EnumMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumMode_Literals(), this.getModeLiteral(), this.getModeLiteral_ContainingMode(), "literals", null, 0, -1, EnumMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEnumMode__GetLiteral__String(), this.getModeLiteral(), "getLiteral", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "literal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(modeLiteralEClass, ModeLiteral.class, "ModeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeLiteral_ContainingMode(), this.getEnumMode(), this.getEnumMode_Literals(), "containingMode", null, 0, 1, ModeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModeLiteral__GetNamePrefix(), theEcorePackage.getEString(), "getNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModeLiteral__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(componentsModelEClass, ComponentsModel.class, "ComponentsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentsModel_Components(), this.getComponent(), null, "components", null, 0, -1, ComponentsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentsModel_Systems(), this.getSystem(), null, "systems", null, 0, -1, ComponentsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iSystemEClass, ISystem.class, "ISystem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISystem_ComponentInstances(), this.getComponentInstance(), null, "componentInstances", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISystem_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISystem_GroundedPorts(), this.getQualifiedPort(), null, "groundedPorts", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISystem_InnerPorts(), this.getQualifiedPort(), null, "innerPorts", null, 0, -1, ISystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_ContainingComponent(), this.getComponent(), this.getComponent_Ports(), "containingComponent", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPort__GetNamePrefix(), theEcorePackage.getEString(), "getNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Ports(), this.getPort(), this.getPort_ContainingComponent(), "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(interfacePortEClass, InterfacePort.class, "InterfacePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfacePort_InterfaceName(), theEcorePackage.getEString(), "interfaceName", null, 0, 1, InterfacePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfacePort_Kind(), this.getInterfaceKind(), "kind", null, 0, 1, InterfacePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configModelEClass, ConfigModel.class, "ConfigModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigModel_EventsToTrace(), this.getEventConfig(), null, "eventsToTrace", null, 0, -1, ConfigModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventConfigEClass, EventConfig.class, "EventConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		initEReference(getRunnablePairingConstraint_Group(), this.getRunnableGroup(), null, "group", null, 1, 1, RunnablePairingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPairingConstraintEClass, ProcessPairingConstraint.class, "ProcessPairingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessPairingConstraint_Group(), this.getProcessGroup(), null, "group", null, 1, 1, ProcessPairingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPairingConstraintEClass, DataPairingConstraint.class, "DataPairingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPairingConstraint_Group(), this.getLabelGroup(), null, "group", null, 1, 1, DataPairingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableConstraintTargetEClass, RunnableConstraintTarget.class, "RunnableConstraintTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processConstraintTargetEClass, ProcessConstraintTarget.class, "ProcessConstraintTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataConstraintTargetEClass, DataConstraintTarget.class, "DataConstraintTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetMemoryEClass, TargetMemory.class, "TargetMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetMemory_Memories(), this.getMemory(), null, "memories", null, 0, -1, TargetMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetCoreEClass, TargetCore.class, "TargetCore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetCore_Cores(), this.getProcessingUnit(), null, "cores", null, 0, -1, TargetCore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getAbstractEventChain_Stimulus(), this.getEvent(), null, "stimulus", null, 1, 1, AbstractEventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEventChain_Response(), this.getEvent(), null, "response", null, 1, 1, AbstractEventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEventChain_Segments(), this.getEventChainItem(), null, "segments", null, 0, -1, AbstractEventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEventChain_Strands(), this.getEventChainItem(), null, "strands", null, 0, -1, AbstractEventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainEClass, EventChain.class, "EventChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subEventChainEClass, SubEventChain.class, "SubEventChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventChainItemEClass, EventChainItem.class, "EventChainItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEventChainItem__GetEventChain(), this.getAbstractEventChain(), "getEventChain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eventChainReferenceEClass, EventChainReference.class, "EventChainReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainReference_EventChain(), this.getEventChain(), null, "eventChain", null, 1, 1, EventChainReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainContainerEClass, EventChainContainer.class, "EventChainContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainContainer_EventChain(), this.getSubEventChain(), null, "eventChain", null, 1, 1, EventChainContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingConstraintEClass, TimingConstraint.class, "TimingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalSectionConstraintEClass, PhysicalSectionConstraint.class, "PhysicalSectionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalSectionConstraint_Section(), this.getSection(), null, "section", null, 1, 1, PhysicalSectionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSectionConstraint_Memories(), this.getMemory(), null, "memories", null, 1, -1, PhysicalSectionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationConstraintEClass, SynchronizationConstraint.class, "SynchronizationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchronizationConstraint_MultipleOccurrencesAllowed(), theEcorePackage.getEBoolean(), "multipleOccurrencesAllowed", "false", 0, 1, SynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronizationConstraint_Tolerance(), this.getTime(), null, "tolerance", null, 1, 1, SynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSynchronizationConstraintEClass, EventSynchronizationConstraint.class, "EventSynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventSynchronizationConstraint_Events(), this.getEntityEvent(), null, "events", null, 1, -1, EventSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainSynchronizationConstraintEClass, EventChainSynchronizationConstraint.class, "EventChainSynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainSynchronizationConstraint_Scope(), this.getEventChain(), null, "scope", null, 2, 2, EventChainSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventChainSynchronizationConstraint_Type(), this.getSynchronizationType(), "type", null, 0, 1, EventChainSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayConstraintEClass, DelayConstraint.class, "DelayConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayConstraint_MappingType(), this.getMappingType(), "mappingType", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Source(), this.getEntityEvent(), null, "source", null, 1, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Target(), this.getEntityEvent(), null, "target", null, 1, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Upper(), this.getTime(), null, "upper", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Lower(), this.getTime(), null, "lower", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainLatencyConstraintEClass, EventChainLatencyConstraint.class, "EventChainLatencyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainLatencyConstraint_Scope(), this.getEventChain(), null, "scope", null, 1, 1, EventChainLatencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventChainLatencyConstraint_Type(), this.getLatencyType(), "type", null, 0, 1, EventChainLatencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChainLatencyConstraint_Minimum(), this.getTime(), null, "minimum", null, 0, 1, EventChainLatencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChainLatencyConstraint_Maximum(), this.getTime(), null, "maximum", null, 0, 1, EventChainLatencyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repetitionConstraintEClass, RepetitionConstraint.class, "RepetitionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepetitionConstraint_Event(), this.getEntityEvent(), null, "event", null, 1, 1, RepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getRequirement_Severity(), this.getSeverity(), "severity", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Limit(), this.getRequirementLimit(), null, "limit", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processRequirementEClass, ProcessRequirement.class, "ProcessRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessRequirement_Process(), this.getAbstractProcess(), null, "process", null, 1, 1, ProcessRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableRequirementEClass, RunnableRequirement.class, "RunnableRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableRequirement_Runnable(), this.getRunnable(), null, "runnable", null, 1, 1, RunnableRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureRequirementEClass, ArchitectureRequirement.class, "ArchitectureRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureRequirement_Component(), this.getComponent(), null, "component", null, 1, 1, ArchitectureRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processChainRequirementEClass, ProcessChainRequirement.class, "ProcessChainRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessChainRequirement_ProcessChain(), this.getProcessChain(), null, "processChain", null, 1, 1, ProcessChainRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementLimitEClass, RequirementLimit.class, "RequirementLimit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementLimit_LimitType(), this.getLimitType(), "limitType", null, 0, 1, RequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuPercentageRequirementLimitEClass, CPUPercentageRequirementLimit.class, "CPUPercentageRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPUPercentageRequirementLimit_Metric(), this.getCPUPercentageMetric(), "metric", null, 0, 1, CPUPercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCPUPercentageRequirementLimit_LimitValue(), theEcorePackage.getEDouble(), "limitValue", "0.0", 0, 1, CPUPercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCPUPercentageRequirementLimit_HardwareContext(), this.getProcessingUnit(), null, "hardwareContext", null, 0, 1, CPUPercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyRequirementLimitEClass, FrequencyRequirementLimit.class, "FrequencyRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequencyRequirementLimit_Metric(), this.getFrequencyMetric(), "metric", null, 0, 1, FrequencyRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyRequirementLimit_LimitValue(), this.getFrequency(), null, "limitValue", null, 1, 1, FrequencyRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(percentageRequirementLimitEClass, PercentageRequirementLimit.class, "PercentageRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageRequirementLimit_Metric(), this.getPercentageMetric(), "metric", null, 0, 1, PercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageRequirementLimit_LimitValue(), theEcorePackage.getEDouble(), "limitValue", "0.0", 0, 1, PercentageRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countRequirementLimitEClass, CountRequirementLimit.class, "CountRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountRequirementLimit_Metric(), this.getCountMetric(), "metric", null, 0, 1, CountRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountRequirementLimit_LimitValue(), theEcorePackage.getEInt(), "limitValue", "0", 0, 1, CountRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRequirementLimitEClass, TimeRequirementLimit.class, "TimeRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRequirementLimit_Metric(), this.getTimeMetric(), "metric", null, 0, 1, TimeRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeRequirementLimit_LimitValue(), this.getTime(), null, "limitValue", null, 1, 1, TimeRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCoherencyGroupEClass, DataCoherencyGroup.class, "DataCoherencyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCoherencyGroup_Labels(), this.getLabel(), null, "labels", null, 1, -1, DataCoherencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCoherencyGroup_Scope(), this.getDataGroupScope(), null, "scope", null, 0, 1, DataCoherencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCoherencyGroup_Direction(), this.getCoherencyDirection(), "direction", null, 0, 1, DataCoherencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStabilityGroupEClass, DataStabilityGroup.class, "DataStabilityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataStabilityGroup_Labels(), this.getLabel(), null, "labels", null, 1, -1, DataStabilityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataStabilityGroup_Scope(), this.getDataGroupScope(), null, "scope", null, 0, 1, DataStabilityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataGroupScopeEClass, DataGroupScope.class, "DataGroupScope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		initEReference(getEventSet_Events(), this.getEntityEvent(), null, "events", null, 1, -1, EventSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEventEClass, EntityEvent.class, "EntityEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerEventEClass, TriggerEvent.class, "TriggerEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customEventEClass, CustomEvent.class, "CustomEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomEvent_EventType(), theEcorePackage.getEString(), "eventType", null, 0, 1, CustomEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomEvent_ExplicitTriggers(), this.getCustomEventTrigger(), null, "explicitTriggers", null, 0, -1, CustomEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stimulusEventEClass, StimulusEvent.class, "StimulusEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStimulusEvent_Entity(), this.getStimulus(), null, "entity", null, 0, 1, StimulusEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEventEClass, ProcessEvent.class, "ProcessEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessEvent_EventType(), this.getProcessEventType(), "eventType", null, 0, 1, ProcessEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessEvent_Entity(), this.getProcess(), null, "entity", null, 0, 1, ProcessEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessEvent_ProcessingUnit(), this.getProcessingUnit(), null, "processingUnit", null, 0, 1, ProcessEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processChainEventEClass, ProcessChainEvent.class, "ProcessChainEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessChainEvent_EventType(), this.getProcessEventType(), "eventType", null, 0, 1, ProcessChainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessChainEvent_Entity(), this.getProcessChain(), null, "entity", null, 0, 1, ProcessChainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessChainEvent_ProcessingUnit(), this.getProcessingUnit(), null, "processingUnit", null, 0, 1, ProcessChainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableEventEClass, RunnableEvent.class, "RunnableEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunnableEvent_EventType(), this.getRunnableEventType(), "eventType", null, 0, 1, RunnableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEvent_Entity(), this.getRunnable(), null, "entity", null, 0, 1, RunnableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEvent_Process(), this.getProcess(), null, "process", null, 0, 1, RunnableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableEvent_ProcessingUnit(), this.getProcessingUnit(), null, "processingUnit", null, 0, 1, RunnableEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEventEClass, LabelEvent.class, "LabelEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelEvent_EventType(), this.getLabelEventType(), "eventType", null, 0, 1, LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelEvent_Entity(), this.getLabel(), null, "entity", null, 0, 1, LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelEvent_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelEvent_Process(), this.getProcess(), null, "process", null, 0, 1, LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEventEClass, ChannelEvent.class, "ChannelEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelEvent_EventType(), this.getChannelEventType(), "eventType", null, 0, 1, ChannelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelEvent_Entity(), this.getChannel(), null, "entity", null, 0, 1, ChannelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelEvent_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, ChannelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelEvent_Process(), this.getProcess(), null, "process", null, 0, 1, ChannelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semaphoreEventEClass, SemaphoreEvent.class, "SemaphoreEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemaphoreEvent_EventType(), this.getSemaphoreEventType(), "eventType", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreEvent_Entity(), this.getSemaphore(), null, "entity", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreEvent_Runnable(), this.getRunnable(), null, "runnable", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreEvent_Process(), this.getProcess(), null, "process", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphoreEvent_ProcessingUnit(), this.getProcessingUnit(), null, "processingUnit", null, 0, 1, SemaphoreEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEventEClass, ComponentEvent.class, "ComponentEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentEvent_EventType(), this.getComponentEventType(), "eventType", null, 0, 1, ComponentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentEvent_Entity(), this.getComponent(), null, "entity", null, 0, 1, ComponentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwModelEClass, HWModel.class, "HWModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWModel_Definitions(), this.getHwDefinition(), null, "definitions", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_FeatureCategories(), this.getHwFeatureCategory(), null, "featureCategories", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_Structures(), this.getHwStructure(), null, "structures", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHWModel_Domains(), this.getHwDomain(), null, "domains", null, 0, -1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwStructureEClass, HwStructure.class, "HwStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHwStructure_StructureType(), this.getStructureType(), "structureType", null, 0, 1, HwStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwStructure_Ports(), this.getHwPort(), null, "ports", null, 0, -1, HwStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwStructure_Structures(), this.getHwStructure(), null, "structures", null, 0, -1, HwStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwStructure_Modules(), this.getHwModule(), null, "modules", null, 0, -1, HwStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwStructure_Connections(), this.getHwConnection(), null, "connections", null, 0, -1, HwStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwStructure_InnerPorts(), this.getHwPort(), null, "innerPorts", null, 0, -1, HwStructure.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hwModuleEClass, HwModule.class, "HwModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwModule_Ports(), this.getHwPort(), null, "ports", null, 0, -1, HwModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwModule_PowerDomain(), this.getPowerDomain(), null, "powerDomain", null, 0, 1, HwModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwModule_FrequencyDomain(), this.getFrequencyDomain(), null, "frequencyDomain", null, 0, 1, HwModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwDomainEClass, HwDomain.class, "HwDomain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frequencyDomainEClass, FrequencyDomain.class, "FrequencyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrequencyDomain_DefaultValue(), this.getFrequency(), null, "defaultValue", null, 0, 1, FrequencyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequencyDomain_ClockGating(), theEcorePackage.getEBoolean(), "clockGating", "false", 0, 1, FrequencyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerDomainEClass, PowerDomain.class, "PowerDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerDomain_DefaultValue(), this.getVoltage(), null, "defaultValue", null, 0, 1, PowerDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerDomain_PowerGating(), theEcorePackage.getEBoolean(), "powerGating", "false", 0, 1, PowerDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingUnitEClass, ProcessingUnit.class, "ProcessingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingUnit_Definition(), this.getProcessingUnitDefinition(), null, "definition", null, 0, 1, ProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingUnit_AccessElements(), this.getHwAccessElement(), this.getHwAccessElement_Source(), "accessElements", null, 0, -1, ProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingUnit_Caches(), this.getCache(), null, "caches", null, 0, -1, ProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemory_Definition(), this.getMemoryDefinition(), null, "definition", null, 0, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_Mappings(), this.getMemoryMapping(), null, "mappings", null, 0, -1, Memory.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCache_Definition(), this.getCacheDefinition(), null, "definition", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwFeatureCategoryEClass, HwFeatureCategory.class, "HwFeatureCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHwFeatureCategory_FeatureType(), this.getHwFeatureType(), "featureType", null, 0, 1, HwFeatureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwFeatureCategory_Description(), theEcorePackage.getEString(), "description", null, 0, 1, HwFeatureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwFeatureCategory_Features(), this.getHwFeature(), this.getHwFeature_ContainingCategory(), "features", null, 0, -1, HwFeatureCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwFeatureEClass, HwFeature.class, "HwFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwFeature_ContainingCategory(), this.getHwFeatureCategory(), this.getHwFeatureCategory_Features(), "containingCategory", null, 0, 1, HwFeature.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwFeature_Value(), theEcorePackage.getEDouble(), "value", "0.0", 0, 1, HwFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHwFeature__GetNamePrefix(), theEcorePackage.getEString(), "getNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getHwFeature__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(hwPortEClass, HwPort.class, "HwPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHwPort_BitWidth(), theEcorePackage.getEInt(), "bitWidth", "0", 0, 1, HwPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwPort_Priority(), theEcorePackage.getEInt(), "priority", "0", 0, 1, HwPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwPort_PortType(), this.getPortType(), "portType", null, 0, 1, HwPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwPort_PortInterface(), this.getPortInterface(), "portInterface", null, 0, 1, HwPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwPort_Delegated(), theEcorePackage.getEBoolean(), "delegated", null, 0, 1, HwPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHwPort_Connections(), this.getHwConnection(), null, "connections", null, 0, -1, HwPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getHwPort__GetNamePrefix(), theEcorePackage.getEString(), "getNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(connectionHandlerEClass, ConnectionHandler.class, "ConnectionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionHandler_Definition(), this.getConnectionHandlerDefinition(), null, "definition", null, 0, 1, ConnectionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionHandler_InternalConnections(), this.getHwConnection(), null, "internalConnections", null, 0, -1, ConnectionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwConnectionEClass, HwConnection.class, "HwConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwConnection_ReadLatency(), this.getIDiscreteValueDeviation(), null, "readLatency", null, 0, 1, HwConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwConnection_WriteLatency(), this.getIDiscreteValueDeviation(), null, "writeLatency", null, 0, 1, HwConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwConnection_DataRate(), this.getDataRate(), null, "dataRate", null, 0, 1, HwConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwConnection_Port1(), this.getHwPort(), null, "port1", null, 0, 1, HwConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwConnection_Port2(), this.getHwPort(), null, "port2", null, 0, 1, HwConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwConnection_Internal(), theEcorePackage.getEBoolean(), "internal", null, 0, 1, HwConnection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getHwConnection__GetNamePrefix(), theEcorePackage.getEString(), "getNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getHwConnection__GetPorts(), this.getHwPort(), "getPorts", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(hwAccessElementEClass, HwAccessElement.class, "HwAccessElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwAccessElement_Source(), this.getProcessingUnit(), this.getProcessingUnit_AccessElements(), "source", null, 0, 1, HwAccessElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwAccessElement_Destination(), this.getHwDestination(), null, "destination", null, 1, 1, HwAccessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwAccessElement_AccessPath(), this.getHwAccessPath(), this.getHwAccessPath_ContainingAccessElement(), "accessPath", null, 0, 1, HwAccessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwAccessElement_ReadLatency(), this.getIDiscreteValueDeviation(), null, "readLatency", null, 0, 1, HwAccessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwAccessElement_WriteLatency(), this.getIDiscreteValueDeviation(), null, "writeLatency", null, 0, 1, HwAccessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwAccessElement_DataRate(), this.getDataRate(), null, "dataRate", null, 0, 1, HwAccessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwDefinitionEClass, HwDefinition.class, "HwDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingUnitDefinitionEClass, ProcessingUnitDefinition.class, "ProcessingUnitDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingUnitDefinition_PuType(), this.getPuType(), "puType", null, 0, 1, ProcessingUnitDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingUnitDefinition_Features(), this.getHwFeature(), null, "features", null, 0, -1, ProcessingUnitDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingUnitDefinition_Classifiers(), this.getCoreClassifier(), null, "classifiers", null, 0, -1, ProcessingUnitDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionHandlerDefinitionEClass, ConnectionHandlerDefinition.class, "ConnectionHandlerDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionHandlerDefinition_Policy(), this.getSchedPolicy(), "policy", null, 0, 1, ConnectionHandlerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionHandlerDefinition_ReadLatency(), this.getIDiscreteValueDeviation(), null, "readLatency", null, 0, 1, ConnectionHandlerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionHandlerDefinition_WriteLatency(), this.getIDiscreteValueDeviation(), null, "writeLatency", null, 0, 1, ConnectionHandlerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionHandlerDefinition_DataRate(), this.getDataRate(), null, "dataRate", null, 0, 1, ConnectionHandlerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionHandlerDefinition_MaxBurstSize(), this.getPositiveInt(), "maxBurstSize", "1", 0, 1, ConnectionHandlerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionHandlerDefinition_MaxConcurrentTransfers(), this.getPositiveInt(), "maxConcurrentTransfers", "1", 0, 1, ConnectionHandlerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryDefinitionEClass, MemoryDefinition.class, "MemoryDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryDefinition_Size(), this.getDataSize(), null, "size", null, 0, 1, MemoryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryDefinition_AccessLatency(), this.getIDiscreteValueDeviation(), null, "accessLatency", null, 0, 1, MemoryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryDefinition_DataRate(), this.getDataRate(), null, "dataRate", null, 0, 1, MemoryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryDefinition_MemoryType(), this.getMemoryType(), "memoryType", null, 0, 1, MemoryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryDefinition_Classifiers(), this.getMemoryClassifier(), null, "classifiers", null, 0, -1, MemoryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheDefinitionEClass, CacheDefinition.class, "CacheDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCacheDefinition_Size(), this.getDataSize(), null, "size", null, 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheDefinition_LineSize(), this.getDataSize(), null, "lineSize", null, 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheDefinition_AccessLatency(), this.getIDiscreteValueDeviation(), null, "accessLatency", null, 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDefinition_CacheType(), this.getCacheType(), "cacheType", null, 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDefinition_WriteStrategy(), this.getWriteStrategy(), "writeStrategy", null, 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDefinition_NWays(), theEcorePackage.getEInt(), "nWays", "0", 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDefinition_Coherency(), theEcorePackage.getEBoolean(), "coherency", "false", 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDefinition_Exclusive(), theEcorePackage.getEBoolean(), "exclusive", "false", 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDefinition_HitRate(), theEcorePackage.getEDouble(), "hitRate", "0.0", 0, 1, CacheDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPathEClass, HwPath.class, "HwPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwPath_Source(), this.getProcessingUnit(), null, "source", null, 0, 1, HwPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHwPath_Destination(), this.getHwDestination(), null, "destination", null, 0, 1, HwPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getHwPath__GetContainingAccessElement(), this.getHwAccessElement(), "getContainingAccessElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(hwAccessPathEClass, HwAccessPath.class, "HwAccessPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwAccessPath_ContainingAccessElement(), this.getHwAccessElement(), this.getHwAccessElement_AccessPath(), "containingAccessElement", null, 0, 1, HwAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwAccessPath_PathElements(), this.getHwPathElement(), null, "pathElements", null, 1, -1, HwAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwAccessPath_StartAddress(), this.getAddress(), "startAddress", "0", 0, 1, HwAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwAccessPath_EndAddress(), this.getAddress(), "endAddress", "0", 0, 1, HwAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHwAccessPath_MemOffset(), this.getAddress(), "memOffset", "0", 0, 1, HwAccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPathElementEClass, HwPathElement.class, "HwPathElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHwPathElement__GetPorts(), this.getHwPort(), "getPorts", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(hwDestinationEClass, HwDestination.class, "HwDestination", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHwDestination__GetPorts(), this.getHwPort(), "getPorts", 0, -1, !IS_UNIQUE, IS_ORDERED);

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
		initEReference(getSchedulerAllocation_Responsibility(), this.getProcessingUnit(), null, "responsibility", null, 1, -1, SchedulerAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAllocation_ExecutingPU(), this.getProcessingUnit(), null, "executingPU", null, 0, 1, SchedulerAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskAllocationEClass, TaskAllocation.class, "TaskAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskAllocation_Task(), this.getTask(), null, "task", null, 1, 1, TaskAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAllocation_Scheduler(), this.getTaskScheduler(), null, "scheduler", null, 1, 1, TaskAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAllocation_Affinity(), this.getProcessingUnit(), null, "affinity", null, 0, -1, TaskAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getMemoryMapping_MemoryPositionAddress(), this.getAddress(), "memoryPositionAddress", "0", 0, 1, MemoryMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalSectionMappingEClass, PhysicalSectionMapping.class, "PhysicalSectionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalSectionMapping_Origin(), this.getSection(), null, "origin", null, 1, -1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSectionMapping_Memory(), this.getMemory(), null, "memory", null, 1, 1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalSectionMapping_StartAddress(), this.getAddress(), "startAddress", "0", 0, 1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalSectionMapping_EndAddress(), this.getAddress(), "endAddress", "0", 0, 1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSectionMapping_Labels(), this.getLabel(), null, "labels", null, 0, -1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalSectionMapping_RunEntities(), this.getRunnable(), null, "runEntities", null, 0, -1, PhysicalSectionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osModelEClass, OSModel.class, "OSModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSModel_Semaphores(), this.getSemaphore(), null, "semaphores", null, 0, -1, OSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSModel_OperatingSystems(), this.getOperatingSystem(), null, "operatingSystems", null, 0, -1, OSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSModel_OsOverheads(), this.getOsOverhead(), null, "osOverheads", null, 0, -1, OSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getSemaphore_SemaphoreAccesses(), this.getSemaphoreAccess(), null, "semaphoreAccesses", null, 0, -1, Semaphore.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSemaphore_ReferringComponents(), this.getComponent(), null, "referringComponents", null, 0, -1, Semaphore.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(schedulerEClass, Scheduler.class, "Scheduler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScheduler_ComputationItems(), this.getComputationItem(), null, "computationItems", null, 0, -1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_SchedulerAllocations(), this.getSchedulerAllocation(), null, "schedulerAllocations", null, 0, -1, Scheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getScheduler_RunnableAllocations(), this.getRunnableAllocation(), null, "runnableAllocations", null, 0, -1, Scheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getScheduler__GetSchedulingAlgorithm(), this.getAlgorithm(), "getSchedulingAlgorithm", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(taskSchedulerEClass, TaskScheduler.class, "TaskScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskScheduler_SchedulingAlgorithm(), this.getTaskSchedulingAlgorithm(), null, "schedulingAlgorithm", null, 0, 1, TaskScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_ParentAssociation(), this.getSchedulerAssociation(), this.getSchedulerAssociation_Child(), "parentAssociation", null, 0, 1, TaskScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_ChildAssociations(), this.getSchedulerAssociation(), null, "childAssociations", null, 0, -1, TaskScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_TaskAllocations(), this.getTaskAllocation(), null, "taskAllocations", null, 0, -1, TaskScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_ParentScheduler(), this.getTaskScheduler(), null, "parentScheduler", null, 0, 1, TaskScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTaskScheduler_ChildSchedulers(), this.getTaskScheduler(), null, "childSchedulers", null, 0, -1, TaskScheduler.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(schedulerAssociationEClass, SchedulerAssociation.class, "SchedulerAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulerAssociation_Child(), this.getTaskScheduler(), this.getTaskScheduler_ParentAssociation(), "child", null, 0, 1, SchedulerAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAssociation_Parent(), this.getTaskScheduler(), null, "parent", null, 0, 1, SchedulerAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAssociation_SchedulingParameters(), this.getSchedulingParameters(), null, "schedulingParameters", null, 0, 1, SchedulerAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulerAssociation_ParameterExtensions(), this.getParameterExtension(), null, "parameterExtensions", null, 0, -1, SchedulerAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptControllerEClass, InterruptController.class, "InterruptController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterruptController_SchedulingAlgorithm(), this.getInterruptSchedulingAlgorithm(), null, "schedulingAlgorithm", null, 0, 1, InterruptController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterruptController_IsrAllocations(), this.getISRAllocation(), null, "isrAllocations", null, 0, -1, InterruptController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		initEReference(getOperatingSystem_Overhead(), this.getOsOverhead(), null, "overhead", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_TaskSchedulers(), this.getTaskScheduler(), null, "taskSchedulers", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_InterruptControllers(), this.getInterruptController(), null, "interruptControllers", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_OsDataConsistency(), this.getOsDataConsistency(), null, "osDataConsistency", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorOperatingSystemEClass, VendorOperatingSystem.class, "VendorOperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendorOperatingSystem_OsName(), theEcorePackage.getEString(), "osName", null, 0, 1, VendorOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorOperatingSystem_Vendor(), theEcorePackage.getEString(), "vendor", null, 0, 1, VendorOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendorOperatingSystem_Version(), theEcorePackage.getEString(), "version", null, 0, 1, VendorOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osOverheadEClass, OsOverhead.class, "OsOverhead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsOverhead_ApiOverhead(), this.getOsAPIOverhead(), null, "apiOverhead", null, 0, 1, OsOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsOverhead_IsrCategory1Overhead(), this.getOsISROverhead(), null, "isrCategory1Overhead", null, 0, 1, OsOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsOverhead_IsrCategory2Overhead(), this.getOsISROverhead(), null, "isrCategory2Overhead", null, 0, 1, OsOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osAPIOverheadEClass, OsAPIOverhead.class, "OsAPIOverhead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsAPIOverhead_ApiSendMessage(), this.getTicks(), null, "apiSendMessage", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiTerminateTask(), this.getTicks(), null, "apiTerminateTask", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiSchedule(), this.getTicks(), null, "apiSchedule", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiRequestResource(), this.getTicks(), null, "apiRequestResource", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiReleaseResource(), this.getTicks(), null, "apiReleaseResource", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiSetEvent(), this.getTicks(), null, "apiSetEvent", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiWaitEvent(), this.getTicks(), null, "apiWaitEvent", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiClearEvent(), this.getTicks(), null, "apiClearEvent", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiActivateTask(), this.getTicks(), null, "apiActivateTask", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiEnforcedMigration(), this.getTicks(), null, "apiEnforcedMigration", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiSuspendOsInterrupts(), this.getTicks(), null, "apiSuspendOsInterrupts", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiResumeOsInterrupts(), this.getTicks(), null, "apiResumeOsInterrupts", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiRequestSpinlock(), this.getTicks(), null, "apiRequestSpinlock", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiReleaseSpinlock(), this.getTicks(), null, "apiReleaseSpinlock", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiSenderReceiverRead(), this.getTicks(), null, "apiSenderReceiverRead", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiSenderReceiverWrite(), this.getTicks(), null, "apiSenderReceiverWrite", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiSynchronousServerCallPoint(), this.getTicks(), null, "apiSynchronousServerCallPoint", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiIocRead(), this.getTicks(), null, "apiIocRead", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsAPIOverhead_ApiIocWrite(), this.getTicks(), null, "apiIocWrite", null, 0, 1, OsAPIOverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osISROverheadEClass, OsISROverhead.class, "OsISROverhead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsISROverhead_PreExecutionOverhead(), this.getTicks(), null, "preExecutionOverhead", null, 0, 1, OsISROverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsISROverhead_PostExecutionOverhead(), this.getTicks(), null, "postExecutionOverhead", null, 0, 1, OsISROverhead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getStimulus_SetModeValueList(), this.getModeValueList(), null, "setModeValueList", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimulus_ExecutionCondition(), this.getModeConditionDisjunction(), null, "executionCondition", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimulus_AffectedProcesses(), this.getProcess(), null, "affectedProcesses", null, 0, -1, Stimulus.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(modeValueListEClass, ModeValueList.class, "ModeValueList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeValueList_Entries(), this.getModeAssignment(), null, "entries", null, 0, -1, ModeValueList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeValueMapEntryEClass, Map.Entry.class, "ModeValueMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeValueMapEntry_Key(), this.getModeLabel(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeValueMapEntry_Value(), theEcorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeValueEClass, ModeValue.class, "ModeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeValue_Label(), this.getModeLabel(), null, "label", null, 1, 1, ModeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeValue_Value(), theEcorePackage.getEString(), "value", null, 1, 1, ModeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModeValue__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModeValue__GetLiteral(), this.getModeLiteral(), "getLiteral", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModeValue__GetInteger(), theEcorePackage.getEIntegerObject(), "getInteger", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(modeAssignmentEClass, ModeAssignment.class, "ModeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modeConditionDisjunctionEClass, ModeConditionDisjunction.class, "ModeConditionDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeConditionDisjunction_Entries(), this.getModeConditionDisjunctionEntry(), null, "entries", null, 1, -1, ModeConditionDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModeConditionDisjunction__IsSatisfiedBy__EMap(), theEcorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeValueMapEntry(), "context", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(modeConditionDisjunctionEntryEClass, ModeConditionDisjunctionEntry.class, "ModeConditionDisjunctionEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getModeConditionDisjunctionEntry__IsSatisfiedBy__EMap(), theEcorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeValueMapEntry(), "assignment", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(modeConditionEClass, ModeCondition.class, "ModeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModeCondition_Relation(), this.getRelationalOperator(), "relation", null, 0, 1, ModeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModeCondition__IsSatisfiedBy__EMap(), theEcorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeValueMapEntry(), "context", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(modeConditionConjunctionEClass, ModeConditionConjunction.class, "ModeConditionConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeConditionConjunction_Entries(), this.getModeCondition(), null, "entries", null, 1, -1, ModeConditionConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModeConditionConjunction__IsSatisfiedBy__EMap(), theEcorePackage.getEBoolean(), "isSatisfiedBy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModeValueMapEntry(), "context", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(fixedPeriodicEClass, FixedPeriodic.class, "FixedPeriodic", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedPeriodic_Offset(), this.getTime(), null, "offset", null, 0, 1, FixedPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixedPeriodic_Recurrence(), this.getTime(), null, "recurrence", null, 0, 1, FixedPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicStimulusEClass, PeriodicStimulus.class, "PeriodicStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicStimulus_Jitter(), this.getITimeDeviation(), null, "jitter", null, 0, 1, PeriodicStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicStimulus_MinDistance(), this.getTime(), null, "minDistance", null, 0, 1, PeriodicStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativePeriodicStimulusEClass, RelativePeriodicStimulus.class, "RelativePeriodicStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelativePeriodicStimulus_Offset(), this.getTime(), null, "offset", null, 0, 1, RelativePeriodicStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelativePeriodicStimulus_NextOccurrence(), this.getITimeDeviation(), null, "nextOccurrence", null, 0, 1, RelativePeriodicStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRateStimulusEClass, VariableRateStimulus.class, "VariableRateStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableRateStimulus_Step(), this.getTime(), null, "step", null, 1, 1, VariableRateStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableRateStimulus_OccurrencesPerStep(), this.getIContinuousValueDeviation(), null, "occurrencesPerStep", null, 0, 1, VariableRateStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableRateStimulus_MaxIncreasePerStep(), theEcorePackage.getEDoubleObject(), "maxIncreasePerStep", null, 0, 1, VariableRateStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableRateStimulus_MaxDecreasePerStep(), theEcorePackage.getEDoubleObject(), "maxDecreasePerStep", null, 0, 1, VariableRateStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableRateStimulus_Scenario(), this.getScenario(), null, "scenario", null, 0, 1, VariableRateStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Clock(), this.getClock(), null, "clock", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_SamplingOffset(), this.getNonNegativeDouble(), "samplingOffset", "0.0", 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_SamplingRecurrence(), this.getNonNegativeDouble(), "samplingRecurrence", "1.0", 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicSyntheticStimulusEClass, PeriodicSyntheticStimulus.class, "PeriodicSyntheticStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicSyntheticStimulus_OccurrenceTimes(), this.getTime(), null, "occurrenceTimes", null, 1, -1, PeriodicSyntheticStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customStimulusEClass, CustomStimulus.class, "CustomStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomStimulus_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CustomStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleStimulusEClass, SingleStimulus.class, "SingleStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleStimulus_Occurrence(), this.getTime(), null, "occurrence", null, 1, 1, SingleStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interProcessStimulusEClass, InterProcessStimulus.class, "InterProcessStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterProcessStimulus_Counter(), this.getCounter(), null, "counter", null, 0, 1, InterProcessStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterProcessStimulus_ExplicitTriggers(), this.getInterProcessTrigger(), null, "explicitTriggers", null, 0, -1, InterProcessStimulus.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(periodicBurstStimulusEClass, PeriodicBurstStimulus.class, "PeriodicBurstStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicBurstStimulus_BurstLength(), this.getTime(), null, "burstLength", null, 1, 1, PeriodicBurstStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicBurstStimulus_OccurrenceMinDistance(), this.getTime(), null, "occurrenceMinDistance", null, 0, 1, PeriodicBurstStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicBurstStimulus_OccurrenceCount(), theEcorePackage.getEInt(), "occurrenceCount", "0", 0, 1, PeriodicBurstStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventStimulusEClass, EventStimulus.class, "EventStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventStimulus_TriggeringEvents(), this.getTriggerEvent(), null, "triggeringEvents", null, 1, -1, EventStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventStimulus_Counter(), this.getCounter(), null, "counter", null, 0, 1, EventStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalCurveStimulusEClass, ArrivalCurveStimulus.class, "ArrivalCurveStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrivalCurveStimulus_Entries(), this.getArrivalCurveEntry(), null, "entries", null, 1, -1, ArrivalCurveStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalCurveEntryEClass, ArrivalCurveEntry.class, "ArrivalCurveEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrivalCurveEntry_NumberOfOccurrences(), theEcorePackage.getEInt(), "numberOfOccurrences", "0", 0, 1, ArrivalCurveEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrivalCurveEntry_LowerTimeBorder(), this.getTime(), null, "lowerTimeBorder", null, 0, 1, ArrivalCurveEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrivalCurveEntry_UpperTimeBorder(), this.getTime(), null, "upperTimeBorder", null, 0, 1, ArrivalCurveEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockEClass, Clock.class, "Clock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockFunctionEClass, ClockFunction.class, "ClockFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClockFunction_CurveType(), this.getCurveType(), "curveType", null, 0, 1, ClockFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockFunction_Period(), this.getTime(), null, "period", null, 1, 1, ClockFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockFunction_PeakToPeak(), this.getFrequency(), null, "peakToPeak", null, 1, 1, ClockFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockFunction_XOffset(), this.getTime(), null, "xOffset", null, 0, 1, ClockFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockFunction_YOffset(), this.getFrequency(), null, "yOffset", null, 0, 1, ClockFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockStepListEClass, ClockStepList.class, "ClockStepList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockStepList_Entries(), this.getClockStep(), null, "entries", null, 1, -1, ClockStepList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockStepList_Period(), this.getTime(), null, "period", null, 0, 1, ClockStepList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockStepEClass, ClockStep.class, "ClockStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockStep_Frequency(), this.getFrequency(), null, "frequency", null, 1, 1, ClockStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockStep_Time(), this.getTime(), null, "time", null, 1, 1, ClockStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		op = initEOperation(getSWModel__ModeLiteral__String_String(), this.getModeLiteral(), "modeLiteral", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "mode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "literal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractMemoryElementEClass, AbstractMemoryElement.class, "AbstractMemoryElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMemoryElement_Size(), this.getDataSize(), null, "size", null, 0, 1, AbstractMemoryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMemoryElement_Mappings(), this.getMemoryMapping(), null, "mappings", null, 0, -1, AbstractMemoryElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractProcessEClass, AbstractProcess.class, "AbstractProcess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractProcess_ReferringComponents(), this.getComponent(), null, "referringComponents", null, 0, -1, AbstractProcess.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(customEntityEClass, CustomEntity.class, "CustomEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomEntity_TypeName(), theEcorePackage.getEString(), "typeName", null, 0, 1, CustomEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processChainEClass, ProcessChain.class, "ProcessChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessChain_Processes(), this.getProcess(), null, "processes", null, 0, -1, ProcessChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, org.eclipse.app4mc.amalthea.model.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_CallGraph(), this.getCallGraph(), null, "callGraph", null, 0, 1, org.eclipse.app4mc.amalthea.model.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Stimuli(), this.getStimulus(), null, "stimuli", null, 0, -1, org.eclipse.app4mc.amalthea.model.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iCallGraphItemContainerEClass, ICallGraphItemContainer.class, "ICallGraphItemContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getICallGraphItemContainer_Items(), this.getCallGraphItem(), null, "items", null, 0, -1, ICallGraphItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callGraphEClass, CallGraph.class, "CallGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callGraphItemEClass, CallGraphItem.class, "CallGraphItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallGraphItem_ContainingProcess(), this.getProcess(), null, "containingProcess", null, 0, 1, CallGraphItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCallGraphItem_ContainingRunnable(), this.getRunnable(), null, "containingRunnable", null, 0, 1, CallGraphItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(modeSwitchEClass, ModeSwitch.class, "ModeSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeSwitch_Entries(), this.getModeSwitchEntry(), null, "entries", null, 0, -1, ModeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeSwitch_DefaultEntry(), this.getModeSwitchDefault(), null, "defaultEntry", null, 0, 1, ModeSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeSwitchEntryEClass, ModeSwitchEntry.class, "ModeSwitchEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeSwitchEntry_Condition(), this.getModeConditionDisjunction(), null, "condition", null, 1, 1, ModeSwitchEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeSwitchDefaultEClass, ModeSwitchDefault.class, "ModeSwitchDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(probabilitySwitchEClass, ProbabilitySwitch.class, "ProbabilitySwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbabilitySwitch_Entries(), this.getProbabilitySwitchEntry(), null, "entries", null, 0, -1, ProbabilitySwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilitySwitchEntryEClass, ProbabilitySwitchEntry.class, "ProbabilitySwitchEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilitySwitchEntry_Probability(), theEcorePackage.getEDouble(), "probability", "0.0", 0, 1, ProbabilitySwitchEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCounter_Prescaler(), this.getPositiveLong(), "prescaler", "1", 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_Offset(), this.getNonNegativeLong(), "offset", "0", 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEventEClass, WaitEvent.class, "WaitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaitEvent_EventMask(), this.getEventMask(), null, "eventMask", null, 0, 1, WaitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitEvent_MaskType(), this.getWaitEventType(), "maskType", null, 0, 1, WaitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaitEvent_WaitingBehaviour(), this.getWaitingBehaviour(), "waitingBehaviour", null, 0, 1, WaitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWaitEvent_Counter(), this.getCounter(), null, "counter", null, 0, 1, WaitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setEventEClass, SetEvent.class, "SetEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetEvent_EventMask(), this.getEventMask(), null, "eventMask", null, 0, 1, SetEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetEvent_Process(), this.getProcess(), null, "process", null, 0, 1, SetEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetEvent_Counter(), this.getCounter(), null, "counter", null, 0, 1, SetEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearEventEClass, ClearEvent.class, "ClearEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearEvent_EventMask(), this.getEventMask(), null, "eventMask", null, 0, 1, ClearEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClearEvent_Counter(), this.getCounter(), null, "counter", null, 0, 1, ClearEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventMaskEClass, EventMask.class, "EventMask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventMask_Events(), this.getOsEvent(), null, "events", null, 0, -1, EventMask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osEventEClass, OsEvent.class, "OsEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsEvent_CommunicationOverheadInBit(), theEcorePackage.getEInt(), "communicationOverheadInBit", "0", 0, 1, OsEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsEvent_ReferringComponents(), this.getComponent(), null, "referringComponents", null, 0, -1, OsEvent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interProcessTriggerEClass, InterProcessTrigger.class, "InterProcessTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterProcessTrigger_Stimulus(), this.getInterProcessStimulus(), null, "stimulus", null, 1, 1, InterProcessTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterProcessTrigger_Counter(), this.getCounter(), null, "counter", null, 0, 1, InterProcessTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enforcedMigrationEClass, EnforcedMigration.class, "EnforcedMigration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnforcedMigration_ResourceOwner(), this.getTaskScheduler(), null, "resourceOwner", null, 1, 1, EnforcedMigration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulePointEClass, SchedulePoint.class, "SchedulePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminateProcessEClass, TerminateProcess.class, "TerminateProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminateProcess_Counter(), this.getCounter(), null, "counter", null, 0, 1, TerminateProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getProcessPrototype_RunnableCalls(), this.getRunnableCall(), null, "runnableCalls", null, 0, -1, ProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainedProcessPrototypeEClass, ChainedProcessPrototype.class, "ChainedProcessPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainedProcessPrototype_Prototype(), this.getProcessPrototype(), null, "prototype", null, 1, 1, ChainedProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChainedProcessPrototype_Apply(), theEcorePackage.getEInt(), "apply", "0", 0, 1, ChainedProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChainedProcessPrototype_Offset(), theEcorePackage.getEInt(), "offset", "0", 0, 1, ChainedProcessPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalPrecedenceEClass, GeneralPrecedence.class, "GeneralPrecedence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralPrecedence_Origin(), this.getRunnable(), null, "origin", null, 0, 1, GeneralPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralPrecedence_Target(), this.getRunnable(), null, "target", null, 0, 1, GeneralPrecedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessPrecedenceSpecEClass, AccessPrecedenceSpec.class, "AccessPrecedenceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessPrecedenceSpec_Label(), this.getLabel(), null, "label", null, 1, 1, AccessPrecedenceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessPrecedenceSpec_OrderType(), this.getAccessPrecedenceType(), "orderType", null, 0, 1, AccessPrecedenceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderPrecedenceSpecEClass, OrderPrecedenceSpec.class, "OrderPrecedenceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderPrecedenceSpec_OrderType(), this.getOrderType(), "orderType", null, 0, 1, OrderPrecedenceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataDependencyEClass, DataDependency.class, "DataDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataDependency_Labels(), this.getLabel(), null, "labels", null, 0, -1, DataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataDependency_Parameters(), this.getRunnableParameter(), null, "parameters", null, 0, -1, DataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataDependency_CallArguments(), this.getCallArgument(), null, "callArguments", null, 0, -1, DataDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataDependency_ContainingRunnable(), this.getRunnable(), null, "containingRunnable", null, 0, 1, DataDependency.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(runnableParameterEClass, RunnableParameter.class, "RunnableParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableParameter_ContainingRunnable(), this.getRunnable(), this.getRunnable_Parameters(), "containingRunnable", null, 0, 1, RunnableParameter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnableParameter_Direction(), this.getDirectionType(), "direction", null, 0, 1, RunnableParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableParameter_DataType(), this.getTypeDefinition(), null, "dataType", null, 0, 1, RunnableParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableParameter_DependsOn(), this.getDataDependency(), null, "dependsOn", null, 0, 1, RunnableParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRunnableParameter__GetNamePrefix(), theEcorePackage.getEString(), "getNamePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRunnableParameter__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(runnableEClass, org.eclipse.app4mc.amalthea.model.Runnable.class, "Runnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnable_ExecutionCondition(), this.getModeConditionDisjunction(), null, "executionCondition", null, 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_Parameters(), this.getRunnableParameter(), this.getRunnableParameter_ContainingRunnable(), "parameters", null, 0, -1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_CallGraph(), this.getCallGraph(), null, "callGraph", null, 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_Activations(), this.getActivation(), null, "activations", null, 0, -1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnable_Callback(), theEcorePackage.getEBoolean(), "callback", "false", 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnable_Service(), theEcorePackage.getEBoolean(), "service", "false", 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunnable_AsilLevel(), this.getASILType(), "asilLevel", null, 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_Section(), this.getSection(), null, "section", null, 0, 1, org.eclipse.app4mc.amalthea.model.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_RunnableCalls(), this.getRunnableCall(), null, "runnableCalls", null, 0, -1, org.eclipse.app4mc.amalthea.model.Runnable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRunnable_ReferringComponents(), this.getComponent(), null, "referringComponents", null, 0, -1, org.eclipse.app4mc.amalthea.model.Runnable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getRunnable__GetRunnableItems(), this.getCallGraphItem(), "getRunnableItems", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRunnable__GetFirstActivation(), this.getActivation(), "getFirstActivation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabel_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Constant(), theEcorePackage.getEBoolean(), "constant", "false", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_BVolatile(), theEcorePackage.getEBoolean(), "bVolatile", "false", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_DataStability(), this.getLabelDataStability(), "dataStability", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_StabilityLevel(), this.getDataStabilityLevel(), "stabilityLevel", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_Section(), this.getSection(), null, "section", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_LabelAccesses(), this.getLabelAccess(), null, "labelAccesses", null, 0, -1, Label.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_ReferringComponents(), this.getComponent(), null, "referringComponents", null, 0, -1, Label.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_ElementType(), this.getDataType(), null, "elementType", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_DefaultElements(), theEcorePackage.getEInt(), "defaultElements", "0", 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_MaxElements(), theEcorePackage.getEInt(), "maxElements", "0", 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_ChannelAccesses(), this.getChannelAccess(), null, "channelAccesses", null, 0, -1, Channel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(modeLabelEClass, ModeLabel.class, "ModeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeLabel_Mode(), this.getMode(), null, "mode", null, 1, 1, ModeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeLabel_InitialValue(), theEcorePackage.getEString(), "initialValue", null, 0, 1, ModeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModeLabel__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModeLabel__IsEnum(), theEcorePackage.getEBoolean(), "isEnum", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModeLabel__IsNumeric(), theEcorePackage.getEBoolean(), "isNumeric", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_AsilLevel(), this.getASILType(), "asilLevel", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Labels(), this.getLabel(), null, "labels", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Runnables(), this.getRunnable(), null, "runnables", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(computationItemEClass, ComputationItem.class, "ComputationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionNeedEClass, ExecutionNeed.class, "ExecutionNeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionNeed_Needs(), this.getNeedEntry(), null, "needs", null, 0, -1, ExecutionNeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(needEntryEClass, Map.Entry.class, "NeedEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeedEntry_Key(), theEcorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeedEntry_Value(), this.getIDiscreteValueDeviation(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ticksEClass, Ticks.class, "Ticks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTicks_Default(), this.getIDiscreteValueDeviation(), null, "default", null, 0, 1, Ticks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTicks_Extended(), this.getTicksEntry(), null, "extended", null, 0, -1, Ticks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ticksEntryEClass, Map.Entry.class, "TicksEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTicksEntry_Key(), this.getProcessingUnitDefinition(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTicksEntry_Value(), this.getIDiscreteValueDeviation(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeLabelAccessEClass, ModeLabelAccess.class, "ModeLabelAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeLabelAccess_Data(), this.getModeLabel(), null, "data", null, 1, 1, ModeLabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeLabelAccess_Access(), this.getModeLabelAccessEnum(), "access", null, 0, 1, ModeLabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeLabelAccess_Value(), theEcorePackage.getEString(), "value", null, 0, 1, ModeLabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeLabelAccess_Step(), this.getPositiveInt(), "step", "1", 0, 1, ModeLabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModeLabelAccess__ValidateInvariants__DiagnosticChain_Map(), theEcorePackage.getEBoolean(), "validateInvariants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEMap());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(labelAccessEClass, LabelAccess.class, "LabelAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelAccess_Data(), this.getLabel(), null, "data", null, 1, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelAccess_Access(), this.getLabelAccessEnum(), "access", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccess_Statistic(), this.getLabelAccessStatistic(), null, "statistic", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccess_TransmissionPolicy(), this.getTransmissionPolicy(), null, "transmissionPolicy", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelAccess_DataStability(), this.getLabelAccessDataStability(), "dataStability", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelAccess_Implementation(), this.getLabelAccessImplementation(), "implementation", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelAccess_DependsOn(), this.getDataDependency(), null, "dependsOn", null, 0, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelAccessEClass, ChannelAccess.class, "ChannelAccess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelAccess_Data(), this.getChannel(), null, "data", null, 1, 1, ChannelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelAccess_Elements(), theEcorePackage.getEInt(), "elements", "0", 0, 1, ChannelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelAccess_TransmissionPolicy(), this.getTransmissionPolicy(), null, "transmissionPolicy", null, 0, 1, ChannelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(senderReceiverCommunicationEClass, SenderReceiverCommunication.class, "SenderReceiverCommunication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSenderReceiverCommunication_Buffered(), theEcorePackage.getEBoolean(), "buffered", "false", 0, 1, SenderReceiverCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverCommunication_Label(), this.getLabel(), null, "label", null, 1, 1, SenderReceiverCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSenderReceiverCommunication_Port(), this.getPort(), null, "port", null, 0, 1, SenderReceiverCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderReceiverReadEClass, SenderReceiverRead.class, "SenderReceiverRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(senderReceiverWriteEClass, SenderReceiverWrite.class, "SenderReceiverWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSenderReceiverWrite_NotifiedRunnables(), this.getRunnable(), null, "notifiedRunnables", null, 0, -1, SenderReceiverWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverCallEClass, ServerCall.class, "ServerCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerCall_ServerRunnable(), this.getRunnable(), null, "serverRunnable", null, 1, 1, ServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerCall_Port(), this.getPort(), null, "port", null, 0, 1, ServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronousServerCallEClass, SynchronousServerCall.class, "SynchronousServerCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchronousServerCall_WaitingBehaviour(), this.getWaitingBehaviour(), "waitingBehaviour", null, 0, 1, SynchronousServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchronousServerCallEClass, AsynchronousServerCall.class, "AsynchronousServerCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsynchronousServerCall_ResultRunnable(), this.getRunnable(), null, "resultRunnable", null, 0, 1, AsynchronousServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getResultServerCallEClass, GetResultServerCall.class, "GetResultServerCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetResultServerCall_BlockingType(), this.getBlockingType(), "blockingType", null, 0, 1, GetResultServerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Ordered(), theEcorePackage.getEBoolean(), "ordered", "true", 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callArgumentEClass, CallArgument.class, "CallArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallArgument_ContainingCall(), this.getRunnableCall(), this.getRunnableCall_Arguments(), "containingCall", null, 0, 1, CallArgument.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallArgument_Parameter(), this.getRunnableParameter(), null, "parameter", null, 0, 1, CallArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallArgument_DependsOn(), this.getDataDependency(), null, "dependsOn", null, 0, 1, CallArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCallArgument__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCallArgument__ComputeUniqueName(), theEcorePackage.getEString(), "computeUniqueName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(runnableCallEClass, RunnableCall.class, "RunnableCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableCall_Runnable(), this.getRunnable(), null, "runnable", null, 1, 1, RunnableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableCall_Arguments(), this.getCallArgument(), this.getCallArgument_ContainingCall(), "arguments", null, 0, -1, RunnableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunnableCall_Statistic(), this.getRunEntityCallStatistic(), null, "statistic", null, 0, 1, RunnableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customEventTriggerEClass, CustomEventTrigger.class, "CustomEventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomEventTrigger_Event(), this.getCustomEvent(), null, "event", null, 1, 1, CustomEventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compoundTypeEClass, CompoundType.class, "CompoundType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStruct_Entries(), this.getStructEntry(), null, "entries", null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structEntryEClass, StructEntry.class, "StructEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructEntry_DataType(), this.getDataType(), null, "dataType", null, 0, 1, StructEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArray_NumberElements(), theEcorePackage.getEInt(), "numberElements", "0", 0, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArray_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointerEClass, Pointer.class, "Pointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointer_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Pointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeRef_TypeDef(), this.getTypeDefinition(), null, "typeDef", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlias_Target(), theEcorePackage.getEString(), "target", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlias_Alias(), theEcorePackage.getEString(), "alias", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinition_Size(), this.getDataSize(), null, "size", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeDefinitionEClass, DataTypeDefinition.class, "DataTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeDefinition_DataType(), this.getDataType(), null, "dataType", null, 0, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseTypeDefinitionEClass, BaseTypeDefinition.class, "BaseTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseTypeDefinition_Aliases(), this.getAlias(), null, "aliases", null, 0, -1, BaseTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationEClass, Activation.class, "Activation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(periodicActivationEClass, PeriodicActivation.class, "PeriodicActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicActivation_Min(), this.getTime(), null, "min", null, 0, 1, PeriodicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivation_Max(), this.getTime(), null, "max", null, 0, 1, PeriodicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivation_Recurrence(), this.getTime(), null, "recurrence", null, 1, 1, PeriodicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicActivation_Offset(), this.getTime(), null, "offset", null, 1, 1, PeriodicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRateActivationEClass, VariableRateActivation.class, "VariableRateActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableRateActivation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, VariableRateActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableRateActivation_Step(), this.getTime(), null, "step", null, 1, 1, VariableRateActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableRateActivation_OccurrencesPerStep(), this.getIContinuousValueDeviation(), null, "occurrencesPerStep", null, 1, 1, VariableRateActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicActivationEClass, SporadicActivation.class, "SporadicActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicActivation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SporadicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicActivation_Occurrence(), this.getITimeDeviation(), null, "occurrence", null, 1, 1, SporadicActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(runEntityCallStatisticEClass, RunEntityCallStatistic.class, "RunEntityCallStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunEntityCallStatistic_Statistic(), this.getNumericStatistic(), null, "statistic", null, 0, 1, RunEntityCallStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementModelEClass, MeasurementModel.class, "MeasurementModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementModel_Measurements(), this.getMeasurement(), null, "measurements", null, 0, -1, MeasurementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_Runtimes(), this.getTime(), null, "runtimes", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RuntimeDeviation(), this.getITimeDeviation(), null, "runtimeDeviation", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainMeasurementEClass, EventChainMeasurement.class, "EventChainMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainMeasurement_EventChain(), this.getEventChain(), null, "eventChain", null, 1, 1, EventChainMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskMeasurementEClass, TaskMeasurement.class, "TaskMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskMeasurement_Task(), this.getTask(), null, "task", null, 1, 1, TaskMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableMeasurementEClass, RunnableMeasurement.class, "RunnableMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableMeasurement_Runnable(), this.getRunnable(), null, "runnable", null, 1, 1, RunnableMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator._UNDEFINED_);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.NOT_EQUAL);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS_THAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_THAN);

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

		initEEnum(voltageUnitEEnum, VoltageUnit.class, "VoltageUnit");
		addEEnumLiteral(voltageUnitEEnum, VoltageUnit._UNDEFINED_);
		addEEnumLiteral(voltageUnitEEnum, VoltageUnit.UV);
		addEEnumLiteral(voltageUnitEEnum, VoltageUnit.MV);
		addEEnumLiteral(voltageUnitEEnum, VoltageUnit.V);

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
		addEEnumLiteral(interfaceKindEEnum, InterfaceKind.PROVIDES_REQUIRES);

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
		addEEnumLiteral(timeMetricEEnum, TimeMetric.END_TO_START);
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

		initEEnum(componentEventTypeEEnum, ComponentEventType.class, "ComponentEventType");
		addEEnumLiteral(componentEventTypeEEnum, ComponentEventType._ALL_);
		addEEnumLiteral(componentEventTypeEEnum, ComponentEventType.START);
		addEEnumLiteral(componentEventTypeEEnum, ComponentEventType.END);

		initEEnum(memoryTypeEEnum, MemoryType.class, "MemoryType");
		addEEnumLiteral(memoryTypeEEnum, MemoryType._UNDEFINED_);
		addEEnumLiteral(memoryTypeEEnum, MemoryType.DRAM);
		addEEnumLiteral(memoryTypeEEnum, MemoryType.SRAM);
		addEEnumLiteral(memoryTypeEEnum, MemoryType.FLASH);
		addEEnumLiteral(memoryTypeEEnum, MemoryType.PCM);

		initEEnum(structureTypeEEnum, StructureType.class, "StructureType");
		addEEnumLiteral(structureTypeEEnum, StructureType._UNDEFINED_);
		addEEnumLiteral(structureTypeEEnum, StructureType.SYSTEM);
		addEEnumLiteral(structureTypeEEnum, StructureType.ECU);
		addEEnumLiteral(structureTypeEEnum, StructureType.MICROCONTROLLER);
		addEEnumLiteral(structureTypeEEnum, StructureType.SO_C);
		addEEnumLiteral(structureTypeEEnum, StructureType.CLUSTER);
		addEEnumLiteral(structureTypeEEnum, StructureType.GROUP);
		addEEnumLiteral(structureTypeEEnum, StructureType.ARRAY);
		addEEnumLiteral(structureTypeEEnum, StructureType.AREA);
		addEEnumLiteral(structureTypeEEnum, StructureType.REGION);

		initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
		addEEnumLiteral(cacheTypeEEnum, CacheType._UNDEFINED_);
		addEEnumLiteral(cacheTypeEEnum, CacheType.INSTRUCTION);
		addEEnumLiteral(cacheTypeEEnum, CacheType.DATA);
		addEEnumLiteral(cacheTypeEEnum, CacheType.UNIFIED);

		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType._UNDEFINED_);
		addEEnumLiteral(portTypeEEnum, PortType.INITIATOR);
		addEEnumLiteral(portTypeEEnum, PortType.RESPONDER);

		initEEnum(schedPolicyEEnum, SchedPolicy.class, "SchedPolicy");
		addEEnumLiteral(schedPolicyEEnum, SchedPolicy._UNDEFINED_);
		addEEnumLiteral(schedPolicyEEnum, SchedPolicy.ROUND_ROBIN);
		addEEnumLiteral(schedPolicyEEnum, SchedPolicy.FCFS);
		addEEnumLiteral(schedPolicyEEnum, SchedPolicy.PRIORITY_BASED);

		initEEnum(writeStrategyEEnum, WriteStrategy.class, "WriteStrategy");
		addEEnumLiteral(writeStrategyEEnum, WriteStrategy._UNDEFINED_);
		addEEnumLiteral(writeStrategyEEnum, WriteStrategy.NONE);
		addEEnumLiteral(writeStrategyEEnum, WriteStrategy.WRITEBACK);
		addEEnumLiteral(writeStrategyEEnum, WriteStrategy.WRITETHROUGH);

		initEEnum(puTypeEEnum, PuType.class, "PuType");
		addEEnumLiteral(puTypeEEnum, PuType._UNDEFINED_);
		addEEnumLiteral(puTypeEEnum, PuType.GPU);
		addEEnumLiteral(puTypeEEnum, PuType.CPU);
		addEEnumLiteral(puTypeEEnum, PuType.ACCELERATOR);

		initEEnum(portInterfaceEEnum, PortInterface.class, "PortInterface");
		addEEnumLiteral(portInterfaceEEnum, PortInterface._UNDEFINED_);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.CUSTOM);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.CAN);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.FLEXRAY);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.LIN);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.MOST);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.ETHERNET);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.SPI);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.I2C);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.AXI);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.AHB);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.APB);
		addEEnumLiteral(portInterfaceEEnum, PortInterface.SWR);

		initEEnum(hwFeatureTypeEEnum, HwFeatureType.class, "HwFeatureType");
		addEEnumLiteral(hwFeatureTypeEEnum, HwFeatureType._UNDEFINED_);
		addEEnumLiteral(hwFeatureTypeEEnum, HwFeatureType.PERFORMANCE);
		addEEnumLiteral(hwFeatureTypeEEnum, HwFeatureType.POWER);
		addEEnumLiteral(hwFeatureTypeEEnum, HwFeatureType.PERFORMANCE_AND_POWER);

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
		addEEnumLiteral(dataStabilityLevelEEnum, DataStabilityLevel.PERIOD);
		addEEnumLiteral(dataStabilityLevelEEnum, DataStabilityLevel.PROCESS);
		addEEnumLiteral(dataStabilityLevelEEnum, DataStabilityLevel.SCHEDULE_SECTION);
		addEEnumLiteral(dataStabilityLevelEEnum, DataStabilityLevel.RUNNABLE);

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

		initEEnum(curveTypeEEnum, CurveType.class, "CurveType");
		addEEnumLiteral(curveTypeEEnum, CurveType._UNDEFINED_);
		addEEnumLiteral(curveTypeEEnum, CurveType.SINE);
		addEEnumLiteral(curveTypeEEnum, CurveType.TRIANGLE);

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

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType._UNDEFINED_);
		addEEnumLiteral(directionTypeEEnum, DirectionType.IN);
		addEEnumLiteral(directionTypeEEnum, DirectionType.OUT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.INOUT);

		initEEnum(labelDataStabilityEEnum, LabelDataStability.class, "LabelDataStability");
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability._UNDEFINED_);
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability.NO_PROTECTION);
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability.AUTOMATIC_PROTECTION);
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability.CUSTOM_PROTECTION);
		addEEnumLiteral(labelDataStabilityEEnum, LabelDataStability.HANDLED_BY_MODEL_ELEMENTS);

		initEEnum(modeLabelAccessEnumEEnum, ModeLabelAccessEnum.class, "ModeLabelAccessEnum");
		addEEnumLiteral(modeLabelAccessEnumEEnum, ModeLabelAccessEnum._UNDEFINED_);
		addEEnumLiteral(modeLabelAccessEnumEEnum, ModeLabelAccessEnum.READ);
		addEEnumLiteral(modeLabelAccessEnumEEnum, ModeLabelAccessEnum.SET);
		addEEnumLiteral(modeLabelAccessEnumEEnum, ModeLabelAccessEnum.INCREMENT);
		addEEnumLiteral(modeLabelAccessEnumEEnum, ModeLabelAccessEnum.DECREMENT);

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

		initEEnum(labelAccessImplementationEEnum, LabelAccessImplementation.class, "LabelAccessImplementation");
		addEEnumLiteral(labelAccessImplementationEEnum, LabelAccessImplementation._UNDEFINED_);
		addEEnumLiteral(labelAccessImplementationEEnum, LabelAccessImplementation.EXPLICIT);
		addEEnumLiteral(labelAccessImplementationEEnum, LabelAccessImplementation.IMPLICIT);
		addEEnumLiteral(labelAccessImplementationEEnum, LabelAccessImplementation.TIMED);

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

		// Initialize data types
		initEDataType(addressEDataType, long.class, "Address", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntEDataType, int.class, "PositiveInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveLongEDataType, long.class, "PositiveLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveDoubleEDataType, double.class, "PositiveDouble", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonNegativeIntEDataType, int.class, "NonNegativeInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonNegativeLongEDataType, long.class, "NonNegativeLong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonNegativeDoubleEDataType, double.class, "NonNegativeDouble", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (addressEDataType,
		   source,
		   new String[] {
			   "minInclusive", "0"
		   });
		addAnnotation
		  (positiveIntEDataType,
		   source,
		   new String[] {
			   "minExclusive", "0"
		   });
		addAnnotation
		  (positiveLongEDataType,
		   source,
		   new String[] {
			   "minExclusive", "0"
		   });
		addAnnotation
		  (positiveDoubleEDataType,
		   source,
		   new String[] {
			   "minExclusive", "0"
		   });
		addAnnotation
		  (nonNegativeIntEDataType,
		   source,
		   new String[] {
			   "minInclusive", "0"
		   });
		addAnnotation
		  (nonNegativeLongEDataType,
		   source,
		   new String[] {
			   "minInclusive", "0"
		   });
		addAnnotation
		  (nonNegativeDoubleEDataType,
		   source,
		   new String[] {
			   "minInclusive", "0"
		   });
	}

} //AmaltheaPackageImpl
