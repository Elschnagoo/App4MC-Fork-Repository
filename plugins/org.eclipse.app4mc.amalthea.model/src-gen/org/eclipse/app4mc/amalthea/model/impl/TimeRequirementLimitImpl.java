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
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeRequirementLimitImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeRequirementLimitImpl#getLimitValue <em>Limit Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeRequirementLimitImpl extends RequirementLimitImpl implements TimeRequirementLimit {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final TimeMetric METRIC_EDEFAULT = TimeMetric._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected TimeMetric metric = METRIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLimitValue() <em>Limit Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitValue()
	 * @generated
	 * @ordered
	 */
	protected Time limitValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRequirementLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTimeRequirementLimit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(TimeMetric newMetric) {
		TimeMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_REQUIREMENT_LIMIT__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getLimitValue() {
		return limitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitValue(Time newLimitValue, NotificationChain msgs) {
		Time oldLimitValue = limitValue;
		limitValue = newLimitValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE, oldLimitValue, newLimitValue);
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
	public void setLimitValue(Time newLimitValue) {
		if (newLimitValue != limitValue) {
			NotificationChain msgs = null;
			if (limitValue != null)
				msgs = ((InternalEObject)limitValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE, null, msgs);
			if (newLimitValue != null)
				msgs = ((InternalEObject)newLimitValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE, null, msgs);
			msgs = basicSetLimitValue(newLimitValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE, newLimitValue, newLimitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return basicSetLimitValue(null, msgs);
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
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__METRIC:
				return getMetric();
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return getLimitValue();
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
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__METRIC:
				setMetric((TimeMetric)newValue);
				return;
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((Time)newValue);
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
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((Time)null);
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
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__METRIC:
				return metric != METRIC_EDEFAULT;
			case AmaltheaPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return limitValue != null;
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
		result.append(" (metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //TimeRequirementLimitImpl
