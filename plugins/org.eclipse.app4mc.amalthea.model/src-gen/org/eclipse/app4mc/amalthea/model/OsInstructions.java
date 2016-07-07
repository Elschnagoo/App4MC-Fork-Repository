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
 * A representation of the model object '<em><b>Os Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getApiOverhead <em>Api Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getIsrCategory1Overhead <em>Isr Category1 Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getIsrCategory2Overhead <em>Isr Category2 Overhead</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsInstructions()
 * @model
 * @generated
 */
public interface OsInstructions extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Api Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Overhead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Overhead</em>' containment reference.
	 * @see #setApiOverhead(OsAPIInstructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsInstructions_ApiOverhead()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OsAPIInstructions getApiOverhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getApiOverhead <em>Api Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Overhead</em>' containment reference.
	 * @see #getApiOverhead()
	 * @generated
	 */
	void setApiOverhead(OsAPIInstructions value);

	/**
	 * Returns the value of the '<em><b>Isr Category1 Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isr Category1 Overhead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr Category1 Overhead</em>' containment reference.
	 * @see #setIsrCategory1Overhead(OsISRInstructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsInstructions_IsrCategory1Overhead()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OsISRInstructions getIsrCategory1Overhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getIsrCategory1Overhead <em>Isr Category1 Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isr Category1 Overhead</em>' containment reference.
	 * @see #getIsrCategory1Overhead()
	 * @generated
	 */
	void setIsrCategory1Overhead(OsISRInstructions value);

	/**
	 * Returns the value of the '<em><b>Isr Category2 Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isr Category2 Overhead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr Category2 Overhead</em>' containment reference.
	 * @see #setIsrCategory2Overhead(OsISRInstructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsInstructions_IsrCategory2Overhead()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OsISRInstructions getIsrCategory2Overhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsInstructions#getIsrCategory2Overhead <em>Isr Category2 Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isr Category2 Overhead</em>' containment reference.
	 * @see #getIsrCategory2Overhead()
	 * @generated
	 */
	void setIsrCategory2Overhead(OsISRInstructions value);

} // OsInstructions
