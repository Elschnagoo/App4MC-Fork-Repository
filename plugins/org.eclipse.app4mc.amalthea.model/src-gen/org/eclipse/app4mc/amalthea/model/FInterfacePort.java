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
 * A representation of the model object '<em><b>FInterface Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FInterfacePort#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FInterfacePort#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFInterfacePort()
 * @model
 * @generated
 */
public interface FInterfacePort extends Port {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.InterfaceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.InterfaceKind
	 * @see #setKind(InterfaceKind)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFInterfacePort_Kind()
	 * @model unique="false"
	 * @generated
	 */
	InterfaceKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FInterfacePort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.InterfaceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(InterfaceKind value);

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFInterfacePort_InterfaceName()
	 * @model unique="false"
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FInterfacePort#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

} // FInterfacePort
