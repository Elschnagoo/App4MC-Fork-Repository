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
 * A representation of the model object '<em><b>Scheduling HW Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hardware scheduling unit is used in Scheduler when scheduling performs by hardware
 * Each schedule core requires a amount of time equal to delay to execute scheduling
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulingHWUnit#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingHWUnit()
 * @model
 * @generated
 */
public interface SchedulingHWUnit extends SchedulingUnit, BaseObject {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulingHWUnit_Delay()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Time getDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulingHWUnit#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Time value);

} // SchedulingHWUnit
