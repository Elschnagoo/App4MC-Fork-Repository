/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OsekOsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Osek Os Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OsekOsTypeImpl#getKernelPriority <em>Kernel Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsekOsTypeImpl extends SchedulingEntityTypeImpl implements OsekOsType {
	/**
	 * The default value of the '{@link #getKernelPriority() <em>Kernel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelPriority()
	 * @generated
	 * @ordered
	 */
	protected static final long KERNEL_PRIORITY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getKernelPriority() <em>Kernel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelPriority()
	 * @generated
	 * @ordered
	 */
	protected long kernelPriority = KERNEL_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Kernel Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kernelPriorityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsekOsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.OSEK_OS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getKernelPriority() {
		return kernelPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKernelPriority(long newKernelPriority) {
		long oldKernelPriority = kernelPriority;
		kernelPriority = newKernelPriority;
		boolean oldKernelPriorityESet = kernelPriorityESet;
		kernelPriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OSEK_OS_TYPE__KERNEL_PRIORITY, oldKernelPriority, kernelPriority, !oldKernelPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKernelPriority() {
		long oldKernelPriority = kernelPriority;
		boolean oldKernelPriorityESet = kernelPriorityESet;
		kernelPriority = KERNEL_PRIORITY_EDEFAULT;
		kernelPriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.OSEK_OS_TYPE__KERNEL_PRIORITY, oldKernelPriority, KERNEL_PRIORITY_EDEFAULT, oldKernelPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKernelPriority() {
		return kernelPriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.OSEK_OS_TYPE__KERNEL_PRIORITY:
				return getKernelPriority();
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
			case OT1Package.OSEK_OS_TYPE__KERNEL_PRIORITY:
				setKernelPriority((Long)newValue);
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
			case OT1Package.OSEK_OS_TYPE__KERNEL_PRIORITY:
				unsetKernelPriority();
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
			case OT1Package.OSEK_OS_TYPE__KERNEL_PRIORITY:
				return isSetKernelPriority();
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
		result.append(" (kernelPriority: ");
		if (kernelPriorityESet) result.append(kernelPriority); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OsekOsTypeImpl
