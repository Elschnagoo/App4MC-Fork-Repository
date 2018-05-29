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
import org.eclipse.app4mc.amalthea.model.InterProcessStimulus;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Process Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InterProcessTriggerImpl#getStimulus <em>Stimulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterProcessTriggerImpl extends CallSequenceItemImpl implements InterProcessTrigger {
	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected InterProcessStimulus stimulus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterProcessTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getInterProcessTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterProcessStimulus getStimulus() {
		if (stimulus != null && stimulus.eIsProxy()) {
			InternalEObject oldStimulus = (InternalEObject)stimulus;
			stimulus = (InterProcessStimulus)eResolveProxy(oldStimulus);
			if (stimulus != oldStimulus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS, oldStimulus, stimulus));
			}
		}
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterProcessStimulus basicGetStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulus(InterProcessStimulus newStimulus) {
		InterProcessStimulus oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS, oldStimulus, stimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS:
				if (resolve) return getStimulus();
				return basicGetStimulus();
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
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS:
				setStimulus((InterProcessStimulus)newValue);
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
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS:
				setStimulus((InterProcessStimulus)null);
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
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS:
				return stimulus != null;
		}
		return super.eIsSet(featureID);
	}

} //InterProcessTriggerImpl
