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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Component#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Component#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Component#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Component#getSemaphores <em>Semaphores</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Component#getOsEvents <em>Os Events</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComponent_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.AbstractProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComponent_Tasks()
	 * @model
	 * @generated
	 */
	EList<AbstractProcess> getTasks();

	/**
	 * Returns the value of the '<em><b>Runnables</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnables</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComponent_Runnables()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunnables();

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComponent_Labels()
	 * @model
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Semaphores</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Semaphore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphores</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComponent_Semaphores()
	 * @model
	 * @generated
	 */
	EList<Semaphore> getSemaphores();

	/**
	 * Returns the value of the '<em><b>Os Events</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.OsEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Events</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComponent_OsEvents()
	 * @model
	 * @generated
	 */
	EList<OsEvent> getOsEvents();

} // Component
