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
 * A representation of the model object '<em><b>Processing Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessingUnit#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessingUnit#getAccessElements <em>Access Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessingUnit()
 * @model
 * @generated
 */
public interface ProcessingUnit extends HwModule, HwDestination, HwPathElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ProcessingUnitDefinition)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessingUnit_Definition()
	 * @model
	 * @generated
	 */
	ProcessingUnitDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessingUnit#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ProcessingUnitDefinition value);

	/**
	 * Returns the value of the '<em><b>Access Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwAccessElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Elements</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessingUnit_AccessElements()
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessElement#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<HwAccessElement> getAccessElements();

} // ProcessingUnit
