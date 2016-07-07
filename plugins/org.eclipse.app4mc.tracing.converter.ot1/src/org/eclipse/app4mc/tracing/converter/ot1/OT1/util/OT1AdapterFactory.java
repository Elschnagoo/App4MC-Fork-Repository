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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package
 * @generated
 */
public class OT1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OT1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OT1Package.eINSTANCE;
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
	protected OT1Switch<Adapter> modelSwitch =
		new OT1Switch<Adapter>() {
			@Override
			public Adapter caseAddressRangeType(AddressRangeType object) {
				return createAddressRangeTypeAdapter();
			}
			@Override
			public Adapter caseAnyDataType(AnyDataType object) {
				return createAnyDataTypeAdapter();
			}
			@Override
			public Adapter caseApplicationElementType(ApplicationElementType object) {
				return createApplicationElementTypeAdapter();
			}
			@Override
			public Adapter caseArbitraryEventTriggeringConstraintType(ArbitraryEventTriggeringConstraintType object) {
				return createArbitraryEventTriggeringConstraintTypeAdapter();
			}
			@Override
			public Adapter caseArbitraryEventTriggeringType(ArbitraryEventTriggeringType object) {
				return createArbitraryEventTriggeringTypeAdapter();
			}
			@Override
			public Adapter caseAutosarOsType(AutosarOsType object) {
				return createAutosarOsTypeAdapter();
			}
			@Override
			public Adapter caseCanBusType(CanBusType object) {
				return createCanBusTypeAdapter();
			}
			@Override
			public Adapter caseClockType(ClockType object) {
				return createClockTypeAdapter();
			}
			@Override
			public Adapter caseCodeBlockType(CodeBlockType object) {
				return createCodeBlockTypeAdapter();
			}
			@Override
			public Adapter caseCommentDataType(CommentDataType object) {
				return createCommentDataTypeAdapter();
			}
			@Override
			public Adapter caseCommunicationElementType(CommunicationElementType object) {
				return createCommunicationElementTypeAdapter();
			}
			@Override
			public Adapter caseCustomDataType(CustomDataType object) {
				return createCustomDataTypeAdapter();
			}
			@Override
			public Adapter caseDataElementType(DataElementType object) {
				return createDataElementTypeAdapter();
			}
			@Override
			public Adapter caseDataRangeElementType(DataRangeElementType object) {
				return createDataRangeElementTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseElementType(ElementType object) {
				return createElementTypeAdapter();
			}
			@Override
			public Adapter caseEventChainElementType(EventChainElementType object) {
				return createEventChainElementTypeAdapter();
			}
			@Override
			public Adapter caseEventChainType(EventChainType object) {
				return createEventChainTypeAdapter();
			}
			@Override
			public Adapter caseEventDescriptionType(EventDescriptionType object) {
				return createEventDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseEventIdMappingType(EventIdMappingType object) {
				return createEventIdMappingTypeAdapter();
			}
			@Override
			public Adapter caseEventReferenceElementType(EventReferenceElementType object) {
				return createEventReferenceElementTypeAdapter();
			}
			@Override
			public Adapter caseEventReferenceType(EventReferenceType object) {
				return createEventReferenceTypeAdapter();
			}
			@Override
			public Adapter caseEventTriggeringConstraintType(EventTriggeringConstraintType object) {
				return createEventTriggeringConstraintTypeAdapter();
			}
			@Override
			public Adapter caseEventTriggeringType(EventTriggeringType object) {
				return createEventTriggeringTypeAdapter();
			}
			@Override
			public Adapter caseExecutionOrderConstraintType(ExecutionOrderConstraintType object) {
				return createExecutionOrderConstraintTypeAdapter();
			}
			@Override
			public Adapter caseFlexRayBusType(FlexRayBusType object) {
				return createFlexRayBusTypeAdapter();
			}
			@Override
			public Adapter caseFrameElementType(FrameElementType object) {
				return createFrameElementTypeAdapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseIdentifiableElement(IdentifiableElement object) {
				return createIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseInterruptType(InterruptType object) {
				return createInterruptTypeAdapter();
			}
			@Override
			public Adapter caseLatencyTimingConstraintType(LatencyTimingConstraintType object) {
				return createLatencyTimingConstraintTypeAdapter();
			}
			@Override
			public Adapter caseLinBusType(LinBusType object) {
				return createLinBusTypeAdapter();
			}
			@Override
			public Adapter caseMessageType(MessageType object) {
				return createMessageTypeAdapter();
			}
			@Override
			public Adapter caseMostBusType(MostBusType object) {
				return createMostBusTypeAdapter();
			}
			@Override
			public Adapter caseOffsetTimingConstraintType(OffsetTimingConstraintType object) {
				return createOffsetTimingConstraintTypeAdapter();
			}
			@Override
			public Adapter caseOsekOsType(OsekOsType object) {
				return createOsekOsTypeAdapter();
			}
			@Override
			public Adapter caseOT1HexTraceType(OT1HexTraceType object) {
				return createOT1HexTraceTypeAdapter();
			}
			@Override
			public Adapter caseOT1TraceLinkType(OT1TraceLinkType object) {
				return createOT1TraceLinkTypeAdapter();
			}
			@Override
			public Adapter caseOT1Type(OT1Type object) {
				return createOT1TypeAdapter();
			}
			@Override
			public Adapter caseOT1Type1(OT1Type1 object) {
				return createOT1Type1Adapter();
			}
			@Override
			public Adapter casePduType(PduType object) {
				return createPduTypeAdapter();
			}
			@Override
			public Adapter casePeriodicEventTriggeringConstraintType(PeriodicEventTriggeringConstraintType object) {
				return createPeriodicEventTriggeringConstraintTypeAdapter();
			}
			@Override
			public Adapter casePosixOsType(PosixOsType object) {
				return createPosixOsTypeAdapter();
			}
			@Override
			public Adapter caseProcessType(ProcessType object) {
				return createProcessTypeAdapter();
			}
			@Override
			public Adapter caseRunnableType(RunnableType object) {
				return createRunnableTypeAdapter();
			}
			@Override
			public Adapter caseSchedulableApplicationElementType(SchedulableApplicationElementType object) {
				return createSchedulableApplicationElementTypeAdapter();
			}
			@Override
			public Adapter caseSchedulingEntityElementType(SchedulingEntityElementType object) {
				return createSchedulingEntityElementTypeAdapter();
			}
			@Override
			public Adapter caseSchedulingEntityType(SchedulingEntityType object) {
				return createSchedulingEntityTypeAdapter();
			}
			@Override
			public Adapter caseSignalType(SignalType object) {
				return createSignalTypeAdapter();
			}
			@Override
			public Adapter caseSporadicEventTriggeringConstraintType(SporadicEventTriggeringConstraintType object) {
				return createSporadicEventTriggeringConstraintTypeAdapter();
			}
			@Override
			public Adapter caseSymbolRangeType(SymbolRangeType object) {
				return createSymbolRangeTypeAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseThreadType(ThreadType object) {
				return createThreadTypeAdapter();
			}
			@Override
			public Adapter caseTimeRangeElementType(TimeRangeElementType object) {
				return createTimeRangeElementTypeAdapter();
			}
			@Override
			public Adapter caseTimeStampElementType(TimeStampElementType object) {
				return createTimeStampElementTypeAdapter();
			}
			@Override
			public Adapter caseTimeValueType(TimeValueType object) {
				return createTimeValueTypeAdapter();
			}
			@Override
			public Adapter caseTimingConstraintElementType(TimingConstraintElementType object) {
				return createTimingConstraintElementTypeAdapter();
			}
			@Override
			public Adapter caseTimingConstraintsType(TimingConstraintsType object) {
				return createTimingConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseTimingInformationConstraintType(TimingInformationConstraintType object) {
				return createTimingInformationConstraintTypeAdapter();
			}
			@Override
			public Adapter caseTimingInformationElementType(TimingInformationElementType object) {
				return createTimingInformationElementTypeAdapter();
			}
			@Override
			public Adapter caseTimingValueElementType(TimingValueElementType object) {
				return createTimingValueElementTypeAdapter();
			}
			@Override
			public Adapter caseTimingValuesType(TimingValuesType object) {
				return createTimingValuesTypeAdapter();
			}
			@Override
			public Adapter caseTraceCommentType(TraceCommentType object) {
				return createTraceCommentTypeAdapter();
			}
			@Override
			public Adapter caseTraceEntryType(TraceEntryType object) {
				return createTraceEntryTypeAdapter();
			}
			@Override
			public Adapter caseTracesType(TracesType object) {
				return createTracesTypeAdapter();
			}
			@Override
			public Adapter caseTracingOverheadContainerType(TracingOverheadContainerType object) {
				return createTracingOverheadContainerTypeAdapter();
			}
			@Override
			public Adapter caseTracingOverheadType(TracingOverheadType object) {
				return createTracingOverheadTypeAdapter();
			}
			@Override
			public Adapter caseUniqueElementType(UniqueElementType object) {
				return createUniqueElementTypeAdapter();
			}
			@Override
			public Adapter caseVariableType(VariableType object) {
				return createVariableTypeAdapter();
			}
			@Override
			public Adapter caseVirtualElementType(VirtualElementType object) {
				return createVirtualElementTypeAdapter();
			}
			@Override
			public Adapter caseWindowsOsType(WindowsOsType object) {
				return createWindowsOsTypeAdapter();
			}
			@Override
			public Adapter caseXmlTraceType(XmlTraceType object) {
				return createXmlTraceTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType <em>Address Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType
	 * @generated
	 */
	public Adapter createAddressRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType <em>Any Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType
	 * @generated
	 */
	public Adapter createAnyDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ApplicationElementType <em>Application Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ApplicationElementType
	 * @generated
	 */
	public Adapter createApplicationElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType <em>Arbitrary Event Triggering Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType
	 * @generated
	 */
	public Adapter createArbitraryEventTriggeringConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType <em>Arbitrary Event Triggering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType
	 * @generated
	 */
	public Adapter createArbitraryEventTriggeringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType <em>Autosar Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType
	 * @generated
	 */
	public Adapter createAutosarOsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CanBusType <em>Can Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CanBusType
	 * @generated
	 */
	public Adapter createCanBusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType
	 * @generated
	 */
	public Adapter createClockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType <em>Code Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType
	 * @generated
	 */
	public Adapter createCodeBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CommentDataType <em>Comment Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CommentDataType
	 * @generated
	 */
	public Adapter createCommentDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CommunicationElementType <em>Communication Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CommunicationElementType
	 * @generated
	 */
	public Adapter createCommunicationElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CustomDataType <em>Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CustomDataType
	 * @generated
	 */
	public Adapter createCustomDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DataElementType <em>Data Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DataElementType
	 * @generated
	 */
	public Adapter createDataElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType <em>Data Range Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType
	 * @generated
	 */
	public Adapter createDataRangeElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ElementType
	 * @generated
	 */
	public Adapter createElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType <em>Event Chain Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType
	 * @generated
	 */
	public Adapter createEventChainElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType <em>Event Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType
	 * @generated
	 */
	public Adapter createEventChainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType <em>Event Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType
	 * @generated
	 */
	public Adapter createEventDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType <em>Event Id Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType
	 * @generated
	 */
	public Adapter createEventIdMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType <em>Event Reference Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType
	 * @generated
	 */
	public Adapter createEventReferenceElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType <em>Event Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType
	 * @generated
	 */
	public Adapter createEventReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringConstraintType <em>Event Triggering Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringConstraintType
	 * @generated
	 */
	public Adapter createEventTriggeringConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType <em>Event Triggering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType
	 * @generated
	 */
	public Adapter createEventTriggeringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType <em>Execution Order Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType
	 * @generated
	 */
	public Adapter createExecutionOrderConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.FlexRayBusType <em>Flex Ray Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.FlexRayBusType
	 * @generated
	 */
	public Adapter createFlexRayBusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.FrameElementType <em>Frame Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.FrameElementType
	 * @generated
	 */
	public Adapter createFrameElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.IdentifiableElement
	 * @generated
	 */
	public Adapter createIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType <em>Interrupt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType
	 * @generated
	 */
	public Adapter createInterruptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType <em>Latency Timing Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType
	 * @generated
	 */
	public Adapter createLatencyTimingConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LinBusType <em>Lin Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LinBusType
	 * @generated
	 */
	public Adapter createLinBusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.MessageType
	 * @generated
	 */
	public Adapter createMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.MostBusType <em>Most Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.MostBusType
	 * @generated
	 */
	public Adapter createMostBusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType <em>Offset Timing Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType
	 * @generated
	 */
	public Adapter createOffsetTimingConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OsekOsType <em>Osek Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OsekOsType
	 * @generated
	 */
	public Adapter createOsekOsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType <em>Hex Trace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType
	 * @generated
	 */
	public Adapter createOT1HexTraceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType <em>Trace Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType
	 * @generated
	 */
	public Adapter createOT1TraceLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type
	 * @generated
	 */
	public Adapter createOT1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1
	 * @generated
	 */
	public Adapter createOT1Type1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PduType <em>Pdu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PduType
	 * @generated
	 */
	public Adapter createPduTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType <em>Periodic Event Triggering Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType
	 * @generated
	 */
	public Adapter createPeriodicEventTriggeringConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PosixOsType <em>Posix Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PosixOsType
	 * @generated
	 */
	public Adapter createPosixOsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ProcessType
	 * @generated
	 */
	public Adapter createProcessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.RunnableType <em>Runnable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.RunnableType
	 * @generated
	 */
	public Adapter createRunnableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulableApplicationElementType <em>Schedulable Application Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulableApplicationElementType
	 * @generated
	 */
	public Adapter createSchedulableApplicationElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType <em>Scheduling Entity Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType
	 * @generated
	 */
	public Adapter createSchedulingEntityElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType <em>Scheduling Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType
	 * @generated
	 */
	public Adapter createSchedulingEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SignalType
	 * @generated
	 */
	public Adapter createSignalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType <em>Sporadic Event Triggering Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType
	 * @generated
	 */
	public Adapter createSporadicEventTriggeringConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType <em>Symbol Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType
	 * @generated
	 */
	public Adapter createSymbolRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ThreadType <em>Thread Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThreadType
	 * @generated
	 */
	public Adapter createThreadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType <em>Time Range Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType
	 * @generated
	 */
	public Adapter createTimeRangeElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeStampElementType <em>Time Stamp Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeStampElementType
	 * @generated
	 */
	public Adapter createTimeStampElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType <em>Time Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType
	 * @generated
	 */
	public Adapter createTimeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintElementType <em>Timing Constraint Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintElementType
	 * @generated
	 */
	public Adapter createTimingConstraintElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType <em>Timing Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType
	 * @generated
	 */
	public Adapter createTimingConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType <em>Timing Information Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType
	 * @generated
	 */
	public Adapter createTimingInformationConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType <em>Timing Information Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType
	 * @generated
	 */
	public Adapter createTimingInformationElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType <em>Timing Value Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType
	 * @generated
	 */
	public Adapter createTimingValueElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType <em>Timing Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType
	 * @generated
	 */
	public Adapter createTimingValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType <em>Trace Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType
	 * @generated
	 */
	public Adapter createTraceCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType <em>Trace Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType
	 * @generated
	 */
	public Adapter createTraceEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType <em>Traces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType
	 * @generated
	 */
	public Adapter createTracesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType <em>Tracing Overhead Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType
	 * @generated
	 */
	public Adapter createTracingOverheadContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType <em>Tracing Overhead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType
	 * @generated
	 */
	public Adapter createTracingOverheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType <em>Unique Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType
	 * @generated
	 */
	public Adapter createUniqueElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType
	 * @generated
	 */
	public Adapter createVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VirtualElementType <em>Virtual Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VirtualElementType
	 * @generated
	 */
	public Adapter createVirtualElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.WindowsOsType <em>Windows Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.WindowsOsType
	 * @generated
	 */
	public Adapter createWindowsOsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType <em>Xml Trace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType
	 * @generated
	 */
	public Adapter createXmlTraceTypeAdapter() {
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

} //OT1AdapterFactory
