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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sender Receiver Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The write operation of the sender of the sender-receiver-communication
 * It contains the runnables that have the corresponding SenderReceiverRead
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SenderReceiverWrite#getNotifiedRunnables <em>Notified Runnables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSenderReceiverWrite()
 * @model
 * @generated
 */
public interface SenderReceiverWrite extends SenderReceiverCommunication {
	/**
	 * Returns the value of the '<em><b>Notified Runnables</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notified Runnables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notified Runnables</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSenderReceiverWrite_NotifiedRunnables()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.app4mc.amalthea.model.Runnable> getNotifiedRunnables();

} // SenderReceiverWrite
