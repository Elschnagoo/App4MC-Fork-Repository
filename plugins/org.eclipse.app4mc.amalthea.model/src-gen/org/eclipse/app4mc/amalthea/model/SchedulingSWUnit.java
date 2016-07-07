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
 * A representation of the model object '<em><b>Scheduling SW Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Software Scheduling Unit is used in a Scheduler when scheduling performs by Software
 * It describes an ISR that performs scheduling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getInterruptController <em>Interrupt Controller</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingSWUnit()
 * @model
 * @generated
 */
public interface SchedulingSWUnit extends SchedulingUnit, BaseObject {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The priority of the scheduling ISR
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingSWUnit_Priority()
	 * @model unique="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.OsExecutionInstructions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instructions of the scheduling ISR
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingSWUnit_Instructions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OsExecutionInstructions> getInstructions();

	/**
	 * Returns the value of the '<em><b>Interrupt Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interrupt Controller that manages the scheduling ISR
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupt Controller</em>' reference.
	 * @see #setInterruptController(InterruptController)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingSWUnit_InterruptController()
	 * @model
	 * @generated
	 */
	InterruptController getInterruptController();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulingSWUnit#getInterruptController <em>Interrupt Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt Controller</em>' reference.
	 * @see #getInterruptController()
	 * @generated
	 */
	void setInterruptController(InterruptController value);

} // SchedulingSWUnit
