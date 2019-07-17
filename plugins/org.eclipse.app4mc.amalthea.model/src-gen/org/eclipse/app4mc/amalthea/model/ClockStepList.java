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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Step List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockStepList#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClockStepList#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockStepList()
 * @model
 * @generated
 */
public interface ClockStepList extends Clock {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ClockStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockStepList_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClockStep> getEntries();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClockStepList_Period()
	 * @model containment="true"
	 * @generated
	 */
	Time getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClockStepList#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Time value);

} // ClockStepList
