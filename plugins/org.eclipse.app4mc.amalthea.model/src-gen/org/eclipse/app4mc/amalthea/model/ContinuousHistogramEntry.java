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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Histogram Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ContinuousHistogramEntry#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ContinuousHistogramEntry#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousHistogramEntry()
 * @model
 * @generated
 */
public interface ContinuousHistogramEntry extends EObject {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousHistogramEntry_Occurrences()
	 * @model default="1" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveLong" required="true"
	 * @generated
	 */
	long getOccurrences();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ContinuousHistogramEntry#getOccurrences <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrences</em>' attribute.
	 * @see #getOccurrences()
	 * @generated
	 */
	void setOccurrences(long value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference.
	 * @see #setInterval(ContinuousInterval)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getContinuousHistogramEntry_Interval()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContinuousInterval getInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ContinuousHistogramEntry#getInterval <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' containment reference.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(ContinuousInterval value);

} // ContinuousHistogramEntry