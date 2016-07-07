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
 * A representation of the model object '<em><b>Synchronisation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The synchronization constraint considers a group of events and limits the distance of the events within this group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SynchronisationConstraint#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SynchronisationConstraint#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSynchronisationConstraint()
 * @model
 * @generated
 */
public interface SynchronisationConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.EntityEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSynchronisationConstraint_Events()
	 * @model
	 * @generated
	 */
	EList<EntityEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' containment reference.
	 * @see #setTolerance(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSynchronisationConstraint_Tolerance()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Time getTolerance();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SynchronisationConstraint#getTolerance <em>Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' containment reference.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(Time value);

} // SynchronisationConstraint
