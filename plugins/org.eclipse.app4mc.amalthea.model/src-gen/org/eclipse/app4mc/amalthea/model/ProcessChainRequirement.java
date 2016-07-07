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
	 * <p>
	 * If the meaning of the '<em>Process Chain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Chain</em>' reference.
	 * @see #setProcessChain(ProcessChain)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessChainRequirement_ProcessChain()
	 * @model
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
