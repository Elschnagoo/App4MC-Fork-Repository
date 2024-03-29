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
 * A representation of the model object '<em><b>Connection Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConnectionHandler#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConnectionHandler#getInternalConnections <em>Internal Connections</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnectionHandler()
 * @model
 * @generated
 */
public interface ConnectionHandler extends HwModule, HwPathElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ConnectionHandlerDefinition)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnectionHandler_Definition()
	 * @model
	 * @generated
	 */
	ConnectionHandlerDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ConnectionHandler#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ConnectionHandlerDefinition value);

	/**
	 * Returns the value of the '<em><b>Internal Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Connections</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnectionHandler_InternalConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwConnection> getInternalConnections();

} // ConnectionHandler
