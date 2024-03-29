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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MemoryAddressMappingType;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl#getSchedulerAllocation <em>Scheduler Allocation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl#getRunnableAllocation <em>Runnable Allocation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl#getTaskAllocation <em>Task Allocation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl#getIsrAllocation <em>Isr Allocation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl#getMemoryMapping <em>Memory Mapping</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl#getPhysicalSectionMapping <em>Physical Section Mapping</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingModelImpl#getAddressMappingType <em>Address Mapping Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingModelImpl extends BaseObjectImpl implements MappingModel {
	/**
	 * The cached value of the '{@link #getSchedulerAllocation() <em>Scheduler Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulerAllocation> schedulerAllocation;

	/**
	 * The cached value of the '{@link #getRunnableAllocation() <em>Runnable Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableAllocation> runnableAllocation;

	/**
	 * The cached value of the '{@link #getTaskAllocation() <em>Task Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskAllocation> taskAllocation;

	/**
	 * The cached value of the '{@link #getIsrAllocation() <em>Isr Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsrAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ISRAllocation> isrAllocation;

	/**
	 * The cached value of the '{@link #getMemoryMapping() <em>Memory Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryMapping> memoryMapping;

	/**
	 * The cached value of the '{@link #getPhysicalSectionMapping() <em>Physical Section Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalSectionMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalSectionMapping> physicalSectionMapping;

	/**
	 * The default value of the '{@link #getAddressMappingType() <em>Address Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressMappingType()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryAddressMappingType ADDRESS_MAPPING_TYPE_EDEFAULT = MemoryAddressMappingType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAddressMappingType() <em>Address Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressMappingType()
	 * @generated
	 * @ordered
	 */
	protected MemoryAddressMappingType addressMappingType = ADDRESS_MAPPING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getMappingModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchedulerAllocation> getSchedulerAllocation() {
		if (schedulerAllocation == null) {
			schedulerAllocation = new EObjectContainmentEList<SchedulerAllocation>(SchedulerAllocation.class, this, AmaltheaPackage.MAPPING_MODEL__SCHEDULER_ALLOCATION);
		}
		return schedulerAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RunnableAllocation> getRunnableAllocation() {
		if (runnableAllocation == null) {
			runnableAllocation = new EObjectContainmentEList<RunnableAllocation>(RunnableAllocation.class, this, AmaltheaPackage.MAPPING_MODEL__RUNNABLE_ALLOCATION);
		}
		return runnableAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskAllocation> getTaskAllocation() {
		if (taskAllocation == null) {
			taskAllocation = new EObjectContainmentEList<TaskAllocation>(TaskAllocation.class, this, AmaltheaPackage.MAPPING_MODEL__TASK_ALLOCATION);
		}
		return taskAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISRAllocation> getIsrAllocation() {
		if (isrAllocation == null) {
			isrAllocation = new EObjectContainmentEList<ISRAllocation>(ISRAllocation.class, this, AmaltheaPackage.MAPPING_MODEL__ISR_ALLOCATION);
		}
		return isrAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MemoryMapping> getMemoryMapping() {
		if (memoryMapping == null) {
			memoryMapping = new EObjectContainmentEList<MemoryMapping>(MemoryMapping.class, this, AmaltheaPackage.MAPPING_MODEL__MEMORY_MAPPING);
		}
		return memoryMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalSectionMapping> getPhysicalSectionMapping() {
		if (physicalSectionMapping == null) {
			physicalSectionMapping = new EObjectContainmentEList<PhysicalSectionMapping>(PhysicalSectionMapping.class, this, AmaltheaPackage.MAPPING_MODEL__PHYSICAL_SECTION_MAPPING);
		}
		return physicalSectionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryAddressMappingType getAddressMappingType() {
		return addressMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressMappingType(MemoryAddressMappingType newAddressMappingType) {
		MemoryAddressMappingType oldAddressMappingType = addressMappingType;
		addressMappingType = newAddressMappingType == null ? ADDRESS_MAPPING_TYPE_EDEFAULT : newAddressMappingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MAPPING_MODEL__ADDRESS_MAPPING_TYPE, oldAddressMappingType, addressMappingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING_MODEL__SCHEDULER_ALLOCATION:
				return ((InternalEList<?>)getSchedulerAllocation()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.MAPPING_MODEL__RUNNABLE_ALLOCATION:
				return ((InternalEList<?>)getRunnableAllocation()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.MAPPING_MODEL__TASK_ALLOCATION:
				return ((InternalEList<?>)getTaskAllocation()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.MAPPING_MODEL__ISR_ALLOCATION:
				return ((InternalEList<?>)getIsrAllocation()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.MAPPING_MODEL__MEMORY_MAPPING:
				return ((InternalEList<?>)getMemoryMapping()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.MAPPING_MODEL__PHYSICAL_SECTION_MAPPING:
				return ((InternalEList<?>)getPhysicalSectionMapping()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING_MODEL__SCHEDULER_ALLOCATION:
				return getSchedulerAllocation();
			case AmaltheaPackage.MAPPING_MODEL__RUNNABLE_ALLOCATION:
				return getRunnableAllocation();
			case AmaltheaPackage.MAPPING_MODEL__TASK_ALLOCATION:
				return getTaskAllocation();
			case AmaltheaPackage.MAPPING_MODEL__ISR_ALLOCATION:
				return getIsrAllocation();
			case AmaltheaPackage.MAPPING_MODEL__MEMORY_MAPPING:
				return getMemoryMapping();
			case AmaltheaPackage.MAPPING_MODEL__PHYSICAL_SECTION_MAPPING:
				return getPhysicalSectionMapping();
			case AmaltheaPackage.MAPPING_MODEL__ADDRESS_MAPPING_TYPE:
				return getAddressMappingType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING_MODEL__SCHEDULER_ALLOCATION:
				getSchedulerAllocation().clear();
				getSchedulerAllocation().addAll((Collection<? extends SchedulerAllocation>)newValue);
				return;
			case AmaltheaPackage.MAPPING_MODEL__RUNNABLE_ALLOCATION:
				getRunnableAllocation().clear();
				getRunnableAllocation().addAll((Collection<? extends RunnableAllocation>)newValue);
				return;
			case AmaltheaPackage.MAPPING_MODEL__TASK_ALLOCATION:
				getTaskAllocation().clear();
				getTaskAllocation().addAll((Collection<? extends TaskAllocation>)newValue);
				return;
			case AmaltheaPackage.MAPPING_MODEL__ISR_ALLOCATION:
				getIsrAllocation().clear();
				getIsrAllocation().addAll((Collection<? extends ISRAllocation>)newValue);
				return;
			case AmaltheaPackage.MAPPING_MODEL__MEMORY_MAPPING:
				getMemoryMapping().clear();
				getMemoryMapping().addAll((Collection<? extends MemoryMapping>)newValue);
				return;
			case AmaltheaPackage.MAPPING_MODEL__PHYSICAL_SECTION_MAPPING:
				getPhysicalSectionMapping().clear();
				getPhysicalSectionMapping().addAll((Collection<? extends PhysicalSectionMapping>)newValue);
				return;
			case AmaltheaPackage.MAPPING_MODEL__ADDRESS_MAPPING_TYPE:
				setAddressMappingType((MemoryAddressMappingType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING_MODEL__SCHEDULER_ALLOCATION:
				getSchedulerAllocation().clear();
				return;
			case AmaltheaPackage.MAPPING_MODEL__RUNNABLE_ALLOCATION:
				getRunnableAllocation().clear();
				return;
			case AmaltheaPackage.MAPPING_MODEL__TASK_ALLOCATION:
				getTaskAllocation().clear();
				return;
			case AmaltheaPackage.MAPPING_MODEL__ISR_ALLOCATION:
				getIsrAllocation().clear();
				return;
			case AmaltheaPackage.MAPPING_MODEL__MEMORY_MAPPING:
				getMemoryMapping().clear();
				return;
			case AmaltheaPackage.MAPPING_MODEL__PHYSICAL_SECTION_MAPPING:
				getPhysicalSectionMapping().clear();
				return;
			case AmaltheaPackage.MAPPING_MODEL__ADDRESS_MAPPING_TYPE:
				setAddressMappingType(ADDRESS_MAPPING_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING_MODEL__SCHEDULER_ALLOCATION:
				return schedulerAllocation != null && !schedulerAllocation.isEmpty();
			case AmaltheaPackage.MAPPING_MODEL__RUNNABLE_ALLOCATION:
				return runnableAllocation != null && !runnableAllocation.isEmpty();
			case AmaltheaPackage.MAPPING_MODEL__TASK_ALLOCATION:
				return taskAllocation != null && !taskAllocation.isEmpty();
			case AmaltheaPackage.MAPPING_MODEL__ISR_ALLOCATION:
				return isrAllocation != null && !isrAllocation.isEmpty();
			case AmaltheaPackage.MAPPING_MODEL__MEMORY_MAPPING:
				return memoryMapping != null && !memoryMapping.isEmpty();
			case AmaltheaPackage.MAPPING_MODEL__PHYSICAL_SECTION_MAPPING:
				return physicalSectionMapping != null && !physicalSectionMapping.isEmpty();
			case AmaltheaPackage.MAPPING_MODEL__ADDRESS_MAPPING_TYPE:
				return addressMappingType != ADDRESS_MAPPING_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (addressMappingType: ");
		result.append(addressMappingType);
		result.append(')');
		return result.toString();
	}

} //MappingModelImpl
