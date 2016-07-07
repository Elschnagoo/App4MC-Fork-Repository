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
package org.eclipse.app4mc.tracing.converter.ot1.OT1.util;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.*;

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
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package
 * @generated
 */
public class OT1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OT1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1Switch() {
		if (modelPackage == null) {
			modelPackage = OT1Package.eINSTANCE;
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
			case OT1Package.ADDRESS_RANGE_TYPE: {
				AddressRangeType addressRangeType = (AddressRangeType)theEObject;
				T result = caseAddressRangeType(addressRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.ANY_DATA_TYPE: {
				AnyDataType anyDataType = (AnyDataType)theEObject;
				T result = caseAnyDataType(anyDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.APPLICATION_ELEMENT_TYPE: {
				ApplicationElementType applicationElementType = (ApplicationElementType)theEObject;
				T result = caseApplicationElementType(applicationElementType);
				if (result == null) result = caseSchedulingEntityElementType(applicationElementType);
				if (result == null) result = caseIdentifiableElement(applicationElementType);
				if (result == null) result = caseElementType(applicationElementType);
				if (result == null) result = caseOT1Type(applicationElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE: {
				ArbitraryEventTriggeringConstraintType arbitraryEventTriggeringConstraintType = (ArbitraryEventTriggeringConstraintType)theEObject;
				T result = caseArbitraryEventTriggeringConstraintType(arbitraryEventTriggeringConstraintType);
				if (result == null) result = caseEventTriggeringConstraintType(arbitraryEventTriggeringConstraintType);
				if (result == null) result = caseTimingConstraintElementType(arbitraryEventTriggeringConstraintType);
				if (result == null) result = caseElementType(arbitraryEventTriggeringConstraintType);
				if (result == null) result = caseOT1Type(arbitraryEventTriggeringConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.ARBITRARY_EVENT_TRIGGERING_TYPE: {
				ArbitraryEventTriggeringType arbitraryEventTriggeringType = (ArbitraryEventTriggeringType)theEObject;
				T result = caseArbitraryEventTriggeringType(arbitraryEventTriggeringType);
				if (result == null) result = caseEventTriggeringType(arbitraryEventTriggeringType);
				if (result == null) result = caseTimingValueElementType(arbitraryEventTriggeringType);
				if (result == null) result = caseElementType(arbitraryEventTriggeringType);
				if (result == null) result = caseOT1Type(arbitraryEventTriggeringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.AUTOSAR_OS_TYPE: {
				AutosarOsType autosarOsType = (AutosarOsType)theEObject;
				T result = caseAutosarOsType(autosarOsType);
				if (result == null) result = caseSchedulingEntityType(autosarOsType);
				if (result == null) result = caseUniqueElementType(autosarOsType);
				if (result == null) result = caseElementType(autosarOsType);
				if (result == null) result = caseOT1Type(autosarOsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.CAN_BUS_TYPE: {
				CanBusType canBusType = (CanBusType)theEObject;
				T result = caseCanBusType(canBusType);
				if (result == null) result = caseSchedulingEntityType(canBusType);
				if (result == null) result = caseUniqueElementType(canBusType);
				if (result == null) result = caseElementType(canBusType);
				if (result == null) result = caseOT1Type(canBusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.CLOCK_TYPE: {
				ClockType clockType = (ClockType)theEObject;
				T result = caseClockType(clockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.CODE_BLOCK_TYPE: {
				CodeBlockType codeBlockType = (CodeBlockType)theEObject;
				T result = caseCodeBlockType(codeBlockType);
				if (result == null) result = caseApplicationElementType(codeBlockType);
				if (result == null) result = caseSchedulingEntityElementType(codeBlockType);
				if (result == null) result = caseIdentifiableElement(codeBlockType);
				if (result == null) result = caseElementType(codeBlockType);
				if (result == null) result = caseOT1Type(codeBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.COMMENT_DATA_TYPE: {
				CommentDataType commentDataType = (CommentDataType)theEObject;
				T result = caseCommentDataType(commentDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.COMMUNICATION_ELEMENT_TYPE: {
				CommunicationElementType communicationElementType = (CommunicationElementType)theEObject;
				T result = caseCommunicationElementType(communicationElementType);
				if (result == null) result = caseSchedulingEntityElementType(communicationElementType);
				if (result == null) result = caseIdentifiableElement(communicationElementType);
				if (result == null) result = caseElementType(communicationElementType);
				if (result == null) result = caseOT1Type(communicationElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.CUSTOM_DATA_TYPE: {
				CustomDataType customDataType = (CustomDataType)theEObject;
				T result = caseCustomDataType(customDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.DATA_ELEMENT_TYPE: {
				DataElementType dataElementType = (DataElementType)theEObject;
				T result = caseDataElementType(dataElementType);
				if (result == null) result = caseSchedulingEntityElementType(dataElementType);
				if (result == null) result = caseIdentifiableElement(dataElementType);
				if (result == null) result = caseElementType(dataElementType);
				if (result == null) result = caseOT1Type(dataElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.DATA_RANGE_ELEMENT_TYPE: {
				DataRangeElementType dataRangeElementType = (DataRangeElementType)theEObject;
				T result = caseDataRangeElementType(dataRangeElementType);
				if (result == null) result = caseDataElementType(dataRangeElementType);
				if (result == null) result = caseSchedulingEntityElementType(dataRangeElementType);
				if (result == null) result = caseIdentifiableElement(dataRangeElementType);
				if (result == null) result = caseElementType(dataRangeElementType);
				if (result == null) result = caseOT1Type(dataRangeElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = caseOT1Type(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EVENT_CHAIN_ELEMENT_TYPE: {
				EventChainElementType eventChainElementType = (EventChainElementType)theEObject;
				T result = caseEventChainElementType(eventChainElementType);
				if (result == null) result = caseTimeRangeElementType(eventChainElementType);
				if (result == null) result = caseVirtualElementType(eventChainElementType);
				if (result == null) result = caseSchedulingEntityElementType(eventChainElementType);
				if (result == null) result = caseIdentifiableElement(eventChainElementType);
				if (result == null) result = caseElementType(eventChainElementType);
				if (result == null) result = caseOT1Type(eventChainElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EVENT_CHAIN_TYPE: {
				EventChainType eventChainType = (EventChainType)theEObject;
				T result = caseEventChainType(eventChainType);
				if (result == null) result = caseIdentifiableElement(eventChainType);
				if (result == null) result = caseElementType(eventChainType);
				if (result == null) result = caseOT1Type(eventChainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EVENT_DESCRIPTION_TYPE: {
				EventDescriptionType eventDescriptionType = (EventDescriptionType)theEObject;
				T result = caseEventDescriptionType(eventDescriptionType);
				if (result == null) result = caseOT1Type(eventDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EVENT_ID_MAPPING_TYPE: {
				EventIdMappingType eventIdMappingType = (EventIdMappingType)theEObject;
				T result = caseEventIdMappingType(eventIdMappingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EVENT_REFERENCE_ELEMENT_TYPE: {
				EventReferenceElementType eventReferenceElementType = (EventReferenceElementType)theEObject;
				T result = caseEventReferenceElementType(eventReferenceElementType);
				if (result == null) result = caseTimeStampElementType(eventReferenceElementType);
				if (result == null) result = caseVirtualElementType(eventReferenceElementType);
				if (result == null) result = caseSchedulingEntityElementType(eventReferenceElementType);
				if (result == null) result = caseIdentifiableElement(eventReferenceElementType);
				if (result == null) result = caseElementType(eventReferenceElementType);
				if (result == null) result = caseOT1Type(eventReferenceElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EVENT_REFERENCE_TYPE: {
				EventReferenceType eventReferenceType = (EventReferenceType)theEObject;
				T result = caseEventReferenceType(eventReferenceType);
				if (result == null) result = caseOT1Type(eventReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EVENT_TRIGGERING_CONSTRAINT_TYPE: {
				EventTriggeringConstraintType eventTriggeringConstraintType = (EventTriggeringConstraintType)theEObject;
				T result = caseEventTriggeringConstraintType(eventTriggeringConstraintType);
				if (result == null) result = caseTimingConstraintElementType(eventTriggeringConstraintType);
				if (result == null) result = caseElementType(eventTriggeringConstraintType);
				if (result == null) result = caseOT1Type(eventTriggeringConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EVENT_TRIGGERING_TYPE: {
				EventTriggeringType eventTriggeringType = (EventTriggeringType)theEObject;
				T result = caseEventTriggeringType(eventTriggeringType);
				if (result == null) result = caseTimingValueElementType(eventTriggeringType);
				if (result == null) result = caseElementType(eventTriggeringType);
				if (result == null) result = caseOT1Type(eventTriggeringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.EXECUTION_ORDER_CONSTRAINT_TYPE: {
				ExecutionOrderConstraintType executionOrderConstraintType = (ExecutionOrderConstraintType)theEObject;
				T result = caseExecutionOrderConstraintType(executionOrderConstraintType);
				if (result == null) result = caseTimingConstraintElementType(executionOrderConstraintType);
				if (result == null) result = caseElementType(executionOrderConstraintType);
				if (result == null) result = caseOT1Type(executionOrderConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.FLEX_RAY_BUS_TYPE: {
				FlexRayBusType flexRayBusType = (FlexRayBusType)theEObject;
				T result = caseFlexRayBusType(flexRayBusType);
				if (result == null) result = caseSchedulingEntityType(flexRayBusType);
				if (result == null) result = caseUniqueElementType(flexRayBusType);
				if (result == null) result = caseElementType(flexRayBusType);
				if (result == null) result = caseOT1Type(flexRayBusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.FRAME_ELEMENT_TYPE: {
				FrameElementType frameElementType = (FrameElementType)theEObject;
				T result = caseFrameElementType(frameElementType);
				if (result == null) result = caseCommunicationElementType(frameElementType);
				if (result == null) result = caseSchedulingEntityElementType(frameElementType);
				if (result == null) result = caseIdentifiableElement(frameElementType);
				if (result == null) result = caseElementType(frameElementType);
				if (result == null) result = caseOT1Type(frameElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = caseApplicationElementType(functionType);
				if (result == null) result = caseSchedulingEntityElementType(functionType);
				if (result == null) result = caseIdentifiableElement(functionType);
				if (result == null) result = caseElementType(functionType);
				if (result == null) result = caseOT1Type(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.IDENTIFIABLE_ELEMENT: {
				IdentifiableElement identifiableElement = (IdentifiableElement)theEObject;
				T result = caseIdentifiableElement(identifiableElement);
				if (result == null) result = caseElementType(identifiableElement);
				if (result == null) result = caseOT1Type(identifiableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.INTERRUPT_TYPE: {
				InterruptType interruptType = (InterruptType)theEObject;
				T result = caseInterruptType(interruptType);
				if (result == null) result = caseSchedulableApplicationElementType(interruptType);
				if (result == null) result = caseApplicationElementType(interruptType);
				if (result == null) result = caseSchedulingEntityElementType(interruptType);
				if (result == null) result = caseIdentifiableElement(interruptType);
				if (result == null) result = caseElementType(interruptType);
				if (result == null) result = caseOT1Type(interruptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE: {
				LatencyTimingConstraintType latencyTimingConstraintType = (LatencyTimingConstraintType)theEObject;
				T result = caseLatencyTimingConstraintType(latencyTimingConstraintType);
				if (result == null) result = caseTimingConstraintElementType(latencyTimingConstraintType);
				if (result == null) result = caseElementType(latencyTimingConstraintType);
				if (result == null) result = caseOT1Type(latencyTimingConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.LIN_BUS_TYPE: {
				LinBusType linBusType = (LinBusType)theEObject;
				T result = caseLinBusType(linBusType);
				if (result == null) result = caseSchedulingEntityType(linBusType);
				if (result == null) result = caseUniqueElementType(linBusType);
				if (result == null) result = caseElementType(linBusType);
				if (result == null) result = caseOT1Type(linBusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.MESSAGE_TYPE: {
				MessageType messageType = (MessageType)theEObject;
				T result = caseMessageType(messageType);
				if (result == null) result = caseCommunicationElementType(messageType);
				if (result == null) result = caseSchedulingEntityElementType(messageType);
				if (result == null) result = caseIdentifiableElement(messageType);
				if (result == null) result = caseElementType(messageType);
				if (result == null) result = caseOT1Type(messageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.MOST_BUS_TYPE: {
				MostBusType mostBusType = (MostBusType)theEObject;
				T result = caseMostBusType(mostBusType);
				if (result == null) result = caseSchedulingEntityType(mostBusType);
				if (result == null) result = caseUniqueElementType(mostBusType);
				if (result == null) result = caseElementType(mostBusType);
				if (result == null) result = caseOT1Type(mostBusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE: {
				OffsetTimingConstraintType offsetTimingConstraintType = (OffsetTimingConstraintType)theEObject;
				T result = caseOffsetTimingConstraintType(offsetTimingConstraintType);
				if (result == null) result = caseTimingConstraintElementType(offsetTimingConstraintType);
				if (result == null) result = caseElementType(offsetTimingConstraintType);
				if (result == null) result = caseOT1Type(offsetTimingConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.OSEK_OS_TYPE: {
				OsekOsType osekOsType = (OsekOsType)theEObject;
				T result = caseOsekOsType(osekOsType);
				if (result == null) result = caseSchedulingEntityType(osekOsType);
				if (result == null) result = caseUniqueElementType(osekOsType);
				if (result == null) result = caseElementType(osekOsType);
				if (result == null) result = caseOT1Type(osekOsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.OT1_HEX_TRACE_TYPE: {
				OT1HexTraceType ot1HexTraceType = (OT1HexTraceType)theEObject;
				T result = caseOT1HexTraceType(ot1HexTraceType);
				if (result == null) result = caseElementType(ot1HexTraceType);
				if (result == null) result = caseOT1Type(ot1HexTraceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.OT1_TRACE_LINK_TYPE: {
				OT1TraceLinkType ot1TraceLinkType = (OT1TraceLinkType)theEObject;
				T result = caseOT1TraceLinkType(ot1TraceLinkType);
				if (result == null) result = caseElementType(ot1TraceLinkType);
				if (result == null) result = caseOT1Type(ot1TraceLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.OT1_TYPE: {
				OT1Type ot1Type = (OT1Type)theEObject;
				T result = caseOT1Type(ot1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.OT1_TYPE1: {
				OT1Type1 ot1Type1 = (OT1Type1)theEObject;
				T result = caseOT1Type1(ot1Type1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.PDU_TYPE: {
				PduType pduType = (PduType)theEObject;
				T result = casePduType(pduType);
				if (result == null) result = caseCommunicationElementType(pduType);
				if (result == null) result = caseSchedulingEntityElementType(pduType);
				if (result == null) result = caseIdentifiableElement(pduType);
				if (result == null) result = caseElementType(pduType);
				if (result == null) result = caseOT1Type(pduType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE: {
				PeriodicEventTriggeringConstraintType periodicEventTriggeringConstraintType = (PeriodicEventTriggeringConstraintType)theEObject;
				T result = casePeriodicEventTriggeringConstraintType(periodicEventTriggeringConstraintType);
				if (result == null) result = caseEventTriggeringConstraintType(periodicEventTriggeringConstraintType);
				if (result == null) result = caseTimingConstraintElementType(periodicEventTriggeringConstraintType);
				if (result == null) result = caseElementType(periodicEventTriggeringConstraintType);
				if (result == null) result = caseOT1Type(periodicEventTriggeringConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.POSIX_OS_TYPE: {
				PosixOsType posixOsType = (PosixOsType)theEObject;
				T result = casePosixOsType(posixOsType);
				if (result == null) result = caseSchedulingEntityType(posixOsType);
				if (result == null) result = caseUniqueElementType(posixOsType);
				if (result == null) result = caseElementType(posixOsType);
				if (result == null) result = caseOT1Type(posixOsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.PROCESS_TYPE: {
				ProcessType processType = (ProcessType)theEObject;
				T result = caseProcessType(processType);
				if (result == null) result = caseSchedulableApplicationElementType(processType);
				if (result == null) result = caseApplicationElementType(processType);
				if (result == null) result = caseSchedulingEntityElementType(processType);
				if (result == null) result = caseIdentifiableElement(processType);
				if (result == null) result = caseElementType(processType);
				if (result == null) result = caseOT1Type(processType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.RUNNABLE_TYPE: {
				RunnableType runnableType = (RunnableType)theEObject;
				T result = caseRunnableType(runnableType);
				if (result == null) result = caseApplicationElementType(runnableType);
				if (result == null) result = caseSchedulingEntityElementType(runnableType);
				if (result == null) result = caseIdentifiableElement(runnableType);
				if (result == null) result = caseElementType(runnableType);
				if (result == null) result = caseOT1Type(runnableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.SCHEDULABLE_APPLICATION_ELEMENT_TYPE: {
				SchedulableApplicationElementType schedulableApplicationElementType = (SchedulableApplicationElementType)theEObject;
				T result = caseSchedulableApplicationElementType(schedulableApplicationElementType);
				if (result == null) result = caseApplicationElementType(schedulableApplicationElementType);
				if (result == null) result = caseSchedulingEntityElementType(schedulableApplicationElementType);
				if (result == null) result = caseIdentifiableElement(schedulableApplicationElementType);
				if (result == null) result = caseElementType(schedulableApplicationElementType);
				if (result == null) result = caseOT1Type(schedulableApplicationElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.SCHEDULING_ENTITY_ELEMENT_TYPE: {
				SchedulingEntityElementType schedulingEntityElementType = (SchedulingEntityElementType)theEObject;
				T result = caseSchedulingEntityElementType(schedulingEntityElementType);
				if (result == null) result = caseIdentifiableElement(schedulingEntityElementType);
				if (result == null) result = caseElementType(schedulingEntityElementType);
				if (result == null) result = caseOT1Type(schedulingEntityElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.SCHEDULING_ENTITY_TYPE: {
				SchedulingEntityType schedulingEntityType = (SchedulingEntityType)theEObject;
				T result = caseSchedulingEntityType(schedulingEntityType);
				if (result == null) result = caseUniqueElementType(schedulingEntityType);
				if (result == null) result = caseElementType(schedulingEntityType);
				if (result == null) result = caseOT1Type(schedulingEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.SIGNAL_TYPE: {
				SignalType signalType = (SignalType)theEObject;
				T result = caseSignalType(signalType);
				if (result == null) result = caseCommunicationElementType(signalType);
				if (result == null) result = caseSchedulingEntityElementType(signalType);
				if (result == null) result = caseIdentifiableElement(signalType);
				if (result == null) result = caseElementType(signalType);
				if (result == null) result = caseOT1Type(signalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE: {
				SporadicEventTriggeringConstraintType sporadicEventTriggeringConstraintType = (SporadicEventTriggeringConstraintType)theEObject;
				T result = caseSporadicEventTriggeringConstraintType(sporadicEventTriggeringConstraintType);
				if (result == null) result = caseEventTriggeringConstraintType(sporadicEventTriggeringConstraintType);
				if (result == null) result = caseTimingConstraintElementType(sporadicEventTriggeringConstraintType);
				if (result == null) result = caseElementType(sporadicEventTriggeringConstraintType);
				if (result == null) result = caseOT1Type(sporadicEventTriggeringConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.SYMBOL_RANGE_TYPE: {
				SymbolRangeType symbolRangeType = (SymbolRangeType)theEObject;
				T result = caseSymbolRangeType(symbolRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TASK_TYPE: {
				TaskType taskType = (TaskType)theEObject;
				T result = caseTaskType(taskType);
				if (result == null) result = caseSchedulableApplicationElementType(taskType);
				if (result == null) result = caseApplicationElementType(taskType);
				if (result == null) result = caseSchedulingEntityElementType(taskType);
				if (result == null) result = caseIdentifiableElement(taskType);
				if (result == null) result = caseElementType(taskType);
				if (result == null) result = caseOT1Type(taskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.THREAD_TYPE: {
				ThreadType threadType = (ThreadType)theEObject;
				T result = caseThreadType(threadType);
				if (result == null) result = caseSchedulableApplicationElementType(threadType);
				if (result == null) result = caseApplicationElementType(threadType);
				if (result == null) result = caseSchedulingEntityElementType(threadType);
				if (result == null) result = caseIdentifiableElement(threadType);
				if (result == null) result = caseElementType(threadType);
				if (result == null) result = caseOT1Type(threadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIME_RANGE_ELEMENT_TYPE: {
				TimeRangeElementType timeRangeElementType = (TimeRangeElementType)theEObject;
				T result = caseTimeRangeElementType(timeRangeElementType);
				if (result == null) result = caseVirtualElementType(timeRangeElementType);
				if (result == null) result = caseSchedulingEntityElementType(timeRangeElementType);
				if (result == null) result = caseIdentifiableElement(timeRangeElementType);
				if (result == null) result = caseElementType(timeRangeElementType);
				if (result == null) result = caseOT1Type(timeRangeElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIME_STAMP_ELEMENT_TYPE: {
				TimeStampElementType timeStampElementType = (TimeStampElementType)theEObject;
				T result = caseTimeStampElementType(timeStampElementType);
				if (result == null) result = caseVirtualElementType(timeStampElementType);
				if (result == null) result = caseSchedulingEntityElementType(timeStampElementType);
				if (result == null) result = caseIdentifiableElement(timeStampElementType);
				if (result == null) result = caseElementType(timeStampElementType);
				if (result == null) result = caseOT1Type(timeStampElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIME_VALUE_TYPE: {
				TimeValueType timeValueType = (TimeValueType)theEObject;
				T result = caseTimeValueType(timeValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIMING_CONSTRAINT_ELEMENT_TYPE: {
				TimingConstraintElementType timingConstraintElementType = (TimingConstraintElementType)theEObject;
				T result = caseTimingConstraintElementType(timingConstraintElementType);
				if (result == null) result = caseElementType(timingConstraintElementType);
				if (result == null) result = caseOT1Type(timingConstraintElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIMING_CONSTRAINTS_TYPE: {
				TimingConstraintsType timingConstraintsType = (TimingConstraintsType)theEObject;
				T result = caseTimingConstraintsType(timingConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE: {
				TimingInformationConstraintType timingInformationConstraintType = (TimingInformationConstraintType)theEObject;
				T result = caseTimingInformationConstraintType(timingInformationConstraintType);
				if (result == null) result = caseTimingConstraintElementType(timingInformationConstraintType);
				if (result == null) result = caseElementType(timingInformationConstraintType);
				if (result == null) result = caseOT1Type(timingInformationConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIMING_INFORMATION_ELEMENT_TYPE: {
				TimingInformationElementType timingInformationElementType = (TimingInformationElementType)theEObject;
				T result = caseTimingInformationElementType(timingInformationElementType);
				if (result == null) result = caseTimingValueElementType(timingInformationElementType);
				if (result == null) result = caseElementType(timingInformationElementType);
				if (result == null) result = caseOT1Type(timingInformationElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE: {
				TimingValueElementType timingValueElementType = (TimingValueElementType)theEObject;
				T result = caseTimingValueElementType(timingValueElementType);
				if (result == null) result = caseElementType(timingValueElementType);
				if (result == null) result = caseOT1Type(timingValueElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TIMING_VALUES_TYPE: {
				TimingValuesType timingValuesType = (TimingValuesType)theEObject;
				T result = caseTimingValuesType(timingValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TRACE_COMMENT_TYPE: {
				TraceCommentType traceCommentType = (TraceCommentType)theEObject;
				T result = caseTraceCommentType(traceCommentType);
				if (result == null) result = caseOT1Type(traceCommentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TRACE_ENTRY_TYPE: {
				TraceEntryType traceEntryType = (TraceEntryType)theEObject;
				T result = caseTraceEntryType(traceEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TRACES_TYPE: {
				TracesType tracesType = (TracesType)theEObject;
				T result = caseTracesType(tracesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TRACING_OVERHEAD_CONTAINER_TYPE: {
				TracingOverheadContainerType tracingOverheadContainerType = (TracingOverheadContainerType)theEObject;
				T result = caseTracingOverheadContainerType(tracingOverheadContainerType);
				if (result == null) result = caseOT1Type(tracingOverheadContainerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.TRACING_OVERHEAD_TYPE: {
				TracingOverheadType tracingOverheadType = (TracingOverheadType)theEObject;
				T result = caseTracingOverheadType(tracingOverheadType);
				if (result == null) result = caseOT1Type(tracingOverheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.UNIQUE_ELEMENT_TYPE: {
				UniqueElementType uniqueElementType = (UniqueElementType)theEObject;
				T result = caseUniqueElementType(uniqueElementType);
				if (result == null) result = caseElementType(uniqueElementType);
				if (result == null) result = caseOT1Type(uniqueElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.VARIABLE_TYPE: {
				VariableType variableType = (VariableType)theEObject;
				T result = caseVariableType(variableType);
				if (result == null) result = caseDataElementType(variableType);
				if (result == null) result = caseSchedulingEntityElementType(variableType);
				if (result == null) result = caseIdentifiableElement(variableType);
				if (result == null) result = caseElementType(variableType);
				if (result == null) result = caseOT1Type(variableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.VIRTUAL_ELEMENT_TYPE: {
				VirtualElementType virtualElementType = (VirtualElementType)theEObject;
				T result = caseVirtualElementType(virtualElementType);
				if (result == null) result = caseSchedulingEntityElementType(virtualElementType);
				if (result == null) result = caseIdentifiableElement(virtualElementType);
				if (result == null) result = caseElementType(virtualElementType);
				if (result == null) result = caseOT1Type(virtualElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.WINDOWS_OS_TYPE: {
				WindowsOsType windowsOsType = (WindowsOsType)theEObject;
				T result = caseWindowsOsType(windowsOsType);
				if (result == null) result = caseSchedulingEntityType(windowsOsType);
				if (result == null) result = caseUniqueElementType(windowsOsType);
				if (result == null) result = caseElementType(windowsOsType);
				if (result == null) result = caseOT1Type(windowsOsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OT1Package.XML_TRACE_TYPE: {
				XmlTraceType xmlTraceType = (XmlTraceType)theEObject;
				T result = caseXmlTraceType(xmlTraceType);
				if (result == null) result = caseUniqueElementType(xmlTraceType);
				if (result == null) result = caseElementType(xmlTraceType);
				if (result == null) result = caseOT1Type(xmlTraceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressRangeType(AddressRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyDataType(AnyDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationElementType(ApplicationElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitrary Event Triggering Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitrary Event Triggering Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitraryEventTriggeringConstraintType(ArbitraryEventTriggeringConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitrary Event Triggering Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitrary Event Triggering Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitraryEventTriggeringType(ArbitraryEventTriggeringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autosar Os Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autosar Os Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutosarOsType(AutosarOsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Can Bus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Can Bus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanBusType(CanBusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockType(ClockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlockType(CodeBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentDataType(CommentDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationElementType(CommunicationElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDataType(CustomDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElementType(DataElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRangeElementType(DataRangeElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChainElementType(EventChainElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChainType(EventChainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDescriptionType(EventDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Id Mapping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Id Mapping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventIdMappingType(EventIdMappingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Reference Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Reference Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventReferenceElementType(EventReferenceElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventReferenceType(EventReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Triggering Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Triggering Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTriggeringConstraintType(EventTriggeringConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Triggering Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Triggering Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTriggeringType(EventTriggeringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Order Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Order Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionOrderConstraintType(ExecutionOrderConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flex Ray Bus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flex Ray Bus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlexRayBusType(FlexRayBusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameElementType(FrameElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiableElement(IdentifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptType(InterruptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency Timing Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency Timing Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatencyTimingConstraintType(LatencyTimingConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lin Bus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lin Bus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinBusType(LinBusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageType(MessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Most Bus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Most Bus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMostBusType(MostBusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset Timing Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset Timing Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffsetTimingConstraintType(OffsetTimingConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osek Os Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osek Os Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsekOsType(OsekOsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Trace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Trace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOT1HexTraceType(OT1HexTraceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOT1TraceLinkType(OT1TraceLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOT1Type(OT1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOT1Type1(OT1Type1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pdu Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pdu Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePduType(PduType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Event Triggering Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Event Triggering Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicEventTriggeringConstraintType(PeriodicEventTriggeringConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Posix Os Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Posix Os Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosixOsType(PosixOsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessType(ProcessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableType(RunnableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedulable Application Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedulable Application Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulableApplicationElementType(SchedulableApplicationElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Entity Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Entity Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingEntityElementType(SchedulingEntityElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduling Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduling Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingEntityType(SchedulingEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalType(SignalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Event Triggering Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Event Triggering Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicEventTriggeringConstraintType(SporadicEventTriggeringConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolRangeType(SymbolRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadType(ThreadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Range Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Range Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRangeElementType(TimeRangeElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStampElementType(TimeStampElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeValueType(TimeValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Constraint Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Constraint Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingConstraintElementType(TimingConstraintElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingConstraintsType(TimingConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Information Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Information Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingInformationConstraintType(TimingInformationConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Information Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Information Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingInformationElementType(TimingInformationElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Value Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Value Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingValueElementType(TimingValueElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingValuesType(TimingValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceCommentType(TraceCommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceEntryType(TraceEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracesType(TracesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tracing Overhead Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracing Overhead Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracingOverheadContainerType(TracingOverheadContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tracing Overhead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracing Overhead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracingOverheadType(TracingOverheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueElementType(UniqueElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualElementType(VirtualElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windows Os Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windows Os Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowsOsType(WindowsOsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Trace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Trace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlTraceType(XmlTraceType object) {
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

} //OT1Switch
