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
 * A representation of the model object '<em><b>Discrete Value Beta Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beta distribution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution#getBeta <em>Beta</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDiscreteValueBetaDistribution()
 * @model
 * @generated
 */
public interface DiscreteValueBetaDistribution extends BoundedDiscreteValueDistribution {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDiscreteValueBetaDistribution_Alpha()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getAlpha();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(double value);

	/**
	 * Returns the value of the '<em><b>Beta</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' attribute.
	 * @see #setBeta(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDiscreteValueBetaDistribution_Beta()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getBeta();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution#getBeta <em>Beta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta</em>' attribute.
	 * @see #getBeta()
	 * @generated
	 */
	void setBeta(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Double getAverage();

} // DiscreteValueBetaDistribution
