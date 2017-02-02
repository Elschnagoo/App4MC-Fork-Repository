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
import org.eclipse.app4mc.amalthea.model.PercentageMetric;
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Percentage Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PercentageRequirementLimitImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PercentageRequirementLimitImpl#getLimitValue <em>Limit Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PercentageRequirementLimitImpl extends RequirementLimitImpl implements PercentageRequirementLimit {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final PercentageMetric METRIC_EDEFAULT = PercentageMetric._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected PercentageMetric metric = METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitValue() <em>Limit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitValue()
	 * @generated
	 * @ordered
	 */
	protected static final double LIMIT_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLimitValue() <em>Limit Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitValue()
	 * @generated
	 * @ordered
	 */
	protected double limitValue = LIMIT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PercentageRequirementLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getPercentageRequirementLimit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(PercentageMetric newMetric) {
		PercentageMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLimitValue() {
		return limitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitValue(double newLimitValue) {
		double oldLimitValue = limitValue;
		limitValue = newLimitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE, oldLimitValue, limitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
				return getMetric();
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
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
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
				setMetric((PercentageMetric)newValue);
				return;
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((Double)newValue);
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
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
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
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
				return metric != METRIC_EDEFAULT;
			case AmaltheaPackage.PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metric: ");
		result.append(metric);
		result.append(", limitValue: ");
		result.append(limitValue);
		result.append(')');
		return result.toString();
	}

} //PercentageRequirementLimitImpl
