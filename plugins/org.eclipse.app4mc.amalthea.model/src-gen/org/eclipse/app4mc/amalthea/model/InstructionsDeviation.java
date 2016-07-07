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
 * A representation of the model object '<em><b>Instructions Deviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a deviated set of execution cycles
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InstructionsDeviation#getDeviation <em>Deviation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInstructionsDeviation()
 * @model
 * @generated
 */
public interface InstructionsDeviation extends Instructions {
	/**
	 * Returns the value of the '<em><b>Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviation</em>' containment reference.
	 * @see #setDeviation(Deviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInstructionsDeviation_Deviation()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Deviation<LongObject> getDeviation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.InstructionsDeviation#getDeviation <em>Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviation</em>' containment reference.
	 * @see #getDeviation()
	 * @generated
	 */
	void setDeviation(Deviation<LongObject> value);

} // InstructionsDeviation
