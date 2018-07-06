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
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getTask <em>Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getAffinity <em>Affinity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getSchedulingParameters <em>Scheduling Parameters</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getParameterExtensions <em>Parameter Extensions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskAllocation()
 * @model
 * @generated
 */
public interface TaskAllocation extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskAllocation_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see #setScheduler(TaskScheduler)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskAllocation_Scheduler()
	 * @model required="true"
	 * @generated
	 */
	TaskScheduler getScheduler();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getScheduler <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(TaskScheduler value);

	/**
	 * Returns the value of the '<em><b>Affinity</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ProcessingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affinity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affinity</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskAllocation_Affinity()
	 * @model
	 * @generated
	 */
	EList<ProcessingUnit> getAffinity();

	/**
	 * Returns the value of the '<em><b>Scheduling Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Parameters</em>' containment reference.
	 * @see #setSchedulingParameters(SchedulingParameters)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskAllocation_SchedulingParameters()
	 * @model containment="true"
	 * @generated
	 */
	SchedulingParameters getSchedulingParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TaskAllocation#getSchedulingParameters <em>Scheduling Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Parameters</em>' containment reference.
	 * @see #getSchedulingParameters()
	 * @generated
	 */
	void setSchedulingParameters(SchedulingParameters value);

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskAllocation_ParameterExtensions()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.ParameterExtension&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getParameterExtensions();

} // TaskAllocation
