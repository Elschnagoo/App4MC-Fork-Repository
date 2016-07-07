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
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Mapping;
import org.eclipse.app4mc.amalthea.model.Memory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingImpl#getMemoryPositionAddress <em>Memory Position Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MappingImpl#getMemoryLinkInt <em>Memory Link Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MappingImpl extends BaseObjectImpl implements Mapping {
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
	 * The default value of the '{@link #getMemoryPositionAddress() <em>Memory Position Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPositionAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long MEMORY_POSITION_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMemoryPositionAddress() <em>Memory Position Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPositionAddress()
	 * @generated
	 * @ordered
	 */
	protected long memoryPositionAddress = MEMORY_POSITION_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemoryLinkInt() <em>Memory Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLinkInt()
	 * @generated
	 * @ordered
	 */
	protected Memory memoryLinkInt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getMapping();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MAPPING__MEMORY, oldMemory, memory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MAPPING__MEMORY, oldMemory, memory));
 		//Additional setting transient value for transient bi-directional reference
 		setMemoryLinkInt(newMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMemoryPositionAddress() {
		return memoryPositionAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryPositionAddress(long newMemoryPositionAddress) {
		long oldMemoryPositionAddress = memoryPositionAddress;
		memoryPositionAddress = newMemoryPositionAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MAPPING__MEMORY_POSITION_ADDRESS, oldMemoryPositionAddress, memoryPositionAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory getMemoryLinkInt() {
		if (memoryLinkInt != null && memoryLinkInt.eIsProxy()) {
			InternalEObject oldMemoryLinkInt = (InternalEObject)memoryLinkInt;
			memoryLinkInt = (Memory)eResolveProxy(oldMemoryLinkInt);
			if (memoryLinkInt != oldMemoryLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MAPPING__MEMORY_LINK_INT, oldMemoryLinkInt, memoryLinkInt));
			}
		}
		return memoryLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory basicGetMemoryLinkInt() {
		return memoryLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryLinkInt(Memory newMemoryLinkInt, NotificationChain msgs) {
		Memory oldMemoryLinkInt = memoryLinkInt;
		memoryLinkInt = newMemoryLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MAPPING__MEMORY_LINK_INT, oldMemoryLinkInt, newMemoryLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryLinkInt(Memory newMemoryLinkInt) {
		if (newMemoryLinkInt != memoryLinkInt) {
			NotificationChain msgs = null;
			if (memoryLinkInt != null)
				msgs = ((InternalEObject)memoryLinkInt).eInverseRemove(this, AmaltheaPackage.MEMORY__MAPPING, Memory.class, msgs);
			if (newMemoryLinkInt != null)
				msgs = ((InternalEObject)newMemoryLinkInt).eInverseAdd(this, AmaltheaPackage.MEMORY__MAPPING, Memory.class, msgs);
			msgs = basicSetMemoryLinkInt(newMemoryLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MAPPING__MEMORY_LINK_INT, newMemoryLinkInt, newMemoryLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING__MEMORY_LINK_INT:
				if (memoryLinkInt != null)
					msgs = ((InternalEObject)memoryLinkInt).eInverseRemove(this, AmaltheaPackage.MEMORY__MAPPING, Memory.class, msgs);
				return basicSetMemoryLinkInt((Memory)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING__MEMORY_LINK_INT:
				return basicSetMemoryLinkInt(null, msgs);
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
			case AmaltheaPackage.MAPPING__MEMORY:
				if (resolve) return getMemory();
				return basicGetMemory();
			case AmaltheaPackage.MAPPING__MEMORY_POSITION_ADDRESS:
				return getMemoryPositionAddress();
			case AmaltheaPackage.MAPPING__MEMORY_LINK_INT:
				if (resolve) return getMemoryLinkInt();
				return basicGetMemoryLinkInt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.MAPPING__MEMORY:
				setMemory((Memory)newValue);
				return;
			case AmaltheaPackage.MAPPING__MEMORY_POSITION_ADDRESS:
				setMemoryPositionAddress((Long)newValue);
				return;
			case AmaltheaPackage.MAPPING__MEMORY_LINK_INT:
				setMemoryLinkInt((Memory)newValue);
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
			case AmaltheaPackage.MAPPING__MEMORY:
				setMemory((Memory)null);
				return;
			case AmaltheaPackage.MAPPING__MEMORY_POSITION_ADDRESS:
				setMemoryPositionAddress(MEMORY_POSITION_ADDRESS_EDEFAULT);
				return;
			case AmaltheaPackage.MAPPING__MEMORY_LINK_INT:
				setMemoryLinkInt((Memory)null);
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
			case AmaltheaPackage.MAPPING__MEMORY:
				return memory != null;
			case AmaltheaPackage.MAPPING__MEMORY_POSITION_ADDRESS:
				return memoryPositionAddress != MEMORY_POSITION_ADDRESS_EDEFAULT;
			case AmaltheaPackage.MAPPING__MEMORY_LINK_INT:
				return memoryLinkInt != null;
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
		result.append(" (memoryPositionAddress: ");
		result.append(memoryPositionAddress);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
