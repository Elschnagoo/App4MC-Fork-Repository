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
 * A representation of the model object '<em><b>Runnable Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a runnable
 * eventType: The type of event
 * entity: The runnable that fires the event (optional)
 * process: The process that executes the runnable (optional)
 * core: The core that processes the runnable (processes the process that executes the runnable) (optional)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getCore <em>Core</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableEvent()
 * @model
 * @generated
 */
public interface RunnableEvent extends TriggerEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.RunnableEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEventType
	 * @see #setEventType(RunnableEventType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableEvent_EventType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	RunnableEventType getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableEventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(RunnableEventType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableEvent_Entity()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(org.eclipse.app4mc.amalthea.model.Runnable value);

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableEvent_Process()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Process getProcess();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.eclipse.app4mc.amalthea.model.Process value);

	/**
	 * Returns the value of the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' reference.
	 * @see #setCore(ProcessingUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableEvent_Core()
	 * @model
	 * @generated
	 */
	ProcessingUnit getCore();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableEvent#getCore <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(ProcessingUnit value);

} // RunnableEvent
