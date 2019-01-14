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
 * A representation of the model object '<em><b>Call Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallArgument#getContainingCall <em>Containing Call</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallArgument#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallArgument#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallArgument()
 * @model
 * @generated
 */
public interface CallArgument extends ReferableObject {
	/**
	 * Returns the value of the '<em><b>Containing Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.RunnableCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Call</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallArgument_ContainingCall()
	 * @see org.eclipse.app4mc.amalthea.model.RunnableCall#getArguments
	 * @model opposite="arguments" transient="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	RunnableCall getContainingCall();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(RunnableParameter)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallArgument_Parameter()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Main'"
	 * @generated
	 */
	RunnableParameter getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CallArgument#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(RunnableParameter value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(DataDependency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallArgument_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	DataDependency getDependsOn();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CallArgument#getDependsOn <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' containment reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(DataDependency value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String computeUniqueName();

} // CallArgument
