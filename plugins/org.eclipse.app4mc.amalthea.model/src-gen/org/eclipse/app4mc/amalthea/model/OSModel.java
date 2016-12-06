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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * ===============================================================================
 * ===============================================================================
 * 
 * 								OS Model
 * 
 * ===============================================================================
 * ===============================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OSModel#getOsDataConsistency <em>Os Data Consistency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OSModel#getSemaphores <em>Semaphores</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OSModel#getOperatingSystems <em>Operating Systems</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OSModel#getOsOverheads <em>Os Overheads</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOSModel()
 * @model
 * @generated
 */
public interface OSModel extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Os Data Consistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Data Consistency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Data Consistency</em>' containment reference.
	 * @see #setOsDataConsistency(OsDataConsistency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOSModel_OsDataConsistency()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OsDataConsistency getOsDataConsistency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OSModel#getOsDataConsistency <em>Os Data Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Data Consistency</em>' containment reference.
	 * @see #getOsDataConsistency()
	 * @generated
	 */
	void setOsDataConsistency(OsDataConsistency value);

	/**
	 * Returns the value of the '<em><b>Semaphores</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Semaphore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphores</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOSModel_Semaphores()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Semaphore> getSemaphores();

	/**
	 * Returns the value of the '<em><b>Operating Systems</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.OperatingSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Systems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Systems</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOSModel_OperatingSystems()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OperatingSystem> getOperatingSystems();

	/**
	 * Returns the value of the '<em><b>Os Overheads</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.OsInstructions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Overheads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Overheads</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOSModel_OsOverheads()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OsInstructions> getOsOverheads();

} // OSModel
