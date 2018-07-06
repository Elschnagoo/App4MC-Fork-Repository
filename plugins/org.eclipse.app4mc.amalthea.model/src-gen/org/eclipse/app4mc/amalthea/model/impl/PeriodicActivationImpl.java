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
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicActivationImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicActivationImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicActivationImpl#getRecurrence <em>Recurrence</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PeriodicActivationImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicActivationImpl extends ActivationImpl implements PeriodicActivation {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Time min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Time max;

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
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Time offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getPeriodicActivation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(Time newMin, NotificationChain msgs) {
		Time oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_ACTIVATION__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(Time newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_ACTIVATION__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_ACTIVATION__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_ACTIVATION__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(Time newMax, NotificationChain msgs) {
		Time oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_ACTIVATION__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Time newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_ACTIVATION__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_ACTIVATION__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_ACTIVATION__MAX, newMax, newMax));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE, oldRecurrence, newRecurrence);
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
				msgs = ((InternalEObject)recurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE, null, msgs);
			if (newRecurrence != null)
				msgs = ((InternalEObject)newRecurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE, null, msgs);
			msgs = basicSetRecurrence(newRecurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE, newRecurrence, newRecurrence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET, oldOffset, newOffset);
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
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PERIODIC_ACTIVATION__MIN:
				return basicSetMin(null, msgs);
			case AmaltheaPackage.PERIODIC_ACTIVATION__MAX:
				return basicSetMax(null, msgs);
			case AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE:
				return basicSetRecurrence(null, msgs);
			case AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET:
				return basicSetOffset(null, msgs);
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
			case AmaltheaPackage.PERIODIC_ACTIVATION__MIN:
				return getMin();
			case AmaltheaPackage.PERIODIC_ACTIVATION__MAX:
				return getMax();
			case AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE:
				return getRecurrence();
			case AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET:
				return getOffset();
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
			case AmaltheaPackage.PERIODIC_ACTIVATION__MIN:
				setMin((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_ACTIVATION__MAX:
				setMax((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE:
				setRecurrence((Time)newValue);
				return;
			case AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET:
				setOffset((Time)newValue);
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
			case AmaltheaPackage.PERIODIC_ACTIVATION__MIN:
				setMin((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_ACTIVATION__MAX:
				setMax((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE:
				setRecurrence((Time)null);
				return;
			case AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET:
				setOffset((Time)null);
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
			case AmaltheaPackage.PERIODIC_ACTIVATION__MIN:
				return min != null;
			case AmaltheaPackage.PERIODIC_ACTIVATION__MAX:
				return max != null;
			case AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE:
				return recurrence != null;
			case AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriodicActivationImpl
