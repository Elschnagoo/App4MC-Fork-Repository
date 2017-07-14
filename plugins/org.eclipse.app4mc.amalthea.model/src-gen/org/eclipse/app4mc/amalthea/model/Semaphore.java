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
 * A representation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * name: Name of semaphore
 * maxValue: maximum number of users which can access the semaphore simultaneously
 * initialValue: number of users which access semaphore at system startup
 * priorityCeilingProtocol: enables priority ceiling for this resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getSemaphoreType <em>Semaphore Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#isPriorityCeilingProtocol <em>Priority Ceiling Protocol</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getSemaphoreAccesses <em>Semaphore Accesses</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore()
 * @model
 * @generated
 */
public interface Semaphore extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Semaphore Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.SemaphoreType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreType
	 * @see #setSemaphoreType(SemaphoreType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_SemaphoreType()
	 * @model unique="false"
	 * @generated
	 */
	SemaphoreType getSemaphoreType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getSemaphoreType <em>Semaphore Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreType
	 * @see #getSemaphoreType()
	 * @generated
	 */
	void setSemaphoreType(SemaphoreType value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_InitialValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getInitialValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_MaxValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Priority Ceiling Protocol</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Ceiling Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Ceiling Protocol</em>' attribute.
	 * @see #setPriorityCeilingProtocol(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_PriorityCeilingProtocol()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isPriorityCeilingProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#isPriorityCeilingProtocol <em>Priority Ceiling Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Ceiling Protocol</em>' attribute.
	 * @see #isPriorityCeilingProtocol()
	 * @generated
	 */
	void setPriorityCeilingProtocol(boolean value);

	/**
	 * Returns the value of the '<em><b>Semaphore Accesses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore Accesses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore Accesses</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_SemaphoreAccesses()
	 * @model opposite="semaphoreLinkInt" transient="true" suppressedSetVisibility="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	EList<SemaphoreAccess> getSemaphoreAccesses();

} // Semaphore
