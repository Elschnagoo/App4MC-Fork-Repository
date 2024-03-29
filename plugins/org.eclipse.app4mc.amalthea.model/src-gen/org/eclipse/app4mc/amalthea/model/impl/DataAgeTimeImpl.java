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
	@Override
	public Time getMinimumTime() {
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
	@Override
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
	@Override
	public Time getMaximumTime() {
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
	@Override
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
				return getMinimumTime();
			case AmaltheaPackage.DATA_AGE_TIME__MAXIMUM_TIME:
				return getMaximumTime();
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
