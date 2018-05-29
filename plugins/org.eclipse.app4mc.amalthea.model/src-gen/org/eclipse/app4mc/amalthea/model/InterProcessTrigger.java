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
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterProcessTrigger()
 * @model
 * @generated
 */
public interface InterProcessTrigger extends CallSequenceItem {
	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // InterProcessTrigger
