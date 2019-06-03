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
 * A representation of the model object '<em><b>Channel Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelAccess#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelAccess#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelAccess#getTransmissionPolicy <em>Transmission Policy</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelAccess()
 * @model abstract="true"
 * @generated
 */
public interface ChannelAccess extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Channel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelAccess_Data()
	 * @model required="true"
	 * @generated
	 */
	Channel getData();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelAccess#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Channel value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute.
	 * @see #setElements(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelAccess_Elements()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getElements();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelAccess#getElements <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' attribute.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(int value);

	/**
	 * Returns the value of the '<em><b>Transmission Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Policy</em>' containment reference.
	 * @see #setTransmissionPolicy(TransmissionPolicy)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelAccess_TransmissionPolicy()
	 * @model containment="true"
	 * @generated
	 */
	TransmissionPolicy getTransmissionPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelAccess#getTransmissionPolicy <em>Transmission Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Policy</em>' containment reference.
	 * @see #getTransmissionPolicy()
	 * @generated
	 */
	void setTransmissionPolicy(TransmissionPolicy value);

} // ChannelAccess
