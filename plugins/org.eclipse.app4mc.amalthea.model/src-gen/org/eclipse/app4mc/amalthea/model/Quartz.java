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
 * A representation of the model object '<em><b>Quartz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Quartz#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Quartz#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getQuartz()
 * @model
 * @generated
 */
public interface Quartz extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(Frequency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getQuartz_Frequency()
	 * @model containment="true"
	 * @generated
	 */
	Frequency getFrequency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Quartz#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Frequency value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.QType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.QType
	 * @see #setType(QType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getQuartz_Type()
	 * @model unique="false"
	 * @generated
	 */
	QType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Quartz#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.QType
	 * @see #getType()
	 * @generated
	 */
	void setType(QType value);

} // Quartz
