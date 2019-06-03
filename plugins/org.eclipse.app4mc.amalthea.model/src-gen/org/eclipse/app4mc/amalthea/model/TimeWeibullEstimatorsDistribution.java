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
 * A representation of the model object '<em><b>Time Weibull Estimators Distribution</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution#getAverage <em>Average</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution#getPRemainPromille <em>PRemain Promille</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeWeibullEstimatorsDistribution()
 * @model
 * @generated
 */
public interface TimeWeibullEstimatorsDistribution extends BoundedTimeDistribution {
	/**
	 * Returns the value of the '<em><b>Average</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' containment reference.
	 * @see #setAverage(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeWeibullEstimatorsDistribution_Average()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getAverage();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution#getAverage <em>Average</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' containment reference.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(Time value);

	/**
	 * Returns the value of the '<em><b>PRemain Promille</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRemain Promille</em>' attribute.
	 * @see #setPRemainPromille(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeWeibullEstimatorsDistribution_PRemainPromille()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getPRemainPromille();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution#getPRemainPromille <em>PRemain Promille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRemain Promille</em>' attribute.
	 * @see #getPRemainPromille()
	 * @generated
	 */
	void setPRemainPromille(double value);

} // TimeWeibullEstimatorsDistribution
