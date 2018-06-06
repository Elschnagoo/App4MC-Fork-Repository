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
 * A representation of the model object '<em><b>Process Chain Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of some process within a process chain
 * eventType: The type of the Event
 * entity: The process that fires the event (optional)
 * processingUnit: The processing unit that executes the process when the event is fired (optional)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getProcessingUnit <em>Processing Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessChainEvent()
 * @model
 * @generated
 */
public interface ProcessChainEvent extends EntityEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.ProcessEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEventType
	 * @see #setEventType(ProcessEventType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessChainEvent_EventType()
	 * @model unique="false"
	 * @generated
	 */
	ProcessEventType getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ProcessEventType
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(ProcessEventType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(ProcessChain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessChainEvent_Entity()
	 * @model
	 * @generated
	 */
	ProcessChain getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(ProcessChain value);

	/**
	 * Returns the value of the '<em><b>Processing Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Unit</em>' reference.
	 * @see #setProcessingUnit(ProcessingUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessChainEvent_ProcessingUnit()
	 * @model
	 * @generated
	 */
	ProcessingUnit getProcessingUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessChainEvent#getProcessingUnit <em>Processing Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Unit</em>' reference.
	 * @see #getProcessingUnit()
	 * @generated
	 */
	void setProcessingUnit(ProcessingUnit value);

} // ProcessChainEvent
