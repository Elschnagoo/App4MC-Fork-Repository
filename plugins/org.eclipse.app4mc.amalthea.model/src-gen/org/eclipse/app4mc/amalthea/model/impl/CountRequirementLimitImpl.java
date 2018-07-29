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
import org.eclipse.app4mc.amalthea.model.CountMetric;
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CountRequirementLimitImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CountRequirementLimitImpl#getLimitValue <em>Limit Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountRequirementLimitImpl extends RequirementLimitImpl implements CountRequirementLimit {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final CountMetric METRIC_EDEFAULT = CountMetric._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected CountMetric metric = METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitValue() <em>Limit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitValue()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimitValue() <em>Limit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitValue()
	 * @generated
	 * @ordered
	 */
	protected int limitValue = LIMIT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountRequirementLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCountRequirementLimit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(CountMetric newMetric) {
		CountMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimitValue() {
		return limitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitValue(int newLimitValue) {
		int oldLimitValue = limitValue;
		limitValue = newLimitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__LIMIT_VALUE, oldLimitValue, limitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__METRIC:
				return getMetric();
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__LIMIT_VALUE:
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
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__METRIC:
				setMetric((CountMetric)newValue);
				return;
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((Integer)newValue);
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
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue(LIMIT_VALUE_EDEFAULT);
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
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__METRIC:
				return metric != METRIC_EDEFAULT;
			case AmaltheaPackage.COUNT_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return limitValue != LIMIT_VALUE_EDEFAULT;
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
		result.append(", limitValue: ");
		result.append(limitValue);
		result.append(')');
		return result.toString();
	}

} //CountRequirementLimitImpl
