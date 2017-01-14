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
 * A representation of the model object '<em><b>Server Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract description for client/server communication
 * It refers to a required runnable that describes the called server operation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ServerCall#getServerRunnable <em>Server Runnable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getServerCall()
 * @model abstract="true"
 * @generated
 */
public interface ServerCall extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Server Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Runnable</em>' reference.
	 * @see #setServerRunnable(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getServerCall_ServerRunnable()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getServerRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ServerCall#getServerRunnable <em>Server Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Runnable</em>' reference.
	 * @see #getServerRunnable()
	 * @generated
	 */
	void setServerRunnable(org.eclipse.app4mc.amalthea.model.Runnable value);

} // ServerCall
