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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryDefinition#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryDefinition#getAccessLatency <em>Access Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryDefinition#getMemoryBandwidth <em>Memory Bandwidth</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryDefinition#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryDefinition()
 * @model
 * @generated
 */
public interface MemoryDefinition extends HwDefinition {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryDefinition_Size()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryDefinition#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Access Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Latency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Latency</em>' containment reference.
	 * @see #setAccessLatency(HwLatency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryDefinition_AccessLatency()
	 * @model containment="true"
	 * @generated
	 */
	HwLatency getAccessLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryDefinition#getAccessLatency <em>Access Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Latency</em>' containment reference.
	 * @see #getAccessLatency()
	 * @generated
	 */
	void setAccessLatency(HwLatency value);

	/**
	 * Returns the value of the '<em><b>Memory Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Bandwidth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Bandwidth</em>' containment reference.
	 * @see #setMemoryBandwidth(DataRate)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryDefinition_MemoryBandwidth()
	 * @model containment="true"
	 * @generated
	 */
	DataRate getMemoryBandwidth();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryDefinition#getMemoryBandwidth <em>Memory Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Bandwidth</em>' containment reference.
	 * @see #getMemoryBandwidth()
	 * @generated
	 */
	void setMemoryBandwidth(DataRate value);

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.MemoryClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryDefinition_Classifiers()
	 * @model
	 * @generated
	 */
	EList<MemoryClassifier> getClassifiers();

} // MemoryDefinition
