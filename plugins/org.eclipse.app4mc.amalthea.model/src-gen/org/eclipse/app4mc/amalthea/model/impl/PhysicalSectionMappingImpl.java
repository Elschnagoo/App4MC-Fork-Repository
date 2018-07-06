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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping;
import org.eclipse.app4mc.amalthea.model.Section;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Section Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PhysicalSectionMappingImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PhysicalSectionMappingImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PhysicalSectionMappingImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PhysicalSectionMappingImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PhysicalSectionMappingImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PhysicalSectionMappingImpl#getRunEntities <em>Run Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalSectionMappingImpl extends ReferableBaseObjectImpl implements PhysicalSectionMapping {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> origin;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected Memory memory;

	/**
	 * The default value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long START_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected long startAddress = START_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long END_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected long endAddress = END_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getRunEntities() <em>Run Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.app4mc.amalthea.model.Runnable> runEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalSectionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getPhysicalSectionMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getOrigin() {
		if (origin == null) {
			origin = new EObjectResolvingEList<Section>(Section.class, this, AmaltheaPackage.PHYSICAL_SECTION_MAPPING__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory getMemory() {
		if (memory != null && memory.eIsProxy()) {
			InternalEObject oldMemory = (InternalEObject)memory;
			memory = (Memory)eResolveProxy(oldMemory);
			if (memory != oldMemory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PHYSICAL_SECTION_MAPPING__MEMORY, oldMemory, memory));
			}
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory basicGetMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(Memory newMemory) {
		Memory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PHYSICAL_SECTION_MAPPING__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartAddress() {
		return startAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAddress(long newStartAddress) {
		long oldStartAddress = startAddress;
		startAddress = newStartAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PHYSICAL_SECTION_MAPPING__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEndAddress() {
		return endAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAddress(long newEndAddress) {
		long oldEndAddress = endAddress;
		endAddress = newEndAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PHYSICAL_SECTION_MAPPING__END_ADDRESS, oldEndAddress, endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectResolvingEList<Label>(Label.class, this, AmaltheaPackage.PHYSICAL_SECTION_MAPPING__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunEntities() {
		if (runEntities == null) {
			runEntities = new EObjectResolvingEList<org.eclipse.app4mc.amalthea.model.Runnable>(org.eclipse.app4mc.amalthea.model.Runnable.class, this, AmaltheaPackage.PHYSICAL_SECTION_MAPPING__RUN_ENTITIES);
		}
		return runEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__ORIGIN:
				return getOrigin();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__MEMORY:
				if (resolve) return getMemory();
				return basicGetMemory();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__START_ADDRESS:
				return getStartAddress();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__END_ADDRESS:
				return getEndAddress();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__LABELS:
				return getLabels();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__RUN_ENTITIES:
				return getRunEntities();
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
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends Section>)newValue);
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__MEMORY:
				setMemory((Memory)newValue);
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__START_ADDRESS:
				setStartAddress((Long)newValue);
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__END_ADDRESS:
				setEndAddress((Long)newValue);
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__RUN_ENTITIES:
				getRunEntities().clear();
				getRunEntities().addAll((Collection<? extends org.eclipse.app4mc.amalthea.model.Runnable>)newValue);
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
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__ORIGIN:
				getOrigin().clear();
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__MEMORY:
				setMemory((Memory)null);
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__END_ADDRESS:
				setEndAddress(END_ADDRESS_EDEFAULT);
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__LABELS:
				getLabels().clear();
				return;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__RUN_ENTITIES:
				getRunEntities().clear();
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
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__ORIGIN:
				return origin != null && !origin.isEmpty();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__MEMORY:
				return memory != null;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__START_ADDRESS:
				return startAddress != START_ADDRESS_EDEFAULT;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__END_ADDRESS:
				return endAddress != END_ADDRESS_EDEFAULT;
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__LABELS:
				return labels != null && !labels.isEmpty();
			case AmaltheaPackage.PHYSICAL_SECTION_MAPPING__RUN_ENTITIES:
				return runEntities != null && !runEntities.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startAddress: ");
		result.append(startAddress);
		result.append(", endAddress: ");
		result.append(endAddress);
		result.append(')');
		return result.toString();
	}

} //PhysicalSectionMappingImpl
