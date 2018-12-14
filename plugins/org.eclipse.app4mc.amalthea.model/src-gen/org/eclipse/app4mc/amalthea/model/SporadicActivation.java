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
 * A representation of the model object '<em><b>Sporadic Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SporadicActivation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SporadicActivation#getActivationDeviation <em>Activation Deviation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSporadicActivation()
 * @model
 * @generated
 */
public interface SporadicActivation extends Activation {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSporadicActivation_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SporadicActivation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Activation Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Deviation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Deviation</em>' containment reference.
	 * @see #setActivationDeviation(TimeDeviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSporadicActivation_ActivationDeviation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeDeviation getActivationDeviation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SporadicActivation#getActivationDeviation <em>Activation Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Deviation</em>' containment reference.
	 * @see #getActivationDeviation()
	 * @generated
	 */
	void setActivationDeviation(TimeDeviation value);

} // SporadicActivation
