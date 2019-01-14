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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A core target description
 * A core can be a target for runnable-constraints, process-constraints and scheduler-constraints
 * cores: the reference to zero or more Cores. If this list is empty, the target stands for all cores!
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TargetCore#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTargetCore()
 * @model
 * @generated
 */
public interface TargetCore extends RunnableConstraintTarget, ProcessConstraintTarget, BaseObject {
	/**
	 * Returns the value of the '<em><b>Cores</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ProcessingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTargetCore_Cores()
	 * @model
	 * @generated
	 */
	EList<ProcessingUnit> getCores();

} // TargetCore
