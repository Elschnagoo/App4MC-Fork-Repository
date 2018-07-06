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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Server Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AsynchronousServerCallImpl#getResultRunnable <em>Result Runnable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousServerCallImpl extends ServerCallImpl implements AsynchronousServerCall {
	/**
	 * The cached value of the '{@link #getResultRunnable() <em>Result Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultRunnable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable resultRunnable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsynchronousServerCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getAsynchronousServerCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getResultRunnable() {
		if (resultRunnable != null && resultRunnable.eIsProxy()) {
			InternalEObject oldResultRunnable = (InternalEObject)resultRunnable;
			resultRunnable = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldResultRunnable);
			if (resultRunnable != oldResultRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE, oldResultRunnable, resultRunnable));
			}
		}
		return resultRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetResultRunnable() {
		return resultRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultRunnable(org.eclipse.app4mc.amalthea.model.Runnable newResultRunnable) {
		org.eclipse.app4mc.amalthea.model.Runnable oldResultRunnable = resultRunnable;
		resultRunnable = newResultRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE, oldResultRunnable, resultRunnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE:
				if (resolve) return getResultRunnable();
				return basicGetResultRunnable();
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
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE:
				setResultRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
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
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE:
				setResultRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
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
			case AmaltheaPackage.ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE:
				return resultRunnable != null;
		}
		return super.eIsSet(featureID);
	}

} //AsynchronousServerCallImpl
