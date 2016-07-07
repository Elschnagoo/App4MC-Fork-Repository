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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ECU;
import org.eclipse.app4mc.amalthea.model.HwSystem;
import org.eclipse.app4mc.amalthea.model.SystemType;

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
 * An implementation of the model object '<em><b>Hw System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwSystemImpl#getSystemType <em>System Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwSystemImpl#getEcus <em>Ecus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwSystemImpl extends ComplexNodeImpl implements HwSystem {
	/**
	 * The cached value of the '{@link #getSystemType() <em>System Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemType()
	 * @generated
	 * @ordered
	 */
	protected SystemType systemType;

	/**
	 * The cached value of the '{@link #getEcus() <em>Ecus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcus()
	 * @generated
	 * @ordered
	 */
	protected EList<ECU> ecus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType getSystemType() {
		if (systemType != null && systemType.eIsProxy()) {
			InternalEObject oldSystemType = (InternalEObject)systemType;
			systemType = (SystemType)eResolveProxy(oldSystemType);
			if (systemType != oldSystemType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_SYSTEM__SYSTEM_TYPE, oldSystemType, systemType));
			}
		}
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType basicGetSystemType() {
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemType(SystemType newSystemType) {
		SystemType oldSystemType = systemType;
		systemType = newSystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_SYSTEM__SYSTEM_TYPE, oldSystemType, systemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECU> getEcus() {
		if (ecus == null) {
			ecus = new EObjectContainmentEList<ECU>(ECU.class, this, AmaltheaPackage.HW_SYSTEM__ECUS);
		}
		return ecus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_SYSTEM__ECUS:
				return ((InternalEList<?>)getEcus()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.HW_SYSTEM__SYSTEM_TYPE:
				if (resolve) return getSystemType();
				return basicGetSystemType();
			case AmaltheaPackage.HW_SYSTEM__ECUS:
				return getEcus();
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
			case AmaltheaPackage.HW_SYSTEM__SYSTEM_TYPE:
				setSystemType((SystemType)newValue);
				return;
			case AmaltheaPackage.HW_SYSTEM__ECUS:
				getEcus().clear();
				getEcus().addAll((Collection<? extends ECU>)newValue);
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
			case AmaltheaPackage.HW_SYSTEM__SYSTEM_TYPE:
				setSystemType((SystemType)null);
				return;
			case AmaltheaPackage.HW_SYSTEM__ECUS:
				getEcus().clear();
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
			case AmaltheaPackage.HW_SYSTEM__SYSTEM_TYPE:
				return systemType != null;
			case AmaltheaPackage.HW_SYSTEM__ECUS:
				return ecus != null && !ecus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwSystemImpl
