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
import org.eclipse.app4mc.amalthea.model.TimeHistogramEntry;
import org.eclipse.app4mc.amalthea.model.TimeInterval;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Histogram Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeHistogramEntryImpl#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeHistogramEntryImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeHistogramEntryImpl extends AmaltheaExtendedEObjectImpl implements TimeHistogramEntry {
	/**
	 * The default value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final long OCCURRENCES_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected long occurrences = OCCURRENCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval interval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeHistogramEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTimeHistogramEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getOccurrences() {
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrences(long newOccurrences) {
		long oldOccurrences = occurrences;
		occurrences = newOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_HISTOGRAM_ENTRY__OCCURRENCES, oldOccurrences, occurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterval(TimeInterval newInterval, NotificationChain msgs) {
		TimeInterval oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL, oldInterval, newInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(TimeInterval newInterval) {
		if (newInterval != interval) {
			NotificationChain msgs = null;
			if (interval != null)
				msgs = ((InternalEObject)interval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL, null, msgs);
			if (newInterval != null)
				msgs = ((InternalEObject)newInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL, null, msgs);
			msgs = basicSetInterval(newInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL, newInterval, newInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL:
				return basicSetInterval(null, msgs);
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
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__OCCURRENCES:
				return getOccurrences();
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL:
				return getInterval();
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
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__OCCURRENCES:
				setOccurrences((Long)newValue);
				return;
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL:
				setInterval((TimeInterval)newValue);
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
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__OCCURRENCES:
				setOccurrences(OCCURRENCES_EDEFAULT);
				return;
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL:
				setInterval((TimeInterval)null);
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
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__OCCURRENCES:
				return occurrences != OCCURRENCES_EDEFAULT;
			case AmaltheaPackage.TIME_HISTOGRAM_ENTRY__INTERVAL:
				return interval != null;
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
		result.append(" (occurrences: ");
		result.append(occurrences);
		result.append(')');
		return result.toString();
	}

} //TimeHistogramEntryImpl
