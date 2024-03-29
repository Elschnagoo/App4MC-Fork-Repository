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
 * A representation of the model object '<em><b>Inter Process Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Triggers a stimulus to activate its processes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InterProcessTrigger#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InterProcessTrigger#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterProcessTrigger()
 * @model
 * @generated
 */
public interface InterProcessTrigger extends CallGraphItem {
	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus</em>' reference.
	 * @see #setStimulus(InterProcessStimulus)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterProcessTrigger_Stimulus()
	 * @model required="true"
	 * @generated
	 */
	InterProcessStimulus getStimulus();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.InterProcessTrigger#getStimulus <em>Stimulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus</em>' reference.
	 * @see #getStimulus()
	 * @generated
	 */
	void setStimulus(InterProcessStimulus value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' containment reference.
	 * @see #setCounter(Counter)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterProcessTrigger_Counter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getCounter();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.InterProcessTrigger#getCounter <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' containment reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Counter value);

} // InterProcessTrigger
