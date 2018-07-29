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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataDependency#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataDependency#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataDependency#getCallArguments <em>Call Arguments</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataDependency#getContainingRunnable <em>Containing Runnable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataDependency()
 * @model
 * @generated
 */
public interface DataDependency extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataDependency_Labels()
	 * @model
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.RunnableParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataDependency_Parameters()
	 * @model
	 * @generated
	 */
	EList<RunnableParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Call Arguments</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.CallArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Arguments</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataDependency_CallArguments()
	 * @model
	 * @generated
	 */
	EList<CallArgument> getCallArguments();

	/**
	 * Returns the value of the '<em><b>Containing Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Runnable</em>' reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataDependency_ContainingRunnable()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaServices%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Runnable%&gt;&gt;getContainerOfType(this, &lt;%org.eclipse.app4mc.amalthea.model.Runnable%&gt;.class);'"
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getContainingRunnable();

} // DataDependency
