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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mapping of AbstractMemoryElement (Label, Runnable, ISR, Task, ...)
 * to a specific memory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryMapping#getAbstractElement <em>Abstract Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryMapping#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MemoryMapping#getMemoryPositionAddress <em>Memory Position Address</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryMapping()
 * @model features="abstractElementLinkInt memoryLinkInt" 
 *        abstractElementLinkIntType="org.eclipse.app4mc.amalthea.model.AbstractMemoryElement" abstractElementLinkIntOpposite="mappings" abstractElementLinkIntTransient="true" abstractElementLinkIntSuppressedGetVisibility="true" abstractElementLinkIntSuppressedSetVisibility="true"
 *        abstractElementLinkIntAnnotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
 *        memoryLinkIntType="org.eclipse.app4mc.amalthea.model.Memory" memoryLinkIntOpposite="mappings" memoryLinkIntTransient="true" memoryLinkIntSuppressedGetVisibility="true" memoryLinkIntSuppressedSetVisibility="true"
 *        memoryLinkIntAnnotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
 * @generated
 */
public interface MemoryMapping extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Element</em>' reference.
	 * @see #setAbstractElement(AbstractMemoryElement)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryMapping_AbstractElement()
	 * @model required="true"
	 * @generated
	 */
	AbstractMemoryElement getAbstractElement();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryMapping#getAbstractElement <em>Abstract Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Element</em>' reference.
	 * @see #getAbstractElement()
	 * @generated
	 */
	void setAbstractElement(AbstractMemoryElement value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' reference.
	 * @see #setMemory(Memory)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryMapping_Memory()
	 * @model
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryMapping#getMemory <em>Memory</em>}' reference.
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemoryMapping_MemoryPositionAddress()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getMemoryPositionAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MemoryMapping#getMemoryPositionAddress <em>Memory Position Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Position Address</em>' attribute.
	 * @see #getMemoryPositionAddress()
	 * @generated
	 */
	void setMemoryPositionAddress(long value);

} // MemoryMapping