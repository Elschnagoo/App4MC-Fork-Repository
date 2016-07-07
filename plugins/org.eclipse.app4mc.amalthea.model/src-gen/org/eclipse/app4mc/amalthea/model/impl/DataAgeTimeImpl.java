/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Age Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeTimeImpl#getMinimumTime <em>Minimum Time</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeTimeImpl#getMaximumTime <em>Maximum Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAgeTimeImpl extends DataAgeImpl implements DataAgeTime {
	/**
	 * The cached value of the '{@link #getMinimumTime() <em>Minimum Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTime()
	 * @generated
	 * @ordered
	 */
	protected Time minimumTime;

	/**
	 * The cached value of the '{@link #getMaximumTime() <em>Maximum Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumTime()
	 * @generated
	 * @ordered
	 */
	protected Time maximumTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAgeTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDataAgeTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMinimumTime() {
		if (minimumTime != null && minimumTime.eIsProxy()) {
			InternalEObject oldMinimumTime = (InternalEObject)minimumTime;
			minimumTime = (Time)eResolveProxy(oldMinimumTime);
			if (minimumTime != oldMinimumTime) {
				InternalEObject newMinimumTime = (InternalEObject)minimumTime;
				NotificationChain msgs = oldMinimumTime.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME, null, null);
				if (newMinimumTime.eInternalContainer() == null) {
					msgs = newMinimumTime.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME, oldMinimumTime, minimumTime));
			}
		}
		return minimumTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetMinimumTime() {
		return minimumTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumTime(Time newMinimumTime, NotificationChain msgs) {
		Time oldMinimumTime = minimumTime;
		minimumTime = newMinimumTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME, oldMinimumTime, newMinimumTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumTime(Time newMinimumTime) {
		if (newMinimumTime != minimumTime) {
			NotificationChain msgs = null;
			if (minimumTime != null)
				msgs = ((InternalEObject)minimumTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME, null, msgs);
			if (newMinimumTime != null)
				msgs = ((InternalEObject)newMinimumTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME, null, msgs);
			msgs = basicSetMinimumTime(newMinimumTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME, newMinimumTime, newMinimumTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMaximumTime() {
		if (maximumTime != null && maximumTime.eIsProxy()) {
			InternalEObject oldMaximumTime = (InternalEObject)maximumTime;
			maximumTime = (Time)eResolveProxy(oldMaximumTime);
			if (maximumTime != oldMaximumTime) {
				InternalEObject newMaximumTime = (InternalEObject)maximumTime;
				NotificationChain msgs = oldMaximumTime.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME, null, null);
				if (newMaximumTime.eInternalContainer() == null) {
					msgs = newMaximumTime.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME, oldMaximumTime, maximumTime));
			}
		}
		return maximumTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetMaximumTime() {
		return maximumTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumTime(Time newMaximumTime, NotificationChain msgs) {
		Time oldMaximumTime = maximumTime;
		maximumTime = newMaximumTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME, oldMaximumTime, newMaximumTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumTime(Time newMaximumTime) {
		if (newMaximumTime != maximumTime) {
			NotificationChain msgs = null;
			if (maximumTime != null)
				msgs = ((InternalEObject)maximumTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME, null, msgs);
			if (newMaximumTime != null)
				msgs = ((InternalEObject)newMaximumTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME, null, msgs);
			msgs = basicSetMaximumTime(newMaximumTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME, newMaximumTime, newMaximumTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME:
				return basicSetMinimumTime(null, msgs);
			case AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME:
				return basicSetMaximumTime(null, msgs);
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
			case AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME:
				if (resolve) return getMinimumTime();
				return basicGetMinimumTime();
			case AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME:
				if (resolve) return getMaximumTime();
				return basicGetMaximumTime();
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
			case AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME:
				setMinimumTime((Time)newValue);
				return;
			case AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME:
				setMaximumTime((Time)newValue);
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
			case AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME:
				setMinimumTime((Time)null);
				return;
			case AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME:
				setMaximumTime((Time)null);
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
			case AmaltheaPackage.DATA_AGE_TIME__MINIMUM_TIME:
				return minimumTime != null;
			case AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME:
				return maximumTime != null;
		}
		return super.eIsSet(featureID);
	}

} //DataAgeTimeImpl
