/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Weibull Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Weibull Distribution
 * Starts from zero, upperBound limits maximum value of result
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.WeibullParameters#getKappa <em>Kappa</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.WeibullParameters#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWeibullParameters()
 * @model
 * @generated
 */
public interface WeibullParameters<T> extends WeibullDistribution<T> {
	/**
	 * Returns the value of the '<em><b>Kappa</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kappa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kappa</em>' attribute.
	 * @see #setKappa(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWeibullParameters_Kappa()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getKappa();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.WeibullParameters#getKappa <em>Kappa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kappa</em>' attribute.
	 * @see #getKappa()
	 * @generated
	 */
	void setKappa(double value);

	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' attribute.
	 * @see #setLambda(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWeibullParameters_Lambda()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getLambda();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.WeibullParameters#getLambda <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' attribute.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(double value);

} // WeibullParameters
