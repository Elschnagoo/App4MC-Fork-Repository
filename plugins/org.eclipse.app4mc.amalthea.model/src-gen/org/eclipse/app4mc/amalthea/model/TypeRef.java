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
public interface TypeRef extends DataType, BaseObject {
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
