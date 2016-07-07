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
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreImpl#getCoreType <em>Core Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreImpl#getLockstepGroup <em>Lockstep Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreImpl extends ComplexNodeImpl implements Core {
	/**
	 * The cached value of the '{@link #getCoreType() <em>Core Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreType()
	 * @generated
	 * @ordered
	 */
	protected CoreType coreType;

	/**
	 * The default value of the '{@link #getLockstepGroup() <em>Lockstep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockstepGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCKSTEP_GROUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLockstepGroup() <em>Lockstep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockstepGroup()
	 * @generated
	 * @ordered
	 */
	protected int lockstepGroup = LOCKSTEP_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreType getCoreType() {
		if (coreType != null && coreType.eIsProxy()) {
			InternalEObject oldCoreType = (InternalEObject)coreType;
			coreType = (CoreType)eResolveProxy(oldCoreType);
			if (coreType != oldCoreType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CORE__CORE_TYPE, oldCoreType, coreType));
			}
		}
		return coreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreType basicGetCoreType() {
		return coreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreType(CoreType newCoreType) {
		CoreType oldCoreType = coreType;
		coreType = newCoreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE__CORE_TYPE, oldCoreType, coreType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLockstepGroup() {
		return lockstepGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockstepGroup(int newLockstepGroup) {
		int oldLockstepGroup = lockstepGroup;
		lockstepGroup = newLockstepGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE__LOCKSTEP_GROUP, oldLockstepGroup, lockstepGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.CORE__CORE_TYPE:
				if (resolve) return getCoreType();
				return basicGetCoreType();
			case AmaltheaPackage.CORE__LOCKSTEP_GROUP:
				return getLockstepGroup();
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
			case AmaltheaPackage.CORE__CORE_TYPE:
				setCoreType((CoreType)newValue);
				return;
			case AmaltheaPackage.CORE__LOCKSTEP_GROUP:
				setLockstepGroup((Integer)newValue);
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
			case AmaltheaPackage.CORE__CORE_TYPE:
				setCoreType((CoreType)null);
				return;
			case AmaltheaPackage.CORE__LOCKSTEP_GROUP:
				setLockstepGroup(LOCKSTEP_GROUP_EDEFAULT);
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
			case AmaltheaPackage.CORE__CORE_TYPE:
				return coreType != null;
			case AmaltheaPackage.CORE__LOCKSTEP_GROUP:
				return lockstepGroup != LOCKSTEP_GROUP_EDEFAULT;
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
		result.append(" (lockstepGroup: ");
		result.append(lockstepGroup);
		result.append(')');
		return result.toString();
	}

} //CoreImpl
