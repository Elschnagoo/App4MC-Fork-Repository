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
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.InterProcessTriggerImpl#getStimulusLinkInt <em>Stimulus Link Int</em>}</li>
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
	 * The cached value of the '{@link #getStimulusLinkInt() <em>Stimulus Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulusLinkInt()
	 * @generated
	 * @ordered
	 */
	protected InterProcessStimulus stimulusLinkInt;

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
 		//Additional setting transient value for transient bi-directional reference
 		setStimulusLinkInt(newStimulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterProcessStimulus getStimulusLinkInt() {
		if (stimulusLinkInt != null && stimulusLinkInt.eIsProxy()) {
			InternalEObject oldStimulusLinkInt = (InternalEObject)stimulusLinkInt;
			stimulusLinkInt = (InterProcessStimulus)eResolveProxy(oldStimulusLinkInt);
			if (stimulusLinkInt != oldStimulusLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT, oldStimulusLinkInt, stimulusLinkInt));
			}
		}
		return stimulusLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterProcessStimulus basicGetStimulusLinkInt() {
		return stimulusLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimulusLinkInt(InterProcessStimulus newStimulusLinkInt, NotificationChain msgs) {
		InterProcessStimulus oldStimulusLinkInt = stimulusLinkInt;
		stimulusLinkInt = newStimulusLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT, oldStimulusLinkInt, newStimulusLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulusLinkInt(InterProcessStimulus newStimulusLinkInt) {
		if (newStimulusLinkInt != stimulusLinkInt) {
			NotificationChain msgs = null;
			if (stimulusLinkInt != null)
				msgs = ((InternalEObject)stimulusLinkInt).eInverseRemove(this, AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS, InterProcessStimulus.class, msgs);
			if (newStimulusLinkInt != null)
				msgs = ((InternalEObject)newStimulusLinkInt).eInverseAdd(this, AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS, InterProcessStimulus.class, msgs);
			msgs = basicSetStimulusLinkInt(newStimulusLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT, newStimulusLinkInt, newStimulusLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT:
				if (stimulusLinkInt != null)
					msgs = ((InternalEObject)stimulusLinkInt).eInverseRemove(this, AmaltheaPackage.INTER_PROCESS_STIMULUS__EXPLICIT_TRIGGERS, InterProcessStimulus.class, msgs);
				return basicSetStimulusLinkInt((InterProcessStimulus)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT:
				return basicSetStimulusLinkInt(null, msgs);
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
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS:
				if (resolve) return getStimulus();
				return basicGetStimulus();
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT:
				if (resolve) return getStimulusLinkInt();
				return basicGetStimulusLinkInt();
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
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT:
				setStimulusLinkInt((InterProcessStimulus)newValue);
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
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT:
				setStimulusLinkInt((InterProcessStimulus)null);
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
			case AmaltheaPackage.INTER_PROCESS_TRIGGER__STIMULUS_LINK_INT:
				return stimulusLinkInt != null;
		}
		return super.eIsSet(featureID);
	}

} //InterProcessTriggerImpl
