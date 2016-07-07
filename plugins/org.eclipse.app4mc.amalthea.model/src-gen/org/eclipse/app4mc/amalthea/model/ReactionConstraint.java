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
 * A representation of the model object '<em><b>Reaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getReactionConstraint()
 * @model
 * @generated
 */
public interface ReactionConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(EventChain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getReactionConstraint_Scope()
	 * @model
	 * @generated
	 */
	EventChain getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EventChain value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' containment reference.
	 * @see #setMinimum(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getReactionConstraint_Minimum()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Time getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getMinimum <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' containment reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Time value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' containment reference.
	 * @see #setMaximum(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getReactionConstraint_Maximum()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Time getMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ReactionConstraint#getMaximum <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' containment reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Time value);

} // ReactionConstraint
