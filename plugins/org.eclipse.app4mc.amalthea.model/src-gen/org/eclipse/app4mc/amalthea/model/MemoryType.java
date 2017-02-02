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
 * A representation of the model object '<em><b>Memory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryType#getXAccessPattern <em>XAccess Pattern</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryType#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryType()
 * @model
 * @generated
 */
public interface MemoryType extends HardwareTypeDescription {
	/**
	 * Returns the value of the '<em><b>XAccess Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAccess Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAccess Pattern</em>' attribute.
	 * @see #setXAccessPattern(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryType_XAccessPattern()
	 * @model unique="false"
	 * @generated
	 */
	String getXAccessPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryType#getXAccessPattern <em>XAccess Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAccess Pattern</em>' attribute.
	 * @see #getXAccessPattern()
	 * @generated
	 */
	void setXAccessPattern(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.MemoryTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryTypeEnum
	 * @see #setType(MemoryTypeEnum)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryType_Type()
	 * @model unique="false"
	 * @generated
	 */
	MemoryTypeEnum getType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(MemoryTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(DataSize)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryType_Size()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryType#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(DataSize value);

} // MemoryType
