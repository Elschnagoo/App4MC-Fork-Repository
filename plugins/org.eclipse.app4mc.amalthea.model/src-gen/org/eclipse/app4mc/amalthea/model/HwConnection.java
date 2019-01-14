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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwConnection#getReadLatency <em>Read Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwConnection#getWriteLatency <em>Write Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwConnection#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwConnection#getPort1 <em>Port1</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwConnection#getPort2 <em>Port2</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwConnection#isInternal <em>Internal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwConnection()
 * @model
 * @generated
 */
public interface HwConnection extends ReferableBaseObject, HwPathElement, ITaggable {
	/**
	 * Returns the value of the '<em><b>Read Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Read latency [cycles]</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Latency</em>' containment reference.
	 * @see #setReadLatency(IDiscreteValueDeviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwConnection_ReadLatency()
	 * @model containment="true"
	 * @generated
	 */
	IDiscreteValueDeviation getReadLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwConnection#getReadLatency <em>Read Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Latency</em>' containment reference.
	 * @see #getReadLatency()
	 * @generated
	 */
	void setReadLatency(IDiscreteValueDeviation value);

	/**
	 * Returns the value of the '<em><b>Write Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Write latency [cycles]</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Latency</em>' containment reference.
	 * @see #setWriteLatency(IDiscreteValueDeviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwConnection_WriteLatency()
	 * @model containment="true"
	 * @generated
	 */
	IDiscreteValueDeviation getWriteLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwConnection#getWriteLatency <em>Write Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Latency</em>' containment reference.
	 * @see #getWriteLatency()
	 * @generated
	 */
	void setWriteLatency(IDiscreteValueDeviation value);

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwConnection_DataRate()
	 * @model containment="true"
	 * @generated
	 */
	DataRate getDataRate();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwConnection#getDataRate <em>Data Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Rate</em>' containment reference.
	 * @see #getDataRate()
	 * @generated
	 */
	void setDataRate(DataRate value);

	/**
	 * Returns the value of the '<em><b>Port1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port1</em>' reference.
	 * @see #setPort1(HwPort)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwConnection_Port1()
	 * @model
	 * @generated
	 */
	HwPort getPort1();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwConnection#getPort1 <em>Port1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port1</em>' reference.
	 * @see #getPort1()
	 * @generated
	 */
	void setPort1(HwPort value);

	/**
	 * Returns the value of the '<em><b>Port2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port2</em>' reference.
	 * @see #setPort2(HwPort)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwConnection_Port2()
	 * @model
	 * @generated
	 */
	HwPort getPort2();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwConnection#getPort2 <em>Port2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port2</em>' reference.
	 * @see #getPort2()
	 * @generated
	 */
	void setPort2(HwPort value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwConnection_Internal()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	boolean isInternal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String computeUniqueName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<HwPort> getPorts();

} // HwConnection
