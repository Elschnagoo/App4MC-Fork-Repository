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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Chain Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A synchronization constraint describes the allowed tolerance in synchronization between two event chains
 * scope: Considered event chains that have to by in sync
 * type: Defines which parts of the event chains have to be in sync
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EventChainSynchronizationConstraint#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.EventChainSynchronizationConstraint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainSynchronizationConstraint()
 * @model
 * @generated
 */
public interface EventChainSynchronizationConstraint extends SynchronizationConstraint {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.EventChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainSynchronizationConstraint_Scope()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<EventChain> getScope();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.SynchronizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronizationType
	 * @see #setType(SynchronizationType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getEventChainSynchronizationConstraint_Type()
	 * @model unique="false"
	 * @generated
	 */
	SynchronizationType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.EventChainSynchronizationConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SynchronizationType
	 * @see #getType()
	 * @generated
	 */
	void setType(SynchronizationType value);

} // EventChainSynchronizationConstraint
