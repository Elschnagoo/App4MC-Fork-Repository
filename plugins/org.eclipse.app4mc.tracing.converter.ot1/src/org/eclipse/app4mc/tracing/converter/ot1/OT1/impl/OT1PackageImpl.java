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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ApplicationElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CanBusType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CommentDataType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CommunicationElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CustomDataType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.DataElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.FlexRayBusType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.FrameElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.FunctionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.IdentifiableElement;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.LinBusType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.MessageType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.MostBusType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Factory;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OsekOsType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.PduType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.PosixOsType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ProcessType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.RunnableType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulableApplicationElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SignalType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ThreadType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeStampElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.VirtualElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.WindowsOsType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OT1PackageImpl extends EPackageImpl implements OT1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitraryEventTriggeringConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitraryEventTriggeringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autosarOsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canBusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBlockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventIdMappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventReferenceElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTriggeringConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTriggeringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionOrderConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flexRayBusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyTimingConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linBusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mostBusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetTimingConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osekOsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ot1HexTraceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ot1TraceLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ot1TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ot1Type1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pduTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicEventTriggeringConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass posixOsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulableApplicationElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingEntityElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicEventTriggeringConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRangeElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStampElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingConstraintElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingConstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingInformationConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingInformationElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingValueElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingValuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceCommentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracingOverheadContainerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracingOverheadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowsOsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTraceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionOrderConstraintTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interruptTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum latencyTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum thresholdTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeBaseEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingInformationSourceEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingInformationSubTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingInformationTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tracingOverheadDescriptionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executionOrderConstraintTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interruptTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latencyTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taskTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType thresholdTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeBaseEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timingInformationSourceEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timingInformationSubTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timingInformationTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tracingOverheadDescriptionEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeObjectEDataType = null;

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
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OT1PackageImpl() {
		super(eNS_URI, OT1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OT1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OT1Package init() {
		if (isInited) return (OT1Package)EPackage.Registry.INSTANCE.getEPackage(OT1Package.eNS_URI);

		// Obtain or create and register package
		OT1PackageImpl theOT1Package = (OT1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OT1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OT1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOT1Package.createPackageContents();

		// Initialize created meta-data
		theOT1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOT1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OT1Package.eNS_URI, theOT1Package);
		return theOT1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressRangeType() {
		return addressRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressRangeType_EndAddress() {
		return (EAttribute)addressRangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressRangeType_StartAddress() {
		return (EAttribute)addressRangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyDataType() {
		return anyDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyDataType_Any() {
		return (EAttribute)anyDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyDataType_Tool() {
		return (EAttribute)anyDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyDataType_Vendor() {
		return (EAttribute)anyDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyDataType_Version() {
		return (EAttribute)anyDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationElementType() {
		return applicationElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitraryEventTriggeringConstraintType() {
		return arbitraryEventTriggeringConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryEventTriggeringConstraintType_LowerBound() {
		return (EReference)arbitraryEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryEventTriggeringConstraintType_UpperBound() {
		return (EReference)arbitraryEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitraryEventTriggeringType() {
		return arbitraryEventTriggeringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryEventTriggeringType_MinDistance() {
		return (EReference)arbitraryEventTriggeringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryEventTriggeringType_MaxDistance() {
		return (EReference)arbitraryEventTriggeringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutosarOsType() {
		return autosarOsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutosarOsType_KernelPriority() {
		return (EAttribute)autosarOsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanBusType() {
		return canBusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockType() {
		return clockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockType_Tickduration() {
		return (EReference)clockTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockType_MaxAbsTime() {
		return (EAttribute)clockTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeBlockType() {
		return codeBlockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeBlockType_AddressRange() {
		return (EReference)codeBlockTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeBlockType_SymbolRange() {
		return (EReference)codeBlockTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentDataType() {
		return commentDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentDataType_Comment() {
		return (EAttribute)commentDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationElementType() {
		return communicationElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDataType() {
		return customDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomDataType_Data() {
		return (EReference)customDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElementType() {
		return dataElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRangeElementType() {
		return dataRangeElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRangeElementType_AddressRange() {
		return (EReference)dataRangeElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRangeElementType_SymbolRange() {
		return (EReference)dataRangeElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OT1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainElementType() {
		return eventChainElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainElementType_EventChain() {
		return (EReference)eventChainElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainType() {
		return eventChainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainType_StimulusEventReference() {
		return (EReference)eventChainTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventChainType_InterChainEventReferenceId() {
		return (EAttribute)eventChainTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainType_ResponseEventReference() {
		return (EReference)eventChainTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDescriptionType() {
		return eventDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventDescriptionType_EventIdMapping() {
		return (EReference)eventDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventIdMappingType() {
		return eventIdMappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventIdMappingType_EventId() {
		return (EAttribute)eventIdMappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventIdMappingType_EventType() {
		return (EAttribute)eventIdMappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventReferenceElementType() {
		return eventReferenceElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventReferenceElementType_EventReference() {
		return (EReference)eventReferenceElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventReferenceType() {
		return eventReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventReferenceType_ElementRefId() {
		return (EAttribute)eventReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventReferenceType_EventType() {
		return (EAttribute)eventReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTriggeringConstraintType() {
		return eventTriggeringConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventTriggeringConstraintType_EventId() {
		return (EAttribute)eventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTriggeringType() {
		return eventTriggeringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTriggeringType_EventReference() {
		return (EReference)eventTriggeringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionOrderConstraintType() {
		return executionOrderConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionOrderConstraintType_EventChainId() {
		return (EAttribute)executionOrderConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionOrderConstraintType_Type() {
		return (EAttribute)executionOrderConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlexRayBusType() {
		return flexRayBusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameElementType() {
		return frameElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiableElement() {
		return identifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_Id() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptType() {
		return interruptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptType_Priority() {
		return (EAttribute)interruptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptType_Type() {
		return (EAttribute)interruptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyTimingConstraintType() {
		return latencyTimingConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatencyTimingConstraintType_Minimum() {
		return (EReference)latencyTimingConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatencyTimingConstraintType_Maximum() {
		return (EReference)latencyTimingConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatencyTimingConstraintType_EventChainId() {
		return (EAttribute)latencyTimingConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinBusType() {
		return linBusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageType() {
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMostBusType() {
		return mostBusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffsetTimingConstraintType() {
		return offsetTimingConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffsetTimingConstraintType_Minimum() {
		return (EReference)offsetTimingConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffsetTimingConstraintType_Maximum() {
		return (EReference)offsetTimingConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffsetTimingConstraintType_SourceEventId() {
		return (EAttribute)offsetTimingConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffsetTimingConstraintType_TargetEventId() {
		return (EAttribute)offsetTimingConstraintTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsekOsType() {
		return osekOsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsekOsType_KernelPriority() {
		return (EAttribute)osekOsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOT1HexTraceType() {
		return ot1HexTraceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOT1HexTraceType_Data() {
		return (EAttribute)ot1HexTraceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOT1TraceLinkType() {
		return ot1TraceLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOT1TraceLinkType_Link() {
		return (EAttribute)ot1TraceLinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOT1Type() {
		return ot1TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOT1Type_Comments() {
		return (EReference)ot1TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOT1Type_CustomData() {
		return (EReference)ot1TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOT1Type_Tool() {
		return (EAttribute)ot1TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOT1Type_Vendor() {
		return (EAttribute)ot1TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOT1Type_Version() {
		return (EAttribute)ot1TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOT1Type1() {
		return ot1Type1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOT1Type1_SchedulingEntity() {
		return (EReference)ot1Type1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOT1Type1_Version() {
		return (EAttribute)ot1Type1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPduType() {
		return pduTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicEventTriggeringConstraintType() {
		return periodicEventTriggeringConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicEventTriggeringConstraintType_Period() {
		return (EReference)periodicEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicEventTriggeringConstraintType_Jitter() {
		return (EReference)periodicEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicEventTriggeringConstraintType_MinInterArrivalTime() {
		return (EReference)periodicEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosixOsType() {
		return posixOsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessType() {
		return processTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableType() {
		return runnableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulableApplicationElementType() {
		return schedulableApplicationElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingEntityElementType() {
		return schedulingEntityElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingEntityElementType_Element() {
		return (EReference)schedulingEntityElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingEntityElementType_TimingValues() {
		return (EReference)schedulingEntityElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingEntityElementType_TimingConstraints() {
		return (EReference)schedulingEntityElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingEntityElementType_Name() {
		return (EAttribute)schedulingEntityElementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingEntityType() {
		return schedulingEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingEntityType_Clock() {
		return (EReference)schedulingEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingEntityType_EventDescription() {
		return (EReference)schedulingEntityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingEntityType_TracingOverheadContainer() {
		return (EReference)schedulingEntityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingEntityType_Element() {
		return (EReference)schedulingEntityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingEntityType_Traces() {
		return (EReference)schedulingEntityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedulingEntityType_Name() {
		return (EAttribute)schedulingEntityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalType() {
		return signalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicEventTriggeringConstraintType() {
		return sporadicEventTriggeringConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEventTriggeringConstraintType_Period() {
		return (EReference)sporadicEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEventTriggeringConstraintType_Jitter() {
		return (EReference)sporadicEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEventTriggeringConstraintType_MinInterArrivalTime() {
		return (EReference)sporadicEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEventTriggeringConstraintType_MaxInterArrivalTime() {
		return (EReference)sporadicEventTriggeringConstraintTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolRangeType() {
		return symbolRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolRangeType_EndSymbol() {
		return (EAttribute)symbolRangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolRangeType_StartSymbol() {
		return (EAttribute)symbolRangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskType() {
		return taskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Offset() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Period() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Priority() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskType_Type() {
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadType() {
		return threadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadType_Priority() {
		return (EAttribute)threadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRangeElementType() {
		return timeRangeElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRangeElementType_Latency() {
		return (EAttribute)timeRangeElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStampElementType() {
		return timeStampElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeValueType() {
		return timeValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeValueType_Denominator() {
		return (EAttribute)timeValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeValueType_Nominator() {
		return (EAttribute)timeValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeValueType_Unit() {
		return (EAttribute)timeValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingConstraintElementType() {
		return timingConstraintElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingConstraintsType() {
		return timingConstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingConstraintsType_TimingConstraint() {
		return (EReference)timingConstraintsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingInformationConstraintType() {
		return timingInformationConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingInformationConstraintType_Threshold() {
		return (EReference)timingInformationConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingInformationConstraintType_ThresholdType() {
		return (EAttribute)timingInformationConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingInformationConstraintType_TimingValueType() {
		return (EAttribute)timingInformationConstraintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingInformationElementType() {
		return timingInformationElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingInformationElementType_Value() {
		return (EReference)timingInformationElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingInformationElementType_SubType() {
		return (EAttribute)timingInformationElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingInformationElementType_Type() {
		return (EAttribute)timingInformationElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingValueElementType() {
		return timingValueElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingValueElementType_Request() {
		return (EAttribute)timingValueElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingValueElementType_Source() {
		return (EAttribute)timingValueElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingValuesType() {
		return timingValuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingValuesType_TimingValue() {
		return (EReference)timingValuesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceCommentType() {
		return traceCommentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceCommentType_Comment() {
		return (EAttribute)traceCommentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceCommentType_Time1() {
		return (EAttribute)traceCommentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceCommentType_Time2() {
		return (EAttribute)traceCommentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceEntryType() {
		return traceEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceEntryType_Data() {
		return (EAttribute)traceEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceEntryType_ElementRefId() {
		return (EAttribute)traceEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceEntryType_EventId() {
		return (EAttribute)traceEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceEntryType_Time() {
		return (EAttribute)traceEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracesType() {
		return tracesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracesType_OT1TraceLink() {
		return (EReference)tracesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracesType_OT1HexTrace() {
		return (EReference)tracesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracesType_XmlTrace() {
		return (EReference)tracesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracingOverheadContainerType() {
		return tracingOverheadContainerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracingOverheadContainerType_TracingOverhead() {
		return (EReference)tracingOverheadContainerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracingOverheadType() {
		return tracingOverheadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracingOverheadType_Time() {
		return (EReference)tracingOverheadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingOverheadType_EventId() {
		return (EAttribute)tracingOverheadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingOverheadType_Type() {
		return (EAttribute)tracingOverheadTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueElementType() {
		return uniqueElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueElementType_Uuid() {
		return (EAttribute)uniqueElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableType() {
		return variableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_Length() {
		return (EAttribute)variableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualElementType() {
		return virtualElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindowsOsType() {
		return windowsOsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlTraceType() {
		return xmlTraceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlTraceType_TraceEntry() {
		return (EReference)xmlTraceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlTraceType_TraceComment() {
		return (EReference)xmlTraceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventTypeEnum() {
		return eventTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionOrderConstraintTypeEnum() {
		return executionOrderConstraintTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterruptTypeEnum() {
		return interruptTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLatencyTypeEnum() {
		return latencyTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskTypeEnum() {
		return taskTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThresholdTypeEnum() {
		return thresholdTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeBaseEnum() {
		return timeBaseEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingInformationSourceEnum() {
		return timingInformationSourceEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingInformationSubTypeEnum() {
		return timingInformationSubTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingInformationTypeEnum() {
		return timingInformationTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTracingOverheadDescriptionEnum() {
		return tracingOverheadDescriptionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionType() {
		return versionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventTypeEnumObject() {
		return eventTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExecutionOrderConstraintTypeEnumObject() {
		return executionOrderConstraintTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterruptTypeEnumObject() {
		return interruptTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLatencyTypeEnumObject() {
		return latencyTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaskTypeEnumObject() {
		return taskTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThresholdTypeEnumObject() {
		return thresholdTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeBaseEnumObject() {
		return timeBaseEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimingInformationSourceEnumObject() {
		return timingInformationSourceEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimingInformationSubTypeEnumObject() {
		return timingInformationSubTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimingInformationTypeEnumObject() {
		return timingInformationTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTracingOverheadDescriptionEnumObject() {
		return tracingOverheadDescriptionEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionTypeObject() {
		return versionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OT1Factory getOT1Factory() {
		return (OT1Factory)getEFactoryInstance();
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
		addressRangeTypeEClass = createEClass(ADDRESS_RANGE_TYPE);
		createEAttribute(addressRangeTypeEClass, ADDRESS_RANGE_TYPE__END_ADDRESS);
		createEAttribute(addressRangeTypeEClass, ADDRESS_RANGE_TYPE__START_ADDRESS);

		anyDataTypeEClass = createEClass(ANY_DATA_TYPE);
		createEAttribute(anyDataTypeEClass, ANY_DATA_TYPE__ANY);
		createEAttribute(anyDataTypeEClass, ANY_DATA_TYPE__TOOL);
		createEAttribute(anyDataTypeEClass, ANY_DATA_TYPE__VENDOR);
		createEAttribute(anyDataTypeEClass, ANY_DATA_TYPE__VERSION);

		applicationElementTypeEClass = createEClass(APPLICATION_ELEMENT_TYPE);

		arbitraryEventTriggeringConstraintTypeEClass = createEClass(ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE);
		createEReference(arbitraryEventTriggeringConstraintTypeEClass, ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__LOWER_BOUND);
		createEReference(arbitraryEventTriggeringConstraintTypeEClass, ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__UPPER_BOUND);

		arbitraryEventTriggeringTypeEClass = createEClass(ARBITRARY_EVENT_TRIGGERING_TYPE);
		createEReference(arbitraryEventTriggeringTypeEClass, ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE);
		createEReference(arbitraryEventTriggeringTypeEClass, ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE);

		autosarOsTypeEClass = createEClass(AUTOSAR_OS_TYPE);
		createEAttribute(autosarOsTypeEClass, AUTOSAR_OS_TYPE__KERNEL_PRIORITY);

		canBusTypeEClass = createEClass(CAN_BUS_TYPE);

		clockTypeEClass = createEClass(CLOCK_TYPE);
		createEReference(clockTypeEClass, CLOCK_TYPE__TICKDURATION);
		createEAttribute(clockTypeEClass, CLOCK_TYPE__MAX_ABS_TIME);

		codeBlockTypeEClass = createEClass(CODE_BLOCK_TYPE);
		createEReference(codeBlockTypeEClass, CODE_BLOCK_TYPE__ADDRESS_RANGE);
		createEReference(codeBlockTypeEClass, CODE_BLOCK_TYPE__SYMBOL_RANGE);

		commentDataTypeEClass = createEClass(COMMENT_DATA_TYPE);
		createEAttribute(commentDataTypeEClass, COMMENT_DATA_TYPE__COMMENT);

		communicationElementTypeEClass = createEClass(COMMUNICATION_ELEMENT_TYPE);

		customDataTypeEClass = createEClass(CUSTOM_DATA_TYPE);
		createEReference(customDataTypeEClass, CUSTOM_DATA_TYPE__DATA);

		dataElementTypeEClass = createEClass(DATA_ELEMENT_TYPE);

		dataRangeElementTypeEClass = createEClass(DATA_RANGE_ELEMENT_TYPE);
		createEReference(dataRangeElementTypeEClass, DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE);
		createEReference(dataRangeElementTypeEClass, DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OT1);

		elementTypeEClass = createEClass(ELEMENT_TYPE);

		eventChainElementTypeEClass = createEClass(EVENT_CHAIN_ELEMENT_TYPE);
		createEReference(eventChainElementTypeEClass, EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN);

		eventChainTypeEClass = createEClass(EVENT_CHAIN_TYPE);
		createEReference(eventChainTypeEClass, EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE);
		createEAttribute(eventChainTypeEClass, EVENT_CHAIN_TYPE__INTER_CHAIN_EVENT_REFERENCE_ID);
		createEReference(eventChainTypeEClass, EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE);

		eventDescriptionTypeEClass = createEClass(EVENT_DESCRIPTION_TYPE);
		createEReference(eventDescriptionTypeEClass, EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING);

		eventIdMappingTypeEClass = createEClass(EVENT_ID_MAPPING_TYPE);
		createEAttribute(eventIdMappingTypeEClass, EVENT_ID_MAPPING_TYPE__EVENT_ID);
		createEAttribute(eventIdMappingTypeEClass, EVENT_ID_MAPPING_TYPE__EVENT_TYPE);

		eventReferenceElementTypeEClass = createEClass(EVENT_REFERENCE_ELEMENT_TYPE);
		createEReference(eventReferenceElementTypeEClass, EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE);

		eventReferenceTypeEClass = createEClass(EVENT_REFERENCE_TYPE);
		createEAttribute(eventReferenceTypeEClass, EVENT_REFERENCE_TYPE__ELEMENT_REF_ID);
		createEAttribute(eventReferenceTypeEClass, EVENT_REFERENCE_TYPE__EVENT_TYPE);

		eventTriggeringConstraintTypeEClass = createEClass(EVENT_TRIGGERING_CONSTRAINT_TYPE);
		createEAttribute(eventTriggeringConstraintTypeEClass, EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID);

		eventTriggeringTypeEClass = createEClass(EVENT_TRIGGERING_TYPE);
		createEReference(eventTriggeringTypeEClass, EVENT_TRIGGERING_TYPE__EVENT_REFERENCE);

		executionOrderConstraintTypeEClass = createEClass(EXECUTION_ORDER_CONSTRAINT_TYPE);
		createEAttribute(executionOrderConstraintTypeEClass, EXECUTION_ORDER_CONSTRAINT_TYPE__EVENT_CHAIN_ID);
		createEAttribute(executionOrderConstraintTypeEClass, EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE);

		flexRayBusTypeEClass = createEClass(FLEX_RAY_BUS_TYPE);

		frameElementTypeEClass = createEClass(FRAME_ELEMENT_TYPE);

		functionTypeEClass = createEClass(FUNCTION_TYPE);

		identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__ID);

		interruptTypeEClass = createEClass(INTERRUPT_TYPE);
		createEAttribute(interruptTypeEClass, INTERRUPT_TYPE__PRIORITY);
		createEAttribute(interruptTypeEClass, INTERRUPT_TYPE__TYPE);

		latencyTimingConstraintTypeEClass = createEClass(LATENCY_TIMING_CONSTRAINT_TYPE);
		createEReference(latencyTimingConstraintTypeEClass, LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM);
		createEReference(latencyTimingConstraintTypeEClass, LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM);
		createEAttribute(latencyTimingConstraintTypeEClass, LATENCY_TIMING_CONSTRAINT_TYPE__EVENT_CHAIN_ID);

		linBusTypeEClass = createEClass(LIN_BUS_TYPE);

		messageTypeEClass = createEClass(MESSAGE_TYPE);

		mostBusTypeEClass = createEClass(MOST_BUS_TYPE);

		offsetTimingConstraintTypeEClass = createEClass(OFFSET_TIMING_CONSTRAINT_TYPE);
		createEReference(offsetTimingConstraintTypeEClass, OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM);
		createEReference(offsetTimingConstraintTypeEClass, OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM);
		createEAttribute(offsetTimingConstraintTypeEClass, OFFSET_TIMING_CONSTRAINT_TYPE__SOURCE_EVENT_ID);
		createEAttribute(offsetTimingConstraintTypeEClass, OFFSET_TIMING_CONSTRAINT_TYPE__TARGET_EVENT_ID);

		osekOsTypeEClass = createEClass(OSEK_OS_TYPE);
		createEAttribute(osekOsTypeEClass, OSEK_OS_TYPE__KERNEL_PRIORITY);

		ot1HexTraceTypeEClass = createEClass(OT1_HEX_TRACE_TYPE);
		createEAttribute(ot1HexTraceTypeEClass, OT1_HEX_TRACE_TYPE__DATA);

		ot1TraceLinkTypeEClass = createEClass(OT1_TRACE_LINK_TYPE);
		createEAttribute(ot1TraceLinkTypeEClass, OT1_TRACE_LINK_TYPE__LINK);

		ot1TypeEClass = createEClass(OT1_TYPE);
		createEReference(ot1TypeEClass, OT1_TYPE__COMMENTS);
		createEReference(ot1TypeEClass, OT1_TYPE__CUSTOM_DATA);
		createEAttribute(ot1TypeEClass, OT1_TYPE__TOOL);
		createEAttribute(ot1TypeEClass, OT1_TYPE__VENDOR);
		createEAttribute(ot1TypeEClass, OT1_TYPE__VERSION);

		ot1Type1EClass = createEClass(OT1_TYPE1);
		createEReference(ot1Type1EClass, OT1_TYPE1__SCHEDULING_ENTITY);
		createEAttribute(ot1Type1EClass, OT1_TYPE1__VERSION);

		pduTypeEClass = createEClass(PDU_TYPE);

		periodicEventTriggeringConstraintTypeEClass = createEClass(PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE);
		createEReference(periodicEventTriggeringConstraintTypeEClass, PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD);
		createEReference(periodicEventTriggeringConstraintTypeEClass, PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER);
		createEReference(periodicEventTriggeringConstraintTypeEClass, PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME);

		posixOsTypeEClass = createEClass(POSIX_OS_TYPE);

		processTypeEClass = createEClass(PROCESS_TYPE);

		runnableTypeEClass = createEClass(RUNNABLE_TYPE);

		schedulableApplicationElementTypeEClass = createEClass(SCHEDULABLE_APPLICATION_ELEMENT_TYPE);

		schedulingEntityElementTypeEClass = createEClass(SCHEDULING_ENTITY_ELEMENT_TYPE);
		createEReference(schedulingEntityElementTypeEClass, SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT);
		createEReference(schedulingEntityElementTypeEClass, SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES);
		createEReference(schedulingEntityElementTypeEClass, SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS);
		createEAttribute(schedulingEntityElementTypeEClass, SCHEDULING_ENTITY_ELEMENT_TYPE__NAME);

		schedulingEntityTypeEClass = createEClass(SCHEDULING_ENTITY_TYPE);
		createEReference(schedulingEntityTypeEClass, SCHEDULING_ENTITY_TYPE__CLOCK);
		createEReference(schedulingEntityTypeEClass, SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION);
		createEReference(schedulingEntityTypeEClass, SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER);
		createEReference(schedulingEntityTypeEClass, SCHEDULING_ENTITY_TYPE__ELEMENT);
		createEReference(schedulingEntityTypeEClass, SCHEDULING_ENTITY_TYPE__TRACES);
		createEAttribute(schedulingEntityTypeEClass, SCHEDULING_ENTITY_TYPE__NAME);

		signalTypeEClass = createEClass(SIGNAL_TYPE);

		sporadicEventTriggeringConstraintTypeEClass = createEClass(SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE);
		createEReference(sporadicEventTriggeringConstraintTypeEClass, SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD);
		createEReference(sporadicEventTriggeringConstraintTypeEClass, SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER);
		createEReference(sporadicEventTriggeringConstraintTypeEClass, SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME);
		createEReference(sporadicEventTriggeringConstraintTypeEClass, SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME);

		symbolRangeTypeEClass = createEClass(SYMBOL_RANGE_TYPE);
		createEAttribute(symbolRangeTypeEClass, SYMBOL_RANGE_TYPE__END_SYMBOL);
		createEAttribute(symbolRangeTypeEClass, SYMBOL_RANGE_TYPE__START_SYMBOL);

		taskTypeEClass = createEClass(TASK_TYPE);
		createEAttribute(taskTypeEClass, TASK_TYPE__OFFSET);
		createEAttribute(taskTypeEClass, TASK_TYPE__PERIOD);
		createEAttribute(taskTypeEClass, TASK_TYPE__PRIORITY);
		createEAttribute(taskTypeEClass, TASK_TYPE__TYPE);

		threadTypeEClass = createEClass(THREAD_TYPE);
		createEAttribute(threadTypeEClass, THREAD_TYPE__PRIORITY);

		timeRangeElementTypeEClass = createEClass(TIME_RANGE_ELEMENT_TYPE);
		createEAttribute(timeRangeElementTypeEClass, TIME_RANGE_ELEMENT_TYPE__LATENCY);

		timeStampElementTypeEClass = createEClass(TIME_STAMP_ELEMENT_TYPE);

		timeValueTypeEClass = createEClass(TIME_VALUE_TYPE);
		createEAttribute(timeValueTypeEClass, TIME_VALUE_TYPE__DENOMINATOR);
		createEAttribute(timeValueTypeEClass, TIME_VALUE_TYPE__NOMINATOR);
		createEAttribute(timeValueTypeEClass, TIME_VALUE_TYPE__UNIT);

		timingConstraintElementTypeEClass = createEClass(TIMING_CONSTRAINT_ELEMENT_TYPE);

		timingConstraintsTypeEClass = createEClass(TIMING_CONSTRAINTS_TYPE);
		createEReference(timingConstraintsTypeEClass, TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT);

		timingInformationConstraintTypeEClass = createEClass(TIMING_INFORMATION_CONSTRAINT_TYPE);
		createEReference(timingInformationConstraintTypeEClass, TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD);
		createEAttribute(timingInformationConstraintTypeEClass, TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE);
		createEAttribute(timingInformationConstraintTypeEClass, TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE);

		timingInformationElementTypeEClass = createEClass(TIMING_INFORMATION_ELEMENT_TYPE);
		createEReference(timingInformationElementTypeEClass, TIMING_INFORMATION_ELEMENT_TYPE__VALUE);
		createEAttribute(timingInformationElementTypeEClass, TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE);
		createEAttribute(timingInformationElementTypeEClass, TIMING_INFORMATION_ELEMENT_TYPE__TYPE);

		timingValueElementTypeEClass = createEClass(TIMING_VALUE_ELEMENT_TYPE);
		createEAttribute(timingValueElementTypeEClass, TIMING_VALUE_ELEMENT_TYPE__REQUEST);
		createEAttribute(timingValueElementTypeEClass, TIMING_VALUE_ELEMENT_TYPE__SOURCE);

		timingValuesTypeEClass = createEClass(TIMING_VALUES_TYPE);
		createEReference(timingValuesTypeEClass, TIMING_VALUES_TYPE__TIMING_VALUE);

		traceCommentTypeEClass = createEClass(TRACE_COMMENT_TYPE);
		createEAttribute(traceCommentTypeEClass, TRACE_COMMENT_TYPE__COMMENT);
		createEAttribute(traceCommentTypeEClass, TRACE_COMMENT_TYPE__TIME1);
		createEAttribute(traceCommentTypeEClass, TRACE_COMMENT_TYPE__TIME2);

		traceEntryTypeEClass = createEClass(TRACE_ENTRY_TYPE);
		createEAttribute(traceEntryTypeEClass, TRACE_ENTRY_TYPE__DATA);
		createEAttribute(traceEntryTypeEClass, TRACE_ENTRY_TYPE__ELEMENT_REF_ID);
		createEAttribute(traceEntryTypeEClass, TRACE_ENTRY_TYPE__EVENT_ID);
		createEAttribute(traceEntryTypeEClass, TRACE_ENTRY_TYPE__TIME);

		tracesTypeEClass = createEClass(TRACES_TYPE);
		createEReference(tracesTypeEClass, TRACES_TYPE__OT1_TRACE_LINK);
		createEReference(tracesTypeEClass, TRACES_TYPE__OT1_HEX_TRACE);
		createEReference(tracesTypeEClass, TRACES_TYPE__XML_TRACE);

		tracingOverheadContainerTypeEClass = createEClass(TRACING_OVERHEAD_CONTAINER_TYPE);
		createEReference(tracingOverheadContainerTypeEClass, TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD);

		tracingOverheadTypeEClass = createEClass(TRACING_OVERHEAD_TYPE);
		createEReference(tracingOverheadTypeEClass, TRACING_OVERHEAD_TYPE__TIME);
		createEAttribute(tracingOverheadTypeEClass, TRACING_OVERHEAD_TYPE__EVENT_ID);
		createEAttribute(tracingOverheadTypeEClass, TRACING_OVERHEAD_TYPE__TYPE);

		uniqueElementTypeEClass = createEClass(UNIQUE_ELEMENT_TYPE);
		createEAttribute(uniqueElementTypeEClass, UNIQUE_ELEMENT_TYPE__UUID);

		variableTypeEClass = createEClass(VARIABLE_TYPE);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__LENGTH);

		virtualElementTypeEClass = createEClass(VIRTUAL_ELEMENT_TYPE);

		windowsOsTypeEClass = createEClass(WINDOWS_OS_TYPE);

		xmlTraceTypeEClass = createEClass(XML_TRACE_TYPE);
		createEReference(xmlTraceTypeEClass, XML_TRACE_TYPE__TRACE_ENTRY);
		createEReference(xmlTraceTypeEClass, XML_TRACE_TYPE__TRACE_COMMENT);

		// Create enums
		eventTypeEnumEEnum = createEEnum(EVENT_TYPE_ENUM);
		executionOrderConstraintTypeEnumEEnum = createEEnum(EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM);
		interruptTypeEnumEEnum = createEEnum(INTERRUPT_TYPE_ENUM);
		latencyTypeEnumEEnum = createEEnum(LATENCY_TYPE_ENUM);
		taskTypeEnumEEnum = createEEnum(TASK_TYPE_ENUM);
		thresholdTypeEnumEEnum = createEEnum(THRESHOLD_TYPE_ENUM);
		timeBaseEnumEEnum = createEEnum(TIME_BASE_ENUM);
		timingInformationSourceEnumEEnum = createEEnum(TIMING_INFORMATION_SOURCE_ENUM);
		timingInformationSubTypeEnumEEnum = createEEnum(TIMING_INFORMATION_SUB_TYPE_ENUM);
		timingInformationTypeEnumEEnum = createEEnum(TIMING_INFORMATION_TYPE_ENUM);
		tracingOverheadDescriptionEnumEEnum = createEEnum(TRACING_OVERHEAD_DESCRIPTION_ENUM);
		versionTypeEEnum = createEEnum(VERSION_TYPE);

		// Create data types
		eventTypeEnumObjectEDataType = createEDataType(EVENT_TYPE_ENUM_OBJECT);
		executionOrderConstraintTypeEnumObjectEDataType = createEDataType(EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM_OBJECT);
		interruptTypeEnumObjectEDataType = createEDataType(INTERRUPT_TYPE_ENUM_OBJECT);
		latencyTypeEnumObjectEDataType = createEDataType(LATENCY_TYPE_ENUM_OBJECT);
		taskTypeEnumObjectEDataType = createEDataType(TASK_TYPE_ENUM_OBJECT);
		thresholdTypeEnumObjectEDataType = createEDataType(THRESHOLD_TYPE_ENUM_OBJECT);
		timeBaseEnumObjectEDataType = createEDataType(TIME_BASE_ENUM_OBJECT);
		timingInformationSourceEnumObjectEDataType = createEDataType(TIMING_INFORMATION_SOURCE_ENUM_OBJECT);
		timingInformationSubTypeEnumObjectEDataType = createEDataType(TIMING_INFORMATION_SUB_TYPE_ENUM_OBJECT);
		timingInformationTypeEnumObjectEDataType = createEDataType(TIMING_INFORMATION_TYPE_ENUM_OBJECT);
		tracingOverheadDescriptionEnumObjectEDataType = createEDataType(TRACING_OVERHEAD_DESCRIPTION_ENUM_OBJECT);
		versionTypeObjectEDataType = createEDataType(VERSION_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationElementTypeEClass.getESuperTypes().add(this.getSchedulingEntityElementType());
		arbitraryEventTriggeringConstraintTypeEClass.getESuperTypes().add(this.getEventTriggeringConstraintType());
		arbitraryEventTriggeringTypeEClass.getESuperTypes().add(this.getEventTriggeringType());
		autosarOsTypeEClass.getESuperTypes().add(this.getSchedulingEntityType());
		canBusTypeEClass.getESuperTypes().add(this.getSchedulingEntityType());
		codeBlockTypeEClass.getESuperTypes().add(this.getApplicationElementType());
		communicationElementTypeEClass.getESuperTypes().add(this.getSchedulingEntityElementType());
		dataElementTypeEClass.getESuperTypes().add(this.getSchedulingEntityElementType());
		dataRangeElementTypeEClass.getESuperTypes().add(this.getDataElementType());
		elementTypeEClass.getESuperTypes().add(this.getOT1Type());
		eventChainElementTypeEClass.getESuperTypes().add(this.getTimeRangeElementType());
		eventChainTypeEClass.getESuperTypes().add(this.getIdentifiableElement());
		eventDescriptionTypeEClass.getESuperTypes().add(this.getOT1Type());
		eventReferenceElementTypeEClass.getESuperTypes().add(this.getTimeStampElementType());
		eventReferenceTypeEClass.getESuperTypes().add(this.getOT1Type());
		eventTriggeringConstraintTypeEClass.getESuperTypes().add(this.getTimingConstraintElementType());
		eventTriggeringTypeEClass.getESuperTypes().add(this.getTimingValueElementType());
		executionOrderConstraintTypeEClass.getESuperTypes().add(this.getTimingConstraintElementType());
		flexRayBusTypeEClass.getESuperTypes().add(this.getSchedulingEntityType());
		frameElementTypeEClass.getESuperTypes().add(this.getCommunicationElementType());
		functionTypeEClass.getESuperTypes().add(this.getApplicationElementType());
		identifiableElementEClass.getESuperTypes().add(this.getElementType());
		interruptTypeEClass.getESuperTypes().add(this.getSchedulableApplicationElementType());
		latencyTimingConstraintTypeEClass.getESuperTypes().add(this.getTimingConstraintElementType());
		linBusTypeEClass.getESuperTypes().add(this.getSchedulingEntityType());
		messageTypeEClass.getESuperTypes().add(this.getCommunicationElementType());
		mostBusTypeEClass.getESuperTypes().add(this.getSchedulingEntityType());
		offsetTimingConstraintTypeEClass.getESuperTypes().add(this.getTimingConstraintElementType());
		osekOsTypeEClass.getESuperTypes().add(this.getSchedulingEntityType());
		ot1HexTraceTypeEClass.getESuperTypes().add(this.getElementType());
		ot1TraceLinkTypeEClass.getESuperTypes().add(this.getElementType());
		pduTypeEClass.getESuperTypes().add(this.getCommunicationElementType());
		periodicEventTriggeringConstraintTypeEClass.getESuperTypes().add(this.getEventTriggeringConstraintType());
		posixOsTypeEClass.getESuperTypes().add(this.getSchedulingEntityType());
		processTypeEClass.getESuperTypes().add(this.getSchedulableApplicationElementType());
		runnableTypeEClass.getESuperTypes().add(this.getApplicationElementType());
		schedulableApplicationElementTypeEClass.getESuperTypes().add(this.getApplicationElementType());
		schedulingEntityElementTypeEClass.getESuperTypes().add(this.getIdentifiableElement());
		schedulingEntityTypeEClass.getESuperTypes().add(this.getUniqueElementType());
		signalTypeEClass.getESuperTypes().add(this.getCommunicationElementType());
		sporadicEventTriggeringConstraintTypeEClass.getESuperTypes().add(this.getEventTriggeringConstraintType());
		taskTypeEClass.getESuperTypes().add(this.getSchedulableApplicationElementType());
		threadTypeEClass.getESuperTypes().add(this.getSchedulableApplicationElementType());
		timeRangeElementTypeEClass.getESuperTypes().add(this.getVirtualElementType());
		timeStampElementTypeEClass.getESuperTypes().add(this.getVirtualElementType());
		timingConstraintElementTypeEClass.getESuperTypes().add(this.getElementType());
		timingInformationConstraintTypeEClass.getESuperTypes().add(this.getTimingConstraintElementType());
		timingInformationElementTypeEClass.getESuperTypes().add(this.getTimingValueElementType());
		timingValueElementTypeEClass.getESuperTypes().add(this.getElementType());
		traceCommentTypeEClass.getESuperTypes().add(this.getOT1Type());
		tracingOverheadContainerTypeEClass.getESuperTypes().add(this.getOT1Type());
		tracingOverheadTypeEClass.getESuperTypes().add(this.getOT1Type());
		uniqueElementTypeEClass.getESuperTypes().add(this.getElementType());
		variableTypeEClass.getESuperTypes().add(this.getDataElementType());
		virtualElementTypeEClass.getESuperTypes().add(this.getSchedulingEntityElementType());
		windowsOsTypeEClass.getESuperTypes().add(this.getSchedulingEntityType());
		xmlTraceTypeEClass.getESuperTypes().add(this.getUniqueElementType());

		// Initialize classes and features; add operations and parameters
		initEClass(addressRangeTypeEClass, AddressRangeType.class, "AddressRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressRangeType_EndAddress(), theXMLTypePackage.getUnsignedLong(), "endAddress", null, 1, 1, AddressRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressRangeType_StartAddress(), theXMLTypePackage.getUnsignedLong(), "startAddress", null, 1, 1, AddressRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyDataTypeEClass, AnyDataType.class, "AnyDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyDataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AnyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyDataType_Tool(), theXMLTypePackage.getString(), "tool", null, 0, 1, AnyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyDataType_Vendor(), theXMLTypePackage.getString(), "vendor", null, 0, 1, AnyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyDataType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, AnyDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationElementTypeEClass, ApplicationElementType.class, "ApplicationElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arbitraryEventTriggeringConstraintTypeEClass, ArbitraryEventTriggeringConstraintType.class, "ArbitraryEventTriggeringConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArbitraryEventTriggeringConstraintType_LowerBound(), this.getTimeValueType(), null, "lowerBound", null, 1, 1, ArbitraryEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArbitraryEventTriggeringConstraintType_UpperBound(), this.getTimeValueType(), null, "upperBound", null, 1, 1, ArbitraryEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arbitraryEventTriggeringTypeEClass, ArbitraryEventTriggeringType.class, "ArbitraryEventTriggeringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArbitraryEventTriggeringType_MinDistance(), this.getTimeValueType(), null, "minDistance", null, 1, -1, ArbitraryEventTriggeringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArbitraryEventTriggeringType_MaxDistance(), this.getTimeValueType(), null, "maxDistance", null, 1, -1, ArbitraryEventTriggeringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autosarOsTypeEClass, AutosarOsType.class, "AutosarOsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutosarOsType_KernelPriority(), theXMLTypePackage.getUnsignedInt(), "kernelPriority", null, 0, 1, AutosarOsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canBusTypeEClass, CanBusType.class, "CanBusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockTypeEClass, ClockType.class, "ClockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockType_Tickduration(), this.getTimeValueType(), null, "tickduration", null, 1, 1, ClockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockType_MaxAbsTime(), theXMLTypePackage.getUnsignedLong(), "maxAbsTime", null, 1, 1, ClockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeBlockTypeEClass, CodeBlockType.class, "CodeBlockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeBlockType_AddressRange(), this.getAddressRangeType(), null, "addressRange", null, 0, 1, CodeBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeBlockType_SymbolRange(), this.getSymbolRangeType(), null, "symbolRange", null, 0, 1, CodeBlockType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentDataTypeEClass, CommentDataType.class, "CommentDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentDataType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, -1, CommentDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationElementTypeEClass, CommunicationElementType.class, "CommunicationElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customDataTypeEClass, CustomDataType.class, "CustomDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomDataType_Data(), this.getAnyDataType(), null, "data", null, 0, -1, CustomDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataElementTypeEClass, DataElementType.class, "DataElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataRangeElementTypeEClass, DataRangeElementType.class, "DataRangeElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRangeElementType_AddressRange(), this.getAddressRangeType(), null, "addressRange", null, 0, 1, DataRangeElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRangeElementType_SymbolRange(), this.getSymbolRangeType(), null, "symbolRange", null, 0, 1, DataRangeElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OT1(), this.getOT1Type1(), null, "oT1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventChainElementTypeEClass, EventChainElementType.class, "EventChainElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainElementType_EventChain(), this.getEventChainType(), null, "eventChain", null, 1, 1, EventChainElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainTypeEClass, EventChainType.class, "EventChainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainType_StimulusEventReference(), this.getEventReferenceType(), null, "stimulusEventReference", null, 1, 1, EventChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventChainType_InterChainEventReferenceId(), theXMLTypePackage.getUnsignedLong(), "interChainEventReferenceId", null, 0, -1, EventChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChainType_ResponseEventReference(), this.getEventReferenceType(), null, "responseEventReference", null, 1, 1, EventChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDescriptionTypeEClass, EventDescriptionType.class, "EventDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventDescriptionType_EventIdMapping(), this.getEventIdMappingType(), null, "eventIdMapping", null, 0, -1, EventDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventIdMappingTypeEClass, EventIdMappingType.class, "EventIdMappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventIdMappingType_EventId(), theXMLTypePackage.getUnsignedLong(), "eventId", null, 1, 1, EventIdMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventIdMappingType_EventType(), this.getEventTypeEnum(), "eventType", null, 1, 1, EventIdMappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventReferenceElementTypeEClass, EventReferenceElementType.class, "EventReferenceElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventReferenceElementType_EventReference(), this.getEventReferenceType(), null, "eventReference", null, 1, 1, EventReferenceElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventReferenceTypeEClass, EventReferenceType.class, "EventReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventReferenceType_ElementRefId(), theXMLTypePackage.getUnsignedLong(), "elementRefId", null, 1, 1, EventReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventReferenceType_EventType(), this.getEventTypeEnum(), "eventType", null, 1, 1, EventReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTriggeringConstraintTypeEClass, EventTriggeringConstraintType.class, "EventTriggeringConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventTriggeringConstraintType_EventId(), theXMLTypePackage.getUnsignedLong(), "eventId", null, 1, 1, EventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTriggeringTypeEClass, EventTriggeringType.class, "EventTriggeringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventTriggeringType_EventReference(), this.getEventReferenceType(), null, "eventReference", null, 1, 1, EventTriggeringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionOrderConstraintTypeEClass, ExecutionOrderConstraintType.class, "ExecutionOrderConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionOrderConstraintType_EventChainId(), theXMLTypePackage.getUnsignedLong(), "eventChainId", null, 1, 1, ExecutionOrderConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionOrderConstraintType_Type(), this.getExecutionOrderConstraintTypeEnum(), "type", null, 1, 1, ExecutionOrderConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flexRayBusTypeEClass, FlexRayBusType.class, "FlexRayBusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frameElementTypeEClass, FrameElementType.class, "FrameElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableElement_Id(), theXMLTypePackage.getUnsignedLong(), "id", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptTypeEClass, InterruptType.class, "InterruptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterruptType_Priority(), theXMLTypePackage.getUnsignedInt(), "priority", null, 0, 1, InterruptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterruptType_Type(), this.getInterruptTypeEnum(), "type", null, 0, 1, InterruptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyTimingConstraintTypeEClass, LatencyTimingConstraintType.class, "LatencyTimingConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLatencyTimingConstraintType_Minimum(), this.getTimeValueType(), null, "minimum", null, 1, 1, LatencyTimingConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLatencyTimingConstraintType_Maximum(), this.getTimeValueType(), null, "maximum", null, 1, 1, LatencyTimingConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatencyTimingConstraintType_EventChainId(), theXMLTypePackage.getUnsignedLong(), "eventChainId", null, 1, 1, LatencyTimingConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linBusTypeEClass, LinBusType.class, "LinBusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mostBusTypeEClass, MostBusType.class, "MostBusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(offsetTimingConstraintTypeEClass, OffsetTimingConstraintType.class, "OffsetTimingConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffsetTimingConstraintType_Minimum(), this.getTimeValueType(), null, "minimum", null, 1, 1, OffsetTimingConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffsetTimingConstraintType_Maximum(), this.getTimeValueType(), null, "maximum", null, 1, 1, OffsetTimingConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffsetTimingConstraintType_SourceEventId(), theXMLTypePackage.getUnsignedLong(), "sourceEventId", null, 1, 1, OffsetTimingConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffsetTimingConstraintType_TargetEventId(), theXMLTypePackage.getUnsignedLong(), "targetEventId", null, 1, 1, OffsetTimingConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osekOsTypeEClass, OsekOsType.class, "OsekOsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsekOsType_KernelPriority(), theXMLTypePackage.getUnsignedInt(), "kernelPriority", null, 0, 1, OsekOsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ot1HexTraceTypeEClass, OT1HexTraceType.class, "OT1HexTraceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOT1HexTraceType_Data(), theXMLTypePackage.getString(), "data", null, 0, -1, OT1HexTraceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ot1TraceLinkTypeEClass, OT1TraceLinkType.class, "OT1TraceLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOT1TraceLinkType_Link(), theXMLTypePackage.getAnyURI(), "link", null, 1, 1, OT1TraceLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ot1TypeEClass, OT1Type.class, "OT1Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOT1Type_Comments(), this.getCommentDataType(), null, "comments", null, 0, 1, OT1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOT1Type_CustomData(), this.getCustomDataType(), null, "customData", null, 0, 1, OT1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOT1Type_Tool(), theXMLTypePackage.getString(), "tool", null, 0, 1, OT1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOT1Type_Vendor(), theXMLTypePackage.getString(), "vendor", null, 0, 1, OT1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOT1Type_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, OT1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ot1Type1EClass, OT1Type1.class, "OT1Type1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOT1Type1_SchedulingEntity(), this.getSchedulingEntityType(), null, "schedulingEntity", null, 0, -1, OT1Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOT1Type1_Version(), this.getVersionType(), "version", null, 1, 1, OT1Type1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pduTypeEClass, PduType.class, "PduType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(periodicEventTriggeringConstraintTypeEClass, PeriodicEventTriggeringConstraintType.class, "PeriodicEventTriggeringConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicEventTriggeringConstraintType_Period(), this.getTimeValueType(), null, "period", null, 1, 1, PeriodicEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicEventTriggeringConstraintType_Jitter(), this.getTimeValueType(), null, "jitter", null, 1, 1, PeriodicEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicEventTriggeringConstraintType_MinInterArrivalTime(), this.getTimeValueType(), null, "minInterArrivalTime", null, 1, 1, PeriodicEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(posixOsTypeEClass, PosixOsType.class, "PosixOsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processTypeEClass, ProcessType.class, "ProcessType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runnableTypeEClass, RunnableType.class, "RunnableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schedulableApplicationElementTypeEClass, SchedulableApplicationElementType.class, "SchedulableApplicationElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schedulingEntityElementTypeEClass, SchedulingEntityElementType.class, "SchedulingEntityElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulingEntityElementType_Element(), this.getSchedulingEntityElementType(), null, "element", null, 0, -1, SchedulingEntityElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingEntityElementType_TimingValues(), this.getTimingValuesType(), null, "timingValues", null, 1, 1, SchedulingEntityElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingEntityElementType_TimingConstraints(), this.getTimingConstraintsType(), null, "timingConstraints", null, 1, 1, SchedulingEntityElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulingEntityElementType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SchedulingEntityElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingEntityTypeEClass, SchedulingEntityType.class, "SchedulingEntityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulingEntityType_Clock(), this.getClockType(), null, "clock", null, 1, 1, SchedulingEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingEntityType_EventDescription(), this.getEventDescriptionType(), null, "eventDescription", null, 1, 1, SchedulingEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingEntityType_TracingOverheadContainer(), this.getTracingOverheadContainerType(), null, "tracingOverheadContainer", null, 0, -1, SchedulingEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingEntityType_Element(), this.getSchedulingEntityElementType(), null, "element", null, 0, -1, SchedulingEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingEntityType_Traces(), this.getTracesType(), null, "traces", null, 0, 1, SchedulingEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedulingEntityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SchedulingEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalTypeEClass, SignalType.class, "SignalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sporadicEventTriggeringConstraintTypeEClass, SporadicEventTriggeringConstraintType.class, "SporadicEventTriggeringConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSporadicEventTriggeringConstraintType_Period(), this.getTimeValueType(), null, "period", null, 1, 1, SporadicEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicEventTriggeringConstraintType_Jitter(), this.getTimeValueType(), null, "jitter", null, 1, 1, SporadicEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicEventTriggeringConstraintType_MinInterArrivalTime(), this.getTimeValueType(), null, "minInterArrivalTime", null, 1, 1, SporadicEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicEventTriggeringConstraintType_MaxInterArrivalTime(), this.getTimeValueType(), null, "maxInterArrivalTime", null, 1, 1, SporadicEventTriggeringConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolRangeTypeEClass, SymbolRangeType.class, "SymbolRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolRangeType_EndSymbol(), theXMLTypePackage.getString(), "endSymbol", null, 1, 1, SymbolRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbolRangeType_StartSymbol(), theXMLTypePackage.getString(), "startSymbol", null, 1, 1, SymbolRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskType_Offset(), theXMLTypePackage.getUnsignedInt(), "offset", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Period(), theXMLTypePackage.getUnsignedInt(), "period", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Priority(), theXMLTypePackage.getUnsignedInt(), "priority", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskType_Type(), this.getTaskTypeEnum(), "type", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threadTypeEClass, ThreadType.class, "ThreadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreadType_Priority(), theXMLTypePackage.getUnsignedInt(), "priority", null, 0, 1, ThreadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRangeElementTypeEClass, TimeRangeElementType.class, "TimeRangeElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRangeElementType_Latency(), this.getLatencyTypeEnum(), "latency", null, 0, 1, TimeRangeElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeStampElementTypeEClass, TimeStampElementType.class, "TimeStampElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeValueTypeEClass, TimeValueType.class, "TimeValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeValueType_Denominator(), theXMLTypePackage.getUnsignedLong(), "denominator", null, 1, 1, TimeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeValueType_Nominator(), theXMLTypePackage.getUnsignedLong(), "nominator", null, 1, 1, TimeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeValueType_Unit(), this.getTimeBaseEnum(), "unit", null, 1, 1, TimeValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingConstraintElementTypeEClass, TimingConstraintElementType.class, "TimingConstraintElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timingConstraintsTypeEClass, TimingConstraintsType.class, "TimingConstraintsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingConstraintsType_TimingConstraint(), this.getTimingConstraintElementType(), null, "timingConstraint", null, 0, -1, TimingConstraintsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingInformationConstraintTypeEClass, TimingInformationConstraintType.class, "TimingInformationConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingInformationConstraintType_Threshold(), this.getTimeValueType(), null, "threshold", null, 1, 1, TimingInformationConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingInformationConstraintType_ThresholdType(), this.getThresholdTypeEnum(), "thresholdType", null, 1, 1, TimingInformationConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingInformationConstraintType_TimingValueType(), this.getTimingInformationTypeEnum(), "timingValueType", null, 1, 1, TimingInformationConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingInformationElementTypeEClass, TimingInformationElementType.class, "TimingInformationElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingInformationElementType_Value(), this.getTimeValueType(), null, "value", null, 0, 1, TimingInformationElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingInformationElementType_SubType(), this.getTimingInformationSubTypeEnum(), "subType", null, 1, 1, TimingInformationElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingInformationElementType_Type(), this.getTimingInformationTypeEnum(), "type", null, 1, 1, TimingInformationElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingValueElementTypeEClass, TimingValueElementType.class, "TimingValueElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimingValueElementType_Request(), theXMLTypePackage.getBoolean(), "request", null, 0, 1, TimingValueElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingValueElementType_Source(), this.getTimingInformationSourceEnum(), "source", null, 1, 1, TimingValueElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingValuesTypeEClass, TimingValuesType.class, "TimingValuesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingValuesType_TimingValue(), this.getTimingValueElementType(), null, "timingValue", null, 0, -1, TimingValuesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceCommentTypeEClass, TraceCommentType.class, "TraceCommentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceCommentType_Comment(), theXMLTypePackage.getString(), "comment", null, 1, 1, TraceCommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceCommentType_Time1(), theXMLTypePackage.getUnsignedLong(), "time1", null, 0, 1, TraceCommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceCommentType_Time2(), theXMLTypePackage.getUnsignedLong(), "time2", null, 0, 1, TraceCommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEntryTypeEClass, TraceEntryType.class, "TraceEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceEntryType_Data(), theXMLTypePackage.getString(), "data", null, 0, 1, TraceEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceEntryType_ElementRefId(), theXMLTypePackage.getUnsignedLong(), "elementRefId", null, 1, 1, TraceEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceEntryType_EventId(), theXMLTypePackage.getUnsignedLong(), "eventId", null, 1, 1, TraceEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceEntryType_Time(), theXMLTypePackage.getUnsignedLong(), "time", null, 1, 1, TraceEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracesTypeEClass, TracesType.class, "TracesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracesType_OT1TraceLink(), this.getOT1TraceLinkType(), null, "oT1TraceLink", null, 0, -1, TracesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracesType_OT1HexTrace(), this.getOT1HexTraceType(), null, "oT1HexTrace", null, 0, -1, TracesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracesType_XmlTrace(), this.getXmlTraceType(), null, "xmlTrace", null, 0, -1, TracesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracingOverheadContainerTypeEClass, TracingOverheadContainerType.class, "TracingOverheadContainerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracingOverheadContainerType_TracingOverhead(), this.getTracingOverheadType(), null, "tracingOverhead", null, 0, -1, TracingOverheadContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracingOverheadTypeEClass, TracingOverheadType.class, "TracingOverheadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracingOverheadType_Time(), this.getTimeValueType(), null, "time", null, 1, 1, TracingOverheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracingOverheadType_EventId(), theXMLTypePackage.getUnsignedLong(), "eventId", null, 0, 1, TracingOverheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracingOverheadType_Type(), this.getTracingOverheadDescriptionEnum(), "type", null, 1, 1, TracingOverheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueElementTypeEClass, UniqueElementType.class, "UniqueElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueElementType_Uuid(), theXMLTypePackage.getUnsignedInt(), "uuid", null, 1, 1, UniqueElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableTypeEClass, VariableType.class, "VariableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableType_Length(), theXMLTypePackage.getUnsignedLong(), "length", null, 1, 1, VariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualElementTypeEClass, VirtualElementType.class, "VirtualElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(windowsOsTypeEClass, WindowsOsType.class, "WindowsOsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlTraceTypeEClass, XmlTraceType.class, "XmlTraceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlTraceType_TraceEntry(), this.getTraceEntryType(), null, "traceEntry", null, 0, -1, XmlTraceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlTraceType_TraceComment(), this.getTraceCommentType(), null, "traceComment", null, 0, -1, XmlTraceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventTypeEnumEEnum, EventTypeEnum.class, "EventTypeEnum");
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_ACTIVATION);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_ACTIVATION_FAILED);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_START);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_STOP);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_WAIT);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_RELEASE);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_PREEMPT);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_RESUME);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SCHED_TERMINATE);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.RUNNABLE_START);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.RUNNABLE_STOP);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.TIMESTAMP);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.TIMESTAMP_DATA);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.TIMERANGE_START);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.TIMERANGE_STOP);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.FUNCTION_START);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.FUNCTION_STOP);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.CODEBLOCK_START);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.CODEBLOCK_STOP);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.PDU_TRANSMIT);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.PDU_RECEIVE);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SIG_TRANSMIT);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SIG_RECEIVE);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.FRAME_TRANSMIT);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.FRAME_RECEIVE);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.MSG_TRANSMIT);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.MSG_RECEIVE);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.SYNC);
		addEEnumLiteral(eventTypeEnumEEnum, EventTypeEnum.ERROR);

		initEEnum(executionOrderConstraintTypeEnumEEnum, ExecutionOrderConstraintTypeEnum.class, "ExecutionOrderConstraintTypeEnum");
		addEEnumLiteral(executionOrderConstraintTypeEnumEEnum, ExecutionOrderConstraintTypeEnum.TOTAL);
		addEEnumLiteral(executionOrderConstraintTypeEnumEEnum, ExecutionOrderConstraintTypeEnum.PARTIAL);

		initEEnum(interruptTypeEnumEEnum, InterruptTypeEnum.class, "InterruptTypeEnum");
		addEEnumLiteral(interruptTypeEnumEEnum, InterruptTypeEnum.CATEGORY1);
		addEEnumLiteral(interruptTypeEnumEEnum, InterruptTypeEnum.CATEGORY2);

		initEEnum(latencyTypeEnumEEnum, LatencyTypeEnum.class, "LatencyTypeEnum");
		addEEnumLiteral(latencyTypeEnumEEnum, LatencyTypeEnum.AGE);
		addEEnumLiteral(latencyTypeEnumEEnum, LatencyTypeEnum.REACTION);

		initEEnum(taskTypeEnumEEnum, TaskTypeEnum.class, "TaskTypeEnum");
		addEEnumLiteral(taskTypeEnumEEnum, TaskTypeEnum.PREEMPTIVE);
		addEEnumLiteral(taskTypeEnumEEnum, TaskTypeEnum.NON_PREEMPTIVE);
		addEEnumLiteral(taskTypeEnumEEnum, TaskTypeEnum.COOPERATIVE);

		initEEnum(thresholdTypeEnumEEnum, ThresholdTypeEnum.class, "ThresholdTypeEnum");
		addEEnumLiteral(thresholdTypeEnumEEnum, ThresholdTypeEnum.MIN);
		addEEnumLiteral(thresholdTypeEnumEEnum, ThresholdTypeEnum.MAX);

		initEEnum(timeBaseEnumEEnum, TimeBaseEnum.class, "TimeBaseEnum");
		addEEnumLiteral(timeBaseEnumEEnum, TimeBaseEnum.S);
		addEEnumLiteral(timeBaseEnumEEnum, TimeBaseEnum.MS);
		addEEnumLiteral(timeBaseEnumEEnum, TimeBaseEnum.US);
		addEEnumLiteral(timeBaseEnumEEnum, TimeBaseEnum.NS);

		initEEnum(timingInformationSourceEnumEEnum, TimingInformationSourceEnum.class, "TimingInformationSourceEnum");
		addEEnumLiteral(timingInformationSourceEnumEEnum, TimingInformationSourceEnum.CONFIGURATION);
		addEEnumLiteral(timingInformationSourceEnumEEnum, TimingInformationSourceEnum.TRACE);
		addEEnumLiteral(timingInformationSourceEnumEEnum, TimingInformationSourceEnum.SIMULATION);
		addEEnumLiteral(timingInformationSourceEnumEEnum, TimingInformationSourceEnum.ANALYSIS);
		addEEnumLiteral(timingInformationSourceEnumEEnum, TimingInformationSourceEnum.BUDGET);
		addEEnumLiteral(timingInformationSourceEnumEEnum, TimingInformationSourceEnum.ESTIMATION);
		addEEnumLiteral(timingInformationSourceEnumEEnum, TimingInformationSourceEnum.UNKNOWN);

		initEEnum(timingInformationSubTypeEnumEEnum, TimingInformationSubTypeEnum.class, "TimingInformationSubTypeEnum");
		addEEnumLiteral(timingInformationSubTypeEnumEEnum, TimingInformationSubTypeEnum.MIN);
		addEEnumLiteral(timingInformationSubTypeEnumEEnum, TimingInformationSubTypeEnum.MAX);
		addEEnumLiteral(timingInformationSubTypeEnumEEnum, TimingInformationSubTypeEnum.AVERAGE);
		addEEnumLiteral(timingInformationSubTypeEnumEEnum, TimingInformationSubTypeEnum.MEAN);
		addEEnumLiteral(timingInformationSubTypeEnumEEnum, TimingInformationSubTypeEnum.STD_DEVIATION);
		addEEnumLiteral(timingInformationSubTypeEnumEEnum, TimingInformationSubTypeEnum.FREQUENCY);

		initEEnum(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.class, "TimingInformationTypeEnum");
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.CET);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.GET);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.DT);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.ST);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.RT);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.IPT);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.PRE);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.OFF);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.PER);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.WT);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.CPU);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.CAF);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.DAF);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.DAT);
		addEEnumLiteral(timingInformationTypeEnumEEnum, TimingInformationTypeEnum.TT);

		initEEnum(tracingOverheadDescriptionEnumEEnum, TracingOverheadDescriptionEnum.class, "TracingOverheadDescriptionEnum");
		addEEnumLiteral(tracingOverheadDescriptionEnumEEnum, TracingOverheadDescriptionEnum.TOTAL_OVERHEAD);
		addEEnumLiteral(tracingOverheadDescriptionEnumEEnum, TracingOverheadDescriptionEnum.BEFORE_TAKING_TIME);
		addEEnumLiteral(tracingOverheadDescriptionEnumEEnum, TracingOverheadDescriptionEnum.AFTER_TAKING_TIME);

		initEEnum(versionTypeEEnum, VersionType.class, "VersionType");
		addEEnumLiteral(versionTypeEEnum, VersionType._02);

		// Initialize data types
		initEDataType(eventTypeEnumObjectEDataType, EventTypeEnum.class, "EventTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(executionOrderConstraintTypeEnumObjectEDataType, ExecutionOrderConstraintTypeEnum.class, "ExecutionOrderConstraintTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(interruptTypeEnumObjectEDataType, InterruptTypeEnum.class, "InterruptTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(latencyTypeEnumObjectEDataType, LatencyTypeEnum.class, "LatencyTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taskTypeEnumObjectEDataType, TaskTypeEnum.class, "TaskTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(thresholdTypeEnumObjectEDataType, ThresholdTypeEnum.class, "ThresholdTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeBaseEnumObjectEDataType, TimeBaseEnum.class, "TimeBaseEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timingInformationSourceEnumObjectEDataType, TimingInformationSourceEnum.class, "TimingInformationSourceEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timingInformationSubTypeEnumObjectEDataType, TimingInformationSubTypeEnum.class, "TimingInformationSubTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timingInformationTypeEnumObjectEDataType, TimingInformationTypeEnum.class, "TimingInformationTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tracingOverheadDescriptionEnumObjectEDataType, TracingOverheadDescriptionEnum.class, "TracingOverheadDescriptionEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeObjectEDataType, VersionType.class, "VersionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (addressRangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AddressRangeType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAddressRangeType_EndAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EndAddress",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAddressRangeType_StartAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "StartAddress",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (anyDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AnyDataType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAnyDataType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "strict"
		   });	
		addAnnotation
		  (getAnyDataType_Tool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tool",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAnyDataType_Vendor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vendor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAnyDataType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (applicationElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ApplicationElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (arbitraryEventTriggeringConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ArbitraryEventTriggeringConstraintType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getArbitraryEventTriggeringConstraintType_LowerBound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LowerBound",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getArbitraryEventTriggeringConstraintType_UpperBound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpperBound",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (arbitraryEventTriggeringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ArbitraryEventTriggeringType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getArbitraryEventTriggeringType_MinDistance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MinDistance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getArbitraryEventTriggeringType_MaxDistance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MaxDistance",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (autosarOsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AutosarOsType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAutosarOsType_KernelPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kernelPriority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (canBusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CanBusType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (clockTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClockType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getClockType_Tickduration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Tickduration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getClockType_MaxAbsTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxAbsTime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (codeBlockTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CodeBlockType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCodeBlockType_AddressRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressRange",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCodeBlockType_SymbolRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SymbolRange",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (commentDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CommentDataType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCommentDataType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (communicationElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CommunicationElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (customDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CustomDataType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCustomDataType_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Data",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dataElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DataElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (dataRangeElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DataRangeElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDataRangeElementType_AddressRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressRange",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataRangeElementType_SymbolRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SymbolRange",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_OT1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OT1",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (elementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (eventChainElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EventChainElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEventChainElementType_EventChain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EventChain",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventChainTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EventChainType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEventChainType_StimulusEventReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StimulusEventReference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEventChainType_InterChainEventReferenceId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InterChainEventReferenceId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEventChainType_ResponseEventReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResponseEventReference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EventDescriptionType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEventDescriptionType_EventIdMapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EventIdMapping",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventIdMappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EventIdMappingType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEventIdMappingType_EventId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEventIdMappingType_EventType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventReferenceElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EventReferenceElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEventReferenceElementType_EventReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EventReference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EventReferenceType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEventReferenceType_ElementRefId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elementRefId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEventReferenceType_EventType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventTriggeringConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EventTriggeringConstraintType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEventTriggeringConstraintType_EventId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventTriggeringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EventTriggeringType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEventTriggeringType_EventReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EventReference",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (eventTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "EventTypeEnum"
		   });	
		addAnnotation
		  (eventTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "EventTypeEnum:Object",
			 "baseType", "EventTypeEnum"
		   });	
		addAnnotation
		  (executionOrderConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExecutionOrderConstraintType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExecutionOrderConstraintType_EventChainId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventChainId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExecutionOrderConstraintType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (executionOrderConstraintTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "ExecutionOrderConstraintTypeEnum"
		   });	
		addAnnotation
		  (executionOrderConstraintTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ExecutionOrderConstraintTypeEnum:Object",
			 "baseType", "ExecutionOrderConstraintTypeEnum"
		   });	
		addAnnotation
		  (flexRayBusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FlexRayBusType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (frameElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FrameElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (functionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FunctionType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (identifiableElementEClass, 
		   source, 
		   new String[] {
			 "name", "IdentifiableElement",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIdentifiableElement_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (interruptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InterruptType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInterruptType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getInterruptType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (interruptTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "InterruptTypeEnum"
		   });	
		addAnnotation
		  (interruptTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "InterruptTypeEnum:Object",
			 "baseType", "InterruptTypeEnum"
		   });	
		addAnnotation
		  (latencyTimingConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LatencyTimingConstraintType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLatencyTimingConstraintType_Minimum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Minimum",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLatencyTimingConstraintType_Maximum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Maximum",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLatencyTimingConstraintType_EventChainId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventChainId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (latencyTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "LatencyTypeEnum"
		   });	
		addAnnotation
		  (latencyTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "LatencyTypeEnum:Object",
			 "baseType", "LatencyTypeEnum"
		   });	
		addAnnotation
		  (linBusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LinBusType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (messageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MessageType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (mostBusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MostBusType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (offsetTimingConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OffsetTimingConstraintType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOffsetTimingConstraintType_Minimum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Minimum",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOffsetTimingConstraintType_Maximum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Maximum",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOffsetTimingConstraintType_SourceEventId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sourceEventId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOffsetTimingConstraintType_TargetEventId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetEventId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (osekOsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OsekOsType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOsekOsType_KernelPriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kernelPriority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (ot1HexTraceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OT1HexTraceType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOT1HexTraceType_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Data",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (ot1TraceLinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OT1TraceLinkType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOT1TraceLinkType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (ot1TypeEClass, 
		   source, 
		   new String[] {
			 "name", "OT1Type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOT1Type_Comments(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comments",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOT1Type_CustomData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CustomData",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOT1Type_Tool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tool",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOT1Type_Vendor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vendor",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOT1Type_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (ot1Type1EClass, 
		   source, 
		   new String[] {
			 "name", "OT1_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOT1Type1_SchedulingEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SchedulingEntity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOT1Type1_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (pduTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PduType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (periodicEventTriggeringConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PeriodicEventTriggeringConstraintType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPeriodicEventTriggeringConstraintType_Period(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Period",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPeriodicEventTriggeringConstraintType_Jitter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Jitter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPeriodicEventTriggeringConstraintType_MinInterArrivalTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MinInterArrivalTime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (posixOsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PosixOsType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (processTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (runnableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RunnableType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (schedulableApplicationElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SchedulableApplicationElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (schedulingEntityElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SchedulingEntityElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSchedulingEntityElementType_Element(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingEntityElementType_TimingValues(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimingValues",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingEntityElementType_TimingConstraints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimingConstraints",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingEntityElementType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (schedulingEntityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SchedulingEntityType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSchedulingEntityType_Clock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Clock",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingEntityType_EventDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EventDescription",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingEntityType_TracingOverheadContainer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TracingOverheadContainer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingEntityType_Element(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Element",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingEntityType_Traces(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Traces",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSchedulingEntityType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (signalTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignalType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (sporadicEventTriggeringConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SporadicEventTriggeringConstraintType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSporadicEventTriggeringConstraintType_Period(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Period",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSporadicEventTriggeringConstraintType_Jitter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Jitter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSporadicEventTriggeringConstraintType_MinInterArrivalTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MinInterArrivalTime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSporadicEventTriggeringConstraintType_MaxInterArrivalTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MaxInterArrivalTime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (symbolRangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SymbolRangeType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSymbolRangeType_EndSymbol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EndSymbol",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSymbolRangeType_StartSymbol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "StartSymbol",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (taskTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TaskType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTaskType_Offset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "offset",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Period(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "period",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTaskType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (taskTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "TaskTypeEnum"
		   });	
		addAnnotation
		  (taskTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TaskTypeEnum:Object",
			 "baseType", "TaskTypeEnum"
		   });	
		addAnnotation
		  (threadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ThreadType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getThreadType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (thresholdTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "ThresholdTypeEnum"
		   });	
		addAnnotation
		  (thresholdTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ThresholdTypeEnum:Object",
			 "baseType", "ThresholdTypeEnum"
		   });	
		addAnnotation
		  (timeBaseEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "TimeBaseEnum"
		   });	
		addAnnotation
		  (timeBaseEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TimeBaseEnum:Object",
			 "baseType", "TimeBaseEnum"
		   });	
		addAnnotation
		  (timeRangeElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimeRangeElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTimeRangeElementType_Latency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "latency",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (timeStampElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimeStampElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (timeValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimeValueType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTimeValueType_Denominator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "denominator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimeValueType_Nominator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nominator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimeValueType_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (timingConstraintElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimingConstraintElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (timingConstraintsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimingConstraints_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTimingConstraintsType_TimingConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimingConstraint",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (timingInformationConstraintTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimingInformationConstraintType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTimingInformationConstraintType_Threshold(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Threshold",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimingInformationConstraintType_ThresholdType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "thresholdType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimingInformationConstraintType_TimingValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timingValueType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (timingInformationElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimingInformationElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTimingInformationElementType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimingInformationElementType_SubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimingInformationElementType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (timingInformationSourceEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "TimingInformationSourceEnum"
		   });	
		addAnnotation
		  (timingInformationSourceEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TimingInformationSourceEnum:Object",
			 "baseType", "TimingInformationSourceEnum"
		   });	
		addAnnotation
		  (timingInformationSubTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "TimingInformationSubTypeEnum"
		   });	
		addAnnotation
		  (timingInformationSubTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TimingInformationSubTypeEnum:Object",
			 "baseType", "TimingInformationSubTypeEnum"
		   });	
		addAnnotation
		  (timingInformationTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "TimingInformationTypeEnum"
		   });	
		addAnnotation
		  (timingInformationTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TimingInformationTypeEnum:Object",
			 "baseType", "TimingInformationTypeEnum"
		   });	
		addAnnotation
		  (timingValueElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimingValueElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTimingValueElementType_Request(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "request",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTimingValueElementType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (timingValuesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimingValues_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTimingValuesType_TimingValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimingValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (traceCommentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TraceCommentType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTraceCommentType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTraceCommentType_Time1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "time1",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTraceCommentType_Time2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "time2",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (traceEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TraceEntryType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTraceEntryType_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTraceEntryType_ElementRefId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elementRefId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTraceEntryType_EventId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTraceEntryType_Time(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tracesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Traces_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTracesType_OT1TraceLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OT1TraceLink",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTracesType_OT1HexTrace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OT1HexTrace",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTracesType_XmlTrace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XmlTrace",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tracingOverheadContainerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TracingOverheadContainerType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTracingOverheadContainerType_TracingOverhead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TracingOverhead",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (tracingOverheadDescriptionEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "TracingOverheadDescriptionEnum"
		   });	
		addAnnotation
		  (tracingOverheadDescriptionEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TracingOverheadDescriptionEnum:Object",
			 "baseType", "TracingOverheadDescriptionEnum"
		   });	
		addAnnotation
		  (tracingOverheadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TracingOverheadType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTracingOverheadType_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Time",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTracingOverheadType_EventId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "eventId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTracingOverheadType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (uniqueElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UniqueElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUniqueElementType_Uuid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uuid",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (variableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VariableType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVariableType_Length(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Length",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (versionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "VersionType"
		   });	
		addAnnotation
		  (versionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "VersionType:Object",
			 "baseType", "VersionType"
		   });	
		addAnnotation
		  (virtualElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VirtualElementType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (windowsOsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "WindowsOsType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (xmlTraceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "XmlTraceType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getXmlTraceType_TraceEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TraceEntry",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getXmlTraceType_TraceComment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TraceComment",
			 "namespace", "##targetNamespace"
		   });
	}

} //OT1PackageImpl
