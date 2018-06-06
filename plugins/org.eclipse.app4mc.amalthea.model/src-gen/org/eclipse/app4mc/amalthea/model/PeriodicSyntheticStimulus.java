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
 * A representation of the model object '<em><b>Periodic Synthetic Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stimulus (repeated periodically) with a defined list of occurrences.
 * occurrenceTimes: List of all occurrences
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus#getOccurrenceTimes <em>Occurrence Times</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicSyntheticStimulus()
 * @model
 * @generated
 */
public interface PeriodicSyntheticStimulus extends Stimulus, FixedPeriodic {
	/**
	 * Returns the value of the '<em><b>Occurrence Times</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Time}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Times</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Times</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPeriodicSyntheticStimulus_OccurrenceTimes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Time> getOccurrenceTimes();

} // PeriodicSyntheticStimulus
