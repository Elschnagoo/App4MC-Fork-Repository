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
 * A representation of the model object '<em><b>Hw Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwModule#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwModule#getPowerDomain <em>Power Domain</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwModule#getFrequencyDomain <em>Frequency Domain</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwModule()
 * @model abstract="true"
 * @generated
 */
public interface HwModule extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwModule_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Power Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Domain</em>' reference.
	 * @see #setPowerDomain(PowerDomain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwModule_PowerDomain()
	 * @model
	 * @generated
	 */
	PowerDomain getPowerDomain();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwModule#getPowerDomain <em>Power Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Domain</em>' reference.
	 * @see #getPowerDomain()
	 * @generated
	 */
	void setPowerDomain(PowerDomain value);

	/**
	 * Returns the value of the '<em><b>Frequency Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Domain</em>' reference.
	 * @see #setFrequencyDomain(FrequencyDomain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwModule_FrequencyDomain()
	 * @model
	 * @generated
	 */
	FrequencyDomain getFrequencyDomain();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwModule#getFrequencyDomain <em>Frequency Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Domain</em>' reference.
	 * @see #getFrequencyDomain()
	 * @generated
	 */
	void setFrequencyDomain(FrequencyDomain value);

} // HwModule
