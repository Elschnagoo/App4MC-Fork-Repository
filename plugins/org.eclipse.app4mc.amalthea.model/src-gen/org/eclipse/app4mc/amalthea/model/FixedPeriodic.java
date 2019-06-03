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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Periodic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stimulus that is triggered periodically.
 * offset: Time of first occurrence
 * recurrence: Time between following occurrences
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FixedPeriodic#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FixedPeriodic#getRecurrence <em>Recurrence</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFixedPeriodic()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FixedPeriodic extends EObject {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFixedPeriodic_Offset()
	 * @model containment="true"
	 * @generated
	 */
	Time getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FixedPeriodic#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Time value);

	/**
	 * Returns the value of the '<em><b>Recurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence</em>' containment reference.
	 * @see #setRecurrence(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFixedPeriodic_Recurrence()
	 * @model containment="true"
	 * @generated
	 */
	Time getRecurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FixedPeriodic#getRecurrence <em>Recurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence</em>' containment reference.
	 * @see #getRecurrence()
	 * @generated
	 */
	void setRecurrence(Time value);

} // FixedPeriodic
