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
 * A representation of the model object '<em><b>Discrete Value Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DiscreteValueInterval#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DiscreteValueInterval#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDiscreteValueInterval()
 * @model abstract="true"
 * @generated
 */
public interface DiscreteValueInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDiscreteValueInterval_LowerBound()
	 * @model default="0" unique="false" required="true"
	 * @generated
	 */
	Long getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueInterval#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Long value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDiscreteValueInterval_UpperBound()
	 * @model default="0" unique="false" required="true"
	 * @generated
	 */
	Long getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueInterval#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	double getAverage();

} // DiscreteValueInterval
