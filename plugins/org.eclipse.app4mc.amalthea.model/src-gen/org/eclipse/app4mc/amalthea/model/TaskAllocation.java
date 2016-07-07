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

} // TaskAllocation
