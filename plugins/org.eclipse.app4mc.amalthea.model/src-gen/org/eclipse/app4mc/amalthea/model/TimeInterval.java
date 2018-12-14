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
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the upper and lower bounds of a value interval without defining the distribution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeInterval#getSamplingType <em>Sampling Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends BoundedTimeDistribution {
	/**
	 * Returns the value of the '<em><b>Sampling Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.SamplingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SamplingType
	 * @see #setSamplingType(SamplingType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeInterval_SamplingType()
	 * @model unique="false"
	 * @generated
	 */
	SamplingType getSamplingType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeInterval#getSamplingType <em>Sampling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SamplingType
	 * @see #getSamplingType()
	 * @generated
	 */
	void setSamplingType(SamplingType value);

} // TimeInterval