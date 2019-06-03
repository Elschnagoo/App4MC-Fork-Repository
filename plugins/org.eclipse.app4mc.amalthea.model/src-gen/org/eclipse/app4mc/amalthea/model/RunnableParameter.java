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
 * A representation of the model object '<em><b>Runnable Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableParameter#getContainingRunnable <em>Containing Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableParameter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableParameter#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableParameter()
 * @model
 * @generated
 */
public interface RunnableParameter extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Containing Runnable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.Runnable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Runnable</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableParameter_ContainingRunnable()
	 * @see org.eclipse.app4mc.amalthea.model.Runnable#getParameters
	 * @model opposite="parameters" transient="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getContainingRunnable();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableParameter_Direction()
	 * @model unique="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(TypeDefinition)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableParameter_DataType()
	 * @model
	 * @generated
	 */
	TypeDefinition getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableParameter#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(DataDependency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableParameter_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	DataDependency getDependsOn();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RunnableParameter#getDependsOn <em>Depends On</em>}' containment reference.
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
	String getNamePrefix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

} // RunnableParameter
