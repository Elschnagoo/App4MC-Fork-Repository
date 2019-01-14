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
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Connector#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Connector#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends BaseObject, INamed, ITaggable {
	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' containment reference.
	 * @see #setSourcePort(QualifiedPort)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnector_SourcePort()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedPort getSourcePort();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Connector#getSourcePort <em>Source Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' containment reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(QualifiedPort value);

	/**
	 * Returns the value of the '<em><b>Target Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port</em>' containment reference.
	 * @see #setTargetPort(QualifiedPort)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnector_TargetPort()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedPort getTargetPort();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Connector#getTargetPort <em>Target Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' containment reference.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(QualifiedPort value);

} // Connector
