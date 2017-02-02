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
 * A representation of the model object '<em><b>Core Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allocation of Cores to schedulers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CoreAllocation#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CoreAllocation#getCore <em>Core</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCoreAllocation()
 * @model
 * @generated
 */
public interface CoreAllocation extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see #setScheduler(Scheduler)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCoreAllocation_Scheduler()
	 * @model required="true"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CoreAllocation#getScheduler <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(Scheduler value);

	/**
	 * Returns the value of the '<em><b>Core</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Core}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCoreAllocation_Core()
	 * @model required="true"
	 * @generated
	 */
	EList<Core> getCore();

} // CoreAllocation
