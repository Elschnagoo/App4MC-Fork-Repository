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
 * A representation of the model object '<em><b>Semaphore Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an semaphore access
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getWaitingBehaviour <em>Waiting Behaviour</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreAccess()
 * @model
 * @generated
 */
public interface SemaphoreAccess extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Semaphore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore</em>' reference.
	 * @see #setSemaphore(Semaphore)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreAccess_Semaphore()
	 * @model required="true"
	 * @generated
	 */
	Semaphore getSemaphore();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getSemaphore <em>Semaphore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' reference.
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(Semaphore value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum
	 * @see #setAccess(SemaphoreAccessEnum)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreAccess_Access()
	 * @model unique="false"
	 * @generated
	 */
	SemaphoreAccessEnum getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(SemaphoreAccessEnum value);

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphoreAccess_WaitingBehaviour()
	 * @model unique="false"
	 * @generated
	 */
	WaitingBehaviour getWaitingBehaviour();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess#getWaitingBehaviour <em>Waiting Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Behaviour</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.WaitingBehaviour
	 * @see #getWaitingBehaviour()
	 * @generated
	 */
	void setWaitingBehaviour(WaitingBehaviour value);

} // SemaphoreAccess
