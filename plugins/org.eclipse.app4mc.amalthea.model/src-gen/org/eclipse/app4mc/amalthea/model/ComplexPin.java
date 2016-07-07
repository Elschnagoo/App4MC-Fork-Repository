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
 * A representation of the model object '<em><b>Complex Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPin()
 * @model
 * @generated
 */
public interface ComplexPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.PinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.PinType
	 * @see #setType(PinType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPin_Type()
	 * @model unique="false"
	 * @generated
	 */
	PinType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.PinType
	 * @see #getType()
	 * @generated
	 */
	void setType(PinType value);

	/**
	 * Returns the value of the '<em><b>Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Address</em>' attribute.
	 * @see #setBaseAddress(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPin_BaseAddress()
	 * @model unique="false"
	 * @generated
	 */
	long getBaseAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getBaseAddress <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Address</em>' attribute.
	 * @see #getBaseAddress()
	 * @generated
	 */
	void setBaseAddress(long value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.RWType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RWType
	 * @see #setDirection(RWType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPin_Direction()
	 * @model unique="false"
	 * @generated
	 */
	RWType getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPin#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RWType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(RWType value);

} // ComplexPin
