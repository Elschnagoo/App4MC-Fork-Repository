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
 * A representation of the model object '<em><b>Sender Receiver Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract description for sender-receiver-communication (it can be read or write)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#isBuffered <em>Buffered</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSenderReceiverCommunication()
 * @model abstract="true"
 * @generated
 */
public interface SenderReceiverCommunication extends CallGraphItem {
	/**
	 * Returns the value of the '<em><b>Buffered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffered</em>' attribute.
	 * @see #setBuffered(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSenderReceiverCommunication_Buffered()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isBuffered();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#isBuffered <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffered</em>' attribute.
	 * @see #isBuffered()
	 * @generated
	 */
	void setBuffered(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(Label)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSenderReceiverCommunication_Label()
	 * @model required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSenderReceiverCommunication_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // SenderReceiverCommunication
