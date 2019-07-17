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
 * A representation of the model object '<em><b>Clock Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockStep#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockStep#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockStep()
 * @model
 * @generated
 */
public interface ClockStep extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(Frequency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockStep_Frequency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Frequency getFrequency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockStep#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Frequency value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockStep_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockStep#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // ClockStep
