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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General time class to define time value and unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Time#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Time#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTime()
 * @model superTypes="org.eclipse.app4mc.amalthea.model.Quantity org.eclipse.app4mc.amalthea.model.Value org.eclipse.app4mc.amalthea.model.TimeComparable"
 * @generated
 */
public interface Time extends Quantity, Value, Comparable<Time> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTime_Value()
	 * @model default="0" unique="false"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Time#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTime_Unit()
	 * @model unique="false"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Time#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" tUnique="false"
	 * @generated
	 */
	int compareTo(Time t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Time adjustUnit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" tUnique="false"
	 * @generated
	 */
	Time add(Time t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" tUnique="false"
	 * @generated
	 */
	Time subtract(Time t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" vUnique="false"
	 * @generated
	 */
	Time multiply(long v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" vUnique="false"
	 * @generated
	 */
	Time multiply(double v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" tUnique="false"
	 * @generated
	 */
	double divide(Time t);

} // Time
