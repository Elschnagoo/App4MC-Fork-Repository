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
 * A representation of the model object '<em><b>Task Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler()
 * @model
 * @generated
 */
public interface TaskScheduler extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Scheduling Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Algorithm</em>' containment reference.
	 * @see #setSchedulingAlgorithm(TaskSchedulingAlgorithm)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_SchedulingAlgorithm()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	TaskSchedulingAlgorithm getSchedulingAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Algorithm</em>' containment reference.
	 * @see #getSchedulingAlgorithm()
	 * @generated
	 */
	void setSchedulingAlgorithm(TaskSchedulingAlgorithm value);

} // TaskScheduler
