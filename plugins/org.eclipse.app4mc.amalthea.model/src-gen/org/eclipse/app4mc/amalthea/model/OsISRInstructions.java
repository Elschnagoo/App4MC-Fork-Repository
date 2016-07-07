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
 * A representation of the model object '<em><b>Os ISR Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsISRInstructions#getPreExecutionOverhead <em>Pre Execution Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsISRInstructions#getPostExecutionOverhead <em>Post Execution Overhead</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsISRInstructions()
 * @model
 * @generated
 */
public interface OsISRInstructions extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Pre Execution Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Execution Overhead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Execution Overhead</em>' containment reference.
	 * @see #setPreExecutionOverhead(OsExecutionInstructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsISRInstructions_PreExecutionOverhead()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OsExecutionInstructions getPreExecutionOverhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsISRInstructions#getPreExecutionOverhead <em>Pre Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Execution Overhead</em>' containment reference.
	 * @see #getPreExecutionOverhead()
	 * @generated
	 */
	void setPreExecutionOverhead(OsExecutionInstructions value);

	/**
	 * Returns the value of the '<em><b>Post Execution Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Execution Overhead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Execution Overhead</em>' containment reference.
	 * @see #setPostExecutionOverhead(OsExecutionInstructions)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsISRInstructions_PostExecutionOverhead()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	OsExecutionInstructions getPostExecutionOverhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsISRInstructions#getPostExecutionOverhead <em>Post Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Execution Overhead</em>' containment reference.
	 * @see #getPostExecutionOverhead()
	 * @generated
	 */
	void setPostExecutionOverhead(OsExecutionInstructions value);

} // OsISRInstructions
