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
 * A representation of the model object '<em><b>Runnable Sequencing Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint#getRunnableGroups <em>Runnable Groups</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint#getProcessScope <em>Process Scope</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableSequencingConstraint()
 * @model
 * @generated
 */
public interface RunnableSequencingConstraint extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.RunnableOrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableOrderType
	 * @see #setOrderType(RunnableOrderType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableSequencingConstraint_OrderType()
	 * @model unique="false"
	 * @generated
	 */
	RunnableOrderType getOrderType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint#getOrderType <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableOrderType
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(RunnableOrderType value);

	/**
	 * Returns the value of the '<em><b>Runnable Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.RunnableEntityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable Groups</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableSequencingConstraint_RunnableGroups()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<RunnableEntityGroup> getRunnableGroups();

	/**
	 * Returns the value of the '<em><b>Process Scope</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.AbstractProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Scope</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableSequencingConstraint_ProcessScope()
	 * @model
	 * @generated
	 */
	EList<AbstractProcess> getProcessScope();

} // RunnableSequencingConstraint
