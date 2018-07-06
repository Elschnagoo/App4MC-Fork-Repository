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
 * A representation of the model object '<em><b>Count Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CountRequirementLimit#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CountRequirementLimit#getLimitValue <em>Limit Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCountRequirementLimit()
 * @model
 * @generated
 */
public interface CountRequirementLimit extends RequirementLimit {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.CountMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.CountMetric
	 * @see #setMetric(CountMetric)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCountRequirementLimit_Metric()
	 * @model unique="false"
	 * @generated
	 */
	CountMetric getMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CountRequirementLimit#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.CountMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(CountMetric value);

	/**
	 * Returns the value of the '<em><b>Limit Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Value</em>' attribute.
	 * @see #setLimitValue(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCountRequirementLimit_LimitValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getLimitValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CountRequirementLimit#getLimitValue <em>Limit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Value</em>' attribute.
	 * @see #getLimitValue()
	 * @generated
	 */
	void setLimitValue(int value);

} // CountRequirementLimit
