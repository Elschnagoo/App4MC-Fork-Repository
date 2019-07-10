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
 * A representation of the model object '<em><b>Call Graph Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstract item of a call graph
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallGraphItem#getContainingProcess <em>Containing Process</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallGraphItem#getContainingRunnable <em>Containing Runnable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallGraphItem()
 * @model abstract="true"
 * @generated
 */
public interface CallGraphItem extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Containing Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Process</em>' reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallGraphItem_ContainingProcess()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Process getContainingProcess();

	/**
	 * Returns the value of the '<em><b>Containing Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Runnable</em>' reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallGraphItem_ContainingRunnable()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getContainingRunnable();

} // CallGraphItem
