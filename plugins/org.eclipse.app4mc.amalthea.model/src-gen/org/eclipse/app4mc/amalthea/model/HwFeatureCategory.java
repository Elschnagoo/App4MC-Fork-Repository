/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Hw Feature Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwFeatureCategory#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwFeatureCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwFeatureCategory#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwFeatureCategory()
 * @model
 * @generated
 */
public interface HwFeatureCategory extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Feature Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.HwFeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.HwFeatureType
	 * @see #setFeatureType(HwFeatureType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwFeatureCategory_FeatureType()
	 * @model unique="false"
	 * @generated
	 */
	HwFeatureType getFeatureType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwFeatureCategory#getFeatureType <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.HwFeatureType
	 * @see #getFeatureType()
	 * @generated
	 */
	void setFeatureType(HwFeatureType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwFeatureCategory_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwFeatureCategory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwFeature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.HwFeature#getContainingCategory <em>Containing Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwFeatureCategory_Features()
	 * @see org.eclipse.app4mc.amalthea.model.HwFeature#getContainingCategory
	 * @model opposite="containingCategory" containment="true"
	 * @generated
	 */
	EList<HwFeature> getFeatures();

} // HwFeatureCategory
