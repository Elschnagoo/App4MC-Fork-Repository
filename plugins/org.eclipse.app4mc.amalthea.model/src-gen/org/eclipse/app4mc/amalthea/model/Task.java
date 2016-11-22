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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Schedulable entity, which is managed by the OS. An instance of a Task is mapped to exactly one core
 * and includes the direct representation of all abstractions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Task#getOsekTaskGroup <em>Osek Task Group</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Task#getPreemption <em>Preemption</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Task#getMultipleTaskActivationLimit <em>Multiple Task Activation Limit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends org.eclipse.app4mc.amalthea.model.Process {
	/**
	 * Returns the value of the '<em><b>Osek Task Group</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osek Task Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osek Task Group</em>' attribute.
	 * @see #setOsekTaskGroup(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTask_OsekTaskGroup()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getOsekTaskGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Task#getOsekTaskGroup <em>Osek Task Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osek Task Group</em>' attribute.
	 * @see #getOsekTaskGroup()
	 * @generated
	 */
	void setOsekTaskGroup(int value);

	/**
	 * Returns the value of the '<em><b>Preemption</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.Preemptability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preemption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preemption</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.Preemptability
	 * @see #setPreemption(Preemptability)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTask_Preemption()
	 * @model unique="false"
	 * @generated
	 */
	Preemptability getPreemption();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Task#getPreemption <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemption</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.Preemptability
	 * @see #getPreemption()
	 * @generated
	 */
	void setPreemption(Preemptability value);

	/**
	 * Returns the value of the '<em><b>Multiple Task Activation Limit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Task Activation Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Task Activation Limit</em>' attribute.
	 * @see #setMultipleTaskActivationLimit(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTask_MultipleTaskActivationLimit()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMultipleTaskActivationLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Task#getMultipleTaskActivationLimit <em>Multiple Task Activation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Task Activation Limit</em>' attribute.
	 * @see #getMultipleTaskActivationLimit()
	 * @generated
	 */
	void setMultipleTaskActivationLimit(int value);

} // Task
