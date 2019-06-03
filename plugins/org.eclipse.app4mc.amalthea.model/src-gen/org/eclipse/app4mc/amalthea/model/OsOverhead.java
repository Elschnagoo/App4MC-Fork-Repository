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
 * A representation of the model object '<em><b>Os Overhead</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsOverhead#getApiOverhead <em>Api Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsOverhead#getIsrCategory1Overhead <em>Isr Category1 Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsOverhead#getIsrCategory2Overhead <em>Isr Category2 Overhead</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsOverhead()
 * @model
 * @generated
 */
public interface OsOverhead extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Api Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Overhead</em>' containment reference.
	 * @see #setApiOverhead(OsAPIOverhead)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsOverhead_ApiOverhead()
	 * @model containment="true"
	 * @generated
	 */
	OsAPIOverhead getApiOverhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsOverhead#getApiOverhead <em>Api Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Overhead</em>' containment reference.
	 * @see #getApiOverhead()
	 * @generated
	 */
	void setApiOverhead(OsAPIOverhead value);

	/**
	 * Returns the value of the '<em><b>Isr Category1 Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr Category1 Overhead</em>' containment reference.
	 * @see #setIsrCategory1Overhead(OsISROverhead)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsOverhead_IsrCategory1Overhead()
	 * @model containment="true"
	 * @generated
	 */
	OsISROverhead getIsrCategory1Overhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsOverhead#getIsrCategory1Overhead <em>Isr Category1 Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isr Category1 Overhead</em>' containment reference.
	 * @see #getIsrCategory1Overhead()
	 * @generated
	 */
	void setIsrCategory1Overhead(OsISROverhead value);

	/**
	 * Returns the value of the '<em><b>Isr Category2 Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr Category2 Overhead</em>' containment reference.
	 * @see #setIsrCategory2Overhead(OsISROverhead)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsOverhead_IsrCategory2Overhead()
	 * @model containment="true"
	 * @generated
	 */
	OsISROverhead getIsrCategory2Overhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsOverhead#getIsrCategory2Overhead <em>Isr Category2 Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isr Category2 Overhead</em>' containment reference.
	 * @see #getIsrCategory2Overhead()
	 * @generated
	 */
	void setIsrCategory2Overhead(OsISROverhead value);

} // OsOverhead
