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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common scheduling parameters
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters#getMinBudget <em>Min Budget</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters#getMaxBudget <em>Max Budget</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters#getReplenishment <em>Replenishment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingParameters()
 * @model
 * @generated
 */
public interface SchedulingParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingParameters_Priority()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Budget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Budget</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Budget</em>' containment reference.
	 * @see #setMinBudget(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingParameters_MinBudget()
	 * @model containment="true"
	 * @generated
	 */
	Time getMinBudget();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters#getMinBudget <em>Min Budget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Budget</em>' containment reference.
	 * @see #getMinBudget()
	 * @generated
	 */
	void setMinBudget(Time value);

	/**
	 * Returns the value of the '<em><b>Max Budget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Budget</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Budget</em>' containment reference.
	 * @see #setMaxBudget(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingParameters_MaxBudget()
	 * @model containment="true"
	 * @generated
	 */
	Time getMaxBudget();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters#getMaxBudget <em>Max Budget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Budget</em>' containment reference.
	 * @see #getMaxBudget()
	 * @generated
	 */
	void setMaxBudget(Time value);

	/**
	 * Returns the value of the '<em><b>Replenishment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenishment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenishment</em>' containment reference.
	 * @see #setReplenishment(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingParameters_Replenishment()
	 * @model containment="true"
	 * @generated
	 */
	Time getReplenishment();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulingParameters#getReplenishment <em>Replenishment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenishment</em>' containment reference.
	 * @see #getReplenishment()
	 * @generated
	 */
	void setReplenishment(Time value);

} // SchedulingParameters
