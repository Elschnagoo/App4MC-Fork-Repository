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
 * A representation of the model object '<em><b>Execution Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ExecutionCost#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ExecutionCost#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getExecutionCost()
 * @model
 * @generated
 */
public interface ExecutionCost extends ComputationItem {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' map.
	 * The key is of type {@link org.eclipse.app4mc.amalthea.model.HwFeature},
	 * and the value is of type {@link org.eclipse.app4mc.amalthea.model.Cost},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getExecutionCost_Default()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.CostMapEntry&lt;org.eclipse.app4mc.amalthea.model.HwFeature, org.eclipse.app4mc.amalthea.model.Cost&gt;"
	 * @generated
	 */
	EMap<HwFeature, Cost> getDefault();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' map.
	 * The key is of type {@link org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition},
	 * and the value is of type list of {@link java.util.Map.Entry<org.eclipse.app4mc.amalthea.model.HwFeature, org.eclipse.app4mc.amalthea.model.Cost>},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getExecutionCost_Extended()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.ExecutionCostEntry&lt;org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition, org.eclipse.app4mc.amalthea.model.CostMapEntry&gt;"
	 * @generated
	 */
	EMap<ProcessingUnitDefinition, EMap<HwFeature, Cost>> getExtended();

} // ExecutionCost
