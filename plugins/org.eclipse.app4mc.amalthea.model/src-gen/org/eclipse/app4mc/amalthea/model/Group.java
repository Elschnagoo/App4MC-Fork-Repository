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
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a group of deviation runnable items
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Group#isOrdered <em>Ordered</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends CallGraphItem, INamed, ICallGraphItemContainer {
	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getGroup_Ordered()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Group#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

} // Group
