/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Mode Switch Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A switch entry for a ModeSwitch.
 * It describes a path of the switch and the required mode condition to use this path
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeSwitchEntry()
 * @model
 * @generated
 */
public interface ModeSwitchEntry<T> extends BaseObject, INamed {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ModeValueDisjunction)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeSwitchEntry_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModeValueDisjunction getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ModeValueDisjunction value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeSwitchEntry_Items()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	EList<T> getItems();

} // ModeSwitchEntry
