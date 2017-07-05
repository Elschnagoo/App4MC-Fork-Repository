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
 * A representation of the model object '<em><b>Complex Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getPrescaler <em>Prescaler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getMemories <em>Memories</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexNode()
 * @model abstract="true"
 * @generated
 */
public interface ComplexNode extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescaler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescaler</em>' containment reference.
	 * @see #setPrescaler(Prescaler)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexNode_Prescaler()
	 * @model containment="true"
	 * @generated
	 */
	Prescaler getPrescaler();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getPrescaler <em>Prescaler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescaler</em>' containment reference.
	 * @see #getPrescaler()
	 * @generated
	 */
	void setPrescaler(Prescaler value);

	/**
	 * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Memory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexNode_Memories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Memory> getMemories();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexNode_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexNode_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getComplexNode_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwPort> getPorts();

} // ComplexNode
