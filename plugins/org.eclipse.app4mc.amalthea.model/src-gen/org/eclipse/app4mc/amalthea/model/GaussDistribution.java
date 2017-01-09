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
 * A representation of the model object '<em><b>Gauss Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gauss distribution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.GaussDistribution#getSd <em>Sd</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.GaussDistribution#getMean <em>Mean</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGaussDistribution()
 * @model
 * @generated
 */
public interface GaussDistribution<T> extends Distribution<T> {
	/**
	 * Returns the value of the '<em><b>Sd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sd</em>' containment reference.
	 * @see #setSd(Object)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGaussDistribution_Sd()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	T getSd();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.GaussDistribution#getSd <em>Sd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sd</em>' containment reference.
	 * @see #getSd()
	 * @generated
	 */
	void setSd(T value);

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' containment reference.
	 * @see #setMean(Object)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGaussDistribution_Mean()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	T getMean();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.GaussDistribution#getMean <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' containment reference.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(T value);

} // GaussDistribution
