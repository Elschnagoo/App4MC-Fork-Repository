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
 * A representation of the model object '<em><b>Wait Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Let the process wait for a combination of events defined by eventMask
 * maskType defines if the events in eventMask are linked by a AND or OR
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getEventMask <em>Event Mask</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getMaskType <em>Mask Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getWaitingBehaviour <em>Waiting Behaviour</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWaitEvent()
 * @model
 * @generated
 */
public interface WaitEvent extends CallSequenceItem {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWaitEvent_EventMask()
	 * @model containment="true"
	 * @generated
	 */
	EventMask getEventMask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getEventMask <em>Event Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Mask</em>' containment reference.
	 * @see #getEventMask()
	 * @generated
	 */
	void setEventMask(EventMask value);

	/**
	 * Returns the value of the '<em><b>Mask Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.WaitEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.WaitEventType
	 * @see #setMaskType(WaitEventType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWaitEvent_MaskType()
	 * @model unique="false"
	 * @generated
	 */
	WaitEventType getMaskType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getMaskType <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.WaitEventType
	 * @see #getMaskType()
	 * @generated
	 */
	void setMaskType(WaitEventType value);

	/**
	 * Returns the value of the '<em><b>Waiting Behaviour</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.WaitingBehaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waiting Behaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiting Behaviour</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.WaitingBehaviour
	 * @see #setWaitingBehaviour(WaitingBehaviour)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getWaitEvent_WaitingBehaviour()
	 * @model unique="false"
	 * @generated
	 */
	WaitingBehaviour getWaitingBehaviour();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.WaitEvent#getWaitingBehaviour <em>Waiting Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Behaviour</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.WaitingBehaviour
	 * @see #getWaitingBehaviour()
	 * @generated
	 */
	void setWaitingBehaviour(WaitingBehaviour value);

} // WaitEvent
