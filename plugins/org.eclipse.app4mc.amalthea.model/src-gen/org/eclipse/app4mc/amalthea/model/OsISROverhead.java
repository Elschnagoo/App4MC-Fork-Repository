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
 * A representation of the model object '<em><b>Os ISR Overhead</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsISROverhead#getPreExecutionOverhead <em>Pre Execution Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsISROverhead#getPostExecutionOverhead <em>Post Execution Overhead</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsISROverhead()
 * @model
 * @generated
 */
public interface OsISROverhead extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Pre Execution Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Execution Overhead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Execution Overhead</em>' containment reference.
	 * @see #setPreExecutionOverhead(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsISROverhead_PreExecutionOverhead()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getPreExecutionOverhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsISROverhead#getPreExecutionOverhead <em>Pre Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Execution Overhead</em>' containment reference.
	 * @see #getPreExecutionOverhead()
	 * @generated
	 */
	void setPreExecutionOverhead(ExecutionTicks value);

	/**
	 * Returns the value of the '<em><b>Post Execution Overhead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Execution Overhead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Execution Overhead</em>' containment reference.
	 * @see #setPostExecutionOverhead(ExecutionTicks)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsISROverhead_PostExecutionOverhead()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTicks getPostExecutionOverhead();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsISROverhead#getPostExecutionOverhead <em>Post Execution Overhead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Execution Overhead</em>' containment reference.
	 * @see #getPostExecutionOverhead()
	 * @generated
	 */
	void setPostExecutionOverhead(ExecutionTicks value);

} // OsISROverhead