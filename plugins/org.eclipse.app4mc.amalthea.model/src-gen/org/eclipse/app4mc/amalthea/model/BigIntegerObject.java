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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Integer Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Object for using the elementary datatype String as generic parameter
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.BigIntegerObject#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBigIntegerObject()
 * @model
 * @generated
 */
public interface BigIntegerObject extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getBigIntegerObject_Value()
	 * @model default="0" unique="false" required="true"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.BigIntegerObject#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.math.BigInteger%> _value = this.getValue();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_value, null);\nif (_equals)\n{\n\treturn \"(BigInteger) null\";\n}\nelse\n{\n\t<%java.math.BigInteger%> _value_1 = this.getValue();\n\t<%java.lang.String%> _plus = (\"(BigInteger) \\\"\" + _value_1);\n\treturn (_plus + \"\\\"\");\n}'"
	 * @generated
	 */
	String toString();

} // BigIntegerObject
