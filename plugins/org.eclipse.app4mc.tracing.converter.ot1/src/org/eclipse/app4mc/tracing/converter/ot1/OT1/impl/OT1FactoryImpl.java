/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.*;

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
public class OT1FactoryImpl extends EFactoryImpl implements OT1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OT1Factory init() {
		try {
			OT1Factory theOT1Factory = (OT1Factory)EPackage.Registry.INSTANCE.getEFactory(OT1Package.eNS_URI);
			if (theOT1Factory != null) {
				return theOT1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OT1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1FactoryImpl() {
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
			case OT1Package.ADDRESS_RANGE_TYPE: return createAddressRangeType();
			case OT1Package.ANY_DATA_TYPE: return createAnyDataType();
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE: return createArbitraryEventTriggeringConstraintType();
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE: return createArbitraryEventTriggeringType();
			case OT1Package.AUTOSAR_OS_TYPE: return createAutosarOsType();
			case OT1Package.CAN_BUS_TYPE: return createCanBusType();
			case OT1Package.CLOCK_TYPE: return createClockType();
			case OT1Package.CODE_BLOCK_TYPE: return createCodeBlockType();
			case OT1Package.COMMENT_DATA_TYPE: return createCommentDataType();
			case OT1Package.CUSTOM_DATA_TYPE: return createCustomDataType();
			case OT1Package.DATA_RANGE_ELEMENT_TYPE: return createDataRangeElementType();
			case OT1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case OT1Package.ELEMENT_TYPE: return createElementType();
			case OT1Package.EVENT_CHAIN_ELEMENT_TYPE: return createEventChainElementType();
			case OT1Package.EVENT_CHAIN_TYPE: return createEventChainType();
			case OT1Package.EVENT_DESCRIPTION_TYPE: return createEventDescriptionType();
			case OT1Package.EVENT_ID_MAPPING_TYPE: return createEventIdMappingType();
			case OT1Package.EVENT_REFERENCE_ELEMENT_TYPE: return createEventReferenceElementType();
			case OT1Package.EVENT_REFERENCE_TYPE: return createEventReferenceType();
			case OT1Package.EVENT_TRIGGERING_CONSTRAINT_TYPE: return createEventTriggeringConstraintType();
			case OT1Package.EVENT_TRIGGERING_TYPE: return createEventTriggeringType();
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE: return createExecutionOrderConstraintType();
			case OT1Package.FLEX_RAY_BUS_TYPE: return createFlexRayBusType();
			case OT1Package.FRAME_ELEMENT_TYPE: return createFrameElementType();
			case OT1Package.FUNCTION_TYPE: return createFunctionType();
			case OT1Package.IDENTIFIABLE_ELEMENT: return createIdentifiableElement();
			case OT1Package.INTERRUPT_TYPE: return createInterruptType();
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE: return createLatencyTimingConstraintType();
			case OT1Package.LIN_BUS_TYPE: return createLinBusType();
			case OT1Package.MESSAGE_TYPE: return createMessageType();
			case OT1Package.MOST_BUS_TYPE: return createMostBusType();
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE: return createOffsetTimingConstraintType();
			case OT1Package.OSEK_OS_TYPE: return createOsekOsType();
			case OT1Package.OT1_HEX_TRACE_TYPE: return createOT1HexTraceType();
			case OT1Package.OT1_TRACE_LINK_TYPE: return createOT1TraceLinkType();
			case OT1Package.OT1_TYPE: return createOT1Type();
			case OT1Package.OT1_TYPE1: return createOT1Type1();
			case OT1Package.PDU_TYPE: return createPduType();
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE: return createPeriodicEventTriggeringConstraintType();
			case OT1Package.POSIX_OS_TYPE: return createPosixOsType();
			case OT1Package.PROCESS_TYPE: return createProcessType();
			case OT1Package.RUNNABLE_TYPE: return createRunnableType();
			case OT1Package.SCHEDULABLE_APPLICATION_ELEMENT_TYPE: return createSchedulableApplicationElementType();
			case OT1Package.SIGNAL_TYPE: return createSignalType();
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE: return createSporadicEventTriggeringConstraintType();
			case OT1Package.SYMBOL_RANGE_TYPE: return createSymbolRangeType();
			case OT1Package.TASK_TYPE: return createTaskType();
			case OT1Package.THREAD_TYPE: return createThreadType();
			case OT1Package.TIME_RANGE_ELEMENT_TYPE: return createTimeRangeElementType();
			case OT1Package.TIME_STAMP_ELEMENT_TYPE: return createTimeStampElementType();
			case OT1Package.TIME_VALUE_TYPE: return createTimeValueType();
			case OT1Package.TIMING_CONSTRAINTS_TYPE: return createTimingConstraintsType();
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE: return createTimingInformationConstraintType();
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE: return createTimingInformationElementType();
			case OT1Package.TIMING_VALUES_TYPE: return createTimingValuesType();
			case OT1Package.TRACE_COMMENT_TYPE: return createTraceCommentType();
			case OT1Package.TRACE_ENTRY_TYPE: return createTraceEntryType();
			case OT1Package.TRACES_TYPE: return createTracesType();
			case OT1Package.TRACING_OVERHEAD_CONTAINER_TYPE: return createTracingOverheadContainerType();
			case OT1Package.TRACING_OVERHEAD_TYPE: return createTracingOverheadType();
			case OT1Package.UNIQUE_ELEMENT_TYPE: return createUniqueElementType();
			case OT1Package.VARIABLE_TYPE: return createVariableType();
			case OT1Package.WINDOWS_OS_TYPE: return createWindowsOsType();
			case OT1Package.XML_TRACE_TYPE: return createXmlTraceType();
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
			case OT1Package.EVENT_TYPE_ENUM:
				return createEventTypeEnumFromString(eDataType, initialValue);
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM:
				return createExecutionOrderConstraintTypeEnumFromString(eDataType, initialValue);
			case OT1Package.INTERRUPT_TYPE_ENUM:
				return createInterruptTypeEnumFromString(eDataType, initialValue);
			case OT1Package.LATENCY_TYPE_ENUM:
				return createLatencyTypeEnumFromString(eDataType, initialValue);
			case OT1Package.TASK_TYPE_ENUM:
				return createTaskTypeEnumFromString(eDataType, initialValue);
			case OT1Package.THRESHOLD_TYPE_ENUM:
				return createThresholdTypeEnumFromString(eDataType, initialValue);
			case OT1Package.TIME_BASE_ENUM:
				return createTimeBaseEnumFromString(eDataType, initialValue);
			case OT1Package.TIMING_INFORMATION_SOURCE_ENUM:
				return createTimingInformationSourceEnumFromString(eDataType, initialValue);
			case OT1Package.TIMING_INFORMATION_SUB_TYPE_ENUM:
				return createTimingInformationSubTypeEnumFromString(eDataType, initialValue);
			case OT1Package.TIMING_INFORMATION_TYPE_ENUM:
				return createTimingInformationTypeEnumFromString(eDataType, initialValue);
			case OT1Package.TRACING_OVERHEAD_DESCRIPTION_ENUM:
				return createTracingOverheadDescriptionEnumFromString(eDataType, initialValue);
			case OT1Package.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case OT1Package.EVENT_TYPE_ENUM_OBJECT:
				return createEventTypeEnumObjectFromString(eDataType, initialValue);
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM_OBJECT:
				return createExecutionOrderConstraintTypeEnumObjectFromString(eDataType, initialValue);
			case OT1Package.INTERRUPT_TYPE_ENUM_OBJECT:
				return createInterruptTypeEnumObjectFromString(eDataType, initialValue);
			case OT1Package.LATENCY_TYPE_ENUM_OBJECT:
				return createLatencyTypeEnumObjectFromString(eDataType, initialValue);
			case OT1Package.TASK_TYPE_ENUM_OBJECT:
				return createTaskTypeEnumObjectFromString(eDataType, initialValue);
			case OT1Package.THRESHOLD_TYPE_ENUM_OBJECT:
				return createThresholdTypeEnumObjectFromString(eDataType, initialValue);
			case OT1Package.TIME_BASE_ENUM_OBJECT:
				return createTimeBaseEnumObjectFromString(eDataType, initialValue);
			case OT1Package.TIMING_INFORMATION_SOURCE_ENUM_OBJECT:
				return createTimingInformationSourceEnumObjectFromString(eDataType, initialValue);
			case OT1Package.TIMING_INFORMATION_SUB_TYPE_ENUM_OBJECT:
				return createTimingInformationSubTypeEnumObjectFromString(eDataType, initialValue);
			case OT1Package.TIMING_INFORMATION_TYPE_ENUM_OBJECT:
				return createTimingInformationTypeEnumObjectFromString(eDataType, initialValue);
			case OT1Package.TRACING_OVERHEAD_DESCRIPTION_ENUM_OBJECT:
				return createTracingOverheadDescriptionEnumObjectFromString(eDataType, initialValue);
			case OT1Package.VERSION_TYPE_OBJECT:
				return createVersionTypeObjectFromString(eDataType, initialValue);
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
			case OT1Package.EVENT_TYPE_ENUM:
				return convertEventTypeEnumToString(eDataType, instanceValue);
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM:
				return convertExecutionOrderConstraintTypeEnumToString(eDataType, instanceValue);
			case OT1Package.INTERRUPT_TYPE_ENUM:
				return convertInterruptTypeEnumToString(eDataType, instanceValue);
			case OT1Package.LATENCY_TYPE_ENUM:
				return convertLatencyTypeEnumToString(eDataType, instanceValue);
			case OT1Package.TASK_TYPE_ENUM:
				return convertTaskTypeEnumToString(eDataType, instanceValue);
			case OT1Package.THRESHOLD_TYPE_ENUM:
				return convertThresholdTypeEnumToString(eDataType, instanceValue);
			case OT1Package.TIME_BASE_ENUM:
				return convertTimeBaseEnumToString(eDataType, instanceValue);
			case OT1Package.TIMING_INFORMATION_SOURCE_ENUM:
				return convertTimingInformationSourceEnumToString(eDataType, instanceValue);
			case OT1Package.TIMING_INFORMATION_SUB_TYPE_ENUM:
				return convertTimingInformationSubTypeEnumToString(eDataType, instanceValue);
			case OT1Package.TIMING_INFORMATION_TYPE_ENUM:
				return convertTimingInformationTypeEnumToString(eDataType, instanceValue);
			case OT1Package.TRACING_OVERHEAD_DESCRIPTION_ENUM:
				return convertTracingOverheadDescriptionEnumToString(eDataType, instanceValue);
			case OT1Package.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case OT1Package.EVENT_TYPE_ENUM_OBJECT:
				return convertEventTypeEnumObjectToString(eDataType, instanceValue);
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM_OBJECT:
				return convertExecutionOrderConstraintTypeEnumObjectToString(eDataType, instanceValue);
			case OT1Package.INTERRUPT_TYPE_ENUM_OBJECT:
				return convertInterruptTypeEnumObjectToString(eDataType, instanceValue);
			case OT1Package.LATENCY_TYPE_ENUM_OBJECT:
				return convertLatencyTypeEnumObjectToString(eDataType, instanceValue);
			case OT1Package.TASK_TYPE_ENUM_OBJECT:
				return convertTaskTypeEnumObjectToString(eDataType, instanceValue);
			case OT1Package.THRESHOLD_TYPE_ENUM_OBJECT:
				return convertThresholdTypeEnumObjectToString(eDataType, instanceValue);
			case OT1Package.TIME_BASE_ENUM_OBJECT:
				return convertTimeBaseEnumObjectToString(eDataType, instanceValue);
			case OT1Package.TIMING_INFORMATION_SOURCE_ENUM_OBJECT:
				return convertTimingInformationSourceEnumObjectToString(eDataType, instanceValue);
			case OT1Package.TIMING_INFORMATION_SUB_TYPE_ENUM_OBJECT:
				return convertTimingInformationSubTypeEnumObjectToString(eDataType, instanceValue);
			case OT1Package.TIMING_INFORMATION_TYPE_ENUM_OBJECT:
				return convertTimingInformationTypeEnumObjectToString(eDataType, instanceValue);
			case OT1Package.TRACING_OVERHEAD_DESCRIPTION_ENUM_OBJECT:
				return convertTracingOverheadDescriptionEnumObjectToString(eDataType, instanceValue);
			case OT1Package.VERSION_TYPE_OBJECT:
				return convertVersionTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressRangeType createAddressRangeType() {
		AddressRangeTypeImpl addressRangeType = new AddressRangeTypeImpl();
		return addressRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyDataType createAnyDataType() {
		AnyDataTypeImpl anyDataType = new AnyDataTypeImpl();
		return anyDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitraryEventTriggeringConstraintType createArbitraryEventTriggeringConstraintType() {
		ArbitraryEventTriggeringConstraintTypeImpl arbitraryEventTriggeringConstraintType = new ArbitraryEventTriggeringConstraintTypeImpl();
		return arbitraryEventTriggeringConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitraryEventTriggeringType createArbitraryEventTriggeringType() {
		ArbitraryEventTriggeringTypeImpl arbitraryEventTriggeringType = new ArbitraryEventTriggeringTypeImpl();
		return arbitraryEventTriggeringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutosarOsType createAutosarOsType() {
		AutosarOsTypeImpl autosarOsType = new AutosarOsTypeImpl();
		return autosarOsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanBusType createCanBusType() {
		CanBusTypeImpl canBusType = new CanBusTypeImpl();
		return canBusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockType createClockType() {
		ClockTypeImpl clockType = new ClockTypeImpl();
		return clockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlockType createCodeBlockType() {
		CodeBlockTypeImpl codeBlockType = new CodeBlockTypeImpl();
		return codeBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentDataType createCommentDataType() {
		CommentDataTypeImpl commentDataType = new CommentDataTypeImpl();
		return commentDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDataType createCustomDataType() {
		CustomDataTypeImpl customDataType = new CustomDataTypeImpl();
		return customDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRangeElementType createDataRangeElementType() {
		DataRangeElementTypeImpl dataRangeElementType = new DataRangeElementTypeImpl();
		return dataRangeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChainElementType createEventChainElementType() {
		EventChainElementTypeImpl eventChainElementType = new EventChainElementTypeImpl();
		return eventChainElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChainType createEventChainType() {
		EventChainTypeImpl eventChainType = new EventChainTypeImpl();
		return eventChainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDescriptionType createEventDescriptionType() {
		EventDescriptionTypeImpl eventDescriptionType = new EventDescriptionTypeImpl();
		return eventDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventIdMappingType createEventIdMappingType() {
		EventIdMappingTypeImpl eventIdMappingType = new EventIdMappingTypeImpl();
		return eventIdMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReferenceElementType createEventReferenceElementType() {
		EventReferenceElementTypeImpl eventReferenceElementType = new EventReferenceElementTypeImpl();
		return eventReferenceElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReferenceType createEventReferenceType() {
		EventReferenceTypeImpl eventReferenceType = new EventReferenceTypeImpl();
		return eventReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTriggeringConstraintType createEventTriggeringConstraintType() {
		EventTriggeringConstraintTypeImpl eventTriggeringConstraintType = new EventTriggeringConstraintTypeImpl();
		return eventTriggeringConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTriggeringType createEventTriggeringType() {
		EventTriggeringTypeImpl eventTriggeringType = new EventTriggeringTypeImpl();
		return eventTriggeringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOrderConstraintType createExecutionOrderConstraintType() {
		ExecutionOrderConstraintTypeImpl executionOrderConstraintType = new ExecutionOrderConstraintTypeImpl();
		return executionOrderConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexRayBusType createFlexRayBusType() {
		FlexRayBusTypeImpl flexRayBusType = new FlexRayBusTypeImpl();
		return flexRayBusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameElementType createFrameElementType() {
		FrameElementTypeImpl frameElementType = new FrameElementTypeImpl();
		return frameElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElement createIdentifiableElement() {
		IdentifiableElementImpl identifiableElement = new IdentifiableElementImpl();
		return identifiableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptType createInterruptType() {
		InterruptTypeImpl interruptType = new InterruptTypeImpl();
		return interruptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyTimingConstraintType createLatencyTimingConstraintType() {
		LatencyTimingConstraintTypeImpl latencyTimingConstraintType = new LatencyTimingConstraintTypeImpl();
		return latencyTimingConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinBusType createLinBusType() {
		LinBusTypeImpl linBusType = new LinBusTypeImpl();
		return linBusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MostBusType createMostBusType() {
		MostBusTypeImpl mostBusType = new MostBusTypeImpl();
		return mostBusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetTimingConstraintType createOffsetTimingConstraintType() {
		OffsetTimingConstraintTypeImpl offsetTimingConstraintType = new OffsetTimingConstraintTypeImpl();
		return offsetTimingConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsekOsType createOsekOsType() {
		OsekOsTypeImpl osekOsType = new OsekOsTypeImpl();
		return osekOsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1HexTraceType createOT1HexTraceType() {
		OT1HexTraceTypeImpl ot1HexTraceType = new OT1HexTraceTypeImpl();
		return ot1HexTraceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1TraceLinkType createOT1TraceLinkType() {
		OT1TraceLinkTypeImpl ot1TraceLinkType = new OT1TraceLinkTypeImpl();
		return ot1TraceLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1Type createOT1Type() {
		OT1TypeImpl ot1Type = new OT1TypeImpl();
		return ot1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1Type1 createOT1Type1() {
		OT1Type1Impl ot1Type1 = new OT1Type1Impl();
		return ot1Type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PduType createPduType() {
		PduTypeImpl pduType = new PduTypeImpl();
		return pduType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicEventTriggeringConstraintType createPeriodicEventTriggeringConstraintType() {
		PeriodicEventTriggeringConstraintTypeImpl periodicEventTriggeringConstraintType = new PeriodicEventTriggeringConstraintTypeImpl();
		return periodicEventTriggeringConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PosixOsType createPosixOsType() {
		PosixOsTypeImpl posixOsType = new PosixOsTypeImpl();
		return posixOsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType createProcessType() {
		ProcessTypeImpl processType = new ProcessTypeImpl();
		return processType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableType createRunnableType() {
		RunnableTypeImpl runnableType = new RunnableTypeImpl();
		return runnableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableApplicationElementType createSchedulableApplicationElementType() {
		SchedulableApplicationElementTypeImpl schedulableApplicationElementType = new SchedulableApplicationElementTypeImpl();
		return schedulableApplicationElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalType() {
		SignalTypeImpl signalType = new SignalTypeImpl();
		return signalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicEventTriggeringConstraintType createSporadicEventTriggeringConstraintType() {
		SporadicEventTriggeringConstraintTypeImpl sporadicEventTriggeringConstraintType = new SporadicEventTriggeringConstraintTypeImpl();
		return sporadicEventTriggeringConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolRangeType createSymbolRangeType() {
		SymbolRangeTypeImpl symbolRangeType = new SymbolRangeTypeImpl();
		return symbolRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadType createThreadType() {
		ThreadTypeImpl threadType = new ThreadTypeImpl();
		return threadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRangeElementType createTimeRangeElementType() {
		TimeRangeElementTypeImpl timeRangeElementType = new TimeRangeElementTypeImpl();
		return timeRangeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampElementType createTimeStampElementType() {
		TimeStampElementTypeImpl timeStampElementType = new TimeStampElementTypeImpl();
		return timeStampElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType createTimeValueType() {
		TimeValueTypeImpl timeValueType = new TimeValueTypeImpl();
		return timeValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingConstraintsType createTimingConstraintsType() {
		TimingConstraintsTypeImpl timingConstraintsType = new TimingConstraintsTypeImpl();
		return timingConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationConstraintType createTimingInformationConstraintType() {
		TimingInformationConstraintTypeImpl timingInformationConstraintType = new TimingInformationConstraintTypeImpl();
		return timingInformationConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationElementType createTimingInformationElementType() {
		TimingInformationElementTypeImpl timingInformationElementType = new TimingInformationElementTypeImpl();
		return timingInformationElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingValuesType createTimingValuesType() {
		TimingValuesTypeImpl timingValuesType = new TimingValuesTypeImpl();
		return timingValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceCommentType createTraceCommentType() {
		TraceCommentTypeImpl traceCommentType = new TraceCommentTypeImpl();
		return traceCommentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceEntryType createTraceEntryType() {
		TraceEntryTypeImpl traceEntryType = new TraceEntryTypeImpl();
		return traceEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesType createTracesType() {
		TracesTypeImpl tracesType = new TracesTypeImpl();
		return tracesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingOverheadContainerType createTracingOverheadContainerType() {
		TracingOverheadContainerTypeImpl tracingOverheadContainerType = new TracingOverheadContainerTypeImpl();
		return tracingOverheadContainerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingOverheadType createTracingOverheadType() {
		TracingOverheadTypeImpl tracingOverheadType = new TracingOverheadTypeImpl();
		return tracingOverheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueElementType createUniqueElementType() {
		UniqueElementTypeImpl uniqueElementType = new UniqueElementTypeImpl();
		return uniqueElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowsOsType createWindowsOsType() {
		WindowsOsTypeImpl windowsOsType = new WindowsOsTypeImpl();
		return windowsOsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTraceType createXmlTraceType() {
		XmlTraceTypeImpl xmlTraceType = new XmlTraceTypeImpl();
		return xmlTraceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeEnum createEventTypeEnumFromString(EDataType eDataType, String initialValue) {
		EventTypeEnum result = EventTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOrderConstraintTypeEnum createExecutionOrderConstraintTypeEnumFromString(EDataType eDataType, String initialValue) {
		ExecutionOrderConstraintTypeEnum result = ExecutionOrderConstraintTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionOrderConstraintTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptTypeEnum createInterruptTypeEnumFromString(EDataType eDataType, String initialValue) {
		InterruptTypeEnum result = InterruptTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterruptTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyTypeEnum createLatencyTypeEnumFromString(EDataType eDataType, String initialValue) {
		LatencyTypeEnum result = LatencyTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatencyTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypeEnum createTaskTypeEnumFromString(EDataType eDataType, String initialValue) {
		TaskTypeEnum result = TaskTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThresholdTypeEnum createThresholdTypeEnumFromString(EDataType eDataType, String initialValue) {
		ThresholdTypeEnum result = ThresholdTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThresholdTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBaseEnum createTimeBaseEnumFromString(EDataType eDataType, String initialValue) {
		TimeBaseEnum result = TimeBaseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeBaseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationSourceEnum createTimingInformationSourceEnumFromString(EDataType eDataType, String initialValue) {
		TimingInformationSourceEnum result = TimingInformationSourceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingInformationSourceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationSubTypeEnum createTimingInformationSubTypeEnumFromString(EDataType eDataType, String initialValue) {
		TimingInformationSubTypeEnum result = TimingInformationSubTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingInformationSubTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationTypeEnum createTimingInformationTypeEnumFromString(EDataType eDataType, String initialValue) {
		TimingInformationTypeEnum result = TimingInformationTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingInformationTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingOverheadDescriptionEnum createTracingOverheadDescriptionEnumFromString(EDataType eDataType, String initialValue) {
		TracingOverheadDescriptionEnum result = TracingOverheadDescriptionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTracingOverheadDescriptionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionTypeFromString(EDataType eDataType, String initialValue) {
		VersionType result = VersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeEnum createEventTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTypeEnumFromString(OT1Package.Literals.EVENT_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTypeEnumToString(OT1Package.Literals.EVENT_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOrderConstraintTypeEnum createExecutionOrderConstraintTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createExecutionOrderConstraintTypeEnumFromString(OT1Package.Literals.EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionOrderConstraintTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExecutionOrderConstraintTypeEnumToString(OT1Package.Literals.EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptTypeEnum createInterruptTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createInterruptTypeEnumFromString(OT1Package.Literals.INTERRUPT_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterruptTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterruptTypeEnumToString(OT1Package.Literals.INTERRUPT_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyTypeEnum createLatencyTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createLatencyTypeEnumFromString(OT1Package.Literals.LATENCY_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatencyTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLatencyTypeEnumToString(OT1Package.Literals.LATENCY_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypeEnum createTaskTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskTypeEnumFromString(OT1Package.Literals.TASK_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskTypeEnumToString(OT1Package.Literals.TASK_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThresholdTypeEnum createThresholdTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createThresholdTypeEnumFromString(OT1Package.Literals.THRESHOLD_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThresholdTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertThresholdTypeEnumToString(OT1Package.Literals.THRESHOLD_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBaseEnum createTimeBaseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeBaseEnumFromString(OT1Package.Literals.TIME_BASE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeBaseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeBaseEnumToString(OT1Package.Literals.TIME_BASE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationSourceEnum createTimingInformationSourceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTimingInformationSourceEnumFromString(OT1Package.Literals.TIMING_INFORMATION_SOURCE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingInformationSourceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimingInformationSourceEnumToString(OT1Package.Literals.TIMING_INFORMATION_SOURCE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationSubTypeEnum createTimingInformationSubTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTimingInformationSubTypeEnumFromString(OT1Package.Literals.TIMING_INFORMATION_SUB_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingInformationSubTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimingInformationSubTypeEnumToString(OT1Package.Literals.TIMING_INFORMATION_SUB_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationTypeEnum createTimingInformationTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTimingInformationTypeEnumFromString(OT1Package.Literals.TIMING_INFORMATION_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingInformationTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimingInformationTypeEnumToString(OT1Package.Literals.TIMING_INFORMATION_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingOverheadDescriptionEnum createTracingOverheadDescriptionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTracingOverheadDescriptionEnumFromString(OT1Package.Literals.TRACING_OVERHEAD_DESCRIPTION_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTracingOverheadDescriptionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTracingOverheadDescriptionEnumToString(OT1Package.Literals.TRACING_OVERHEAD_DESCRIPTION_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVersionTypeFromString(OT1Package.Literals.VERSION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVersionTypeToString(OT1Package.Literals.VERSION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1Package getOT1Package() {
		return (OT1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OT1Package getPackage() {
		return OT1Package.eINSTANCE;
	}

} //OT1FactoryImpl
