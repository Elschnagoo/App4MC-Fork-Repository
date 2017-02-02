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
 * A representation of the model object '<em><b>Target Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A memory target description
 * A memory can be a target for data-constraints
 * memories: the reference to zero or more Memories. If this list is empty, the target stands for all memories!
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TargetMemory#getMemories <em>Memories</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTargetMemory()
 * @model
 * @generated
 */
public interface TargetMemory extends DataConstraintTarget, BaseObject {
	/**
	 * Returns the value of the '<em><b>Memories</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Memory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTargetMemory_Memories()
	 * @model
	 * @generated
	 */
	EList<Memory> getMemories();

} // TargetMemory
