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
 * A representation of the model object '<em><b>Access Precedence Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec#getOrderType <em>Order Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAccessPrecedenceSpec()
 * @model
 * @generated
 */
public interface AccessPrecedenceSpec extends GeneralPrecedence {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(Label)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAccessPrecedenceSpec_Label()
	 * @model required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPrecedenceType
	 * @see #setOrderType(AccessPrecedenceType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAccessPrecedenceSpec_OrderType()
	 * @model unique="false"
	 * @generated
	 */
	AccessPrecedenceType getOrderType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec#getOrderType <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.AccessPrecedenceType
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(AccessPrecedenceType value);

} // AccessPrecedenceSpec
