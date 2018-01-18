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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Single occurrence at a defined time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SingleStimulus#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSingleStimulus()
 * @model
 * @generated
 */
public interface SingleStimulus extends Stimulus {
	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' containment reference.
	 * @see #setOccurrence(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSingleStimulus_Occurrence()
	 * @model containment="true"
	 * @generated
	 */
	Time getOccurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SingleStimulus#getOccurrence <em>Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' containment reference.
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(Time value);

} // SingleStimulus
