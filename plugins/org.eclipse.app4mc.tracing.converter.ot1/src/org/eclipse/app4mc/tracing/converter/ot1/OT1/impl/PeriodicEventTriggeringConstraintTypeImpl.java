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
import org.eclipse.app4mc.tracing.converter.ot1.OT1.PeriodicEventTriggeringConstraintType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Event Triggering Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PeriodicEventTriggeringConstraintTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PeriodicEventTriggeringConstraintTypeImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.PeriodicEventTriggeringConstraintTypeImpl#getMinInterArrivalTime <em>Min Inter Arrival Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicEventTriggeringConstraintTypeImpl extends EventTriggeringConstraintTypeImpl implements PeriodicEventTriggeringConstraintType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicEventTriggeringConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD, newPeriod, newPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER, oldJitter, newJitter);
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
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER, newJitter, newJitter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME, oldMinInterArrivalTime, newMinInterArrivalTime);
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
				msgs = ((InternalEObject)minInterArrivalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME, null, msgs);
			if (newMinInterArrivalTime != null)
				msgs = ((InternalEObject)newMinInterArrivalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME, null, msgs);
			msgs = basicSetMinInterArrivalTime(newMinInterArrivalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME, newMinInterArrivalTime, newMinInterArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				return basicSetPeriod(null, msgs);
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				return basicSetJitter(null, msgs);
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				return basicSetMinInterArrivalTime(null, msgs);
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
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				return getPeriod();
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				return getJitter();
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				return getMinInterArrivalTime();
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
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				setPeriod((TimeValueType)newValue);
				return;
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				setJitter((TimeValueType)newValue);
				return;
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				setMinInterArrivalTime((TimeValueType)newValue);
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
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				setPeriod((TimeValueType)null);
				return;
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				setJitter((TimeValueType)null);
				return;
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				setMinInterArrivalTime((TimeValueType)null);
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
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__PERIOD:
				return period != null;
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__JITTER:
				return jitter != null;
			case OT1Package.PERIODIC_EVENT_TRIGGERING_CONSTRAINT_TYPE__MIN_INTER_ARRIVAL_TIME:
				return minInterArrivalTime != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriodicEventTriggeringConstraintTypeImpl
