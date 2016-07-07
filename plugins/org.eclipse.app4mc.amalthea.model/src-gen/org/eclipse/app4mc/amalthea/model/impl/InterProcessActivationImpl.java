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
import org.eclipse.app4mc.amalthea.model.InterProcessActivation;
import org.eclipse.app4mc.amalthea.model.Stimulus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Process Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InterProcessActivationImpl#getStimulus <em>Stimulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterProcessActivationImpl extends CallSequenceItemImpl implements InterProcessActivation {
	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected Stimulus stimulus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterProcessActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getInterProcessActivation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus getStimulus() {
		if (stimulus != null && stimulus.eIsProxy()) {
			InternalEObject oldStimulus = (InternalEObject)stimulus;
			stimulus = (Stimulus)eResolveProxy(oldStimulus);
			if (stimulus != oldStimulus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.INTER_PROCESS_ACTIVATION__STIMULUS, oldStimulus, stimulus));
			}
		}
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus basicGetStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulus(Stimulus newStimulus) {
		Stimulus oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INTER_PROCESS_ACTIVATION__STIMULUS, oldStimulus, stimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.INTER_PROCESS_ACTIVATION__STIMULUS:
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
			case AmaltheaPackage.INTER_PROCESS_ACTIVATION__STIMULUS:
				setStimulus((Stimulus)newValue);
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
			case AmaltheaPackage.INTER_PROCESS_ACTIVATION__STIMULUS:
				setStimulus((Stimulus)null);
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
			case AmaltheaPackage.INTER_PROCESS_ACTIVATION__STIMULUS:
				return stimulus != null;
		}
		return super.eIsSet(featureID);
	}

} //InterProcessActivationImpl
