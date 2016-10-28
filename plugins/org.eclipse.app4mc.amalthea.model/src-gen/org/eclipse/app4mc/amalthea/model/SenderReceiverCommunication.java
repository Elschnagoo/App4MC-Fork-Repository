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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sender Receiver Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A abstract description for sender-receiver-communication (it can be read or write)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#isBuffered <em>Buffered</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SenderReceiverCommunication#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSenderReceiverCommunication()
 * @model abstract="true"
 * @generated
 */
public interface SenderReceiverCommunication extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Buffered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // SenderReceiverCommunication
