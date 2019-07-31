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
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scenario#getClock <em>Clock</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scenario#getSamplingOffset <em>Sampling Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scenario#getSamplingRecurrence <em>Sampling Recurrence</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScenario_Clock()
	 * @model required="true"
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Scenario#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

	/**
	 * Returns the value of the '<em><b>Sampling Offset</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Offset</em>' attribute.
	 * @see #setSamplingOffset(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScenario_SamplingOffset()
	 * @model default="0.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.NonNegativeDouble"
	 * @generated
	 */
	double getSamplingOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Scenario#getSamplingOffset <em>Sampling Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Offset</em>' attribute.
	 * @see #getSamplingOffset()
	 * @generated
	 */
	void setSamplingOffset(double value);

	/**
	 * Returns the value of the '<em><b>Sampling Recurrence</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Recurrence</em>' attribute.
	 * @see #setSamplingRecurrence(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScenario_SamplingRecurrence()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.NonNegativeDouble"
	 * @generated
	 */
	double getSamplingRecurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Scenario#getSamplingRecurrence <em>Sampling Recurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Recurrence</em>' attribute.
	 * @see #getSamplingRecurrence()
	 * @generated
	 */
	void setSamplingRecurrence(double value);

} // Scenario
