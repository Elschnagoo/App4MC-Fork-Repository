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
 * A representation of the model object '<em><b>Set Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sets the events of eventMask
 * These events can be set for a specific process, if there is no process, is is global (for all processes)
 * If there is a process, it is possible to set the event for a specific process instance that is currently activated
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SetEvent#getEventMask <em>Event Mask</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SetEvent#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSetEvent()
 * @model
 * @generated
 */
public interface SetEvent extends CallSequenceItem {
	/**
	 * Returns the value of the '<em><b>Event Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Mask</em>' containment reference.
	 * @see #setEventMask(EventMask)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSetEvent_EventMask()
	 * @model containment="true"
	 * @generated
	 */
	EventMask getEventMask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SetEvent#getEventMask <em>Event Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Mask</em>' containment reference.
	 * @see #getEventMask()
	 * @generated
	 */
	void setEventMask(EventMask value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(org.eclipse.app4mc.amalthea.model.Process)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSetEvent_Process()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Process getProcess();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SetEvent#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.eclipse.app4mc.amalthea.model.Process value);

} // SetEvent
