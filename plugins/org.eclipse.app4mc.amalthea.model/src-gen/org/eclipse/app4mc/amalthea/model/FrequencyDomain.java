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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FrequencyDomain#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FrequencyDomain#isClockGating <em>Clock Gating</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFrequencyDomain()
 * @model
 * @generated
 */
public interface FrequencyDomain extends HwDomain {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Frequency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFrequencyDomain_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	Frequency getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FrequencyDomain#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Frequency value);

	/**
	 * Returns the value of the '<em><b>Clock Gating</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Gating</em>' attribute.
	 * @see #setClockGating(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFrequencyDomain_ClockGating()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isClockGating();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FrequencyDomain#isClockGating <em>Clock Gating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Gating</em>' attribute.
	 * @see #isClockGating()
	 * @generated
	 */
	void setClockGating(boolean value);

} // FrequencyDomain
