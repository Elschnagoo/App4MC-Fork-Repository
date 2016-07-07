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
package org.eclipse.app4mc.tracing.converter.ot1.OT1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface OT1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OT1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gliwa.com/ot1/download/OT1.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OT1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OT1Package eINSTANCE = org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AddressRangeTypeImpl <em>Address Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AddressRangeTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getAddressRangeType()
	 * @generated
	 */
	int ADDRESS_RANGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>End Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_RANGE_TYPE__END_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_RANGE_TYPE__START_ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Address Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_RANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AnyDataTypeImpl <em>Any Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AnyDataTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getAnyDataType()
	 * @generated
	 */
	int ANY_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DATA_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DATA_TYPE__TOOL = 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DATA_TYPE__VENDOR = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DATA_TYPE__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Any Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOT1Type()
	 * @generated
	 */
	int OT1_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE__COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE__CUSTOM_DATA = 1;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE__TOOL = 2;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE__VENDOR = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__COMMENTS = OT1_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__CUSTOM_DATA = OT1_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__TOOL = OT1_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__VENDOR = OT1_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__VERSION = OT1_TYPE__VERSION;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = OT1_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.IdentifiableElementImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__COMMENTS = ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__CUSTOM_DATA = ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__TOOL = ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__VENDOR = ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__VERSION = ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityElementTypeImpl <em>Scheduling Entity Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSchedulingEntityElementType()
	 * @generated
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__COMMENTS = IDENTIFIABLE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__CUSTOM_DATA = IDENTIFIABLE_ELEMENT__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__TOOL = IDENTIFIABLE_ELEMENT__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__VENDOR = IDENTIFIABLE_ELEMENT__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__VERSION = IDENTIFIABLE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE__NAME = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scheduling Entity Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_ELEMENT_TYPE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ApplicationElementTypeImpl <em>Application Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ApplicationElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getApplicationElementType()
	 * @generated
	 */
	int APPLICATION_ELEMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__COMMENTS = SCHEDULING_ENTITY_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__TOOL = SCHEDULING_ENTITY_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__VENDOR = SCHEDULING_ENTITY_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__VERSION = SCHEDULING_ENTITY_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__ID = SCHEDULING_ENTITY_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__ELEMENT = SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__TIMING_VALUES = SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS = SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE__NAME = SCHEDULING_ENTITY_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Application Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintElementTypeImpl <em>Timing Constraint Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingConstraintElementType()
	 * @generated
	 */
	int TIMING_CONSTRAINT_ELEMENT_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_ELEMENT_TYPE__COMMENTS = ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_ELEMENT_TYPE__CUSTOM_DATA = ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_ELEMENT_TYPE__TOOL = ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_ELEMENT_TYPE__VENDOR = ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_ELEMENT_TYPE__VERSION = ELEMENT_TYPE__VERSION;

	/**
	 * The number of structural features of the '<em>Timing Constraint Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventTriggeringConstraintTypeImpl <em>Event Triggering Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventTriggeringConstraintTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventTriggeringConstraintType()
	 * @generated
	 */
	int EVENT_TRIGGERING_CONSTRAINT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_CONSTRAINT_TYPE__COMMENTS = TIMING_CONSTRAINT_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_CONSTRAINT_TYPE__CUSTOM_DATA = TIMING_CONSTRAINT_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_CONSTRAINT_TYPE__TOOL = TIMING_CONSTRAINT_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_CONSTRAINT_TYPE__VENDOR = TIMING_CONSTRAINT_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_CONSTRAINT_TYPE__VERSION = TIMING_CONSTRAINT_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Triggering Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringConstraintTypeImpl <em>Arbitrary Event Triggering Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringConstraintTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getArbitraryEventTriggeringConstraintType()
	 * @generated
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__COMMENTS = EVENT_TRIGGERING_CONSTRAINT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__CUSTOM_DATA = EVENT_TRIGGERING_CONSTRAINT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__TOOL = EVENT_TRIGGERING_CONSTRAINT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__VENDOR = EVENT_TRIGGERING_CONSTRAINT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__VERSION = EVENT_TRIGGERING_CONSTRAINT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID = EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__LOWER_BOUND = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__UPPER_BOUND = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arbitrary Event Triggering Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValueElementTypeImpl <em>Timing Value Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValueElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingValueElementType()
	 * @generated
	 */
	int TIMING_VALUE_ELEMENT_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUE_ELEMENT_TYPE__COMMENTS = ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUE_ELEMENT_TYPE__CUSTOM_DATA = ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUE_ELEMENT_TYPE__TOOL = ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUE_ELEMENT_TYPE__VENDOR = ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUE_ELEMENT_TYPE__VERSION = ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUE_ELEMENT_TYPE__REQUEST = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUE_ELEMENT_TYPE__SOURCE = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timing Value Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUE_ELEMENT_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventTriggeringTypeImpl <em>Event Triggering Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventTriggeringTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventTriggeringType()
	 * @generated
	 */
	int EVENT_TRIGGERING_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE__COMMENTS = TIMING_VALUE_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE__CUSTOM_DATA = TIMING_VALUE_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE__TOOL = TIMING_VALUE_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE__VENDOR = TIMING_VALUE_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE__VERSION = TIMING_VALUE_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE__REQUEST = TIMING_VALUE_ELEMENT_TYPE__REQUEST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE__SOURCE = TIMING_VALUE_ELEMENT_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE__EVENT_REFERENCE = TIMING_VALUE_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Triggering Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGERING_TYPE_FEATURE_COUNT = TIMING_VALUE_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringTypeImpl <em>Arbitrary Event Triggering Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getArbitraryEventTriggeringType()
	 * @generated
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__COMMENTS = EVENT_TRIGGERING_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__CUSTOM_DATA = EVENT_TRIGGERING_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__TOOL = EVENT_TRIGGERING_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__VENDOR = EVENT_TRIGGERING_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__VERSION = EVENT_TRIGGERING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__REQUEST = EVENT_TRIGGERING_TYPE__REQUEST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__SOURCE = EVENT_TRIGGERING_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__EVENT_REFERENCE = EVENT_TRIGGERING_TYPE__EVENT_REFERENCE;

	/**
	 * The feature id for the '<em><b>Min Distance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE = EVENT_TRIGGERING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Distance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE = EVENT_TRIGGERING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arbitrary Event Triggering Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_EVENT_TRIGGERING_TYPE_FEATURE_COUNT = EVENT_TRIGGERING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.UniqueElementTypeImpl <em>Unique Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.UniqueElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getUniqueElementType()
	 * @generated
	 */
	int UNIQUE_ELEMENT_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ELEMENT_TYPE__COMMENTS = ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ELEMENT_TYPE__CUSTOM_DATA = ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ELEMENT_TYPE__TOOL = ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ELEMENT_TYPE__VENDOR = ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ELEMENT_TYPE__VERSION = ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ELEMENT_TYPE__UUID = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ELEMENT_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl <em>Scheduling Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSchedulingEntityType()
	 * @generated
	 */
	int SCHEDULING_ENTITY_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__COMMENTS = UNIQUE_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__CUSTOM_DATA = UNIQUE_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__TOOL = UNIQUE_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__VENDOR = UNIQUE_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__VERSION = UNIQUE_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__UUID = UNIQUE_ELEMENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__CLOCK = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__ELEMENT = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__TRACES = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE__NAME = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Scheduling Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_ENTITY_TYPE_FEATURE_COUNT = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AutosarOsTypeImpl <em>Autosar Os Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AutosarOsTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getAutosarOsType()
	 * @generated
	 */
	int AUTOSAR_OS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__COMMENTS = SCHEDULING_ENTITY_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__TOOL = SCHEDULING_ENTITY_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__VENDOR = SCHEDULING_ENTITY_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__VERSION = SCHEDULING_ENTITY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__UUID = SCHEDULING_ENTITY_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__CLOCK = SCHEDULING_ENTITY_TYPE__CLOCK;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__EVENT_DESCRIPTION = SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__TRACING_OVERHEAD_CONTAINER = SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__ELEMENT = SCHEDULING_ENTITY_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__TRACES = SCHEDULING_ENTITY_TYPE__TRACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__NAME = SCHEDULING_ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Kernel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE__KERNEL_PRIORITY = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Autosar Os Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOSAR_OS_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CanBusTypeImpl <em>Can Bus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CanBusTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCanBusType()
	 * @generated
	 */
	int CAN_BUS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__COMMENTS = SCHEDULING_ENTITY_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__TOOL = SCHEDULING_ENTITY_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__VENDOR = SCHEDULING_ENTITY_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__VERSION = SCHEDULING_ENTITY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__UUID = SCHEDULING_ENTITY_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__CLOCK = SCHEDULING_ENTITY_TYPE__CLOCK;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__EVENT_DESCRIPTION = SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__TRACING_OVERHEAD_CONTAINER = SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__ELEMENT = SCHEDULING_ENTITY_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__TRACES = SCHEDULING_ENTITY_TYPE__TRACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE__NAME = SCHEDULING_ENTITY_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Can Bus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_BUS_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ClockTypeImpl <em>Clock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ClockTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getClockType()
	 * @generated
	 */
	int CLOCK_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Tickduration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE__TICKDURATION = 0;

	/**
	 * The feature id for the '<em><b>Max Abs Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE__MAX_ABS_TIME = 1;

	/**
	 * The number of structural features of the '<em>Clock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CodeBlockTypeImpl <em>Code Block Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CodeBlockTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCodeBlockType()
	 * @generated
	 */
	int CODE_BLOCK_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__COMMENTS = APPLICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__CUSTOM_DATA = APPLICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__TOOL = APPLICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__VENDOR = APPLICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__VERSION = APPLICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__ID = APPLICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__ELEMENT = APPLICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__TIMING_VALUES = APPLICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__TIMING_CONSTRAINTS = APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__NAME = APPLICATION_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Address Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__ADDRESS_RANGE = APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE__SYMBOL_RANGE = APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Block Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_TYPE_FEATURE_COUNT = APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CommentDataTypeImpl <em>Comment Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CommentDataTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCommentDataType()
	 * @generated
	 */
	int COMMENT_DATA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_DATA_TYPE__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Comment Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CommunicationElementTypeImpl <em>Communication Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CommunicationElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCommunicationElementType()
	 * @generated
	 */
	int COMMUNICATION_ELEMENT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__COMMENTS = SCHEDULING_ENTITY_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__TOOL = SCHEDULING_ENTITY_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__VENDOR = SCHEDULING_ENTITY_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__VERSION = SCHEDULING_ENTITY_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__ID = SCHEDULING_ENTITY_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__ELEMENT = SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__TIMING_VALUES = SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS = SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE__NAME = SCHEDULING_ENTITY_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Communication Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ELEMENT_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CustomDataTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCustomDataType()
	 * @generated
	 */
	int CUSTOM_DATA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE__DATA = 0;

	/**
	 * The number of structural features of the '<em>Custom Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataElementTypeImpl <em>Data Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getDataElementType()
	 * @generated
	 */
	int DATA_ELEMENT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__COMMENTS = SCHEDULING_ENTITY_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__TOOL = SCHEDULING_ENTITY_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__VENDOR = SCHEDULING_ENTITY_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__VERSION = SCHEDULING_ENTITY_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__ID = SCHEDULING_ENTITY_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__ELEMENT = SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__TIMING_VALUES = SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__TIMING_CONSTRAINTS = SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE__NAME = SCHEDULING_ENTITY_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Data Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataRangeElementTypeImpl <em>Data Range Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataRangeElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getDataRangeElementType()
	 * @generated
	 */
	int DATA_RANGE_ELEMENT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__COMMENTS = DATA_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__CUSTOM_DATA = DATA_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__TOOL = DATA_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__VENDOR = DATA_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__VERSION = DATA_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__ID = DATA_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__ELEMENT = DATA_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__TIMING_VALUES = DATA_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__TIMING_CONSTRAINTS = DATA_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__NAME = DATA_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Address Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE = DATA_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE = DATA_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Range Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_ELEMENT_TYPE_FEATURE_COUNT = DATA_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DocumentRootImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>OT1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OT1 = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.VirtualElementTypeImpl <em>Virtual Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.VirtualElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getVirtualElementType()
	 * @generated
	 */
	int VIRTUAL_ELEMENT_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__COMMENTS = SCHEDULING_ENTITY_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__TOOL = SCHEDULING_ENTITY_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__VENDOR = SCHEDULING_ENTITY_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__VERSION = SCHEDULING_ENTITY_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__ID = SCHEDULING_ENTITY_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__ELEMENT = SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__TIMING_VALUES = SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__TIMING_CONSTRAINTS = SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE__NAME = SCHEDULING_ENTITY_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Virtual Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeRangeElementTypeImpl <em>Time Range Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeRangeElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeRangeElementType()
	 * @generated
	 */
	int TIME_RANGE_ELEMENT_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__COMMENTS = VIRTUAL_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__CUSTOM_DATA = VIRTUAL_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__TOOL = VIRTUAL_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__VENDOR = VIRTUAL_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__VERSION = VIRTUAL_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__ID = VIRTUAL_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__ELEMENT = VIRTUAL_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__TIMING_VALUES = VIRTUAL_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__TIMING_CONSTRAINTS = VIRTUAL_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__NAME = VIRTUAL_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE__LATENCY = VIRTUAL_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Range Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_ELEMENT_TYPE_FEATURE_COUNT = VIRTUAL_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainElementTypeImpl <em>Event Chain Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventChainElementType()
	 * @generated
	 */
	int EVENT_CHAIN_ELEMENT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__COMMENTS = TIME_RANGE_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__CUSTOM_DATA = TIME_RANGE_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__TOOL = TIME_RANGE_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__VENDOR = TIME_RANGE_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__VERSION = TIME_RANGE_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__ID = TIME_RANGE_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__ELEMENT = TIME_RANGE_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__TIMING_VALUES = TIME_RANGE_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__TIMING_CONSTRAINTS = TIME_RANGE_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__NAME = TIME_RANGE_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__LATENCY = TIME_RANGE_ELEMENT_TYPE__LATENCY;

	/**
	 * The feature id for the '<em><b>Event Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN = TIME_RANGE_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Chain Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_TYPE_FEATURE_COUNT = TIME_RANGE_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainTypeImpl <em>Event Chain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventChainType()
	 * @generated
	 */
	int EVENT_CHAIN_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__COMMENTS = IDENTIFIABLE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__CUSTOM_DATA = IDENTIFIABLE_ELEMENT__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__TOOL = IDENTIFIABLE_ELEMENT__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__VENDOR = IDENTIFIABLE_ELEMENT__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__VERSION = IDENTIFIABLE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Stimulus Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inter Chain Event Reference Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__INTER_CHAIN_EVENT_REFERENCE_ID = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Response Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Chain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_TYPE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventDescriptionTypeImpl <em>Event Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventDescriptionTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventDescriptionType()
	 * @generated
	 */
	int EVENT_DESCRIPTION_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION_TYPE__COMMENTS = OT1_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION_TYPE__CUSTOM_DATA = OT1_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION_TYPE__TOOL = OT1_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION_TYPE__VENDOR = OT1_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION_TYPE__VERSION = OT1_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Event Id Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING = OT1_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION_TYPE_FEATURE_COUNT = OT1_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventIdMappingTypeImpl <em>Event Id Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventIdMappingTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventIdMappingType()
	 * @generated
	 */
	int EVENT_ID_MAPPING_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ID_MAPPING_TYPE__EVENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ID_MAPPING_TYPE__EVENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Event Id Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ID_MAPPING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeStampElementTypeImpl <em>Time Stamp Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeStampElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeStampElementType()
	 * @generated
	 */
	int TIME_STAMP_ELEMENT_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__COMMENTS = VIRTUAL_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__CUSTOM_DATA = VIRTUAL_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__TOOL = VIRTUAL_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__VENDOR = VIRTUAL_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__VERSION = VIRTUAL_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__ID = VIRTUAL_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__ELEMENT = VIRTUAL_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__TIMING_VALUES = VIRTUAL_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__TIMING_CONSTRAINTS = VIRTUAL_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE__NAME = VIRTUAL_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Time Stamp Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_ELEMENT_TYPE_FEATURE_COUNT = VIRTUAL_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceElementTypeImpl <em>Event Reference Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventReferenceElementType()
	 * @generated
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__COMMENTS = TIME_STAMP_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__CUSTOM_DATA = TIME_STAMP_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__TOOL = TIME_STAMP_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__VENDOR = TIME_STAMP_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__VERSION = TIME_STAMP_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__ID = TIME_STAMP_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__ELEMENT = TIME_STAMP_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__TIMING_VALUES = TIME_STAMP_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__TIMING_CONSTRAINTS = TIME_STAMP_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__NAME = TIME_STAMP_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Event Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE = TIME_STAMP_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Reference Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_ELEMENT_TYPE_FEATURE_COUNT = TIME_STAMP_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceTypeImpl <em>Event Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventReferenceType()
	 * @generated
	 */
	int EVENT_REFERENCE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_TYPE__COMMENTS = OT1_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_TYPE__CUSTOM_DATA = OT1_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_TYPE__TOOL = OT1_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_TYPE__VENDOR = OT1_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_TYPE__VERSION = OT1_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Element Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_TYPE__ELEMENT_REF_ID = OT1_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_TYPE__EVENT_TYPE = OT1_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REFERENCE_TYPE_FEATURE_COUNT = OT1_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ExecutionOrderConstraintTypeImpl <em>Execution Order Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ExecutionOrderConstraintTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getExecutionOrderConstraintType()
	 * @generated
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE__COMMENTS = TIMING_CONSTRAINT_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE__CUSTOM_DATA = TIMING_CONSTRAINT_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE__TOOL = TIMING_CONSTRAINT_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE__VENDOR = TIMING_CONSTRAINT_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE__VERSION = TIMING_CONSTRAINT_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Event Chain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE__EVENT_CHAIN_ID = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execution Order Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE_FEATURE_COUNT = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FlexRayBusTypeImpl <em>Flex Ray Bus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FlexRayBusTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getFlexRayBusType()
	 * @generated
	 */
	int FLEX_RAY_BUS_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__COMMENTS = SCHEDULING_ENTITY_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__TOOL = SCHEDULING_ENTITY_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__VENDOR = SCHEDULING_ENTITY_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__VERSION = SCHEDULING_ENTITY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__UUID = SCHEDULING_ENTITY_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__CLOCK = SCHEDULING_ENTITY_TYPE__CLOCK;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__EVENT_DESCRIPTION = SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__TRACING_OVERHEAD_CONTAINER = SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__ELEMENT = SCHEDULING_ENTITY_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__TRACES = SCHEDULING_ENTITY_TYPE__TRACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE__NAME = SCHEDULING_ENTITY_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Flex Ray Bus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEX_RAY_BUS_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FrameElementTypeImpl <em>Frame Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FrameElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getFrameElementType()
	 * @generated
	 */
	int FRAME_ELEMENT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__COMMENTS = COMMUNICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__CUSTOM_DATA = COMMUNICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__TOOL = COMMUNICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__VENDOR = COMMUNICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__VERSION = COMMUNICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__ID = COMMUNICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__ELEMENT = COMMUNICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__TIMING_VALUES = COMMUNICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__TIMING_CONSTRAINTS = COMMUNICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE__NAME = COMMUNICATION_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Frame Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ELEMENT_TYPE_FEATURE_COUNT = COMMUNICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FunctionTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__COMMENTS = APPLICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__CUSTOM_DATA = APPLICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__TOOL = APPLICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__VENDOR = APPLICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__VERSION = APPLICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__ID = APPLICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__ELEMENT = APPLICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__TIMING_VALUES = APPLICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__TIMING_CONSTRAINTS = APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__NAME = APPLICATION_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulableApplicationElementTypeImpl <em>Schedulable Application Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulableApplicationElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSchedulableApplicationElementType()
	 * @generated
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__COMMENTS = APPLICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__CUSTOM_DATA = APPLICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TOOL = APPLICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VENDOR = APPLICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VERSION = APPLICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ID = APPLICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ELEMENT = APPLICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_VALUES = APPLICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS = APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE__NAME = APPLICATION_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Schedulable Application Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT = APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.InterruptTypeImpl <em>Interrupt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.InterruptTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getInterruptType()
	 * @generated
	 */
	int INTERRUPT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__COMMENTS = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__CUSTOM_DATA = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__TOOL = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__VENDOR = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__VERSION = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__ID = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__ELEMENT = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__TIMING_VALUES = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__TIMING_CONSTRAINTS = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__NAME = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__PRIORITY = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE__TYPE = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interrupt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_TYPE_FEATURE_COUNT = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LatencyTimingConstraintTypeImpl <em>Latency Timing Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LatencyTimingConstraintTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getLatencyTimingConstraintType()
	 * @generated
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE__COMMENTS = TIMING_CONSTRAINT_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE__CUSTOM_DATA = TIMING_CONSTRAINT_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE__TOOL = TIMING_CONSTRAINT_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE__VENDOR = TIMING_CONSTRAINT_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE__VERSION = TIMING_CONSTRAINT_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Chain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE__EVENT_CHAIN_ID = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Latency Timing Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_TIMING_CONSTRAINT_TYPE_FEATURE_COUNT = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LinBusTypeImpl <em>Lin Bus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LinBusTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getLinBusType()
	 * @generated
	 */
	int LIN_BUS_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__COMMENTS = SCHEDULING_ENTITY_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__TOOL = SCHEDULING_ENTITY_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__VENDOR = SCHEDULING_ENTITY_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__VERSION = SCHEDULING_ENTITY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__UUID = SCHEDULING_ENTITY_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__CLOCK = SCHEDULING_ENTITY_TYPE__CLOCK;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__EVENT_DESCRIPTION = SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__TRACING_OVERHEAD_CONTAINER = SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__ELEMENT = SCHEDULING_ENTITY_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__TRACES = SCHEDULING_ENTITY_TYPE__TRACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE__NAME = SCHEDULING_ENTITY_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Lin Bus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIN_BUS_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.MessageTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__COMMENTS = COMMUNICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__CUSTOM_DATA = COMMUNICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__TOOL = COMMUNICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__VENDOR = COMMUNICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__VERSION = COMMUNICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__ID = COMMUNICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__ELEMENT = COMMUNICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__TIMING_VALUES = COMMUNICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__TIMING_CONSTRAINTS = COMMUNICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__NAME = COMMUNICATION_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = COMMUNICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.MostBusTypeImpl <em>Most Bus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.MostBusTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getMostBusType()
	 * @generated
	 */
	int MOST_BUS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__COMMENTS = SCHEDULING_ENTITY_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__TOOL = SCHEDULING_ENTITY_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__VENDOR = SCHEDULING_ENTITY_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__VERSION = SCHEDULING_ENTITY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__UUID = SCHEDULING_ENTITY_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__CLOCK = SCHEDULING_ENTITY_TYPE__CLOCK;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__EVENT_DESCRIPTION = SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__TRACING_OVERHEAD_CONTAINER = SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__ELEMENT = SCHEDULING_ENTITY_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__TRACES = SCHEDULING_ENTITY_TYPE__TRACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE__NAME = SCHEDULING_ENTITY_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Most Bus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOST_BUS_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OffsetTimingConstraintTypeImpl <em>Offset Timing Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OffsetTimingConstraintTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOffsetTimingConstraintType()
	 * @generated
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__COMMENTS = TIMING_CONSTRAINT_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__CUSTOM_DATA = TIMING_CONSTRAINT_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__TOOL = TIMING_CONSTRAINT_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__VENDOR = TIMING_CONSTRAINT_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__VERSION = TIMING_CONSTRAINT_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__SOURCE_EVENT_ID = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE__TARGET_EVENT_ID = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Offset Timing Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_TIMING_CONSTRAINT_TYPE_FEATURE_COUNT = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OsekOsTypeImpl <em>Osek Os Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OsekOsTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOsekOsType()
	 * @generated
	 */
	int OSEK_OS_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__COMMENTS = SCHEDULING_ENTITY_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__TOOL = SCHEDULING_ENTITY_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__VENDOR = SCHEDULING_ENTITY_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__VERSION = SCHEDULING_ENTITY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__UUID = SCHEDULING_ENTITY_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__CLOCK = SCHEDULING_ENTITY_TYPE__CLOCK;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__EVENT_DESCRIPTION = SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__TRACING_OVERHEAD_CONTAINER = SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__ELEMENT = SCHEDULING_ENTITY_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__TRACES = SCHEDULING_ENTITY_TYPE__TRACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__NAME = SCHEDULING_ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Kernel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE__KERNEL_PRIORITY = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Osek Os Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OS_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1HexTraceTypeImpl <em>Hex Trace Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1HexTraceTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOT1HexTraceType()
	 * @generated
	 */
	int OT1_HEX_TRACE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_HEX_TRACE_TYPE__COMMENTS = ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_HEX_TRACE_TYPE__CUSTOM_DATA = ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_HEX_TRACE_TYPE__TOOL = ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_HEX_TRACE_TYPE__VENDOR = ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_HEX_TRACE_TYPE__VERSION = ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_HEX_TRACE_TYPE__DATA = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hex Trace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_HEX_TRACE_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TraceLinkTypeImpl <em>Trace Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TraceLinkTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOT1TraceLinkType()
	 * @generated
	 */
	int OT1_TRACE_LINK_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TRACE_LINK_TYPE__COMMENTS = ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TRACE_LINK_TYPE__CUSTOM_DATA = ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TRACE_LINK_TYPE__TOOL = ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TRACE_LINK_TYPE__VENDOR = ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TRACE_LINK_TYPE__VERSION = ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TRACE_LINK_TYPE__LINK = ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TRACE_LINK_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1Type1Impl <em>Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1Type1Impl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOT1Type1()
	 * @generated
	 */
	int OT1_TYPE1 = 39;

	/**
	 * The feature id for the '<em><b>Scheduling Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE1__SCHEDULING_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE1__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OT1_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PduTypeImpl <em>Pdu Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PduTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getPduType()
	 * @generated
	 */
	int PDU_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__COMMENTS = COMMUNICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__CUSTOM_DATA = COMMUNICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__TOOL = COMMUNICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__VENDOR = COMMUNICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__VERSION = COMMUNICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__ID = COMMUNICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__ELEMENT = COMMUNICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__TIMING_VALUES = COMMUNICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__TIMING_CONSTRAINTS = COMMUNICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE__NAME = COMMUNICATION_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Pdu Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDU_TYPE_FEATURE_COUNT = COMMUNICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PeriodicEventTriggeringConstraintTypeImpl <em>Periodic Event Triggering Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PeriodicEventTriggeringConstraintTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getPeriodicEventTriggeringConstraintType()
	 * @generated
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__COMMENTS = EVENT_TRIGGERING_CONSTRAINT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__CUSTOM_DATA = EVENT_TRIGGERING_CONSTRAINT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__TOOL = EVENT_TRIGGERING_CONSTRAINT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__VENDOR = EVENT_TRIGGERING_CONSTRAINT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__VERSION = EVENT_TRIGGERING_CONSTRAINT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID = EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Periodic Event Triggering Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PosixOsTypeImpl <em>Posix Os Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PosixOsTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getPosixOsType()
	 * @generated
	 */
	int POSIX_OS_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__COMMENTS = SCHEDULING_ENTITY_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__TOOL = SCHEDULING_ENTITY_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__VENDOR = SCHEDULING_ENTITY_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__VERSION = SCHEDULING_ENTITY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__UUID = SCHEDULING_ENTITY_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__CLOCK = SCHEDULING_ENTITY_TYPE__CLOCK;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__EVENT_DESCRIPTION = SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__TRACING_OVERHEAD_CONTAINER = SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__ELEMENT = SCHEDULING_ENTITY_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__TRACES = SCHEDULING_ENTITY_TYPE__TRACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE__NAME = SCHEDULING_ENTITY_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Posix Os Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSIX_OS_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ProcessTypeImpl <em>Process Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ProcessTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getProcessType()
	 * @generated
	 */
	int PROCESS_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__COMMENTS = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__CUSTOM_DATA = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__TOOL = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__VENDOR = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__VERSION = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__ID = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__ELEMENT = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__TIMING_VALUES = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__TIMING_CONSTRAINTS = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE__NAME = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Process Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TYPE_FEATURE_COUNT = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.RunnableTypeImpl <em>Runnable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.RunnableTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getRunnableType()
	 * @generated
	 */
	int RUNNABLE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__COMMENTS = APPLICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__CUSTOM_DATA = APPLICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__TOOL = APPLICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__VENDOR = APPLICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__VERSION = APPLICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__ID = APPLICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__ELEMENT = APPLICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__TIMING_VALUES = APPLICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__TIMING_CONSTRAINTS = APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE__NAME = APPLICATION_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Runnable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_TYPE_FEATURE_COUNT = APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SignalTypeImpl <em>Signal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SignalTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__COMMENTS = COMMUNICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__CUSTOM_DATA = COMMUNICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__TOOL = COMMUNICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__VENDOR = COMMUNICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__VERSION = COMMUNICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__ID = COMMUNICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__ELEMENT = COMMUNICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__TIMING_VALUES = COMMUNICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__TIMING_CONSTRAINTS = COMMUNICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE__NAME = COMMUNICATION_ELEMENT_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Signal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TYPE_FEATURE_COUNT = COMMUNICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SporadicEventTriggeringConstraintTypeImpl <em>Sporadic Event Triggering Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SporadicEventTriggeringConstraintTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSporadicEventTriggeringConstraintType()
	 * @generated
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__COMMENTS = EVENT_TRIGGERING_CONSTRAINT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__CUSTOM_DATA = EVENT_TRIGGERING_CONSTRAINT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__TOOL = EVENT_TRIGGERING_CONSTRAINT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__VENDOR = EVENT_TRIGGERING_CONSTRAINT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__VERSION = EVENT_TRIGGERING_CONSTRAINT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID = EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sporadic Event Triggering Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT = EVENT_TRIGGERING_CONSTRAINT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SymbolRangeTypeImpl <em>Symbol Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SymbolRangeTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSymbolRangeType()
	 * @generated
	 */
	int SYMBOL_RANGE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>End Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_RANGE_TYPE__END_SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Start Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_RANGE_TYPE__START_SYMBOL = 1;

	/**
	 * The number of structural features of the '<em>Symbol Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_RANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TaskTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__COMMENTS = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__CUSTOM_DATA = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TOOL = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__VENDOR = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__VERSION = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ID = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ELEMENT = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TIMING_VALUES = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TIMING_CONSTRAINTS = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__OFFSET = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PERIOD = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PRIORITY = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__TYPE = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ThreadTypeImpl <em>Thread Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ThreadTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getThreadType()
	 * @generated
	 */
	int THREAD_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__COMMENTS = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__CUSTOM_DATA = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__TOOL = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__VENDOR = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__VERSION = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__ID = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__ELEMENT = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__TIMING_VALUES = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__TIMING_CONSTRAINTS = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__NAME = SCHEDULABLE_APPLICATION_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE__PRIORITY = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thread Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_TYPE_FEATURE_COUNT = SCHEDULABLE_APPLICATION_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeValueTypeImpl <em>Time Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeValueTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeValueType()
	 * @generated
	 */
	int TIME_VALUE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_TYPE__DENOMINATOR = 0;

	/**
	 * The feature id for the '<em><b>Nominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_TYPE__NOMINATOR = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_TYPE__UNIT = 2;

	/**
	 * The number of structural features of the '<em>Time Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintsTypeImpl <em>Timing Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintsTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingConstraintsType()
	 * @generated
	 */
	int TIMING_CONSTRAINTS_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Timing Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Timing Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationConstraintTypeImpl <em>Timing Information Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationConstraintTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationConstraintType()
	 * @generated
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE__COMMENTS = TIMING_CONSTRAINT_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE__CUSTOM_DATA = TIMING_CONSTRAINT_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE__TOOL = TIMING_CONSTRAINT_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE__VENDOR = TIMING_CONSTRAINT_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE__VERSION = TIMING_CONSTRAINT_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timing Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timing Information Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_CONSTRAINT_TYPE_FEATURE_COUNT = TIMING_CONSTRAINT_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationElementTypeImpl <em>Timing Information Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationElementTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationElementType()
	 * @generated
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__COMMENTS = TIMING_VALUE_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__CUSTOM_DATA = TIMING_VALUE_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__TOOL = TIMING_VALUE_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__VENDOR = TIMING_VALUE_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__VERSION = TIMING_VALUE_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__REQUEST = TIMING_VALUE_ELEMENT_TYPE__REQUEST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__SOURCE = TIMING_VALUE_ELEMENT_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__VALUE = TIMING_VALUE_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE = TIMING_VALUE_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE__TYPE = TIMING_VALUE_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timing Information Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_INFORMATION_ELEMENT_TYPE_FEATURE_COUNT = TIMING_VALUE_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValuesTypeImpl <em>Timing Values Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValuesTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingValuesType()
	 * @generated
	 */
	int TIMING_VALUES_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Timing Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUES_TYPE__TIMING_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Timing Values Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_VALUES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceCommentTypeImpl <em>Trace Comment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceCommentTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTraceCommentType()
	 * @generated
	 */
	int TRACE_COMMENT_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE__COMMENTS = OT1_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE__CUSTOM_DATA = OT1_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE__TOOL = OT1_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE__VENDOR = OT1_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE__VERSION = OT1_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE__COMMENT = OT1_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE__TIME1 = OT1_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE__TIME2 = OT1_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trace Comment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_TYPE_FEATURE_COUNT = OT1_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceEntryTypeImpl <em>Trace Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceEntryTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTraceEntryType()
	 * @generated
	 */
	int TRACE_ENTRY_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY_TYPE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Element Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY_TYPE__ELEMENT_REF_ID = 1;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY_TYPE__EVENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY_TYPE__TIME = 3;

	/**
	 * The number of structural features of the '<em>Trace Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ENTRY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracesTypeImpl <em>Traces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracesTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracesType()
	 * @generated
	 */
	int TRACES_TYPE = 64;

	/**
	 * The feature id for the '<em><b>OT1 Trace Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_TYPE__OT1_TRACE_LINK = 0;

	/**
	 * The feature id for the '<em><b>OT1 Hex Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_TYPE__OT1_HEX_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Xml Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_TYPE__XML_TRACE = 2;

	/**
	 * The number of structural features of the '<em>Traces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadContainerTypeImpl <em>Tracing Overhead Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadContainerTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracingOverheadContainerType()
	 * @generated
	 */
	int TRACING_OVERHEAD_CONTAINER_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_CONTAINER_TYPE__COMMENTS = OT1_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_CONTAINER_TYPE__CUSTOM_DATA = OT1_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_CONTAINER_TYPE__TOOL = OT1_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_CONTAINER_TYPE__VENDOR = OT1_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_CONTAINER_TYPE__VERSION = OT1_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD = OT1_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tracing Overhead Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_CONTAINER_TYPE_FEATURE_COUNT = OT1_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadTypeImpl <em>Tracing Overhead Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracingOverheadType()
	 * @generated
	 */
	int TRACING_OVERHEAD_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE__COMMENTS = OT1_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE__CUSTOM_DATA = OT1_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE__TOOL = OT1_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE__VENDOR = OT1_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE__VERSION = OT1_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE__TIME = OT1_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE__EVENT_ID = OT1_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE__TYPE = OT1_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tracing Overhead Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_OVERHEAD_TYPE_FEATURE_COUNT = OT1_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.VariableTypeImpl <em>Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.VariableTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__COMMENTS = DATA_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__CUSTOM_DATA = DATA_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__TOOL = DATA_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__VENDOR = DATA_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__VERSION = DATA_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__ID = DATA_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__ELEMENT = DATA_ELEMENT_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__TIMING_VALUES = DATA_ELEMENT_TYPE__TIMING_VALUES;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__TIMING_CONSTRAINTS = DATA_ELEMENT_TYPE__TIMING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__NAME = DATA_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__LENGTH = DATA_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_FEATURE_COUNT = DATA_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.WindowsOsTypeImpl <em>Windows Os Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.WindowsOsTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getWindowsOsType()
	 * @generated
	 */
	int WINDOWS_OS_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__COMMENTS = SCHEDULING_ENTITY_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__CUSTOM_DATA = SCHEDULING_ENTITY_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__TOOL = SCHEDULING_ENTITY_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__VENDOR = SCHEDULING_ENTITY_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__VERSION = SCHEDULING_ENTITY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__UUID = SCHEDULING_ENTITY_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__CLOCK = SCHEDULING_ENTITY_TYPE__CLOCK;

	/**
	 * The feature id for the '<em><b>Event Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__EVENT_DESCRIPTION = SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tracing Overhead Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__TRACING_OVERHEAD_CONTAINER = SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__ELEMENT = SCHEDULING_ENTITY_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__TRACES = SCHEDULING_ENTITY_TYPE__TRACES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE__NAME = SCHEDULING_ENTITY_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Windows Os Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OS_TYPE_FEATURE_COUNT = SCHEDULING_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.XmlTraceTypeImpl <em>Xml Trace Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.XmlTraceTypeImpl
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getXmlTraceType()
	 * @generated
	 */
	int XML_TRACE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE__COMMENTS = UNIQUE_ELEMENT_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE__CUSTOM_DATA = UNIQUE_ELEMENT_TYPE__CUSTOM_DATA;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE__TOOL = UNIQUE_ELEMENT_TYPE__TOOL;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE__VENDOR = UNIQUE_ELEMENT_TYPE__VENDOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE__VERSION = UNIQUE_ELEMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE__UUID = UNIQUE_ELEMENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Trace Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE__TRACE_ENTRY = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trace Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE__TRACE_COMMENT = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Trace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TRACE_TYPE_FEATURE_COUNT = UNIQUE_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum <em>Event Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventTypeEnum()
	 * @generated
	 */
	int EVENT_TYPE_ENUM = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum <em>Execution Order Constraint Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getExecutionOrderConstraintTypeEnum()
	 * @generated
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum <em>Interrupt Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getInterruptTypeEnum()
	 * @generated
	 */
	int INTERRUPT_TYPE_ENUM = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum <em>Latency Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getLatencyTypeEnum()
	 * @generated
	 */
	int LATENCY_TYPE_ENUM = 75;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum <em>Task Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTaskTypeEnum()
	 * @generated
	 */
	int TASK_TYPE_ENUM = 76;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum <em>Threshold Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getThresholdTypeEnum()
	 * @generated
	 */
	int THRESHOLD_TYPE_ENUM = 77;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum <em>Time Base Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeBaseEnum()
	 * @generated
	 */
	int TIME_BASE_ENUM = 78;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum <em>Timing Information Source Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationSourceEnum()
	 * @generated
	 */
	int TIMING_INFORMATION_SOURCE_ENUM = 79;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum <em>Timing Information Sub Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationSubTypeEnum()
	 * @generated
	 */
	int TIMING_INFORMATION_SUB_TYPE_ENUM = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum <em>Timing Information Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationTypeEnum()
	 * @generated
	 */
	int TIMING_INFORMATION_TYPE_ENUM = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum <em>Tracing Overhead Description Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracingOverheadDescriptionEnum()
	 * @generated
	 */
	int TRACING_OVERHEAD_DESCRIPTION_ENUM = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType <em>Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 83;

	/**
	 * The meta object id for the '<em>Event Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventTypeEnumObject()
	 * @generated
	 */
	int EVENT_TYPE_ENUM_OBJECT = 84;

	/**
	 * The meta object id for the '<em>Execution Order Constraint Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getExecutionOrderConstraintTypeEnumObject()
	 * @generated
	 */
	int EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Interrupt Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getInterruptTypeEnumObject()
	 * @generated
	 */
	int INTERRUPT_TYPE_ENUM_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Latency Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getLatencyTypeEnumObject()
	 * @generated
	 */
	int LATENCY_TYPE_ENUM_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Task Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTaskTypeEnumObject()
	 * @generated
	 */
	int TASK_TYPE_ENUM_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Threshold Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getThresholdTypeEnumObject()
	 * @generated
	 */
	int THRESHOLD_TYPE_ENUM_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Time Base Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeBaseEnumObject()
	 * @generated
	 */
	int TIME_BASE_ENUM_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Timing Information Source Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationSourceEnumObject()
	 * @generated
	 */
	int TIMING_INFORMATION_SOURCE_ENUM_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Timing Information Sub Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationSubTypeEnumObject()
	 * @generated
	 */
	int TIMING_INFORMATION_SUB_TYPE_ENUM_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Timing Information Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationTypeEnumObject()
	 * @generated
	 */
	int TIMING_INFORMATION_TYPE_ENUM_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Tracing Overhead Description Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracingOverheadDescriptionEnumObject()
	 * @generated
	 */
	int TRACING_OVERHEAD_DESCRIPTION_ENUM_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Version Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getVersionTypeObject()
	 * @generated
	 */
	int VERSION_TYPE_OBJECT = 95;


	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType <em>Address Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Range Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType
	 * @generated
	 */
	EClass getAddressRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType#getEndAddress <em>End Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Address</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType#getEndAddress()
	 * @see #getAddressRangeType()
	 * @generated
	 */
	EAttribute getAddressRangeType_EndAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType#getStartAddress <em>Start Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Address</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType#getStartAddress()
	 * @see #getAddressRangeType()
	 * @generated
	 */
	EAttribute getAddressRangeType_StartAddress();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType <em>Any Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Data Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType
	 * @generated
	 */
	EClass getAnyDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getAny()
	 * @see #getAnyDataType()
	 * @generated
	 */
	EAttribute getAnyDataType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getTool()
	 * @see #getAnyDataType()
	 * @generated
	 */
	EAttribute getAnyDataType_Tool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getVendor()
	 * @see #getAnyDataType()
	 * @generated
	 */
	EAttribute getAnyDataType_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getVersion()
	 * @see #getAnyDataType()
	 * @generated
	 */
	EAttribute getAnyDataType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ApplicationElementType <em>Application Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ApplicationElementType
	 * @generated
	 */
	EClass getApplicationElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType <em>Arbitrary Event Triggering Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Event Triggering Constraint Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType
	 * @generated
	 */
	EClass getArbitraryEventTriggeringConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType#getLowerBound()
	 * @see #getArbitraryEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getArbitraryEventTriggeringConstraintType_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType#getUpperBound()
	 * @see #getArbitraryEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getArbitraryEventTriggeringConstraintType_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType <em>Arbitrary Event Triggering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Event Triggering Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType
	 * @generated
	 */
	EClass getArbitraryEventTriggeringType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType#getMinDistance <em>Min Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min Distance</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType#getMinDistance()
	 * @see #getArbitraryEventTriggeringType()
	 * @generated
	 */
	EReference getArbitraryEventTriggeringType_MinDistance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType#getMaxDistance <em>Max Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max Distance</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType#getMaxDistance()
	 * @see #getArbitraryEventTriggeringType()
	 * @generated
	 */
	EReference getArbitraryEventTriggeringType_MaxDistance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType <em>Autosar Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autosar Os Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType
	 * @generated
	 */
	EClass getAutosarOsType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType#getKernelPriority <em>Kernel Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel Priority</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType#getKernelPriority()
	 * @see #getAutosarOsType()
	 * @generated
	 */
	EAttribute getAutosarOsType_KernelPriority();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CanBusType <em>Can Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Can Bus Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CanBusType
	 * @generated
	 */
	EClass getCanBusType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType
	 * @generated
	 */
	EClass getClockType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType#getTickduration <em>Tickduration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tickduration</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType#getTickduration()
	 * @see #getClockType()
	 * @generated
	 */
	EReference getClockType_Tickduration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType#getMaxAbsTime <em>Max Abs Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Abs Time</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType#getMaxAbsTime()
	 * @see #getClockType()
	 * @generated
	 */
	EAttribute getClockType_MaxAbsTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType <em>Code Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType
	 * @generated
	 */
	EClass getCodeBlockType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType#getAddressRange <em>Address Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Range</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType#getAddressRange()
	 * @see #getCodeBlockType()
	 * @generated
	 */
	EReference getCodeBlockType_AddressRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType#getSymbolRange <em>Symbol Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symbol Range</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType#getSymbolRange()
	 * @see #getCodeBlockType()
	 * @generated
	 */
	EReference getCodeBlockType_SymbolRange();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CommentDataType <em>Comment Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Data Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CommentDataType
	 * @generated
	 */
	EClass getCommentDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CommentDataType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CommentDataType#getComment()
	 * @see #getCommentDataType()
	 * @generated
	 */
	EAttribute getCommentDataType_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CommunicationElementType <em>Communication Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CommunicationElementType
	 * @generated
	 */
	EClass getCommunicationElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CustomDataType <em>Custom Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Data Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CustomDataType
	 * @generated
	 */
	EClass getCustomDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CustomDataType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.CustomDataType#getData()
	 * @see #getCustomDataType()
	 * @generated
	 */
	EReference getCustomDataType_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DataElementType <em>Data Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DataElementType
	 * @generated
	 */
	EClass getDataElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType <em>Data Range Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType
	 * @generated
	 */
	EClass getDataRangeElementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType#getAddressRange <em>Address Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Range</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType#getAddressRange()
	 * @see #getDataRangeElementType()
	 * @generated
	 */
	EReference getDataRangeElementType_AddressRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType#getSymbolRange <em>Symbol Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symbol Range</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType#getSymbolRange()
	 * @see #getDataRangeElementType()
	 * @generated
	 */
	EReference getDataRangeElementType_SymbolRange();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot#getOT1 <em>OT1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OT1</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot#getOT1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OT1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType <em>Event Chain Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Chain Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType
	 * @generated
	 */
	EClass getEventChainElementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType#getEventChain <em>Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Chain</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType#getEventChain()
	 * @see #getEventChainElementType()
	 * @generated
	 */
	EReference getEventChainElementType_EventChain();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType <em>Event Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Chain Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType
	 * @generated
	 */
	EClass getEventChainType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getStimulusEventReference <em>Stimulus Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus Event Reference</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getStimulusEventReference()
	 * @see #getEventChainType()
	 * @generated
	 */
	EReference getEventChainType_StimulusEventReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getInterChainEventReferenceId <em>Inter Chain Event Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inter Chain Event Reference Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getInterChainEventReferenceId()
	 * @see #getEventChainType()
	 * @generated
	 */
	EAttribute getEventChainType_InterChainEventReferenceId();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getResponseEventReference <em>Response Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Event Reference</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainType#getResponseEventReference()
	 * @see #getEventChainType()
	 * @generated
	 */
	EReference getEventChainType_ResponseEventReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType <em>Event Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Description Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType
	 * @generated
	 */
	EClass getEventDescriptionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType#getEventIdMapping <em>Event Id Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Id Mapping</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType#getEventIdMapping()
	 * @see #getEventDescriptionType()
	 * @generated
	 */
	EReference getEventDescriptionType_EventIdMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType <em>Event Id Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Id Mapping Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType
	 * @generated
	 */
	EClass getEventIdMappingType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventId <em>Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventId()
	 * @see #getEventIdMappingType()
	 * @generated
	 */
	EAttribute getEventIdMappingType_EventId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType#getEventType()
	 * @see #getEventIdMappingType()
	 * @generated
	 */
	EAttribute getEventIdMappingType_EventType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType <em>Event Reference Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Reference Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType
	 * @generated
	 */
	EClass getEventReferenceElementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType#getEventReference <em>Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Reference</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType#getEventReference()
	 * @see #getEventReferenceElementType()
	 * @generated
	 */
	EReference getEventReferenceElementType_EventReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType <em>Event Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Reference Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType
	 * @generated
	 */
	EClass getEventReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getElementRefId <em>Element Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Ref Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getElementRefId()
	 * @see #getEventReferenceType()
	 * @generated
	 */
	EAttribute getEventReferenceType_ElementRefId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceType#getEventType()
	 * @see #getEventReferenceType()
	 * @generated
	 */
	EAttribute getEventReferenceType_EventType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringConstraintType <em>Event Triggering Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Triggering Constraint Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringConstraintType
	 * @generated
	 */
	EClass getEventTriggeringConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringConstraintType#getEventId <em>Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringConstraintType#getEventId()
	 * @see #getEventTriggeringConstraintType()
	 * @generated
	 */
	EAttribute getEventTriggeringConstraintType_EventId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType <em>Event Triggering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Triggering Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType
	 * @generated
	 */
	EClass getEventTriggeringType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType#getEventReference <em>Event Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Reference</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTriggeringType#getEventReference()
	 * @see #getEventTriggeringType()
	 * @generated
	 */
	EReference getEventTriggeringType_EventReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType <em>Execution Order Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Order Constraint Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType
	 * @generated
	 */
	EClass getExecutionOrderConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType#getEventChainId <em>Event Chain Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Chain Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType#getEventChainId()
	 * @see #getExecutionOrderConstraintType()
	 * @generated
	 */
	EAttribute getExecutionOrderConstraintType_EventChainId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintType#getType()
	 * @see #getExecutionOrderConstraintType()
	 * @generated
	 */
	EAttribute getExecutionOrderConstraintType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.FlexRayBusType <em>Flex Ray Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flex Ray Bus Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.FlexRayBusType
	 * @generated
	 */
	EClass getFlexRayBusType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.FrameElementType <em>Frame Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.FrameElementType
	 * @generated
	 */
	EClass getFrameElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.IdentifiableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.IdentifiableElement#getId()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType <em>Interrupt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType
	 * @generated
	 */
	EClass getInterruptType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getPriority()
	 * @see #getInterruptType()
	 * @generated
	 */
	EAttribute getInterruptType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getType()
	 * @see #getInterruptType()
	 * @generated
	 */
	EAttribute getInterruptType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType <em>Latency Timing Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Timing Constraint Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType
	 * @generated
	 */
	EClass getLatencyTimingConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getMinimum()
	 * @see #getLatencyTimingConstraintType()
	 * @generated
	 */
	EReference getLatencyTimingConstraintType_Minimum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getMaximum()
	 * @see #getLatencyTimingConstraintType()
	 * @generated
	 */
	EReference getLatencyTimingConstraintType_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getEventChainId <em>Event Chain Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Chain Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType#getEventChainId()
	 * @see #getLatencyTimingConstraintType()
	 * @generated
	 */
	EAttribute getLatencyTimingConstraintType_EventChainId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LinBusType <em>Lin Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lin Bus Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LinBusType
	 * @generated
	 */
	EClass getLinBusType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.MostBusType <em>Most Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Most Bus Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.MostBusType
	 * @generated
	 */
	EClass getMostBusType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType <em>Offset Timing Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset Timing Constraint Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType
	 * @generated
	 */
	EClass getOffsetTimingConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getMinimum()
	 * @see #getOffsetTimingConstraintType()
	 * @generated
	 */
	EReference getOffsetTimingConstraintType_Minimum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getMaximum()
	 * @see #getOffsetTimingConstraintType()
	 * @generated
	 */
	EReference getOffsetTimingConstraintType_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getSourceEventId <em>Source Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Event Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getSourceEventId()
	 * @see #getOffsetTimingConstraintType()
	 * @generated
	 */
	EAttribute getOffsetTimingConstraintType_SourceEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getTargetEventId <em>Target Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Event Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getTargetEventId()
	 * @see #getOffsetTimingConstraintType()
	 * @generated
	 */
	EAttribute getOffsetTimingConstraintType_TargetEventId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OsekOsType <em>Osek Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osek Os Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OsekOsType
	 * @generated
	 */
	EClass getOsekOsType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OsekOsType#getKernelPriority <em>Kernel Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel Priority</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OsekOsType#getKernelPriority()
	 * @see #getOsekOsType()
	 * @generated
	 */
	EAttribute getOsekOsType_KernelPriority();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType <em>Hex Trace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hex Trace Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType
	 * @generated
	 */
	EClass getOT1HexTraceType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType#getData()
	 * @see #getOT1HexTraceType()
	 * @generated
	 */
	EAttribute getOT1HexTraceType_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType <em>Trace Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType
	 * @generated
	 */
	EClass getOT1TraceLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType#getLink()
	 * @see #getOT1TraceLinkType()
	 * @generated
	 */
	EAttribute getOT1TraceLinkType_Link();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type
	 * @generated
	 */
	EClass getOT1Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comments</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getComments()
	 * @see #getOT1Type()
	 * @generated
	 */
	EReference getOT1Type_Comments();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getCustomData <em>Custom Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Data</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getCustomData()
	 * @see #getOT1Type()
	 * @generated
	 */
	EReference getOT1Type_CustomData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getTool()
	 * @see #getOT1Type()
	 * @generated
	 */
	EAttribute getOT1Type_Tool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getVendor()
	 * @see #getOT1Type()
	 * @generated
	 */
	EAttribute getOT1Type_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getVersion()
	 * @see #getOT1Type()
	 * @generated
	 */
	EAttribute getOT1Type_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type1</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1
	 * @generated
	 */
	EClass getOT1Type1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getSchedulingEntity <em>Scheduling Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Entity</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getSchedulingEntity()
	 * @see #getOT1Type1()
	 * @generated
	 */
	EReference getOT1Type1_SchedulingEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getVersion()
	 * @see #getOT1Type1()
	 * @generated
	 */
	EAttribute getOT1Type1_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PduType <em>Pdu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pdu Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PduType
	 * @generated
	 */
	EClass getPduType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType <em>Periodic Event Triggering Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Event Triggering Constraint Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType
	 * @generated
	 */
	EClass getPeriodicEventTriggeringConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType#getPeriod()
	 * @see #getPeriodicEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getPeriodicEventTriggeringConstraintType_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType#getJitter()
	 * @see #getPeriodicEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getPeriodicEventTriggeringConstraintType_Jitter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType#getMinInterArrivalTime <em>Min Inter Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Inter Arrival Time</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType#getMinInterArrivalTime()
	 * @see #getPeriodicEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getPeriodicEventTriggeringConstraintType_MinInterArrivalTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.PosixOsType <em>Posix Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Posix Os Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.PosixOsType
	 * @generated
	 */
	EClass getPosixOsType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ProcessType
	 * @generated
	 */
	EClass getProcessType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.RunnableType <em>Runnable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.RunnableType
	 * @generated
	 */
	EClass getRunnableType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulableApplicationElementType <em>Schedulable Application Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedulable Application Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulableApplicationElementType
	 * @generated
	 */
	EClass getSchedulableApplicationElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType <em>Scheduling Entity Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Entity Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType
	 * @generated
	 */
	EClass getSchedulingEntityElementType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getElement()
	 * @see #getSchedulingEntityElementType()
	 * @generated
	 */
	EReference getSchedulingEntityElementType_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getTimingValues <em>Timing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Values</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getTimingValues()
	 * @see #getSchedulingEntityElementType()
	 * @generated
	 */
	EReference getSchedulingEntityElementType_TimingValues();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getTimingConstraints <em>Timing Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timing Constraints</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getTimingConstraints()
	 * @see #getSchedulingEntityElementType()
	 * @generated
	 */
	EReference getSchedulingEntityElementType_TimingConstraints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getName()
	 * @see #getSchedulingEntityElementType()
	 * @generated
	 */
	EAttribute getSchedulingEntityElementType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType <em>Scheduling Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Entity Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType
	 * @generated
	 */
	EClass getSchedulingEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clock</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getClock()
	 * @see #getSchedulingEntityType()
	 * @generated
	 */
	EReference getSchedulingEntityType_Clock();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getEventDescription <em>Event Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Description</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getEventDescription()
	 * @see #getSchedulingEntityType()
	 * @generated
	 */
	EReference getSchedulingEntityType_EventDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getTracingOverheadContainer <em>Tracing Overhead Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracing Overhead Container</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getTracingOverheadContainer()
	 * @see #getSchedulingEntityType()
	 * @generated
	 */
	EReference getSchedulingEntityType_TracingOverheadContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getElement()
	 * @see #getSchedulingEntityType()
	 * @generated
	 */
	EReference getSchedulingEntityType_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traces</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getTraces()
	 * @see #getSchedulingEntityType()
	 * @generated
	 */
	EReference getSchedulingEntityType_Traces();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType#getName()
	 * @see #getSchedulingEntityType()
	 * @generated
	 */
	EAttribute getSchedulingEntityType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SignalType
	 * @generated
	 */
	EClass getSignalType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType <em>Sporadic Event Triggering Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Event Triggering Constraint Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType
	 * @generated
	 */
	EClass getSporadicEventTriggeringConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getPeriod()
	 * @see #getSporadicEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getSporadicEventTriggeringConstraintType_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getJitter()
	 * @see #getSporadicEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getSporadicEventTriggeringConstraintType_Jitter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getMinInterArrivalTime <em>Min Inter Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Inter Arrival Time</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getMinInterArrivalTime()
	 * @see #getSporadicEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getSporadicEventTriggeringConstraintType_MinInterArrivalTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getMaxInterArrivalTime <em>Max Inter Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Inter Arrival Time</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getMaxInterArrivalTime()
	 * @see #getSporadicEventTriggeringConstraintType()
	 * @generated
	 */
	EReference getSporadicEventTriggeringConstraintType_MaxInterArrivalTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType <em>Symbol Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Range Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType
	 * @generated
	 */
	EClass getSymbolRangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType#getEndSymbol <em>End Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Symbol</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType#getEndSymbol()
	 * @see #getSymbolRangeType()
	 * @generated
	 */
	EAttribute getSymbolRangeType_EndSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType#getStartSymbol <em>Start Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Symbol</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType#getStartSymbol()
	 * @see #getSymbolRangeType()
	 * @generated
	 */
	EAttribute getSymbolRangeType_StartSymbol();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType#getOffset()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType#getPeriod()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType#getPriority()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType#getType()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ThreadType <em>Thread Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThreadType
	 * @generated
	 */
	EClass getThreadType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ThreadType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThreadType#getPriority()
	 * @see #getThreadType()
	 * @generated
	 */
	EAttribute getThreadType_Priority();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType <em>Time Range Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Range Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType
	 * @generated
	 */
	EClass getTimeRangeElementType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType#getLatency()
	 * @see #getTimeRangeElementType()
	 * @generated
	 */
	EAttribute getTimeRangeElementType_Latency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeStampElementType <em>Time Stamp Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamp Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeStampElementType
	 * @generated
	 */
	EClass getTimeStampElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType <em>Time Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Value Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType
	 * @generated
	 */
	EClass getTimeValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getDenominator()
	 * @see #getTimeValueType()
	 * @generated
	 */
	EAttribute getTimeValueType_Denominator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getNominator <em>Nominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominator</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getNominator()
	 * @see #getTimeValueType()
	 * @generated
	 */
	EAttribute getTimeValueType_Nominator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType#getUnit()
	 * @see #getTimeValueType()
	 * @generated
	 */
	EAttribute getTimeValueType_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintElementType <em>Timing Constraint Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Constraint Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintElementType
	 * @generated
	 */
	EClass getTimingConstraintElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType <em>Timing Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Constraints Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType
	 * @generated
	 */
	EClass getTimingConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType#getTimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing Constraint</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingConstraintsType#getTimingConstraint()
	 * @see #getTimingConstraintsType()
	 * @generated
	 */
	EReference getTimingConstraintsType_TimingConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType <em>Timing Information Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Information Constraint Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType
	 * @generated
	 */
	EClass getTimingInformationConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Threshold</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThreshold()
	 * @see #getTimingInformationConstraintType()
	 * @generated
	 */
	EReference getTimingInformationConstraintType_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThresholdType <em>Threshold Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThresholdType()
	 * @see #getTimingInformationConstraintType()
	 * @generated
	 */
	EAttribute getTimingInformationConstraintType_ThresholdType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getTimingValueType <em>Timing Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timing Value Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getTimingValueType()
	 * @see #getTimingInformationConstraintType()
	 * @generated
	 */
	EAttribute getTimingInformationConstraintType_TimingValueType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType <em>Timing Information Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Information Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType
	 * @generated
	 */
	EClass getTimingInformationElementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getValue()
	 * @see #getTimingInformationElementType()
	 * @generated
	 */
	EReference getTimingInformationElementType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getSubType()
	 * @see #getTimingInformationElementType()
	 * @generated
	 */
	EAttribute getTimingInformationElementType_SubType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getType()
	 * @see #getTimingInformationElementType()
	 * @generated
	 */
	EAttribute getTimingInformationElementType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType <em>Timing Value Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Value Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType
	 * @generated
	 */
	EClass getTimingValueElementType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#isRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#isRequest()
	 * @see #getTimingValueElementType()
	 * @generated
	 */
	EAttribute getTimingValueElementType_Request();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#getSource()
	 * @see #getTimingValueElementType()
	 * @generated
	 */
	EAttribute getTimingValueElementType_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType <em>Timing Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Values Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType
	 * @generated
	 */
	EClass getTimingValuesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType#getTimingValue <em>Timing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing Value</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType#getTimingValue()
	 * @see #getTimingValuesType()
	 * @generated
	 */
	EReference getTimingValuesType_TimingValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType <em>Trace Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Comment Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType
	 * @generated
	 */
	EClass getTraceCommentType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getComment()
	 * @see #getTraceCommentType()
	 * @generated
	 */
	EAttribute getTraceCommentType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getTime1 <em>Time1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time1</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getTime1()
	 * @see #getTraceCommentType()
	 * @generated
	 */
	EAttribute getTraceCommentType_Time1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getTime2 <em>Time2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time2</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getTime2()
	 * @see #getTraceCommentType()
	 * @generated
	 */
	EAttribute getTraceCommentType_Time2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType <em>Trace Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Entry Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType
	 * @generated
	 */
	EClass getTraceEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType#getData()
	 * @see #getTraceEntryType()
	 * @generated
	 */
	EAttribute getTraceEntryType_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType#getElementRefId <em>Element Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Ref Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType#getElementRefId()
	 * @see #getTraceEntryType()
	 * @generated
	 */
	EAttribute getTraceEntryType_ElementRefId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType#getEventId <em>Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType#getEventId()
	 * @see #getTraceEntryType()
	 * @generated
	 */
	EAttribute getTraceEntryType_EventId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType#getTime()
	 * @see #getTraceEntryType()
	 * @generated
	 */
	EAttribute getTraceEntryType_Time();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType <em>Traces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traces Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType
	 * @generated
	 */
	EClass getTracesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getOT1TraceLink <em>OT1 Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>OT1 Trace Link</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getOT1TraceLink()
	 * @see #getTracesType()
	 * @generated
	 */
	EReference getTracesType_OT1TraceLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getOT1HexTrace <em>OT1 Hex Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>OT1 Hex Trace</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getOT1HexTrace()
	 * @see #getTracesType()
	 * @generated
	 */
	EReference getTracesType_OT1HexTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getXmlTrace <em>Xml Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xml Trace</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType#getXmlTrace()
	 * @see #getTracesType()
	 * @generated
	 */
	EReference getTracesType_XmlTrace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType <em>Tracing Overhead Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracing Overhead Container Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType
	 * @generated
	 */
	EClass getTracingOverheadContainerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType#getTracingOverhead <em>Tracing Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracing Overhead</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType#getTracingOverhead()
	 * @see #getTracingOverheadContainerType()
	 * @generated
	 */
	EReference getTracingOverheadContainerType_TracingOverhead();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType <em>Tracing Overhead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracing Overhead Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType
	 * @generated
	 */
	EClass getTracingOverheadType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getTime()
	 * @see #getTracingOverheadType()
	 * @generated
	 */
	EReference getTracingOverheadType_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getEventId <em>Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Id</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getEventId()
	 * @see #getTracingOverheadType()
	 * @generated
	 */
	EAttribute getTracingOverheadType_EventId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadType#getType()
	 * @see #getTracingOverheadType()
	 * @generated
	 */
	EAttribute getTracingOverheadType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType <em>Unique Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType
	 * @generated
	 */
	EClass getUniqueElementType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType#getUuid()
	 * @see #getUniqueElementType()
	 * @generated
	 */
	EAttribute getUniqueElementType_Uuid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType
	 * @generated
	 */
	EClass getVariableType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType#getLength()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Length();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VirtualElementType <em>Virtual Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Element Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VirtualElementType
	 * @generated
	 */
	EClass getVirtualElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.WindowsOsType <em>Windows Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windows Os Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.WindowsOsType
	 * @generated
	 */
	EClass getWindowsOsType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType <em>Xml Trace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Trace Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType
	 * @generated
	 */
	EClass getXmlTraceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType#getTraceEntry <em>Trace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Entry</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType#getTraceEntry()
	 * @see #getXmlTraceType()
	 * @generated
	 */
	EReference getXmlTraceType_TraceEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType#getTraceComment <em>Trace Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Comment</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType#getTraceComment()
	 * @see #getXmlTraceType()
	 * @generated
	 */
	EReference getXmlTraceType_TraceComment();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum <em>Event Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum
	 * @generated
	 */
	EEnum getEventTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum <em>Execution Order Constraint Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Order Constraint Type Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum
	 * @generated
	 */
	EEnum getExecutionOrderConstraintTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum <em>Interrupt Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interrupt Type Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum
	 * @generated
	 */
	EEnum getInterruptTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum <em>Latency Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Latency Type Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum
	 * @generated
	 */
	EEnum getLatencyTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum <em>Task Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Type Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum
	 * @generated
	 */
	EEnum getTaskTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum <em>Threshold Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Threshold Type Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum
	 * @generated
	 */
	EEnum getThresholdTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum <em>Time Base Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Base Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum
	 * @generated
	 */
	EEnum getTimeBaseEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum <em>Timing Information Source Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Information Source Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum
	 * @generated
	 */
	EEnum getTimingInformationSourceEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum <em>Timing Information Sub Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Information Sub Type Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum
	 * @generated
	 */
	EEnum getTimingInformationSubTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum <em>Timing Information Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Information Type Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
	 * @generated
	 */
	EEnum getTimingInformationTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum <em>Tracing Overhead Description Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tracing Overhead Description Enum</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum
	 * @generated
	 */
	EEnum getTracingOverheadDescriptionEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Type</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType
	 * @generated
	 */
	EEnum getVersionType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum <em>Event Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Event Type Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum"
	 *        extendedMetaData="name='EventTypeEnum:Object' baseType='EventTypeEnum'"
	 * @generated
	 */
	EDataType getEventTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum <em>Execution Order Constraint Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Execution Order Constraint Type Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum"
	 *        extendedMetaData="name='ExecutionOrderConstraintTypeEnum:Object' baseType='ExecutionOrderConstraintTypeEnum'"
	 * @generated
	 */
	EDataType getExecutionOrderConstraintTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum <em>Interrupt Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interrupt Type Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum"
	 *        extendedMetaData="name='InterruptTypeEnum:Object' baseType='InterruptTypeEnum'"
	 * @generated
	 */
	EDataType getInterruptTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum <em>Latency Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Latency Type Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum"
	 *        extendedMetaData="name='LatencyTypeEnum:Object' baseType='LatencyTypeEnum'"
	 * @generated
	 */
	EDataType getLatencyTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum <em>Task Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Type Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum"
	 *        extendedMetaData="name='TaskTypeEnum:Object' baseType='TaskTypeEnum'"
	 * @generated
	 */
	EDataType getTaskTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum <em>Threshold Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Threshold Type Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum"
	 *        extendedMetaData="name='ThresholdTypeEnum:Object' baseType='ThresholdTypeEnum'"
	 * @generated
	 */
	EDataType getThresholdTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum <em>Time Base Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Base Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum"
	 *        extendedMetaData="name='TimeBaseEnum:Object' baseType='TimeBaseEnum'"
	 * @generated
	 */
	EDataType getTimeBaseEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum <em>Timing Information Source Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timing Information Source Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum"
	 *        extendedMetaData="name='TimingInformationSourceEnum:Object' baseType='TimingInformationSourceEnum'"
	 * @generated
	 */
	EDataType getTimingInformationSourceEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum <em>Timing Information Sub Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timing Information Sub Type Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum"
	 *        extendedMetaData="name='TimingInformationSubTypeEnum:Object' baseType='TimingInformationSubTypeEnum'"
	 * @generated
	 */
	EDataType getTimingInformationSubTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum <em>Timing Information Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timing Information Type Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum"
	 *        extendedMetaData="name='TimingInformationTypeEnum:Object' baseType='TimingInformationTypeEnum'"
	 * @generated
	 */
	EDataType getTimingInformationTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum <em>Tracing Overhead Description Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tracing Overhead Description Enum Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum"
	 *        extendedMetaData="name='TracingOverheadDescriptionEnum:Object' baseType='TracingOverheadDescriptionEnum'"
	 * @generated
	 */
	EDataType getTracingOverheadDescriptionEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType <em>Version Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type Object</em>'.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType
	 * @model instanceClass="org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType"
	 *        extendedMetaData="name='VersionType:Object' baseType='VersionType'"
	 * @generated
	 */
	EDataType getVersionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OT1Factory getOT1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AddressRangeTypeImpl <em>Address Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AddressRangeTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getAddressRangeType()
		 * @generated
		 */
		EClass ADDRESS_RANGE_TYPE = eINSTANCE.getAddressRangeType();

		/**
		 * The meta object literal for the '<em><b>End Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_RANGE_TYPE__END_ADDRESS = eINSTANCE.getAddressRangeType_EndAddress();

		/**
		 * The meta object literal for the '<em><b>Start Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_RANGE_TYPE__START_ADDRESS = eINSTANCE.getAddressRangeType_StartAddress();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AnyDataTypeImpl <em>Any Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AnyDataTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getAnyDataType()
		 * @generated
		 */
		EClass ANY_DATA_TYPE = eINSTANCE.getAnyDataType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_DATA_TYPE__ANY = eINSTANCE.getAnyDataType_Any();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_DATA_TYPE__TOOL = eINSTANCE.getAnyDataType_Tool();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_DATA_TYPE__VENDOR = eINSTANCE.getAnyDataType_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_DATA_TYPE__VERSION = eINSTANCE.getAnyDataType_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ApplicationElementTypeImpl <em>Application Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ApplicationElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getApplicationElementType()
		 * @generated
		 */
		EClass APPLICATION_ELEMENT_TYPE = eINSTANCE.getApplicationElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringConstraintTypeImpl <em>Arbitrary Event Triggering Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringConstraintTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getArbitraryEventTriggeringConstraintType()
		 * @generated
		 */
		EClass ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE = eINSTANCE.getArbitraryEventTriggeringConstraintType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__LOWER_BOUND = eINSTANCE.getArbitraryEventTriggeringConstraintType_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_EVENT_TRIGGERING_CONSTRAINT_TYPE__UPPER_BOUND = eINSTANCE.getArbitraryEventTriggeringConstraintType_UpperBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringTypeImpl <em>Arbitrary Event Triggering Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ArbitraryEventTriggeringTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getArbitraryEventTriggeringType()
		 * @generated
		 */
		EClass ARBITRARY_EVENT_TRIGGERING_TYPE = eINSTANCE.getArbitraryEventTriggeringType();

		/**
		 * The meta object literal for the '<em><b>Min Distance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_EVENT_TRIGGERING_TYPE__MIN_DISTANCE = eINSTANCE.getArbitraryEventTriggeringType_MinDistance();

		/**
		 * The meta object literal for the '<em><b>Max Distance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRARY_EVENT_TRIGGERING_TYPE__MAX_DISTANCE = eINSTANCE.getArbitraryEventTriggeringType_MaxDistance();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AutosarOsTypeImpl <em>Autosar Os Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AutosarOsTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getAutosarOsType()
		 * @generated
		 */
		EClass AUTOSAR_OS_TYPE = eINSTANCE.getAutosarOsType();

		/**
		 * The meta object literal for the '<em><b>Kernel Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOSAR_OS_TYPE__KERNEL_PRIORITY = eINSTANCE.getAutosarOsType_KernelPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CanBusTypeImpl <em>Can Bus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CanBusTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCanBusType()
		 * @generated
		 */
		EClass CAN_BUS_TYPE = eINSTANCE.getCanBusType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ClockTypeImpl <em>Clock Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ClockTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getClockType()
		 * @generated
		 */
		EClass CLOCK_TYPE = eINSTANCE.getClockType();

		/**
		 * The meta object literal for the '<em><b>Tickduration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_TYPE__TICKDURATION = eINSTANCE.getClockType_Tickduration();

		/**
		 * The meta object literal for the '<em><b>Max Abs Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_TYPE__MAX_ABS_TIME = eINSTANCE.getClockType_MaxAbsTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CodeBlockTypeImpl <em>Code Block Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CodeBlockTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCodeBlockType()
		 * @generated
		 */
		EClass CODE_BLOCK_TYPE = eINSTANCE.getCodeBlockType();

		/**
		 * The meta object literal for the '<em><b>Address Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK_TYPE__ADDRESS_RANGE = eINSTANCE.getCodeBlockType_AddressRange();

		/**
		 * The meta object literal for the '<em><b>Symbol Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK_TYPE__SYMBOL_RANGE = eINSTANCE.getCodeBlockType_SymbolRange();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CommentDataTypeImpl <em>Comment Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CommentDataTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCommentDataType()
		 * @generated
		 */
		EClass COMMENT_DATA_TYPE = eINSTANCE.getCommentDataType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_DATA_TYPE__COMMENT = eINSTANCE.getCommentDataType_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CommunicationElementTypeImpl <em>Communication Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CommunicationElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCommunicationElementType()
		 * @generated
		 */
		EClass COMMUNICATION_ELEMENT_TYPE = eINSTANCE.getCommunicationElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CustomDataTypeImpl <em>Custom Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.CustomDataTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getCustomDataType()
		 * @generated
		 */
		EClass CUSTOM_DATA_TYPE = eINSTANCE.getCustomDataType();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_DATA_TYPE__DATA = eINSTANCE.getCustomDataType_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataElementTypeImpl <em>Data Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getDataElementType()
		 * @generated
		 */
		EClass DATA_ELEMENT_TYPE = eINSTANCE.getDataElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataRangeElementTypeImpl <em>Data Range Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DataRangeElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getDataRangeElementType()
		 * @generated
		 */
		EClass DATA_RANGE_ELEMENT_TYPE = eINSTANCE.getDataRangeElementType();

		/**
		 * The meta object literal for the '<em><b>Address Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE_ELEMENT_TYPE__ADDRESS_RANGE = eINSTANCE.getDataRangeElementType_AddressRange();

		/**
		 * The meta object literal for the '<em><b>Symbol Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RANGE_ELEMENT_TYPE__SYMBOL_RANGE = eINSTANCE.getDataRangeElementType_SymbolRange();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.DocumentRootImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>OT1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OT1 = eINSTANCE.getDocumentRoot_OT1();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainElementTypeImpl <em>Event Chain Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventChainElementType()
		 * @generated
		 */
		EClass EVENT_CHAIN_ELEMENT_TYPE = eINSTANCE.getEventChainElementType();

		/**
		 * The meta object literal for the '<em><b>Event Chain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN_ELEMENT_TYPE__EVENT_CHAIN = eINSTANCE.getEventChainElementType_EventChain();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainTypeImpl <em>Event Chain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventChainTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventChainType()
		 * @generated
		 */
		EClass EVENT_CHAIN_TYPE = eINSTANCE.getEventChainType();

		/**
		 * The meta object literal for the '<em><b>Stimulus Event Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN_TYPE__STIMULUS_EVENT_REFERENCE = eINSTANCE.getEventChainType_StimulusEventReference();

		/**
		 * The meta object literal for the '<em><b>Inter Chain Event Reference Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_CHAIN_TYPE__INTER_CHAIN_EVENT_REFERENCE_ID = eINSTANCE.getEventChainType_InterChainEventReferenceId();

		/**
		 * The meta object literal for the '<em><b>Response Event Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN_TYPE__RESPONSE_EVENT_REFERENCE = eINSTANCE.getEventChainType_ResponseEventReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventDescriptionTypeImpl <em>Event Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventDescriptionTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventDescriptionType()
		 * @generated
		 */
		EClass EVENT_DESCRIPTION_TYPE = eINSTANCE.getEventDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Event Id Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_DESCRIPTION_TYPE__EVENT_ID_MAPPING = eINSTANCE.getEventDescriptionType_EventIdMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventIdMappingTypeImpl <em>Event Id Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventIdMappingTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventIdMappingType()
		 * @generated
		 */
		EClass EVENT_ID_MAPPING_TYPE = eINSTANCE.getEventIdMappingType();

		/**
		 * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ID_MAPPING_TYPE__EVENT_ID = eINSTANCE.getEventIdMappingType_EventId();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ID_MAPPING_TYPE__EVENT_TYPE = eINSTANCE.getEventIdMappingType_EventType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceElementTypeImpl <em>Event Reference Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventReferenceElementType()
		 * @generated
		 */
		EClass EVENT_REFERENCE_ELEMENT_TYPE = eINSTANCE.getEventReferenceElementType();

		/**
		 * The meta object literal for the '<em><b>Event Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_REFERENCE_ELEMENT_TYPE__EVENT_REFERENCE = eINSTANCE.getEventReferenceElementType_EventReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceTypeImpl <em>Event Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventReferenceTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventReferenceType()
		 * @generated
		 */
		EClass EVENT_REFERENCE_TYPE = eINSTANCE.getEventReferenceType();

		/**
		 * The meta object literal for the '<em><b>Element Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_REFERENCE_TYPE__ELEMENT_REF_ID = eINSTANCE.getEventReferenceType_ElementRefId();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_REFERENCE_TYPE__EVENT_TYPE = eINSTANCE.getEventReferenceType_EventType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventTriggeringConstraintTypeImpl <em>Event Triggering Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventTriggeringConstraintTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventTriggeringConstraintType()
		 * @generated
		 */
		EClass EVENT_TRIGGERING_CONSTRAINT_TYPE = eINSTANCE.getEventTriggeringConstraintType();

		/**
		 * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TRIGGERING_CONSTRAINT_TYPE__EVENT_ID = eINSTANCE.getEventTriggeringConstraintType_EventId();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventTriggeringTypeImpl <em>Event Triggering Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.EventTriggeringTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventTriggeringType()
		 * @generated
		 */
		EClass EVENT_TRIGGERING_TYPE = eINSTANCE.getEventTriggeringType();

		/**
		 * The meta object literal for the '<em><b>Event Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TRIGGERING_TYPE__EVENT_REFERENCE = eINSTANCE.getEventTriggeringType_EventReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ExecutionOrderConstraintTypeImpl <em>Execution Order Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ExecutionOrderConstraintTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getExecutionOrderConstraintType()
		 * @generated
		 */
		EClass EXECUTION_ORDER_CONSTRAINT_TYPE = eINSTANCE.getExecutionOrderConstraintType();

		/**
		 * The meta object literal for the '<em><b>Event Chain Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ORDER_CONSTRAINT_TYPE__EVENT_CHAIN_ID = eINSTANCE.getExecutionOrderConstraintType_EventChainId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ORDER_CONSTRAINT_TYPE__TYPE = eINSTANCE.getExecutionOrderConstraintType_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FlexRayBusTypeImpl <em>Flex Ray Bus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FlexRayBusTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getFlexRayBusType()
		 * @generated
		 */
		EClass FLEX_RAY_BUS_TYPE = eINSTANCE.getFlexRayBusType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FrameElementTypeImpl <em>Frame Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FrameElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getFrameElementType()
		 * @generated
		 */
		EClass FRAME_ELEMENT_TYPE = eINSTANCE.getFrameElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.FunctionTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.IdentifiableElementImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.InterruptTypeImpl <em>Interrupt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.InterruptTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getInterruptType()
		 * @generated
		 */
		EClass INTERRUPT_TYPE = eINSTANCE.getInterruptType();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_TYPE__PRIORITY = eINSTANCE.getInterruptType_Priority();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERRUPT_TYPE__TYPE = eINSTANCE.getInterruptType_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LatencyTimingConstraintTypeImpl <em>Latency Timing Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LatencyTimingConstraintTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getLatencyTimingConstraintType()
		 * @generated
		 */
		EClass LATENCY_TIMING_CONSTRAINT_TYPE = eINSTANCE.getLatencyTimingConstraintType();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM = eINSTANCE.getLatencyTimingConstraintType_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM = eINSTANCE.getLatencyTimingConstraintType_Maximum();

		/**
		 * The meta object literal for the '<em><b>Event Chain Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY_TIMING_CONSTRAINT_TYPE__EVENT_CHAIN_ID = eINSTANCE.getLatencyTimingConstraintType_EventChainId();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LinBusTypeImpl <em>Lin Bus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LinBusTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getLinBusType()
		 * @generated
		 */
		EClass LIN_BUS_TYPE = eINSTANCE.getLinBusType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.MessageTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.MostBusTypeImpl <em>Most Bus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.MostBusTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getMostBusType()
		 * @generated
		 */
		EClass MOST_BUS_TYPE = eINSTANCE.getMostBusType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OffsetTimingConstraintTypeImpl <em>Offset Timing Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OffsetTimingConstraintTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOffsetTimingConstraintType()
		 * @generated
		 */
		EClass OFFSET_TIMING_CONSTRAINT_TYPE = eINSTANCE.getOffsetTimingConstraintType();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM = eINSTANCE.getOffsetTimingConstraintType_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM = eINSTANCE.getOffsetTimingConstraintType_Maximum();

		/**
		 * The meta object literal for the '<em><b>Source Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET_TIMING_CONSTRAINT_TYPE__SOURCE_EVENT_ID = eINSTANCE.getOffsetTimingConstraintType_SourceEventId();

		/**
		 * The meta object literal for the '<em><b>Target Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET_TIMING_CONSTRAINT_TYPE__TARGET_EVENT_ID = eINSTANCE.getOffsetTimingConstraintType_TargetEventId();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OsekOsTypeImpl <em>Osek Os Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OsekOsTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOsekOsType()
		 * @generated
		 */
		EClass OSEK_OS_TYPE = eINSTANCE.getOsekOsType();

		/**
		 * The meta object literal for the '<em><b>Kernel Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSEK_OS_TYPE__KERNEL_PRIORITY = eINSTANCE.getOsekOsType_KernelPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1HexTraceTypeImpl <em>Hex Trace Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1HexTraceTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOT1HexTraceType()
		 * @generated
		 */
		EClass OT1_HEX_TRACE_TYPE = eINSTANCE.getOT1HexTraceType();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OT1_HEX_TRACE_TYPE__DATA = eINSTANCE.getOT1HexTraceType_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TraceLinkTypeImpl <em>Trace Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TraceLinkTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOT1TraceLinkType()
		 * @generated
		 */
		EClass OT1_TRACE_LINK_TYPE = eINSTANCE.getOT1TraceLinkType();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OT1_TRACE_LINK_TYPE__LINK = eINSTANCE.getOT1TraceLinkType_Link();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOT1Type()
		 * @generated
		 */
		EClass OT1_TYPE = eINSTANCE.getOT1Type();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OT1_TYPE__COMMENTS = eINSTANCE.getOT1Type_Comments();

		/**
		 * The meta object literal for the '<em><b>Custom Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OT1_TYPE__CUSTOM_DATA = eINSTANCE.getOT1Type_CustomData();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OT1_TYPE__TOOL = eINSTANCE.getOT1Type_Tool();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OT1_TYPE__VENDOR = eINSTANCE.getOT1Type_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OT1_TYPE__VERSION = eINSTANCE.getOT1Type_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1Type1Impl <em>Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1Type1Impl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getOT1Type1()
		 * @generated
		 */
		EClass OT1_TYPE1 = eINSTANCE.getOT1Type1();

		/**
		 * The meta object literal for the '<em><b>Scheduling Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OT1_TYPE1__SCHEDULING_ENTITY = eINSTANCE.getOT1Type1_SchedulingEntity();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OT1_TYPE1__VERSION = eINSTANCE.getOT1Type1_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PduTypeImpl <em>Pdu Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PduTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getPduType()
		 * @generated
		 */
		EClass PDU_TYPE = eINSTANCE.getPduType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PeriodicEventTriggeringConstraintTypeImpl <em>Periodic Event Triggering Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PeriodicEventTriggeringConstraintTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getPeriodicEventTriggeringConstraintType()
		 * @generated
		 */
		EClass PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE = eINSTANCE.getPeriodicEventTriggeringConstraintType();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD = eINSTANCE.getPeriodicEventTriggeringConstraintType_Period();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER = eINSTANCE.getPeriodicEventTriggeringConstraintType_Jitter();

		/**
		 * The meta object literal for the '<em><b>Min Inter Arrival Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME = eINSTANCE.getPeriodicEventTriggeringConstraintType_MinInterArrivalTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PosixOsTypeImpl <em>Posix Os Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PosixOsTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getPosixOsType()
		 * @generated
		 */
		EClass POSIX_OS_TYPE = eINSTANCE.getPosixOsType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ProcessTypeImpl <em>Process Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ProcessTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getProcessType()
		 * @generated
		 */
		EClass PROCESS_TYPE = eINSTANCE.getProcessType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.RunnableTypeImpl <em>Runnable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.RunnableTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getRunnableType()
		 * @generated
		 */
		EClass RUNNABLE_TYPE = eINSTANCE.getRunnableType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulableApplicationElementTypeImpl <em>Schedulable Application Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulableApplicationElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSchedulableApplicationElementType()
		 * @generated
		 */
		EClass SCHEDULABLE_APPLICATION_ELEMENT_TYPE = eINSTANCE.getSchedulableApplicationElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityElementTypeImpl <em>Scheduling Entity Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSchedulingEntityElementType()
		 * @generated
		 */
		EClass SCHEDULING_ENTITY_ELEMENT_TYPE = eINSTANCE.getSchedulingEntityElementType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_ENTITY_ELEMENT_TYPE__ELEMENT = eINSTANCE.getSchedulingEntityElementType_Element();

		/**
		 * The meta object literal for the '<em><b>Timing Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_VALUES = eINSTANCE.getSchedulingEntityElementType_TimingValues();

		/**
		 * The meta object literal for the '<em><b>Timing Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_ENTITY_ELEMENT_TYPE__TIMING_CONSTRAINTS = eINSTANCE.getSchedulingEntityElementType_TimingConstraints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_ENTITY_ELEMENT_TYPE__NAME = eINSTANCE.getSchedulingEntityElementType_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl <em>Scheduling Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSchedulingEntityType()
		 * @generated
		 */
		EClass SCHEDULING_ENTITY_TYPE = eINSTANCE.getSchedulingEntityType();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_ENTITY_TYPE__CLOCK = eINSTANCE.getSchedulingEntityType_Clock();

		/**
		 * The meta object literal for the '<em><b>Event Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION = eINSTANCE.getSchedulingEntityType_EventDescription();

		/**
		 * The meta object literal for the '<em><b>Tracing Overhead Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER = eINSTANCE.getSchedulingEntityType_TracingOverheadContainer();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_ENTITY_TYPE__ELEMENT = eINSTANCE.getSchedulingEntityType_Element();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_ENTITY_TYPE__TRACES = eINSTANCE.getSchedulingEntityType_Traces();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_ENTITY_TYPE__NAME = eINSTANCE.getSchedulingEntityType_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SignalTypeImpl <em>Signal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SignalTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSignalType()
		 * @generated
		 */
		EClass SIGNAL_TYPE = eINSTANCE.getSignalType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SporadicEventTriggeringConstraintTypeImpl <em>Sporadic Event Triggering Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SporadicEventTriggeringConstraintTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSporadicEventTriggeringConstraintType()
		 * @generated
		 */
		EClass SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE = eINSTANCE.getSporadicEventTriggeringConstraintType();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD = eINSTANCE.getSporadicEventTriggeringConstraintType_Period();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER = eINSTANCE.getSporadicEventTriggeringConstraintType_Jitter();

		/**
		 * The meta object literal for the '<em><b>Min Inter Arrival Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME = eINSTANCE.getSporadicEventTriggeringConstraintType_MinInterArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Max Inter Arrival Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME = eINSTANCE.getSporadicEventTriggeringConstraintType_MaxInterArrivalTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SymbolRangeTypeImpl <em>Symbol Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SymbolRangeTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getSymbolRangeType()
		 * @generated
		 */
		EClass SYMBOL_RANGE_TYPE = eINSTANCE.getSymbolRangeType();

		/**
		 * The meta object literal for the '<em><b>End Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_RANGE_TYPE__END_SYMBOL = eINSTANCE.getSymbolRangeType_EndSymbol();

		/**
		 * The meta object literal for the '<em><b>Start Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_RANGE_TYPE__START_SYMBOL = eINSTANCE.getSymbolRangeType_StartSymbol();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TaskTypeImpl <em>Task Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TaskTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTaskType()
		 * @generated
		 */
		EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__OFFSET = eINSTANCE.getTaskType_Offset();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PERIOD = eINSTANCE.getTaskType_Period();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__PRIORITY = eINSTANCE.getTaskType_Priority();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TYPE__TYPE = eINSTANCE.getTaskType_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ThreadTypeImpl <em>Thread Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ThreadTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getThreadType()
		 * @generated
		 */
		EClass THREAD_TYPE = eINSTANCE.getThreadType();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_TYPE__PRIORITY = eINSTANCE.getThreadType_Priority();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeRangeElementTypeImpl <em>Time Range Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeRangeElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeRangeElementType()
		 * @generated
		 */
		EClass TIME_RANGE_ELEMENT_TYPE = eINSTANCE.getTimeRangeElementType();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE_ELEMENT_TYPE__LATENCY = eINSTANCE.getTimeRangeElementType_Latency();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeStampElementTypeImpl <em>Time Stamp Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeStampElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeStampElementType()
		 * @generated
		 */
		EClass TIME_STAMP_ELEMENT_TYPE = eINSTANCE.getTimeStampElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeValueTypeImpl <em>Time Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimeValueTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeValueType()
		 * @generated
		 */
		EClass TIME_VALUE_TYPE = eINSTANCE.getTimeValueType();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE_TYPE__DENOMINATOR = eINSTANCE.getTimeValueType_Denominator();

		/**
		 * The meta object literal for the '<em><b>Nominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE_TYPE__NOMINATOR = eINSTANCE.getTimeValueType_Nominator();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE_TYPE__UNIT = eINSTANCE.getTimeValueType_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintElementTypeImpl <em>Timing Constraint Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingConstraintElementType()
		 * @generated
		 */
		EClass TIMING_CONSTRAINT_ELEMENT_TYPE = eINSTANCE.getTimingConstraintElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintsTypeImpl <em>Timing Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingConstraintsTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingConstraintsType()
		 * @generated
		 */
		EClass TIMING_CONSTRAINTS_TYPE = eINSTANCE.getTimingConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Timing Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINTS_TYPE__TIMING_CONSTRAINT = eINSTANCE.getTimingConstraintsType_TimingConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationConstraintTypeImpl <em>Timing Information Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationConstraintTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationConstraintType()
		 * @generated
		 */
		EClass TIMING_INFORMATION_CONSTRAINT_TYPE = eINSTANCE.getTimingInformationConstraintType();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD = eINSTANCE.getTimingInformationConstraintType_Threshold();

		/**
		 * The meta object literal for the '<em><b>Threshold Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE = eINSTANCE.getTimingInformationConstraintType_ThresholdType();

		/**
		 * The meta object literal for the '<em><b>Timing Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE = eINSTANCE.getTimingInformationConstraintType_TimingValueType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationElementTypeImpl <em>Timing Information Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationElementType()
		 * @generated
		 */
		EClass TIMING_INFORMATION_ELEMENT_TYPE = eINSTANCE.getTimingInformationElementType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_INFORMATION_ELEMENT_TYPE__VALUE = eINSTANCE.getTimingInformationElementType_Value();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_INFORMATION_ELEMENT_TYPE__SUB_TYPE = eINSTANCE.getTimingInformationElementType_SubType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_INFORMATION_ELEMENT_TYPE__TYPE = eINSTANCE.getTimingInformationElementType_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValueElementTypeImpl <em>Timing Value Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValueElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingValueElementType()
		 * @generated
		 */
		EClass TIMING_VALUE_ELEMENT_TYPE = eINSTANCE.getTimingValueElementType();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_VALUE_ELEMENT_TYPE__REQUEST = eINSTANCE.getTimingValueElementType_Request();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_VALUE_ELEMENT_TYPE__SOURCE = eINSTANCE.getTimingValueElementType_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValuesTypeImpl <em>Timing Values Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValuesTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingValuesType()
		 * @generated
		 */
		EClass TIMING_VALUES_TYPE = eINSTANCE.getTimingValuesType();

		/**
		 * The meta object literal for the '<em><b>Timing Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_VALUES_TYPE__TIMING_VALUE = eINSTANCE.getTimingValuesType_TimingValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceCommentTypeImpl <em>Trace Comment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceCommentTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTraceCommentType()
		 * @generated
		 */
		EClass TRACE_COMMENT_TYPE = eINSTANCE.getTraceCommentType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMENT_TYPE__COMMENT = eINSTANCE.getTraceCommentType_Comment();

		/**
		 * The meta object literal for the '<em><b>Time1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMENT_TYPE__TIME1 = eINSTANCE.getTraceCommentType_Time1();

		/**
		 * The meta object literal for the '<em><b>Time2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMENT_TYPE__TIME2 = eINSTANCE.getTraceCommentType_Time2();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceEntryTypeImpl <em>Trace Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceEntryTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTraceEntryType()
		 * @generated
		 */
		EClass TRACE_ENTRY_TYPE = eINSTANCE.getTraceEntryType();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ENTRY_TYPE__DATA = eINSTANCE.getTraceEntryType_Data();

		/**
		 * The meta object literal for the '<em><b>Element Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ENTRY_TYPE__ELEMENT_REF_ID = eINSTANCE.getTraceEntryType_ElementRefId();

		/**
		 * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ENTRY_TYPE__EVENT_ID = eINSTANCE.getTraceEntryType_EventId();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ENTRY_TYPE__TIME = eINSTANCE.getTraceEntryType_Time();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracesTypeImpl <em>Traces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracesTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracesType()
		 * @generated
		 */
		EClass TRACES_TYPE = eINSTANCE.getTracesType();

		/**
		 * The meta object literal for the '<em><b>OT1 Trace Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACES_TYPE__OT1_TRACE_LINK = eINSTANCE.getTracesType_OT1TraceLink();

		/**
		 * The meta object literal for the '<em><b>OT1 Hex Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACES_TYPE__OT1_HEX_TRACE = eINSTANCE.getTracesType_OT1HexTrace();

		/**
		 * The meta object literal for the '<em><b>Xml Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACES_TYPE__XML_TRACE = eINSTANCE.getTracesType_XmlTrace();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadContainerTypeImpl <em>Tracing Overhead Container Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadContainerTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracingOverheadContainerType()
		 * @generated
		 */
		EClass TRACING_OVERHEAD_CONTAINER_TYPE = eINSTANCE.getTracingOverheadContainerType();

		/**
		 * The meta object literal for the '<em><b>Tracing Overhead</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACING_OVERHEAD_CONTAINER_TYPE__TRACING_OVERHEAD = eINSTANCE.getTracingOverheadContainerType_TracingOverhead();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadTypeImpl <em>Tracing Overhead Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracingOverheadTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracingOverheadType()
		 * @generated
		 */
		EClass TRACING_OVERHEAD_TYPE = eINSTANCE.getTracingOverheadType();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACING_OVERHEAD_TYPE__TIME = eINSTANCE.getTracingOverheadType_Time();

		/**
		 * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_OVERHEAD_TYPE__EVENT_ID = eINSTANCE.getTracingOverheadType_EventId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_OVERHEAD_TYPE__TYPE = eINSTANCE.getTracingOverheadType_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.UniqueElementTypeImpl <em>Unique Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.UniqueElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getUniqueElementType()
		 * @generated
		 */
		EClass UNIQUE_ELEMENT_TYPE = eINSTANCE.getUniqueElementType();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_ELEMENT_TYPE__UUID = eINSTANCE.getUniqueElementType_Uuid();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.VariableTypeImpl <em>Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.VariableTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getVariableType()
		 * @generated
		 */
		EClass VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__LENGTH = eINSTANCE.getVariableType_Length();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.VirtualElementTypeImpl <em>Virtual Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.VirtualElementTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getVirtualElementType()
		 * @generated
		 */
		EClass VIRTUAL_ELEMENT_TYPE = eINSTANCE.getVirtualElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.WindowsOsTypeImpl <em>Windows Os Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.WindowsOsTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getWindowsOsType()
		 * @generated
		 */
		EClass WINDOWS_OS_TYPE = eINSTANCE.getWindowsOsType();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.XmlTraceTypeImpl <em>Xml Trace Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.XmlTraceTypeImpl
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getXmlTraceType()
		 * @generated
		 */
		EClass XML_TRACE_TYPE = eINSTANCE.getXmlTraceType();

		/**
		 * The meta object literal for the '<em><b>Trace Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TRACE_TYPE__TRACE_ENTRY = eINSTANCE.getXmlTraceType_TraceEntry();

		/**
		 * The meta object literal for the '<em><b>Trace Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TRACE_TYPE__TRACE_COMMENT = eINSTANCE.getXmlTraceType_TraceComment();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum <em>Event Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventTypeEnum()
		 * @generated
		 */
		EEnum EVENT_TYPE_ENUM = eINSTANCE.getEventTypeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum <em>Execution Order Constraint Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getExecutionOrderConstraintTypeEnum()
		 * @generated
		 */
		EEnum EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM = eINSTANCE.getExecutionOrderConstraintTypeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum <em>Interrupt Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getInterruptTypeEnum()
		 * @generated
		 */
		EEnum INTERRUPT_TYPE_ENUM = eINSTANCE.getInterruptTypeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum <em>Latency Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getLatencyTypeEnum()
		 * @generated
		 */
		EEnum LATENCY_TYPE_ENUM = eINSTANCE.getLatencyTypeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum <em>Task Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTaskTypeEnum()
		 * @generated
		 */
		EEnum TASK_TYPE_ENUM = eINSTANCE.getTaskTypeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum <em>Threshold Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getThresholdTypeEnum()
		 * @generated
		 */
		EEnum THRESHOLD_TYPE_ENUM = eINSTANCE.getThresholdTypeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum <em>Time Base Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeBaseEnum()
		 * @generated
		 */
		EEnum TIME_BASE_ENUM = eINSTANCE.getTimeBaseEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum <em>Timing Information Source Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationSourceEnum()
		 * @generated
		 */
		EEnum TIMING_INFORMATION_SOURCE_ENUM = eINSTANCE.getTimingInformationSourceEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum <em>Timing Information Sub Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationSubTypeEnum()
		 * @generated
		 */
		EEnum TIMING_INFORMATION_SUB_TYPE_ENUM = eINSTANCE.getTimingInformationSubTypeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum <em>Timing Information Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationTypeEnum()
		 * @generated
		 */
		EEnum TIMING_INFORMATION_TYPE_ENUM = eINSTANCE.getTimingInformationTypeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum <em>Tracing Overhead Description Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracingOverheadDescriptionEnum()
		 * @generated
		 */
		EEnum TRACING_OVERHEAD_DESCRIPTION_ENUM = eINSTANCE.getTracingOverheadDescriptionEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType <em>Version Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getVersionType()
		 * @generated
		 */
		EEnum VERSION_TYPE = eINSTANCE.getVersionType();

		/**
		 * The meta object literal for the '<em>Event Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getEventTypeEnumObject()
		 * @generated
		 */
		EDataType EVENT_TYPE_ENUM_OBJECT = eINSTANCE.getEventTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Execution Order Constraint Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ExecutionOrderConstraintTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getExecutionOrderConstraintTypeEnumObject()
		 * @generated
		 */
		EDataType EXECUTION_ORDER_CONSTRAINT_TYPE_ENUM_OBJECT = eINSTANCE.getExecutionOrderConstraintTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Interrupt Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getInterruptTypeEnumObject()
		 * @generated
		 */
		EDataType INTERRUPT_TYPE_ENUM_OBJECT = eINSTANCE.getInterruptTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Latency Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getLatencyTypeEnumObject()
		 * @generated
		 */
		EDataType LATENCY_TYPE_ENUM_OBJECT = eINSTANCE.getLatencyTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Task Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTaskTypeEnumObject()
		 * @generated
		 */
		EDataType TASK_TYPE_ENUM_OBJECT = eINSTANCE.getTaskTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Threshold Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getThresholdTypeEnumObject()
		 * @generated
		 */
		EDataType THRESHOLD_TYPE_ENUM_OBJECT = eINSTANCE.getThresholdTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Time Base Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimeBaseEnumObject()
		 * @generated
		 */
		EDataType TIME_BASE_ENUM_OBJECT = eINSTANCE.getTimeBaseEnumObject();

		/**
		 * The meta object literal for the '<em>Timing Information Source Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationSourceEnumObject()
		 * @generated
		 */
		EDataType TIMING_INFORMATION_SOURCE_ENUM_OBJECT = eINSTANCE.getTimingInformationSourceEnumObject();

		/**
		 * The meta object literal for the '<em>Timing Information Sub Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationSubTypeEnumObject()
		 * @generated
		 */
		EDataType TIMING_INFORMATION_SUB_TYPE_ENUM_OBJECT = eINSTANCE.getTimingInformationSubTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Timing Information Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTimingInformationTypeEnumObject()
		 * @generated
		 */
		EDataType TIMING_INFORMATION_TYPE_ENUM_OBJECT = eINSTANCE.getTimingInformationTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Tracing Overhead Description Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadDescriptionEnum
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getTracingOverheadDescriptionEnumObject()
		 * @generated
		 */
		EDataType TRACING_OVERHEAD_DESCRIPTION_ENUM_OBJECT = eINSTANCE.getTracingOverheadDescriptionEnumObject();

		/**
		 * The meta object literal for the '<em>Version Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType
		 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1PackageImpl#getVersionTypeObject()
		 * @generated
		 */
		EDataType VERSION_TYPE_OBJECT = eINSTANCE.getVersionTypeObject();

	}

} //OT1Package
