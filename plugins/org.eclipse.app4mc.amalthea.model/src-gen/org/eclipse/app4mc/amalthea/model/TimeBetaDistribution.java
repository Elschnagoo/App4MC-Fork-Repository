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
 * A representation of the model object '<em><b>Time Beta Distribution</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeBetaDistribution#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TimeBetaDistribution#getBeta <em>Beta</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeBetaDistribution()
 * @model
 * @generated
 */
public interface TimeBetaDistribution extends BoundedTimeDistribution {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeBetaDistribution_Alpha()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getAlpha();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeBetaDistribution#getAlpha <em>Alpha</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Beta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' attribute.
	 * @see #setBeta(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTimeBetaDistribution_Beta()
	 * @model default="1.0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveDouble" required="true"
	 * @generated
	 */
	double getBeta();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TimeBetaDistribution#getBeta <em>Beta</em>}' attribute.
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
	Time getAverage();

} // TimeBetaDistribution
