/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrival Curve Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getNumberOfEvents <em>Number Of Events</em>}</li>
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
	 * Returns the value of the '<em><b>Number Of Events</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Events</em>' attribute.
	 * @see #setNumberOfEvents(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getArrivalCurveEntry_NumberOfEvents()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getNumberOfEvents();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry#getNumberOfEvents <em>Number Of Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Events</em>' attribute.
	 * @see #getNumberOfEvents()
	 * @generated
	 */
	void setNumberOfEvents(int value);

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
	 * @model containment="true" resolveProxies="true"
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
	 * @model containment="true" resolveProxies="true"
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
