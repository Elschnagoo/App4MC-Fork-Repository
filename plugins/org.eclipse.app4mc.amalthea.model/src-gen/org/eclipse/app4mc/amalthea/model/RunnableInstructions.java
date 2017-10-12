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

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runnable Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of the execution cost of a Runnable (default and core-specific)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableInstructions#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableInstructions#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableInstructions()
 * @model
 * @generated
 */
public interface RunnableInstructions extends ComputationItem {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(Instructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableInstructions_Default()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instructions getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableInstructions#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Instructions value);

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' map.
	 * The key is of type {@link org.eclipse.app4mc.amalthea.model.CoreType},
	 * and the value is of type {@link org.eclipse.app4mc.amalthea.model.Instructions},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableInstructions_Extended()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.RunnableInstructionsEntry&lt;org.eclipse.app4mc.amalthea.model.CoreType, org.eclipse.app4mc.amalthea.model.Instructions&gt;"
	 * @generated
	 */
	EMap<CoreType, Instructions> getExtended();

} // RunnableInstructions
