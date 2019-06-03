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
 * A representation of the model object '<em><b>Single Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single activation between time min and max
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SingleActivation#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SingleActivation#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSingleActivation()
 * @model
 * @generated
 */
public interface SingleActivation extends Activation {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSingleActivation_Min()
	 * @model containment="true"
	 * @generated
	 */
	Time getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SingleActivation#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Time value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSingleActivation_Max()
	 * @model containment="true"
	 * @generated
	 */
	Time getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SingleActivation#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Time value);

} // SingleActivation
