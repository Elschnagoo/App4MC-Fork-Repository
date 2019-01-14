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
 * A representation of the model object '<em><b>Discrete Value Histogram Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DiscreteValueHistogramEntry#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDiscreteValueHistogramEntry()
 * @model
 * @generated
 */
public interface DiscreteValueHistogramEntry extends DiscreteValueInterval {
	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences</em>' attribute.
	 * @see #setOccurrences(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDiscreteValueHistogramEntry_Occurrences()
	 * @model default="1" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveLong" required="true"
	 * @generated
	 */
	long getOccurrences();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DiscreteValueHistogramEntry#getOccurrences <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrences</em>' attribute.
	 * @see #getOccurrences()
	 * @generated
	 */
	void setOccurrences(long value);

} // DiscreteValueHistogramEntry
