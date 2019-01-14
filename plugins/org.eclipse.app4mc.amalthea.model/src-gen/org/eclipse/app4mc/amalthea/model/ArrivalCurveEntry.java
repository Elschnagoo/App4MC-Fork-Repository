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
 * A representation of the model object '<em><b>Arrival Curve Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getNumberOfOccurrences <em>Number Of Occurrences</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getLowerTimeBorder <em>Lower Time Border</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getUpperTimeBorder <em>Upper Time Border</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getArrivalCurveEntry()
 * @model
 * @generated
 */
public interface ArrivalCurveEntry extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Number Of Occurrences</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Occurrences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Occurrences</em>' attribute.
	 * @see #setNumberOfOccurrences(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getArrivalCurveEntry_NumberOfOccurrences()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getNumberOfOccurrences();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getNumberOfOccurrences <em>Number Of Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Occurrences</em>' attribute.
	 * @see #getNumberOfOccurrences()
	 * @generated
	 */
	void setNumberOfOccurrences(int value);

	/**
	 * Returns the value of the '<em><b>Lower Time Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Time Border</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Time Border</em>' containment reference.
	 * @see #setLowerTimeBorder(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getArrivalCurveEntry_LowerTimeBorder()
	 * @model containment="true"
	 * @generated
	 */
	Time getLowerTimeBorder();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getLowerTimeBorder <em>Lower Time Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Time Border</em>' containment reference.
	 * @see #getLowerTimeBorder()
	 * @generated
	 */
	void setLowerTimeBorder(Time value);

	/**
	 * Returns the value of the '<em><b>Upper Time Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Time Border</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Time Border</em>' containment reference.
	 * @see #setUpperTimeBorder(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getArrivalCurveEntry_UpperTimeBorder()
	 * @model containment="true"
	 * @generated
	 */
	Time getUpperTimeBorder();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getUpperTimeBorder <em>Upper Time Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Time Border</em>' containment reference.
	 * @see #getUpperTimeBorder()
	 * @generated
	 */
	void setUpperTimeBorder(Time value);

} // ArrivalCurveEntry
