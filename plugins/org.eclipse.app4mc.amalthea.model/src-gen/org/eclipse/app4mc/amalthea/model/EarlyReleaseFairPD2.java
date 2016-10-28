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
 * A representation of the model object '<em><b>Early Release Fair PD2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * global scheduling algorithm
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2#getQuantSizeNs <em>Quant Size Ns</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEarlyReleaseFairPD2()
 * @model
 * @generated
 */
public interface EarlyReleaseFairPD2 extends TaskSchedulingAlgorithm {
	/**
	 * Returns the value of the '<em><b>Quant Size Ns</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quant Size Ns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quant Size Ns</em>' attribute.
	 * @see #setQuantSizeNs(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEarlyReleaseFairPD2_QuantSizeNs()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getQuantSizeNs();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EarlyReleaseFairPD2#getQuantSizeNs <em>Quant Size Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quant Size Ns</em>' attribute.
	 * @see #getQuantSizeNs()
	 * @generated
	 */
	void setQuantSizeNs(int value);

} // EarlyReleaseFairPD2
