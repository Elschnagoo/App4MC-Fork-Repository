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
 * A representation of the model object '<em><b>Weibull Estimators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Weibull Distribution
 * The parameter of a weibull distribution (kappa, lambda...) are calculated from the estimators minimum, maximum and average.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.WeibullEstimators#getMean <em>Mean</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.WeibullEstimators#getPRemainPromille <em>PRemain Promille</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWeibullEstimators()
 * @model
 * @generated
 */
public interface WeibullEstimators<T> extends WeibullDistribution<T> {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWeibullEstimators_Mean()
	 * @model kind="reference" containment="true" resolveProxies="true"
	 * @generated
	 */
	T getMean();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.WeibullEstimators#getMean <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' containment reference.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(T value);

	/**
	 * Returns the value of the '<em><b>PRemain Promille</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRemain Promille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRemain Promille</em>' attribute.
	 * @see #setPRemainPromille(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWeibullEstimators_PRemainPromille()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getPRemainPromille();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.WeibullEstimators#getPRemainPromille <em>PRemain Promille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRemain Promille</em>' attribute.
	 * @see #getPRemainPromille()
	 * @generated
	 */
	void setPRemainPromille(double value);

} // WeibullEstimators
