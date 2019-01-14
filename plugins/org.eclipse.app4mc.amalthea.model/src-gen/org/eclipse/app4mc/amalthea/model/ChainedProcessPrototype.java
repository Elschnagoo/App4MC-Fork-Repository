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
 * A representation of the model object '<em><b>Chained Process Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getApply <em>Apply</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChainedProcessPrototype()
 * @model
 * @generated
 */
public interface ChainedProcessPrototype extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see #setPrototype(ProcessPrototype)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChainedProcessPrototype_Prototype()
	 * @model required="true"
	 * @generated
	 */
	ProcessPrototype getPrototype();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getPrototype <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype</em>' reference.
	 * @see #getPrototype()
	 * @generated
	 */
	void setPrototype(ProcessPrototype value);

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' attribute.
	 * @see #setApply(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChainedProcessPrototype_Apply()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getApply();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getApply <em>Apply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply</em>' attribute.
	 * @see #getApply()
	 * @generated
	 */
	void setApply(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChainedProcessPrototype_Offset()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

} // ChainedProcessPrototype
