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
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Sinus Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockSinusFunctionImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockSinusFunctionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockSinusFunctionImpl#getAmplitude <em>Amplitude</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockSinusFunctionImpl#getYOffset <em>YOffset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockSinusFunctionImpl extends ClockImpl implements ClockSinusFunction {
	/**
	 * The cached value of the '{@link #getShift() <em>Shift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected Time shift;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Time period;

	/**
	 * The default value of the '{@link #getAmplitude() <em>Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitude()
	 * @generated
	 * @ordered
	 */
	protected static final double AMPLITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmplitude() <em>Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitude()
	 * @generated
	 * @ordered
	 */
	protected double amplitude = AMPLITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYOffset() <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double YOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYOffset() <em>YOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected double yOffset = YOFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockSinusFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getClockSinusFunction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getShift() {
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShift(Time newShift, NotificationChain msgs) {
		Time oldShift = shift;
		shift = newShift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT, oldShift, newShift);
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
	public void setShift(Time newShift) {
		if (newShift != shift) {
			NotificationChain msgs = null;
			if (shift != null)
				msgs = ((InternalEObject)shift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT, null, msgs);
			if (newShift != null)
				msgs = ((InternalEObject)newShift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT, null, msgs);
			msgs = basicSetShift(newShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT, newShift, newShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Time newPeriod, NotificationChain msgs) {
		Time oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Time newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAmplitude() {
		return amplitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmplitude(double newAmplitude) {
		double oldAmplitude = amplitude;
		amplitude = newAmplitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_SINUS_FUNCTION__AMPLITUDE, oldAmplitude, amplitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYOffset() {
		return yOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYOffset(double newYOffset) {
		double oldYOffset = yOffset;
		yOffset = newYOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_SINUS_FUNCTION__YOFFSET, oldYOffset, yOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT:
				return basicSetShift(null, msgs);
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT:
				return getShift();
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD:
				return getPeriod();
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__AMPLITUDE:
				return getAmplitude();
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__YOFFSET:
				return getYOffset();
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
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT:
				setShift((Time)newValue);
				return;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD:
				setPeriod((Time)newValue);
				return;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__AMPLITUDE:
				setAmplitude((Double)newValue);
				return;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__YOFFSET:
				setYOffset((Double)newValue);
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
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT:
				setShift((Time)null);
				return;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD:
				setPeriod((Time)null);
				return;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__AMPLITUDE:
				setAmplitude(AMPLITUDE_EDEFAULT);
				return;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__YOFFSET:
				setYOffset(YOFFSET_EDEFAULT);
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
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__SHIFT:
				return shift != null;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD:
				return period != null;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__AMPLITUDE:
				return amplitude != AMPLITUDE_EDEFAULT;
			case AmaltheaPackage.CLOCK_SINUS_FUNCTION__YOFFSET:
				return yOffset != YOFFSET_EDEFAULT;
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
		result.append(" (amplitude: ");
		result.append(amplitude);
		result.append(", yOffset: ");
		result.append(yOffset);
		result.append(')');
		return result.toString();
	}

} //ClockSinusFunctionImpl
