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
 * A representation of the model object '<em><b>Semaphore Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a semaphore access
 * eventType: The type of event
 * entity: The accessed semaphore that fires the event (optional)
 * runnable: The runnable that accesses the semaphore (optional)
 * process: The process that accesses the semaphore (optional)
 * core: The core that processes the process/runnable that accesses the semaphore (optional)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getCore <em>Core</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreEvent()
 * @model
 * @generated
 */
public interface SemaphoreEvent extends EntityEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.SemaphoreEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEventType
	 * @see #setEventType(SemaphoreEventType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreEvent_EventType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	SemaphoreEventType getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreEventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(SemaphoreEventType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Semaphore)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreEvent_Entity()
	 * @model
	 * @generated
	 */
	Semaphore getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Semaphore value);

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreEvent_Runnable()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getRunnable <em>Runnable</em>}' reference.
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreEvent_Process()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Process getProcess();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getProcess <em>Process</em>}' reference.
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreEvent_Core()
	 * @model
	 * @generated
	 */
	ProcessingUnit getCore();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreEvent#getCore <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(ProcessingUnit value);

} // SemaphoreEvent
