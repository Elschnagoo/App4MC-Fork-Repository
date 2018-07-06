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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.UserSpecificSchedulingAlgorithm#getParameterExtensions <em>Parameter Extensions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getUserSpecificSchedulingAlgorithm()
 * @model
 * @generated
 */
public interface UserSpecificSchedulingAlgorithm extends TaskSchedulingAlgorithm, InterruptSchedulingAlgorithm {
	/**
	 * Returns the value of the '<em><b>Parameter Extensions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Extensions</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Extensions</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getUserSpecificSchedulingAlgorithm_ParameterExtensions()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.ParameterExtension&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getParameterExtensions();

} // UserSpecificSchedulingAlgorithm
