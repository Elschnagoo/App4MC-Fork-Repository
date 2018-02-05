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
 * A representation of the model object '<em><b>Latency Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LatencyConstant#getCycles <em>Cycles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLatencyConstant()
 * @model
 * @generated
 */
public interface LatencyConstant extends HwLatency {
	/**
	 * Returns the value of the '<em><b>Cycles</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycles</em>' attribute.
	 * @see #setCycles(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLatencyConstant_Cycles()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getCycles();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LatencyConstant#getCycles <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycles</em>' attribute.
	 * @see #getCycles()
	 * @generated
	 */
	void setCycles(long value);

} // LatencyConstant
