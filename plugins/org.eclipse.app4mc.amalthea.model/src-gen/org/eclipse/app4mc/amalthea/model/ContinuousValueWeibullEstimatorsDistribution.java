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
 * A representation of the model object '<em><b>Continuous Value Weibull Estimators Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Weibull Distribution
 * The parameter of a Weibull distribution (kappa, lambda...) are calculated from the estimators minimum, maximum and average.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution#getAverage <em>Average</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution#getPRemainPromille <em>PRemain Promille</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousValueWeibullEstimatorsDistribution()
 * @model
 * @generated
 */
public interface ContinuousValueWeibullEstimatorsDistribution extends BoundedContinuousValueDistribution {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousValueWeibullEstimatorsDistribution_Average()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getAverage();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution#getAverage <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' attribute.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(double value);

	/**
	 * Returns the value of the '<em><b>PRemain Promille</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRemain Promille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRemain Promille</em>' attribute.
	 * @see #setPRemainPromille(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousValueWeibullEstimatorsDistribution_PRemainPromille()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getPRemainPromille();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution#getPRemainPromille <em>PRemain Promille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRemain Promille</em>' attribute.
	 * @see #getPRemainPromille()
	 * @generated
	 */
	void setPRemainPromille(double value);

} // ContinuousValueWeibullEstimatorsDistribution
