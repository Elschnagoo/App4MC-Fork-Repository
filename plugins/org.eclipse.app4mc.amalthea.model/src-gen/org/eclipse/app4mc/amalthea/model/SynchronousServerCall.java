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
 * A representation of the model object '<em><b>Synchronous Server Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A synchronous server call
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SynchronousServerCall#getWaitingBehaviour <em>Waiting Behaviour</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSynchronousServerCall()
 * @model
 * @generated
 */
public interface SynchronousServerCall extends ServerCall {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSynchronousServerCall_WaitingBehaviour()
	 * @model unique="false"
	 * @generated
	 */
	WaitingBehaviour getWaitingBehaviour();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SynchronousServerCall#getWaitingBehaviour <em>Waiting Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Behaviour</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.WaitingBehaviour
	 * @see #getWaitingBehaviour()
	 * @generated
	 */
	void setWaitingBehaviour(WaitingBehaviour value);

} // SynchronousServerCall
