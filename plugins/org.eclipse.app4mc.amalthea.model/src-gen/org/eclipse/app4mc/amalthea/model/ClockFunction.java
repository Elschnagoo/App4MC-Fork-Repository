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
 * A representation of the model object '<em><b>Clock Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getCurveType <em>Curve Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getPeakToPeak <em>Peak To Peak</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getYOffset <em>YOffset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockFunction()
 * @model
 * @generated
 */
public interface ClockFunction extends Clock {
	/**
	 * Returns the value of the '<em><b>Curve Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.CurveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.CurveType
	 * @see #setCurveType(CurveType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockFunction_CurveType()
	 * @model unique="false"
	 * @generated
	 */
	CurveType getCurveType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getCurveType <em>Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.CurveType
	 * @see #getCurveType()
	 * @generated
	 */
	void setCurveType(CurveType value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockFunction_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Time value);

	/**
	 * Returns the value of the '<em><b>Peak To Peak</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peak To Peak</em>' containment reference.
	 * @see #setPeakToPeak(Frequency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockFunction_PeakToPeak()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Frequency getPeakToPeak();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getPeakToPeak <em>Peak To Peak</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak To Peak</em>' containment reference.
	 * @see #getPeakToPeak()
	 * @generated
	 */
	void setPeakToPeak(Frequency value);

	/**
	 * Returns the value of the '<em><b>XOffset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XOffset</em>' containment reference.
	 * @see #setXOffset(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockFunction_XOffset()
	 * @model containment="true"
	 * @generated
	 */
	Time getXOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getXOffset <em>XOffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XOffset</em>' containment reference.
	 * @see #getXOffset()
	 * @generated
	 */
	void setXOffset(Time value);

	/**
	 * Returns the value of the '<em><b>YOffset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YOffset</em>' containment reference.
	 * @see #setYOffset(Frequency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockFunction_YOffset()
	 * @model containment="true"
	 * @generated
	 */
	Frequency getYOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockFunction#getYOffset <em>YOffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YOffset</em>' containment reference.
	 * @see #getYOffset()
	 * @generated
	 */
	void setYOffset(Frequency value);

} // ClockFunction
