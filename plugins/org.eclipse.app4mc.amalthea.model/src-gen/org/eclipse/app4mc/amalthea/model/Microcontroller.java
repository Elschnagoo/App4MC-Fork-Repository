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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Microcontroller#getMicrocontrollerType <em>Microcontroller Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Microcontroller#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMicrocontroller()
 * @model
 * @generated
 */
public interface Microcontroller extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Microcontroller Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microcontroller Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontroller Type</em>' reference.
	 * @see #setMicrocontrollerType(MicrocontrollerType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMicrocontroller_MicrocontrollerType()
	 * @model
	 * @generated
	 */
	MicrocontrollerType getMicrocontrollerType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Microcontroller#getMicrocontrollerType <em>Microcontroller Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microcontroller Type</em>' reference.
	 * @see #getMicrocontrollerType()
	 * @generated
	 */
	void setMicrocontrollerType(MicrocontrollerType value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Core}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMicrocontroller_Cores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Core> getCores();

} // Microcontroller
