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
 * A representation of the model object '<em><b>Complex Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#isMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getAddressRange <em>Address Range</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getWriteCycles <em>Write Cycles</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getReadCycles <em>Read Cycles</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getSchedValue <em>Sched Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort()
 * @model
 * @generated
 */
public interface ComplexPort extends HwPort {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_Network()
	 * @model required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' attribute.
	 * @see #setMaster(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_Master()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMaster();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#isMaster <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' attribute.
	 * @see #isMaster()
	 * @generated
	 */
	void setMaster(boolean value);

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_BitWidth()
	 * @model unique="false"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

	/**
	 * Returns the value of the '<em><b>Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Address</em>' attribute.
	 * @see #setBaseAddress(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_BaseAddress()
	 * @model unique="false"
	 * @generated
	 */
	long getBaseAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getBaseAddress <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Address</em>' attribute.
	 * @see #getBaseAddress()
	 * @generated
	 */
	void setBaseAddress(long value);

	/**
	 * Returns the value of the '<em><b>Address Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Range</em>' attribute.
	 * @see #setAddressRange(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_AddressRange()
	 * @model unique="false"
	 * @generated
	 */
	long getAddressRange();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getAddressRange <em>Address Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Range</em>' attribute.
	 * @see #getAddressRange()
	 * @generated
	 */
	void setAddressRange(long value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.RWType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RWType
	 * @see #setDirection(RWType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_Direction()
	 * @model unique="false"
	 * @generated
	 */
	RWType getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RWType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(RWType value);

	/**
	 * Returns the value of the '<em><b>Write Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Cycles</em>' attribute.
	 * @see #setWriteCycles(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_WriteCycles()
	 * @model unique="false"
	 * @generated
	 */
	int getWriteCycles();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getWriteCycles <em>Write Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Cycles</em>' attribute.
	 * @see #getWriteCycles()
	 * @generated
	 */
	void setWriteCycles(int value);

	/**
	 * Returns the value of the '<em><b>Read Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Cycles</em>' attribute.
	 * @see #setReadCycles(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_ReadCycles()
	 * @model unique="false"
	 * @generated
	 */
	int getReadCycles();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getReadCycles <em>Read Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Cycles</em>' attribute.
	 * @see #getReadCycles()
	 * @generated
	 */
	void setReadCycles(int value);

	/**
	 * Returns the value of the '<em><b>Sched Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Value</em>' attribute.
	 * @see #setSchedValue(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexPort_SchedValue()
	 * @model unique="false"
	 * @generated
	 */
	int getSchedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexPort#getSchedValue <em>Sched Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Value</em>' attribute.
	 * @see #getSchedValue()
	 * @generated
	 */
	void setSchedValue(int value);

} // ComplexPort
