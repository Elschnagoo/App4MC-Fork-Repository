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
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Core#getCoreType <em>Core Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Core#getLockstepGroup <em>Lockstep Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCore()
 * @model
 * @generated
 */
public interface Core extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Core Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Type</em>' reference.
	 * @see #setCoreType(CoreType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCore_CoreType()
	 * @model
	 * @generated
	 */
	CoreType getCoreType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Core#getCoreType <em>Core Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Type</em>' reference.
	 * @see #getCoreType()
	 * @generated
	 */
	void setCoreType(CoreType value);

	/**
	 * Returns the value of the '<em><b>Lockstep Group</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lockstep Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lockstep Group</em>' attribute.
	 * @see #setLockstepGroup(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCore_LockstepGroup()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getLockstepGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Core#getLockstepGroup <em>Lockstep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lockstep Group</em>' attribute.
	 * @see #getLockstepGroup()
	 * @generated
	 */
	void setLockstepGroup(int value);

} // Core
