/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.ClockStep;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockStepImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockStepImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockStepImpl extends BaseObjectImpl implements ClockStep {
	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected Frequency frequency;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Time time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getClockStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Frequency getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequency(Frequency newFrequency, NotificationChain msgs) {
		Frequency oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_STEP__FREQUENCY, oldFrequency, newFrequency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(Frequency newFrequency) {
		if (newFrequency != frequency) {
			NotificationChain msgs = null;
			if (frequency != null)
				msgs = ((InternalEObject)frequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_STEP__FREQUENCY, null, msgs);
			if (newFrequency != null)
				msgs = ((InternalEObject)newFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_STEP__FREQUENCY, null, msgs);
			msgs = basicSetFrequency(newFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_STEP__FREQUENCY, newFrequency, newFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(Time newTime, NotificationChain msgs) {
		Time oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_STEP__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(Time newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_STEP__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_STEP__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_STEP__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CLOCK_STEP__FREQUENCY:
				return basicSetFrequency(null, msgs);
			case AmaltheaPackage.CLOCK_STEP__TIME:
				return basicSetTime(null, msgs);
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
			case AmaltheaPackage.CLOCK_STEP__FREQUENCY:
				return getFrequency();
			case AmaltheaPackage.CLOCK_STEP__TIME:
				return getTime();
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
			case AmaltheaPackage.CLOCK_STEP__FREQUENCY:
				setFrequency((Frequency)newValue);
				return;
			case AmaltheaPackage.CLOCK_STEP__TIME:
				setTime((Time)newValue);
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
			case AmaltheaPackage.CLOCK_STEP__FREQUENCY:
				setFrequency((Frequency)null);
				return;
			case AmaltheaPackage.CLOCK_STEP__TIME:
				setTime((Time)null);
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
			case AmaltheaPackage.CLOCK_STEP__FREQUENCY:
				return frequency != null;
			case AmaltheaPackage.CLOCK_STEP__TIME:
				return time != null;
		}
		return super.eIsSet(featureID);
	}

} //ClockStepImpl
