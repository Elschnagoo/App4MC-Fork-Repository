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
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeSwitchEntry()
 * @model
 * @generated
 */
public interface ModeSwitchEntry extends BaseObject, INamed, ICallGraphItemContainer {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ModeConditionDisjunction)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeSwitchEntry_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModeConditionDisjunction getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ModeConditionDisjunction value);

} // ModeSwitchEntry
