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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ExecutionNeed#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ExecutionNeed#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getExecutionNeed()
 * @model
 * @generated
 */
public interface ExecutionNeed extends ComputationItem {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.app4mc.amalthea.model.Need},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getExecutionNeed_Default()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.NeedEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.app4mc.amalthea.model.Need&gt;"
	 * @generated
	 */
	EMap<String, Need> getDefault();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' map.
	 * The key is of type {@link org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition},
	 * and the value is of type list of {@link java.util.Map.Entry<java.lang.String, org.eclipse.app4mc.amalthea.model.Need>},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getExecutionNeed_Extended()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.ExecutionNeedExtended&lt;org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition, org.eclipse.app4mc.amalthea.model.NeedEntry&gt;"
	 * @generated
	 */
	EMap<ProcessingUnitDefinition, EMap<String, Need>> getExtended();

} // ExecutionNeed
