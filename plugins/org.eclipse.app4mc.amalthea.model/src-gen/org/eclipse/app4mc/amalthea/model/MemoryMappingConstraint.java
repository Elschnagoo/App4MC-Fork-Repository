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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Mapping Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract Class, used to describe Constraints for Mapping
 * (these usually target Memories and their features/attributes)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint#getMemoryClassification <em>Memory Classification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryMappingConstraint()
 * @model abstract="true"
 * @generated
 */
public interface MemoryMappingConstraint extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Memory Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Classification</em>' containment reference.
	 * @see #setMemoryClassification(MemoryClassification)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryMappingConstraint_MemoryClassification()
	 * @model containment="true"
	 * @generated
	 */
	MemoryClassification getMemoryClassification();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryMappingConstraint#getMemoryClassification <em>Memory Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Classification</em>' containment reference.
	 * @see #getMemoryClassification()
	 * @generated
	 */
	void setMemoryClassification(MemoryClassification value);

} // MemoryMappingConstraint