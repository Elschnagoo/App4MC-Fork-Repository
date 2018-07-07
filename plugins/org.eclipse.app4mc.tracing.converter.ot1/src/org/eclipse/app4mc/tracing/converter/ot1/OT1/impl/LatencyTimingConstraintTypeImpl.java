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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTimingConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency Timing Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LatencyTimingConstraintTypeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LatencyTimingConstraintTypeImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.LatencyTimingConstraintTypeImpl#getEventChainId <em>Event Chain Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyTimingConstraintTypeImpl extends TimingConstraintElementTypeImpl implements LatencyTimingConstraintType {
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
	 * The default value of the '{@link #getEventChainId() <em>Event Chain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChainId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EVENT_CHAIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventChainId() <em>Event Chain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChainId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger eventChainId = EVENT_CHAIN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyTimingConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.LATENCY_TIMING_CONSTRAINT_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM, oldMinimum, newMinimum);
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
				msgs = ((InternalEObject)minimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM, null, msgs);
			if (newMinimum != null)
				msgs = ((InternalEObject)newMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM, null, msgs);
			msgs = basicSetMinimum(newMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM, newMinimum, newMinimum));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM, oldMaximum, newMaximum);
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
				msgs = ((InternalEObject)maximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM, null, msgs);
			if (newMaximum != null)
				msgs = ((InternalEObject)newMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM, null, msgs);
			msgs = basicSetMaximum(newMaximum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM, newMaximum, newMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEventChainId() {
		return eventChainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventChainId(BigInteger newEventChainId) {
		BigInteger oldEventChainId = eventChainId;
		eventChainId = newEventChainId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__EVENT_CHAIN_ID, oldEventChainId, eventChainId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM:
				return basicSetMinimum(null, msgs);
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM:
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
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM:
				return getMinimum();
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				return getMaximum();
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__EVENT_CHAIN_ID:
				return getEventChainId();
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
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM:
				setMinimum((TimeValueType)newValue);
				return;
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				setMaximum((TimeValueType)newValue);
				return;
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__EVENT_CHAIN_ID:
				setEventChainId((BigInteger)newValue);
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
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM:
				setMinimum((TimeValueType)null);
				return;
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				setMaximum((TimeValueType)null);
				return;
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__EVENT_CHAIN_ID:
				setEventChainId(EVENT_CHAIN_ID_EDEFAULT);
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
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MINIMUM:
				return minimum != null;
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__MAXIMUM:
				return maximum != null;
			case OT1Package.LATENCY_TIMING_CONSTRAINT_TYPE__EVENT_CHAIN_ID:
				return EVENT_CHAIN_ID_EDEFAULT == null ? eventChainId != null : !EVENT_CHAIN_ID_EDEFAULT.equals(eventChainId);
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
		result.append(" (eventChainId: ");
		result.append(eventChainId);
		result.append(')');
		return result.toString();
	}

} //LatencyTimingConstraintTypeImpl
