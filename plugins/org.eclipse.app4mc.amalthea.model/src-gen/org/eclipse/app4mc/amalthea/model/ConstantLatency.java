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
 * A representation of the model object '<em><b>Constant Latency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ConstantLatency#getConstantCycles <em>Constant Cycles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstantLatency()
 * @model
 * @generated
 */
public interface ConstantLatency extends HwLatency {
	/**
	 * Returns the value of the '<em><b>Constant Cycles</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Cycles</em>' attribute.
	 * @see #setConstantCycles(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getConstantLatency_ConstantCycles()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getConstantCycles();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ConstantLatency#getConstantCycles <em>Constant Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Cycles</em>' attribute.
	 * @see #getConstantCycles()
	 * @generated
	 */
	void setConstantCycles(long value);

} // ConstantLatency
