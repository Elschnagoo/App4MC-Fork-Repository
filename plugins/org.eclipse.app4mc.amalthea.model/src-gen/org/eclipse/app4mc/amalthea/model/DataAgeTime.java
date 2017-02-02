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
 * A representation of the model object '<em><b>Data Age Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataAgeTime#getMinimumTime <em>Minimum Time</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataAgeTime#getMaximumTime <em>Maximum Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeTime()
 * @model
 * @generated
 */
public interface DataAgeTime extends DataAge {
	/**
	 * Returns the value of the '<em><b>Minimum Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Time</em>' containment reference.
	 * @see #setMinimumTime(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeTime_MinimumTime()
	 * @model containment="true"
	 * @generated
	 */
	Time getMinimumTime();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataAgeTime#getMinimumTime <em>Minimum Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Time</em>' containment reference.
	 * @see #getMinimumTime()
	 * @generated
	 */
	void setMinimumTime(Time value);

	/**
	 * Returns the value of the '<em><b>Maximum Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Time</em>' containment reference.
	 * @see #setMaximumTime(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeTime_MaximumTime()
	 * @model containment="true"
	 * @generated
	 */
	Time getMaximumTime();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataAgeTime#getMaximumTime <em>Maximum Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Time</em>' containment reference.
	 * @see #getMaximumTime()
	 * @generated
	 */
	void setMaximumTime(Time value);

} // DataAgeTime
