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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Platform Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mapping of a data type to a target platform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataPlatformMapping#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataPlatformMapping#getPlatformType <em>Platform Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataPlatformMapping()
 * @model
 * @generated
 */
public interface DataPlatformMapping extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the target platform
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform Name</em>' attribute.
	 * @see #setPlatformName(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataPlatformMapping_PlatformName()
	 * @model unique="false"
	 * @generated
	 */
	String getPlatformName();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataPlatformMapping#getPlatformName <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Name</em>' attribute.
	 * @see #getPlatformName()
	 * @generated
	 */
	void setPlatformName(String value);

	/**
	 * Returns the value of the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corresponding type of the target platform
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform Type</em>' attribute.
	 * @see #setPlatformType(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataPlatformMapping_PlatformType()
	 * @model unique="false"
	 * @generated
	 */
	String getPlatformType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataPlatformMapping#getPlatformType <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type</em>' attribute.
	 * @see #getPlatformType()
	 * @generated
	 */
	void setPlatformType(String value);

} // DataPlatformMapping
