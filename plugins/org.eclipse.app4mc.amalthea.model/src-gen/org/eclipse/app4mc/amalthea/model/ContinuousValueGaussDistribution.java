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
 * A representation of the model object '<em><b>Continuous Value Gauss Distribution</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution#getMean <em>Mean</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution#getSd <em>Sd</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousValueGaussDistribution()
 * @model
 * @generated
 */
public interface ContinuousValueGaussDistribution extends TruncatedContinuousValueDistribution {
	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #setMean(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousValueGaussDistribution_Mean()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getMean();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(double value);

	/**
	 * Returns the value of the '<em><b>Sd</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sd</em>' attribute.
	 * @see #setSd(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousValueGaussDistribution_Sd()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getSd();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution#getSd <em>Sd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sd</em>' attribute.
	 * @see #getSd()
	 * @generated
	 */
	void setSd(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	double getAverage();

} // ContinuousValueGaussDistribution
