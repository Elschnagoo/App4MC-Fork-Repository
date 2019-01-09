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
import org.eclipse.app4mc.amalthea.model.FixedPeriodic;
import org.eclipse.app4mc.amalthea.model.ITimeDeviation;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicStimulusImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicStimulusImpl#getRecurrence <em>Recurrence</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicStimulusImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicStimulusImpl#getMinDistance <em>Min Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicStimulusImpl extends StimulusImpl implements PeriodicStimulus {
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
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected ITimeDeviation jitter;

	/**
	 * The cached value of the '{@link #getMinDistance() <em>Min Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDistance()
	 * @generated
	 * @ordered
	 */
	protected Time minDistance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicStimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getPeriodicStimulus();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_STIMULUS__OFFSET, oldOffset, newOffset);
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
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_STIMULUS__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_STIMULUS__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_STIMULUS__OFFSET, newOffset, newOffset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE, oldRecurrence, newRecurrence);
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
				msgs = ((InternalEObject)recurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE, null, msgs);
			if (newRecurrence != null)
				msgs = ((InternalEObject)newRecurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE, null, msgs);
			msgs = basicSetRecurrence(newRecurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE, newRecurrence, newRecurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITimeDeviation getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitter(ITimeDeviation newJitter, NotificationChain msgs) {
		ITimeDeviation oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_STIMULUS__JITTER, oldJitter, newJitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(ITimeDeviation newJitter) {
		if (newJitter != jitter) {
			NotificationChain msgs = null;
			if (jitter != null)
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_STIMULUS__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_STIMULUS__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_STIMULUS__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMinDistance() {
		return minDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinDistance(Time newMinDistance, NotificationChain msgs) {
		Time oldMinDistance = minDistance;
		minDistance = newMinDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE, oldMinDistance, newMinDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDistance(Time newMinDistance) {
		if (newMinDistance != minDistance) {
			NotificationChain msgs = null;
			if (minDistance != null)
				msgs = ((InternalEObject)minDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE, null, msgs);
			if (newMinDistance != null)
				msgs = ((InternalEObject)newMinDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE, null, msgs);
			msgs = basicSetMinDistance(newMinDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE, newMinDistance, newMinDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PERIODIC_STIMULUS__OFFSET:
				return basicSetOffset(null, msgs);
			case AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE:
				return basicSetRecurrence(null, msgs);
			case AmaltheaPackage.PERIODIC_STIMULUS__JITTER:
				return basicSetJitter(null, msgs);
			case AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE:
				return basicSetMinDistance(null, msgs);
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
			case AmaltheaPackage.PERIODIC_STIMULUS__OFFSET:
				return getOffset();
			case AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE:
				return getRecurrence();
			case AmaltheaPackage.PERIODIC_STIMULUS__JITTER:
				return getJitter();
			case AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE:
				return getMinDistance();
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
			case AmaltheaPackage.PERIODIC_STIMULUS__OFFSET:
				setOffset((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE:
				setRecurrence((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_STIMULUS__JITTER:
				setJitter((ITimeDeviation)newValue);
				return;
			case AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE:
				setMinDistance((Time)newValue);
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
			case AmaltheaPackage.PERIODIC_STIMULUS__OFFSET:
				setOffset((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE:
				setRecurrence((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_STIMULUS__JITTER:
				setJitter((ITimeDeviation)null);
				return;
			case AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE:
				setMinDistance((Time)null);
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
			case AmaltheaPackage.PERIODIC_STIMULUS__OFFSET:
				return offset != null;
			case AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE:
				return recurrence != null;
			case AmaltheaPackage.PERIODIC_STIMULUS__JITTER:
				return jitter != null;
			case AmaltheaPackage.PERIODIC_STIMULUS__MIN_DISTANCE:
				return minDistance != null;
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
				case AmaltheaPackage.PERIODIC_STIMULUS__OFFSET: return AmaltheaPackage.FIXED_PERIODIC__OFFSET;
				case AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE: return AmaltheaPackage.FIXED_PERIODIC__RECURRENCE;
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
				case AmaltheaPackage.FIXED_PERIODIC__OFFSET: return AmaltheaPackage.PERIODIC_STIMULUS__OFFSET;
				case AmaltheaPackage.FIXED_PERIODIC__RECURRENCE: return AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PeriodicStimulusImpl
