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
import org.eclipse.app4mc.amalthea.model.EntityEvent;
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repetition Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RepetitionConstraintImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RepetitionConstraintImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RepetitionConstraintImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RepetitionConstraintImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RepetitionConstraintImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RepetitionConstraintImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepetitionConstraintImpl extends TimingConstraintImpl implements RepetitionConstraint {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EntityEvent event;

	/**
	 * The default value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int SPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpan() <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpan()
	 * @generated
	 * @ordered
	 */
	protected int span = SPAN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Time lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Time upper;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected Time jitter;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepetitionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRepetitionConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityEvent getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (EntityEvent)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.REPETITION_CONSTRAINT__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityEvent basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(EntityEvent newEvent) {
		EntityEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSpan() {
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpan(int newSpan) {
		int oldSpan = span;
		span = newSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__SPAN, oldSpan, span));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(Time newLower, NotificationChain msgs) {
		Time oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__LOWER, oldLower, newLower);
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
	public void setLower(Time newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.REPETITION_CONSTRAINT__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.REPETITION_CONSTRAINT__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__LOWER, newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper(Time newUpper, NotificationChain msgs) {
		Time oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__UPPER, oldUpper, newUpper);
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
	public void setUpper(Time newUpper) {
		if (newUpper != upper) {
			NotificationChain msgs = null;
			if (upper != null)
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.REPETITION_CONSTRAINT__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.REPETITION_CONSTRAINT__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__UPPER, newUpper, newUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitter(Time newJitter, NotificationChain msgs) {
		Time oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__JITTER, oldJitter, newJitter);
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
	public void setJitter(Time newJitter) {
		if (newJitter != jitter) {
			NotificationChain msgs = null;
			if (jitter != null)
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.REPETITION_CONSTRAINT__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.REPETITION_CONSTRAINT__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__JITTER, newJitter, newJitter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.REPETITION_CONSTRAINT__LOWER:
				return basicSetLower(null, msgs);
			case AmaltheaPackage.REPETITION_CONSTRAINT__UPPER:
				return basicSetUpper(null, msgs);
			case AmaltheaPackage.REPETITION_CONSTRAINT__JITTER:
				return basicSetJitter(null, msgs);
			case AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD:
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
			case AmaltheaPackage.REPETITION_CONSTRAINT__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case AmaltheaPackage.REPETITION_CONSTRAINT__SPAN:
				return getSpan();
			case AmaltheaPackage.REPETITION_CONSTRAINT__LOWER:
				return getLower();
			case AmaltheaPackage.REPETITION_CONSTRAINT__UPPER:
				return getUpper();
			case AmaltheaPackage.REPETITION_CONSTRAINT__JITTER:
				return getJitter();
			case AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD:
				return getPeriod();
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
			case AmaltheaPackage.REPETITION_CONSTRAINT__EVENT:
				setEvent((EntityEvent)newValue);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__SPAN:
				setSpan((Integer)newValue);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__LOWER:
				setLower((Time)newValue);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__UPPER:
				setUpper((Time)newValue);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__JITTER:
				setJitter((Time)newValue);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD:
				setPeriod((Time)newValue);
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
			case AmaltheaPackage.REPETITION_CONSTRAINT__EVENT:
				setEvent((EntityEvent)null);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__SPAN:
				setSpan(SPAN_EDEFAULT);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__LOWER:
				setLower((Time)null);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__UPPER:
				setUpper((Time)null);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__JITTER:
				setJitter((Time)null);
				return;
			case AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD:
				setPeriod((Time)null);
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
			case AmaltheaPackage.REPETITION_CONSTRAINT__EVENT:
				return event != null;
			case AmaltheaPackage.REPETITION_CONSTRAINT__SPAN:
				return span != SPAN_EDEFAULT;
			case AmaltheaPackage.REPETITION_CONSTRAINT__LOWER:
				return lower != null;
			case AmaltheaPackage.REPETITION_CONSTRAINT__UPPER:
				return upper != null;
			case AmaltheaPackage.REPETITION_CONSTRAINT__JITTER:
				return jitter != null;
			case AmaltheaPackage.REPETITION_CONSTRAINT__PERIOD:
				return period != null;
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
		result.append(" (span: ");
		result.append(span);
		result.append(')');
		return result.toString();
	}

} //RepetitionConstraintImpl
