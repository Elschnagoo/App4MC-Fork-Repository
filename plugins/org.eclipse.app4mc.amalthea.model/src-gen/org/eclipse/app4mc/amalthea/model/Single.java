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
 * A representation of the model object '<em><b>Single</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Single scheduling event at a defined time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Single#getActivation <em>Activation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSingle()
 * @model
 * @generated
 */
public interface Single extends Stimulus {
	/**
	 * Returns the value of the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' containment reference.
	 * @see #setActivation(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSingle_Activation()
	 * @model containment="true"
	 * @generated
	 */
	Time getActivation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Single#getActivation <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' containment reference.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Time value);

} // Single
