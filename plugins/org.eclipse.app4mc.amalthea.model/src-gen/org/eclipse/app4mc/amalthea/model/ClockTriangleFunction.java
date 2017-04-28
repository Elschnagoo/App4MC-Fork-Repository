/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Clock Triangle Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getShift <em>Shift</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockTriangleFunction()
 * @model
 * @generated
 */
public interface ClockTriangleFunction extends Clock {
	/**
	 * Returns the value of the '<em><b>Shift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' containment reference.
	 * @see #setShift(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockTriangleFunction_Shift()
	 * @model containment="true"
	 * @generated
	 */
	Time getShift();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getShift <em>Shift</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockTriangleFunction_Period()
	 * @model containment="true"
	 * @generated
	 */
	Time getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Time value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockTriangleFunction_Max()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockTriangleFunction_Min()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockTriangleFunction#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

} // ClockTriangleFunction
