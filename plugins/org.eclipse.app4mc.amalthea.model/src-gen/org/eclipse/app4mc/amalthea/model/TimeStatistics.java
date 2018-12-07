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
 * A representation of the model object '<em><b>Time Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the upper bound, lower bound and mean of a value interval without defining the distribution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeStatistics#getAverage <em>Average</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeStatistics()
 * @model
 * @generated
 */
public interface TimeStatistics extends BoundedTimeDistribution {
	/**
	 * Returns the value of the '<em><b>Average</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' containment reference.
	 * @see #setAverage(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeStatistics_Average()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getAverage();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeStatistics#getAverage <em>Average</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' containment reference.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(Time value);

} // TimeStatistics
