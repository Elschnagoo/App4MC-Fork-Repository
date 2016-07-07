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
 * A representation of the model object '<em><b>Scheduler Pairing Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A scheduler-pairing-constraint
 * schedulers describes the group of schedulers that should be paired on the target
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulerPairingConstraint#getSchedulers <em>Schedulers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerPairingConstraint()
 * @model
 * @generated
 */
public interface SchedulerPairingConstraint extends PairingConstraint, SchedulerConstraint, BaseObject {
	/**
	 * Returns the value of the '<em><b>Schedulers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulers</em>' containment reference.
	 * @see #setSchedulers(SchedulerEntityGroup)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerPairingConstraint_Schedulers()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	SchedulerEntityGroup getSchedulers();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulerPairingConstraint#getSchedulers <em>Schedulers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedulers</em>' containment reference.
	 * @see #getSchedulers()
	 * @generated
	 */
	void setSchedulers(SchedulerEntityGroup value);

} // SchedulerPairingConstraint
