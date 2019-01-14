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
import org.eclipse.app4mc.amalthea.model.FixedPeriodic;
import org.eclipse.app4mc.amalthea.model.PeriodicBurstStimulus;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Burst Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicBurstStimulusImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicBurstStimulusImpl#getRecurrence <em>Recurrence</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicBurstStimulusImpl#getBurstLength <em>Burst Length</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicBurstStimulusImpl#getOccurrenceMinDistance <em>Occurrence Min Distance</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicBurstStimulusImpl#getOccurrenceCount <em>Occurrence Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicBurstStimulusImpl extends StimulusImpl implements PeriodicBurstStimulus {
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
	 * The cached value of the '{@link #getRecurrence() <em>Recurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrence()
	 * @generated
	 * @ordered
	 */
	protected Time recurrence;

	/**
	 * The cached value of the '{@link #getBurstLength() <em>Burst Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstLength()
	 * @generated
	 * @ordered
	 */
	protected Time burstLength;

	/**
	 * The cached value of the '{@link #getOccurrenceMinDistance() <em>Occurrence Min Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceMinDistance()
	 * @generated
	 * @ordered
	 */
	protected Time occurrenceMinDistance;

	/**
	 * The default value of the '{@link #getOccurrenceCount() <em>Occurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURRENCE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurrenceCount() <em>Occurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceCount()
	 * @generated
	 * @ordered
	 */
	protected int occurrenceCount = OCCURRENCE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicBurstStimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getPeriodicBurstStimulus();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET, oldOffset, newOffset);
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
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getRecurrence() {
		return recurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecurrence(Time newRecurrence, NotificationChain msgs) {
		Time oldRecurrence = recurrence;
		recurrence = newRecurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE, oldRecurrence, newRecurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurrence(Time newRecurrence) {
		if (newRecurrence != recurrence) {
			NotificationChain msgs = null;
			if (recurrence != null)
				msgs = ((InternalEObject)recurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE, null, msgs);
			if (newRecurrence != null)
				msgs = ((InternalEObject)newRecurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE, null, msgs);
			msgs = basicSetRecurrence(newRecurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE, newRecurrence, newRecurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getBurstLength() {
		return burstLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBurstLength(Time newBurstLength, NotificationChain msgs) {
		Time oldBurstLength = burstLength;
		burstLength = newBurstLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH, oldBurstLength, newBurstLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBurstLength(Time newBurstLength) {
		if (newBurstLength != burstLength) {
			NotificationChain msgs = null;
			if (burstLength != null)
				msgs = ((InternalEObject)burstLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH, null, msgs);
			if (newBurstLength != null)
				msgs = ((InternalEObject)newBurstLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH, null, msgs);
			msgs = basicSetBurstLength(newBurstLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH, newBurstLength, newBurstLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getOccurrenceMinDistance() {
		return occurrenceMinDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceMinDistance(Time newOccurrenceMinDistance, NotificationChain msgs) {
		Time oldOccurrenceMinDistance = occurrenceMinDistance;
		occurrenceMinDistance = newOccurrenceMinDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE, oldOccurrenceMinDistance, newOccurrenceMinDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceMinDistance(Time newOccurrenceMinDistance) {
		if (newOccurrenceMinDistance != occurrenceMinDistance) {
			NotificationChain msgs = null;
			if (occurrenceMinDistance != null)
				msgs = ((InternalEObject)occurrenceMinDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE, null, msgs);
			if (newOccurrenceMinDistance != null)
				msgs = ((InternalEObject)newOccurrenceMinDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE, null, msgs);
			msgs = basicSetOccurrenceMinDistance(newOccurrenceMinDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE, newOccurrenceMinDistance, newOccurrenceMinDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOccurrenceCount() {
		return occurrenceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceCount(int newOccurrenceCount) {
		int oldOccurrenceCount = occurrenceCount;
		occurrenceCount = newOccurrenceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_COUNT, oldOccurrenceCount, occurrenceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET:
				return basicSetOffset(null, msgs);
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE:
				return basicSetRecurrence(null, msgs);
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH:
				return basicSetBurstLength(null, msgs);
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE:
				return basicSetOccurrenceMinDistance(null, msgs);
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
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET:
				return getOffset();
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE:
				return getRecurrence();
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH:
				return getBurstLength();
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE:
				return getOccurrenceMinDistance();
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_COUNT:
				return getOccurrenceCount();
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
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET:
				setOffset((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE:
				setRecurrence((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH:
				setBurstLength((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE:
				setOccurrenceMinDistance((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_COUNT:
				setOccurrenceCount((Integer)newValue);
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
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET:
				setOffset((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE:
				setRecurrence((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH:
				setBurstLength((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE:
				setOccurrenceMinDistance((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_COUNT:
				setOccurrenceCount(OCCURRENCE_COUNT_EDEFAULT);
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
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET:
				return offset != null;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE:
				return recurrence != null;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__BURST_LENGTH:
				return burstLength != null;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_MIN_DISTANCE:
				return occurrenceMinDistance != null;
			case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OCCURRENCE_COUNT:
				return occurrenceCount != OCCURRENCE_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FixedPeriodic.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET: return AmaltheaPackage.FIXED_PERIODIC__OFFSET;
				case AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE: return AmaltheaPackage.FIXED_PERIODIC__RECURRENCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FixedPeriodic.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.FIXED_PERIODIC__OFFSET: return AmaltheaPackage.PERIODIC_BURST_STIMULUS__OFFSET;
				case AmaltheaPackage.FIXED_PERIODIC__RECURRENCE: return AmaltheaPackage.PERIODIC_BURST_STIMULUS__RECURRENCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (occurrenceCount: ");
		result.append(occurrenceCount);
		result.append(')');
		return result.toString();
	}

} //PeriodicBurstStimulusImpl
