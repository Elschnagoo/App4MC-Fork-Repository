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
 * A representation of the model object '<em><b>Abstract Element Mapping Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AbstractElementMappingConstraints describe the constraints for
 * AbstractMemoryElement-to-Memory Mapping
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint#getAbstractElement <em>Abstract Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractElementMappingConstraint()
 * @model
 * @generated
 */
public interface AbstractElementMappingConstraint extends MemoryMappingConstraint {
	/**
	 * Returns the value of the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Element</em>' reference.
	 * @see #setAbstractElement(AbstractMemoryElement)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractElementMappingConstraint_AbstractElement()
	 * @model
	 * @generated
	 */
	AbstractMemoryElement getAbstractElement();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint#getAbstractElement <em>Abstract Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Element</em>' reference.
	 * @see #getAbstractElement()
	 * @generated
	 */
	void setAbstractElement(AbstractMemoryElement value);

} // AbstractElementMappingConstraint
