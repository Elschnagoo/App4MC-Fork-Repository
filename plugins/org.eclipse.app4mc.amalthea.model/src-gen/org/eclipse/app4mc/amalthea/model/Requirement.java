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
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Requirement#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Requirement#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRequirement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Requirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.Severity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.Severity
	 * @see #setSeverity(Severity)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRequirement_Severity()
	 * @model unique="false"
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Requirement#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference.
	 * @see #setLimit(RequirementLimit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRequirement_Limit()
	 * @model containment="true"
	 * @generated
	 */
	RequirementLimit getLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Requirement#getLimit <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' containment reference.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(RequirementLimit value);

} // Requirement
