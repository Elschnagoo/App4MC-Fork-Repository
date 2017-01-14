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
 * A representation of the model object '<em><b>HW Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getSystemTypes <em>System Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getEcuTypes <em>Ecu Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getMcTypes <em>Mc Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getCoreTypes <em>Core Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getMemoryTypes <em>Memory Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getNetworkTypes <em>Network Types</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getAccessPaths <em>Access Paths</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HWModel#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel()
 * @model
 * @generated
 */
public interface HWModel extends BaseObject {
	/**
	 * Returns the value of the '<em><b>System Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.SystemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Types</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_SystemTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemType> getSystemTypes();

	/**
	 * Returns the value of the '<em><b>Ecu Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ECUType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecu Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecu Types</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_EcuTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ECUType> getEcuTypes();

	/**
	 * Returns the value of the '<em><b>Mc Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.MicrocontrollerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mc Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mc Types</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_McTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MicrocontrollerType> getMcTypes();

	/**
	 * Returns the value of the '<em><b>Core Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.CoreType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Types</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_CoreTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoreType> getCoreTypes();

	/**
	 * Returns the value of the '<em><b>Memory Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.MemoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Types</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_MemoryTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryType> getMemoryTypes();

	/**
	 * Returns the value of the '<em><b>Network Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.NetworkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Types</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_NetworkTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkType> getNetworkTypes();

	/**
	 * Returns the value of the '<em><b>Access Paths</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.AccessPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Paths</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_AccessPaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessPath> getAccessPaths();

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(HwSystem)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHWModel_System()
	 * @model containment="true"
	 * @generated
	 */
	HwSystem getSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HWModel#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(HwSystem value);

} // HWModel
