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
import org.eclipse.app4mc.amalthea.model.Clock;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.DoubleObject;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Rate Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getOccurrencesPerStep <em>Occurrences Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getMaxIncreasePerStep <em>Max Increase Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getMaxDecreasePerStep <em>Max Decrease Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableRateStimulusImpl extends StimulusImpl implements VariableRateStimulus {
	/**
	 * The cached value of the '{@link #getOccurrencesPerStep() <em>Occurrences Per Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencesPerStep()
	 * @generated
	 * @ordered
	 */
	protected Deviation<DoubleObject> occurrencesPerStep;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Time step;

	/**
	 * The cached value of the '{@link #getMaxIncreasePerStep() <em>Max Increase Per Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIncreasePerStep()
	 * @generated
	 * @ordered
	 */
	protected DoubleObject maxIncreasePerStep;

	/**
	 * The cached value of the '{@link #getMaxDecreasePerStep() <em>Max Decrease Per Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDecreasePerStep()
	 * @generated
	 * @ordered
	 */
	protected DoubleObject maxDecreasePerStep;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected Clock clock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableRateStimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getVariableRateStimulus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation<DoubleObject> getOccurrencesPerStep() {
		return occurrencesPerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencesPerStep(Deviation<DoubleObject> newOccurrencesPerStep, NotificationChain msgs) {
		Deviation<DoubleObject> oldOccurrencesPerStep = occurrencesPerStep;
		occurrencesPerStep = newOccurrencesPerStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP, oldOccurrencesPerStep, newOccurrencesPerStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencesPerStep(Deviation<DoubleObject> newOccurrencesPerStep) {
		if (newOccurrencesPerStep != occurrencesPerStep) {
			NotificationChain msgs = null;
			if (occurrencesPerStep != null)
				msgs = ((InternalEObject)occurrencesPerStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP, null, msgs);
			if (newOccurrencesPerStep != null)
				msgs = ((InternalEObject)newOccurrencesPerStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP, null, msgs);
			msgs = basicSetOccurrencesPerStep(newOccurrencesPerStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP, newOccurrencesPerStep, newOccurrencesPerStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Time newStep, NotificationChain msgs) {
		Time oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP, oldStep, newStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Time newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP, null, msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP, null, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleObject getMaxIncreasePerStep() {
		return maxIncreasePerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxIncreasePerStep(DoubleObject newMaxIncreasePerStep, NotificationChain msgs) {
		DoubleObject oldMaxIncreasePerStep = maxIncreasePerStep;
		maxIncreasePerStep = newMaxIncreasePerStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP, oldMaxIncreasePerStep, newMaxIncreasePerStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIncreasePerStep(DoubleObject newMaxIncreasePerStep) {
		if (newMaxIncreasePerStep != maxIncreasePerStep) {
			NotificationChain msgs = null;
			if (maxIncreasePerStep != null)
				msgs = ((InternalEObject)maxIncreasePerStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP, null, msgs);
			if (newMaxIncreasePerStep != null)
				msgs = ((InternalEObject)newMaxIncreasePerStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP, null, msgs);
			msgs = basicSetMaxIncreasePerStep(newMaxIncreasePerStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP, newMaxIncreasePerStep, newMaxIncreasePerStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleObject getMaxDecreasePerStep() {
		return maxDecreasePerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDecreasePerStep(DoubleObject newMaxDecreasePerStep, NotificationChain msgs) {
		DoubleObject oldMaxDecreasePerStep = maxDecreasePerStep;
		maxDecreasePerStep = newMaxDecreasePerStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP, oldMaxDecreasePerStep, newMaxDecreasePerStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDecreasePerStep(DoubleObject newMaxDecreasePerStep) {
		if (newMaxDecreasePerStep != maxDecreasePerStep) {
			NotificationChain msgs = null;
			if (maxDecreasePerStep != null)
				msgs = ((InternalEObject)maxDecreasePerStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP, null, msgs);
			if (newMaxDecreasePerStep != null)
				msgs = ((InternalEObject)newMaxDecreasePerStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP, null, msgs);
			msgs = basicSetMaxDecreasePerStep(newMaxDecreasePerStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP, newMaxDecreasePerStep, newMaxDecreasePerStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (Clock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.VARIABLE_RATE_STIMULUS__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(Clock newClock) {
		Clock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				return basicSetOccurrencesPerStep(null, msgs);
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				return basicSetStep(null, msgs);
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				return basicSetMaxIncreasePerStep(null, msgs);
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				return basicSetMaxDecreasePerStep(null, msgs);
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
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				return getOccurrencesPerStep();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				return getStep();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				return getMaxIncreasePerStep();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				return getMaxDecreasePerStep();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
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
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				setOccurrencesPerStep((Deviation<DoubleObject>)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				setStep((Time)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				setMaxIncreasePerStep((DoubleObject)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				setMaxDecreasePerStep((DoubleObject)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__CLOCK:
				setClock((Clock)newValue);
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
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				setOccurrencesPerStep((Deviation<DoubleObject>)null);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				setStep((Time)null);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				setMaxIncreasePerStep((DoubleObject)null);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				setMaxDecreasePerStep((DoubleObject)null);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__CLOCK:
				setClock((Clock)null);
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
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				return occurrencesPerStep != null;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				return step != null;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				return maxIncreasePerStep != null;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				return maxDecreasePerStep != null;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__CLOCK:
				return clock != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableRateStimulusImpl
