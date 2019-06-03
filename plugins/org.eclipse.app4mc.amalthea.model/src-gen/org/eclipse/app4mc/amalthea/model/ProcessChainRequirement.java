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
 * A representation of the model object '<em><b>Process Chain Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessChainRequirement#getProcessChain <em>Process Chain</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessChainRequirement()
 * @model
 * @generated
 */
public interface ProcessChainRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Process Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Chain</em>' reference.
	 * @see #setProcessChain(ProcessChain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessChainRequirement_ProcessChain()
	 * @model required="true"
	 * @generated
	 */
	ProcessChain getProcessChain();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessChainRequirement#getProcessChain <em>Process Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Chain</em>' reference.
	 * @see #getProcessChain()
	 * @generated
	 */
	void setProcessChain(ProcessChain value);

} // ProcessChainRequirement
