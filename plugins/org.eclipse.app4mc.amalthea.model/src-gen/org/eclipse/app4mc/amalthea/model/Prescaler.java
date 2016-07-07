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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescaler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Prescaler#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Prescaler#getClockRatio <em>Clock Ratio</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Prescaler#getQuartz <em>Quartz</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPrescaler()
 * @model
 * @generated
 */
public interface Prescaler extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPrescaler_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Prescaler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Clock Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Ratio</em>' attribute.
	 * @see #setClockRatio(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPrescaler_ClockRatio()
	 * @model unique="false"
	 * @generated
	 */
	double getClockRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Prescaler#getClockRatio <em>Clock Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Ratio</em>' attribute.
	 * @see #getClockRatio()
	 * @generated
	 */
	void setClockRatio(double value);

	/**
	 * Returns the value of the '<em><b>Quartz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quartz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quartz</em>' reference.
	 * @see #setQuartz(Quartz)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPrescaler_Quartz()
	 * @model required="true"
	 * @generated
	 */
	Quartz getQuartz();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Prescaler#getQuartz <em>Quartz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quartz</em>' reference.
	 * @see #getQuartz()
	 * @generated
	 */
	void setQuartz(Quartz value);

} // Prescaler
