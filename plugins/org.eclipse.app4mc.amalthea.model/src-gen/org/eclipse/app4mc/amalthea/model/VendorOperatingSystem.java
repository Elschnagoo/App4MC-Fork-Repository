/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Vendor Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getOsName <em>Os Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVendorOperatingSystem()
 * @model
 * @generated
 */
public interface VendorOperatingSystem extends OperatingSystem {
	/**
	 * Returns the value of the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Name</em>' attribute.
	 * @see #setOsName(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVendorOperatingSystem_OsName()
	 * @model unique="false"
	 * @generated
	 */
	String getOsName();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getOsName <em>Os Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Name</em>' attribute.
	 * @see #getOsName()
	 * @generated
	 */
	void setOsName(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVendorOperatingSystem_Vendor()
	 * @model unique="false"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVendorOperatingSystem_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.VendorOperatingSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // VendorOperatingSystem
