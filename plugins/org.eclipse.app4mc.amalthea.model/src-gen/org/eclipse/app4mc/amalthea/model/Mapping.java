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
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generalization for all Mapping types.
 * Mappings assign Runnables/Signals to memories
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Mapping#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Mapping#getMemoryPositionAddress <em>Memory Position Address</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMapping()
 * @model abstract="true"
 *        features="memoryLinkInt" 
 *        memoryLinkIntType="org.eclipse.app4mc.amalthea.model.Memory" memoryLinkIntOpposite="mappings" memoryLinkIntTransient="true" memoryLinkIntSuppressedGetVisibility="true" memoryLinkIntSuppressedSetVisibility="true"
 *        memoryLinkIntAnnotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
 * @generated
 */
public interface Mapping extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The memory where the element is mapped to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory</em>' reference.
	 * @see #setMemory(Memory)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMapping_Memory()
	 * @model
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Mapping#getMemory <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(Memory value);

	/**
	 * Returns the value of the '<em><b>Memory Position Address</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of the element in the mapped memory
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Position Address</em>' attribute.
	 * @see #setMemoryPositionAddress(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMapping_MemoryPositionAddress()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getMemoryPositionAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Mapping#getMemoryPositionAddress <em>Memory Position Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Position Address</em>' attribute.
	 * @see #getMemoryPositionAddress()
	 * @generated
	 */
	void setMemoryPositionAddress(long value);

} // Mapping
