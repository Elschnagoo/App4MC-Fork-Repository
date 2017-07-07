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
 * A representation of the model object '<em><b>Event Chain Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EventChainContainer#getEventChain <em>Event Chain</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainContainer()
 * @model
 * @generated
 */
public interface EventChainContainer extends EventChainItem {
	/**
	 * Returns the value of the '<em><b>Event Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Chain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Chain</em>' containment reference.
	 * @see #setEventChain(SubEventChain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainContainer_EventChain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubEventChain getEventChain();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EventChainContainer#getEventChain <em>Event Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Chain</em>' containment reference.
	 * @see #getEventChain()
	 * @generated
	 */
	void setEventChain(SubEventChain value);

} // EventChainContainer