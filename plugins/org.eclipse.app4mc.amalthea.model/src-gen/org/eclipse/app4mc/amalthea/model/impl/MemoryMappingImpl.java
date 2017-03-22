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
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AbstractMemoryElement;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryMappingImpl#getAbstractElement <em>Abstract Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryMappingImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryMappingImpl#getMemoryPositionAddress <em>Memory Position Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryMappingImpl#getMemoryElementLinkInt <em>Memory Element Link Int</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.MemoryMappingImpl#getMemoryLinkInt <em>Memory Link Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryMappingImpl extends BaseObjectImpl implements MemoryMapping {
	/**
	 * The cached value of the '{@link #getAbstractElement() <em>Abstract Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractMemoryElement abstractElement;

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
	 * The cached value of the '{@link #getMemoryElementLinkInt() <em>Memory Element Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryElementLinkInt()
	 * @generated
	 * @ordered
	 */
	protected AbstractMemoryElement memoryElementLinkInt;

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
	protected MemoryMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getMemoryMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMemoryElement getAbstractElement() {
		if (abstractElement != null && abstractElement.eIsProxy()) {
			InternalEObject oldAbstractElement = (InternalEObject)abstractElement;
			abstractElement = (AbstractMemoryElement)eResolveProxy(oldAbstractElement);
			if (abstractElement != oldAbstractElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MEMORY_MAPPING__ABSTRACT_ELEMENT, oldAbstractElement, abstractElement));
			}
		}
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMemoryElement basicGetAbstractElement() {
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractElement(AbstractMemoryElement newAbstractElement) {
		AbstractMemoryElement oldAbstractElement = abstractElement;
		abstractElement = newAbstractElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING__ABSTRACT_ELEMENT, oldAbstractElement, abstractElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MEMORY_MAPPING__MEMORY, oldMemory, memory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING__MEMORY, oldMemory, memory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING__MEMORY_POSITION_ADDRESS, oldMemoryPositionAddress, memoryPositionAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMemoryElement getMemoryElementLinkInt() {
		if (memoryElementLinkInt != null && memoryElementLinkInt.eIsProxy()) {
			InternalEObject oldMemoryElementLinkInt = (InternalEObject)memoryElementLinkInt;
			memoryElementLinkInt = (AbstractMemoryElement)eResolveProxy(oldMemoryElementLinkInt);
			if (memoryElementLinkInt != oldMemoryElementLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT, oldMemoryElementLinkInt, memoryElementLinkInt));
			}
		}
		return memoryElementLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMemoryElement basicGetMemoryElementLinkInt() {
		return memoryElementLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryElementLinkInt(AbstractMemoryElement newMemoryElementLinkInt, NotificationChain msgs) {
		AbstractMemoryElement oldMemoryElementLinkInt = memoryElementLinkInt;
		memoryElementLinkInt = newMemoryElementLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT, oldMemoryElementLinkInt, newMemoryElementLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryElementLinkInt(AbstractMemoryElement newMemoryElementLinkInt) {
		if (newMemoryElementLinkInt != memoryElementLinkInt) {
			NotificationChain msgs = null;
			if (memoryElementLinkInt != null)
				msgs = ((InternalEObject)memoryElementLinkInt).eInverseRemove(this, AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__MAPPINGS, AbstractMemoryElement.class, msgs);
			if (newMemoryElementLinkInt != null)
				msgs = ((InternalEObject)newMemoryElementLinkInt).eInverseAdd(this, AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__MAPPINGS, AbstractMemoryElement.class, msgs);
			msgs = basicSetMemoryElementLinkInt(newMemoryElementLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT, newMemoryElementLinkInt, newMemoryElementLinkInt));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT, oldMemoryLinkInt, memoryLinkInt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT, oldMemoryLinkInt, newMemoryLinkInt);
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
				msgs = ((InternalEObject)memoryLinkInt).eInverseRemove(this, AmaltheaPackage.MEMORY__MAPPINGS, Memory.class, msgs);
			if (newMemoryLinkInt != null)
				msgs = ((InternalEObject)newMemoryLinkInt).eInverseAdd(this, AmaltheaPackage.MEMORY__MAPPINGS, Memory.class, msgs);
			msgs = basicSetMemoryLinkInt(newMemoryLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT, newMemoryLinkInt, newMemoryLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT:
				if (memoryElementLinkInt != null)
					msgs = ((InternalEObject)memoryElementLinkInt).eInverseRemove(this, AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__MAPPINGS, AbstractMemoryElement.class, msgs);
				return basicSetMemoryElementLinkInt((AbstractMemoryElement)otherEnd, msgs);
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT:
				if (memoryLinkInt != null)
					msgs = ((InternalEObject)memoryLinkInt).eInverseRemove(this, AmaltheaPackage.MEMORY__MAPPINGS, Memory.class, msgs);
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
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT:
				return basicSetMemoryElementLinkInt(null, msgs);
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT:
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
			case AmaltheaPackage.MEMORY_MAPPING__ABSTRACT_ELEMENT:
				if (resolve) return getAbstractElement();
				return basicGetAbstractElement();
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY:
				if (resolve) return getMemory();
				return basicGetMemory();
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_POSITION_ADDRESS:
				return getMemoryPositionAddress();
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT:
				if (resolve) return getMemoryElementLinkInt();
				return basicGetMemoryElementLinkInt();
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT:
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
			case AmaltheaPackage.MEMORY_MAPPING__ABSTRACT_ELEMENT:
				setAbstractElement((AbstractMemoryElement)newValue);
				return;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY:
				setMemory((Memory)newValue);
				return;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_POSITION_ADDRESS:
				setMemoryPositionAddress((Long)newValue);
				return;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT:
				setMemoryElementLinkInt((AbstractMemoryElement)newValue);
				return;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT:
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
			case AmaltheaPackage.MEMORY_MAPPING__ABSTRACT_ELEMENT:
				setAbstractElement((AbstractMemoryElement)null);
				return;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY:
				setMemory((Memory)null);
				return;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_POSITION_ADDRESS:
				setMemoryPositionAddress(MEMORY_POSITION_ADDRESS_EDEFAULT);
				return;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT:
				setMemoryElementLinkInt((AbstractMemoryElement)null);
				return;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT:
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
			case AmaltheaPackage.MEMORY_MAPPING__ABSTRACT_ELEMENT:
				return abstractElement != null;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY:
				return memory != null;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_POSITION_ADDRESS:
				return memoryPositionAddress != MEMORY_POSITION_ADDRESS_EDEFAULT;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_ELEMENT_LINK_INT:
				return memoryElementLinkInt != null;
			case AmaltheaPackage.MEMORY_MAPPING__MEMORY_LINK_INT:
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

} //MemoryMappingImpl
