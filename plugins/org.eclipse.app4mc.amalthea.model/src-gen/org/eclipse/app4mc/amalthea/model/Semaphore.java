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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getInitalValue <em>Inital Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#isPriorityCeilingProtocol <em>Priority Ceiling Protocol</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore()
 * @model
 * @generated
 */
public interface Semaphore extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Inital Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inital Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inital Value</em>' attribute.
	 * @see #setInitalValue(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_InitalValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getInitalValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getInitalValue <em>Inital Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inital Value</em>' attribute.
	 * @see #getInitalValue()
	 * @generated
	 */
	void setInitalValue(int value);

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

} // Semaphore
