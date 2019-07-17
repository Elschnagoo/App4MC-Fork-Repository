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
import org.eclipse.app4mc.amalthea.model.ClockFunction;
import org.eclipse.app4mc.amalthea.model.CurveType;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockFunctionImpl#getCurveType <em>Curve Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockFunctionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockFunctionImpl#getPeakToPeak <em>Peak To Peak</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockFunctionImpl#getXOffset <em>XOffset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ClockFunctionImpl#getYOffset <em>YOffset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockFunctionImpl extends ClockImpl implements ClockFunction {
	/**
	 * The default value of the '{@link #getCurveType() <em>Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveType()
	 * @generated
	 * @ordered
	 */
	protected static final CurveType CURVE_TYPE_EDEFAULT = CurveType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getCurveType() <em>Curve Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveType()
	 * @generated
	 * @ordered
	 */
	protected CurveType curveType = CURVE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getPeakToPeak() <em>Peak To Peak</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakToPeak()
	 * @generated
	 * @ordered
	 */
	protected Frequency peakToPeak;

	/**
	 * The cached value of the '{@link #getXOffset() <em>XOffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXOffset()
	 * @generated
	 * @ordered
	 */
	protected Time xOffset;

	/**
	 * The cached value of the '{@link #getYOffset() <em>YOffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOffset()
	 * @generated
	 * @ordered
	 */
	protected Frequency yOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getClockFunction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveType getCurveType() {
		return curveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurveType(CurveType newCurveType) {
		CurveType oldCurveType = curveType;
		curveType = newCurveType == null ? CURVE_TYPE_EDEFAULT : newCurveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__CURVE_TYPE, oldCurveType, curveType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_FUNCTION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_FUNCTION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Frequency getPeakToPeak() {
		return peakToPeak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeakToPeak(Frequency newPeakToPeak, NotificationChain msgs) {
		Frequency oldPeakToPeak = peakToPeak;
		peakToPeak = newPeakToPeak;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK, oldPeakToPeak, newPeakToPeak);
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
	public void setPeakToPeak(Frequency newPeakToPeak) {
		if (newPeakToPeak != peakToPeak) {
			NotificationChain msgs = null;
			if (peakToPeak != null)
				msgs = ((InternalEObject)peakToPeak).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK, null, msgs);
			if (newPeakToPeak != null)
				msgs = ((InternalEObject)newPeakToPeak).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK, null, msgs);
			msgs = basicSetPeakToPeak(newPeakToPeak, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK, newPeakToPeak, newPeakToPeak));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getXOffset() {
		return xOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXOffset(Time newXOffset, NotificationChain msgs) {
		Time oldXOffset = xOffset;
		xOffset = newXOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__XOFFSET, oldXOffset, newXOffset);
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
	public void setXOffset(Time newXOffset) {
		if (newXOffset != xOffset) {
			NotificationChain msgs = null;
			if (xOffset != null)
				msgs = ((InternalEObject)xOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_FUNCTION__XOFFSET, null, msgs);
			if (newXOffset != null)
				msgs = ((InternalEObject)newXOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_FUNCTION__XOFFSET, null, msgs);
			msgs = basicSetXOffset(newXOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__XOFFSET, newXOffset, newXOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Frequency getYOffset() {
		return yOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYOffset(Frequency newYOffset, NotificationChain msgs) {
		Frequency oldYOffset = yOffset;
		yOffset = newYOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__YOFFSET, oldYOffset, newYOffset);
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
	public void setYOffset(Frequency newYOffset) {
		if (newYOffset != yOffset) {
			NotificationChain msgs = null;
			if (yOffset != null)
				msgs = ((InternalEObject)yOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_FUNCTION__YOFFSET, null, msgs);
			if (newYOffset != null)
				msgs = ((InternalEObject)newYOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CLOCK_FUNCTION__YOFFSET, null, msgs);
			msgs = basicSetYOffset(newYOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CLOCK_FUNCTION__YOFFSET, newYOffset, newYOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CLOCK_FUNCTION__PERIOD:
				return basicSetPeriod(null, msgs);
			case AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK:
				return basicSetPeakToPeak(null, msgs);
			case AmaltheaPackage.CLOCK_FUNCTION__XOFFSET:
				return basicSetXOffset(null, msgs);
			case AmaltheaPackage.CLOCK_FUNCTION__YOFFSET:
				return basicSetYOffset(null, msgs);
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
			case AmaltheaPackage.CLOCK_FUNCTION__CURVE_TYPE:
				return getCurveType();
			case AmaltheaPackage.CLOCK_FUNCTION__PERIOD:
				return getPeriod();
			case AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK:
				return getPeakToPeak();
			case AmaltheaPackage.CLOCK_FUNCTION__XOFFSET:
				return getXOffset();
			case AmaltheaPackage.CLOCK_FUNCTION__YOFFSET:
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
			case AmaltheaPackage.CLOCK_FUNCTION__CURVE_TYPE:
				setCurveType((CurveType)newValue);
				return;
			case AmaltheaPackage.CLOCK_FUNCTION__PERIOD:
				setPeriod((Time)newValue);
				return;
			case AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK:
				setPeakToPeak((Frequency)newValue);
				return;
			case AmaltheaPackage.CLOCK_FUNCTION__XOFFSET:
				setXOffset((Time)newValue);
				return;
			case AmaltheaPackage.CLOCK_FUNCTION__YOFFSET:
				setYOffset((Frequency)newValue);
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
			case AmaltheaPackage.CLOCK_FUNCTION__CURVE_TYPE:
				setCurveType(CURVE_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.CLOCK_FUNCTION__PERIOD:
				setPeriod((Time)null);
				return;
			case AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK:
				setPeakToPeak((Frequency)null);
				return;
			case AmaltheaPackage.CLOCK_FUNCTION__XOFFSET:
				setXOffset((Time)null);
				return;
			case AmaltheaPackage.CLOCK_FUNCTION__YOFFSET:
				setYOffset((Frequency)null);
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
			case AmaltheaPackage.CLOCK_FUNCTION__CURVE_TYPE:
				return curveType != CURVE_TYPE_EDEFAULT;
			case AmaltheaPackage.CLOCK_FUNCTION__PERIOD:
				return period != null;
			case AmaltheaPackage.CLOCK_FUNCTION__PEAK_TO_PEAK:
				return peakToPeak != null;
			case AmaltheaPackage.CLOCK_FUNCTION__XOFFSET:
				return xOffset != null;
			case AmaltheaPackage.CLOCK_FUNCTION__YOFFSET:
				return yOffset != null;
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
		result.append(" (curveType: ");
		result.append(curveType);
		result.append(')');
		return result.toString();
	}

} //ClockFunctionImpl
