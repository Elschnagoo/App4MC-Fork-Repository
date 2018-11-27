/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data transmission details for communication (e.g. LabelAccesses)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TransmissionPolicy#getChunkSize <em>Chunk Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TransmissionPolicy#getChunkProcessingTicks <em>Chunk Processing Ticks</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TransmissionPolicy#getTransmitRatio <em>Transmit Ratio</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTransmissionPolicy()
 * @model
 * @generated
 */
public interface TransmissionPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Chunk Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk Size</em>' containment reference.
	 * @see #setChunkSize(DataSize)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTransmissionPolicy_ChunkSize()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getChunkSize();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TransmissionPolicy#getChunkSize <em>Chunk Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk Size</em>' containment reference.
	 * @see #getChunkSize()
	 * @generated
	 */
	void setChunkSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Chunk Processing Ticks</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk Processing Ticks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk Processing Ticks</em>' attribute.
	 * @see #setChunkProcessingTicks(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTransmissionPolicy_ChunkProcessingTicks()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getChunkProcessingTicks();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TransmissionPolicy#getChunkProcessingTicks <em>Chunk Processing Ticks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk Processing Ticks</em>' attribute.
	 * @see #getChunkProcessingTicks()
	 * @generated
	 */
	void setChunkProcessingTicks(int value);

	/**
	 * Returns the value of the '<em><b>Transmit Ratio</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmit Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmit Ratio</em>' attribute.
	 * @see #setTransmitRatio(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTransmissionPolicy_TransmitRatio()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getTransmitRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TransmissionPolicy#getTransmitRatio <em>Transmit Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmit Ratio</em>' attribute.
	 * @see #getTransmitRatio()
	 * @generated
	 */
	void setTransmitRatio(double value);

} // TransmissionPolicy
