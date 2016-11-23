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
 * A representation of the model object '<em><b>Hw Memory Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Memory-Constraints for describing the least amount of properties which are required by
 * data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwMemoryProperty#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwMemoryProperty#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwMemoryProperty()
 * @model
 * @generated
 */
public interface HwMemoryProperty extends HwMemoryConstraint {
	/**
	 * Returns the value of the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' reference.
	 * @see #setMemory(Memory)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwMemoryProperty_Memory()
	 * @model
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwMemoryProperty#getMemory <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(Memory value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.ComparatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ComparatorType
	 * @see #setComparator(ComparatorType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwMemoryProperty_Comparator()
	 * @model unique="false"
	 * @generated
	 */
	ComparatorType getComparator();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwMemoryProperty#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ComparatorType
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(ComparatorType value);

} // HwMemoryProperty
