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
 * A representation of the model object '<em><b>Hw Access Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  AccessPath represented by directly referencing to existing HW elements (Ports)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getHwElements <em>Hw Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessPath()
 * @model
 * @generated
 */
public interface HwAccessPath extends AccessPath {
	/**
	 * Returns the value of the '<em><b>Hw Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwAccessPathElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw Elements</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessPath_HwElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwAccessPathElement> getHwElements();

} // HwAccessPath
