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
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * scheduling Algorithm: The used algorithm for scheduling
 * schedulingUnit: The unit that performs the scheduling algorithm, this can be a hardware or software unit
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scheduler#getSchedulingUnit <em>Scheduling Unit</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scheduler#getScheduleUnitPriority <em>Schedule Unit Priority</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scheduler#getCoreAllocation <em>Core Allocation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScheduler()
 * @model abstract="true"
 * @generated
 */
public interface Scheduler extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Scheduling Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Unit</em>' containment reference.
	 * @see #setSchedulingUnit(SchedulingUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScheduler_SchedulingUnit()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	SchedulingUnit getSchedulingUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Scheduler#getSchedulingUnit <em>Scheduling Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Unit</em>' containment reference.
	 * @see #getSchedulingUnit()
	 * @generated
	 */
	void setSchedulingUnit(SchedulingUnit value);

	/**
	 * Returns the value of the '<em><b>Schedule Unit Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Unit Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Unit Priority</em>' attribute.
	 * @see #setScheduleUnitPriority(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScheduler_ScheduleUnitPriority()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getScheduleUnitPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Scheduler#getScheduleUnitPriority <em>Schedule Unit Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Unit Priority</em>' attribute.
	 * @see #getScheduleUnitPriority()
	 * @generated
	 */
	void setScheduleUnitPriority(int value);

	/**
	 * Returns the value of the '<em><b>Core Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Allocation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Allocation</em>' reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScheduler_CoreAllocation()
	 * @model opposite="schedulerLinkInt" transient="true" suppressedSetVisibility="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	CoreAllocation getCoreAllocation();

} // Scheduler
