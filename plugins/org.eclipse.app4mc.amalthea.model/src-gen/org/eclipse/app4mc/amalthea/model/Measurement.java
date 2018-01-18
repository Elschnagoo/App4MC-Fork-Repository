/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Measurement#getRuntimes <em>Runtimes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Measurement#getRuntimeDeviation <em>Runtime Deviation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface Measurement extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Runtimes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Time}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtimes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtimes</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMeasurement_Runtimes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Time> getRuntimes();

	/**
	 * Returns the value of the '<em><b>Runtime Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Deviation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Deviation</em>' containment reference.
	 * @see #setRuntimeDeviation(Deviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMeasurement_RuntimeDeviation()
	 * @model containment="true"
	 * @generated
	 */
	Deviation<Time> getRuntimeDeviation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Measurement#getRuntimeDeviation <em>Runtime Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Deviation</em>' containment reference.
	 * @see #getRuntimeDeviation()
	 * @generated
	 */
	void setRuntimeDeviation(Deviation<Time> value);

} // Measurement