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
 * A representation of the model object '<em><b>Order Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The order constraint defines a sequence of events
 * The restriction is based on the correct order of the occurrences
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OrderConstraint#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OrderConstraint#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOrderConstraint()
 * @model
 * @generated
 */
public interface OrderConstraint extends TimingConstraint, BaseObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EntityEvent)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOrderConstraint_Source()
	 * @model
	 * @generated
	 */
	EntityEvent getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OrderConstraint#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EntityEvent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EntityEvent)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOrderConstraint_Target()
	 * @model
	 * @generated
	 */
	EntityEvent getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OrderConstraint#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EntityEvent value);

} // OrderConstraint
