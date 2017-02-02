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
import org.eclipse.app4mc.amalthea.model.ServerCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ServerCallImpl#getServerRunnable <em>Server Runnable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServerCallImpl extends RunnableItemImpl implements ServerCall {
	/**
	 * The cached value of the '{@link #getServerRunnable() <em>Server Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerRunnable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable serverRunnable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getServerCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getServerRunnable() {
		if (serverRunnable != null && serverRunnable.eIsProxy()) {
			InternalEObject oldServerRunnable = (InternalEObject)serverRunnable;
			serverRunnable = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldServerRunnable);
			if (serverRunnable != oldServerRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SERVER_CALL__SERVER_RUNNABLE, oldServerRunnable, serverRunnable));
			}
		}
		return serverRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetServerRunnable() {
		return serverRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerRunnable(org.eclipse.app4mc.amalthea.model.Runnable newServerRunnable) {
		org.eclipse.app4mc.amalthea.model.Runnable oldServerRunnable = serverRunnable;
		serverRunnable = newServerRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SERVER_CALL__SERVER_RUNNABLE, oldServerRunnable, serverRunnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.SERVER_CALL__SERVER_RUNNABLE:
				if (resolve) return getServerRunnable();
				return basicGetServerRunnable();
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
			case AmaltheaPackage.SERVER_CALL__SERVER_RUNNABLE:
				setServerRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
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
			case AmaltheaPackage.SERVER_CALL__SERVER_RUNNABLE:
				setServerRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
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
			case AmaltheaPackage.SERVER_CALL__SERVER_RUNNABLE:
				return serverRunnable != null;
		}
		return super.eIsSet(featureID);
	}

} //ServerCallImpl
