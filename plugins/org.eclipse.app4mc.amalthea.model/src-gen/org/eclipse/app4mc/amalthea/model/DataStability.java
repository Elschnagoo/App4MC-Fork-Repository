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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Stability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataStability#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataStability#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataStability#getAccessMultiplicity <em>Access Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataStability#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataStability()
 * @model
 * @generated
 */
public interface DataStability extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataStability_Enabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataStability#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataStability_Algorithm()
	 * @model unique="false"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataStability#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Access Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.AccessMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Multiplicity</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.AccessMultiplicity
	 * @see #setAccessMultiplicity(AccessMultiplicity)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataStability_AccessMultiplicity()
	 * @model unique="false"
	 * @generated
	 */
	AccessMultiplicity getAccessMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataStability#getAccessMultiplicity <em>Access Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Multiplicity</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.AccessMultiplicity
	 * @see #getAccessMultiplicity()
	 * @generated
	 */
	void setAccessMultiplicity(AccessMultiplicity value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.DataStabilityLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DataStabilityLevel
	 * @see #setLevel(DataStabilityLevel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataStability_Level()
	 * @model unique="false"
	 * @generated
	 */
	DataStabilityLevel getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataStability#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DataStabilityLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(DataStabilityLevel value);

} // DataStability
