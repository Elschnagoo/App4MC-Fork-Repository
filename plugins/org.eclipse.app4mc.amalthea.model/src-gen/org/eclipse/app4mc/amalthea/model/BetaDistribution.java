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
 * A representation of the model object '<em><b>Beta Distribution</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.BetaDistribution#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.BetaDistribution#getBeta <em>Beta</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBetaDistribution()
 * @model
 * @generated
 */
public interface BetaDistribution<T> extends Distribution<T> {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBetaDistribution_Alpha()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getAlpha();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.BetaDistribution#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(double value);

	/**
	 * Returns the value of the '<em><b>Beta</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' attribute.
	 * @see #setBeta(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBetaDistribution_Beta()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getBeta();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.BetaDistribution#getBeta <em>Beta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta</em>' attribute.
	 * @see #getBeta()
	 * @generated
	 */
	void setBeta(double value);

} // BetaDistribution
