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
 * A representation of the model object '<em><b>Time Gauss Distribution</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeGaussDistribution#getMean <em>Mean</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeGaussDistribution#getSd <em>Sd</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeGaussDistribution()
 * @model
 * @generated
 */
public interface TimeGaussDistribution extends TruncatedTimeDistribution {
	/**
	 * Returns the value of the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' containment reference.
	 * @see #setMean(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeGaussDistribution_Mean()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getMean();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeGaussDistribution#getMean <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' containment reference.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(Time value);

	/**
	 * Returns the value of the '<em><b>Sd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sd</em>' containment reference.
	 * @see #setSd(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeGaussDistribution_Sd()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getSd();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeGaussDistribution#getSd <em>Sd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sd</em>' containment reference.
	 * @see #getSd()
	 * @generated
	 */
	void setSd(Time value);

} // TimeGaussDistribution
