/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *     Generated using Eclipse EMF
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Information Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationConstraintTypeImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationConstraintTypeImpl#getThresholdType <em>Threshold Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingInformationConstraintTypeImpl#getTimingValueType <em>Timing Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingInformationConstraintTypeImpl extends TimingConstraintElementTypeImpl implements TimingInformationConstraintType {
	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType threshold;

	/**
	 * The default value of the '{@link #getThresholdType() <em>Threshold Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdType()
	 * @generated
	 * @ordered
	 */
	protected static final ThresholdTypeEnum THRESHOLD_TYPE_EDEFAULT = ThresholdTypeEnum.MIN;

	/**
	 * The cached value of the '{@link #getThresholdType() <em>Threshold Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdType()
	 * @generated
	 * @ordered
	 */
	protected ThresholdTypeEnum thresholdType = THRESHOLD_TYPE_EDEFAULT;

	/**
	 * This is true if the Threshold Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thresholdTypeESet;

	/**
	 * The default value of the '{@link #getTimingValueType() <em>Timing Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingValueType()
	 * @generated
	 * @ordered
	 */
	protected static final TimingInformationTypeEnum TIMING_VALUE_TYPE_EDEFAULT = TimingInformationTypeEnum.CET;

	/**
	 * The cached value of the '{@link #getTimingValueType() <em>Timing Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingValueType()
	 * @generated
	 * @ordered
	 */
	protected TimingInformationTypeEnum timingValueType = TIMING_VALUE_TYPE_EDEFAULT;

	/**
	 * This is true if the Timing Value Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timingValueTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingInformationConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TIMING_INFORMATION_CONSTRAINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreshold(TimeValueType newThreshold, NotificationChain msgs) {
		TimeValueType oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD, oldThreshold, newThreshold);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(TimeValueType newThreshold) {
		if (newThreshold != threshold) {
			NotificationChain msgs = null;
			if (threshold != null)
				msgs = ((InternalEObject)threshold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD, null, msgs);
			if (newThreshold != null)
				msgs = ((InternalEObject)newThreshold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD, null, msgs);
			msgs = basicSetThreshold(newThreshold, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD, newThreshold, newThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThresholdTypeEnum getThresholdType() {
		return thresholdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdType(ThresholdTypeEnum newThresholdType) {
		ThresholdTypeEnum oldThresholdType = thresholdType;
		thresholdType = newThresholdType == null ? THRESHOLD_TYPE_EDEFAULT : newThresholdType;
		boolean oldThresholdTypeESet = thresholdTypeESet;
		thresholdTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE, oldThresholdType, thresholdType, !oldThresholdTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdType() {
		ThresholdTypeEnum oldThresholdType = thresholdType;
		boolean oldThresholdTypeESet = thresholdTypeESet;
		thresholdType = THRESHOLD_TYPE_EDEFAULT;
		thresholdTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE, oldThresholdType, THRESHOLD_TYPE_EDEFAULT, oldThresholdTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdType() {
		return thresholdTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationTypeEnum getTimingValueType() {
		return timingValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingValueType(TimingInformationTypeEnum newTimingValueType) {
		TimingInformationTypeEnum oldTimingValueType = timingValueType;
		timingValueType = newTimingValueType == null ? TIMING_VALUE_TYPE_EDEFAULT : newTimingValueType;
		boolean oldTimingValueTypeESet = timingValueTypeESet;
		timingValueTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE, oldTimingValueType, timingValueType, !oldTimingValueTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimingValueType() {
		TimingInformationTypeEnum oldTimingValueType = timingValueType;
		boolean oldTimingValueTypeESet = timingValueTypeESet;
		timingValueType = TIMING_VALUE_TYPE_EDEFAULT;
		timingValueTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE, oldTimingValueType, TIMING_VALUE_TYPE_EDEFAULT, oldTimingValueTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimingValueType() {
		return timingValueTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD:
				return basicSetThreshold(null, msgs);
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
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD:
				return getThreshold();
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE:
				return getThresholdType();
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE:
				return getTimingValueType();
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
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD:
				setThreshold((TimeValueType)newValue);
				return;
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE:
				setThresholdType((ThresholdTypeEnum)newValue);
				return;
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE:
				setTimingValueType((TimingInformationTypeEnum)newValue);
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
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD:
				setThreshold((TimeValueType)null);
				return;
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE:
				unsetThresholdType();
				return;
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE:
				unsetTimingValueType();
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
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD:
				return threshold != null;
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__THRESHOLD_TYPE:
				return isSetThresholdType();
			case OT1Package.TIMING_INFORMATION_CONSTRAINT_TYPE__TIMING_VALUE_TYPE:
				return isSetTimingValueType();
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
		result.append(" (thresholdType: ");
		if (thresholdTypeESet) result.append(thresholdType); else result.append("<unset>");
		result.append(", timingValueType: ");
		if (timingValueTypeESet) result.append(timingValueType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimingInformationConstraintTypeImpl
