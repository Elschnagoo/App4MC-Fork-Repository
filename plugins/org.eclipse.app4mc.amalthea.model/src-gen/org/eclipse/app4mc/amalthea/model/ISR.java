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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Interrupt service routine
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ISR#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getISR()
 * @model
 * @generated
 */
public interface ISR extends org.eclipse.app4mc.amalthea.model.Process {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.ISRCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ISRCategory
	 * @see #setCategory(ISRCategory)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getISR_Category()
	 * @model unique="false"
	 * @generated
	 */
	ISRCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ISR#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ISRCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ISRCategory value);

} // ISR
