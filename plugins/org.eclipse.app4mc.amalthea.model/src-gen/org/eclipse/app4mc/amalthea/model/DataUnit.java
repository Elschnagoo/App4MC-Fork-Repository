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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representing size of data in bits / bytes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataUnit#getNumberBits <em>Number Bits</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataUnit()
 * @model
 * @generated
 */
public interface DataUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of the data in bit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Bits</em>' attribute.
	 * @see #setNumberBits(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataUnit_NumberBits()
	 * @model unique="false"
	 * @generated
	 */
	int getNumberBits();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataUnit#getNumberBits <em>Number Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Bits</em>' attribute.
	 * @see #getNumberBits()
	 * @generated
	 */
	void setNumberBits(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int _numberBits = this.getNumberBits();\nreturn (<%java.lang.Integer%>.valueOf(_numberBits) + \" bit\");'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenient method to retrieve the size in Bytes
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int _numberBits = this.getNumberBits();\nint _divide = (_numberBits / 8);\ndouble _ceil = <%java.lang.Math%>.ceil(_divide);\nreturn <%java.lang.Double%>.valueOf(_ceil).intValue();'"
	 * @generated
	 */
	int getNumberBytes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenient method to set the size in Bytes.
	 * <!-- end-model-doc -->
	 * @model numberBytesUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setNumberBits((numberBytes * 8));'"
	 * @generated
	 */
	void setNumberBytes(int numberBytes);

} // DataUnit
