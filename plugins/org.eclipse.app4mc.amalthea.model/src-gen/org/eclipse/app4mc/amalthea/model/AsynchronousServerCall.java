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
 * A representation of the model object '<em><b>Asynchronous Server Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A asynchronous server call
 * It refers to a optional runnable that exploits the results produced by the server
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AsynchronousServerCall#getResultRunnable <em>Result Runnable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAsynchronousServerCall()
 * @model
 * @generated
 */
public interface AsynchronousServerCall extends ServerCall {
	/**
	 * Returns the value of the '<em><b>Result Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Runnable</em>' reference.
	 * @see #setResultRunnable(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAsynchronousServerCall_ResultRunnable()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getResultRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AsynchronousServerCall#getResultRunnable <em>Result Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Runnable</em>' reference.
	 * @see #getResultRunnable()
	 * @generated
	 */
	void setResultRunnable(org.eclipse.app4mc.amalthea.model.Runnable value);

} // AsynchronousServerCall
