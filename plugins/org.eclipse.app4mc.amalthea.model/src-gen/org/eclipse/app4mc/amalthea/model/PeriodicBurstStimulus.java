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
 * A representation of the model object '<em><b>Periodic Burst Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stimulus  (repeated periodically) for burst occurrences
 * burstLength: Time frame for the burst (occurrences after the length are clipped)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus#getBurstLength <em>Burst Length</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus#getOccurrenceMinDistance <em>Occurrence Min Distance</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus#getOccurrenceCount <em>Occurrence Count</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicBurstStimulus()
 * @model
 * @generated
 */
public interface PeriodicBurstStimulus extends Stimulus, FixedPeriodic {
	/**
	 * Returns the value of the '<em><b>Burst Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Burst Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Burst Length</em>' containment reference.
	 * @see #setBurstLength(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicBurstStimulus_BurstLength()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getBurstLength();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus#getBurstLength <em>Burst Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Length</em>' containment reference.
	 * @see #getBurstLength()
	 * @generated
	 */
	void setBurstLength(Time value);

	/**
	 * Returns the value of the '<em><b>Occurrence Min Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Min Distance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Min Distance</em>' containment reference.
	 * @see #setOccurrenceMinDistance(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicBurstStimulus_OccurrenceMinDistance()
	 * @model containment="true"
	 * @generated
	 */
	Time getOccurrenceMinDistance();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus#getOccurrenceMinDistance <em>Occurrence Min Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Min Distance</em>' containment reference.
	 * @see #getOccurrenceMinDistance()
	 * @generated
	 */
	void setOccurrenceMinDistance(Time value);

	/**
	 * Returns the value of the '<em><b>Occurrence Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Count</em>' attribute.
	 * @see #setOccurrenceCount(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicBurstStimulus_OccurrenceCount()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getOccurrenceCount();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus#getOccurrenceCount <em>Occurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Count</em>' attribute.
	 * @see #getOccurrenceCount()
	 * @generated
	 */
	void setOccurrenceCount(int value);

} // PeriodicBurstStimulus
