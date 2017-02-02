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
 * A representation of the model object '<em><b>Float Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Object for using the elementary datatype float as generic parameter
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FloatObject#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFloatObject()
 * @model
 * @generated
 */
public interface FloatObject extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFloatObject_Value()
	 * @model default="0f" unique="false" required="true"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FloatObject#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='float _value = this.getValue();\nreturn (\"(float) \" + <%java.lang.Float%>.valueOf(_value));'"
	 * @generated
	 */
	String toString();

} // FloatObject
