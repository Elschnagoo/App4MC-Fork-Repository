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
 * A representation of the model object '<em><b>Time Weibull Parameters Distribution</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeWeibullParametersDistribution#getKappa <em>Kappa</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeWeibullParametersDistribution#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeWeibullParametersDistribution()
 * @model
 * @generated
 */
public interface TimeWeibullParametersDistribution extends TimeWeibullDistribution {
	/**
	 * Returns the value of the '<em><b>Kappa</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kappa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kappa</em>' attribute.
	 * @see #setKappa(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeWeibullParametersDistribution_Kappa()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getKappa();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeWeibullParametersDistribution#getKappa <em>Kappa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kappa</em>' attribute.
	 * @see #getKappa()
	 * @generated
	 */
	void setKappa(double value);

	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' attribute.
	 * @see #setLambda(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeWeibullParametersDistribution_Lambda()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getLambda();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeWeibullParametersDistribution#getLambda <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' attribute.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Time getAverage();

} // TimeWeibullParametersDistribution
