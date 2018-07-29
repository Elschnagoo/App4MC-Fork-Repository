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
import org.eclipse.app4mc.amalthea.model.SynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Server Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SynchronousServerCallImpl#getWaitingBehaviour <em>Waiting Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousServerCallImpl extends ServerCallImpl implements SynchronousServerCall {
	/**
	 * The default value of the '{@link #getWaitingBehaviour() <em>Waiting Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final WaitingBehaviour WAITING_BEHAVIOUR_EDEFAULT = WaitingBehaviour._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getWaitingBehaviour() <em>Waiting Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingBehaviour()
	 * @generated
	 * @ordered
	 */
	protected WaitingBehaviour waitingBehaviour = WAITING_BEHAVIOUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronousServerCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSynchronousServerCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitingBehaviour getWaitingBehaviour() {
		return waitingBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitingBehaviour(WaitingBehaviour newWaitingBehaviour) {
		WaitingBehaviour oldWaitingBehaviour = waitingBehaviour;
		waitingBehaviour = newWaitingBehaviour == null ? WAITING_BEHAVIOUR_EDEFAULT : newWaitingBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR, oldWaitingBehaviour, waitingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR:
				return getWaitingBehaviour();
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
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR:
				setWaitingBehaviour((WaitingBehaviour)newValue);
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
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR:
				setWaitingBehaviour(WAITING_BEHAVIOUR_EDEFAULT);
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
			case AmaltheaPackage.SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR:
				return waitingBehaviour != WAITING_BEHAVIOUR_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (waitingBehaviour: ");
		result.append(waitingBehaviour);
		result.append(')');
		return result.toString();
	}

} //SynchronousServerCallImpl
