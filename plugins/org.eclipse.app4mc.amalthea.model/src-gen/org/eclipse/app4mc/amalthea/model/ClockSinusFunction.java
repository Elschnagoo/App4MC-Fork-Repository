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
 * A representation of the model object '<em><b>Clock Sinus Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getShift <em>Shift</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getAmplitude <em>Amplitude</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getYOffset <em>YOffset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockSinusFunction()
 * @model
 * @generated
 */
public interface ClockSinusFunction extends Clock {
	/**
	 * Returns the value of the '<em><b>Shift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' containment reference.
	 * @see #setShift(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockSinusFunction_Shift()
	 * @model containment="true"
	 * @generated
	 */
	Time getShift();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getShift <em>Shift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' containment reference.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(Time value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockSinusFunction_Period()
	 * @model containment="true"
	 * @generated
	 */
	Time getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Time value);

	/**
	 * Returns the value of the '<em><b>Amplitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amplitude</em>' attribute.
	 * @see #setAmplitude(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockSinusFunction_Amplitude()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getAmplitude();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getAmplitude <em>Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplitude</em>' attribute.
	 * @see #getAmplitude()
	 * @generated
	 */
	void setAmplitude(double value);

	/**
	 * Returns the value of the '<em><b>YOffset</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YOffset</em>' attribute.
	 * @see #setYOffset(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockSinusFunction_YOffset()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getYOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockSinusFunction#getYOffset <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YOffset</em>' attribute.
	 * @see #getYOffset()
	 * @generated
	 */
	void setYOffset(double value);

} // ClockSinusFunction
