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
 * A representation of the model object '<em><b>Mode Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A switch in the call graph, the selected path depends on the value of the provided mode conditions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeSwitch#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeSwitch#getDefaultEntry <em>Default Entry</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeSwitch()
 * @model
 * @generated
 */
public interface ModeSwitch extends CallGraphItem {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ModeSwitchEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeSwitch_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModeSwitchEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Default Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Entry</em>' containment reference.
	 * @see #setDefaultEntry(ModeSwitchDefault)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeSwitch_DefaultEntry()
	 * @model containment="true"
	 * @generated
	 */
	ModeSwitchDefault getDefaultEntry();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeSwitch#getDefaultEntry <em>Default Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Entry</em>' containment reference.
	 * @see #getDefaultEntry()
	 * @generated
	 */
	void setDefaultEntry(ModeSwitchDefault value);

} // ModeSwitch
