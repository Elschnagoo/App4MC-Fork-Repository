/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation#getSchedulingParameters <em>Scheduling Parameters</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation#getParameterExtensions <em>Parameter Extensions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAssociation()
 * @model
 * @generated
 */
public interface SchedulerAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getParentAssociation <em>Parent Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAssociation_Child()
	 * @see org.eclipse.app4mc.amalthea.model.TaskScheduler#getParentAssociation
	 * @model opposite="parentAssociation" transient="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	TaskScheduler getChild();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(TaskScheduler)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAssociation_Parent()
	 * @model
	 * @generated
	 */
	TaskScheduler getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TaskScheduler value);

	/**
	 * Returns the value of the '<em><b>Scheduling Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Parameters</em>' containment reference.
	 * @see #setSchedulingParameters(SchedulingParameters)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAssociation_SchedulingParameters()
	 * @model containment="true"
	 * @generated
	 */
	SchedulingParameters getSchedulingParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation#getSchedulingParameters <em>Scheduling Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Parameters</em>' containment reference.
	 * @see #getSchedulingParameters()
	 * @generated
	 */
	void setSchedulingParameters(SchedulingParameters value);

	/**
	 * Returns the value of the '<em><b>Parameter Extensions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Extensions</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Extensions</em>' map.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSchedulerAssociation_ParameterExtensions()
	 * @model mapType="org.eclipse.app4mc.amalthea.model.ParameterExtension&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getParameterExtensions();

} // SchedulerAssociation
