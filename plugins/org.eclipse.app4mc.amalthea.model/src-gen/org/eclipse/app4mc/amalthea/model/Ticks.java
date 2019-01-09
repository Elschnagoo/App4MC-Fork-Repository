/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of the execution IDiscreteDeviation of a Runnable (default and core-specific)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Ticks#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Ticks#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTicks()
 * @model
 * @generated
 */
public interface Ticks extends ComputationItem {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(IDiscreteDeviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTicks_Default()
	 * @model containment="true"
	 * @generated
	 */
	IDiscreteDeviation getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Ticks#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(IDiscreteDeviation value);

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' map.
	 * The key is of type {@link org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition},
	 * and the value is of type {@link org.eclipse.app4mc.amalthea.model.IDiscreteDeviation},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTicks_Extended()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.TicksEntry&lt;org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition, org.eclipse.app4mc.amalthea.model.IDiscreteDeviation&gt;"
	 * @generated
	 */
	EMap<ProcessingUnitDefinition, IDiscreteDeviation> getExtended();

} // Ticks
