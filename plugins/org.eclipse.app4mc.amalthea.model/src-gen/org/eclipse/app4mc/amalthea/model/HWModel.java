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
package org.eclipse.app4mc.amalthea.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getFeatureCategories <em>Feature Categories</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getStructures <em>Structures</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getDomains <em>Domains</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel()
 * @model
 * @generated
 */
public interface HWModel extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwDefinition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Feature Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwFeatureCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Categories</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_FeatureCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwFeatureCategory> getFeatureCategories();

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_Structures()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwStructure> getStructures();

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_Domains()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwDomain> getDomains();

} // HWModel
