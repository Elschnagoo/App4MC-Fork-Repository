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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allocation of Schedulers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulerAllocation#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulerAllocation#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulerAllocation#getExecutingPU <em>Executing PU</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAllocation()
 * @model
 * @generated
 */
public interface SchedulerAllocation extends BaseObject {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAllocation_Scheduler()
	 * @model required="true"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulerAllocation#getScheduler <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(Scheduler value);

	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ProcessingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAllocation_Responsibility()
	 * @model required="true"
	 * @generated
	 */
	EList<ProcessingUnit> getResponsibility();

	/**
	 * Returns the value of the '<em><b>Executing PU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executing PU</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executing PU</em>' reference.
	 * @see #setExecutingPU(ProcessingUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAllocation_ExecutingPU()
	 * @model
	 * @generated
	 */
	ProcessingUnit getExecutingPU();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulerAllocation#getExecutingPU <em>Executing PU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executing PU</em>' reference.
	 * @see #getExecutingPU()
	 * @generated
	 */
	void setExecutingPU(ProcessingUnit value);

} // SchedulerAllocation
