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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Result Server Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Get the result of a previous asynchronous server call
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.GetResultServerCall#getBlockingType <em>Blocking Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGetResultServerCall()
 * @model
 * @generated
 */
public interface GetResultServerCall extends ServerCall {
	/**
	 * Returns the value of the '<em><b>Blocking Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.BlockingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.BlockingType
	 * @see #setBlockingType(BlockingType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGetResultServerCall_BlockingType()
	 * @model unique="false"
	 * @generated
	 */
	BlockingType getBlockingType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.GetResultServerCall#getBlockingType <em>Blocking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.BlockingType
	 * @see #getBlockingType()
	 * @generated
	 */
	void setBlockingType(BlockingType value);

} // GetResultServerCall
