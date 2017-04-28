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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract description for a set of execution cycles
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Instructions#getFetchStatistic <em>Fetch Statistic</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInstructions()
 * @model abstract="true"
 * @generated
 */
public interface Instructions extends EObject {
	/**
	 * Returns the value of the '<em><b>Fetch Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * optional parameter for fetch statistic
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fetch Statistic</em>' containment reference.
	 * @see #setFetchStatistic(InstructionFetch)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInstructions_FetchStatistic()
	 * @model containment="true"
	 * @generated
	 */
	InstructionFetch getFetchStatistic();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Instructions#getFetchStatistic <em>Fetch Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch Statistic</em>' containment reference.
	 * @see #getFetchStatistic()
	 * @generated
	 */
	void setFetchStatistic(InstructionFetch value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean containerNotificationRequired();

} // Instructions
