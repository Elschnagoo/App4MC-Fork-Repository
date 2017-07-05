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
 * A representation of the model object '<em><b>User Specific Scheduling Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * allows the user to define own scheduling algorithm (TA-Toolsuite feature)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm#getAlgorithmParameters <em>Algorithm Parameters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getUserSpecificSchedulingAlgorithm()
 * @model
 * @generated
 */
public interface UserSpecificSchedulingAlgorithm extends TaskSchedulingAlgorithm, InterruptSchedulingAlgorithm {
	/**
	 * Returns the value of the '<em><b>Algorithm Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Parameters</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getUserSpecificSchedulingAlgorithm_AlgorithmParameters()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.AlgorithmParameter<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getAlgorithmParameters();

} // UserSpecificSchedulingAlgorithm
