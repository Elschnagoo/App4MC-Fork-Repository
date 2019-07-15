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
import org.eclipse.app4mc.amalthea.model.AccessMultiplicity;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceType;
import org.eclipse.app4mc.amalthea.model.Alias;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ArchitectureRequirement;
import org.eclipse.app4mc.amalthea.model.Array;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition;
import org.eclipse.app4mc.amalthea.model.BigIntegerObject;
import org.eclipse.app4mc.amalthea.model.BlockingType;
import org.eclipse.app4mc.amalthea.model.BooleanObject;
import org.eclipse.app4mc.amalthea.model.CPUPercentageMetric;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.CacheDefinition;
import org.eclipse.app4mc.amalthea.model.CacheType;
import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.ChannelEvent;
import org.eclipse.app4mc.amalthea.model.ChannelEventType;
import org.eclipse.app4mc.amalthea.model.ChannelReceive;
import org.eclipse.app4mc.amalthea.model.ChannelSend;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierList;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry;
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.model.CoherencyDirection;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentEvent;
import org.eclipse.app4mc.amalthea.model.ComponentEventType;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.ComponentScope;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.Composite;
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
import org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics;
import org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.CoreClassification;
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.CountMetric;
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.CustomActivation;
import org.eclipse.app4mc.amalthea.model.CustomEntity;
import org.eclipse.app4mc.amalthea.model.CustomEvent;
import org.eclipse.app4mc.amalthea.model.CustomEventTrigger;
import org.eclipse.app4mc.amalthea.model.CustomStimulus;
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint;
import org.eclipse.app4mc.amalthea.model.DataAgeCycle;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.DataCoherencyGroup;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.DataPairingConstraint;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataRateUnit;
import org.eclipse.app4mc.amalthea.model.DataSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.DataStability;
import org.eclipse.app4mc.amalthea.model.DataStabilityGroup;
import org.eclipse.app4mc.amalthea.model.DataStabilityLevel;
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
import org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics;
import org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.DoubleObject;
import org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst;
import org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.EventActivation;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainContainer;
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
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptive;
import org.eclipse.app4mc.amalthea.model.FixedPriorityPreemptiveWithBudgetEnforcement;
import org.eclipse.app4mc.amalthea.model.FloatObject;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.FrequencyMetric;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.GetResultServerCall;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.Grouping;
import org.eclipse.app4mc.amalthea.model.GroupingType;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwFeatureType;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.ISRCategory;
import org.eclipse.app4mc.amalthea.model.IntegerObject;
import org.eclipse.app4mc.amalthea.model.InterProcessStimulus;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.InterfaceKind;
import org.eclipse.app4mc.amalthea.model.InterfacePort;
import org.eclipse.app4mc.amalthea.model.InterruptController;
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
import org.eclipse.app4mc.amalthea.model.LatencyType;
import org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.ListObject;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MappingType;
import org.eclipse.app4mc.amalthea.model.MeasurementModel;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType;
import org.eclipse.app4mc.amalthea.model.MemoryClassification;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.MemoryType;
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic;
import org.eclipse.app4mc.amalthea.model.ModeAssignment;
import org.eclipse.app4mc.amalthea.model.ModeCondition;
import org.eclipse.app4mc.amalthea.model.ModeConditionConjunction;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.ModeValueList;
import org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency;
import org.eclipse.app4mc.amalthea.model.NumericMode;
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
import org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.PartlyPFairPD2;
import org.eclipse.app4mc.amalthea.model.PercentageMetric;
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.PfairPD2;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.Pointer;
import org.eclipse.app4mc.amalthea.model.PollingPeriodicServer;
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
import org.eclipse.app4mc.amalthea.model.ProcessEntityGroup;
import org.eclipse.app4mc.amalthea.model.ProcessEvent;
import org.eclipse.app4mc.amalthea.model.ProcessEventType;
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
import org.eclipse.app4mc.amalthea.model.RateMonotonic;
import org.eclipse.app4mc.amalthea.model.ReceiveOperation;
import org.eclipse.app4mc.amalthea.model.ReferenceObject;
import org.eclipse.app4mc.amalthea.model.RelationalOperator;
import org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableEvent;
import org.eclipse.app4mc.amalthea.model.RunnableEventType;
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
import org.eclipse.app4mc.amalthea.model.SenderReceiverRead;
import org.eclipse.app4mc.amalthea.model.SenderReceiverWrite;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.Severity;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.SingleStimulus;
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.SporadicServer;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.StimulusEvent;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.Struct;
import org.eclipse.app4mc.amalthea.model.StructEntry;
import org.eclipse.app4mc.amalthea.model.StructureType;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
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
import org.eclipse.app4mc.amalthea.model.TerminateProcess;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution;
import org.eclipse.app4mc.amalthea.model.TimeBoundaries;
import org.eclipse.app4mc.amalthea.model.TimeConstant;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.model.TimeHistogram;
import org.eclipse.app4mc.amalthea.model.TimeHistogramEntry;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeStatistics;
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmaltheaFactoryImpl extends EFactoryImpl implements AmaltheaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmaltheaFactory init() {
		try {
			AmaltheaFactory theAmaltheaFactory = (AmaltheaFactory)EPackage.Registry.INSTANCE.getEFactory(AmaltheaPackage.eNS_URI);
			if (theAmaltheaFactory != null) {
				return theAmaltheaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmaltheaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmaltheaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AmaltheaPackage.AMALTHEA: return createAmalthea();
			case AmaltheaPackage.COMMON_ELEMENTS: return createCommonElements();
			case AmaltheaPackage.TAG: return createTag();
			case AmaltheaPackage.CORE_CLASSIFIER: return createCoreClassifier();
			case AmaltheaPackage.MEMORY_CLASSIFIER: return createMemoryClassifier();
			case AmaltheaPackage.TRANSMISSION_POLICY: return createTransmissionPolicy();
			case AmaltheaPackage.TIME: return createTime();
			case AmaltheaPackage.FREQUENCY: return createFrequency();
			case AmaltheaPackage.VOLTAGE: return createVoltage();
			case AmaltheaPackage.DATA_SIZE: return createDataSize();
			case AmaltheaPackage.DATA_RATE: return createDataRate();
			case AmaltheaPackage.CUSTOM_PROPERTY: return (EObject)createCustomProperty();
			case AmaltheaPackage.LIST_OBJECT: return createListObject();
			case AmaltheaPackage.STRING_OBJECT: return createStringObject();
			case AmaltheaPackage.BIG_INTEGER_OBJECT: return createBigIntegerObject();
			case AmaltheaPackage.REFERENCE_OBJECT: return createReferenceObject();
			case AmaltheaPackage.INTEGER_OBJECT: return createIntegerObject();
			case AmaltheaPackage.LONG_OBJECT: return createLongObject();
			case AmaltheaPackage.FLOAT_OBJECT: return createFloatObject();
			case AmaltheaPackage.DOUBLE_OBJECT: return createDoubleObject();
			case AmaltheaPackage.BOOLEAN_OBJECT: return createBooleanObject();
			case AmaltheaPackage.MIN_AVG_MAX_STATISTIC: return createMinAvgMaxStatistic();
			case AmaltheaPackage.SINGLE_VALUE_STATISTIC: return createSingleValueStatistic();
			case AmaltheaPackage.TIME_CONSTANT: return createTimeConstant();
			case AmaltheaPackage.TIME_HISTOGRAM: return createTimeHistogram();
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY: return createTimeHistogramEntry();
			case AmaltheaPackage.TIME_BOUNDARIES: return createTimeBoundaries();
			case AmaltheaPackage.TIME_STATISTICS: return createTimeStatistics();
			case AmaltheaPackage.TIME_UNIFORM_DISTRIBUTION: return createTimeUniformDistribution();
			case AmaltheaPackage.TIME_GAUSS_DISTRIBUTION: return createTimeGaussDistribution();
			case AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION: return createTimeWeibullEstimatorsDistribution();
			case AmaltheaPackage.TIME_BETA_DISTRIBUTION: return createTimeBetaDistribution();
			case AmaltheaPackage.DISCRETE_VALUE_CONSTANT: return createDiscreteValueConstant();
			case AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM: return createDiscreteValueHistogram();
			case AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM_ENTRY: return createDiscreteValueHistogramEntry();
			case AmaltheaPackage.DISCRETE_VALUE_BOUNDARIES: return createDiscreteValueBoundaries();
			case AmaltheaPackage.DISCRETE_VALUE_STATISTICS: return createDiscreteValueStatistics();
			case AmaltheaPackage.DISCRETE_VALUE_UNIFORM_DISTRIBUTION: return createDiscreteValueUniformDistribution();
			case AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION: return createDiscreteValueGaussDistribution();
			case AmaltheaPackage.DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION: return createDiscreteValueWeibullEstimatorsDistribution();
			case AmaltheaPackage.DISCRETE_VALUE_BETA_DISTRIBUTION: return createDiscreteValueBetaDistribution();
			case AmaltheaPackage.CONTINUOUS_VALUE_CONSTANT: return createContinuousValueConstant();
			case AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM: return createContinuousValueHistogram();
			case AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM_ENTRY: return createContinuousValueHistogramEntry();
			case AmaltheaPackage.CONTINUOUS_VALUE_BOUNDARIES: return createContinuousValueBoundaries();
			case AmaltheaPackage.CONTINUOUS_VALUE_STATISTICS: return createContinuousValueStatistics();
			case AmaltheaPackage.CONTINUOUS_VALUE_UNIFORM_DISTRIBUTION: return createContinuousValueUniformDistribution();
			case AmaltheaPackage.CONTINUOUS_VALUE_GAUSS_DISTRIBUTION: return createContinuousValueGaussDistribution();
			case AmaltheaPackage.CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION: return createContinuousValueWeibullEstimatorsDistribution();
			case AmaltheaPackage.CONTINUOUS_VALUE_BETA_DISTRIBUTION: return createContinuousValueBetaDistribution();
			case AmaltheaPackage.NUMERIC_MODE: return createNumericMode();
			case AmaltheaPackage.ENUM_MODE: return createEnumMode();
			case AmaltheaPackage.MODE_LITERAL: return createModeLiteral();
			case AmaltheaPackage.COMPONENTS_MODEL: return createComponentsModel();
			case AmaltheaPackage.COMPONENT: return createComponent();
			case AmaltheaPackage.COMPOSITE: return createComposite();
			case AmaltheaPackage.SYSTEM: return createSystem();
			case AmaltheaPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case AmaltheaPackage.CONNECTOR: return createConnector();
			case AmaltheaPackage.QUALIFIED_PORT: return createQualifiedPort();
			case AmaltheaPackage.INTERFACE_PORT: return createInterfacePort();
			case AmaltheaPackage.CONFIG_MODEL: return createConfigModel();
			case AmaltheaPackage.EVENT_CONFIG: return createEventConfig();
			case AmaltheaPackage.CONSTRAINTS_MODEL: return createConstraintsModel();
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT: return createRunnableSequencingConstraint();
			case AmaltheaPackage.RUNNABLE_SEPARATION_CONSTRAINT: return createRunnableSeparationConstraint();
			case AmaltheaPackage.PROCESS_SEPARATION_CONSTRAINT: return createProcessSeparationConstraint();
			case AmaltheaPackage.DATA_SEPARATION_CONSTRAINT: return createDataSeparationConstraint();
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT: return createRunnablePairingConstraint();
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT: return createProcessPairingConstraint();
			case AmaltheaPackage.DATA_PAIRING_CONSTRAINT: return createDataPairingConstraint();
			case AmaltheaPackage.TARGET_MEMORY: return createTargetMemory();
			case AmaltheaPackage.TARGET_CORE: return createTargetCore();
			case AmaltheaPackage.TARGET_SCHEDULER: return createTargetScheduler();
			case AmaltheaPackage.LABEL_ENTITY_GROUP: return createLabelEntityGroup();
			case AmaltheaPackage.RUNNABLE_ENTITY_GROUP: return createRunnableEntityGroup();
			case AmaltheaPackage.PROCESS_ENTITY_GROUP: return createProcessEntityGroup();
			case AmaltheaPackage.TAG_GROUP: return createTagGroup();
			case AmaltheaPackage.EVENT_CHAIN: return createEventChain();
			case AmaltheaPackage.SUB_EVENT_CHAIN: return createSubEventChain();
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE: return createEventChainReference();
			case AmaltheaPackage.EVENT_CHAIN_CONTAINER: return createEventChainContainer();
			case AmaltheaPackage.PHYSICAL_SECTION_CONSTRAINT: return createPhysicalSectionConstraint();
			case AmaltheaPackage.EVENT_SYNCHRONIZATION_CONSTRAINT: return createEventSynchronizationConstraint();
			case AmaltheaPackage.EVENT_CHAIN_SYNCHRONIZATION_CONSTRAINT: return createEventChainSynchronizationConstraint();
			case AmaltheaPackage.DELAY_CONSTRAINT: return createDelayConstraint();
			case AmaltheaPackage.EVENT_CHAIN_LATENCY_CONSTRAINT: return createEventChainLatencyConstraint();
			case AmaltheaPackage.REPETITION_CONSTRAINT: return createRepetitionConstraint();
			case AmaltheaPackage.DATA_AGE_CONSTRAINT: return createDataAgeConstraint();
			case AmaltheaPackage.DATA_AGE_CYCLE: return createDataAgeCycle();
			case AmaltheaPackage.DATA_AGE_TIME: return createDataAgeTime();
			case AmaltheaPackage.PROCESS_REQUIREMENT: return createProcessRequirement();
			case AmaltheaPackage.RUNNABLE_REQUIREMENT: return createRunnableRequirement();
			case AmaltheaPackage.ARCHITECTURE_REQUIREMENT: return createArchitectureRequirement();
			case AmaltheaPackage.PROCESS_CHAIN_REQUIREMENT: return createProcessChainRequirement();
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT: return createCPUPercentageRequirementLimit();
			case AmaltheaPackage.FREQUENCY_REQUIREMENT_LIMIT: return createFrequencyRequirementLimit();
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT: return createPercentageRequirementLimit();
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT: return createCountRequirementLimit();
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT: return createTimeRequirementLimit();
			case AmaltheaPackage.DATA_COHERENCY_GROUP: return createDataCoherencyGroup();
			case AmaltheaPackage.DATA_STABILITY_GROUP: return createDataStabilityGroup();
			case AmaltheaPackage.PROCESS_SCOPE: return createProcessScope();
			case AmaltheaPackage.RUNNABLE_SCOPE: return createRunnableScope();
			case AmaltheaPackage.COMPONENT_SCOPE: return createComponentScope();
			case AmaltheaPackage.EVENT_MODEL: return createEventModel();
			case AmaltheaPackage.EVENT_SET: return createEventSet();
			case AmaltheaPackage.CUSTOM_EVENT: return createCustomEvent();
			case AmaltheaPackage.STIMULUS_EVENT: return createStimulusEvent();
			case AmaltheaPackage.PROCESS_EVENT: return createProcessEvent();
			case AmaltheaPackage.PROCESS_CHAIN_EVENT: return createProcessChainEvent();
			case AmaltheaPackage.RUNNABLE_EVENT: return createRunnableEvent();
			case AmaltheaPackage.LABEL_EVENT: return createLabelEvent();
			case AmaltheaPackage.CHANNEL_EVENT: return createChannelEvent();
			case AmaltheaPackage.SEMAPHORE_EVENT: return createSemaphoreEvent();
			case AmaltheaPackage.COMPONENT_EVENT: return createComponentEvent();
			case AmaltheaPackage.HW_MODEL: return createHWModel();
			case AmaltheaPackage.HW_STRUCTURE: return createHwStructure();
			case AmaltheaPackage.FREQUENCY_DOMAIN: return createFrequencyDomain();
			case AmaltheaPackage.POWER_DOMAIN: return createPowerDomain();
			case AmaltheaPackage.PROCESSING_UNIT: return createProcessingUnit();
			case AmaltheaPackage.MEMORY: return createMemory();
			case AmaltheaPackage.CACHE: return createCache();
			case AmaltheaPackage.HW_FEATURE_CATEGORY: return createHwFeatureCategory();
			case AmaltheaPackage.HW_FEATURE: return createHwFeature();
			case AmaltheaPackage.HW_PORT: return createHwPort();
			case AmaltheaPackage.CONNECTION_HANDLER: return createConnectionHandler();
			case AmaltheaPackage.HW_CONNECTION: return createHwConnection();
			case AmaltheaPackage.HW_ACCESS_ELEMENT: return createHwAccessElement();
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION: return createProcessingUnitDefinition();
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION: return createConnectionHandlerDefinition();
			case AmaltheaPackage.MEMORY_DEFINITION: return createMemoryDefinition();
			case AmaltheaPackage.CACHE_DEFINITION: return createCacheDefinition();
			case AmaltheaPackage.HW_ACCESS_PATH: return createHwAccessPath();
			case AmaltheaPackage.MAPPING_MODEL: return createMappingModel();
			case AmaltheaPackage.SCHEDULER_ALLOCATION: return createSchedulerAllocation();
			case AmaltheaPackage.TASK_ALLOCATION: return createTaskAllocation();
			case AmaltheaPackage.ISR_ALLOCATION: return createISRAllocation();
			case AmaltheaPackage.RUNNABLE_ALLOCATION: return createRunnableAllocation();
			case AmaltheaPackage.MEMORY_MAPPING: return createMemoryMapping();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING: return createPhysicalSectionMapping();
			case AmaltheaPackage.OS_MODEL: return createOSModel();
			case AmaltheaPackage.OS_DATA_CONSISTENCY: return createOsDataConsistency();
			case AmaltheaPackage.DATA_STABILITY: return createDataStability();
			case AmaltheaPackage.NON_ATOMIC_DATA_COHERENCY: return createNonAtomicDataCoherency();
			case AmaltheaPackage.SEMAPHORE: return createSemaphore();
			case AmaltheaPackage.TASK_SCHEDULER: return createTaskScheduler();
			case AmaltheaPackage.SCHEDULER_ASSOCIATION: return createSchedulerAssociation();
			case AmaltheaPackage.INTERRUPT_CONTROLLER: return createInterruptController();
			case AmaltheaPackage.SCHEDULING_PARAMETERS: return createSchedulingParameters();
			case AmaltheaPackage.PARAMETER_EXTENSION: return (EObject)createParameterExtension();
			case AmaltheaPackage.FIXED_PRIORITY_PREEMPTIVE: return createFixedPriorityPreemptive();
			case AmaltheaPackage.FIXED_PRIORITY_PREEMPTIVE_WITH_BUDGET_ENFORCEMENT: return createFixedPriorityPreemptiveWithBudgetEnforcement();
			case AmaltheaPackage.OSEK: return createOSEK();
			case AmaltheaPackage.DEADLINE_MONOTONIC: return createDeadlineMonotonic();
			case AmaltheaPackage.RATE_MONOTONIC: return createRateMonotonic();
			case AmaltheaPackage.PFAIR_PD2: return createPfairPD2();
			case AmaltheaPackage.PARTLY_PFAIR_PD2: return createPartlyPFairPD2();
			case AmaltheaPackage.EARLY_RELEASE_FAIR_PD2: return createEarlyReleaseFairPD2();
			case AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2: return createPartlyEarlyReleaseFairPD2();
			case AmaltheaPackage.LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST: return createLeastLocalRemainingExecutionTimeFirst();
			case AmaltheaPackage.EARLIEST_DEADLINE_FIRST: return createEarliestDeadlineFirst();
			case AmaltheaPackage.PRIORITY_BASED_ROUND_ROBIN: return createPriorityBasedRoundRobin();
			case AmaltheaPackage.DEFERRABLE_SERVER: return createDeferrableServer();
			case AmaltheaPackage.POLLING_PERIODIC_SERVER: return createPollingPeriodicServer();
			case AmaltheaPackage.SPORADIC_SERVER: return createSporadicServer();
			case AmaltheaPackage.CONSTANT_BANDWIDTH_SERVER: return createConstantBandwidthServer();
			case AmaltheaPackage.CONSTANT_BANDWIDTH_SERVER_WITH_CASH: return createConstantBandwidthServerWithCASH();
			case AmaltheaPackage.GROUPING: return createGrouping();
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM: return createUserSpecificSchedulingAlgorithm();
			case AmaltheaPackage.PRIORITY_BASED: return createPriorityBased();
			case AmaltheaPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case AmaltheaPackage.VENDOR_OPERATING_SYSTEM: return createVendorOperatingSystem();
			case AmaltheaPackage.OS_OVERHEAD: return createOsOverhead();
			case AmaltheaPackage.OS_API_OVERHEAD: return createOsAPIOverhead();
			case AmaltheaPackage.OS_ISR_OVERHEAD: return createOsISROverhead();
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL: return createPropertyConstraintsModel();
			case AmaltheaPackage.PROCESS_ALLOCATION_CONSTRAINT: return createProcessAllocationConstraint();
			case AmaltheaPackage.PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT: return createProcessPrototypeAllocationConstraint();
			case AmaltheaPackage.RUNNABLE_ALLOCATION_CONSTRAINT: return createRunnableAllocationConstraint();
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT: return createAbstractElementMappingConstraint();
			case AmaltheaPackage.CORE_CLASSIFICATION: return createCoreClassification();
			case AmaltheaPackage.MEMORY_CLASSIFICATION: return createMemoryClassification();
			case AmaltheaPackage.STIMULI_MODEL: return createStimuliModel();
			case AmaltheaPackage.MODE_VALUE_LIST: return createModeValueList();
			case AmaltheaPackage.MODE_VALUE_MAP_ENTRY: return (EObject)createModeValueMapEntry();
			case AmaltheaPackage.MODE_ASSIGNMENT: return createModeAssignment();
			case AmaltheaPackage.MODE_CONDITION_DISJUNCTION: return createModeConditionDisjunction();
			case AmaltheaPackage.MODE_CONDITION: return createModeCondition();
			case AmaltheaPackage.MODE_CONDITION_CONJUNCTION: return createModeConditionConjunction();
			case AmaltheaPackage.PERIODIC_STIMULUS: return createPeriodicStimulus();
			case AmaltheaPackage.RELATIVE_PERIODIC_STIMULUS: return createRelativePeriodicStimulus();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS: return createVariableRateStimulus();
			case AmaltheaPackage.SCENARIO: return createScenario();
			case AmaltheaPackage.PERIODIC_SYNTHETIC_STIMULUS: return createPeriodicSyntheticStimulus();
			case AmaltheaPackage.CUSTOM_STIMULUS: return createCustomStimulus();
			case AmaltheaPackage.SINGLE_STIMULUS: return createSingleStimulus();
			case AmaltheaPackage.INTER_PROCESS_STIMULUS: return createInterProcessStimulus();
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS: return createPeriodicBurstStimulus();
			case AmaltheaPackage.EVENT_STIMULUS: return createEventStimulus();
			case AmaltheaPackage.ARRIVAL_CURVE_STIMULUS: return createArrivalCurveStimulus();
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY: return createArrivalCurveEntry();
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION: return createClockTriangleFunction();
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION: return createClockSinusFunction();
			case AmaltheaPackage.CLOCK_MULTIPLIER_LIST: return createClockMultiplierList();
			case AmaltheaPackage.CLOCK_MULTIPLIER_LIST_ENTRY: return createClockMultiplierListEntry();
			case AmaltheaPackage.SW_MODEL: return createSWModel();
			case AmaltheaPackage.CUSTOM_ENTITY: return createCustomEntity();
			case AmaltheaPackage.PROCESS_CHAIN: return createProcessChain();
			case AmaltheaPackage.CALL_GRAPH: return createCallGraph();
			case AmaltheaPackage.MODE_SWITCH: return createModeSwitch();
			case AmaltheaPackage.MODE_SWITCH_ENTRY: return createModeSwitchEntry();
			case AmaltheaPackage.MODE_SWITCH_DEFAULT: return createModeSwitchDefault();
			case AmaltheaPackage.PROBABILITY_SWITCH: return createProbabilitySwitch();
			case AmaltheaPackage.PROBABILITY_SWITCH_ENTRY: return createProbabilitySwitchEntry();
			case AmaltheaPackage.COUNTER: return createCounter();
			case AmaltheaPackage.WAIT_EVENT: return createWaitEvent();
			case AmaltheaPackage.SET_EVENT: return createSetEvent();
			case AmaltheaPackage.CLEAR_EVENT: return createClearEvent();
			case AmaltheaPackage.EVENT_MASK: return createEventMask();
			case AmaltheaPackage.OS_EVENT: return createOsEvent();
			case AmaltheaPackage.INTER_PROCESS_TRIGGER: return createInterProcessTrigger();
			case AmaltheaPackage.ENFORCED_MIGRATION: return createEnforcedMigration();
			case AmaltheaPackage.SCHEDULE_POINT: return createSchedulePoint();
			case AmaltheaPackage.TERMINATE_PROCESS: return createTerminateProcess();
			case AmaltheaPackage.TASK: return createTask();
			case AmaltheaPackage.ISR: return createISR();
			case AmaltheaPackage.PROCESS_PROTOTYPE: return createProcessPrototype();
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE: return createChainedProcessPrototype();
			case AmaltheaPackage.ACCESS_PRECEDENCE_SPEC: return createAccessPrecedenceSpec();
			case AmaltheaPackage.ORDER_PRECEDENCE_SPEC: return createOrderPrecedenceSpec();
			case AmaltheaPackage.DATA_DEPENDENCY: return createDataDependency();
			case AmaltheaPackage.RUNNABLE_PARAMETER: return createRunnableParameter();
			case AmaltheaPackage.RUNNABLE: return createRunnable();
			case AmaltheaPackage.LABEL: return createLabel();
			case AmaltheaPackage.CHANNEL: return createChannel();
			case AmaltheaPackage.MODE_LABEL: return createModeLabel();
			case AmaltheaPackage.SECTION: return createSection();
			case AmaltheaPackage.EXECUTION_NEED: return createExecutionNeed();
			case AmaltheaPackage.NEED_ENTRY: return (EObject)createNeedEntry();
			case AmaltheaPackage.TICKS: return createTicks();
			case AmaltheaPackage.TICKS_ENTRY: return (EObject)createTicksEntry();
			case AmaltheaPackage.MODE_LABEL_ACCESS: return createModeLabelAccess();
			case AmaltheaPackage.LABEL_ACCESS: return createLabelAccess();
			case AmaltheaPackage.CHANNEL_SEND: return createChannelSend();
			case AmaltheaPackage.CHANNEL_RECEIVE: return createChannelReceive();
			case AmaltheaPackage.SEMAPHORE_ACCESS: return createSemaphoreAccess();
			case AmaltheaPackage.SENDER_RECEIVER_READ: return createSenderReceiverRead();
			case AmaltheaPackage.SENDER_RECEIVER_WRITE: return createSenderReceiverWrite();
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL: return createSynchronousServerCall();
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL: return createAsynchronousServerCall();
			case AmaltheaPackage.GET_RESULT_SERVER_CALL: return createGetResultServerCall();
			case AmaltheaPackage.GROUP: return createGroup();
			case AmaltheaPackage.CALL_ARGUMENT: return createCallArgument();
			case AmaltheaPackage.RUNNABLE_CALL: return createRunnableCall();
			case AmaltheaPackage.CUSTOM_EVENT_TRIGGER: return createCustomEventTrigger();
			case AmaltheaPackage.STRUCT: return createStruct();
			case AmaltheaPackage.STRUCT_ENTRY: return createStructEntry();
			case AmaltheaPackage.ARRAY: return createArray();
			case AmaltheaPackage.POINTER: return createPointer();
			case AmaltheaPackage.TYPE_REF: return createTypeRef();
			case AmaltheaPackage.ALIAS: return createAlias();
			case AmaltheaPackage.DATA_TYPE_DEFINITION: return createDataTypeDefinition();
			case AmaltheaPackage.BASE_TYPE_DEFINITION: return createBaseTypeDefinition();
			case AmaltheaPackage.PERIODIC_ACTIVATION: return createPeriodicActivation();
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION: return createVariableRateActivation();
			case AmaltheaPackage.SPORADIC_ACTIVATION: return createSporadicActivation();
			case AmaltheaPackage.SINGLE_ACTIVATION: return createSingleActivation();
			case AmaltheaPackage.EVENT_ACTIVATION: return createEventActivation();
			case AmaltheaPackage.CUSTOM_ACTIVATION: return createCustomActivation();
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC: return createLabelAccessStatistic();
			case AmaltheaPackage.RUN_ENTITY_CALL_STATISTIC: return createRunEntityCallStatistic();
			case AmaltheaPackage.MEASUREMENT_MODEL: return createMeasurementModel();
			case AmaltheaPackage.EVENT_CHAIN_MEASUREMENT: return createEventChainMeasurement();
			case AmaltheaPackage.TASK_MEASUREMENT: return createTaskMeasurement();
			case AmaltheaPackage.RUNNABLE_MEASUREMENT: return createRunnableMeasurement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AmaltheaPackage.RELATIONAL_OPERATOR:
				return createRelationalOperatorFromString(eDataType, initialValue);
			case AmaltheaPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case AmaltheaPackage.FREQUENCY_UNIT:
				return createFrequencyUnitFromString(eDataType, initialValue);
			case AmaltheaPackage.VOLTAGE_UNIT:
				return createVoltageUnitFromString(eDataType, initialValue);
			case AmaltheaPackage.DATA_SIZE_UNIT:
				return createDataSizeUnitFromString(eDataType, initialValue);
			case AmaltheaPackage.DATA_RATE_UNIT:
				return createDataRateUnitFromString(eDataType, initialValue);
			case AmaltheaPackage.SAMPLING_TYPE:
				return createSamplingTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.INTERFACE_KIND:
				return createInterfaceKindFromString(eDataType, initialValue);
			case AmaltheaPackage.RUNNABLE_ORDER_TYPE:
				return createRunnableOrderTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.SYNCHRONIZATION_TYPE:
				return createSynchronizationTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.MAPPING_TYPE:
				return createMappingTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.LATENCY_TYPE:
				return createLatencyTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.SEVERITY:
				return createSeverityFromString(eDataType, initialValue);
			case AmaltheaPackage.LIMIT_TYPE:
				return createLimitTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.TIME_METRIC:
				return createTimeMetricFromString(eDataType, initialValue);
			case AmaltheaPackage.COUNT_METRIC:
				return createCountMetricFromString(eDataType, initialValue);
			case AmaltheaPackage.PERCENTAGE_METRIC:
				return createPercentageMetricFromString(eDataType, initialValue);
			case AmaltheaPackage.CPU_PERCENTAGE_METRIC:
				return createCPUPercentageMetricFromString(eDataType, initialValue);
			case AmaltheaPackage.FREQUENCY_METRIC:
				return createFrequencyMetricFromString(eDataType, initialValue);
			case AmaltheaPackage.COHERENCY_DIRECTION:
				return createCoherencyDirectionFromString(eDataType, initialValue);
			case AmaltheaPackage.PROCESS_EVENT_TYPE:
				return createProcessEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.RUNNABLE_EVENT_TYPE:
				return createRunnableEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.LABEL_EVENT_TYPE:
				return createLabelEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.CHANNEL_EVENT_TYPE:
				return createChannelEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.SEMAPHORE_EVENT_TYPE:
				return createSemaphoreEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.COMPONENT_EVENT_TYPE:
				return createComponentEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.MEMORY_TYPE:
				return createMemoryTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.STRUCTURE_TYPE:
				return createStructureTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.CACHE_TYPE:
				return createCacheTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.SCHED_POLICY:
				return createSchedPolicyFromString(eDataType, initialValue);
			case AmaltheaPackage.WRITE_STRATEGY:
				return createWriteStrategyFromString(eDataType, initialValue);
			case AmaltheaPackage.PU_TYPE:
				return createPuTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.PORT_INTERFACE:
				return createPortInterfaceFromString(eDataType, initialValue);
			case AmaltheaPackage.HW_FEATURE_TYPE:
				return createHwFeatureTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.MEMORY_ADDRESS_MAPPING_TYPE:
				return createMemoryAddressMappingTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.OS_DATA_CONSISTENCY_MODE:
				return createOsDataConsistencyModeFromString(eDataType, initialValue);
			case AmaltheaPackage.ACCESS_MULTIPLICITY:
				return createAccessMultiplicityFromString(eDataType, initialValue);
			case AmaltheaPackage.DATA_STABILITY_LEVEL:
				return createDataStabilityLevelFromString(eDataType, initialValue);
			case AmaltheaPackage.SEMAPHORE_TYPE:
				return createSemaphoreTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.CONDITION:
				return createConditionFromString(eDataType, initialValue);
			case AmaltheaPackage.GROUPING_TYPE:
				return createGroupingTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.WAIT_EVENT_TYPE:
				return createWaitEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.WAITING_BEHAVIOUR:
				return createWaitingBehaviourFromString(eDataType, initialValue);
			case AmaltheaPackage.ISR_CATEGORY:
				return createISRCategoryFromString(eDataType, initialValue);
			case AmaltheaPackage.ACCESS_PRECEDENCE_TYPE:
				return createAccessPrecedenceTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.LABEL_DATA_STABILITY:
				return createLabelDataStabilityFromString(eDataType, initialValue);
			case AmaltheaPackage.MODE_LABEL_ACCESS_ENUM:
				return createModeLabelAccessEnumFromString(eDataType, initialValue);
			case AmaltheaPackage.RECEIVE_OPERATION:
				return createReceiveOperationFromString(eDataType, initialValue);
			case AmaltheaPackage.LABEL_ACCESS_DATA_STABILITY:
				return createLabelAccessDataStabilityFromString(eDataType, initialValue);
			case AmaltheaPackage.LABEL_ACCESS_ENUM:
				return createLabelAccessEnumFromString(eDataType, initialValue);
			case AmaltheaPackage.LABEL_ACCESS_IMPLEMENTATION:
				return createLabelAccessImplementationFromString(eDataType, initialValue);
			case AmaltheaPackage.SEMAPHORE_ACCESS_ENUM:
				return createSemaphoreAccessEnumFromString(eDataType, initialValue);
			case AmaltheaPackage.BLOCKING_TYPE:
				return createBlockingTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.PREEMPTION:
				return createPreemptionFromString(eDataType, initialValue);
			case AmaltheaPackage.CONCURRENCY_TYPE:
				return createConcurrencyTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.ASIL_TYPE:
				return createASILTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.ADDRESS:
				return createAddressFromString(eDataType, initialValue);
			case AmaltheaPackage.POSITIVE_INT:
				return createPositiveIntFromString(eDataType, initialValue);
			case AmaltheaPackage.POSITIVE_LONG:
				return createPositiveLongFromString(eDataType, initialValue);
			case AmaltheaPackage.POSITIVE_DOUBLE:
				return createPositiveDoubleFromString(eDataType, initialValue);
			case AmaltheaPackage.NON_NEGATIVE_DOUBLE:
				return createNonNegativeDoubleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AmaltheaPackage.RELATIONAL_OPERATOR:
				return convertRelationalOperatorToString(eDataType, instanceValue);
			case AmaltheaPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case AmaltheaPackage.FREQUENCY_UNIT:
				return convertFrequencyUnitToString(eDataType, instanceValue);
			case AmaltheaPackage.VOLTAGE_UNIT:
				return convertVoltageUnitToString(eDataType, instanceValue);
			case AmaltheaPackage.DATA_SIZE_UNIT:
				return convertDataSizeUnitToString(eDataType, instanceValue);
			case AmaltheaPackage.DATA_RATE_UNIT:
				return convertDataRateUnitToString(eDataType, instanceValue);
			case AmaltheaPackage.SAMPLING_TYPE:
				return convertSamplingTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.INTERFACE_KIND:
				return convertInterfaceKindToString(eDataType, instanceValue);
			case AmaltheaPackage.RUNNABLE_ORDER_TYPE:
				return convertRunnableOrderTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.SYNCHRONIZATION_TYPE:
				return convertSynchronizationTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.MAPPING_TYPE:
				return convertMappingTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.LATENCY_TYPE:
				return convertLatencyTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.SEVERITY:
				return convertSeverityToString(eDataType, instanceValue);
			case AmaltheaPackage.LIMIT_TYPE:
				return convertLimitTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.TIME_METRIC:
				return convertTimeMetricToString(eDataType, instanceValue);
			case AmaltheaPackage.COUNT_METRIC:
				return convertCountMetricToString(eDataType, instanceValue);
			case AmaltheaPackage.PERCENTAGE_METRIC:
				return convertPercentageMetricToString(eDataType, instanceValue);
			case AmaltheaPackage.CPU_PERCENTAGE_METRIC:
				return convertCPUPercentageMetricToString(eDataType, instanceValue);
			case AmaltheaPackage.FREQUENCY_METRIC:
				return convertFrequencyMetricToString(eDataType, instanceValue);
			case AmaltheaPackage.COHERENCY_DIRECTION:
				return convertCoherencyDirectionToString(eDataType, instanceValue);
			case AmaltheaPackage.PROCESS_EVENT_TYPE:
				return convertProcessEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.RUNNABLE_EVENT_TYPE:
				return convertRunnableEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.LABEL_EVENT_TYPE:
				return convertLabelEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.CHANNEL_EVENT_TYPE:
				return convertChannelEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.SEMAPHORE_EVENT_TYPE:
				return convertSemaphoreEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.COMPONENT_EVENT_TYPE:
				return convertComponentEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.MEMORY_TYPE:
				return convertMemoryTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.STRUCTURE_TYPE:
				return convertStructureTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.CACHE_TYPE:
				return convertCacheTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.SCHED_POLICY:
				return convertSchedPolicyToString(eDataType, instanceValue);
			case AmaltheaPackage.WRITE_STRATEGY:
				return convertWriteStrategyToString(eDataType, instanceValue);
			case AmaltheaPackage.PU_TYPE:
				return convertPuTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.PORT_INTERFACE:
				return convertPortInterfaceToString(eDataType, instanceValue);
			case AmaltheaPackage.HW_FEATURE_TYPE:
				return convertHwFeatureTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.MEMORY_ADDRESS_MAPPING_TYPE:
				return convertMemoryAddressMappingTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.OS_DATA_CONSISTENCY_MODE:
				return convertOsDataConsistencyModeToString(eDataType, instanceValue);
			case AmaltheaPackage.ACCESS_MULTIPLICITY:
				return convertAccessMultiplicityToString(eDataType, instanceValue);
			case AmaltheaPackage.DATA_STABILITY_LEVEL:
				return convertDataStabilityLevelToString(eDataType, instanceValue);
			case AmaltheaPackage.SEMAPHORE_TYPE:
				return convertSemaphoreTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.CONDITION:
				return convertConditionToString(eDataType, instanceValue);
			case AmaltheaPackage.GROUPING_TYPE:
				return convertGroupingTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.WAIT_EVENT_TYPE:
				return convertWaitEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.WAITING_BEHAVIOUR:
				return convertWaitingBehaviourToString(eDataType, instanceValue);
			case AmaltheaPackage.ISR_CATEGORY:
				return convertISRCategoryToString(eDataType, instanceValue);
			case AmaltheaPackage.ACCESS_PRECEDENCE_TYPE:
				return convertAccessPrecedenceTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.LABEL_DATA_STABILITY:
				return convertLabelDataStabilityToString(eDataType, instanceValue);
			case AmaltheaPackage.MODE_LABEL_ACCESS_ENUM:
				return convertModeLabelAccessEnumToString(eDataType, instanceValue);
			case AmaltheaPackage.RECEIVE_OPERATION:
				return convertReceiveOperationToString(eDataType, instanceValue);
			case AmaltheaPackage.LABEL_ACCESS_DATA_STABILITY:
				return convertLabelAccessDataStabilityToString(eDataType, instanceValue);
			case AmaltheaPackage.LABEL_ACCESS_ENUM:
				return convertLabelAccessEnumToString(eDataType, instanceValue);
			case AmaltheaPackage.LABEL_ACCESS_IMPLEMENTATION:
				return convertLabelAccessImplementationToString(eDataType, instanceValue);
			case AmaltheaPackage.SEMAPHORE_ACCESS_ENUM:
				return convertSemaphoreAccessEnumToString(eDataType, instanceValue);
			case AmaltheaPackage.BLOCKING_TYPE:
				return convertBlockingTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.PREEMPTION:
				return convertPreemptionToString(eDataType, instanceValue);
			case AmaltheaPackage.CONCURRENCY_TYPE:
				return convertConcurrencyTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.ASIL_TYPE:
				return convertASILTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.ADDRESS:
				return convertAddressToString(eDataType, instanceValue);
			case AmaltheaPackage.POSITIVE_INT:
				return convertPositiveIntToString(eDataType, instanceValue);
			case AmaltheaPackage.POSITIVE_LONG:
				return convertPositiveLongToString(eDataType, instanceValue);
			case AmaltheaPackage.POSITIVE_DOUBLE:
				return convertPositiveDoubleToString(eDataType, instanceValue);
			case AmaltheaPackage.NON_NEGATIVE_DOUBLE:
				return convertNonNegativeDoubleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Amalthea createAmalthea() {
		AmaltheaImpl amalthea = new AmaltheaImpl();
		return amalthea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonElements createCommonElements() {
		CommonElementsImpl commonElements = new CommonElementsImpl();
		return commonElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreClassifier createCoreClassifier() {
		CoreClassifierImpl coreClassifier = new CoreClassifierImpl();
		return coreClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryClassifier createMemoryClassifier() {
		MemoryClassifierImpl memoryClassifier = new MemoryClassifierImpl();
		return memoryClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionPolicy createTransmissionPolicy() {
		TransmissionPolicyImpl transmissionPolicy = new TransmissionPolicyImpl();
		return transmissionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Frequency createFrequency() {
		FrequencyImpl frequency = new FrequencyImpl();
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Voltage createVoltage() {
		VoltageImpl voltage = new VoltageImpl();
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSize createDataSize() {
		DataSizeImpl dataSize = new DataSizeImpl();
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRate createDataRate() {
		DataRateImpl dataRate = new DataRateImpl();
		return dataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Value> createCustomProperty() {
		CustomPropertyImpl customProperty = new CustomPropertyImpl();
		return customProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListObject createListObject() {
		ListObjectImpl listObject = new ListObjectImpl();
		return listObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringObject createStringObject() {
		StringObjectImpl stringObject = new StringObjectImpl();
		return stringObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigIntegerObject createBigIntegerObject() {
		BigIntegerObjectImpl bigIntegerObject = new BigIntegerObjectImpl();
		return bigIntegerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceObject createReferenceObject() {
		ReferenceObjectImpl referenceObject = new ReferenceObjectImpl();
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerObject createIntegerObject() {
		IntegerObjectImpl integerObject = new IntegerObjectImpl();
		return integerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongObject createLongObject() {
		LongObjectImpl longObject = new LongObjectImpl();
		return longObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatObject createFloatObject() {
		FloatObjectImpl floatObject = new FloatObjectImpl();
		return floatObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleObject createDoubleObject() {
		DoubleObjectImpl doubleObject = new DoubleObjectImpl();
		return doubleObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanObject createBooleanObject() {
		BooleanObjectImpl booleanObject = new BooleanObjectImpl();
		return booleanObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinAvgMaxStatistic createMinAvgMaxStatistic() {
		MinAvgMaxStatisticImpl minAvgMaxStatistic = new MinAvgMaxStatisticImpl();
		return minAvgMaxStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleValueStatistic createSingleValueStatistic() {
		SingleValueStatisticImpl singleValueStatistic = new SingleValueStatisticImpl();
		return singleValueStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeConstant createTimeConstant() {
		TimeConstantImpl timeConstant = new TimeConstantImpl();
		return timeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeHistogram createTimeHistogram() {
		TimeHistogramImpl timeHistogram = new TimeHistogramImpl();
		return timeHistogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeHistogramEntry createTimeHistogramEntry() {
		TimeHistogramEntryImpl timeHistogramEntry = new TimeHistogramEntryImpl();
		return timeHistogramEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeBoundaries createTimeBoundaries() {
		TimeBoundariesImpl timeBoundaries = new TimeBoundariesImpl();
		return timeBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStatistics createTimeStatistics() {
		TimeStatisticsImpl timeStatistics = new TimeStatisticsImpl();
		return timeStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeUniformDistribution createTimeUniformDistribution() {
		TimeUniformDistributionImpl timeUniformDistribution = new TimeUniformDistributionImpl();
		return timeUniformDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeGaussDistribution createTimeGaussDistribution() {
		TimeGaussDistributionImpl timeGaussDistribution = new TimeGaussDistributionImpl();
		return timeGaussDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWeibullEstimatorsDistribution createTimeWeibullEstimatorsDistribution() {
		TimeWeibullEstimatorsDistributionImpl timeWeibullEstimatorsDistribution = new TimeWeibullEstimatorsDistributionImpl();
		return timeWeibullEstimatorsDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeBetaDistribution createTimeBetaDistribution() {
		TimeBetaDistributionImpl timeBetaDistribution = new TimeBetaDistributionImpl();
		return timeBetaDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueConstant createDiscreteValueConstant() {
		DiscreteValueConstantImpl discreteValueConstant = new DiscreteValueConstantImpl();
		return discreteValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueHistogram createDiscreteValueHistogram() {
		DiscreteValueHistogramImpl discreteValueHistogram = new DiscreteValueHistogramImpl();
		return discreteValueHistogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueHistogramEntry createDiscreteValueHistogramEntry() {
		DiscreteValueHistogramEntryImpl discreteValueHistogramEntry = new DiscreteValueHistogramEntryImpl();
		return discreteValueHistogramEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueBoundaries createDiscreteValueBoundaries() {
		DiscreteValueBoundariesImpl discreteValueBoundaries = new DiscreteValueBoundariesImpl();
		return discreteValueBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueStatistics createDiscreteValueStatistics() {
		DiscreteValueStatisticsImpl discreteValueStatistics = new DiscreteValueStatisticsImpl();
		return discreteValueStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueUniformDistribution createDiscreteValueUniformDistribution() {
		DiscreteValueUniformDistributionImpl discreteValueUniformDistribution = new DiscreteValueUniformDistributionImpl();
		return discreteValueUniformDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueGaussDistribution createDiscreteValueGaussDistribution() {
		DiscreteValueGaussDistributionImpl discreteValueGaussDistribution = new DiscreteValueGaussDistributionImpl();
		return discreteValueGaussDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueWeibullEstimatorsDistribution createDiscreteValueWeibullEstimatorsDistribution() {
		DiscreteValueWeibullEstimatorsDistributionImpl discreteValueWeibullEstimatorsDistribution = new DiscreteValueWeibullEstimatorsDistributionImpl();
		return discreteValueWeibullEstimatorsDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteValueBetaDistribution createDiscreteValueBetaDistribution() {
		DiscreteValueBetaDistributionImpl discreteValueBetaDistribution = new DiscreteValueBetaDistributionImpl();
		return discreteValueBetaDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueConstant createContinuousValueConstant() {
		ContinuousValueConstantImpl continuousValueConstant = new ContinuousValueConstantImpl();
		return continuousValueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueHistogram createContinuousValueHistogram() {
		ContinuousValueHistogramImpl continuousValueHistogram = new ContinuousValueHistogramImpl();
		return continuousValueHistogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueHistogramEntry createContinuousValueHistogramEntry() {
		ContinuousValueHistogramEntryImpl continuousValueHistogramEntry = new ContinuousValueHistogramEntryImpl();
		return continuousValueHistogramEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueBoundaries createContinuousValueBoundaries() {
		ContinuousValueBoundariesImpl continuousValueBoundaries = new ContinuousValueBoundariesImpl();
		return continuousValueBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueStatistics createContinuousValueStatistics() {
		ContinuousValueStatisticsImpl continuousValueStatistics = new ContinuousValueStatisticsImpl();
		return continuousValueStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueUniformDistribution createContinuousValueUniformDistribution() {
		ContinuousValueUniformDistributionImpl continuousValueUniformDistribution = new ContinuousValueUniformDistributionImpl();
		return continuousValueUniformDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueGaussDistribution createContinuousValueGaussDistribution() {
		ContinuousValueGaussDistributionImpl continuousValueGaussDistribution = new ContinuousValueGaussDistributionImpl();
		return continuousValueGaussDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueWeibullEstimatorsDistribution createContinuousValueWeibullEstimatorsDistribution() {
		ContinuousValueWeibullEstimatorsDistributionImpl continuousValueWeibullEstimatorsDistribution = new ContinuousValueWeibullEstimatorsDistributionImpl();
		return continuousValueWeibullEstimatorsDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousValueBetaDistribution createContinuousValueBetaDistribution() {
		ContinuousValueBetaDistributionImpl continuousValueBetaDistribution = new ContinuousValueBetaDistributionImpl();
		return continuousValueBetaDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericMode createNumericMode() {
		NumericModeImpl numericMode = new NumericModeImpl();
		return numericMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumMode createEnumMode() {
		EnumModeImpl enumMode = new EnumModeImpl();
		return enumMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeLiteral createModeLiteral() {
		ModeLiteralImpl modeLiteral = new ModeLiteralImpl();
		return modeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsModel createComponentsModel() {
		ComponentsModelImpl componentsModel = new ComponentsModelImpl();
		return componentsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.app4mc.amalthea.model.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedPort createQualifiedPort() {
		QualifiedPortImpl qualifiedPort = new QualifiedPortImpl();
		return qualifiedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfacePort createInterfacePort() {
		InterfacePortImpl interfacePort = new InterfacePortImpl();
		return interfacePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigModel createConfigModel() {
		ConfigModelImpl configModel = new ConfigModelImpl();
		return configModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventConfig createEventConfig() {
		EventConfigImpl eventConfig = new EventConfigImpl();
		return eventConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintsModel createConstraintsModel() {
		ConstraintsModelImpl constraintsModel = new ConstraintsModelImpl();
		return constraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableSequencingConstraint createRunnableSequencingConstraint() {
		RunnableSequencingConstraintImpl runnableSequencingConstraint = new RunnableSequencingConstraintImpl();
		return runnableSequencingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableSeparationConstraint createRunnableSeparationConstraint() {
		RunnableSeparationConstraintImpl runnableSeparationConstraint = new RunnableSeparationConstraintImpl();
		return runnableSeparationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessSeparationConstraint createProcessSeparationConstraint() {
		ProcessSeparationConstraintImpl processSeparationConstraint = new ProcessSeparationConstraintImpl();
		return processSeparationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSeparationConstraint createDataSeparationConstraint() {
		DataSeparationConstraintImpl dataSeparationConstraint = new DataSeparationConstraintImpl();
		return dataSeparationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnablePairingConstraint createRunnablePairingConstraint() {
		RunnablePairingConstraintImpl runnablePairingConstraint = new RunnablePairingConstraintImpl();
		return runnablePairingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessPairingConstraint createProcessPairingConstraint() {
		ProcessPairingConstraintImpl processPairingConstraint = new ProcessPairingConstraintImpl();
		return processPairingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPairingConstraint createDataPairingConstraint() {
		DataPairingConstraintImpl dataPairingConstraint = new DataPairingConstraintImpl();
		return dataPairingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetMemory createTargetMemory() {
		TargetMemoryImpl targetMemory = new TargetMemoryImpl();
		return targetMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetCore createTargetCore() {
		TargetCoreImpl targetCore = new TargetCoreImpl();
		return targetCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetScheduler createTargetScheduler() {
		TargetSchedulerImpl targetScheduler = new TargetSchedulerImpl();
		return targetScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelEntityGroup createLabelEntityGroup() {
		LabelEntityGroupImpl labelEntityGroup = new LabelEntityGroupImpl();
		return labelEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableEntityGroup createRunnableEntityGroup() {
		RunnableEntityGroupImpl runnableEntityGroup = new RunnableEntityGroupImpl();
		return runnableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessEntityGroup createProcessEntityGroup() {
		ProcessEntityGroupImpl processEntityGroup = new ProcessEntityGroupImpl();
		return processEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagGroup createTagGroup() {
		TagGroupImpl tagGroup = new TagGroupImpl();
		return tagGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventChain createEventChain() {
		EventChainImpl eventChain = new EventChainImpl();
		return eventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubEventChain createSubEventChain() {
		SubEventChainImpl subEventChain = new SubEventChainImpl();
		return subEventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventChainReference createEventChainReference() {
		EventChainReferenceImpl eventChainReference = new EventChainReferenceImpl();
		return eventChainReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventChainContainer createEventChainContainer() {
		EventChainContainerImpl eventChainContainer = new EventChainContainerImpl();
		return eventChainContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalSectionConstraint createPhysicalSectionConstraint() {
		PhysicalSectionConstraintImpl physicalSectionConstraint = new PhysicalSectionConstraintImpl();
		return physicalSectionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventSynchronizationConstraint createEventSynchronizationConstraint() {
		EventSynchronizationConstraintImpl eventSynchronizationConstraint = new EventSynchronizationConstraintImpl();
		return eventSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventChainSynchronizationConstraint createEventChainSynchronizationConstraint() {
		EventChainSynchronizationConstraintImpl eventChainSynchronizationConstraint = new EventChainSynchronizationConstraintImpl();
		return eventChainSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DelayConstraint createDelayConstraint() {
		DelayConstraintImpl delayConstraint = new DelayConstraintImpl();
		return delayConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventChainLatencyConstraint createEventChainLatencyConstraint() {
		EventChainLatencyConstraintImpl eventChainLatencyConstraint = new EventChainLatencyConstraintImpl();
		return eventChainLatencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepetitionConstraint createRepetitionConstraint() {
		RepetitionConstraintImpl repetitionConstraint = new RepetitionConstraintImpl();
		return repetitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAgeConstraint createDataAgeConstraint() {
		DataAgeConstraintImpl dataAgeConstraint = new DataAgeConstraintImpl();
		return dataAgeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAgeCycle createDataAgeCycle() {
		DataAgeCycleImpl dataAgeCycle = new DataAgeCycleImpl();
		return dataAgeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAgeTime createDataAgeTime() {
		DataAgeTimeImpl dataAgeTime = new DataAgeTimeImpl();
		return dataAgeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessRequirement createProcessRequirement() {
		ProcessRequirementImpl processRequirement = new ProcessRequirementImpl();
		return processRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableRequirement createRunnableRequirement() {
		RunnableRequirementImpl runnableRequirement = new RunnableRequirementImpl();
		return runnableRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitectureRequirement createArchitectureRequirement() {
		ArchitectureRequirementImpl architectureRequirement = new ArchitectureRequirementImpl();
		return architectureRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessChainRequirement createProcessChainRequirement() {
		ProcessChainRequirementImpl processChainRequirement = new ProcessChainRequirementImpl();
		return processChainRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUPercentageRequirementLimit createCPUPercentageRequirementLimit() {
		CPUPercentageRequirementLimitImpl cpuPercentageRequirementLimit = new CPUPercentageRequirementLimitImpl();
		return cpuPercentageRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyRequirementLimit createFrequencyRequirementLimit() {
		FrequencyRequirementLimitImpl frequencyRequirementLimit = new FrequencyRequirementLimitImpl();
		return frequencyRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PercentageRequirementLimit createPercentageRequirementLimit() {
		PercentageRequirementLimitImpl percentageRequirementLimit = new PercentageRequirementLimitImpl();
		return percentageRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountRequirementLimit createCountRequirementLimit() {
		CountRequirementLimitImpl countRequirementLimit = new CountRequirementLimitImpl();
		return countRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeRequirementLimit createTimeRequirementLimit() {
		TimeRequirementLimitImpl timeRequirementLimit = new TimeRequirementLimitImpl();
		return timeRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCoherencyGroup createDataCoherencyGroup() {
		DataCoherencyGroupImpl dataCoherencyGroup = new DataCoherencyGroupImpl();
		return dataCoherencyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStabilityGroup createDataStabilityGroup() {
		DataStabilityGroupImpl dataStabilityGroup = new DataStabilityGroupImpl();
		return dataStabilityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessScope createProcessScope() {
		ProcessScopeImpl processScope = new ProcessScopeImpl();
		return processScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableScope createRunnableScope() {
		RunnableScopeImpl runnableScope = new RunnableScopeImpl();
		return runnableScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentScope createComponentScope() {
		ComponentScopeImpl componentScope = new ComponentScopeImpl();
		return componentScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventModel createEventModel() {
		EventModelImpl eventModel = new EventModelImpl();
		return eventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventSet createEventSet() {
		EventSetImpl eventSet = new EventSetImpl();
		return eventSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomEvent createCustomEvent() {
		CustomEventImpl customEvent = new CustomEventImpl();
		return customEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StimulusEvent createStimulusEvent() {
		StimulusEventImpl stimulusEvent = new StimulusEventImpl();
		return stimulusEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessEvent createProcessEvent() {
		ProcessEventImpl processEvent = new ProcessEventImpl();
		return processEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessChainEvent createProcessChainEvent() {
		ProcessChainEventImpl processChainEvent = new ProcessChainEventImpl();
		return processChainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableEvent createRunnableEvent() {
		RunnableEventImpl runnableEvent = new RunnableEventImpl();
		return runnableEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelEvent createLabelEvent() {
		LabelEventImpl labelEvent = new LabelEventImpl();
		return labelEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelEvent createChannelEvent() {
		ChannelEventImpl channelEvent = new ChannelEventImpl();
		return channelEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemaphoreEvent createSemaphoreEvent() {
		SemaphoreEventImpl semaphoreEvent = new SemaphoreEventImpl();
		return semaphoreEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentEvent createComponentEvent() {
		ComponentEventImpl componentEvent = new ComponentEventImpl();
		return componentEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HWModel createHWModel() {
		HWModelImpl hwModel = new HWModelImpl();
		return hwModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwStructure createHwStructure() {
		HwStructureImpl hwStructure = new HwStructureImpl();
		return hwStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrequencyDomain createFrequencyDomain() {
		FrequencyDomainImpl frequencyDomain = new FrequencyDomainImpl();
		return frequencyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerDomain createPowerDomain() {
		PowerDomainImpl powerDomain = new PowerDomainImpl();
		return powerDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingUnit createProcessingUnit() {
		ProcessingUnitImpl processingUnit = new ProcessingUnitImpl();
		return processingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwFeatureCategory createHwFeatureCategory() {
		HwFeatureCategoryImpl hwFeatureCategory = new HwFeatureCategoryImpl();
		return hwFeatureCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwFeature createHwFeature() {
		HwFeatureImpl hwFeature = new HwFeatureImpl();
		return hwFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwPort createHwPort() {
		HwPortImpl hwPort = new HwPortImpl();
		return hwPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionHandler createConnectionHandler() {
		ConnectionHandlerImpl connectionHandler = new ConnectionHandlerImpl();
		return connectionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwConnection createHwConnection() {
		HwConnectionImpl hwConnection = new HwConnectionImpl();
		return hwConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwAccessElement createHwAccessElement() {
		HwAccessElementImpl hwAccessElement = new HwAccessElementImpl();
		return hwAccessElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingUnitDefinition createProcessingUnitDefinition() {
		ProcessingUnitDefinitionImpl processingUnitDefinition = new ProcessingUnitDefinitionImpl();
		return processingUnitDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionHandlerDefinition createConnectionHandlerDefinition() {
		ConnectionHandlerDefinitionImpl connectionHandlerDefinition = new ConnectionHandlerDefinitionImpl();
		return connectionHandlerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryDefinition createMemoryDefinition() {
		MemoryDefinitionImpl memoryDefinition = new MemoryDefinitionImpl();
		return memoryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDefinition createCacheDefinition() {
		CacheDefinitionImpl cacheDefinition = new CacheDefinitionImpl();
		return cacheDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HwAccessPath createHwAccessPath() {
		HwAccessPathImpl hwAccessPath = new HwAccessPathImpl();
		return hwAccessPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingModel createMappingModel() {
		MappingModelImpl mappingModel = new MappingModelImpl();
		return mappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulerAllocation createSchedulerAllocation() {
		SchedulerAllocationImpl schedulerAllocation = new SchedulerAllocationImpl();
		return schedulerAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskAllocation createTaskAllocation() {
		TaskAllocationImpl taskAllocation = new TaskAllocationImpl();
		return taskAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISRAllocation createISRAllocation() {
		ISRAllocationImpl isrAllocation = new ISRAllocationImpl();
		return isrAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableAllocation createRunnableAllocation() {
		RunnableAllocationImpl runnableAllocation = new RunnableAllocationImpl();
		return runnableAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryMapping createMemoryMapping() {
		MemoryMappingImpl memoryMapping = new MemoryMappingImpl();
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalSectionMapping createPhysicalSectionMapping() {
		PhysicalSectionMappingImpl physicalSectionMapping = new PhysicalSectionMappingImpl();
		return physicalSectionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OSModel createOSModel() {
		OSModelImpl osModel = new OSModelImpl();
		return osModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsDataConsistency createOsDataConsistency() {
		OsDataConsistencyImpl osDataConsistency = new OsDataConsistencyImpl();
		return osDataConsistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStability createDataStability() {
		DataStabilityImpl dataStability = new DataStabilityImpl();
		return dataStability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonAtomicDataCoherency createNonAtomicDataCoherency() {
		NonAtomicDataCoherencyImpl nonAtomicDataCoherency = new NonAtomicDataCoherencyImpl();
		return nonAtomicDataCoherency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semaphore createSemaphore() {
		SemaphoreImpl semaphore = new SemaphoreImpl();
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskScheduler createTaskScheduler() {
		TaskSchedulerImpl taskScheduler = new TaskSchedulerImpl();
		return taskScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulerAssociation createSchedulerAssociation() {
		SchedulerAssociationImpl schedulerAssociation = new SchedulerAssociationImpl();
		return schedulerAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterruptController createInterruptController() {
		InterruptControllerImpl interruptController = new InterruptControllerImpl();
		return interruptController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingParameters createSchedulingParameters() {
		SchedulingParametersImpl schedulingParameters = new SchedulingParametersImpl();
		return schedulingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createParameterExtension() {
		ParameterExtensionImpl parameterExtension = new ParameterExtensionImpl();
		return parameterExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedPriorityPreemptive createFixedPriorityPreemptive() {
		FixedPriorityPreemptiveImpl fixedPriorityPreemptive = new FixedPriorityPreemptiveImpl();
		return fixedPriorityPreemptive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedPriorityPreemptiveWithBudgetEnforcement createFixedPriorityPreemptiveWithBudgetEnforcement() {
		FixedPriorityPreemptiveWithBudgetEnforcementImpl fixedPriorityPreemptiveWithBudgetEnforcement = new FixedPriorityPreemptiveWithBudgetEnforcementImpl();
		return fixedPriorityPreemptiveWithBudgetEnforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OSEK createOSEK() {
		OSEKImpl osek = new OSEKImpl();
		return osek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeadlineMonotonic createDeadlineMonotonic() {
		DeadlineMonotonicImpl deadlineMonotonic = new DeadlineMonotonicImpl();
		return deadlineMonotonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RateMonotonic createRateMonotonic() {
		RateMonotonicImpl rateMonotonic = new RateMonotonicImpl();
		return rateMonotonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PfairPD2 createPfairPD2() {
		PfairPD2Impl pfairPD2 = new PfairPD2Impl();
		return pfairPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartlyPFairPD2 createPartlyPFairPD2() {
		PartlyPFairPD2Impl partlyPFairPD2 = new PartlyPFairPD2Impl();
		return partlyPFairPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EarlyReleaseFairPD2 createEarlyReleaseFairPD2() {
		EarlyReleaseFairPD2Impl earlyReleaseFairPD2 = new EarlyReleaseFairPD2Impl();
		return earlyReleaseFairPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartlyEarlyReleaseFairPD2 createPartlyEarlyReleaseFairPD2() {
		PartlyEarlyReleaseFairPD2Impl partlyEarlyReleaseFairPD2 = new PartlyEarlyReleaseFairPD2Impl();
		return partlyEarlyReleaseFairPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeastLocalRemainingExecutionTimeFirst createLeastLocalRemainingExecutionTimeFirst() {
		LeastLocalRemainingExecutionTimeFirstImpl leastLocalRemainingExecutionTimeFirst = new LeastLocalRemainingExecutionTimeFirstImpl();
		return leastLocalRemainingExecutionTimeFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EarliestDeadlineFirst createEarliestDeadlineFirst() {
		EarliestDeadlineFirstImpl earliestDeadlineFirst = new EarliestDeadlineFirstImpl();
		return earliestDeadlineFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriorityBasedRoundRobin createPriorityBasedRoundRobin() {
		PriorityBasedRoundRobinImpl priorityBasedRoundRobin = new PriorityBasedRoundRobinImpl();
		return priorityBasedRoundRobin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeferrableServer createDeferrableServer() {
		DeferrableServerImpl deferrableServer = new DeferrableServerImpl();
		return deferrableServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PollingPeriodicServer createPollingPeriodicServer() {
		PollingPeriodicServerImpl pollingPeriodicServer = new PollingPeriodicServerImpl();
		return pollingPeriodicServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SporadicServer createSporadicServer() {
		SporadicServerImpl sporadicServer = new SporadicServerImpl();
		return sporadicServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantBandwidthServer createConstantBandwidthServer() {
		ConstantBandwidthServerImpl constantBandwidthServer = new ConstantBandwidthServerImpl();
		return constantBandwidthServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantBandwidthServerWithCASH createConstantBandwidthServerWithCASH() {
		ConstantBandwidthServerWithCASHImpl constantBandwidthServerWithCASH = new ConstantBandwidthServerWithCASHImpl();
		return constantBandwidthServerWithCASH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grouping createGrouping() {
		GroupingImpl grouping = new GroupingImpl();
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserSpecificSchedulingAlgorithm createUserSpecificSchedulingAlgorithm() {
		UserSpecificSchedulingAlgorithmImpl userSpecificSchedulingAlgorithm = new UserSpecificSchedulingAlgorithmImpl();
		return userSpecificSchedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriorityBased createPriorityBased() {
		PriorityBasedImpl priorityBased = new PriorityBasedImpl();
		return priorityBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VendorOperatingSystem createVendorOperatingSystem() {
		VendorOperatingSystemImpl vendorOperatingSystem = new VendorOperatingSystemImpl();
		return vendorOperatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsOverhead createOsOverhead() {
		OsOverheadImpl osOverhead = new OsOverheadImpl();
		return osOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsAPIOverhead createOsAPIOverhead() {
		OsAPIOverheadImpl osAPIOverhead = new OsAPIOverheadImpl();
		return osAPIOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsISROverhead createOsISROverhead() {
		OsISROverheadImpl osISROverhead = new OsISROverheadImpl();
		return osISROverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyConstraintsModel createPropertyConstraintsModel() {
		PropertyConstraintsModelImpl propertyConstraintsModel = new PropertyConstraintsModelImpl();
		return propertyConstraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessAllocationConstraint createProcessAllocationConstraint() {
		ProcessAllocationConstraintImpl processAllocationConstraint = new ProcessAllocationConstraintImpl();
		return processAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessPrototypeAllocationConstraint createProcessPrototypeAllocationConstraint() {
		ProcessPrototypeAllocationConstraintImpl processPrototypeAllocationConstraint = new ProcessPrototypeAllocationConstraintImpl();
		return processPrototypeAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableAllocationConstraint createRunnableAllocationConstraint() {
		RunnableAllocationConstraintImpl runnableAllocationConstraint = new RunnableAllocationConstraintImpl();
		return runnableAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractElementMappingConstraint createAbstractElementMappingConstraint() {
		AbstractElementMappingConstraintImpl abstractElementMappingConstraint = new AbstractElementMappingConstraintImpl();
		return abstractElementMappingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreClassification createCoreClassification() {
		CoreClassificationImpl coreClassification = new CoreClassificationImpl();
		return coreClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryClassification createMemoryClassification() {
		MemoryClassificationImpl memoryClassification = new MemoryClassificationImpl();
		return memoryClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StimuliModel createStimuliModel() {
		StimuliModelImpl stimuliModel = new StimuliModelImpl();
		return stimuliModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeValueList createModeValueList() {
		ModeValueListImpl modeValueList = new ModeValueListImpl();
		return modeValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ModeLabel, String> createModeValueMapEntry() {
		ModeValueMapEntryImpl modeValueMapEntry = new ModeValueMapEntryImpl();
		return modeValueMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeAssignment createModeAssignment() {
		ModeAssignmentImpl modeAssignment = new ModeAssignmentImpl();
		return modeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeConditionDisjunction createModeConditionDisjunction() {
		ModeConditionDisjunctionImpl modeConditionDisjunction = new ModeConditionDisjunctionImpl();
		return modeConditionDisjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeCondition createModeCondition() {
		ModeConditionImpl modeCondition = new ModeConditionImpl();
		return modeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeConditionConjunction createModeConditionConjunction() {
		ModeConditionConjunctionImpl modeConditionConjunction = new ModeConditionConjunctionImpl();
		return modeConditionConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodicStimulus createPeriodicStimulus() {
		PeriodicStimulusImpl periodicStimulus = new PeriodicStimulusImpl();
		return periodicStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativePeriodicStimulus createRelativePeriodicStimulus() {
		RelativePeriodicStimulusImpl relativePeriodicStimulus = new RelativePeriodicStimulusImpl();
		return relativePeriodicStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableRateStimulus createVariableRateStimulus() {
		VariableRateStimulusImpl variableRateStimulus = new VariableRateStimulusImpl();
		return variableRateStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodicSyntheticStimulus createPeriodicSyntheticStimulus() {
		PeriodicSyntheticStimulusImpl periodicSyntheticStimulus = new PeriodicSyntheticStimulusImpl();
		return periodicSyntheticStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomStimulus createCustomStimulus() {
		CustomStimulusImpl customStimulus = new CustomStimulusImpl();
		return customStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleStimulus createSingleStimulus() {
		SingleStimulusImpl singleStimulus = new SingleStimulusImpl();
		return singleStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterProcessStimulus createInterProcessStimulus() {
		InterProcessStimulusImpl interProcessStimulus = new InterProcessStimulusImpl();
		return interProcessStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodicBurstStimulus createPeriodicBurstStimulus() {
		PeriodicBurstStimulusImpl periodicBurstStimulus = new PeriodicBurstStimulusImpl();
		return periodicBurstStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventStimulus createEventStimulus() {
		EventStimulusImpl eventStimulus = new EventStimulusImpl();
		return eventStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrivalCurveStimulus createArrivalCurveStimulus() {
		ArrivalCurveStimulusImpl arrivalCurveStimulus = new ArrivalCurveStimulusImpl();
		return arrivalCurveStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrivalCurveEntry createArrivalCurveEntry() {
		ArrivalCurveEntryImpl arrivalCurveEntry = new ArrivalCurveEntryImpl();
		return arrivalCurveEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClockTriangleFunction createClockTriangleFunction() {
		ClockTriangleFunctionImpl clockTriangleFunction = new ClockTriangleFunctionImpl();
		return clockTriangleFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClockSinusFunction createClockSinusFunction() {
		ClockSinusFunctionImpl clockSinusFunction = new ClockSinusFunctionImpl();
		return clockSinusFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClockMultiplierList createClockMultiplierList() {
		ClockMultiplierListImpl clockMultiplierList = new ClockMultiplierListImpl();
		return clockMultiplierList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClockMultiplierListEntry createClockMultiplierListEntry() {
		ClockMultiplierListEntryImpl clockMultiplierListEntry = new ClockMultiplierListEntryImpl();
		return clockMultiplierListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SWModel createSWModel() {
		SWModelImpl swModel = new SWModelImpl();
		return swModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomEntity createCustomEntity() {
		CustomEntityImpl customEntity = new CustomEntityImpl();
		return customEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessChain createProcessChain() {
		ProcessChainImpl processChain = new ProcessChainImpl();
		return processChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallGraph createCallGraph() {
		CallGraphImpl callGraph = new CallGraphImpl();
		return callGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeSwitch createModeSwitch() {
		ModeSwitchImpl modeSwitch = new ModeSwitchImpl();
		return modeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeSwitchEntry createModeSwitchEntry() {
		ModeSwitchEntryImpl modeSwitchEntry = new ModeSwitchEntryImpl();
		return modeSwitchEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeSwitchDefault createModeSwitchDefault() {
		ModeSwitchDefaultImpl modeSwitchDefault = new ModeSwitchDefaultImpl();
		return modeSwitchDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbabilitySwitch createProbabilitySwitch() {
		ProbabilitySwitchImpl probabilitySwitch = new ProbabilitySwitchImpl();
		return probabilitySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbabilitySwitchEntry createProbabilitySwitchEntry() {
		ProbabilitySwitchEntryImpl probabilitySwitchEntry = new ProbabilitySwitchEntryImpl();
		return probabilitySwitchEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter createCounter() {
		CounterImpl counter = new CounterImpl();
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WaitEvent createWaitEvent() {
		WaitEventImpl waitEvent = new WaitEventImpl();
		return waitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetEvent createSetEvent() {
		SetEventImpl setEvent = new SetEventImpl();
		return setEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearEvent createClearEvent() {
		ClearEventImpl clearEvent = new ClearEventImpl();
		return clearEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventMask createEventMask() {
		EventMaskImpl eventMask = new EventMaskImpl();
		return eventMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsEvent createOsEvent() {
		OsEventImpl osEvent = new OsEventImpl();
		return osEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterProcessTrigger createInterProcessTrigger() {
		InterProcessTriggerImpl interProcessTrigger = new InterProcessTriggerImpl();
		return interProcessTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnforcedMigration createEnforcedMigration() {
		EnforcedMigrationImpl enforcedMigration = new EnforcedMigrationImpl();
		return enforcedMigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulePoint createSchedulePoint() {
		SchedulePointImpl schedulePoint = new SchedulePointImpl();
		return schedulePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminateProcess createTerminateProcess() {
		TerminateProcessImpl terminateProcess = new TerminateProcessImpl();
		return terminateProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISR createISR() {
		ISRImpl isr = new ISRImpl();
		return isr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessPrototype createProcessPrototype() {
		ProcessPrototypeImpl processPrototype = new ProcessPrototypeImpl();
		return processPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChainedProcessPrototype createChainedProcessPrototype() {
		ChainedProcessPrototypeImpl chainedProcessPrototype = new ChainedProcessPrototypeImpl();
		return chainedProcessPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessPrecedenceSpec createAccessPrecedenceSpec() {
		AccessPrecedenceSpecImpl accessPrecedenceSpec = new AccessPrecedenceSpecImpl();
		return accessPrecedenceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderPrecedenceSpec createOrderPrecedenceSpec() {
		OrderPrecedenceSpecImpl orderPrecedenceSpec = new OrderPrecedenceSpecImpl();
		return orderPrecedenceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDependency createDataDependency() {
		DataDependencyImpl dataDependency = new DataDependencyImpl();
		return dataDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableParameter createRunnableParameter() {
		RunnableParameterImpl runnableParameter = new RunnableParameterImpl();
		return runnableParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.app4mc.amalthea.model.Runnable createRunnable() {
		RunnableImpl runnable = new RunnableImpl();
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeLabel createModeLabel() {
		ModeLabelImpl modeLabel = new ModeLabelImpl();
		return modeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionNeed createExecutionNeed() {
		ExecutionNeedImpl executionNeed = new ExecutionNeedImpl();
		return executionNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, IDiscreteValueDeviation> createNeedEntry() {
		NeedEntryImpl needEntry = new NeedEntryImpl();
		return needEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ticks createTicks() {
		TicksImpl ticks = new TicksImpl();
		return ticks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ProcessingUnitDefinition, IDiscreteValueDeviation> createTicksEntry() {
		TicksEntryImpl ticksEntry = new TicksEntryImpl();
		return ticksEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeLabelAccess createModeLabelAccess() {
		ModeLabelAccessImpl modeLabelAccess = new ModeLabelAccessImpl();
		return modeLabelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelAccess createLabelAccess() {
		LabelAccessImpl labelAccess = new LabelAccessImpl();
		return labelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelSend createChannelSend() {
		ChannelSendImpl channelSend = new ChannelSendImpl();
		return channelSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelReceive createChannelReceive() {
		ChannelReceiveImpl channelReceive = new ChannelReceiveImpl();
		return channelReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemaphoreAccess createSemaphoreAccess() {
		SemaphoreAccessImpl semaphoreAccess = new SemaphoreAccessImpl();
		return semaphoreAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenderReceiverRead createSenderReceiverRead() {
		SenderReceiverReadImpl senderReceiverRead = new SenderReceiverReadImpl();
		return senderReceiverRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SenderReceiverWrite createSenderReceiverWrite() {
		SenderReceiverWriteImpl senderReceiverWrite = new SenderReceiverWriteImpl();
		return senderReceiverWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronousServerCall createSynchronousServerCall() {
		SynchronousServerCallImpl synchronousServerCall = new SynchronousServerCallImpl();
		return synchronousServerCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsynchronousServerCall createAsynchronousServerCall() {
		AsynchronousServerCallImpl asynchronousServerCall = new AsynchronousServerCallImpl();
		return asynchronousServerCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetResultServerCall createGetResultServerCall() {
		GetResultServerCallImpl getResultServerCall = new GetResultServerCallImpl();
		return getResultServerCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallArgument createCallArgument() {
		CallArgumentImpl callArgument = new CallArgumentImpl();
		return callArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableCall createRunnableCall() {
		RunnableCallImpl runnableCall = new RunnableCallImpl();
		return runnableCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomEventTrigger createCustomEventTrigger() {
		CustomEventTriggerImpl customEventTrigger = new CustomEventTriggerImpl();
		return customEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructEntry createStructEntry() {
		StructEntryImpl structEntry = new StructEntryImpl();
		return structEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pointer createPointer() {
		PointerImpl pointer = new PointerImpl();
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeRef createTypeRef() {
		TypeRefImpl typeRef = new TypeRefImpl();
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTypeDefinition createDataTypeDefinition() {
		DataTypeDefinitionImpl dataTypeDefinition = new DataTypeDefinitionImpl();
		return dataTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseTypeDefinition createBaseTypeDefinition() {
		BaseTypeDefinitionImpl baseTypeDefinition = new BaseTypeDefinitionImpl();
		return baseTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodicActivation createPeriodicActivation() {
		PeriodicActivationImpl periodicActivation = new PeriodicActivationImpl();
		return periodicActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableRateActivation createVariableRateActivation() {
		VariableRateActivationImpl variableRateActivation = new VariableRateActivationImpl();
		return variableRateActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SporadicActivation createSporadicActivation() {
		SporadicActivationImpl sporadicActivation = new SporadicActivationImpl();
		return sporadicActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleActivation createSingleActivation() {
		SingleActivationImpl singleActivation = new SingleActivationImpl();
		return singleActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventActivation createEventActivation() {
		EventActivationImpl eventActivation = new EventActivationImpl();
		return eventActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomActivation createCustomActivation() {
		CustomActivationImpl customActivation = new CustomActivationImpl();
		return customActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelAccessStatistic createLabelAccessStatistic() {
		LabelAccessStatisticImpl labelAccessStatistic = new LabelAccessStatisticImpl();
		return labelAccessStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunEntityCallStatistic createRunEntityCallStatistic() {
		RunEntityCallStatisticImpl runEntityCallStatistic = new RunEntityCallStatisticImpl();
		return runEntityCallStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementModel createMeasurementModel() {
		MeasurementModelImpl measurementModel = new MeasurementModelImpl();
		return measurementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventChainMeasurement createEventChainMeasurement() {
		EventChainMeasurementImpl eventChainMeasurement = new EventChainMeasurementImpl();
		return eventChainMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskMeasurement createTaskMeasurement() {
		TaskMeasurementImpl taskMeasurement = new TaskMeasurementImpl();
		return taskMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableMeasurement createRunnableMeasurement() {
		RunnableMeasurementImpl runnableMeasurement = new RunnableMeasurementImpl();
		return runnableMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyUnit createFrequencyUnitFromString(EDataType eDataType, String initialValue) {
		FrequencyUnit result = FrequencyUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageUnit createVoltageUnitFromString(EDataType eDataType, String initialValue) {
		VoltageUnit result = VoltageUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoltageUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeUnit createDataSizeUnitFromString(EDataType eDataType, String initialValue) {
		DataSizeUnit result = DataSizeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSizeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRateUnit createDataRateUnitFromString(EDataType eDataType, String initialValue) {
		DataRateUnit result = DataRateUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataRateUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingType createSamplingTypeFromString(EDataType eDataType, String initialValue) {
		SamplingType result = SamplingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSamplingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceKind createInterfaceKindFromString(EDataType eDataType, String initialValue) {
		InterfaceKind result = InterfaceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableOrderType createRunnableOrderTypeFromString(EDataType eDataType, String initialValue) {
		RunnableOrderType result = RunnableOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRunnableOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationType createSynchronizationTypeFromString(EDataType eDataType, String initialValue) {
		SynchronizationType result = SynchronizationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronizationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType createMappingTypeFromString(EDataType eDataType, String initialValue) {
		MappingType result = MappingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyType createLatencyTypeFromString(EDataType eDataType, String initialValue) {
		LatencyType result = LatencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverityFromString(EDataType eDataType, String initialValue) {
		Severity result = Severity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitType createLimitTypeFromString(EDataType eDataType, String initialValue) {
		LimitType result = LimitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLimitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeMetric createTimeMetricFromString(EDataType eDataType, String initialValue) {
		TimeMetric result = TimeMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountMetric createCountMetricFromString(EDataType eDataType, String initialValue) {
		CountMetric result = CountMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageMetric createPercentageMetricFromString(EDataType eDataType, String initialValue) {
		PercentageMetric result = PercentageMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUPercentageMetric createCPUPercentageMetricFromString(EDataType eDataType, String initialValue) {
		CPUPercentageMetric result = CPUPercentageMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPUPercentageMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyMetric createFrequencyMetricFromString(EDataType eDataType, String initialValue) {
		FrequencyMetric result = FrequencyMetric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoherencyDirection createCoherencyDirectionFromString(EDataType eDataType, String initialValue) {
		CoherencyDirection result = CoherencyDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoherencyDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessEventType createProcessEventTypeFromString(EDataType eDataType, String initialValue) {
		ProcessEventType result = ProcessEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEventType createRunnableEventTypeFromString(EDataType eDataType, String initialValue) {
		RunnableEventType result = RunnableEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRunnableEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelEventType createLabelEventTypeFromString(EDataType eDataType, String initialValue) {
		LabelEventType result = LabelEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelEventType createChannelEventTypeFromString(EDataType eDataType, String initialValue) {
		ChannelEventType result = ChannelEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreEventType createSemaphoreEventTypeFromString(EDataType eDataType, String initialValue) {
		SemaphoreEventType result = SemaphoreEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemaphoreEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentEventType createComponentEventTypeFromString(EDataType eDataType, String initialValue) {
		ComponentEventType result = ComponentEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryType createMemoryTypeFromString(EDataType eDataType, String initialValue) {
		MemoryType result = MemoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType createStructureTypeFromString(EDataType eDataType, String initialValue) {
		StructureType result = StructureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType createCacheTypeFromString(EDataType eDataType, String initialValue) {
		CacheType result = CacheType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedPolicy createSchedPolicyFromString(EDataType eDataType, String initialValue) {
		SchedPolicy result = SchedPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteStrategy createWriteStrategyFromString(EDataType eDataType, String initialValue) {
		WriteStrategy result = WriteStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWriteStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuType createPuTypeFromString(EDataType eDataType, String initialValue) {
		PuType result = PuType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPuTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInterface createPortInterfaceFromString(EDataType eDataType, String initialValue) {
		PortInterface result = PortInterface.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortInterfaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwFeatureType createHwFeatureTypeFromString(EDataType eDataType, String initialValue) {
		HwFeatureType result = HwFeatureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHwFeatureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAddressMappingType createMemoryAddressMappingTypeFromString(EDataType eDataType, String initialValue) {
		MemoryAddressMappingType result = MemoryAddressMappingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryAddressMappingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsDataConsistencyMode createOsDataConsistencyModeFromString(EDataType eDataType, String initialValue) {
		OsDataConsistencyMode result = OsDataConsistencyMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOsDataConsistencyModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMultiplicity createAccessMultiplicityFromString(EDataType eDataType, String initialValue) {
		AccessMultiplicity result = AccessMultiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStabilityLevel createDataStabilityLevelFromString(EDataType eDataType, String initialValue) {
		DataStabilityLevel result = DataStabilityLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataStabilityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreType createSemaphoreTypeFromString(EDataType eDataType, String initialValue) {
		SemaphoreType result = SemaphoreType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemaphoreTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createConditionFromString(EDataType eDataType, String initialValue) {
		Condition result = Condition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingType createGroupingTypeFromString(EDataType eDataType, String initialValue) {
		GroupingType result = GroupingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitEventType createWaitEventTypeFromString(EDataType eDataType, String initialValue) {
		WaitEventType result = WaitEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaitEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitingBehaviour createWaitingBehaviourFromString(EDataType eDataType, String initialValue) {
		WaitingBehaviour result = WaitingBehaviour.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaitingBehaviourToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISRCategory createISRCategoryFromString(EDataType eDataType, String initialValue) {
		ISRCategory result = ISRCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISRCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPrecedenceType createAccessPrecedenceTypeFromString(EDataType eDataType, String initialValue) {
		AccessPrecedenceType result = AccessPrecedenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessPrecedenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDataStability createLabelDataStabilityFromString(EDataType eDataType, String initialValue) {
		LabelDataStability result = LabelDataStability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelDataStabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLabelAccessEnum createModeLabelAccessEnumFromString(EDataType eDataType, String initialValue) {
		ModeLabelAccessEnum result = ModeLabelAccessEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeLabelAccessEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveOperation createReceiveOperationFromString(EDataType eDataType, String initialValue) {
		ReceiveOperation result = ReceiveOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReceiveOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessDataStability createLabelAccessDataStabilityFromString(EDataType eDataType, String initialValue) {
		LabelAccessDataStability result = LabelAccessDataStability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelAccessDataStabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessEnum createLabelAccessEnumFromString(EDataType eDataType, String initialValue) {
		LabelAccessEnum result = LabelAccessEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelAccessEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessImplementation createLabelAccessImplementationFromString(EDataType eDataType, String initialValue) {
		LabelAccessImplementation result = LabelAccessImplementation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelAccessImplementationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreAccessEnum createSemaphoreAccessEnumFromString(EDataType eDataType, String initialValue) {
		SemaphoreAccessEnum result = SemaphoreAccessEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemaphoreAccessEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockingType createBlockingTypeFromString(EDataType eDataType, String initialValue) {
		BlockingType result = BlockingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlockingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preemption createPreemptionFromString(EDataType eDataType, String initialValue) {
		Preemption result = Preemption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreemptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyType createConcurrencyTypeFromString(EDataType eDataType, String initialValue) {
		ConcurrencyType result = ConcurrencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcurrencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILType createASILTypeFromString(EDataType eDataType, String initialValue) {
		ASILType result = ASILType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertASILTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long createAddress(final String it) {
		Long _xifexpression = null;
		if ((it != null)) {
			Long _xifexpression_1 = null;
			if ((it.startsWith("-") || it.startsWith("+"))) {
				throw new NumberFormatException("Sign character");
			}
			else {
				_xifexpression_1 = Long.decode(it);
			}
			_xifexpression = _xifexpression_1;
		}
		return (_xifexpression).longValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createAddressFromString(EDataType eDataType, String initialValue) {
		return createAddress(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddress(final long it) {
		String _hexString = Long.toHexString(it);
		return ("0x" + _hexString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : convertAddress((Long)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createPositiveLongFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveLongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPositiveDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createNonNegativeDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmaltheaPackage getAmaltheaPackage() {
		return (AmaltheaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AmaltheaPackage getPackage() {
		return AmaltheaPackage.eINSTANCE;
	}

} //AmaltheaFactoryImpl
