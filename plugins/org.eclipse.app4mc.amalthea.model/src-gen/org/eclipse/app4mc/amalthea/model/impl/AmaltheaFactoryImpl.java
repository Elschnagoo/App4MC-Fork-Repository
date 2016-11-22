/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.AbstractElementMapping;
import org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint;
import org.eclipse.app4mc.amalthea.model.AccessPathRef;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceType;
import org.eclipse.app4mc.amalthea.model.AlgorithmParameter;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ArchitectureRequirement;
import org.eclipse.app4mc.amalthea.model.Array;
import org.eclipse.app4mc.amalthea.model.ArrivalCurve;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition;
import org.eclipse.app4mc.amalthea.model.BetaDistribution;
import org.eclipse.app4mc.amalthea.model.BigIntegerObject;
import org.eclipse.app4mc.amalthea.model.BooleanObject;
import org.eclipse.app4mc.amalthea.model.Boundaries;
import org.eclipse.app4mc.amalthea.model.Bridge;
import org.eclipse.app4mc.amalthea.model.Bus;
import org.eclipse.app4mc.amalthea.model.BusType;
import org.eclipse.app4mc.amalthea.model.CPUPercentageMetric;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierList;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry;
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.model.CoherencyDirection;
import org.eclipse.app4mc.amalthea.model.ComparatorType;
import org.eclipse.app4mc.amalthea.model.ComplexPin;
import org.eclipse.app4mc.amalthea.model.ComplexPort;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.ComponentScope;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.Composite;
import org.eclipse.app4mc.amalthea.model.ConcurrencyType;
import org.eclipse.app4mc.amalthea.model.ConfigModel;
import org.eclipse.app4mc.amalthea.model.ConjunctionType;
import org.eclipse.app4mc.amalthea.model.Connector;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.CountMetric;
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.CrossbarSwitch;
import org.eclipse.app4mc.amalthea.model.CustomActivation;
import org.eclipse.app4mc.amalthea.model.CustomEntity;
import org.eclipse.app4mc.amalthea.model.CustomEvent;
import org.eclipse.app4mc.amalthea.model.CustomStimulus;
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint;
import org.eclipse.app4mc.amalthea.model.DataAgeCycle;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.DataCoherencyGroup;
import org.eclipse.app4mc.amalthea.model.DataPairingConstraint;
import org.eclipse.app4mc.amalthea.model.DataPlatformMapping;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataRateUnit;
import org.eclipse.app4mc.amalthea.model.DataSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.DataStabilityGroup;
import org.eclipse.app4mc.amalthea.model.DataTypeDefinition;
import org.eclipse.app4mc.amalthea.model.DeadlineMonotonic;
import org.eclipse.app4mc.amalthea.model.DelayConstraint;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.DoubleObject;
import org.eclipse.app4mc.amalthea.model.ECU;
import org.eclipse.app4mc.amalthea.model.ECUType;
import org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst;
import org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint;
import org.eclipse.app4mc.amalthea.model.EventChainReference;
import org.eclipse.app4mc.amalthea.model.EventChainSynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.EventConfigElement;
import org.eclipse.app4mc.amalthea.model.EventConfigLink;
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.EventSet;
import org.eclipse.app4mc.amalthea.model.EventSynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.FInterfacePort;
import org.eclipse.app4mc.amalthea.model.FloatObject;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyMetric;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwAccessPathRef;
import org.eclipse.app4mc.amalthea.model.HwComponent;
import org.eclipse.app4mc.amalthea.model.HwCoreConjunction;
import org.eclipse.app4mc.amalthea.model.HwCoreProperty;
import org.eclipse.app4mc.amalthea.model.HwElementRef;
import org.eclipse.app4mc.amalthea.model.HwMemoryConjunction;
import org.eclipse.app4mc.amalthea.model.HwMemoryProperty;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwSystem;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.InstructionFetch;
import org.eclipse.app4mc.amalthea.model.InstructionsConstant;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.IntegerObject;
import org.eclipse.app4mc.amalthea.model.InterProcess;
import org.eclipse.app4mc.amalthea.model.InterProcessActivation;
import org.eclipse.app4mc.amalthea.model.InterfaceKind;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessBuffering;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.LabelBuffering;
import org.eclipse.app4mc.amalthea.model.LabelEntityGroup;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.LabelEventType;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPath;
import org.eclipse.app4mc.amalthea.model.LatencyConstant;
import org.eclipse.app4mc.amalthea.model.LatencyDeviation;
import org.eclipse.app4mc.amalthea.model.LatencyType;
import org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.ListObject;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MappingType;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType;
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
import org.eclipse.app4mc.amalthea.model.ModeValueList;
import org.eclipse.app4mc.amalthea.model.ModeValueListEntry;
import org.eclipse.app4mc.amalthea.model.Network;
import org.eclipse.app4mc.amalthea.model.NetworkType;
import org.eclipse.app4mc.amalthea.model.OSEK;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.OrderType;
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions;
import org.eclipse.app4mc.amalthea.model.OsBuffering;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.OsISRInstructions;
import org.eclipse.app4mc.amalthea.model.OsInstructions;
import org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2;
import org.eclipse.app4mc.amalthea.model.PartlyPFairPD2;
import org.eclipse.app4mc.amalthea.model.PercentageMetric;
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.Periodic;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.PeriodicEvent;
import org.eclipse.app4mc.amalthea.model.PfairPD2;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.Pin;
import org.eclipse.app4mc.amalthea.model.PinType;
import org.eclipse.app4mc.amalthea.model.Pointer;
import org.eclipse.app4mc.amalthea.model.Preemptability;
import org.eclipse.app4mc.amalthea.model.Prescaler;
import org.eclipse.app4mc.amalthea.model.PriorityBased;
import org.eclipse.app4mc.amalthea.model.PriorityBasedRoundRobin;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.ProbabiltitySwitch;
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
import org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup;
import org.eclipse.app4mc.amalthea.model.ProcessScope;
import org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.QType;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.app4mc.amalthea.model.Quartz;
import org.eclipse.app4mc.amalthea.model.RWType;
import org.eclipse.app4mc.amalthea.model.RateMonotonic;
import org.eclipse.app4mc.amalthea.model.ReferenceObject;
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableEvent;
import org.eclipse.app4mc.amalthea.model.RunnableEventType;
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
import org.eclipse.app4mc.amalthea.model.SchedulingHWUnit;
import org.eclipse.app4mc.amalthea.model.SchedulingSWUnit;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum;
import org.eclipse.app4mc.amalthea.model.SemaphoreEvent;
import org.eclipse.app4mc.amalthea.model.SemaphoreEventType;
import org.eclipse.app4mc.amalthea.model.SenderReceiverRead;
import org.eclipse.app4mc.amalthea.model.SenderReceiverWrite;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.Severity;
import org.eclipse.app4mc.amalthea.model.SignedTime;
import org.eclipse.app4mc.amalthea.model.SignedTimeObject;
import org.eclipse.app4mc.amalthea.model.Single;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic;
import org.eclipse.app4mc.amalthea.model.Sporadic;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.StimulusEvent;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.model.Struct;
import org.eclipse.app4mc.amalthea.model.StructEntry;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.model.SynchronizationType;
import org.eclipse.app4mc.amalthea.model.SynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.Synthetic;
import org.eclipse.app4mc.amalthea.model.SystemType;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.TagGroup;
import org.eclipse.app4mc.amalthea.model.TargetCallSequence;
import org.eclipse.app4mc.amalthea.model.TargetCore;
import org.eclipse.app4mc.amalthea.model.TargetMemory;
import org.eclipse.app4mc.amalthea.model.TargetProcess;
import org.eclipse.app4mc.amalthea.model.TargetScheduler;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.TerminateProcess;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeObject;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TimestampList;
import org.eclipse.app4mc.amalthea.model.TypeRef;
import org.eclipse.app4mc.amalthea.model.UniformDistribution;
import org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.amalthea.model.VendorOperatingSystem;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.WaitEventType;
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;

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
			case AmaltheaPackage.TAG: return createTag();
			case AmaltheaPackage.TIME: return createTime();
			case AmaltheaPackage.SIGNED_TIME: return createSignedTime();
			case AmaltheaPackage.FREQUENCY: return createFrequency();
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
			case AmaltheaPackage.TIME_OBJECT: return createTimeObject();
			case AmaltheaPackage.SIGNED_TIME_OBJECT: return createSignedTimeObject();
			case AmaltheaPackage.DEVIATION: return createDeviation();
			case AmaltheaPackage.WEIBULL_PARAMETERS: return createWeibullParameters();
			case AmaltheaPackage.WEIBULL_ESTIMATORS: return createWeibullEstimators();
			case AmaltheaPackage.UNIFORM_DISTRIBUTION: return createUniformDistribution();
			case AmaltheaPackage.BOUNDARIES: return createBoundaries();
			case AmaltheaPackage.GAUSS_DISTRIBUTION: return createGaussDistribution();
			case AmaltheaPackage.BETA_DISTRIBUTION: return createBetaDistribution();
			case AmaltheaPackage.MIN_AVG_MAX_STATISTIC: return createMinAvgMaxStatistic();
			case AmaltheaPackage.SINGLE_VALUE_STATISTIC: return createSingleValueStatistic();
			case AmaltheaPackage.MODE: return createMode();
			case AmaltheaPackage.MODE_LITERAL: return createModeLiteral();
			case AmaltheaPackage.COMPONENTS_MODEL: return createComponentsModel();
			case AmaltheaPackage.COMPONENT: return createComponent();
			case AmaltheaPackage.COMPOSITE: return createComposite();
			case AmaltheaPackage.SYSTEM: return createSystem();
			case AmaltheaPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case AmaltheaPackage.CONNECTOR: return createConnector();
			case AmaltheaPackage.QUALIFIED_PORT: return createQualifiedPort();
			case AmaltheaPackage.FINTERFACE_PORT: return createFInterfacePort();
			case AmaltheaPackage.CONFIG_MODEL: return createConfigModel();
			case AmaltheaPackage.EVENT_CONFIG_LINK: return createEventConfigLink();
			case AmaltheaPackage.EVENT_CONFIG_ELEMENT: return createEventConfigElement();
			case AmaltheaPackage.CONSTRAINTS_MODEL: return createConstraintsModel();
			case AmaltheaPackage.RUNNABLE_SEQUENCING_CONSTRAINT: return createRunnableSequencingConstraint();
			case AmaltheaPackage.PROCESS_RUNNABLE_GROUP: return createProcessRunnableGroup();
			case AmaltheaPackage.RUNNABLE_SEPARATION_CONSTRAINT: return createRunnableSeparationConstraint();
			case AmaltheaPackage.PROCESS_SEPARATION_CONSTRAINT: return createProcessSeparationConstraint();
			case AmaltheaPackage.DATA_SEPARATION_CONSTRAINT: return createDataSeparationConstraint();
			case AmaltheaPackage.RUNNABLE_PAIRING_CONSTRAINT: return createRunnablePairingConstraint();
			case AmaltheaPackage.PROCESS_PAIRING_CONSTRAINT: return createProcessPairingConstraint();
			case AmaltheaPackage.DATA_PAIRING_CONSTRAINT: return createDataPairingConstraint();
			case AmaltheaPackage.TARGET_MEMORY: return createTargetMemory();
			case AmaltheaPackage.TARGET_CORE: return createTargetCore();
			case AmaltheaPackage.TARGET_SCHEDULER: return createTargetScheduler();
			case AmaltheaPackage.TARGET_PROCESS: return createTargetProcess();
			case AmaltheaPackage.TARGET_CALL_SEQUENCE: return createTargetCallSequence();
			case AmaltheaPackage.LABEL_ENTITY_GROUP: return createLabelEntityGroup();
			case AmaltheaPackage.RUNNABLE_ENTITY_GROUP: return createRunnableEntityGroup();
			case AmaltheaPackage.PROCESS_ENTITY_GROUP: return createProcessEntityGroup();
			case AmaltheaPackage.TAG_GROUP: return createTagGroup();
			case AmaltheaPackage.EVENT_CHAIN: return createEventChain();
			case AmaltheaPackage.EVENT_CHAIN_REFERENCE: return createEventChainReference();
			case AmaltheaPackage.SUB_EVENT_CHAIN: return createSubEventChain();
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
			case AmaltheaPackage.SEMAPHORE_EVENT: return createSemaphoreEvent();
			case AmaltheaPackage.HW_MODEL: return createHWModel();
			case AmaltheaPackage.HW_SYSTEM: return createHwSystem();
			case AmaltheaPackage.ECU: return createECU();
			case AmaltheaPackage.MICROCONTROLLER: return createMicrocontroller();
			case AmaltheaPackage.CORE: return createCore();
			case AmaltheaPackage.MEMORY: return createMemory();
			case AmaltheaPackage.NETWORK: return createNetwork();
			case AmaltheaPackage.QUARTZ: return createQuartz();
			case AmaltheaPackage.HW_COMPONENT: return createHwComponent();
			case AmaltheaPackage.SYSTEM_TYPE: return createSystemType();
			case AmaltheaPackage.ECU_TYPE: return createECUType();
			case AmaltheaPackage.MICROCONTROLLER_TYPE: return createMicrocontrollerType();
			case AmaltheaPackage.CORE_TYPE: return createCoreType();
			case AmaltheaPackage.MEMORY_TYPE: return createMemoryType();
			case AmaltheaPackage.NETWORK_TYPE: return createNetworkType();
			case AmaltheaPackage.HW_PORT: return createHwPort();
			case AmaltheaPackage.PIN: return createPin();
			case AmaltheaPackage.COMPLEX_PORT: return createComplexPort();
			case AmaltheaPackage.COMPLEX_PIN: return createComplexPin();
			case AmaltheaPackage.PRESCALER: return createPrescaler();
			case AmaltheaPackage.CROSSBAR_SWITCH: return createCrossbarSwitch();
			case AmaltheaPackage.BUS: return createBus();
			case AmaltheaPackage.BRIDGE: return createBridge();
			case AmaltheaPackage.LATENCY_ACCESS_PATH: return createLatencyAccessPath();
			case AmaltheaPackage.HW_ACCESS_PATH: return createHwAccessPath();
			case AmaltheaPackage.ACCESS_PATH_REF: return createAccessPathRef();
			case AmaltheaPackage.LATENCY_CONSTANT: return createLatencyConstant();
			case AmaltheaPackage.LATENCY_DEVIATION: return createLatencyDeviation();
			case AmaltheaPackage.HW_ACCESS_PATH_REF: return createHwAccessPathRef();
			case AmaltheaPackage.HW_ELEMENT_REF: return createHwElementRef();
			case AmaltheaPackage.MAPPING_MODEL: return createMappingModel();
			case AmaltheaPackage.CORE_ALLOCATION: return createCoreAllocation();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING: return createPhysicalSectionMapping();
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING: return createAbstractElementMapping();
			case AmaltheaPackage.TASK_ALLOCATION: return createTaskAllocation();
			case AmaltheaPackage.ISR_ALLOCATION: return createISRAllocation();
			case AmaltheaPackage.RUNNABLE_ALLOCATION: return createRunnableAllocation();
			case AmaltheaPackage.OS_MODEL: return createOSModel();
			case AmaltheaPackage.OS_BUFFERING: return createOsBuffering();
			case AmaltheaPackage.SEMAPHORE: return createSemaphore();
			case AmaltheaPackage.OSEK: return createOSEK();
			case AmaltheaPackage.PARTLY_PFAIR_PD2: return createPartlyPFairPD2();
			case AmaltheaPackage.PFAIR_PD2: return createPfairPD2();
			case AmaltheaPackage.PARTLY_EARLY_RELEASE_FAIR_PD2: return createPartlyEarlyReleaseFairPD2();
			case AmaltheaPackage.EARLY_RELEASE_FAIR_PD2: return createEarlyReleaseFairPD2();
			case AmaltheaPackage.LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST: return createLeastLocalRemainingExecutionTimeFirst();
			case AmaltheaPackage.EARLIEST_DEADLINE_FIRST: return createEarliestDeadlineFirst();
			case AmaltheaPackage.DEADLINE_MONOTONIC: return createDeadlineMonotonic();
			case AmaltheaPackage.RATE_MONOTONIC: return createRateMonotonic();
			case AmaltheaPackage.PRIORITY_BASED_ROUND_ROBIN: return createPriorityBasedRoundRobin();
			case AmaltheaPackage.USER_SPECIFIC_SCHEDULING_ALGORITHM: return createUserSpecificSchedulingAlgorithm();
			case AmaltheaPackage.PRIORITY_BASED: return createPriorityBased();
			case AmaltheaPackage.ALGORITHM_PARAMETER: return createAlgorithmParameter();
			case AmaltheaPackage.SCHEDULING_HW_UNIT: return createSchedulingHWUnit();
			case AmaltheaPackage.SCHEDULING_SW_UNIT: return createSchedulingSWUnit();
			case AmaltheaPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case AmaltheaPackage.VENDOR_OPERATING_SYSTEM: return createVendorOperatingSystem();
			case AmaltheaPackage.TASK_SCHEDULER: return createTaskScheduler();
			case AmaltheaPackage.INTERRUPT_CONTROLLER: return createInterruptController();
			case AmaltheaPackage.OS_INSTRUCTIONS: return createOsInstructions();
			case AmaltheaPackage.OS_API_INSTRUCTIONS: return createOsAPIInstructions();
			case AmaltheaPackage.OS_ISR_INSTRUCTIONS: return createOsISRInstructions();
			case AmaltheaPackage.PROPERTY_CONSTRAINTS_MODEL: return createPropertyConstraintsModel();
			case AmaltheaPackage.PROCESS_ALLOCATION_CONSTRAINT: return createProcessAllocationConstraint();
			case AmaltheaPackage.PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT: return createProcessPrototypeAllocationConstraint();
			case AmaltheaPackage.RUNNABLE_ALLOCATION_CONSTRAINT: return createRunnableAllocationConstraint();
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT: return createAbstractElementMappingConstraint();
			case AmaltheaPackage.HW_CORE_PROPERTY: return createHwCoreProperty();
			case AmaltheaPackage.HW_CORE_CONJUNCTION: return createHwCoreConjunction();
			case AmaltheaPackage.HW_MEMORY_PROPERTY: return createHwMemoryProperty();
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION: return createHwMemoryConjunction();
			case AmaltheaPackage.STIMULI_MODEL: return createStimuliModel();
			case AmaltheaPackage.MODE_VALUE_LIST: return createModeValueList();
			case AmaltheaPackage.MODE_VALUE_LIST_ENTRY: return createModeValueListEntry();
			case AmaltheaPackage.PERIODIC: return createPeriodic();
			case AmaltheaPackage.PERIODIC_EVENT: return createPeriodicEvent();
			case AmaltheaPackage.SYNTHETIC: return createSynthetic();
			case AmaltheaPackage.TIMESTAMP_LIST: return createTimestampList();
			case AmaltheaPackage.CUSTOM_STIMULUS: return createCustomStimulus();
			case AmaltheaPackage.SINGLE: return createSingle();
			case AmaltheaPackage.INTER_PROCESS: return createInterProcess();
			case AmaltheaPackage.SPORADIC: return createSporadic();
			case AmaltheaPackage.ARRIVAL_CURVE: return createArrivalCurve();
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY: return createArrivalCurveEntry();
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION: return createClockTriangleFunction();
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION: return createClockSinusFunction();
			case AmaltheaPackage.CLOCK_MULTIPLIER_LIST: return createClockMultiplierList();
			case AmaltheaPackage.CLOCK_MULTIPLIER_LIST_ENTRY: return createClockMultiplierListEntry();
			case AmaltheaPackage.SW_MODEL: return createSWModel();
			case AmaltheaPackage.CUSTOM_ENTITY: return createCustomEntity();
			case AmaltheaPackage.PROCESS_CHAIN: return createProcessChain();
			case AmaltheaPackage.CALL_GRAPH: return createCallGraph();
			case AmaltheaPackage.CALL_SEQUENCE: return createCallSequence();
			case AmaltheaPackage.MODE_SWITCH: return createModeSwitch();
			case AmaltheaPackage.MODE_SWITCH_ENTRY: return createModeSwitchEntry();
			case AmaltheaPackage.MODE_SWITCH_DEFAULT: return createModeSwitchDefault();
			case AmaltheaPackage.PROBABILTITY_SWITCH: return createProbabiltitySwitch();
			case AmaltheaPackage.PROBABILITY_SWITCH_ENTRY: return createProbabilitySwitchEntry();
			case AmaltheaPackage.COUNTER: return createCounter();
			case AmaltheaPackage.WAIT_EVENT: return createWaitEvent();
			case AmaltheaPackage.SET_EVENT: return createSetEvent();
			case AmaltheaPackage.CLEAR_EVENT: return createClearEvent();
			case AmaltheaPackage.EVENT_MASK: return createEventMask();
			case AmaltheaPackage.OS_EVENT: return createOsEvent();
			case AmaltheaPackage.INTER_PROCESS_ACTIVATION: return createInterProcessActivation();
			case AmaltheaPackage.ENFORCED_MIGRATION: return createEnforcedMigration();
			case AmaltheaPackage.TASK_RUNNABLE_CALL: return createTaskRunnableCall();
			case AmaltheaPackage.SCHEDULE_POINT: return createSchedulePoint();
			case AmaltheaPackage.TERMINATE_PROCESS: return createTerminateProcess();
			case AmaltheaPackage.TASK: return createTask();
			case AmaltheaPackage.ISR: return createISR();
			case AmaltheaPackage.PROCESS_PROTOTYPE: return createProcessPrototype();
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE: return createChainedProcessPrototype();
			case AmaltheaPackage.ACCESS_PRECEDENCE_SPEC: return createAccessPrecedenceSpec();
			case AmaltheaPackage.ORDER_PRECEDENCE_SPEC: return createOrderPrecedenceSpec();
			case AmaltheaPackage.RUNNABLE: return createRunnable();
			case AmaltheaPackage.LABEL: return createLabel();
			case AmaltheaPackage.MODE_LABEL: return createModeLabel();
			case AmaltheaPackage.SECTION: return createSection();
			case AmaltheaPackage.MODE_LABEL_ACCESS: return createModeLabelAccess();
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH: return createRunnableModeSwitch();
			case AmaltheaPackage.LABEL_ACCESS: return createLabelAccess();
			case AmaltheaPackage.SEMAPHORE_ACCESS: return createSemaphoreAccess();
			case AmaltheaPackage.SENDER_RECEIVER_READ: return createSenderReceiverRead();
			case AmaltheaPackage.SENDER_RECEIVER_WRITE: return createSenderReceiverWrite();
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL: return createSynchronousServerCall();
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL: return createAsynchronousServerCall();
			case AmaltheaPackage.RUNNABLE_PROBABILITY_SWITCH: return createRunnableProbabilitySwitch();
			case AmaltheaPackage.GROUP: return createGroup();
			case AmaltheaPackage.RUNNABLE_CALL: return createRunnableCall();
			case AmaltheaPackage.INSTRUCTIONS_DEVIATION: return createInstructionsDeviation();
			case AmaltheaPackage.INSTRUCTIONS_CONSTANT: return createInstructionsConstant();
			case AmaltheaPackage.STRUCT: return createStruct();
			case AmaltheaPackage.STRUCT_ENTRY: return createStructEntry();
			case AmaltheaPackage.ARRAY: return createArray();
			case AmaltheaPackage.POINTER: return createPointer();
			case AmaltheaPackage.TYPE_REF: return createTypeRef();
			case AmaltheaPackage.DATA_PLATFORM_MAPPING: return createDataPlatformMapping();
			case AmaltheaPackage.DATA_TYPE_DEFINITION: return createDataTypeDefinition();
			case AmaltheaPackage.BASE_TYPE_DEFINITION: return createBaseTypeDefinition();
			case AmaltheaPackage.PERIODIC_ACTIVATION: return createPeriodicActivation();
			case AmaltheaPackage.SPORADIC_ACTIVATION: return createSporadicActivation();
			case AmaltheaPackage.SINGLE_ACTIVATION: return createSingleActivation();
			case AmaltheaPackage.CUSTOM_ACTIVATION: return createCustomActivation();
			case AmaltheaPackage.LABEL_ACCESS_STATISTIC: return createLabelAccessStatistic();
			case AmaltheaPackage.INSTRUCTION_FETCH: return createInstructionFetch();
			case AmaltheaPackage.RUN_ENTITY_CALL_STATISTIC: return createRunEntityCallStatistic();
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
			case AmaltheaPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case AmaltheaPackage.FREQUENCY_UNIT:
				return createFrequencyUnitFromString(eDataType, initialValue);
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
			case AmaltheaPackage.SEMAPHORE_EVENT_TYPE:
				return createSemaphoreEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.QTYPE:
				return createQTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.MEMORY_TYPE_ENUM:
				return createMemoryTypeEnumFromString(eDataType, initialValue);
			case AmaltheaPackage.BUS_TYPE:
				return createBusTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.RW_TYPE:
				return createRWTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.SCHED_TYPE:
				return createSchedTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.PIN_TYPE:
				return createPinTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.MEMORY_ADDRESS_MAPPING_TYPE:
				return createMemoryAddressMappingTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.COMPARATOR_TYPE:
				return createComparatorTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.CONJUNCTION_TYPE:
				return createConjunctionTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.WAIT_EVENT_TYPE:
				return createWaitEventTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.WAITING_BEHAVIOUR:
				return createWaitingBehaviourFromString(eDataType, initialValue);
			case AmaltheaPackage.ACCESS_PRECEDENCE_TYPE:
				return createAccessPrecedenceTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.LABEL_BUFFERING:
				return createLabelBufferingFromString(eDataType, initialValue);
			case AmaltheaPackage.LABEL_ACCESS_BUFFERING:
				return createLabelAccessBufferingFromString(eDataType, initialValue);
			case AmaltheaPackage.LABEL_ACCESS_ENUM:
				return createLabelAccessEnumFromString(eDataType, initialValue);
			case AmaltheaPackage.SEMAPHORE_ACCESS_ENUM:
				return createSemaphoreAccessEnumFromString(eDataType, initialValue);
			case AmaltheaPackage.PREEMPTABILITY:
				return createPreemptabilityFromString(eDataType, initialValue);
			case AmaltheaPackage.CONCURRENCY_TYPE:
				return createConcurrencyTypeFromString(eDataType, initialValue);
			case AmaltheaPackage.ASIL_TYPE:
				return createASILTypeFromString(eDataType, initialValue);
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
			case AmaltheaPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case AmaltheaPackage.FREQUENCY_UNIT:
				return convertFrequencyUnitToString(eDataType, instanceValue);
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
			case AmaltheaPackage.SEMAPHORE_EVENT_TYPE:
				return convertSemaphoreEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.QTYPE:
				return convertQTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.MEMORY_TYPE_ENUM:
				return convertMemoryTypeEnumToString(eDataType, instanceValue);
			case AmaltheaPackage.BUS_TYPE:
				return convertBusTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.RW_TYPE:
				return convertRWTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.SCHED_TYPE:
				return convertSchedTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.PIN_TYPE:
				return convertPinTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.MEMORY_ADDRESS_MAPPING_TYPE:
				return convertMemoryAddressMappingTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.COMPARATOR_TYPE:
				return convertComparatorTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.CONJUNCTION_TYPE:
				return convertConjunctionTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.WAIT_EVENT_TYPE:
				return convertWaitEventTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.WAITING_BEHAVIOUR:
				return convertWaitingBehaviourToString(eDataType, instanceValue);
			case AmaltheaPackage.ACCESS_PRECEDENCE_TYPE:
				return convertAccessPrecedenceTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.LABEL_BUFFERING:
				return convertLabelBufferingToString(eDataType, instanceValue);
			case AmaltheaPackage.LABEL_ACCESS_BUFFERING:
				return convertLabelAccessBufferingToString(eDataType, instanceValue);
			case AmaltheaPackage.LABEL_ACCESS_ENUM:
				return convertLabelAccessEnumToString(eDataType, instanceValue);
			case AmaltheaPackage.SEMAPHORE_ACCESS_ENUM:
				return convertSemaphoreAccessEnumToString(eDataType, instanceValue);
			case AmaltheaPackage.PREEMPTABILITY:
				return convertPreemptabilityToString(eDataType, instanceValue);
			case AmaltheaPackage.CONCURRENCY_TYPE:
				return convertConcurrencyTypeToString(eDataType, instanceValue);
			case AmaltheaPackage.ASIL_TYPE:
				return convertASILTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amalthea createAmalthea() {
		AmaltheaImpl amalthea = new AmaltheaImpl();
		return amalthea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedTime createSignedTime() {
		SignedTimeImpl signedTime = new SignedTimeImpl();
		return signedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frequency createFrequency() {
		FrequencyImpl frequency = new FrequencyImpl();
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize createDataSize() {
		DataSizeImpl dataSize = new DataSizeImpl();
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public ListObject createListObject() {
		ListObjectImpl listObject = new ListObjectImpl();
		return listObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringObject createStringObject() {
		StringObjectImpl stringObject = new StringObjectImpl();
		return stringObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigIntegerObject createBigIntegerObject() {
		BigIntegerObjectImpl bigIntegerObject = new BigIntegerObjectImpl();
		return bigIntegerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceObject createReferenceObject() {
		ReferenceObjectImpl referenceObject = new ReferenceObjectImpl();
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerObject createIntegerObject() {
		IntegerObjectImpl integerObject = new IntegerObjectImpl();
		return integerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongObject createLongObject() {
		LongObjectImpl longObject = new LongObjectImpl();
		return longObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatObject createFloatObject() {
		FloatObjectImpl floatObject = new FloatObjectImpl();
		return floatObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleObject createDoubleObject() {
		DoubleObjectImpl doubleObject = new DoubleObjectImpl();
		return doubleObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanObject createBooleanObject() {
		BooleanObjectImpl booleanObject = new BooleanObjectImpl();
		return booleanObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObject createTimeObject() {
		TimeObjectImpl timeObject = new TimeObjectImpl();
		return timeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedTimeObject createSignedTimeObject() {
		SignedTimeObjectImpl signedTimeObject = new SignedTimeObjectImpl();
		return signedTimeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> Deviation<T> createDeviation() {
		DeviationImpl<T> deviation = new DeviationImpl<T>();
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> WeibullParameters<T> createWeibullParameters() {
		WeibullParametersImpl<T> weibullParameters = new WeibullParametersImpl<T>();
		return weibullParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> WeibullEstimators<T> createWeibullEstimators() {
		WeibullEstimatorsImpl<T> weibullEstimators = new WeibullEstimatorsImpl<T>();
		return weibullEstimators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> UniformDistribution<T> createUniformDistribution() {
		UniformDistributionImpl<T> uniformDistribution = new UniformDistributionImpl<T>();
		return uniformDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> Boundaries<T> createBoundaries() {
		BoundariesImpl<T> boundaries = new BoundariesImpl<T>();
		return boundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> GaussDistribution<T> createGaussDistribution() {
		GaussDistributionImpl<T> gaussDistribution = new GaussDistributionImpl<T>();
		return gaussDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> BetaDistribution<T> createBetaDistribution() {
		BetaDistributionImpl<T> betaDistribution = new BetaDistributionImpl<T>();
		return betaDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinAvgMaxStatistic createMinAvgMaxStatistic() {
		MinAvgMaxStatisticImpl minAvgMaxStatistic = new MinAvgMaxStatisticImpl();
		return minAvgMaxStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValueStatistic createSingleValueStatistic() {
		SingleValueStatisticImpl singleValueStatistic = new SingleValueStatisticImpl();
		return singleValueStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLiteral createModeLiteral() {
		ModeLiteralImpl modeLiteral = new ModeLiteralImpl();
		return modeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsModel createComponentsModel() {
		ComponentsModelImpl componentsModel = new ComponentsModelImpl();
		return componentsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort createQualifiedPort() {
		QualifiedPortImpl qualifiedPort = new QualifiedPortImpl();
		return qualifiedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FInterfacePort createFInterfacePort() {
		FInterfacePortImpl fInterfacePort = new FInterfacePortImpl();
		return fInterfacePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigModel createConfigModel() {
		ConfigModelImpl configModel = new ConfigModelImpl();
		return configModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventConfigLink createEventConfigLink() {
		EventConfigLinkImpl eventConfigLink = new EventConfigLinkImpl();
		return eventConfigLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventConfigElement createEventConfigElement() {
		EventConfigElementImpl eventConfigElement = new EventConfigElementImpl();
		return eventConfigElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsModel createConstraintsModel() {
		ConstraintsModelImpl constraintsModel = new ConstraintsModelImpl();
		return constraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableSequencingConstraint createRunnableSequencingConstraint() {
		RunnableSequencingConstraintImpl runnableSequencingConstraint = new RunnableSequencingConstraintImpl();
		return runnableSequencingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRunnableGroup createProcessRunnableGroup() {
		ProcessRunnableGroupImpl processRunnableGroup = new ProcessRunnableGroupImpl();
		return processRunnableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableSeparationConstraint createRunnableSeparationConstraint() {
		RunnableSeparationConstraintImpl runnableSeparationConstraint = new RunnableSeparationConstraintImpl();
		return runnableSeparationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSeparationConstraint createProcessSeparationConstraint() {
		ProcessSeparationConstraintImpl processSeparationConstraint = new ProcessSeparationConstraintImpl();
		return processSeparationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSeparationConstraint createDataSeparationConstraint() {
		DataSeparationConstraintImpl dataSeparationConstraint = new DataSeparationConstraintImpl();
		return dataSeparationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnablePairingConstraint createRunnablePairingConstraint() {
		RunnablePairingConstraintImpl runnablePairingConstraint = new RunnablePairingConstraintImpl();
		return runnablePairingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPairingConstraint createProcessPairingConstraint() {
		ProcessPairingConstraintImpl processPairingConstraint = new ProcessPairingConstraintImpl();
		return processPairingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPairingConstraint createDataPairingConstraint() {
		DataPairingConstraintImpl dataPairingConstraint = new DataPairingConstraintImpl();
		return dataPairingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetMemory createTargetMemory() {
		TargetMemoryImpl targetMemory = new TargetMemoryImpl();
		return targetMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetCore createTargetCore() {
		TargetCoreImpl targetCore = new TargetCoreImpl();
		return targetCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetScheduler createTargetScheduler() {
		TargetSchedulerImpl targetScheduler = new TargetSchedulerImpl();
		return targetScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetProcess createTargetProcess() {
		TargetProcessImpl targetProcess = new TargetProcessImpl();
		return targetProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetCallSequence createTargetCallSequence() {
		TargetCallSequenceImpl targetCallSequence = new TargetCallSequenceImpl();
		return targetCallSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelEntityGroup createLabelEntityGroup() {
		LabelEntityGroupImpl labelEntityGroup = new LabelEntityGroupImpl();
		return labelEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEntityGroup createRunnableEntityGroup() {
		RunnableEntityGroupImpl runnableEntityGroup = new RunnableEntityGroupImpl();
		return runnableEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessEntityGroup createProcessEntityGroup() {
		ProcessEntityGroupImpl processEntityGroup = new ProcessEntityGroupImpl();
		return processEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagGroup createTagGroup() {
		TagGroupImpl tagGroup = new TagGroupImpl();
		return tagGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChain createEventChain() {
		EventChainImpl eventChain = new EventChainImpl();
		return eventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChainReference createEventChainReference() {
		EventChainReferenceImpl eventChainReference = new EventChainReferenceImpl();
		return eventChainReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubEventChain createSubEventChain() {
		SubEventChainImpl subEventChain = new SubEventChainImpl();
		return subEventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSectionConstraint createPhysicalSectionConstraint() {
		PhysicalSectionConstraintImpl physicalSectionConstraint = new PhysicalSectionConstraintImpl();
		return physicalSectionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSynchronizationConstraint createEventSynchronizationConstraint() {
		EventSynchronizationConstraintImpl eventSynchronizationConstraint = new EventSynchronizationConstraintImpl();
		return eventSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChainSynchronizationConstraint createEventChainSynchronizationConstraint() {
		EventChainSynchronizationConstraintImpl eventChainSynchronizationConstraint = new EventChainSynchronizationConstraintImpl();
		return eventChainSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayConstraint createDelayConstraint() {
		DelayConstraintImpl delayConstraint = new DelayConstraintImpl();
		return delayConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChainLatencyConstraint createEventChainLatencyConstraint() {
		EventChainLatencyConstraintImpl eventChainLatencyConstraint = new EventChainLatencyConstraintImpl();
		return eventChainLatencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepetitionConstraint createRepetitionConstraint() {
		RepetitionConstraintImpl repetitionConstraint = new RepetitionConstraintImpl();
		return repetitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAgeConstraint createDataAgeConstraint() {
		DataAgeConstraintImpl dataAgeConstraint = new DataAgeConstraintImpl();
		return dataAgeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAgeCycle createDataAgeCycle() {
		DataAgeCycleImpl dataAgeCycle = new DataAgeCycleImpl();
		return dataAgeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAgeTime createDataAgeTime() {
		DataAgeTimeImpl dataAgeTime = new DataAgeTimeImpl();
		return dataAgeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequirement createProcessRequirement() {
		ProcessRequirementImpl processRequirement = new ProcessRequirementImpl();
		return processRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableRequirement createRunnableRequirement() {
		RunnableRequirementImpl runnableRequirement = new RunnableRequirementImpl();
		return runnableRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureRequirement createArchitectureRequirement() {
		ArchitectureRequirementImpl architectureRequirement = new ArchitectureRequirementImpl();
		return architectureRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessChainRequirement createProcessChainRequirement() {
		ProcessChainRequirementImpl processChainRequirement = new ProcessChainRequirementImpl();
		return processChainRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUPercentageRequirementLimit createCPUPercentageRequirementLimit() {
		CPUPercentageRequirementLimitImpl cpuPercentageRequirementLimit = new CPUPercentageRequirementLimitImpl();
		return cpuPercentageRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyRequirementLimit createFrequencyRequirementLimit() {
		FrequencyRequirementLimitImpl frequencyRequirementLimit = new FrequencyRequirementLimitImpl();
		return frequencyRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageRequirementLimit createPercentageRequirementLimit() {
		PercentageRequirementLimitImpl percentageRequirementLimit = new PercentageRequirementLimitImpl();
		return percentageRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountRequirementLimit createCountRequirementLimit() {
		CountRequirementLimitImpl countRequirementLimit = new CountRequirementLimitImpl();
		return countRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRequirementLimit createTimeRequirementLimit() {
		TimeRequirementLimitImpl timeRequirementLimit = new TimeRequirementLimitImpl();
		return timeRequirementLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCoherencyGroup createDataCoherencyGroup() {
		DataCoherencyGroupImpl dataCoherencyGroup = new DataCoherencyGroupImpl();
		return dataCoherencyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStabilityGroup createDataStabilityGroup() {
		DataStabilityGroupImpl dataStabilityGroup = new DataStabilityGroupImpl();
		return dataStabilityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessScope createProcessScope() {
		ProcessScopeImpl processScope = new ProcessScopeImpl();
		return processScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableScope createRunnableScope() {
		RunnableScopeImpl runnableScope = new RunnableScopeImpl();
		return runnableScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentScope createComponentScope() {
		ComponentScopeImpl componentScope = new ComponentScopeImpl();
		return componentScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModel createEventModel() {
		EventModelImpl eventModel = new EventModelImpl();
		return eventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSet createEventSet() {
		EventSetImpl eventSet = new EventSetImpl();
		return eventSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEvent createCustomEvent() {
		CustomEventImpl customEvent = new CustomEventImpl();
		return customEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimulusEvent createStimulusEvent() {
		StimulusEventImpl stimulusEvent = new StimulusEventImpl();
		return stimulusEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessEvent createProcessEvent() {
		ProcessEventImpl processEvent = new ProcessEventImpl();
		return processEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessChainEvent createProcessChainEvent() {
		ProcessChainEventImpl processChainEvent = new ProcessChainEventImpl();
		return processChainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableEvent createRunnableEvent() {
		RunnableEventImpl runnableEvent = new RunnableEventImpl();
		return runnableEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelEvent createLabelEvent() {
		LabelEventImpl labelEvent = new LabelEventImpl();
		return labelEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreEvent createSemaphoreEvent() {
		SemaphoreEventImpl semaphoreEvent = new SemaphoreEventImpl();
		return semaphoreEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWModel createHWModel() {
		HWModelImpl hwModel = new HWModelImpl();
		return hwModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwSystem createHwSystem() {
		HwSystemImpl hwSystem = new HwSystemImpl();
		return hwSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU createECU() {
		ECUImpl ecu = new ECUImpl();
		return ecu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microcontroller createMicrocontroller() {
		MicrocontrollerImpl microcontroller = new MicrocontrollerImpl();
		return microcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz createQuartz() {
		QuartzImpl quartz = new QuartzImpl();
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComponent createHwComponent() {
		HwComponentImpl hwComponent = new HwComponentImpl();
		return hwComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType createSystemType() {
		SystemTypeImpl systemType = new SystemTypeImpl();
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECUType createECUType() {
		ECUTypeImpl ecuType = new ECUTypeImpl();
		return ecuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerType createMicrocontrollerType() {
		MicrocontrollerTypeImpl microcontrollerType = new MicrocontrollerTypeImpl();
		return microcontrollerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreType createCoreType() {
		CoreTypeImpl coreType = new CoreTypeImpl();
		return coreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryType createMemoryType() {
		MemoryTypeImpl memoryType = new MemoryTypeImpl();
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType createNetworkType() {
		NetworkTypeImpl networkType = new NetworkTypeImpl();
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPort createHwPort() {
		HwPortImpl hwPort = new HwPortImpl();
		return hwPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexPort createComplexPort() {
		ComplexPortImpl complexPort = new ComplexPortImpl();
		return complexPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexPin createComplexPin() {
		ComplexPinImpl complexPin = new ComplexPinImpl();
		return complexPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescaler createPrescaler() {
		PrescalerImpl prescaler = new PrescalerImpl();
		return prescaler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossbarSwitch createCrossbarSwitch() {
		CrossbarSwitchImpl crossbarSwitch = new CrossbarSwitchImpl();
		return crossbarSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bridge createBridge() {
		BridgeImpl bridge = new BridgeImpl();
		return bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyAccessPath createLatencyAccessPath() {
		LatencyAccessPathImpl latencyAccessPath = new LatencyAccessPathImpl();
		return latencyAccessPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwAccessPath createHwAccessPath() {
		HwAccessPathImpl hwAccessPath = new HwAccessPathImpl();
		return hwAccessPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPathRef createAccessPathRef() {
		AccessPathRefImpl accessPathRef = new AccessPathRefImpl();
		return accessPathRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyConstant createLatencyConstant() {
		LatencyConstantImpl latencyConstant = new LatencyConstantImpl();
		return latencyConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyDeviation createLatencyDeviation() {
		LatencyDeviationImpl latencyDeviation = new LatencyDeviationImpl();
		return latencyDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwAccessPathRef createHwAccessPathRef() {
		HwAccessPathRefImpl hwAccessPathRef = new HwAccessPathRefImpl();
		return hwAccessPathRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwElementRef createHwElementRef() {
		HwElementRefImpl hwElementRef = new HwElementRefImpl();
		return hwElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel createMappingModel() {
		MappingModelImpl mappingModel = new MappingModelImpl();
		return mappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAllocation createCoreAllocation() {
		CoreAllocationImpl coreAllocation = new CoreAllocationImpl();
		return coreAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalSectionMapping createPhysicalSectionMapping() {
		PhysicalSectionMappingImpl physicalSectionMapping = new PhysicalSectionMappingImpl();
		return physicalSectionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementMapping createAbstractElementMapping() {
		AbstractElementMappingImpl abstractElementMapping = new AbstractElementMappingImpl();
		return abstractElementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAllocation createTaskAllocation() {
		TaskAllocationImpl taskAllocation = new TaskAllocationImpl();
		return taskAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISRAllocation createISRAllocation() {
		ISRAllocationImpl isrAllocation = new ISRAllocationImpl();
		return isrAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableAllocation createRunnableAllocation() {
		RunnableAllocationImpl runnableAllocation = new RunnableAllocationImpl();
		return runnableAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSModel createOSModel() {
		OSModelImpl osModel = new OSModelImpl();
		return osModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsBuffering createOsBuffering() {
		OsBufferingImpl osBuffering = new OsBufferingImpl();
		return osBuffering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore createSemaphore() {
		SemaphoreImpl semaphore = new SemaphoreImpl();
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSEK createOSEK() {
		OSEKImpl osek = new OSEKImpl();
		return osek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartlyPFairPD2 createPartlyPFairPD2() {
		PartlyPFairPD2Impl partlyPFairPD2 = new PartlyPFairPD2Impl();
		return partlyPFairPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PfairPD2 createPfairPD2() {
		PfairPD2Impl pfairPD2 = new PfairPD2Impl();
		return pfairPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartlyEarlyReleaseFairPD2 createPartlyEarlyReleaseFairPD2() {
		PartlyEarlyReleaseFairPD2Impl partlyEarlyReleaseFairPD2 = new PartlyEarlyReleaseFairPD2Impl();
		return partlyEarlyReleaseFairPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyReleaseFairPD2 createEarlyReleaseFairPD2() {
		EarlyReleaseFairPD2Impl earlyReleaseFairPD2 = new EarlyReleaseFairPD2Impl();
		return earlyReleaseFairPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeastLocalRemainingExecutionTimeFirst createLeastLocalRemainingExecutionTimeFirst() {
		LeastLocalRemainingExecutionTimeFirstImpl leastLocalRemainingExecutionTimeFirst = new LeastLocalRemainingExecutionTimeFirstImpl();
		return leastLocalRemainingExecutionTimeFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarliestDeadlineFirst createEarliestDeadlineFirst() {
		EarliestDeadlineFirstImpl earliestDeadlineFirst = new EarliestDeadlineFirstImpl();
		return earliestDeadlineFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineMonotonic createDeadlineMonotonic() {
		DeadlineMonotonicImpl deadlineMonotonic = new DeadlineMonotonicImpl();
		return deadlineMonotonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateMonotonic createRateMonotonic() {
		RateMonotonicImpl rateMonotonic = new RateMonotonicImpl();
		return rateMonotonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityBasedRoundRobin createPriorityBasedRoundRobin() {
		PriorityBasedRoundRobinImpl priorityBasedRoundRobin = new PriorityBasedRoundRobinImpl();
		return priorityBasedRoundRobin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSpecificSchedulingAlgorithm createUserSpecificSchedulingAlgorithm() {
		UserSpecificSchedulingAlgorithmImpl userSpecificSchedulingAlgorithm = new UserSpecificSchedulingAlgorithmImpl();
		return userSpecificSchedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityBased createPriorityBased() {
		PriorityBasedImpl priorityBased = new PriorityBasedImpl();
		return priorityBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmParameter createAlgorithmParameter() {
		AlgorithmParameterImpl algorithmParameter = new AlgorithmParameterImpl();
		return algorithmParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingHWUnit createSchedulingHWUnit() {
		SchedulingHWUnitImpl schedulingHWUnit = new SchedulingHWUnitImpl();
		return schedulingHWUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingSWUnit createSchedulingSWUnit() {
		SchedulingSWUnitImpl schedulingSWUnit = new SchedulingSWUnitImpl();
		return schedulingSWUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorOperatingSystem createVendorOperatingSystem() {
		VendorOperatingSystemImpl vendorOperatingSystem = new VendorOperatingSystemImpl();
		return vendorOperatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler createTaskScheduler() {
		TaskSchedulerImpl taskScheduler = new TaskSchedulerImpl();
		return taskScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptController createInterruptController() {
		InterruptControllerImpl interruptController = new InterruptControllerImpl();
		return interruptController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsInstructions createOsInstructions() {
		OsInstructionsImpl osInstructions = new OsInstructionsImpl();
		return osInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsAPIInstructions createOsAPIInstructions() {
		OsAPIInstructionsImpl osAPIInstructions = new OsAPIInstructionsImpl();
		return osAPIInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsISRInstructions createOsISRInstructions() {
		OsISRInstructionsImpl osISRInstructions = new OsISRInstructionsImpl();
		return osISRInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsModel createPropertyConstraintsModel() {
		PropertyConstraintsModelImpl propertyConstraintsModel = new PropertyConstraintsModelImpl();
		return propertyConstraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessAllocationConstraint createProcessAllocationConstraint() {
		ProcessAllocationConstraintImpl processAllocationConstraint = new ProcessAllocationConstraintImpl();
		return processAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPrototypeAllocationConstraint createProcessPrototypeAllocationConstraint() {
		ProcessPrototypeAllocationConstraintImpl processPrototypeAllocationConstraint = new ProcessPrototypeAllocationConstraintImpl();
		return processPrototypeAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableAllocationConstraint createRunnableAllocationConstraint() {
		RunnableAllocationConstraintImpl runnableAllocationConstraint = new RunnableAllocationConstraintImpl();
		return runnableAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementMappingConstraint createAbstractElementMappingConstraint() {
		AbstractElementMappingConstraintImpl abstractElementMappingConstraint = new AbstractElementMappingConstraintImpl();
		return abstractElementMappingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCoreProperty createHwCoreProperty() {
		HwCorePropertyImpl hwCoreProperty = new HwCorePropertyImpl();
		return hwCoreProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCoreConjunction createHwCoreConjunction() {
		HwCoreConjunctionImpl hwCoreConjunction = new HwCoreConjunctionImpl();
		return hwCoreConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryProperty createHwMemoryProperty() {
		HwMemoryPropertyImpl hwMemoryProperty = new HwMemoryPropertyImpl();
		return hwMemoryProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryConjunction createHwMemoryConjunction() {
		HwMemoryConjunctionImpl hwMemoryConjunction = new HwMemoryConjunctionImpl();
		return hwMemoryConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliModel createStimuliModel() {
		StimuliModelImpl stimuliModel = new StimuliModelImpl();
		return stimuliModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeValueList createModeValueList() {
		ModeValueListImpl modeValueList = new ModeValueListImpl();
		return modeValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeValueListEntry createModeValueListEntry() {
		ModeValueListEntryImpl modeValueListEntry = new ModeValueListEntryImpl();
		return modeValueListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Periodic createPeriodic() {
		PeriodicImpl periodic = new PeriodicImpl();
		return periodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicEvent createPeriodicEvent() {
		PeriodicEventImpl periodicEvent = new PeriodicEventImpl();
		return periodicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synthetic createSynthetic() {
		SyntheticImpl synthetic = new SyntheticImpl();
		return synthetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampList createTimestampList() {
		TimestampListImpl timestampList = new TimestampListImpl();
		return timestampList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStimulus createCustomStimulus() {
		CustomStimulusImpl customStimulus = new CustomStimulusImpl();
		return customStimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Single createSingle() {
		SingleImpl single = new SingleImpl();
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterProcess createInterProcess() {
		InterProcessImpl interProcess = new InterProcessImpl();
		return interProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sporadic createSporadic() {
		SporadicImpl sporadic = new SporadicImpl();
		return sporadic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalCurve createArrivalCurve() {
		ArrivalCurveImpl arrivalCurve = new ArrivalCurveImpl();
		return arrivalCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalCurveEntry createArrivalCurveEntry() {
		ArrivalCurveEntryImpl arrivalCurveEntry = new ArrivalCurveEntryImpl();
		return arrivalCurveEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockTriangleFunction createClockTriangleFunction() {
		ClockTriangleFunctionImpl clockTriangleFunction = new ClockTriangleFunctionImpl();
		return clockTriangleFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockSinusFunction createClockSinusFunction() {
		ClockSinusFunctionImpl clockSinusFunction = new ClockSinusFunctionImpl();
		return clockSinusFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockMultiplierList createClockMultiplierList() {
		ClockMultiplierListImpl clockMultiplierList = new ClockMultiplierListImpl();
		return clockMultiplierList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockMultiplierListEntry createClockMultiplierListEntry() {
		ClockMultiplierListEntryImpl clockMultiplierListEntry = new ClockMultiplierListEntryImpl();
		return clockMultiplierListEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWModel createSWModel() {
		SWModelImpl swModel = new SWModelImpl();
		return swModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEntity createCustomEntity() {
		CustomEntityImpl customEntity = new CustomEntityImpl();
		return customEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessChain createProcessChain() {
		ProcessChainImpl processChain = new ProcessChainImpl();
		return processChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGraph createCallGraph() {
		CallGraphImpl callGraph = new CallGraphImpl();
		return callGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSequence createCallSequence() {
		CallSequenceImpl callSequence = new CallSequenceImpl();
		return callSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSwitch createModeSwitch() {
		ModeSwitchImpl modeSwitch = new ModeSwitchImpl();
		return modeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> ModeSwitchEntry<T> createModeSwitchEntry() {
		ModeSwitchEntryImpl<T> modeSwitchEntry = new ModeSwitchEntryImpl<T>();
		return modeSwitchEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> ModeSwitchDefault<T> createModeSwitchDefault() {
		ModeSwitchDefaultImpl<T> modeSwitchDefault = new ModeSwitchDefaultImpl<T>();
		return modeSwitchDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabiltitySwitch createProbabiltitySwitch() {
		ProbabiltitySwitchImpl probabiltitySwitch = new ProbabiltitySwitchImpl();
		return probabiltitySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> ProbabilitySwitchEntry<T> createProbabilitySwitchEntry() {
		ProbabilitySwitchEntryImpl<T> probabilitySwitchEntry = new ProbabilitySwitchEntryImpl<T>();
		return probabilitySwitchEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter createCounter() {
		CounterImpl counter = new CounterImpl();
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitEvent createWaitEvent() {
		WaitEventImpl waitEvent = new WaitEventImpl();
		return waitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetEvent createSetEvent() {
		SetEventImpl setEvent = new SetEventImpl();
		return setEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearEvent createClearEvent() {
		ClearEventImpl clearEvent = new ClearEventImpl();
		return clearEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMask createEventMask() {
		EventMaskImpl eventMask = new EventMaskImpl();
		return eventMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsEvent createOsEvent() {
		OsEventImpl osEvent = new OsEventImpl();
		return osEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterProcessActivation createInterProcessActivation() {
		InterProcessActivationImpl interProcessActivation = new InterProcessActivationImpl();
		return interProcessActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnforcedMigration createEnforcedMigration() {
		EnforcedMigrationImpl enforcedMigration = new EnforcedMigrationImpl();
		return enforcedMigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRunnableCall createTaskRunnableCall() {
		TaskRunnableCallImpl taskRunnableCall = new TaskRunnableCallImpl();
		return taskRunnableCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulePoint createSchedulePoint() {
		SchedulePointImpl schedulePoint = new SchedulePointImpl();
		return schedulePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminateProcess createTerminateProcess() {
		TerminateProcessImpl terminateProcess = new TerminateProcessImpl();
		return terminateProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISR createISR() {
		ISRImpl isr = new ISRImpl();
		return isr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPrototype createProcessPrototype() {
		ProcessPrototypeImpl processPrototype = new ProcessPrototypeImpl();
		return processPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainedProcessPrototype createChainedProcessPrototype() {
		ChainedProcessPrototypeImpl chainedProcessPrototype = new ChainedProcessPrototypeImpl();
		return chainedProcessPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPrecedenceSpec createAccessPrecedenceSpec() {
		AccessPrecedenceSpecImpl accessPrecedenceSpec = new AccessPrecedenceSpecImpl();
		return accessPrecedenceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderPrecedenceSpec createOrderPrecedenceSpec() {
		OrderPrecedenceSpecImpl orderPrecedenceSpec = new OrderPrecedenceSpecImpl();
		return orderPrecedenceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable createRunnable() {
		RunnableImpl runnable = new RunnableImpl();
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLabel createModeLabel() {
		ModeLabelImpl modeLabel = new ModeLabelImpl();
		return modeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeLabelAccess createModeLabelAccess() {
		ModeLabelAccessImpl modeLabelAccess = new ModeLabelAccessImpl();
		return modeLabelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableModeSwitch createRunnableModeSwitch() {
		RunnableModeSwitchImpl runnableModeSwitch = new RunnableModeSwitchImpl();
		return runnableModeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccess createLabelAccess() {
		LabelAccessImpl labelAccess = new LabelAccessImpl();
		return labelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreAccess createSemaphoreAccess() {
		SemaphoreAccessImpl semaphoreAccess = new SemaphoreAccessImpl();
		return semaphoreAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverRead createSenderReceiverRead() {
		SenderReceiverReadImpl senderReceiverRead = new SenderReceiverReadImpl();
		return senderReceiverRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderReceiverWrite createSenderReceiverWrite() {
		SenderReceiverWriteImpl senderReceiverWrite = new SenderReceiverWriteImpl();
		return senderReceiverWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousServerCall createSynchronousServerCall() {
		SynchronousServerCallImpl synchronousServerCall = new SynchronousServerCallImpl();
		return synchronousServerCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousServerCall createAsynchronousServerCall() {
		AsynchronousServerCallImpl asynchronousServerCall = new AsynchronousServerCallImpl();
		return asynchronousServerCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableProbabilitySwitch createRunnableProbabilitySwitch() {
		RunnableProbabilitySwitchImpl runnableProbabilitySwitch = new RunnableProbabilitySwitchImpl();
		return runnableProbabilitySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableCall createRunnableCall() {
		RunnableCallImpl runnableCall = new RunnableCallImpl();
		return runnableCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsDeviation createInstructionsDeviation() {
		InstructionsDeviationImpl instructionsDeviation = new InstructionsDeviationImpl();
		return instructionsDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsConstant createInstructionsConstant() {
		InstructionsConstantImpl instructionsConstant = new InstructionsConstantImpl();
		return instructionsConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructEntry createStructEntry() {
		StructEntryImpl structEntry = new StructEntryImpl();
		return structEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointer createPointer() {
		PointerImpl pointer = new PointerImpl();
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef createTypeRef() {
		TypeRefImpl typeRef = new TypeRefImpl();
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPlatformMapping createDataPlatformMapping() {
		DataPlatformMappingImpl dataPlatformMapping = new DataPlatformMappingImpl();
		return dataPlatformMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDefinition createDataTypeDefinition() {
		DataTypeDefinitionImpl dataTypeDefinition = new DataTypeDefinitionImpl();
		return dataTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseTypeDefinition createBaseTypeDefinition() {
		BaseTypeDefinitionImpl baseTypeDefinition = new BaseTypeDefinitionImpl();
		return baseTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicActivation createPeriodicActivation() {
		PeriodicActivationImpl periodicActivation = new PeriodicActivationImpl();
		return periodicActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicActivation createSporadicActivation() {
		SporadicActivationImpl sporadicActivation = new SporadicActivationImpl();
		return sporadicActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleActivation createSingleActivation() {
		SingleActivationImpl singleActivation = new SingleActivationImpl();
		return singleActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomActivation createCustomActivation() {
		CustomActivationImpl customActivation = new CustomActivationImpl();
		return customActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessStatistic createLabelAccessStatistic() {
		LabelAccessStatisticImpl labelAccessStatistic = new LabelAccessStatisticImpl();
		return labelAccessStatistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionFetch createInstructionFetch() {
		InstructionFetchImpl instructionFetch = new InstructionFetchImpl();
		return instructionFetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunEntityCallStatistic createRunEntityCallStatistic() {
		RunEntityCallStatisticImpl runEntityCallStatistic = new RunEntityCallStatisticImpl();
		return runEntityCallStatistic;
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
	public QType createQTypeFromString(EDataType eDataType, String initialValue) {
		QType result = QType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryTypeEnum createMemoryTypeEnumFromString(EDataType eDataType, String initialValue) {
		MemoryTypeEnum result = MemoryTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusType createBusTypeFromString(EDataType eDataType, String initialValue) {
		BusType result = BusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWType createRWTypeFromString(EDataType eDataType, String initialValue) {
		RWType result = RWType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRWTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedType createSchedTypeFromString(EDataType eDataType, String initialValue) {
		SchedType result = SchedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinType createPinTypeFromString(EDataType eDataType, String initialValue) {
		PinType result = PinType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinTypeToString(EDataType eDataType, Object instanceValue) {
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
	public ComparatorType createComparatorTypeFromString(EDataType eDataType, String initialValue) {
		ComparatorType result = ComparatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjunctionType createConjunctionTypeFromString(EDataType eDataType, String initialValue) {
		ConjunctionType result = ConjunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConjunctionTypeToString(EDataType eDataType, Object instanceValue) {
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
	public LabelBuffering createLabelBufferingFromString(EDataType eDataType, String initialValue) {
		LabelBuffering result = LabelBuffering.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelBufferingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessBuffering createLabelAccessBufferingFromString(EDataType eDataType, String initialValue) {
		LabelAccessBuffering result = LabelAccessBuffering.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelAccessBufferingToString(EDataType eDataType, Object instanceValue) {
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
	public Preemptability createPreemptabilityFromString(EDataType eDataType, String initialValue) {
		Preemptability result = Preemptability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreemptabilityToString(EDataType eDataType, Object instanceValue) {
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
