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
 * A representation of the model object '<em><b>Frequency Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit#getLimitValue <em>Limit Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFrequencyRequirementLimit()
 * @model
 * @generated
 */
public interface FrequencyRequirementLimit extends RequirementLimit {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.FrequencyMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyMetric
	 * @see #setMetric(FrequencyMetric)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFrequencyRequirementLimit_Metric()
	 * @model unique="false"
	 * @generated
	 */
	FrequencyMetric getMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.FrequencyMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(FrequencyMetric value);

	/**
	 * Returns the value of the '<em><b>Limit Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Value</em>' containment reference.
	 * @see #setLimitValue(Frequency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getFrequencyRequirementLimit_LimitValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Frequency getLimitValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit#getLimitValue <em>Limit Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Value</em>' containment reference.
	 * @see #getLimitValue()
	 * @generated
	 */
	void setLimitValue(Frequency value);

} // FrequencyRequirementLimit
