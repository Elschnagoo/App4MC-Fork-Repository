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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#getPortInterface <em>Port Interface</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#isDelegated <em>Delegated</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort()
 * @model
 * @generated
 */
public interface HwPort extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Bit Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Width</em>' attribute.
	 * @see #setBitWidth(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort_BitWidth()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwPort#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort_Priority()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwPort#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.PortType
	 * @see #setPortType(PortType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort_PortType()
	 * @model unique="false"
	 * @generated
	 */
	PortType getPortType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwPort#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.PortType
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(PortType value);

	/**
	 * Returns the value of the '<em><b>Port Interface</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.PortInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Interface</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.PortInterface
	 * @see #setPortInterface(PortInterface)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort_PortInterface()
	 * @model unique="false"
	 * @generated
	 */
	PortInterface getPortInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwPort#getPortInterface <em>Port Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Interface</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.PortInterface
	 * @see #getPortInterface()
	 * @generated
	 */
	void setPortInterface(PortInterface value);

	/**
	 * Returns the value of the '<em><b>Delegated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort_Delegated()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	boolean isDelegated();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of connections (HwConnection).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort_Connections()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	EList<HwConnection> getConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String computeUniqueName();

} // HwPort
