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
 * A representation of the model object '<em><b>Connection Handler Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition#getReadLatency <em>Read Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition#getWriteLatency <em>Write Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition#getDataRate <em>Data Rate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnectionHandlerDefinition()
 * @model
 * @generated
 */
public interface ConnectionHandlerDefinition extends HwDefinition {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.SchedPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SchedPolicy
	 * @see #setPolicy(SchedPolicy)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnectionHandlerDefinition_Policy()
	 * @model unique="false"
	 * @generated
	 */
	SchedPolicy getPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SchedPolicy
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(SchedPolicy value);

	/**
	 * Returns the value of the '<em><b>Read Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Latency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Latency</em>' containment reference.
	 * @see #setReadLatency(HwLatency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnectionHandlerDefinition_ReadLatency()
	 * @model containment="true"
	 * @generated
	 */
	HwLatency getReadLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition#getReadLatency <em>Read Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Latency</em>' containment reference.
	 * @see #getReadLatency()
	 * @generated
	 */
	void setReadLatency(HwLatency value);

	/**
	 * Returns the value of the '<em><b>Write Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Latency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Latency</em>' containment reference.
	 * @see #setWriteLatency(HwLatency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnectionHandlerDefinition_WriteLatency()
	 * @model containment="true"
	 * @generated
	 */
	HwLatency getWriteLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition#getWriteLatency <em>Write Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Latency</em>' containment reference.
	 * @see #getWriteLatency()
	 * @generated
	 */
	void setWriteLatency(HwLatency value);

	/**
	 * Returns the value of the '<em><b>Data Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Rate</em>' containment reference.
	 * @see #setDataRate(DataRate)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConnectionHandlerDefinition_DataRate()
	 * @model containment="true"
	 * @generated
	 */
	DataRate getDataRate();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition#getDataRate <em>Data Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Rate</em>' containment reference.
	 * @see #getDataRate()
	 * @generated
	 */
	void setDataRate(DataRate value);

} // ConnectionHandlerDefinition