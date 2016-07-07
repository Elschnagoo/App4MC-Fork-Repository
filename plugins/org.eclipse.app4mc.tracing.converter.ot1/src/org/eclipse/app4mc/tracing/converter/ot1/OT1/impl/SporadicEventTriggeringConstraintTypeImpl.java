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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic Event Triggering Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SporadicEventTriggeringConstraintTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SporadicEventTriggeringConstraintTypeImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SporadicEventTriggeringConstraintTypeImpl#getMinInterArrivalTime <em>Min Inter Arrival Time</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SporadicEventTriggeringConstraintTypeImpl#getMaxInterArrivalTime <em>Max Inter Arrival Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SporadicEventTriggeringConstraintTypeImpl extends EventTriggeringConstraintTypeImpl implements SporadicEventTriggeringConstraintType {
	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType period;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType jitter;

	/**
	 * The cached value of the '{@link #getMinInterArrivalTime() <em>Min Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType minInterArrivalTime;

	/**
	 * The cached value of the '{@link #getMaxInterArrivalTime() <em>Max Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValueType maxInterArrivalTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicEventTriggeringConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(TimeValueType newPeriod, NotificationChain msgs) {
		TimeValueType oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(TimeValueType newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitter(TimeValueType newJitter, NotificationChain msgs) {
		TimeValueType oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER, oldJitter, newJitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(TimeValueType newJitter) {
		if (newJitter != jitter) {
			NotificationChain msgs = null;
			if (jitter != null)
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getMinInterArrivalTime() {
		return minInterArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinInterArrivalTime(TimeValueType newMinInterArrivalTime, NotificationChain msgs) {
		TimeValueType oldMinInterArrivalTime = minInterArrivalTime;
		minInterArrivalTime = newMinInterArrivalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME, oldMinInterArrivalTime, newMinInterArrivalTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterArrivalTime(TimeValueType newMinInterArrivalTime) {
		if (newMinInterArrivalTime != minInterArrivalTime) {
			NotificationChain msgs = null;
			if (minInterArrivalTime != null)
				msgs = ((InternalEObject)minInterArrivalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME, null, msgs);
			if (newMinInterArrivalTime != null)
				msgs = ((InternalEObject)newMinInterArrivalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME, null, msgs);
			msgs = basicSetMinInterArrivalTime(newMinInterArrivalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME, newMinInterArrivalTime, newMinInterArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValueType getMaxInterArrivalTime() {
		return maxInterArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxInterArrivalTime(TimeValueType newMaxInterArrivalTime, NotificationChain msgs) {
		TimeValueType oldMaxInterArrivalTime = maxInterArrivalTime;
		maxInterArrivalTime = newMaxInterArrivalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME, oldMaxInterArrivalTime, newMaxInterArrivalTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterArrivalTime(TimeValueType newMaxInterArrivalTime) {
		if (newMaxInterArrivalTime != maxInterArrivalTime) {
			NotificationChain msgs = null;
			if (maxInterArrivalTime != null)
				msgs = ((InternalEObject)maxInterArrivalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME, null, msgs);
			if (newMaxInterArrivalTime != null)
				msgs = ((InternalEObject)newMaxInterArrivalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME, null, msgs);
			msgs = basicSetMaxInterArrivalTime(newMaxInterArrivalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME, newMaxInterArrivalTime, newMaxInterArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				return basicSetPeriod(null, msgs);
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				return basicSetJitter(null, msgs);
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				return basicSetMinInterArrivalTime(null, msgs);
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME:
				return basicSetMaxInterArrivalTime(null, msgs);
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
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				return getPeriod();
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				return getJitter();
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				return getMinInterArrivalTime();
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME:
				return getMaxInterArrivalTime();
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
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				setPeriod((TimeValueType)newValue);
				return;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				setJitter((TimeValueType)newValue);
				return;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				setMinInterArrivalTime((TimeValueType)newValue);
				return;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME:
				setMaxInterArrivalTime((TimeValueType)newValue);
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
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				setPeriod((TimeValueType)null);
				return;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				setJitter((TimeValueType)null);
				return;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				setMinInterArrivalTime((TimeValueType)null);
				return;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME:
				setMaxInterArrivalTime((TimeValueType)null);
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
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				return period != null;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				return jitter != null;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				return minInterArrivalTime != null;
			case OT1Package.SPORADIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MAX_INTER_ARRIVAL_TIME:
				return maxInterArrivalTime != null;
		}
		return super.eIsSet(featureID);
	}

} //SporadicEventTriggeringConstraintTypeImpl
