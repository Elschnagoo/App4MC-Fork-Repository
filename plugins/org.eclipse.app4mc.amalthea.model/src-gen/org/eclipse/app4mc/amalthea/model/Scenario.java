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
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scenario#getRecurrence <em>Recurrence</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scenario#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Recurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence</em>' containment reference.
	 * @see #setRecurrence(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScenario_Recurrence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getRecurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Scenario#getRecurrence <em>Recurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence</em>' containment reference.
	 * @see #getRecurrence()
	 * @generated
	 */
	void setRecurrence(Time value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScenario_Clock()
	 * @model
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

} // Scenario
