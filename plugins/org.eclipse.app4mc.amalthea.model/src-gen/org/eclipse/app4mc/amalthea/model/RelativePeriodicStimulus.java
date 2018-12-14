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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Periodic Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stimulus that is triggered relative to the previous occurrence.
 * offset: Time of first occurrence
 * step: Time (Deviation) between successive occurrences
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus#getNextOccurrence <em>Next Occurrence</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRelativePeriodicStimulus()
 * @model
 * @generated
 */
public interface RelativePeriodicStimulus extends Stimulus {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRelativePeriodicStimulus_Offset()
	 * @model containment="true"
	 * @generated
	 */
	Time getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Time value);

	/**
	 * Returns the value of the '<em><b>Next Occurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Occurrence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Occurrence</em>' containment reference.
	 * @see #setNextOccurrence(TimeDeviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRelativePeriodicStimulus_NextOccurrence()
	 * @model containment="true"
	 * @generated
	 */
	TimeDeviation getNextOccurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus#getNextOccurrence <em>Next Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Occurrence</em>' containment reference.
	 * @see #getNextOccurrence()
	 * @generated
	 */
	void setNextOccurrence(TimeDeviation value);

} // RelativePeriodicStimulus
