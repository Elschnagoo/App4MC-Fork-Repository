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
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TypeRef#getTypeDef <em>Type Def</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTypeRef()
 * @model
 * @generated
 */
public interface TypeRef extends BaseObject, DataType {
	/**
	 * Returns the value of the '<em><b>Type Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Def</em>' reference.
	 * @see #setTypeDef(TypeDefinition)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTypeRef_TypeDef()
	 * @model
	 * @generated
	 */
	TypeDefinition getTypeDef();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TypeRef#getTypeDef <em>Type Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Def</em>' reference.
	 * @see #getTypeDef()
	 * @generated
	 */
	void setTypeDef(TypeDefinition value);

} // TypeRef
