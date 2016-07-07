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
import org.eclipse.app4mc.amalthea.model.ComparatorType;
import org.eclipse.app4mc.amalthea.model.HwMemoryProperty;
import org.eclipse.app4mc.amalthea.model.Memory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Memory Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwMemoryPropertyImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwMemoryPropertyImpl#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwMemoryPropertyImpl extends HwMemoryConstraintImpl implements HwMemoryProperty {
	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected Memory memory;

	/**
	 * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparatorType COMPARATOR_EDEFAULT = ComparatorType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected ComparatorType comparator = COMPARATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwMemoryPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwMemoryProperty();
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
				InternalEObject newMemory = (InternalEObject)memory;
				NotificationChain msgs = oldMemory.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY, null, null);
				if (newMemory.eInternalContainer() == null) {
					msgs = newMemory.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY, oldMemory, memory));
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
	public NotificationChain basicSetMemory(Memory newMemory, NotificationChain msgs) {
		Memory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY, oldMemory, newMemory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(Memory newMemory) {
		if (newMemory != memory) {
			NotificationChain msgs = null;
			if (memory != null)
				msgs = ((InternalEObject)memory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY, null, msgs);
			if (newMemory != null)
				msgs = ((InternalEObject)newMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY, null, msgs);
			msgs = basicSetMemory(newMemory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY, newMemory, newMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparatorType getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparator(ComparatorType newComparator) {
		ComparatorType oldComparator = comparator;
		comparator = newComparator == null ? COMPARATOR_EDEFAULT : newComparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MEMORY_PROPERTY__COMPARATOR, oldComparator, comparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY:
				return basicSetMemory(null, msgs);
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
			case AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY:
				if (resolve) return getMemory();
				return basicGetMemory();
			case AmaltheaPackage.HW_MEMORY_PROPERTY__COMPARATOR:
				return getComparator();
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
			case AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY:
				setMemory((Memory)newValue);
				return;
			case AmaltheaPackage.HW_MEMORY_PROPERTY__COMPARATOR:
				setComparator((ComparatorType)newValue);
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
			case AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY:
				setMemory((Memory)null);
				return;
			case AmaltheaPackage.HW_MEMORY_PROPERTY__COMPARATOR:
				setComparator(COMPARATOR_EDEFAULT);
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
			case AmaltheaPackage.HW_MEMORY_PROPERTY__MEMORY:
				return memory != null;
			case AmaltheaPackage.HW_MEMORY_PROPERTY__COMPARATOR:
				return comparator != COMPARATOR_EDEFAULT;
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
		result.append(" (comparator: ");
		result.append(comparator);
		result.append(')');
		return result.toString();
	}

} //HwMemoryPropertyImpl
