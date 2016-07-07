/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import java.math.BigInteger;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ClockTypeImpl#getTickduration <em>Tickduration</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.ClockTypeImpl#getMaxAbsTime <em>Max Abs Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockTypeImpl extends EObjectImpl implements ClockType {
	/**
	 * The cached value of the '{@link #getTickduration() <em>Tickduration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickduration()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType tickduration;

	/**
	 * The default value of the '{@link #getMaxAbsTime() <em>Max Abs Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAbsTime()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_ABS_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAbsTime() <em>Max Abs Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAbsTime()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxAbsTime = MAX_ABS_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.CLOCK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getTickduration() {
		return tickduration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTickduration(TimeValueType newTickduration, NotificationChain msgs) {
		TimeValueType oldTickduration = tickduration;
		tickduration = newTickduration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.CLOCK_TYPE__TICKDURATION, oldTickduration, newTickduration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickduration(TimeValueType newTickduration) {
		if (newTickduration != tickduration) {
			NotificationChain msgs = null;
			if (tickduration != null)
				msgs = ((InternalEObject)tickduration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.CLOCK_TYPE__TICKDURATION, null, msgs);
			if (newTickduration != null)
				msgs = ((InternalEObject)newTickduration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.CLOCK_TYPE__TICKDURATION, null, msgs);
			msgs = basicSetTickduration(newTickduration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.CLOCK_TYPE__TICKDURATION, newTickduration, newTickduration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxAbsTime() {
		return maxAbsTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAbsTime(BigInteger newMaxAbsTime) {
		BigInteger oldMaxAbsTime = maxAbsTime;
		maxAbsTime = newMaxAbsTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.CLOCK_TYPE__MAX_ABS_TIME, oldMaxAbsTime, maxAbsTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.CLOCK_TYPE__TICKDURATION:
				return basicSetTickduration(null, msgs);
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
			case OT1Package.CLOCK_TYPE__TICKDURATION:
				return getTickduration();
			case OT1Package.CLOCK_TYPE__MAX_ABS_TIME:
				return getMaxAbsTime();
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
			case OT1Package.CLOCK_TYPE__TICKDURATION:
				setTickduration((TimeValueType)newValue);
				return;
			case OT1Package.CLOCK_TYPE__MAX_ABS_TIME:
				setMaxAbsTime((BigInteger)newValue);
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
			case OT1Package.CLOCK_TYPE__TICKDURATION:
				setTickduration((TimeValueType)null);
				return;
			case OT1Package.CLOCK_TYPE__MAX_ABS_TIME:
				setMaxAbsTime(MAX_ABS_TIME_EDEFAULT);
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
			case OT1Package.CLOCK_TYPE__TICKDURATION:
				return tickduration != null;
			case OT1Package.CLOCK_TYPE__MAX_ABS_TIME:
				return MAX_ABS_TIME_EDEFAULT == null ? maxAbsTime != null : !MAX_ABS_TIME_EDEFAULT.equals(maxAbsTime);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxAbsTime: ");
		result.append(maxAbsTime);
		result.append(')');
		return result.toString();
	}

} //ClockTypeImpl
