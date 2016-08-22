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
package org.eclipse.app4mc.amalthea.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * *******************************************************************************
 * <!-- end-model-doc -->
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='Amalthea' prefix='Amalthea' editDirectory='/org.eclipse.app4mc.amalthea.model.edit/src-gen' rootExtendsClass='org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl' providerRootExtendsClass='org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedItemProviderAdapter' creationIcons='false' forceOverwrite='true' creationSubmenus='true' generateSchema='true' loadInitialization='false' dynamicTemplates='true' templateDirectory='org.eclipse.app4mc.amalthea.model/templates' copyrightText='*******************************************************************************\r\n Copyright (c) 2016 Robert Bosch GmbH and others.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n\r\n    Generated using Eclipse EMF\r\n\r\n*******************************************************************************' basePackage='org.eclipse.app4mc.amalthea'"
 * @generated
 */
public interface AmaltheaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://app4mc.eclipse.org/amalthea/0.7.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "am";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmaltheaPackage eINSTANCE = org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.IAnnotatable <em>IAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.IAnnotatable
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getIAnnotatable()
	 * @generated
	 */
	int IANNOTATABLE = 4;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IANNOTATABLE__CUSTOM_PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>IAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IANNOTATABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IANNOTATABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.BaseObjectImpl <em>Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.BaseObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getBaseObject()
	 * @generated
	 */
	int BASE_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__CUSTOM_PROPERTIES = IANNOTATABLE__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_FEATURE_COUNT = IANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_OPERATION_COUNT = IANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl <em>Amalthea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAmalthea()
	 * @generated
	 */
	int AMALTHEA = 0;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sw Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__SW_MODEL = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hw Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__HW_MODEL = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__OS_MODEL = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stimuli Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__STIMULI_MODEL = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__CONSTRAINTS_MODEL = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__EVENT_MODEL = BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Property Constraints Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__PROPERTY_CONSTRAINTS_MODEL = BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mapping Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__MAPPING_MODEL = BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Config Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__CONFIG_MODEL = BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Components Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA__COMPONENTS_MODEL = BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Amalthea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Amalthea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALTHEA_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.IReferable <em>IReferable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.IReferable
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getIReferable()
	 * @generated
	 */
	int IREFERABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE__UNIQUE_NAME = 1;

	/**
	 * The number of structural features of the '<em>IReferable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE___COMPUTE_UNIQUE_NAME = 0;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE___ENCODE__STRING = 1;

	/**
	 * The number of operations of the '<em>IReferable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ReferableObjectImpl <em>Referable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ReferableObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getReferableObject()
	 * @generated
	 */
	int REFERABLE_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_OBJECT__NAME = IREFERABLE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_OBJECT__UNIQUE_NAME = IREFERABLE__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Referable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_OBJECT_FEATURE_COUNT = IREFERABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_OBJECT___COMPUTE_UNIQUE_NAME = IREFERABLE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_OBJECT___ENCODE__STRING = IREFERABLE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Referable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_OBJECT_OPERATION_COUNT = IREFERABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ReferableBaseObjectImpl <em>Referable Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ReferableBaseObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getReferableBaseObject()
	 * @generated
	 */
	int REFERABLE_BASE_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES = IANNOTATABLE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT__NAME = IANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT__UNIQUE_NAME = IANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Referable Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT_FEATURE_COUNT = IANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME = IANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT___ENCODE__STRING = IANNOTATABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Referable Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT_OPERATION_COUNT = IANNOTATABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.ITaggable <em>ITaggable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.ITaggable
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getITaggable()
	 * @generated
	 */
	int ITAGGABLE = 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGGABLE__TAGS = 0;

	/**
	 * The number of structural features of the '<em>ITaggable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGGABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ITaggable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITAGGABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TagImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 7;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tag Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TAG_TYPE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AbstractTimeImpl <em>Abstract Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AbstractTimeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAbstractTime()
	 * @generated
	 */
	int ABSTRACT_TIME = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Abstract Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Abstract Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TimeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = ABSTRACT_TIME__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__UNIT = ABSTRACT_TIME__UNIT;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = ABSTRACT_TIME_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___TO_STRING = ABSTRACT_TIME___TO_STRING;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___CONTAINER_NOTIFICATION_REQUIRED = ABSTRACT_TIME_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = ABSTRACT_TIME_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SignedTimeImpl <em>Signed Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SignedTimeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSignedTime()
	 * @generated
	 */
	int SIGNED_TIME = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME__VALUE = ABSTRACT_TIME__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME__UNIT = ABSTRACT_TIME__UNIT;

	/**
	 * The number of structural features of the '<em>Signed Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME_FEATURE_COUNT = ABSTRACT_TIME_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME___TO_STRING = ABSTRACT_TIME___TO_STRING;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME___CONTAINER_NOTIFICATION_REQUIRED = ABSTRACT_TIME_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signed Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME_OPERATION_COUNT = ABSTRACT_TIME_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.FrequencyImpl <em>Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.FrequencyImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getFrequency()
	 * @generated
	 */
	int FREQUENCY = 11;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY___CONTAINER_NOTIFICATION_REQUIRED = 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY___TO_STRING = 1;

	/**
	 * The number of operations of the '<em>Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataSizeImpl <em>Data Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataSizeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataSize()
	 * @generated
	 */
	int DATA_SIZE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___TO_STRING = 0;

	/**
	 * The operation id for the '<em>Get Number Bits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___GET_NUMBER_BITS = 1;

	/**
	 * The operation id for the '<em>Get Number Bytes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE___GET_NUMBER_BYTES = 2;

	/**
	 * The number of operations of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataRateImpl <em>Data Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataRateImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataRate()
	 * @generated
	 */
	int DATA_RATE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CustomPropertyImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCustomProperty()
	 * @generated
	 */
	int CUSTOM_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Custom Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ValueImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 15;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___CONTAINER_NOTIFICATION_REQUIRED = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ListObjectImpl <em>List Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ListObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getListObject()
	 * @generated
	 */
	int LIST_OBJECT = 16;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OBJECT__VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.StringObjectImpl <em>String Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.StringObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getStringObject()
	 * @generated
	 */
	int STRING_OBJECT = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.BigIntegerObjectImpl <em>Big Integer Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.BigIntegerObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getBigIntegerObject()
	 * @generated
	 */
	int BIG_INTEGER_OBJECT = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGER_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Big Integer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGER_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGER_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGER_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Big Integer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGER_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ReferenceObjectImpl <em>Reference Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ReferenceObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getReferenceObject()
	 * @generated
	 */
	int REFERENCE_OBJECT = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.IntegerObjectImpl <em>Integer Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.IntegerObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getIntegerObject()
	 * @generated
	 */
	int INTEGER_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LongObjectImpl <em>Long Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LongObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLongObject()
	 * @generated
	 */
	int LONG_OBJECT = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Long Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.FloatObjectImpl <em>Float Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.FloatObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getFloatObject()
	 * @generated
	 */
	int FLOAT_OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DoubleObjectImpl <em>Double Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DoubleObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDoubleObject()
	 * @generated
	 */
	int DOUBLE_OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Double Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.BooleanObjectImpl <em>Boolean Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.BooleanObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getBooleanObject()
	 * @generated
	 */
	int BOOLEAN_OBJECT = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = VALUE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OBJECT___TO_STRING = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TimeObjectImpl <em>Time Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TimeObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTimeObject()
	 * @generated
	 */
	int TIME_OBJECT = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBJECT__VALUE = ABSTRACT_TIME__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBJECT__UNIT = ABSTRACT_TIME__UNIT;

	/**
	 * The number of structural features of the '<em>Time Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBJECT_FEATURE_COUNT = ABSTRACT_TIME_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = ABSTRACT_TIME_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBJECT___TO_STRING = ABSTRACT_TIME_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBJECT_OPERATION_COUNT = ABSTRACT_TIME_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SignedTimeObjectImpl <em>Signed Time Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SignedTimeObjectImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSignedTimeObject()
	 * @generated
	 */
	int SIGNED_TIME_OBJECT = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME_OBJECT__VALUE = ABSTRACT_TIME__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME_OBJECT__UNIT = ABSTRACT_TIME__UNIT;

	/**
	 * The number of structural features of the '<em>Signed Time Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME_OBJECT_FEATURE_COUNT = ABSTRACT_TIME_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME_OBJECT___CONTAINER_NOTIFICATION_REQUIRED = ABSTRACT_TIME_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME_OBJECT___TO_STRING = ABSTRACT_TIME_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signed Time Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNED_TIME_OBJECT_OPERATION_COUNT = ABSTRACT_TIME_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DeviationImpl <em>Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DeviationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDeviation()
	 * @generated
	 */
	int DEVIATION = 27;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__UPPER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__DISTRIBUTION = 2;

	/**
	 * The number of structural features of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DistributionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 28;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.WeibullDistributionImpl <em>Weibull Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.WeibullDistributionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getWeibullDistribution()
	 * @generated
	 */
	int WEIBULL_DISTRIBUTION = 29;

	/**
	 * The number of structural features of the '<em>Weibull Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Weibull Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_DISTRIBUTION_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.WeibullParametersImpl <em>Weibull Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.WeibullParametersImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getWeibullParameters()
	 * @generated
	 */
	int WEIBULL_PARAMETERS = 30;

	/**
	 * The feature id for the '<em><b>Kappa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_PARAMETERS__KAPPA = WEIBULL_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_PARAMETERS__LAMBDA = WEIBULL_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weibull Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_PARAMETERS_FEATURE_COUNT = WEIBULL_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Weibull Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_PARAMETERS_OPERATION_COUNT = WEIBULL_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.WeibullEstimatorsImpl <em>Weibull Estimators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.WeibullEstimatorsImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getWeibullEstimators()
	 * @generated
	 */
	int WEIBULL_ESTIMATORS = 31;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_ESTIMATORS__MEAN = WEIBULL_DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PRemain Promille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_ESTIMATORS__PREMAIN_PROMILLE = WEIBULL_DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weibull Estimators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_ESTIMATORS_FEATURE_COUNT = WEIBULL_DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Weibull Estimators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_ESTIMATORS_OPERATION_COUNT = WEIBULL_DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.UniformDistributionImpl <em>Uniform Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.UniformDistributionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getUniformDistribution()
	 * @generated
	 */
	int UNIFORM_DISTRIBUTION = 32;

	/**
	 * The number of structural features of the '<em>Uniform Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uniform Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_DISTRIBUTION_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.BoundariesImpl <em>Boundaries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.BoundariesImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getBoundaries()
	 * @generated
	 */
	int BOUNDARIES = 33;

	/**
	 * The number of structural features of the '<em>Boundaries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARIES_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boundaries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARIES_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.GaussDistributionImpl <em>Gauss Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.GaussDistributionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getGaussDistribution()
	 * @generated
	 */
	int GAUSS_DISTRIBUTION = 34;

	/**
	 * The feature id for the '<em><b>Sd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS_DISTRIBUTION__SD = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS_DISTRIBUTION__MEAN = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gauss Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS_DISTRIBUTION_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gauss Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS_DISTRIBUTION_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.NumericStatistic <em>Numeric Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.NumericStatistic
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getNumericStatistic()
	 * @generated
	 */
	int NUMERIC_STATISTIC = 35;

	/**
	 * The number of structural features of the '<em>Numeric Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STATISTIC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Numeric Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_STATISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.MinAvgMaxStatisticImpl <em>Min Avg Max Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.MinAvgMaxStatisticImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMinAvgMaxStatistic()
	 * @generated
	 */
	int MIN_AVG_MAX_STATISTIC = 36;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AVG_MAX_STATISTIC__MIN = NUMERIC_STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AVG_MAX_STATISTIC__AVG = NUMERIC_STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AVG_MAX_STATISTIC__MAX = NUMERIC_STATISTIC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Min Avg Max Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AVG_MAX_STATISTIC_FEATURE_COUNT = NUMERIC_STATISTIC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Min Avg Max Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_AVG_MAX_STATISTIC_OPERATION_COUNT = NUMERIC_STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SingleValueStatisticImpl <em>Single Value Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SingleValueStatisticImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSingleValueStatistic()
	 * @generated
	 */
	int SINGLE_VALUE_STATISTIC = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_STATISTIC__VALUE = NUMERIC_STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Value Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_STATISTIC_FEATURE_COUNT = NUMERIC_STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Value Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_STATISTIC_OPERATION_COUNT = NUMERIC_STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ModeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 38;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__LITERALS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ModeLiteralImpl <em>Mode Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ModeLiteralImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getModeLiteral()
	 * @generated
	 */
	int MODE_LITERAL = 39;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LITERAL__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LITERAL__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LITERAL__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Mode Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LITERAL_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LITERAL___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LITERAL___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LITERAL___TO_STRING = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mode Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LITERAL_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.ModeValueProvider <em>Mode Value Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueProvider
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getModeValueProvider()
	 * @generated
	 */
	int MODE_VALUE_PROVIDER = 40;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER__CUSTOM_PROPERTIES = IANNOTATABLE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER__NAME = IANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER__UNIQUE_NAME = IANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER__MODE = IANNOTATABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER__INITIAL_VALUE = IANNOTATABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mode Value Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER_FEATURE_COUNT = IANNOTATABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER___COMPUTE_UNIQUE_NAME = IANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER___ENCODE__STRING = IANNOTATABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mode Value Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_PROVIDER_OPERATION_COUNT = IANNOTATABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ComponentsModelImpl <em>Components Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ComponentsModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComponentsModel()
	 * @generated
	 */
	int COMPONENTS_MODEL = 41;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL__TAGS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL__COMPONENTS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL__SYSTEMS = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Components Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Components Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.INamedElement <em>INamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.INamedElement
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getINamedElement()
	 * @generated
	 */
	int INAMED_ELEMENT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>INamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>INamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.ISystem <em>ISystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.ISystem
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getISystem()
	 * @generated
	 */
	int ISYSTEM = 43;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__COMPONENT_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__CONNECTORS = 1;

	/**
	 * The number of structural features of the '<em>ISystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ISystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PortImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 44;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TAGS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ComponentImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 45;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TAGS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TASKS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Runnables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RUNNABLES = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LABELS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Semaphores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SEMAPHORES = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Os Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OS_EVENTS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CompositeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 46;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CUSTOM_PROPERTIES = COMPONENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__UNIQUE_NAME = COMPONENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TAGS = COMPONENT__TAGS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TASKS = COMPONENT__TASKS;

	/**
	 * The feature id for the '<em><b>Runnables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__RUNNABLES = COMPONENT__RUNNABLES;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__LABELS = COMPONENT__LABELS;

	/**
	 * The feature id for the '<em><b>Semaphores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SEMAPHORES = COMPONENT__SEMAPHORES;

	/**
	 * The feature id for the '<em><b>Os Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__OS_EVENTS = COMPONENT__OS_EVENTS;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMPONENT_INSTANCES = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONNECTORS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE___COMPUTE_UNIQUE_NAME = COMPONENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE___ENCODE__STRING = COMPONENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SystemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 47;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TAGS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPONENT_INSTANCES = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTORS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ComponentInstanceImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 48;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TAGS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ConnectorImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 49;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TAGS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_PORT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_PORT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.QualifiedPortImpl <em>Qualified Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.QualifiedPortImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getQualifiedPort()
	 * @generated
	 */
	int QUALIFIED_PORT = 50;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT__INSTANCE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT__PORT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualified Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qualified Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.FInterfacePortImpl <em>FInterface Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.FInterfacePortImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getFInterfacePort()
	 * @generated
	 */
	int FINTERFACE_PORT = 51;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__CUSTOM_PROPERTIES = PORT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__UNIQUE_NAME = PORT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__TAGS = PORT__TAGS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__KIND = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__INTERFACE_NAME = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FInterface Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT___ENCODE__STRING = PORT___ENCODE__STRING;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT___COMPUTE_UNIQUE_NAME = PORT___COMPUTE_UNIQUE_NAME;

	/**
	 * The number of operations of the '<em>FInterface Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ConfigModelImpl <em>Config Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ConfigModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getConfigModel()
	 * @generated
	 */
	int CONFIG_MODEL = 52;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Events To Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MODEL__EVENTS_TO_TRACE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Config Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventConfigImpl <em>Event Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventConfigImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventConfig()
	 * @generated
	 */
	int EVENT_CONFIG = 53;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG__NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventConfigLinkImpl <em>Event Config Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventConfigLinkImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventConfigLink()
	 * @generated
	 */
	int EVENT_CONFIG_LINK = 54;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_LINK__CUSTOM_PROPERTIES = EVENT_CONFIG__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_LINK__NAME = EVENT_CONFIG__NAME;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_LINK__EVENT = EVENT_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Config Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_LINK_FEATURE_COUNT = EVENT_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Config Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_LINK_OPERATION_COUNT = EVENT_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventConfigElementImpl <em>Event Config Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventConfigElementImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventConfigElement()
	 * @generated
	 */
	int EVENT_CONFIG_ELEMENT = 55;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_ELEMENT__CUSTOM_PROPERTIES = EVENT_CONFIG__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_ELEMENT__NAME = EVENT_CONFIG__NAME;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_ELEMENT__EVENT = EVENT_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Config Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_ELEMENT_FEATURE_COUNT = EVENT_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Config Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONFIG_ELEMENT_OPERATION_COUNT = EVENT_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl <em>Constraints Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ConstraintsModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getConstraintsModel()
	 * @generated
	 */
	int CONSTRAINTS_MODEL = 56;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Event Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__EVENT_CHAINS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timing Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__TIMING_CONSTRAINTS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Affinity Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__AFFINITY_CONSTRAINTS = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Runnable Sequencing Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__RUNNABLE_SEQUENCING_CONSTRAINTS = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Age Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__DATA_AGE_CONSTRAINTS = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__REQUIREMENTS = BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Coherency Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__DATA_COHERENCY_GROUPS = BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Constraints Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Constraints Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableSequencingConstraintImpl <em>Runnable Sequencing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableSequencingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableSequencingConstraint()
	 * @generated
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT = 57;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT__ORDER_TYPE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runnable Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT__RUNNABLE_GROUPS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runnable Sequencing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Runnable Sequencing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEQUENCING_CONSTRAINT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessRunnableGroupImpl <em>Process Runnable Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessRunnableGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessRunnableGroup()
	 * @generated
	 */
	int PROCESS_RUNNABLE_GROUP = 58;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Grouping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP__GROUPING_TYPE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP__ENTRIES = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Runnable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process Runnable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessRunnableGroupEntryImpl <em>Process Runnable Group Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessRunnableGroupEntryImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessRunnableGroupEntry()
	 * @generated
	 */
	int PROCESS_RUNNABLE_GROUP_ENTRY = 59;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP_ENTRY__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP_ENTRY__RUNNABLE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP_ENTRY__PROCESS_SCOPE = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Runnable Group Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP_ENTRY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process Runnable Group Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_RUNNABLE_GROUP_ENTRY_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AffinityConstraintImpl <em>Affinity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AffinityConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAffinityConstraint()
	 * @generated
	 */
	int AFFINITY_CONSTRAINT = 60;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_CONSTRAINT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_CONSTRAINT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_CONSTRAINT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Affinity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_CONSTRAINT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_CONSTRAINT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_CONSTRAINT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Affinity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_CONSTRAINT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SeparationConstraintImpl <em>Separation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SeparationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSeparationConstraint()
	 * @generated
	 */
	int SEPARATION_CONSTRAINT = 61;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_CONSTRAINT__CUSTOM_PROPERTIES = AFFINITY_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_CONSTRAINT__NAME = AFFINITY_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_CONSTRAINT__UNIQUE_NAME = AFFINITY_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Separation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_CONSTRAINT_FEATURE_COUNT = AFFINITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_CONSTRAINT___COMPUTE_UNIQUE_NAME = AFFINITY_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_CONSTRAINT___ENCODE__STRING = AFFINITY_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Separation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_CONSTRAINT_OPERATION_COUNT = AFFINITY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PairingConstraintImpl <em>Pairing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PairingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPairingConstraint()
	 * @generated
	 */
	int PAIRING_CONSTRAINT = 62;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRING_CONSTRAINT__CUSTOM_PROPERTIES = AFFINITY_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRING_CONSTRAINT__NAME = AFFINITY_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRING_CONSTRAINT__UNIQUE_NAME = AFFINITY_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Pairing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRING_CONSTRAINT_FEATURE_COUNT = AFFINITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRING_CONSTRAINT___COMPUTE_UNIQUE_NAME = AFFINITY_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRING_CONSTRAINT___ENCODE__STRING = AFFINITY_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Pairing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIRING_CONSTRAINT_OPERATION_COUNT = AFFINITY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessConstraintImpl <em>Process Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessConstraint()
	 * @generated
	 */
	int PROCESS_CONSTRAINT = 63;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRAINT__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Process Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Process Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableConstraintImpl <em>Runnable Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableConstraint()
	 * @generated
	 */
	int RUNNABLE_CONSTRAINT = 64;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CONSTRAINT__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Runnable Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runnable Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerConstraintImpl <em>Scheduler Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulerConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulerConstraint()
	 * @generated
	 */
	int SCHEDULER_CONSTRAINT = 65;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_CONSTRAINT__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Scheduler Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scheduler Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableSeparationConstraintImpl <em>Runnable Separation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableSeparationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableSeparationConstraint()
	 * @generated
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT = 66;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT__CUSTOM_PROPERTIES = SEPARATION_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT__NAME = SEPARATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT__UNIQUE_NAME = SEPARATION_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT__TARGET = SEPARATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT__GROUPS = SEPARATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runnable Separation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT_FEATURE_COUNT = SEPARATION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT___COMPUTE_UNIQUE_NAME = SEPARATION_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT___ENCODE__STRING = SEPARATION_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Runnable Separation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SEPARATION_CONSTRAINT_OPERATION_COUNT = SEPARATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessSeparationConstraintImpl <em>Process Separation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessSeparationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessSeparationConstraint()
	 * @generated
	 */
	int PROCESS_SEPARATION_CONSTRAINT = 67;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT__CUSTOM_PROPERTIES = SEPARATION_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT__NAME = SEPARATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT__UNIQUE_NAME = SEPARATION_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT__TARGET = SEPARATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT__GROUPS = SEPARATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Separation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT_FEATURE_COUNT = SEPARATION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT___COMPUTE_UNIQUE_NAME = SEPARATION_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT___ENCODE__STRING = SEPARATION_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Process Separation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SEPARATION_CONSTRAINT_OPERATION_COUNT = SEPARATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerSeparationConstraintImpl <em>Scheduler Separation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulerSeparationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulerSeparationConstraint()
	 * @generated
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT = 68;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT__CUSTOM_PROPERTIES = SEPARATION_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT__NAME = SEPARATION_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT__UNIQUE_NAME = SEPARATION_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT__TARGET = SEPARATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT__GROUPS = SEPARATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scheduler Separation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT_FEATURE_COUNT = SEPARATION_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT___COMPUTE_UNIQUE_NAME = SEPARATION_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT___ENCODE__STRING = SEPARATION_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Scheduler Separation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_SEPARATION_CONSTRAINT_OPERATION_COUNT = SEPARATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnablePairingConstraintImpl <em>Runnable Pairing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnablePairingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnablePairingConstraint()
	 * @generated
	 */
	int RUNNABLE_PAIRING_CONSTRAINT = 69;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT__CUSTOM_PROPERTIES = PAIRING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT__NAME = PAIRING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT__UNIQUE_NAME = PAIRING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT__TARGET = PAIRING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runnables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT__RUNNABLES = PAIRING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runnable Pairing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT_FEATURE_COUNT = PAIRING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT___COMPUTE_UNIQUE_NAME = PAIRING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT___ENCODE__STRING = PAIRING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Runnable Pairing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_PAIRING_CONSTRAINT_OPERATION_COUNT = PAIRING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPairingConstraintImpl <em>Process Pairing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessPairingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessPairingConstraint()
	 * @generated
	 */
	int PROCESS_PAIRING_CONSTRAINT = 70;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT__CUSTOM_PROPERTIES = PAIRING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT__NAME = PAIRING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT__UNIQUE_NAME = PAIRING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT__TARGET = PAIRING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT__PROCESSES = PAIRING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Pairing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT_FEATURE_COUNT = PAIRING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT___COMPUTE_UNIQUE_NAME = PAIRING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT___ENCODE__STRING = PAIRING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Process Pairing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PAIRING_CONSTRAINT_OPERATION_COUNT = PAIRING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerPairingConstraintImpl <em>Scheduler Pairing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulerPairingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulerPairingConstraint()
	 * @generated
	 */
	int SCHEDULER_PAIRING_CONSTRAINT = 71;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT__CUSTOM_PROPERTIES = PAIRING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT__NAME = PAIRING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT__UNIQUE_NAME = PAIRING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT__TARGET = PAIRING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedulers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT__SCHEDULERS = PAIRING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scheduler Pairing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT_FEATURE_COUNT = PAIRING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT___COMPUTE_UNIQUE_NAME = PAIRING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT___ENCODE__STRING = PAIRING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Scheduler Pairing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_PAIRING_CONSTRAINT_OPERATION_COUNT = PAIRING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableConstraintTargetImpl <em>Runnable Constraint Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableConstraintTargetImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableConstraintTarget()
	 * @generated
	 */
	int RUNNABLE_CONSTRAINT_TARGET = 72;

	/**
	 * The number of structural features of the '<em>Runnable Constraint Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runnable Constraint Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CONSTRAINT_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessConstraintTargetImpl <em>Process Constraint Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessConstraintTargetImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessConstraintTarget()
	 * @generated
	 */
	int PROCESS_CONSTRAINT_TARGET = 73;

	/**
	 * The number of structural features of the '<em>Process Constraint Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRAINT_TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Process Constraint Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CONSTRAINT_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerConstraintTargetImpl <em>Scheduler Constraint Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulerConstraintTargetImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulerConstraintTarget()
	 * @generated
	 */
	int SCHEDULER_CONSTRAINT_TARGET = 74;

	/**
	 * The number of structural features of the '<em>Scheduler Constraint Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_CONSTRAINT_TARGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Scheduler Constraint Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_CONSTRAINT_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TargetCoreImpl <em>Target Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TargetCoreImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTargetCore()
	 * @generated
	 */
	int TARGET_CORE = 75;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CORE__CUSTOM_PROPERTIES = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CORE__CORES = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CORE_FEATURE_COUNT = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CORE_OPERATION_COUNT = RUNNABLE_CONSTRAINT_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TargetSchedulerImpl <em>Target Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TargetSchedulerImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTargetScheduler()
	 * @generated
	 */
	int TARGET_SCHEDULER = 76;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SCHEDULER__CUSTOM_PROPERTIES = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedulers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SCHEDULER__SCHEDULERS = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SCHEDULER_FEATURE_COUNT = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_SCHEDULER_OPERATION_COUNT = RUNNABLE_CONSTRAINT_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TargetProcessImpl <em>Target Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TargetProcessImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTargetProcess()
	 * @generated
	 */
	int TARGET_PROCESS = 77;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PROCESS__CUSTOM_PROPERTIES = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PROCESS__PROCESSES = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PROCESS_FEATURE_COUNT = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PROCESS_OPERATION_COUNT = RUNNABLE_CONSTRAINT_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TargetCallSequenceImpl <em>Target Call Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TargetCallSequenceImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTargetCallSequence()
	 * @generated
	 */
	int TARGET_CALL_SEQUENCE = 78;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CALL_SEQUENCE__CUSTOM_PROPERTIES = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CALL_SEQUENCE__CALL_SEQUENCES = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Call Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CALL_SEQUENCE_FEATURE_COUNT = RUNNABLE_CONSTRAINT_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Call Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_CALL_SEQUENCE_OPERATION_COUNT = RUNNABLE_CONSTRAINT_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableGroupImpl <em>Runnable Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableGroup()
	 * @generated
	 */
	int RUNNABLE_GROUP = 79;

	/**
	 * The number of structural features of the '<em>Runnable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runnable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessGroupImpl <em>Process Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessGroup()
	 * @generated
	 */
	int PROCESS_GROUP = 80;

	/**
	 * The number of structural features of the '<em>Process Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Process Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerEntityGroupImpl <em>Scheduler Entity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulerEntityGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulerEntityGroup()
	 * @generated
	 */
	int SCHEDULER_ENTITY_GROUP = 81;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_ENTITY_GROUP__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Schedulers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_ENTITY_GROUP__SCHEDULERS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduler Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_ENTITY_GROUP_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scheduler Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_ENTITY_GROUP_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableEntityGroupImpl <em>Runnable Entity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableEntityGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableEntityGroup()
	 * @generated
	 */
	int RUNNABLE_ENTITY_GROUP = 82;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_GROUP__CUSTOM_PROPERTIES = RUNNABLE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runnables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_GROUP__RUNNABLES = RUNNABLE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runnable Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_GROUP_FEATURE_COUNT = RUNNABLE_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Runnable Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ENTITY_GROUP_OPERATION_COUNT = RUNNABLE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessEntityGroupImpl <em>Process Entity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessEntityGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessEntityGroup()
	 * @generated
	 */
	int PROCESS_ENTITY_GROUP = 83;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENTITY_GROUP__CUSTOM_PROPERTIES = PROCESS_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENTITY_GROUP__PROCESSES = PROCESS_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENTITY_GROUP_FEATURE_COUNT = PROCESS_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENTITY_GROUP_OPERATION_COUNT = PROCESS_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TagGroupImpl <em>Tag Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TagGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTagGroup()
	 * @generated
	 */
	int TAG_GROUP = 84;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__CUSTOM_PROPERTIES = RUNNABLE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__TAG = RUNNABLE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP_FEATURE_COUNT = RUNNABLE_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tag Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP_OPERATION_COUNT = RUNNABLE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventChainImpl <em>Event Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventChainImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventChain()
	 * @generated
	 */
	int EVENT_CHAIN = 85;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__STIMULUS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__RESPONSE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__SEGMENTS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__STRANDS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN___CONTAINER_NOTIFICATION_REQUIRED = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventChainItemImpl <em>Event Chain Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventChainItemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventChainItem()
	 * @generated
	 */
	int EVENT_CHAIN_ITEM = 86;

	/**
	 * The number of structural features of the '<em>Event Chain Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Event Chain Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventChainReferenceImpl <em>Event Chain Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventChainReferenceImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventChainReference()
	 * @generated
	 */
	int EVENT_CHAIN_REFERENCE = 87;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_REFERENCE__CUSTOM_PROPERTIES = EVENT_CHAIN_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_REFERENCE__EVENT_CHAIN = EVENT_CHAIN_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Chain Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_REFERENCE_FEATURE_COUNT = EVENT_CHAIN_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Chain Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_REFERENCE_OPERATION_COUNT = EVENT_CHAIN_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SubEventChainImpl <em>Sub Event Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SubEventChainImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSubEventChain()
	 * @generated
	 */
	int SUB_EVENT_CHAIN = 88;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_EVENT_CHAIN__CUSTOM_PROPERTIES = EVENT_CHAIN_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_EVENT_CHAIN__EVENT_CHAIN = EVENT_CHAIN_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Event Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_EVENT_CHAIN_FEATURE_COUNT = EVENT_CHAIN_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Event Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_EVENT_CHAIN_OPERATION_COUNT = EVENT_CHAIN_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TimingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTimingConstraint()
	 * @generated
	 */
	int TIMING_CONSTRAINT = 89;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OrderConstraintImpl <em>Order Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OrderConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOrderConstraint()
	 * @generated
	 */
	int ORDER_CONSTRAINT = 90;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__CUSTOM_PROPERTIES = TIMING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__UNIQUE_NAME = TIMING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__SOURCE = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__TARGET = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT___COMPUTE_UNIQUE_NAME = TIMING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT___ENCODE__STRING = TIMING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SynchronisationConstraintImpl <em>Synchronisation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SynchronisationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSynchronisationConstraint()
	 * @generated
	 */
	int SYNCHRONISATION_CONSTRAINT = 91;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT__CUSTOM_PROPERTIES = TIMING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT__UNIQUE_NAME = TIMING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT__EVENTS = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT__TOLERANCE = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronisation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT___COMPUTE_UNIQUE_NAME = TIMING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT___ENCODE__STRING = TIMING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Synchronisation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ReactionConstraintImpl <em>Reaction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ReactionConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getReactionConstraint()
	 * @generated
	 */
	int REACTION_CONSTRAINT = 92;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__CUSTOM_PROPERTIES = TIMING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__UNIQUE_NAME = TIMING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__SCOPE = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MAXIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT___COMPUTE_UNIQUE_NAME = TIMING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT___ENCODE__STRING = TIMING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Reaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DelayConstraintImpl <em>Delay Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DelayConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDelayConstraint()
	 * @generated
	 */
	int DELAY_CONSTRAINT = 93;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__CUSTOM_PROPERTIES = TIMING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__UNIQUE_NAME = TIMING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__SOURCE = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__TARGET = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__UPPER = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__LOWER = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT___COMPUTE_UNIQUE_NAME = TIMING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT___ENCODE__STRING = TIMING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AgeConstraintImpl <em>Age Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AgeConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAgeConstraint()
	 * @generated
	 */
	int AGE_CONSTRAINT = 94;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__CUSTOM_PROPERTIES = TIMING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__UNIQUE_NAME = TIMING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__SCOPE = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__MAXIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT__MINIMUM = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Age Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT___COMPUTE_UNIQUE_NAME = TIMING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT___ENCODE__STRING = TIMING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Age Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RepetitionConstraintImpl <em>Repetition Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RepetitionConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRepetitionConstraint()
	 * @generated
	 */
	int REPETITION_CONSTRAINT = 95;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__CUSTOM_PROPERTIES = TIMING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__UNIQUE_NAME = TIMING_CONSTRAINT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__EVENT = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__SPAN = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__LOWER = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__UPPER = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT__JITTER = TIMING_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT___COMPUTE_UNIQUE_NAME = TIMING_CONSTRAINT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT___ENCODE__STRING = TIMING_CONSTRAINT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeConstraintImpl <em>Data Age Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataAgeConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataAgeConstraint()
	 * @generated
	 */
	int DATA_AGE_CONSTRAINT = 96;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT__RUNNABLE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT__LABEL = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT__DATA_AGE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Age Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Data Age Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CONSTRAINT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeImpl <em>Data Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataAgeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataAge()
	 * @generated
	 */
	int DATA_AGE = 97;

	/**
	 * The number of structural features of the '<em>Data Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeCycleImpl <em>Data Age Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataAgeCycleImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataAgeCycle()
	 * @generated
	 */
	int DATA_AGE_CYCLE = 98;

	/**
	 * The feature id for the '<em><b>Minimum Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CYCLE__MINIMUM_CYCLE = DATA_AGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CYCLE__MAXIMUM_CYCLE = DATA_AGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Age Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CYCLE_FEATURE_COUNT = DATA_AGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Age Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_CYCLE_OPERATION_COUNT = DATA_AGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeTimeImpl <em>Data Age Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataAgeTimeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataAgeTime()
	 * @generated
	 */
	int DATA_AGE_TIME = 99;

	/**
	 * The feature id for the '<em><b>Minimum Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_TIME__MINIMUM_TIME = DATA_AGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_TIME__MAXIMUM_TIME = DATA_AGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Age Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_TIME_FEATURE_COUNT = DATA_AGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Age Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_AGE_TIME_OPERATION_COUNT = DATA_AGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RequirementImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 100;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SEVERITY = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LIMIT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessRequirementImpl <em>Process Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessRequirementImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessRequirement()
	 * @generated
	 */
	int PROCESS_REQUIREMENT = 101;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__CUSTOM_PROPERTIES = REQUIREMENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__SEVERITY = REQUIREMENT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__LIMIT = REQUIREMENT__LIMIT;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__PROCESS = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableRequirementImpl <em>Runnable Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableRequirementImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableRequirement()
	 * @generated
	 */
	int RUNNABLE_REQUIREMENT = 102;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_REQUIREMENT__CUSTOM_PROPERTIES = REQUIREMENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_REQUIREMENT__SEVERITY = REQUIREMENT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_REQUIREMENT__LIMIT = REQUIREMENT__LIMIT;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_REQUIREMENT__RUNNABLE = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runnable Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runnable Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ArchitectureRequirementImpl <em>Architecture Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ArchitectureRequirementImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getArchitectureRequirement()
	 * @generated
	 */
	int ARCHITECTURE_REQUIREMENT = 103;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_REQUIREMENT__CUSTOM_PROPERTIES = REQUIREMENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_REQUIREMENT__SEVERITY = REQUIREMENT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_REQUIREMENT__LIMIT = REQUIREMENT__LIMIT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_REQUIREMENT__COMPONENT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Architecture Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Architecture Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessChainRequirementImpl <em>Process Chain Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessChainRequirementImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessChainRequirement()
	 * @generated
	 */
	int PROCESS_CHAIN_REQUIREMENT = 104;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_REQUIREMENT__CUSTOM_PROPERTIES = REQUIREMENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_REQUIREMENT__SEVERITY = REQUIREMENT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_REQUIREMENT__LIMIT = REQUIREMENT__LIMIT;

	/**
	 * The feature id for the '<em><b>Process Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_REQUIREMENT__PROCESS_CHAIN = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Chain Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Chain Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RequirementLimitImpl <em>Requirement Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RequirementLimitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRequirementLimit()
	 * @generated
	 */
	int REQUIREMENT_LIMIT = 105;

	/**
	 * The feature id for the '<em><b>Limit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIMIT__LIMIT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIMIT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED = 0;

	/**
	 * The number of operations of the '<em>Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIMIT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CPUPercentageRequirementLimitImpl <em>CPU Percentage Requirement Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CPUPercentageRequirementLimitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCPUPercentageRequirementLimit()
	 * @generated
	 */
	int CPU_PERCENTAGE_REQUIREMENT_LIMIT = 106;

	/**
	 * The feature id for the '<em><b>Limit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_TYPE = REQUIREMENT_LIMIT__LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_PERCENTAGE_REQUIREMENT_LIMIT__METRIC = REQUIREMENT_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE = REQUIREMENT_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_PERCENTAGE_REQUIREMENT_LIMIT__HARDWARE_CONTEXT = REQUIREMENT_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CPU Percentage Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_PERCENTAGE_REQUIREMENT_LIMIT_FEATURE_COUNT = REQUIREMENT_LIMIT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_PERCENTAGE_REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED = REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>CPU Percentage Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_PERCENTAGE_REQUIREMENT_LIMIT_OPERATION_COUNT = REQUIREMENT_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.FrequencyRequirementLimitImpl <em>Frequency Requirement Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.FrequencyRequirementLimitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getFrequencyRequirementLimit()
	 * @generated
	 */
	int FREQUENCY_REQUIREMENT_LIMIT = 107;

	/**
	 * The feature id for the '<em><b>Limit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_REQUIREMENT_LIMIT__LIMIT_TYPE = REQUIREMENT_LIMIT__LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_REQUIREMENT_LIMIT__METRIC = REQUIREMENT_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE = REQUIREMENT_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Frequency Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_REQUIREMENT_LIMIT_FEATURE_COUNT = REQUIREMENT_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED = REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Frequency Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_REQUIREMENT_LIMIT_OPERATION_COUNT = REQUIREMENT_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PercentageRequirementLimitImpl <em>Percentage Requirement Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PercentageRequirementLimitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPercentageRequirementLimit()
	 * @generated
	 */
	int PERCENTAGE_REQUIREMENT_LIMIT = 108;

	/**
	 * The feature id for the '<em><b>Limit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_TYPE = REQUIREMENT_LIMIT__LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_REQUIREMENT_LIMIT__METRIC = REQUIREMENT_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE = REQUIREMENT_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Percentage Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_REQUIREMENT_LIMIT_FEATURE_COUNT = REQUIREMENT_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED = REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Percentage Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_REQUIREMENT_LIMIT_OPERATION_COUNT = REQUIREMENT_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CountRequirementLimitImpl <em>Count Requirement Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CountRequirementLimitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCountRequirementLimit()
	 * @generated
	 */
	int COUNT_REQUIREMENT_LIMIT = 109;

	/**
	 * The feature id for the '<em><b>Limit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_REQUIREMENT_LIMIT__LIMIT_TYPE = REQUIREMENT_LIMIT__LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_REQUIREMENT_LIMIT__METRIC = REQUIREMENT_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_REQUIREMENT_LIMIT__LIMIT_VALUE = REQUIREMENT_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Count Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_REQUIREMENT_LIMIT_FEATURE_COUNT = REQUIREMENT_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED = REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Count Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_REQUIREMENT_LIMIT_OPERATION_COUNT = REQUIREMENT_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TimeRequirementLimitImpl <em>Time Requirement Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TimeRequirementLimitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTimeRequirementLimit()
	 * @generated
	 */
	int TIME_REQUIREMENT_LIMIT = 110;

	/**
	 * The feature id for the '<em><b>Limit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REQUIREMENT_LIMIT__LIMIT_TYPE = REQUIREMENT_LIMIT__LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REQUIREMENT_LIMIT__METRIC = REQUIREMENT_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REQUIREMENT_LIMIT__LIMIT_VALUE = REQUIREMENT_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REQUIREMENT_LIMIT_FEATURE_COUNT = REQUIREMENT_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED = REQUIREMENT_LIMIT___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Time Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REQUIREMENT_LIMIT_OPERATION_COUNT = REQUIREMENT_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataCoherencyGroupImpl <em>Data Coherency Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataCoherencyGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataCoherencyGroup()
	 * @generated
	 */
	int DATA_COHERENCY_GROUP = 111;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP__LABELS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP__SCOPE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP__DIRECTION = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Coherency Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Data Coherency Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataCoherencyGroupScopeImpl <em>Data Coherency Group Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataCoherencyGroupScopeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataCoherencyGroupScope()
	 * @generated
	 */
	int DATA_COHERENCY_GROUP_SCOPE = 112;

	/**
	 * The number of structural features of the '<em>Data Coherency Group Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP_SCOPE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP_SCOPE___CONTAINER_NOTIFICATION_REQUIRED = 0;

	/**
	 * The number of operations of the '<em>Data Coherency Group Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COHERENCY_GROUP_SCOPE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessScopeImpl <em>Process Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessScopeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessScope()
	 * @generated
	 */
	int PROCESS_SCOPE = 113;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SCOPE__PROCESS = DATA_COHERENCY_GROUP_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SCOPE_FEATURE_COUNT = DATA_COHERENCY_GROUP_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SCOPE___CONTAINER_NOTIFICATION_REQUIRED = DATA_COHERENCY_GROUP_SCOPE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Process Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SCOPE_OPERATION_COUNT = DATA_COHERENCY_GROUP_SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableScopeImpl <em>Runnable Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableScopeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableScope()
	 * @generated
	 */
	int RUNNABLE_SCOPE = 114;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SCOPE__RUNNABLE = DATA_COHERENCY_GROUP_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runnable Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SCOPE_FEATURE_COUNT = DATA_COHERENCY_GROUP_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SCOPE___CONTAINER_NOTIFICATION_REQUIRED = DATA_COHERENCY_GROUP_SCOPE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Runnable Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_SCOPE_OPERATION_COUNT = DATA_COHERENCY_GROUP_SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ComponentScopeImpl <em>Component Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ComponentScopeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComponentScope()
	 * @generated
	 */
	int COMPONENT_SCOPE = 115;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SCOPE__COMPONENT = DATA_COHERENCY_GROUP_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SCOPE_FEATURE_COUNT = DATA_COHERENCY_GROUP_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SCOPE___CONTAINER_NOTIFICATION_REQUIRED = DATA_COHERENCY_GROUP_SCOPE___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Component Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SCOPE_OPERATION_COUNT = DATA_COHERENCY_GROUP_SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventModelImpl <em>Event Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventModel()
	 * @generated
	 */
	int EVENT_MODEL = 116;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL__EVENTS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 117;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventSetImpl <em>Event Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventSetImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventSet()
	 * @generated
	 */
	int EVENT_SET = 118;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET__CUSTOM_PROPERTIES = EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET__UNIQUE_NAME = EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET__EVENTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET___COMPUTE_UNIQUE_NAME = EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET___ENCODE__STRING = EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Event Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EntityEventImpl <em>Entity Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EntityEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEntityEvent()
	 * @generated
	 */
	int ENTITY_EVENT = 119;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EVENT__CUSTOM_PROPERTIES = EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EVENT__UNIQUE_NAME = EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Entity Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EVENT___COMPUTE_UNIQUE_NAME = EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EVENT___ENCODE__STRING = EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Entity Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CustomEventImpl <em>Custom Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CustomEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCustomEvent()
	 * @generated
	 */
	int CUSTOM_EVENT = 120;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT__CUSTOM_PROPERTIES = ENTITY_EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT__NAME = ENTITY_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT__UNIQUE_NAME = ENTITY_EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT__DESCRIPTION = ENTITY_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT__EVENT_TYPE = ENTITY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT_FEATURE_COUNT = ENTITY_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT___COMPUTE_UNIQUE_NAME = ENTITY_EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT___ENCODE__STRING = ENTITY_EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Custom Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EVENT_OPERATION_COUNT = ENTITY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.StimulusEventImpl <em>Stimulus Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.StimulusEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getStimulusEvent()
	 * @generated
	 */
	int STIMULUS_EVENT = 121;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__CUSTOM_PROPERTIES = ENTITY_EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__NAME = ENTITY_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__UNIQUE_NAME = ENTITY_EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__DESCRIPTION = ENTITY_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT__ENTITY = ENTITY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stimulus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT_FEATURE_COUNT = ENTITY_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT___COMPUTE_UNIQUE_NAME = ENTITY_EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT___ENCODE__STRING = ENTITY_EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Stimulus Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_EVENT_OPERATION_COUNT = ENTITY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessEventImpl <em>Process Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessEvent()
	 * @generated
	 */
	int PROCESS_EVENT = 122;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT__CUSTOM_PROPERTIES = ENTITY_EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT__NAME = ENTITY_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT__UNIQUE_NAME = ENTITY_EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT__DESCRIPTION = ENTITY_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT__EVENT_TYPE = ENTITY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT__ENTITY = ENTITY_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT__CORE = ENTITY_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT_FEATURE_COUNT = ENTITY_EVENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT___COMPUTE_UNIQUE_NAME = ENTITY_EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT___ENCODE__STRING = ENTITY_EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Process Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EVENT_OPERATION_COUNT = ENTITY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessChainEventImpl <em>Process Chain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessChainEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessChainEvent()
	 * @generated
	 */
	int PROCESS_CHAIN_EVENT = 123;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT__CUSTOM_PROPERTIES = ENTITY_EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT__NAME = ENTITY_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT__UNIQUE_NAME = ENTITY_EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT__DESCRIPTION = ENTITY_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT__EVENT_TYPE = ENTITY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT__ENTITY = ENTITY_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT__CORE = ENTITY_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Chain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT_FEATURE_COUNT = ENTITY_EVENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT___COMPUTE_UNIQUE_NAME = ENTITY_EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT___ENCODE__STRING = ENTITY_EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Process Chain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_EVENT_OPERATION_COUNT = ENTITY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableEventImpl <em>Runnable Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableEvent()
	 * @generated
	 */
	int RUNNABLE_EVENT = 124;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT__CUSTOM_PROPERTIES = ENTITY_EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT__NAME = ENTITY_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT__UNIQUE_NAME = ENTITY_EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT__DESCRIPTION = ENTITY_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT__EVENT_TYPE = ENTITY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT__ENTITY = ENTITY_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT__PROCESS = ENTITY_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT__CORE = ENTITY_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Runnable Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT_FEATURE_COUNT = ENTITY_EVENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT___COMPUTE_UNIQUE_NAME = ENTITY_EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT___ENCODE__STRING = ENTITY_EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Runnable Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_EVENT_OPERATION_COUNT = ENTITY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LabelEventImpl <em>Label Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LabelEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLabelEvent()
	 * @generated
	 */
	int LABEL_EVENT = 125;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__CUSTOM_PROPERTIES = ENTITY_EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__NAME = ENTITY_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__UNIQUE_NAME = ENTITY_EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__DESCRIPTION = ENTITY_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__EVENT_TYPE = ENTITY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__ENTITY = ENTITY_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__RUNNABLE = ENTITY_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__PROCESS = ENTITY_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Label Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT_FEATURE_COUNT = ENTITY_EVENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT___COMPUTE_UNIQUE_NAME = ENTITY_EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT___ENCODE__STRING = ENTITY_EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Label Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT_OPERATION_COUNT = ENTITY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreEventImpl <em>Semaphore Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SemaphoreEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSemaphoreEvent()
	 * @generated
	 */
	int SEMAPHORE_EVENT = 126;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__CUSTOM_PROPERTIES = ENTITY_EVENT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__NAME = ENTITY_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__UNIQUE_NAME = ENTITY_EVENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__DESCRIPTION = ENTITY_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__EVENT_TYPE = ENTITY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__ENTITY = ENTITY_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__RUNNABLE = ENTITY_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__PROCESS = ENTITY_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT__CORE = ENTITY_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Semaphore Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT_FEATURE_COUNT = ENTITY_EVENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT___COMPUTE_UNIQUE_NAME = ENTITY_EVENT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT___ENCODE__STRING = ENTITY_EVENT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Semaphore Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_EVENT_OPERATION_COUNT = ENTITY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HWModelImpl <em>HW Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HWModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHWModel()
	 * @generated
	 */
	int HW_MODEL = 127;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__TAGS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__SYSTEM_TYPES = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ecu Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__ECU_TYPES = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mc Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__MC_TYPES = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Core Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__CORE_TYPES = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Memory Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__MEMORY_TYPES = BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Network Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__NETWORK_TYPES = BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Access Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__ACCESS_PATHS = BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__SYSTEM = BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>HW Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>HW Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ComplexNodeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComplexNode()
	 * @generated
	 */
	int COMPLEX_NODE = 128;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__TAGS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__QUARTZES = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__PRESCALER = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__MEMORIES = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__NETWORKS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__COMPONENTS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__PORTS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Complex Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Complex Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwSystemImpl <em>Hw System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwSystemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwSystem()
	 * @generated
	 */
	int HW_SYSTEM = 129;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__CUSTOM_PROPERTIES = COMPLEX_NODE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__NAME = COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__UNIQUE_NAME = COMPLEX_NODE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__TAGS = COMPLEX_NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__MEMORIES = COMPLEX_NODE__MEMORIES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__COMPONENTS = COMPLEX_NODE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__PORTS = COMPLEX_NODE__PORTS;

	/**
	 * The feature id for the '<em><b>System Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__SYSTEM_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ecus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__ECUS = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM___COMPUTE_UNIQUE_NAME = COMPLEX_NODE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM___ENCODE__STRING = COMPLEX_NODE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Hw System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ECUImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getECU()
	 * @generated
	 */
	int ECU = 130;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__CUSTOM_PROPERTIES = COMPLEX_NODE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__NAME = COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__UNIQUE_NAME = COMPLEX_NODE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__TAGS = COMPLEX_NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__MEMORIES = COMPLEX_NODE__MEMORIES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__COMPONENTS = COMPLEX_NODE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PORTS = COMPLEX_NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Ecu Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__ECU_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Microcontrollers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__MICROCONTROLLERS = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU___COMPUTE_UNIQUE_NAME = COMPLEX_NODE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU___ENCODE__STRING = COMPLEX_NODE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.MicrocontrollerImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMicrocontroller()
	 * @generated
	 */
	int MICROCONTROLLER = 131;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__CUSTOM_PROPERTIES = COMPLEX_NODE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__NAME = COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__UNIQUE_NAME = COMPLEX_NODE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__TAGS = COMPLEX_NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__MEMORIES = COMPLEX_NODE__MEMORIES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__COMPONENTS = COMPLEX_NODE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__PORTS = COMPLEX_NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Microcontroller Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__MICROCONTROLLER_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__CORES = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Microcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER___COMPUTE_UNIQUE_NAME = COMPLEX_NODE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER___ENCODE__STRING = COMPLEX_NODE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Microcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CoreImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCore()
	 * @generated
	 */
	int CORE = 132;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CUSTOM_PROPERTIES = COMPLEX_NODE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NAME = COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__UNIQUE_NAME = COMPLEX_NODE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__TAGS = COMPLEX_NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__MEMORIES = COMPLEX_NODE__MEMORIES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__COMPONENTS = COMPLEX_NODE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__PORTS = COMPLEX_NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Core Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CORE_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lockstep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__LOCKSTEP_GROUP = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE___COMPUTE_UNIQUE_NAME = COMPLEX_NODE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE___ENCODE__STRING = COMPLEX_NODE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.MemoryImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 133;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CUSTOM_PROPERTIES = COMPLEX_NODE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__UNIQUE_NAME = COMPLEX_NODE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__TAGS = COMPLEX_NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEMORIES = COMPLEX_NODE__MEMORIES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__COMPONENTS = COMPLEX_NODE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__PORTS = COMPLEX_NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MAPPING = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___COMPUTE_UNIQUE_NAME = COMPLEX_NODE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___ENCODE__STRING = COMPLEX_NODE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.NetworkImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 134;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CUSTOM_PROPERTIES = COMPLEX_NODE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__UNIQUE_NAME = COMPLEX_NODE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TAGS = COMPLEX_NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MEMORIES = COMPLEX_NODE__MEMORIES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__COMPONENTS = COMPLEX_NODE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PORTS = COMPLEX_NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___COMPUTE_UNIQUE_NAME = COMPLEX_NODE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___ENCODE__STRING = COMPLEX_NODE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.QuartzImpl <em>Quartz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.QuartzImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getQuartz()
	 * @generated
	 */
	int QUARTZ = 135;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__CUSTOM_PROPERTIES = COMPLEX_NODE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__NAME = COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__UNIQUE_NAME = COMPLEX_NODE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__TAGS = COMPLEX_NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__MEMORIES = COMPLEX_NODE__MEMORIES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__COMPONENTS = COMPLEX_NODE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__PORTS = COMPLEX_NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__FREQUENCY = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__TYPE = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quartz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ___COMPUTE_UNIQUE_NAME = COMPLEX_NODE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ___ENCODE__STRING = COMPLEX_NODE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Quartz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwComponentImpl <em>Hw Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwComponentImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwComponent()
	 * @generated
	 */
	int HW_COMPONENT = 136;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__CUSTOM_PROPERTIES = COMPLEX_NODE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__NAME = COMPLEX_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__UNIQUE_NAME = COMPLEX_NODE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__TAGS = COMPLEX_NODE__TAGS;

	/**
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Memories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__MEMORIES = COMPLEX_NODE__MEMORIES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__COMPONENTS = COMPLEX_NODE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__PORTS = COMPLEX_NODE__PORTS;

	/**
	 * The feature id for the '<em><b>Nested Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__NESTED_COMPONENTS = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT___COMPUTE_UNIQUE_NAME = COMPLEX_NODE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT___ENCODE__STRING = COMPLEX_NODE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Hw Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HardwareTypeDescriptionImpl <em>Hardware Type Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HardwareTypeDescriptionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHardwareTypeDescription()
	 * @generated
	 */
	int HARDWARE_TYPE_DESCRIPTION = 137;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_DESCRIPTION__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_DESCRIPTION__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_DESCRIPTION__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_DESCRIPTION__TAGS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Type Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_DESCRIPTION___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_DESCRIPTION___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Hardware Type Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_DESCRIPTION_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AbstractionTypeImpl <em>Abstraction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AbstractionTypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAbstractionType()
	 * @generated
	 */
	int ABSTRACTION_TYPE = 138;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TYPE__CUSTOM_PROPERTIES = HARDWARE_TYPE_DESCRIPTION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TYPE__NAME = HARDWARE_TYPE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TYPE__UNIQUE_NAME = HARDWARE_TYPE_DESCRIPTION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TYPE__TAGS = HARDWARE_TYPE_DESCRIPTION__TAGS;

	/**
	 * The number of structural features of the '<em>Abstraction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TYPE_FEATURE_COUNT = HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TYPE___COMPUTE_UNIQUE_NAME = HARDWARE_TYPE_DESCRIPTION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TYPE___ENCODE__STRING = HARDWARE_TYPE_DESCRIPTION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Abstraction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TYPE_OPERATION_COUNT = HARDWARE_TYPE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SystemTypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 139;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__CUSTOM_PROPERTIES = ABSTRACTION_TYPE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__NAME = ABSTRACTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__UNIQUE_NAME = ABSTRACTION_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__TAGS = ABSTRACTION_TYPE__TAGS;

	/**
	 * The number of structural features of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_FEATURE_COUNT = ABSTRACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE___COMPUTE_UNIQUE_NAME = ABSTRACTION_TYPE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE___ENCODE__STRING = ABSTRACTION_TYPE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_OPERATION_COUNT = ABSTRACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ECUTypeImpl <em>ECU Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ECUTypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getECUType()
	 * @generated
	 */
	int ECU_TYPE = 140;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE__CUSTOM_PROPERTIES = ABSTRACTION_TYPE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE__NAME = ABSTRACTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE__UNIQUE_NAME = ABSTRACTION_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE__TAGS = ABSTRACTION_TYPE__TAGS;

	/**
	 * The number of structural features of the '<em>ECU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE_FEATURE_COUNT = ABSTRACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE___COMPUTE_UNIQUE_NAME = ABSTRACTION_TYPE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE___ENCODE__STRING = ABSTRACTION_TYPE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>ECU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE_OPERATION_COUNT = ABSTRACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.MicrocontrollerTypeImpl <em>Microcontroller Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.MicrocontrollerTypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMicrocontrollerType()
	 * @generated
	 */
	int MICROCONTROLLER_TYPE = 141;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE__CUSTOM_PROPERTIES = ABSTRACTION_TYPE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE__NAME = ABSTRACTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE__UNIQUE_NAME = ABSTRACTION_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE__TAGS = ABSTRACTION_TYPE__TAGS;

	/**
	 * The number of structural features of the '<em>Microcontroller Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE_FEATURE_COUNT = ABSTRACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE___COMPUTE_UNIQUE_NAME = ABSTRACTION_TYPE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE___ENCODE__STRING = ABSTRACTION_TYPE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Microcontroller Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE_OPERATION_COUNT = ABSTRACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CoreTypeImpl <em>Core Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CoreTypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCoreType()
	 * @generated
	 */
	int CORE_TYPE = 142;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__CUSTOM_PROPERTIES = ABSTRACTION_TYPE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__NAME = ABSTRACTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__UNIQUE_NAME = ABSTRACTION_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__TAGS = ABSTRACTION_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__BIT_WIDTH = ABSTRACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instructions Per Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__INSTRUCTIONS_PER_CYCLE = ABSTRACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE_FEATURE_COUNT = ABSTRACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE___COMPUTE_UNIQUE_NAME = ABSTRACTION_TYPE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE___ENCODE__STRING = ABSTRACTION_TYPE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE_OPERATION_COUNT = ABSTRACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.MemoryTypeImpl <em>Memory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.MemoryTypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMemoryType()
	 * @generated
	 */
	int MEMORY_TYPE = 143;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__CUSTOM_PROPERTIES = HARDWARE_TYPE_DESCRIPTION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__NAME = HARDWARE_TYPE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__UNIQUE_NAME = HARDWARE_TYPE_DESCRIPTION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__TAGS = HARDWARE_TYPE_DESCRIPTION__TAGS;

	/**
	 * The feature id for the '<em><b>XAccess Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__XACCESS_PATTERN = HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__TYPE = HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE__SIZE = HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE_FEATURE_COUNT = HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE___COMPUTE_UNIQUE_NAME = HARDWARE_TYPE_DESCRIPTION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE___ENCODE__STRING = HARDWARE_TYPE_DESCRIPTION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Memory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TYPE_OPERATION_COUNT = HARDWARE_TYPE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.NetworkTypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 144;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__CUSTOM_PROPERTIES = HARDWARE_TYPE_DESCRIPTION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__NAME = HARDWARE_TYPE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__UNIQUE_NAME = HARDWARE_TYPE_DESCRIPTION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__TAGS = HARDWARE_TYPE_DESCRIPTION__TAGS;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__SCHED_POLICY = HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__BIT_WIDTH = HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_FEATURE_COUNT = HARDWARE_TYPE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE___COMPUTE_UNIQUE_NAME = HARDWARE_TYPE_DESCRIPTION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE___ENCODE__STRING = HARDWARE_TYPE_DESCRIPTION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_OPERATION_COUNT = HARDWARE_TYPE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwPortImpl <em>Hw Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwPortImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwPort()
	 * @generated
	 */
	int HW_PORT = 145;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PINS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hw Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PinImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 146;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl <em>Complex Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComplexPort()
	 * @generated
	 */
	int COMPLEX_PORT = 147;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__CUSTOM_PROPERTIES = HW_PORT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__NAME = HW_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__UNIQUE_NAME = HW_PORT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__PINS = HW_PORT__PINS;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__NETWORK = HW_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__MASTER = HW_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__BIT_WIDTH = HW_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__BASE_ADDRESS = HW_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Address Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__ADDRESS_RANGE = HW_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__DIRECTION = HW_PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Write Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__WRITE_CYCLES = HW_PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Read Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__READ_CYCLES = HW_PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sched Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT__SCHED_VALUE = HW_PORT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Complex Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT_FEATURE_COUNT = HW_PORT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT___ENCODE__STRING = HW_PORT___ENCODE__STRING;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT___COMPUTE_UNIQUE_NAME = HW_PORT___COMPUTE_UNIQUE_NAME;

	/**
	 * The number of operations of the '<em>Complex Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PORT_OPERATION_COUNT = HW_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPinImpl <em>Complex Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ComplexPinImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComplexPin()
	 * @generated
	 */
	int COMPLEX_PIN = 148;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN__CUSTOM_PROPERTIES = PIN__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN__UNIQUE_NAME = PIN__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN__TYPE = PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN__BASE_ADDRESS = PIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN__DIRECTION = PIN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Complex Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN___COMPUTE_UNIQUE_NAME = PIN___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN___ENCODE__STRING = PIN___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Complex Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PrescalerImpl <em>Prescaler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PrescalerImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPrescaler()
	 * @generated
	 */
	int PRESCALER = 149;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Clock Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__CLOCK_RATIO = 1;

	/**
	 * The feature id for the '<em><b>Quartz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__QUARTZ = 2;

	/**
	 * The number of structural features of the '<em>Prescaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Prescaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CrossbarSwitchImpl <em>Crossbar Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CrossbarSwitchImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCrossbarSwitch()
	 * @generated
	 */
	int CROSSBAR_SWITCH = 150;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH__CUSTOM_PROPERTIES = NETWORK_TYPE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH__NAME = NETWORK_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH__UNIQUE_NAME = NETWORK_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH__TAGS = NETWORK_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH__SCHED_POLICY = NETWORK_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH__BIT_WIDTH = NETWORK_TYPE__BIT_WIDTH;

	/**
	 * The feature id for the '<em><b>Con Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH__CON_CONNECTIONS = NETWORK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Crossbar Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH_FEATURE_COUNT = NETWORK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH___COMPUTE_UNIQUE_NAME = NETWORK_TYPE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH___ENCODE__STRING = NETWORK_TYPE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Crossbar Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSBAR_SWITCH_OPERATION_COUNT = NETWORK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.BusImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 151;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CUSTOM_PROPERTIES = NETWORK_TYPE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = NETWORK_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__UNIQUE_NAME = NETWORK_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__TAGS = NETWORK_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SCHED_POLICY = NETWORK_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BIT_WIDTH = NETWORK_TYPE__BIT_WIDTH;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BUS_TYPE = NETWORK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = NETWORK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___COMPUTE_UNIQUE_NAME = NETWORK_TYPE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___ENCODE__STRING = NETWORK_TYPE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = NETWORK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.BridgeImpl <em>Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.BridgeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getBridge()
	 * @generated
	 */
	int BRIDGE = 152;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__CUSTOM_PROPERTIES = NETWORK_TYPE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__NAME = NETWORK_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__UNIQUE_NAME = NETWORK_TYPE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__TAGS = NETWORK_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__SCHED_POLICY = NETWORK_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE__BIT_WIDTH = NETWORK_TYPE__BIT_WIDTH;

	/**
	 * The number of structural features of the '<em>Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_FEATURE_COUNT = NETWORK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE___COMPUTE_UNIQUE_NAME = NETWORK_TYPE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE___ENCODE__STRING = NETWORK_TYPE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_OPERATION_COUNT = NETWORK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.AccessPath <em>Access Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.AccessPath
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAccessPath()
	 * @generated
	 */
	int ACCESS_PATH = 153;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH__NAME = IREFERABLE__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH__UNIQUE_NAME = IREFERABLE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH__SOURCE = IREFERABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH__TARGET = IREFERABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH_FEATURE_COUNT = IREFERABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH___COMPUTE_UNIQUE_NAME = IREFERABLE___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH___ENCODE__STRING = IREFERABLE___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Access Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH_OPERATION_COUNT = IREFERABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LatencyAccessPathImpl <em>Latency Access Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LatencyAccessPathImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLatencyAccessPath()
	 * @generated
	 */
	int LATENCY_ACCESS_PATH = 154;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH__NAME = ACCESS_PATH__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH__UNIQUE_NAME = ACCESS_PATH__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH__SOURCE = ACCESS_PATH__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH__TARGET = ACCESS_PATH__TARGET;

	/**
	 * The feature id for the '<em><b>Latencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH__LATENCIES = ACCESS_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Latency Access Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH_FEATURE_COUNT = ACCESS_PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH___COMPUTE_UNIQUE_NAME = ACCESS_PATH___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH___ENCODE__STRING = ACCESS_PATH___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Latency Access Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH_OPERATION_COUNT = ACCESS_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessPathImpl <em>Hw Access Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwAccessPathImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwAccessPath()
	 * @generated
	 */
	int HW_ACCESS_PATH = 155;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH__NAME = ACCESS_PATH__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH__UNIQUE_NAME = ACCESS_PATH__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH__SOURCE = ACCESS_PATH__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH__TARGET = ACCESS_PATH__TARGET;

	/**
	 * The feature id for the '<em><b>Hw Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH__HW_ELEMENTS = ACCESS_PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Access Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH_FEATURE_COUNT = ACCESS_PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH___COMPUTE_UNIQUE_NAME = ACCESS_PATH___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH___ENCODE__STRING = ACCESS_PATH___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Hw Access Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH_OPERATION_COUNT = ACCESS_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement <em>Latency Access Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLatencyAccessPathElement()
	 * @generated
	 */
	int LATENCY_ACCESS_PATH_ELEMENT = 156;

	/**
	 * The number of structural features of the '<em>Latency Access Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Latency Access Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_ACCESS_PATH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AccessPathRefImpl <em>Access Path Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AccessPathRefImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAccessPathRef()
	 * @generated
	 */
	int ACCESS_PATH_REF = 157;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH_REF__REF = LATENCY_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Path Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH_REF_FEATURE_COUNT = LATENCY_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Access Path Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PATH_REF_OPERATION_COUNT = LATENCY_ACCESS_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.Latency <em>Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.Latency
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLatency()
	 * @generated
	 */
	int LATENCY = 158;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__ACCESS_TYPE = LATENCY_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transfer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__TRANSFER_SIZE = LATENCY_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quartz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__QUARTZ = LATENCY_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_FEATURE_COUNT = LATENCY_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_OPERATION_COUNT = LATENCY_ACCESS_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LatencyConstantImpl <em>Latency Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LatencyConstantImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLatencyConstant()
	 * @generated
	 */
	int LATENCY_CONSTANT = 159;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTANT__ACCESS_TYPE = LATENCY__ACCESS_TYPE;

	/**
	 * The feature id for the '<em><b>Transfer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTANT__TRANSFER_SIZE = LATENCY__TRANSFER_SIZE;

	/**
	 * The feature id for the '<em><b>Quartz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTANT__QUARTZ = LATENCY__QUARTZ;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTANT__VALUE = LATENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Latency Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTANT_FEATURE_COUNT = LATENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Latency Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_CONSTANT_OPERATION_COUNT = LATENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LatencyDeviationImpl <em>Latency Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LatencyDeviationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLatencyDeviation()
	 * @generated
	 */
	int LATENCY_DEVIATION = 160;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_DEVIATION__ACCESS_TYPE = LATENCY__ACCESS_TYPE;

	/**
	 * The feature id for the '<em><b>Transfer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_DEVIATION__TRANSFER_SIZE = LATENCY__TRANSFER_SIZE;

	/**
	 * The feature id for the '<em><b>Quartz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_DEVIATION__QUARTZ = LATENCY__QUARTZ;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_DEVIATION__DEVIATION = LATENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Latency Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_DEVIATION_FEATURE_COUNT = LATENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Latency Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_DEVIATION_OPERATION_COUNT = LATENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.HwAccessPathElement <em>Hw Access Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPathElement
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwAccessPathElement()
	 * @generated
	 */
	int HW_ACCESS_PATH_ELEMENT = 161;

	/**
	 * The number of structural features of the '<em>Hw Access Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hw Access Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessPathRefImpl <em>Hw Access Path Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwAccessPathRefImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwAccessPathRef()
	 * @generated
	 */
	int HW_ACCESS_PATH_REF = 162;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH_REF__REF = HW_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Access Path Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH_REF_FEATURE_COUNT = HW_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hw Access Path Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACCESS_PATH_REF_OPERATION_COUNT = HW_ACCESS_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwElementRefImpl <em>Hw Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwElementRefImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwElementRef()
	 * @generated
	 */
	int HW_ELEMENT_REF = 163;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ELEMENT_REF__PORT = HW_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ELEMENT_REF_FEATURE_COUNT = HW_ACCESS_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hw Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ELEMENT_REF_OPERATION_COUNT = HW_ACCESS_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl <em>Mapping Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 164;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Task Allocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__TASK_ALLOCATION = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Isr Allocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__ISR_ALLOCATION = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runnable Allocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__RUNNABLE_ALLOCATION = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Core Allocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__CORE_ALLOCATION = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__MAPPING = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__ADDRESS_MAPPING_TYPE = BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CoreAllocationImpl <em>Core Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CoreAllocationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCoreAllocation()
	 * @generated
	 */
	int CORE_ALLOCATION = 165;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_ALLOCATION__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_ALLOCATION__SCHEDULER = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_ALLOCATION__CORE = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scheduler Link Int</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_ALLOCATION__SCHEDULER_LINK_INT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Core Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_ALLOCATION_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Core Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_ALLOCATION_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.MappingImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 166;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MEMORY = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory Position Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MEMORY_POSITION_ADDRESS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Link Int</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MEMORY_LINK_INT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SectionMappingImpl <em>Section Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SectionMappingImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSectionMapping()
	 * @generated
	 */
	int SECTION_MAPPING = 167;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING__CUSTOM_PROPERTIES = MAPPING__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING__MEMORY = MAPPING__MEMORY;

	/**
	 * The feature id for the '<em><b>Memory Position Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING__MEMORY_POSITION_ADDRESS = MAPPING__MEMORY_POSITION_ADDRESS;

	/**
	 * The feature id for the '<em><b>Memory Link Int</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING__MEMORY_LINK_INT = MAPPING__MEMORY_LINK_INT;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING__SECTION = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMappingImpl <em>Abstract Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AbstractElementMappingImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAbstractElementMapping()
	 * @generated
	 */
	int ABSTRACT_ELEMENT_MAPPING = 168;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING__CUSTOM_PROPERTIES = MAPPING__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING__MEMORY = MAPPING__MEMORY;

	/**
	 * The feature id for the '<em><b>Memory Position Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING__MEMORY_POSITION_ADDRESS = MAPPING__MEMORY_POSITION_ADDRESS;

	/**
	 * The feature id for the '<em><b>Memory Link Int</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING__MEMORY_LINK_INT = MAPPING__MEMORY_LINK_INT;

	/**
	 * The feature id for the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TaskAllocationImpl <em>Task Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TaskAllocationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTaskAllocation()
	 * @generated
	 */
	int TASK_ALLOCATION = 169;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ALLOCATION__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ALLOCATION__TASK = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ALLOCATION__SCHEDULER = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ALLOCATION_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ALLOCATION_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ISRAllocationImpl <em>ISR Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ISRAllocationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getISRAllocation()
	 * @generated
	 */
	int ISR_ALLOCATION = 170;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_ALLOCATION__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Isr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_ALLOCATION__ISR = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_ALLOCATION__CONTROLLER = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ISR Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_ALLOCATION_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ISR Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_ALLOCATION_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableAllocationImpl <em>Runnable Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableAllocationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableAllocation()
	 * @generated
	 */
	int RUNNABLE_ALLOCATION = 171;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION__SCHEDULER = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION__ENTITY = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runnable Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Runnable Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OSModelImpl <em>OS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OSModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOSModel()
	 * @generated
	 */
	int OS_MODEL = 172;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Os Buffering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL__OS_BUFFERING = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semaphores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL__SEMAPHORES = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operating Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL__OPERATING_SYSTEMS = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Os Overheads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL__OS_OVERHEADS = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>OS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OsBufferingImpl <em>Os Buffering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OsBufferingImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOsBuffering()
	 * @generated
	 */
	int OS_BUFFERING = 173;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_BUFFERING__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Runnable Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_BUFFERING__RUNNABLE_LEVEL = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_BUFFERING__PROCESS_LEVEL = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schedule Section Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_BUFFERING__SCHEDULE_SECTION_LEVEL = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Buffering Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_BUFFERING__BUFFERING_ALGORITHM = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Os Buffering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_BUFFERING_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Os Buffering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_BUFFERING_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreImpl <em>Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SemaphoreImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSemaphore()
	 * @generated
	 */
	int SEMAPHORE = 174;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Inital Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__INITAL_VALUE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__MAX_VALUE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority Ceiling Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__PRIORITY_CEILING_PROTOCOL = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulerImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 175;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Scheduling Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULING_UNIT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Unit Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULE_UNIT_PRIORITY = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__CORE_ALLOCATION = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.InterruptSchedulingAlgorithmImpl <em>Interrupt Scheduling Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.InterruptSchedulingAlgorithmImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInterruptSchedulingAlgorithm()
	 * @generated
	 */
	int INTERRUPT_SCHEDULING_ALGORITHM = 176;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Interrupt Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_SCHEDULING_ALGORITHM_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interrupt Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_SCHEDULING_ALGORITHM_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulingAlgorithmImpl <em>Task Scheduling Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TaskSchedulingAlgorithmImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTaskSchedulingAlgorithm()
	 * @generated
	 */
	int TASK_SCHEDULING_ALGORITHM = 177;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Task Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OSEKImpl <em>OSEK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OSEKImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOSEK()
	 * @generated
	 */
	int OSEK = 178;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>OSEK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OSEK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PartlyPFairPD2Impl <em>Partly PFair PD2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PartlyPFairPD2Impl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPartlyPFairPD2()
	 * @generated
	 */
	int PARTLY_PFAIR_PD2 = 179;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTLY_PFAIR_PD2__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Quant Size Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTLY_PFAIR_PD2__QUANT_SIZE_NS = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partly PFair PD2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTLY_PFAIR_PD2_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Partly PFair PD2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTLY_PFAIR_PD2_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PfairPD2Impl <em>Pfair PD2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PfairPD2Impl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPfairPD2()
	 * @generated
	 */
	int PFAIR_PD2 = 180;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFAIR_PD2__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Quant Size Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFAIR_PD2__QUANT_SIZE_NS = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pfair PD2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFAIR_PD2_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pfair PD2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFAIR_PD2_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PartlyEarlyReleaseFairPD2Impl <em>Partly Early Release Fair PD2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PartlyEarlyReleaseFairPD2Impl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPartlyEarlyReleaseFairPD2()
	 * @generated
	 */
	int PARTLY_EARLY_RELEASE_FAIR_PD2 = 181;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTLY_EARLY_RELEASE_FAIR_PD2__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Quant Size Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTLY_EARLY_RELEASE_FAIR_PD2__QUANT_SIZE_NS = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partly Early Release Fair PD2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTLY_EARLY_RELEASE_FAIR_PD2_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Partly Early Release Fair PD2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTLY_EARLY_RELEASE_FAIR_PD2_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EarlyReleaseFairPD2Impl <em>Early Release Fair PD2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EarlyReleaseFairPD2Impl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEarlyReleaseFairPD2()
	 * @generated
	 */
	int EARLY_RELEASE_FAIR_PD2 = 182;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_RELEASE_FAIR_PD2__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Quant Size Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_RELEASE_FAIR_PD2__QUANT_SIZE_NS = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Early Release Fair PD2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_RELEASE_FAIR_PD2_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Early Release Fair PD2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_RELEASE_FAIR_PD2_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LeastLocalRemainingExecutionTimeFirstImpl <em>Least Local Remaining Execution Time First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LeastLocalRemainingExecutionTimeFirstImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLeastLocalRemainingExecutionTimeFirst()
	 * @generated
	 */
	int LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST = 183;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Least Local Remaining Execution Time First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Least Local Remaining Execution Time First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_LOCAL_REMAINING_EXECUTION_TIME_FIRST_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EarliestDeadlineFirstImpl <em>Earliest Deadline First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EarliestDeadlineFirstImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEarliestDeadlineFirst()
	 * @generated
	 */
	int EARLIEST_DEADLINE_FIRST = 184;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLIEST_DEADLINE_FIRST__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Earliest Deadline First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLIEST_DEADLINE_FIRST_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Earliest Deadline First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLIEST_DEADLINE_FIRST_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DeadlineMonotonicImpl <em>Deadline Monotonic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DeadlineMonotonicImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDeadlineMonotonic()
	 * @generated
	 */
	int DEADLINE_MONOTONIC = 185;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Deadline Monotonic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deadline Monotonic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RateMonotonicImpl <em>Rate Monotonic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RateMonotonicImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRateMonotonic()
	 * @generated
	 */
	int RATE_MONOTONIC = 186;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Rate Monotonic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rate Monotonic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PriorityBasedRoundRobinImpl <em>Priority Based Round Robin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PriorityBasedRoundRobinImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPriorityBasedRoundRobin()
	 * @generated
	 */
	int PRIORITY_BASED_ROUND_ROBIN = 187;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_BASED_ROUND_ROBIN__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Priority Based Round Robin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_BASED_ROUND_ROBIN_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Priority Based Round Robin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_BASED_ROUND_ROBIN_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.UserSpecificSchedulingAlgorithmImpl <em>User Specific Scheduling Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.UserSpecificSchedulingAlgorithmImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getUserSpecificSchedulingAlgorithm()
	 * @generated
	 */
	int USER_SPECIFIC_SCHEDULING_ALGORITHM = 188;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPECIFIC_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES = TASK_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPECIFIC_SCHEDULING_ALGORITHM__PARAMETER = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Specific Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPECIFIC_SCHEDULING_ALGORITHM_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Specific Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SPECIFIC_SCHEDULING_ALGORITHM_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PriorityBasedImpl <em>Priority Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PriorityBasedImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPriorityBased()
	 * @generated
	 */
	int PRIORITY_BASED = 189;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_BASED__CUSTOM_PROPERTIES = INTERRUPT_SCHEDULING_ALGORITHM__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Priority Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_BASED_FEATURE_COUNT = INTERRUPT_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Priority Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_BASED_OPERATION_COUNT = INTERRUPT_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AlgorithmParameterImpl <em>Algorithm Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AlgorithmParameterImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAlgorithmParameter()
	 * @generated
	 */
	int ALGORITHM_PARAMETER = 190;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Algorithm Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Algorithm Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulingUnitImpl <em>Scheduling Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulingUnitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulingUnit()
	 * @generated
	 */
	int SCHEDULING_UNIT = 191;

	/**
	 * The number of structural features of the '<em>Scheduling Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Scheduling Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulingHWUnitImpl <em>Scheduling HW Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulingHWUnitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulingHWUnit()
	 * @generated
	 */
	int SCHEDULING_HW_UNIT = 192;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_HW_UNIT__CUSTOM_PROPERTIES = SCHEDULING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_HW_UNIT__DELAY = SCHEDULING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scheduling HW Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_HW_UNIT_FEATURE_COUNT = SCHEDULING_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scheduling HW Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_HW_UNIT_OPERATION_COUNT = SCHEDULING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulingSWUnitImpl <em>Scheduling SW Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulingSWUnitImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulingSWUnit()
	 * @generated
	 */
	int SCHEDULING_SW_UNIT = 193;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SW_UNIT__CUSTOM_PROPERTIES = SCHEDULING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SW_UNIT__PRIORITY = SCHEDULING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SW_UNIT__INSTRUCTIONS = SCHEDULING_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interrupt Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SW_UNIT__INTERRUPT_CONTROLLER = SCHEDULING_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scheduling SW Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SW_UNIT_FEATURE_COUNT = SCHEDULING_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Scheduling SW Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SW_UNIT_OPERATION_COUNT = SCHEDULING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OperatingSystemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 194;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overhead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__OVERHEAD = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Schedulers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__TASK_SCHEDULERS = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interrupt Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__INTERRUPT_CONTROLLERS = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.VendorOperatingSystemImpl <em>Vendor Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.VendorOperatingSystemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getVendorOperatingSystem()
	 * @generated
	 */
	int VENDOR_OPERATING_SYSTEM = 195;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM__CUSTOM_PROPERTIES = OPERATING_SYSTEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM__NAME = OPERATING_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Overhead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM__OVERHEAD = OPERATING_SYSTEM__OVERHEAD;

	/**
	 * The feature id for the '<em><b>Task Schedulers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM__TASK_SCHEDULERS = OPERATING_SYSTEM__TASK_SCHEDULERS;

	/**
	 * The feature id for the '<em><b>Interrupt Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM__INTERRUPT_CONTROLLERS = OPERATING_SYSTEM__INTERRUPT_CONTROLLERS;

	/**
	 * The feature id for the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM__OS_NAME = OPERATING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM__VENDOR = OPERATING_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM__VERSION = OPERATING_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vendor Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM_FEATURE_COUNT = OPERATING_SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vendor Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATING_SYSTEM_OPERATION_COUNT = OPERATING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl <em>Task Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TaskSchedulerImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTaskScheduler()
	 * @generated
	 */
	int TASK_SCHEDULER = 196;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER__CUSTOM_PROPERTIES = SCHEDULER__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER__NAME = SCHEDULER__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER__UNIQUE_NAME = SCHEDULER__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Scheduling Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER__SCHEDULING_UNIT = SCHEDULER__SCHEDULING_UNIT;

	/**
	 * The feature id for the '<em><b>Schedule Unit Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER__SCHEDULE_UNIT_PRIORITY = SCHEDULER__SCHEDULE_UNIT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Core Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER__CORE_ALLOCATION = SCHEDULER__CORE_ALLOCATION;

	/**
	 * The feature id for the '<em><b>Scheduling Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER__SCHEDULING_ALGORITHM = SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER_FEATURE_COUNT = SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER___COMPUTE_UNIQUE_NAME = SCHEDULER___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER___ENCODE__STRING = SCHEDULER___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Task Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER_OPERATION_COUNT = SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.InterruptControllerImpl <em>Interrupt Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.InterruptControllerImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInterruptController()
	 * @generated
	 */
	int INTERRUPT_CONTROLLER = 197;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER__CUSTOM_PROPERTIES = SCHEDULER__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER__NAME = SCHEDULER__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER__UNIQUE_NAME = SCHEDULER__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Scheduling Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER__SCHEDULING_UNIT = SCHEDULER__SCHEDULING_UNIT;

	/**
	 * The feature id for the '<em><b>Schedule Unit Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER__SCHEDULE_UNIT_PRIORITY = SCHEDULER__SCHEDULE_UNIT_PRIORITY;

	/**
	 * The feature id for the '<em><b>Core Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER__CORE_ALLOCATION = SCHEDULER__CORE_ALLOCATION;

	/**
	 * The feature id for the '<em><b>Scheduling Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER__SCHEDULING_ALGORITHM = SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interrupt Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER_FEATURE_COUNT = SCHEDULER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER___COMPUTE_UNIQUE_NAME = SCHEDULER___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER___ENCODE__STRING = SCHEDULER___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Interrupt Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER_OPERATION_COUNT = SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OsInstructionsImpl <em>Os Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OsInstructionsImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOsInstructions()
	 * @generated
	 */
	int OS_INSTRUCTIONS = 198;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Api Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS__API_OVERHEAD = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Isr Category1 Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS__ISR_CATEGORY1_OVERHEAD = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Isr Category2 Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS__ISR_CATEGORY2_OVERHEAD = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Os Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Os Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_INSTRUCTIONS_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl <em>Os API Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OsAPIInstructionsImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOsAPIInstructions()
	 * @generated
	 */
	int OS_API_INSTRUCTIONS = 199;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Api Send Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_SEND_MESSAGE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Terminate Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_TERMINATE_TASK = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_SCHEDULE = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Api Request Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_REQUEST_RESOURCE = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Api Release Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_RELEASE_RESOURCE = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Api Set Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_SET_EVENT = BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Api Wait Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_WAIT_EVENT = BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Api Clear Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_CLEAR_EVENT = BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Api Activate Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_ACTIVATE_TASK = BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Api Enforced Migration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS__API_ENFORCED_MIGRATION = BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Os API Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Os API Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_API_INSTRUCTIONS_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OsISRInstructionsImpl <em>Os ISR Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OsISRInstructionsImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOsISRInstructions()
	 * @generated
	 */
	int OS_ISR_INSTRUCTIONS = 200;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ISR_INSTRUCTIONS__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pre Execution Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ISR_INSTRUCTIONS__PRE_EXECUTION_OVERHEAD = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Execution Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ISR_INSTRUCTIONS__POST_EXECUTION_OVERHEAD = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os ISR Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ISR_INSTRUCTIONS_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Os ISR Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_ISR_INSTRUCTIONS_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OsExecutionInstructionsImpl <em>Os Execution Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OsExecutionInstructionsImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOsExecutionInstructions()
	 * @generated
	 */
	int OS_EXECUTION_INSTRUCTIONS = 201;

	/**
	 * The number of structural features of the '<em>Os Execution Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Os Execution Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OsExecutionInstructionsDeviationImpl <em>Os Execution Instructions Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OsExecutionInstructionsDeviationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOsExecutionInstructionsDeviation()
	 * @generated
	 */
	int OS_EXECUTION_INSTRUCTIONS_DEVIATION = 202;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES = OS_EXECUTION_INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION = OS_EXECUTION_INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os Execution Instructions Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_DEVIATION_FEATURE_COUNT = OS_EXECUTION_INSTRUCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Os Execution Instructions Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_DEVIATION_OPERATION_COUNT = OS_EXECUTION_INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OsExecutionInstructionsConstantImpl <em>Os Execution Instructions Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OsExecutionInstructionsConstantImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOsExecutionInstructionsConstant()
	 * @generated
	 */
	int OS_EXECUTION_INSTRUCTIONS_CONSTANT = 203;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_CONSTANT__CUSTOM_PROPERTIES = OS_EXECUTION_INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_CONSTANT__VALUE = OS_EXECUTION_INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os Execution Instructions Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_CONSTANT_FEATURE_COUNT = OS_EXECUTION_INSTRUCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Os Execution Instructions Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EXECUTION_INSTRUCTIONS_CONSTANT_OPERATION_COUNT = OS_EXECUTION_INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PropertyConstraintsModelImpl <em>Property Constraints Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PropertyConstraintsModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPropertyConstraintsModel()
	 * @generated
	 */
	int PROPERTY_CONSTRAINTS_MODEL = 204;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Allocation Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_MODEL__ALLOCATION_CONSTRAINTS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_MODEL__MAPPING_CONSTRAINTS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core Type Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_MODEL__CORE_TYPE_DEFINITIONS = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory Type Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_MODEL__MEMORY_TYPE_DEFINITIONS = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property Constraints Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Property Constraints Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AllocationConstraintImpl <em>Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AllocationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAllocationConstraint()
	 * @generated
	 */
	int ALLOCATION_CONSTRAINT = 205;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Hw Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT__HW_CONSTRAINT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.MappingConstraintImpl <em>Mapping Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.MappingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMappingConstraint()
	 * @generated
	 */
	int MAPPING_CONSTRAINT = 206;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONSTRAINT__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Hw Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONSTRAINT__HW_CONSTRAINT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONSTRAINT_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mapping Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CONSTRAINT_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessAllocationConstraintImpl <em>Process Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessAllocationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessAllocationConstraint()
	 * @generated
	 */
	int PROCESS_ALLOCATION_CONSTRAINT = 207;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ALLOCATION_CONSTRAINT__CUSTOM_PROPERTIES = ALLOCATION_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Hw Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ALLOCATION_CONSTRAINT__HW_CONSTRAINT = ALLOCATION_CONSTRAINT__HW_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ALLOCATION_CONSTRAINT__PROCESS = ALLOCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ALLOCATION_CONSTRAINT_FEATURE_COUNT = ALLOCATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ALLOCATION_CONSTRAINT_OPERATION_COUNT = ALLOCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeAllocationConstraintImpl <em>Process Prototype Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeAllocationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessPrototypeAllocationConstraint()
	 * @generated
	 */
	int PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT = 208;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT__CUSTOM_PROPERTIES = ALLOCATION_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Hw Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT__HW_CONSTRAINT = ALLOCATION_CONSTRAINT__HW_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Process Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT__PROCESS_PROTOTYPE = ALLOCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Prototype Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT_FEATURE_COUNT = ALLOCATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Prototype Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT_OPERATION_COUNT = ALLOCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableAllocationConstraintImpl <em>Runnable Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableAllocationConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableAllocationConstraint()
	 * @generated
	 */
	int RUNNABLE_ALLOCATION_CONSTRAINT = 209;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION_CONSTRAINT__CUSTOM_PROPERTIES = ALLOCATION_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Hw Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION_CONSTRAINT__HW_CONSTRAINT = ALLOCATION_CONSTRAINT__HW_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION_CONSTRAINT__RUNNABLE = ALLOCATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runnable Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION_CONSTRAINT_FEATURE_COUNT = ALLOCATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runnable Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ALLOCATION_CONSTRAINT_OPERATION_COUNT = ALLOCATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SectionMappingConstraintImpl <em>Section Mapping Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SectionMappingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSectionMappingConstraint()
	 * @generated
	 */
	int SECTION_MAPPING_CONSTRAINT = 210;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING_CONSTRAINT__CUSTOM_PROPERTIES = MAPPING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Hw Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING_CONSTRAINT__HW_CONSTRAINT = MAPPING_CONSTRAINT__HW_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING_CONSTRAINT__SECTION = MAPPING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section Mapping Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING_CONSTRAINT_FEATURE_COUNT = MAPPING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section Mapping Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_MAPPING_CONSTRAINT_OPERATION_COUNT = MAPPING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMappingConstraintImpl <em>Abstract Element Mapping Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AbstractElementMappingConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAbstractElementMappingConstraint()
	 * @generated
	 */
	int ABSTRACT_ELEMENT_MAPPING_CONSTRAINT = 211;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__CUSTOM_PROPERTIES = MAPPING_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Hw Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__HW_CONSTRAINT = MAPPING_CONSTRAINT__HW_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT = MAPPING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Element Mapping Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING_CONSTRAINT_FEATURE_COUNT = MAPPING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Element Mapping Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MAPPING_CONSTRAINT_OPERATION_COUNT = MAPPING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwCoreConstraintImpl <em>Hw Core Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwCoreConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwCoreConstraint()
	 * @generated
	 */
	int HW_CORE_CONSTRAINT = 212;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONSTRAINT__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Hw Core Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONSTRAINT_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hw Core Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONSTRAINT_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwMemoryConstraintImpl <em>Hw Memory Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwMemoryConstraintImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwMemoryConstraint()
	 * @generated
	 */
	int HW_MEMORY_CONSTRAINT = 213;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONSTRAINT__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Hw Memory Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONSTRAINT_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hw Memory Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONSTRAINT_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwCorePropertyImpl <em>Hw Core Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwCorePropertyImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwCoreProperty()
	 * @generated
	 */
	int HW_CORE_PROPERTY = 214;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_PROPERTY__CUSTOM_PROPERTIES = HW_CORE_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_PROPERTY__CORE = HW_CORE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_PROPERTY__COMPARATOR = HW_CORE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw Core Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_PROPERTY_FEATURE_COUNT = HW_CORE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hw Core Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_PROPERTY_OPERATION_COUNT = HW_CORE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwCoreConjunctionImpl <em>Hw Core Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwCoreConjunctionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwCoreConjunction()
	 * @generated
	 */
	int HW_CORE_CONJUNCTION = 215;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONJUNCTION__CUSTOM_PROPERTIES = HW_CORE_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Conjunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONJUNCTION__CONJUNCTION = HW_CORE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONJUNCTION__FIRST_CONSTRAINT = HW_CORE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONJUNCTION__SECOND_CONSTRAINT = HW_CORE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hw Core Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONJUNCTION_FEATURE_COUNT = HW_CORE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hw Core Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CORE_CONJUNCTION_OPERATION_COUNT = HW_CORE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwMemoryPropertyImpl <em>Hw Memory Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwMemoryPropertyImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwMemoryProperty()
	 * @generated
	 */
	int HW_MEMORY_PROPERTY = 216;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_PROPERTY__CUSTOM_PROPERTIES = HW_MEMORY_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_PROPERTY__MEMORY = HW_MEMORY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_PROPERTY__COMPARATOR = HW_MEMORY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw Memory Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_PROPERTY_FEATURE_COUNT = HW_MEMORY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hw Memory Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_PROPERTY_OPERATION_COUNT = HW_MEMORY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.HwMemoryConjunctionImpl <em>Hw Memory Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.HwMemoryConjunctionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getHwMemoryConjunction()
	 * @generated
	 */
	int HW_MEMORY_CONJUNCTION = 217;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONJUNCTION__CUSTOM_PROPERTIES = HW_MEMORY_CONSTRAINT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Conjunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONJUNCTION__CONJUNCTION = HW_MEMORY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT = HW_MEMORY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT = HW_MEMORY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hw Memory Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONJUNCTION_FEATURE_COUNT = HW_MEMORY_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hw Memory Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_CONJUNCTION_OPERATION_COUNT = HW_MEMORY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.StimuliModelImpl <em>Stimuli Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.StimuliModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getStimuliModel()
	 * @generated
	 */
	int STIMULI_MODEL = 218;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Stimuli</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_MODEL__STIMULI = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_MODEL__CLOCKS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stimuli Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stimuli Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.StimulusImpl <em>Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.StimulusImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getStimulus()
	 * @generated
	 */
	int STIMULUS = 219;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__STIMULUS_DEVIATION = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__SET_MODE_VALUE_LIST = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__ENABLING_MODE_VALUE_LIST = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__DISABLING_MODE_VALUE_LIST = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ModeValueListImpl <em>Mode Value List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ModeValueListImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getModeValueList()
	 * @generated
	 */
	int MODE_VALUE_LIST = 220;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST__ENTRIES = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mode Value List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mode Value List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ModeValueListEntryImpl <em>Mode Value List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ModeValueListEntryImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getModeValueListEntry()
	 * @generated
	 */
	int MODE_VALUE_LIST_ENTRY = 221;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST_ENTRY__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Value Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST_ENTRY__VALUE_PROVIDER = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST_ENTRY__VALUE = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode Value List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST_ENTRY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mode Value List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_VALUE_LIST_ENTRY_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicImpl <em>Periodic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PeriodicImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPeriodic()
	 * @generated
	 */
	int PERIODIC = 222;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__CUSTOM_PROPERTIES = STIMULUS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__UNIQUE_NAME = STIMULUS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__STIMULUS_DEVIATION = STIMULUS__STIMULUS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__SET_MODE_VALUE_LIST = STIMULUS__SET_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__ENABLING_MODE_VALUE_LIST = STIMULUS__ENABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__DISABLING_MODE_VALUE_LIST = STIMULUS__DISABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__OFFSET = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__RECURRENCE = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__CLOCK = STIMULUS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC___COMPUTE_UNIQUE_NAME = STIMULUS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC___ENCODE__STRING = STIMULUS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicEventImpl <em>Periodic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PeriodicEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPeriodicEvent()
	 * @generated
	 */
	int PERIODIC_EVENT = 223;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__CUSTOM_PROPERTIES = STIMULUS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__UNIQUE_NAME = STIMULUS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__STIMULUS_DEVIATION = STIMULUS__STIMULUS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__SET_MODE_VALUE_LIST = STIMULUS__SET_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__ENABLING_MODE_VALUE_LIST = STIMULUS__ENABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT__DISABLING_MODE_VALUE_LIST = STIMULUS__DISABLING_MODE_VALUE_LIST;

	/**
	 * The number of structural features of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT___COMPUTE_UNIQUE_NAME = STIMULUS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT___ENCODE__STRING = STIMULUS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Periodic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_EVENT_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CustomStimulusImpl <em>Custom Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CustomStimulusImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCustomStimulus()
	 * @generated
	 */
	int CUSTOM_STIMULUS = 224;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS__CUSTOM_PROPERTIES = STIMULUS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS__UNIQUE_NAME = STIMULUS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS__STIMULUS_DEVIATION = STIMULUS__STIMULUS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS__SET_MODE_VALUE_LIST = STIMULUS__SET_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS__ENABLING_MODE_VALUE_LIST = STIMULUS__ENABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS__DISABLING_MODE_VALUE_LIST = STIMULUS__DISABLING_MODE_VALUE_LIST;

	/**
	 * The number of structural features of the '<em>Custom Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS___COMPUTE_UNIQUE_NAME = STIMULUS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS___ENCODE__STRING = STIMULUS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Custom Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STIMULUS_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SingleImpl <em>Single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SingleImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSingle()
	 * @generated
	 */
	int SINGLE = 225;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__CUSTOM_PROPERTIES = STIMULUS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__UNIQUE_NAME = STIMULUS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__STIMULUS_DEVIATION = STIMULUS__STIMULUS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__SET_MODE_VALUE_LIST = STIMULUS__SET_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__ENABLING_MODE_VALUE_LIST = STIMULUS__ENABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__DISABLING_MODE_VALUE_LIST = STIMULUS__DISABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__ACTIVATION = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE___COMPUTE_UNIQUE_NAME = STIMULUS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE___ENCODE__STRING = STIMULUS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.InterProcessImpl <em>Inter Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.InterProcessImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInterProcess()
	 * @generated
	 */
	int INTER_PROCESS = 226;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS__CUSTOM_PROPERTIES = STIMULUS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS__UNIQUE_NAME = STIMULUS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS__STIMULUS_DEVIATION = STIMULUS__STIMULUS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS__SET_MODE_VALUE_LIST = STIMULUS__SET_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS__ENABLING_MODE_VALUE_LIST = STIMULUS__ENABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS__DISABLING_MODE_VALUE_LIST = STIMULUS__DISABLING_MODE_VALUE_LIST;

	/**
	 * The number of structural features of the '<em>Inter Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS___COMPUTE_UNIQUE_NAME = STIMULUS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS___ENCODE__STRING = STIMULUS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Inter Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SporadicImpl <em>Sporadic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SporadicImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSporadic()
	 * @generated
	 */
	int SPORADIC = 227;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__CUSTOM_PROPERTIES = STIMULUS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__UNIQUE_NAME = STIMULUS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__STIMULUS_DEVIATION = STIMULUS__STIMULUS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__SET_MODE_VALUE_LIST = STIMULUS__SET_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__ENABLING_MODE_VALUE_LIST = STIMULUS__ENABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__DISABLING_MODE_VALUE_LIST = STIMULUS__DISABLING_MODE_VALUE_LIST;

	/**
	 * The number of structural features of the '<em>Sporadic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC___COMPUTE_UNIQUE_NAME = STIMULUS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC___ENCODE__STRING = STIMULUS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Sporadic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ArrivalCurveImpl <em>Arrival Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ArrivalCurveImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getArrivalCurve()
	 * @generated
	 */
	int ARRIVAL_CURVE = 228;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE__CUSTOM_PROPERTIES = STIMULUS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE__NAME = STIMULUS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE__UNIQUE_NAME = STIMULUS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE__STIMULUS_DEVIATION = STIMULUS__STIMULUS_DEVIATION;

	/**
	 * The feature id for the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE__SET_MODE_VALUE_LIST = STIMULUS__SET_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE__ENABLING_MODE_VALUE_LIST = STIMULUS__ENABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE__DISABLING_MODE_VALUE_LIST = STIMULUS__DISABLING_MODE_VALUE_LIST;

	/**
	 * The feature id for the '<em><b>Arrival Curve Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE__ARRIVAL_CURVE_ENTRIES = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arrival Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE___COMPUTE_UNIQUE_NAME = STIMULUS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE___ENCODE__STRING = STIMULUS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Arrival Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ArrivalCurveEntryImpl <em>Arrival Curve Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ArrivalCurveEntryImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getArrivalCurveEntry()
	 * @generated
	 */
	int ARRIVAL_CURVE_ENTRY = 229;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE_ENTRY__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Number Of Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE_ENTRY__NUMBER_OF_EVENTS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Time Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Time Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arrival Curve Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE_ENTRY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arrival Curve Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_CURVE_ENTRY_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ClockImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 230;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ClockTriangleFunctionImpl <em>Clock Triangle Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ClockTriangleFunctionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getClockTriangleFunction()
	 * @generated
	 */
	int CLOCK_TRIANGLE_FUNCTION = 231;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION__CUSTOM_PROPERTIES = CLOCK__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION__NAME = CLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION__UNIQUE_NAME = CLOCK__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION__SHIFT = CLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION__PERIOD = CLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION__MAX = CLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION__MIN = CLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Clock Triangle Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION___COMPUTE_UNIQUE_NAME = CLOCK___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION___ENCODE__STRING = CLOCK___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Clock Triangle Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_TRIANGLE_FUNCTION_OPERATION_COUNT = CLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ClockSinusFunctionImpl <em>Clock Sinus Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ClockSinusFunctionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getClockSinusFunction()
	 * @generated
	 */
	int CLOCK_SINUS_FUNCTION = 232;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION__CUSTOM_PROPERTIES = CLOCK__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION__NAME = CLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION__UNIQUE_NAME = CLOCK__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION__SHIFT = CLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION__PERIOD = CLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION__AMPLITUDE = CLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION__YOFFSET = CLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Clock Sinus Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION___COMPUTE_UNIQUE_NAME = CLOCK___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION___ENCODE__STRING = CLOCK___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Clock Sinus Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SINUS_FUNCTION_OPERATION_COUNT = CLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ClockMultiplierListImpl <em>Clock Multiplier List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ClockMultiplierListImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getClockMultiplierList()
	 * @generated
	 */
	int CLOCK_MULTIPLIER_LIST = 233;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST__CUSTOM_PROPERTIES = CLOCK__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST__NAME = CLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST__UNIQUE_NAME = CLOCK__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST__ENTRIES = CLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Multiplier List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST___COMPUTE_UNIQUE_NAME = CLOCK___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST___ENCODE__STRING = CLOCK___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Clock Multiplier List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST_OPERATION_COUNT = CLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ClockMultiplierListEntryImpl <em>Clock Multiplier List Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ClockMultiplierListEntryImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getClockMultiplierListEntry()
	 * @generated
	 */
	int CLOCK_MULTIPLIER_LIST_ENTRY = 234;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST_ENTRY__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST_ENTRY__MULTIPLIER = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST_ENTRY__TIME = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clock Multiplier List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST_ENTRY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clock Multiplier List Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_MULTIPLIER_LIST_ENTRY_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SWModelImpl <em>SW Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SWModelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSWModel()
	 * @generated
	 */
	int SW_MODEL = 235;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Isrs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__ISRS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__TASKS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runnables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__RUNNABLES = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__LABELS = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Process Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__PROCESS_PROTOTYPES = BASE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__SECTIONS = BASE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__ACTIVATIONS = BASE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__TAGS = BASE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__EVENTS = BASE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__TYPE_DEFINITIONS = BASE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Custom Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__CUSTOM_ENTITIES = BASE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Process Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__PROCESS_CHAINS = BASE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__MODES = BASE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Mode Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL__MODE_LABELS = BASE_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>SW Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>SW Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMemoryInformationImpl <em>Abstract Element Memory Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AbstractElementMemoryInformationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAbstractElementMemoryInformation()
	 * @generated
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION = 236;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Element Memory Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Abstract Element Memory Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AbstractProcessImpl <em>Abstract Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AbstractProcessImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAbstractProcess()
	 * @generated
	 */
	int ABSTRACT_PROCESS = 237;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__CUSTOM_PROPERTIES = ABSTRACT_ELEMENT_MEMORY_INFORMATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__TAGS = ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__SIZE = ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__PRIORITY = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_FEATURE_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS___COMPUTE_UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS___ENCODE__STRING = ABSTRACT_ELEMENT_MEMORY_INFORMATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Abstract Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_OPERATION_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CustomEntityImpl <em>Custom Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CustomEntityImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCustomEntity()
	 * @generated
	 */
	int CUSTOM_ENTITY = 238;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY__CUSTOM_PROPERTIES = ABSTRACT_ELEMENT_MEMORY_INFORMATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY__NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY__UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY__TAGS = ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY__SIZE = ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY__TYPE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY___COMPUTE_UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY___ENCODE__STRING = ABSTRACT_ELEMENT_MEMORY_INFORMATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Custom Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ENTITY_OPERATION_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessChainImpl <em>Process Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessChainImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessChain()
	 * @generated
	 */
	int PROCESS_CHAIN = 239;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN__PROCESSES = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Process Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_CHAIN_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 240;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CUSTOM_PROPERTIES = ABSTRACT_PROCESS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = ABSTRACT_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__UNIQUE_NAME = ABSTRACT_PROCESS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TAGS = ABSTRACT_PROCESS__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SIZE = ABSTRACT_PROCESS__SIZE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRIORITY = ABSTRACT_PROCESS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Call Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CALL_GRAPH = ABSTRACT_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stimuli</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STIMULI = ABSTRACT_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ABSTRACT_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___COMPUTE_UNIQUE_NAME = ABSTRACT_PROCESS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___ENCODE__STRING = ABSTRACT_PROCESS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = ABSTRACT_PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CallGraphImpl <em>Call Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CallGraphImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCallGraph()
	 * @generated
	 */
	int CALL_GRAPH = 241;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAPH__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Graph Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAPH__GRAPH_ENTRIES = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAPH_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAPH_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.GraphEntryBaseImpl <em>Graph Entry Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.GraphEntryBaseImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getGraphEntryBase()
	 * @generated
	 */
	int GRAPH_ENTRY_BASE = 242;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ENTRY_BASE__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Graph Entry Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ENTRY_BASE_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graph Entry Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ENTRY_BASE_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CallSequenceImpl <em>Call Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CallSequenceImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCallSequence()
	 * @generated
	 */
	int CALL_SEQUENCE = 243;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE__CUSTOM_PROPERTIES = GRAPH_ENTRY_BASE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE__NAME = GRAPH_ENTRY_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE__CALLS = GRAPH_ENTRY_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_FEATURE_COUNT = GRAPH_ENTRY_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_OPERATION_COUNT = GRAPH_ENTRY_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ModeSwitchImpl <em>Mode Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ModeSwitchImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getModeSwitch()
	 * @generated
	 */
	int MODE_SWITCH = 244;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH__CUSTOM_PROPERTIES = GRAPH_ENTRY_BASE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Value Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH__VALUE_PROVIDER = GRAPH_ENTRY_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH__ENTRIES = GRAPH_ENTRY_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH_FEATURE_COUNT = GRAPH_ENTRY_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mode Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH_OPERATION_COUNT = GRAPH_ENTRY_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ModeSwitchEntryImpl <em>Mode Switch Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ModeSwitchEntryImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getModeSwitchEntry()
	 * @generated
	 */
	int MODE_SWITCH_ENTRY = 245;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH_ENTRY__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH_ENTRY__VALUE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH_ENTRY__DEFAULT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graph Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH_ENTRY__GRAPH_ENTRIES = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mode Switch Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH_ENTRY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mode Switch Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_SWITCH_ENTRY_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProbabiltitySwitchImpl <em>Probabiltity Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProbabiltitySwitchImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProbabiltitySwitch()
	 * @generated
	 */
	int PROBABILTITY_SWITCH = 246;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILTITY_SWITCH__CUSTOM_PROPERTIES = GRAPH_ENTRY_BASE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILTITY_SWITCH__ENTRIES = GRAPH_ENTRY_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probabiltity Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILTITY_SWITCH_FEATURE_COUNT = GRAPH_ENTRY_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Probabiltity Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILTITY_SWITCH_OPERATION_COUNT = GRAPH_ENTRY_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProbabilitySwitchEntryImpl <em>Probability Switch Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProbabilitySwitchEntryImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProbabilitySwitchEntry()
	 * @generated
	 */
	int PROBABILITY_SWITCH_ENTRY = 247;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_SWITCH_ENTRY__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_SWITCH_ENTRY__PROBABILITY = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_SWITCH_ENTRY__GRAPH_ENTRIES = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Probability Switch Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_SWITCH_ENTRY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Probability Switch Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_SWITCH_ENTRY_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CounterImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 248;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__OFFSET = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__PRESCALER = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CallSequenceItemImpl <em>Call Sequence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CallSequenceItemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCallSequenceItem()
	 * @generated
	 */
	int CALL_SEQUENCE_ITEM = 249;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_ITEM__COUNTER = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Sequence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_ITEM_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Sequence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_ITEM_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl <em>Wait Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.WaitEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getWaitEvent()
	 * @generated
	 */
	int WAIT_EVENT = 250;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_EVENT__CUSTOM_PROPERTIES = CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_EVENT__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The feature id for the '<em><b>Event Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_EVENT__EVENT_MASK = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mask Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_EVENT__MASK_TYPE = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waiting Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_EVENT__WAITING_BEHAVIOUR = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wait Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_EVENT_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Wait Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_EVENT_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SetEventImpl <em>Set Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SetEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSetEvent()
	 * @generated
	 */
	int SET_EVENT = 251;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EVENT__CUSTOM_PROPERTIES = CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EVENT__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The feature id for the '<em><b>Event Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EVENT__EVENT_MASK = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EVENT__PROCESS = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EVENT_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EVENT_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ClearEventImpl <em>Clear Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ClearEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getClearEvent()
	 * @generated
	 */
	int CLEAR_EVENT = 252;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_EVENT__CUSTOM_PROPERTIES = CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_EVENT__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The feature id for the '<em><b>Event Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_EVENT__EVENT_MASK = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clear Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_EVENT_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clear Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_EVENT_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EventMaskImpl <em>Event Mask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EventMaskImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEventMask()
	 * @generated
	 */
	int EVENT_MASK = 253;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MASK__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MASK__EVENTS = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MASK_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MASK_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OsEventImpl <em>Os Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OsEventImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOsEvent()
	 * @generated
	 */
	int OS_EVENT = 254;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__TAGS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Overhead In Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT__COMMUNICATION_OVERHEAD_IN_BIT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Os Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Os Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_EVENT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.InterProcessActivationImpl <em>Inter Process Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.InterProcessActivationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInterProcessActivation()
	 * @generated
	 */
	int INTER_PROCESS_ACTIVATION = 255;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION__CUSTOM_PROPERTIES = CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION__STIMULUS = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inter Process Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inter Process Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.EnforcedMigrationImpl <em>Enforced Migration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.EnforcedMigrationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getEnforcedMigration()
	 * @generated
	 */
	int ENFORCED_MIGRATION = 256;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCED_MIGRATION__CUSTOM_PROPERTIES = CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCED_MIGRATION__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The feature id for the '<em><b>Resource Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCED_MIGRATION__RESOURCE_OWNER = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enforced Migration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCED_MIGRATION_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enforced Migration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCED_MIGRATION_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TaskRunnableCallImpl <em>Task Runnable Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TaskRunnableCallImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTaskRunnableCall()
	 * @generated
	 */
	int TASK_RUNNABLE_CALL = 257;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL__CUSTOM_PROPERTIES = CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL__RUNNABLE = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL__STATISTIC = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runnable Link Int</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL__RUNNABLE_LINK_INT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Runnable Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Runnable Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SchedulePointImpl <em>Schedule Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SchedulePointImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedulePoint()
	 * @generated
	 */
	int SCHEDULE_POINT = 258;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_POINT__CUSTOM_PROPERTIES = CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_POINT__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The number of structural features of the '<em>Schedule Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_POINT_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schedule Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_POINT_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TerminateProcessImpl <em>Terminate Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TerminateProcessImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTerminateProcess()
	 * @generated
	 */
	int TERMINATE_PROCESS = 259;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_PROCESS__CUSTOM_PROPERTIES = CALL_SEQUENCE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_PROCESS__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The number of structural features of the '<em>Terminate Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_PROCESS_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminate Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_PROCESS_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TaskImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 260;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CUSTOM_PROPERTIES = PROCESS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UNIQUE_NAME = PROCESS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TAGS = PROCESS__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SIZE = PROCESS__SIZE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = PROCESS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Call Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CALL_GRAPH = PROCESS__CALL_GRAPH;

	/**
	 * The feature id for the '<em><b>Stimuli</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STIMULI = PROCESS__STIMULI;

	/**
	 * The feature id for the '<em><b>Preemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREEMPTION = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple Task Activation Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MULTIPLE_TASK_ACTIVATION_LIMIT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___COMPUTE_UNIQUE_NAME = PROCESS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___ENCODE__STRING = PROCESS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ISRImpl <em>ISR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ISRImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getISR()
	 * @generated
	 */
	int ISR = 261;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__CUSTOM_PROPERTIES = PROCESS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__UNIQUE_NAME = PROCESS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__TAGS = PROCESS__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__SIZE = PROCESS__SIZE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__PRIORITY = PROCESS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Call Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__CALL_GRAPH = PROCESS__CALL_GRAPH;

	/**
	 * The feature id for the '<em><b>Stimuli</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__STIMULI = PROCESS__STIMULI;

	/**
	 * The number of structural features of the '<em>ISR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR___COMPUTE_UNIQUE_NAME = PROCESS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR___ENCODE__STRING = PROCESS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>ISR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl <em>Process Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProcessPrototypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessPrototype()
	 * @generated
	 */
	int PROCESS_PROTOTYPE = 262;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__CUSTOM_PROPERTIES = ABSTRACT_PROCESS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__NAME = ABSTRACT_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__UNIQUE_NAME = ABSTRACT_PROCESS__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__TAGS = ABSTRACT_PROCESS__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__SIZE = ABSTRACT_PROCESS__SIZE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__PRIORITY = ABSTRACT_PROCESS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Preemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__PREEMPTION = ABSTRACT_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__FIRST_RUNNABLE = ABSTRACT_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__LAST_RUNNABLE = ABSTRACT_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Precedence Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC = ABSTRACT_PROCESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Precedence Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC = ABSTRACT_PROCESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Chained Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__CHAINED_PROTOTYPES = ABSTRACT_PROCESS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__ACTIVATION = ABSTRACT_PROCESS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Runnable Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE__RUNNABLE_CALLS = ABSTRACT_PROCESS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Process Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE_FEATURE_COUNT = ABSTRACT_PROCESS_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE___COMPUTE_UNIQUE_NAME = ABSTRACT_PROCESS___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE___ENCODE__STRING = ABSTRACT_PROCESS___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Process Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PROTOTYPE_OPERATION_COUNT = ABSTRACT_PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ChainedProcessPrototypeImpl <em>Chained Process Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ChainedProcessPrototypeImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getChainedProcessPrototype()
	 * @generated
	 */
	int CHAINED_PROCESS_PROTOTYPE = 263;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_PROCESS_PROTOTYPE__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_PROCESS_PROTOTYPE__PROTOTYPE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_PROCESS_PROTOTYPE__APPLY = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_PROCESS_PROTOTYPE__OFFSET = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chained Process Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_PROCESS_PROTOTYPE_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Chained Process Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_PROCESS_PROTOTYPE_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.GeneralPrecedenceImpl <em>General Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.GeneralPrecedenceImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getGeneralPrecedence()
	 * @generated
	 */
	int GENERAL_PRECEDENCE = 264;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PRECEDENCE__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PRECEDENCE__ORIGIN = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PRECEDENCE__TARGET = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>General Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PRECEDENCE_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>General Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PRECEDENCE_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AccessPrecedenceSpecImpl <em>Access Precedence Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AccessPrecedenceSpecImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAccessPrecedenceSpec()
	 * @generated
	 */
	int ACCESS_PRECEDENCE_SPEC = 265;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PRECEDENCE_SPEC__CUSTOM_PROPERTIES = GENERAL_PRECEDENCE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PRECEDENCE_SPEC__ORIGIN = GENERAL_PRECEDENCE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PRECEDENCE_SPEC__TARGET = GENERAL_PRECEDENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PRECEDENCE_SPEC__LABEL = GENERAL_PRECEDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PRECEDENCE_SPEC__ORDER_TYPE = GENERAL_PRECEDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access Precedence Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PRECEDENCE_SPEC_FEATURE_COUNT = GENERAL_PRECEDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Access Precedence Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_PRECEDENCE_SPEC_OPERATION_COUNT = GENERAL_PRECEDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.OrderPrecedenceSpecImpl <em>Order Precedence Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.OrderPrecedenceSpecImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOrderPrecedenceSpec()
	 * @generated
	 */
	int ORDER_PRECEDENCE_SPEC = 266;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRECEDENCE_SPEC__CUSTOM_PROPERTIES = GENERAL_PRECEDENCE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRECEDENCE_SPEC__ORIGIN = GENERAL_PRECEDENCE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRECEDENCE_SPEC__TARGET = GENERAL_PRECEDENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRECEDENCE_SPEC__ORDER_TYPE = GENERAL_PRECEDENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order Precedence Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRECEDENCE_SPEC_FEATURE_COUNT = GENERAL_PRECEDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Order Precedence Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRECEDENCE_SPEC_OPERATION_COUNT = GENERAL_PRECEDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 267;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__CUSTOM_PROPERTIES = ABSTRACT_ELEMENT_MEMORY_INFORMATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__TAGS = ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__SIZE = ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE;

	/**
	 * The feature id for the '<em><b>Runnable Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__RUNNABLE_ITEMS = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__ACTIVATION = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__DEADLINE = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Callback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__CALLBACK = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__SERVICE = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Runnable Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__RUNNABLE_CALLS = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Task Runnable Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__TASK_RUNNABLE_CALLS = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE___COMPUTE_UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE___ENCODE__STRING = ABSTRACT_ELEMENT_MEMORY_INFORMATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_OPERATION_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LabelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 268;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CUSTOM_PROPERTIES = ABSTRACT_ELEMENT_MEMORY_INFORMATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TAGS = ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SIZE = ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DATA_TYPE = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONSTANT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>BVolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BVOLATILE = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BUFFERED = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Accesses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LABEL_ACCESSES = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___COMPUTE_UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___ENCODE__STRING = ABSTRACT_ELEMENT_MEMORY_INFORMATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ModeLabelImpl <em>Mode Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ModeLabelImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getModeLabel()
	 * @generated
	 */
	int MODE_LABEL = 269;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL__CUSTOM_PROPERTIES = ABSTRACT_ELEMENT_MEMORY_INFORMATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL__NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL__UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL__TAGS = ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL__SIZE = ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL__MODE = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL__INITIAL_VALUE = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_FEATURE_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL___COMPUTE_UNIQUE_NAME = ABSTRACT_ELEMENT_MEMORY_INFORMATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL___ENCODE__STRING = ABSTRACT_ELEMENT_MEMORY_INFORMATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Mode Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_OPERATION_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SectionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 270;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SIZE = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LABELS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Run Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__RUN_ENTITIES = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableItemImpl <em>Runnable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableItemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableItem()
	 * @generated
	 */
	int RUNNABLE_ITEM = 271;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ITEM__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Runnable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ITEM_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Runnable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ITEM_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ModeLabelAccessImpl <em>Mode Label Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ModeLabelAccessImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getModeLabelAccess()
	 * @generated
	 */
	int MODE_LABEL_ACCESS = 272;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_ACCESS__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_ACCESS__DATA = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_ACCESS__ACCESS = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_ACCESS__MODE_VALUE = RUNNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mode Label Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_ACCESS_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_ACCESS___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Mode Label Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_LABEL_ACCESS_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl <em>Label Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLabelAccess()
	 * @generated
	 */
	int LABEL_ACCESS = 273;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__DATA = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__ACCESS = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__STATISTIC = RUNNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__BUFFERED = RUNNABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Link Int</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__DATA_LINK_INT = RUNNABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Label Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Label Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreAccessImpl <em>Semaphore Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SemaphoreAccessImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSemaphoreAccess()
	 * @generated
	 */
	int SEMAPHORE_ACCESS = 274;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_ACCESS__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_ACCESS__SEMAPHORE = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_ACCESS__ACCESS = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semaphore Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_ACCESS_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_ACCESS___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Semaphore Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_ACCESS_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SenderReceiverCommunicationImpl <em>Sender Receiver Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SenderReceiverCommunicationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSenderReceiverCommunication()
	 * @generated
	 */
	int SENDER_RECEIVER_COMMUNICATION = 275;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_COMMUNICATION__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_COMMUNICATION__BUFFERED = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_COMMUNICATION__LABEL = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sender Receiver Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_COMMUNICATION_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_COMMUNICATION___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Sender Receiver Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_COMMUNICATION_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SenderReceiverReadImpl <em>Sender Receiver Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SenderReceiverReadImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSenderReceiverRead()
	 * @generated
	 */
	int SENDER_RECEIVER_READ = 276;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_READ__CUSTOM_PROPERTIES = SENDER_RECEIVER_COMMUNICATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_READ__BUFFERED = SENDER_RECEIVER_COMMUNICATION__BUFFERED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_READ__LABEL = SENDER_RECEIVER_COMMUNICATION__LABEL;

	/**
	 * The number of structural features of the '<em>Sender Receiver Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_READ_FEATURE_COUNT = SENDER_RECEIVER_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_READ___CONTAINER_NOTIFICATION_REQUIRED = SENDER_RECEIVER_COMMUNICATION___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Sender Receiver Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_READ_OPERATION_COUNT = SENDER_RECEIVER_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SenderReceiverWriteImpl <em>Sender Receiver Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SenderReceiverWriteImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSenderReceiverWrite()
	 * @generated
	 */
	int SENDER_RECEIVER_WRITE = 277;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_WRITE__CUSTOM_PROPERTIES = SENDER_RECEIVER_COMMUNICATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_WRITE__BUFFERED = SENDER_RECEIVER_COMMUNICATION__BUFFERED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_WRITE__LABEL = SENDER_RECEIVER_COMMUNICATION__LABEL;

	/**
	 * The feature id for the '<em><b>Notified Runnables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_WRITE__NOTIFIED_RUNNABLES = SENDER_RECEIVER_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sender Receiver Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_WRITE_FEATURE_COUNT = SENDER_RECEIVER_COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_WRITE___CONTAINER_NOTIFICATION_REQUIRED = SENDER_RECEIVER_COMMUNICATION___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Sender Receiver Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_RECEIVER_WRITE_OPERATION_COUNT = SENDER_RECEIVER_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ServerCallImpl <em>Server Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ServerCallImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getServerCall()
	 * @generated
	 */
	int SERVER_CALL = 278;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Server Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL__SERVER_RUNNABLE = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Server Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CALL_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SynchronousServerCallImpl <em>Synchronous Server Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SynchronousServerCallImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSynchronousServerCall()
	 * @generated
	 */
	int SYNCHRONOUS_SERVER_CALL = 279;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL__CUSTOM_PROPERTIES = SERVER_CALL__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Server Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL__SERVER_RUNNABLE = SERVER_CALL__SERVER_RUNNABLE;

	/**
	 * The feature id for the '<em><b>Waiting Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR = SERVER_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Synchronous Server Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_FEATURE_COUNT = SERVER_CALL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL___CONTAINER_NOTIFICATION_REQUIRED = SERVER_CALL___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Synchronous Server Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONOUS_SERVER_CALL_OPERATION_COUNT = SERVER_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.AsynchronousServerCallImpl <em>Asynchronous Server Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.AsynchronousServerCallImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAsynchronousServerCall()
	 * @generated
	 */
	int ASYNCHRONOUS_SERVER_CALL = 280;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_SERVER_CALL__CUSTOM_PROPERTIES = SERVER_CALL__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Server Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_SERVER_CALL__SERVER_RUNNABLE = SERVER_CALL__SERVER_RUNNABLE;

	/**
	 * The feature id for the '<em><b>Result Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE = SERVER_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asynchronous Server Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_SERVER_CALL_FEATURE_COUNT = SERVER_CALL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_SERVER_CALL___CONTAINER_NOTIFICATION_REQUIRED = SERVER_CALL___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Asynchronous Server Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_SERVER_CALL_OPERATION_COUNT = SERVER_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProbabilityGroupImpl <em>Probability Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProbabilityGroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProbabilityGroup()
	 * @generated
	 */
	int PROBABILITY_GROUP = 281;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_GROUP__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_GROUP__ITEMS = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probability Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_GROUP_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_GROUP___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Probability Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_GROUP_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ProbabilityRunnableItemImpl <em>Probability Runnable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ProbabilityRunnableItemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProbabilityRunnableItem()
	 * @generated
	 */
	int PROBABILITY_RUNNABLE_ITEM = 282;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_RUNNABLE_ITEM__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_RUNNABLE_ITEM__PROBABILITY = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runnable Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Probability Runnable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_RUNNABLE_ITEM_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Probability Runnable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_RUNNABLE_ITEM_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.GroupImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 283;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ORDERED = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ITEMS = RUNNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DeviationRunnableItemImpl <em>Deviation Runnable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DeviationRunnableItemImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDeviationRunnableItem()
	 * @generated
	 */
	int DEVIATION_RUNNABLE_ITEM = 284;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_RUNNABLE_ITEM__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Runnable Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_RUNNABLE_ITEM__DEVIATION = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deviation Runnable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_RUNNABLE_ITEM_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deviation Runnable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_RUNNABLE_ITEM_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunnableCallImpl <em>Runnable Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunnableCallImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableCall()
	 * @generated
	 */
	int RUNNABLE_CALL = 285;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CALL__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CALL__RUNNABLE = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CALL__STATISTIC = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runnable Link Int</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CALL__RUNNABLE_LINK_INT = RUNNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Runnable Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CALL_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CALL___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Runnable Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_CALL_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.InstructionsImpl <em>Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.InstructionsImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInstructions()
	 * @generated
	 */
	int INSTRUCTIONS = 286;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS__CUSTOM_PROPERTIES = RUNNABLE_ITEM__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Fetch Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS__FETCH_STATISTIC = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS___CONTAINER_NOTIFICATION_REQUIRED = RUNNABLE_ITEM___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.InstructionsDeviationImpl <em>Instructions Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.InstructionsDeviationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInstructionsDeviation()
	 * @generated
	 */
	int INSTRUCTIONS_DEVIATION = 287;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES = INSTRUCTIONS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Fetch Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION__FETCH_STATISTIC = INSTRUCTIONS__FETCH_STATISTIC;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION__DEVIATION = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instructions Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION___CONTAINER_NOTIFICATION_REQUIRED = INSTRUCTIONS___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Instructions Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.InstructionsConstantImpl <em>Instructions Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.InstructionsConstantImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInstructionsConstant()
	 * @generated
	 */
	int INSTRUCTIONS_CONSTANT = 288;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_CONSTANT__CUSTOM_PROPERTIES = INSTRUCTIONS__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Fetch Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_CONSTANT__FETCH_STATISTIC = INSTRUCTIONS__FETCH_STATISTIC;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_CONSTANT__VALUE = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instructions Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_CONSTANT_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container Notification Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_CONSTANT___CONTAINER_NOTIFICATION_REQUIRED = INSTRUCTIONS___CONTAINER_NOTIFICATION_REQUIRED;

	/**
	 * The number of operations of the '<em>Instructions Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_CONSTANT_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.DataType <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.DataType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 289;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.CompoundType <em>Compound Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.CompoundType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCompoundType()
	 * @generated
	 */
	int COMPOUND_TYPE = 290;

	/**
	 * The number of structural features of the '<em>Compound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compound Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.StructImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 291;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__CUSTOM_PROPERTIES = COMPOUND_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__ENTRIES = COMPOUND_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = COMPOUND_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = COMPOUND_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.StructEntryImpl <em>Struct Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.StructEntryImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getStructEntry()
	 * @generated
	 */
	int STRUCT_ENTRY = 292;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY__NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY__DATA_TYPE = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Struct Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Struct Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_ENTRY_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ArrayImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 293;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__CUSTOM_PROPERTIES = COMPOUND_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NUMBER_ELEMENTS = COMPOUND_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DATA_TYPE = COMPOUND_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = COMPOUND_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = COMPOUND_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PointerImpl <em>Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PointerImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPointer()
	 * @generated
	 */
	int POINTER = 294;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER__CUSTOM_PROPERTIES = COMPOUND_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER__DATA_TYPE = COMPOUND_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_FEATURE_COUNT = COMPOUND_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_OPERATION_COUNT = COMPOUND_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TypeRefImpl <em>Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TypeRefImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTypeRef()
	 * @generated
	 */
	int TYPE_REF = 295;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__CUSTOM_PROPERTIES = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__TYPE_DEF = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataPlatformMappingImpl <em>Data Platform Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataPlatformMappingImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataPlatformMapping()
	 * @generated
	 */
	int DATA_PLATFORM_MAPPING = 296;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PLATFORM_MAPPING__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PLATFORM_MAPPING__PLATFORM_NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PLATFORM_MAPPING__PLATFORM_TYPE = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Platform Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PLATFORM_MAPPING_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Platform Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PLATFORM_MAPPING_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.TypeDefinitionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 297;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.DataTypeDefinitionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataTypeDefinition()
	 * @generated
	 */
	int DATA_TYPE_DEFINITION = 298;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__CUSTOM_PROPERTIES = TYPE_DEFINITION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__UNIQUE_NAME = TYPE_DEFINITION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION__DATA_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION___COMPUTE_UNIQUE_NAME = TYPE_DEFINITION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION___ENCODE__STRING = TYPE_DEFINITION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Data Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.BaseTypeDefinitionImpl <em>Base Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.BaseTypeDefinitionImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getBaseTypeDefinition()
	 * @generated
	 */
	int BASE_TYPE_DEFINITION = 299;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION__CUSTOM_PROPERTIES = TYPE_DEFINITION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION__NAME = TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION__UNIQUE_NAME = TYPE_DEFINITION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION__SIZE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION__DATA_MAPPING = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION___COMPUTE_UNIQUE_NAME = TYPE_DEFINITION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION___ENCODE__STRING = TYPE_DEFINITION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Base Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_DEFINITION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.ActivationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 300;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__NAME = REFERABLE_BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION___ENCODE__STRING = REFERABLE_BASE_OBJECT___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicActivationImpl <em>Periodic Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.PeriodicActivationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPeriodicActivation()
	 * @generated
	 */
	int PERIODIC_ACTIVATION = 301;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION__CUSTOM_PROPERTIES = ACTIVATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION__NAME = ACTIVATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION__UNIQUE_NAME = ACTIVATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION__MIN = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION__MAX = ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION__OFFSET = ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION__DEADLINE = ACTIVATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Periodic Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION___COMPUTE_UNIQUE_NAME = ACTIVATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION___ENCODE__STRING = ACTIVATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Periodic Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_ACTIVATION_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SporadicActivationImpl <em>Sporadic Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SporadicActivationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSporadicActivation()
	 * @generated
	 */
	int SPORADIC_ACTIVATION = 302;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVATION__CUSTOM_PROPERTIES = ACTIVATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVATION__NAME = ACTIVATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVATION__UNIQUE_NAME = ACTIVATION__UNIQUE_NAME;

	/**
	 * The number of structural features of the '<em>Sporadic Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVATION_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVATION___COMPUTE_UNIQUE_NAME = ACTIVATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVATION___ENCODE__STRING = ACTIVATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Sporadic Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_ACTIVATION_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.SingleActivationImpl <em>Single Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.SingleActivationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSingleActivation()
	 * @generated
	 */
	int SINGLE_ACTIVATION = 303;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION__CUSTOM_PROPERTIES = ACTIVATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION__NAME = ACTIVATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION__UNIQUE_NAME = ACTIVATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION__MIN = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION__MAX = ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION___COMPUTE_UNIQUE_NAME = ACTIVATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION___ENCODE__STRING = ACTIVATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Single Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVATION_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.CustomActivationImpl <em>Custom Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.CustomActivationImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCustomActivation()
	 * @generated
	 */
	int CUSTOM_ACTIVATION = 304;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVATION__CUSTOM_PROPERTIES = ACTIVATION__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVATION__NAME = ACTIVATION__NAME;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVATION__UNIQUE_NAME = ACTIVATION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVATION__DESCRIPTION = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVATION_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVATION___COMPUTE_UNIQUE_NAME = ACTIVATION___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Encode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVATION___ENCODE__STRING = ACTIVATION___ENCODE__STRING;

	/**
	 * The number of operations of the '<em>Custom Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ACTIVATION_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessStatisticImpl <em>Label Access Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.LabelAccessStatisticImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLabelAccessStatistic()
	 * @generated
	 */
	int LABEL_ACCESS_STATISTIC = 305;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_STATISTIC__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_STATISTIC__VALUE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cache Misses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_STATISTIC__CACHE_MISSES = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Access Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_STATISTIC_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Label Access Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_STATISTIC_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.InstructionFetchImpl <em>Instruction Fetch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.InstructionFetchImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInstructionFetch()
	 * @generated
	 */
	int INSTRUCTION_FETCH = 306;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FETCH__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FETCH__COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Misses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FETCH__MISSES = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cycles Per Fetch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FETCH__CYCLES_PER_FETCH = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instruction Fetch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FETCH_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instruction Fetch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FETCH_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.impl.RunEntityCallStatisticImpl <em>Run Entity Call Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.impl.RunEntityCallStatisticImpl
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunEntityCallStatistic()
	 * @generated
	 */
	int RUN_ENTITY_CALL_STATISTIC = 307;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ENTITY_CALL_STATISTIC__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ENTITY_CALL_STATISTIC__STATISTIC = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Run Entity Call Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ENTITY_CALL_STATISTIC_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Run Entity Call Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ENTITY_CALL_STATISTIC_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.TimeUnit
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 308;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.FrequencyUnit <em>Frequency Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyUnit
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getFrequencyUnit()
	 * @generated
	 */
	int FREQUENCY_UNIT = 309;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.DataSizeUnit <em>Data Size Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.DataSizeUnit
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataSizeUnit()
	 * @generated
	 */
	int DATA_SIZE_UNIT = 310;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.DataRateUnit <em>Data Rate Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.DataRateUnit
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getDataRateUnit()
	 * @generated
	 */
	int DATA_RATE_UNIT = 311;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.InterfaceKind <em>Interface Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.InterfaceKind
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getInterfaceKind()
	 * @generated
	 */
	int INTERFACE_KIND = 312;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.RunnableOrderType <em>Runnable Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.RunnableOrderType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableOrderType()
	 * @generated
	 */
	int RUNNABLE_ORDER_TYPE = 313;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.RunnableGroupingType <em>Runnable Grouping Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.RunnableGroupingType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableGroupingType()
	 * @generated
	 */
	int RUNNABLE_GROUPING_TYPE = 314;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.Severity
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 315;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.LimitType <em>Limit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.LimitType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLimitType()
	 * @generated
	 */
	int LIMIT_TYPE = 316;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.TimeMetric <em>Time Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.TimeMetric
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getTimeMetric()
	 * @generated
	 */
	int TIME_METRIC = 317;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.CountMetric <em>Count Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.CountMetric
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCountMetric()
	 * @generated
	 */
	int COUNT_METRIC = 318;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.PercentageMetric <em>Percentage Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.PercentageMetric
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPercentageMetric()
	 * @generated
	 */
	int PERCENTAGE_METRIC = 319;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.CPUPercentageMetric <em>CPU Percentage Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.CPUPercentageMetric
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCPUPercentageMetric()
	 * @generated
	 */
	int CPU_PERCENTAGE_METRIC = 320;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.FrequencyMetric <em>Frequency Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyMetric
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getFrequencyMetric()
	 * @generated
	 */
	int FREQUENCY_METRIC = 321;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.CoherencyDirection <em>Coherency Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.CoherencyDirection
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getCoherencyDirection()
	 * @generated
	 */
	int COHERENCY_DIRECTION = 322;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.ProcessEventType <em>Process Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEventType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getProcessEventType()
	 * @generated
	 */
	int PROCESS_EVENT_TYPE = 323;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.RunnableEventType <em>Runnable Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEventType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRunnableEventType()
	 * @generated
	 */
	int RUNNABLE_EVENT_TYPE = 324;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.LabelEventType <em>Label Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.LabelEventType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLabelEventType()
	 * @generated
	 */
	int LABEL_EVENT_TYPE = 325;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEventType <em>Semaphore Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEventType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSemaphoreEventType()
	 * @generated
	 */
	int SEMAPHORE_EVENT_TYPE = 326;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.QType <em>QType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.QType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getQType()
	 * @generated
	 */
	int QTYPE = 327;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.MemoryTypeEnum <em>Memory Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.MemoryTypeEnum
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMemoryTypeEnum()
	 * @generated
	 */
	int MEMORY_TYPE_ENUM = 328;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.BusType <em>Bus Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.BusType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getBusType()
	 * @generated
	 */
	int BUS_TYPE = 329;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.RWType <em>RW Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.RWType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getRWType()
	 * @generated
	 */
	int RW_TYPE = 330;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.SchedType <em>Sched Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.SchedType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSchedType()
	 * @generated
	 */
	int SCHED_TYPE = 331;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.PinType <em>Pin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.PinType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPinType()
	 * @generated
	 */
	int PIN_TYPE = 332;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType <em>Memory Address Mapping Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getMemoryAddressMappingType()
	 * @generated
	 */
	int MEMORY_ADDRESS_MAPPING_TYPE = 333;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.ComparatorType <em>Comparator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.ComparatorType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getComparatorType()
	 * @generated
	 */
	int COMPARATOR_TYPE = 334;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.ConjunctionType <em>Conjunction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.ConjunctionType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getConjunctionType()
	 * @generated
	 */
	int CONJUNCTION_TYPE = 335;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.WaitEventType <em>Wait Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.WaitEventType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getWaitEventType()
	 * @generated
	 */
	int WAIT_EVENT_TYPE = 336;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.WaitingBehaviour <em>Waiting Behaviour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.WaitingBehaviour
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getWaitingBehaviour()
	 * @generated
	 */
	int WAITING_BEHAVIOUR = 337;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceType <em>Access Precedence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.AccessPrecedenceType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getAccessPrecedenceType()
	 * @generated
	 */
	int ACCESS_PRECEDENCE_TYPE = 338;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.OrderType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 339;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.LabelBuffering <em>Label Buffering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.LabelBuffering
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLabelBuffering()
	 * @generated
	 */
	int LABEL_BUFFERING = 340;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.LabelAccessBuffering <em>Label Access Buffering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessBuffering
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLabelAccessBuffering()
	 * @generated
	 */
	int LABEL_ACCESS_BUFFERING = 341;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.LabelAccessEnum <em>Label Access Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessEnum
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getLabelAccessEnum()
	 * @generated
	 */
	int LABEL_ACCESS_ENUM = 342;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum <em>Semaphore Access Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getSemaphoreAccessEnum()
	 * @generated
	 */
	int SEMAPHORE_ACCESS_ENUM = 343;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.Preemption <em>Preemption</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.Preemption
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getPreemption()
	 * @generated
	 */
	int PREEMPTION = 344;

	/**
	 * The meta object id for the '{@link org.eclipse.app4mc.amalthea.model.ConcurrencyType <em>Concurrency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.app4mc.amalthea.model.ConcurrencyType
	 * @see org.eclipse.app4mc.amalthea.model.impl.AmaltheaPackageImpl#getConcurrencyType()
	 * @generated
	 */
	int CONCURRENCY_TYPE = 345;


	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Amalthea <em>Amalthea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amalthea</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea
	 * @generated
	 */
	EClass getAmalthea();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getSwModel <em>Sw Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getSwModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_SwModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getHwModel <em>Hw Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hw Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getHwModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_HwModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getOsModel <em>Os Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getOsModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_OsModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getStimuliModel <em>Stimuli Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimuli Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getStimuliModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_StimuliModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getConstraintsModel <em>Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getConstraintsModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_ConstraintsModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getEventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getEventModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_EventModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getPropertyConstraintsModel <em>Property Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Constraints Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getPropertyConstraintsModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_PropertyConstraintsModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getMappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getMappingModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_MappingModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getConfigModel <em>Config Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getConfigModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_ConfigModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getComponentsModel <em>Components Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Amalthea#getComponentsModel()
	 * @see #getAmalthea()
	 * @generated
	 */
	EReference getAmalthea_ComponentsModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.BaseObject <em>Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BaseObject
	 * @generated
	 */
	EClass getBaseObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ReferableObject <em>Referable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referable Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ReferableObject
	 * @generated
	 */
	EClass getReferableObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ReferableBaseObject <em>Referable Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referable Base Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ReferableBaseObject
	 * @generated
	 */
	EClass getReferableBaseObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.IAnnotatable <em>IAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAnnotatable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.IAnnotatable
	 * @generated
	 */
	EClass getIAnnotatable();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.app4mc.amalthea.model.IAnnotatable#getCustomProperties <em>Custom Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Custom Properties</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.IAnnotatable#getCustomProperties()
	 * @see #getIAnnotatable()
	 * @generated
	 */
	EReference getIAnnotatable_CustomProperties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ITaggable <em>ITaggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITaggable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ITaggable
	 * @generated
	 */
	EClass getITaggable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.ITaggable#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ITaggable#getTags()
	 * @see #getITaggable()
	 * @generated
	 */
	EReference getITaggable_Tags();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.IReferable <em>IReferable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReferable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.IReferable
	 * @generated
	 */
	EClass getIReferable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.IReferable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.IReferable#getName()
	 * @see #getIReferable()
	 * @generated
	 */
	EAttribute getIReferable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.IReferable#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.IReferable#getUniqueName()
	 * @see #getIReferable()
	 * @generated
	 */
	EAttribute getIReferable_UniqueName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.IReferable#computeUniqueName() <em>Compute Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Unique Name</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.IReferable#computeUniqueName()
	 * @generated
	 */
	EOperation getIReferable__ComputeUniqueName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.IReferable#encode(java.lang.String) <em>Encode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Encode</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.IReferable#encode(java.lang.String)
	 * @generated
	 */
	EOperation getIReferable__Encode__String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Tag#getTagType <em>Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Tag#getTagType()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_TagType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AbstractTime <em>Abstract Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Time</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractTime
	 * @generated
	 */
	EClass getAbstractTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.AbstractTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractTime#getValue()
	 * @see #getAbstractTime()
	 * @generated
	 */
	EAttribute getAbstractTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.AbstractTime#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractTime#getUnit()
	 * @see #getAbstractTime()
	 * @generated
	 */
	EAttribute getAbstractTime_Unit();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.AbstractTime#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractTime#toString()
	 * @generated
	 */
	EOperation getAbstractTime__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.Time#containerNotificationRequired() <em>Container Notification Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Notification Required</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.Time#containerNotificationRequired()
	 * @generated
	 */
	EOperation getTime__ContainerNotificationRequired();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SignedTime <em>Signed Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Time</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SignedTime
	 * @generated
	 */
	EClass getSignedTime();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.SignedTime#containerNotificationRequired() <em>Container Notification Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Notification Required</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.SignedTime#containerNotificationRequired()
	 * @generated
	 */
	EOperation getSignedTime__ContainerNotificationRequired();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Frequency
	 * @generated
	 */
	EClass getFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Frequency#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Frequency#getUnit()
	 * @see #getFrequency()
	 * @generated
	 */
	EAttribute getFrequency_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Frequency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Frequency#getValue()
	 * @see #getFrequency()
	 * @generated
	 */
	EAttribute getFrequency_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.Frequency#containerNotificationRequired() <em>Container Notification Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Notification Required</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.Frequency#containerNotificationRequired()
	 * @generated
	 */
	EOperation getFrequency__ContainerNotificationRequired();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.Frequency#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.Frequency#toString()
	 * @generated
	 */
	EOperation getFrequency__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Size</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataSize
	 * @generated
	 */
	EClass getDataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataSize#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataSize#getValue()
	 * @see #getDataSize()
	 * @generated
	 */
	EAttribute getDataSize_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataSize#getUnit()
	 * @see #getDataSize()
	 * @generated
	 */
	EAttribute getDataSize_Unit();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.DataSize#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.DataSize#toString()
	 * @generated
	 */
	EOperation getDataSize__ToString();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.DataSize#getNumberBits() <em>Get Number Bits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Bits</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.DataSize#getNumberBits()
	 * @generated
	 */
	EOperation getDataSize__GetNumberBits();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.DataSize#getNumberBytes() <em>Get Number Bytes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Bytes</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.DataSize#getNumberBytes()
	 * @generated
	 */
	EOperation getDataSize__GetNumberBytes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Rate</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataRate
	 * @generated
	 */
	EClass getDataRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataRate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataRate#getValue()
	 * @see #getDataRate()
	 * @generated
	 */
	EAttribute getDataRate_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataRate#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataRate#getUnit()
	 * @see #getDataRate()
	 * @generated
	 */
	EAttribute getDataRate_Unit();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.DataRate#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.DataRate#toString()
	 * @generated
	 */
	EOperation getDataRate__ToString();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Property</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.eclipse.app4mc.amalthea.model.Value" valueContainment="true" valueResolveProxies="true" valueRequired="true"
	 * @generated
	 */
	EClass getCustomProperty();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCustomProperty()
	 * @generated
	 */
	EAttribute getCustomProperty_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCustomProperty()
	 * @generated
	 */
	EReference getCustomProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.Value#containerNotificationRequired() <em>Container Notification Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Notification Required</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.Value#containerNotificationRequired()
	 * @generated
	 */
	EOperation getValue__ContainerNotificationRequired();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ListObject <em>List Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ListObject
	 * @generated
	 */
	EClass getListObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ListObject#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ListObject#getValues()
	 * @see #getListObject()
	 * @generated
	 */
	EReference getListObject_Values();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.ListObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.ListObject#toString()
	 * @generated
	 */
	EOperation getListObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.StringObject <em>String Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StringObject
	 * @generated
	 */
	EClass getStringObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.StringObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StringObject#getValue()
	 * @see #getStringObject()
	 * @generated
	 */
	EAttribute getStringObject_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.StringObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.StringObject#toString()
	 * @generated
	 */
	EOperation getStringObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.BigIntegerObject <em>Big Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Integer Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BigIntegerObject
	 * @generated
	 */
	EClass getBigIntegerObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.BigIntegerObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BigIntegerObject#getValue()
	 * @see #getBigIntegerObject()
	 * @generated
	 */
	EAttribute getBigIntegerObject_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.BigIntegerObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.BigIntegerObject#toString()
	 * @generated
	 */
	EOperation getBigIntegerObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ReferenceObject <em>Reference Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ReferenceObject
	 * @generated
	 */
	EClass getReferenceObject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ReferenceObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ReferenceObject#getValue()
	 * @see #getReferenceObject()
	 * @generated
	 */
	EReference getReferenceObject_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.ReferenceObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.ReferenceObject#toString()
	 * @generated
	 */
	EOperation getReferenceObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.IntegerObject <em>Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.IntegerObject
	 * @generated
	 */
	EClass getIntegerObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.IntegerObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.IntegerObject#getValue()
	 * @see #getIntegerObject()
	 * @generated
	 */
	EAttribute getIntegerObject_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.IntegerObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.IntegerObject#toString()
	 * @generated
	 */
	EOperation getIntegerObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LongObject <em>Long Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LongObject
	 * @generated
	 */
	EClass getLongObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.LongObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LongObject#getValue()
	 * @see #getLongObject()
	 * @generated
	 */
	EAttribute getLongObject_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.LongObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.LongObject#toString()
	 * @generated
	 */
	EOperation getLongObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.FloatObject <em>Float Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FloatObject
	 * @generated
	 */
	EClass getFloatObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.FloatObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FloatObject#getValue()
	 * @see #getFloatObject()
	 * @generated
	 */
	EAttribute getFloatObject_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.FloatObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.FloatObject#toString()
	 * @generated
	 */
	EOperation getFloatObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DoubleObject <em>Double Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DoubleObject
	 * @generated
	 */
	EClass getDoubleObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DoubleObject#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DoubleObject#getValue()
	 * @see #getDoubleObject()
	 * @generated
	 */
	EAttribute getDoubleObject_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.DoubleObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.DoubleObject#toString()
	 * @generated
	 */
	EOperation getDoubleObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.BooleanObject <em>Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BooleanObject
	 * @generated
	 */
	EClass getBooleanObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.BooleanObject#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BooleanObject#isValue()
	 * @see #getBooleanObject()
	 * @generated
	 */
	EAttribute getBooleanObject_Value();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.BooleanObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.BooleanObject#toString()
	 * @generated
	 */
	EOperation getBooleanObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TimeObject <em>Time Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TimeObject
	 * @generated
	 */
	EClass getTimeObject();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.TimeObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.TimeObject#toString()
	 * @generated
	 */
	EOperation getTimeObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SignedTimeObject <em>Signed Time Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signed Time Object</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SignedTimeObject
	 * @generated
	 */
	EClass getSignedTimeObject();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.SignedTimeObject#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.SignedTimeObject#toString()
	 * @generated
	 */
	EOperation getSignedTimeObject__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Deviation
	 * @generated
	 */
	EClass getDeviation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Deviation#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Deviation#getLowerBound()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Deviation#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Deviation#getUpperBound()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Deviation#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Deviation#getDistribution()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_Distribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.WeibullDistribution <em>Weibull Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull Distribution</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullDistribution
	 * @generated
	 */
	EClass getWeibullDistribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.WeibullParameters <em>Weibull Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull Parameters</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullParameters
	 * @generated
	 */
	EClass getWeibullParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.WeibullParameters#getKappa <em>Kappa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kappa</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullParameters#getKappa()
	 * @see #getWeibullParameters()
	 * @generated
	 */
	EAttribute getWeibullParameters_Kappa();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.WeibullParameters#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lambda</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullParameters#getLambda()
	 * @see #getWeibullParameters()
	 * @generated
	 */
	EAttribute getWeibullParameters_Lambda();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.WeibullEstimators <em>Weibull Estimators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull Estimators</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullEstimators
	 * @generated
	 */
	EClass getWeibullEstimators();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.WeibullEstimators#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullEstimators#getMean()
	 * @see #getWeibullEstimators()
	 * @generated
	 */
	EReference getWeibullEstimators_Mean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.WeibullEstimators#getPRemainPromille <em>PRemain Promille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PRemain Promille</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WeibullEstimators#getPRemainPromille()
	 * @see #getWeibullEstimators()
	 * @generated
	 */
	EAttribute getWeibullEstimators_PRemainPromille();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.UniformDistribution <em>Uniform Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Distribution</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.UniformDistribution
	 * @generated
	 */
	EClass getUniformDistribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Boundaries <em>Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundaries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Boundaries
	 * @generated
	 */
	EClass getBoundaries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.GaussDistribution <em>Gauss Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gauss Distribution</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.GaussDistribution
	 * @generated
	 */
	EClass getGaussDistribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.GaussDistribution#getSd <em>Sd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sd</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.GaussDistribution#getSd()
	 * @see #getGaussDistribution()
	 * @generated
	 */
	EReference getGaussDistribution_Sd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.GaussDistribution#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.GaussDistribution#getMean()
	 * @see #getGaussDistribution()
	 * @generated
	 */
	EReference getGaussDistribution_Mean();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.NumericStatistic <em>Numeric Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.NumericStatistic
	 * @generated
	 */
	EClass getNumericStatistic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic <em>Min Avg Max Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Avg Max Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic
	 * @generated
	 */
	EClass getMinAvgMaxStatistic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic#getMin()
	 * @see #getMinAvgMaxStatistic()
	 * @generated
	 */
	EAttribute getMinAvgMaxStatistic_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic#getAvg <em>Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic#getAvg()
	 * @see #getMinAvgMaxStatistic()
	 * @generated
	 */
	EAttribute getMinAvgMaxStatistic_Avg();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic#getMax()
	 * @see #getMinAvgMaxStatistic()
	 * @generated
	 */
	EAttribute getMinAvgMaxStatistic_Max();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SingleValueStatistic <em>Single Value Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Value Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SingleValueStatistic
	 * @generated
	 */
	EClass getSingleValueStatistic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.SingleValueStatistic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SingleValueStatistic#getValue()
	 * @see #getSingleValueStatistic()
	 * @generated
	 */
	EAttribute getSingleValueStatistic_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.Mode#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Mode#getLiterals()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ModeLiteral <em>Mode Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Literal</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLiteral
	 * @generated
	 */
	EClass getModeLiteral();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.ModeLiteral#computeUniqueName() <em>Compute Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Unique Name</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLiteral#computeUniqueName()
	 * @generated
	 */
	EOperation getModeLiteral__ComputeUniqueName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.ModeLiteral#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLiteral#toString()
	 * @generated
	 */
	EOperation getModeLiteral__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ModeValueProvider <em>Mode Value Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Value Provider</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueProvider
	 * @generated
	 */
	EClass getModeValueProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ModeValueProvider#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueProvider#getMode()
	 * @see #getModeValueProvider()
	 * @generated
	 */
	EReference getModeValueProvider_Mode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ModeValueProvider#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueProvider#getInitialValue()
	 * @see #getModeValueProvider()
	 * @generated
	 */
	EReference getModeValueProvider_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ComponentsModel <em>Components Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentsModel
	 * @generated
	 */
	EClass getComponentsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ComponentsModel#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentsModel#getTags()
	 * @see #getComponentsModel()
	 * @generated
	 */
	EReference getComponentsModel_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ComponentsModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentsModel#getComponents()
	 * @see #getComponentsModel()
	 * @generated
	 */
	EReference getComponentsModel_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ComponentsModel#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentsModel#getSystems()
	 * @see #getComponentsModel()
	 * @generated
	 */
	EReference getComponentsModel_Systems();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.INamedElement <em>INamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INamed Element</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.INamedElement
	 * @generated
	 */
	EClass getINamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.INamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.INamedElement#getName()
	 * @see #getINamedElement()
	 * @generated
	 */
	EAttribute getINamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ISystem <em>ISystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISystem</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ISystem
	 * @generated
	 */
	EClass getISystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ISystem#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instances</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ISystem#getComponentInstances()
	 * @see #getISystem()
	 * @generated
	 */
	EReference getISystem_ComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ISystem#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ISystem#getConnectors()
	 * @see #getISystem()
	 * @generated
	 */
	EReference getISystem_Connectors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.Port#computeUniqueName() <em>Compute Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Unique Name</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.Port#computeUniqueName()
	 * @generated
	 */
	EOperation getPort__ComputeUniqueName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Component#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Component#getTasks()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Component#getRunnables <em>Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runnables</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Component#getRunnables()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Runnables();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Component#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labels</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Component#getLabels()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Labels();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Component#getSemaphores <em>Semaphores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semaphores</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Component#getSemaphores()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Semaphores();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Component#getOsEvents <em>Os Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Os Events</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Component#getOsEvents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OsEvents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Connector#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Connector#getSourcePort()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SourcePort();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Connector#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Connector#getTargetPort()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_TargetPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.QualifiedPort <em>Qualified Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.QualifiedPort
	 * @generated
	 */
	EClass getQualifiedPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.QualifiedPort#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.QualifiedPort#getInstance()
	 * @see #getQualifiedPort()
	 * @generated
	 */
	EReference getQualifiedPort_Instance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.QualifiedPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.QualifiedPort#getPort()
	 * @see #getQualifiedPort()
	 * @generated
	 */
	EReference getQualifiedPort_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.FInterfacePort <em>FInterface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FInterface Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FInterfacePort
	 * @generated
	 */
	EClass getFInterfacePort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.FInterfacePort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FInterfacePort#getKind()
	 * @see #getFInterfacePort()
	 * @generated
	 */
	EAttribute getFInterfacePort_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.FInterfacePort#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FInterfacePort#getInterfaceName()
	 * @see #getFInterfacePort()
	 * @generated
	 */
	EAttribute getFInterfacePort_InterfaceName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ConfigModel <em>Config Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConfigModel
	 * @generated
	 */
	EClass getConfigModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ConfigModel#getEventsToTrace <em>Events To Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events To Trace</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConfigModel#getEventsToTrace()
	 * @see #getConfigModel()
	 * @generated
	 */
	EReference getConfigModel_EventsToTrace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventConfig <em>Event Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Config</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventConfig
	 * @generated
	 */
	EClass getEventConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.EventConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventConfig#getName()
	 * @see #getEventConfig()
	 * @generated
	 */
	EAttribute getEventConfig_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventConfigLink <em>Event Config Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Config Link</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventConfigLink
	 * @generated
	 */
	EClass getEventConfigLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.EventConfigLink#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventConfigLink#getEvent()
	 * @see #getEventConfigLink()
	 * @generated
	 */
	EReference getEventConfigLink_Event();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventConfigElement <em>Event Config Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Config Element</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventConfigElement
	 * @generated
	 */
	EClass getEventConfigElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.EventConfigElement#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventConfigElement#getEvent()
	 * @see #getEventConfigElement()
	 * @generated
	 */
	EReference getEventConfigElement_Event();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel <em>Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel
	 * @generated
	 */
	EClass getConstraintsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getEventChains <em>Event Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Chains</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel#getEventChains()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_EventChains();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getTimingConstraints <em>Timing Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing Constraints</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel#getTimingConstraints()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_TimingConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getAffinityConstraints <em>Affinity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affinity Constraints</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel#getAffinityConstraints()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_AffinityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getRunnableSequencingConstraints <em>Runnable Sequencing Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runnable Sequencing Constraints</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel#getRunnableSequencingConstraints()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_RunnableSequencingConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getDataAgeConstraints <em>Data Age Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Age Constraints</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel#getDataAgeConstraints()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_DataAgeConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel#getRequirements()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ConstraintsModel#getDataCoherencyGroups <em>Data Coherency Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Coherency Groups</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConstraintsModel#getDataCoherencyGroups()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_DataCoherencyGroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint <em>Runnable Sequencing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Sequencing Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint
	 * @generated
	 */
	EClass getRunnableSequencingConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint#getOrderType()
	 * @see #getRunnableSequencingConstraint()
	 * @generated
	 */
	EAttribute getRunnableSequencingConstraint_OrderType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint#getRunnableGroups <em>Runnable Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runnable Groups</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint#getRunnableGroups()
	 * @see #getRunnableSequencingConstraint()
	 * @generated
	 */
	EReference getRunnableSequencingConstraint_RunnableGroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup <em>Process Runnable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Runnable Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup
	 * @generated
	 */
	EClass getProcessRunnableGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup#getGroupingType <em>Grouping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup#getGroupingType()
	 * @see #getProcessRunnableGroup()
	 * @generated
	 */
	EAttribute getProcessRunnableGroup_GroupingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup#getEntries()
	 * @see #getProcessRunnableGroup()
	 * @generated
	 */
	EReference getProcessRunnableGroup_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry <em>Process Runnable Group Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Runnable Group Entry</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry
	 * @generated
	 */
	EClass getProcessRunnableGroupEntry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry#getRunnable()
	 * @see #getProcessRunnableGroupEntry()
	 * @generated
	 */
	EReference getProcessRunnableGroupEntry_Runnable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry#getProcessScope <em>Process Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Scope</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry#getProcessScope()
	 * @see #getProcessRunnableGroupEntry()
	 * @generated
	 */
	EReference getProcessRunnableGroupEntry_ProcessScope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AffinityConstraint <em>Affinity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affinity Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AffinityConstraint
	 * @generated
	 */
	EClass getAffinityConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SeparationConstraint <em>Separation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SeparationConstraint
	 * @generated
	 */
	EClass getSeparationConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PairingConstraint <em>Pairing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pairing Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PairingConstraint
	 * @generated
	 */
	EClass getPairingConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessConstraint <em>Process Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessConstraint
	 * @generated
	 */
	EClass getProcessConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ProcessConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessConstraint#getTarget()
	 * @see #getProcessConstraint()
	 * @generated
	 */
	EReference getProcessConstraint_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableConstraint <em>Runnable Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableConstraint
	 * @generated
	 */
	EClass getRunnableConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.RunnableConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableConstraint#getTarget()
	 * @see #getRunnableConstraint()
	 * @generated
	 */
	EReference getRunnableConstraint_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulerConstraint <em>Scheduler Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerConstraint
	 * @generated
	 */
	EClass getSchedulerConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.SchedulerConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerConstraint#getTarget()
	 * @see #getSchedulerConstraint()
	 * @generated
	 */
	EReference getSchedulerConstraint_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint <em>Runnable Separation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Separation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint
	 * @generated
	 */
	EClass getRunnableSeparationConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableSeparationConstraint#getGroups()
	 * @see #getRunnableSeparationConstraint()
	 * @generated
	 */
	EReference getRunnableSeparationConstraint_Groups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint <em>Process Separation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Separation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint
	 * @generated
	 */
	EClass getProcessSeparationConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessSeparationConstraint#getGroups()
	 * @see #getProcessSeparationConstraint()
	 * @generated
	 */
	EReference getProcessSeparationConstraint_Groups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulerSeparationConstraint <em>Scheduler Separation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler Separation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerSeparationConstraint
	 * @generated
	 */
	EClass getSchedulerSeparationConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SchedulerSeparationConstraint#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerSeparationConstraint#getGroups()
	 * @see #getSchedulerSeparationConstraint()
	 * @generated
	 */
	EReference getSchedulerSeparationConstraint_Groups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint <em>Runnable Pairing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Pairing Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint
	 * @generated
	 */
	EClass getRunnablePairingConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint#getRunnables <em>Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runnables</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint#getRunnables()
	 * @see #getRunnablePairingConstraint()
	 * @generated
	 */
	EReference getRunnablePairingConstraint_Runnables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint <em>Process Pairing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Pairing Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint
	 * @generated
	 */
	EClass getProcessPairingConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processes</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPairingConstraint#getProcesses()
	 * @see #getProcessPairingConstraint()
	 * @generated
	 */
	EReference getProcessPairingConstraint_Processes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulerPairingConstraint <em>Scheduler Pairing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler Pairing Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerPairingConstraint
	 * @generated
	 */
	EClass getSchedulerPairingConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.SchedulerPairingConstraint#getSchedulers <em>Schedulers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedulers</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerPairingConstraint#getSchedulers()
	 * @see #getSchedulerPairingConstraint()
	 * @generated
	 */
	EReference getSchedulerPairingConstraint_Schedulers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableConstraintTarget <em>Runnable Constraint Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Constraint Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableConstraintTarget
	 * @generated
	 */
	EClass getRunnableConstraintTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessConstraintTarget <em>Process Constraint Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Constraint Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessConstraintTarget
	 * @generated
	 */
	EClass getProcessConstraintTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulerConstraintTarget <em>Scheduler Constraint Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler Constraint Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerConstraintTarget
	 * @generated
	 */
	EClass getSchedulerConstraintTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TargetCore <em>Target Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Core</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TargetCore
	 * @generated
	 */
	EClass getTargetCore();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.TargetCore#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cores</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TargetCore#getCores()
	 * @see #getTargetCore()
	 * @generated
	 */
	EReference getTargetCore_Cores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TargetScheduler <em>Target Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Scheduler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TargetScheduler
	 * @generated
	 */
	EClass getTargetScheduler();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.TargetScheduler#getSchedulers <em>Schedulers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedulers</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TargetScheduler#getSchedulers()
	 * @see #getTargetScheduler()
	 * @generated
	 */
	EReference getTargetScheduler_Schedulers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TargetProcess <em>Target Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TargetProcess
	 * @generated
	 */
	EClass getTargetProcess();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.TargetProcess#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TargetProcess#getProcesses()
	 * @see #getTargetProcess()
	 * @generated
	 */
	EReference getTargetProcess_Processes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TargetCallSequence <em>Target Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Call Sequence</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TargetCallSequence
	 * @generated
	 */
	EClass getTargetCallSequence();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.TargetCallSequence#getCallSequences <em>Call Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Sequences</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TargetCallSequence#getCallSequences()
	 * @see #getTargetCallSequence()
	 * @generated
	 */
	EReference getTargetCallSequence_CallSequences();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableGroup <em>Runnable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableGroup
	 * @generated
	 */
	EClass getRunnableGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessGroup <em>Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessGroup
	 * @generated
	 */
	EClass getProcessGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulerEntityGroup <em>Scheduler Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler Entity Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerEntityGroup
	 * @generated
	 */
	EClass getSchedulerEntityGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.SchedulerEntityGroup#getSchedulers <em>Schedulers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedulers</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerEntityGroup#getSchedulers()
	 * @see #getSchedulerEntityGroup()
	 * @generated
	 */
	EReference getSchedulerEntityGroup_Schedulers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableEntityGroup <em>Runnable Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Entity Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEntityGroup
	 * @generated
	 */
	EClass getRunnableEntityGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.RunnableEntityGroup#getRunnables <em>Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runnables</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEntityGroup#getRunnables()
	 * @see #getRunnableEntityGroup()
	 * @generated
	 */
	EReference getRunnableEntityGroup_Runnables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessEntityGroup <em>Process Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Entity Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEntityGroup
	 * @generated
	 */
	EClass getProcessEntityGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessEntityGroup#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEntityGroup#getProcesses()
	 * @see #getProcessEntityGroup()
	 * @generated
	 */
	EReference getProcessEntityGroup_Processes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TagGroup <em>Tag Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TagGroup
	 * @generated
	 */
	EClass getTagGroup();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.TagGroup#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tag</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TagGroup#getTag()
	 * @see #getTagGroup()
	 * @generated
	 */
	EReference getTagGroup_Tag();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventChain <em>Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Chain</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventChain
	 * @generated
	 */
	EClass getEventChain();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.EventChain#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stimulus</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventChain#getStimulus()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Stimulus();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.EventChain#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventChain#getResponse()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Response();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.EventChain#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventChain#getSegments()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Segments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.EventChain#getStrands <em>Strands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strands</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventChain#getStrands()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Strands();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.EventChain#containerNotificationRequired() <em>Container Notification Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Notification Required</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.EventChain#containerNotificationRequired()
	 * @generated
	 */
	EOperation getEventChain__ContainerNotificationRequired();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventChainItem <em>Event Chain Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Chain Item</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainItem
	 * @generated
	 */
	EClass getEventChainItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventChainReference <em>Event Chain Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Chain Reference</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainReference
	 * @generated
	 */
	EClass getEventChainReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.EventChainReference#getEventChain <em>Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Chain</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventChainReference#getEventChain()
	 * @see #getEventChainReference()
	 * @generated
	 */
	EReference getEventChainReference_EventChain();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SubEventChain <em>Sub Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Event Chain</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SubEventChain
	 * @generated
	 */
	EClass getSubEventChain();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.SubEventChain#getEventChain <em>Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Chain</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SubEventChain#getEventChain()
	 * @see #getSubEventChain()
	 * @generated
	 */
	EReference getSubEventChain_EventChain();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TimingConstraint
	 * @generated
	 */
	EClass getTimingConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OrderConstraint <em>Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OrderConstraint
	 * @generated
	 */
	EClass getOrderConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.OrderConstraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OrderConstraint#getSource()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EReference getOrderConstraint_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.OrderConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OrderConstraint#getTarget()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EReference getOrderConstraint_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SynchronisationConstraint <em>Synchronisation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronisation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronisationConstraint
	 * @generated
	 */
	EClass getSynchronisationConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.SynchronisationConstraint#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronisationConstraint#getEvents()
	 * @see #getSynchronisationConstraint()
	 * @generated
	 */
	EReference getSynchronisationConstraint_Events();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.SynchronisationConstraint#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tolerance</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronisationConstraint#getTolerance()
	 * @see #getSynchronisationConstraint()
	 * @generated
	 */
	EReference getSynchronisationConstraint_Tolerance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint <em>Reaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ReactionConstraint
	 * @generated
	 */
	EClass getReactionConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ReactionConstraint#getScope()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ReactionConstraint#getMinimum()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Minimum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ReactionConstraint#getMaximum()
	 * @see #getReactionConstraint()
	 * @generated
	 */
	EReference getReactionConstraint_Maximum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint <em>Delay Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DelayConstraint
	 * @generated
	 */
	EClass getDelayConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DelayConstraint#getSource()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DelayConstraint#getTarget()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DelayConstraint#getUpper()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DelayConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DelayConstraint#getLower()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Lower();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AgeConstraint <em>Age Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AgeConstraint
	 * @generated
	 */
	EClass getAgeConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.AgeConstraint#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AgeConstraint#getScope()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.AgeConstraint#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AgeConstraint#getMaximum()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Maximum();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.AgeConstraint#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AgeConstraint#getMinimum()
	 * @see #getAgeConstraint()
	 * @generated
	 */
	EReference getAgeConstraint_Minimum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint <em>Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repetition Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RepetitionConstraint
	 * @generated
	 */
	EClass getRepetitionConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getEvent()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getSpan()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EAttribute getRepetitionConstraint_Span();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getLower()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getUpper()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getJitter()
	 * @see #getRepetitionConstraint()
	 * @generated
	 */
	EReference getRepetitionConstraint_Jitter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint <em>Data Age Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Age Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeConstraint
	 * @generated
	 */
	EClass getDataAgeConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getRunnable()
	 * @see #getDataAgeConstraint()
	 * @generated
	 */
	EReference getDataAgeConstraint_Runnable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getLabel()
	 * @see #getDataAgeConstraint()
	 * @generated
	 */
	EReference getDataAgeConstraint_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getDataAge <em>Data Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Age</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getDataAge()
	 * @see #getDataAgeConstraint()
	 * @generated
	 */
	EReference getDataAgeConstraint_DataAge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataAge <em>Data Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Age</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAge
	 * @generated
	 */
	EClass getDataAge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataAgeCycle <em>Data Age Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Age Cycle</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeCycle
	 * @generated
	 */
	EClass getDataAgeCycle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataAgeCycle#getMinimumCycle <em>Minimum Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Cycle</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeCycle#getMinimumCycle()
	 * @see #getDataAgeCycle()
	 * @generated
	 */
	EAttribute getDataAgeCycle_MinimumCycle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataAgeCycle#getMaximumCycle <em>Maximum Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Cycle</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeCycle#getMaximumCycle()
	 * @see #getDataAgeCycle()
	 * @generated
	 */
	EAttribute getDataAgeCycle_MaximumCycle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataAgeTime <em>Data Age Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Age Time</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeTime
	 * @generated
	 */
	EClass getDataAgeTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DataAgeTime#getMinimumTime <em>Minimum Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum Time</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeTime#getMinimumTime()
	 * @see #getDataAgeTime()
	 * @generated
	 */
	EReference getDataAgeTime_MinimumTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DataAgeTime#getMaximumTime <em>Maximum Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum Time</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataAgeTime#getMaximumTime()
	 * @see #getDataAgeTime()
	 * @generated
	 */
	EReference getDataAgeTime_MaximumTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Requirement#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Requirement#getSeverity()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Severity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Requirement#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Requirement#getLimit()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Limit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessRequirement <em>Process Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Requirement</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRequirement
	 * @generated
	 */
	EClass getProcessRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessRequirement#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessRequirement#getProcess()
	 * @see #getProcessRequirement()
	 * @generated
	 */
	EReference getProcessRequirement_Process();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableRequirement <em>Runnable Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Requirement</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableRequirement
	 * @generated
	 */
	EClass getRunnableRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableRequirement#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableRequirement#getRunnable()
	 * @see #getRunnableRequirement()
	 * @generated
	 */
	EReference getRunnableRequirement_Runnable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ArchitectureRequirement <em>Architecture Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Requirement</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ArchitectureRequirement
	 * @generated
	 */
	EClass getArchitectureRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ArchitectureRequirement#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ArchitectureRequirement#getComponent()
	 * @see #getArchitectureRequirement()
	 * @generated
	 */
	EReference getArchitectureRequirement_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessChainRequirement <em>Process Chain Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Chain Requirement</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChainRequirement
	 * @generated
	 */
	EClass getProcessChainRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessChainRequirement#getProcessChain <em>Process Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Chain</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChainRequirement#getProcessChain()
	 * @see #getProcessChainRequirement()
	 * @generated
	 */
	EReference getProcessChainRequirement_ProcessChain();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RequirementLimit <em>Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Limit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RequirementLimit
	 * @generated
	 */
	EClass getRequirementLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.RequirementLimit#getLimitType <em>Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RequirementLimit#getLimitType()
	 * @see #getRequirementLimit()
	 * @generated
	 */
	EAttribute getRequirementLimit_LimitType();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.RequirementLimit#containerNotificationRequired() <em>Container Notification Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Notification Required</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.RequirementLimit#containerNotificationRequired()
	 * @generated
	 */
	EOperation getRequirementLimit__ContainerNotificationRequired();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit <em>CPU Percentage Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Percentage Requirement Limit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit
	 * @generated
	 */
	EClass getCPUPercentageRequirementLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit#getMetric()
	 * @see #getCPUPercentageRequirementLimit()
	 * @generated
	 */
	EAttribute getCPUPercentageRequirementLimit_Metric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit#getLimitValue <em>Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit#getLimitValue()
	 * @see #getCPUPercentageRequirementLimit()
	 * @generated
	 */
	EAttribute getCPUPercentageRequirementLimit_LimitValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit#getHardwareContext <em>Hardware Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Context</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit#getHardwareContext()
	 * @see #getCPUPercentageRequirementLimit()
	 * @generated
	 */
	EReference getCPUPercentageRequirementLimit_HardwareContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit <em>Frequency Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Requirement Limit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit
	 * @generated
	 */
	EClass getFrequencyRequirementLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit#getMetric()
	 * @see #getFrequencyRequirementLimit()
	 * @generated
	 */
	EAttribute getFrequencyRequirementLimit_Metric();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit#getLimitValue <em>Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limit Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit#getLimitValue()
	 * @see #getFrequencyRequirementLimit()
	 * @generated
	 */
	EReference getFrequencyRequirementLimit_LimitValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit <em>Percentage Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Requirement Limit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit
	 * @generated
	 */
	EClass getPercentageRequirementLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit#getMetric()
	 * @see #getPercentageRequirementLimit()
	 * @generated
	 */
	EAttribute getPercentageRequirementLimit_Metric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit#getLimitValue <em>Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit#getLimitValue()
	 * @see #getPercentageRequirementLimit()
	 * @generated
	 */
	EAttribute getPercentageRequirementLimit_LimitValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CountRequirementLimit <em>Count Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Requirement Limit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CountRequirementLimit
	 * @generated
	 */
	EClass getCountRequirementLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CountRequirementLimit#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CountRequirementLimit#getMetric()
	 * @see #getCountRequirementLimit()
	 * @generated
	 */
	EAttribute getCountRequirementLimit_Metric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CountRequirementLimit#getLimitValue <em>Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CountRequirementLimit#getLimitValue()
	 * @see #getCountRequirementLimit()
	 * @generated
	 */
	EAttribute getCountRequirementLimit_LimitValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TimeRequirementLimit <em>Time Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Requirement Limit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TimeRequirementLimit
	 * @generated
	 */
	EClass getTimeRequirementLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.TimeRequirementLimit#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TimeRequirementLimit#getMetric()
	 * @see #getTimeRequirementLimit()
	 * @generated
	 */
	EAttribute getTimeRequirementLimit_Metric();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.TimeRequirementLimit#getLimitValue <em>Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limit Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TimeRequirementLimit#getLimitValue()
	 * @see #getTimeRequirementLimit()
	 * @generated
	 */
	EReference getTimeRequirementLimit_LimitValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup <em>Data Coherency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Coherency Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataCoherencyGroup
	 * @generated
	 */
	EClass getDataCoherencyGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labels</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getLabels()
	 * @see #getDataCoherencyGroup()
	 * @generated
	 */
	EReference getDataCoherencyGroup_Labels();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getScope()
	 * @see #getDataCoherencyGroup()
	 * @generated
	 */
	EReference getDataCoherencyGroup_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataCoherencyGroup#getDirection()
	 * @see #getDataCoherencyGroup()
	 * @generated
	 */
	EAttribute getDataCoherencyGroup_Direction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroupScope <em>Data Coherency Group Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Coherency Group Scope</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataCoherencyGroupScope
	 * @generated
	 */
	EClass getDataCoherencyGroupScope();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.DataCoherencyGroupScope#containerNotificationRequired() <em>Container Notification Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Notification Required</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.DataCoherencyGroupScope#containerNotificationRequired()
	 * @generated
	 */
	EOperation getDataCoherencyGroupScope__ContainerNotificationRequired();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessScope <em>Process Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Scope</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessScope
	 * @generated
	 */
	EClass getProcessScope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessScope#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessScope#getProcess()
	 * @see #getProcessScope()
	 * @generated
	 */
	EReference getProcessScope_Process();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableScope <em>Runnable Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Scope</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableScope
	 * @generated
	 */
	EClass getRunnableScope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableScope#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableScope#getRunnable()
	 * @see #getRunnableScope()
	 * @generated
	 */
	EReference getRunnableScope_Runnable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ComponentScope <em>Component Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Scope</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentScope
	 * @generated
	 */
	EClass getComponentScope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ComponentScope#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComponentScope#getComponent()
	 * @see #getComponentScope()
	 * @generated
	 */
	EReference getComponentScope_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventModel
	 * @generated
	 */
	EClass getEventModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.EventModel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventModel#getEvents()
	 * @see #getEventModel()
	 * @generated
	 */
	EReference getEventModel_Events();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventSet <em>Event Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Set</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventSet
	 * @generated
	 */
	EClass getEventSet();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.EventSet#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventSet#getEvents()
	 * @see #getEventSet()
	 * @generated
	 */
	EReference getEventSet_Events();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EntityEvent <em>Entity Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EntityEvent
	 * @generated
	 */
	EClass getEntityEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CustomEvent <em>Custom Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CustomEvent
	 * @generated
	 */
	EClass getCustomEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CustomEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CustomEvent#getEventType()
	 * @see #getCustomEvent()
	 * @generated
	 */
	EAttribute getCustomEvent_EventType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.StimulusEvent <em>Stimulus Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StimulusEvent
	 * @generated
	 */
	EClass getStimulusEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.StimulusEvent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StimulusEvent#getEntity()
	 * @see #getStimulusEvent()
	 * @generated
	 */
	EReference getStimulusEvent_Entity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessEvent <em>Process Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEvent
	 * @generated
	 */
	EClass getProcessEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ProcessEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEvent#getEventType()
	 * @see #getProcessEvent()
	 * @generated
	 */
	EAttribute getProcessEvent_EventType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessEvent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEvent#getEntity()
	 * @see #getProcessEvent()
	 * @generated
	 */
	EReference getProcessEvent_Entity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessEvent#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEvent#getCore()
	 * @see #getProcessEvent()
	 * @generated
	 */
	EReference getProcessEvent_Core();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent <em>Process Chain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Chain Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChainEvent
	 * @generated
	 */
	EClass getProcessChainEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getEventType()
	 * @see #getProcessChainEvent()
	 * @generated
	 */
	EAttribute getProcessChainEvent_EventType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getEntity()
	 * @see #getProcessChainEvent()
	 * @generated
	 */
	EReference getProcessChainEvent_Entity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getCore()
	 * @see #getProcessChainEvent()
	 * @generated
	 */
	EReference getProcessChainEvent_Core();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent <em>Runnable Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEvent
	 * @generated
	 */
	EClass getRunnableEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEvent#getEventType()
	 * @see #getRunnableEvent()
	 * @generated
	 */
	EAttribute getRunnableEvent_EventType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEvent#getEntity()
	 * @see #getRunnableEvent()
	 * @generated
	 */
	EReference getRunnableEvent_Entity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEvent#getProcess()
	 * @see #getRunnableEvent()
	 * @generated
	 */
	EReference getRunnableEvent_Process();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEvent#getCore()
	 * @see #getRunnableEvent()
	 * @generated
	 */
	EReference getRunnableEvent_Core();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LabelEvent <em>Label Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelEvent
	 * @generated
	 */
	EClass getLabelEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.LabelEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelEvent#getEventType()
	 * @see #getLabelEvent()
	 * @generated
	 */
	EAttribute getLabelEvent_EventType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.LabelEvent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelEvent#getEntity()
	 * @see #getLabelEvent()
	 * @generated
	 */
	EReference getLabelEvent_Entity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.LabelEvent#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelEvent#getRunnable()
	 * @see #getLabelEvent()
	 * @generated
	 */
	EReference getLabelEvent_Runnable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.LabelEvent#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelEvent#getProcess()
	 * @see #getLabelEvent()
	 * @generated
	 */
	EReference getLabelEvent_Process();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent <em>Semaphore Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEvent
	 * @generated
	 */
	EClass getSemaphoreEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getEventType()
	 * @see #getSemaphoreEvent()
	 * @generated
	 */
	EAttribute getSemaphoreEvent_EventType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getEntity()
	 * @see #getSemaphoreEvent()
	 * @generated
	 */
	EReference getSemaphoreEvent_Entity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getRunnable()
	 * @see #getSemaphoreEvent()
	 * @generated
	 */
	EReference getSemaphoreEvent_Runnable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getProcess()
	 * @see #getSemaphoreEvent()
	 * @generated
	 */
	EReference getSemaphoreEvent_Process();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getCore()
	 * @see #getSemaphoreEvent()
	 * @generated
	 */
	EReference getSemaphoreEvent_Core();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HWModel <em>HW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel
	 * @generated
	 */
	EClass getHWModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HWModel#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getTags()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HWModel#getSystemTypes <em>System Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Types</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getSystemTypes()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_SystemTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HWModel#getEcuTypes <em>Ecu Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecu Types</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getEcuTypes()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_EcuTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HWModel#getMcTypes <em>Mc Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mc Types</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getMcTypes()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_McTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HWModel#getCoreTypes <em>Core Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Core Types</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getCoreTypes()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_CoreTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HWModel#getMemoryTypes <em>Memory Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Types</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getMemoryTypes()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_MemoryTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HWModel#getNetworkTypes <em>Network Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Types</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getNetworkTypes()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_NetworkTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HWModel#getAccessPaths <em>Access Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Paths</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getAccessPaths()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_AccessPaths();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.HWModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HWModel#getSystem()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_System();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Node</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode
	 * @generated
	 */
	EClass getComplexNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getQuartzes <em>Quartzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quartzes</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode#getQuartzes()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Quartzes();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getPrescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescaler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode#getPrescaler()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Prescaler();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getMemories <em>Memories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memories</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode#getMemories()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Memories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode#getNetworks()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode#getComponents()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode#getPorts()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Ports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwSystem <em>Hw System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw System</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwSystem
	 * @generated
	 */
	EClass getHwSystem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.HwSystem#getSystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwSystem#getSystemType()
	 * @see #getHwSystem()
	 * @generated
	 */
	EReference getHwSystem_SystemType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HwSystem#getEcus <em>Ecus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecus</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwSystem#getEcus()
	 * @see #getHwSystem()
	 * @generated
	 */
	EReference getHwSystem_Ecus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ECU
	 * @generated
	 */
	EClass getECU();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ECU#getEcuType <em>Ecu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecu Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ECU#getEcuType()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_EcuType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ECU#getMicrocontrollers <em>Microcontrollers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microcontrollers</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ECU#getMicrocontrollers()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Microcontrollers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Microcontroller
	 * @generated
	 */
	EClass getMicrocontroller();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Microcontroller#getMicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microcontroller Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Microcontroller#getMicrocontrollerType()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_MicrocontrollerType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.Microcontroller#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cores</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Microcontroller#getCores()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Cores();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Core#getCoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Core#getCoreType()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_CoreType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Core#getLockstepGroup <em>Lockstep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lockstep Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Core#getLockstepGroup()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_LockstepGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Memory#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Memory#getType()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Memory#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Memory#getMapping()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Mapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Network#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Network#getType()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Quartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quartz</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Quartz
	 * @generated
	 */
	EClass getQuartz();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Quartz#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Quartz#getFrequency()
	 * @see #getQuartz()
	 * @generated
	 */
	EAttribute getQuartz_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Quartz#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Quartz#getType()
	 * @see #getQuartz()
	 * @generated
	 */
	EAttribute getQuartz_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwComponent <em>Hw Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Component</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwComponent
	 * @generated
	 */
	EClass getHwComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HwComponent#getNestedComponents <em>Nested Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Components</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwComponent#getNestedComponents()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_NestedComponents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HardwareTypeDescription <em>Hardware Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Type Description</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HardwareTypeDescription
	 * @generated
	 */
	EClass getHardwareTypeDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AbstractionType <em>Abstraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstraction Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractionType
	 * @generated
	 */
	EClass getAbstractionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ECUType <em>ECU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ECUType
	 * @generated
	 */
	EClass getECUType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.MicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MicrocontrollerType
	 * @generated
	 */
	EClass getMicrocontrollerType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CoreType
	 * @generated
	 */
	EClass getCoreType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CoreType#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CoreType#getBitWidth()
	 * @see #getCoreType()
	 * @generated
	 */
	EAttribute getCoreType_BitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CoreType#getInstructionsPerCycle <em>Instructions Per Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions Per Cycle</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CoreType#getInstructionsPerCycle()
	 * @see #getCoreType()
	 * @generated
	 */
	EAttribute getCoreType_InstructionsPerCycle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.MemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryType
	 * @generated
	 */
	EClass getMemoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.MemoryType#getXAccessPattern <em>XAccess Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAccess Pattern</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryType#getXAccessPattern()
	 * @see #getMemoryType()
	 * @generated
	 */
	EAttribute getMemoryType_XAccessPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.MemoryType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryType#getType()
	 * @see #getMemoryType()
	 * @generated
	 */
	EAttribute getMemoryType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.MemoryType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryType#getSize()
	 * @see #getMemoryType()
	 * @generated
	 */
	EAttribute getMemoryType_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.NetworkType#getSchedPolicy <em>Sched Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Policy</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.NetworkType#getSchedPolicy()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_SchedPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.NetworkType#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.NetworkType#getBitWidth()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_BitWidth();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwPort <em>Hw Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwPort
	 * @generated
	 */
	EClass getHwPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.HwPort#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pins</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwPort#getPins()
	 * @see #getHwPort()
	 * @generated
	 */
	EReference getHwPort_Pins();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.HwPort#computeUniqueName() <em>Compute Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Unique Name</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.HwPort#computeUniqueName()
	 * @generated
	 */
	EOperation getHwPort__ComputeUniqueName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ComplexPort <em>Complex Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort
	 * @generated
	 */
	EClass getComplexPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#getNetwork()
	 * @see #getComplexPort()
	 * @generated
	 */
	EReference getComplexPort_Network();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#isMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#isMaster()
	 * @see #getComplexPort()
	 * @generated
	 */
	EAttribute getComplexPort_Master();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#getBitWidth()
	 * @see #getComplexPort()
	 * @generated
	 */
	EAttribute getComplexPort_BitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getBaseAddress <em>Base Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Address</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#getBaseAddress()
	 * @see #getComplexPort()
	 * @generated
	 */
	EAttribute getComplexPort_BaseAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getAddressRange <em>Address Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Range</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#getAddressRange()
	 * @see #getComplexPort()
	 * @generated
	 */
	EAttribute getComplexPort_AddressRange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#getDirection()
	 * @see #getComplexPort()
	 * @generated
	 */
	EAttribute getComplexPort_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getWriteCycles <em>Write Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Cycles</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#getWriteCycles()
	 * @see #getComplexPort()
	 * @generated
	 */
	EAttribute getComplexPort_WriteCycles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getReadCycles <em>Read Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Cycles</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#getReadCycles()
	 * @see #getComplexPort()
	 * @generated
	 */
	EAttribute getComplexPort_ReadCycles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getSchedValue <em>Sched Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPort#getSchedValue()
	 * @see #getComplexPort()
	 * @generated
	 */
	EAttribute getComplexPort_SchedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ComplexPin <em>Complex Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Pin</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPin
	 * @generated
	 */
	EClass getComplexPin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPin#getType()
	 * @see #getComplexPin()
	 * @generated
	 */
	EAttribute getComplexPin_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getBaseAddress <em>Base Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Address</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPin#getBaseAddress()
	 * @see #getComplexPin()
	 * @generated
	 */
	EAttribute getComplexPin_BaseAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComplexPin#getDirection()
	 * @see #getComplexPin()
	 * @generated
	 */
	EAttribute getComplexPin_Direction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Prescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescaler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Prescaler
	 * @generated
	 */
	EClass getPrescaler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Prescaler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Prescaler#getName()
	 * @see #getPrescaler()
	 * @generated
	 */
	EAttribute getPrescaler_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Prescaler#getClockRatio <em>Clock Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Ratio</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Prescaler#getClockRatio()
	 * @see #getPrescaler()
	 * @generated
	 */
	EAttribute getPrescaler_ClockRatio();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Prescaler#getQuartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quartz</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Prescaler#getQuartz()
	 * @see #getPrescaler()
	 * @generated
	 */
	EReference getPrescaler_Quartz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CrossbarSwitch <em>Crossbar Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crossbar Switch</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CrossbarSwitch
	 * @generated
	 */
	EClass getCrossbarSwitch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CrossbarSwitch#getConConnections <em>Con Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Con Connections</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CrossbarSwitch#getConConnections()
	 * @see #getCrossbarSwitch()
	 * @generated
	 */
	EAttribute getCrossbarSwitch_ConConnections();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Bus#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Bus#getBusType()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_BusType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Bridge <em>Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Bridge
	 * @generated
	 */
	EClass getBridge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AccessPath <em>Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Path</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPath
	 * @generated
	 */
	EClass getAccessPath();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.AccessPath#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPath#getSource()
	 * @see #getAccessPath()
	 * @generated
	 */
	EReference getAccessPath_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.AccessPath#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPath#getTarget()
	 * @see #getAccessPath()
	 * @generated
	 */
	EReference getAccessPath_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LatencyAccessPath <em>Latency Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Access Path</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyAccessPath
	 * @generated
	 */
	EClass getLatencyAccessPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.LatencyAccessPath#getLatencies <em>Latencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Latencies</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyAccessPath#getLatencies()
	 * @see #getLatencyAccessPath()
	 * @generated
	 */
	EReference getLatencyAccessPath_Latencies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwAccessPath <em>Hw Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Access Path</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPath
	 * @generated
	 */
	EClass getHwAccessPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getHwElements <em>Hw Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hw Elements</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPath#getHwElements()
	 * @see #getHwAccessPath()
	 * @generated
	 */
	EReference getHwAccessPath_HwElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement <em>Latency Access Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Access Path Element</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement
	 * @generated
	 */
	EClass getLatencyAccessPathElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AccessPathRef <em>Access Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Path Ref</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPathRef
	 * @generated
	 */
	EClass getAccessPathRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.AccessPathRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPathRef#getRef()
	 * @see #getAccessPathRef()
	 * @generated
	 */
	EReference getAccessPathRef_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Latency
	 * @generated
	 */
	EClass getLatency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Latency#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Latency#getAccessType()
	 * @see #getLatency()
	 * @generated
	 */
	EAttribute getLatency_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Latency#getTransferSize <em>Transfer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfer Size</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Latency#getTransferSize()
	 * @see #getLatency()
	 * @generated
	 */
	EAttribute getLatency_TransferSize();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Latency#getQuartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quartz</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Latency#getQuartz()
	 * @see #getLatency()
	 * @generated
	 */
	EReference getLatency_Quartz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LatencyConstant <em>Latency Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Constant</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyConstant
	 * @generated
	 */
	EClass getLatencyConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.LatencyConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyConstant#getValue()
	 * @see #getLatencyConstant()
	 * @generated
	 */
	EAttribute getLatencyConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LatencyDeviation <em>Latency Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyDeviation
	 * @generated
	 */
	EClass getLatencyDeviation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.LatencyDeviation#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LatencyDeviation#getDeviation()
	 * @see #getLatencyDeviation()
	 * @generated
	 */
	EReference getLatencyDeviation_Deviation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwAccessPathElement <em>Hw Access Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Access Path Element</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPathElement
	 * @generated
	 */
	EClass getHwAccessPathElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwAccessPathRef <em>Hw Access Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Access Path Ref</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPathRef
	 * @generated
	 */
	EClass getHwAccessPathRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.HwAccessPathRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPathRef#getRef()
	 * @see #getHwAccessPathRef()
	 * @generated
	 */
	EReference getHwAccessPathRef_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwElementRef <em>Hw Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Element Ref</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwElementRef
	 * @generated
	 */
	EClass getHwElementRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.HwElementRef#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwElementRef#getPort()
	 * @see #getHwElementRef()
	 * @generated
	 */
	EReference getHwElementRef_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.MappingModel#getTaskAllocation <em>Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingModel#getTaskAllocation()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_TaskAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.MappingModel#getIsrAllocation <em>Isr Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isr Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingModel#getIsrAllocation()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_IsrAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.MappingModel#getRunnableAllocation <em>Runnable Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runnable Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingModel#getRunnableAllocation()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_RunnableAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.MappingModel#getCoreAllocation <em>Core Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Core Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingModel#getCoreAllocation()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_CoreAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.MappingModel#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingModel#getMapping()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.MappingModel#getAddressMappingType <em>Address Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Mapping Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingModel#getAddressMappingType()
	 * @see #getMappingModel()
	 * @generated
	 */
	EAttribute getMappingModel_AddressMappingType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CoreAllocation <em>Core Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CoreAllocation
	 * @generated
	 */
	EClass getCoreAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.CoreAllocation#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CoreAllocation#getScheduler()
	 * @see #getCoreAllocation()
	 * @generated
	 */
	EReference getCoreAllocation_Scheduler();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.CoreAllocation#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Core</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CoreAllocation#getCore()
	 * @see #getCoreAllocation()
	 * @generated
	 */
	EReference getCoreAllocation_Core();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.CoreAllocation <em>Scheduler Link Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler Link Int</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CoreAllocation
	 * @see #getCoreAllocation()
	 * @generated
	 */
	EReference getCoreAllocation_SchedulerLinkInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Mapping#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Mapping#getMemory()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Memory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Mapping#getMemoryPositionAddress <em>Memory Position Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Position Address</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Mapping#getMemoryPositionAddress()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_MemoryPositionAddress();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Mapping <em>Memory Link Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory Link Int</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Mapping
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_MemoryLinkInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SectionMapping <em>Section Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Mapping</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SectionMapping
	 * @generated
	 */
	EClass getSectionMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SectionMapping#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SectionMapping#getSection()
	 * @see #getSectionMapping()
	 * @generated
	 */
	EReference getSectionMapping_Section();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMapping <em>Abstract Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element Mapping</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractElementMapping
	 * @generated
	 */
	EClass getAbstractElementMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMapping#getAbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Element</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractElementMapping#getAbstractElement()
	 * @see #getAbstractElementMapping()
	 * @generated
	 */
	EReference getAbstractElementMapping_AbstractElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TaskAllocation <em>Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskAllocation
	 * @generated
	 */
	EClass getTaskAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskAllocation#getTask()
	 * @see #getTaskAllocation()
	 * @generated
	 */
	EReference getTaskAllocation_Task();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskAllocation#getScheduler()
	 * @see #getTaskAllocation()
	 * @generated
	 */
	EReference getTaskAllocation_Scheduler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ISRAllocation <em>ISR Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISR Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ISRAllocation
	 * @generated
	 */
	EClass getISRAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ISRAllocation#getIsr <em>Isr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Isr</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ISRAllocation#getIsr()
	 * @see #getISRAllocation()
	 * @generated
	 */
	EReference getISRAllocation_Isr();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ISRAllocation#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ISRAllocation#getController()
	 * @see #getISRAllocation()
	 * @generated
	 */
	EReference getISRAllocation_Controller();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableAllocation <em>Runnable Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableAllocation
	 * @generated
	 */
	EClass getRunnableAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableAllocation#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableAllocation#getScheduler()
	 * @see #getRunnableAllocation()
	 * @generated
	 */
	EReference getRunnableAllocation_Scheduler();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableAllocation#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableAllocation#getEntity()
	 * @see #getRunnableAllocation()
	 * @generated
	 */
	EReference getRunnableAllocation_Entity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OSModel <em>OS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OSModel
	 * @generated
	 */
	EClass getOSModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OSModel#getOsBuffering <em>Os Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os Buffering</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OSModel#getOsBuffering()
	 * @see #getOSModel()
	 * @generated
	 */
	EReference getOSModel_OsBuffering();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.OSModel#getSemaphores <em>Semaphores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semaphores</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OSModel#getSemaphores()
	 * @see #getOSModel()
	 * @generated
	 */
	EReference getOSModel_Semaphores();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.OSModel#getOperatingSystems <em>Operating Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operating Systems</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OSModel#getOperatingSystems()
	 * @see #getOSModel()
	 * @generated
	 */
	EReference getOSModel_OperatingSystems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.OSModel#getOsOverheads <em>Os Overheads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Os Overheads</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OSModel#getOsOverheads()
	 * @see #getOSModel()
	 * @generated
	 */
	EReference getOSModel_OsOverheads();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OsBuffering <em>Os Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Buffering</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsBuffering
	 * @generated
	 */
	EClass getOsBuffering();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isRunnableLevel <em>Runnable Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runnable Level</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsBuffering#isRunnableLevel()
	 * @see #getOsBuffering()
	 * @generated
	 */
	EAttribute getOsBuffering_RunnableLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isProcessLevel <em>Process Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Level</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsBuffering#isProcessLevel()
	 * @see #getOsBuffering()
	 * @generated
	 */
	EAttribute getOsBuffering_ProcessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isScheduleSectionLevel <em>Schedule Section Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Section Level</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsBuffering#isScheduleSectionLevel()
	 * @see #getOsBuffering()
	 * @generated
	 */
	EAttribute getOsBuffering_ScheduleSectionLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.OsBuffering#getBufferingAlgorithm <em>Buffering Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffering Algorithm</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsBuffering#getBufferingAlgorithm()
	 * @see #getOsBuffering()
	 * @generated
	 */
	EAttribute getOsBuffering_BufferingAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Semaphore
	 * @generated
	 */
	EClass getSemaphore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getInitalValue <em>Inital Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inital Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Semaphore#getInitalValue()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_InitalValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Semaphore#getMaxValue()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Semaphore#isPriorityCeilingProtocol <em>Priority Ceiling Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Ceiling Protocol</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Semaphore#isPriorityCeilingProtocol()
	 * @see #getSemaphore()
	 * @generated
	 */
	EAttribute getSemaphore_PriorityCeilingProtocol();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Scheduler#getSchedulingUnit <em>Scheduling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduling Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Scheduler#getSchedulingUnit()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_SchedulingUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Scheduler#getScheduleUnitPriority <em>Schedule Unit Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Unit Priority</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Scheduler#getScheduleUnitPriority()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_ScheduleUnitPriority();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Scheduler#getCoreAllocation <em>Core Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Allocation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Scheduler#getCoreAllocation()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_CoreAllocation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm <em>Interrupt Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Scheduling Algorithm</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm
	 * @generated
	 */
	EClass getInterruptSchedulingAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm <em>Task Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Scheduling Algorithm</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm
	 * @generated
	 */
	EClass getTaskSchedulingAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OSEK <em>OSEK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSEK</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OSEK
	 * @generated
	 */
	EClass getOSEK();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PartlyPFairPD2 <em>Partly PFair PD2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partly PFair PD2</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PartlyPFairPD2
	 * @generated
	 */
	EClass getPartlyPFairPD2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.PartlyPFairPD2#getQuantSizeNs <em>Quant Size Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quant Size Ns</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PartlyPFairPD2#getQuantSizeNs()
	 * @see #getPartlyPFairPD2()
	 * @generated
	 */
	EAttribute getPartlyPFairPD2_QuantSizeNs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PfairPD2 <em>Pfair PD2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pfair PD2</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PfairPD2
	 * @generated
	 */
	EClass getPfairPD2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.PfairPD2#getQuantSizeNs <em>Quant Size Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quant Size Ns</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PfairPD2#getQuantSizeNs()
	 * @see #getPfairPD2()
	 * @generated
	 */
	EAttribute getPfairPD2_QuantSizeNs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2 <em>Partly Early Release Fair PD2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partly Early Release Fair PD2</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2
	 * @generated
	 */
	EClass getPartlyEarlyReleaseFairPD2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2#getQuantSizeNs <em>Quant Size Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quant Size Ns</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PartlyEarlyReleaseFairPD2#getQuantSizeNs()
	 * @see #getPartlyEarlyReleaseFairPD2()
	 * @generated
	 */
	EAttribute getPartlyEarlyReleaseFairPD2_QuantSizeNs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2 <em>Early Release Fair PD2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Early Release Fair PD2</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2
	 * @generated
	 */
	EClass getEarlyReleaseFairPD2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2#getQuantSizeNs <em>Quant Size Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quant Size Ns</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2#getQuantSizeNs()
	 * @see #getEarlyReleaseFairPD2()
	 * @generated
	 */
	EAttribute getEarlyReleaseFairPD2_QuantSizeNs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst <em>Least Local Remaining Execution Time First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Least Local Remaining Execution Time First</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LeastLocalRemainingExecutionTimeFirst
	 * @generated
	 */
	EClass getLeastLocalRemainingExecutionTimeFirst();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst <em>Earliest Deadline First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earliest Deadline First</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst
	 * @generated
	 */
	EClass getEarliestDeadlineFirst();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DeadlineMonotonic <em>Deadline Monotonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Monotonic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DeadlineMonotonic
	 * @generated
	 */
	EClass getDeadlineMonotonic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RateMonotonic <em>Rate Monotonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate Monotonic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RateMonotonic
	 * @generated
	 */
	EClass getRateMonotonic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PriorityBasedRoundRobin <em>Priority Based Round Robin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Based Round Robin</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PriorityBasedRoundRobin
	 * @generated
	 */
	EClass getPriorityBasedRoundRobin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm <em>User Specific Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Specific Scheduling Algorithm</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm
	 * @generated
	 */
	EClass getUserSpecificSchedulingAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm#getParameter()
	 * @see #getUserSpecificSchedulingAlgorithm()
	 * @generated
	 */
	EReference getUserSpecificSchedulingAlgorithm_Parameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PriorityBased <em>Priority Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Based</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PriorityBased
	 * @generated
	 */
	EClass getPriorityBased();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AlgorithmParameter <em>Algorithm Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Parameter</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AlgorithmParameter
	 * @generated
	 */
	EClass getAlgorithmParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.AlgorithmParameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AlgorithmParameter#getKey()
	 * @see #getAlgorithmParameter()
	 * @generated
	 */
	EAttribute getAlgorithmParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.AlgorithmParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AlgorithmParameter#getValue()
	 * @see #getAlgorithmParameter()
	 * @generated
	 */
	EAttribute getAlgorithmParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulingUnit <em>Scheduling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulingUnit
	 * @generated
	 */
	EClass getSchedulingUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulingHWUnit <em>Scheduling HW Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling HW Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulingHWUnit
	 * @generated
	 */
	EClass getSchedulingHWUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.SchedulingHWUnit#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulingHWUnit#getDelay()
	 * @see #getSchedulingHWUnit()
	 * @generated
	 */
	EReference getSchedulingHWUnit_Delay();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit <em>Scheduling SW Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling SW Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulingSWUnit
	 * @generated
	 */
	EClass getSchedulingSWUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getPriority()
	 * @see #getSchedulingSWUnit()
	 * @generated
	 */
	EAttribute getSchedulingSWUnit_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getInstructions()
	 * @see #getSchedulingSWUnit()
	 * @generated
	 */
	EReference getSchedulingSWUnit_Instructions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getInterruptController <em>Interrupt Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interrupt Controller</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getInterruptController()
	 * @see #getSchedulingSWUnit()
	 * @generated
	 */
	EReference getSchedulingSWUnit_InterruptController();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.OperatingSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OperatingSystem#getName()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.OperatingSystem#getOverhead <em>Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overhead</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OperatingSystem#getOverhead()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_Overhead();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.OperatingSystem#getTaskSchedulers <em>Task Schedulers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Schedulers</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OperatingSystem#getTaskSchedulers()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_TaskSchedulers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.OperatingSystem#getInterruptControllers <em>Interrupt Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interrupt Controllers</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OperatingSystem#getInterruptControllers()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_InterruptControllers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem <em>Vendor Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Operating System</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.VendorOperatingSystem
	 * @generated
	 */
	EClass getVendorOperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getOsName <em>Os Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getOsName()
	 * @see #getVendorOperatingSystem()
	 * @generated
	 */
	EAttribute getVendorOperatingSystem_OsName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getVendor()
	 * @see #getVendorOperatingSystem()
	 * @generated
	 */
	EAttribute getVendorOperatingSystem_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getVersion()
	 * @see #getVendorOperatingSystem()
	 * @generated
	 */
	EAttribute getVendorOperatingSystem_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TaskScheduler <em>Task Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Scheduler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskScheduler
	 * @generated
	 */
	EClass getTaskScheduler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduling Algorithm</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskScheduler#getSchedulingAlgorithm()
	 * @see #getTaskScheduler()
	 * @generated
	 */
	EReference getTaskScheduler_SchedulingAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.InterruptController <em>Interrupt Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Controller</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InterruptController
	 * @generated
	 */
	EClass getInterruptController();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.InterruptController#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduling Algorithm</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InterruptController#getSchedulingAlgorithm()
	 * @see #getInterruptController()
	 * @generated
	 */
	EReference getInterruptController_SchedulingAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OsInstructions <em>Os Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Instructions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsInstructions
	 * @generated
	 */
	EClass getOsInstructions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getApiOverhead <em>Api Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Overhead</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsInstructions#getApiOverhead()
	 * @see #getOsInstructions()
	 * @generated
	 */
	EReference getOsInstructions_ApiOverhead();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getIsrCategory1Overhead <em>Isr Category1 Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isr Category1 Overhead</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsInstructions#getIsrCategory1Overhead()
	 * @see #getOsInstructions()
	 * @generated
	 */
	EReference getOsInstructions_IsrCategory1Overhead();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getIsrCategory2Overhead <em>Isr Category2 Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Isr Category2 Overhead</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsInstructions#getIsrCategory2Overhead()
	 * @see #getOsInstructions()
	 * @generated
	 */
	EReference getOsInstructions_IsrCategory2Overhead();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions <em>Os API Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os API Instructions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions
	 * @generated
	 */
	EClass getOsAPIInstructions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSendMessage <em>Api Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Send Message</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSendMessage()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiSendMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiTerminateTask <em>Api Terminate Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Terminate Task</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiTerminateTask()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiTerminateTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSchedule <em>Api Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Schedule</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSchedule()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiSchedule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiRequestResource <em>Api Request Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Request Resource</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiRequestResource()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiRequestResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiReleaseResource <em>Api Release Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Release Resource</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiReleaseResource()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiReleaseResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSetEvent <em>Api Set Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Set Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiSetEvent()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiSetEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiWaitEvent <em>Api Wait Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Wait Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiWaitEvent()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiWaitEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiClearEvent <em>Api Clear Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Clear Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiClearEvent()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiClearEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiActivateTask <em>Api Activate Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Activate Task</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiActivateTask()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiActivateTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiEnforcedMigration <em>Api Enforced Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api Enforced Migration</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsAPIInstructions#getApiEnforcedMigration()
	 * @see #getOsAPIInstructions()
	 * @generated
	 */
	EReference getOsAPIInstructions_ApiEnforcedMigration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OsISRInstructions <em>Os ISR Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os ISR Instructions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsISRInstructions
	 * @generated
	 */
	EClass getOsISRInstructions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsISRInstructions#getPreExecutionOverhead <em>Pre Execution Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Execution Overhead</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsISRInstructions#getPreExecutionOverhead()
	 * @see #getOsISRInstructions()
	 * @generated
	 */
	EReference getOsISRInstructions_PreExecutionOverhead();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsISRInstructions#getPostExecutionOverhead <em>Post Execution Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Execution Overhead</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsISRInstructions#getPostExecutionOverhead()
	 * @see #getOsISRInstructions()
	 * @generated
	 */
	EReference getOsISRInstructions_PostExecutionOverhead();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OsExecutionInstructions <em>Os Execution Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Execution Instructions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsExecutionInstructions
	 * @generated
	 */
	EClass getOsExecutionInstructions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsDeviation <em>Os Execution Instructions Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Execution Instructions Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsDeviation
	 * @generated
	 */
	EClass getOsExecutionInstructionsDeviation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsDeviation#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsDeviation#getDeviation()
	 * @see #getOsExecutionInstructionsDeviation()
	 * @generated
	 */
	EReference getOsExecutionInstructionsDeviation_Deviation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsConstant <em>Os Execution Instructions Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Execution Instructions Constant</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsConstant
	 * @generated
	 */
	EClass getOsExecutionInstructionsConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsConstant#getValue()
	 * @see #getOsExecutionInstructionsConstant()
	 * @generated
	 */
	EAttribute getOsExecutionInstructionsConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel <em>Property Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Constraints Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel
	 * @generated
	 */
	EClass getPropertyConstraintsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getAllocationConstraints <em>Allocation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation Constraints</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getAllocationConstraints()
	 * @see #getPropertyConstraintsModel()
	 * @generated
	 */
	EReference getPropertyConstraintsModel_AllocationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getMappingConstraints <em>Mapping Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Constraints</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getMappingConstraints()
	 * @see #getPropertyConstraintsModel()
	 * @generated
	 */
	EReference getPropertyConstraintsModel_MappingConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getCoreTypeDefinitions <em>Core Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Core Type Definitions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getCoreTypeDefinitions()
	 * @see #getPropertyConstraintsModel()
	 * @generated
	 */
	EReference getPropertyConstraintsModel_CoreTypeDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getMemoryTypeDefinitions <em>Memory Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Type Definitions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel#getMemoryTypeDefinitions()
	 * @see #getPropertyConstraintsModel()
	 * @generated
	 */
	EReference getPropertyConstraintsModel_MemoryTypeDefinitions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AllocationConstraint <em>Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AllocationConstraint
	 * @generated
	 */
	EClass getAllocationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.AllocationConstraint#getHwConstraint <em>Hw Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hw Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AllocationConstraint#getHwConstraint()
	 * @see #getAllocationConstraint()
	 * @generated
	 */
	EReference getAllocationConstraint_HwConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.MappingConstraint <em>Mapping Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingConstraint
	 * @generated
	 */
	EClass getMappingConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.MappingConstraint#getHwConstraint <em>Hw Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hw Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MappingConstraint#getHwConstraint()
	 * @see #getMappingConstraint()
	 * @generated
	 */
	EReference getMappingConstraint_HwConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint <em>Process Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Allocation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint
	 * @generated
	 */
	EClass getProcessAllocationConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint#getProcess()
	 * @see #getProcessAllocationConstraint()
	 * @generated
	 */
	EReference getProcessAllocationConstraint_Process();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint <em>Process Prototype Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Prototype Allocation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint
	 * @generated
	 */
	EClass getProcessPrototypeAllocationConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint#getProcessPrototype <em>Process Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Prototype</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint#getProcessPrototype()
	 * @see #getProcessPrototypeAllocationConstraint()
	 * @generated
	 */
	EReference getProcessPrototypeAllocationConstraint_ProcessPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint <em>Runnable Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Allocation Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint
	 * @generated
	 */
	EClass getRunnableAllocationConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint#getRunnable()
	 * @see #getRunnableAllocationConstraint()
	 * @generated
	 */
	EReference getRunnableAllocationConstraint_Runnable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SectionMappingConstraint <em>Section Mapping Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Mapping Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SectionMappingConstraint
	 * @generated
	 */
	EClass getSectionMappingConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SectionMappingConstraint#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SectionMappingConstraint#getSection()
	 * @see #getSectionMappingConstraint()
	 * @generated
	 */
	EReference getSectionMappingConstraint_Section();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint <em>Abstract Element Mapping Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element Mapping Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint
	 * @generated
	 */
	EClass getAbstractElementMappingConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint#getAbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Element</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint#getAbstractElement()
	 * @see #getAbstractElementMappingConstraint()
	 * @generated
	 */
	EReference getAbstractElementMappingConstraint_AbstractElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwCoreConstraint <em>Hw Core Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Core Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwCoreConstraint
	 * @generated
	 */
	EClass getHwCoreConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwMemoryConstraint <em>Hw Memory Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Memory Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwMemoryConstraint
	 * @generated
	 */
	EClass getHwMemoryConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwCoreProperty <em>Hw Core Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Core Property</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwCoreProperty
	 * @generated
	 */
	EClass getHwCoreProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.HwCoreProperty#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwCoreProperty#getCore()
	 * @see #getHwCoreProperty()
	 * @generated
	 */
	EReference getHwCoreProperty_Core();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.HwCoreProperty#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwCoreProperty#getComparator()
	 * @see #getHwCoreProperty()
	 * @generated
	 */
	EAttribute getHwCoreProperty_Comparator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwCoreConjunction <em>Hw Core Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Core Conjunction</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwCoreConjunction
	 * @generated
	 */
	EClass getHwCoreConjunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.HwCoreConjunction#getConjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conjunction</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwCoreConjunction#getConjunction()
	 * @see #getHwCoreConjunction()
	 * @generated
	 */
	EAttribute getHwCoreConjunction_Conjunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.HwCoreConjunction#getFirstConstraint <em>First Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwCoreConjunction#getFirstConstraint()
	 * @see #getHwCoreConjunction()
	 * @generated
	 */
	EReference getHwCoreConjunction_FirstConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.HwCoreConjunction#getSecondConstraint <em>Second Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwCoreConjunction#getSecondConstraint()
	 * @see #getHwCoreConjunction()
	 * @generated
	 */
	EReference getHwCoreConjunction_SecondConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwMemoryProperty <em>Hw Memory Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Memory Property</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwMemoryProperty
	 * @generated
	 */
	EClass getHwMemoryProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.HwMemoryProperty#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwMemoryProperty#getMemory()
	 * @see #getHwMemoryProperty()
	 * @generated
	 */
	EReference getHwMemoryProperty_Memory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.HwMemoryProperty#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwMemoryProperty#getComparator()
	 * @see #getHwMemoryProperty()
	 * @generated
	 */
	EAttribute getHwMemoryProperty_Comparator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.HwMemoryConjunction <em>Hw Memory Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Memory Conjunction</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwMemoryConjunction
	 * @generated
	 */
	EClass getHwMemoryConjunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.HwMemoryConjunction#getConjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conjunction</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwMemoryConjunction#getConjunction()
	 * @see #getHwMemoryConjunction()
	 * @generated
	 */
	EAttribute getHwMemoryConjunction_Conjunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.HwMemoryConjunction#getFirstConstraint <em>First Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwMemoryConjunction#getFirstConstraint()
	 * @see #getHwMemoryConjunction()
	 * @generated
	 */
	EReference getHwMemoryConjunction_FirstConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.HwMemoryConjunction#getSecondConstraint <em>Second Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Constraint</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.HwMemoryConjunction#getSecondConstraint()
	 * @see #getHwMemoryConjunction()
	 * @generated
	 */
	EReference getHwMemoryConjunction_SecondConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.StimuliModel <em>Stimuli Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimuli Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StimuliModel
	 * @generated
	 */
	EClass getStimuliModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.StimuliModel#getStimuli <em>Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimuli</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StimuliModel#getStimuli()
	 * @see #getStimuliModel()
	 * @generated
	 */
	EReference getStimuliModel_Stimuli();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.StimuliModel#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StimuliModel#getClocks()
	 * @see #getStimuliModel()
	 * @generated
	 */
	EReference getStimuliModel_Clocks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Stimulus
	 * @generated
	 */
	EClass getStimulus();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Stimulus#getStimulusDeviation <em>Stimulus Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stimulus Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Stimulus#getStimulusDeviation()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_StimulusDeviation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Stimulus#getSetModeValueList <em>Set Mode Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Mode Value List</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Stimulus#getSetModeValueList()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_SetModeValueList();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Stimulus#getEnablingModeValueList <em>Enabling Mode Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enabling Mode Value List</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Stimulus#getEnablingModeValueList()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_EnablingModeValueList();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Stimulus#getDisablingModeValueList <em>Disabling Mode Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disabling Mode Value List</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Stimulus#getDisablingModeValueList()
	 * @see #getStimulus()
	 * @generated
	 */
	EReference getStimulus_DisablingModeValueList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ModeValueList <em>Mode Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Value List</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueList
	 * @generated
	 */
	EClass getModeValueList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ModeValueList#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueList#getEntries()
	 * @see #getModeValueList()
	 * @generated
	 */
	EReference getModeValueList_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ModeValueListEntry <em>Mode Value List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Value List Entry</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueListEntry
	 * @generated
	 */
	EClass getModeValueListEntry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ModeValueListEntry#getValueProvider <em>Value Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Provider</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueListEntry#getValueProvider()
	 * @see #getModeValueListEntry()
	 * @generated
	 */
	EReference getModeValueListEntry_ValueProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ModeValueListEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeValueListEntry#getValue()
	 * @see #getModeValueListEntry()
	 * @generated
	 */
	EReference getModeValueListEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Periodic <em>Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Periodic
	 * @generated
	 */
	EClass getPeriodic();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Periodic#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Periodic#getOffset()
	 * @see #getPeriodic()
	 * @generated
	 */
	EReference getPeriodic_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Periodic#getRecurrence <em>Recurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recurrence</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Periodic#getRecurrence()
	 * @see #getPeriodic()
	 * @generated
	 */
	EReference getPeriodic_Recurrence();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Periodic#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Periodic#getClock()
	 * @see #getPeriodic()
	 * @generated
	 */
	EReference getPeriodic_Clock();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PeriodicEvent <em>Periodic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicEvent
	 * @generated
	 */
	EClass getPeriodicEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CustomStimulus <em>Custom Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Stimulus</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CustomStimulus
	 * @generated
	 */
	EClass getCustomStimulus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Single <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Single
	 * @generated
	 */
	EClass getSingle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Single#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Single#getActivation()
	 * @see #getSingle()
	 * @generated
	 */
	EReference getSingle_Activation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.InterProcess <em>Inter Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InterProcess
	 * @generated
	 */
	EClass getInterProcess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Sporadic <em>Sporadic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Sporadic
	 * @generated
	 */
	EClass getSporadic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurve <em>Arrival Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival Curve</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ArrivalCurve
	 * @generated
	 */
	EClass getArrivalCurve();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurve#getArrivalCurveEntries <em>Arrival Curve Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrival Curve Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ArrivalCurve#getArrivalCurveEntries()
	 * @see #getArrivalCurve()
	 * @generated
	 */
	EReference getArrivalCurve_ArrivalCurveEntries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry <em>Arrival Curve Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival Curve Entry</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry
	 * @generated
	 */
	EClass getArrivalCurveEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getNumberOfEvents <em>Number Of Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Events</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getNumberOfEvents()
	 * @see #getArrivalCurveEntry()
	 * @generated
	 */
	EAttribute getArrivalCurveEntry_NumberOfEvents();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getLowerTimeBorder <em>Lower Time Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Time Border</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getLowerTimeBorder()
	 * @see #getArrivalCurveEntry()
	 * @generated
	 */
	EReference getArrivalCurveEntry_LowerTimeBorder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getUpperTimeBorder <em>Upper Time Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Time Border</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getUpperTimeBorder()
	 * @see #getArrivalCurveEntry()
	 * @generated
	 */
	EReference getArrivalCurveEntry_UpperTimeBorder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction <em>Clock Triangle Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Triangle Function</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockTriangleFunction
	 * @generated
	 */
	EClass getClockTriangleFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shift</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getShift()
	 * @see #getClockTriangleFunction()
	 * @generated
	 */
	EReference getClockTriangleFunction_Shift();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getPeriod()
	 * @see #getClockTriangleFunction()
	 * @generated
	 */
	EReference getClockTriangleFunction_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getMax()
	 * @see #getClockTriangleFunction()
	 * @generated
	 */
	EAttribute getClockTriangleFunction_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getMin()
	 * @see #getClockTriangleFunction()
	 * @generated
	 */
	EAttribute getClockTriangleFunction_Min();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction <em>Clock Sinus Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Sinus Function</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockSinusFunction
	 * @generated
	 */
	EClass getClockSinusFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shift</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getShift()
	 * @see #getClockSinusFunction()
	 * @generated
	 */
	EReference getClockSinusFunction_Shift();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getPeriod()
	 * @see #getClockSinusFunction()
	 * @generated
	 */
	EReference getClockSinusFunction_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getAmplitude <em>Amplitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amplitude</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getAmplitude()
	 * @see #getClockSinusFunction()
	 * @generated
	 */
	EAttribute getClockSinusFunction_Amplitude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getYOffset <em>YOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YOffset</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getYOffset()
	 * @see #getClockSinusFunction()
	 * @generated
	 */
	EAttribute getClockSinusFunction_YOffset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierList <em>Clock Multiplier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Multiplier List</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockMultiplierList
	 * @generated
	 */
	EClass getClockMultiplierList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierList#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockMultiplierList#getEntries()
	 * @see #getClockMultiplierList()
	 * @generated
	 */
	EReference getClockMultiplierList_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry <em>Clock Multiplier List Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Multiplier List Entry</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry
	 * @generated
	 */
	EClass getClockMultiplierListEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry#getMultiplier()
	 * @see #getClockMultiplierListEntry()
	 * @generated
	 */
	EAttribute getClockMultiplierListEntry_Multiplier();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry#getTime()
	 * @see #getClockMultiplierListEntry()
	 * @generated
	 */
	EReference getClockMultiplierListEntry_Time();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SWModel <em>SW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Model</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel
	 * @generated
	 */
	EClass getSWModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getIsrs <em>Isrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isrs</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getIsrs()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Isrs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getTasks()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getRunnables <em>Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runnables</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getRunnables()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Runnables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getLabels()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Labels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getProcessPrototypes <em>Process Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Prototypes</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getProcessPrototypes()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_ProcessPrototypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getSections()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getActivations <em>Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activations</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getActivations()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Activations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getTags()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getEvents()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getTypeDefinitions <em>Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Definitions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getTypeDefinitions()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_TypeDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getCustomEntities <em>Custom Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Entities</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getCustomEntities()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_CustomEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getProcessChains <em>Process Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Chains</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getProcessChains()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_ProcessChains();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getModes()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_Modes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.SWModel#getModeLabels <em>Mode Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode Labels</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SWModel#getModeLabels()
	 * @see #getSWModel()
	 * @generated
	 */
	EReference getSWModel_ModeLabels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation <em>Abstract Element Memory Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element Memory Information</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation
	 * @generated
	 */
	EClass getAbstractElementMemoryInformation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation#getSize()
	 * @see #getAbstractElementMemoryInformation()
	 * @generated
	 */
	EReference getAbstractElementMemoryInformation_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AbstractProcess <em>Abstract Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractProcess
	 * @generated
	 */
	EClass getAbstractProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.AbstractProcess#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AbstractProcess#getPriority()
	 * @see #getAbstractProcess()
	 * @generated
	 */
	EAttribute getAbstractProcess_Priority();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CustomEntity <em>Custom Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Entity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CustomEntity
	 * @generated
	 */
	EClass getCustomEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CustomEntity#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CustomEntity#getTypeName()
	 * @see #getCustomEntity()
	 * @generated
	 */
	EAttribute getCustomEntity_TypeName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessChain <em>Process Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Chain</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChain
	 * @generated
	 */
	EClass getProcessChain();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessChain#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processes</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessChain#getProcesses()
	 * @see #getProcessChain()
	 * @generated
	 */
	EReference getProcessChain_Processes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Process#getCallGraph <em>Call Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Graph</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Process#getCallGraph()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CallGraph();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Process#getStimuli <em>Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stimuli</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Process#getStimuli()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Stimuli();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CallGraph <em>Call Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Graph</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CallGraph
	 * @generated
	 */
	EClass getCallGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.CallGraph#getGraphEntries <em>Graph Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CallGraph#getGraphEntries()
	 * @see #getCallGraph()
	 * @generated
	 */
	EReference getCallGraph_GraphEntries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.GraphEntryBase <em>Graph Entry Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Entry Base</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.GraphEntryBase
	 * @generated
	 */
	EClass getGraphEntryBase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CallSequence <em>Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Sequence</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CallSequence
	 * @generated
	 */
	EClass getCallSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CallSequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CallSequence#getName()
	 * @see #getCallSequence()
	 * @generated
	 */
	EAttribute getCallSequence_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.CallSequence#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CallSequence#getCalls()
	 * @see #getCallSequence()
	 * @generated
	 */
	EReference getCallSequence_Calls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ModeSwitch <em>Mode Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Switch</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitch
	 * @generated
	 */
	EClass getModeSwitch();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ModeSwitch#getValueProvider <em>Value Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Provider</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitch#getValueProvider()
	 * @see #getModeSwitch()
	 * @generated
	 */
	EReference getModeSwitch_ValueProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ModeSwitch#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitch#getEntries()
	 * @see #getModeSwitch()
	 * @generated
	 */
	EReference getModeSwitch_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry <em>Mode Switch Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Switch Entry</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
	 * @generated
	 */
	EClass getModeSwitchEntry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#getValue()
	 * @see #getModeSwitchEntry()
	 * @generated
	 */
	EReference getModeSwitchEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#isDefault()
	 * @see #getModeSwitchEntry()
	 * @generated
	 */
	EAttribute getModeSwitchEntry_Default();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#getGraphEntries <em>Graph Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#getGraphEntries()
	 * @see #getModeSwitchEntry()
	 * @generated
	 */
	EReference getModeSwitchEntry_GraphEntries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProbabiltitySwitch <em>Probabiltity Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabiltity Switch</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabiltitySwitch
	 * @generated
	 */
	EClass getProbabiltitySwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProbabiltitySwitch#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabiltitySwitch#getEntries()
	 * @see #getProbabiltitySwitch()
	 * @generated
	 */
	EReference getProbabiltitySwitch_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry <em>Probability Switch Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability Switch Entry</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry
	 * @generated
	 */
	EClass getProbabilitySwitchEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry#getProbability()
	 * @see #getProbabilitySwitchEntry()
	 * @generated
	 */
	EAttribute getProbabilitySwitchEntry_Probability();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry#getGraphEntries <em>Graph Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry#getGraphEntries()
	 * @see #getProbabilitySwitchEntry()
	 * @generated
	 */
	EReference getProbabilitySwitchEntry_GraphEntries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Counter#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Counter#getOffset()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Counter#getPrescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prescaler</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Counter#getPrescaler()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Prescaler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CallSequenceItem <em>Call Sequence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Sequence Item</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CallSequenceItem
	 * @generated
	 */
	EClass getCallSequenceItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.CallSequenceItem#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CallSequenceItem#getCounter()
	 * @see #getCallSequenceItem()
	 * @generated
	 */
	EReference getCallSequenceItem_Counter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.WaitEvent <em>Wait Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WaitEvent
	 * @generated
	 */
	EClass getWaitEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getEventMask <em>Event Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Mask</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WaitEvent#getEventMask()
	 * @see #getWaitEvent()
	 * @generated
	 */
	EReference getWaitEvent_EventMask();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getMaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WaitEvent#getMaskType()
	 * @see #getWaitEvent()
	 * @generated
	 */
	EAttribute getWaitEvent_MaskType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getWaitingBehaviour <em>Waiting Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Behaviour</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WaitEvent#getWaitingBehaviour()
	 * @see #getWaitEvent()
	 * @generated
	 */
	EAttribute getWaitEvent_WaitingBehaviour();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SetEvent <em>Set Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SetEvent
	 * @generated
	 */
	EClass getSetEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.SetEvent#getEventMask <em>Event Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Mask</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SetEvent#getEventMask()
	 * @see #getSetEvent()
	 * @generated
	 */
	EReference getSetEvent_EventMask();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SetEvent#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SetEvent#getProcess()
	 * @see #getSetEvent()
	 * @generated
	 */
	EReference getSetEvent_Process();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ClearEvent <em>Clear Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClearEvent
	 * @generated
	 */
	EClass getClearEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ClearEvent#getEventMask <em>Event Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Mask</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ClearEvent#getEventMask()
	 * @see #getClearEvent()
	 * @generated
	 */
	EReference getClearEvent_EventMask();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EventMask <em>Event Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mask</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventMask
	 * @generated
	 */
	EClass getEventMask();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.EventMask#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EventMask#getEvents()
	 * @see #getEventMask()
	 * @generated
	 */
	EReference getEventMask_Events();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OsEvent <em>Os Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os Event</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsEvent
	 * @generated
	 */
	EClass getOsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.OsEvent#getCommunicationOverheadInBit <em>Communication Overhead In Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Overhead In Bit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OsEvent#getCommunicationOverheadInBit()
	 * @see #getOsEvent()
	 * @generated
	 */
	EAttribute getOsEvent_CommunicationOverheadInBit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.InterProcessActivation <em>Inter Process Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Process Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InterProcessActivation
	 * @generated
	 */
	EClass getInterProcessActivation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.InterProcessActivation#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stimulus</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InterProcessActivation#getStimulus()
	 * @see #getInterProcessActivation()
	 * @generated
	 */
	EReference getInterProcessActivation_Stimulus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.EnforcedMigration <em>Enforced Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enforced Migration</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EnforcedMigration
	 * @generated
	 */
	EClass getEnforcedMigration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.EnforcedMigration#getResourceOwner <em>Resource Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Owner</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.EnforcedMigration#getResourceOwner()
	 * @see #getEnforcedMigration()
	 * @generated
	 */
	EReference getEnforcedMigration_ResourceOwner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall <em>Task Runnable Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Runnable Call</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskRunnableCall
	 * @generated
	 */
	EClass getTaskRunnableCall();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskRunnableCall#getRunnable()
	 * @see #getTaskRunnableCall()
	 * @generated
	 */
	EReference getTaskRunnableCall_Runnable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskRunnableCall#getStatistic()
	 * @see #getTaskRunnableCall()
	 * @generated
	 */
	EReference getTaskRunnableCall_Statistic();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall <em>Runnable Link Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable Link Int</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TaskRunnableCall
	 * @see #getTaskRunnableCall()
	 * @generated
	 */
	EReference getTaskRunnableCall_RunnableLinkInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SchedulePoint <em>Schedule Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Point</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedulePoint
	 * @generated
	 */
	EClass getSchedulePoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TerminateProcess <em>Terminate Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate Process</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TerminateProcess
	 * @generated
	 */
	EClass getTerminateProcess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Task#getPreemption <em>Preemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Task#getPreemption()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Preemption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Task#getMultipleTaskActivationLimit <em>Multiple Task Activation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Task Activation Limit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Task#getMultipleTaskActivationLimit()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MultipleTaskActivationLimit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ISR <em>ISR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISR</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ISR
	 * @generated
	 */
	EClass getISR();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype <em>Process Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Prototype</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype
	 * @generated
	 */
	EClass getProcessPrototype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getPreemption <em>Preemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype#getPreemption()
	 * @see #getProcessPrototype()
	 * @generated
	 */
	EAttribute getProcessPrototype_Preemption();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getFirstRunnable <em>First Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype#getFirstRunnable()
	 * @see #getProcessPrototype()
	 * @generated
	 */
	EReference getProcessPrototype_FirstRunnable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getLastRunnable <em>Last Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype#getLastRunnable()
	 * @see #getProcessPrototype()
	 * @generated
	 */
	EReference getProcessPrototype_LastRunnable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getAccessPrecedenceSpec <em>Access Precedence Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Precedence Spec</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype#getAccessPrecedenceSpec()
	 * @see #getProcessPrototype()
	 * @generated
	 */
	EReference getProcessPrototype_AccessPrecedenceSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getOrderPrecedenceSpec <em>Order Precedence Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Precedence Spec</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype#getOrderPrecedenceSpec()
	 * @see #getProcessPrototype()
	 * @generated
	 */
	EReference getProcessPrototype_OrderPrecedenceSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getChainedPrototypes <em>Chained Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chained Prototypes</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype#getChainedPrototypes()
	 * @see #getProcessPrototype()
	 * @generated
	 */
	EReference getProcessPrototype_ChainedPrototypes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype#getActivation()
	 * @see #getProcessPrototype()
	 * @generated
	 */
	EReference getProcessPrototype_Activation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getRunnableCalls <em>Runnable Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runnable Calls</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessPrototype#getRunnableCalls()
	 * @see #getProcessPrototype()
	 * @generated
	 */
	EReference getProcessPrototype_RunnableCalls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype <em>Chained Process Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chained Process Prototype</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype
	 * @generated
	 */
	EClass getChainedProcessPrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getPrototype()
	 * @see #getChainedProcessPrototype()
	 * @generated
	 */
	EReference getChainedProcessPrototype_Prototype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getApply()
	 * @see #getChainedProcessPrototype()
	 * @generated
	 */
	EAttribute getChainedProcessPrototype_Apply();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getOffset()
	 * @see #getChainedProcessPrototype()
	 * @generated
	 */
	EAttribute getChainedProcessPrototype_Offset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.GeneralPrecedence <em>General Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Precedence</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.GeneralPrecedence
	 * @generated
	 */
	EClass getGeneralPrecedence();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.GeneralPrecedence#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.GeneralPrecedence#getOrigin()
	 * @see #getGeneralPrecedence()
	 * @generated
	 */
	EReference getGeneralPrecedence_Origin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.GeneralPrecedence#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.GeneralPrecedence#getTarget()
	 * @see #getGeneralPrecedence()
	 * @generated
	 */
	EReference getGeneralPrecedence_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec <em>Access Precedence Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Precedence Spec</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec
	 * @generated
	 */
	EClass getAccessPrecedenceSpec();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec#getLabel()
	 * @see #getAccessPrecedenceSpec()
	 * @generated
	 */
	EReference getAccessPrecedenceSpec_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec#getOrderType()
	 * @see #getAccessPrecedenceSpec()
	 * @generated
	 */
	EAttribute getAccessPrecedenceSpec_OrderType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec <em>Order Precedence Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Precedence Spec</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec
	 * @generated
	 */
	EClass getOrderPrecedenceSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec#getOrderType()
	 * @see #getOrderPrecedenceSpec()
	 * @generated
	 */
	EAttribute getOrderPrecedenceSpec_OrderType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.Runnable#getRunnableItems <em>Runnable Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runnable Items</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable#getRunnableItems()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_RunnableItems();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.Runnable#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable#getActivation()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Runnable#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable#getDeadline()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Runnable#isCallback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callback</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable#isCallback()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Callback();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Runnable#isService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable#isService()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Service();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Runnable#getRunnableCalls <em>Runnable Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runnable Calls</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable#getRunnableCalls()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_RunnableCalls();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Runnable#getTaskRunnableCalls <em>Task Runnable Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Runnable Calls</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Runnable#getTaskRunnableCalls()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_TaskRunnableCalls();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Label#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Label#getDataType()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Label#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Label#isConstant()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Constant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Label#isBVolatile <em>BVolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BVolatile</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Label#isBVolatile()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_BVolatile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Label#getBuffered <em>Buffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffered</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Label#getBuffered()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Buffered();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Label#getLabelAccesses <em>Label Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Label Accesses</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Label#getLabelAccesses()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_LabelAccesses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ModeLabel <em>Mode Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Label</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabel
	 * @generated
	 */
	EClass getModeLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Section#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Section#getSize()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Size();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Section#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labels</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Section#getLabels()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Labels();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.Section#getRunEntities <em>Run Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Run Entities</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Section#getRunEntities()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_RunEntities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableItem <em>Runnable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Item</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableItem
	 * @generated
	 */
	EClass getRunnableItem();

	/**
	 * Returns the meta object for the '{@link org.eclipse.app4mc.amalthea.model.RunnableItem#containerNotificationRequired() <em>Container Notification Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Notification Required</em>' operation.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableItem#containerNotificationRequired()
	 * @generated
	 */
	EOperation getRunnableItem__ContainerNotificationRequired();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess <em>Mode Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Label Access</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabelAccess
	 * @generated
	 */
	EClass getModeLabelAccess();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getData()
	 * @see #getModeLabelAccess()
	 * @generated
	 */
	EReference getModeLabelAccess_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getAccess()
	 * @see #getModeLabelAccess()
	 * @generated
	 */
	EAttribute getModeLabelAccess_Access();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getModeValue <em>Mode Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getModeValue()
	 * @see #getModeLabelAccess()
	 * @generated
	 */
	EReference getModeLabelAccess_ModeValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LabelAccess <em>Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Access</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccess
	 * @generated
	 */
	EClass getLabelAccess();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccess#getData()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EReference getLabelAccess_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccess#getAccess()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EAttribute getLabelAccess_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccess#getStatistic()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EReference getLabelAccess_Statistic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getBuffered <em>Buffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffered</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccess#getBuffered()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EAttribute getLabelAccess_Buffered();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.LabelAccess <em>Data Link Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Link Int</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccess
	 * @see #getLabelAccess()
	 * @generated
	 */
	EReference getLabelAccess_DataLinkInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess <em>Semaphore Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore Access</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreAccess
	 * @generated
	 */
	EClass getSemaphoreAccess();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getSemaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semaphore</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getSemaphore()
	 * @see #getSemaphoreAccess()
	 * @generated
	 */
	EReference getSemaphoreAccess_Semaphore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getAccess()
	 * @see #getSemaphoreAccess()
	 * @generated
	 */
	EAttribute getSemaphoreAccess_Access();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication <em>Sender Receiver Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver Communication</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication
	 * @generated
	 */
	EClass getSenderReceiverCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#isBuffered <em>Buffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffered</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#isBuffered()
	 * @see #getSenderReceiverCommunication()
	 * @generated
	 */
	EAttribute getSenderReceiverCommunication_Buffered();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#getLabel()
	 * @see #getSenderReceiverCommunication()
	 * @generated
	 */
	EReference getSenderReceiverCommunication_Label();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverRead <em>Sender Receiver Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver Read</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverRead
	 * @generated
	 */
	EClass getSenderReceiverRead();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverWrite <em>Sender Receiver Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Receiver Write</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverWrite
	 * @generated
	 */
	EClass getSenderReceiverWrite();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverWrite#getNotifiedRunnables <em>Notified Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notified Runnables</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SenderReceiverWrite#getNotifiedRunnables()
	 * @see #getSenderReceiverWrite()
	 * @generated
	 */
	EReference getSenderReceiverWrite_NotifiedRunnables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ServerCall <em>Server Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Call</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ServerCall
	 * @generated
	 */
	EClass getServerCall();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.ServerCall#getServerRunnable <em>Server Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ServerCall#getServerRunnable()
	 * @see #getServerCall()
	 * @generated
	 */
	EReference getServerCall_ServerRunnable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SynchronousServerCall <em>Synchronous Server Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Server Call</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronousServerCall
	 * @generated
	 */
	EClass getSynchronousServerCall();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.SynchronousServerCall#getWaitingBehaviour <em>Waiting Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Behaviour</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronousServerCall#getWaitingBehaviour()
	 * @see #getSynchronousServerCall()
	 * @generated
	 */
	EAttribute getSynchronousServerCall_WaitingBehaviour();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.AsynchronousServerCall <em>Asynchronous Server Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Server Call</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AsynchronousServerCall
	 * @generated
	 */
	EClass getAsynchronousServerCall();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.AsynchronousServerCall#getResultRunnable <em>Result Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AsynchronousServerCall#getResultRunnable()
	 * @see #getAsynchronousServerCall()
	 * @generated
	 */
	EReference getAsynchronousServerCall_ResultRunnable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProbabilityGroup <em>Probability Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilityGroup
	 * @generated
	 */
	EClass getProbabilityGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.ProbabilityGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilityGroup#getItems()
	 * @see #getProbabilityGroup()
	 * @generated
	 */
	EReference getProbabilityGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem <em>Probability Runnable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability Runnable Item</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem
	 * @generated
	 */
	EClass getProbabilityRunnableItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem#getProbability()
	 * @see #getProbabilityRunnableItem()
	 * @generated
	 */
	EAttribute getProbabilityRunnableItem_Probability();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem#getRunnableItem <em>Runnable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runnable Item</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem#getRunnableItem()
	 * @see #getProbabilityRunnableItem()
	 * @generated
	 */
	EReference getProbabilityRunnableItem_RunnableItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Group#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Group#isOrdered()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Ordered();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.Group#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Group#getItems()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DeviationRunnableItem <em>Deviation Runnable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviation Runnable Item</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DeviationRunnableItem
	 * @generated
	 */
	EClass getDeviationRunnableItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DeviationRunnableItem#getRunnableItem <em>Runnable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runnable Item</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DeviationRunnableItem#getRunnableItem()
	 * @see #getDeviationRunnableItem()
	 * @generated
	 */
	EReference getDeviationRunnableItem_RunnableItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DeviationRunnableItem#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DeviationRunnableItem#getDeviation()
	 * @see #getDeviationRunnableItem()
	 * @generated
	 */
	EReference getDeviationRunnableItem_Deviation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunnableCall <em>Runnable Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Call</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableCall
	 * @generated
	 */
	EClass getRunnableCall();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableCall#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableCall#getRunnable()
	 * @see #getRunnableCall()
	 * @generated
	 */
	EReference getRunnableCall_Runnable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.RunnableCall#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableCall#getStatistic()
	 * @see #getRunnableCall()
	 * @generated
	 */
	EReference getRunnableCall_Statistic();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.RunnableCall <em>Runnable Link Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable Link Int</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableCall
	 * @see #getRunnableCall()
	 * @generated
	 */
	EReference getRunnableCall_RunnableLinkInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Instructions
	 * @generated
	 */
	EClass getInstructions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Instructions#getFetchStatistic <em>Fetch Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fetch Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Instructions#getFetchStatistic()
	 * @see #getInstructions()
	 * @generated
	 */
	EReference getInstructions_FetchStatistic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.InstructionsDeviation <em>Instructions Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionsDeviation
	 * @generated
	 */
	EClass getInstructionsDeviation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.InstructionsDeviation#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deviation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionsDeviation#getDeviation()
	 * @see #getInstructionsDeviation()
	 * @generated
	 */
	EReference getInstructionsDeviation_Deviation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.InstructionsConstant <em>Instructions Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions Constant</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionsConstant
	 * @generated
	 */
	EClass getInstructionsConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.InstructionsConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionsConstant#getValue()
	 * @see #getInstructionsConstant()
	 * @generated
	 */
	EAttribute getInstructionsConstant_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CompoundType <em>Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CompoundType
	 * @generated
	 */
	EClass getCompoundType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.Struct#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Struct#getEntries()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.StructEntry <em>Struct Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Entry</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StructEntry
	 * @generated
	 */
	EClass getStructEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.StructEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StructEntry#getName()
	 * @see #getStructEntry()
	 * @generated
	 */
	EAttribute getStructEntry_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.StructEntry#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.StructEntry#getDataType()
	 * @see #getStructEntry()
	 * @generated
	 */
	EReference getStructEntry_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.Array#getNumberElements <em>Number Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Elements</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Array#getNumberElements()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_NumberElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Array#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Array#getDataType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Pointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Pointer
	 * @generated
	 */
	EClass getPointer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.Pointer#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Pointer#getDataType()
	 * @see #getPointer()
	 * @generated
	 */
	EReference getPointer_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TypeRef
	 * @generated
	 */
	EClass getTypeRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.app4mc.amalthea.model.TypeRef#getTypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Def</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TypeRef#getTypeDef()
	 * @see #getTypeRef()
	 * @generated
	 */
	EReference getTypeRef_TypeDef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataPlatformMapping <em>Data Platform Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Platform Mapping</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataPlatformMapping
	 * @generated
	 */
	EClass getDataPlatformMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataPlatformMapping#getPlatformName <em>Platform Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Name</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataPlatformMapping#getPlatformName()
	 * @see #getDataPlatformMapping()
	 * @generated
	 */
	EAttribute getDataPlatformMapping_PlatformName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.DataPlatformMapping#getPlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataPlatformMapping#getPlatformType()
	 * @see #getDataPlatformMapping()
	 * @generated
	 */
	EAttribute getDataPlatformMapping_PlatformType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.DataTypeDefinition <em>Data Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Definition</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataTypeDefinition
	 * @generated
	 */
	EClass getDataTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.DataTypeDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataTypeDefinition#getDataType()
	 * @see #getDataTypeDefinition()
	 * @generated
	 */
	EReference getDataTypeDefinition_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.BaseTypeDefinition <em>Base Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Type Definition</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BaseTypeDefinition
	 * @generated
	 */
	EClass getBaseTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.BaseTypeDefinition#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BaseTypeDefinition#getSize()
	 * @see #getBaseTypeDefinition()
	 * @generated
	 */
	EReference getBaseTypeDefinition_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.app4mc.amalthea.model.BaseTypeDefinition#getDataMapping <em>Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Mapping</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BaseTypeDefinition#getDataMapping()
	 * @see #getBaseTypeDefinition()
	 * @generated
	 */
	EReference getBaseTypeDefinition_DataMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Activation
	 * @generated
	 */
	EClass getActivation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.PeriodicActivation <em>Periodic Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicActivation
	 * @generated
	 */
	EClass getPeriodicActivation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.PeriodicActivation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicActivation#getMin()
	 * @see #getPeriodicActivation()
	 * @generated
	 */
	EReference getPeriodicActivation_Min();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.PeriodicActivation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicActivation#getMax()
	 * @see #getPeriodicActivation()
	 * @generated
	 */
	EReference getPeriodicActivation_Max();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.PeriodicActivation#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicActivation#getOffset()
	 * @see #getPeriodicActivation()
	 * @generated
	 */
	EReference getPeriodicActivation_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.PeriodicActivation#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PeriodicActivation#getDeadline()
	 * @see #getPeriodicActivation()
	 * @generated
	 */
	EReference getPeriodicActivation_Deadline();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SporadicActivation <em>Sporadic Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SporadicActivation
	 * @generated
	 */
	EClass getSporadicActivation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.SingleActivation <em>Single Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SingleActivation
	 * @generated
	 */
	EClass getSingleActivation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.SingleActivation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SingleActivation#getMin()
	 * @see #getSingleActivation()
	 * @generated
	 */
	EReference getSingleActivation_Min();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.SingleActivation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SingleActivation#getMax()
	 * @see #getSingleActivation()
	 * @generated
	 */
	EReference getSingleActivation_Max();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.CustomActivation <em>Custom Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Activation</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CustomActivation
	 * @generated
	 */
	EClass getCustomActivation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.app4mc.amalthea.model.CustomActivation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CustomActivation#getDescription()
	 * @see #getCustomActivation()
	 * @generated
	 */
	EAttribute getCustomActivation_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.LabelAccessStatistic <em>Label Access Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Access Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessStatistic
	 * @generated
	 */
	EClass getLabelAccessStatistic();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.LabelAccessStatistic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessStatistic#getValue()
	 * @see #getLabelAccessStatistic()
	 * @generated
	 */
	EReference getLabelAccessStatistic_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.LabelAccessStatistic#getCacheMisses <em>Cache Misses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache Misses</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessStatistic#getCacheMisses()
	 * @see #getLabelAccessStatistic()
	 * @generated
	 */
	EReference getLabelAccessStatistic_CacheMisses();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.InstructionFetch <em>Instruction Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Fetch</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionFetch
	 * @generated
	 */
	EClass getInstructionFetch();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionFetch#getCount()
	 * @see #getInstructionFetch()
	 * @generated
	 */
	EReference getInstructionFetch_Count();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getMisses <em>Misses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Misses</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionFetch#getMisses()
	 * @see #getInstructionFetch()
	 * @generated
	 */
	EReference getInstructionFetch_Misses();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.InstructionFetch#getCyclesPerFetch <em>Cycles Per Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cycles Per Fetch</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InstructionFetch#getCyclesPerFetch()
	 * @see #getInstructionFetch()
	 * @generated
	 */
	EReference getInstructionFetch_CyclesPerFetch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic <em>Run Entity Call Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Entity Call Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic
	 * @generated
	 */
	EClass getRunEntityCallStatistic();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistic</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic#getStatistic()
	 * @see #getRunEntityCallStatistic()
	 * @generated
	 */
	EReference getRunEntityCallStatistic_Statistic();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.FrequencyUnit <em>Frequency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyUnit
	 * @generated
	 */
	EEnum getFrequencyUnit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.DataSizeUnit <em>Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Size Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataSizeUnit
	 * @generated
	 */
	EEnum getDataSizeUnit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.DataRateUnit <em>Data Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Rate Unit</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.DataRateUnit
	 * @generated
	 */
	EEnum getDataRateUnit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.InterfaceKind <em>Interface Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Kind</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.InterfaceKind
	 * @generated
	 */
	EEnum getInterfaceKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.RunnableOrderType <em>Runnable Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Runnable Order Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableOrderType
	 * @generated
	 */
	EEnum getRunnableOrderType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.RunnableGroupingType <em>Runnable Grouping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Runnable Grouping Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableGroupingType
	 * @generated
	 */
	EEnum getRunnableGroupingType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.LimitType <em>Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Limit Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LimitType
	 * @generated
	 */
	EEnum getLimitType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.TimeMetric <em>Time Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.TimeMetric
	 * @generated
	 */
	EEnum getTimeMetric();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.CountMetric <em>Count Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Count Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CountMetric
	 * @generated
	 */
	EEnum getCountMetric();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.PercentageMetric <em>Percentage Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Percentage Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PercentageMetric
	 * @generated
	 */
	EEnum getPercentageMetric();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.CPUPercentageMetric <em>CPU Percentage Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CPU Percentage Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CPUPercentageMetric
	 * @generated
	 */
	EEnum getCPUPercentageMetric();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.FrequencyMetric <em>Frequency Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Metric</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyMetric
	 * @generated
	 */
	EEnum getFrequencyMetric();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.CoherencyDirection <em>Coherency Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coherency Direction</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.CoherencyDirection
	 * @generated
	 */
	EEnum getCoherencyDirection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.ProcessEventType <em>Process Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEventType
	 * @generated
	 */
	EEnum getProcessEventType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.RunnableEventType <em>Runnable Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Runnable Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEventType
	 * @generated
	 */
	EEnum getRunnableEventType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.LabelEventType <em>Label Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelEventType
	 * @generated
	 */
	EEnum getLabelEventType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEventType <em>Semaphore Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semaphore Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEventType
	 * @generated
	 */
	EEnum getSemaphoreEventType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QType</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.QType
	 * @generated
	 */
	EEnum getQType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.MemoryTypeEnum <em>Memory Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Type Enum</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryTypeEnum
	 * @generated
	 */
	EEnum getMemoryTypeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.BusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.BusType
	 * @generated
	 */
	EEnum getBusType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.RWType <em>RW Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RW Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.RWType
	 * @generated
	 */
	EEnum getRWType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.SchedType <em>Sched Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sched Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SchedType
	 * @generated
	 */
	EEnum getSchedType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.PinType <em>Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.PinType
	 * @generated
	 */
	EEnum getPinType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType <em>Memory Address Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Address Mapping Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType
	 * @generated
	 */
	EEnum getMemoryAddressMappingType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.ComparatorType <em>Comparator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparator Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ComparatorType
	 * @generated
	 */
	EEnum getComparatorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.ConjunctionType <em>Conjunction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conjunction Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConjunctionType
	 * @generated
	 */
	EEnum getConjunctionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.WaitEventType <em>Wait Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wait Event Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WaitEventType
	 * @generated
	 */
	EEnum getWaitEventType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.WaitingBehaviour <em>Waiting Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Waiting Behaviour</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.WaitingBehaviour
	 * @generated
	 */
	EEnum getWaitingBehaviour();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceType <em>Access Precedence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Precedence Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPrecedenceType
	 * @generated
	 */
	EEnum getAccessPrecedenceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.LabelBuffering <em>Label Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Buffering</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelBuffering
	 * @generated
	 */
	EEnum getLabelBuffering();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.LabelAccessBuffering <em>Label Access Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Access Buffering</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessBuffering
	 * @generated
	 */
	EEnum getLabelAccessBuffering();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.LabelAccessEnum <em>Label Access Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Access Enum</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessEnum
	 * @generated
	 */
	EEnum getLabelAccessEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum <em>Semaphore Access Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semaphore Access Enum</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum
	 * @generated
	 */
	EEnum getSemaphoreAccessEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.Preemption <em>Preemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Preemption</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.Preemption
	 * @generated
	 */
	EEnum getPreemption();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.app4mc.amalthea.model.ConcurrencyType <em>Concurrency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concurrency Type</em>'.
	 * @see org.eclipse.app4mc.amalthea.model.ConcurrencyType
	 * @generated
	 */
	EEnum getConcurrencyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmaltheaFactory getAmaltheaFactory();

} //AmaltheaPackage
