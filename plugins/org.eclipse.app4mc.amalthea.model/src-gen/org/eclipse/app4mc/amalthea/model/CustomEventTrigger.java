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
 * A representation of the model object '<em><b>Custom Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Explicitly trigger a custom event from a runnable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CustomEventTrigger#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCustomEventTrigger()
 * @model
 * @generated
 */
public interface CustomEventTrigger extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(CustomEvent)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCustomEventTrigger_Event()
	 * @model required="true"
	 * @generated
	 */
	CustomEvent getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CustomEventTrigger#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(CustomEvent value);

} // CustomEventTrigger
