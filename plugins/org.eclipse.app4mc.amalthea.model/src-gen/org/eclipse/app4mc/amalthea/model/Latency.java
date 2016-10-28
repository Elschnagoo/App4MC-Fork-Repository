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
 * A representation of the model object '<em><b>Latency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Latency#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Latency#getTransferSize <em>Transfer Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Latency#getQuartz <em>Quartz</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLatency()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Latency extends LatencyAccessPathElement {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.RWType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RWType
	 * @see #setAccessType(RWType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLatency_AccessType()
	 * @model unique="false"
	 * @generated
	 */
	RWType getAccessType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Latency#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RWType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(RWType value);

	/**
	 * Returns the value of the '<em><b>Transfer Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Size</em>' attribute.
	 * @see #setTransferSize(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLatency_TransferSize()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getTransferSize();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Latency#getTransferSize <em>Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Size</em>' attribute.
	 * @see #getTransferSize()
	 * @generated
	 */
	void setTransferSize(long value);

	/**
	 * Returns the value of the '<em><b>Quartz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quartz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quartz</em>' reference.
	 * @see #setQuartz(Quartz)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLatency_Quartz()
	 * @model required="true"
	 * @generated
	 */
	Quartz getQuartz();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Latency#getQuartz <em>Quartz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quartz</em>' reference.
	 * @see #getQuartz()
	 * @generated
	 */
	void setQuartz(Quartz value);

} // Latency
