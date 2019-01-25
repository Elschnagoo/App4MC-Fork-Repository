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
 * A representation of the model object '<em><b>Continuous Value Statistics</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics#getAverage <em>Average</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousValueStatistics()
 * @model
 * @generated
 */
public interface ContinuousValueStatistics extends BoundedContinuousValueDistribution {
	/**
	 * Returns the value of the '<em><b>Average</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' attribute.
	 * @see #setAverage(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousValueStatistics_Average()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getAverage();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics#getAverage <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' attribute.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(double value);

} // ContinuousValueStatistics
