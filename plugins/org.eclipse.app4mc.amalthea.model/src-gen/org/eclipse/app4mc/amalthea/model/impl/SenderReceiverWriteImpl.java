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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.SenderReceiverWrite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Receiver Write</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SenderReceiverWriteImpl#getNotifiedRunnables <em>Notified Runnables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SenderReceiverWriteImpl extends SenderReceiverCommunicationImpl implements SenderReceiverWrite {
	/**
	 * The cached value of the '{@link #getNotifiedRunnables() <em>Notified Runnables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifiedRunnables()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.app4mc.amalthea.model.Runnable> notifiedRunnables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenderReceiverWriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSenderReceiverWrite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.app4mc.amalthea.model.Runnable> getNotifiedRunnables() {
		if (notifiedRunnables == null) {
			notifiedRunnables = new EObjectResolvingEList<org.eclipse.app4mc.amalthea.model.Runnable>(org.eclipse.app4mc.amalthea.model.Runnable.class, this, AmaltheaPackage.SENDER_RECEIVER_WRITE__NOTIFIED_RUNNABLES);
		}
		return notifiedRunnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.SENDER_RECEIVER_WRITE__NOTIFIED_RUNNABLES:
				return getNotifiedRunnables();
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
			case AmaltheaPackage.SENDER_RECEIVER_WRITE__NOTIFIED_RUNNABLES:
				getNotifiedRunnables().clear();
				getNotifiedRunnables().addAll((Collection<? extends org.eclipse.app4mc.amalthea.model.Runnable>)newValue);
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
			case AmaltheaPackage.SENDER_RECEIVER_WRITE__NOTIFIED_RUNNABLES:
				getNotifiedRunnables().clear();
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
			case AmaltheaPackage.SENDER_RECEIVER_WRITE__NOTIFIED_RUNNABLES:
				return notifiedRunnables != null && !notifiedRunnables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SenderReceiverWriteImpl
