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
 * A representation of the model object '<em><b>Event Chain Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EventChainMeasurement#getEventChain <em>Event Chain</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainMeasurement()
 * @model
 * @generated
 */
public interface EventChainMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Event Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Chain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Chain</em>' reference.
	 * @see #setEventChain(EventChain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainMeasurement_EventChain()
	 * @model required="true"
	 * @generated
	 */
	EventChain getEventChain();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EventChainMeasurement#getEventChain <em>Event Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Chain</em>' reference.
	 * @see #getEventChain()
	 * @generated
	 */
	void setEventChain(EventChain value);

} // EventChainMeasurement
