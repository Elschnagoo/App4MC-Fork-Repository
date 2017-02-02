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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaphore Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreAccessImpl#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreAccessImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemaphoreAccessImpl extends RunnableItemImpl implements SemaphoreAccess {
	/**
	 * The cached value of the '{@link #getSemaphore() <em>Semaphore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphore()
	 * @generated
	 * @ordered
	 */
	protected Semaphore semaphore;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final SemaphoreAccessEnum ACCESS_EDEFAULT = SemaphoreAccessEnum._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected SemaphoreAccessEnum access = ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemaphoreAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSemaphoreAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore getSemaphore() {
		if (semaphore != null && semaphore.eIsProxy()) {
			InternalEObject oldSemaphore = (InternalEObject)semaphore;
			semaphore = (Semaphore)eResolveProxy(oldSemaphore);
			if (semaphore != oldSemaphore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SEMAPHORE_ACCESS__SEMAPHORE, oldSemaphore, semaphore));
			}
		}
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore basicGetSemaphore() {
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemaphore(Semaphore newSemaphore) {
		Semaphore oldSemaphore = semaphore;
		semaphore = newSemaphore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE_ACCESS__SEMAPHORE, oldSemaphore, semaphore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreAccessEnum getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(SemaphoreAccessEnum newAccess) {
		SemaphoreAccessEnum oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE_ACCESS__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.SEMAPHORE_ACCESS__SEMAPHORE:
				if (resolve) return getSemaphore();
				return basicGetSemaphore();
			case AmaltheaPackage.SEMAPHORE_ACCESS__ACCESS:
				return getAccess();
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
			case AmaltheaPackage.SEMAPHORE_ACCESS__SEMAPHORE:
				setSemaphore((Semaphore)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE_ACCESS__ACCESS:
				setAccess((SemaphoreAccessEnum)newValue);
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
			case AmaltheaPackage.SEMAPHORE_ACCESS__SEMAPHORE:
				setSemaphore((Semaphore)null);
				return;
			case AmaltheaPackage.SEMAPHORE_ACCESS__ACCESS:
				setAccess(ACCESS_EDEFAULT);
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
			case AmaltheaPackage.SEMAPHORE_ACCESS__SEMAPHORE:
				return semaphore != null;
			case AmaltheaPackage.SEMAPHORE_ACCESS__ACCESS:
				return access != ACCESS_EDEFAULT;
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
		result.append(" (access: ");
		result.append(access);
		result.append(')');
		return result.toString();
	}

} //SemaphoreAccessImpl
