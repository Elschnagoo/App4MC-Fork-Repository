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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAnnotatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IAnnotatable: Possibility to store custom properties on elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.IAnnotatable#getCustomProperties <em>Custom Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getIAnnotatable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAnnotatable extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.app4mc.amalthea.model.Value},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Properties</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Properties</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getIAnnotatable_CustomProperties()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.CustomProperty&lt;org.eclipse.emf.ecore.EString, org.eclipse.app4mc.amalthea.model.Value&gt;"
	 * @generated
	 */
	EMap<String, Value> getCustomProperties();

} // IAnnotatable
