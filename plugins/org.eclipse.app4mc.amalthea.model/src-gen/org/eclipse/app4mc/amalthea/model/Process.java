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
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generalizes interrupt service routines and tasks
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Process#getCallGraph <em>Call Graph</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Process#getStimuli <em>Stimuli</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends AbstractProcess {
	/**
	 * Returns the value of the '<em><b>Call Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Graph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Graph</em>' containment reference.
	 * @see #setCallGraph(CallGraph)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcess_CallGraph()
	 * @model containment="true"
	 * @generated
	 */
	CallGraph getCallGraph();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Process#getCallGraph <em>Call Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Graph</em>' containment reference.
	 * @see #getCallGraph()
	 * @generated
	 */
	void setCallGraph(CallGraph value);

	/**
	 * Returns the value of the '<em><b>Stimuli</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Stimulus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimuli</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimuli</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcess_Stimuli()
	 * @model
	 * @generated
	 */
	EList<Stimulus> getStimuli();

} // Process
