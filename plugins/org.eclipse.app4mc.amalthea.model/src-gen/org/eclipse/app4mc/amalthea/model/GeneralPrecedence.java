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
 * A representation of the model object '<em><b>General Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General abstraction for precedence
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.GeneralPrecedence#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.GeneralPrecedence#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGeneralPrecedence()
 * @model abstract="true"
 * @generated
 */
public interface GeneralPrecedence extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGeneralPrecedence_Origin()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.GeneralPrecedence#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(org.eclipse.app4mc.amalthea.model.Runnable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGeneralPrecedence_Target()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.GeneralPrecedence#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(org.eclipse.app4mc.amalthea.model.Runnable value);

} // GeneralPrecedence
