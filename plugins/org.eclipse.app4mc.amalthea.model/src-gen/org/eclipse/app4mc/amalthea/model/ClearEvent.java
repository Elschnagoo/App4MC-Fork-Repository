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
 * A representation of the model object '<em><b>Clear Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Clears the events of eventMask
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ClearEvent#getEventMask <em>Event Mask</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClearEvent()
 * @model
 * @generated
 */
public interface ClearEvent extends CallSequenceItem {
	/**
	 * Returns the value of the '<em><b>Event Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Mask</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Mask</em>' containment reference.
	 * @see #setEventMask(EventMask)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getClearEvent_EventMask()
	 * @model containment="true"
	 * @generated
	 */
	EventMask getEventMask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ClearEvent#getEventMask <em>Event Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Mask</em>' containment reference.
	 * @see #getEventMask()
	 * @generated
	 */
	void setEventMask(EventMask value);

} // ClearEvent
