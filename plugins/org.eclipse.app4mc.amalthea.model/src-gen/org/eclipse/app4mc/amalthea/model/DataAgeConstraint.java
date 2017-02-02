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
 * A representation of the model object '<em><b>Data Age Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getDataAge <em>Data Age</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeConstraint()
 * @model
 * @generated
 */
public interface DataAgeConstraint extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable</em>' reference.
	 * @see #setRunnable(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeConstraint_Runnable()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getRunnable <em>Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runnable</em>' reference.
	 * @see #getRunnable()
	 * @generated
	 */
	void setRunnable(org.eclipse.app4mc.amalthea.model.Runnable value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(Label)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeConstraint_Label()
	 * @model required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Data Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Age</em>' containment reference.
	 * @see #setDataAge(DataAge)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataAgeConstraint_DataAge()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataAge getDataAge();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataAgeConstraint#getDataAge <em>Data Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Age</em>' containment reference.
	 * @see #getDataAge()
	 * @generated
	 */
	void setDataAge(DataAge value);

} // DataAgeConstraint
