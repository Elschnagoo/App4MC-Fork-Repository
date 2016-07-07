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
 * A representation of the model object '<em><b>Qualified Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.QualifiedPort#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.QualifiedPort#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getQualifiedPort()
 * @model
 * @generated
 */
public interface QualifiedPort extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(ComponentInstance)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getQualifiedPort_Instance()
	 * @model
	 * @generated
	 */
	ComponentInstance getInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.QualifiedPort#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getQualifiedPort_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.QualifiedPort#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // QualifiedPort
