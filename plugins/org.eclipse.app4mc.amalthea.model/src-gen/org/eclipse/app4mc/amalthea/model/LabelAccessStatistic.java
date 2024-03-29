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
 * A representation of the model object '<em><b>Label Access Statistic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains information about access statistic values
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccessStatistic#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccessStatistic#getCacheMisses <em>Cache Misses</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccessStatistic()
 * @model
 * @generated
 */
public interface LabelAccessStatistic extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(NumericStatistic)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccessStatistic_Value()
	 * @model containment="true"
	 * @generated
	 */
	NumericStatistic getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccessStatistic#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NumericStatistic value);

	/**
	 * Returns the value of the '<em><b>Cache Misses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Misses</em>' containment reference.
	 * @see #setCacheMisses(NumericStatistic)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccessStatistic_CacheMisses()
	 * @model containment="true"
	 * @generated
	 */
	NumericStatistic getCacheMisses();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccessStatistic#getCacheMisses <em>Cache Misses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Misses</em>' containment reference.
	 * @see #getCacheMisses()
	 * @generated
	 */
	void setCacheMisses(NumericStatistic value);

} // LabelAccessStatistic
