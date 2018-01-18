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
 * A representation of the model object '<em><b>Periodic Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stimulus that is triggered periodically.
 * jitter: Deviation from true periodicity to real occurrence
 * minDistance: Minimal time between occurrences
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PeriodicStimulus#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PeriodicStimulus#getMinDistance <em>Min Distance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicStimulus()
 * @model
 * @generated
 */
public interface PeriodicStimulus extends Stimulus, FixedPeriodic {
	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(Deviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicStimulus_Jitter()
	 * @model containment="true"
	 * @generated
	 */
	Deviation<Time> getJitter();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PeriodicStimulus#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(Deviation<Time> value);

	/**
	 * Returns the value of the '<em><b>Min Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Distance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Distance</em>' containment reference.
	 * @see #setMinDistance(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicStimulus_MinDistance()
	 * @model containment="true"
	 * @generated
	 */
	Time getMinDistance();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PeriodicStimulus#getMinDistance <em>Min Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Distance</em>' containment reference.
	 * @see #getMinDistance()
	 * @generated
	 */
	void setMinDistance(Time value);

} // PeriodicStimulus
