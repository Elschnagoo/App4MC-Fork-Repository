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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RequirementLimit#getLimitType <em>Limit Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRequirementLimit()
 * @model abstract="true"
 * @generated
 */
public interface RequirementLimit extends EObject {
	/**
	 * Returns the value of the '<em><b>Limit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.LimitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LimitType
	 * @see #setLimitType(LimitType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRequirementLimit_LimitType()
	 * @model unique="false"
	 * @generated
	 */
	LimitType getLimitType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RequirementLimit#getLimitType <em>Limit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LimitType
	 * @see #getLimitType()
	 * @generated
	 */
	void setLimitType(LimitType value);

} // RequirementLimit
