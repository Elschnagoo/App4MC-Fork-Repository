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
 * A representation of the model object '<em><b>Crossbar Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CrossbarSwitch#getConConnections <em>Con Connections</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCrossbarSwitch()
 * @model
 * @generated
 */
public interface CrossbarSwitch extends NetworkType {
	/**
	 * Returns the value of the '<em><b>Con Connections</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Con Connections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Con Connections</em>' attribute.
	 * @see #setConConnections(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCrossbarSwitch_ConConnections()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getConConnections();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CrossbarSwitch#getConConnections <em>Con Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Connections</em>' attribute.
	 * @see #getConConnections()
	 * @generated
	 */
	void setConConnections(int value);

} // CrossbarSwitch
