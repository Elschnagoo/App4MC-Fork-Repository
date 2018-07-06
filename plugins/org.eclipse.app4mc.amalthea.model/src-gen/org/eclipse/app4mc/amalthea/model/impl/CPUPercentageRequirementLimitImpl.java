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
import org.eclipse.app4mc.amalthea.model.CPUPercentageMetric;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPU Percentage Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CPUPercentageRequirementLimitImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CPUPercentageRequirementLimitImpl#getLimitValue <em>Limit Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CPUPercentageRequirementLimitImpl#getHardwareContext <em>Hardware Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPUPercentageRequirementLimitImpl extends RequirementLimitImpl implements CPUPercentageRequirementLimit {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final CPUPercentageMetric METRIC_EDEFAULT = CPUPercentageMetric._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected CPUPercentageMetric metric = METRIC_EDEFAULT;

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
	 * The cached value of the '{@link #getHardwareContext() <em>Hardware Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareContext()
	 * @generated
	 * @ordered
	 */
	protected ProcessingUnit hardwareContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUPercentageRequirementLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCPUPercentageRequirementLimit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUPercentageMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(CPUPercentageMetric newMetric) {
		CPUPercentageMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__METRIC, oldMetric, metric));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE, oldLimitValue, limitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnit getHardwareContext() {
		if (hardwareContext != null && hardwareContext.eIsProxy()) {
			InternalEObject oldHardwareContext = (InternalEObject)hardwareContext;
			hardwareContext = (ProcessingUnit)eResolveProxy(oldHardwareContext);
			if (hardwareContext != oldHardwareContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__HARDWARE_CONTEXT, oldHardwareContext, hardwareContext));
			}
		}
		return hardwareContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnit basicGetHardwareContext() {
		return hardwareContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareContext(ProcessingUnit newHardwareContext) {
		ProcessingUnit oldHardwareContext = hardwareContext;
		hardwareContext = newHardwareContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__HARDWARE_CONTEXT, oldHardwareContext, hardwareContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
				return getMetric();
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return getLimitValue();
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__HARDWARE_CONTEXT:
				if (resolve) return getHardwareContext();
				return basicGetHardwareContext();
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
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
				setMetric((CPUPercentageMetric)newValue);
				return;
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((Double)newValue);
				return;
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__HARDWARE_CONTEXT:
				setHardwareContext((ProcessingUnit)newValue);
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
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue(LIMIT_VALUE_EDEFAULT);
				return;
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__HARDWARE_CONTEXT:
				setHardwareContext((ProcessingUnit)null);
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
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
				return metric != METRIC_EDEFAULT;
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return limitValue != LIMIT_VALUE_EDEFAULT;
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__HARDWARE_CONTEXT:
				return hardwareContext != null;
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

} //CPUPercentageRequirementLimitImpl
