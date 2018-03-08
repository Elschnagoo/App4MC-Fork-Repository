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
 * A representation of the model object '<em><b>Power Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PowerDomain#getPossibleValues <em>Possible Values</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PowerDomain#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PowerDomain#isPowerGating <em>Power Gating</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPowerDomain()
 * @model
 * @generated
 */
public interface PowerDomain extends HwDomain {
	/**
	 * Returns the value of the '<em><b>Possible Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Voltage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Values</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPowerDomain_PossibleValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Voltage> getPossibleValues();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Voltage)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPowerDomain_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	Voltage getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PowerDomain#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Voltage value);

	/**
	 * Returns the value of the '<em><b>Power Gating</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Gating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Gating</em>' attribute.
	 * @see #setPowerGating(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPowerDomain_PowerGating()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isPowerGating();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PowerDomain#isPowerGating <em>Power Gating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Gating</em>' attribute.
	 * @see #isPowerGating()
	 * @generated
	 */
	void setPowerGating(boolean value);

} // PowerDomain
