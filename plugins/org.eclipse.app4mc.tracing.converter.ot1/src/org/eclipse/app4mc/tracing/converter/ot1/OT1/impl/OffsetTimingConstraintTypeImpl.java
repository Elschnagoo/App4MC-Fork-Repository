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

import java.math.BigInteger;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offset Timing Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OffsetTimingConstraintTypeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OffsetTimingConstraintTypeImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OffsetTimingConstraintTypeImpl#getSourceEventId <em>Source Event Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OffsetTimingConstraintTypeImpl#getTargetEventId <em>Target Event Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OffsetTimingConstraintTypeImpl extends TimingConstraintElementTypeImpl implements OffsetTimingConstraintType {
	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType minimum;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType maximum;

	/**
	 * The default value of the '{@link #getSourceEventId() <em>Source Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEventId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOURCE_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceEventId() <em>Source Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEventId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sourceEventId = SOURCE_EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetEventId() <em>Target Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEventId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TARGET_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetEventId() <em>Target Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEventId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger targetEventId = TARGET_EVENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OffsetTimingConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.OFFSET_TIMING_CONSTRAINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimum(TimeValueType newMinimum, NotificationChain msgs) {
		TimeValueType oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM, oldMinimum, newMinimum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(TimeValueType newMinimum) {
		if (newMinimum != minimum) {
			NotificationChain msgs = null;
			if (minimum != null)
				msgs = ((InternalEObject)minimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM, null, msgs);
			if (newMinimum != null)
				msgs = ((InternalEObject)newMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM, null, msgs);
			msgs = basicSetMinimum(newMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM, newMinimum, newMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximum(TimeValueType newMaximum, NotificationChain msgs) {
		TimeValueType oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM, oldMaximum, newMaximum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(TimeValueType newMaximum) {
		if (newMaximum != maximum) {
			NotificationChain msgs = null;
			if (maximum != null)
				msgs = ((InternalEObject)maximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM, null, msgs);
			if (newMaximum != null)
				msgs = ((InternalEObject)newMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM, null, msgs);
			msgs = basicSetMaximum(newMaximum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM, newMaximum, newMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSourceEventId() {
		return sourceEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEventId(BigInteger newSourceEventId) {
		BigInteger oldSourceEventId = sourceEventId;
		sourceEventId = newSourceEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__SOURCE_EVENT_ID, oldSourceEventId, sourceEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTargetEventId() {
		return targetEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEventId(BigInteger newTargetEventId) {
		BigInteger oldTargetEventId = targetEventId;
		targetEventId = newTargetEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__TARGET_EVENT_ID, oldTargetEventId, targetEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM:
				return basicSetMinimum(null, msgs);
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				return basicSetMaximum(null, msgs);
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
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM:
				return getMinimum();
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				return getMaximum();
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__SOURCE_EVENT_ID:
				return getSourceEventId();
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__TARGET_EVENT_ID:
				return getTargetEventId();
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
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM:
				setMinimum((TimeValueType)newValue);
				return;
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				setMaximum((TimeValueType)newValue);
				return;
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__SOURCE_EVENT_ID:
				setSourceEventId((BigInteger)newValue);
				return;
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__TARGET_EVENT_ID:
				setTargetEventId((BigInteger)newValue);
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
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM:
				setMinimum((TimeValueType)null);
				return;
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				setMaximum((TimeValueType)null);
				return;
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__SOURCE_EVENT_ID:
				setSourceEventId(SOURCE_EVENT_ID_EDEFAULT);
				return;
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__TARGET_EVENT_ID:
				setTargetEventId(TARGET_EVENT_ID_EDEFAULT);
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
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MINIMUM:
				return minimum != null;
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				return maximum != null;
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__SOURCE_EVENT_ID:
				return SOURCE_EVENT_ID_EDEFAULT == null ? sourceEventId != null : !SOURCE_EVENT_ID_EDEFAULT.equals(sourceEventId);
			case OT1Package.OFFSET_TIMING_CONSTRAINT_TYPE__TARGET_EVENT_ID:
				return TARGET_EVENT_ID_EDEFAULT == null ? targetEventId != null : !TARGET_EVENT_ID_EDEFAULT.equals(targetEventId);
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
		result.append(" (sourceEventId: ");
		result.append(sourceEventId);
		result.append(", targetEventId: ");
		result.append(targetEventId);
		result.append(')');
		return result.toString();
	}

} //OffsetTimingConstraintTypeImpl
