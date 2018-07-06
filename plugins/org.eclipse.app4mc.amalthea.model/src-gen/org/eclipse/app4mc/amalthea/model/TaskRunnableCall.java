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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Runnable Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Executes a runnable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall#getStatistic <em>Statistic</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskRunnableCall()
 * @model
 * @generated
 */
public interface TaskRunnableCall extends CallSequenceItem {
	/**
	 * Returns the value of the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable</em>' reference.
	 * @see #setRunnable(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskRunnableCall_Runnable()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall#getRunnable <em>Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runnable</em>' reference.
	 * @see #getRunnable()
	 * @generated
	 */
	void setRunnable(org.eclipse.app4mc.amalthea.model.Runnable value);

	/**
	 * Returns the value of the '<em><b>Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistic</em>' containment reference.
	 * @see #setStatistic(RunEntityCallStatistic)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskRunnableCall_Statistic()
	 * @model containment="true"
	 * @generated
	 */
	RunEntityCallStatistic getStatistic();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall#getStatistic <em>Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic</em>' containment reference.
	 * @see #getStatistic()
	 * @generated
	 */
	void setStatistic(RunEntityCallStatistic value);

} // TaskRunnableCall
