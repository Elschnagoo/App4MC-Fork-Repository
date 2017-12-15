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
 * A representation of the model object '<em><b>Physical Section Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getRunEntities <em>Run Entities</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPhysicalSectionMapping()
 * @model
 * @generated
 */
public interface PhysicalSectionMapping extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPhysicalSectionMapping_Origin()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Main'"
	 * @generated
	 */
	EList<Section> getOrigin();

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPhysicalSectionMapping_Memory()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Memory'"
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getMemory <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(Memory value);

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPhysicalSectionMapping_StartAddress()
	 * @model default="0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.Address"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Memory'"
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

	/**
	 * Returns the value of the '<em><b>End Address</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Address</em>' attribute.
	 * @see #setEndAddress(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPhysicalSectionMapping_EndAddress()
	 * @model default="0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.Address"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Memory'"
	 * @generated
	 */
	long getEndAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping#getEndAddress <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Address</em>' attribute.
	 * @see #getEndAddress()
	 * @generated
	 */
	void setEndAddress(long value);

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPhysicalSectionMapping_Labels()
	 * @model
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Run Entities</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Entities</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPhysicalSectionMapping_RunEntities()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunEntities();

} // PhysicalSectionMapping
