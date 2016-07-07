/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Runnable Entity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of runnables that can be paired or separated by a runnable-constraint
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableEntityGroup#getRunnables <em>Runnables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableEntityGroup()
 * @model
 * @generated
 */
public interface RunnableEntityGroup extends RunnableGroup, BaseObject {
	/**
	 * Returns the value of the '<em><b>Runnables</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnables</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableEntityGroup_Runnables()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunnables();

} // RunnableEntityGroup
