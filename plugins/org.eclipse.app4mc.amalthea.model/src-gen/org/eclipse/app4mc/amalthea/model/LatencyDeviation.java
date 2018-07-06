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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latency Deviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LatencyDeviation#getCycles <em>Cycles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLatencyDeviation()
 * @model
 * @generated
 */
public interface LatencyDeviation extends HwLatency {
	/**
	 * Returns the value of the '<em><b>Cycles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycles</em>' containment reference.
	 * @see #setCycles(Deviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLatencyDeviation_Cycles()
	 * @model containment="true"
	 * @generated
	 */
	Deviation<LongObject> getCycles();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LatencyDeviation#getCycles <em>Cycles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycles</em>' containment reference.
	 * @see #getCycles()
	 * @generated
	 */
	void setCycles(Deviation<LongObject> value);

} // LatencyDeviation
