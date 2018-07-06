/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MappingModel#getSchedulerAllocation <em>Scheduler Allocation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MappingModel#getRunnableAllocation <em>Runnable Allocation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MappingModel#getTaskAllocation <em>Task Allocation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MappingModel#getIsrAllocation <em>Isr Allocation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MappingModel#getMemoryMapping <em>Memory Mapping</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MappingModel#getPhysicalSectionMapping <em>Physical Section Mapping</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.MappingModel#getAddressMappingType <em>Address Mapping Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Scheduler Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.SchedulerAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler Allocation</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMappingModel_SchedulerAllocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchedulerAllocation> getSchedulerAllocation();

	/**
	 * Returns the value of the '<em><b>Runnable Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.RunnableAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable Allocation</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMappingModel_RunnableAllocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunnableAllocation> getRunnableAllocation();

	/**
	 * Returns the value of the '<em><b>Task Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.TaskAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Allocation</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMappingModel_TaskAllocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskAllocation> getTaskAllocation();

	/**
	 * Returns the value of the '<em><b>Isr Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ISRAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isr Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr Allocation</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMappingModel_IsrAllocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISRAllocation> getIsrAllocation();

	/**
	 * Returns the value of the '<em><b>Memory Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.MemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Mapping</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMappingModel_MemoryMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryMapping> getMemoryMapping();

	/**
	 * Returns the value of the '<em><b>Physical Section Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Section Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Section Mapping</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMappingModel_PhysicalSectionMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalSectionMapping> getPhysicalSectionMapping();

	/**
	 * Returns the value of the '<em><b>Address Mapping Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Mapping Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Mapping Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType
	 * @see #setAddressMappingType(MemoryAddressMappingType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMappingModel_AddressMappingType()
	 * @model unique="false"
	 * @generated
	 */
	MemoryAddressMappingType getAddressMappingType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.MappingModel#getAddressMappingType <em>Address Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Mapping Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType
	 * @see #getAddressMappingType()
	 * @generated
	 */
	void setAddressMappingType(MemoryAddressMappingType value);

} // MappingModel
