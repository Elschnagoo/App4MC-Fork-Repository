/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Synthetic;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimestampList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synthetic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SyntheticImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SyntheticImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SyntheticImpl#getTriggerTimes <em>Trigger Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SyntheticImpl extends StimulusImpl implements Synthetic {
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Time offset;

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
	 * The cached value of the '{@link #getTriggerTimes() <em>Trigger Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerTimes()
	 * @generated
	 * @ordered
	 */
	protected TimestampList triggerTimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntheticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSynthetic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(Time newOffset, NotificationChain msgs) {
		Time oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNTHETIC__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Time newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNTHETIC__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNTHETIC__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNTHETIC__OFFSET, newOffset, newOffset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNTHETIC__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNTHETIC__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNTHETIC__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNTHETIC__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampList getTriggerTimes() {
		return triggerTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerTimes(TimestampList newTriggerTimes, NotificationChain msgs) {
		TimestampList oldTriggerTimes = triggerTimes;
		triggerTimes = newTriggerTimes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES, oldTriggerTimes, newTriggerTimes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerTimes(TimestampList newTriggerTimes) {
		if (newTriggerTimes != triggerTimes) {
			NotificationChain msgs = null;
			if (triggerTimes != null)
				msgs = ((InternalEObject)triggerTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES, null, msgs);
			if (newTriggerTimes != null)
				msgs = ((InternalEObject)newTriggerTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES, null, msgs);
			msgs = basicSetTriggerTimes(newTriggerTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES, newTriggerTimes, newTriggerTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SYNTHETIC__OFFSET:
				return basicSetOffset(null, msgs);
			case AmaltheaPackage.SYNTHETIC__PERIOD:
				return basicSetPeriod(null, msgs);
			case AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES:
				return basicSetTriggerTimes(null, msgs);
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
			case AmaltheaPackage.SYNTHETIC__OFFSET:
				return getOffset();
			case AmaltheaPackage.SYNTHETIC__PERIOD:
				return getPeriod();
			case AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES:
				return getTriggerTimes();
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
			case AmaltheaPackage.SYNTHETIC__OFFSET:
				setOffset((Time)newValue);
				return;
			case AmaltheaPackage.SYNTHETIC__PERIOD:
				setPeriod((Time)newValue);
				return;
			case AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES:
				setTriggerTimes((TimestampList)newValue);
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
			case AmaltheaPackage.SYNTHETIC__OFFSET:
				setOffset((Time)null);
				return;
			case AmaltheaPackage.SYNTHETIC__PERIOD:
				setPeriod((Time)null);
				return;
			case AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES:
				setTriggerTimes((TimestampList)null);
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
			case AmaltheaPackage.SYNTHETIC__OFFSET:
				return offset != null;
			case AmaltheaPackage.SYNTHETIC__PERIOD:
				return period != null;
			case AmaltheaPackage.SYNTHETIC__TRIGGER_TIMES:
				return triggerTimes != null;
		}
		return super.eIsSet(featureID);
	}

} //SyntheticImpl
