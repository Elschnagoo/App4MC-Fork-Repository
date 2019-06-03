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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwStructure#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwStructure#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwStructure#getStructures <em>Structures</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwStructure#getModules <em>Modules</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwStructure#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwStructure#getInnerPorts <em>Inner Ports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwStructure()
 * @model
 * @generated
 */
public interface HwStructure extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Structure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.StructureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.StructureType
	 * @see #setStructureType(StructureType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwStructure_StructureType()
	 * @model unique="false"
	 * @generated
	 */
	StructureType getStructureType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwStructure#getStructureType <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.StructureType
	 * @see #getStructureType()
	 * @generated
	 */
	void setStructureType(StructureType value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwStructure_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwStructure_Structures()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwStructure> getStructures();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwStructure_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwModule> getModules();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwStructure_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<HwConnection> getConnections();

	/**
	 * Returns the value of the '<em><b>Inner Ports</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Ports</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwStructure_InnerPorts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	EList<HwPort> getInnerPorts();

} // HwStructure
