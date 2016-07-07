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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability Switch Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A switch entry for a ProbabiltitySwitch
 * It describes a path of the switch and it's probability
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry#getGraphEntries <em>Graph Entries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProbabilitySwitchEntry()
 * @model
 * @generated
 */
public interface ProbabilitySwitchEntry extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProbabilitySwitchEntry_Probability()
	 * @model unique="false"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Graph Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.GraphEntryBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Entries</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProbabilitySwitchEntry_GraphEntries()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<GraphEntryBase> getGraphEntries();

} // ProbabilitySwitchEntry
