/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Boundaries</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Boundaries#getSamplingType <em>Sampling Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBoundaries()
 * @model
 * @generated
 */
public interface Boundaries<T> extends Distribution<T> {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBoundaries_SamplingType()
	 * @model unique="false"
	 * @generated
	 */
	SamplingType getSamplingType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Boundaries#getSamplingType <em>Sampling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SamplingType
	 * @see #getSamplingType()
	 * @generated
	 */
	void setSamplingType(SamplingType value);

} // Boundaries
