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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enforced Migration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Migrates task to core of resource owner
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EnforcedMigration#getResourceOwner <em>Resource Owner</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEnforcedMigration()
 * @model
 * @generated
 */
public interface EnforcedMigration extends CallSequenceItem {
	/**
	 * Returns the value of the '<em><b>Resource Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Owner</em>' reference.
	 * @see #setResourceOwner(Scheduler)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEnforcedMigration_ResourceOwner()
	 * @model
	 * @generated
	 */
	Scheduler getResourceOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EnforcedMigration#getResourceOwner <em>Resource Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Owner</em>' reference.
	 * @see #getResourceOwner()
	 * @generated
	 */
	void setResourceOwner(Scheduler value);

} // EnforcedMigration
