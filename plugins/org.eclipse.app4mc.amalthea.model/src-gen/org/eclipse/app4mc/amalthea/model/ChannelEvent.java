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
 * A representation of the model object '<em><b>Channel Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a channel access
 * eventType: The type of event
 * entity: The accessed channel that fires the event (optional)
 * runnable: The runnable that accesses the label (optional)
 * process: The process that accesses the label (optional)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelEvent#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelEvent#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelEvent#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelEvent()
 * @model
 * @generated
 */
public interface ChannelEvent extends TriggerEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.ChannelEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ChannelEventType
	 * @see #setEventType(ChannelEventType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelEvent_EventType()
	 * @model unique="false"
	 * @generated
	 */
	ChannelEventType getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ChannelEventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(ChannelEventType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Channel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelEvent_Entity()
	 * @model
	 * @generated
	 */
	Channel getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelEvent#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Channel value);

	/**
	 * Returns the value of the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable</em>' reference.
	 * @see #setRunnable(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelEvent_Runnable()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelEvent#getRunnable <em>Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runnable</em>' reference.
	 * @see #getRunnable()
	 * @generated
	 */
	void setRunnable(org.eclipse.app4mc.amalthea.model.Runnable value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(org.eclipse.app4mc.amalthea.model.Process)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelEvent_Process()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Process getProcess();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelEvent#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.eclipse.app4mc.amalthea.model.Process value);

} // ChannelEvent
