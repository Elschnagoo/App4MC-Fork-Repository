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
 * A representation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.NetworkType#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.NetworkType#getBitWidth <em>Bit Width</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getNetworkType()
 * @model
 * @generated
 */
public interface NetworkType extends HardwareTypeDescription {
	/**
	 * Returns the value of the '<em><b>Sched Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.SchedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Policy</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SchedType
	 * @see #setSchedPolicy(SchedType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getNetworkType_SchedPolicy()
	 * @model unique="false"
	 * @generated
	 */
	SchedType getSchedPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.NetworkType#getSchedPolicy <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Policy</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SchedType
	 * @see #getSchedPolicy()
	 * @generated
	 */
	void setSchedPolicy(SchedType value);

	/**
	 * Returns the value of the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Width</em>' attribute.
	 * @see #setBitWidth(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getNetworkType_BitWidth()
	 * @model unique="false"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.NetworkType#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

} // NetworkType
