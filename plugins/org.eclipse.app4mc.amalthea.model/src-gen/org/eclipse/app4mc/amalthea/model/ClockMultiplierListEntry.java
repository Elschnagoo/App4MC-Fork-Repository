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
 * A representation of the model object '<em><b>Clock Multiplier List Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A timestamp-value par for ClockMultiplierList
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockMultiplierListEntry()
 * @model
 * @generated
 */
public interface ClockMultiplierListEntry extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see #setMultiplier(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockMultiplierListEntry_Multiplier()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getMultiplier();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(double value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockMultiplierListEntry_Time()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // ClockMultiplierListEntry
