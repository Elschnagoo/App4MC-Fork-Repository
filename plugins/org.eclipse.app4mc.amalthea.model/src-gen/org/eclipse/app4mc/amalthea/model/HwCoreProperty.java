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
 * A representation of the model object '<em><b>Hw Core Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Core-Constraints for describing the least amount of properties which are required by
 * executables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwCoreProperty#getCore <em>Core</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwCoreProperty#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwCoreProperty()
 * @model
 * @generated
 */
public interface HwCoreProperty extends HwCoreConstraint {
	/**
	 * Returns the value of the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' reference.
	 * @see #setCore(Core)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwCoreProperty_Core()
	 * @model
	 * @generated
	 */
	Core getCore();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwCoreProperty#getCore <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Core value);

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwCoreProperty_Comparator()
	 * @model unique="false"
	 * @generated
	 */
	ComparatorType getComparator();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwCoreProperty#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ComparatorType
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(ComparatorType value);

} // HwCoreProperty
