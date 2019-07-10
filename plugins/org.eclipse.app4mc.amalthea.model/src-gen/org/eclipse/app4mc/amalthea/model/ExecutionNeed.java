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

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of the execution needs of a Runnable (default and core-specific)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ExecutionNeed#getNeeds <em>Needs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getExecutionNeed()
 * @model
 * @generated
 */
public interface ExecutionNeed extends CallGraphItem {
	/**
	 * Returns the value of the '<em><b>Needs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getExecutionNeed_Needs()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.NeedEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation&gt;"
	 * @generated
	 */
	EMap<String, IDiscreteValueDeviation> getNeeds();

} // ExecutionNeed
