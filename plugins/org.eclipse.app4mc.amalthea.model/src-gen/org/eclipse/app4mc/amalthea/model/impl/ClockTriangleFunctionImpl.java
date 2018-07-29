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
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Triangle Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockTriangleFunctionImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockTriangleFunctionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockTriangleFunctionImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockTriangleFunctionImpl#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockTriangleFunctionImpl extends ClockImpl implements ClockTriangleFunction {
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
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockTriangleFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getClockTriangleFunction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT, oldShift, newShift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShift(Time newShift) {
		if (newShift != shift) {
			NotificationChain msgs = null;
			if (shift != null)
				msgs = ((InternalEObject)shift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT, null, msgs);
			if (newShift != null)
				msgs = ((InternalEObject)newShift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT, null, msgs);
			msgs = basicSetShift(newShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT, newShift, newShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Time newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(double newMax) {
		double oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(double newMin) {
		double oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT:
				return basicSetShift(null, msgs);
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD:
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
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT:
				return getShift();
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD:
				return getPeriod();
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MAX:
				return getMax();
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MIN:
				return getMin();
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
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT:
				setShift((Time)newValue);
				return;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD:
				setPeriod((Time)newValue);
				return;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MAX:
				setMax((Double)newValue);
				return;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MIN:
				setMin((Double)newValue);
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
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT:
				setShift((Time)null);
				return;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD:
				setPeriod((Time)null);
				return;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MIN:
				setMin(MIN_EDEFAULT);
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
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__SHIFT:
				return shift != null;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD:
				return period != null;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MAX:
				return max != MAX_EDEFAULT;
			case AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__MIN:
				return min != MIN_EDEFAULT;
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
		result.append(" (max: ");
		result.append(max);
		result.append(", min: ");
		result.append(min);
		result.append(')');
		return result.toString();
	}

} //ClockTriangleFunctionImpl
