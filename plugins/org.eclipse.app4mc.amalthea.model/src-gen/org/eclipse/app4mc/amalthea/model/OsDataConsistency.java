/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Data Consistency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsDataConsistency#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsDataConsistency#getDataStability <em>Data Stability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsDataConsistency#getNonAtomicDataCoherency <em>Non Atomic Data Coherency</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsDataConsistency()
 * @model
 * @generated
 */
public interface OsDataConsistency extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.OsDataConsistencyMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.OsDataConsistencyMode
	 * @see #setMode(OsDataConsistencyMode)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsDataConsistency_Mode()
	 * @model unique="false"
	 * @generated
	 */
	OsDataConsistencyMode getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsDataConsistency#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.OsDataConsistencyMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(OsDataConsistencyMode value);

	/**
	 * Returns the value of the '<em><b>Data Stability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Stability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Stability</em>' containment reference.
	 * @see #setDataStability(DataStability)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsDataConsistency_DataStability()
	 * @model containment="true"
	 * @generated
	 */
	DataStability getDataStability();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsDataConsistency#getDataStability <em>Data Stability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Stability</em>' containment reference.
	 * @see #getDataStability()
	 * @generated
	 */
	void setDataStability(DataStability value);

	/**
	 * Returns the value of the '<em><b>Non Atomic Data Coherency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Atomic Data Coherency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Atomic Data Coherency</em>' containment reference.
	 * @see #setNonAtomicDataCoherency(NonAtomicDataCoherency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsDataConsistency_NonAtomicDataCoherency()
	 * @model containment="true"
	 * @generated
	 */
	NonAtomicDataCoherency getNonAtomicDataCoherency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsDataConsistency#getNonAtomicDataCoherency <em>Non Atomic Data Coherency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Atomic Data Coherency</em>' containment reference.
	 * @see #getNonAtomicDataCoherency()
	 * @generated
	 */
	void setNonAtomicDataCoherency(NonAtomicDataCoherency value);

} // OsDataConsistency
